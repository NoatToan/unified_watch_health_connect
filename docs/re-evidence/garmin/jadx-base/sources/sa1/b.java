package sa1;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lsa1/b;", "", "Lo53/i0;", "Lc83/a0;", "Lab1/c;", "b", "()Lo53/i0;", "Lsa1/a;", "athleteInfoDTO", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "a", "(Lsa1/a;)Lo53/i0;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @i83.o("/biometric-service/powerZones/athleteInfo")
    i0<c83.a0<PowerZonesDTO>> a(@i83.a a athleteInfoDTO);

    @i83.f("/biometric-service/biometric/latestFunctionalThresholdPower/CYCLING")
    i0<c83.a0<ab1.c>> b();
}
