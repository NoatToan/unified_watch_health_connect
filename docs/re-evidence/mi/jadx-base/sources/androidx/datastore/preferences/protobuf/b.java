package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b0;
import defpackage.ykh;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends b0> implements ykh<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2184a = l.b();

    public final MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public final UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).f() : new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.ykh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (MessageType) c(f(byteString, lVar));
    }

    public MessageType f(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        g gVarNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeA = a(gVarNewCodedInput, lVar);
        try {
            gVarNewCodedInput.a(0);
            return messagetypeA;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeA);
        }
    }
}
