package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.EnvInfoDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {292}, m = "refreshGcsAuthData", v = 2)
public final class g2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f104085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(e2 e2Var, t13.d<? super g2> dVar) {
        super(dVar);
        this.f104085b = e2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104084a = obj;
        this.f104086c |= Integer.MIN_VALUE;
        return this.f104085b.c(this);
    }
}
