package defpackage;

import android.text.TextUtils;
import androidx.media3.extractor.AacUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.report.bean.AnnualReportFitness;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginfitnessadvice.Classify;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class owz {
    private static int e(int i) {
        if (i < 400) {
            return 1;
        }
        return (i < 400 || i > 1200) ? 3 : 2;
    }

    public static String a(List<AnnualReportFitnessRaw> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesData records isEmpty.");
            return "";
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (AnnualReportFitnessRaw annualReportFitnessRaw : list) {
            List<Classify> primaryClassify = annualReportFitnessRaw.getPrimaryClassify();
            if (!njy.e(primaryClassify)) {
                switch (c(primaryClassify)) {
                    case 10018:
                    case 10583:
                    case 13423:
                    case 13546:
                    case 14262:
                        i++;
                        break;
                    case 10706:
                    case 10738:
                    case 13484:
                    case 14605:
                        i4++;
                        break;
                    case 10719:
                    case 13425:
                        i2++;
                        break;
                    case 10726:
                        i3++;
                        break;
                    case 11087:
                        i5++;
                        break;
                }
            } else {
                LogUtil.a("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesData record.acquireWorkoutId() outdate.", annualReportFitnessRaw.acquireWorkoutName());
            }
        }
        String strB = b(i, i2, i3, i4, i5);
        LogUtil.a("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesData acquireFavoriteCourse favoriteCourse ", strB);
        return strB;
    }

    private static int c(List<Classify> list) {
        int classifyId = list.get(0).getClassifyId();
        String classifyName = list.get(0).getClassifyName();
        if (classifyId == 14617 && list.size() > 1) {
            classifyId = list.get(1).getClassifyId();
            classifyName = list.get(1).getClassifyName();
        }
        LogUtil.a("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesData Id ", Integer.valueOf(classifyId), " Name ", classifyName);
        return classifyId;
    }

    private static List<Integer> b(List<Classify> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_FitnessCalRule", "getPrimaryClassifyIdList primaryClassifyList is null.");
            return arrayList;
        }
        Iterator<Classify> it = list.iterator();
        while (it.hasNext()) {
            int classifyId = it.next().getClassifyId();
            if (classifyId != 14617 && classifyId != 13516 && !arrayList.contains(Integer.valueOf(classifyId))) {
                arrayList.add(Integer.valueOf(classifyId));
            }
        }
        return arrayList;
    }

    private static List<Integer> d(List<Classify> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_FitnessCalRule", "getSecondClassifyId secondClassify is null.");
            return arrayList;
        }
        Iterator<Classify> it = list.iterator();
        while (it.hasNext()) {
            int classifyId = it.next().getClassifyId();
            if (!arrayList.contains(Integer.valueOf(classifyId))) {
                arrayList.add(Integer.valueOf(classifyId));
            }
        }
        return arrayList;
    }

    private static String b(int i, int i2, int i3, int i4, int i5) {
        HashMap map = new HashMap(16);
        map.put("1", Integer.valueOf(i));
        map.put("2", Integer.valueOf(i2));
        map.put("3", Integer.valueOf(i3));
        map.put("4", Integer.valueOf(i4));
        map.put("5", Integer.valueOf(i5));
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: owz.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().intValue() - entry.getValue().intValue();
            }
        });
        int iIntValue = 0;
        for (Map.Entry entry : arrayList) {
            iIntValue += ((Integer) entry.getValue()).intValue();
            LogUtil.a("PLGACHIEVE_FitnessCalRule", "acquireFavoriteCourse mapSet.getKey() ", entry.getKey(), " mapSet.getValue() ", entry.getValue());
        }
        if (iIntValue <= 5) {
            return "0";
        }
        return (String) ((Map.Entry) arrayList.get(0)).getKey();
    }

    public static AnnualReportFitness a(List<AnnualReportFitnessRaw> list, int i) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_FitnessCalRule", "computeFitnessData fitnessRecords is empty");
            return null;
        }
        LogUtil.a("PLGACHIEVE_FitnessCalRule", "computeFitnessData() year with =", Integer.valueOf(i));
        HashMap map = new HashMap(16);
        int i2 = 0;
        for (AnnualReportFitnessRaw annualReportFitnessRaw : list) {
            int iAcquireDuring = annualReportFitnessRaw.acquireDuring() / 1000;
            i2 += iAcquireDuring;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(annualReportFitnessRaw.acquireExerciseTime());
            String str = i + Constants.LINK + (calendar.get(2) + 1) + Constants.LINK + calendar.get(5);
            if (map.containsKey(str)) {
                map.put(str, Integer.valueOf(((Integer) map.get(str)).intValue() + iAcquireDuring));
            } else {
                map.put(str, Integer.valueOf(iAcquireDuring));
            }
        }
        int iRound = (int) Math.round(((double) i2) / 60.0d);
        if (iRound < 3) {
            LogUtil.a("PLGACHIEVE_FitnessCalRule", "getAnnualFitnessReport less than 3 min with duration ");
            return null;
        }
        AnnualReportFitness annualReportFitnessA = a(map);
        annualReportFitnessA.saveNumberOfTimes(list.size());
        annualReportFitnessA.saveDescription(e(iRound));
        annualReportFitnessA.saveTotalDuration(iRound);
        return annualReportFitnessA;
    }

    private static AnnualReportFitness a(Map<String, Integer> map) {
        String key = "";
        int iIntValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                key = entry.getKey();
            }
        }
        Calendar calendar = Calendar.getInstance();
        String[] strArrSplit = key.split(Constants.LINK);
        if (strArrSplit.length > 0) {
            calendar.set(1, oxi.a(strArrSplit[0]));
        }
        if (strArrSplit.length > 1) {
            calendar.set(2, oxi.a(strArrSplit[1]) - 1);
        }
        if (strArrSplit.length > 2) {
            calendar.set(5, oxi.a(strArrSplit[2]));
        }
        AnnualReportFitness annualReportFitness = new AnnualReportFitness();
        annualReportFitness.saveMaxDurationDay(calendar.getTimeInMillis());
        annualReportFitness.saveMaxDuration((int) Math.round(((double) iIntValue) / 60.0d));
        return annualReportFitness;
    }

    public static String e(List<AnnualReportFitnessRaw> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesData records isEmpty.");
            return "";
        }
        HashMap map = new HashMap(16);
        for (AnnualReportFitnessRaw annualReportFitnessRaw : list) {
            List<Classify> primaryClassify = annualReportFitnessRaw.getPrimaryClassify();
            List<Classify> secondClassify = annualReportFitnessRaw.getSecondClassify();
            if (njy.e(primaryClassify)) {
                LogUtil.a("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesDataNew record.acquireWorkoutId() outdate.", annualReportFitnessRaw.acquireWorkoutName());
            } else {
                LogUtil.a("PLGACHIEVE_FitnessCalRule", "priList ", primaryClassify.toString(), "secondList ", secondClassify.toString());
                c(map, primaryClassify, secondClassify);
            }
        }
        String strE = e((HashMap<String, Integer>) map);
        LogUtil.a("PLGACHIEVE_FitnessCalRule", "computeFavoriteCoursesDataNew favoriteCourse ", strE, " favoriteCourseMap ", map.toString());
        return strE;
    }

    private static void c(HashMap<String, Integer> map, List<Classify> list, List<Classify> list2) {
        for (Integer num : b(list)) {
            if (num.intValue() == 11010) {
                Iterator<Integer> it = d(list2).iterator();
                while (it.hasNext()) {
                    e(map, a(it.next().intValue()));
                }
            } else {
                e(map, a(num.intValue()));
            }
        }
    }

    private static String a(int i) {
        switch (i) {
            case 10018:
            case 14263:
                return "5";
            case 10583:
            case 13423:
            case 14262:
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
            case 16001:
                return "1";
            case 10706:
            case 10738:
            case 11002:
            case 14605:
            case 15101:
                return "9";
            case 10719:
            case 11004:
                return "2";
            case 10726:
            case 11001:
                return "3";
            case 11087:
                return "4";
            case 13425:
                return "6";
            case 13484:
                return "8";
            case 13546:
                return "7";
            default:
                return "";
        }
    }

    private static String e(HashMap<String, Integer> map) {
        if (map == null || map.size() == 0) {
            return "0";
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: owz.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().intValue() - entry.getValue().intValue();
            }
        });
        int iIntValue = 0;
        for (Map.Entry entry : arrayList) {
            iIntValue += ((Integer) entry.getValue()).intValue();
            LogUtil.a("PLGACHIEVE_FitnessCalRule", "acquireFavoriteCourse mapSet.getKey() ", entry.getKey(), " mapSet.getValue() ", entry.getValue());
        }
        if (iIntValue <= 5) {
            return "0";
        }
        return (String) ((Map.Entry) arrayList.get(0)).getKey();
    }

    private static void e(HashMap<String, Integer> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map.containsKey(str)) {
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        } else {
            map.put(str, 1);
        }
    }
}
