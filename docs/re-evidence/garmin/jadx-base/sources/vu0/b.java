package vu0;

import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180228a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveTrackActivity f180229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc.f f180230c;

    public /* synthetic */ b(LiveTrackActivity liveTrackActivity, sc.f fVar) {
        this.f180229b = liveTrackActivity;
        this.f180230c = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f180228a;
        sc.f fVar = this.f180230c;
        LiveTrackActivity liveTrackActivity = this.f180229b;
        switch (i14) {
            case 0:
                LiveTrackActivity.a aVar = LiveTrackActivity.f38637g;
                if (fVar.f158448a.size() > 1) {
                    fVar.remove(fVar.f158448a.size() - 1);
                } else {
                    liveTrackActivity.finish();
                }
                break;
            default:
                LiveTrackActivity.a aVar2 = LiveTrackActivity.f38637g;
                liveTrackActivity.da().a();
                if (s.g(h0.n0(fVar), bv0.a.f.INSTANCE)) {
                    fVar.remove(fVar.size() - 1);
                }
                if (!liveTrackActivity.da().f187249g) {
                    liveTrackActivity.finish();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(sc.f fVar, LiveTrackActivity liveTrackActivity) {
        this.f180230c = fVar;
        this.f180229b = liveTrackActivity;
    }
}
