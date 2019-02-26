// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/type.proto

package com.google.spanner.v1;

public interface StructTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.StructType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of fields that make up this struct. Order is
   * significant, because values of this struct type are represented as
   * lists, where the order of field values matches the order of
   * fields in the [StructType][google.spanner.v1.StructType]. In turn, the
   * order of fields matches the order of columns in a read request, or the
   * order of fields in the `SELECT` clause of a query.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.StructType.Field fields = 1;</code>
   */
  java.util.List<com.google.spanner.v1.StructType.Field> getFieldsList();
  /**
   *
   *
   * <pre>
   * The list of fields that make up this struct. Order is
   * significant, because values of this struct type are represented as
   * lists, where the order of field values matches the order of
   * fields in the [StructType][google.spanner.v1.StructType]. In turn, the
   * order of fields matches the order of columns in a read request, or the
   * order of fields in the `SELECT` clause of a query.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.StructType.Field fields = 1;</code>
   */
  com.google.spanner.v1.StructType.Field getFields(int index);
  /**
   *
   *
   * <pre>
   * The list of fields that make up this struct. Order is
   * significant, because values of this struct type are represented as
   * lists, where the order of field values matches the order of
   * fields in the [StructType][google.spanner.v1.StructType]. In turn, the
   * order of fields matches the order of columns in a read request, or the
   * order of fields in the `SELECT` clause of a query.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.StructType.Field fields = 1;</code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * The list of fields that make up this struct. Order is
   * significant, because values of this struct type are represented as
   * lists, where the order of field values matches the order of
   * fields in the [StructType][google.spanner.v1.StructType]. In turn, the
   * order of fields matches the order of columns in a read request, or the
   * order of fields in the `SELECT` clause of a query.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.StructType.Field fields = 1;</code>
   */
  java.util.List<? extends com.google.spanner.v1.StructType.FieldOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of fields that make up this struct. Order is
   * significant, because values of this struct type are represented as
   * lists, where the order of field values matches the order of
   * fields in the [StructType][google.spanner.v1.StructType]. In turn, the
   * order of fields matches the order of columns in a read request, or the
   * order of fields in the `SELECT` clause of a query.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.StructType.Field fields = 1;</code>
   */
  com.google.spanner.v1.StructType.FieldOrBuilder getFieldsOrBuilder(int index);
}
