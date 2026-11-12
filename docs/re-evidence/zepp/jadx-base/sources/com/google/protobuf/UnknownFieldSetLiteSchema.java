package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class UnknownFieldSetLiteSchema extends w<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.protobuf.w
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // com.google.protobuf.w
    public boolean shouldDiscardUnknownFields(s sVar) {
        return false;
    }

    @Override // com.google.protobuf.w
    public void addFixed32(UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.m(WireFormat.a(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.w
    public void addFixed64(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m(WireFormat.a(i, 1), Long.valueOf(j));
    }

    @Override // com.google.protobuf.w
    public void addGroup(UnknownFieldSetLite unknownFieldSetLite, int i, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.m(WireFormat.a(i, 3), unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.w
    public void addLengthDelimited(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.m(WireFormat.a(i, 2), byteString);
    }

    @Override // com.google.protobuf.w
    public void addVarint(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m(WireFormat.a(i, 0), Long.valueOf(j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.w
    public UnknownFieldSetLite getBuilderFromMessage(Object obj) {
        UnknownFieldSetLite fromMessage = getFromMessage(obj);
        if (fromMessage != UnknownFieldSetLite.getDefaultInstance()) {
            return fromMessage;
        }
        UnknownFieldSetLite unknownFieldSetLiteJ = UnknownFieldSetLite.j();
        setToMessage(obj, unknownFieldSetLiteJ);
        return unknownFieldSetLiteJ;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.w
    public UnknownFieldSetLite getFromMessage(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.w
    public int getSerializedSize(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // com.google.protobuf.w
    public int getSerializedSizeAsMessageSet(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.w
    public UnknownFieldSetLite merge(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        return unknownFieldSetLite2.equals(UnknownFieldSetLite.getDefaultInstance()) ? unknownFieldSetLite : UnknownFieldSetLite.i(unknownFieldSetLite, unknownFieldSetLite2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.w
    public UnknownFieldSetLite newBuilder() {
        return UnknownFieldSetLite.j();
    }

    @Override // com.google.protobuf.w
    public void setBuilderToMessage(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        setToMessage(obj, unknownFieldSetLite);
    }

    @Override // com.google.protobuf.w
    public void setToMessage(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.w
    public UnknownFieldSetLite toImmutable(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.w
    public void writeAsMessageSetTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.o(writer);
    }

    @Override // com.google.protobuf.w
    public void writeTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeTo(writer);
    }
}
