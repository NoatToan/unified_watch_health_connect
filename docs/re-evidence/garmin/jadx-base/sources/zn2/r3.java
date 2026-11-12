package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.SESpaceManager", f = "SESpaceManager.kt", l = {27}, m = "checkAvailableSpace", v = 2)
public final class r3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f205797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f205798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f205799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3 f205800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(q3 q3Var, t13.d<? super r3> dVar) {
        super(dVar);
        this.f205800d = q3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205799c = obj;
        this.f205801e |= Integer.MIN_VALUE;
        return this.f205800d.a(0L, 0, this);
    }
}
