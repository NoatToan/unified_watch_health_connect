package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation", f = "AbstractOAuth2ITOperation.kt", l = {281, 282}, m = "attemptDI2ForIT2")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.o f164133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f164134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f164135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f164135c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164134b = obj;
        this.f164136d |= Integer.MIN_VALUE;
        return this.f164135c.g(null, this);
    }
}
