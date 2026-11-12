package gv0;

import kd0.c6;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.g2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwd2/g2;", "<anonymous>", "(Lo53/b0;)Lwd2/g2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$initStravaBeaconOption$stravaBeaconOption$1", f = "LiveTrackSettingsViewModel.kt", l = {787}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super g2>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d dVar, t13.d<? super p> dVar2) {
        super(2, dVar2);
        this.f79354b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f79354b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g2> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79353a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c6 c6VarD = this.f79354b.f79184b.d();
        this.f79353a = 1;
        Object objA = c6VarD.a(false, this);
        return objA == aVar ? aVar : objA;
    }
}
