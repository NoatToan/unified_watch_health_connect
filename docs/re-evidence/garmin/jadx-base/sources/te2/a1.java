package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials", f = "GetOAuth1GCCredentials.kt", l = {164}, m = "attemptWithThisAppDI2")
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f163955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f163957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f163958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u0 u0Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f163957c = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163956b = obj;
        this.f163958d |= Integer.MIN_VALUE;
        int i14 = u0.f164318q;
        return this.f163957c.e(false, this);
    }
}
