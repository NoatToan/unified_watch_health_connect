package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class fw5 implements lgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Locale, Map<String, Map<String, Object>>> f18314a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Locale, Map<String, Map<Boolean, Object>>> f18315b = c();

    @Override // defpackage.lgg
    public String a(Locale locale, String str, String str2) {
        String[] strArrE = e(locale, str, str2);
        if (strArrE == null) {
            return null;
        }
        return strArrE[0];
    }

    @Override // defpackage.lgg
    public String b(Locale locale, String str, String str2) {
        String[] strArrE = e(locale, str, str2);
        if (strArrE == null) {
            return null;
        }
        return strArrE[1];
    }

    public final HashMap c() {
        return new HashMap(7);
    }

    public String d(Locale locale, String str, String str2, boolean z) {
        String[] strArrF = f(locale, str, str2, z);
        if (strArrF == null) {
            return null;
        }
        return strArrF[1];
    }

    public final synchronized String[] e(Locale locale, String str, String str2) {
        String[] strArr;
        Object[] objArr = null;
        if (locale == null || str == null || str2 == null) {
            return null;
        }
        try {
            Map map = this.f18314a.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<String, Object>>> map2 = this.f18314a;
                HashMap mapC = c();
                map2.put(locale, mapC);
                map = mapC;
            }
            Map mapC2 = (Map) map.get(str);
            if (mapC2 == null) {
                mapC2 = c();
                map.put(str, mapC2);
                String[][] zoneStrings = wq5.d(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i++;
                }
                for (Object[] objArr2 : wq5.d(locale).getZoneStrings()) {
                    if (objArr2 != null && objArr2.length >= 5 && str.equals(objArr2[0])) {
                        objArr = objArr2;
                        break;
                    }
                }
                if (strArr != null && objArr != null) {
                    mapC2.put(strArr[2], new String[]{objArr[2], objArr[1]});
                    if (strArr[2].equals(strArr[4])) {
                        mapC2.put(strArr[4] + "-Summer", new String[]{objArr[4], objArr[3]});
                    } else {
                        mapC2.put(strArr[4], new String[]{objArr[4], objArr[3]});
                    }
                }
            }
            return (String[]) mapC2.get(str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String[] f(Locale locale, String str, String str2, boolean z) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == null || str2 == null) {
            return null;
        }
        try {
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = this.f18315b.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> map2 = this.f18315b;
                HashMap mapC = c();
                map2.put(locale, mapC);
                map = mapC;
            }
            Map mapC2 = (Map) map.get(str);
            if (mapC2 == null) {
                mapC2 = c();
                map.put(str, mapC2);
                String[][] zoneStrings = wq5.d(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i++;
                }
                for (String[] strArr3 : wq5.d(locale).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    mapC2.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    mapC2.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) mapC2.get(Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public String g(Locale locale, String str, String str2, boolean z) {
        String[] strArrF = f(locale, str, str2, z);
        if (strArrF == null) {
            return null;
        }
        return strArrF[0];
    }
}
