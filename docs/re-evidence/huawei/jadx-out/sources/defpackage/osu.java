package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osu {
    public static void b(Context context, HashMap<String, String> map) {
        if (context == null || map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            LogUtil.a("PLGACHIEVE_AchieveMedalParserUtil", "refreshFirstTabRedPointSP firstabname =", key, " newMedal =", value);
            osa.b(context, key, value);
        }
    }

    public static void b(String str, JSONObject jSONObject, List<osf> list) {
        boolean zA;
        boolean zA2;
        boolean zA3;
        boolean zA4;
        boolean z;
        boolean z2;
        boolean zA5;
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalParserUtil", "refreshMedalSp medalConfigDb isEmpty.", str);
            d(str, BaseApplication.b());
            return;
        }
        boolean z3 = true;
        try {
            Iterator<osf> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zA5 = true;
                    zA2 = true;
                    zA3 = true;
                    zA4 = true;
                    break;
                }
                osf next = it.next();
                if (next instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) next;
                    if (str.equals(medalConfigInfo.acquireMedalID())) {
                        zA = a(medalConfigInfo.acquireGrayListStyle(), jSONObject.getString(ParsedFieldTag.GRAY_LIST_STYLE));
                        try {
                            zA2 = a(medalConfigInfo.acquireGrayDetailStyle(), jSONObject.getString(ParsedFieldTag.GRAY_DETAIL_STYLE));
                            try {
                                zA3 = a(medalConfigInfo.acquireLightListStyle(), jSONObject.getString(ParsedFieldTag.LIGHT_LIST_STYLE));
                                try {
                                    zA4 = a(medalConfigInfo.acquireLightDetailStyle(), jSONObject.getString(ParsedFieldTag.LIGHT_DETAIL_STYLE));
                                    try {
                                        zA5 = a(medalConfigInfo.acquireShareImageUrl(), jSONObject.getString(ParsedFieldTag.SHARE_IMAGE_URL));
                                        z3 = zA;
                                        break;
                                    } catch (JSONException unused) {
                                        LogUtil.e("PLGACHIEVE_AchieveMedalParserUtil", "refreshMedalSp Exception");
                                        z = true;
                                        z2 = zA;
                                    }
                                } catch (JSONException unused2) {
                                    zA4 = true;
                                }
                            } catch (JSONException unused3) {
                                zA3 = true;
                                zA4 = true;
                            }
                        } catch (JSONException unused4) {
                            zA2 = true;
                        }
                    }
                    zA2 = true;
                    zA3 = true;
                    zA4 = true;
                    LogUtil.e("PLGACHIEVE_AchieveMedalParserUtil", "refreshMedalSp Exception");
                    z = true;
                    z2 = zA;
                    boolean z4 = zA2;
                    boolean z5 = zA3;
                    boolean z6 = zA4;
                    LogUtil.a("PLGACHIEVE_AchieveMedalParserUtil", "refreshMedalSp Id ", str, "isGrayListC ", Boolean.valueOf(z2), "isGrayDetailC ", Boolean.valueOf(z4), "isLightListC ", Boolean.valueOf(z5), "isLightDetailC ", Boolean.valueOf(z6), "isShareC ", Boolean.valueOf(z));
                    if (!z2 || z5 || z4 || z6 || z) {
                        d(str, BaseApplication.b());
                    }
                    return;
                }
            }
            z = zA5;
            z2 = z3;
        } catch (JSONException unused5) {
            zA = true;
        }
        boolean z7 = zA2;
        boolean z8 = zA3;
        boolean z9 = zA4;
        LogUtil.a("PLGACHIEVE_AchieveMedalParserUtil", "refreshMedalSp Id ", str, "isGrayListC ", Boolean.valueOf(z2), "isGrayDetailC ", Boolean.valueOf(z7), "isLightListC ", Boolean.valueOf(z8), "isLightDetailC ", Boolean.valueOf(z9), "isShareC ", Boolean.valueOf(z));
        if (z2) {
        }
        d(str, BaseApplication.b());
    }

    private static boolean a(String str, String str2) {
        if (str == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalParserUtil", "isMedalUrlChange dbUrl is null.");
            return true;
        }
        return !str.equals(str2);
    }

    public static void d(String str, Context context) {
        if (context == null) {
            LogUtil.d("PLGACHIEVE_AchieveMedalParserUtil", "refreshSharePrefrence context is null");
            return;
        }
        String strD = oun.d(osa.e(context, "_medalPngStatusDownload"), str);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.d("PLGACHIEVE_AchieveMedalParserUtil", "refreshSharePrefrence failed");
        } else {
            osa.b(context, "_medalPngStatusDownload", strD);
        }
    }

    public static void e(String str, Context context) {
        if (context == null) {
            LogUtil.d("PLGACHIEVE_AchieveMedalParserUtil", "refreshTextureSharePrefrence context is null");
            return;
        }
        String strA = oun.a(osa.e(context, "_medalTextureDownload"), str);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.d("PLGACHIEVE_AchieveMedalParserUtil", "refreshTextureSharePrefrence failed");
        } else {
            osa.b(context, "_medalTextureDownload", strA);
        }
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Integer.parseInt(str) > 102) {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        return System.currentTimeMillis() <= Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("PLGACHIEVE_AchieveMedalParserUtil", "NumberFormatException");
                    }
                } else {
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            if (System.currentTimeMillis() > Long.parseLong(str3) + 2592000000L) {
                                return false;
                            }
                        } catch (NumberFormatException unused2) {
                            LogUtil.e("PLGACHIEVE_AchieveMedalParserUtil", "NumberFormatException");
                        }
                    }
                    return true;
                }
            }
        } catch (NumberFormatException unused3) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParserUtil", "NumberFormatException");
        }
        return false;
    }

    public static boolean d(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3);
    }
}
