package com.google.protobuf;

import com.google.protobuf.q0;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c<MessageType extends q0> implements vkh<MessageType> {
    private static final t EMPTY_REGISTRY = t.c();

    private MessageType checkMessageInitialized(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    private UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof b ? ((b) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.vkh
    public MessageType parseDelimitedFrom(InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m165parsePartialDelimitedFrom(inputStream, tVar));
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m165parsePartialDelimitedFrom(InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) m170parsePartialFrom((InputStream) new b.a.C0259a(inputStream, j.C(i, inputStream)), tVar);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e);
        }
    }

    @Override // defpackage.vkh
    public MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m164parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) m165parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m168parsePartialFrom(j jVar) throws InvalidProtocolBufferException {
        return parsePartialFrom(jVar, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m167parsePartialFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        j jVarNewCodedInput = byteString.newCodedInput();
        MessageType partialFrom = parsePartialFrom(jVarNewCodedInput, tVar);
        try {
            jVarNewCodedInput.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(jVar, tVar));
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(j jVar) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(jVar, EMPTY_REGISTRY);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m167parsePartialFrom(byteString, tVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m166parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) m167parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public MessageType mo156parsePartialFrom(byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
        j jVarL = j.l(bArr, i, i2);
        MessageType partialFrom = parsePartialFrom(jVarL, tVar);
        try {
            jVarL.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        j jVarI = j.i(byteBuffer);
        MessageType partialFrom = parsePartialFrom(jVarI, tVar);
        try {
            jVarI.a(0);
            return (MessageType) checkMessageInitialized(partialFrom);
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m172parsePartialFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return (MessageType) mo156parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m173parsePartialFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) mo156parsePartialFrom(bArr, 0, bArr.length, tVar);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m171parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) mo156parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m163parseFrom(byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(mo156parsePartialFrom(bArr, i, i2, tVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m170parsePartialFrom(InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        j jVarG = j.g(inputStream);
        MessageType partialFrom = parsePartialFrom(jVarG, tVar);
        try {
            jVarG.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m162parseFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return (MessageType) m163parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) m163parseFrom(bArr, 0, bArr.length, tVar);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m170parsePartialFrom(inputStream, tVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m169parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) m170parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.vkh
    public MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
