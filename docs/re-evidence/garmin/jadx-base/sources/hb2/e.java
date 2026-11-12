package hb2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class e {
    public static String a(Context context) {
        String lowerCase;
        String networkCountryIso;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null || simCountryIso.length() != 2) {
            lowerCase = (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null || networkCountryIso.length() != 2) ? null : networkCountryIso.toLowerCase(Locale.US);
        } else {
            lowerCase = simCountryIso.toLowerCase(Locale.US);
        }
        if (lowerCase != null) {
            return lowerCase;
        }
        String country = h.a(context).getCountry();
        return !country.isEmpty() ? country.toLowerCase(Locale.US) : "us";
    }
}
