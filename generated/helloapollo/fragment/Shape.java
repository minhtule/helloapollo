// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.helloapollo.fragment;

import com.apollographql.apollo.api.FragmentResponseFieldMapper;
import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Shape implements GraphqlFragment {
  static final ResponseField[] $responseFields = {
    ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
    ResponseField.forFragment("__typename", "__typename", Arrays.asList("Square",
    "Circle"))
  };

  public static final String FRAGMENT_DEFINITION = "fragment Shape on Shape {\n"
      + "  __typename\n"
      + "  ...Square\n"
      + "  ...Circle\n"
      + "}";

  public static final List<String> POSSIBLE_TYPES = Collections.unmodifiableList(Arrays.asList( "Square", "Circle"));

  final @NotNull String __typename;

  private final @NotNull Fragments fragments;

  private transient volatile String $toString;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  public Shape(@NotNull String __typename, @NotNull Fragments fragments) {
    this.__typename = Utils.checkNotNull(__typename, "__typename == null");
    this.fragments = Utils.checkNotNull(fragments, "fragments == null");
  }

  public @NotNull String __typename() {
    return this.__typename;
  }

  public @NotNull Fragments fragments() {
    return this.fragments;
  }

  public ResponseFieldMarshaller marshaller() {
    return new ResponseFieldMarshaller() {
      @Override
      public void marshal(ResponseWriter writer) {
        writer.writeString($responseFields[0], __typename);
        fragments.marshaller().marshal(writer);
      }
    };
  }

  @Override
  public String toString() {
    if ($toString == null) {
      $toString = "Shape{"
        + "__typename=" + __typename + ", "
        + "fragments=" + fragments
        + "}";
    }
    return $toString;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Shape) {
      Shape that = (Shape) o;
      return this.__typename.equals(that.__typename)
       && this.fragments.equals(that.fragments);
    }
    return false;
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= __typename.hashCode();
      h *= 1000003;
      h ^= fragments.hashCode();
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  public static class Fragments {
    final @Nullable Square square;

    final @Nullable Circle circle;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Fragments(@Nullable Square square, @Nullable Circle circle) {
      this.square = square;
      this.circle = circle;
    }

    public @Nullable Square square() {
      return this.square;
    }

    public @Nullable Circle circle() {
      return this.circle;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          final Square $square = square;
          if ($square != null) {
            $square.marshaller().marshal(writer);
          }
          final Circle $circle = circle;
          if ($circle != null) {
            $circle.marshaller().marshal(writer);
          }
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Fragments{"
          + "square=" + square + ", "
          + "circle=" + circle
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Fragments) {
        Fragments that = (Fragments) o;
        return ((this.square == null) ? (that.square == null) : this.square.equals(that.square))
         && ((this.circle == null) ? (that.circle == null) : this.circle.equals(that.circle));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (square == null) ? 0 : square.hashCode();
        h *= 1000003;
        h ^= (circle == null) ? 0 : circle.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements FragmentResponseFieldMapper<Fragments> {
      final Square.Mapper squareFieldMapper = new Square.Mapper();

      final Circle.Mapper circleFieldMapper = new Circle.Mapper();

      @Override
      public @NotNull Fragments map(ResponseReader reader, @NotNull String conditionalType) {
        Square square = null;
        Circle circle = null;
        if (Square.POSSIBLE_TYPES.contains(conditionalType)) {
          square = squareFieldMapper.map(reader);
        }
        if (Circle.POSSIBLE_TYPES.contains(conditionalType)) {
          circle = circleFieldMapper.map(reader);
        }
        return new Fragments(square, circle);
      }
    }
  }

  public static final class Mapper implements ResponseFieldMapper<Shape> {
    final Fragments.Mapper fragmentsFieldMapper = new Fragments.Mapper();

    @Override
    public Shape map(ResponseReader reader) {
      final String __typename = reader.readString($responseFields[0]);
      final Fragments fragments = reader.readConditional($responseFields[1], new ResponseReader.ConditionalTypeReader<Fragments>() {
        @Override
        public Fragments read(String conditionalType, ResponseReader reader) {
          return fragmentsFieldMapper.map(reader, conditionalType);
        }
      });
      return new Shape(__typename, fragments);
    }
  }
}
