package com.huawei.haf.language;

import android.text.TextUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class DefaultLanguageInfo implements LanguageInfo {
    private static final HashMap<String, String> e = new HashMap<>();
    private static final HashSet<String> d = new HashSet<>();

    private DefaultLanguageInfo() {
        HashMap<String, String> map = e;
        if (map.isEmpty()) {
            LanguageInfoHelper.b(map, d);
        }
    }

    static LanguageInfo d() {
        DefaultLanguageInfo defaultLanguageInfo;
        synchronized (DefaultLanguageInfo.class) {
            defaultLanguageInfo = new DefaultLanguageInfo();
        }
        return defaultLanguageInfo;
    }

    @Override // com.huawei.haf.language.LanguageInfo
    public String getLanguageUuid(Locale locale) {
        String strE = e(locale);
        String strB = b(locale, strE);
        String strE2 = e(locale, strB, strE);
        HashMap<String, String> map = e;
        String str = map.get(strE2);
        return str != null ? str : map.get(strB);
    }

    @Override // com.huawei.haf.language.LanguageInfo
    public String getLanguageName(String str, Locale locale) {
        if (str != null) {
            for (Map.Entry<String, String> entry : e.entrySet()) {
                if (str.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return locale != null ? b(locale, e(locale)) : "";
    }

    @Override // com.huawei.haf.language.LanguageInfo
    public List<String> getAllLanguageUuid(boolean z) {
        HashMap<String, String> map = e;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z || !isCloudPresetLanguage(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.haf.language.LanguageInfo
    public boolean isStorePresetLanguage(String str) {
        return "en".equals(getLanguageName(str, null));
    }

    @Override // com.huawei.haf.language.LanguageInfo
    public boolean isCloudPresetLanguage(String str) {
        if (str != null) {
            return d.contains(str);
        }
        return true;
    }

    @Override // com.huawei.haf.language.LanguageInfo
    public boolean isCloudSecondLanguage(String str) {
        return LanguageInfoHelper.d(str);
    }

    private static String e(Locale locale) {
        return locale.getScript();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    private static String b(Locale locale, String str) {
        byte b2;
        String language = locale.getLanguage();
        language.hashCode();
        int iHashCode = language.hashCode();
        if (iHashCode != 3325) {
            if (iHashCode != 3355) {
                if (iHashCode != 3404) {
                    if (iHashCode != 3500) {
                        if (iHashCode != 3679) {
                            if (iHashCode == 101385 && language.equals("fil")) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (language.equals("sr")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (language.equals("my")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (language.equals("jv")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (language.equals("id")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (language.equals("he")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "iw";
        }
        if (b2 == 1) {
            return "in";
        }
        if (b2 == 2) {
            return "b+jv+Latn";
        }
        if (b2 == 3) {
            return "Qaag".equals(str) ? "b+my+Qaag" : language;
        }
        if (b2 != 4) {
            return b2 != 5 ? language : "tl";
        }
        return "b+sr+Latn";
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    private static String e(Locale locale, String str, String str2) {
        byte b2;
        String str3 = str + Constants.LINK + locale.getCountry();
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 3149) {
            if (iHashCode != 3241) {
                if (iHashCode != 3246) {
                    if (iHashCode != 3588) {
                        if (iHashCode == 3886 && str.equals(MLAsrConstants.LAN_ZH)) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("pt")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("es")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("en")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("bo")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "bo-CN";
        }
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        if ("Hans".equals(str2) || (TextUtils.isEmpty(str2) && "zh-CN".equals(str3))) {
                            return "zh-CN";
                        }
                        if ("zh-TW".equals(str3)) {
                            return "zh-TW";
                        }
                        return "zh-HK";
                    }
                } else if (Arrays.asList("pt-AO", "pt-CV", "pt-GW", "pt-MO", "pt-MZ", "pt-ST", "pt-TL").contains(str3)) {
                    return "pt-PT";
                }
            } else if (Arrays.asList("es-AR", "es-BO", "es-CL", "es-CO", "es-CR", "es-CU", "es-DO", "es-EC", "es-GT", "es-HN", "es-MX", "es-NI", "es-PA", "es-PE", "es-PR", "es-PY", "es-SV", "es-UY", "es-VE").contains(str3)) {
                return "es-US";
            }
        } else if ("Qaag".equals(str2)) {
            return "en-GB";
        }
        return str3;
    }
}
