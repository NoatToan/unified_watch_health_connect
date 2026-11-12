package com.google.crypto.tink.shaded.protobuf;

import com.google.protobuf.a;
import java.util.Arrays;
import o2.c;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite(int i14, int[] iArr, Object[] objArr, boolean z14) {
        this.memoizedSerializedSize = -1;
        this.count = i14;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z14;
    }

    private void ensureCapacity() {
        int i14 = this.count;
        int[] iArr = this.tags;
        if (i14 == iArr.length) {
            int i15 = i14 + (i14 < 4 ? 8 : i14 >> 1);
            this.tags = Arrays.copyOf(iArr, i15);
            this.objects = Arrays.copyOf(this.objects, i15);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) {
        int tag;
        do {
            tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, codedInputStream));
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i14 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.tags, i14);
        System.arraycopy(unknownFieldSetLite2.tags, 0, iArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.objects, i14);
        System.arraycopy(unknownFieldSetLite2.objects, 0, objArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i14, iArrCopyOf, objArrCopyOf, true);
    }

    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static void writeField(int i14, Object obj, Writer writer) {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i14);
        int tagWireType = WireFormat.getTagWireType(i14);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                writer.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
                return;
            } else {
                c.p(InvalidProtocolBufferException.invalidWireType());
                return;
            }
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public void checkMutable() {
        if (this.isMutable) {
            return;
        }
        a.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i14 = this.count;
        return i14 == unknownFieldSetLite.count && equals(this.tags, unknownFieldSetLite.tags, i14) && equals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i14 = this.memoizedSerializedSize;
        if (i14 != -1) {
            return i14;
        }
        int serializedSize = 0;
        for (int i15 = 0; i15 < this.count; i15++) {
            int i16 = this.tags[i15];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i16);
            int tagWireType = WireFormat.getTagWireType(i16);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i15]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i15]).longValue());
            } else if (tagWireType != 2) {
                if (tagWireType == 3) {
                    serializedSize = ((UnknownFieldSetLite) this.objects[i15]).getSerializedSize() + (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + serializedSize;
                } else {
                    if (tagWireType != 5) {
                        l2.p(InvalidProtocolBufferException.invalidWireType());
                        return 0;
                    }
                    iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i15]).intValue());
                }
            } else {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i15]);
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.memoizedSerializedSize = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i14 = this.memoizedSerializedSize;
        if (i14 != -1) {
            return i14;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i15 = 0; i15 < this.count; i15++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i15]), (ByteString) this.objects[i15]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i14 = this.count;
        return ((((527 + i14) * 31) + hashCode(this.tags, i14)) * 31) + hashCode(this.objects, this.count);
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean mergeFieldFrom(int i14, CodedInputStream codedInputStream) throws InvalidProtocolBufferException.InvalidWireTypeException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i14);
        int tagWireType = WireFormat.getTagWireType(i14);
        if (tagWireType == 0) {
            storeField(i14, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i14, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i14, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(codedInputStream);
            codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(i14, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(i14, Integer.valueOf(codedInputStream.readFixed32()));
        return true;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(int i14, ByteString byteString) {
        checkMutable();
        if (i14 != 0) {
            storeField(WireFormat.makeTag(i14, 2), byteString);
            return this;
        }
        h.s("Zero is not a valid field number.");
        return null;
    }

    public UnknownFieldSetLite mergeVarintField(int i14, int i15) {
        checkMutable();
        if (i14 != 0) {
            storeField(WireFormat.makeTag(i14, 0), Long.valueOf(i15));
            return this;
        }
        h.s("Zero is not a valid field number.");
        return null;
    }

    public final void printWithIndent(StringBuilder sb3, int i14) {
        for (int i15 = 0; i15 < this.count; i15++) {
            MessageLiteToString.printField(sb3, i14, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i15])), this.objects[i15]);
        }
    }

    public void storeField(int i14, Object obj) {
        checkMutable();
        ensureCapacity();
        int[] iArr = this.tags;
        int i15 = this.count;
        iArr[i15] = i14;
        this.objects[i15] = obj;
        this.count = i15 + 1;
    }

    public void writeAsMessageSetTo(Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i14 = this.count - 1; i14 >= 0; i14--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i14]), this.objects[i14]);
            }
            return;
        }
        for (int i15 = 0; i15 < this.count; i15++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i15]), this.objects[i15]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException.InvalidWireTypeException {
        for (int i14 = 0; i14 < this.count; i14++) {
            int i15 = this.tags[i14];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i15);
            int tagWireType = WireFormat.getTagWireType(i15);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i14]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i14]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i14]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i14]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i14]).intValue());
            }
        }
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private static int hashCode(Object[] objArr, int i14) {
        int iHashCode = 17;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return iHashCode;
    }

    private static int hashCode(int[] iArr, int i14) {
        int i15 = 17;
        for (int i16 = 0; i16 < i14; i16++) {
            i15 = (i15 * 31) + iArr[i16];
        }
        return i15;
    }

    private static boolean equals(Object[] objArr, Object[] objArr2, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (!objArr[i15].equals(objArr2[i15])) {
                return false;
            }
        }
        return true;
    }

    private static boolean equals(int[] iArr, int[] iArr2, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (iArr[i15] != iArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        for (int i14 = 0; i14 < this.count; i14++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i14]), (ByteString) this.objects[i14]);
        }
    }

    public void writeTo(Writer writer) {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i14 = 0; i14 < this.count; i14++) {
                writeField(this.tags[i14], this.objects[i14], writer);
            }
            return;
        }
        for (int i15 = this.count - 1; i15 >= 0; i15--) {
            writeField(this.tags[i15], this.objects[i15], writer);
        }
    }
}
