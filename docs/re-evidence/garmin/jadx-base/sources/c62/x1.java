package c62;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class x1 implements e23.p<Long, com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<PowerZonesDTO> f24931a;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(t13.d<? super PowerZonesDTO> dVar) {
        this.f24931a = dVar;
    }

    @Override // e23.p
    public final Unit invoke(Long l14, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        long jLongValue = l14.longValue();
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = cVar;
        cVar2.getClass();
        int i14 = o13.q.f128596b;
        this.f24931a.resumeWith(new o13.q.b(new RuntimeException("getCyclingPowerZonesConfig (request " + jLongValue + ") failed with " + cVar2)));
        return Unit.INSTANCE;
    }
}
