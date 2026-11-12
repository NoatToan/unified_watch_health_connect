package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation", f = "AbstractOAuth2DIOperation.kt", l = {287, 288}, m = "attemptIT2OtherAppForDI2")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.m f163979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f163981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f163982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f163981c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163980b = obj;
        this.f163982d |= Integer.MIN_VALUE;
        return this.f163981c.i(null, this);
    }
}
