package c62;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w1 implements e23.l<PowerZonesDTO, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<PowerZonesDTO> f24929a;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(t13.d<? super PowerZonesDTO> dVar) {
        this.f24929a = dVar;
    }

    @Override // e23.l
    public final Unit invoke(PowerZonesDTO powerZonesDTO) {
        PowerZonesDTO powerZonesDTO2 = powerZonesDTO;
        powerZonesDTO2.getClass();
        int i14 = o13.q.f128596b;
        this.f24929a.resumeWith(powerZonesDTO2);
        return Unit.INSTANCE;
    }
}
