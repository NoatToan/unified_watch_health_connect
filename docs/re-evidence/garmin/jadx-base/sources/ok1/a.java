package ok1;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lok1/a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f132581a = new a();

    private a() {
    }

    public static final int a(int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return Math.round((i14 * 100) / i15);
    }

    public static int b(int i14, int i15) {
        return Math.round((i14 * i15) / 100);
    }

    public static final void c(PowerZonesDTO powerZonesDTO) {
        powerZonesDTO.getClass();
        powerZonesDTO.f43995j = a(powerZonesDTO.f43988c, powerZonesDTO.f43987b);
        powerZonesDTO.f43996k = a(powerZonesDTO.f43989d, powerZonesDTO.f43987b);
        powerZonesDTO.f43997l = a(powerZonesDTO.f43990e, powerZonesDTO.f43987b);
        powerZonesDTO.f43998m = a(powerZonesDTO.f43991f, powerZonesDTO.f43987b);
        powerZonesDTO.f43999n = a(powerZonesDTO.f43992g, powerZonesDTO.f43987b);
        powerZonesDTO.f44000o = a(powerZonesDTO.f43993h, powerZonesDTO.f43987b);
        powerZonesDTO.f44001p = a(powerZonesDTO.f43994i, powerZonesDTO.f43987b);
    }

    public static final void d(PowerZonesDTO powerZonesDTO) {
        powerZonesDTO.getClass();
        int i14 = powerZonesDTO.f43995j;
        int i15 = powerZonesDTO.f43987b;
        f132581a.getClass();
        powerZonesDTO.f43988c = b(i14, i15);
        int iB = b(powerZonesDTO.f43996k, powerZonesDTO.f43987b);
        powerZonesDTO.f43989d = iB;
        int i16 = powerZonesDTO.f43988c;
        if (iB <= i16) {
            powerZonesDTO.f43989d = i16 + 1;
        }
        int iB2 = b(powerZonesDTO.f43997l, powerZonesDTO.f43987b);
        powerZonesDTO.f43990e = iB2;
        int i17 = powerZonesDTO.f43989d;
        if (iB2 <= i17) {
            powerZonesDTO.f43990e = i17 + 1;
        }
        int iB3 = b(powerZonesDTO.f43998m, powerZonesDTO.f43987b);
        powerZonesDTO.f43991f = iB3;
        int i18 = powerZonesDTO.f43990e;
        if (iB3 <= i18) {
            powerZonesDTO.f43991f = i18 + 1;
        }
        int iB4 = b(powerZonesDTO.f43999n, powerZonesDTO.f43987b);
        powerZonesDTO.f43992g = iB4;
        int i19 = powerZonesDTO.f43991f;
        if (iB4 <= i19) {
            powerZonesDTO.f43992g = i19 + 1;
        }
        int iB5 = b(powerZonesDTO.f44000o, powerZonesDTO.f43987b);
        powerZonesDTO.f43993h = iB5;
        int i24 = powerZonesDTO.f43992g;
        if (iB5 <= i24) {
            powerZonesDTO.f43993h = i24 + 1;
        }
        int iB6 = b(powerZonesDTO.f44001p, powerZonesDTO.f43987b);
        powerZonesDTO.f43994i = iB6;
        int i25 = powerZonesDTO.f43993h;
        if (iB6 <= i25) {
            powerZonesDTO.f43994i = i25 + 1;
        }
        c(powerZonesDTO);
    }
}
