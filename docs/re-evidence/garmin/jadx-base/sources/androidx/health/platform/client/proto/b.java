package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.c1;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends c1> implements l1<MessageType> {
    static {
        a0.a();
    }

    @Override // androidx.health.platform.client.proto.l1
    public final c1 a(a0 a0Var, i iVar) throws InvalidProtocolBufferException {
        j.b bVarE = iVar.e();
        int i14 = j0.UNINITIALIZED_SERIALIZED_SIZE;
        j0 j0VarP = ((j0.b) this).f7678a.p();
        try {
            r1 r1Var = r1.f7767c;
            r1Var.getClass();
            n2 n2VarA = r1Var.a(j0VarP.getClass());
            n2VarA.e(j0VarP, k.a(bVarE), a0Var);
            n2VarA.makeImmutable(j0VarP);
            try {
                bVarE.a(0);
                if (j0VarP.isInitialized()) {
                    return j0VarP;
                }
                throw new UninitializedMessageException(j0VarP).asInvalidProtocolBufferException().setUnfinishedMessage(j0VarP);
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(j0VarP);
            }
        } catch (InvalidProtocolBufferException e14) {
            e = e14;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(j0VarP);
        } catch (UninitializedMessageException e15) {
            throw e15.asInvalidProtocolBufferException().setUnfinishedMessage(j0VarP);
        } catch (IOException e16) {
            if (e16.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e16.getCause());
            }
            throw new InvalidProtocolBufferException(e16).setUnfinishedMessage(j0VarP);
        } catch (RuntimeException e17) {
            if (e17.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e17.getCause());
            }
            throw e17;
        }
    }
}
