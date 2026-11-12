package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class UnknownFieldSetSchema extends UnknownFieldSchema<UnknownFieldSet, UnknownFieldSet.Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f54341a = 0;

    @Override // com.google.protobuf.UnknownFieldSchema
    public void addFixed32(UnknownFieldSet.Builder builder, int i14, int i15) {
        builder.mergeField(i14, UnknownFieldSet.Field.newBuilder().addFixed32(i15).build());
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void addFixed64(UnknownFieldSet.Builder builder, int i14, long j8) {
        builder.mergeField(i14, UnknownFieldSet.Field.newBuilder().addFixed64(j8).build());
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void addGroup(UnknownFieldSet.Builder builder, int i14, UnknownFieldSet unknownFieldSet) {
        builder.mergeField(i14, UnknownFieldSet.Field.newBuilder().addGroup(unknownFieldSet).build());
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void addLengthDelimited(UnknownFieldSet.Builder builder, int i14, ByteString byteString) {
        builder.mergeField(i14, UnknownFieldSet.Field.newBuilder().addLengthDelimited(byteString).build());
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void addVarint(UnknownFieldSet.Builder builder, int i14, long j8) {
        builder.mergeField(i14, UnknownFieldSet.Field.newBuilder().addVarint(j8).build());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSet.Builder getBuilderFromMessage(Object obj) {
        return ((GeneratedMessageV3) obj).unknownFields.toBuilder();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void makeImmutable(Object obj) {
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSet merge(UnknownFieldSet unknownFieldSet, UnknownFieldSet unknownFieldSet2) {
        return unknownFieldSet.toBuilder().mergeFrom(unknownFieldSet2).build();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void setBuilderToMessage(Object obj, UnknownFieldSet.Builder builder) {
        ((GeneratedMessageV3) obj).unknownFields = builder.build();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public boolean shouldDiscardUnknownFields(Reader reader) {
        return reader.shouldDiscardUnknownFields();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSet getFromMessage(Object obj) {
        return ((GeneratedMessageV3) obj).unknownFields;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSet.Builder newBuilder() {
        return UnknownFieldSet.newBuilder();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void setToMessage(Object obj, UnknownFieldSet unknownFieldSet) {
        ((GeneratedMessageV3) obj).unknownFields = unknownFieldSet;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void writeAsMessageSetTo(UnknownFieldSet unknownFieldSet, Writer writer) {
        unknownFieldSet.writeAsMessageSetTo(writer);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public void writeTo(UnknownFieldSet unknownFieldSet, Writer writer) {
        unknownFieldSet.writeTo(writer);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public int getSerializedSize(UnknownFieldSet unknownFieldSet) {
        return unknownFieldSet.getSerializedSize();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public int getSerializedSizeAsMessageSet(UnknownFieldSet unknownFieldSet) {
        return unknownFieldSet.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSet toImmutable(UnknownFieldSet.Builder builder) {
        return builder.build();
    }
}
