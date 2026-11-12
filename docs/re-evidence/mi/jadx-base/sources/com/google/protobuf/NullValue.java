package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public enum NullValue implements z0 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private final int value;
    private static final d0.d<NullValue> internalValueMap = new d0.d<NullValue>() { // from class: com.google.protobuf.NullValue.a
        @Override // com.google.protobuf.d0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NullValue findValueByNumber(int i) {
            return NullValue.forNumber(i);
        }
    };
    private static final NullValue[] VALUES = values();

    NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static final Descriptors.d getDescriptor() {
        return k1.a().l().get(0);
    }

    public static d0.d<NullValue> internalGetValueMap() {
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
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }

    public static NullValue valueOf(Descriptors.e eVar) {
        if (eVar.i() == getDescriptor()) {
            if (eVar.h() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[eVar.h()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
