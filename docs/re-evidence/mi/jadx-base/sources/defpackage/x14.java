package defpackage;

import com.facebook.common.references.SharedReference;
import com.xiaomi.wearable.yrn.internal.imageload.FrescoConfigUtils;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public class x14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w14.c f38565a;

    public class a implements w14.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y14 f38566a;

        public a(y14 y14Var) {
            this.f38566a = y14Var;
        }

        @Override // w14.c
        public void a(SharedReference<Object> sharedReference) {
            this.f38566a.a(sharedReference);
            cm8.E(FrescoConfigUtils.TAG, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), sharedReference.f().getClass().getName());
        }
    }

    public x14(y14 y14Var) {
        this.f38565a = new a(y14Var);
    }

    public <U extends Closeable> w14<U> a(U u) {
        return w14.J(u, this.f38565a);
    }

    public <T> w14<T> b(T t, frk<T> frkVar) {
        return w14.M(t, frkVar, this.f38565a);
    }
}
