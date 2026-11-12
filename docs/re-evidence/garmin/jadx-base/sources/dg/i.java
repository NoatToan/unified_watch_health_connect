package dg;

import androidx.lifecycle.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {42}, m = "awaitStarted")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f59478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f59479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59481d;

    public i(t13.d<? super i> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59480c = obj;
        this.f59481d |= Integer.MIN_VALUE;
        return k.a(null, this);
    }
}
