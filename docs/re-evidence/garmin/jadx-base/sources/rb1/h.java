package rb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingViewModel", f = "PregnancyStopTrackingViewModel.kt", l = {139, 145}, m = "disablePregnancyReminders", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f151641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f151642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f151642b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f151641a = obj;
        this.f151643c |= Integer.MIN_VALUE;
        return g.x4(this.f151642b, this);
    }
}
