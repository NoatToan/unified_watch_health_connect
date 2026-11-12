package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.audio.PlayRecordInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioGroup;
import com.huawei.pluginfitnessadvice.audio.SleepAudioInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class haa {
    private static int d(int i, int i2) {
        if (i2 >= i) {
            return 100;
        }
        return (int) (((i2 * 1.0f) / i) * 100.0f);
    }

    public static boolean d(int i) {
        return i == 2;
    }

    public static final String a(SleepAudioSeries sleepAudioSeries) {
        int isVip = sleepAudioSeries.getIsVip();
        if (isVip == 0) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_free);
        }
        if (isVip == 1) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_vip);
        }
        if (isVip == 2) {
            int purchasedStatus = sleepAudioSeries.getPurchasedStatus();
            if (purchasedStatus == 1) {
                return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_purchased);
            }
            if (purchasedStatus == 2) {
                return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_pay);
            }
            return "";
        }
        return "";
    }

    public static final String c(int i, int i2) {
        if (i == 0) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_free);
        }
        if (i == 1) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_vip);
        }
        if (i != 2) {
            return "";
        }
        if (i2 == 1) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_purchased);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_pay);
    }

    public static final String c(SleepAudioInfo sleepAudioInfo, SleepAudioSeries sleepAudioSeries) {
        int isVip = sleepAudioInfo.getIsVip();
        if (isVip == 0) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_free);
        }
        if (isVip == 2) {
            if (e(sleepAudioSeries)) {
                return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_purchased);
            }
            if (e(sleepAudioInfo)) {
                return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_try_listening);
            }
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_pay);
        }
        return "";
    }

    public static final boolean b(SleepAudioSeries sleepAudioSeries) {
        return sleepAudioSeries.getIsVip() == 1;
    }

    public static final boolean c(SleepAudioInfo sleepAudioInfo) {
        return sleepAudioInfo.getIsVip() == 1;
    }

    public static final boolean d(SleepAudioSeries sleepAudioSeries) {
        return sleepAudioSeries.getIsVip() == 2;
    }

    public static final boolean e(SleepAudioInfo sleepAudioInfo) {
        return !TextUtils.isEmpty(sleepAudioInfo.getAuditionUrl());
    }

    public static final boolean e(SleepAudioSeries sleepAudioSeries) {
        return sleepAudioSeries.getPurchasedStatus() == 1;
    }

    public static String b(SleepAudioSeries sleepAudioSeries, long j) {
        StringBuilder sb = new StringBuilder();
        String strE = e(sleepAudioSeries.getHeatCount());
        if (!TextUtils.isEmpty(strE)) {
            sb.append(strE);
            sb.append("  |  ");
        }
        int seriesAudioSize = sleepAudioSeries.getSeriesAudioSize();
        sb.append(qre.e(R.plurals.IDS_sleep_decompression_chapter, seriesAudioSize, UnitUtil.e(seriesAudioSize, 1, 0)));
        sb.append("  |  ");
        sb.append(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_min, Long.valueOf(j / 60)));
        return sb.toString();
    }

    public static String b(long j) {
        if (j == 0) {
            return "";
        }
        long j2 = j / 60;
        if (j2 == 0) {
            return "";
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_sport_timeline_mins_string, Long.valueOf(j2));
    }

    public static final String e(int i) {
        if (i <= 0) {
            return "";
        }
        return qqk.b(i);
    }

    public static String e(long j, PlayRecordInfo playRecordInfo) {
        if (playRecordInfo == null) {
            LogUtil.a("CourseTagUtils", "playRecord is null");
            return "";
        }
        if (playRecordInfo.getCompleteCount() > 0) {
            LogUtil.a("CourseTagUtils", "completeCount:", Integer.valueOf(playRecordInfo.getCompleteCount()));
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_played);
        }
        long duration = playRecordInfo.getDuration();
        if (duration == 0) {
            LogUtil.a("CourseTagUtils", "duration is 0");
            return "";
        }
        if (duration >= j) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_played);
        }
        long j2 = (long) (((duration * 1.0f) / j) * 100.0f);
        if (j2 == 0) {
            j2 = 1;
        }
        LogUtil.a("CourseTagUtils", "percent: ", Long.valueOf(j2));
        if (Long.compare(j2, 100L) >= 0) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_played);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_playing) + " " + Long.toString(j2) + "%";
    }

    private static boolean d(long j, PlayRecordInfo playRecordInfo) {
        if (playRecordInfo == null) {
            LogUtil.a("CourseTagUtils", "playRecord is null");
            return false;
        }
        if (playRecordInfo.getCompleteCount() > 0) {
            LogUtil.a("CourseTagUtils", "completeCount:", Integer.valueOf(playRecordInfo.getCompleteCount()));
            return true;
        }
        long duration = playRecordInfo.getDuration();
        if (duration != 0) {
            return duration >= j || Long.compare((long) (((((float) duration) * 1.0f) / ((float) j)) * 100.0f), 100L) >= 0;
        }
        LogUtil.a("CourseTagUtils", "duration is 0");
        return false;
    }

    public static long b(SleepAudioPackage sleepAudioPackage) {
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.a("CourseTagUtils", "series is null");
            return 0L;
        }
        if (sleepAudioSeries.getDisplayStyle() == 1) {
            return d(sleepAudioPackage.getSleepAudioInfoList());
        }
        return e(sleepAudioPackage.getSleepAudioGroupList());
    }

    private static long d(List<SleepAudioInfo> list) {
        int size = list.size();
        long audioDuration = 0;
        for (int i = 0; i < size; i++) {
            SleepAudioInfo sleepAudioInfo = list.get(i);
            if (sleepAudioInfo != null) {
                audioDuration += sleepAudioInfo.getAudioDuration();
            }
        }
        return audioDuration;
    }

    private static long e(List<SleepAudioGroup> list) {
        int size = list.size();
        long audioDuration = 0;
        for (int i = 0; i < size; i++) {
            List<SleepAudioInfo> sleepAudioInfoList = list.get(i).getSleepAudioInfoList();
            if (njy.e(sleepAudioInfoList)) {
                LogUtil.e("CourseTagUtils", "sleepAudioInfoList is null");
            } else {
                int size2 = sleepAudioInfoList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    SleepAudioInfo sleepAudioInfo = sleepAudioInfoList.get(i2);
                    if (sleepAudioInfo != null) {
                        audioDuration += sleepAudioInfo.getAudioDuration();
                    }
                }
            }
        }
        return audioDuration;
    }

    public static String a(SleepAudioPackage sleepAudioPackage, boolean z, int i) {
        SleepAudioSeries sleepAudioSeries;
        if (sleepAudioPackage == null || (sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries()) == null) {
            return "";
        }
        int isVip = sleepAudioSeries.getIsVip();
        if (isVip == 0) {
            return e(e(sleepAudioPackage), b(sleepAudioPackage), false);
        }
        if (isVip == 2) {
            if (i != 1) {
                return "";
            }
            return e(e(sleepAudioPackage), b(sleepAudioPackage), true);
        }
        if (isVip != 1 || !z) {
            return "";
        }
        return e(e(sleepAudioPackage), b(sleepAudioPackage), false);
    }

    private static long e(SleepAudioPackage sleepAudioPackage) {
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.a("CourseTagUtils", "series is null");
            return 0L;
        }
        if (sleepAudioSeries.getDisplayStyle() == 1) {
            return i(sleepAudioPackage.getSleepAudioInfoList());
        }
        return a(sleepAudioPackage.getSleepAudioGroupList());
    }

    private static long i(List<SleepAudioInfo> list) {
        PlayRecordInfo playRecord;
        long duration;
        long j = 0;
        for (SleepAudioInfo sleepAudioInfo : list) {
            if (sleepAudioInfo != null && (playRecord = sleepAudioInfo.getPlayRecord()) != null) {
                if (playRecord.getCompleteCount() > 0) {
                    duration = sleepAudioInfo.getAudioDuration();
                } else {
                    duration = playRecord.getDuration();
                }
                j += duration;
            }
        }
        return j;
    }

    private static long a(List<SleepAudioGroup> list) {
        PlayRecordInfo playRecord;
        long duration;
        long j = 0;
        for (SleepAudioGroup sleepAudioGroup : list) {
            if (sleepAudioGroup != null) {
                for (SleepAudioInfo sleepAudioInfo : sleepAudioGroup.getSleepAudioInfoList()) {
                    if (sleepAudioInfo != null && (playRecord = sleepAudioInfo.getPlayRecord()) != null) {
                        if (playRecord.getCompleteCount() > 0) {
                            duration = sleepAudioInfo.getAudioDuration();
                        } else {
                            duration = playRecord.getDuration();
                        }
                        j += duration;
                    }
                }
            }
        }
        return j;
    }

    public static String b(List<SleepAudioInfo> list) {
        long duration;
        int size = list.size();
        long j = 0;
        long audioDuration = 0;
        for (int i = 0; i < size; i++) {
            audioDuration += list.get(i).getAudioDuration();
            if (list.get(i).getPlayRecord() != null) {
                if (list.get(i).getPlayRecord().getCompleteCount() > 0) {
                    duration = list.get(i).getAudioDuration();
                } else {
                    duration = list.get(i).getPlayRecord().getDuration();
                }
                j += duration;
            }
        }
        return e(j, audioDuration, true);
    }

    public static String c(List<SleepAudioGroup> list) {
        long duration;
        int size = list.size();
        long j = 0;
        long audioDuration = 0;
        for (int i = 0; i < size; i++) {
            List<SleepAudioInfo> sleepAudioInfoList = list.get(i).getSleepAudioInfoList();
            if (njy.e(sleepAudioInfoList)) {
                LogUtil.e("CourseTagUtils", "sleepAudioInfoList is null");
            } else {
                int size2 = sleepAudioInfoList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    audioDuration += sleepAudioInfoList.get(i2).getAudioDuration();
                    if (sleepAudioInfoList.get(i2).getPlayRecord() != null) {
                        if (sleepAudioInfoList.get(i2).getPlayRecord().getCompleteCount() > 0) {
                            duration = sleepAudioInfoList.get(i2).getAudioDuration();
                        } else {
                            duration = sleepAudioInfoList.get(i2).getPlayRecord().getDuration();
                        }
                        j += duration;
                    }
                }
            }
        }
        return e(j, audioDuration, true);
    }

    public static String e(long j, long j2, boolean z) {
        if (j == 0) {
            if (z) {
                return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_not_played);
            }
            return "";
        }
        if (j >= j2) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_played);
        }
        long j3 = (long) (((j * 1.0f) / j2) * 100.0f);
        if (j3 == 0) {
            j3 = 1;
        }
        if (j3 == 100) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_played);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_playing) + " " + Long.toString(j3) + "%";
    }

    public static void d(HealthTextView healthTextView, String str) {
        if (str == null || str.length() == 0) {
            LogUtil.e("CourseTagUtils", "text is null");
            return;
        }
        if (str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_free))) {
            if (qqs.e(BaseApplication.getContext())) {
                healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.common_white_60alpha));
                healthTextView.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.pressure_price_tag_background_dark));
            } else {
                healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_main_title_color_alpha60));
                healthTextView.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.pressure_price_tag_background));
            }
        } else if (str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_decompression_purchased)) || str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_pay))) {
            healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.color_course_price));
            healthTextView.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.sleep_course_purchased_tag_background));
        } else if (str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_vip))) {
            healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.sleep_pressure_membership_color));
            healthTextView.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.sleep_course_membership_tag_background));
        } else {
            healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.sleep_subtab_item_text));
            healthTextView.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.sleep_course_video_tag_background));
        }
        int iD = qrs.d(BaseApplication.getContext(), 4.0f);
        int iD2 = qrs.d(BaseApplication.getContext(), 1.0f);
        healthTextView.setText(str);
        healthTextView.setTextSize(1, 10.0f);
        healthTextView.setPadding(iD, iD2, iD, iD2);
        healthTextView.setVisibility(0);
    }

    public static void e(HealthTextView healthTextView, String str) {
        if (str == null || str.length() == 0) {
            LogUtil.e("CourseTagUtils", "text is null");
            return;
        }
        healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.textColorPrimaryInverse));
        healthTextView.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.sleep_course_white_tag_background));
        int iD = qrs.d(BaseApplication.getContext(), 4.0f);
        int iD2 = qrs.d(BaseApplication.getContext(), 1.0f);
        healthTextView.setText(str);
        healthTextView.setTextSize(1, 10.0f);
        healthTextView.setPadding(iD, iD2, iD, iD2);
        healthTextView.setVisibility(0);
    }

    public static boolean a(SleepAudioInfo sleepAudioInfo, SleepAudioSeries sleepAudioSeries) {
        int isVip = sleepAudioInfo.getIsVip();
        return (isVip == 0 || isVip != 2 || e(sleepAudioSeries) || e(sleepAudioInfo)) ? false : true;
    }

    public static String a(String str) {
        return str.replaceAll(" ", "");
    }

    public static void c(SleepAudioPackage sleepAudioPackage, long j, int i, int i2) {
        if (sleepAudioPackage == null) {
            return;
        }
        HashMap map = new HashMap();
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries != null) {
            map.put("click", 1);
            map.put("resourceType", Integer.valueOf(sleepAudioSeries.getAudioType()));
            map.put("resourceMode", Integer.valueOf(sleepAudioSeries.getIsVip()));
            map.put("ResourceName", sleepAudioSeries.getName());
            map.put("id", Integer.valueOf(sleepAudioSeries.getId()));
            map.put("payType", Integer.valueOf(sleepAudioSeries.getPurchasedStatus()));
            map.put("mixedMode", 1);
            map.put("event", Integer.valueOf(i2));
            map.put("finishRate", Integer.valueOf(d(sleepAudioSeries.getSeriesAudioSize(), a(sleepAudioPackage))));
        }
        map.put("duration", Long.valueOf((SystemClock.elapsedRealtime() - j) / 1000));
        map.put("from", Integer.valueOf(i));
        LogUtil.a("CourseTagUtils", "biEventEnterSeriesDetail, map: ", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SERIES_ENTER_2030099.value(), map, 0);
    }

    private static int a(SleepAudioPackage sleepAudioPackage) {
        int i = 0;
        if (sleepAudioPackage.getSleepAudioSeries().getDisplayStyle() == 1) {
            List<SleepAudioInfo> sleepAudioInfoList = sleepAudioPackage.getSleepAudioInfoList();
            if (njy.e(sleepAudioInfoList)) {
                return 0;
            }
            for (SleepAudioInfo sleepAudioInfo : sleepAudioInfoList) {
                if (sleepAudioInfo != null && d(sleepAudioInfo.getAudioDuration(), sleepAudioInfo.getPlayRecord())) {
                    i++;
                }
            }
            return i;
        }
        List<SleepAudioGroup> sleepAudioGroupList = sleepAudioPackage.getSleepAudioGroupList();
        if (njy.e(sleepAudioGroupList)) {
            return 0;
        }
        for (SleepAudioGroup sleepAudioGroup : sleepAudioGroupList) {
            if (sleepAudioGroup != null) {
                List<SleepAudioInfo> sleepAudioInfoList2 = sleepAudioGroup.getSleepAudioInfoList();
                if (!njy.e(sleepAudioInfoList2)) {
                    for (SleepAudioInfo sleepAudioInfo2 : sleepAudioInfoList2) {
                        if (sleepAudioInfo2 != null && d(sleepAudioInfo2.getAudioDuration(), sleepAudioInfo2.getPlayRecord())) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public static void a(SleepAudioPackage sleepAudioPackage, boolean z, boolean z2, String str, int i) {
        if (sleepAudioPackage == null) {
            return;
        }
        HashMap map = new HashMap();
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries != null) {
            map.put("click", 1);
            map.put("tabName", e(z, z2, str, i));
            map.put("resourceType", Integer.valueOf(sleepAudioSeries.getAudioType()));
            map.put("resourceMode", Integer.valueOf(sleepAudioSeries.getIsVip()));
            map.put("ResourceName", sleepAudioSeries.getName());
            map.put("id", Integer.valueOf(sleepAudioSeries.getId()));
        }
        LogUtil.a("CourseTagUtils", "biEventChangeTab, map: ", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SERIES_CHANGE_TAB_2030101.value(), map, 0);
    }

    public static void b(Map<String, Object> map) {
        LogUtil.a("CourseTagUtils", "biEventRecommendShow, map: ", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r5 == 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String e(boolean z, boolean z2, String str, int i) {
        if (!z || !z2) {
            if (z) {
                if (i == 0) {
                    return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_summary);
                }
                if (i == 1) {
                    return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
                }
            }
            if (z2) {
                if (i == 0) {
                    return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
                }
            }
            return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
        }
        if (i == 0) {
            return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_summary);
        }
        if (i == 1) {
            return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
        }
        if (i != 2) {
            if (z) {
                if (i == 0) {
                    return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_summary);
                }
                if (i == 1) {
                    return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
                }
            }
            if (z2) {
                if (i == 0) {
                    return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
                }
            }
            return BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter);
        }
        return str;
    }
}
