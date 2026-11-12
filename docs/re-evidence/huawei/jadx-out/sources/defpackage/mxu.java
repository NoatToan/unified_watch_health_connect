package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwmap.callback.ReverseGeocodeResultCallback;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public class mxu {
    public static void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SosCoordinateConverterUtil", "getNewMessage message enter ");
        if (!str.contains(Marker.ANY_NON_NULL_MARKER) && !str.contains(Constants.LINK)) {
            iBaseResponseCallback.a(0, str);
            ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "getNewMessage do not need conver");
            return;
        }
        Matcher matcherD = d(str);
        if (d(str) == null) {
            iBaseResponseCallback.a(0, str);
            ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "getNewMessage getMatcher is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c(matcherD, arrayList, arrayList2);
        ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "getNewMessage stringList size:", Integer.valueOf(arrayList.size()), " doubleList size :", Integer.valueOf(arrayList2.size()));
        if (arrayList.size() != 2 || arrayList2.size() != 2) {
            iBaseResponseCallback.a(0, str);
            return;
        }
        Double d = (Double) arrayList2.get(1);
        double dDoubleValue = d.doubleValue();
        Double d2 = (Double) arrayList2.get(0);
        double dDoubleValue2 = d2.doubleValue();
        ReleaseLogUtil.d("DEVMGR_SosCoordinateConverterUtil", "getNewMessage longitudeDouble:", d, " latitudeDouble:", d2);
        double dDoubleValue3 = new BigDecimal(Double.toString(dDoubleValue)).setScale(6, RoundingMode.HALF_UP).doubleValue();
        double dDoubleValue4 = new BigDecimal(Double.toString(dDoubleValue2)).setScale(6, RoundingMode.HALF_UP).doubleValue();
        ReleaseLogUtil.d("DEVMGR_SosCoordinateConverterUtil", "getNewMessage longitudeSub:", Double.valueOf(dDoubleValue3), " latitudeSub:", Double.valueOf(dDoubleValue4));
        String str2 = (String) arrayList.get(0);
        ReleaseLogUtil.d("DEVMGR_SosCoordinateConverterUtil", "getNewMessage latitudeString is ", str2);
        if (TextUtils.isEmpty(str2)) {
            iBaseResponseCallback.a(0, str);
        } else {
            b(str, dDoubleValue3, dDoubleValue4, str2, iBaseResponseCallback);
        }
    }

    private static void b(final String str, double d, double d2, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        npx.a("SosCoordinateConverterUtil", d, d2, 50, c(), new ReverseGeocodeResultCallback() { // from class: mxu.3
            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onSuccess(ReverseGeocodeResponse reverseGeocodeResponse) {
                if (reverseGeocodeResponse == null) {
                    iBaseResponseCallback.a(0, str);
                    ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode response is null");
                    return;
                }
                List<ReverseGeocodeResponse.Site> sites = reverseGeocodeResponse.getSites();
                if (njy.e(sites)) {
                    iBaseResponseCallback.a(0, str);
                    ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode siteList isEmpty");
                    return;
                }
                ReverseGeocodeResponse.Site site = sites.get(0);
                if (site == null) {
                    iBaseResponseCallback.a(0, str);
                    ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode site is null");
                    return;
                }
                String formatAddress = site.getFormatAddress();
                if (TextUtils.isEmpty(formatAddress)) {
                    iBaseResponseCallback.a(0, str);
                    ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode formatAddress is null");
                    return;
                }
                iBaseResponseCallback.a(0, str.replace(str2, formatAddress + " " + str2));
            }

            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onFailure(Throwable th) {
                iBaseResponseCallback.a(0, str);
                ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode  throwable:", ExceptionUtils.c(th));
            }
        });
    }

    private static Matcher d(String str) {
        try {
            return Pattern.compile("([+-])?(\\d+\\.?\\d*)°(\\d+\\.?\\d*)[′'](\\d+\\.?\\d*)[″\"]").matcher(str);
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "getNewMessage getMatcher exception");
            return null;
        }
    }

    private static void c(Matcher matcher, List<String> list, List<Double> list2) {
        while (matcher.find()) {
            try {
                list.add(matcher.group());
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                String strGroup3 = matcher.group(3);
                String strGroup4 = matcher.group(4);
                double d = Double.parseDouble(strGroup2) + (Double.parseDouble(strGroup3) / 60.0d) + (Double.parseDouble(strGroup4) / 3600.0d);
                if (strGroup != null && strGroup.equals(Constants.LINK)) {
                    d = -d;
                }
                list2.add(Double.valueOf(d));
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                ReleaseLogUtil.e("DEVMGR_SosCoordinateConverterUtil", "convertDmsToDouble exception ", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    private static String c() {
        byte b2;
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        ReleaseLogUtil.d("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode language:", language, " country: ", country);
        if (TextUtils.isEmpty(language)) {
            language = !Utils.o() ? MLAsrConstants.LAN_ZH : "en";
        }
        if (TextUtils.isEmpty(country)) {
            return language;
        }
        language.hashCode();
        int iHashCode = language.hashCode();
        if (iHashCode != 3241) {
            if (iHashCode != 3246) {
                if (iHashCode != 3276) {
                    if (iHashCode != 3588) {
                        if (iHashCode != 3886) {
                            if (iHashCode == 106375 && language.equals("kok")) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (language.equals(MLAsrConstants.LAN_ZH)) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (language.equals("pt")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (language.equals("fr")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (language.equals("es")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (language.equals("en")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            language = b(language, country, "AU".equalsIgnoreCase(country) || "GB".equalsIgnoreCase(country));
        } else if (b2 == 1) {
            language = b(language, country, "419".equalsIgnoreCase(country));
        } else if (b2 == 2) {
            language = b(language, country, "CA".equalsIgnoreCase(country));
        } else if (b2 == 3) {
            language = b(language, country, "BR".equalsIgnoreCase(country) || "PT".equalsIgnoreCase(country));
        } else if (b2 == 4) {
            language = b(language, country, "CN".equalsIgnoreCase(country) || "HK".equalsIgnoreCase(country) || "TW".equalsIgnoreCase(country));
        } else if (b2 == 5) {
            language = "kok-Deva";
        }
        ReleaseLogUtil.d("DEVMGR_SosCoordinateConverterUtil", "reverseGeocode fullLocale:", language);
        return language;
    }

    private static String b(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2) || !z) {
            return str;
        }
        return str + Constants.LINK + str2;
    }
}
