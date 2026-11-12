package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.o0;
import defpackage.tkh;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends o0> implements tkh<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f2473a = y.b();

    public final MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public final UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).g() : new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.tkh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) c(f(byteString, yVar));
    }

    public MessageType f(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        h hVarNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeA = a(hVarNewCodedInput, yVar);
        try {
            hVarNewCodedInput.a(0);
            return messagetypeA;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeA);
        }
    }
}
