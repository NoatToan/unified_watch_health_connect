package is0;

import android.os.CountDownTimer;
import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis0/a;", "Landroid/os/CountDownTimer;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b f94900a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j8, long j14, com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b bVar) {
        super(j8, j14);
        this.f94900a = bVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        cancel();
        com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b bVar = this.f94900a;
        bVar.getClass();
        a aVar2 = new a(C.NANOS_PER_SECOND, 60000L, bVar);
        bVar.f37022o = aVar2;
        aVar2.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
        com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
        js0.a aVar2 = (js0.a) this.f94900a.J6();
        fs0.c cVar = aVar2.f100608p;
        yr0.g gVar = aVar2.f100610r;
        vz.a<yr0.g> aVar3 = cVar.f73422b;
        if (aVar3 != null) {
            aVar3.a(gVar);
            Unit unit = Unit.INSTANCE;
        }
        aVar2.d();
    }
}
