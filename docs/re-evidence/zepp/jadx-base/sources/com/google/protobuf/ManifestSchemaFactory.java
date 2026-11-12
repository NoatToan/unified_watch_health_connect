package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class ManifestSchemaFactory implements u {
    private static final k EMPTY_FACTORY = new k() { // from class: com.google.protobuf.ManifestSchemaFactory.1
        @Override // com.google.protobuf.k
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.k
        public j messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final k messageInfoFactory;

    public static class CompositeMessageInfoFactory implements k {
        private k[] factories;

        public CompositeMessageInfoFactory(k... kVarArr) {
            this.factories = kVarArr;
        }

        @Override // com.google.protobuf.k
        public boolean isSupported(Class<?> cls) {
            for (k kVar : this.factories) {
                if (kVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.k
        public j messageInfoFor(Class<?> cls) {
            for (k kVar : this.factories) {
                if (kVar.isSupported(cls)) {
                    return kVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private static k getDefaultMessageInfoFactory() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static k getDescriptorMessageInfoFactory() {
        try {
            return (k) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(j jVar) {
        return jVar.getSyntax() == ProtoSyntax.PROTO2;
    }

    private static <T> t<T> newSchema(Class<T> cls, j jVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return isProto2(jVar) ? MessageSchema.newSchema(cls, jVar, n.b(), ListFieldSchema.lite(), v.S(), f.b(), i.b()) : MessageSchema.newSchema(cls, jVar, n.b(), ListFieldSchema.lite(), v.S(), null, i.b());
        }
        return isProto2(jVar) ? MessageSchema.newSchema(cls, jVar, n.a(), ListFieldSchema.full(), v.K(), f.a(), i.a()) : MessageSchema.newSchema(cls, jVar, n.a(), ListFieldSchema.full(), v.L(), null, i.a());
    }

    @Override // com.google.protobuf.u
    public <T> t<T> createSchema(Class<T> cls) {
        v.M(cls);
        j jVarMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (jVarMessageInfoFor.isMessageSetWireFormat()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? MessageSetSchema.newSchema(v.S(), f.b(), jVarMessageInfoFor.getDefaultInstance()) : MessageSetSchema.newSchema(v.K(), f.a(), jVarMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, jVarMessageInfoFor);
    }

    private ManifestSchemaFactory(k kVar) {
        this.messageInfoFactory = (k) Internal.b(kVar, "messageInfoFactory");
    }
}
