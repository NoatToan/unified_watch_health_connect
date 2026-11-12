package yo0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.home.HomeDialogsHandlerImpl", f = "HomeDialogsHandlerImpl.kt", l = {328}, m = "navigateToAiConsent", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.m f198352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f198353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f198354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f198355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f198354c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198353b = obj;
        this.f198355d |= Integer.MIN_VALUE;
        return this.f198354c.C6(this);
    }
}
