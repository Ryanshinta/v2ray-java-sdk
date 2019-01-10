// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/tls/config.proto

package com.v2ray.core.transport.internet.tls;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_tls_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_tls_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_tls_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2v2ray.com/core/transport/internet/tls/" +
      "config.proto\022!v2ray.core.transport.inter" +
      "net.tls\"\272\001\n\013Certificate\022\023\n\013Certificate\030\001" +
      " \001(\014\022\013\n\003Key\030\002 \001(\014\022C\n\005usage\030\003 \001(\01624.v2ray" +
      ".core.transport.internet.tls.Certificate" +
      ".Usage\"D\n\005Usage\022\020\n\014ENCIPHERMENT\020\000\022\024\n\020AUT" +
      "HORITY_VERIFY\020\001\022\023\n\017AUTHORITY_ISSUE\020\002\"\261\001\n" +
      "\006Config\022\026\n\016allow_insecure\030\001 \001(\010\022\036\n\026allow" +
      "_insecure_ciphers\030\005 \001(\010\022C\n\013certificate\030\002" +
      " \003(\0132..v2ray.core.transport.internet.tls" +
      ".Certificate\022\023\n\013server_name\030\003 \001(\t\022\025\n\rnex" +
      "t_protocol\030\004 \003(\tBR\n%com.v2ray.core.trans" +
      "port.internet.tlsP\001Z\003tls\252\002!V2Ray.Core.Tr" +
      "ansport.Internet.Tlsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_tls_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor,
        new java.lang.String[] { "Certificate", "Key", "Usage", });
    internal_static_v2ray_core_transport_internet_tls_Config_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_transport_internet_tls_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_tls_Config_descriptor,
        new java.lang.String[] { "AllowInsecure", "AllowInsecureCiphers", "Certificate", "ServerName", "NextProtocol", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}