package ro1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.share.StickersRepositoryImpl", f = "StickersRepositoryImpl.kt", l = {23}, m = "getStickers", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f153990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f153991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f153991b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153990a = obj;
        this.f153992c |= Integer.MIN_VALUE;
        return this.f153991b.a(null, null, this);
    }
}
