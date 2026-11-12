package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0093a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0093a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0093a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0093a<MessageType, BuilderType>> implements q0.a {
        @Override // 
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public abstract x.a clone();

        public abstract x.a d(a aVar);
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public int d(g1 g1Var) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iA = g1Var.a(this);
        e(iA);
        return iA;
    }

    public void e(int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final h.C0094h toByteString() {
        try {
            int iD = ((x) this).d(null);
            h.C0094h c0094h = h.f6707b;
            h.f fVar = new h.f(iD, null);
            CodedOutputStream.c cVar = fVar.f6712a;
            ((x) this).b(cVar);
            if (cVar.f6661e - cVar.f6662f == 0) {
                return new h.C0094h(fVar.f6713b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            com.google.firebase.messaging.l.m("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e4);
            return null;
        }
    }
}
