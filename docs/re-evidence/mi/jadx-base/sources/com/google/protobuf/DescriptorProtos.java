package com.google.protobuf;

import androidx.work.WorkInfo;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bei;
import defpackage.ree;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorProtos {
    public static final Descriptors.b A;
    public static final GeneratedMessageV3.e B;
    public static final Descriptors.b C;
    public static final GeneratedMessageV3.e D;
    public static final Descriptors.b E;
    public static final GeneratedMessageV3.e F;
    public static final Descriptors.b G;
    public static final GeneratedMessageV3.e H;
    public static final Descriptors.b I;
    public static final GeneratedMessageV3.e J;
    public static final Descriptors.b K;
    public static final GeneratedMessageV3.e L;
    public static final Descriptors.b M;
    public static final GeneratedMessageV3.e N;
    public static final Descriptors.b O;
    public static final GeneratedMessageV3.e P;
    public static final Descriptors.b Q;
    public static final GeneratedMessageV3.e R;
    public static final Descriptors.b S;
    public static final GeneratedMessageV3.e T;
    public static final Descriptors.b U;
    public static final GeneratedMessageV3.e V;
    public static final Descriptors.b W;
    public static final GeneratedMessageV3.e X;
    public static final Descriptors.b Y;
    public static final GeneratedMessageV3.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Descriptors.b f9465a;
    public static final Descriptors.b a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageV3.e f9466b;
    public static final GeneratedMessageV3.e b0;
    public static final Descriptors.b c;
    public static Descriptors.FileDescriptor c0 = Descriptors.FileDescriptor.s(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"G\n\u0011FileDescriptorSet\u00122\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProto\"Û\u0003\n\u0013FileDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007package\u0018\u0002 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u0012\u0019\n\u0011public_dependency\u0018\n \u0003(\u0005\u0012\u0017\n\u000fweak_dependency\u0018\u000b \u0003(\u0005\u00126\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u00128\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.ServiceDescriptorProto\u00128\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u0012-\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptions\u00129\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfo\u0012\u000e\n\u0006syntax\u0018\f \u0001(\t\"©\u0005\n\u000fDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00124\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00128\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00125\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u0012H\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRange\u00129\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProto\u00120\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptions\u0012F\n\u000ereserved_range\u0018\t \u0003(\u000b2..google.protobuf.DescriptorProto.ReservedRange\u0012\u0015\n\rreserved_name\u0018\n \u0003(\t\u001ae\n\u000eExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\u00127\n\u0007options\u0018\u0003 \u0001(\u000b2&.google.protobuf.ExtensionRangeOptions\u001a+\n\rReservedRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"g\n\u0015ExtensionRangeOptions\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Õ\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000e2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012\u0013\n\u000boneof_index\u0018\t \u0001(\u0005\u0012\u0011\n\tjson_name\u0018\n \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptions\u0012\u0017\n\u000fproto3_optional\u0018\u0011 \u0001(\b\"¶\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\"T\n\u0014OneofDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012.\n\u0007options\u0018\u0002 \u0001(\u000b2\u001d.google.protobuf.OneofOptions\"¤\u0002\n\u0013EnumDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptions\u0012N\n\u000ereserved_range\u0018\u0004 \u0003(\u000b26.google.protobuf.EnumDescriptorProto.EnumReservedRange\u0012\u0015\n\rreserved_name\u0018\u0005 \u0003(\t\u001a/\n\u0011EnumReservedRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.protobuf.ServiceOptions\"Á\u0001\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ninput_type\u0018\u0002 \u0001(\t\u0012\u0013\n\u000boutput_type\u0018\u0003 \u0001(\t\u0012/\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptions\u0012\u001f\n\u0010client_streaming\u0018\u0005 \u0001(\b:\u0005false\u0012\u001f\n\u0010server_streaming\u0018\u0006 \u0001(\b:\u0005false\"¥\u0006\n\u000bFileOptions\u0012\u0014\n\fjava_package\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014java_outer_classname\u0018\b \u0001(\t\u0012\"\n\u0013java_multiple_files\u0018\n \u0001(\b:\u0005false\u0012)\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\bB\u0002\u0018\u0001\u0012%\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005false\u0012F\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEED\u0012\u0012\n\ngo_package\u0018\u000b \u0001(\t\u0012\"\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005false\u0012$\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005false\u0012\"\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005false\u0012#\n\u0014php_generic_services\u0018* \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005false\u0012\u001e\n\u0010cc_enable_arenas\u0018\u001f \u0001(\b:\u0004true\u0012\u0019\n\u0011objc_class_prefix\u0018$ \u0001(\t\u0012\u0018\n\u0010csharp_namespace\u0018% \u0001(\t\u0012\u0014\n\fswift_prefix\u0018' \u0001(\t\u0012\u0018\n\u0010php_class_prefix\u0018( \u0001(\t\u0012\u0015\n\rphp_namespace\u0018) \u0001(\t\u0012\u001e\n\u0016php_metadata_namespace\u0018, \u0001(\t\u0012\u0014\n\fruby_package\u0018- \u0001(\t\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b&\u0010'\"ò\u0001\n\u000eMessageOptions\u0012&\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005false\u0012.\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0011\n\tmap_entry\u0018\u0007 \u0001(\b\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\b\u0010\tJ\u0004\b\t\u0010\n\"\u009e\u0003\n\fFieldOptions\u0012:\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.protobuf.FieldOptions.CType:\u0006STRING\u0012\u000e\n\u0006packed\u0018\u0002 \u0001(\b\u0012?\n\u0006jstype\u0018\u0006 \u0001(\u000e2$.google.protobuf.FieldOptions.JSType:\tJS_NORMAL\u0012\u0013\n\u0004lazy\u0018\u0005 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0013\n\u0004weak\u0018\n \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002\"5\n\u0006JSType\u0012\r\n\tJS_NORMAL\u0010\u0000\u0012\r\n\tJS_STRING\u0010\u0001\u0012\r\n\tJS_NUMBER\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005\"^\n\fOneofOptions\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0093\u0001\n\u000bEnumOptions\u0012\u0013\n\u000ballow_alias\u0018\u0002 \u0001(\b\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0005\u0010\u0006\"}\n\u0010EnumValueOptions\u0012\u0019\n\ndeprecated\u0018\u0001 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"{\n\u000eServiceOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u00ad\u0002\n\rMethodOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012_\n\u0011idempotency_level\u0018\" \u0001(\u000e2/.google.protobuf.MethodOptions.IdempotencyLevel:\u0013IDEMPOTENCY_UNKNOWN\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"P\n\u0010IdempotencyLevel\u0012\u0017\n\u0013IDEMPOTENCY_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fNO_SIDE_EFFECTS\u0010\u0001\u0012\u000e\n\nIDEMPOTENT\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009e\u0002\n\u0013UninterpretedOption\u0012;\n\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.UninterpretedOption.NamePart\u0012\u0018\n\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0006 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u0012\u0017\n\u000faggregate_value\u0018\b \u0001(\t\u001a3\n\bNamePart\u0012\u0011\n\tname_part\u0018\u0001 \u0002(\t\u0012\u0014\n\fis_extension\u0018\u0002 \u0002(\b\"Õ\u0001\n\u000eSourceCodeInfo\u0012:\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.Location\u001a\u0086\u0001\n\bLocation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0010\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0018\n\u0010leading_comments\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011trailing_comments\u0018\u0004 \u0001(\t\u0012!\n\u0019leading_detached_comments\u0018\u0006 \u0003(\t\"§\u0001\n\u0011GeneratedCodeInfo\u0012A\n\nannotation\u0018\u0001 \u0003(\u000b2-.google.protobuf.GeneratedCodeInfo.Annotation\u001aO\n\nAnnotation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0013\n\u000bsource_file\u0018\u0002 \u0001(\t\u0012\r\n\u0005begin\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0004 \u0001(\u0005B~\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001Z-google.golang.org/protobuf/types/descriptorpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001aGoogle.Protobuf.Reflection"}, new Descriptors.FileDescriptor[0]);
    public static final GeneratedMessageV3.e d;
    public static final Descriptors.b e;
    public static final GeneratedMessageV3.e f;
    public static final Descriptors.b g;
    public static final GeneratedMessageV3.e h;
    public static final Descriptors.b i;
    public static final GeneratedMessageV3.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Descriptors.b f9467k;
    public static final GeneratedMessageV3.e l;
    public static final Descriptors.b m;
    public static final GeneratedMessageV3.e n;
    public static final Descriptors.b o;
    public static final GeneratedMessageV3.e p;
    public static final Descriptors.b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final GeneratedMessageV3.e f9468r;
    public static final Descriptors.b s;
    public static final GeneratedMessageV3.e t;
    public static final Descriptors.b u;
    public static final GeneratedMessageV3.e v;
    public static final Descriptors.b w;
    public static final GeneratedMessageV3.e x;
    public static final Descriptors.b y;
    public static final GeneratedMessageV3.e z;

    public static final class DescriptorProto extends GeneratedMessageV3 implements b {
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<EnumDescriptorProto> enumType_;
        private List<ExtensionRange> extensionRange_;
        private List<FieldDescriptorProto> extension_;
        private List<FieldDescriptorProto> field_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<DescriptorProto> nestedType_;
        private List<OneofDescriptorProto> oneofDecl_;
        private MessageOptions options_;
        private ree reservedName_;
        private List<ReservedRange> reservedRange_;
        private static final DescriptorProto DEFAULT_INSTANCE = new DescriptorProto();

        @Deprecated
        public static final vkh<DescriptorProto> PARSER = new a();

        public static final class ExtensionRange extends GeneratedMessageV3 implements c {
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            public static final int START_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private ExtensionRangeOptions options_;
            private int start_;
            private static final ExtensionRange DEFAULT_INSTANCE = new ExtensionRange();

            @Deprecated
            public static final vkh<ExtensionRange> PARSER = new a();

            public static class a extends com.google.protobuf.c<ExtensionRange> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ExtensionRange parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                    return new ExtensionRange(jVar, tVar);
                }
            }

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return DescriptorProtos.g;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<ExtensionRange> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ExtensionRange)) {
                    return super.equals(obj);
                }
                ExtensionRange extensionRange = (ExtensionRange) obj;
                if (hasStart() != extensionRange.hasStart()) {
                    return false;
                }
                if ((hasStart() && getStart() != extensionRange.getStart()) || hasEnd() != extensionRange.hasEnd()) {
                    return false;
                }
                if ((!hasEnd() || getEnd() == extensionRange.getEnd()) && hasOptions() == extensionRange.hasOptions()) {
                    return (!hasOptions() || getOptions().equals(extensionRange.getOptions())) && this.unknownFields.equals(extensionRange.unknownFields);
                }
                return false;
            }

            public int getEnd() {
                return this.end_;
            }

            public ExtensionRangeOptions getOptions() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
            }

            public g getOptionsOrBuilder() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<ExtensionRange> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iX = (this.bitField0_ & 1) != 0 ? CodedOutputStream.x(1, this.start_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iX += CodedOutputStream.x(2, this.end_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iX += CodedOutputStream.G(3, getOptions());
                }
                int serializedSize = iX + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasStart()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getStart();
                }
                if (hasEnd()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getEnd();
                }
                if (hasOptions()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getOptions().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return DescriptorProtos.h.d(ExtensionRange.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (!hasOptions() || getOptions().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new ExtensionRange();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.G0(1, this.start_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.G0(2, this.end_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.K0(3, getOptions());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements c {
                public int e;
                public int f;
                public int g;
                public ExtensionRangeOptions h;
                public h1<ExtensionRangeOptions, ExtensionRangeOptions.b, g> i;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        x();
                    }
                }

                private h1<ExtensionRangeOptions, ExtensionRangeOptions.b, g> x() {
                    if (this.i == null) {
                        this.i = new h1<>(w(), g(), isClean());
                        this.h = null;
                    }
                    return this.i;
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof ExtensionRange) {
                        return z((ExtensionRange) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                public b B(ExtensionRangeOptions extensionRangeOptions) {
                    ExtensionRangeOptions extensionRangeOptions2;
                    h1<ExtensionRangeOptions, ExtensionRangeOptions.b, g> h1Var = this.i;
                    if (h1Var == null) {
                        if ((this.e & 4) == 0 || (extensionRangeOptions2 = this.h) == null || extensionRangeOptions2 == ExtensionRangeOptions.getDefaultInstance()) {
                            this.h = extensionRangeOptions;
                        } else {
                            this.h = ExtensionRangeOptions.newBuilder(this.h).J(extensionRangeOptions).buildPartial();
                        }
                        onChanged();
                    } else {
                        h1Var.g(extensionRangeOptions);
                    }
                    this.e |= 4;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                public b D(int i) {
                    this.e |= 2;
                    this.g = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                public b G(int i) {
                    this.e |= 1;
                    this.f = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return DescriptorProtos.g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return DescriptorProtos.h.d(ExtensionRange.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public ExtensionRange build() {
                    ExtensionRange extensionRangeBuildPartial = buildPartial();
                    if (extensionRangeBuildPartial.isInitialized()) {
                        return extensionRangeBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) extensionRangeBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public ExtensionRange buildPartial() {
                    int i;
                    ExtensionRange extensionRange = new ExtensionRange(this);
                    int i2 = this.e;
                    if ((i2 & 1) != 0) {
                        extensionRange.start_ = this.f;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        extensionRange.end_ = this.g;
                        i |= 2;
                    }
                    if ((i2 & 4) != 0) {
                        h1<ExtensionRangeOptions, ExtensionRangeOptions.b, g> h1Var = this.i;
                        if (h1Var == null) {
                            extensionRange.options_ = this.h;
                        } else {
                            extensionRange.options_ = (ExtensionRangeOptions) h1Var.b();
                        }
                        i |= 4;
                    }
                    extensionRange.bitField0_ = i;
                    onBuilt();
                    return extensionRange;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = 0;
                    int i = this.e;
                    this.g = 0;
                    this.e = i & (-4);
                    h1<ExtensionRangeOptions, ExtensionRangeOptions.b, g> h1Var = this.i;
                    if (h1Var == null) {
                        this.h = null;
                    } else {
                        h1Var.c();
                    }
                    this.e &= -5;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public ExtensionRange getDefaultInstanceForType() {
                    return ExtensionRange.getDefaultInstance();
                }

                public ExtensionRangeOptions w() {
                    h1<ExtensionRangeOptions, ExtensionRangeOptions.b, g> h1Var = this.i;
                    if (h1Var != null) {
                        return (ExtensionRangeOptions) h1Var.f();
                    }
                    ExtensionRangeOptions extensionRangeOptions = this.h;
                    return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                    ExtensionRange extensionRange = null;
                    try {
                        try {
                            ExtensionRange partialFrom = ExtensionRange.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                z(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            ExtensionRange extensionRange2 = (ExtensionRange) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                extensionRange = extensionRange2;
                                if (extensionRange != null) {
                                    z(extensionRange);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (extensionRange != null) {
                            z(extensionRange);
                        }
                        throw th;
                    }
                }

                public b z(ExtensionRange extensionRange) {
                    if (extensionRange == ExtensionRange.getDefaultInstance()) {
                        return this;
                    }
                    if (extensionRange.hasStart()) {
                        G(extensionRange.getStart());
                    }
                    if (extensionRange.hasEnd()) {
                        D(extensionRange.getEnd());
                    }
                    if (extensionRange.hasOptions()) {
                        B(extensionRange.getOptions());
                    }
                    mergeUnknownFields(extensionRange.unknownFields);
                    onChanged();
                    return this;
                }

                public b() {
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(ExtensionRange extensionRange) {
                return DEFAULT_INSTANCE.toBuilder().z(extensionRange);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            private ExtensionRange(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (ExtensionRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static ExtensionRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public ExtensionRange getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
            }

            public static ExtensionRange parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            private ExtensionRange() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ExtensionRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            public static ExtensionRange parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            private ExtensionRange(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iJ = jVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.bitField0_ |= 1;
                                    this.start_ = jVar.x();
                                } else if (iJ == 16) {
                                    this.bitField0_ |= 2;
                                    this.end_ = jVar.x();
                                } else if (iJ != 26) {
                                    if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    }
                                } else {
                                    ExtensionRangeOptions.b builder = (this.bitField0_ & 4) != 0 ? this.options_.toBuilder() : null;
                                    ExtensionRangeOptions extensionRangeOptions = (ExtensionRangeOptions) jVar.z(ExtensionRangeOptions.PARSER, tVar);
                                    this.options_ = extensionRangeOptions;
                                    if (builder != null) {
                                        builder.J(extensionRangeOptions);
                                        this.options_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static ExtensionRange parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (ExtensionRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            public static ExtensionRange parseFrom(com.google.protobuf.j jVar) throws IOException {
                return (ExtensionRange) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static ExtensionRange parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
                return (ExtensionRange) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }
        }

        public static final class ReservedRange extends GeneratedMessageV3 implements d {
            public static final int END_FIELD_NUMBER = 2;
            public static final int START_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private int start_;
            private static final ReservedRange DEFAULT_INSTANCE = new ReservedRange();

            @Deprecated
            public static final vkh<ReservedRange> PARSER = new a();

            public static class a extends com.google.protobuf.c<ReservedRange> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ReservedRange parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                    return new ReservedRange(jVar, tVar);
                }
            }

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return DescriptorProtos.i;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<ReservedRange> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ReservedRange)) {
                    return super.equals(obj);
                }
                ReservedRange reservedRange = (ReservedRange) obj;
                if (hasStart() != reservedRange.hasStart()) {
                    return false;
                }
                if ((!hasStart() || getStart() == reservedRange.getStart()) && hasEnd() == reservedRange.hasEnd()) {
                    return (!hasEnd() || getEnd() == reservedRange.getEnd()) && this.unknownFields.equals(reservedRange.unknownFields);
                }
                return false;
            }

            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<ReservedRange> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iX = (this.bitField0_ & 1) != 0 ? CodedOutputStream.x(1, this.start_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iX += CodedOutputStream.x(2, this.end_);
                }
                int serializedSize = iX + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasStart()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getStart();
                }
                if (hasEnd()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getEnd();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return DescriptorProtos.j.d(ReservedRange.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new ReservedRange();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.G0(1, this.start_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.G0(2, this.end_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements d {
                public int e;
                public int f;
                public int g;

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public b A(int i) {
                    this.e |= 2;
                    this.g = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                public b C(int i) {
                    this.e |= 1;
                    this.f = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return DescriptorProtos.i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return DescriptorProtos.j.d(ReservedRange.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public ReservedRange build() {
                    ReservedRange reservedRangeBuildPartial = buildPartial();
                    if (reservedRangeBuildPartial.isInitialized()) {
                        return reservedRangeBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) reservedRangeBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public ReservedRange buildPartial() {
                    int i;
                    ReservedRange reservedRange = new ReservedRange(this);
                    int i2 = this.e;
                    if ((i2 & 1) != 0) {
                        reservedRange.start_ = this.f;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        reservedRange.end_ = this.g;
                        i |= 2;
                    }
                    reservedRange.bitField0_ = i;
                    onBuilt();
                    return reservedRange;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = 0;
                    int i = this.e;
                    this.g = 0;
                    this.e = i & (-4);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public ReservedRange getDefaultInstanceForType() {
                    return ReservedRange.getDefaultInstance();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                    ReservedRange reservedRange = null;
                    try {
                        try {
                            ReservedRange partialFrom = ReservedRange.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                x(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            ReservedRange reservedRange2 = (ReservedRange) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                reservedRange = reservedRange2;
                                if (reservedRange != null) {
                                    x(reservedRange);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (reservedRange != null) {
                            x(reservedRange);
                        }
                        throw th;
                    }
                }

                public b x(ReservedRange reservedRange) {
                    if (reservedRange == ReservedRange.getDefaultInstance()) {
                        return this;
                    }
                    if (reservedRange.hasStart()) {
                        C(reservedRange.getStart());
                    }
                    if (reservedRange.hasEnd()) {
                        A(reservedRange.getEnd());
                    }
                    mo145mergeUnknownFields(reservedRange.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof ReservedRange) {
                        return x((ReservedRange) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                public b() {
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(ReservedRange reservedRange) {
                return DEFAULT_INSTANCE.toBuilder().x(reservedRange);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            private ReservedRange(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (ReservedRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static ReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public ReservedRange getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().x(this);
            }

            public static ReservedRange parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            private ReservedRange() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            public static ReservedRange parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            private ReservedRange(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iJ = jVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.bitField0_ |= 1;
                                    this.start_ = jVar.x();
                                } else if (iJ != 16) {
                                    if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    }
                                } else {
                                    this.bitField0_ |= 2;
                                    this.end_ = jVar.x();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static ReservedRange parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (ReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            public static ReservedRange parseFrom(com.google.protobuf.j jVar) throws IOException {
                return (ReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static ReservedRange parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
                return (ReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }
        }

        public static class a extends com.google.protobuf.c<DescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public DescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new DescriptorProto(jVar, tVar);
            }
        }

        public interface c extends s0 {
        }

        public interface d extends s0 {
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.e;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<DescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DescriptorProto)) {
                return super.equals(obj);
            }
            DescriptorProto descriptorProto = (DescriptorProto) obj;
            if (hasName() != descriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(descriptorProto.getName())) && getFieldList().equals(descriptorProto.getFieldList()) && getExtensionList().equals(descriptorProto.getExtensionList()) && getNestedTypeList().equals(descriptorProto.getNestedTypeList()) && getEnumTypeList().equals(descriptorProto.getEnumTypeList()) && getExtensionRangeList().equals(descriptorProto.getExtensionRangeList()) && getOneofDeclList().equals(descriptorProto.getOneofDeclList()) && hasOptions() == descriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(descriptorProto.getOptions())) && getReservedRangeList().equals(descriptorProto.getReservedRangeList()) && m146getReservedNameList().equals(descriptorProto.m146getReservedNameList()) && this.unknownFields.equals(descriptorProto.unknownFields);
            }
            return false;
        }

        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public c getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends c> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        public int getExtensionCount() {
            return this.extension_.size();
        }

        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public h getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends h> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public ExtensionRange getExtensionRange(int i) {
            return this.extensionRange_.get(i);
        }

        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        public List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public c getExtensionRangeOrBuilder(int i) {
            return this.extensionRange_.get(i);
        }

        public List<? extends c> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        public FieldDescriptorProto getField(int i) {
            return this.field_.get(i);
        }

        public int getFieldCount() {
            return this.field_.size();
        }

        public List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public h getFieldOrBuilder(int i) {
            return this.field_.get(i);
        }

        public List<? extends h> getFieldOrBuilderList() {
            return this.field_;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public DescriptorProto getNestedType(int i) {
            return this.nestedType_.get(i);
        }

        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        public List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public b getNestedTypeOrBuilder(int i) {
            return this.nestedType_.get(i);
        }

        public List<? extends b> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        public OneofDescriptorProto getOneofDecl(int i) {
            return this.oneofDecl_.get(i);
        }

        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        public List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public p getOneofDeclOrBuilder(int i) {
            return this.oneofDecl_.get(i);
        }

        public List<? extends p> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        public MessageOptions getOptions() {
            MessageOptions messageOptions = this.options_;
            return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
        }

        public m getOptionsOrBuilder() {
            MessageOptions messageOptions = this.options_;
            return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<DescriptorProto> getParserForType() {
            return PARSER;
        }

        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.getByteString(i);
        }

        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        public ReservedRange getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public d getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends d> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.field_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.G(2, this.field_.get(i2));
            }
            for (int i3 = 0; i3 < this.nestedType_.size(); i3++) {
                iComputeStringSize += CodedOutputStream.G(3, this.nestedType_.get(i3));
            }
            for (int i4 = 0; i4 < this.enumType_.size(); i4++) {
                iComputeStringSize += CodedOutputStream.G(4, this.enumType_.get(i4));
            }
            for (int i5 = 0; i5 < this.extensionRange_.size(); i5++) {
                iComputeStringSize += CodedOutputStream.G(5, this.extensionRange_.get(i5));
            }
            for (int i6 = 0; i6 < this.extension_.size(); i6++) {
                iComputeStringSize += CodedOutputStream.G(6, this.extension_.get(i6));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.G(7, getOptions());
            }
            for (int i7 = 0; i7 < this.oneofDecl_.size(); i7++) {
                iComputeStringSize += CodedOutputStream.G(8, this.oneofDecl_.get(i7));
            }
            for (int i8 = 0; i8 < this.reservedRange_.size(); i8++) {
                iComputeStringSize += CodedOutputStream.G(9, this.reservedRange_.get(i8));
            }
            int iComputeStringSizeNoTag = 0;
            for (int i9 = 0; i9 < this.reservedName_.size(); i9++) {
                iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.reservedName_.d(i9));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + m146getReservedNameList().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (getFieldCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFieldList().hashCode();
            }
            if (getExtensionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getExtensionList().hashCode();
            }
            if (getNestedTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getNestedTypeList().hashCode();
            }
            if (getEnumTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getEnumTypeList().hashCode();
            }
            if (getExtensionRangeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getExtensionRangeList().hashCode();
            }
            if (getOneofDeclCount() > 0) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getOneofDeclList().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getOptions().hashCode();
            }
            if (getReservedRangeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getReservedRangeList().hashCode();
            }
            if (getReservedNameCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + m146getReservedNameList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.f.d(DescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getFieldCount(); i++) {
                if (!getField(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getExtensionCount(); i2++) {
                if (!getExtension(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getNestedTypeCount(); i3++) {
                if (!getNestedType(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getEnumTypeCount(); i4++) {
                if (!getEnumType(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getExtensionRangeCount(); i5++) {
                if (!getExtensionRange(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getOneofDeclCount(); i6++) {
                if (!getOneofDecl(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new DescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.field_.size(); i++) {
                codedOutputStream.K0(2, this.field_.get(i));
            }
            for (int i2 = 0; i2 < this.nestedType_.size(); i2++) {
                codedOutputStream.K0(3, this.nestedType_.get(i2));
            }
            for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
                codedOutputStream.K0(4, this.enumType_.get(i3));
            }
            for (int i4 = 0; i4 < this.extensionRange_.size(); i4++) {
                codedOutputStream.K0(5, this.extensionRange_.get(i4));
            }
            for (int i5 = 0; i5 < this.extension_.size(); i5++) {
                codedOutputStream.K0(6, this.extension_.get(i5));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.K0(7, getOptions());
            }
            for (int i6 = 0; i6 < this.oneofDecl_.size(); i6++) {
                codedOutputStream.K0(8, this.oneofDecl_.get(i6));
            }
            for (int i7 = 0; i7 < this.reservedRange_.size(); i7++) {
                codedOutputStream.K0(9, this.reservedRange_.get(i7));
            }
            for (int i8 = 0; i8 < this.reservedName_.size(); i8++) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.reservedName_.d(i8));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements b {
            public int e;
            public Object f;
            public List<FieldDescriptorProto> g;
            public c1<FieldDescriptorProto, FieldDescriptorProto.b, h> h;
            public List<FieldDescriptorProto> i;
            public c1<FieldDescriptorProto, FieldDescriptorProto.b, h> j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public List<DescriptorProto> f9469k;
            public c1<DescriptorProto, b, b> l;
            public List<EnumDescriptorProto> m;
            public c1<EnumDescriptorProto, EnumDescriptorProto.b, c> n;
            public List<ExtensionRange> o;
            public c1<ExtensionRange, ExtensionRange.b, c> p;
            public List<OneofDescriptorProto> q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public c1<OneofDescriptorProto, OneofDescriptorProto.b, p> f9470r;
            public MessageOptions s;
            public h1<MessageOptions, MessageOptions.b, m> t;
            public List<ReservedRange> u;
            public c1<ReservedRange, ReservedRange.b, d> v;
            public ree w;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    J();
                    H();
                    K();
                    G();
                    I();
                    L();
                    N();
                    O();
                }
            }

            public final void A() {
                if ((this.e & 8) == 0) {
                    this.f9469k = new ArrayList(this.f9469k);
                    this.e |= 8;
                }
            }

            public final void B() {
                if ((this.e & 64) == 0) {
                    this.q = new ArrayList(this.q);
                    this.e |= 64;
                }
            }

            public final void C() {
                if ((this.e & 512) == 0) {
                    this.w = new g0(this.w);
                    this.e |= 512;
                }
            }

            public final void D() {
                if ((this.e & 256) == 0) {
                    this.u = new ArrayList(this.u);
                    this.e |= 256;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public DescriptorProto getDefaultInstanceForType() {
                return DescriptorProto.getDefaultInstance();
            }

            public final c1<EnumDescriptorProto, EnumDescriptorProto.b, c> G() {
                if (this.n == null) {
                    this.n = new c1<>(this.m, (this.e & 16) != 0, g(), isClean());
                    this.m = null;
                }
                return this.n;
            }

            public final c1<FieldDescriptorProto, FieldDescriptorProto.b, h> H() {
                if (this.j == null) {
                    this.j = new c1<>(this.i, (this.e & 4) != 0, g(), isClean());
                    this.i = null;
                }
                return this.j;
            }

            public final c1<ExtensionRange, ExtensionRange.b, c> I() {
                if (this.p == null) {
                    this.p = new c1<>(this.o, (this.e & 32) != 0, g(), isClean());
                    this.o = null;
                }
                return this.p;
            }

            public final c1<FieldDescriptorProto, FieldDescriptorProto.b, h> J() {
                if (this.h == null) {
                    this.h = new c1<>(this.g, (this.e & 2) != 0, g(), isClean());
                    this.g = null;
                }
                return this.h;
            }

            public final c1<DescriptorProto, b, b> K() {
                if (this.l == null) {
                    this.l = new c1<>(this.f9469k, (this.e & 8) != 0, g(), isClean());
                    this.f9469k = null;
                }
                return this.l;
            }

            public final c1<OneofDescriptorProto, OneofDescriptorProto.b, p> L() {
                if (this.f9470r == null) {
                    this.f9470r = new c1<>(this.q, (this.e & 64) != 0, g(), isClean());
                    this.q = null;
                }
                return this.f9470r;
            }

            public MessageOptions M() {
                h1<MessageOptions, MessageOptions.b, m> h1Var = this.t;
                if (h1Var != null) {
                    return (MessageOptions) h1Var.f();
                }
                MessageOptions messageOptions = this.s;
                return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
            }

            public final h1<MessageOptions, MessageOptions.b, m> N() {
                if (this.t == null) {
                    this.t = new h1<>(M(), g(), isClean());
                    this.s = null;
                }
                return this.t;
            }

            public final c1<ReservedRange, ReservedRange.b, d> O() {
                if (this.v == null) {
                    this.v = new c1<>(this.u, (this.e & 256) != 0, g(), isClean());
                    this.u = null;
                }
                return this.v;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                DescriptorProto descriptorProto = null;
                try {
                    try {
                        DescriptorProto partialFrom = DescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            R(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        DescriptorProto descriptorProto2 = (DescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            descriptorProto = descriptorProto2;
                            if (descriptorProto != null) {
                                R(descriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (descriptorProto != null) {
                        R(descriptorProto);
                    }
                    throw th;
                }
            }

            public b R(DescriptorProto descriptorProto) {
                if (descriptorProto == DescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (descriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = descriptorProto.name_;
                    onChanged();
                }
                if (this.h == null) {
                    if (!descriptorProto.field_.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = descriptorProto.field_;
                            this.e &= -3;
                        } else {
                            z();
                            this.g.addAll(descriptorProto.field_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.field_.isEmpty()) {
                    if (this.h.j()) {
                        this.h.f();
                        this.h = null;
                        this.g = descriptorProto.field_;
                        this.e &= -3;
                        this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? J() : null;
                    } else {
                        this.h.b(descriptorProto.field_);
                    }
                }
                if (this.j == null) {
                    if (!descriptorProto.extension_.isEmpty()) {
                        if (this.i.isEmpty()) {
                            this.i = descriptorProto.extension_;
                            this.e &= -5;
                        } else {
                            x();
                            this.i.addAll(descriptorProto.extension_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.extension_.isEmpty()) {
                    if (this.j.j()) {
                        this.j.f();
                        this.j = null;
                        this.i = descriptorProto.extension_;
                        this.e &= -5;
                        this.j = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.j.b(descriptorProto.extension_);
                    }
                }
                if (this.l == null) {
                    if (!descriptorProto.nestedType_.isEmpty()) {
                        if (this.f9469k.isEmpty()) {
                            this.f9469k = descriptorProto.nestedType_;
                            this.e &= -9;
                        } else {
                            A();
                            this.f9469k.addAll(descriptorProto.nestedType_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.nestedType_.isEmpty()) {
                    if (this.l.j()) {
                        this.l.f();
                        this.l = null;
                        this.f9469k = descriptorProto.nestedType_;
                        this.e &= -9;
                        this.l = GeneratedMessageV3.alwaysUseFieldBuilders ? K() : null;
                    } else {
                        this.l.b(descriptorProto.nestedType_);
                    }
                }
                if (this.n == null) {
                    if (!descriptorProto.enumType_.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = descriptorProto.enumType_;
                            this.e &= -17;
                        } else {
                            w();
                            this.m.addAll(descriptorProto.enumType_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.enumType_.isEmpty()) {
                    if (this.n.j()) {
                        this.n.f();
                        this.n = null;
                        this.m = descriptorProto.enumType_;
                        this.e &= -17;
                        this.n = GeneratedMessageV3.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.n.b(descriptorProto.enumType_);
                    }
                }
                if (this.p == null) {
                    if (!descriptorProto.extensionRange_.isEmpty()) {
                        if (this.o.isEmpty()) {
                            this.o = descriptorProto.extensionRange_;
                            this.e &= -33;
                        } else {
                            y();
                            this.o.addAll(descriptorProto.extensionRange_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.extensionRange_.isEmpty()) {
                    if (this.p.j()) {
                        this.p.f();
                        this.p = null;
                        this.o = descriptorProto.extensionRange_;
                        this.e &= -33;
                        this.p = GeneratedMessageV3.alwaysUseFieldBuilders ? I() : null;
                    } else {
                        this.p.b(descriptorProto.extensionRange_);
                    }
                }
                if (this.f9470r == null) {
                    if (!descriptorProto.oneofDecl_.isEmpty()) {
                        if (this.q.isEmpty()) {
                            this.q = descriptorProto.oneofDecl_;
                            this.e &= -65;
                        } else {
                            B();
                            this.q.addAll(descriptorProto.oneofDecl_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.oneofDecl_.isEmpty()) {
                    if (this.f9470r.j()) {
                        this.f9470r.f();
                        this.f9470r = null;
                        this.q = descriptorProto.oneofDecl_;
                        this.e &= -65;
                        this.f9470r = GeneratedMessageV3.alwaysUseFieldBuilders ? L() : null;
                    } else {
                        this.f9470r.b(descriptorProto.oneofDecl_);
                    }
                }
                if (descriptorProto.hasOptions()) {
                    T(descriptorProto.getOptions());
                }
                if (this.v == null) {
                    if (!descriptorProto.reservedRange_.isEmpty()) {
                        if (this.u.isEmpty()) {
                            this.u = descriptorProto.reservedRange_;
                            this.e &= -257;
                        } else {
                            D();
                            this.u.addAll(descriptorProto.reservedRange_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.reservedRange_.isEmpty()) {
                    if (this.v.j()) {
                        this.v.f();
                        this.v = null;
                        this.u = descriptorProto.reservedRange_;
                        this.e &= -257;
                        this.v = GeneratedMessageV3.alwaysUseFieldBuilders ? O() : null;
                    } else {
                        this.v.b(descriptorProto.reservedRange_);
                    }
                }
                if (!descriptorProto.reservedName_.isEmpty()) {
                    if (this.w.isEmpty()) {
                        this.w = descriptorProto.reservedName_;
                        this.e &= -513;
                    } else {
                        C();
                        this.w.addAll(descriptorProto.reservedName_);
                    }
                    onChanged();
                }
                mo145mergeUnknownFields(descriptorProto.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof DescriptorProto) {
                    return R((DescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b T(MessageOptions messageOptions) {
                MessageOptions messageOptions2;
                h1<MessageOptions, MessageOptions.b, m> h1Var = this.t;
                if (h1Var == null) {
                    if ((this.e & 128) == 0 || (messageOptions2 = this.s) == null || messageOptions2 == MessageOptions.getDefaultInstance()) {
                        this.s = messageOptions;
                    } else {
                        this.s = MessageOptions.newBuilder(this.s).J(messageOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(messageOptions);
                }
                this.e |= 128;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b W(String str) {
                str.getClass();
                this.e |= 1;
                this.f = str;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.f.d(DescriptorProto.class, b.class);
            }

            public b n(ExtensionRange extensionRange) {
                c1<ExtensionRange, ExtensionRange.b, c> c1Var = this.p;
                if (c1Var == null) {
                    extensionRange.getClass();
                    y();
                    this.o.add(extensionRange);
                    onChanged();
                } else {
                    c1Var.c(extensionRange);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public DescriptorProto build() {
                DescriptorProto descriptorProtoBuildPartial = buildPartial();
                if (descriptorProtoBuildPartial.isInitialized()) {
                    return descriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) descriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public DescriptorProto buildPartial() {
                DescriptorProto descriptorProto = new DescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                descriptorProto.name_ = this.f;
                c1<FieldDescriptorProto, FieldDescriptorProto.b, h> c1Var = this.h;
                if (c1Var == null) {
                    if ((this.e & 2) != 0) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.e &= -3;
                    }
                    descriptorProto.field_ = this.g;
                } else {
                    descriptorProto.field_ = c1Var.d();
                }
                c1<FieldDescriptorProto, FieldDescriptorProto.b, h> c1Var2 = this.j;
                if (c1Var2 == null) {
                    if ((this.e & 4) != 0) {
                        this.i = Collections.unmodifiableList(this.i);
                        this.e &= -5;
                    }
                    descriptorProto.extension_ = this.i;
                } else {
                    descriptorProto.extension_ = c1Var2.d();
                }
                c1<DescriptorProto, b, b> c1Var3 = this.l;
                if (c1Var3 == null) {
                    if ((this.e & 8) != 0) {
                        this.f9469k = Collections.unmodifiableList(this.f9469k);
                        this.e &= -9;
                    }
                    descriptorProto.nestedType_ = this.f9469k;
                } else {
                    descriptorProto.nestedType_ = c1Var3.d();
                }
                c1<EnumDescriptorProto, EnumDescriptorProto.b, c> c1Var4 = this.n;
                if (c1Var4 == null) {
                    if ((this.e & 16) != 0) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.e &= -17;
                    }
                    descriptorProto.enumType_ = this.m;
                } else {
                    descriptorProto.enumType_ = c1Var4.d();
                }
                c1<ExtensionRange, ExtensionRange.b, c> c1Var5 = this.p;
                if (c1Var5 == null) {
                    if ((this.e & 32) != 0) {
                        this.o = Collections.unmodifiableList(this.o);
                        this.e &= -33;
                    }
                    descriptorProto.extensionRange_ = this.o;
                } else {
                    descriptorProto.extensionRange_ = c1Var5.d();
                }
                c1<OneofDescriptorProto, OneofDescriptorProto.b, p> c1Var6 = this.f9470r;
                if (c1Var6 == null) {
                    if ((this.e & 64) != 0) {
                        this.q = Collections.unmodifiableList(this.q);
                        this.e &= -65;
                    }
                    descriptorProto.oneofDecl_ = this.q;
                } else {
                    descriptorProto.oneofDecl_ = c1Var6.d();
                }
                if ((i & 128) != 0) {
                    h1<MessageOptions, MessageOptions.b, m> h1Var = this.t;
                    if (h1Var == null) {
                        descriptorProto.options_ = this.s;
                    } else {
                        descriptorProto.options_ = (MessageOptions) h1Var.b();
                    }
                    i2 |= 2;
                }
                c1<ReservedRange, ReservedRange.b, d> c1Var7 = this.v;
                if (c1Var7 == null) {
                    if ((this.e & 256) != 0) {
                        this.u = Collections.unmodifiableList(this.u);
                        this.e &= -257;
                    }
                    descriptorProto.reservedRange_ = this.u;
                } else {
                    descriptorProto.reservedRange_ = c1Var7.d();
                }
                if ((this.e & 512) != 0) {
                    this.w = this.w.getUnmodifiableView();
                    this.e &= -513;
                }
                descriptorProto.reservedName_ = this.w;
                descriptorProto.bitField0_ = i2;
                onBuilt();
                return descriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                this.e &= -2;
                c1<FieldDescriptorProto, FieldDescriptorProto.b, h> c1Var = this.h;
                if (c1Var == null) {
                    this.g = Collections.emptyList();
                    this.e &= -3;
                } else {
                    c1Var.e();
                }
                c1<FieldDescriptorProto, FieldDescriptorProto.b, h> c1Var2 = this.j;
                if (c1Var2 == null) {
                    this.i = Collections.emptyList();
                    this.e &= -5;
                } else {
                    c1Var2.e();
                }
                c1<DescriptorProto, b, b> c1Var3 = this.l;
                if (c1Var3 == null) {
                    this.f9469k = Collections.emptyList();
                    this.e &= -9;
                } else {
                    c1Var3.e();
                }
                c1<EnumDescriptorProto, EnumDescriptorProto.b, c> c1Var4 = this.n;
                if (c1Var4 == null) {
                    this.m = Collections.emptyList();
                    this.e &= -17;
                } else {
                    c1Var4.e();
                }
                c1<ExtensionRange, ExtensionRange.b, c> c1Var5 = this.p;
                if (c1Var5 == null) {
                    this.o = Collections.emptyList();
                    this.e &= -33;
                } else {
                    c1Var5.e();
                }
                c1<OneofDescriptorProto, OneofDescriptorProto.b, p> c1Var6 = this.f9470r;
                if (c1Var6 == null) {
                    this.q = Collections.emptyList();
                    this.e &= -65;
                } else {
                    c1Var6.e();
                }
                h1<MessageOptions, MessageOptions.b, m> h1Var = this.t;
                if (h1Var == null) {
                    this.s = null;
                } else {
                    h1Var.c();
                }
                this.e &= -129;
                c1<ReservedRange, ReservedRange.b, d> c1Var7 = this.v;
                if (c1Var7 == null) {
                    this.u = Collections.emptyList();
                    this.e &= -257;
                } else {
                    c1Var7.e();
                }
                this.w = g0.d;
                this.e &= -513;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void w() {
                if ((this.e & 16) == 0) {
                    this.m = new ArrayList(this.m);
                    this.e |= 16;
                }
            }

            public final void x() {
                if ((this.e & 4) == 0) {
                    this.i = new ArrayList(this.i);
                    this.e |= 4;
                }
            }

            public final void y() {
                if ((this.e & 32) == 0) {
                    this.o = new ArrayList(this.o);
                    this.e |= 32;
                }
            }

            public final void z() {
                if ((this.e & 2) == 0) {
                    this.g = new ArrayList(this.g);
                    this.e |= 2;
                }
            }

            public b() {
                this.f = "";
                this.g = Collections.emptyList();
                this.i = Collections.emptyList();
                this.f9469k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = Collections.emptyList();
                this.q = Collections.emptyList();
                this.u = Collections.emptyList();
                this.w = g0.d;
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.g = Collections.emptyList();
                this.i = Collections.emptyList();
                this.f9469k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = Collections.emptyList();
                this.q = Collections.emptyList();
                this.u = Collections.emptyList();
                this.w = g0.d;
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(DescriptorProto descriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().R(descriptorProto);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        /* JADX INFO: renamed from: getReservedNameList, reason: merged with bridge method [inline-methods] */
        public bei m146getReservedNameList() {
            return this.reservedName_;
        }

        private DescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (DescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static DescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public DescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().R(this);
        }

        public static DescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private DescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.field_ = Collections.emptyList();
            this.extension_ = Collections.emptyList();
            this.nestedType_ = Collections.emptyList();
            this.enumType_ = Collections.emptyList();
            this.extensionRange_ = Collections.emptyList();
            this.oneofDecl_ = Collections.emptyList();
            this.reservedRange_ = Collections.emptyList();
            this.reservedName_ = g0.d;
        }

        public static DescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static DescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static DescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (DescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static DescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (DescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static DescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (DescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }

        private DescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        switch (iJ) {
                            case 0:
                                break;
                            case 10:
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = byteStringQ;
                                continue;
                            case 18:
                                if ((i & 2) == 0) {
                                    this.field_ = new ArrayList();
                                    i |= 2;
                                }
                                this.field_.add((FieldDescriptorProto) jVar.z(FieldDescriptorProto.PARSER, tVar));
                                continue;
                            case 26:
                                if ((i & 8) == 0) {
                                    this.nestedType_ = new ArrayList();
                                    i |= 8;
                                }
                                this.nestedType_.add((DescriptorProto) jVar.z(PARSER, tVar));
                                continue;
                            case 34:
                                if ((i & 16) == 0) {
                                    this.enumType_ = new ArrayList();
                                    i |= 16;
                                }
                                this.enumType_.add((EnumDescriptorProto) jVar.z(EnumDescriptorProto.PARSER, tVar));
                                continue;
                            case 42:
                                if ((i & 32) == 0) {
                                    this.extensionRange_ = new ArrayList();
                                    i |= 32;
                                }
                                this.extensionRange_.add((ExtensionRange) jVar.z(ExtensionRange.PARSER, tVar));
                                continue;
                            case 50:
                                if ((i & 4) == 0) {
                                    this.extension_ = new ArrayList();
                                    i |= 4;
                                }
                                this.extension_.add((FieldDescriptorProto) jVar.z(FieldDescriptorProto.PARSER, tVar));
                                continue;
                            case 58:
                                MessageOptions.b builder = (this.bitField0_ & 2) != 0 ? this.options_.toBuilder() : null;
                                MessageOptions messageOptions = (MessageOptions) jVar.z(MessageOptions.PARSER, tVar);
                                this.options_ = messageOptions;
                                if (builder != null) {
                                    builder.J(messageOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                                continue;
                            case 66:
                                if ((i & 64) == 0) {
                                    this.oneofDecl_ = new ArrayList();
                                    i |= 64;
                                }
                                this.oneofDecl_.add((OneofDescriptorProto) jVar.z(OneofDescriptorProto.PARSER, tVar));
                                continue;
                            case 74:
                                if ((i & 256) == 0) {
                                    this.reservedRange_ = new ArrayList();
                                    i |= 256;
                                }
                                this.reservedRange_.add((ReservedRange) jVar.z(ReservedRange.PARSER, tVar));
                                continue;
                            case 82:
                                ByteString byteStringQ2 = jVar.q();
                                if ((i & 512) == 0) {
                                    this.reservedName_ = new g0();
                                    i |= 512;
                                }
                                this.reservedName_.n(byteStringQ2);
                                continue;
                            default:
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 2) != 0) {
                        this.field_ = Collections.unmodifiableList(this.field_);
                    }
                    if ((i & 8) != 0) {
                        this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
                    }
                    if ((i & 16) != 0) {
                        this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    }
                    if ((i & 32) != 0) {
                        this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
                    }
                    if ((i & 4) != 0) {
                        this.extension_ = Collections.unmodifiableList(this.extension_);
                    }
                    if ((i & 64) != 0) {
                        this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
                    }
                    if ((i & 256) != 0) {
                        this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                    }
                    if ((i & 512) != 0) {
                        this.reservedName_ = this.reservedName_.getUnmodifiableView();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 2) != 0) {
                this.field_ = Collections.unmodifiableList(this.field_);
            }
            if ((i & 8) != 0) {
                this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
            }
            if ((i & 16) != 0) {
                this.enumType_ = Collections.unmodifiableList(this.enumType_);
            }
            if ((i & 32) != 0) {
                this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
            }
            if ((i & 4) != 0) {
                this.extension_ = Collections.unmodifiableList(this.extension_);
            }
            if ((i & 64) != 0) {
                this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
            }
            if ((i & 256) != 0) {
                this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
            }
            if ((i & 512) != 0) {
                this.reservedName_ = this.reservedName_.getUnmodifiableView();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class EnumDescriptorProto extends GeneratedMessageV3 implements c {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private EnumOptions options_;
        private ree reservedName_;
        private List<EnumReservedRange> reservedRange_;
        private List<EnumValueDescriptorProto> value_;
        private static final EnumDescriptorProto DEFAULT_INSTANCE = new EnumDescriptorProto();

        @Deprecated
        public static final vkh<EnumDescriptorProto> PARSER = new a();

        public static final class EnumReservedRange extends GeneratedMessageV3 implements c {
            public static final int END_FIELD_NUMBER = 2;
            public static final int START_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private int start_;
            private static final EnumReservedRange DEFAULT_INSTANCE = new EnumReservedRange();

            @Deprecated
            public static final vkh<EnumReservedRange> PARSER = new a();

            public static class a extends com.google.protobuf.c<EnumReservedRange> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EnumReservedRange parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                    return new EnumReservedRange(jVar, tVar);
                }
            }

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return DescriptorProtos.s;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<EnumReservedRange> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EnumReservedRange)) {
                    return super.equals(obj);
                }
                EnumReservedRange enumReservedRange = (EnumReservedRange) obj;
                if (hasStart() != enumReservedRange.hasStart()) {
                    return false;
                }
                if ((!hasStart() || getStart() == enumReservedRange.getStart()) && hasEnd() == enumReservedRange.hasEnd()) {
                    return (!hasEnd() || getEnd() == enumReservedRange.getEnd()) && this.unknownFields.equals(enumReservedRange.unknownFields);
                }
                return false;
            }

            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<EnumReservedRange> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iX = (this.bitField0_ & 1) != 0 ? CodedOutputStream.x(1, this.start_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iX += CodedOutputStream.x(2, this.end_);
                }
                int serializedSize = iX + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasStart()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getStart();
                }
                if (hasEnd()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getEnd();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return DescriptorProtos.t.d(EnumReservedRange.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new EnumReservedRange();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.G0(1, this.start_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.G0(2, this.end_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements c {
                public int e;
                public int f;
                public int g;

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public b A(int i) {
                    this.e |= 2;
                    this.g = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                public b C(int i) {
                    this.e |= 1;
                    this.f = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return DescriptorProtos.s;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return DescriptorProtos.t.d(EnumReservedRange.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public EnumReservedRange build() {
                    EnumReservedRange enumReservedRangeBuildPartial = buildPartial();
                    if (enumReservedRangeBuildPartial.isInitialized()) {
                        return enumReservedRangeBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumReservedRangeBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public EnumReservedRange buildPartial() {
                    int i;
                    EnumReservedRange enumReservedRange = new EnumReservedRange(this);
                    int i2 = this.e;
                    if ((i2 & 1) != 0) {
                        enumReservedRange.start_ = this.f;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        enumReservedRange.end_ = this.g;
                        i |= 2;
                    }
                    enumReservedRange.bitField0_ = i;
                    onBuilt();
                    return enumReservedRange;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = 0;
                    int i = this.e;
                    this.g = 0;
                    this.e = i & (-4);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public EnumReservedRange getDefaultInstanceForType() {
                    return EnumReservedRange.getDefaultInstance();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                    EnumReservedRange enumReservedRange = null;
                    try {
                        try {
                            EnumReservedRange partialFrom = EnumReservedRange.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                x(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            EnumReservedRange enumReservedRange2 = (EnumReservedRange) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                enumReservedRange = enumReservedRange2;
                                if (enumReservedRange != null) {
                                    x(enumReservedRange);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (enumReservedRange != null) {
                            x(enumReservedRange);
                        }
                        throw th;
                    }
                }

                public b x(EnumReservedRange enumReservedRange) {
                    if (enumReservedRange == EnumReservedRange.getDefaultInstance()) {
                        return this;
                    }
                    if (enumReservedRange.hasStart()) {
                        C(enumReservedRange.getStart());
                    }
                    if (enumReservedRange.hasEnd()) {
                        A(enumReservedRange.getEnd());
                    }
                    mo145mergeUnknownFields(enumReservedRange.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof EnumReservedRange) {
                        return x((EnumReservedRange) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                public b() {
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(EnumReservedRange enumReservedRange) {
                return DEFAULT_INSTANCE.toBuilder().x(enumReservedRange);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            private EnumReservedRange(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (EnumReservedRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static EnumReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public EnumReservedRange getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().x(this);
            }

            public static EnumReservedRange parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            private EnumReservedRange() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EnumReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            public static EnumReservedRange parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            private EnumReservedRange(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iJ = jVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.bitField0_ |= 1;
                                    this.start_ = jVar.x();
                                } else if (iJ != 16) {
                                    if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    }
                                } else {
                                    this.bitField0_ |= 2;
                                    this.end_ = jVar.x();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (EnumReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            public static EnumReservedRange parseFrom(com.google.protobuf.j jVar) throws IOException {
                return (EnumReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static EnumReservedRange parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
                return (EnumReservedRange) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }
        }

        public static class a extends com.google.protobuf.c<EnumDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new EnumDescriptorProto(jVar, tVar);
            }
        }

        public interface c extends s0 {
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.q;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<EnumDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumDescriptorProto)) {
                return super.equals(obj);
            }
            EnumDescriptorProto enumDescriptorProto = (EnumDescriptorProto) obj;
            if (hasName() != enumDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(enumDescriptorProto.getName())) && getValueList().equals(enumDescriptorProto.getValueList()) && hasOptions() == enumDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(enumDescriptorProto.getOptions())) && getReservedRangeList().equals(enumDescriptorProto.getReservedRangeList()) && m147getReservedNameList().equals(enumDescriptorProto.m147getReservedNameList()) && this.unknownFields.equals(enumDescriptorProto.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public EnumOptions getOptions() {
            EnumOptions enumOptions = this.options_;
            return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
        }

        public d getOptionsOrBuilder() {
            EnumOptions enumOptions = this.options_;
            return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<EnumDescriptorProto> getParserForType() {
            return PARSER;
        }

        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        public ByteString getReservedNameBytes(int i) {
            return this.reservedName_.getByteString(i);
        }

        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        public EnumReservedRange getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public c getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends c> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.value_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.G(2, this.value_.get(i2));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.G(3, getOptions());
            }
            for (int i3 = 0; i3 < this.reservedRange_.size(); i3++) {
                iComputeStringSize += CodedOutputStream.G(4, this.reservedRange_.get(i3));
            }
            int iComputeStringSizeNoTag = 0;
            for (int i4 = 0; i4 < this.reservedName_.size(); i4++) {
                iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.reservedName_.d(i4));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + m147getReservedNameList().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public EnumValueDescriptorProto getValue(int i) {
            return this.value_.get(i);
        }

        public int getValueCount() {
            return this.value_.size();
        }

        public List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public e getValueOrBuilder(int i) {
            return this.value_.get(i);
        }

        public List<? extends e> getValueOrBuilderList() {
            return this.value_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (getValueCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getValueList().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOptions().hashCode();
            }
            if (getReservedRangeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getReservedRangeList().hashCode();
            }
            if (getReservedNameCount() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + m147getReservedNameList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.f9468r.d(EnumDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getValueCount(); i++) {
                if (!getValue(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new EnumDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.value_.size(); i++) {
                codedOutputStream.K0(2, this.value_.get(i));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.K0(3, getOptions());
            }
            for (int i2 = 0; i2 < this.reservedRange_.size(); i2++) {
                codedOutputStream.K0(4, this.reservedRange_.get(i2));
            }
            for (int i3 = 0; i3 < this.reservedName_.size(); i3++) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.reservedName_.d(i3));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements c {
            public int e;
            public Object f;
            public List<EnumValueDescriptorProto> g;
            public c1<EnumValueDescriptorProto, EnumValueDescriptorProto.b, e> h;
            public EnumOptions i;
            public h1<EnumOptions, EnumOptions.b, d> j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public List<EnumReservedRange> f9471k;
            public c1<EnumReservedRange, EnumReservedRange.b, c> l;
            public ree m;

            private h1<EnumOptions, EnumOptions.b, d> A() {
                if (this.j == null) {
                    this.j = new h1<>(z(), g(), isClean());
                    this.i = null;
                }
                return this.j;
            }

            private c1<EnumReservedRange, EnumReservedRange.b, c> B() {
                if (this.l == null) {
                    this.l = new c1<>(this.f9471k, (this.e & 8) != 0, g(), isClean());
                    this.f9471k = null;
                }
                return this.l;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    C();
                    A();
                    B();
                }
            }

            private void v() {
                if ((this.e & 16) == 0) {
                    this.m = new g0(this.m);
                    this.e |= 16;
                }
            }

            private void w() {
                if ((this.e & 8) == 0) {
                    this.f9471k = new ArrayList(this.f9471k);
                    this.e |= 8;
                }
            }

            public final c1<EnumValueDescriptorProto, EnumValueDescriptorProto.b, e> C() {
                if (this.h == null) {
                    this.h = new c1<>(this.g, (this.e & 2) != 0, g(), isClean());
                    this.g = null;
                }
                return this.h;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                EnumDescriptorProto enumDescriptorProto = null;
                try {
                    try {
                        EnumDescriptorProto partialFrom = EnumDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            F(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumDescriptorProto enumDescriptorProto2 = (EnumDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            enumDescriptorProto = enumDescriptorProto2;
                            if (enumDescriptorProto != null) {
                                F(enumDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumDescriptorProto != null) {
                        F(enumDescriptorProto);
                    }
                    throw th;
                }
            }

            public b F(EnumDescriptorProto enumDescriptorProto) {
                if (enumDescriptorProto == EnumDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (enumDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = enumDescriptorProto.name_;
                    onChanged();
                }
                if (this.h == null) {
                    if (!enumDescriptorProto.value_.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = enumDescriptorProto.value_;
                            this.e &= -3;
                        } else {
                            x();
                            this.g.addAll(enumDescriptorProto.value_);
                        }
                        onChanged();
                    }
                } else if (!enumDescriptorProto.value_.isEmpty()) {
                    if (this.h.j()) {
                        this.h.f();
                        this.h = null;
                        this.g = enumDescriptorProto.value_;
                        this.e &= -3;
                        this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? C() : null;
                    } else {
                        this.h.b(enumDescriptorProto.value_);
                    }
                }
                if (enumDescriptorProto.hasOptions()) {
                    H(enumDescriptorProto.getOptions());
                }
                if (this.l == null) {
                    if (!enumDescriptorProto.reservedRange_.isEmpty()) {
                        if (this.f9471k.isEmpty()) {
                            this.f9471k = enumDescriptorProto.reservedRange_;
                            this.e &= -9;
                        } else {
                            w();
                            this.f9471k.addAll(enumDescriptorProto.reservedRange_);
                        }
                        onChanged();
                    }
                } else if (!enumDescriptorProto.reservedRange_.isEmpty()) {
                    if (this.l.j()) {
                        this.l.f();
                        this.l = null;
                        this.f9471k = enumDescriptorProto.reservedRange_;
                        this.e &= -9;
                        this.l = GeneratedMessageV3.alwaysUseFieldBuilders ? B() : null;
                    } else {
                        this.l.b(enumDescriptorProto.reservedRange_);
                    }
                }
                if (!enumDescriptorProto.reservedName_.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = enumDescriptorProto.reservedName_;
                        this.e &= -17;
                    } else {
                        v();
                        this.m.addAll(enumDescriptorProto.reservedName_);
                    }
                    onChanged();
                }
                mo145mergeUnknownFields(enumDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof EnumDescriptorProto) {
                    return F((EnumDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b H(EnumOptions enumOptions) {
                EnumOptions enumOptions2;
                h1<EnumOptions, EnumOptions.b, d> h1Var = this.j;
                if (h1Var == null) {
                    if ((this.e & 4) == 0 || (enumOptions2 = this.i) == null || enumOptions2 == EnumOptions.getDefaultInstance()) {
                        this.i = enumOptions;
                    } else {
                        this.i = EnumOptions.newBuilder(this.i).J(enumOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(enumOptions);
                }
                this.e |= 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.q;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.f9468r.d(EnumDescriptorProto.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public EnumDescriptorProto build() {
                EnumDescriptorProto enumDescriptorProtoBuildPartial = buildPartial();
                if (enumDescriptorProtoBuildPartial.isInitialized()) {
                    return enumDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public EnumDescriptorProto buildPartial() {
                EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                enumDescriptorProto.name_ = this.f;
                c1<EnumValueDescriptorProto, EnumValueDescriptorProto.b, e> c1Var = this.h;
                if (c1Var == null) {
                    if ((this.e & 2) != 0) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.e &= -3;
                    }
                    enumDescriptorProto.value_ = this.g;
                } else {
                    enumDescriptorProto.value_ = c1Var.d();
                }
                if ((i & 4) != 0) {
                    h1<EnumOptions, EnumOptions.b, d> h1Var = this.j;
                    if (h1Var == null) {
                        enumDescriptorProto.options_ = this.i;
                    } else {
                        enumDescriptorProto.options_ = (EnumOptions) h1Var.b();
                    }
                    i2 |= 2;
                }
                c1<EnumReservedRange, EnumReservedRange.b, c> c1Var2 = this.l;
                if (c1Var2 == null) {
                    if ((this.e & 8) != 0) {
                        this.f9471k = Collections.unmodifiableList(this.f9471k);
                        this.e &= -9;
                    }
                    enumDescriptorProto.reservedRange_ = this.f9471k;
                } else {
                    enumDescriptorProto.reservedRange_ = c1Var2.d();
                }
                if ((this.e & 16) != 0) {
                    this.m = this.m.getUnmodifiableView();
                    this.e &= -17;
                }
                enumDescriptorProto.reservedName_ = this.m;
                enumDescriptorProto.bitField0_ = i2;
                onBuilt();
                return enumDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                this.e &= -2;
                c1<EnumValueDescriptorProto, EnumValueDescriptorProto.b, e> c1Var = this.h;
                if (c1Var == null) {
                    this.g = Collections.emptyList();
                    this.e &= -3;
                } else {
                    c1Var.e();
                }
                h1<EnumOptions, EnumOptions.b, d> h1Var = this.j;
                if (h1Var == null) {
                    this.i = null;
                } else {
                    h1Var.c();
                }
                this.e &= -5;
                c1<EnumReservedRange, EnumReservedRange.b, c> c1Var2 = this.l;
                if (c1Var2 == null) {
                    this.f9471k = Collections.emptyList();
                    this.e &= -9;
                } else {
                    c1Var2.e();
                }
                this.m = g0.d;
                this.e &= -17;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void x() {
                if ((this.e & 2) == 0) {
                    this.g = new ArrayList(this.g);
                    this.e |= 2;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public EnumDescriptorProto getDefaultInstanceForType() {
                return EnumDescriptorProto.getDefaultInstance();
            }

            public EnumOptions z() {
                h1<EnumOptions, EnumOptions.b, d> h1Var = this.j;
                if (h1Var != null) {
                    return (EnumOptions) h1Var.f();
                }
                EnumOptions enumOptions = this.i;
                return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
            }

            public b() {
                this.f = "";
                this.g = Collections.emptyList();
                this.f9471k = Collections.emptyList();
                this.m = g0.d;
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.g = Collections.emptyList();
                this.f9471k = Collections.emptyList();
                this.m = g0.d;
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(EnumDescriptorProto enumDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().F(enumDescriptorProto);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        /* JADX INFO: renamed from: getReservedNameList, reason: merged with bridge method [inline-methods] */
        public bei m147getReservedNameList() {
            return this.reservedName_;
        }

        private EnumDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public EnumDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().F(this);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private EnumDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.value_ = Collections.emptyList();
            this.reservedRange_ = Collections.emptyList();
            this.reservedName_ = g0.d;
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        private EnumDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int iJ = jVar.J();
                            if (iJ != 0) {
                                if (iJ == 10) {
                                    ByteString byteStringQ = jVar.q();
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.name_ = byteStringQ;
                                } else if (iJ == 18) {
                                    if ((i & 2) == 0) {
                                        this.value_ = new ArrayList();
                                        i |= 2;
                                    }
                                    this.value_.add((EnumValueDescriptorProto) jVar.z(EnumValueDescriptorProto.PARSER, tVar));
                                } else if (iJ == 26) {
                                    EnumOptions.b builder = (this.bitField0_ & 2) != 0 ? this.options_.toBuilder() : null;
                                    EnumOptions enumOptions = (EnumOptions) jVar.z(EnumOptions.PARSER, tVar);
                                    this.options_ = enumOptions;
                                    if (builder != null) {
                                        builder.J(enumOptions);
                                        this.options_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (iJ == 34) {
                                    if ((i & 8) == 0) {
                                        this.reservedRange_ = new ArrayList();
                                        i |= 8;
                                    }
                                    this.reservedRange_.add((EnumReservedRange) jVar.z(EnumReservedRange.PARSER, tVar));
                                } else if (iJ != 42) {
                                    if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    }
                                } else {
                                    ByteString byteStringQ2 = jVar.q();
                                    if ((i & 16) == 0) {
                                        this.reservedName_ = new g0();
                                        i |= 16;
                                    }
                                    this.reservedName_.n(byteStringQ2);
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 2) != 0) {
                        this.value_ = Collections.unmodifiableList(this.value_);
                    }
                    if ((i & 8) != 0) {
                        this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                    }
                    if ((i & 16) != 0) {
                        this.reservedName_ = this.reservedName_.getUnmodifiableView();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 2) != 0) {
                this.value_ = Collections.unmodifiableList(this.value_);
            }
            if ((i & 8) != 0) {
                this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
            }
            if ((i & 16) != 0) {
                this.reservedName_ = this.reservedName_.getUnmodifiableView();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EnumDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static EnumDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class EnumOptions extends GeneratedMessageV3.ExtendableMessage<EnumOptions> implements d {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;
        private static final EnumOptions DEFAULT_INSTANCE = new EnumOptions();

        @Deprecated
        public static final vkh<EnumOptions> PARSER = new a();

        public static class a extends com.google.protobuf.c<EnumOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new EnumOptions(jVar, tVar);
            }
        }

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.I;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<EnumOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumOptions)) {
                return super.equals(obj);
            }
            EnumOptions enumOptions = (EnumOptions) obj;
            if (hasAllowAlias() != enumOptions.hasAllowAlias()) {
                return false;
            }
            if ((!hasAllowAlias() || getAllowAlias() == enumOptions.getAllowAlias()) && hasDeprecated() == enumOptions.hasDeprecated()) {
                return (!hasDeprecated() || getDeprecated() == enumOptions.getDeprecated()) && getUninterpretedOptionList().equals(enumOptions.getUninterpretedOptionList()) && this.unknownFields.equals(enumOptions.unknownFields) && getExtensionFields().equals(enumOptions.getExtensionFields());
            }
            return false;
        }

        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<EnumOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iE = (this.bitField0_ & 1) != 0 ? CodedOutputStream.e(2, this.allowAlias_) : 0;
            if ((2 & this.bitField0_) != 0) {
                iE += CodedOutputStream.e(3, this.deprecated_);
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iE += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iE + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasAllowAlias()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + d0.d(getAllowAlias());
            }
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + d0.d(getDeprecated());
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.J.d(EnumOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new EnumOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.m0(2, this.allowAlias_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.m0(3, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<EnumOptions, b> implements d {
            public int f;
            public boolean g;
            public boolean h;
            public List<UninterpretedOption> i;
            public c1<UninterpretedOption, UninterpretedOption.b, u> j;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = false;
                int i = this.f;
                this.h = false;
                this.f = i & (-4);
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.j;
                if (c1Var == null) {
                    this.i = Collections.emptyList();
                    this.f &= -5;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void F() {
                if ((this.f & 4) == 0) {
                    this.i = new ArrayList(this.i);
                    this.f |= 4;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public EnumOptions getDefaultInstanceForType() {
                return EnumOptions.getDefaultInstance();
            }

            public final c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.j == null) {
                    this.j = new c1<>(this.i, (this.f & 4) != 0, g(), isClean());
                    this.i = null;
                }
                return this.j;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                EnumOptions enumOptions = null;
                try {
                    try {
                        EnumOptions partialFrom = EnumOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumOptions enumOptions2 = (EnumOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            enumOptions = enumOptions2;
                            if (enumOptions != null) {
                                J(enumOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumOptions != null) {
                        J(enumOptions);
                    }
                    throw th;
                }
            }

            public b J(EnumOptions enumOptions) {
                if (enumOptions == EnumOptions.getDefaultInstance()) {
                    return this;
                }
                if (enumOptions.hasAllowAlias()) {
                    M(enumOptions.getAllowAlias());
                }
                if (enumOptions.hasDeprecated()) {
                    N(enumOptions.getDeprecated());
                }
                if (this.j == null) {
                    if (!enumOptions.uninterpretedOption_.isEmpty()) {
                        if (this.i.isEmpty()) {
                            this.i = enumOptions.uninterpretedOption_;
                            this.f &= -5;
                        } else {
                            F();
                            this.i.addAll(enumOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!enumOptions.uninterpretedOption_.isEmpty()) {
                    if (this.j.j()) {
                        this.j.f();
                        this.j = null;
                        this.i = enumOptions.uninterpretedOption_;
                        this.f &= -5;
                        this.j = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.j.b(enumOptions.uninterpretedOption_);
                    }
                }
                u(enumOptions);
                mo145mergeUnknownFields(enumOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof EnumOptions) {
                    return J((EnumOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(boolean z) {
                this.f |= 1;
                this.g = z;
                onChanged();
                return this;
            }

            public b N(boolean z) {
                this.f |= 2;
                this.h = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.I;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.J.d(EnumOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public EnumOptions build() {
                EnumOptions enumOptionsBuildPartial = buildPartial();
                if (enumOptionsBuildPartial.isInitialized()) {
                    return enumOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public EnumOptions buildPartial() {
                int i;
                EnumOptions enumOptions = new EnumOptions(this);
                int i2 = this.f;
                if ((i2 & 1) != 0) {
                    enumOptions.allowAlias_ = this.g;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    enumOptions.deprecated_ = this.h;
                    i |= 2;
                }
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.j;
                if (c1Var == null) {
                    if ((this.f & 4) != 0) {
                        this.i = Collections.unmodifiableList(this.i);
                        this.f &= -5;
                    }
                    enumOptions.uninterpretedOption_ = this.i;
                } else {
                    enumOptions.uninterpretedOption_ = c1Var.d();
                }
                enumOptions.bitField0_ = i;
                onBuilt();
                return enumOptions;
            }

            public b() {
                this.i = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.i = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(EnumOptions enumOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(enumOptions);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private EnumOptions(GeneratedMessageV3.d<EnumOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public EnumOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static EnumOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private EnumOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static EnumOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static EnumOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static EnumOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private EnumOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 16) {
                                this.bitField0_ |= 1;
                                this.allowAlias_ = jVar.p();
                            } else if (iJ == 24) {
                                this.bitField0_ |= 2;
                                this.deprecated_ = jVar.p();
                            } else if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c & 4) == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = 4;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 4) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 4) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EnumOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (EnumOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static EnumOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (EnumOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessageV3 implements e {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int number_;
        private EnumValueOptions options_;
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE = new EnumValueDescriptorProto();

        @Deprecated
        public static final vkh<EnumValueDescriptorProto> PARSER = new a();

        public static class a extends com.google.protobuf.c<EnumValueDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumValueDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new EnumValueDescriptorProto(jVar, tVar);
            }
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.u;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<EnumValueDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumValueDescriptorProto)) {
                return super.equals(obj);
            }
            EnumValueDescriptorProto enumValueDescriptorProto = (EnumValueDescriptorProto) obj;
            if (hasName() != enumValueDescriptorProto.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(enumValueDescriptorProto.getName())) || hasNumber() != enumValueDescriptorProto.hasNumber()) {
                return false;
            }
            if ((!hasNumber() || getNumber() == enumValueDescriptorProto.getNumber()) && hasOptions() == enumValueDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(enumValueDescriptorProto.getOptions())) && this.unknownFields.equals(enumValueDescriptorProto.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public int getNumber() {
            return this.number_;
        }

        public EnumValueOptions getOptions() {
            EnumValueOptions enumValueOptions = this.options_;
            return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
        }

        public f getOptionsOrBuilder() {
            EnumValueOptions enumValueOptions = this.options_;
            return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<EnumValueDescriptorProto> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.x(2, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.G(3, getOptions());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getNumber();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOptions().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.v.d(EnumValueDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new EnumValueDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.G0(2, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.K0(3, getOptions());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements e {
            public int e;
            public Object f;
            public int g;
            public EnumValueOptions h;
            public h1<EnumValueOptions, EnumValueOptions.b, f> i;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            private h1<EnumValueOptions, EnumValueOptions.b, f> x() {
                if (this.i == null) {
                    this.i = new h1<>(w(), g(), isClean());
                    this.h = null;
                }
                return this.i;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof EnumValueDescriptorProto) {
                    return z((EnumValueDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b B(EnumValueOptions enumValueOptions) {
                EnumValueOptions enumValueOptions2;
                h1<EnumValueOptions, EnumValueOptions.b, f> h1Var = this.i;
                if (h1Var == null) {
                    if ((this.e & 4) == 0 || (enumValueOptions2 = this.h) == null || enumValueOptions2 == EnumValueOptions.getDefaultInstance()) {
                        this.h = enumValueOptions;
                    } else {
                        this.h = EnumValueOptions.newBuilder(this.h).J(enumValueOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(enumValueOptions);
                }
                this.e |= 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b F(String str) {
                str.getClass();
                this.e |= 1;
                this.f = str;
                onChanged();
                return this;
            }

            public b G(int i) {
                this.e |= 2;
                this.g = i;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.u;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.v.d(EnumValueDescriptorProto.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public EnumValueDescriptorProto build() {
                EnumValueDescriptorProto enumValueDescriptorProtoBuildPartial = buildPartial();
                if (enumValueDescriptorProtoBuildPartial.isInitialized()) {
                    return enumValueDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumValueDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public EnumValueDescriptorProto buildPartial() {
                EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                enumValueDescriptorProto.name_ = this.f;
                if ((i & 2) != 0) {
                    enumValueDescriptorProto.number_ = this.g;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    h1<EnumValueOptions, EnumValueOptions.b, f> h1Var = this.i;
                    if (h1Var == null) {
                        enumValueDescriptorProto.options_ = this.h;
                    } else {
                        enumValueDescriptorProto.options_ = (EnumValueOptions) h1Var.b();
                    }
                    i2 |= 4;
                }
                enumValueDescriptorProto.bitField0_ = i2;
                onBuilt();
                return enumValueDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                int i = this.e;
                this.g = 0;
                this.e = i & (-4);
                h1<EnumValueOptions, EnumValueOptions.b, f> h1Var = this.i;
                if (h1Var == null) {
                    this.h = null;
                } else {
                    h1Var.c();
                }
                this.e &= -5;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public EnumValueDescriptorProto getDefaultInstanceForType() {
                return EnumValueDescriptorProto.getDefaultInstance();
            }

            public EnumValueOptions w() {
                h1<EnumValueOptions, EnumValueOptions.b, f> h1Var = this.i;
                if (h1Var != null) {
                    return (EnumValueOptions) h1Var.f();
                }
                EnumValueOptions enumValueOptions = this.h;
                return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                EnumValueDescriptorProto enumValueDescriptorProto = null;
                try {
                    try {
                        EnumValueDescriptorProto partialFrom = EnumValueDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumValueDescriptorProto enumValueDescriptorProto2 = (EnumValueDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            enumValueDescriptorProto = enumValueDescriptorProto2;
                            if (enumValueDescriptorProto != null) {
                                z(enumValueDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumValueDescriptorProto != null) {
                        z(enumValueDescriptorProto);
                    }
                    throw th;
                }
            }

            public b z(EnumValueDescriptorProto enumValueDescriptorProto) {
                if (enumValueDescriptorProto == EnumValueDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (enumValueDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = enumValueDescriptorProto.name_;
                    onChanged();
                }
                if (enumValueDescriptorProto.hasNumber()) {
                    G(enumValueDescriptorProto.getNumber());
                }
                if (enumValueDescriptorProto.hasOptions()) {
                    B(enumValueDescriptorProto.getOptions());
                }
                mo145mergeUnknownFields(enumValueDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().z(enumValueDescriptorProto);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private EnumValueDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public EnumValueDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private EnumValueDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private EnumValueDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = byteStringQ;
                            } else if (iJ == 16) {
                                this.bitField0_ |= 2;
                                this.number_ = jVar.x();
                            } else if (iJ != 26) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                EnumValueOptions.b builder = (this.bitField0_ & 4) != 0 ? this.options_.toBuilder() : null;
                                EnumValueOptions enumValueOptions = (EnumValueOptions) jVar.z(EnumValueOptions.PARSER, tVar);
                                this.options_ = enumValueOptions;
                                if (builder != null) {
                                    builder.J(enumValueOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumValueDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static EnumValueDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class EnumValueOptions extends GeneratedMessageV3.ExtendableMessage<EnumValueOptions> implements f {
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;
        private static final EnumValueOptions DEFAULT_INSTANCE = new EnumValueOptions();

        @Deprecated
        public static final vkh<EnumValueOptions> PARSER = new a();

        public static class a extends com.google.protobuf.c<EnumValueOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumValueOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new EnumValueOptions(jVar, tVar);
            }
        }

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.K;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<EnumValueOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumValueOptions)) {
                return super.equals(obj);
            }
            EnumValueOptions enumValueOptions = (EnumValueOptions) obj;
            if (hasDeprecated() != enumValueOptions.hasDeprecated()) {
                return false;
            }
            return (!hasDeprecated() || getDeprecated() == enumValueOptions.getDeprecated()) && getUninterpretedOptionList().equals(enumValueOptions.getUninterpretedOptionList()) && this.unknownFields.equals(enumValueOptions.unknownFields) && getExtensionFields().equals(enumValueOptions.getExtensionFields());
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<EnumValueOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iE = (this.bitField0_ & 1) != 0 ? CodedOutputStream.e(1, this.deprecated_) : 0;
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iE += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iE + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + d0.d(getDeprecated());
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.L.d(EnumValueOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new EnumValueOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.m0(1, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<EnumValueOptions, b> implements f {
            public int f;
            public boolean g;
            public List<UninterpretedOption> h;
            public c1<UninterpretedOption, UninterpretedOption.b, u> i;

            private void F() {
                if ((this.f & 2) == 0) {
                    this.h = new ArrayList(this.h);
                    this.f |= 2;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.i == null) {
                    this.i = new c1<>(this.h, (this.f & 2) != 0, g(), isClean());
                    this.h = null;
                }
                return this.i;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = false;
                this.f &= -2;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.i;
                if (c1Var == null) {
                    this.h = Collections.emptyList();
                    this.f &= -3;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public EnumValueOptions getDefaultInstanceForType() {
                return EnumValueOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                EnumValueOptions enumValueOptions = null;
                try {
                    try {
                        EnumValueOptions partialFrom = EnumValueOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumValueOptions enumValueOptions2 = (EnumValueOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            enumValueOptions = enumValueOptions2;
                            if (enumValueOptions != null) {
                                J(enumValueOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumValueOptions != null) {
                        J(enumValueOptions);
                    }
                    throw th;
                }
            }

            public b J(EnumValueOptions enumValueOptions) {
                if (enumValueOptions == EnumValueOptions.getDefaultInstance()) {
                    return this;
                }
                if (enumValueOptions.hasDeprecated()) {
                    M(enumValueOptions.getDeprecated());
                }
                if (this.i == null) {
                    if (!enumValueOptions.uninterpretedOption_.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = enumValueOptions.uninterpretedOption_;
                            this.f &= -3;
                        } else {
                            F();
                            this.h.addAll(enumValueOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!enumValueOptions.uninterpretedOption_.isEmpty()) {
                    if (this.i.j()) {
                        this.i.f();
                        this.i = null;
                        this.h = enumValueOptions.uninterpretedOption_;
                        this.f &= -3;
                        this.i = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.i.b(enumValueOptions.uninterpretedOption_);
                    }
                }
                u(enumValueOptions);
                mo145mergeUnknownFields(enumValueOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof EnumValueOptions) {
                    return J((EnumValueOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(boolean z) {
                this.f |= 1;
                this.g = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.K;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.L.d(EnumValueOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public EnumValueOptions build() {
                EnumValueOptions enumValueOptionsBuildPartial = buildPartial();
                if (enumValueOptionsBuildPartial.isInitialized()) {
                    return enumValueOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumValueOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public EnumValueOptions buildPartial() {
                EnumValueOptions enumValueOptions = new EnumValueOptions(this);
                int i = 1;
                if ((this.f & 1) != 0) {
                    enumValueOptions.deprecated_ = this.g;
                } else {
                    i = 0;
                }
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.i;
                if (c1Var == null) {
                    if ((this.f & 2) != 0) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.f &= -3;
                    }
                    enumValueOptions.uninterpretedOption_ = this.h;
                } else {
                    enumValueOptions.uninterpretedOption_ = c1Var.d();
                }
                enumValueOptions.bitField0_ = i;
                onBuilt();
                return enumValueOptions;
            }

            public b() {
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(EnumValueOptions enumValueOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(enumValueOptions);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private EnumValueOptions(GeneratedMessageV3.d<EnumValueOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumValueOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumValueOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public EnumValueOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static EnumValueOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private EnumValueOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static EnumValueOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static EnumValueOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private EnumValueOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.bitField0_ |= 1;
                                this.deprecated_ = jVar.p();
                            } else if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c & 2) == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = 2;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 2) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (EnumValueOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static EnumValueOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (EnumValueOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static EnumValueOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (EnumValueOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class ExtensionRangeOptions extends GeneratedMessageV3.ExtendableMessage<ExtensionRangeOptions> implements g {
        private static final ExtensionRangeOptions DEFAULT_INSTANCE = new ExtensionRangeOptions();

        @Deprecated
        public static final vkh<ExtensionRangeOptions> PARSER = new a();
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static class a extends com.google.protobuf.c<ExtensionRangeOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ExtensionRangeOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new ExtensionRangeOptions(jVar, tVar);
            }
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.f9467k;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<ExtensionRangeOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExtensionRangeOptions)) {
                return super.equals(obj);
            }
            ExtensionRangeOptions extensionRangeOptions = (ExtensionRangeOptions) obj;
            return getUninterpretedOptionList().equals(extensionRangeOptions.getUninterpretedOptionList()) && this.unknownFields.equals(extensionRangeOptions.unknownFields) && getExtensionFields().equals(extensionRangeOptions.getExtensionFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<ExtensionRangeOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = 0;
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iG += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iG + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.l.d(ExtensionRangeOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new ExtensionRangeOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<ExtensionRangeOptions, b> implements g {
            public int f;
            public List<UninterpretedOption> g;
            public c1<UninterpretedOption, UninterpretedOption.b, u> h;

            private void F() {
                if ((this.f & 1) == 0) {
                    this.g = new ArrayList(this.g);
                    this.f |= 1;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.h == null) {
                    this.h = new c1<>(this.g, (this.f & 1) != 0, g(), isClean());
                    this.g = null;
                }
                return this.h;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.h;
                if (c1Var == null) {
                    this.g = Collections.emptyList();
                    this.f &= -2;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public ExtensionRangeOptions getDefaultInstanceForType() {
                return ExtensionRangeOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                ExtensionRangeOptions extensionRangeOptions = null;
                try {
                    try {
                        ExtensionRangeOptions partialFrom = ExtensionRangeOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ExtensionRangeOptions extensionRangeOptions2 = (ExtensionRangeOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            extensionRangeOptions = extensionRangeOptions2;
                            if (extensionRangeOptions != null) {
                                J(extensionRangeOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (extensionRangeOptions != null) {
                        J(extensionRangeOptions);
                    }
                    throw th;
                }
            }

            public b J(ExtensionRangeOptions extensionRangeOptions) {
                if (extensionRangeOptions == ExtensionRangeOptions.getDefaultInstance()) {
                    return this;
                }
                if (this.h == null) {
                    if (!extensionRangeOptions.uninterpretedOption_.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = extensionRangeOptions.uninterpretedOption_;
                            this.f &= -2;
                        } else {
                            F();
                            this.g.addAll(extensionRangeOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!extensionRangeOptions.uninterpretedOption_.isEmpty()) {
                    if (this.h.j()) {
                        this.h.f();
                        this.h = null;
                        this.g = extensionRangeOptions.uninterpretedOption_;
                        this.f &= -2;
                        this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.h.b(extensionRangeOptions.uninterpretedOption_);
                    }
                }
                u(extensionRangeOptions);
                mo145mergeUnknownFields(extensionRangeOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof ExtensionRangeOptions) {
                    return J((ExtensionRangeOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.f9467k;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.l.d(ExtensionRangeOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public ExtensionRangeOptions build() {
                ExtensionRangeOptions extensionRangeOptionsBuildPartial = buildPartial();
                if (extensionRangeOptionsBuildPartial.isInitialized()) {
                    return extensionRangeOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) extensionRangeOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public ExtensionRangeOptions buildPartial() {
                ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions(this);
                int i = this.f;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.h;
                if (c1Var == null) {
                    if ((i & 1) != 0) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.f &= -2;
                    }
                    extensionRangeOptions.uninterpretedOption_ = this.g;
                } else {
                    extensionRangeOptions.uninterpretedOption_ = c1Var.d();
                }
                onBuilt();
                return extensionRangeOptions;
            }

            public b() {
                this.g = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.g = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(ExtensionRangeOptions extensionRangeOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(extensionRangeOptions);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private ExtensionRangeOptions(GeneratedMessageV3.d<ExtensionRangeOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public ExtensionRangeOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private ExtensionRangeOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ExtensionRangeOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    z2 = true;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static ExtensionRangeOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static ExtensionRangeOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class FieldDescriptorProto extends GeneratedMessageV3 implements h {
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object defaultValue_;
        private volatile Object extendee_;
        private volatile Object jsonName_;
        private int label_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private volatile Object typeName_;
        private int type_;
        private static final FieldDescriptorProto DEFAULT_INSTANCE = new FieldDescriptorProto();

        @Deprecated
        public static final vkh<FieldDescriptorProto> PARSER = new a();

        public enum Label implements z0 {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);

            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private final int value;
            private static final d0.d<Label> internalValueMap = new a();
            private static final Label[] VALUES = values();

            public static class a implements d0.d<Label> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Label findValueByNumber(int i) {
                    return Label.forNumber(i);
                }
            }

            Label(int i) {
                this.value = i;
            }

            public static Label forNumber(int i) {
                if (i == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i == 2) {
                    return LABEL_REQUIRED;
                }
                if (i != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static final Descriptors.d getDescriptor() {
                return FieldDescriptorProto.getDescriptor().m().get(1);
            }

            public static d0.d<Label> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static Label valueOf(int i) {
                return forNumber(i);
            }

            public static Label valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Type implements z0 {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int TYPE_BOOL_VALUE = 8;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final int TYPE_INT32_VALUE = 5;
            public static final int TYPE_INT64_VALUE = 3;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final int TYPE_STRING_VALUE = 9;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final int TYPE_UINT64_VALUE = 4;
            private final int value;
            private static final d0.d<Type> internalValueMap = new a();
            private static final Type[] VALUES = values();

            public static class a implements d0.d<Type> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            }

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static final Descriptors.d getDescriptor() {
                return FieldDescriptorProto.getDescriptor().m().get(0);
            }

            public static d0.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static class a extends com.google.protobuf.c<FieldDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new FieldDescriptorProto(jVar, tVar);
            }
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.m;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<FieldDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldDescriptorProto)) {
                return super.equals(obj);
            }
            FieldDescriptorProto fieldDescriptorProto = (FieldDescriptorProto) obj;
            if (hasName() != fieldDescriptorProto.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(fieldDescriptorProto.getName())) || hasNumber() != fieldDescriptorProto.hasNumber()) {
                return false;
            }
            if ((hasNumber() && getNumber() != fieldDescriptorProto.getNumber()) || hasLabel() != fieldDescriptorProto.hasLabel()) {
                return false;
            }
            if ((hasLabel() && this.label_ != fieldDescriptorProto.label_) || hasType() != fieldDescriptorProto.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != fieldDescriptorProto.type_) || hasTypeName() != fieldDescriptorProto.hasTypeName()) {
                return false;
            }
            if ((hasTypeName() && !getTypeName().equals(fieldDescriptorProto.getTypeName())) || hasExtendee() != fieldDescriptorProto.hasExtendee()) {
                return false;
            }
            if ((hasExtendee() && !getExtendee().equals(fieldDescriptorProto.getExtendee())) || hasDefaultValue() != fieldDescriptorProto.hasDefaultValue()) {
                return false;
            }
            if ((hasDefaultValue() && !getDefaultValue().equals(fieldDescriptorProto.getDefaultValue())) || hasOneofIndex() != fieldDescriptorProto.hasOneofIndex()) {
                return false;
            }
            if ((hasOneofIndex() && getOneofIndex() != fieldDescriptorProto.getOneofIndex()) || hasJsonName() != fieldDescriptorProto.hasJsonName()) {
                return false;
            }
            if ((hasJsonName() && !getJsonName().equals(fieldDescriptorProto.getJsonName())) || hasOptions() != fieldDescriptorProto.hasOptions()) {
                return false;
            }
            if ((!hasOptions() || getOptions().equals(fieldDescriptorProto.getOptions())) && hasProto3Optional() == fieldDescriptorProto.hasProto3Optional()) {
                return (!hasProto3Optional() || getProto3Optional() == fieldDescriptorProto.getProto3Optional()) && this.unknownFields.equals(fieldDescriptorProto.unknownFields);
            }
            return false;
        }

        public String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.defaultValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getDefaultValueBytes() {
            Object obj = this.defaultValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getExtendee() {
            Object obj = this.extendee_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.extendee_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getExtendeeBytes() {
            Object obj = this.extendee_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.extendee_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getJsonName() {
            Object obj = this.jsonName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.jsonName_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getJsonNameBytes() {
            Object obj = this.jsonName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jsonName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public Label getLabel() {
            Label labelValueOf = Label.valueOf(this.label_);
            return labelValueOf == null ? Label.LABEL_OPTIONAL : labelValueOf;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public int getNumber() {
            return this.number_;
        }

        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        public FieldOptions getOptions() {
            FieldOptions fieldOptions = this.options_;
            return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
        }

        public i getOptionsOrBuilder() {
            FieldOptions fieldOptions = this.options_;
            return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<FieldDescriptorProto> getParserForType() {
            return PARSER;
        }

        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.extendee_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.x(3, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.l(4, this.label_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.l(5, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.typeName_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.defaultValue_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.G(8, getOptions());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.x(9, this.oneofIndex_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.jsonName_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeStringSize += CodedOutputStream.e(17, this.proto3Optional_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public Type getType() {
            Type typeValueOf = Type.valueOf(this.type_);
            return typeValueOf == null ? Type.TYPE_DOUBLE : typeValueOf;
        }

        public String getTypeName() {
            Object obj = this.typeName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.typeName_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getTypeNameBytes() {
            Object obj = this.typeName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasJsonName() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasNumber()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getNumber();
            }
            if (hasLabel()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.label_;
            }
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.type_;
            }
            if (hasTypeName()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getTypeName().hashCode();
            }
            if (hasExtendee()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getExtendee().hashCode();
            }
            if (hasDefaultValue()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getDefaultValue().hashCode();
            }
            if (hasOneofIndex()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getOneofIndex();
            }
            if (hasJsonName()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getJsonName().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getOptions().hashCode();
            }
            if (hasProto3Optional()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + d0.d(getProto3Optional());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.n.d(FieldDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new FieldDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.extendee_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.G0(3, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.u0(4, this.label_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.u0(5, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.typeName_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.defaultValue_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.K0(8, getOptions());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.G0(9, this.oneofIndex_);
            }
            if ((this.bitField0_ & 256) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.jsonName_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.m0(17, this.proto3Optional_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements h {
            public int e;
            public Object f;
            public int g;
            public int h;
            public int i;
            public Object j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f9472k;
            public Object l;
            public int m;
            public Object n;
            public FieldOptions o;
            public h1<FieldOptions, FieldOptions.b, i> p;
            public boolean q;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            private h1<FieldOptions, FieldOptions.b, i> x() {
                if (this.p == null) {
                    this.p = new h1<>(w(), g(), isClean());
                    this.o = null;
                }
                return this.p;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof FieldDescriptorProto) {
                    return z((FieldDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b B(FieldOptions fieldOptions) {
                FieldOptions fieldOptions2;
                h1<FieldOptions, FieldOptions.b, i> h1Var = this.p;
                if (h1Var == null) {
                    if ((this.e & 512) == 0 || (fieldOptions2 = this.o) == null || fieldOptions2 == FieldOptions.getDefaultInstance()) {
                        this.o = fieldOptions;
                    } else {
                        this.o = FieldOptions.newBuilder(this.o).J(fieldOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(fieldOptions);
                }
                this.e |= 512;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b F(Label label) {
                label.getClass();
                this.e |= 4;
                this.h = label.getNumber();
                onChanged();
                return this;
            }

            public b G(int i) {
                this.e |= 2;
                this.g = i;
                onChanged();
                return this;
            }

            public b H(int i) {
                this.e |= 128;
                this.m = i;
                onChanged();
                return this;
            }

            public b I(boolean z) {
                this.e |= 1024;
                this.q = z;
                onChanged();
                return this;
            }

            public b J(Type type) {
                type.getClass();
                this.e |= 8;
                this.i = type.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.m;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.n.d(FieldDescriptorProto.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto build() {
                FieldDescriptorProto fieldDescriptorProtoBuildPartial = buildPartial();
                if (fieldDescriptorProtoBuildPartial.isInitialized()) {
                    return fieldDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fieldDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto buildPartial() {
                FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                fieldDescriptorProto.name_ = this.f;
                if ((i & 2) != 0) {
                    fieldDescriptorProto.number_ = this.g;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                fieldDescriptorProto.label_ = this.h;
                if ((i & 8) != 0) {
                    i2 |= 8;
                }
                fieldDescriptorProto.type_ = this.i;
                if ((i & 16) != 0) {
                    i2 |= 16;
                }
                fieldDescriptorProto.typeName_ = this.j;
                if ((i & 32) != 0) {
                    i2 |= 32;
                }
                fieldDescriptorProto.extendee_ = this.f9472k;
                if ((i & 64) != 0) {
                    i2 |= 64;
                }
                fieldDescriptorProto.defaultValue_ = this.l;
                if ((i & 128) != 0) {
                    fieldDescriptorProto.oneofIndex_ = this.m;
                    i2 |= 128;
                }
                if ((i & 256) != 0) {
                    i2 |= 256;
                }
                fieldDescriptorProto.jsonName_ = this.n;
                if ((i & 512) != 0) {
                    h1<FieldOptions, FieldOptions.b, i> h1Var = this.p;
                    if (h1Var == null) {
                        fieldDescriptorProto.options_ = this.o;
                    } else {
                        fieldDescriptorProto.options_ = (FieldOptions) h1Var.b();
                    }
                    i2 |= 512;
                }
                if ((i & 1024) != 0) {
                    fieldDescriptorProto.proto3Optional_ = this.q;
                    i2 |= 1024;
                }
                fieldDescriptorProto.bitField0_ = i2;
                onBuilt();
                return fieldDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                int i = this.e;
                this.g = 0;
                this.h = 1;
                this.i = 1;
                this.j = "";
                this.f9472k = "";
                this.l = "";
                this.m = 0;
                this.n = "";
                this.e = i & WorkInfo.STOP_REASON_UNKNOWN;
                h1<FieldOptions, FieldOptions.b, i> h1Var = this.p;
                if (h1Var == null) {
                    this.o = null;
                } else {
                    h1Var.c();
                }
                int i2 = this.e;
                this.q = false;
                this.e = i2 & (-1537);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto getDefaultInstanceForType() {
                return FieldDescriptorProto.getDefaultInstance();
            }

            public FieldOptions w() {
                h1<FieldOptions, FieldOptions.b, i> h1Var = this.p;
                if (h1Var != null) {
                    return (FieldOptions) h1Var.f();
                }
                FieldOptions fieldOptions = this.o;
                return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                FieldDescriptorProto fieldDescriptorProto = null;
                try {
                    try {
                        FieldDescriptorProto partialFrom = FieldDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        FieldDescriptorProto fieldDescriptorProto2 = (FieldDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            fieldDescriptorProto = fieldDescriptorProto2;
                            if (fieldDescriptorProto != null) {
                                z(fieldDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fieldDescriptorProto != null) {
                        z(fieldDescriptorProto);
                    }
                    throw th;
                }
            }

            public b z(FieldDescriptorProto fieldDescriptorProto) {
                if (fieldDescriptorProto == FieldDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (fieldDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = fieldDescriptorProto.name_;
                    onChanged();
                }
                if (fieldDescriptorProto.hasNumber()) {
                    G(fieldDescriptorProto.getNumber());
                }
                if (fieldDescriptorProto.hasLabel()) {
                    F(fieldDescriptorProto.getLabel());
                }
                if (fieldDescriptorProto.hasType()) {
                    J(fieldDescriptorProto.getType());
                }
                if (fieldDescriptorProto.hasTypeName()) {
                    this.e |= 16;
                    this.j = fieldDescriptorProto.typeName_;
                    onChanged();
                }
                if (fieldDescriptorProto.hasExtendee()) {
                    this.e |= 32;
                    this.f9472k = fieldDescriptorProto.extendee_;
                    onChanged();
                }
                if (fieldDescriptorProto.hasDefaultValue()) {
                    this.e |= 64;
                    this.l = fieldDescriptorProto.defaultValue_;
                    onChanged();
                }
                if (fieldDescriptorProto.hasOneofIndex()) {
                    H(fieldDescriptorProto.getOneofIndex());
                }
                if (fieldDescriptorProto.hasJsonName()) {
                    this.e |= 256;
                    this.n = fieldDescriptorProto.jsonName_;
                    onChanged();
                }
                if (fieldDescriptorProto.hasOptions()) {
                    B(fieldDescriptorProto.getOptions());
                }
                if (fieldDescriptorProto.hasProto3Optional()) {
                    I(fieldDescriptorProto.getProto3Optional());
                }
                mo145mergeUnknownFields(fieldDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = "";
                this.h = 1;
                this.i = 1;
                this.j = "";
                this.f9472k = "";
                this.l = "";
                this.n = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.h = 1;
                this.i = 1;
                this.j = "";
                this.f9472k = "";
                this.l = "";
                this.n = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(FieldDescriptorProto fieldDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().z(fieldDescriptorProto);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private FieldDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public FieldDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private FieldDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.jsonName_ = "";
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static FieldDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static FieldDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }

        private FieldDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        switch (iJ) {
                            case 0:
                                break;
                            case 10:
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = byteStringQ;
                                continue;
                            case 18:
                                ByteString byteStringQ2 = jVar.q();
                                this.bitField0_ |= 32;
                                this.extendee_ = byteStringQ2;
                                continue;
                            case 24:
                                this.bitField0_ |= 2;
                                this.number_ = jVar.x();
                                continue;
                            case 32:
                                int iS = jVar.s();
                                if (Label.valueOf(iS) == null) {
                                    bVarG.s(4, iS);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.label_ = iS;
                                    continue;
                                }
                                break;
                            case 40:
                                int iS2 = jVar.s();
                                if (Type.valueOf(iS2) == null) {
                                    bVarG.s(5, iS2);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.type_ = iS2;
                                    continue;
                                }
                                break;
                            case 50:
                                ByteString byteStringQ3 = jVar.q();
                                this.bitField0_ |= 16;
                                this.typeName_ = byteStringQ3;
                                continue;
                            case 58:
                                ByteString byteStringQ4 = jVar.q();
                                this.bitField0_ |= 64;
                                this.defaultValue_ = byteStringQ4;
                                continue;
                            case 66:
                                FieldOptions.b builder = (this.bitField0_ & 512) != 0 ? this.options_.toBuilder() : null;
                                FieldOptions fieldOptions = (FieldOptions) jVar.z(FieldOptions.PARSER, tVar);
                                this.options_ = fieldOptions;
                                if (builder != null) {
                                    builder.J(fieldOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 512;
                                continue;
                            case 72:
                                this.bitField0_ |= 128;
                                this.oneofIndex_ = jVar.x();
                                continue;
                            case 82:
                                ByteString byteStringQ5 = jVar.q();
                                this.bitField0_ |= 256;
                                this.jsonName_ = byteStringQ5;
                                continue;
                            case 136:
                                this.bitField0_ |= 1024;
                                this.proto3Optional_ = jVar.p();
                                continue;
                            default:
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class FieldOptions extends GeneratedMessageV3.ExtendableMessage<FieldOptions> implements i {
        public static final int CTYPE_FIELD_NUMBER = 1;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private byte memoizedIsInitialized;
        private boolean packed_;
        private List<UninterpretedOption> uninterpretedOption_;
        private boolean weak_;
        private static final FieldOptions DEFAULT_INSTANCE = new FieldOptions();

        @Deprecated
        public static final vkh<FieldOptions> PARSER = new a();

        public enum CType implements z0 {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE = 0;
            private final int value;
            private static final d0.d<CType> internalValueMap = new a();
            private static final CType[] VALUES = values();

            public static class a implements d0.d<CType> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public CType findValueByNumber(int i) {
                    return CType.forNumber(i);
                }
            }

            CType(int i) {
                this.value = i;
            }

            public static CType forNumber(int i) {
                if (i == 0) {
                    return STRING;
                }
                if (i == 1) {
                    return CORD;
                }
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static final Descriptors.d getDescriptor() {
                return FieldOptions.getDescriptor().m().get(0);
            }

            public static d0.d<CType> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static CType valueOf(int i) {
                return forNumber(i);
            }

            public static CType valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum JSType implements z0 {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public static final int JS_NORMAL_VALUE = 0;
            public static final int JS_NUMBER_VALUE = 2;
            public static final int JS_STRING_VALUE = 1;
            private final int value;
            private static final d0.d<JSType> internalValueMap = new a();
            private static final JSType[] VALUES = values();

            public static class a implements d0.d<JSType> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public JSType findValueByNumber(int i) {
                    return JSType.forNumber(i);
                }
            }

            JSType(int i) {
                this.value = i;
            }

            public static JSType forNumber(int i) {
                if (i == 0) {
                    return JS_NORMAL;
                }
                if (i == 1) {
                    return JS_STRING;
                }
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static final Descriptors.d getDescriptor() {
                return FieldOptions.getDescriptor().m().get(1);
            }

            public static d0.d<JSType> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static JSType valueOf(int i) {
                return forNumber(i);
            }

            public static JSType valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static class a extends com.google.protobuf.c<FieldOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public FieldOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new FieldOptions(jVar, tVar);
            }
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.E;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<FieldOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldOptions)) {
                return super.equals(obj);
            }
            FieldOptions fieldOptions = (FieldOptions) obj;
            if (hasCtype() != fieldOptions.hasCtype()) {
                return false;
            }
            if ((hasCtype() && this.ctype_ != fieldOptions.ctype_) || hasPacked() != fieldOptions.hasPacked()) {
                return false;
            }
            if ((hasPacked() && getPacked() != fieldOptions.getPacked()) || hasJstype() != fieldOptions.hasJstype()) {
                return false;
            }
            if ((hasJstype() && this.jstype_ != fieldOptions.jstype_) || hasLazy() != fieldOptions.hasLazy()) {
                return false;
            }
            if ((hasLazy() && getLazy() != fieldOptions.getLazy()) || hasDeprecated() != fieldOptions.hasDeprecated()) {
                return false;
            }
            if ((!hasDeprecated() || getDeprecated() == fieldOptions.getDeprecated()) && hasWeak() == fieldOptions.hasWeak()) {
                return (!hasWeak() || getWeak() == fieldOptions.getWeak()) && getUninterpretedOptionList().equals(fieldOptions.getUninterpretedOptionList()) && this.unknownFields.equals(fieldOptions.unknownFields) && getExtensionFields().equals(fieldOptions.getExtensionFields());
            }
            return false;
        }

        public CType getCtype() {
            CType cTypeValueOf = CType.valueOf(this.ctype_);
            return cTypeValueOf == null ? CType.STRING : cTypeValueOf;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public JSType getJstype() {
            JSType jSTypeValueOf = JSType.valueOf(this.jstype_);
            return jSTypeValueOf == null ? JSType.JS_NORMAL : jSTypeValueOf;
        }

        public boolean getLazy() {
            return this.lazy_;
        }

        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<FieldOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iL = (this.bitField0_ & 1) != 0 ? CodedOutputStream.l(1, this.ctype_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iL += CodedOutputStream.e(2, this.packed_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iL += CodedOutputStream.e(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iL += CodedOutputStream.e(5, this.lazy_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iL += CodedOutputStream.l(6, this.jstype_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iL += CodedOutputStream.e(10, this.weak_);
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iL += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iL + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean getWeak() {
            return this.weak_;
        }

        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasWeak() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasCtype()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.ctype_;
            }
            if (hasPacked()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + d0.d(getPacked());
            }
            if (hasJstype()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + this.jstype_;
            }
            if (hasLazy()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + d0.d(getLazy());
            }
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + d0.d(getDeprecated());
            }
            if (hasWeak()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + d0.d(getWeak());
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.F.d(FieldOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new FieldOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.u0(1, this.ctype_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.m0(2, this.packed_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.m0(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.m0(5, this.lazy_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.u0(6, this.jstype_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.m0(10, this.weak_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<FieldOptions, b> implements i {
            public int f;
            public int g;
            public boolean h;
            public int i;
            public boolean j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f9473k;
            public boolean l;
            public List<UninterpretedOption> m;
            public c1<UninterpretedOption, UninterpretedOption.b, u> n;

            private void F() {
                if ((this.f & 64) == 0) {
                    this.m = new ArrayList(this.m);
                    this.f |= 64;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.n == null) {
                    this.n = new c1<>(this.m, (this.f & 64) != 0, g(), isClean());
                    this.m = null;
                }
                return this.n;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = 0;
                int i = this.f;
                this.h = false;
                this.i = 0;
                this.j = false;
                this.f9473k = false;
                this.l = false;
                this.f = i & (-64);
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.n;
                if (c1Var == null) {
                    this.m = Collections.emptyList();
                    this.f &= -65;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public FieldOptions getDefaultInstanceForType() {
                return FieldOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                FieldOptions fieldOptions = null;
                try {
                    try {
                        FieldOptions partialFrom = FieldOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        FieldOptions fieldOptions2 = (FieldOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            fieldOptions = fieldOptions2;
                            if (fieldOptions != null) {
                                J(fieldOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fieldOptions != null) {
                        J(fieldOptions);
                    }
                    throw th;
                }
            }

            public b J(FieldOptions fieldOptions) {
                if (fieldOptions == FieldOptions.getDefaultInstance()) {
                    return this;
                }
                if (fieldOptions.hasCtype()) {
                    M(fieldOptions.getCtype());
                }
                if (fieldOptions.hasPacked()) {
                    S(fieldOptions.getPacked());
                }
                if (fieldOptions.hasJstype()) {
                    Q(fieldOptions.getJstype());
                }
                if (fieldOptions.hasLazy()) {
                    R(fieldOptions.getLazy());
                }
                if (fieldOptions.hasDeprecated()) {
                    N(fieldOptions.getDeprecated());
                }
                if (fieldOptions.hasWeak()) {
                    U(fieldOptions.getWeak());
                }
                if (this.n == null) {
                    if (!fieldOptions.uninterpretedOption_.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = fieldOptions.uninterpretedOption_;
                            this.f &= -65;
                        } else {
                            F();
                            this.m.addAll(fieldOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!fieldOptions.uninterpretedOption_.isEmpty()) {
                    if (this.n.j()) {
                        this.n.f();
                        this.n = null;
                        this.m = fieldOptions.uninterpretedOption_;
                        this.f &= -65;
                        this.n = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.n.b(fieldOptions.uninterpretedOption_);
                    }
                }
                u(fieldOptions);
                mo145mergeUnknownFields(fieldOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof FieldOptions) {
                    return J((FieldOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(CType cType) {
                cType.getClass();
                this.f |= 1;
                this.g = cType.getNumber();
                onChanged();
                return this;
            }

            public b N(boolean z) {
                this.f |= 16;
                this.f9473k = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b Q(JSType jSType) {
                jSType.getClass();
                this.f |= 4;
                this.i = jSType.getNumber();
                onChanged();
                return this;
            }

            public b R(boolean z) {
                this.f |= 8;
                this.j = z;
                onChanged();
                return this;
            }

            public b S(boolean z) {
                this.f |= 2;
                this.h = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            public b U(boolean z) {
                this.f |= 32;
                this.l = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.E;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.F.d(FieldOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public FieldOptions build() {
                FieldOptions fieldOptionsBuildPartial = buildPartial();
                if (fieldOptionsBuildPartial.isInitialized()) {
                    return fieldOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fieldOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public FieldOptions buildPartial() {
                FieldOptions fieldOptions = new FieldOptions(this);
                int i = this.f;
                int i2 = (i & 1) != 0 ? 1 : 0;
                fieldOptions.ctype_ = this.g;
                if ((i & 2) != 0) {
                    fieldOptions.packed_ = this.h;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                fieldOptions.jstype_ = this.i;
                if ((i & 8) != 0) {
                    fieldOptions.lazy_ = this.j;
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    fieldOptions.deprecated_ = this.f9473k;
                    i2 |= 16;
                }
                if ((i & 32) != 0) {
                    fieldOptions.weak_ = this.l;
                    i2 |= 32;
                }
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.n;
                if (c1Var == null) {
                    if ((this.f & 64) != 0) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.f &= -65;
                    }
                    fieldOptions.uninterpretedOption_ = this.m;
                } else {
                    fieldOptions.uninterpretedOption_ = c1Var.d();
                }
                fieldOptions.bitField0_ = i2;
                onBuilt();
                return fieldOptions;
            }

            public b() {
                this.g = 0;
                this.i = 0;
                this.m = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.g = 0;
                this.i = 0;
                this.m = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(FieldOptions fieldOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(fieldOptions);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private FieldOptions(GeneratedMessageV3.d<FieldOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FieldOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static FieldOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public FieldOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static FieldOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private FieldOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.ctype_ = 0;
            this.jstype_ = 0;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static FieldOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static FieldOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static FieldOptions parseFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FieldOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FieldOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        private FieldOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                int iS = jVar.s();
                                if (CType.valueOf(iS) == null) {
                                    bVarG.s(1, iS);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.ctype_ = iS;
                                }
                            } else if (iJ == 16) {
                                this.bitField0_ |= 2;
                                this.packed_ = jVar.p();
                            } else if (iJ == 24) {
                                this.bitField0_ |= 16;
                                this.deprecated_ = jVar.p();
                            } else if (iJ == 40) {
                                this.bitField0_ |= 8;
                                this.lazy_ = jVar.p();
                            } else if (iJ == 48) {
                                int iS2 = jVar.s();
                                if (JSType.valueOf(iS2) == null) {
                                    bVarG.s(6, iS2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.jstype_ = iS2;
                                }
                            } else if (iJ == 80) {
                                this.bitField0_ |= 32;
                                this.weak_ = jVar.p();
                            } else if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c & '@') == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = '@';
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & '@') != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & '@') != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static FieldOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (FieldOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static FieldOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (FieldOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class FileDescriptorProto extends GeneratedMessageV3 implements j {
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ree dependency_;
        private List<EnumDescriptorProto> enumType_;
        private List<FieldDescriptorProto> extension_;
        private byte memoizedIsInitialized;
        private List<DescriptorProto> messageType_;
        private volatile Object name_;
        private FileOptions options_;
        private volatile Object package_;
        private d0.g publicDependency_;
        private List<ServiceDescriptorProto> service_;
        private SourceCodeInfo sourceCodeInfo_;
        private volatile Object syntax_;
        private d0.g weakDependency_;
        private static final FileDescriptorProto DEFAULT_INSTANCE = new FileDescriptorProto();

        @Deprecated
        public static final vkh<FileDescriptorProto> PARSER = new a();

        public static class a extends com.google.protobuf.c<FileDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new FileDescriptorProto(jVar, tVar);
            }
        }

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.c;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<FileDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileDescriptorProto)) {
                return super.equals(obj);
            }
            FileDescriptorProto fileDescriptorProto = (FileDescriptorProto) obj;
            if (hasName() != fileDescriptorProto.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(fileDescriptorProto.getName())) || hasPackage() != fileDescriptorProto.hasPackage()) {
                return false;
            }
            if ((hasPackage() && !getPackage().equals(fileDescriptorProto.getPackage())) || !m148getDependencyList().equals(fileDescriptorProto.m148getDependencyList()) || !getPublicDependencyList().equals(fileDescriptorProto.getPublicDependencyList()) || !getWeakDependencyList().equals(fileDescriptorProto.getWeakDependencyList()) || !getMessageTypeList().equals(fileDescriptorProto.getMessageTypeList()) || !getEnumTypeList().equals(fileDescriptorProto.getEnumTypeList()) || !getServiceList().equals(fileDescriptorProto.getServiceList()) || !getExtensionList().equals(fileDescriptorProto.getExtensionList()) || hasOptions() != fileDescriptorProto.hasOptions()) {
                return false;
            }
            if ((hasOptions() && !getOptions().equals(fileDescriptorProto.getOptions())) || hasSourceCodeInfo() != fileDescriptorProto.hasSourceCodeInfo()) {
                return false;
            }
            if ((!hasSourceCodeInfo() || getSourceCodeInfo().equals(fileDescriptorProto.getSourceCodeInfo())) && hasSyntax() == fileDescriptorProto.hasSyntax()) {
                return (!hasSyntax() || getSyntax().equals(fileDescriptorProto.getSyntax())) && this.unknownFields.equals(fileDescriptorProto.unknownFields);
            }
            return false;
        }

        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        public ByteString getDependencyBytes(int i) {
            return this.dependency_.getByteString(i);
        }

        public int getDependencyCount() {
            return this.dependency_.size();
        }

        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public c getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends c> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        public int getExtensionCount() {
            return this.extension_.size();
        }

        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public h getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends h> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public DescriptorProto getMessageType(int i) {
            return this.messageType_.get(i);
        }

        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        public List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public b getMessageTypeOrBuilder(int i) {
            return this.messageType_.get(i);
        }

        public List<? extends b> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public FileOptions getOptions() {
            FileOptions fileOptions = this.options_;
            return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
        }

        public k getOptionsOrBuilder() {
            FileOptions fileOptions = this.options_;
            return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
        }

        public String getPackage() {
            Object obj = this.package_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.package_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getPackageBytes() {
            Object obj = this.package_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.package_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<FileDescriptorProto> getParserForType() {
            return PARSER;
        }

        public int getPublicDependency(int i) {
            return this.publicDependency_.getInt(i);
        }

        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.package_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i2 = 0; i2 < this.dependency_.size(); i2++) {
                iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.dependency_.d(i2));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + m148getDependencyList().size();
            for (int i3 = 0; i3 < this.messageType_.size(); i3++) {
                size += CodedOutputStream.G(4, this.messageType_.get(i3));
            }
            for (int i4 = 0; i4 < this.enumType_.size(); i4++) {
                size += CodedOutputStream.G(5, this.enumType_.get(i4));
            }
            for (int i5 = 0; i5 < this.service_.size(); i5++) {
                size += CodedOutputStream.G(6, this.service_.get(i5));
            }
            for (int i6 = 0; i6 < this.extension_.size(); i6++) {
                size += CodedOutputStream.G(7, this.extension_.get(i6));
            }
            if ((this.bitField0_ & 4) != 0) {
                size += CodedOutputStream.G(8, getOptions());
            }
            if ((this.bitField0_ & 8) != 0) {
                size += CodedOutputStream.G(9, getSourceCodeInfo());
            }
            int iY = 0;
            for (int i7 = 0; i7 < this.publicDependency_.size(); i7++) {
                iY += CodedOutputStream.y(this.publicDependency_.getInt(i7));
            }
            int size2 = size + iY + getPublicDependencyList().size();
            int iY2 = 0;
            for (int i8 = 0; i8 < this.weakDependency_.size(); i8++) {
                iY2 += CodedOutputStream.y(this.weakDependency_.getInt(i8));
            }
            int size3 = size2 + iY2 + getWeakDependencyList().size();
            if ((this.bitField0_ & 16) != 0) {
                size3 += GeneratedMessageV3.computeStringSize(12, this.syntax_);
            }
            int serializedSize = size3 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public ServiceDescriptorProto getService(int i) {
            return this.service_.get(i);
        }

        public int getServiceCount() {
            return this.service_.size();
        }

        public List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public r getServiceOrBuilder(int i) {
            return this.service_.get(i);
        }

        public List<? extends r> getServiceOrBuilderList() {
            return this.service_;
        }

        public SourceCodeInfo getSourceCodeInfo() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
        }

        public t getSourceCodeInfoOrBuilder() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
        }

        public String getSyntax() {
            Object obj = this.syntax_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.syntax_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getSyntaxBytes() {
            Object obj = this.syntax_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.syntax_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public int getWeakDependency(int i) {
            return this.weakDependency_.getInt(i);
        }

        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasPackage()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPackage().hashCode();
            }
            if (getDependencyCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + m148getDependencyList().hashCode();
            }
            if (getPublicDependencyCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getPublicDependencyList().hashCode();
            }
            if (getWeakDependencyCount() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getWeakDependencyList().hashCode();
            }
            if (getMessageTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMessageTypeList().hashCode();
            }
            if (getEnumTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getEnumTypeList().hashCode();
            }
            if (getServiceCount() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getServiceList().hashCode();
            }
            if (getExtensionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getExtensionList().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getOptions().hashCode();
            }
            if (hasSourceCodeInfo()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getSourceCodeInfo().hashCode();
            }
            if (hasSyntax()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getSyntax().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.d.d(FileDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getMessageTypeCount(); i++) {
                if (!getMessageType(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getEnumTypeCount(); i2++) {
                if (!getEnumType(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getServiceCount(); i3++) {
                if (!getService(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getExtensionCount(); i4++) {
                if (!getExtension(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new FileDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.package_);
            }
            for (int i = 0; i < this.dependency_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.dependency_.d(i));
            }
            for (int i2 = 0; i2 < this.messageType_.size(); i2++) {
                codedOutputStream.K0(4, this.messageType_.get(i2));
            }
            for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
                codedOutputStream.K0(5, this.enumType_.get(i3));
            }
            for (int i4 = 0; i4 < this.service_.size(); i4++) {
                codedOutputStream.K0(6, this.service_.get(i4));
            }
            for (int i5 = 0; i5 < this.extension_.size(); i5++) {
                codedOutputStream.K0(7, this.extension_.get(i5));
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.K0(8, getOptions());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.K0(9, getSourceCodeInfo());
            }
            for (int i6 = 0; i6 < this.publicDependency_.size(); i6++) {
                codedOutputStream.G0(10, this.publicDependency_.getInt(i6));
            }
            for (int i7 = 0; i7 < this.weakDependency_.size(); i7++) {
                codedOutputStream.G0(11, this.weakDependency_.getInt(i7));
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.syntax_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements j {
            public int e;
            public Object f;
            public Object g;
            public ree h;
            public d0.g i;
            public d0.g j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public List<DescriptorProto> f9474k;
            public c1<DescriptorProto, DescriptorProto.b, b> l;
            public List<EnumDescriptorProto> m;
            public c1<EnumDescriptorProto, EnumDescriptorProto.b, c> n;
            public List<ServiceDescriptorProto> o;
            public c1<ServiceDescriptorProto, ServiceDescriptorProto.b, r> p;
            public List<FieldDescriptorProto> q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public c1<FieldDescriptorProto, FieldDescriptorProto.b, h> f9475r;
            public FileOptions s;
            public h1<FileOptions, FileOptions.b, k> t;
            public SourceCodeInfo u;
            public h1<SourceCodeInfo, SourceCodeInfo.b, t> v;
            public Object w;

            private c1<EnumDescriptorProto, EnumDescriptorProto.b, c> F() {
                if (this.n == null) {
                    this.n = new c1<>(this.m, (this.e & 64) != 0, g(), isClean());
                    this.m = null;
                }
                return this.n;
            }

            private c1<FieldDescriptorProto, FieldDescriptorProto.b, h> G() {
                if (this.f9475r == null) {
                    this.f9475r = new c1<>(this.q, (this.e & 256) != 0, g(), isClean());
                    this.q = null;
                }
                return this.f9475r;
            }

            private h1<FileOptions, FileOptions.b, k> J() {
                if (this.t == null) {
                    this.t = new h1<>(I(), g(), isClean());
                    this.s = null;
                }
                return this.t;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                    F();
                    K();
                    G();
                    J();
                    M();
                }
            }

            private void x() {
                if ((this.e & 64) == 0) {
                    this.m = new ArrayList(this.m);
                    this.e |= 64;
                }
            }

            private void y() {
                if ((this.e & 256) == 0) {
                    this.q = new ArrayList(this.q);
                    this.e |= 256;
                }
            }

            public final void A() {
                if ((this.e & 8) == 0) {
                    this.i = GeneratedMessageV3.mutableCopy(this.i);
                    this.e |= 8;
                }
            }

            public final void B() {
                if ((this.e & 128) == 0) {
                    this.o = new ArrayList(this.o);
                    this.e |= 128;
                }
            }

            public final void C() {
                if ((this.e & 16) == 0) {
                    this.j = GeneratedMessageV3.mutableCopy(this.j);
                    this.e |= 16;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public FileDescriptorProto getDefaultInstanceForType() {
                return FileDescriptorProto.getDefaultInstance();
            }

            public final c1<DescriptorProto, DescriptorProto.b, b> H() {
                if (this.l == null) {
                    this.l = new c1<>(this.f9474k, (this.e & 32) != 0, g(), isClean());
                    this.f9474k = null;
                }
                return this.l;
            }

            public FileOptions I() {
                h1<FileOptions, FileOptions.b, k> h1Var = this.t;
                if (h1Var != null) {
                    return (FileOptions) h1Var.f();
                }
                FileOptions fileOptions = this.s;
                return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
            }

            public final c1<ServiceDescriptorProto, ServiceDescriptorProto.b, r> K() {
                if (this.p == null) {
                    this.p = new c1<>(this.o, (this.e & 128) != 0, g(), isClean());
                    this.o = null;
                }
                return this.p;
            }

            public SourceCodeInfo L() {
                h1<SourceCodeInfo, SourceCodeInfo.b, t> h1Var = this.v;
                if (h1Var != null) {
                    return (SourceCodeInfo) h1Var.f();
                }
                SourceCodeInfo sourceCodeInfo = this.u;
                return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
            }

            public final h1<SourceCodeInfo, SourceCodeInfo.b, t> M() {
                if (this.v == null) {
                    this.v = new h1<>(L(), g(), isClean());
                    this.u = null;
                }
                return this.v;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                FileDescriptorProto fileDescriptorProto = null;
                try {
                    try {
                        FileDescriptorProto partialFrom = FileDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            O(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        FileDescriptorProto fileDescriptorProto2 = (FileDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptorProto = fileDescriptorProto2;
                            if (fileDescriptorProto != null) {
                                O(fileDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileDescriptorProto != null) {
                        O(fileDescriptorProto);
                    }
                    throw th;
                }
            }

            public b O(FileDescriptorProto fileDescriptorProto) {
                if (fileDescriptorProto == FileDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (fileDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = fileDescriptorProto.name_;
                    onChanged();
                }
                if (fileDescriptorProto.hasPackage()) {
                    this.e |= 2;
                    this.g = fileDescriptorProto.package_;
                    onChanged();
                }
                if (!fileDescriptorProto.dependency_.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = fileDescriptorProto.dependency_;
                        this.e &= -5;
                    } else {
                        w();
                        this.h.addAll(fileDescriptorProto.dependency_);
                    }
                    onChanged();
                }
                if (!fileDescriptorProto.publicDependency_.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = fileDescriptorProto.publicDependency_;
                        this.e &= -9;
                    } else {
                        A();
                        this.i.addAll(fileDescriptorProto.publicDependency_);
                    }
                    onChanged();
                }
                if (!fileDescriptorProto.weakDependency_.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = fileDescriptorProto.weakDependency_;
                        this.e &= -17;
                    } else {
                        C();
                        this.j.addAll(fileDescriptorProto.weakDependency_);
                    }
                    onChanged();
                }
                if (this.l == null) {
                    if (!fileDescriptorProto.messageType_.isEmpty()) {
                        if (this.f9474k.isEmpty()) {
                            this.f9474k = fileDescriptorProto.messageType_;
                            this.e &= -33;
                        } else {
                            z();
                            this.f9474k.addAll(fileDescriptorProto.messageType_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.messageType_.isEmpty()) {
                    if (this.l.j()) {
                        this.l.f();
                        this.l = null;
                        this.f9474k = fileDescriptorProto.messageType_;
                        this.e &= -33;
                        this.l = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.l.b(fileDescriptorProto.messageType_);
                    }
                }
                if (this.n == null) {
                    if (!fileDescriptorProto.enumType_.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = fileDescriptorProto.enumType_;
                            this.e &= -65;
                        } else {
                            x();
                            this.m.addAll(fileDescriptorProto.enumType_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.enumType_.isEmpty()) {
                    if (this.n.j()) {
                        this.n.f();
                        this.n = null;
                        this.m = fileDescriptorProto.enumType_;
                        this.e &= -65;
                        this.n = GeneratedMessageV3.alwaysUseFieldBuilders ? F() : null;
                    } else {
                        this.n.b(fileDescriptorProto.enumType_);
                    }
                }
                if (this.p == null) {
                    if (!fileDescriptorProto.service_.isEmpty()) {
                        if (this.o.isEmpty()) {
                            this.o = fileDescriptorProto.service_;
                            this.e &= -129;
                        } else {
                            B();
                            this.o.addAll(fileDescriptorProto.service_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.service_.isEmpty()) {
                    if (this.p.j()) {
                        this.p.f();
                        this.p = null;
                        this.o = fileDescriptorProto.service_;
                        this.e &= -129;
                        this.p = GeneratedMessageV3.alwaysUseFieldBuilders ? K() : null;
                    } else {
                        this.p.b(fileDescriptorProto.service_);
                    }
                }
                if (this.f9475r == null) {
                    if (!fileDescriptorProto.extension_.isEmpty()) {
                        if (this.q.isEmpty()) {
                            this.q = fileDescriptorProto.extension_;
                            this.e &= -257;
                        } else {
                            y();
                            this.q.addAll(fileDescriptorProto.extension_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.extension_.isEmpty()) {
                    if (this.f9475r.j()) {
                        this.f9475r.f();
                        this.f9475r = null;
                        this.q = fileDescriptorProto.extension_;
                        this.e &= -257;
                        this.f9475r = GeneratedMessageV3.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9475r.b(fileDescriptorProto.extension_);
                    }
                }
                if (fileDescriptorProto.hasOptions()) {
                    R(fileDescriptorProto.getOptions());
                }
                if (fileDescriptorProto.hasSourceCodeInfo()) {
                    S(fileDescriptorProto.getSourceCodeInfo());
                }
                if (fileDescriptorProto.hasSyntax()) {
                    this.e |= 2048;
                    this.w = fileDescriptorProto.syntax_;
                    onChanged();
                }
                mo145mergeUnknownFields(fileDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof FileDescriptorProto) {
                    return O((FileDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b R(FileOptions fileOptions) {
                FileOptions fileOptions2;
                h1<FileOptions, FileOptions.b, k> h1Var = this.t;
                if (h1Var == null) {
                    if ((this.e & 512) == 0 || (fileOptions2 = this.s) == null || fileOptions2 == FileOptions.getDefaultInstance()) {
                        this.s = fileOptions;
                    } else {
                        this.s = FileOptions.newBuilder(this.s).J(fileOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(fileOptions);
                }
                this.e |= 512;
                return this;
            }

            public b S(SourceCodeInfo sourceCodeInfo) {
                SourceCodeInfo sourceCodeInfo2;
                h1<SourceCodeInfo, SourceCodeInfo.b, t> h1Var = this.v;
                if (h1Var == null) {
                    if ((this.e & 1024) == 0 || (sourceCodeInfo2 = this.u) == null || sourceCodeInfo2 == SourceCodeInfo.getDefaultInstance()) {
                        this.u = sourceCodeInfo;
                    } else {
                        this.u = SourceCodeInfo.newBuilder(this.u).z(sourceCodeInfo).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(sourceCodeInfo);
                }
                this.e |= 1024;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b V(String str) {
                str.getClass();
                this.e |= 1;
                this.f = str;
                onChanged();
                return this;
            }

            public b W(String str) {
                str.getClass();
                this.e |= 2;
                this.g = str;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.d.d(FileDescriptorProto.class, b.class);
            }

            public b n(DescriptorProto descriptorProto) {
                c1<DescriptorProto, DescriptorProto.b, b> c1Var = this.l;
                if (c1Var == null) {
                    descriptorProto.getClass();
                    z();
                    this.f9474k.add(descriptorProto);
                    onChanged();
                } else {
                    c1Var.c(descriptorProto);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public FileDescriptorProto build() {
                FileDescriptorProto fileDescriptorProtoBuildPartial = buildPartial();
                if (fileDescriptorProtoBuildPartial.isInitialized()) {
                    return fileDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fileDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public FileDescriptorProto buildPartial() {
                FileDescriptorProto fileDescriptorProto = new FileDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                fileDescriptorProto.name_ = this.f;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                fileDescriptorProto.package_ = this.g;
                if ((this.e & 4) != 0) {
                    this.h = this.h.getUnmodifiableView();
                    this.e &= -5;
                }
                fileDescriptorProto.dependency_ = this.h;
                if ((this.e & 8) != 0) {
                    this.i.b();
                    this.e &= -9;
                }
                fileDescriptorProto.publicDependency_ = this.i;
                if ((this.e & 16) != 0) {
                    this.j.b();
                    this.e &= -17;
                }
                fileDescriptorProto.weakDependency_ = this.j;
                c1<DescriptorProto, DescriptorProto.b, b> c1Var = this.l;
                if (c1Var == null) {
                    if ((this.e & 32) != 0) {
                        this.f9474k = Collections.unmodifiableList(this.f9474k);
                        this.e &= -33;
                    }
                    fileDescriptorProto.messageType_ = this.f9474k;
                } else {
                    fileDescriptorProto.messageType_ = c1Var.d();
                }
                c1<EnumDescriptorProto, EnumDescriptorProto.b, c> c1Var2 = this.n;
                if (c1Var2 == null) {
                    if ((this.e & 64) != 0) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.e &= -65;
                    }
                    fileDescriptorProto.enumType_ = this.m;
                } else {
                    fileDescriptorProto.enumType_ = c1Var2.d();
                }
                c1<ServiceDescriptorProto, ServiceDescriptorProto.b, r> c1Var3 = this.p;
                if (c1Var3 == null) {
                    if ((this.e & 128) != 0) {
                        this.o = Collections.unmodifiableList(this.o);
                        this.e &= -129;
                    }
                    fileDescriptorProto.service_ = this.o;
                } else {
                    fileDescriptorProto.service_ = c1Var3.d();
                }
                c1<FieldDescriptorProto, FieldDescriptorProto.b, h> c1Var4 = this.f9475r;
                if (c1Var4 == null) {
                    if ((this.e & 256) != 0) {
                        this.q = Collections.unmodifiableList(this.q);
                        this.e &= -257;
                    }
                    fileDescriptorProto.extension_ = this.q;
                } else {
                    fileDescriptorProto.extension_ = c1Var4.d();
                }
                if ((i & 512) != 0) {
                    h1<FileOptions, FileOptions.b, k> h1Var = this.t;
                    if (h1Var == null) {
                        fileDescriptorProto.options_ = this.s;
                    } else {
                        fileDescriptorProto.options_ = (FileOptions) h1Var.b();
                    }
                    i2 |= 4;
                }
                if ((i & 1024) != 0) {
                    h1<SourceCodeInfo, SourceCodeInfo.b, t> h1Var2 = this.v;
                    if (h1Var2 == null) {
                        fileDescriptorProto.sourceCodeInfo_ = this.u;
                    } else {
                        fileDescriptorProto.sourceCodeInfo_ = (SourceCodeInfo) h1Var2.b();
                    }
                    i2 |= 8;
                }
                if ((i & 2048) != 0) {
                    i2 |= 16;
                }
                fileDescriptorProto.syntax_ = this.w;
                fileDescriptorProto.bitField0_ = i2;
                onBuilt();
                return fileDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                int i = this.e;
                this.g = "";
                this.e = i & (-4);
                this.h = g0.d;
                this.e = i & (-8);
                this.i = GeneratedMessageV3.emptyIntList();
                this.e &= -9;
                this.j = GeneratedMessageV3.emptyIntList();
                this.e &= -17;
                c1<DescriptorProto, DescriptorProto.b, b> c1Var = this.l;
                if (c1Var == null) {
                    this.f9474k = Collections.emptyList();
                    this.e &= -33;
                } else {
                    c1Var.e();
                }
                c1<EnumDescriptorProto, EnumDescriptorProto.b, c> c1Var2 = this.n;
                if (c1Var2 == null) {
                    this.m = Collections.emptyList();
                    this.e &= -65;
                } else {
                    c1Var2.e();
                }
                c1<ServiceDescriptorProto, ServiceDescriptorProto.b, r> c1Var3 = this.p;
                if (c1Var3 == null) {
                    this.o = Collections.emptyList();
                    this.e &= -129;
                } else {
                    c1Var3.e();
                }
                c1<FieldDescriptorProto, FieldDescriptorProto.b, h> c1Var4 = this.f9475r;
                if (c1Var4 == null) {
                    this.q = Collections.emptyList();
                    this.e &= -257;
                } else {
                    c1Var4.e();
                }
                h1<FileOptions, FileOptions.b, k> h1Var = this.t;
                if (h1Var == null) {
                    this.s = null;
                } else {
                    h1Var.c();
                }
                this.e &= -513;
                h1<SourceCodeInfo, SourceCodeInfo.b, t> h1Var2 = this.v;
                if (h1Var2 == null) {
                    this.u = null;
                } else {
                    h1Var2.c();
                }
                int i2 = this.e;
                this.w = "";
                this.e = i2 & (-3073);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void w() {
                if ((this.e & 4) == 0) {
                    this.h = new g0(this.h);
                    this.e |= 4;
                }
            }

            public final void z() {
                if ((this.e & 32) == 0) {
                    this.f9474k = new ArrayList(this.f9474k);
                    this.e |= 32;
                }
            }

            public b() {
                this.f = "";
                this.g = "";
                this.h = g0.d;
                this.i = GeneratedMessageV3.emptyIntList();
                this.j = GeneratedMessageV3.emptyIntList();
                this.f9474k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = Collections.emptyList();
                this.q = Collections.emptyList();
                this.w = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.g = "";
                this.h = g0.d;
                this.i = GeneratedMessageV3.emptyIntList();
                this.j = GeneratedMessageV3.emptyIntList();
                this.f9474k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = Collections.emptyList();
                this.q = Collections.emptyList();
                this.w = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(FileDescriptorProto fileDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().O(fileDescriptorProto);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        /* JADX INFO: renamed from: getDependencyList, reason: merged with bridge method [inline-methods] */
        public bei m148getDependencyList() {
            return this.dependency_;
        }

        private FileDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FileDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public FileDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().O(this);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private FileDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.package_ = "";
            this.dependency_ = g0.d;
            this.publicDependency_ = GeneratedMessageV3.emptyIntList();
            this.weakDependency_ = GeneratedMessageV3.emptyIntList();
            this.messageType_ = Collections.emptyList();
            this.enumType_ = Collections.emptyList();
            this.service_ = Collections.emptyList();
            this.extension_ = Collections.emptyList();
            this.syntax_ = "";
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FileDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static FileDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (FileDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static FileDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (FileDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }

        private FileDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        switch (iJ) {
                            case 0:
                                break;
                            case 10:
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ |= 1;
                                this.name_ = byteStringQ;
                                continue;
                            case 18:
                                ByteString byteStringQ2 = jVar.q();
                                this.bitField0_ |= 2;
                                this.package_ = byteStringQ2;
                                continue;
                            case 26:
                                ByteString byteStringQ3 = jVar.q();
                                int i2 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i2 == 0) {
                                    this.dependency_ = new g0();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.dependency_.n(byteStringQ3);
                                continue;
                            case 34:
                                int i3 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i3 == 0) {
                                    this.messageType_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.messageType_.add((DescriptorProto) jVar.z(DescriptorProto.PARSER, tVar));
                                continue;
                            case 42:
                                int i4 = (i == true ? 1 : 0) & 64;
                                i = i;
                                if (i4 == 0) {
                                    this.enumType_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 64;
                                }
                                this.enumType_.add((EnumDescriptorProto) jVar.z(EnumDescriptorProto.PARSER, tVar));
                                continue;
                            case 50:
                                int i5 = (i == true ? 1 : 0) & 128;
                                i = i;
                                if (i5 == 0) {
                                    this.service_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 128;
                                }
                                this.service_.add((ServiceDescriptorProto) jVar.z(ServiceDescriptorProto.PARSER, tVar));
                                continue;
                            case 58:
                                int i6 = (i == true ? 1 : 0) & 256;
                                i = i;
                                if (i6 == 0) {
                                    this.extension_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 256;
                                }
                                this.extension_.add((FieldDescriptorProto) jVar.z(FieldDescriptorProto.PARSER, tVar));
                                continue;
                            case 66:
                                FileOptions.b builder = (this.bitField0_ & 4) != 0 ? this.options_.toBuilder() : null;
                                FileOptions fileOptions = (FileOptions) jVar.z(FileOptions.PARSER, tVar);
                                this.options_ = fileOptions;
                                if (builder != null) {
                                    builder.J(fileOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                                continue;
                            case 74:
                                SourceCodeInfo.b builder2 = (this.bitField0_ & 8) != 0 ? this.sourceCodeInfo_.toBuilder() : null;
                                SourceCodeInfo sourceCodeInfo = (SourceCodeInfo) jVar.z(SourceCodeInfo.PARSER, tVar);
                                this.sourceCodeInfo_ = sourceCodeInfo;
                                if (builder2 != null) {
                                    builder2.z(sourceCodeInfo);
                                    this.sourceCodeInfo_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 8;
                                continue;
                            case 80:
                                int i7 = (i == true ? 1 : 0) & 8;
                                i = i;
                                if (i7 == 0) {
                                    this.publicDependency_ = GeneratedMessageV3.newIntList();
                                    i = (i == true ? 1 : 0) | 8;
                                }
                                this.publicDependency_.Q(jVar.x());
                                continue;
                            case 82:
                                int iO = jVar.o(jVar.B());
                                int i8 = (i == true ? 1 : 0) & 8;
                                i = i;
                                if (i8 == 0 && jVar.d() > 0) {
                                    i = i;
                                    this.publicDependency_ = GeneratedMessageV3.newIntList();
                                    i = (i == true ? 1 : 0) | 8;
                                }
                                i = i;
                                while (jVar.d() > 0) {
                                    this.publicDependency_.Q(jVar.x());
                                }
                                jVar.n(iO);
                                continue;
                            case 88:
                                int i9 = (i == true ? 1 : 0) & 16;
                                i = i;
                                if (i9 == 0) {
                                    this.weakDependency_ = GeneratedMessageV3.newIntList();
                                    i = (i == true ? 1 : 0) | 16;
                                }
                                this.weakDependency_.Q(jVar.x());
                                continue;
                            case 90:
                                int iO2 = jVar.o(jVar.B());
                                int i10 = (i == true ? 1 : 0) & 16;
                                i = i;
                                if (i10 == 0 && jVar.d() > 0) {
                                    i = i;
                                    this.weakDependency_ = GeneratedMessageV3.newIntList();
                                    i = (i == true ? 1 : 0) | 16;
                                }
                                i = i;
                                while (jVar.d() > 0) {
                                    this.weakDependency_.Q(jVar.x());
                                }
                                jVar.n(iO2);
                                continue;
                            case 98:
                                ByteString byteStringQ4 = jVar.q();
                                this.bitField0_ |= 16;
                                this.syntax_ = byteStringQ4;
                                continue;
                            default:
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 4) != 0) {
                        this.dependency_ = this.dependency_.getUnmodifiableView();
                    }
                    if (((i == true ? 1 : 0) & 32) != 0) {
                        this.messageType_ = Collections.unmodifiableList(this.messageType_);
                    }
                    if (((i == true ? 1 : 0) & 64) != 0) {
                        this.enumType_ = Collections.unmodifiableList(this.enumType_);
                    }
                    if (((i == true ? 1 : 0) & 128) != 0) {
                        this.service_ = Collections.unmodifiableList(this.service_);
                    }
                    if (((i == true ? 1 : 0) & 256) != 0) {
                        this.extension_ = Collections.unmodifiableList(this.extension_);
                    }
                    if (((i == true ? 1 : 0) & 8) != 0) {
                        this.publicDependency_.b();
                    }
                    if (((i == true ? 1 : 0) & 16) != 0) {
                        this.weakDependency_.b();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((i == true ? 1 : 0) & 4) != 0) {
                this.dependency_ = this.dependency_.getUnmodifiableView();
            }
            if (((i == true ? 1 : 0) & 32) != 0) {
                this.messageType_ = Collections.unmodifiableList(this.messageType_);
            }
            if (((i == true ? 1 : 0) & 64) != 0) {
                this.enumType_ = Collections.unmodifiableList(this.enumType_);
            }
            if (((i == true ? 1 : 0) & 128) != 0) {
                this.service_ = Collections.unmodifiableList(this.service_);
            }
            if (((i == true ? 1 : 0) & 256) != 0) {
                this.extension_ = Collections.unmodifiableList(this.extension_);
            }
            if (((i == true ? 1 : 0) & 8) != 0) {
                this.publicDependency_.b();
            }
            if (((i == true ? 1 : 0) & 16) != 0) {
                this.weakDependency_.b();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class FileDescriptorSet extends GeneratedMessageV3 implements s0 {
        public static final int FILE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FileDescriptorProto> file_;
        private byte memoizedIsInitialized;
        private static final FileDescriptorSet DEFAULT_INSTANCE = new FileDescriptorSet();

        @Deprecated
        public static final vkh<FileDescriptorSet> PARSER = new a();

        public static class a extends com.google.protobuf.c<FileDescriptorSet> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileDescriptorSet parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new FileDescriptorSet(jVar, tVar);
            }
        }

        public static FileDescriptorSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.f9465a;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<FileDescriptorSet> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileDescriptorSet)) {
                return super.equals(obj);
            }
            FileDescriptorSet fileDescriptorSet = (FileDescriptorSet) obj;
            return getFileList().equals(fileDescriptorSet.getFileList()) && this.unknownFields.equals(fileDescriptorSet.unknownFields);
        }

        public FileDescriptorProto getFile(int i) {
            return this.file_.get(i);
        }

        public int getFileCount() {
            return this.file_.size();
        }

        public List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public j getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public List<? extends j> getFileOrBuilderList() {
            return this.file_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<FileDescriptorSet> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = 0;
            for (int i2 = 0; i2 < this.file_.size(); i2++) {
                iG += CodedOutputStream.G(1, this.file_.get(i2));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getFileCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFileList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.f9466b.d(FileDescriptorSet.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getFileCount(); i++) {
                if (!getFile(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new FileDescriptorSet();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.file_.size(); i++) {
                codedOutputStream.K0(1, this.file_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements s0 {
            public int e;
            public List<FileDescriptorProto> f;
            public c1<FileDescriptorProto, FileDescriptorProto.b, j> g;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof FileDescriptorSet) {
                    return z((FileDescriptorSet) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.f9465a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.f9466b.d(FileDescriptorSet.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public FileDescriptorSet build() {
                FileDescriptorSet fileDescriptorSetBuildPartial = buildPartial();
                if (fileDescriptorSetBuildPartial.isInitialized()) {
                    return fileDescriptorSetBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fileDescriptorSetBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public FileDescriptorSet buildPartial() {
                FileDescriptorSet fileDescriptorSet = new FileDescriptorSet(this);
                int i = this.e;
                c1<FileDescriptorProto, FileDescriptorProto.b, j> c1Var = this.g;
                if (c1Var == null) {
                    if ((i & 1) != 0) {
                        this.f = Collections.unmodifiableList(this.f);
                        this.e &= -2;
                    }
                    fileDescriptorSet.file_ = this.f;
                } else {
                    fileDescriptorSet.file_ = c1Var.d();
                }
                onBuilt();
                return fileDescriptorSet;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                c1<FileDescriptorProto, FileDescriptorProto.b, j> c1Var = this.g;
                if (c1Var == null) {
                    this.f = Collections.emptyList();
                    this.e &= -2;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void v() {
                if ((this.e & 1) == 0) {
                    this.f = new ArrayList(this.f);
                    this.e |= 1;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public FileDescriptorSet getDefaultInstanceForType() {
                return FileDescriptorSet.getDefaultInstance();
            }

            public final c1<FileDescriptorProto, FileDescriptorProto.b, j> x() {
                if (this.g == null) {
                    this.g = new c1<>(this.f, (this.e & 1) != 0, g(), isClean());
                    this.f = null;
                }
                return this.g;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                FileDescriptorSet fileDescriptorSet = null;
                try {
                    try {
                        FileDescriptorSet partialFrom = FileDescriptorSet.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        FileDescriptorSet fileDescriptorSet2 = (FileDescriptorSet) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptorSet = fileDescriptorSet2;
                            if (fileDescriptorSet != null) {
                                z(fileDescriptorSet);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileDescriptorSet != null) {
                        z(fileDescriptorSet);
                    }
                    throw th;
                }
            }

            public b z(FileDescriptorSet fileDescriptorSet) {
                if (fileDescriptorSet == FileDescriptorSet.getDefaultInstance()) {
                    return this;
                }
                if (this.g == null) {
                    if (!fileDescriptorSet.file_.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = fileDescriptorSet.file_;
                            this.e &= -2;
                        } else {
                            v();
                            this.f.addAll(fileDescriptorSet.file_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorSet.file_.isEmpty()) {
                    if (this.g.j()) {
                        this.g.f();
                        this.g = null;
                        this.f = fileDescriptorSet.file_;
                        this.e &= -2;
                        this.g = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                    } else {
                        this.g.b(fileDescriptorSet.file_);
                    }
                }
                mo145mergeUnknownFields(fileDescriptorSet.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(FileDescriptorSet fileDescriptorSet) {
            return DEFAULT_INSTANCE.toBuilder().z(fileDescriptorSet);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private FileDescriptorSet(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FileDescriptorSet) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public FileDescriptorSet getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private FileDescriptorSet() {
            this.memoizedIsInitialized = (byte) -1;
            this.file_ = Collections.emptyList();
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private FileDescriptorSet(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ != 10) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.file_ = new ArrayList();
                                    z2 = true;
                                }
                                this.file_.add((FileDescriptorProto) jVar.z(FileDescriptorProto.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.file_ = Collections.unmodifiableList(this.file_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FileDescriptorSet) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static FileDescriptorSet parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (FileDescriptorSet) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static FileDescriptorSet parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (FileDescriptorSet) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class FileOptions extends GeneratedMessageV3.ExtendableMessage<FileOptions> implements k {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean ccEnableArenas_;
        private boolean ccGenericServices_;
        private volatile Object csharpNamespace_;
        private boolean deprecated_;
        private volatile Object goPackage_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private volatile Object javaOuterClassname_;
        private volatile Object javaPackage_;
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized;
        private volatile Object objcClassPrefix_;
        private int optimizeFor_;
        private volatile Object phpClassPrefix_;
        private boolean phpGenericServices_;
        private volatile Object phpMetadataNamespace_;
        private volatile Object phpNamespace_;
        private boolean pyGenericServices_;
        private volatile Object rubyPackage_;
        private volatile Object swiftPrefix_;
        private List<UninterpretedOption> uninterpretedOption_;
        private static final FileOptions DEFAULT_INSTANCE = new FileOptions();

        @Deprecated
        public static final vkh<FileOptions> PARSER = new a();

        public enum OptimizeMode implements z0 {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final int SPEED_VALUE = 1;
            private final int value;
            private static final d0.d<OptimizeMode> internalValueMap = new a();
            private static final OptimizeMode[] VALUES = values();

            public static class a implements d0.d<OptimizeMode> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public OptimizeMode findValueByNumber(int i) {
                    return OptimizeMode.forNumber(i);
                }
            }

            OptimizeMode(int i) {
                this.value = i;
            }

            public static OptimizeMode forNumber(int i) {
                if (i == 1) {
                    return SPEED;
                }
                if (i == 2) {
                    return CODE_SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static final Descriptors.d getDescriptor() {
                return FileOptions.getDescriptor().m().get(0);
            }

            public static d0.d<OptimizeMode> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static OptimizeMode valueOf(int i) {
                return forNumber(i);
            }

            public static OptimizeMode valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static class a extends com.google.protobuf.c<FileOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new FileOptions(jVar, tVar);
            }
        }

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.A;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<FileOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileOptions)) {
                return super.equals(obj);
            }
            FileOptions fileOptions = (FileOptions) obj;
            if (hasJavaPackage() != fileOptions.hasJavaPackage()) {
                return false;
            }
            if ((hasJavaPackage() && !getJavaPackage().equals(fileOptions.getJavaPackage())) || hasJavaOuterClassname() != fileOptions.hasJavaOuterClassname()) {
                return false;
            }
            if ((hasJavaOuterClassname() && !getJavaOuterClassname().equals(fileOptions.getJavaOuterClassname())) || hasJavaMultipleFiles() != fileOptions.hasJavaMultipleFiles()) {
                return false;
            }
            if ((hasJavaMultipleFiles() && getJavaMultipleFiles() != fileOptions.getJavaMultipleFiles()) || hasJavaGenerateEqualsAndHash() != fileOptions.hasJavaGenerateEqualsAndHash()) {
                return false;
            }
            if ((hasJavaGenerateEqualsAndHash() && getJavaGenerateEqualsAndHash() != fileOptions.getJavaGenerateEqualsAndHash()) || hasJavaStringCheckUtf8() != fileOptions.hasJavaStringCheckUtf8()) {
                return false;
            }
            if ((hasJavaStringCheckUtf8() && getJavaStringCheckUtf8() != fileOptions.getJavaStringCheckUtf8()) || hasOptimizeFor() != fileOptions.hasOptimizeFor()) {
                return false;
            }
            if ((hasOptimizeFor() && this.optimizeFor_ != fileOptions.optimizeFor_) || hasGoPackage() != fileOptions.hasGoPackage()) {
                return false;
            }
            if ((hasGoPackage() && !getGoPackage().equals(fileOptions.getGoPackage())) || hasCcGenericServices() != fileOptions.hasCcGenericServices()) {
                return false;
            }
            if ((hasCcGenericServices() && getCcGenericServices() != fileOptions.getCcGenericServices()) || hasJavaGenericServices() != fileOptions.hasJavaGenericServices()) {
                return false;
            }
            if ((hasJavaGenericServices() && getJavaGenericServices() != fileOptions.getJavaGenericServices()) || hasPyGenericServices() != fileOptions.hasPyGenericServices()) {
                return false;
            }
            if ((hasPyGenericServices() && getPyGenericServices() != fileOptions.getPyGenericServices()) || hasPhpGenericServices() != fileOptions.hasPhpGenericServices()) {
                return false;
            }
            if ((hasPhpGenericServices() && getPhpGenericServices() != fileOptions.getPhpGenericServices()) || hasDeprecated() != fileOptions.hasDeprecated()) {
                return false;
            }
            if ((hasDeprecated() && getDeprecated() != fileOptions.getDeprecated()) || hasCcEnableArenas() != fileOptions.hasCcEnableArenas()) {
                return false;
            }
            if ((hasCcEnableArenas() && getCcEnableArenas() != fileOptions.getCcEnableArenas()) || hasObjcClassPrefix() != fileOptions.hasObjcClassPrefix()) {
                return false;
            }
            if ((hasObjcClassPrefix() && !getObjcClassPrefix().equals(fileOptions.getObjcClassPrefix())) || hasCsharpNamespace() != fileOptions.hasCsharpNamespace()) {
                return false;
            }
            if ((hasCsharpNamespace() && !getCsharpNamespace().equals(fileOptions.getCsharpNamespace())) || hasSwiftPrefix() != fileOptions.hasSwiftPrefix()) {
                return false;
            }
            if ((hasSwiftPrefix() && !getSwiftPrefix().equals(fileOptions.getSwiftPrefix())) || hasPhpClassPrefix() != fileOptions.hasPhpClassPrefix()) {
                return false;
            }
            if ((hasPhpClassPrefix() && !getPhpClassPrefix().equals(fileOptions.getPhpClassPrefix())) || hasPhpNamespace() != fileOptions.hasPhpNamespace()) {
                return false;
            }
            if ((hasPhpNamespace() && !getPhpNamespace().equals(fileOptions.getPhpNamespace())) || hasPhpMetadataNamespace() != fileOptions.hasPhpMetadataNamespace()) {
                return false;
            }
            if ((!hasPhpMetadataNamespace() || getPhpMetadataNamespace().equals(fileOptions.getPhpMetadataNamespace())) && hasRubyPackage() == fileOptions.hasRubyPackage()) {
                return (!hasRubyPackage() || getRubyPackage().equals(fileOptions.getRubyPackage())) && getUninterpretedOptionList().equals(fileOptions.getUninterpretedOptionList()) && this.unknownFields.equals(fileOptions.unknownFields) && getExtensionFields().equals(fileOptions.getExtensionFields());
            }
            return false;
        }

        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        public String getCsharpNamespace() {
            Object obj = this.csharpNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.csharpNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getCsharpNamespaceBytes() {
            Object obj = this.csharpNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.csharpNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public String getGoPackage() {
            Object obj = this.goPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.goPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getGoPackageBytes() {
            Object obj = this.goPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.goPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        public String getJavaOuterClassname() {
            Object obj = this.javaOuterClassname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaOuterClassname_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getJavaOuterClassnameBytes() {
            Object obj = this.javaOuterClassname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaOuterClassname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getJavaPackage() {
            Object obj = this.javaPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getJavaPackageBytes() {
            Object obj = this.javaPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        public String getObjcClassPrefix() {
            Object obj = this.objcClassPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.objcClassPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getObjcClassPrefixBytes() {
            Object obj = this.objcClassPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.objcClassPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public OptimizeMode getOptimizeFor() {
            OptimizeMode optimizeModeValueOf = OptimizeMode.valueOf(this.optimizeFor_);
            return optimizeModeValueOf == null ? OptimizeMode.SPEED : optimizeModeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<FileOptions> getParserForType() {
            return PARSER;
        }

        public String getPhpClassPrefix() {
            Object obj = this.phpClassPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpClassPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getPhpClassPrefixBytes() {
            Object obj = this.phpClassPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpClassPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        public String getPhpMetadataNamespace() {
            Object obj = this.phpMetadataNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpMetadataNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getPhpMetadataNamespaceBytes() {
            Object obj = this.phpMetadataNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpMetadataNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getPhpNamespace() {
            Object obj = this.phpNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getPhpNamespaceBytes() {
            Object obj = this.phpNamespace_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phpNamespace_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        public String getRubyPackage() {
            Object obj = this.rubyPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.rubyPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getRubyPackageBytes() {
            Object obj = this.rubyPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.rubyPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.javaPackage_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.javaOuterClassname_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.l(9, this.optimizeFor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.e(10, this.javaMultipleFiles_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.goPackage_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.e(16, this.ccGenericServices_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.e(17, this.javaGenericServices_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.e(18, this.pyGenericServices_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.e(20, this.javaGenerateEqualsAndHash_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeStringSize += CodedOutputStream.e(23, this.deprecated_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.e(27, this.javaStringCheckUtf8_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeStringSize += CodedOutputStream.e(31, this.ccEnableArenas_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(36, this.objcClassPrefix_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(37, this.csharpNamespace_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(39, this.swiftPrefix_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(40, this.phpClassPrefix_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(41, this.phpNamespace_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeStringSize += CodedOutputStream.e(42, this.phpGenericServices_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(44, this.phpMetadataNamespace_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(45, this.rubyPackage_);
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iComputeStringSize + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public String getSwiftPrefix() {
            Object obj = this.swiftPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.swiftPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getSwiftPrefixBytes() {
            Object obj = this.swiftPrefix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.swiftPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasPhpGenericServices() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasRubyPackage() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasJavaPackage()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getJavaPackage().hashCode();
            }
            if (hasJavaOuterClassname()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getJavaOuterClassname().hashCode();
            }
            if (hasJavaMultipleFiles()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + d0.d(getJavaMultipleFiles());
            }
            if (hasJavaGenerateEqualsAndHash()) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + d0.d(getJavaGenerateEqualsAndHash());
            }
            if (hasJavaStringCheckUtf8()) {
                iHashCode = (((iHashCode * 37) + 27) * 53) + d0.d(getJavaStringCheckUtf8());
            }
            if (hasOptimizeFor()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + this.optimizeFor_;
            }
            if (hasGoPackage()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getGoPackage().hashCode();
            }
            if (hasCcGenericServices()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + d0.d(getCcGenericServices());
            }
            if (hasJavaGenericServices()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + d0.d(getJavaGenericServices());
            }
            if (hasPyGenericServices()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + d0.d(getPyGenericServices());
            }
            if (hasPhpGenericServices()) {
                iHashCode = (((iHashCode * 37) + 42) * 53) + d0.d(getPhpGenericServices());
            }
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 23) * 53) + d0.d(getDeprecated());
            }
            if (hasCcEnableArenas()) {
                iHashCode = (((iHashCode * 37) + 31) * 53) + d0.d(getCcEnableArenas());
            }
            if (hasObjcClassPrefix()) {
                iHashCode = (((iHashCode * 37) + 36) * 53) + getObjcClassPrefix().hashCode();
            }
            if (hasCsharpNamespace()) {
                iHashCode = (((iHashCode * 37) + 37) * 53) + getCsharpNamespace().hashCode();
            }
            if (hasSwiftPrefix()) {
                iHashCode = (((iHashCode * 37) + 39) * 53) + getSwiftPrefix().hashCode();
            }
            if (hasPhpClassPrefix()) {
                iHashCode = (((iHashCode * 37) + 40) * 53) + getPhpClassPrefix().hashCode();
            }
            if (hasPhpNamespace()) {
                iHashCode = (((iHashCode * 37) + 41) * 53) + getPhpNamespace().hashCode();
            }
            if (hasPhpMetadataNamespace()) {
                iHashCode = (((iHashCode * 37) + 44) * 53) + getPhpMetadataNamespace().hashCode();
            }
            if (hasRubyPackage()) {
                iHashCode = (((iHashCode * 37) + 45) * 53) + getRubyPackage().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.B.d(FileOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new FileOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.javaPackage_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.javaOuterClassname_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.u0(9, this.optimizeFor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.m0(10, this.javaMultipleFiles_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.goPackage_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.m0(16, this.ccGenericServices_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.m0(17, this.javaGenericServices_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.m0(18, this.pyGenericServices_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.m0(20, this.javaGenerateEqualsAndHash_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.m0(23, this.deprecated_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.m0(27, this.javaStringCheckUtf8_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.m0(31, this.ccEnableArenas_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 36, this.objcClassPrefix_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 37, this.csharpNamespace_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 39, this.swiftPrefix_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 40, this.phpClassPrefix_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 41, this.phpNamespace_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.m0(42, this.phpGenericServices_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 44, this.phpMetadataNamespace_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 45, this.rubyPackage_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<FileOptions, b> implements k {
            public List<UninterpretedOption> A;
            public c1<UninterpretedOption, UninterpretedOption.b, u> B;
            public int f;
            public Object g;
            public Object h;
            public boolean i;
            public boolean j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f9476k;
            public int l;
            public Object m;
            public boolean n;
            public boolean o;
            public boolean p;
            public boolean q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public boolean f9477r;
            public boolean s;
            public Object t;
            public Object u;
            public Object v;
            public Object w;
            public Object x;
            public Object y;
            public Object z;

            private void F() {
                if ((this.f & EventRecurrence.TH) == 0) {
                    this.A = new ArrayList(this.A);
                    this.f |= EventRecurrence.TH;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.B == null) {
                    this.B = new c1<>(this.A, (this.f & EventRecurrence.TH) != 0, g(), isClean());
                    this.A = null;
                }
                return this.B;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = "";
                int i = this.f;
                this.h = "";
                this.i = false;
                this.j = false;
                this.f9476k = false;
                this.l = 1;
                this.m = "";
                this.n = false;
                this.o = false;
                this.p = false;
                this.q = false;
                this.f9477r = false;
                this.s = true;
                this.t = "";
                this.u = "";
                this.v = "";
                this.w = "";
                this.x = "";
                this.y = "";
                this.z = "";
                this.f = (-1048576) & i;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.B;
                if (c1Var == null) {
                    this.A = Collections.emptyList();
                    this.f &= -1048577;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public FileOptions getDefaultInstanceForType() {
                return FileOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                FileOptions fileOptions = null;
                try {
                    try {
                        FileOptions partialFrom = FileOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        FileOptions fileOptions2 = (FileOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            fileOptions = fileOptions2;
                            if (fileOptions != null) {
                                J(fileOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOptions != null) {
                        J(fileOptions);
                    }
                    throw th;
                }
            }

            public b J(FileOptions fileOptions) {
                if (fileOptions == FileOptions.getDefaultInstance()) {
                    return this;
                }
                if (fileOptions.hasJavaPackage()) {
                    this.f |= 1;
                    this.g = fileOptions.javaPackage_;
                    onChanged();
                }
                if (fileOptions.hasJavaOuterClassname()) {
                    this.f |= 2;
                    this.h = fileOptions.javaOuterClassname_;
                    onChanged();
                }
                if (fileOptions.hasJavaMultipleFiles()) {
                    T(fileOptions.getJavaMultipleFiles());
                }
                if (fileOptions.hasJavaGenerateEqualsAndHash()) {
                    R(fileOptions.getJavaGenerateEqualsAndHash());
                }
                if (fileOptions.hasJavaStringCheckUtf8()) {
                    U(fileOptions.getJavaStringCheckUtf8());
                }
                if (fileOptions.hasOptimizeFor()) {
                    V(fileOptions.getOptimizeFor());
                }
                if (fileOptions.hasGoPackage()) {
                    this.f |= 64;
                    this.m = fileOptions.goPackage_;
                    onChanged();
                }
                if (fileOptions.hasCcGenericServices()) {
                    N(fileOptions.getCcGenericServices());
                }
                if (fileOptions.hasJavaGenericServices()) {
                    S(fileOptions.getJavaGenericServices());
                }
                if (fileOptions.hasPyGenericServices()) {
                    X(fileOptions.getPyGenericServices());
                }
                if (fileOptions.hasPhpGenericServices()) {
                    W(fileOptions.getPhpGenericServices());
                }
                if (fileOptions.hasDeprecated()) {
                    O(fileOptions.getDeprecated());
                }
                if (fileOptions.hasCcEnableArenas()) {
                    M(fileOptions.getCcEnableArenas());
                }
                if (fileOptions.hasObjcClassPrefix()) {
                    this.f |= 8192;
                    this.t = fileOptions.objcClassPrefix_;
                    onChanged();
                }
                if (fileOptions.hasCsharpNamespace()) {
                    this.f |= 16384;
                    this.u = fileOptions.csharpNamespace_;
                    onChanged();
                }
                if (fileOptions.hasSwiftPrefix()) {
                    this.f |= 32768;
                    this.v = fileOptions.swiftPrefix_;
                    onChanged();
                }
                if (fileOptions.hasPhpClassPrefix()) {
                    this.f |= 65536;
                    this.w = fileOptions.phpClassPrefix_;
                    onChanged();
                }
                if (fileOptions.hasPhpNamespace()) {
                    this.f |= 131072;
                    this.x = fileOptions.phpNamespace_;
                    onChanged();
                }
                if (fileOptions.hasPhpMetadataNamespace()) {
                    this.f |= 262144;
                    this.y = fileOptions.phpMetadataNamespace_;
                    onChanged();
                }
                if (fileOptions.hasRubyPackage()) {
                    this.f |= 524288;
                    this.z = fileOptions.rubyPackage_;
                    onChanged();
                }
                if (this.B == null) {
                    if (!fileOptions.uninterpretedOption_.isEmpty()) {
                        if (this.A.isEmpty()) {
                            this.A = fileOptions.uninterpretedOption_;
                            this.f &= -1048577;
                        } else {
                            F();
                            this.A.addAll(fileOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!fileOptions.uninterpretedOption_.isEmpty()) {
                    if (this.B.j()) {
                        this.B.f();
                        this.B = null;
                        this.A = fileOptions.uninterpretedOption_;
                        this.f = (-1048577) & this.f;
                        this.B = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.B.b(fileOptions.uninterpretedOption_);
                    }
                }
                u(fileOptions);
                mo145mergeUnknownFields(fileOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof FileOptions) {
                    return J((FileOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(boolean z) {
                this.f |= 4096;
                this.s = z;
                onChanged();
                return this;
            }

            public b N(boolean z) {
                this.f |= 128;
                this.n = z;
                onChanged();
                return this;
            }

            public b O(boolean z) {
                this.f |= 2048;
                this.f9477r = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Deprecated
            public b R(boolean z) {
                this.f |= 8;
                this.j = z;
                onChanged();
                return this;
            }

            public b S(boolean z) {
                this.f |= 256;
                this.o = z;
                onChanged();
                return this;
            }

            public b T(boolean z) {
                this.f |= 4;
                this.i = z;
                onChanged();
                return this;
            }

            public b U(boolean z) {
                this.f |= 16;
                this.f9476k = z;
                onChanged();
                return this;
            }

            public b V(OptimizeMode optimizeMode) {
                optimizeMode.getClass();
                this.f |= 32;
                this.l = optimizeMode.getNumber();
                onChanged();
                return this;
            }

            public b W(boolean z) {
                this.f |= 1024;
                this.q = z;
                onChanged();
                return this;
            }

            public b X(boolean z) {
                this.f |= 512;
                this.p = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.A;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.B.d(FileOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public FileOptions build() {
                FileOptions fileOptionsBuildPartial = buildPartial();
                if (fileOptionsBuildPartial.isInitialized()) {
                    return fileOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fileOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public FileOptions buildPartial() {
                FileOptions fileOptions = new FileOptions(this);
                int i = this.f;
                int i2 = (i & 1) != 0 ? 1 : 0;
                fileOptions.javaPackage_ = this.g;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                fileOptions.javaOuterClassname_ = this.h;
                if ((i & 4) != 0) {
                    fileOptions.javaMultipleFiles_ = this.i;
                    i2 |= 4;
                }
                if ((i & 8) != 0) {
                    fileOptions.javaGenerateEqualsAndHash_ = this.j;
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    fileOptions.javaStringCheckUtf8_ = this.f9476k;
                    i2 |= 16;
                }
                if ((i & 32) != 0) {
                    i2 |= 32;
                }
                fileOptions.optimizeFor_ = this.l;
                if ((i & 64) != 0) {
                    i2 |= 64;
                }
                fileOptions.goPackage_ = this.m;
                if ((i & 128) != 0) {
                    fileOptions.ccGenericServices_ = this.n;
                    i2 |= 128;
                }
                if ((i & 256) != 0) {
                    fileOptions.javaGenericServices_ = this.o;
                    i2 |= 256;
                }
                if ((i & 512) != 0) {
                    fileOptions.pyGenericServices_ = this.p;
                    i2 |= 512;
                }
                if ((i & 1024) != 0) {
                    fileOptions.phpGenericServices_ = this.q;
                    i2 |= 1024;
                }
                if ((i & 2048) != 0) {
                    fileOptions.deprecated_ = this.f9477r;
                    i2 |= 2048;
                }
                if ((i & 4096) != 0) {
                    i2 |= 4096;
                }
                fileOptions.ccEnableArenas_ = this.s;
                if ((i & 8192) != 0) {
                    i2 |= 8192;
                }
                fileOptions.objcClassPrefix_ = this.t;
                if ((i & 16384) != 0) {
                    i2 |= 16384;
                }
                fileOptions.csharpNamespace_ = this.u;
                if ((i & 32768) != 0) {
                    i2 |= 32768;
                }
                fileOptions.swiftPrefix_ = this.v;
                if ((i & 65536) != 0) {
                    i2 |= 65536;
                }
                fileOptions.phpClassPrefix_ = this.w;
                if ((i & 131072) != 0) {
                    i2 |= 131072;
                }
                fileOptions.phpNamespace_ = this.x;
                if ((i & 262144) != 0) {
                    i2 |= 262144;
                }
                fileOptions.phpMetadataNamespace_ = this.y;
                if ((i & 524288) != 0) {
                    i2 |= 524288;
                }
                fileOptions.rubyPackage_ = this.z;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.B;
                if (c1Var == null) {
                    if ((this.f & EventRecurrence.TH) != 0) {
                        this.A = Collections.unmodifiableList(this.A);
                        this.f &= -1048577;
                    }
                    fileOptions.uninterpretedOption_ = this.A;
                } else {
                    fileOptions.uninterpretedOption_ = c1Var.d();
                }
                fileOptions.bitField0_ = i2;
                onBuilt();
                return fileOptions;
            }

            public b() {
                this.g = "";
                this.h = "";
                this.l = 1;
                this.m = "";
                this.s = true;
                this.t = "";
                this.u = "";
                this.v = "";
                this.w = "";
                this.x = "";
                this.y = "";
                this.z = "";
                this.A = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.g = "";
                this.h = "";
                this.l = 1;
                this.m = "";
                this.s = true;
                this.t = "";
                this.u = "";
                this.v = "";
                this.w = "";
                this.x = "";
                this.y = "";
                this.z = "";
                this.A = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(FileOptions fileOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(fileOptions);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private FileOptions(GeneratedMessageV3.d<FileOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FileOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static FileOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public FileOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static FileOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private FileOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static FileOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static FileOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static FileOptions parseFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (FileOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static FileOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (FileOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static FileOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (FileOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }

        private FileOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        switch (iJ) {
                            case 0:
                                break;
                            case 10:
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.javaPackage_ = byteStringQ;
                                continue;
                            case 66:
                                ByteString byteStringQ2 = jVar.q();
                                this.bitField0_ |= 2;
                                this.javaOuterClassname_ = byteStringQ2;
                                continue;
                            case 72:
                                int iS = jVar.s();
                                if (OptimizeMode.valueOf(iS) == null) {
                                    bVarG.s(9, iS);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.optimizeFor_ = iS;
                                    continue;
                                }
                                break;
                            case 80:
                                this.bitField0_ |= 4;
                                this.javaMultipleFiles_ = jVar.p();
                                continue;
                            case 90:
                                ByteString byteStringQ3 = jVar.q();
                                this.bitField0_ |= 64;
                                this.goPackage_ = byteStringQ3;
                                continue;
                            case 128:
                                this.bitField0_ |= 128;
                                this.ccGenericServices_ = jVar.p();
                                continue;
                            case 136:
                                this.bitField0_ |= 256;
                                this.javaGenericServices_ = jVar.p();
                                continue;
                            case 144:
                                this.bitField0_ |= 512;
                                this.pyGenericServices_ = jVar.p();
                                continue;
                            case 160:
                                this.bitField0_ |= 8;
                                this.javaGenerateEqualsAndHash_ = jVar.p();
                                continue;
                            case SportReportBaseParser.ReportType.exitTime /* 184 */:
                                this.bitField0_ |= 2048;
                                this.deprecated_ = jVar.p();
                                continue;
                            case 216:
                                this.bitField0_ |= 16;
                                this.javaStringCheckUtf8_ = jVar.p();
                                continue;
                            case 248:
                                this.bitField0_ |= 4096;
                                this.ccEnableArenas_ = jVar.p();
                                continue;
                            case 290:
                                ByteString byteStringQ4 = jVar.q();
                                this.bitField0_ |= 8192;
                                this.objcClassPrefix_ = byteStringQ4;
                                continue;
                            case 298:
                                ByteString byteStringQ5 = jVar.q();
                                this.bitField0_ |= 16384;
                                this.csharpNamespace_ = byteStringQ5;
                                continue;
                            case 314:
                                ByteString byteStringQ6 = jVar.q();
                                this.bitField0_ |= 32768;
                                this.swiftPrefix_ = byteStringQ6;
                                continue;
                            case 322:
                                ByteString byteStringQ7 = jVar.q();
                                this.bitField0_ |= 65536;
                                this.phpClassPrefix_ = byteStringQ7;
                                continue;
                            case 330:
                                ByteString byteStringQ8 = jVar.q();
                                this.bitField0_ |= 131072;
                                this.phpNamespace_ = byteStringQ8;
                                continue;
                            case 336:
                                this.bitField0_ |= 1024;
                                this.phpGenericServices_ = jVar.p();
                                continue;
                            case 354:
                                ByteString byteStringQ9 = jVar.q();
                                this.bitField0_ |= 262144;
                                this.phpMetadataNamespace_ = byteStringQ9;
                                continue;
                            case 362:
                                ByteString byteStringQ10 = jVar.q();
                                this.bitField0_ |= 524288;
                                this.rubyPackage_ = byteStringQ10;
                                continue;
                            case 7994:
                                if ((c & 0) == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = 0;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                                continue;
                            default:
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 0) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 0) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class GeneratedCodeInfo extends GeneratedMessageV3 implements l {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final GeneratedCodeInfo DEFAULT_INSTANCE = new GeneratedCodeInfo();

        @Deprecated
        public static final vkh<GeneratedCodeInfo> PARSER = new a();
        private static final long serialVersionUID = 0;
        private List<Annotation> annotation_;
        private byte memoizedIsInitialized;

        public static final class Annotation extends GeneratedMessageV3 implements b {
            public static final int BEGIN_FIELD_NUMBER = 3;
            public static final int END_FIELD_NUMBER = 4;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int begin_;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private int pathMemoizedSerializedSize;
            private d0.g path_;
            private volatile Object sourceFile_;
            private static final Annotation DEFAULT_INSTANCE = new Annotation();

            @Deprecated
            public static final vkh<Annotation> PARSER = new a();

            public static class a extends com.google.protobuf.c<Annotation> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Annotation parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                    return new Annotation(jVar, tVar);
                }
            }

            public static Annotation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return DescriptorProtos.a0;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<Annotation> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Annotation)) {
                    return super.equals(obj);
                }
                Annotation annotation = (Annotation) obj;
                if (!getPathList().equals(annotation.getPathList()) || hasSourceFile() != annotation.hasSourceFile()) {
                    return false;
                }
                if ((hasSourceFile() && !getSourceFile().equals(annotation.getSourceFile())) || hasBegin() != annotation.hasBegin()) {
                    return false;
                }
                if ((!hasBegin() || getBegin() == annotation.getBegin()) && hasEnd() == annotation.hasEnd()) {
                    return (!hasEnd() || getEnd() == annotation.getEnd()) && this.unknownFields.equals(annotation.unknownFields);
                }
                return false;
            }

            public int getBegin() {
                return this.begin_;
            }

            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<Annotation> getParserForType() {
                return PARSER;
            }

            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            public int getPathCount() {
                return this.path_.size();
            }

            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iY = 0;
                for (int i2 = 0; i2 < this.path_.size(); i2++) {
                    iY += CodedOutputStream.y(this.path_.getInt(i2));
                }
                int iY2 = !getPathList().isEmpty() ? iY + 1 + CodedOutputStream.y(iY) : iY;
                this.pathMemoizedSerializedSize = iY;
                if ((this.bitField0_ & 1) != 0) {
                    iY2 += GeneratedMessageV3.computeStringSize(2, this.sourceFile_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    iY2 += CodedOutputStream.x(3, this.begin_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iY2 += CodedOutputStream.x(4, this.end_);
                }
                int serializedSize = iY2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public String getSourceFile() {
                Object obj = this.sourceFile_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sourceFile_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getSourceFileBytes() {
                Object obj = this.sourceFile_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFile_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getPathCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getPathList().hashCode();
                }
                if (hasSourceFile()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSourceFile().hashCode();
                }
                if (hasBegin()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getBegin();
                }
                if (hasEnd()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getEnd();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return DescriptorProtos.b0.d(Annotation.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new Annotation();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (getPathList().size() > 0) {
                    codedOutputStream.c1(10);
                    codedOutputStream.c1(this.pathMemoizedSerializedSize);
                }
                for (int i = 0; i < this.path_.size(); i++) {
                    codedOutputStream.H0(this.path_.getInt(i));
                }
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.sourceFile_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.G0(3, this.begin_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.G0(4, this.end_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements b {
                public int e;
                public d0.g f;
                public Object g;
                public int h;
                public int i;

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                public b B(int i) {
                    this.e |= 4;
                    this.h = i;
                    onChanged();
                    return this;
                }

                public b C(int i) {
                    this.e |= 8;
                    this.i = i;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return DescriptorProtos.a0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return DescriptorProtos.b0.d(Annotation.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public Annotation build() {
                    Annotation annotationBuildPartial = buildPartial();
                    if (annotationBuildPartial.isInitialized()) {
                        return annotationBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) annotationBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Annotation buildPartial() {
                    Annotation annotation = new Annotation(this);
                    int i = this.e;
                    if ((i & 1) != 0) {
                        this.f.b();
                        this.e &= -2;
                    }
                    annotation.path_ = this.f;
                    int i2 = (i & 2) != 0 ? 1 : 0;
                    annotation.sourceFile_ = this.g;
                    if ((i & 4) != 0) {
                        annotation.begin_ = this.h;
                        i2 |= 2;
                    }
                    if ((i & 8) != 0) {
                        annotation.end_ = this.i;
                        i2 |= 4;
                    }
                    annotation.bitField0_ = i2;
                    onBuilt();
                    return annotation;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = GeneratedMessageV3.emptyIntList();
                    int i = this.e;
                    this.g = "";
                    this.h = 0;
                    this.i = 0;
                    this.e = i & (-16);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                public final void v() {
                    if ((this.e & 1) == 0) {
                        this.f = GeneratedMessageV3.mutableCopy(this.f);
                        this.e |= 1;
                    }
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public Annotation getDefaultInstanceForType() {
                    return Annotation.getDefaultInstance();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                    Annotation annotation = null;
                    try {
                        try {
                            Annotation partialFrom = Annotation.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                y(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Annotation annotation2 = (Annotation) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                annotation = annotation2;
                                if (annotation != null) {
                                    y(annotation);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (annotation != null) {
                            y(annotation);
                        }
                        throw th;
                    }
                }

                public b y(Annotation annotation) {
                    if (annotation == Annotation.getDefaultInstance()) {
                        return this;
                    }
                    if (!annotation.path_.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = annotation.path_;
                            this.e &= -2;
                        } else {
                            v();
                            this.f.addAll(annotation.path_);
                        }
                        onChanged();
                    }
                    if (annotation.hasSourceFile()) {
                        this.e |= 2;
                        this.g = annotation.sourceFile_;
                        onChanged();
                    }
                    if (annotation.hasBegin()) {
                        B(annotation.getBegin());
                    }
                    if (annotation.hasEnd()) {
                        C(annotation.getEnd());
                    }
                    mo145mergeUnknownFields(annotation.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof Annotation) {
                        return y((Annotation) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                public b() {
                    this.f = GeneratedMessageV3.emptyIntList();
                    this.g = "";
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    this.f = GeneratedMessageV3.emptyIntList();
                    this.g = "";
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(Annotation annotation) {
                return DEFAULT_INSTANCE.toBuilder().y(annotation);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            private Annotation(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.pathMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (Annotation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static Annotation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public Annotation getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().y(this);
            }

            public static Annotation parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            public static Annotation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            private Annotation() {
                this.pathMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.path_ = GeneratedMessageV3.emptyIntList();
                this.sourceFile_ = "";
            }

            public static Annotation parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            public static Annotation parseFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Annotation parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (Annotation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            private Annotation(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int iJ = jVar.J();
                                if (iJ != 0) {
                                    if (iJ == 8) {
                                        if (!(z2 & true)) {
                                            this.path_ = GeneratedMessageV3.newIntList();
                                            z2 = true;
                                        }
                                        this.path_.Q(jVar.x());
                                    } else if (iJ == 10) {
                                        int iO = jVar.o(jVar.B());
                                        if (!(z2 & true) && jVar.d() > 0) {
                                            this.path_ = GeneratedMessageV3.newIntList();
                                            z2 = true;
                                        }
                                        while (jVar.d() > 0) {
                                            this.path_.Q(jVar.x());
                                        }
                                        jVar.n(iO);
                                    } else if (iJ == 18) {
                                        ByteString byteStringQ = jVar.q();
                                        this.bitField0_ |= 1;
                                        this.sourceFile_ = byteStringQ;
                                    } else if (iJ == 24) {
                                        this.bitField0_ |= 2;
                                        this.begin_ = jVar.x();
                                    } else if (iJ != 32) {
                                        if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                        }
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.end_ = jVar.x();
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.path_.b();
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.path_.b();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Annotation parseFrom(com.google.protobuf.j jVar) throws IOException {
                return (Annotation) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static Annotation parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
                return (Annotation) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }
        }

        public static class a extends com.google.protobuf.c<GeneratedCodeInfo> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeneratedCodeInfo parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new GeneratedCodeInfo(jVar, tVar);
            }
        }

        public interface b extends s0 {
        }

        public static GeneratedCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.Y;
        }

        public static c newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<GeneratedCodeInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GeneratedCodeInfo)) {
                return super.equals(obj);
            }
            GeneratedCodeInfo generatedCodeInfo = (GeneratedCodeInfo) obj;
            return getAnnotationList().equals(generatedCodeInfo.getAnnotationList()) && this.unknownFields.equals(generatedCodeInfo.unknownFields);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public b getAnnotationOrBuilder(int i) {
            return this.annotation_.get(i);
        }

        public List<? extends b> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<GeneratedCodeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = 0;
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                iG += CodedOutputStream.G(1, this.annotation_.get(i2));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getAnnotationCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAnnotationList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.Z.d(GeneratedCodeInfo.class, c.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new GeneratedCodeInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.K0(1, this.annotation_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class c extends GeneratedMessageV3.b<c> implements l {
            public int e;
            public List<Annotation> f;
            public c1<Annotation, Annotation.b, b> g;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    w();
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public c mergeFrom(p0 p0Var) {
                if (p0Var instanceof GeneratedCodeInfo) {
                    return z((GeneratedCodeInfo) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public final c mo145mergeUnknownFields(r1 r1Var) {
                return (c) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public c setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (c) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public final c setUnknownFields(r1 r1Var) {
                return (c) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.Y;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.Z.d(GeneratedCodeInfo.class, c.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public c addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (c) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public GeneratedCodeInfo build() {
                GeneratedCodeInfo generatedCodeInfoBuildPartial = buildPartial();
                if (generatedCodeInfoBuildPartial.isInitialized()) {
                    return generatedCodeInfoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) generatedCodeInfoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public GeneratedCodeInfo buildPartial() {
                GeneratedCodeInfo generatedCodeInfo = new GeneratedCodeInfo(this);
                int i = this.e;
                c1<Annotation, Annotation.b, b> c1Var = this.g;
                if (c1Var == null) {
                    if ((i & 1) != 0) {
                        this.f = Collections.unmodifiableList(this.f);
                        this.e &= -2;
                    }
                    generatedCodeInfo.annotation_ = this.f;
                } else {
                    generatedCodeInfo.annotation_ = c1Var.d();
                }
                onBuilt();
                return generatedCodeInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public c mo142clear() {
                super.mo142clear();
                c1<Annotation, Annotation.b, b> c1Var = this.g;
                if (c1Var == null) {
                    this.f = Collections.emptyList();
                    this.e &= -2;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public c clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (c) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public c clearOneof(Descriptors.h hVar) {
                return (c) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public c mo144clone() {
                return (c) super.mo144clone();
            }

            public final void v() {
                if ((this.e & 1) == 0) {
                    this.f = new ArrayList(this.f);
                    this.e |= 1;
                }
            }

            public final c1<Annotation, Annotation.b, b> w() {
                if (this.g == null) {
                    this.g = new c1<>(this.f, (this.e & 1) != 0, g(), isClean());
                    this.f = null;
                }
                return this.g;
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public GeneratedCodeInfo getDefaultInstanceForType() {
                return GeneratedCodeInfo.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public c mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                GeneratedCodeInfo generatedCodeInfo = null;
                try {
                    try {
                        GeneratedCodeInfo partialFrom = GeneratedCodeInfo.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        GeneratedCodeInfo generatedCodeInfo2 = (GeneratedCodeInfo) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            generatedCodeInfo = generatedCodeInfo2;
                            if (generatedCodeInfo != null) {
                                z(generatedCodeInfo);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (generatedCodeInfo != null) {
                        z(generatedCodeInfo);
                    }
                    throw th;
                }
            }

            public c z(GeneratedCodeInfo generatedCodeInfo) {
                if (generatedCodeInfo == GeneratedCodeInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.g == null) {
                    if (!generatedCodeInfo.annotation_.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = generatedCodeInfo.annotation_;
                            this.e &= -2;
                        } else {
                            v();
                            this.f.addAll(generatedCodeInfo.annotation_);
                        }
                        onChanged();
                    }
                } else if (!generatedCodeInfo.annotation_.isEmpty()) {
                    if (this.g.j()) {
                        this.g.f();
                        this.g = null;
                        this.f = generatedCodeInfo.annotation_;
                        this.e &= -2;
                        this.g = GeneratedMessageV3.alwaysUseFieldBuilders ? w() : null;
                    } else {
                        this.g.b(generatedCodeInfo.annotation_);
                    }
                }
                mo145mergeUnknownFields(generatedCodeInfo.unknownFields);
                onChanged();
                return this;
            }

            public c() {
                this.f = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public c(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static c newBuilder(GeneratedCodeInfo generatedCodeInfo) {
            return DEFAULT_INSTANCE.toBuilder().z(generatedCodeInfo);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private GeneratedCodeInfo(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public GeneratedCodeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public c toBuilder() {
            return this == DEFAULT_INSTANCE ? new c() : new c().z(this);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public c newBuilderForType() {
            return newBuilder();
        }

        private GeneratedCodeInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.annotation_ = Collections.emptyList();
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public c newBuilderForType(GeneratedMessageV3.c cVar) {
            return new c(cVar);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private GeneratedCodeInfo(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ != 10) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.annotation_ = new ArrayList();
                                    z2 = true;
                                }
                                this.annotation_.add((Annotation) jVar.z(Annotation.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static GeneratedCodeInfo parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static GeneratedCodeInfo parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class MessageOptions extends GeneratedMessageV3.ExtendableMessage<MessageOptions> implements m {
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private byte memoizedIsInitialized;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private List<UninterpretedOption> uninterpretedOption_;
        private static final MessageOptions DEFAULT_INSTANCE = new MessageOptions();

        @Deprecated
        public static final vkh<MessageOptions> PARSER = new a();

        public static class a extends com.google.protobuf.c<MessageOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MessageOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new MessageOptions(jVar, tVar);
            }
        }

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.C;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<MessageOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MessageOptions)) {
                return super.equals(obj);
            }
            MessageOptions messageOptions = (MessageOptions) obj;
            if (hasMessageSetWireFormat() != messageOptions.hasMessageSetWireFormat()) {
                return false;
            }
            if ((hasMessageSetWireFormat() && getMessageSetWireFormat() != messageOptions.getMessageSetWireFormat()) || hasNoStandardDescriptorAccessor() != messageOptions.hasNoStandardDescriptorAccessor()) {
                return false;
            }
            if ((hasNoStandardDescriptorAccessor() && getNoStandardDescriptorAccessor() != messageOptions.getNoStandardDescriptorAccessor()) || hasDeprecated() != messageOptions.hasDeprecated()) {
                return false;
            }
            if ((!hasDeprecated() || getDeprecated() == messageOptions.getDeprecated()) && hasMapEntry() == messageOptions.hasMapEntry()) {
                return (!hasMapEntry() || getMapEntry() == messageOptions.getMapEntry()) && getUninterpretedOptionList().equals(messageOptions.getUninterpretedOptionList()) && this.unknownFields.equals(messageOptions.unknownFields) && getExtensionFields().equals(messageOptions.getExtensionFields());
            }
            return false;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<MessageOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iE = (this.bitField0_ & 1) != 0 ? CodedOutputStream.e(1, this.messageSetWireFormat_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iE += CodedOutputStream.e(2, this.noStandardDescriptorAccessor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iE += CodedOutputStream.e(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iE += CodedOutputStream.e(7, this.mapEntry_);
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iE += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iE + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMessageSetWireFormat()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + d0.d(getMessageSetWireFormat());
            }
            if (hasNoStandardDescriptorAccessor()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + d0.d(getNoStandardDescriptorAccessor());
            }
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + d0.d(getDeprecated());
            }
            if (hasMapEntry()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + d0.d(getMapEntry());
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.D.d(MessageOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new MessageOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.m0(1, this.messageSetWireFormat_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.m0(2, this.noStandardDescriptorAccessor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.m0(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.m0(7, this.mapEntry_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<MessageOptions, b> implements m {
            public int f;
            public boolean g;
            public boolean h;
            public boolean i;
            public boolean j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public List<UninterpretedOption> f9478k;
            public c1<UninterpretedOption, UninterpretedOption.b, u> l;

            private void F() {
                if ((this.f & 16) == 0) {
                    this.f9478k = new ArrayList(this.f9478k);
                    this.f |= 16;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.l == null) {
                    this.l = new c1<>(this.f9478k, (this.f & 16) != 0, g(), isClean());
                    this.f9478k = null;
                }
                return this.l;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = false;
                int i = this.f;
                this.h = false;
                this.i = false;
                this.j = false;
                this.f = i & (-16);
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.l;
                if (c1Var == null) {
                    this.f9478k = Collections.emptyList();
                    this.f &= -17;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public MessageOptions getDefaultInstanceForType() {
                return MessageOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                MessageOptions messageOptions = null;
                try {
                    try {
                        MessageOptions partialFrom = MessageOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MessageOptions messageOptions2 = (MessageOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            messageOptions = messageOptions2;
                            if (messageOptions != null) {
                                J(messageOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (messageOptions != null) {
                        J(messageOptions);
                    }
                    throw th;
                }
            }

            public b J(MessageOptions messageOptions) {
                if (messageOptions == MessageOptions.getDefaultInstance()) {
                    return this;
                }
                if (messageOptions.hasMessageSetWireFormat()) {
                    Q(messageOptions.getMessageSetWireFormat());
                }
                if (messageOptions.hasNoStandardDescriptorAccessor()) {
                    R(messageOptions.getNoStandardDescriptorAccessor());
                }
                if (messageOptions.hasDeprecated()) {
                    M(messageOptions.getDeprecated());
                }
                if (messageOptions.hasMapEntry()) {
                    O(messageOptions.getMapEntry());
                }
                if (this.l == null) {
                    if (!messageOptions.uninterpretedOption_.isEmpty()) {
                        if (this.f9478k.isEmpty()) {
                            this.f9478k = messageOptions.uninterpretedOption_;
                            this.f &= -17;
                        } else {
                            F();
                            this.f9478k.addAll(messageOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!messageOptions.uninterpretedOption_.isEmpty()) {
                    if (this.l.j()) {
                        this.l.f();
                        this.l = null;
                        this.f9478k = messageOptions.uninterpretedOption_;
                        this.f &= -17;
                        this.l = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.l.b(messageOptions.uninterpretedOption_);
                    }
                }
                u(messageOptions);
                mo145mergeUnknownFields(messageOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof MessageOptions) {
                    return J((MessageOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(boolean z) {
                this.f |= 4;
                this.i = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b O(boolean z) {
                this.f |= 8;
                this.j = z;
                onChanged();
                return this;
            }

            public b Q(boolean z) {
                this.f |= 1;
                this.g = z;
                onChanged();
                return this;
            }

            public b R(boolean z) {
                this.f |= 2;
                this.h = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.C;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.D.d(MessageOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public MessageOptions build() {
                MessageOptions messageOptionsBuildPartial = buildPartial();
                if (messageOptionsBuildPartial.isInitialized()) {
                    return messageOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) messageOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public MessageOptions buildPartial() {
                int i;
                MessageOptions messageOptions = new MessageOptions(this);
                int i2 = this.f;
                if ((i2 & 1) != 0) {
                    messageOptions.messageSetWireFormat_ = this.g;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    messageOptions.noStandardDescriptorAccessor_ = this.h;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    messageOptions.deprecated_ = this.i;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    messageOptions.mapEntry_ = this.j;
                    i |= 8;
                }
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.l;
                if (c1Var == null) {
                    if ((this.f & 16) != 0) {
                        this.f9478k = Collections.unmodifiableList(this.f9478k);
                        this.f &= -17;
                    }
                    messageOptions.uninterpretedOption_ = this.f9478k;
                } else {
                    messageOptions.uninterpretedOption_ = c1Var.d();
                }
                messageOptions.bitField0_ = i;
                onBuilt();
                return messageOptions;
            }

            public b() {
                this.f9478k = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f9478k = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(MessageOptions messageOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(messageOptions);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private MessageOptions(GeneratedMessageV3.d<MessageOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (MessageOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static MessageOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public MessageOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static MessageOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private MessageOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static MessageOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static MessageOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static MessageOptions parseFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MessageOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.bitField0_ |= 1;
                                this.messageSetWireFormat_ = jVar.p();
                            } else if (iJ == 16) {
                                this.bitField0_ |= 2;
                                this.noStandardDescriptorAccessor_ = jVar.p();
                            } else if (iJ == 24) {
                                this.bitField0_ |= 4;
                                this.deprecated_ = jVar.p();
                            } else if (iJ == 56) {
                                this.bitField0_ |= 8;
                                this.mapEntry_ = jVar.p();
                            } else if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c & 16) == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = 16;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 16) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 16) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static MessageOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (MessageOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static MessageOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (MessageOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static MessageOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (MessageOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class MethodDescriptorProto extends GeneratedMessageV3 implements n {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean clientStreaming_;
        private volatile Object inputType_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private MethodOptions options_;
        private volatile Object outputType_;
        private boolean serverStreaming_;
        private static final MethodDescriptorProto DEFAULT_INSTANCE = new MethodDescriptorProto();

        @Deprecated
        public static final vkh<MethodDescriptorProto> PARSER = new a();

        public static class a extends com.google.protobuf.c<MethodDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MethodDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new MethodDescriptorProto(jVar, tVar);
            }
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.y;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<MethodDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MethodDescriptorProto)) {
                return super.equals(obj);
            }
            MethodDescriptorProto methodDescriptorProto = (MethodDescriptorProto) obj;
            if (hasName() != methodDescriptorProto.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(methodDescriptorProto.getName())) || hasInputType() != methodDescriptorProto.hasInputType()) {
                return false;
            }
            if ((hasInputType() && !getInputType().equals(methodDescriptorProto.getInputType())) || hasOutputType() != methodDescriptorProto.hasOutputType()) {
                return false;
            }
            if ((hasOutputType() && !getOutputType().equals(methodDescriptorProto.getOutputType())) || hasOptions() != methodDescriptorProto.hasOptions()) {
                return false;
            }
            if ((hasOptions() && !getOptions().equals(methodDescriptorProto.getOptions())) || hasClientStreaming() != methodDescriptorProto.hasClientStreaming()) {
                return false;
            }
            if ((!hasClientStreaming() || getClientStreaming() == methodDescriptorProto.getClientStreaming()) && hasServerStreaming() == methodDescriptorProto.hasServerStreaming()) {
                return (!hasServerStreaming() || getServerStreaming() == methodDescriptorProto.getServerStreaming()) && this.unknownFields.equals(methodDescriptorProto.unknownFields);
            }
            return false;
        }

        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        public String getInputType() {
            Object obj = this.inputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.inputType_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getInputTypeBytes() {
            Object obj = this.inputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.inputType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public MethodOptions getOptions() {
            MethodOptions methodOptions = this.options_;
            return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
        }

        public o getOptionsOrBuilder() {
            MethodOptions methodOptions = this.options_;
            return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
        }

        public String getOutputType() {
            Object obj = this.outputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.outputType_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getOutputTypeBytes() {
            Object obj = this.outputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.outputType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<MethodDescriptorProto> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.inputType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.outputType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.G(4, getOptions());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.e(5, this.clientStreaming_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.e(6, this.serverStreaming_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasInputType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getInputType().hashCode();
            }
            if (hasOutputType()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOutputType().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getOptions().hashCode();
            }
            if (hasClientStreaming()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + d0.d(getClientStreaming());
            }
            if (hasServerStreaming()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + d0.d(getServerStreaming());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.z.d(MethodDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new MethodDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.inputType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.outputType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.K0(4, getOptions());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.m0(5, this.clientStreaming_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.m0(6, this.serverStreaming_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements n {
            public int e;
            public Object f;
            public Object g;
            public Object h;
            public MethodOptions i;
            public h1<MethodOptions, MethodOptions.b, o> j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f9479k;
            public boolean l;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            private h1<MethodOptions, MethodOptions.b, o> x() {
                if (this.j == null) {
                    this.j = new h1<>(w(), g(), isClean());
                    this.i = null;
                }
                return this.j;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof MethodDescriptorProto) {
                    return z((MethodDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b B(MethodOptions methodOptions) {
                MethodOptions methodOptions2;
                h1<MethodOptions, MethodOptions.b, o> h1Var = this.j;
                if (h1Var == null) {
                    if ((this.e & 8) == 0 || (methodOptions2 = this.i) == null || methodOptions2 == MethodOptions.getDefaultInstance()) {
                        this.i = methodOptions;
                    } else {
                        this.i = MethodOptions.newBuilder(this.i).J(methodOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(methodOptions);
                }
                this.e |= 8;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b D(boolean z) {
                this.e |= 16;
                this.f9479k = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b G(boolean z) {
                this.e |= 32;
                this.l = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.y;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.z.d(MethodDescriptorProto.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public MethodDescriptorProto build() {
                MethodDescriptorProto methodDescriptorProtoBuildPartial = buildPartial();
                if (methodDescriptorProtoBuildPartial.isInitialized()) {
                    return methodDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) methodDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public MethodDescriptorProto buildPartial() {
                MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                methodDescriptorProto.name_ = this.f;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                methodDescriptorProto.inputType_ = this.g;
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                methodDescriptorProto.outputType_ = this.h;
                if ((i & 8) != 0) {
                    h1<MethodOptions, MethodOptions.b, o> h1Var = this.j;
                    if (h1Var == null) {
                        methodDescriptorProto.options_ = this.i;
                    } else {
                        methodDescriptorProto.options_ = (MethodOptions) h1Var.b();
                    }
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    methodDescriptorProto.clientStreaming_ = this.f9479k;
                    i2 |= 16;
                }
                if ((i & 32) != 0) {
                    methodDescriptorProto.serverStreaming_ = this.l;
                    i2 |= 32;
                }
                methodDescriptorProto.bitField0_ = i2;
                onBuilt();
                return methodDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                int i = this.e;
                this.g = "";
                this.h = "";
                this.e = i & (-8);
                h1<MethodOptions, MethodOptions.b, o> h1Var = this.j;
                if (h1Var == null) {
                    this.i = null;
                } else {
                    h1Var.c();
                }
                int i2 = this.e;
                this.f9479k = false;
                this.l = false;
                this.e = i2 & (-57);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public MethodDescriptorProto getDefaultInstanceForType() {
                return MethodDescriptorProto.getDefaultInstance();
            }

            public MethodOptions w() {
                h1<MethodOptions, MethodOptions.b, o> h1Var = this.j;
                if (h1Var != null) {
                    return (MethodOptions) h1Var.f();
                }
                MethodOptions methodOptions = this.i;
                return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                MethodDescriptorProto methodDescriptorProto = null;
                try {
                    try {
                        MethodDescriptorProto partialFrom = MethodDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MethodDescriptorProto methodDescriptorProto2 = (MethodDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            methodDescriptorProto = methodDescriptorProto2;
                            if (methodDescriptorProto != null) {
                                z(methodDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (methodDescriptorProto != null) {
                        z(methodDescriptorProto);
                    }
                    throw th;
                }
            }

            public b z(MethodDescriptorProto methodDescriptorProto) {
                if (methodDescriptorProto == MethodDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (methodDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = methodDescriptorProto.name_;
                    onChanged();
                }
                if (methodDescriptorProto.hasInputType()) {
                    this.e |= 2;
                    this.g = methodDescriptorProto.inputType_;
                    onChanged();
                }
                if (methodDescriptorProto.hasOutputType()) {
                    this.e |= 4;
                    this.h = methodDescriptorProto.outputType_;
                    onChanged();
                }
                if (methodDescriptorProto.hasOptions()) {
                    B(methodDescriptorProto.getOptions());
                }
                if (methodDescriptorProto.hasClientStreaming()) {
                    D(methodDescriptorProto.getClientStreaming());
                }
                if (methodDescriptorProto.hasServerStreaming()) {
                    G(methodDescriptorProto.getServerStreaming());
                }
                mo145mergeUnknownFields(methodDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = "";
                this.g = "";
                this.h = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.g = "";
                this.h = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(MethodDescriptorProto methodDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().z(methodDescriptorProto);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private MethodDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public MethodDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private MethodDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        private MethodDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = byteStringQ;
                            } else if (iJ == 18) {
                                ByteString byteStringQ2 = jVar.q();
                                this.bitField0_ |= 2;
                                this.inputType_ = byteStringQ2;
                            } else if (iJ == 26) {
                                ByteString byteStringQ3 = jVar.q();
                                this.bitField0_ |= 4;
                                this.outputType_ = byteStringQ3;
                            } else if (iJ == 34) {
                                MethodOptions.b builder = (this.bitField0_ & 8) != 0 ? this.options_.toBuilder() : null;
                                MethodOptions methodOptions = (MethodOptions) jVar.z(MethodOptions.PARSER, tVar);
                                this.options_ = methodOptions;
                                if (builder != null) {
                                    builder.J(methodOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                            } else if (iJ == 40) {
                                this.bitField0_ |= 16;
                                this.clientStreaming_ = jVar.p();
                            } else if (iJ != 48) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                this.bitField0_ |= 32;
                                this.serverStreaming_ = jVar.p();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static MethodDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static MethodDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class MethodOptions extends GeneratedMessageV3.ExtendableMessage<MethodOptions> implements o {
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;
        private static final MethodOptions DEFAULT_INSTANCE = new MethodOptions();

        @Deprecated
        public static final vkh<MethodOptions> PARSER = new a();

        public enum IdempotencyLevel implements z0 {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final int IDEMPOTENT_VALUE = 2;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            private final int value;
            private static final d0.d<IdempotencyLevel> internalValueMap = new a();
            private static final IdempotencyLevel[] VALUES = values();

            public static class a implements d0.d<IdempotencyLevel> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public IdempotencyLevel findValueByNumber(int i) {
                    return IdempotencyLevel.forNumber(i);
                }
            }

            IdempotencyLevel(int i) {
                this.value = i;
            }

            public static IdempotencyLevel forNumber(int i) {
                if (i == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static final Descriptors.d getDescriptor() {
                return MethodOptions.getDescriptor().m().get(0);
            }

            public static d0.d<IdempotencyLevel> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int i) {
                return forNumber(i);
            }

            public static IdempotencyLevel valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static class a extends com.google.protobuf.c<MethodOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MethodOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new MethodOptions(jVar, tVar);
            }
        }

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.O;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<MethodOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MethodOptions)) {
                return super.equals(obj);
            }
            MethodOptions methodOptions = (MethodOptions) obj;
            if (hasDeprecated() != methodOptions.hasDeprecated()) {
                return false;
            }
            if ((!hasDeprecated() || getDeprecated() == methodOptions.getDeprecated()) && hasIdempotencyLevel() == methodOptions.hasIdempotencyLevel()) {
                return (!hasIdempotencyLevel() || this.idempotencyLevel_ == methodOptions.idempotencyLevel_) && getUninterpretedOptionList().equals(methodOptions.getUninterpretedOptionList()) && this.unknownFields.equals(methodOptions.unknownFields) && getExtensionFields().equals(methodOptions.getExtensionFields());
            }
            return false;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel idempotencyLevelValueOf = IdempotencyLevel.valueOf(this.idempotencyLevel_);
            return idempotencyLevelValueOf == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<MethodOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iE = (this.bitField0_ & 1) != 0 ? CodedOutputStream.e(33, this.deprecated_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iE += CodedOutputStream.l(34, this.idempotencyLevel_);
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iE += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iE + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 33) * 53) + d0.d(getDeprecated());
            }
            if (hasIdempotencyLevel()) {
                iHashCode = (((iHashCode * 37) + 34) * 53) + this.idempotencyLevel_;
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.P.d(MethodOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new MethodOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.m0(33, this.deprecated_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.u0(34, this.idempotencyLevel_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<MethodOptions, b> implements o {
            public int f;
            public boolean g;
            public int h;
            public List<UninterpretedOption> i;
            public c1<UninterpretedOption, UninterpretedOption.b, u> j;

            private void F() {
                if ((this.f & 4) == 0) {
                    this.i = new ArrayList(this.i);
                    this.f |= 4;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.j == null) {
                    this.j = new c1<>(this.i, (this.f & 4) != 0, g(), isClean());
                    this.i = null;
                }
                return this.j;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = false;
                int i = this.f;
                this.h = 0;
                this.f = i & (-4);
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.j;
                if (c1Var == null) {
                    this.i = Collections.emptyList();
                    this.f &= -5;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public MethodOptions getDefaultInstanceForType() {
                return MethodOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                MethodOptions methodOptions = null;
                try {
                    try {
                        MethodOptions partialFrom = MethodOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MethodOptions methodOptions2 = (MethodOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            methodOptions = methodOptions2;
                            if (methodOptions != null) {
                                J(methodOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (methodOptions != null) {
                        J(methodOptions);
                    }
                    throw th;
                }
            }

            public b J(MethodOptions methodOptions) {
                if (methodOptions == MethodOptions.getDefaultInstance()) {
                    return this;
                }
                if (methodOptions.hasDeprecated()) {
                    M(methodOptions.getDeprecated());
                }
                if (methodOptions.hasIdempotencyLevel()) {
                    O(methodOptions.getIdempotencyLevel());
                }
                if (this.j == null) {
                    if (!methodOptions.uninterpretedOption_.isEmpty()) {
                        if (this.i.isEmpty()) {
                            this.i = methodOptions.uninterpretedOption_;
                            this.f &= -5;
                        } else {
                            F();
                            this.i.addAll(methodOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!methodOptions.uninterpretedOption_.isEmpty()) {
                    if (this.j.j()) {
                        this.j.f();
                        this.j = null;
                        this.i = methodOptions.uninterpretedOption_;
                        this.f &= -5;
                        this.j = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.j.b(methodOptions.uninterpretedOption_);
                    }
                }
                u(methodOptions);
                mo145mergeUnknownFields(methodOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof MethodOptions) {
                    return J((MethodOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(boolean z) {
                this.f |= 1;
                this.g = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b O(IdempotencyLevel idempotencyLevel) {
                idempotencyLevel.getClass();
                this.f |= 2;
                this.h = idempotencyLevel.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.O;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.P.d(MethodOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public MethodOptions build() {
                MethodOptions methodOptionsBuildPartial = buildPartial();
                if (methodOptionsBuildPartial.isInitialized()) {
                    return methodOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) methodOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public MethodOptions buildPartial() {
                int i;
                MethodOptions methodOptions = new MethodOptions(this);
                int i2 = this.f;
                if ((i2 & 1) != 0) {
                    methodOptions.deprecated_ = this.g;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    i |= 2;
                }
                methodOptions.idempotencyLevel_ = this.h;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.j;
                if (c1Var == null) {
                    if ((this.f & 4) != 0) {
                        this.i = Collections.unmodifiableList(this.i);
                        this.f &= -5;
                    }
                    methodOptions.uninterpretedOption_ = this.i;
                } else {
                    methodOptions.uninterpretedOption_ = c1Var.d();
                }
                methodOptions.bitField0_ = i;
                onBuilt();
                return methodOptions;
            }

            public b() {
                this.h = 0;
                this.i = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.h = 0;
                this.i = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(MethodOptions methodOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(methodOptions);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private MethodOptions(GeneratedMessageV3.d<MethodOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (MethodOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static MethodOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public MethodOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static MethodOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private MethodOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.idempotencyLevel_ = 0;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static MethodOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static MethodOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static MethodOptions parseFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MethodOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 264) {
                                this.bitField0_ |= 1;
                                this.deprecated_ = jVar.p();
                            } else if (iJ == 272) {
                                int iS = jVar.s();
                                if (IdempotencyLevel.valueOf(iS) == null) {
                                    bVarG.s(34, iS);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.idempotencyLevel_ = iS;
                                }
                            } else if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c & 4) == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = 4;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 4) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 4) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static MethodOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (MethodOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static MethodOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (MethodOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static MethodOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (MethodOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class OneofDescriptorProto extends GeneratedMessageV3 implements p {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private OneofOptions options_;
        private static final OneofDescriptorProto DEFAULT_INSTANCE = new OneofDescriptorProto();

        @Deprecated
        public static final vkh<OneofDescriptorProto> PARSER = new a();

        public static class a extends com.google.protobuf.c<OneofDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public OneofDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new OneofDescriptorProto(jVar, tVar);
            }
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.o;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<OneofDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneofDescriptorProto)) {
                return super.equals(obj);
            }
            OneofDescriptorProto oneofDescriptorProto = (OneofDescriptorProto) obj;
            if (hasName() != oneofDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(oneofDescriptorProto.getName())) && hasOptions() == oneofDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(oneofDescriptorProto.getOptions())) && this.unknownFields.equals(oneofDescriptorProto.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public OneofOptions getOptions() {
            OneofOptions oneofOptions = this.options_;
            return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
        }

        public q getOptionsOrBuilder() {
            OneofOptions oneofOptions = this.options_;
            return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<OneofDescriptorProto> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.G(2, getOptions());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getOptions().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.p.d(OneofDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new OneofDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.K0(2, getOptions());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements p {
            public int e;
            public Object f;
            public OneofOptions g;
            public h1<OneofOptions, OneofOptions.b, q> h;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            private h1<OneofOptions, OneofOptions.b, q> x() {
                if (this.h == null) {
                    this.h = new h1<>(w(), g(), isClean());
                    this.g = null;
                }
                return this.h;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof OneofDescriptorProto) {
                    return z((OneofDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b B(OneofOptions oneofOptions) {
                OneofOptions oneofOptions2;
                h1<OneofOptions, OneofOptions.b, q> h1Var = this.h;
                if (h1Var == null) {
                    if ((this.e & 2) == 0 || (oneofOptions2 = this.g) == null || oneofOptions2 == OneofOptions.getDefaultInstance()) {
                        this.g = oneofOptions;
                    } else {
                        this.g = OneofOptions.newBuilder(this.g).J(oneofOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(oneofOptions);
                }
                this.e |= 2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.p.d(OneofDescriptorProto.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public OneofDescriptorProto build() {
                OneofDescriptorProto oneofDescriptorProtoBuildPartial = buildPartial();
                if (oneofDescriptorProtoBuildPartial.isInitialized()) {
                    return oneofDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) oneofDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public OneofDescriptorProto buildPartial() {
                OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                oneofDescriptorProto.name_ = this.f;
                if ((i & 2) != 0) {
                    h1<OneofOptions, OneofOptions.b, q> h1Var = this.h;
                    if (h1Var == null) {
                        oneofDescriptorProto.options_ = this.g;
                    } else {
                        oneofDescriptorProto.options_ = (OneofOptions) h1Var.b();
                    }
                    i2 |= 2;
                }
                oneofDescriptorProto.bitField0_ = i2;
                onBuilt();
                return oneofDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                this.e &= -2;
                h1<OneofOptions, OneofOptions.b, q> h1Var = this.h;
                if (h1Var == null) {
                    this.g = null;
                } else {
                    h1Var.c();
                }
                this.e &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public OneofDescriptorProto getDefaultInstanceForType() {
                return OneofDescriptorProto.getDefaultInstance();
            }

            public OneofOptions w() {
                h1<OneofOptions, OneofOptions.b, q> h1Var = this.h;
                if (h1Var != null) {
                    return (OneofOptions) h1Var.f();
                }
                OneofOptions oneofOptions = this.g;
                return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                OneofDescriptorProto oneofDescriptorProto = null;
                try {
                    try {
                        OneofDescriptorProto partialFrom = OneofDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        OneofDescriptorProto oneofDescriptorProto2 = (OneofDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            oneofDescriptorProto = oneofDescriptorProto2;
                            if (oneofDescriptorProto != null) {
                                z(oneofDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (oneofDescriptorProto != null) {
                        z(oneofDescriptorProto);
                    }
                    throw th;
                }
            }

            public b z(OneofDescriptorProto oneofDescriptorProto) {
                if (oneofDescriptorProto == OneofDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (oneofDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = oneofDescriptorProto.name_;
                    onChanged();
                }
                if (oneofDescriptorProto.hasOptions()) {
                    B(oneofDescriptorProto.getOptions());
                }
                mo145mergeUnknownFields(oneofDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(OneofDescriptorProto oneofDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().z(oneofDescriptorProto);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private OneofDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public OneofDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private OneofDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private OneofDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = byteStringQ;
                            } else if (iJ != 18) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                OneofOptions.b builder = (this.bitField0_ & 2) != 0 ? this.options_.toBuilder() : null;
                                OneofOptions oneofOptions = (OneofOptions) jVar.z(OneofOptions.PARSER, tVar);
                                this.options_ = oneofOptions;
                                if (builder != null) {
                                    builder.J(oneofOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static OneofDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static OneofDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class OneofOptions extends GeneratedMessageV3.ExtendableMessage<OneofOptions> implements q {
        private static final OneofOptions DEFAULT_INSTANCE = new OneofOptions();

        @Deprecated
        public static final vkh<OneofOptions> PARSER = new a();
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static class a extends com.google.protobuf.c<OneofOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public OneofOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new OneofOptions(jVar, tVar);
            }
        }

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.G;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<OneofOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneofOptions)) {
                return super.equals(obj);
            }
            OneofOptions oneofOptions = (OneofOptions) obj;
            return getUninterpretedOptionList().equals(oneofOptions.getUninterpretedOptionList()) && this.unknownFields.equals(oneofOptions.unknownFields) && getExtensionFields().equals(oneofOptions.getExtensionFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<OneofOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = 0;
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iG += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iG + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.H.d(OneofOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new OneofOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<OneofOptions, b> implements q {
            public int f;
            public List<UninterpretedOption> g;
            public c1<UninterpretedOption, UninterpretedOption.b, u> h;

            private void F() {
                if ((this.f & 1) == 0) {
                    this.g = new ArrayList(this.g);
                    this.f |= 1;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.h == null) {
                    this.h = new c1<>(this.g, (this.f & 1) != 0, g(), isClean());
                    this.g = null;
                }
                return this.h;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.h;
                if (c1Var == null) {
                    this.g = Collections.emptyList();
                    this.f &= -2;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public OneofOptions getDefaultInstanceForType() {
                return OneofOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                OneofOptions oneofOptions = null;
                try {
                    try {
                        OneofOptions partialFrom = OneofOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        OneofOptions oneofOptions2 = (OneofOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            oneofOptions = oneofOptions2;
                            if (oneofOptions != null) {
                                J(oneofOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (oneofOptions != null) {
                        J(oneofOptions);
                    }
                    throw th;
                }
            }

            public b J(OneofOptions oneofOptions) {
                if (oneofOptions == OneofOptions.getDefaultInstance()) {
                    return this;
                }
                if (this.h == null) {
                    if (!oneofOptions.uninterpretedOption_.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = oneofOptions.uninterpretedOption_;
                            this.f &= -2;
                        } else {
                            F();
                            this.g.addAll(oneofOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!oneofOptions.uninterpretedOption_.isEmpty()) {
                    if (this.h.j()) {
                        this.h.f();
                        this.h = null;
                        this.g = oneofOptions.uninterpretedOption_;
                        this.f &= -2;
                        this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.h.b(oneofOptions.uninterpretedOption_);
                    }
                }
                u(oneofOptions);
                mo145mergeUnknownFields(oneofOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof OneofOptions) {
                    return J((OneofOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.G;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.H.d(OneofOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public OneofOptions build() {
                OneofOptions oneofOptionsBuildPartial = buildPartial();
                if (oneofOptionsBuildPartial.isInitialized()) {
                    return oneofOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) oneofOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public OneofOptions buildPartial() {
                OneofOptions oneofOptions = new OneofOptions(this);
                int i = this.f;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.h;
                if (c1Var == null) {
                    if ((i & 1) != 0) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.f &= -2;
                    }
                    oneofOptions.uninterpretedOption_ = this.g;
                } else {
                    oneofOptions.uninterpretedOption_ = c1Var.d();
                }
                onBuilt();
                return oneofOptions;
            }

            public b() {
                this.g = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.g = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(OneofOptions oneofOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(oneofOptions);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private OneofOptions(GeneratedMessageV3.d<OneofOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (OneofOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static OneofOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public OneofOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static OneofOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private OneofOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static OneofOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static OneofOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static OneofOptions parseFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private OneofOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    z2 = true;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static OneofOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (OneofOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static OneofOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (OneofOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static OneofOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (OneofOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class ServiceDescriptorProto extends GeneratedMessageV3 implements r {
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<MethodDescriptorProto> method_;
        private volatile Object name_;
        private ServiceOptions options_;
        private static final ServiceDescriptorProto DEFAULT_INSTANCE = new ServiceDescriptorProto();

        @Deprecated
        public static final vkh<ServiceDescriptorProto> PARSER = new a();

        public static class a extends com.google.protobuf.c<ServiceDescriptorProto> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ServiceDescriptorProto parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new ServiceDescriptorProto(jVar, tVar);
            }
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.w;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<ServiceDescriptorProto> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceDescriptorProto)) {
                return super.equals(obj);
            }
            ServiceDescriptorProto serviceDescriptorProto = (ServiceDescriptorProto) obj;
            if (hasName() != serviceDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(serviceDescriptorProto.getName())) && getMethodList().equals(serviceDescriptorProto.getMethodList()) && hasOptions() == serviceDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(serviceDescriptorProto.getOptions())) && this.unknownFields.equals(serviceDescriptorProto.unknownFields);
            }
            return false;
        }

        public MethodDescriptorProto getMethod(int i) {
            return this.method_.get(i);
        }

        public int getMethodCount() {
            return this.method_.size();
        }

        public List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public n getMethodOrBuilder(int i) {
            return this.method_.get(i);
        }

        public List<? extends n> getMethodOrBuilderList() {
            return this.method_;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public ServiceOptions getOptions() {
            ServiceOptions serviceOptions = this.options_;
            return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
        }

        public s getOptionsOrBuilder() {
            ServiceOptions serviceOptions = this.options_;
            return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<ServiceDescriptorProto> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.method_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.G(2, this.method_.get(i2));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.G(3, getOptions());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (getMethodCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMethodList().hashCode();
            }
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOptions().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.x.d(ServiceDescriptorProto.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getMethodCount(); i++) {
                if (!getMethod(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new ServiceDescriptorProto();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.method_.size(); i++) {
                codedOutputStream.K0(2, this.method_.get(i));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.K0(3, getOptions());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements r {
            public int e;
            public Object f;
            public List<MethodDescriptorProto> g;
            public c1<MethodDescriptorProto, MethodDescriptorProto.b, n> h;
            public ServiceOptions i;
            public h1<ServiceOptions, ServiceOptions.b, s> j;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                    z();
                }
            }

            private h1<ServiceOptions, ServiceOptions.b, s> z() {
                if (this.j == null) {
                    this.j = new h1<>(y(), g(), isClean());
                    this.i = null;
                }
                return this.j;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                ServiceDescriptorProto serviceDescriptorProto = null;
                try {
                    try {
                        ServiceDescriptorProto partialFrom = ServiceDescriptorProto.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            B(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ServiceDescriptorProto serviceDescriptorProto2 = (ServiceDescriptorProto) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            serviceDescriptorProto = serviceDescriptorProto2;
                            if (serviceDescriptorProto != null) {
                                B(serviceDescriptorProto);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (serviceDescriptorProto != null) {
                        B(serviceDescriptorProto);
                    }
                    throw th;
                }
            }

            public b B(ServiceDescriptorProto serviceDescriptorProto) {
                if (serviceDescriptorProto == ServiceDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (serviceDescriptorProto.hasName()) {
                    this.e |= 1;
                    this.f = serviceDescriptorProto.name_;
                    onChanged();
                }
                if (this.h == null) {
                    if (!serviceDescriptorProto.method_.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = serviceDescriptorProto.method_;
                            this.e &= -3;
                        } else {
                            v();
                            this.g.addAll(serviceDescriptorProto.method_);
                        }
                        onChanged();
                    }
                } else if (!serviceDescriptorProto.method_.isEmpty()) {
                    if (this.h.j()) {
                        this.h.f();
                        this.h = null;
                        this.g = serviceDescriptorProto.method_;
                        this.e &= -3;
                        this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                    } else {
                        this.h.b(serviceDescriptorProto.method_);
                    }
                }
                if (serviceDescriptorProto.hasOptions()) {
                    D(serviceDescriptorProto.getOptions());
                }
                mo145mergeUnknownFields(serviceDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof ServiceDescriptorProto) {
                    return B((ServiceDescriptorProto) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b D(ServiceOptions serviceOptions) {
                ServiceOptions serviceOptions2;
                h1<ServiceOptions, ServiceOptions.b, s> h1Var = this.j;
                if (h1Var == null) {
                    if ((this.e & 4) == 0 || (serviceOptions2 = this.i) == null || serviceOptions2 == ServiceOptions.getDefaultInstance()) {
                        this.i = serviceOptions;
                    } else {
                        this.i = ServiceOptions.newBuilder(this.i).J(serviceOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(serviceOptions);
                }
                this.e |= 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.w;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.x.d(ServiceDescriptorProto.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public ServiceDescriptorProto build() {
                ServiceDescriptorProto serviceDescriptorProtoBuildPartial = buildPartial();
                if (serviceDescriptorProtoBuildPartial.isInitialized()) {
                    return serviceDescriptorProtoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) serviceDescriptorProtoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public ServiceDescriptorProto buildPartial() {
                ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                serviceDescriptorProto.name_ = this.f;
                c1<MethodDescriptorProto, MethodDescriptorProto.b, n> c1Var = this.h;
                if (c1Var == null) {
                    if ((this.e & 2) != 0) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.e &= -3;
                    }
                    serviceDescriptorProto.method_ = this.g;
                } else {
                    serviceDescriptorProto.method_ = c1Var.d();
                }
                if ((i & 4) != 0) {
                    h1<ServiceOptions, ServiceOptions.b, s> h1Var = this.j;
                    if (h1Var == null) {
                        serviceDescriptorProto.options_ = this.i;
                    } else {
                        serviceDescriptorProto.options_ = (ServiceOptions) h1Var.b();
                    }
                    i2 |= 2;
                }
                serviceDescriptorProto.bitField0_ = i2;
                onBuilt();
                return serviceDescriptorProto;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                this.e &= -2;
                c1<MethodDescriptorProto, MethodDescriptorProto.b, n> c1Var = this.h;
                if (c1Var == null) {
                    this.g = Collections.emptyList();
                    this.e &= -3;
                } else {
                    c1Var.e();
                }
                h1<ServiceOptions, ServiceOptions.b, s> h1Var = this.j;
                if (h1Var == null) {
                    this.i = null;
                } else {
                    h1Var.c();
                }
                this.e &= -5;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void v() {
                if ((this.e & 2) == 0) {
                    this.g = new ArrayList(this.g);
                    this.e |= 2;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public ServiceDescriptorProto getDefaultInstanceForType() {
                return ServiceDescriptorProto.getDefaultInstance();
            }

            public final c1<MethodDescriptorProto, MethodDescriptorProto.b, n> x() {
                if (this.h == null) {
                    this.h = new c1<>(this.g, (this.e & 2) != 0, g(), isClean());
                    this.g = null;
                }
                return this.h;
            }

            public ServiceOptions y() {
                h1<ServiceOptions, ServiceOptions.b, s> h1Var = this.j;
                if (h1Var != null) {
                    return (ServiceOptions) h1Var.f();
                }
                ServiceOptions serviceOptions = this.i;
                return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
            }

            public b() {
                this.f = "";
                this.g = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.g = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
            return DEFAULT_INSTANCE.toBuilder().B(serviceDescriptorProto);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private ServiceDescriptorProto(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public ServiceDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().B(this);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private ServiceDescriptorProto() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.method_ = Collections.emptyList();
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ServiceDescriptorProto(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.name_ = byteStringQ;
                            } else if (iJ == 18) {
                                if ((c & 2) == 0) {
                                    this.method_ = new ArrayList();
                                    c = 2;
                                }
                                this.method_.add((MethodDescriptorProto) jVar.z(MethodDescriptorProto.PARSER, tVar));
                            } else if (iJ != 26) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                ServiceOptions.b builder = (this.bitField0_ & 2) != 0 ? this.options_.toBuilder() : null;
                                ServiceOptions serviceOptions = (ServiceOptions) jVar.z(ServiceOptions.PARSER, tVar);
                                this.options_ = serviceOptions;
                                if (builder != null) {
                                    builder.J(serviceOptions);
                                    this.options_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) != 0) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 2) != 0) {
                this.method_ = Collections.unmodifiableList(this.method_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static ServiceDescriptorProto parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static ServiceDescriptorProto parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class ServiceOptions extends GeneratedMessageV3.ExtendableMessage<ServiceOptions> implements s {
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;
        private static final ServiceOptions DEFAULT_INSTANCE = new ServiceOptions();

        @Deprecated
        public static final vkh<ServiceOptions> PARSER = new a();

        public static class a extends com.google.protobuf.c<ServiceOptions> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ServiceOptions parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new ServiceOptions(jVar, tVar);
            }
        }

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.M;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<ServiceOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceOptions)) {
                return super.equals(obj);
            }
            ServiceOptions serviceOptions = (ServiceOptions) obj;
            if (hasDeprecated() != serviceOptions.hasDeprecated()) {
                return false;
            }
            return (!hasDeprecated() || getDeprecated() == serviceOptions.getDeprecated()) && getUninterpretedOptionList().equals(serviceOptions.getUninterpretedOptionList()) && this.unknownFields.equals(serviceOptions.unknownFields) && getExtensionFields().equals(serviceOptions.getExtensionFields());
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<ServiceOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iE = (this.bitField0_ & 1) != 0 ? CodedOutputStream.e(33, this.deprecated_) : 0;
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                iE += CodedOutputStream.G(999, this.uninterpretedOption_.get(i2));
            }
            int iExtensionsSerializedSize = iE + extensionsSerializedSize() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public u getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends u> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDeprecated()) {
                iHashCode = (((iHashCode * 37) + 33) * 53) + d0.d(getDeprecated());
            }
            if (getUninterpretedOptionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, getExtensionFields()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.N.d(ServiceOptions.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new ServiceOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.ExtendableMessage<MessageType>.a aVarNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.m0(33, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.K0(999, this.uninterpretedOption_.get(i));
            }
            aVarNewExtensionWriter.a(536870912, codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.d<ServiceOptions, b> implements s {
            public int f;
            public boolean g;
            public List<UninterpretedOption> h;
            public c1<UninterpretedOption, UninterpretedOption.b, u> i;

            private void F() {
                if ((this.f & 2) == 0) {
                    this.h = new ArrayList(this.h);
                    this.f |= 2;
                }
            }

            private c1<UninterpretedOption, UninterpretedOption.b, u> H() {
                if (this.i == null) {
                    this.i = new c1<>(this.h, (this.f & 2) != 0, g(), isClean());
                    this.h = null;
                }
                return this.i;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    H();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.g = false;
                this.f &= -2;
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.i;
                if (c1Var == null) {
                    this.h = Collections.emptyList();
                    this.f &= -3;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public ServiceOptions getDefaultInstanceForType() {
                return ServiceOptions.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                ServiceOptions serviceOptions = null;
                try {
                    try {
                        ServiceOptions partialFrom = ServiceOptions.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            J(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ServiceOptions serviceOptions2 = (ServiceOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            serviceOptions = serviceOptions2;
                            if (serviceOptions != null) {
                                J(serviceOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (serviceOptions != null) {
                        J(serviceOptions);
                    }
                    throw th;
                }
            }

            public b J(ServiceOptions serviceOptions) {
                if (serviceOptions == ServiceOptions.getDefaultInstance()) {
                    return this;
                }
                if (serviceOptions.hasDeprecated()) {
                    M(serviceOptions.getDeprecated());
                }
                if (this.i == null) {
                    if (!serviceOptions.uninterpretedOption_.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = serviceOptions.uninterpretedOption_;
                            this.f &= -3;
                        } else {
                            F();
                            this.h.addAll(serviceOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!serviceOptions.uninterpretedOption_.isEmpty()) {
                    if (this.i.j()) {
                        this.i.f();
                        this.i = null;
                        this.h = serviceOptions.uninterpretedOption_;
                        this.f &= -3;
                        this.i = GeneratedMessageV3.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.i.b(serviceOptions.uninterpretedOption_);
                    }
                }
                u(serviceOptions);
                mo145mergeUnknownFields(serviceOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof ServiceOptions) {
                    return J((ServiceOptions) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b M(boolean z) {
                this.f |= 1;
                this.g = z;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.M;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.N.d(ServiceOptions.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.d
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public ServiceOptions build() {
                ServiceOptions serviceOptionsBuildPartial = buildPartial();
                if (serviceOptionsBuildPartial.isInitialized()) {
                    return serviceOptionsBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) serviceOptionsBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public ServiceOptions buildPartial() {
                ServiceOptions serviceOptions = new ServiceOptions(this);
                int i = 1;
                if ((this.f & 1) != 0) {
                    serviceOptions.deprecated_ = this.g;
                } else {
                    i = 0;
                }
                c1<UninterpretedOption, UninterpretedOption.b, u> c1Var = this.i;
                if (c1Var == null) {
                    if ((this.f & 2) != 0) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.f &= -3;
                    }
                    serviceOptions.uninterpretedOption_ = this.h;
                } else {
                    serviceOptions.uninterpretedOption_ = c1Var.d();
                }
                serviceOptions.bitField0_ = i;
                onBuilt();
                return serviceOptions;
            }

            public b() {
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(ServiceOptions serviceOptions) {
            return DEFAULT_INSTANCE.toBuilder().J(serviceOptions);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private ServiceOptions(GeneratedMessageV3.d<ServiceOptions, ?> dVar) {
            super(dVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (ServiceOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static ServiceOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public ServiceOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().J(this);
        }

        public static ServiceOptions parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private ServiceOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public static ServiceOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static ServiceOptions parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static ServiceOptions parseFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ServiceOptions(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 264) {
                                this.bitField0_ |= 1;
                                this.deprecated_ = jVar.p();
                            } else if (iJ != 7994) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c & 2) == 0) {
                                    this.uninterpretedOption_ = new ArrayList();
                                    c = 2;
                                }
                                this.uninterpretedOption_.add((UninterpretedOption) jVar.z(UninterpretedOption.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 2) != 0) {
                this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static ServiceOptions parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (ServiceOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static ServiceOptions parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (ServiceOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static ServiceOptions parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (ServiceOptions) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class SourceCodeInfo extends GeneratedMessageV3 implements t {
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Location> location_;
        private byte memoizedIsInitialized;
        private static final SourceCodeInfo DEFAULT_INSTANCE = new SourceCodeInfo();

        @Deprecated
        public static final vkh<SourceCodeInfo> PARSER = new a();

        public static final class Location extends GeneratedMessageV3 implements c {
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object leadingComments_;
            private ree leadingDetachedComments_;
            private byte memoizedIsInitialized;
            private int pathMemoizedSerializedSize;
            private d0.g path_;
            private int spanMemoizedSerializedSize;
            private d0.g span_;
            private volatile Object trailingComments_;
            private static final Location DEFAULT_INSTANCE = new Location();

            @Deprecated
            public static final vkh<Location> PARSER = new a();

            public static class a extends com.google.protobuf.c<Location> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Location parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                    return new Location(jVar, tVar);
                }
            }

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return DescriptorProtos.W;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<Location> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Location)) {
                    return super.equals(obj);
                }
                Location location = (Location) obj;
                if (!getPathList().equals(location.getPathList()) || !getSpanList().equals(location.getSpanList()) || hasLeadingComments() != location.hasLeadingComments()) {
                    return false;
                }
                if ((!hasLeadingComments() || getLeadingComments().equals(location.getLeadingComments())) && hasTrailingComments() == location.hasTrailingComments()) {
                    return (!hasTrailingComments() || getTrailingComments().equals(location.getTrailingComments())) && m149getLeadingDetachedCommentsList().equals(location.m149getLeadingDetachedCommentsList()) && this.unknownFields.equals(location.unknownFields);
                }
                return false;
            }

            public String getLeadingComments() {
                Object obj = this.leadingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.leadingComments_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getLeadingCommentsBytes() {
                Object obj = this.leadingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.leadingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            public ByteString getLeadingDetachedCommentsBytes(int i) {
                return this.leadingDetachedComments_.getByteString(i);
            }

            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<Location> getParserForType() {
                return PARSER;
            }

            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            public int getPathCount() {
                return this.path_.size();
            }

            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iY = 0;
                for (int i2 = 0; i2 < this.path_.size(); i2++) {
                    iY += CodedOutputStream.y(this.path_.getInt(i2));
                }
                int iY2 = !getPathList().isEmpty() ? iY + 1 + CodedOutputStream.y(iY) : iY;
                this.pathMemoizedSerializedSize = iY;
                int iY3 = 0;
                for (int i3 = 0; i3 < this.span_.size(); i3++) {
                    iY3 += CodedOutputStream.y(this.span_.getInt(i3));
                }
                int iComputeStringSize = iY2 + iY3;
                if (!getSpanList().isEmpty()) {
                    iComputeStringSize = iComputeStringSize + 1 + CodedOutputStream.y(iY3);
                }
                this.spanMemoizedSerializedSize = iY3;
                if ((this.bitField0_ & 1) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.leadingComments_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.trailingComments_);
                }
                int iComputeStringSizeNoTag = 0;
                for (int i4 = 0; i4 < this.leadingDetachedComments_.size(); i4++) {
                    iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.leadingDetachedComments_.d(i4));
                }
                int size = iComputeStringSize + iComputeStringSizeNoTag + m149getLeadingDetachedCommentsList().size() + this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }

            public int getSpan(int i) {
                return this.span_.getInt(i);
            }

            public int getSpanCount() {
                return this.span_.size();
            }

            public List<Integer> getSpanList() {
                return this.span_;
            }

            public String getTrailingComments() {
                Object obj = this.trailingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.trailingComments_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getTrailingCommentsBytes() {
                Object obj = this.trailingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.trailingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getPathCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getPathList().hashCode();
                }
                if (getSpanCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSpanList().hashCode();
                }
                if (hasLeadingComments()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getLeadingComments().hashCode();
                }
                if (hasTrailingComments()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getTrailingComments().hashCode();
                }
                if (getLeadingDetachedCommentsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + m149getLeadingDetachedCommentsList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return DescriptorProtos.X.d(Location.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new Location();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (getPathList().size() > 0) {
                    codedOutputStream.c1(10);
                    codedOutputStream.c1(this.pathMemoizedSerializedSize);
                }
                for (int i = 0; i < this.path_.size(); i++) {
                    codedOutputStream.H0(this.path_.getInt(i));
                }
                if (getSpanList().size() > 0) {
                    codedOutputStream.c1(18);
                    codedOutputStream.c1(this.spanMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.span_.size(); i2++) {
                    codedOutputStream.H0(this.span_.getInt(i2));
                }
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.leadingComments_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.trailingComments_);
                }
                for (int i3 = 0; i3 < this.leadingDetachedComments_.size(); i3++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.leadingDetachedComments_.d(i3));
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements c {
                public int e;
                public d0.g f;
                public d0.g g;
                public Object h;
                public Object i;
                public ree j;

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                private void w() {
                    if ((this.e & 1) == 0) {
                        this.f = GeneratedMessageV3.mutableCopy(this.f);
                        this.e |= 1;
                    }
                }

                public b A(Location location) {
                    if (location == Location.getDefaultInstance()) {
                        return this;
                    }
                    if (!location.path_.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = location.path_;
                            this.e &= -2;
                        } else {
                            w();
                            this.f.addAll(location.path_);
                        }
                        onChanged();
                    }
                    if (!location.span_.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = location.span_;
                            this.e &= -3;
                        } else {
                            x();
                            this.g.addAll(location.span_);
                        }
                        onChanged();
                    }
                    if (location.hasLeadingComments()) {
                        this.e |= 4;
                        this.h = location.leadingComments_;
                        onChanged();
                    }
                    if (location.hasTrailingComments()) {
                        this.e |= 8;
                        this.i = location.trailingComments_;
                        onChanged();
                    }
                    if (!location.leadingDetachedComments_.isEmpty()) {
                        if (this.j.isEmpty()) {
                            this.j = location.leadingDetachedComments_;
                            this.e &= -17;
                        } else {
                            v();
                            this.j.addAll(location.leadingDetachedComments_);
                        }
                        onChanged();
                    }
                    mo145mergeUnknownFields(location.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof Location) {
                        return A((Location) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return DescriptorProtos.W;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return DescriptorProtos.X.d(Location.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public Location build() {
                    Location locationBuildPartial = buildPartial();
                    if (locationBuildPartial.isInitialized()) {
                        return locationBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) locationBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Location buildPartial() {
                    Location location = new Location(this);
                    int i = this.e;
                    if ((i & 1) != 0) {
                        this.f.b();
                        this.e &= -2;
                    }
                    location.path_ = this.f;
                    if ((this.e & 2) != 0) {
                        this.g.b();
                        this.e &= -3;
                    }
                    location.span_ = this.g;
                    int i2 = (i & 4) != 0 ? 1 : 0;
                    location.leadingComments_ = this.h;
                    if ((i & 8) != 0) {
                        i2 |= 2;
                    }
                    location.trailingComments_ = this.i;
                    if ((this.e & 16) != 0) {
                        this.j = this.j.getUnmodifiableView();
                        this.e &= -17;
                    }
                    location.leadingDetachedComments_ = this.j;
                    location.bitField0_ = i2;
                    onBuilt();
                    return location;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = GeneratedMessageV3.emptyIntList();
                    this.e &= -2;
                    this.g = GeneratedMessageV3.emptyIntList();
                    int i = this.e;
                    this.h = "";
                    this.i = "";
                    this.e = i & (-15);
                    this.j = g0.d;
                    this.e = i & (-31);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                public final void v() {
                    if ((this.e & 16) == 0) {
                        this.j = new g0(this.j);
                        this.e |= 16;
                    }
                }

                public final void x() {
                    if ((this.e & 2) == 0) {
                        this.g = GeneratedMessageV3.mutableCopy(this.g);
                        this.e |= 2;
                    }
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public Location getDefaultInstanceForType() {
                    return Location.getDefaultInstance();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                    Location location = null;
                    try {
                        try {
                            Location partialFrom = Location.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                A(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Location location2 = (Location) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                location = location2;
                                if (location != null) {
                                    A(location);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (location != null) {
                            A(location);
                        }
                        throw th;
                    }
                }

                public b() {
                    this.f = GeneratedMessageV3.emptyIntList();
                    this.g = GeneratedMessageV3.emptyIntList();
                    this.h = "";
                    this.i = "";
                    this.j = g0.d;
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    this.f = GeneratedMessageV3.emptyIntList();
                    this.g = GeneratedMessageV3.emptyIntList();
                    this.h = "";
                    this.i = "";
                    this.j = g0.d;
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(Location location) {
                return DEFAULT_INSTANCE.toBuilder().A(location);
            }

            public static Location parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            /* JADX INFO: renamed from: getLeadingDetachedCommentsList, reason: merged with bridge method [inline-methods] */
            public bei m149getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            private Location(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.pathMemoizedSerializedSize = -1;
                this.spanMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Location parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (Location) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public Location getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().A(this);
            }

            public static Location parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            public static Location parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            private Location() {
                this.pathMemoizedSerializedSize = -1;
                this.spanMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.path_ = GeneratedMessageV3.emptyIntList();
                this.span_ = GeneratedMessageV3.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = g0.d;
            }

            public static Location parseFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Location parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (Location) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            public static Location parseFrom(com.google.protobuf.j jVar) throws IOException {
                return (Location) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static Location parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
                return (Location) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }

            private Location(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                int i = 0;
                while (!z) {
                    try {
                        try {
                            try {
                                int iJ = jVar.J();
                                if (iJ != 0) {
                                    if (iJ == 8) {
                                        if ((i & 1) == 0) {
                                            this.path_ = GeneratedMessageV3.newIntList();
                                            i |= 1;
                                        }
                                        this.path_.Q(jVar.x());
                                    } else if (iJ == 10) {
                                        int iO = jVar.o(jVar.B());
                                        if ((i & 1) == 0 && jVar.d() > 0) {
                                            this.path_ = GeneratedMessageV3.newIntList();
                                            i |= 1;
                                        }
                                        while (jVar.d() > 0) {
                                            this.path_.Q(jVar.x());
                                        }
                                        jVar.n(iO);
                                    } else if (iJ == 16) {
                                        if ((i & 2) == 0) {
                                            this.span_ = GeneratedMessageV3.newIntList();
                                            i |= 2;
                                        }
                                        this.span_.Q(jVar.x());
                                    } else if (iJ == 18) {
                                        int iO2 = jVar.o(jVar.B());
                                        if ((i & 2) == 0 && jVar.d() > 0) {
                                            this.span_ = GeneratedMessageV3.newIntList();
                                            i |= 2;
                                        }
                                        while (jVar.d() > 0) {
                                            this.span_.Q(jVar.x());
                                        }
                                        jVar.n(iO2);
                                    } else if (iJ == 26) {
                                        ByteString byteStringQ = jVar.q();
                                        this.bitField0_ = 1 | this.bitField0_;
                                        this.leadingComments_ = byteStringQ;
                                    } else if (iJ == 34) {
                                        ByteString byteStringQ2 = jVar.q();
                                        this.bitField0_ |= 2;
                                        this.trailingComments_ = byteStringQ2;
                                    } else if (iJ != 50) {
                                        if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                        }
                                    } else {
                                        ByteString byteStringQ3 = jVar.q();
                                        if ((i & 16) == 0) {
                                            this.leadingDetachedComments_ = new g0();
                                            i |= 16;
                                        }
                                        this.leadingDetachedComments_.n(byteStringQ3);
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((i & 1) != 0) {
                            this.path_.b();
                        }
                        if ((i & 2) != 0) {
                            this.span_.b();
                        }
                        if ((i & 16) != 0) {
                            this.leadingDetachedComments_ = this.leadingDetachedComments_.getUnmodifiableView();
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i & 1) != 0) {
                    this.path_.b();
                }
                if ((i & 2) != 0) {
                    this.span_.b();
                }
                if ((i & 16) != 0) {
                    this.leadingDetachedComments_ = this.leadingDetachedComments_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public static class a extends com.google.protobuf.c<SourceCodeInfo> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SourceCodeInfo parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new SourceCodeInfo(jVar, tVar);
            }
        }

        public interface c extends s0 {
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.U;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<SourceCodeInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SourceCodeInfo)) {
                return super.equals(obj);
            }
            SourceCodeInfo sourceCodeInfo = (SourceCodeInfo) obj;
            return getLocationList().equals(sourceCodeInfo.getLocationList()) && this.unknownFields.equals(sourceCodeInfo.unknownFields);
        }

        public Location getLocation(int i) {
            return this.location_.get(i);
        }

        public int getLocationCount() {
            return this.location_.size();
        }

        public List<Location> getLocationList() {
            return this.location_;
        }

        public c getLocationOrBuilder(int i) {
            return this.location_.get(i);
        }

        public List<? extends c> getLocationOrBuilderList() {
            return this.location_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<SourceCodeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = 0;
            for (int i2 = 0; i2 < this.location_.size(); i2++) {
                iG += CodedOutputStream.G(1, this.location_.get(i2));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getLocationCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getLocationList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.V.d(SourceCodeInfo.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new SourceCodeInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.location_.size(); i++) {
                codedOutputStream.K0(1, this.location_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements t {
            public int e;
            public List<Location> f;
            public c1<Location, Location.b, c> g;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof SourceCodeInfo) {
                    return z((SourceCodeInfo) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.U;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.V.d(SourceCodeInfo.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public SourceCodeInfo build() {
                SourceCodeInfo sourceCodeInfoBuildPartial = buildPartial();
                if (sourceCodeInfoBuildPartial.isInitialized()) {
                    return sourceCodeInfoBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) sourceCodeInfoBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public SourceCodeInfo buildPartial() {
                SourceCodeInfo sourceCodeInfo = new SourceCodeInfo(this);
                int i = this.e;
                c1<Location, Location.b, c> c1Var = this.g;
                if (c1Var == null) {
                    if ((i & 1) != 0) {
                        this.f = Collections.unmodifiableList(this.f);
                        this.e &= -2;
                    }
                    sourceCodeInfo.location_ = this.f;
                } else {
                    sourceCodeInfo.location_ = c1Var.d();
                }
                onBuilt();
                return sourceCodeInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                c1<Location, Location.b, c> c1Var = this.g;
                if (c1Var == null) {
                    this.f = Collections.emptyList();
                    this.e &= -2;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void v() {
                if ((this.e & 1) == 0) {
                    this.f = new ArrayList(this.f);
                    this.e |= 1;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public SourceCodeInfo getDefaultInstanceForType() {
                return SourceCodeInfo.getDefaultInstance();
            }

            public final c1<Location, Location.b, c> x() {
                if (this.g == null) {
                    this.g = new c1<>(this.f, (this.e & 1) != 0, g(), isClean());
                    this.f = null;
                }
                return this.g;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                SourceCodeInfo sourceCodeInfo = null;
                try {
                    try {
                        SourceCodeInfo partialFrom = SourceCodeInfo.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        SourceCodeInfo sourceCodeInfo2 = (SourceCodeInfo) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            sourceCodeInfo = sourceCodeInfo2;
                            if (sourceCodeInfo != null) {
                                z(sourceCodeInfo);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sourceCodeInfo != null) {
                        z(sourceCodeInfo);
                    }
                    throw th;
                }
            }

            public b z(SourceCodeInfo sourceCodeInfo) {
                if (sourceCodeInfo == SourceCodeInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.g == null) {
                    if (!sourceCodeInfo.location_.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = sourceCodeInfo.location_;
                            this.e &= -2;
                        } else {
                            v();
                            this.f.addAll(sourceCodeInfo.location_);
                        }
                        onChanged();
                    }
                } else if (!sourceCodeInfo.location_.isEmpty()) {
                    if (this.g.j()) {
                        this.g.f();
                        this.g = null;
                        this.f = sourceCodeInfo.location_;
                        this.e &= -2;
                        this.g = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                    } else {
                        this.g.b(sourceCodeInfo.location_);
                    }
                }
                mo145mergeUnknownFields(sourceCodeInfo.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(SourceCodeInfo sourceCodeInfo) {
            return DEFAULT_INSTANCE.toBuilder().z(sourceCodeInfo);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private SourceCodeInfo(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (SourceCodeInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public SourceCodeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private SourceCodeInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.location_ = Collections.emptyList();
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SourceCodeInfo(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ != 10) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.location_ = new ArrayList();
                                    z2 = true;
                                }
                                this.location_.add((Location) jVar.z(Location.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.location_ = Collections.unmodifiableList(this.location_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.location_ = Collections.unmodifiableList(this.location_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (SourceCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static SourceCodeInfo parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (SourceCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static SourceCodeInfo parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (SourceCodeInfo) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class UninterpretedOption extends GeneratedMessageV3 implements u {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private volatile Object aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private volatile Object identifierValue_;
        private byte memoizedIsInitialized;
        private List<NamePart> name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;
        private static final UninterpretedOption DEFAULT_INSTANCE = new UninterpretedOption();

        @Deprecated
        public static final vkh<UninterpretedOption> PARSER = new a();

        public static final class NamePart extends GeneratedMessageV3 implements c {
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized;
            private volatile Object namePart_;
            private static final NamePart DEFAULT_INSTANCE = new NamePart();

            @Deprecated
            public static final vkh<NamePart> PARSER = new a();

            public static class a extends com.google.protobuf.c<NamePart> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public NamePart parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                    return new NamePart(jVar, tVar);
                }
            }

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return DescriptorProtos.S;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<NamePart> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NamePart)) {
                    return super.equals(obj);
                }
                NamePart namePart = (NamePart) obj;
                if (hasNamePart() != namePart.hasNamePart()) {
                    return false;
                }
                if ((!hasNamePart() || getNamePart().equals(namePart.getNamePart())) && hasIsExtension() == namePart.hasIsExtension()) {
                    return (!hasIsExtension() || getIsExtension() == namePart.getIsExtension()) && this.unknownFields.equals(namePart.unknownFields);
                }
                return false;
            }

            public boolean getIsExtension() {
                return this.isExtension_;
            }

            public String getNamePart() {
                Object obj = this.namePart_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.namePart_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getNamePartBytes() {
                Object obj = this.namePart_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.namePart_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<NamePart> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.namePart_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.e(2, this.isExtension_);
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasNamePart()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getNamePart().hashCode();
                }
                if (hasIsExtension()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + d0.d(getIsExtension());
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return DescriptorProtos.T.d(NamePart.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (!hasNamePart()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasIsExtension()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new NamePart();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.namePart_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.m0(2, this.isExtension_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements c {
                public int e;
                public Object f;
                public boolean g;

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                public b B(boolean z) {
                    this.e |= 2;
                    this.g = z;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return DescriptorProtos.S;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return DescriptorProtos.T.d(NamePart.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public NamePart build() {
                    NamePart namePartBuildPartial = buildPartial();
                    if (namePartBuildPartial.isInitialized()) {
                        return namePartBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) namePartBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public NamePart buildPartial() {
                    NamePart namePart = new NamePart(this);
                    int i = this.e;
                    int i2 = (i & 1) != 0 ? 1 : 0;
                    namePart.namePart_ = this.f;
                    if ((i & 2) != 0) {
                        namePart.isExtension_ = this.g;
                        i2 |= 2;
                    }
                    namePart.bitField0_ = i2;
                    onBuilt();
                    return namePart;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = "";
                    int i = this.e;
                    this.g = false;
                    this.e = i & (-4);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public NamePart getDefaultInstanceForType() {
                    return NamePart.getDefaultInstance();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                    NamePart namePart = null;
                    try {
                        try {
                            NamePart partialFrom = NamePart.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                x(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            NamePart namePart2 = (NamePart) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                namePart = namePart2;
                                if (namePart != null) {
                                    x(namePart);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (namePart != null) {
                            x(namePart);
                        }
                        throw th;
                    }
                }

                public b x(NamePart namePart) {
                    if (namePart == NamePart.getDefaultInstance()) {
                        return this;
                    }
                    if (namePart.hasNamePart()) {
                        this.e |= 1;
                        this.f = namePart.namePart_;
                        onChanged();
                    }
                    if (namePart.hasIsExtension()) {
                        B(namePart.getIsExtension());
                    }
                    mo145mergeUnknownFields(namePart.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof NamePart) {
                        return x((NamePart) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                public b() {
                    this.f = "";
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    this.f = "";
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(NamePart namePart) {
                return DEFAULT_INSTANCE.toBuilder().x(namePart);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            private NamePart(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (NamePart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static NamePart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public NamePart getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().x(this);
            }

            public static NamePart parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            private NamePart() {
                this.memoizedIsInitialized = (byte) -1;
                this.namePart_ = "";
            }

            public static NamePart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            public static NamePart parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            public static NamePart parseFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            private NamePart(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iJ = jVar.J();
                            if (iJ != 0) {
                                if (iJ == 10) {
                                    ByteString byteStringQ = jVar.q();
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.namePart_ = byteStringQ;
                                } else if (iJ != 16) {
                                    if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    }
                                } else {
                                    this.bitField0_ |= 2;
                                    this.isExtension_ = jVar.p();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static NamePart parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
                return (NamePart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            public static NamePart parseFrom(com.google.protobuf.j jVar) throws IOException {
                return (NamePart) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static NamePart parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
                return (NamePart) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }
        }

        public static class a extends com.google.protobuf.c<UninterpretedOption> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public UninterpretedOption parsePartialFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
                return new UninterpretedOption(jVar, tVar);
            }
        }

        public interface c extends s0 {
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return DescriptorProtos.Q;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<UninterpretedOption> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UninterpretedOption)) {
                return super.equals(obj);
            }
            UninterpretedOption uninterpretedOption = (UninterpretedOption) obj;
            if (!getNameList().equals(uninterpretedOption.getNameList()) || hasIdentifierValue() != uninterpretedOption.hasIdentifierValue()) {
                return false;
            }
            if ((hasIdentifierValue() && !getIdentifierValue().equals(uninterpretedOption.getIdentifierValue())) || hasPositiveIntValue() != uninterpretedOption.hasPositiveIntValue()) {
                return false;
            }
            if ((hasPositiveIntValue() && getPositiveIntValue() != uninterpretedOption.getPositiveIntValue()) || hasNegativeIntValue() != uninterpretedOption.hasNegativeIntValue()) {
                return false;
            }
            if ((hasNegativeIntValue() && getNegativeIntValue() != uninterpretedOption.getNegativeIntValue()) || hasDoubleValue() != uninterpretedOption.hasDoubleValue()) {
                return false;
            }
            if ((hasDoubleValue() && Double.doubleToLongBits(getDoubleValue()) != Double.doubleToLongBits(uninterpretedOption.getDoubleValue())) || hasStringValue() != uninterpretedOption.hasStringValue()) {
                return false;
            }
            if ((!hasStringValue() || getStringValue().equals(uninterpretedOption.getStringValue())) && hasAggregateValue() == uninterpretedOption.hasAggregateValue()) {
                return (!hasAggregateValue() || getAggregateValue().equals(uninterpretedOption.getAggregateValue())) && this.unknownFields.equals(uninterpretedOption.unknownFields);
            }
            return false;
        }

        public String getAggregateValue() {
            Object obj = this.aggregateValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aggregateValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getAggregateValueBytes() {
            Object obj = this.aggregateValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aggregateValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public double getDoubleValue() {
            return this.doubleValue_;
        }

        public String getIdentifierValue() {
            Object obj = this.identifierValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.identifierValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getIdentifierValueBytes() {
            Object obj = this.identifierValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.identifierValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public NamePart getName(int i) {
            return this.name_.get(i);
        }

        public int getNameCount() {
            return this.name_.size();
        }

        public List<NamePart> getNameList() {
            return this.name_;
        }

        public c getNameOrBuilder(int i) {
            return this.name_.get(i);
        }

        public List<? extends c> getNameOrBuilderList() {
            return this.name_;
        }

        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<UninterpretedOption> getParserForType() {
            return PARSER;
        }

        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = 0;
            for (int i2 = 0; i2 < this.name_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.G(2, this.name_.get(i2));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.identifierValue_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.a0(4, this.positiveIntValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.z(5, this.negativeIntValue_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.j(6, this.doubleValue_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.h(7, this.stringValue_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.aggregateValue_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public ByteString getStringValue() {
            return this.stringValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getNameCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getNameList().hashCode();
            }
            if (hasIdentifierValue()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getIdentifierValue().hashCode();
            }
            if (hasPositiveIntValue()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + d0.i(getPositiveIntValue());
            }
            if (hasNegativeIntValue()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + d0.i(getNegativeIntValue());
            }
            if (hasDoubleValue()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + d0.i(Double.doubleToLongBits(getDoubleValue()));
            }
            if (hasStringValue()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getStringValue().hashCode();
            }
            if (hasAggregateValue()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getAggregateValue().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return DescriptorProtos.R.d(UninterpretedOption.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getNameCount(); i++) {
                if (!getName(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new UninterpretedOption();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.name_.size(); i++) {
                codedOutputStream.K0(2, this.name_.get(i));
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.identifierValue_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.d1(4, this.positiveIntValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.I0(5, this.negativeIntValue_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.s0(6, this.doubleValue_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.q0(7, this.stringValue_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.aggregateValue_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements u {
            public int e;
            public List<NamePart> f;
            public c1<NamePart, NamePart.b, c> g;
            public Object h;
            public long i;
            public long j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public double f9480k;
            public ByteString l;
            public Object m;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof UninterpretedOption) {
                    return z((UninterpretedOption) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b C(double d) {
                this.e |= 16;
                this.f9480k = d;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b F(long j) {
                this.e |= 8;
                this.j = j;
                onChanged();
                return this;
            }

            public b G(long j) {
                this.e |= 4;
                this.i = j;
                onChanged();
                return this;
            }

            public b H(ByteString byteString) {
                byteString.getClass();
                this.e |= 32;
                this.l = byteString;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return DescriptorProtos.Q;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return DescriptorProtos.R.d(UninterpretedOption.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public UninterpretedOption build() {
                UninterpretedOption uninterpretedOptionBuildPartial = buildPartial();
                if (uninterpretedOptionBuildPartial.isInitialized()) {
                    return uninterpretedOptionBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) uninterpretedOptionBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public UninterpretedOption buildPartial() {
                UninterpretedOption uninterpretedOption = new UninterpretedOption(this);
                int i = this.e;
                c1<NamePart, NamePart.b, c> c1Var = this.g;
                if (c1Var == null) {
                    if ((i & 1) != 0) {
                        this.f = Collections.unmodifiableList(this.f);
                        this.e &= -2;
                    }
                    uninterpretedOption.name_ = this.f;
                } else {
                    uninterpretedOption.name_ = c1Var.d();
                }
                int i2 = (i & 2) != 0 ? 1 : 0;
                uninterpretedOption.identifierValue_ = this.h;
                if ((i & 4) != 0) {
                    uninterpretedOption.positiveIntValue_ = this.i;
                    i2 |= 2;
                }
                if ((i & 8) != 0) {
                    uninterpretedOption.negativeIntValue_ = this.j;
                    i2 |= 4;
                }
                if ((i & 16) != 0) {
                    uninterpretedOption.doubleValue_ = this.f9480k;
                    i2 |= 8;
                }
                if ((i & 32) != 0) {
                    i2 |= 16;
                }
                uninterpretedOption.stringValue_ = this.l;
                if ((i & 64) != 0) {
                    i2 |= 32;
                }
                uninterpretedOption.aggregateValue_ = this.m;
                uninterpretedOption.bitField0_ = i2;
                onBuilt();
                return uninterpretedOption;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                c1<NamePart, NamePart.b, c> c1Var = this.g;
                if (c1Var == null) {
                    this.f = Collections.emptyList();
                    this.e &= -2;
                } else {
                    c1Var.e();
                }
                this.h = "";
                int i = this.e;
                this.i = 0L;
                this.j = 0L;
                this.f9480k = 0.0d;
                this.e = i & (-31);
                this.l = ByteString.EMPTY;
                this.m = "";
                this.e = i & (-127);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void v() {
                if ((this.e & 1) == 0) {
                    this.f = new ArrayList(this.f);
                    this.e |= 1;
                }
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public UninterpretedOption getDefaultInstanceForType() {
                return UninterpretedOption.getDefaultInstance();
            }

            public final c1<NamePart, NamePart.b, c> x() {
                if (this.g == null) {
                    this.g = new c1<>(this.f, (this.e & 1) != 0, g(), isClean());
                    this.f = null;
                }
                return this.g;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws Throwable {
                UninterpretedOption uninterpretedOption = null;
                try {
                    try {
                        UninterpretedOption partialFrom = UninterpretedOption.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            z(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        UninterpretedOption uninterpretedOption2 = (UninterpretedOption) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            uninterpretedOption = uninterpretedOption2;
                            if (uninterpretedOption != null) {
                                z(uninterpretedOption);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (uninterpretedOption != null) {
                        z(uninterpretedOption);
                    }
                    throw th;
                }
            }

            public b z(UninterpretedOption uninterpretedOption) {
                if (uninterpretedOption == UninterpretedOption.getDefaultInstance()) {
                    return this;
                }
                if (this.g == null) {
                    if (!uninterpretedOption.name_.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = uninterpretedOption.name_;
                            this.e &= -2;
                        } else {
                            v();
                            this.f.addAll(uninterpretedOption.name_);
                        }
                        onChanged();
                    }
                } else if (!uninterpretedOption.name_.isEmpty()) {
                    if (this.g.j()) {
                        this.g.f();
                        this.g = null;
                        this.f = uninterpretedOption.name_;
                        this.e &= -2;
                        this.g = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                    } else {
                        this.g.b(uninterpretedOption.name_);
                    }
                }
                if (uninterpretedOption.hasIdentifierValue()) {
                    this.e |= 2;
                    this.h = uninterpretedOption.identifierValue_;
                    onChanged();
                }
                if (uninterpretedOption.hasPositiveIntValue()) {
                    G(uninterpretedOption.getPositiveIntValue());
                }
                if (uninterpretedOption.hasNegativeIntValue()) {
                    F(uninterpretedOption.getNegativeIntValue());
                }
                if (uninterpretedOption.hasDoubleValue()) {
                    C(uninterpretedOption.getDoubleValue());
                }
                if (uninterpretedOption.hasStringValue()) {
                    H(uninterpretedOption.getStringValue());
                }
                if (uninterpretedOption.hasAggregateValue()) {
                    this.e |= 64;
                    this.m = uninterpretedOption.aggregateValue_;
                    onChanged();
                }
                mo145mergeUnknownFields(uninterpretedOption.unknownFields);
                onChanged();
                return this;
            }

            public b() {
                this.f = Collections.emptyList();
                this.h = "";
                this.l = ByteString.EMPTY;
                this.m = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = Collections.emptyList();
                this.h = "";
                this.l = ByteString.EMPTY;
                this.m = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(UninterpretedOption uninterpretedOption) {
            return DEFAULT_INSTANCE.toBuilder().z(uninterpretedOption);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private UninterpretedOption(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (UninterpretedOption) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static UninterpretedOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public UninterpretedOption getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().z(this);
        }

        public static UninterpretedOption parseFrom(ByteString byteString, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private UninterpretedOption() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = Collections.emptyList();
            this.identifierValue_ = "";
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
        }

        public static UninterpretedOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static UninterpretedOption parseFrom(byte[] bArr, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, com.google.protobuf.t tVar) throws IOException {
            return (UninterpretedOption) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        private UninterpretedOption(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 18) {
                                if (!(z2 & true)) {
                                    this.name_ = new ArrayList();
                                    z2 = true;
                                }
                                this.name_.add((NamePart) jVar.z(NamePart.PARSER, tVar));
                            } else if (iJ == 26) {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ |= 1;
                                this.identifierValue_ = byteStringQ;
                            } else if (iJ == 32) {
                                this.bitField0_ |= 2;
                                this.positiveIntValue_ = jVar.L();
                            } else if (iJ == 40) {
                                this.bitField0_ |= 4;
                                this.negativeIntValue_ = jVar.y();
                            } else if (iJ == 49) {
                                this.bitField0_ |= 8;
                                this.doubleValue_ = jVar.r();
                            } else if (iJ == 58) {
                                this.bitField0_ |= 16;
                                this.stringValue_ = jVar.q();
                            } else if (iJ != 66) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                ByteString byteStringQ2 = jVar.q();
                                this.bitField0_ = 32 | this.bitField0_;
                                this.aggregateValue_ = byteStringQ2;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.name_ = Collections.unmodifiableList(this.name_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.name_ = Collections.unmodifiableList(this.name_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static UninterpretedOption parseFrom(com.google.protobuf.j jVar) throws IOException {
            return (UninterpretedOption) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static UninterpretedOption parseFrom(com.google.protobuf.j jVar, com.google.protobuf.t tVar) throws IOException {
            return (UninterpretedOption) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public interface b extends s0 {
    }

    public interface c extends s0 {
    }

    public interface d extends s0 {
    }

    public interface e extends s0 {
    }

    public interface f extends s0 {
    }

    public interface g extends s0 {
    }

    public interface h extends s0 {
    }

    public interface i extends s0 {
    }

    public interface j extends s0 {
    }

    public interface k extends s0 {
    }

    public interface l extends s0 {
    }

    public interface m extends s0 {
    }

    public interface n extends s0 {
    }

    public interface o extends s0 {
    }

    public interface p extends s0 {
    }

    public interface q extends s0 {
    }

    public interface r extends s0 {
    }

    public interface s extends s0 {
    }

    public interface t extends s0 {
    }

    public interface u extends s0 {
    }

    static {
        Descriptors.b bVar = c0().m().get(0);
        f9465a = bVar;
        f9466b = new GeneratedMessageV3.e(bVar, new String[]{"File"});
        Descriptors.b bVar2 = c0().m().get(1);
        c = bVar2;
        d = new GeneratedMessageV3.e(bVar2, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", "Service", "Extension", "Options", "SourceCodeInfo", "Syntax"});
        Descriptors.b bVar3 = c0().m().get(2);
        e = bVar3;
        f = new GeneratedMessageV3.e(bVar3, new String[]{"Name", "Field", "Extension", "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options", "ReservedRange", "ReservedName"});
        Descriptors.b bVar4 = bVar3.p().get(0);
        g = bVar4;
        h = new GeneratedMessageV3.e(bVar4, new String[]{"Start", "End", "Options"});
        Descriptors.b bVar5 = bVar3.p().get(1);
        i = bVar5;
        j = new GeneratedMessageV3.e(bVar5, new String[]{"Start", "End"});
        Descriptors.b bVar6 = c0().m().get(3);
        f9467k = bVar6;
        l = new GeneratedMessageV3.e(bVar6, new String[]{"UninterpretedOption"});
        Descriptors.b bVar7 = c0().m().get(4);
        m = bVar7;
        n = new GeneratedMessageV3.e(bVar7, new String[]{"Name", "Number", "Label", "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "JsonName", "Options", "Proto3Optional"});
        Descriptors.b bVar8 = c0().m().get(5);
        o = bVar8;
        p = new GeneratedMessageV3.e(bVar8, new String[]{"Name", "Options"});
        Descriptors.b bVar9 = c0().m().get(6);
        q = bVar9;
        f9468r = new GeneratedMessageV3.e(bVar9, new String[]{"Name", "Value", "Options", "ReservedRange", "ReservedName"});
        Descriptors.b bVar10 = bVar9.p().get(0);
        s = bVar10;
        t = new GeneratedMessageV3.e(bVar10, new String[]{"Start", "End"});
        Descriptors.b bVar11 = c0().m().get(7);
        u = bVar11;
        v = new GeneratedMessageV3.e(bVar11, new String[]{"Name", "Number", "Options"});
        Descriptors.b bVar12 = c0().m().get(8);
        w = bVar12;
        x = new GeneratedMessageV3.e(bVar12, new String[]{"Name", "Method", "Options"});
        Descriptors.b bVar13 = c0().m().get(9);
        y = bVar13;
        z = new GeneratedMessageV3.e(bVar13, new String[]{"Name", "InputType", "OutputType", "Options", "ClientStreaming", "ServerStreaming"});
        Descriptors.b bVar14 = c0().m().get(10);
        A = bVar14;
        B = new GeneratedMessageV3.e(bVar14, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "PhpGenericServices", "Deprecated", "CcEnableArenas", "ObjcClassPrefix", "CsharpNamespace", "SwiftPrefix", "PhpClassPrefix", "PhpNamespace", "PhpMetadataNamespace", "RubyPackage", "UninterpretedOption"});
        Descriptors.b bVar15 = c0().m().get(11);
        C = bVar15;
        D = new GeneratedMessageV3.e(bVar15, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "MapEntry", "UninterpretedOption"});
        Descriptors.b bVar16 = c0().m().get(12);
        E = bVar16;
        F = new GeneratedMessageV3.e(bVar16, new String[]{"Ctype", "Packed", "Jstype", "Lazy", "Deprecated", "Weak", "UninterpretedOption"});
        Descriptors.b bVar17 = c0().m().get(13);
        G = bVar17;
        H = new GeneratedMessageV3.e(bVar17, new String[]{"UninterpretedOption"});
        Descriptors.b bVar18 = c0().m().get(14);
        I = bVar18;
        J = new GeneratedMessageV3.e(bVar18, new String[]{"AllowAlias", "Deprecated", "UninterpretedOption"});
        Descriptors.b bVar19 = c0().m().get(15);
        K = bVar19;
        L = new GeneratedMessageV3.e(bVar19, new String[]{"Deprecated", "UninterpretedOption"});
        Descriptors.b bVar20 = c0().m().get(16);
        M = bVar20;
        N = new GeneratedMessageV3.e(bVar20, new String[]{"Deprecated", "UninterpretedOption"});
        Descriptors.b bVar21 = c0().m().get(17);
        O = bVar21;
        P = new GeneratedMessageV3.e(bVar21, new String[]{"Deprecated", "IdempotencyLevel", "UninterpretedOption"});
        Descriptors.b bVar22 = c0().m().get(18);
        Q = bVar22;
        R = new GeneratedMessageV3.e(bVar22, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        Descriptors.b bVar23 = bVar22.p().get(0);
        S = bVar23;
        T = new GeneratedMessageV3.e(bVar23, new String[]{"NamePart", "IsExtension"});
        Descriptors.b bVar24 = c0().m().get(19);
        U = bVar24;
        V = new GeneratedMessageV3.e(bVar24, new String[]{SimpleRequest.LOCATION});
        Descriptors.b bVar25 = bVar24.p().get(0);
        W = bVar25;
        X = new GeneratedMessageV3.e(bVar25, new String[]{"Path", "Span", "LeadingComments", "TrailingComments", "LeadingDetachedComments"});
        Descriptors.b bVar26 = c0().m().get(20);
        Y = bVar26;
        Z = new GeneratedMessageV3.e(bVar26, new String[]{"Annotation"});
        Descriptors.b bVar27 = bVar26.p().get(0);
        a0 = bVar27;
        b0 = new GeneratedMessageV3.e(bVar27, new String[]{"Path", "SourceFile", "Begin", "End"});
    }

    public static Descriptors.FileDescriptor c0() {
        return c0;
    }
}
