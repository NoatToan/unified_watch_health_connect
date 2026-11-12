package ue2;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.agesignals.GooglePlayAgeSignalsHelper", f = "GooglePlayAgeSignalsHelper.kt", l = {209, 232, 246}, m = "fetchSignals-IoAF18A")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f170279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f170279b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170278a = obj;
        this.f170280c |= Integer.MIN_VALUE;
        Object objD = this.f170279b.d(this);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : q.a(objD);
    }
}
