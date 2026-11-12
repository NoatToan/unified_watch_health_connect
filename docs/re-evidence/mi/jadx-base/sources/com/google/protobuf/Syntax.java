package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public enum Syntax implements z0 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private final int value;
    private static final d0.d<Syntax> internalValueMap = new d0.d<Syntax>() { // from class: com.google.protobuf.Syntax.a
        @Override // com.google.protobuf.d0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Syntax findValueByNumber(int i) {
            return Syntax.forNumber(i);
        }
    };
    private static final Syntax[] VALUES = values();

    Syntax(int i) {
        this.value = i;
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static final Descriptors.d getDescriptor() {
        return o1.a().l().get(0);
    }

    public static d0.d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.d getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Descriptors.e getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().l().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static Syntax valueOf(Descriptors.e eVar) {
        if (eVar.i() == getDescriptor()) {
            if (eVar.h() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[eVar.h()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
