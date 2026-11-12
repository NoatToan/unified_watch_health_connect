package defpackage;

import android.content.Context;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.templates.DailyMomentContent;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class exa {
    public static int b(Context context, DailyMomentContent dailyMomentContent) {
        String strD;
        if (context != null && dailyMomentContent != null) {
            return ((dailyMomentContent.getRank() != null ? SharedPreferenceManager.e(context, Integer.toString(11000), "rank", Integer.toString(dailyMomentContent.getRank().intValue()), new StorageParams()) : -1) == 0 && (dailyMomentContent.getDisplayRule() != null ? SharedPreferenceManager.e(context, Integer.toString(11000), "display_rule", Integer.toString(dailyMomentContent.getDisplayRule().intValue()), new StorageParams()) : -1) == 0 && (dailyMomentContent.getDisplayUpperLimit() != null ? SharedPreferenceManager.e(context, Integer.toString(11000), "display_upper_limit", Integer.toString(dailyMomentContent.getDisplayUpperLimit().intValue()), new StorageParams()) : -1) == 0 && ((dailyMomentContent.getMomentContents() == null || (strD = d(dailyMomentContent.getMomentContents())) == null || strD.isEmpty()) ? -1 : SharedPreferenceManager.e(context, Integer.toString(11000), "moment_contents", strD, new StorageParams())) == 0) ? 0 : -1;
        }
        LogUtil.e("SharedPreferenceUtil", "content or context is invalid");
        return -1;
    }

    public static DailyMomentContent e(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        if (context == null) {
            LogUtil.e("SharedPreferenceUtil", "context is invalid");
            return null;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(11000), "rank");
        String strE2 = SharedPreferenceManager.e(context, Integer.toString(11000), "display_rule");
        String strE3 = SharedPreferenceManager.e(context, Integer.toString(11000), "display_upper_limit");
        String strE4 = SharedPreferenceManager.e(context, Integer.toString(11000), "moment_contents");
        int i5 = 0;
        if (strE == null || strE2 == null || strE3 == null) {
            i = 0;
            i2 = 0;
        } else {
            try {
                i3 = Integer.parseInt(strE);
                try {
                    i4 = Integer.parseInt(strE2);
                    try {
                        i5 = Integer.parseInt(strE3);
                    } catch (NumberFormatException e) {
                        e = e;
                        LogUtil.e("SharedPreferenceUtil", " set rank or displayRule error", e.getMessage());
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    i4 = 0;
                }
            } catch (NumberFormatException e3) {
                e = e3;
                i3 = 0;
                i4 = 0;
            }
            int i6 = i3;
            i2 = i5;
            i = i4;
            i5 = i6;
        }
        List<SingleDailyMomentContent> listE = e(strE4);
        if (listE == null || listE.isEmpty()) {
            return null;
        }
        return new DailyMomentContent(i5, i, i2, listE);
    }

    public static int a(Context context, List<SingleDailyMomentContent> list) {
        if (context == null || list == null || list.isEmpty()) {
            LogUtil.e("SharedPreferenceUtil", "invalid params");
            return -1;
        }
        List<SingleDailyMomentContent> listC = c(context);
        Iterator<SingleDailyMomentContent> it = list.iterator();
        while (it.hasNext()) {
            String contentId = it.next().getContentId();
            for (SingleDailyMomentContent singleDailyMomentContent : listC) {
                if (singleDailyMomentContent.getContentId().equals(contentId)) {
                    singleDailyMomentContent.setLatestShowTime(Long.toString(System.currentTimeMillis()));
                }
            }
        }
        return d(context, listC);
    }

    private static List<SingleDailyMomentContent> c(Context context) {
        if (context == null) {
            LogUtil.e("SharedPreferenceUtil", "context is invalid");
            return new ArrayList();
        }
        List<SingleDailyMomentContent> listE = e(SharedPreferenceManager.e(context, Integer.toString(11000), "moment_contents"));
        return (listE == null || listE.isEmpty()) ? new ArrayList() : listE;
    }

    private static int d(Context context, List<SingleDailyMomentContent> list) {
        return SharedPreferenceManager.e(context, Integer.toString(11000), "moment_contents", d(list), new StorageParams());
    }

    private static String d(List<SingleDailyMomentContent> list) {
        return qqt.a(list, new TypeToken<List<SingleDailyMomentContent>>() { // from class: com.huawei.health.functionsetcard.dailymoment.utils.SharedPreferenceUtil$1
        }.getType());
    }

    private static List<SingleDailyMomentContent> e(String str) {
        try {
            return (List) qqt.c(str, new TypeToken<List<SingleDailyMomentContent>>() { // from class: com.huawei.health.functionsetcard.dailymoment.utils.SharedPreferenceUtil$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("SharedPreferenceUtil", "JsonSyntaxException");
            return Collections.EMPTY_LIST;
        }
    }
}
