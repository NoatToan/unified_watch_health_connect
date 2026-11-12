package cf2;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import o53.s0;
import org.koin.core.component.KoinComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface g extends KoinComponent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf2/g$a;", "", "<init>", "()V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f27038a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f27038a;
    }

    static Object b4(e23.l lVar, v13.c cVar) {
        int i14 = gt2.c.f79010a;
        Logger loggerH = gt2.b.f79005a.h("CampaignRequestBuilder");
        String name = lVar.getClass().getName();
        loggerH.debug("CampaignRequestBuilder", "executeHTTPRequest");
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new h(lVar, loggerH, name, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    static String l6(Context context) {
        String upperCase;
        String networkCountryIso;
        LocationManager locationManager;
        Location lastKnownLocation;
        context.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str = null;
        String simCountryIso = telephonyManager != null ? telephonyManager.getSimCountryIso() : null;
        if (simCountryIso != null && simCountryIso.length() == 2) {
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = simCountryIso.toUpperCase(locale);
            upperCase.getClass();
        } else if (telephonyManager == null || telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null || networkCountryIso.length() != 2) {
            upperCase = null;
        } else {
            Locale locale2 = Locale.US;
            locale2.getClass();
            upperCase = networkCountryIso.toUpperCase(locale2);
            upperCase.getClass();
        }
        if (upperCase != null) {
            return sn.a.g(upperCase);
        }
        boolean z14 = a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z15 = a7.b.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if ((z14 || z15) && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            boolean zIsProviderEnabled = z14 ? locationManager.isProviderEnabled("gps") : false;
            boolean zIsProviderEnabled2 = z15 ? locationManager.isProviderEnabled("network") : false;
            if (!zIsProviderEnabled && !zIsProviderEnabled2) {
                lastKnownLocation = null;
            } else if (zIsProviderEnabled) {
                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                if (lastKnownLocation == null) {
                    if (zIsProviderEnabled2) {
                        lastKnownLocation = locationManager.getLastKnownLocation("network");
                    } else {
                        lastKnownLocation = null;
                    }
                }
            } else if (zIsProviderEnabled2) {
                lastKnownLocation = locationManager.getLastKnownLocation("network");
            } else {
                lastKnownLocation = null;
            }
        } else {
            lastKnownLocation = null;
        }
        if (lastKnownLocation != null) {
            try {
                List<Address> fromLocation = new Geocoder(context).getFromLocation(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 1);
                if (fromLocation != null && !fromLocation.isEmpty()) {
                    for (Address address : fromLocation) {
                        if (address != null) {
                            String countryCode = address.getCountryCode();
                            countryCode.getClass();
                            Locale locale3 = Locale.getDefault();
                            locale3.getClass();
                            String upperCase2 = countryCode.toUpperCase(locale3);
                            upperCase2.getClass();
                            str = upperCase2;
                            break;
                        }
                    }
                }
            } catch (IOException | IllegalArgumentException | Exception unused) {
            }
        }
        if (str != null) {
            return sn.a.g(str);
        }
        Locale locale4 = Locale.getDefault();
        String country = locale4.getCountry();
        country.getClass();
        String upperCase3 = country.toUpperCase(locale4);
        upperCase3.getClass();
        return upperCase3;
    }
}
