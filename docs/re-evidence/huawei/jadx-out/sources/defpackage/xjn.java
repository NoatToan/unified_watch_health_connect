package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.SportTypeData;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.report.bean.AnnualReportStepResult;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.commonui.linechart.common.MotionType;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes20.dex */
public class xjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53112a = "PluginAchieveAdapterHelper";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList<Integer> f53113c = ouj.e();
    private static final int[] d = {258, 264, 262, OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 257, 281, 260, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE, 282, 259};

    public static int e(int i) {
        if (i == 262) {
            return 30021;
        }
        switch (i) {
            case 257:
                return 30005;
            case 258:
                return 30006;
            case 259:
                return 30007;
            default:
                return 30004;
        }
    }

    public static String e(MessageObject messageObject) {
        if (messageObject == null) {
            LogUtil.j(f53112a, "generateMessage == null");
            return "";
        }
        if (TextUtils.isEmpty(messageObject.getMsgTitle()) && TextUtils.isEmpty(messageObject.getMsgContent())) {
            LogUtil.j(f53112a, "generateMessage, empty message!");
            return "";
        }
        com.huawei.health.messagecenter.model.MessageObject messageObject2 = new com.huawei.health.messagecenter.model.MessageObject();
        messageObject2.setMsgId(messageObject.getMsgId());
        messageObject2.setModule(messageObject.getModule());
        messageObject2.setType(messageObject.getType());
        messageObject2.setMsgTitle(messageObject.getMsgTitle());
        messageObject2.setMsgContent(messageObject.getMsgContent());
        messageObject2.setMsgType(messageObject.getMsgType());
        messageObject2.setCreateTime(messageObject.getCreateTime());
        messageObject2.setExpireTime(messageObject.getExpireTime());
        messageObject2.setDetailUri(messageObject.getDetailUri());
        messageObject2.setDetailUriExt(messageObject.getDetailUriExt());
        messageObject2.setMetadata(messageObject.getMetaData());
        messageObject2.setFlag(messageObject.getFlag());
        messageObject2.setHuid(messageObject.getHuid());
        messageObject2.setImei(messageObject.getImei());
        messageObject2.setImgUri(messageObject.getImgUri());
        messageObject2.setMsgFrom(messageObject.getMsgFrom());
        messageObject2.setNotified(messageObject.getNotified());
        messageObject2.setPosition(messageObject.getPosition());
        messageObject2.setReadFlag(messageObject.getReadFlag());
        messageObject2.setWeight(messageObject.getWeight());
        return xjo.b(messageObject2);
    }

    public static HiAggregateOption b(long j, long j2, int i) {
        int[] iArrH;
        String[] strArrI;
        int[] iArr;
        String[] strArr;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setReadType(0);
        switch (i) {
            case 10:
                iArrH = new int[]{42052};
                strArrI = new String[]{"Track_Walk_Distance_Sum"};
                break;
            case 11:
                iArrH = h();
                strArrI = i();
                break;
            case 12:
                iArrH = new int[]{42152};
                strArrI = new String[]{"Track_Ride_Distance_Sum"};
                break;
            case 13:
            case 14:
            case 15:
            default:
                iArr = new int[]{42102};
                strArr = new String[]{"Track_Run_Distance_Sum"};
                int[] iArr2 = iArr;
                strArrI = strArr;
                iArrH = iArr2;
                break;
            case 16:
                iArrH = d();
                strArrI = e();
                break;
            case 17:
                iArr = new int[]{42102, 42105, 42106};
                strArr = new String[]{"Track_Run_Distance_Sum", "Track_Run_Count_Sum", "Track_Run_Abnormal_Count_Sum"};
                int[] iArr3 = iArr;
                strArrI = strArr;
                iArrH = iArr3;
                break;
            case 18:
                iArrH = j();
                strArrI = f();
                break;
        }
        hiAggregateOption.setConstantsKey(strArrI);
        hiAggregateOption.setType(iArrH);
        return hiAggregateOption;
    }

    private static String[] f() {
        return new String[]{"Track_Ride_Distance_Sum", "Track_Ride_Count_Sum", "Track_Ride_Abnormal_Count_Sum"};
    }

    private static int[] j() {
        return new int[]{42152, 42155, 42156};
    }

    private static String[] i() {
        return new String[]{"Track_Run_Distance_Sum", "Track_Run_Duration_Sum", "Track_Run_Count_Sum", "sport_walk_step_sum", "Track_Run_Abnormal_Count_Sum"};
    }

    private static int[] h() {
        return new int[]{42102, 42104, 42105, 40002, 42106};
    }

    private static String[] e() {
        return new String[]{"Track_Run_Distance_Sum", "Track_Ride_Distance_Sum", "Track_Run_Count_Sum", "Track_Ride_Count_Sum", "Track_Run_Abnormal_Count_Sum", "Track_Ride_Abnormal_Count_Sum"};
    }

    private static int[] d() {
        return new int[]{42102, 42152, 42105, 42155, 42106, 42156};
    }

    public static void a(long j, long j2, final int i, final AchieveCallback achieveCallback) {
        if (achieveCallback == null) {
            LogUtil.j(f53112a, "getLatestMesureDatas achieveCallback is null");
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (i == 10002) {
            d(j, j2, achieveCallback);
            return;
        }
        if (i == 10001) {
            b(j, j2, achieveCallback);
            return;
        }
        if (i == 10006) {
            hiDataReadOption.setCount(0);
        } else {
            hiDataReadOption.setCount(1);
            LogUtil.a(f53112a, "getLatestMesureDatas dataTypeId = ", Integer.valueOf(i));
        }
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setConstantsKey(new String[]{"lastMesureRecord"});
        hiDataReadOption.setType(new int[]{i});
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: xjn.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (obj instanceof SparseArray) {
                    List arrayList = new ArrayList(16);
                    Object obj2 = ((SparseArray) obj).get(i);
                    if (obj2 instanceof List) {
                        arrayList = (List) obj2;
                    }
                    LogUtil.a(xjn.f53112a, "getLatestMesureDatas measureList size ", Integer.valueOf(arrayList.size()));
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (achieveCallback2 != null) {
                        achieveCallback2.onResponse(i2, arrayList);
                    }
                }
            }
        });
    }

    private static void d(long j, long j2, final AchieveCallback achieveCallback) {
        nkb.d().d(j, j2, 0, new IBaseResponseCallback() { // from class: xjr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                xjn.e(achieveCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void e(AchieveCallback achieveCallback, int i, Object obj) {
        List arrayList = new ArrayList(16);
        if (obj instanceof List) {
            arrayList = (List) obj;
        }
        LogUtil.a(f53112a, "getBloodPressureData measureList size ", Integer.valueOf(arrayList.size()));
        if (achieveCallback != null) {
            achieveCallback.onResponse(i, arrayList);
        }
    }

    private static void b(long j, long j2, final AchieveCallback achieveCallback) {
        nkb.d().b(BaseApplication.getContext(), j, j2, 0, new IBaseResponseCallback() { // from class: xjp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                xjn.c(achieveCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void c(AchieveCallback achieveCallback, int i, Object obj) {
        List arrayList = new ArrayList(16);
        if (obj instanceof List) {
            arrayList = (List) obj;
        }
        LogUtil.a(f53112a, "getBloodSugarData measureList size ", Integer.valueOf(arrayList.size()));
        if (achieveCallback != null) {
            achieveCallback.onResponse(i, arrayList);
        }
    }

    public static HiAggregateOption c(long j, long j2, int i) {
        int[] iArr;
        String[] strArr;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setGroupUnitType(6);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setReadType(0);
        switch (i) {
            case 10:
                iArr = new int[]{42052};
                strArr = new String[]{"Track_Walk_Distance_Sum"};
                break;
            case 11:
                iArr = new int[]{42102};
                strArr = new String[]{"Track_Run_Distance_Sum"};
                break;
            case 12:
                iArr = new int[]{42152};
                strArr = new String[]{"Track_Ride_Distance_Sum"};
                break;
            case 13:
            default:
                LogUtil.a(f53112a, "getAggregateOptionType: default");
                iArr = new int[]{42102};
                strArr = new String[]{"Track_Run_Distance_Sum"};
                break;
            case 14:
                iArr = new int[]{42102, 42052, 42152};
                strArr = new String[]{"Track_Run_Distance_Sum", "Track_Walk_Distance_Sum", "Track_Ride_Distance_Sum"};
                break;
        }
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setType(iArr);
        return hiAggregateOption;
    }

    public static void c(Context context, long j, long j2, final AchieveCallback achieveCallback) {
        LogUtil.a(f53112a, " getWeightData ");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(new String[]{"bodyWeight"});
        HiHealthManager.d(context).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: xjn.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (achieveCallback != null) {
                    LogUtil.a(xjn.f53112a, "getWeightData success");
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    achieveCallback2.onResponse(0, list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a(xjn.f53112a, "onResultIntent called");
            }
        });
    }

    public static int[] b() {
        try {
            ArrayList<HwSportTypeInfo> sportTypeInfos = ((SportTypeData) lls.a(BaseApplication.getContext().getAssets().open("SportTypeConfig.json"), SportTypeData.class)).getSportTypeInfos();
            if (njy.e(sportTypeInfos)) {
                LogUtil.j(f53112a, "hwSportTypeInfoArrayList isEmpty");
                return new int[0];
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sportTypeInfos.size(); i++) {
                HwSportTypeInfo hwSportTypeInfo = sportTypeInfos.get(i);
                if (!f53113c.contains(Integer.valueOf(hwSportTypeInfo.getSportTypeId()))) {
                    arrayList.add(hwSportTypeInfo);
                }
            }
            if (njy.e(arrayList)) {
                LogUtil.j(f53112a, "sportTypeInfos isEmpty");
                return new int[0];
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((HwSportTypeInfo) arrayList.get(i2)).getSportTypeId();
            }
            return iArr;
        } catch (IOException e) {
            LogUtil.e(f53112a, LogAnonymous.b(e));
            return new int[0];
        }
    }

    public static int[] c(int i) {
        if (i == 217) {
            return new int[]{i, 218, 219};
        }
        if (i == 260) {
            return new int[]{i, 261};
        }
        if (i == 262) {
            return new int[]{i, OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM};
        }
        if (i == 257) {
            return new int[]{i, 281, 282};
        }
        if (i == 258) {
            return new int[]{i, 264, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE};
        }
        switch (i) {
            case 2147483646:
                int[] iArr = d;
                return Arrays.copyOf(iArr, iArr.length);
            case Integer.MAX_VALUE:
                return b();
            default:
                return new int[]{i};
        }
    }

    public static void d(final AchieveCallback achieveCallback) {
        nkb.d().a(HiDateUtil.p(System.currentTimeMillis()), HiDateUtil.g(System.currentTimeMillis()), new IBaseResponseCallback() { // from class: xjn.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    LogUtil.j(xjn.f53112a, "toReadCalorieData objData == null.");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                List list = (List) obj;
                int value = 0;
                if (list.size() <= 0) {
                    LogUtil.j(xjn.f53112a, "toReadCalorieData list.size() <= 0.");
                    achieveCallback.onResponse(i, 0);
                    return;
                }
                if (list.size() > 1) {
                    List list2 = (List) list.get(1);
                    if (list2.size() > 0) {
                        value = (int) ((HiHealthData) list2.get(0)).getValue();
                    }
                }
                achieveCallback.onResponse(i, Integer.valueOf(value));
                LogUtil.a(xjn.f53112a, "toReadCalorieData calorie=", Integer.valueOf(value));
            }
        });
    }

    public static HiAggregateOption e(long j, long j2, int i) {
        int[] iArr;
        String[] strArr;
        HiAggregateOption hiAggregateOptionA = a(j, j2);
        switch (i) {
            case 13:
                iArr = new int[]{40003};
                strArr = new String[]{"totalCalorie"};
                break;
            case 14:
                iArr = new int[]{40004};
                strArr = new String[]{BleConstants.TOTAL_DISTANCE};
                break;
            case 15:
                strArr = new String[]{"totalStep"};
                iArr = new int[]{40002};
                break;
            case 16:
            case 21:
                strArr = new String[]{"totalCalorie", BleConstants.TOTAL_DISTANCE, "totalStep"};
                iArr = new int[]{40003, 40004, 40002};
                break;
            case 17:
            case 18:
            default:
                iArr = new int[]{40002};
                strArr = new String[]{"totalCalorie"};
                break;
            case 19:
                iArr = new int[]{40002};
                strArr = new String[]{"sport_walk_step_sum"};
                hiAggregateOptionA.setAggregateType(3);
                break;
            case 20:
                iArr = new int[]{42102};
                strArr = new String[]{"Track_Run_Distance_Sum"};
                break;
        }
        hiAggregateOptionA.setConstantsKey(strArr);
        hiAggregateOptionA.setType(iArr);
        return hiAggregateOptionA;
    }

    private static HiAggregateOption a(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setGroupUnitType(6);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setReadType(0);
        return hiAggregateOption;
    }

    public static HiAggregateOption c() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{"maxSleepVersion", "dayDreamDurationREM", "dayDeepDurationN3", "dayShallowDurationN1N2", "core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "common_sleep_duration_sleep_sum_key"});
        hiAggregateOption.setType(new int[]{44235, 44111, 44112, 44113, 44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44004});
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        return hiAggregateOption;
    }

    public static List<SleepTotalData> a(List<HiHealthData> list) {
        LogUtil.a(f53112a, "dealSleepTotalData: datas.size -> " + list.size());
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            int i = hiHealthData.getInt("core_sleep_shallow_key");
            int i2 = hiHealthData.getInt("core_sleep_score_key");
            int iE = nlw.e(hiHealthData.getDouble("core_sleep_fall_key"), 1);
            int iE2 = nlw.e(hiHealthData.getDouble("core_sleep_wake_up_key"), 2);
            if (i == 0 || i2 == 0 || (iE == 0 && iE2 == 0)) {
                LogUtil.j(f53112a, "dealSleepTotalData: shallowSum -> " + i + ", score -> " + i2 + ", fallTime -> " + iE + ", wakeTime -> " + iE2);
            } else {
                long j = hiHealthData.getLong("core_sleep_wake_up_key");
                String strC = c(j, hiHealthData.getTimeZone());
                String str = f53112a;
                LogUtil.a(str, "dealSleepTotalData wakeTimeEx ", Long.valueOf(j), " date ", strC);
                if (strC.endsWith("00:00:00 000")) {
                    LogUtil.j(str, "dealSleepTotalData error！ date ", strC);
                } else {
                    SleepTotalData sleepTotalData = new SleepTotalData();
                    sleepTotalData.setShallowSleepTime(i);
                    sleepTotalData.setScore(i2);
                    sleepTotalData.setFallTime(iE);
                    sleepTotalData.setWakeUpTime(iE2);
                    sleepTotalData.setSleepMonitorStartTime(hiHealthData.getStartTime());
                    sleepTotalData.setSleepMonitorEndTime(hiHealthData.getEndTime());
                    sleepTotalData.setDeepSleepTime(hiHealthData.getInt("core_sleep_deep_key"));
                    sleepTotalData.setSlumberSleepTime(hiHealthData.getInt("core_sleep_wake_dream_key"));
                    sleepTotalData.setSnoreFreq(hiHealthData.getInt("core_sleep_snore_freq_key"));
                    sleepTotalData.setWakeupTimes(hiHealthData.getInt("core_sleep_wake_count_key"));
                    sleepTotalData.setTotalSleepTime(hiHealthData.getInt("core_sleep_total_sleep_time_key"));
                    arrayList.add(sleepTotalData);
                }
            }
        }
        LogUtil.a(f53112a, "dealSleepTotalData: sleepTotalDatas.size -> " + arrayList.size());
        return arrayList;
    }

    public static String c(long j, String str) {
        Calendar calendar = Calendar.getInstance();
        if (!TextUtils.isEmpty(str)) {
            calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        }
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS", Locale.ENGLISH).format(new Date(calendar.getTime().getTime()));
    }

    public static AnnualReportStepResult a(List<HiHealthData> list, PluginAchieveAdapterImpl.a aVar) {
        AnnualReportStepResult annualReportStepResult = new AnnualReportStepResult();
        if (njy.e(list)) {
            return annualReportStepResult;
        }
        float f = ((HiHealthData) Collections.max(list, aVar)).getFloat("sum");
        ArrayList arrayList = new ArrayList(16);
        HashMap map = new HashMap(16);
        Iterator<HiHealthData> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            float f2 = 199999.0f;
            if (!it.hasNext()) {
                break;
            }
            HiHealthData next = it.next();
            float f3 = next.getFloat("sum");
            if (f3 > 10000.0f) {
                i++;
                arrayList.add(Long.valueOf(next.getStartTime()));
            }
            if (f3 >= 10000.0f) {
                map.put(Long.valueOf(next.getStartTime()), Long.valueOf((long) f3));
            }
            float f4 = next.getFloat("sum");
            if (next.getFloat("sum") < 199999.0f) {
                f2 = f4;
            }
            i2 = (int) (i2 + f2);
        }
        if (f > 199999.0f) {
            f = 199999.0f;
        }
        annualReportStepResult.setKey(1);
        annualReportStepResult.setTimestamp(((HiHealthData) Collections.max(list, aVar)).getStartTime());
        annualReportStepResult.setOverGoal(i);
        annualReportStepResult.setValue((int) f);
        annualReportStepResult.setFirstTimestamp(list.get(0).getStartTime());
        annualReportStepResult.setStepDays(list.size());
        annualReportStepResult.setTotalSteps(i2);
        annualReportStepResult.setReachTimeList(arrayList);
        annualReportStepResult.setReachStepDayData(map);
        return annualReportStepResult;
    }

    public static int e(int i, MotionType motionType) {
        if (i == 40002) {
            return d(motionType);
        }
        if (i == 40004) {
            return c(motionType);
        }
        if (i == 40003) {
            return b(motionType);
        }
        if (i == 40005) {
            if (motionType == MotionType.SUM) {
                return SmartMsgConstant.MSG_TYPE_RIDE_USER;
            }
            return 0;
        }
        LogUtil.j(f53112a, "getQueryKeyBySportType not match");
        return 0;
    }

    private static int d(MotionType motionType) {
        if (motionType == MotionType.SUM) {
            return 40002;
        }
        if (motionType == MotionType.WALK) {
            return 40011;
        }
        if (motionType == MotionType.RUN) {
            return 40012;
        }
        if (motionType == MotionType.CLIMB) {
            return 40013;
        }
        LogUtil.j(f53112a, "querySportStepSumType STAT_SPORT_STEP_SUM motionType not match");
        return 0;
    }

    private static int c(MotionType motionType) {
        if (motionType == MotionType.SUM) {
            return 40004;
        }
        if (motionType == MotionType.WALK) {
            return 40031;
        }
        if (motionType == MotionType.RUN) {
            return 40032;
        }
        if (motionType == MotionType.BIKE) {
            return 40033;
        }
        if (motionType == MotionType.CLIMB) {
            return 40034;
        }
        LogUtil.j(f53112a, "querySportDistancesSumType STAT_SPORT_DISTANCES_SUM motionType not match");
        return 0;
    }

    private static int b(MotionType motionType) {
        if (motionType == MotionType.SUM) {
            return 40003;
        }
        if (motionType == MotionType.WALK) {
            return 40021;
        }
        if (motionType == MotionType.RUN) {
            return 40022;
        }
        if (motionType == MotionType.BIKE) {
            return 40023;
        }
        if (motionType == MotionType.CLIMB) {
            return 40024;
        }
        LogUtil.j(f53112a, "querySportCaloriesSumType STAT_SPORT_CALORIES_SUM motionType not match");
        return 0;
    }

    public static int[] b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(e(i, MotionType.SUM)));
        if (c(i, MotionType.WALK)) {
            arrayList.add(Integer.valueOf(e(i, MotionType.WALK)));
        }
        if (c(i, MotionType.RUN)) {
            arrayList.add(Integer.valueOf(e(i, MotionType.RUN)));
        }
        if (c(i, MotionType.BIKE)) {
            arrayList.add(Integer.valueOf(e(i, MotionType.BIKE)));
        }
        if (c(i, MotionType.CLIMB)) {
            arrayList.add(Integer.valueOf(e(i, MotionType.CLIMB)));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public static String[] a(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sum");
        if (c(i, MotionType.WALK)) {
            arrayList.add("walk");
        }
        if (c(i, MotionType.RUN)) {
            arrayList.add("run");
        }
        if (c(i, MotionType.BIKE)) {
            arrayList.add("bike");
        }
        if (c(i, MotionType.CLIMB)) {
            arrayList.add("climb");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean c(int i, MotionType motionType) {
        boolean z = motionType == MotionType.SUM || motionType == MotionType.WALK || motionType == MotionType.RUN || motionType == MotionType.CLIMB;
        if (i == 40004 || i == 40003) {
            if (z) {
                return z;
            }
            return motionType == MotionType.BIKE;
        }
        if (i != 40002) {
            return false;
        }
        LogUtil.j(f53112a, "sportType is STAT_SPORT_STEP_SUM");
        return z;
    }

    public static void b(final Context context, final long j, long j2, final AchieveCallback achieveCallback) {
        LogUtil.a(f53112a, "enter getTrackMetadata");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{30002});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: xjn.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (achieveCallback == null) {
                    LogUtil.j(xjn.f53112a, "achieveCallback is null");
                    return;
                }
                if (obj == null) {
                    LogUtil.j(xjn.f53112a, "getTrackMetadata data is null");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j(xjn.f53112a, "getTrackMetadata map size is 0");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                List list = (List) sparseArray.get(30002);
                if (njy.e(list)) {
                    LogUtil.j(xjn.f53112a, "getTrackMetadata list is null");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    LogUtil.j(xjn.f53112a, "getTrackMetadata hiHealthData is null");
                    achieveCallback.onResponse(i, null);
                } else {
                    long endTime = hiHealthData.getEndTime();
                    LogUtil.a(xjn.f53112a, "hiHealthData=", hiHealthData.toString(), "endTime is", Long.valueOf(endTime));
                    xjn.a(context, j, endTime, achieveCallback);
                }
            }
        });
    }

    public static void a(Context context, long j, long j2, final AchieveCallback achieveCallback) {
        LogUtil.a(f53112a, "enter getTrackDetail");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: xjn.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (achieveCallback == null) {
                    LogUtil.j(xjn.f53112a, "achieveCallback is null");
                    return;
                }
                if (obj == null) {
                    LogUtil.j(xjn.f53112a, "getTrackDetail data is null");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j(xjn.f53112a, "getTrackDetail map size is 0");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                List list = (List) sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                if (njy.e(list)) {
                    LogUtil.j(xjn.f53112a, "getTrackDetail list is null");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    LogUtil.j(xjn.f53112a, "getTrackDetail hiHealthData is null");
                    achieveCallback.onResponse(i, null);
                    return;
                }
                MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
                LogUtil.a(xjn.f53112a, "getTrackDetail success");
                ntv.b(hiHealthData, motionPathSimplify);
                motionPathSimplify.saveDeviceType(hiHealthData.getInt("trackdata_deviceType"));
                motionPathSimplify.saveProductId(hiHealthData.getString("device_prodid"));
                motionPathSimplify.saveSubProductId(hiHealthData.getString("device_subprodid"));
                LogUtil.a(xjn.f53112a, "callback success");
                achieveCallback.onResponse(i, motionPathSimplify);
            }
        });
    }
}
