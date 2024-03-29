// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.helloapollo.fragment;

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

public class Square implements GraphqlFragment {
  static final ResponseField[] $responseFields = {
    ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
    ResponseField.forString("name", "name", null, true, Collections.<ResponseField.Condition>emptyList())
  };

  public static final String FRAGMENT_DEFINITION = "fragment Square on Square {\n"
      + "  __typename\n"
      + "  name\n"
      + "}";

  public static final List<String> POSSIBLE_TYPES = Collections.unmodifiableList(Arrays.asList( "Square"));

  final @NotNull String __typename;

  final @Nullable String name;

  private transient volatile String $toString;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  public Square(@NotNull String __typename, @Nullable String name) {
    this.__typename = Utils.checkNotNull(__typename, "__typename == null");
    this.name = name;
  }

  public @NotNull String __typename() {
    return this.__typename;
  }

  public @Nullable String name() {
    return this.name;
  }

  public ResponseFieldMarshaller marshaller() {
    return new ResponseFieldMarshaller() {
      @Override
      public void marshal(ResponseWriter writer) {
        writer.writeString($responseFields[0], __typename);
        writer.writeString($responseFields[1], name);
      }
    };
  }

  @Override
  public String toString() {
    if ($toString == null) {
      $toString = "Square{"
        + "__typename=" + __typename + ", "
        + "name=" + name
        + "}";
    }
    return $toString;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Square) {
      Square that = (Square) o;
      return this.__typename.equals(that.__typename)
       && ((this.name == null) ? (that.name == null) : this.name.equals(that.name));
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
      h ^= (name == null) ? 0 : name.hashCode();
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  public static final class Mapper implements ResponseFieldMapper<Square> {
    @Override
    public Square map(ResponseReader reader) {
      final String __typename = reader.readString($responseFields[0]);
      final String name = reader.readString($responseFields[1]);
      return new Square(__typename, name);
    }
  }
}
