package zd0;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager", f = "PromosProvider.kt", l = {230, 241}, m = "updatePromoMap", v = 2)
public final class f1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c80.s0 f204012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f204013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f204015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f204016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f204017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(u0 u0Var, t13.d<? super f1> dVar) {
        super(dVar);
        this.f204016e = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204015d = obj;
        this.f204017f |= Integer.MIN_VALUE;
        int i14 = u0.f204141p;
        return this.f204016e.F(null, null, this);
    }
}
