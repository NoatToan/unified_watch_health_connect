package com.google.protobuf;

import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public enum Syntax implements ProtocolMessageEnum {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = new Internal.EnumLiteMap<Syntax>() { // from class: com.google.protobuf.Syntax.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Syntax findValueByNumber(int i14) {
            return Syntax.forNumber(i14);
        }
    };
    private static final Syntax[] VALUES = values();

    Syntax(int i14) {
        this.value = i14;
    }

    public static Syntax forNumber(int i14) {
        if (i14 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i14 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i14 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return TypeProto.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Syntax valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
    public static Syntax valueOf(int i14) {
        return forNumber(i14);
    }
}
