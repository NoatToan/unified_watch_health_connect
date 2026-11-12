package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class UnknownFieldSchema<T, B> {
    public abstract void addFixed32(B b14, int i14, int i15);

    public abstract void addFixed64(B b14, int i14, long j8);

    public abstract void addGroup(B b14, int i14, T t7);

    public abstract void addLengthDelimited(B b14, int i14, ByteString byteString);

    public abstract void addVarint(B b14, int i14, long j8);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t7);

    public abstract int getSerializedSizeAsMessageSet(T t7);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t7, T t14);

    public final void mergeFrom(B b14, Reader reader) {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b14, reader)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b14, Reader reader) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b14, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b14, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b14, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b14, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(bNewBuilder, reader);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b14, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b14);

    public abstract void setToMessage(Object obj, T t7);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b14);

    public abstract void writeAsMessageSetTo(T t7, Writer writer);

    public abstract void writeTo(T t7, Writer writer);
}
