package gb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel", f = "PregnancyReportsViewModel.kt", l = {129}, m = "getPregnancyReportLoggedData", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f76728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f76729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f76729b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76728a = obj;
        this.f76730c |= Integer.MIN_VALUE;
        return t.y4(this.f76729b, null, null, this);
    }
}
