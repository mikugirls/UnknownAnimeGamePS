// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerTimeNotify.proto

package emu.grasscutter.net.proto;

public final class ServerTimeNotifyOuterClass {
  private ServerTimeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerTimeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerTimeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Offset: 0x20
     * </pre>
     *
     * <code>uint64 server_time = 6;</code>
     * @return The serverTime.
     */
    long getServerTime();
  }
  /**
   * <pre>
   * CmdId: 9404
   * </pre>
   *
   * Protobuf type {@code ServerTimeNotify}
   */
  public static final class ServerTimeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerTimeNotify)
      ServerTimeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerTimeNotify.newBuilder() to construct.
    private ServerTimeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerTimeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerTimeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerTimeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 48: {

              serverTime_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
      return emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.class, emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.Builder.class);
    }

    public static final int SERVER_TIME_FIELD_NUMBER = 6;
    private long serverTime_;
    /**
     * <pre>
     * Offset: 0x20
     * </pre>
     *
     * <code>uint64 server_time = 6;</code>
     * @return The serverTime.
     */
    @java.lang.Override
    public long getServerTime() {
      return serverTime_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (serverTime_ != 0L) {
        output.writeUInt64(6, serverTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, serverTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify other = (emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify) obj;

      if (getServerTime()
          != other.getServerTime()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SERVER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * CmdId: 9404
     * </pre>
     *
     * Protobuf type {@code ServerTimeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerTimeNotify)
        emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.class, emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        serverTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify build() {
        emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify buildPartial() {
        emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify result = new emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify(this);
        result.serverTime_ = serverTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify other) {
        if (other == emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify.getDefaultInstance()) return this;
        if (other.getServerTime() != 0L) {
          setServerTime(other.getServerTime());
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
        emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long serverTime_ ;
      /**
       * <pre>
       * Offset: 0x20
       * </pre>
       *
       * <code>uint64 server_time = 6;</code>
       * @return The serverTime.
       */
      @java.lang.Override
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <pre>
       * Offset: 0x20
       * </pre>
       *
       * <code>uint64 server_time = 6;</code>
       * @param value The serverTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerTime(long value) {
        
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Offset: 0x20
       * </pre>
       *
       * <code>uint64 server_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerTime() {
        
        serverTime_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServerTimeNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerTimeNotify)
    private static final emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify();
    }

    public static emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerTimeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerTimeNotify>() {
      @java.lang.Override
      public ServerTimeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerTimeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerTimeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerTimeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerTimeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerTimeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ServerTimeNotify.proto\"\'\n\020ServerTimeNo" +
      "tify\022\023\n\013server_time\030\006 \001(\004B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerTimeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerTimeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerTimeNotify_descriptor,
        new java.lang.String[] { "ServerTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
