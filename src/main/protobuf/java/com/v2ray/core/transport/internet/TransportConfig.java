// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/config.proto

package com.v2ray.core.transport.internet;

/**
 * Protobuf type {@code v2ray.core.transport.internet.TransportConfig}
 */
public  final class TransportConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.TransportConfig)
    TransportConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransportConfig.newBuilder() to construct.
  private TransportConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransportConfig() {
    protocol_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransportConfig(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            protocol_ = rawValue;
            break;
          }
          case 18: {
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.Config.internal_static_v2ray_core_transport_internet_TransportConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.Config.internal_static_v2ray_core_transport_internet_TransportConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.TransportConfig.class, com.v2ray.core.transport.internet.TransportConfig.Builder.class);
  }

  public static final int PROTOCOL_FIELD_NUMBER = 1;
  private int protocol_;
  /**
   * <pre>
   * Type of network that this settings supports.
   * </pre>
   *
   * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
   */
  public int getProtocolValue() {
    return protocol_;
  }
  /**
   * <pre>
   * Type of network that this settings supports.
   * </pre>
   *
   * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
   */
  public com.v2ray.core.transport.internet.TransportProtocol getProtocol() {
    com.v2ray.core.transport.internet.TransportProtocol result = com.v2ray.core.transport.internet.TransportProtocol.valueOf(protocol_);
    return result == null ? com.v2ray.core.transport.internet.TransportProtocol.UNRECOGNIZED : result;
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private com.v2ray.core.common.serial.TypedMessage settings_;
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
   */
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getSettings() {
    return settings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : settings_;
  }
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getSettingsOrBuilder() {
    return getSettings();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (protocol_ != com.v2ray.core.transport.internet.TransportProtocol.TCP.getNumber()) {
      output.writeEnum(1, protocol_);
    }
    if (settings_ != null) {
      output.writeMessage(2, getSettings());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (protocol_ != com.v2ray.core.transport.internet.TransportProtocol.TCP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, protocol_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSettings());
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
    if (!(obj instanceof com.v2ray.core.transport.internet.TransportConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.TransportConfig other = (com.v2ray.core.transport.internet.TransportConfig) obj;

    boolean result = true;
    result = result && protocol_ == other.protocol_;
    result = result && (hasSettings() == other.hasSettings());
    if (hasSettings()) {
      result = result && getSettings()
          .equals(other.getSettings());
    }
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
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + protocol_;
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.TransportConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.internet.TransportConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.transport.internet.TransportConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.TransportConfig)
      com.v2ray.core.transport.internet.TransportConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.Config.internal_static_v2ray_core_transport_internet_TransportConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.Config.internal_static_v2ray_core_transport_internet_TransportConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.TransportConfig.class, com.v2ray.core.transport.internet.TransportConfig.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.TransportConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      protocol_ = 0;

      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.Config.internal_static_v2ray_core_transport_internet_TransportConfig_descriptor;
    }

    public com.v2ray.core.transport.internet.TransportConfig getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.TransportConfig.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.TransportConfig build() {
      com.v2ray.core.transport.internet.TransportConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.TransportConfig buildPartial() {
      com.v2ray.core.transport.internet.TransportConfig result = new com.v2ray.core.transport.internet.TransportConfig(this);
      result.protocol_ = protocol_;
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.internet.TransportConfig) {
        return mergeFrom((com.v2ray.core.transport.internet.TransportConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.TransportConfig other) {
      if (other == com.v2ray.core.transport.internet.TransportConfig.getDefaultInstance()) return this;
      if (other.protocol_ != 0) {
        setProtocolValue(other.getProtocolValue());
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.transport.internet.TransportConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.TransportConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int protocol_ = 0;
    /**
     * <pre>
     * Type of network that this settings supports.
     * </pre>
     *
     * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
     */
    public int getProtocolValue() {
      return protocol_;
    }
    /**
     * <pre>
     * Type of network that this settings supports.
     * </pre>
     *
     * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
     */
    public Builder setProtocolValue(int value) {
      protocol_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of network that this settings supports.
     * </pre>
     *
     * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
     */
    public com.v2ray.core.transport.internet.TransportProtocol getProtocol() {
      com.v2ray.core.transport.internet.TransportProtocol result = com.v2ray.core.transport.internet.TransportProtocol.valueOf(protocol_);
      return result == null ? com.v2ray.core.transport.internet.TransportProtocol.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of network that this settings supports.
     * </pre>
     *
     * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
     */
    public Builder setProtocol(com.v2ray.core.transport.internet.TransportProtocol value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      protocol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of network that this settings supports.
     * </pre>
     *
     * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
     */
    public Builder clearProtocol() {
      
      protocol_ = 0;
      onChanged();
      return this;
    }

    private com.v2ray.core.common.serial.TypedMessage settings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> settingsBuilder_;
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public Builder setSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public Builder setSettings(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public Builder mergeSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : settings_;
      }
    }
    /**
     * <pre>
     * Specific settings. Must be of the transports.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.TransportConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.TransportConfig)
  private static final com.v2ray.core.transport.internet.TransportConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.TransportConfig();
  }

  public static com.v2ray.core.transport.internet.TransportConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransportConfig>
      PARSER = new com.google.protobuf.AbstractParser<TransportConfig>() {
    public TransportConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransportConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransportConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransportConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.internet.TransportConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
