package gb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel", f = "PregnancyReportsViewModel.kt", l = {141}, m = "getPregnancyReportNotesData", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f76731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f76732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f76732b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76731a = obj;
        this.f76733c |= Integer.MIN_VALUE;
        return t.z4(this.f76732b, null, null, this);
    }
}
