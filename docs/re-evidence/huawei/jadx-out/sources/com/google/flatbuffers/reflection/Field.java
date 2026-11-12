package com.google.flatbuffers.reflection;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes21.dex */
public final class Field extends Table {
    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static Field getRootAsField(ByteBuffer byteBuffer) {
        return getRootAsField(byteBuffer, new Field());
    }

    public static Field getRootAsField(ByteBuffer byteBuffer, Field field) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return field.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public Field __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public String name() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public Type type() {
        return type(new Type());
    }

    public Type type(Type type) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return type.__assign(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public int id() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos) & 65535;
        }
        return 0;
    }

    public int offset() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos) & 65535;
        }
        return 0;
    }

    public long defaultInteger() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public double defaultReal() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.bb.getDouble(i__offset + this.bb_pos);
        }
        return 0.0d;
    }

    public boolean deprecated() {
        int i__offset = __offset(16);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean required() {
        int i__offset = __offset(18);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean key() {
        int i__offset = __offset(20);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public KeyValue attributes(int i) {
        return attributes(new KeyValue(), i);
    }

    public KeyValue attributes(KeyValue keyValue, int i) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return keyValue.__assign(__indirect(__vector(i__offset) + (i * 4)), this.bb);
        }
        return null;
    }

    public int attributesLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public KeyValue attributesByKey(String str) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return KeyValue.__lookup_by_key(null, __vector(i__offset), str, this.bb);
        }
        return null;
    }

    public KeyValue attributesByKey(KeyValue keyValue, String str) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return KeyValue.__lookup_by_key(keyValue, __vector(i__offset), str, this.bb);
        }
        return null;
    }

    public KeyValue.Vector attributesVector() {
        return attributesVector(new KeyValue.Vector());
    }

    public KeyValue.Vector attributesVector(KeyValue.Vector vector) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public String documentation(int i) {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (i * 4));
        }
        return null;
    }

    public int documentationLength() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public StringVector documentationVector() {
        return documentationVector(new StringVector());
    }

    public StringVector documentationVector(StringVector stringVector) {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public boolean optional() {
        int i__offset = __offset(26);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public int padding() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos) & 65535;
        }
        return 0;
    }

    public boolean offset64() {
        int i__offset = __offset(30);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static int createField(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, long j, double d, boolean z, boolean z2, boolean z3, int i5, int i6, boolean z4, int i7, boolean z5) {
        flatBufferBuilder.startTable(14);
        addDefaultReal(flatBufferBuilder, d);
        addDefaultInteger(flatBufferBuilder, j);
        addDocumentation(flatBufferBuilder, i6);
        addAttributes(flatBufferBuilder, i5);
        addType(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        addPadding(flatBufferBuilder, i7);
        addOffset(flatBufferBuilder, i4);
        addId(flatBufferBuilder, i3);
        addOffset64(flatBufferBuilder, z5);
        addOptional(flatBufferBuilder, z4);
        addKey(flatBufferBuilder, z3);
        addRequired(flatBufferBuilder, z2);
        addDeprecated(flatBufferBuilder, z);
        return endField(flatBufferBuilder);
    }

    public static void startField(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(14);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(i);
        flatBufferBuilder.slot(0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addId(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(2, (short) i, 0);
    }

    public static void addOffset(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(3, (short) i, 0);
    }

    public static void addDefaultInteger(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(4, j, 0L);
    }

    public static void addDefaultReal(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(5, d, 0.0d);
    }

    public static void addDeprecated(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(6, z, false);
    }

    public static void addRequired(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(7, z, false);
    }

    public static void addKey(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(8, z, false);
    }

    public static void addAttributes(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(9, i, 0);
    }

    public static int createAttributesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startAttributesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void addDocumentation(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(10, i, 0);
    }

    public static int createDocumentationVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startDocumentationVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void addOptional(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(11, z, false);
    }

    public static void addPadding(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(12, (short) i, 0);
    }

    public static void addOffset64(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(13, z, false);
    }

    public static int endField(FlatBufferBuilder flatBufferBuilder) {
        int iEndTable = flatBufferBuilder.endTable();
        flatBufferBuilder.required(iEndTable, 4);
        flatBufferBuilder.required(iEndTable, 6);
        return iEndTable;
    }

    @Override // com.google.flatbuffers.Table
    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return compareStrings(__offset(4, num.intValue(), byteBuffer), __offset(4, num2.intValue(), byteBuffer), byteBuffer);
    }

    public static Field __lookup_by_key(Field field, int i, String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i2 = byteBuffer.getInt(i - 4);
        int i3 = 0;
        while (i2 != 0) {
            int i4 = i2 / 2;
            int i__indirect = __indirect(((i3 + i4) * 4) + i, byteBuffer);
            int iCompareStrings = compareStrings(__offset(4, byteBuffer.capacity() - i__indirect, byteBuffer), bytes, byteBuffer);
            if (iCompareStrings > 0) {
                i2 = i4;
            } else {
                if (iCompareStrings >= 0) {
                    if (field == null) {
                        field = new Field();
                    }
                    return field.__assign(i__indirect, byteBuffer);
                }
                int i5 = i4 + 1;
                i3 += i5;
                i2 -= i5;
            }
        }
        return null;
    }

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public Field get(int i) {
            return get(new Field(), i);
        }

        public Field get(Field field, int i) {
            return field.__assign(Field.__indirect(__element(i), this.bb), this.bb);
        }

        public Field getByKey(String str) {
            return Field.__lookup_by_key(null, __vector(), str, this.bb);
        }

        public Field getByKey(Field field, String str) {
            return Field.__lookup_by_key(field, __vector(), str, this.bb);
        }
    }
}
