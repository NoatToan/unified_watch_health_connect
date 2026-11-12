package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Descriptors.b f9633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageV3.e f9634b;
    public static final Descriptors.b c;
    public static final GeneratedMessageV3.e d;
    public static final Descriptors.b e;
    public static final GeneratedMessageV3.e f;
    public static Descriptors.FileDescriptor g = Descriptors.FileDescriptor.s(new String[]{"\n\u0019google/protobuf/api.proto\u0012\u000fgoogle.protobuf\u001a$google/protobuf/source_context.proto\u001a\u001agoogle/protobuf/type.proto\"\u0081\u0002\n\u0003Api\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012(\n\u0007methods\u0018\u0002 \u0003(\u000b2\u0017.google.protobuf.Method\u0012(\n\u0007options\u0018\u0003 \u0003(\u000b2\u0017.google.protobuf.Option\u0012\u000f\n\u0007version\u0018\u0004 \u0001(\t\u00126\n\u000esource_context\u0018\u0005 \u0001(\u000b2\u001e.google.protobuf.SourceContext\u0012&\n\u0006mixins\u0018\u0006 \u0003(\u000b2\u0016.google.protobuf.Mixin\u0012'\n\u0006syntax\u0018\u0007 \u0001(\u000e2\u0017.google.protobuf.Syntax\"Õ\u0001\n\u0006Method\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010request_type_url\u0018\u0002 \u0001(\t\u0012\u0019\n\u0011request_streaming\u0018\u0003 \u0001(\b\u0012\u0019\n\u0011response_type_url\u0018\u0004 \u0001(\t\u0012\u001a\n\u0012response_streaming\u0018\u0005 \u0001(\b\u0012(\n\u0007options\u0018\u0006 \u0003(\u000b2\u0017.google.protobuf.Option\u0012'\n\u0006syntax\u0018\u0007 \u0001(\u000e2\u0017.google.protobuf.Syntax\"#\n\u0005Mixin\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\f\n\u0004root\u0018\u0002 \u0001(\tBv\n\u0013com.google.protobufB\bApiProtoP\u0001Z,google.golang.org/protobuf/types/known/apipb¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[]{j1.a(), o1.a()});

    static {
        Descriptors.b bVar = a().m().get(0);
        f9633a = bVar;
        f9634b = new GeneratedMessageV3.e(bVar, new String[]{"Name", "Methods", "Options", "Version", "SourceContext", "Mixins", "Syntax"});
        Descriptors.b bVar2 = a().m().get(1);
        c = bVar2;
        d = new GeneratedMessageV3.e(bVar2, new String[]{"Name", "RequestTypeUrl", "RequestStreaming", "ResponseTypeUrl", "ResponseStreaming", "Options", "Syntax"});
        Descriptors.b bVar3 = a().m().get(2);
        e = bVar3;
        f = new GeneratedMessageV3.e(bVar3, new String[]{"Name", "Root"});
        j1.a();
        o1.a();
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }
}
