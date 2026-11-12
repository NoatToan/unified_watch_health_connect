package x52;

import android.content.Context;
import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import m52.k;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lx52/g;", "", "", "zoneID", "heartRateZoneItemResourceID", "<init>", "(Ljava/lang/String;III)V", "", "powerRange", "(Ljava/lang/String;IIILjava/lang/String;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    ZONE_1(1, R.string.HeartRateZone1),
    ZONE_2(2, R.string.HeartRateZone2),
    ZONE_3(3, R.string.HeartRateZone3),
    ZONE_4(4, R.string.HeartRateZone4),
    ZONE_5(5, R.string.HeartRateZone5),
    ZONE_6(6, 0),
    ZONE_7(7, 0);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f189104d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f189115c;

    g(int i14, int i15, String str) {
        this.f189113a = i14;
        this.f189114b = i15;
        this.f189115c = str;
    }

    public final String a(Context context) {
        context.getClass();
        return com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.workout_power_zone_x, Integer.valueOf(this.f189113a)), " (", this.f189115c, ")");
    }

    public final void b(Resources resources, int i14) {
        this.f189115c = sn.a.e(i14, ">", StringUtils.SPACE, resources.getString(R.string.lbl_watts));
    }

    public final void c(Resources resources, int i14, int i15) {
        this.f189115c = i14 + "-" + i15 + StringUtils.SPACE + resources.getString(R.string.lbl_watts);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx52/g$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static g a(int i14) {
            for (g gVar : g.values()) {
                if (gVar.f189113a == i14) {
                    return gVar;
                }
            }
            return null;
        }

        public static void b(Resources resources, k kVar, PowerZonesDTO powerZonesDTO) {
            kVar.getClass();
            powerZonesDTO.getClass();
            if (kVar == k.f116754n) {
                g.ZONE_1.c(resources, powerZonesDTO.f43988c, powerZonesDTO.f43989d);
                g.ZONE_2.c(resources, powerZonesDTO.f43989d, powerZonesDTO.f43990e);
                g.ZONE_3.c(resources, powerZonesDTO.f43990e, powerZonesDTO.f43991f);
                g.ZONE_4.c(resources, powerZonesDTO.f43991f, powerZonesDTO.f43992g);
                g.ZONE_5.b(resources, powerZonesDTO.f43992g);
                return;
            }
            g.ZONE_1.c(resources, powerZonesDTO.f43988c, powerZonesDTO.f43989d);
            g.ZONE_2.c(resources, powerZonesDTO.f43989d, powerZonesDTO.f43990e);
            g.ZONE_3.c(resources, powerZonesDTO.f43990e, powerZonesDTO.f43991f);
            g.ZONE_4.c(resources, powerZonesDTO.f43991f, powerZonesDTO.f43992g);
            g.ZONE_5.c(resources, powerZonesDTO.f43992g, powerZonesDTO.f43993h);
            g.ZONE_6.c(resources, powerZonesDTO.f43993h, powerZonesDTO.f43994i);
            g.ZONE_7.b(resources, powerZonesDTO.f43994i);
        }

        private a() {
        }
    }

    g(int i14, int i15) {
        this.f189113a = i14;
        this.f189114b = i15;
    }
}
