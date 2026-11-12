package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.health.pluginlocation.fileserviceutil.GpsFileUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class gqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f35940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f35941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static gqw f35942c;

    public static gqw b(Context context, String str) {
        grn.d("AAR,GRSManager", "[getInstance], start.");
        if (f35942c == null) {
            f35941b = context;
            f35940a = str;
            f35942c = new gqw();
        }
        return f35942c;
    }

    private GrsClient b() {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setCountrySource(f35940a);
        grsBaseInfo.setSerCountry(f35940a);
        grsBaseInfo.setRegCountry(f35940a);
        return new GrsClient(f35941b, grsBaseInfo);
    }

    public String b(String str, String str2) {
        String strSynGetGrsUrl = b().synGetGrsUrl(str, str2);
        if (TextUtils.isEmpty(strSynGetGrsUrl)) {
            grn.c("AAR,GRSManager", "getUrl error, key is ", str2);
        }
        return strSynGetGrsUrl;
    }

    public static String d(Context context, double d, double d2) {
        if (!GpsFileUtil.isValidGpsCoordinate(d, d2)) {
            return "CN";
        }
        String simCountryIso = null;
        try {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(d, d2, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                Address address = fromLocation.get(0);
                simCountryIso = address.getCountryCode();
                if (!TextUtils.isEmpty(simCountryIso)) {
                    grn.d("AAR,GRSManager", "[getCountryCode] from location success.");
                    return simCountryIso;
                }
                String countryName = address.getCountryName();
                if (countryName != null) {
                    grn.d("AAR,GRSManager", "[getCountryCode] countryName is " + countryName);
                    simCountryIso = c(countryName);
                }
                if (!TextUtils.isEmpty(simCountryIso)) {
                    grn.d("AAR,GRSManager", "[getCountryCode] from location success.");
                    return simCountryIso;
                }
                grn.e("AAR,GRSManager", "[getCountryCode] countryCode is empty, address: ", address.toString());
            }
        } catch (IOException e) {
            grn.c("AAR,GRSManager", "[getCountryCode] fail, msg: ", e.getMessage());
        }
        if (d2 >= 139.250466d && d2 <= 146.086831d && d >= 32.518374d && d <= 46.46656133d) {
            return "JP";
        }
        if (d2 >= 130.11206d && d2 <= 140.436366d && d >= 29.466366d && d <= 36.87522256d) {
            return "JP";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            simCountryIso = telephonyManager.getSimCountryIso();
        }
        if (!TextUtils.isEmpty(simCountryIso)) {
            grn.d("AAR,GRSManager", "[getCountryCode] from sim success.");
            return simCountryIso;
        }
        grn.e("AAR,GRSManager", "[getCountryCode] fail, return default countryCode CN");
        return "CN";
    }

    public static String c(String str) {
        for (Locale locale : Locale.getAvailableLocales()) {
            if (str.equalsIgnoreCase(locale.getDisplayCountry())) {
                return locale.getCountry();
            }
        }
        return null;
    }
}
