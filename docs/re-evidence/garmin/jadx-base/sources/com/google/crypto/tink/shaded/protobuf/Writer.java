package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    FieldOrder fieldOrder();

    void writeBool(int i14, boolean z14);

    void writeBoolList(int i14, List<Boolean> list, boolean z14);

    void writeBytes(int i14, ByteString byteString);

    void writeBytesList(int i14, List<ByteString> list);

    void writeDouble(int i14, double d14);

    void writeDoubleList(int i14, List<Double> list, boolean z14);

    @Deprecated
    void writeEndGroup(int i14);

    void writeEnum(int i14, int i15);

    void writeEnumList(int i14, List<Integer> list, boolean z14);

    void writeFixed32(int i14, int i15);

    void writeFixed32List(int i14, List<Integer> list, boolean z14);

    void writeFixed64(int i14, long j8);

    void writeFixed64List(int i14, List<Long> list, boolean z14);

    void writeFloat(int i14, float f14);

    void writeFloatList(int i14, List<Float> list, boolean z14);

    @Deprecated
    void writeGroup(int i14, Object obj);

    @Deprecated
    void writeGroup(int i14, Object obj, Schema schema);

    @Deprecated
    void writeGroupList(int i14, List<?> list);

    @Deprecated
    void writeGroupList(int i14, List<?> list, Schema schema);

    void writeInt32(int i14, int i15);

    void writeInt32List(int i14, List<Integer> list, boolean z14);

    void writeInt64(int i14, long j8);

    void writeInt64List(int i14, List<Long> list, boolean z14);

    <K, V> void writeMap(int i14, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map);

    void writeMessage(int i14, Object obj);

    void writeMessage(int i14, Object obj, Schema schema);

    void writeMessageList(int i14, List<?> list);

    void writeMessageList(int i14, List<?> list, Schema schema);

    void writeMessageSetItem(int i14, Object obj);

    void writeSFixed32(int i14, int i15);

    void writeSFixed32List(int i14, List<Integer> list, boolean z14);

    void writeSFixed64(int i14, long j8);

    void writeSFixed64List(int i14, List<Long> list, boolean z14);

    void writeSInt32(int i14, int i15);

    void writeSInt32List(int i14, List<Integer> list, boolean z14);

    void writeSInt64(int i14, long j8);

    void writeSInt64List(int i14, List<Long> list, boolean z14);

    @Deprecated
    void writeStartGroup(int i14);

    void writeString(int i14, String str);

    void writeStringList(int i14, List<String> list);

    void writeUInt32(int i14, int i15);

    void writeUInt32List(int i14, List<Integer> list, boolean z14);

    void writeUInt64(int i14, long j8);

    void writeUInt64List(int i14, List<Long> list, boolean z14);
}
