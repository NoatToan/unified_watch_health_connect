package vf1;

import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf1/e;", "Landroidx/lifecycle/n;", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e implements n {
    public void a(long j8, Boolean bool, String str) {
        str.getClass();
    }

    public void b(long j8, String str) {
        str.getClass();
    }

    @Override // androidx.lifecycle.n
    public final void onCreate(n0 n0Var) {
        ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).i(this);
    }

    @Override // androidx.lifecycle.n
    public final void onDestroy(n0 n0Var) {
        ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).h(this);
    }
}
