package defpackage;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.CrossedCardOneCardContent;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListStandardContent;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleEntryContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.SingleHotSeriesRecommendContent;
import com.huawei.health.marketing.datatype.templates.BaseSidingTemplate;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.datatype.templates.HotSeriesRecommendTemplate;
import com.huawei.health.marketing.datatype.templates.MultiFunctionTemplate;
import com.huawei.health.marketing.datatype.templates.QuickEntryTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFunctionGridContent;
import com.huawei.health.marketing.views.holders.ThreeGridSeriesViewHolder;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ewz {
    public static void e(final Context context, final String str, final SingleDailyMomentContent singleDailyMomentContent, final Map<String, Object> map) {
        if (context == null || str == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: ewz.5
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:37:0x0067  */
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                str2.hashCode();
                switch (str2) {
                    case "11100301":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100301.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100302":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100302.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100303":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100303.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100304":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100304.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100305":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100305.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100306":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100306.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100307":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100307.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) null), 0);
                        break;
                    case "11100308":
                        lmf.d().c(context, AnalyticsValue.DAILY_MOMENT_11100308.value(), ewz.b(str, singleDailyMomentContent, (Map<String, Object>) map), 0);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    public static Map<String, Object> b(String str, SingleDailyMomentContent singleDailyMomentContent, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>(16);
        }
        str.hashCode();
        switch (str) {
            case "11100301":
                map.put(ParamConstants.CallbackMethod.ON_SHOW, "1");
                break;
            case "11100302":
                map.put("click", "1");
                break;
            case "11100303":
                map.put("close", "1");
                break;
            case "11100304":
                map.put("refresh", "1");
                break;
            case "11100305":
                map.put(ParamConstants.CallbackMethod.ON_SHOW, "1");
                if (singleDailyMomentContent != null) {
                    map.put("contentId", singleDailyMomentContent.getContentId());
                    map.put("linkType", singleDailyMomentContent.getCoverLinkType());
                    map.put("linkValue", singleDailyMomentContent.getCoverLinkValue());
                    map.put("customTheme", singleDailyMomentContent.getCustomTheme());
                    map.put("subTheme", singleDailyMomentContent.getSubTheme());
                    break;
                }
                break;
            case "11100306":
            case "11100307":
            case "11100308":
                map.put("click", "1");
                if (singleDailyMomentContent != null) {
                    map.put("contentId", singleDailyMomentContent.getContentId());
                    map.put("linkType", singleDailyMomentContent.getCoverLinkType());
                    map.put("linkValue", singleDailyMomentContent.getCoverLinkValue());
                    map.put("customTheme", singleDailyMomentContent.getCustomTheme());
                    map.put("subTheme", singleDailyMomentContent.getSubTheme());
                    break;
                }
                break;
        }
        LogUtil.a("BiUtil", "eventId: " + str + "; eventMap: " + map.toString());
        return map;
    }

    public static String b(BaseTemplate baseTemplate, int i, int i2) {
        if (baseTemplate == null) {
            return "";
        }
        List arrayList = new ArrayList();
        if ((i == 10 || i == 23) && (baseTemplate instanceof QuickEntryTemplate)) {
            arrayList = ((QuickEntryTemplate) baseTemplate).getGridContents();
        } else if (i == 113 && (baseTemplate instanceof HotSeriesRecommendTemplate)) {
            arrayList = ((HotSeriesRecommendTemplate) baseTemplate).getGridContents();
        } else if (i == 116 && (baseTemplate instanceof MultiFunctionTemplate)) {
            arrayList = ((MultiFunctionTemplate) baseTemplate).getGridContents();
        } else if (baseTemplate instanceof GridTemplate) {
            GridTemplate gridTemplate = (GridTemplate) baseTemplate;
            arrayList = fxk.c(i, gridTemplate.getSleepAudioType(), gridTemplate.getGridContents());
        } else {
            LogUtil.a("BiUtil", "getColumnItemName contentList is empty.");
        }
        return njy.c(arrayList, i2) ? c((List<?>) arrayList, i2) : "";
    }

    private static String c(List<?> list, int i) {
        Object obj = list.get(i);
        if (obj instanceof SingleEntryContent) {
            return ((SingleEntryContent) obj).getName();
        }
        if (obj instanceof SingleHotSeriesRecommendContent) {
            return ((SingleHotSeriesRecommendContent) obj).getTheme();
        }
        if (obj instanceof SingleFunctionGridContent) {
            return ((SingleFunctionGridContent) obj).getTheme();
        }
        if (obj instanceof SingleGridContent) {
            return ((SingleGridContent) obj).getTheme();
        }
        return "";
    }

    public static String c(BaseSidingTemplate baseSidingTemplate, int i) {
        HealthTextView healthTextViewG;
        if (baseSidingTemplate != null && baseSidingTemplate.getGridContents() != null) {
            Object obj = baseSidingTemplate.getGridContents().get(i);
            if (obj instanceof SingleCourseRecommendListStandardContent) {
                return ((SingleCourseRecommendListStandardContent) obj).getTheme();
            }
            if (obj instanceof CrossedCardOneCardContent) {
                return ((CrossedCardOneCardContent) obj).getTheme();
            }
            if (!(obj instanceof ThreeGridSeriesViewHolder) || (healthTextViewG = ((ThreeGridSeriesViewHolder) obj).g()) == null) {
                return "";
            }
            return healthTextViewG.toString();
        }
        return "";
    }
}
