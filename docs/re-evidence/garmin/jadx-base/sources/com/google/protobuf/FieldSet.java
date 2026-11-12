package com.google.protobuf;

import androidx.room.a0;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.f;
import o2.c;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: renamed from: com.google.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
        this.fields = SmallSortedMap.newFieldMap(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> SmallSortedMap<T, Object> cloneAllFieldsMap(SmallSortedMap<T, Object> smallSortedMap, boolean z14) {
        SmallSortedMap<T, Object> smallSortedMapNewFieldMap = SmallSortedMap.newFieldMap(16);
        for (int i14 = 0; i14 < smallSortedMap.getNumArrayEntries(); i14++) {
            cloneFieldEntry(smallSortedMapNewFieldMap, smallSortedMap.getArrayEntryAt(i14), z14);
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(smallSortedMapNewFieldMap, (Map.Entry) it.next(), z14);
        }
        return smallSortedMapNewFieldMap;
    }

    private static <T extends FieldDescriptorLite<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z14) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            map.put(key, ((LazyField) value).getValue());
        } else if (z14 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeElementSize(WireFormat.FieldType fieldType, int i14, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i14);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    public static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                f.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        List list = (List) obj;
        int iComputeElementSize = 0;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it.next());
            }
            return iComputeElementSize;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            iComputeElementSize += computeElementSizeNoTag(liteType, it3.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSize) + CodedOutputStream.computeTagSize(number) + iComputeElementSize;
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return computeFieldSize(key, value);
        }
        return value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
    }

    public static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z14) {
        if (z14) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return isMessageFieldValueInitialized(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!isMessageFieldValueInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        h.s("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof Internal.EnumLite);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof LazyField);
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.fields.put(key, cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put(key, cloneIfMutable(value));
        } else {
            this.fields.put(key, key.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
        }
    }

    public static <T extends FieldDescriptorLite<T>> Builder<T> newBuilder() {
        return new Builder<>((AnonymousClass1) null);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z14) {
        return z14 ? WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT) : WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    private void verifyType(T t7, Object obj) {
        if (isValidType(t7.getLiteType(), obj)) {
            return;
        }
        e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t7.getNumber()), t7.getLiteType().getJavaType(), obj.getClass().getName()});
    }

    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i14, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i14, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i14, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    public static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                writeElement(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
                return;
            } else {
                writeElement(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            codedOutputStream.writeTag(number, 2);
            Iterator it3 = list.iterator();
            int iComputeElementSizeNoTag = 0;
            while (it3.hasNext()) {
                iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it3.next());
            }
            codedOutputStream.writeUInt32NoTag(iComputeElementSizeNoTag);
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                writeElementNoTag(codedOutputStream, liteType, it4.next());
            }
        }
    }

    private void writeMessageSetTo(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            writeField(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof LazyField)) {
            codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (MessageLite) value);
        } else {
            codedOutputStream.writeRawMessageSetExtension(entry.getKey().getNumber(), ((LazyField) value).toByteString());
        }
    }

    public void addRepeatedField(T t7, Object obj) {
        List arrayList;
        if (!t7.isRepeated()) {
            h.s("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        verifyType(t7, obj);
        Object field = getField(t7);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put(t7, arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(T t7) {
        this.fields.remove(t7);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> m126clone() {
        SmallSortedMap<T, Object> smallSortedMap;
        FieldSet<T> fieldSetNewFieldSet = newFieldSet();
        int i14 = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            smallSortedMap = this.fields;
            if (i14 >= numArrayEntries) {
                break;
            }
            Map.Entry<K, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i14);
            fieldSetNewFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i14++;
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fieldSetNewFieldSet.setField((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetNewFieldSet.hasLazyField = this.hasLazyField;
        return fieldSetNewFieldSet;
    }

    public Iterator<Map.Entry<T, Object>> descendingIterator() {
        boolean z14 = this.hasLazyField;
        SmallSortedMap<T, Object> smallSortedMap = this.fields;
        return z14 ? new LazyField.LazyIterator(smallSortedMap.descendingEntrySet().iterator()) : smallSortedMap.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.fields.equals(((FieldSet) obj).fields);
        }
        return false;
    }

    public Map<T, Object> getAllFields() {
        boolean z14 = this.hasLazyField;
        SmallSortedMap<T, Object> smallSortedMap = this.fields;
        if (!z14) {
            boolean zIsImmutable = smallSortedMap.isImmutable();
            SmallSortedMap<T, Object> smallSortedMap2 = this.fields;
            return zIsImmutable ? smallSortedMap2 : Collections.unmodifiableMap(smallSortedMap2);
        }
        SmallSortedMap smallSortedMapCloneAllFieldsMap = cloneAllFieldsMap(smallSortedMap, false);
        if (this.fields.isImmutable()) {
            smallSortedMapCloneAllFieldsMap.makeImmutable();
        }
        return smallSortedMapCloneAllFieldsMap;
    }

    public Object getField(T t7) {
        Object obj = this.fields.get(t7);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public Object getRepeatedField(T t7, int i14) {
        if (!t7.isRepeated()) {
            h.s("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object field = getField(t7);
        if (field != null) {
            return ((List) field).get(i14);
        }
        c.q();
        return null;
    }

    public int getRepeatedFieldCount(T t7) {
        if (!t7.isRepeated()) {
            h.s("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object field = getField(t7);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        SmallSortedMap<T, Object> smallSortedMap;
        int i14 = 0;
        int iComputeFieldSize = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            smallSortedMap = this.fields;
            if (i14 >= numArrayEntries) {
                break;
            }
            Map.Entry<K, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i14);
            iComputeFieldSize += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i14++;
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(T t7) {
        if (!t7.isRepeated()) {
            return this.fields.get(t7) != null;
        }
        h.s("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        boolean z14 = this.hasLazyField;
        SmallSortedMap<T, Object> smallSortedMap = this.fields;
        return z14 ? new LazyField.LazyIterator(smallSortedMap.entrySet().iterator()) : smallSortedMap.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        int i14 = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (i14 >= numArrayEntries) {
                smallSortedMap.makeImmutable();
                this.isImmutable = true;
                return;
            } else {
                Map.Entry<K, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i14);
                if (arrayEntryAt.getValue() instanceof GeneratedMessageLite) {
                    ((GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
                }
                i14++;
            }
        }
    }

    public void mergeFrom(FieldSet<T> fieldSet) {
        SmallSortedMap<T, Object> smallSortedMap;
        int i14 = 0;
        while (true) {
            int numArrayEntries = fieldSet.fields.getNumArrayEntries();
            smallSortedMap = fieldSet.fields;
            if (i14 >= numArrayEntries) {
                break;
            }
            mergeFromField(smallSortedMap.getArrayEntryAt(i14));
            i14++;
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((Map.Entry) it.next());
        }
    }

    public void setField(T t7, Object obj) {
        if (!t7.isRepeated()) {
            verifyType(t7, obj);
        } else {
            if (!(obj instanceof List)) {
                h.s("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(t7, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put(t7, obj);
    }

    public void setRepeatedField(T t7, int i14, Object obj) {
        if (!t7.isRepeated()) {
            h.s("getRepeatedField() can only be called on repeated fields.");
            return;
        }
        Object field = getField(t7);
        if (field == null) {
            c.q();
        } else {
            verifyType(t7, obj);
            ((List) field).set(i14, obj);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        SmallSortedMap<T, Object> smallSortedMap;
        int i14 = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            smallSortedMap = this.fields;
            if (i14 >= numArrayEntries) {
                break;
            }
            Map.Entry<K, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i14);
            writeField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
            i14++;
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            writeField((FieldDescriptorLite) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public static final class Builder<T extends FieldDescriptorLite<T>> {
        private SmallSortedMap<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        private Builder() {
            this(SmallSortedMap.newFieldMap(16));
        }

        private FieldSet<T> buildImpl(boolean z14) {
            if (this.fields.isEmpty()) {
                return FieldSet.emptySet();
            }
            this.isMutable = false;
            SmallSortedMap<T, Object> smallSortedMapCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMapCloneAllFieldsMap = FieldSet.cloneAllFieldsMap(smallSortedMapCloneAllFieldsMap, false);
                replaceBuilders(smallSortedMapCloneAllFieldsMap, z14);
            }
            FieldSet<T> fieldSet = new FieldSet<>(smallSortedMapCloneAllFieldsMap, null);
            ((FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = FieldSet.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public static <T extends FieldDescriptorLite<T>> Builder<T> fromFieldSet(FieldSet<T> fieldSet) {
            Builder<T> builder = new Builder<>(FieldSet.cloneAllFieldsMap(((FieldSet) fieldSet).fields, true));
            ((Builder) builder).hasLazyField = ((FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            if (key.isRepeated()) {
                List arrayList = (List) getFieldAllowBuilders(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.fields.put(key, arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(FieldSet.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                this.fields.put(key, FieldSet.cloneIfMutable(value));
                return;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put(key, FieldSet.cloneIfMutable(value));
            } else if (fieldAllowBuilders instanceof MessageLite.Builder) {
                key.internalMergeFrom((MessageLite.Builder) fieldAllowBuilders, (MessageLite) value);
            } else {
                this.fields.put(key, key.internalMergeFrom(((MessageLite) fieldAllowBuilders).toBuilder(), (MessageLite) value).build());
            }
        }

        private static Object replaceBuilder(Object obj, boolean z14) {
            if (!(obj instanceof MessageLite.Builder)) {
                return obj;
            }
            MessageLite.Builder builder = (MessageLite.Builder) obj;
            return z14 ? builder.buildPartial() : builder.build();
        }

        private static <T extends FieldDescriptorLite<T>> Object replaceBuilders(T t7, Object obj, boolean z14) {
            if (obj == null || t7.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (!t7.isRepeated()) {
                return replaceBuilder(obj, z14);
            }
            if (!(obj instanceof List)) {
                a0.s(obj.getClass(), "Repeated field should contains a List but actually contains type: ");
                return null;
            }
            List arrayList = (List) obj;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                Object obj2 = arrayList.get(i14);
                Object objReplaceBuilder = replaceBuilder(obj2, z14);
                if (objReplaceBuilder != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i14, objReplaceBuilder);
                }
            }
            return arrayList;
        }

        private void verifyType(T t7, Object obj) {
            if (FieldSet.isValidType(t7.getLiteType(), obj)) {
                return;
            }
            if (t7.getLiteType().getJavaType() == WireFormat.JavaType.MESSAGE && (obj instanceof MessageLite.Builder)) {
                return;
            }
            e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t7.getNumber()), t7.getLiteType().getJavaType(), obj.getClass().getName()});
        }

        public void addRepeatedField(T t7, Object obj) {
            List arrayList;
            ensureIsMutable();
            if (!t7.isRepeated()) {
                h.s("addRepeatedField() can only be called on repeated fields.");
                return;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            verifyType(t7, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(t7);
            if (fieldAllowBuilders == null) {
                arrayList = new ArrayList();
                this.fields.put(t7, arrayList);
            } else {
                arrayList = (List) fieldAllowBuilders;
            }
            arrayList.add(obj);
        }

        public FieldSet<T> build() {
            return buildImpl(false);
        }

        public FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(T t7) {
            ensureIsMutable();
            this.fields.remove(t7);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            boolean z14 = this.hasLazyField;
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (!z14) {
                boolean zIsImmutable = smallSortedMap.isImmutable();
                SmallSortedMap<T, Object> smallSortedMap2 = this.fields;
                return zIsImmutable ? smallSortedMap2 : Collections.unmodifiableMap(smallSortedMap2);
            }
            SmallSortedMap smallSortedMapCloneAllFieldsMap = FieldSet.cloneAllFieldsMap(smallSortedMap, false);
            if (this.fields.isImmutable()) {
                smallSortedMapCloneAllFieldsMap.makeImmutable();
                return smallSortedMapCloneAllFieldsMap;
            }
            replaceBuilders(smallSortedMapCloneAllFieldsMap, true);
            return smallSortedMapCloneAllFieldsMap;
        }

        public Object getField(T t7) {
            return replaceBuilders(t7, getFieldAllowBuilders(t7), true);
        }

        public Object getFieldAllowBuilders(T t7) {
            Object obj = this.fields.get(t7);
            return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
        }

        public Object getRepeatedField(T t7, int i14) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t7, i14), true);
        }

        public Object getRepeatedFieldAllowBuilders(T t7, int i14) {
            if (!t7.isRepeated()) {
                h.s("getRepeatedField() can only be called on repeated fields.");
                return null;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t7);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i14);
            }
            c.q();
            return null;
        }

        public int getRepeatedFieldCount(T t7) {
            if (!t7.isRepeated()) {
                h.s("getRepeatedFieldCount() can only be called on repeated fields.");
                return 0;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t7);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }

        public boolean hasField(T t7) {
            if (!t7.isRepeated()) {
                return this.fields.get(t7) != null;
            }
            h.s("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public boolean isInitialized() {
            int i14 = 0;
            while (true) {
                int numArrayEntries = this.fields.getNumArrayEntries();
                SmallSortedMap<T, Object> smallSortedMap = this.fields;
                if (i14 >= numArrayEntries) {
                    Iterator it = smallSortedMap.getOverflowEntries().iterator();
                    while (it.hasNext()) {
                        if (!FieldSet.isInitialized((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                    return true;
                }
                if (!FieldSet.isInitialized(smallSortedMap.getArrayEntryAt(i14))) {
                    return false;
                }
                i14++;
            }
        }

        public void mergeFrom(FieldSet<T> fieldSet) {
            ensureIsMutable();
            for (int i14 = 0; i14 < ((FieldSet) fieldSet).fields.getNumArrayEntries(); i14++) {
                mergeFromField(((FieldSet) fieldSet).fields.getArrayEntryAt(i14));
            }
            Iterator it = ((FieldSet) fieldSet).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t7, Object obj) {
            ensureIsMutable();
            if (!t7.isRepeated()) {
                verifyType(t7, obj);
            } else {
                if (!(obj instanceof List)) {
                    h.s("Wrong object type used with protocol message reflection.");
                    return;
                }
                ArrayList arrayList = new ArrayList((List) obj);
                for (Object obj2 : arrayList) {
                    verifyType(t7, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof MessageLite.Builder);
                }
                obj = arrayList;
            }
            if (obj instanceof LazyField) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            this.fields.put(t7, obj);
        }

        public void setRepeatedField(T t7, int i14, Object obj) {
            ensureIsMutable();
            if (!t7.isRepeated()) {
                h.s("getRepeatedField() can only be called on repeated fields.");
                return;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            Object fieldAllowBuilders = getFieldAllowBuilders(t7);
            if (fieldAllowBuilders == null) {
                c.q();
            } else {
                verifyType(t7, obj);
                ((List) fieldAllowBuilders).set(i14, obj);
            }
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder(SmallSortedMap<T, Object> smallSortedMap) {
            this.fields = smallSortedMap;
            this.isMutable = true;
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean z14) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z14));
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(SmallSortedMap<T, Object> smallSortedMap, boolean z14) {
            for (int i14 = 0; i14 < smallSortedMap.getNumArrayEntries(); i14++) {
                replaceBuilders(smallSortedMap.getArrayEntryAt(i14), z14);
            }
            Iterator it = smallSortedMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next(), z14);
            }
        }
    }

    public /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    private FieldSet(boolean z14) {
        this(SmallSortedMap.newFieldMap(0));
        makeImmutable();
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }

    public boolean isInitialized() {
        int i14 = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (i14 < numArrayEntries) {
                if (!isInitialized(smallSortedMap.getArrayEntryAt(i14))) {
                    return false;
                }
                i14++;
            } else {
                Iterator it = smallSortedMap.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!isInitialized((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public int getMessageSetSerializedSize() {
        SmallSortedMap<T, Object> smallSortedMap;
        int i14 = 0;
        int messageSetSerializedSize = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            smallSortedMap = this.fields;
            if (i14 >= numArrayEntries) {
                break;
            }
            messageSetSerializedSize += getMessageSetSerializedSize(smallSortedMap.getArrayEntryAt(i14));
            i14++;
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((Map.Entry) it.next());
        }
        return messageSetSerializedSize;
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) {
        SmallSortedMap<T, Object> smallSortedMap;
        int i14 = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            smallSortedMap = this.fields;
            if (i14 >= numArrayEntries) {
                break;
            }
            writeMessageSetTo(smallSortedMap.getArrayEntryAt(i14), codedOutputStream);
            i14++;
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((Map.Entry) it.next(), codedOutputStream);
        }
    }
}
