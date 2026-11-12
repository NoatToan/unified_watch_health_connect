package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import defpackage.ukh;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<MessageType extends b0> implements ukh<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f9369a = l.b();

    public final MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public final UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).e() : new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.ukh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (MessageType) c(f(byteString, lVar));
    }

    public MessageType f(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        g gVarNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeB = b(gVarNewCodedInput, lVar);
        try {
            gVarNewCodedInput.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeB);
        }
    }
}
