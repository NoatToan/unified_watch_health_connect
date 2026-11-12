package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation", f = "AbstractOAuth2ITOperation.kt", l = {255, 256}, m = "attemptGC1ForIT2")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.o f164154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f164155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f164156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f164156c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164155b = obj;
        this.f164157d |= Integer.MIN_VALUE;
        return this.f164156c.h(null, null, this);
    }
}
