package defpackage;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.export.Host;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class emg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16810a = "https://watch.iot.mi.com/html/door-card-carousel/index.html?locale=" + Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f16811b = Host.sPathDoorNotice;

    public static String a() {
        return "https://watch.iot.mi.com" + f16811b + Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();
    }
}
