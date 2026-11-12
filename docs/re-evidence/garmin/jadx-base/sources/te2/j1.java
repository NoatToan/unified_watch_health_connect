package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator", f = "ITAutoLoginURIGenerator.kt", l = {164, 166, 167}, m = "getMFATokenForAutoLogin")
public final class j1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f164113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(f1 f1Var, t13.d<? super j1> dVar) {
        super(dVar);
        this.f164113b = f1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164112a = obj;
        this.f164114c |= Integer.MIN_VALUE;
        return f1.a(this.f164113b, null, null, this);
    }
}
