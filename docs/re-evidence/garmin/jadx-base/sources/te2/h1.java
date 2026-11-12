package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator", f = "ITAutoLoginURIGenerator.kt", l = {129}, m = "cas")
public final class h1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f164072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f1 f1Var, t13.d<? super h1> dVar) {
        super(dVar);
        this.f164072b = f1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164071a = obj;
        this.f164073c |= Integer.MIN_VALUE;
        return this.f164072b.b(null, null, null, null, null, null, this);
    }
}
