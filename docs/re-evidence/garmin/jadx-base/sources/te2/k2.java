package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr", f = "SystemAcctMgr.kt", l = {1199}, m = "buildGarminAccount")
public final class k2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f164152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(j2 j2Var, t13.d<? super k2> dVar) {
        super(dVar);
        this.f164152b = j2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164151a = obj;
        this.f164153c |= Integer.MIN_VALUE;
        return this.f164152b.a(null, this);
    }
}
