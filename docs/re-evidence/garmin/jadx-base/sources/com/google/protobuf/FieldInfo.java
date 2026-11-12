package com.google.protobuf;

import am.j;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class FieldInfo implements Comparable<FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final OneofInfo oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    /* JADX INFO: renamed from: com.google.protobuf.FieldInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[FieldType.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i14, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i15, boolean z14, boolean z15, OneofInfo oneofInfo, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = fieldType;
        this.messageClass = cls;
        this.fieldNumber = i14;
        this.presenceField = field2;
        this.presenceMask = i15;
        this.required = z14;
        this.enforceUtf8 = z15;
        this.oneof = oneofInfo;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i14) {
        if (i14 > 0) {
            return;
        }
        h.s(j.h(i14, "fieldNumber must be positive: "));
    }

    public static FieldInfo forExplicitPresenceField(java.lang.reflect.Field field, int i14, FieldType fieldType, java.lang.reflect.Field field2, int i15, boolean z14, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i15)) {
            return new FieldInfo(field, i14, fieldType, null, field2, i15, false, z14, null, null, null, enumVerifier, null);
        }
        h.s(j.h(i15, "presenceMask must have exactly one bit set: "));
        return null;
    }

    public static FieldInfo forField(java.lang.reflect.Field field, int i14, FieldType fieldType, boolean z14) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i14, fieldType, null, null, 0, false, z14, null, null, null, null, null);
        }
        h.z("Shouldn't be called for repeated message fields.");
        return null;
    }

    public static FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int i14, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i14, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo forLegacyRequiredField(java.lang.reflect.Field field, int i14, FieldType fieldType, java.lang.reflect.Field field2, int i15, boolean z14, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i15)) {
            return new FieldInfo(field, i14, fieldType, null, field2, i15, true, z14, null, null, null, enumVerifier, null);
        }
        h.s(j.h(i15, "presenceMask must have exactly one bit set: "));
        return null;
    }

    public static FieldInfo forMapField(java.lang.reflect.Field field, int i14, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i14, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo forOneofMemberField(int i14, FieldType fieldType, OneofInfo oneofInfo, Class<?> cls, boolean z14, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i14);
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(oneofInfo, "oneof");
        Internal.checkNotNull(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new FieldInfo(null, i14, fieldType, null, null, 0, false, z14, oneofInfo, cls, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i14 + " is of type " + fieldType);
    }

    public static FieldInfo forPackedField(java.lang.reflect.Field field, int i14, FieldType fieldType, java.lang.reflect.Field field2) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i14, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        h.z("Shouldn't be called for repeated message fields.");
        return null;
    }

    public static FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i14, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i14, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int i14, FieldType fieldType, Class<?> cls) {
        checkFieldNumber(i14);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(cls, "messageClass");
        return new FieldInfo(field, i14, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i14) {
        return i14 != 0 && (i14 & (i14 + (-1))) == 0;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i14 = AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i14 == 1 || i14 == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i14 == 3 || i14 == 4) {
            return this.messageClass;
        }
        return null;
    }

    public OneofInfo getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public FieldType getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private OneofInfo oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public FieldInfo build() {
            OneofInfo oneofInfo = this.oneof;
            if (oneofInfo != null) {
                return FieldInfo.forOneofMemberField(this.fieldNumber, this.type, oneofInfo, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                boolean z14 = this.required;
                java.lang.reflect.Field field2 = this.field;
                return z14 ? FieldInfo.forLegacyRequiredField(field2, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : FieldInfo.forExplicitPresenceField(field2, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            java.lang.reflect.Field field3 = this.cachedSizeField;
            if (enumVerifier != null) {
                java.lang.reflect.Field field4 = this.field;
                return field3 == null ? FieldInfo.forFieldWithEnumVerifier(field4, this.fieldNumber, this.type, enumVerifier) : FieldInfo.forPackedFieldWithEnumVerifier(field4, this.fieldNumber, this.type, enumVerifier, field3);
            }
            java.lang.reflect.Field field5 = this.field;
            return field3 == null ? FieldInfo.forField(field5, this.fieldNumber, this.type, this.enforceUtf8) : FieldInfo.forPackedField(field5, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z14) {
            this.enforceUtf8 = z14;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            if (this.oneof == null) {
                this.field = field;
                return this;
            }
            h.z("Cannot set field when building a oneof.");
            return null;
        }

        public Builder withFieldNumber(int i14) {
            this.fieldNumber = i14;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(OneofInfo oneofInfo, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                h.z("Cannot set oneof when field or presenceField have been provided");
                return null;
            }
            this.oneof = oneofInfo;
            this.oneofStoredType = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i14) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i14;
            return this;
        }

        public Builder withRequired(boolean z14) {
            this.required = z14;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldInfo fieldInfo) {
        return this.fieldNumber - fieldInfo.fieldNumber;
    }
}
