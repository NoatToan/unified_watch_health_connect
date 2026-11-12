package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n23.j;

/* JADX INFO: loaded from: classes2.dex */
final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.wrapper;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i14, boolean z14, V v14, MapEntryLite.Metadata<Boolean, V> metadata) {
        this.output.writeTag(i14, 2);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Boolean.valueOf(z14), v14));
        MapEntryLite.writeTo(this.output, metadata, Boolean.valueOf(z14), v14);
    }

    private <V> void writeDeterministicIntegerMap(int i14, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            iArr[i15] = it.next().intValue();
            i15++;
        }
        Arrays.sort(iArr);
        for (int i16 = 0; i16 < size; i16++) {
            int i17 = iArr[i16];
            V v14 = map.get(Integer.valueOf(i17));
            this.output.writeTag(i14, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i17), v14));
            MapEntryLite.writeTo(this.output, metadata, Integer.valueOf(i17), v14);
        }
    }

    private <V> void writeDeterministicLongMap(int i14, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            jArr[i15] = it.next().longValue();
            i15++;
        }
        Arrays.sort(jArr);
        for (int i16 = 0; i16 < size; i16++) {
            long j8 = jArr[i16];
            V v14 = map.get(Long.valueOf(j8));
            this.output.writeTag(i14, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j8), v14));
            MapEntryLite.writeTo(this.output, metadata, Long.valueOf(j8), v14);
        }
    }

    private <K, V> void writeDeterministicMap(int i14, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v14 = map.get(Boolean.FALSE);
                if (v14 != null) {
                    writeDeterministicBooleanMapEntry(i14, false, v14, metadata);
                }
                V v15 = map.get(Boolean.TRUE);
                if (v15 != null) {
                    writeDeterministicBooleanMapEntry(i14, true, v15, metadata);
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i14, metadata, map);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i14, metadata, map);
                break;
            case 12:
                writeDeterministicStringMap(i14, metadata, map);
                break;
            default:
                j.A(metadata.keyType, "does not support key type: ");
                break;
        }
    }

    private <V> void writeDeterministicStringMap(int i14, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            strArr[i15] = it.next();
            i15++;
        }
        Arrays.sort(strArr);
        for (int i16 = 0; i16 < size; i16++) {
            String str = strArr[i16];
            V v14 = map.get(str);
            this.output.writeTag(i14, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v14));
            MapEntryLite.writeTo(this.output, metadata, str, v14);
        }
    }

    private void writeLazyString(int i14, Object obj) {
        boolean z14 = obj instanceof String;
        CodedOutputStream codedOutputStream = this.output;
        if (z14) {
            codedOutputStream.writeString(i14, (String) obj);
        } else {
            codedOutputStream.writeBytes(i14, (ByteString) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBool(int i14, boolean z14) {
        this.output.writeBool(i14, z14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBoolList(int i14, List<Boolean> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeBool(i14, list.get(i15).booleanValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(list.get(i16).booleanValue());
        }
        this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i15 < list.size()) {
            this.output.writeBoolNoTag(list.get(i15).booleanValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytes(int i14, ByteString byteString) {
        this.output.writeBytes(i14, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytesList(int i14, List<ByteString> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            this.output.writeBytes(i14, list.get(i15));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDouble(int i14, double d14) {
        this.output.writeDouble(i14, d14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDoubleList(int i14, List<Double> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeDouble(i14, list.get(i15).doubleValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(list.get(i16).doubleValue());
        }
        this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i15 < list.size()) {
            this.output.writeDoubleNoTag(list.get(i15).doubleValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEndGroup(int i14) {
        this.output.writeTag(i14, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnum(int i14, int i15) {
        this.output.writeEnum(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnumList(int i14, List<Integer> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeEnum(i14, list.get(i15).intValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i16).intValue());
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i15 < list.size()) {
            this.output.writeEnumNoTag(list.get(i15).intValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32(int i14, int i15) {
        this.output.writeFixed32(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32List(int i14, List<Integer> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeFixed32(i14, list.get(i15).intValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(list.get(i16).intValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeFixed32NoTag(list.get(i15).intValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64(int i14, long j8) {
        this.output.writeFixed64(i14, j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64List(int i14, List<Long> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeFixed64(i14, list.get(i15).longValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(list.get(i16).longValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeFixed64NoTag(list.get(i15).longValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloat(int i14, float f14) {
        this.output.writeFloat(i14, f14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloatList(int i14, List<Float> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeFloat(i14, list.get(i15).floatValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(list.get(i16).floatValue());
        }
        this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i15 < list.size()) {
            this.output.writeFloatNoTag(list.get(i15).floatValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroup(int i14, Object obj) {
        this.output.writeGroup(i14, (MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroupList(int i14, List<?> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            writeGroup(i14, list.get(i15));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32(int i14, int i15) {
        this.output.writeInt32(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32List(int i14, List<Integer> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeInt32(i14, list.get(i15).intValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i16).intValue());
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeInt32NoTag(list.get(i15).intValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64(int i14, long j8) {
        this.output.writeInt64(i14, j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64List(int i14, List<Long> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeInt64(i14, list.get(i15).longValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i16).longValue());
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeInt64NoTag(list.get(i15).longValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int i14, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i14, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i14, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int i14, Object obj) {
        this.output.writeMessage(i14, (MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int i14, List<?> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            writeMessage(i14, list.get(i15));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int i14, Object obj) {
        boolean z14 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.output;
        if (z14) {
            codedOutputStream.writeRawMessageSetExtension(i14, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i14, (MessageLite) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32(int i14, int i15) {
        this.output.writeSFixed32(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32List(int i14, List<Integer> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeSFixed32(i14, list.get(i15).intValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i16).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeSFixed32NoTag(list.get(i15).intValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64(int i14, long j8) {
        this.output.writeSFixed64(i14, j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64List(int i14, List<Long> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeSFixed64(i14, list.get(i15).longValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i16).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeSFixed64NoTag(list.get(i15).longValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32(int i14, int i15) {
        this.output.writeSInt32(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32List(int i14, List<Integer> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeSInt32(i14, list.get(i15).intValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i16).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeSInt32NoTag(list.get(i15).intValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64(int i14, long j8) {
        this.output.writeSInt64(i14, j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64List(int i14, List<Long> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeSInt64(i14, list.get(i15).longValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i16).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeSInt64NoTag(list.get(i15).longValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeStartGroup(int i14) {
        this.output.writeTag(i14, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeString(int i14, String str) {
        this.output.writeString(i14, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeStringList(int i14, List<String> list) {
        int i15 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i15 < list.size()) {
                this.output.writeString(i14, list.get(i15));
                i15++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i15 < list.size()) {
                writeLazyString(i14, lazyStringList.getRaw(i15));
                i15++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32(int i14, int i15) {
        this.output.writeUInt32(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32List(int i14, List<Integer> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeUInt32(i14, list.get(i15).intValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i16).intValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeUInt32NoTag(list.get(i15).intValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64(int i14, long j8) {
        this.output.writeUInt64(i14, j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64List(int i14, List<Long> list, boolean z14) {
        int i15 = 0;
        if (!z14) {
            while (i15 < list.size()) {
                this.output.writeUInt64(i14, list.get(i15).longValue());
                i15++;
            }
            return;
        }
        this.output.writeTag(i14, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i16).longValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i15 < list.size()) {
            this.output.writeUInt64NoTag(list.get(i15).longValue());
            i15++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroup(int i14, Object obj, Schema schema) {
        this.output.writeGroup(i14, (MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int i14, Object obj, Schema schema) {
        this.output.writeMessage(i14, (MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroupList(int i14, List<?> list, Schema schema) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            writeGroup(i14, list.get(i15), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int i14, List<?> list, Schema schema) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            writeMessage(i14, list.get(i15), schema);
        }
    }
}
