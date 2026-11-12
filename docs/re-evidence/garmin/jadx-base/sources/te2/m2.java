package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr", f = "SystemAcctMgr.kt", l = {821}, m = "continueAsAccount")
public final class m2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f164190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(j2 j2Var, t13.d<? super m2> dVar) {
        super(dVar);
        this.f164190b = j2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164189a = obj;
        this.f164191c |= Integer.MIN_VALUE;
        return this.f164190b.h(null, null, null, null, this);
    }
}
