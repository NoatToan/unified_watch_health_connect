package com.huawei.taboo;

import android.content.Context;
import com.amap.api.services.district.DistrictSearchQuery;
import defpackage.qef;
import defpackage.qei;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class TabooReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static qei.d f23174c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qef f23175b = null;
    private qef d = null;

    public enum ParamType {
        LANGUAGE_NAME("lang", "langs"),
        REGION_NAME("region", "regions"),
        BLACK_LANG("black_lang", ""),
        CITY_NAME(DistrictSearchQuery.KEYWORDS_CITY, "citys"),
        BLACK_CITY("black_city", "");

        private String prefix;
        private String scopeName;

        ParamType(String str, String str2) {
            this.prefix = str;
            this.scopeName = str2;
        }

        public String getPrefix() {
            return this.prefix;
        }

        public String getScopeName() {
            return this.scopeName;
        }
    }

    public String b(ParamType paramType, Locale locale, String str, Context context) {
        String strA;
        if (context != null && paramType != null) {
            c(context);
            if (this.d != null) {
                int i = AnonymousClass3.f23176b[paramType.ordinal()];
                if (i == 1) {
                    return d(this.d, paramType.getPrefix(), true);
                }
                if (i == 2) {
                    return d(this.d, paramType.getPrefix(), true);
                }
                if (i == 3) {
                    String strB = qei.b(str);
                    if (strB == null || !e(paramType, strB, context)) {
                        return null;
                    }
                    return a(this.d, locale, paramType.getPrefix() + "_" + strB);
                }
                if (i == 4) {
                    if (locale != null && str != null && !str.isEmpty()) {
                        if (e(paramType, str, context)) {
                            strA = a(this.d, locale, paramType.getPrefix() + "_" + str);
                        } else {
                            strA = null;
                        }
                        if (strA != null) {
                            return strA;
                        }
                        String strB2 = qei.b(str, context);
                        if (!e(paramType, strB2, context)) {
                            return null;
                        }
                        return a(this.d, locale, paramType.getPrefix() + "_" + strB2);
                    }
                } else {
                    if (str == null || !e(paramType, str, context)) {
                        return null;
                    }
                    return a(this.d, locale, paramType.getPrefix() + "_" + str);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.huawei.taboo.TabooReader$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23176b;

        static {
            int[] iArr = new int[ParamType.values().length];
            f23176b = iArr;
            try {
                iArr[ParamType.BLACK_LANG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23176b[ParamType.BLACK_CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23176b[ParamType.CITY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23176b[ParamType.LANGUAGE_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23176b[ParamType.REGION_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public boolean e(ParamType paramType, String str, Context context) {
        c(context);
        if (this.d == null) {
            return false;
        }
        int i = AnonymousClass3.f23176b[paramType.ordinal()];
        if (i == 3) {
            return this.d.b().a().contains(str);
        }
        if (i == 4) {
            return this.d.b().b().contains(str);
        }
        if (i != 5) {
            return false;
        }
        return this.d.b().d().contains(str);
    }

    private String a(qef qefVar, Locale locale, String str) {
        List<String> listC;
        if (locale == null || (listC = qefVar.c()) == null || listC.isEmpty()) {
            return null;
        }
        List<Map.Entry<String, Integer>> listA = qei.a(listC, locale, qefVar.e());
        if (listA.get(0).getValue().intValue() == -1) {
            return null;
        }
        String key = listA.get(0).getKey();
        Iterator<String> it = qei.a(f23174c, str).iterator();
        while (it.hasNext()) {
            String strA = qefVar.a(key, it.next());
            if (strA != null && !strA.isEmpty()) {
                return strA;
            }
        }
        return null;
    }

    private String d(qef qefVar, String str, boolean z) {
        if (z) {
            Iterator<String> it = qei.a(f23174c, str).iterator();
            while (it.hasNext()) {
                String strA = qefVar.b().a(it.next());
                if (strA != null && !strA.isEmpty()) {
                    return strA;
                }
            }
            return null;
        }
        return qefVar.b().a(str);
    }

    private void c(Context context) {
        qef qefVarB;
        if (this.d == null && (qefVarB = qef.b(context)) != null) {
            this.d = qefVarB;
        }
        if (f23174c == null) {
            f23174c = qei.d.c(context);
        }
    }
}
