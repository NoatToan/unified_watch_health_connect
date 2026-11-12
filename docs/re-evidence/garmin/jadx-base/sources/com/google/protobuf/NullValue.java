package com.google.protobuf;

import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public enum NullValue implements ProtocolMessageEnum {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = new Internal.EnumLiteMap<NullValue>() { // from class: com.google.protobuf.NullValue.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public NullValue findValueByNumber(int i14) {
            return NullValue.forNumber(i14);
        }
    };
    private static final NullValue[] VALUES = values();

    NullValue(int i14) {
        this.value = i14;
    }

    public static NullValue forNumber(int i14) {
        if (i14 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return StructProto.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static NullValue valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return enumValueDescriptor.getIndex() == -1 ? UNRECOGNIZED : VALUES[enumValueDescriptor.getIndex()];
        }
        h.s("EnumValueDescriptor is not for this type.");
        return null;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        h.s("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        h.z("Can't get the descriptor of an unrecognized enum value.");
        return null;
    }

    @Deprecated
    public static NullValue valueOf(int i14) {
        return forNumber(i14);
    }
}
