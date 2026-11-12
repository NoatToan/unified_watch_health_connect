package rb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingViewModel", f = "PregnancyStopTrackingViewModel.kt", l = {222}, m = "postCycleType", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f151644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f151645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f151645b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f151644a = obj;
        this.f151646c |= Integer.MIN_VALUE;
        return g.y4(this.f151645b, null, null, this);
    }
}
