package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends q0> implements z0<MessageType> {
    static {
        o.a();
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public final x a(o oVar, h hVar) throws InvalidProtocolBufferException {
        i.b bVarF = hVar.f();
        x xVarM = x.m(((x.b) this).f6913a, bVarF, oVar);
        try {
            bVarF.a(0);
            if (x.i(xVarM, true)) {
                return xVarM;
            }
            throw new UninitializedMessageException(xVarM).asInvalidProtocolBufferException().setUnfinishedMessage(xVarM);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.setUnfinishedMessage(xVarM);
        }
    }
}
