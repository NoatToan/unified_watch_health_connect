package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation", f = "AbstractOAuth2DIOperation.kt", l = {370, 376, 378}, m = "attemptDI2ForDI2")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.m f163943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f163944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j2 f163945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2 f163946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f163947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f163948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163949g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f163948f = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163947e = obj;
        this.f163949g |= Integer.MIN_VALUE;
        return this.f163948f.g(null, this);
    }
}
