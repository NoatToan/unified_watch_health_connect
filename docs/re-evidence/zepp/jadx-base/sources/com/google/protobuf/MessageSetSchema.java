package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class MessageSetSchema<T> implements t<T> {
    private final MessageLite defaultInstance;
    private final e<?> extensionSchema;
    private final boolean hasExtensions;
    private final w<?, ?> unknownFieldSchema;

    private MessageSetSchema(w<?, ?> wVar, e<?> eVar, MessageLite messageLite) {
        this.unknownFieldSchema = wVar;
        this.hasExtensions = eVar.hasExtensions(messageLite);
        this.extensionSchema = eVar;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(w<UT, UB> wVar, T t) {
        return wVar.getSerializedSizeAsMessageSet(wVar.getFromMessage(t));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(w<UT, UB> wVar, e<ET> eVar, T t, s sVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UB builderFromMessage = wVar.getBuilderFromMessage(t);
        FieldSet<ET> mutableExtensions = eVar.getMutableExtensions(t);
        while (sVar.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(sVar, extensionRegistryLite, eVar, mutableExtensions, wVar, builderFromMessage)) {
                    return;
                }
            } finally {
                wVar.setBuilderToMessage(t, builderFromMessage);
            }
        }
    }

    public static <T> MessageSetSchema<T> newSchema(w<?, ?> wVar, e<?> eVar, MessageLite messageLite) {
        return new MessageSetSchema<>(wVar, eVar, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(s sVar, ExtensionRegistryLite extensionRegistryLite, e<ET> eVar, FieldSet<ET> fieldSet, w<UT, UB> wVar, UB ub) throws IOException {
        int tag = sVar.getTag();
        if (tag != WireFormat.k) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return sVar.skipField();
            }
            Object objFindExtensionByNumber = eVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return wVar.mergeOneFieldFrom(ub, sVar);
            }
            eVar.parseLengthPrefixedMessageSetItem(sVar, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        int uInt32 = 0;
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (sVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = sVar.getTag();
            if (tag2 == WireFormat.m) {
                uInt32 = sVar.readUInt32();
                objFindExtensionByNumber2 = eVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.n) {
                if (objFindExtensionByNumber2 != null) {
                    eVar.parseLengthPrefixedMessageSetItem(sVar, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = sVar.readBytes();
                }
            } else if (!sVar.skipField()) {
                break;
            }
        }
        if (sVar.getTag() != WireFormat.l) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                eVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                wVar.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(w<UT, UB> wVar, T t, Writer writer) throws IOException {
        wVar.writeAsMessageSetTo(wVar.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.t
    public boolean equals(T t, T t2) {
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.t
    public int getSerializedSize(T t) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t) + 0;
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).v() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.t
    public int hashCode(T t) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.t
    public final boolean isInitialized(T t) {
        return this.extensionSchema.getExtensions(t).E();
    }

    @Override // com.google.protobuf.t
    public void makeImmutable(T t) {
        this.unknownFieldSchema.makeImmutable(t);
        this.extensionSchema.makeImmutable(t);
    }

    @Override // com.google.protobuf.t
    public void mergeFrom(T t, T t2) {
        v.J(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            v.H(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.t
    public T newInstance() {
        return (T) this.defaultInstance.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.t
    public void writeTo(T t, Writer writer) throws IOException {
        Iterator itH = this.extensionSchema.getExtensions(t).H();
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.b) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.b) entry).a().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.t
    public void mergeFrom(T t, byte[] bArr, int i, int i2, b.C0256b c0256b) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        UnknownFieldSetLite unknownFieldSetLiteJ = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteJ == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteJ = UnknownFieldSetLite.j();
            generatedMessageLite.unknownFields = unknownFieldSetLiteJ;
        }
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSetEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t).ensureExtensionsAreMutable();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i < i2) {
            int I = b.I(bArr, i, c0256b);
            int i3 = c0256b.a;
            if (i3 == WireFormat.k) {
                int i4 = 0;
                ByteString byteString = null;
                while (I < i2) {
                    I = b.I(bArr, I, c0256b);
                    int i5 = c0256b.a;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
                    int tagWireType = WireFormat.getTagWireType(i5);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                I = b.p(q.a().i(generatedExtension.getMessageDefaultInstance().getClass()), bArr, I, i2, c0256b);
                                fieldSetEnsureExtensionsAreMutable.O(generatedExtension.descriptor, c0256b.c);
                            } else if (tagWireType == 2) {
                                I = b.b(bArr, I, c0256b);
                                byteString = (ByteString) c0256b.c;
                            }
                        }
                        if (i5 == WireFormat.l) {
                            break;
                        } else {
                            I = b.N(i5, bArr, I, i2, c0256b);
                        }
                    } else if (tagWireType == 0) {
                        I = b.I(bArr, I, c0256b);
                        i4 = c0256b.a;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(c0256b.d, this.defaultInstance, i4);
                    } else {
                        if (i5 == WireFormat.l) {
                            break;
                            break;
                        }
                        I = b.N(i5, bArr, I, i2, c0256b);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLiteJ.m(WireFormat.a(i4, 2), byteString);
                }
                i = I;
            } else if (WireFormat.getTagWireType(i3) == 2) {
                GeneratedMessageLite.GeneratedExtension generatedExtension2 = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(c0256b.d, this.defaultInstance, WireFormat.getTagFieldNumber(i3));
                if (generatedExtension2 != null) {
                    i = b.p(q.a().i(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, I, i2, c0256b);
                    fieldSetEnsureExtensionsAreMutable.O(generatedExtension2.descriptor, c0256b.c);
                } else {
                    i = b.G(i3, bArr, I, i2, unknownFieldSetLiteJ, c0256b);
                }
                generatedExtension = generatedExtension2;
            } else {
                i = b.N(i3, bArr, I, i2, c0256b);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.t
    public void mergeFrom(T t, s sVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, sVar, extensionRegistryLite);
    }
}
