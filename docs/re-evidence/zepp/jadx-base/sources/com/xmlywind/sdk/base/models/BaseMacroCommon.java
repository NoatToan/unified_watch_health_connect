package com.xmlywind.sdk.base.models;

import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.a;
import com.xmlywind.sdk.common.utils.k;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes22.dex */
public class BaseMacroCommon implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: com.xmlywind.sdk.base.models.BaseMacroCommon$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SigmobMacro.values().length];
            a = iArr;
            try {
                iArr[SigmobMacro._MC_.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SigmobMacro._MAC_.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SigmobMacro._ANDROIDID_.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SigmobMacro._ANDROIDIDMD5_.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SigmobMacro._GAID_.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SigmobMacro._GAIDMD5_.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SigmobMacro._IMEI_.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SigmobMacro._IMEIMD5_.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SigmobMacro._IMEI1_.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SigmobMacro._IMEI1MD5_.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SigmobMacro._IMEI2_.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SigmobMacro._IMEI2MD5_.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[SigmobMacro._MACMD5_.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[SigmobMacro._COUNTRY_.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[SigmobMacro._BUNDLEID_.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[SigmobMacro._LANGUAGE_.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[SigmobMacro._OSVERSION_.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[SigmobMacro._TIMESTAMP_.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[SigmobMacro._TIMEMILLIS_.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[SigmobMacro._OAID_.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public enum SigmobMacro {
        _ANDROIDID_,
        _ANDROIDIDMD5_,
        _IMEI_,
        _IMEIMD5_,
        _IMEI1_,
        _IMEI1MD5_,
        _IMEI2_,
        _IMEI2MD5_,
        _MAC_,
        _MACMD5_,
        _GAID_,
        _GAIDMD5_,
        _MC_,
        _COUNTRY_,
        _TIMESTAMP_,
        _OSVERSION_,
        _BUNDLEID_,
        _LANGUAGE_,
        _TIMEMILLIS_,
        _OAID_,
        _VAID_,
        _AAID_,
        _MSAUDID_;

        public static String a(String str) {
            String strT;
            long jCurrentTimeMillis;
            try {
                switch (AnonymousClass1.a[valueOf(str).ordinal()]) {
                    case 1:
                        return a.n().T();
                    case 2:
                        return a.h();
                    case 3:
                        return a.n().t();
                    case 4:
                        strT = a.n().t();
                        return k.a(strT);
                    case 5:
                        return a.n().w();
                    case 6:
                        strT = a.n().w();
                        return k.a(strT);
                    case 7:
                        return a.n().y();
                    case 8:
                        strT = a.n().y();
                        return k.a(strT);
                    case 9:
                        return a.n().b(0);
                    case 10:
                        strT = a.n().b(0);
                        return k.a(strT);
                    case 11:
                        return a.n().b(1);
                    case 12:
                        strT = a.n().b(1);
                        return k.a(strT);
                    case 13:
                        strT = a.h();
                        return k.a(strT);
                    case 14:
                        return a.n().X().getCountry();
                    case 15:
                        return a.n().P();
                    case 16:
                        return a.n().X().getDisplayLanguage();
                    case 17:
                        return a.c();
                    case 18:
                        jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        return String.valueOf(jCurrentTimeMillis);
                    case 19:
                        jCurrentTimeMillis = System.currentTimeMillis();
                        return String.valueOf(jCurrentTimeMillis);
                    case 20:
                        return a.n().Y();
                    default:
                        return "unFind";
                }
            } catch (Throwable unused) {
                return "unFind";
            }
        }
    }

    public String macroProcess(String str) {
        Matcher matcher = Pattern.compile("_([A-Z,0-9])+_").matcher(str);
        String strReplaceAll = str;
        while (matcher.find()) {
            try {
                String strGroup = matcher.group();
                String strA = SigmobMacro.a(strGroup);
                SigmobLog.d("macroProcess() called with: url = [" + str + "][" + strGroup + "][" + strA + "]");
                if (!TextUtils.isEmpty(strA) && !strA.equals("unFind")) {
                    strReplaceAll = strReplaceAll.replaceAll(strGroup, strA);
                }
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
        return strReplaceAll;
    }
}
