// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [KeyManagementService.Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.EncryptRequest}
 */
public final class EncryptRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.EncryptRequest)
    EncryptRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EncryptRequest.newBuilder() to construct.
  private EncryptRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EncryptRequest() {
    name_ = "";
    plaintext_ = com.google.protobuf.ByteString.EMPTY;
    additionalAuthenticatedData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EncryptRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              plaintext_ = input.readBytes();
              break;
            }
          case 26:
            {
              additionalAuthenticatedData_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_EncryptRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_EncryptRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.EncryptRequest.class,
            com.google.cloud.kms.v1.EncryptRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
   * encryption.
   * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
   * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
   * encryption.
   * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
   * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAINTEXT_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString plaintext_;
  /**
   *
   *
   * <pre>
   * Required. The data to encrypt. Must be no larger than 64KiB.
   * The maximum size depends on the key version's
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
   * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the
   * plaintext must be no larger than 64KiB. For
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
   * the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * </pre>
   *
   * <code>bytes plaintext = 2;</code>
   */
  public com.google.protobuf.ByteString getPlaintext() {
    return plaintext_;
  }

  public static final int ADDITIONAL_AUTHENTICATED_DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString additionalAuthenticatedData_;
  /**
   *
   *
   * <pre>
   * Optional data that, if specified, must also be provided during decryption
   * through
   * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
   * The maximum size depends on the key version's
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
   * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the AAD
   * must be no larger than 64KiB. For
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
   * the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * </pre>
   *
   * <code>bytes additional_authenticated_data = 3;</code>
   */
  public com.google.protobuf.ByteString getAdditionalAuthenticatedData() {
    return additionalAuthenticatedData_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!plaintext_.isEmpty()) {
      output.writeBytes(2, plaintext_);
    }
    if (!additionalAuthenticatedData_.isEmpty()) {
      output.writeBytes(3, additionalAuthenticatedData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!plaintext_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, plaintext_);
    }
    if (!additionalAuthenticatedData_.isEmpty()) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(3, additionalAuthenticatedData_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.kms.v1.EncryptRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.EncryptRequest other = (com.google.cloud.kms.v1.EncryptRequest) obj;

    boolean result = true;
    result = result && getName().equals(other.getName());
    result = result && getPlaintext().equals(other.getPlaintext());
    result =
        result && getAdditionalAuthenticatedData().equals(other.getAdditionalAuthenticatedData());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PLAINTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getPlaintext().hashCode();
    hash = (37 * hash) + ADDITIONAL_AUTHENTICATED_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getAdditionalAuthenticatedData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.EncryptRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.kms.v1.EncryptRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [KeyManagementService.Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.EncryptRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.EncryptRequest)
      com.google.cloud.kms.v1.EncryptRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_EncryptRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_EncryptRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.EncryptRequest.class,
              com.google.cloud.kms.v1.EncryptRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.EncryptRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      plaintext_ = com.google.protobuf.ByteString.EMPTY;

      additionalAuthenticatedData_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_EncryptRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.EncryptRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.EncryptRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.EncryptRequest build() {
      com.google.cloud.kms.v1.EncryptRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.EncryptRequest buildPartial() {
      com.google.cloud.kms.v1.EncryptRequest result =
          new com.google.cloud.kms.v1.EncryptRequest(this);
      result.name_ = name_;
      result.plaintext_ = plaintext_;
      result.additionalAuthenticatedData_ = additionalAuthenticatedData_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.EncryptRequest) {
        return mergeFrom((com.google.cloud.kms.v1.EncryptRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.EncryptRequest other) {
      if (other == com.google.cloud.kms.v1.EncryptRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getPlaintext() != com.google.protobuf.ByteString.EMPTY) {
        setPlaintext(other.getPlaintext());
      }
      if (other.getAdditionalAuthenticatedData() != com.google.protobuf.ByteString.EMPTY) {
        setAdditionalAuthenticatedData(other.getAdditionalAuthenticatedData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.kms.v1.EncryptRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.EncryptRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
     * encryption.
     * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
     * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
     * encryption.
     * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
     * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
     * encryption.
     * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
     * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
     * encryption.
     * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
     * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [CryptoKey][google.cloud.kms.v1.CryptoKey] or
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
     * encryption.
     * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server
     * will use its [primary version][google.cloud.kms.v1.CryptoKey.primary].
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString plaintext_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The data to encrypt. Must be no larger than 64KiB.
     * The maximum size depends on the key version's
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
     * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the
     * plaintext must be no larger than 64KiB. For
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
     * the plaintext and additional_authenticated_data fields must be no larger
     * than 8KiB.
     * </pre>
     *
     * <code>bytes plaintext = 2;</code>
     */
    public com.google.protobuf.ByteString getPlaintext() {
      return plaintext_;
    }
    /**
     *
     *
     * <pre>
     * Required. The data to encrypt. Must be no larger than 64KiB.
     * The maximum size depends on the key version's
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
     * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the
     * plaintext must be no larger than 64KiB. For
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
     * the plaintext and additional_authenticated_data fields must be no larger
     * than 8KiB.
     * </pre>
     *
     * <code>bytes plaintext = 2;</code>
     */
    public Builder setPlaintext(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      plaintext_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data to encrypt. Must be no larger than 64KiB.
     * The maximum size depends on the key version's
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
     * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the
     * plaintext must be no larger than 64KiB. For
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
     * the plaintext and additional_authenticated_data fields must be no larger
     * than 8KiB.
     * </pre>
     *
     * <code>bytes plaintext = 2;</code>
     */
    public Builder clearPlaintext() {

      plaintext_ = getDefaultInstance().getPlaintext();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString additionalAuthenticatedData_ =
        com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Optional data that, if specified, must also be provided during decryption
     * through
     * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
     * The maximum size depends on the key version's
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
     * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the AAD
     * must be no larger than 64KiB. For
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
     * the plaintext and additional_authenticated_data fields must be no larger
     * than 8KiB.
     * </pre>
     *
     * <code>bytes additional_authenticated_data = 3;</code>
     */
    public com.google.protobuf.ByteString getAdditionalAuthenticatedData() {
      return additionalAuthenticatedData_;
    }
    /**
     *
     *
     * <pre>
     * Optional data that, if specified, must also be provided during decryption
     * through
     * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
     * The maximum size depends on the key version's
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
     * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the AAD
     * must be no larger than 64KiB. For
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
     * the plaintext and additional_authenticated_data fields must be no larger
     * than 8KiB.
     * </pre>
     *
     * <code>bytes additional_authenticated_data = 3;</code>
     */
    public Builder setAdditionalAuthenticatedData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      additionalAuthenticatedData_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional data that, if specified, must also be provided during decryption
     * through
     * [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].
     * The maximum size depends on the key version's
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level].
     * For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the AAD
     * must be no larger than 64KiB. For
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of
     * the plaintext and additional_authenticated_data fields must be no larger
     * than 8KiB.
     * </pre>
     *
     * <code>bytes additional_authenticated_data = 3;</code>
     */
    public Builder clearAdditionalAuthenticatedData() {

      additionalAuthenticatedData_ = getDefaultInstance().getAdditionalAuthenticatedData();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.EncryptRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.EncryptRequest)
  private static final com.google.cloud.kms.v1.EncryptRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.EncryptRequest();
  }

  public static com.google.cloud.kms.v1.EncryptRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptRequest> PARSER =
      new com.google.protobuf.AbstractParser<EncryptRequest>() {
        @java.lang.Override
        public EncryptRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EncryptRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EncryptRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.EncryptRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
