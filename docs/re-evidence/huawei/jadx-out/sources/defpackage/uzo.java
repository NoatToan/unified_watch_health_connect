package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class uzo {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f50812a = {22101, 22102, 22103, 22104, 22105};
    private static final int[] i = {22101, 22102, 22103, 22104, 22105, 22001, 22002, 22003};
    private static final String[] e = {"core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_deep_key", "core_sleep_wake_key", "core_sleep_day_sleep_time_key"};
    private static final String[] g = {"core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_deep_key", "core_sleep_wake_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "sleep_wake_key"};
    private static final int[] f = {44203, 44106, 44008, 44201, 44009, 44202, 44107};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f50814c = {DicDataTypeUtil.DataType.BED_TIME.value(), DicDataTypeUtil.DataType.RISING_TIME.value(), DicDataTypeUtil.DataType.SLEEP_SCORE.value(), DicDataTypeUtil.DataType.WAKE_COUNT.value(), DicDataTypeUtil.DataType.SLEEP_END_REASON.value(), DicDataTypeUtil.DataType.WAKE_UP_FEELING.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_LATENCY.value()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f50813b = {DicDataTypeUtil.DataType.SLEEP_SCORE.value()};

    public static int c(long j, long j2, long j3, long j4) {
        boolean z = j == 0 || j < j3;
        boolean z2 = j2 == 0 || j2 > j4;
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 2;
        }
        return z2 ? 1 : 0;
    }

    public static int d(List<String> list, List<String> list2, List<String> list3) {
        if (njy.b(list) && njy.b(list2) && njy.b(list3)) {
            LogUtil.a("SleepUtil", "judgePriority wear pillow phone");
            return 1;
        }
        if (njy.b(list) && njy.b(list2) && njy.e(list3)) {
            LogUtil.a("SleepUtil", "judgePriority wear pillow");
            return 2;
        }
        if (njy.b(list) && njy.b(list3)) {
            LogUtil.a("SleepUtil", "judgePriority wear phone");
            return 3;
        }
        if (njy.b(list2) && njy.b(list3)) {
            LogUtil.a("SleepUtil", "judgePriority pillow phone");
            return 4;
        }
        LogUtil.a("SleepUtil", "judgePriority only");
        return 0;
    }

    private static usu c(HiHealthData hiHealthData, int i2) {
        boolean z;
        if (hiHealthData == null) {
            LogUtil.j("SleepUtil", "getJudgeOfSleepData summary is null");
            return null;
        }
        int i3 = hiHealthData.getInt("core_sleep_deep_key");
        int i4 = hiHealthData.getInt("core_sleep_shallow_key");
        int i5 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i6 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i7 = hiHealthData.getInt("sleep_deep_key");
        int i8 = hiHealthData.getInt("sleep_shallow_key");
        boolean z2 = i4 > 0 || i3 > 0 || i5 > 0;
        if (i2 != 1 || z2 || i6 > 0) {
            z = true;
        } else {
            i4 = i8;
            i3 = i7;
            z = false;
        }
        return new usu(z2, i6 == ((i3 + i6) + i4) + i5 && i6 != 0, z, (i3 == 0 && i4 == 0) && (i5 == 0 && i6 == 0), i4 > 0 && i3 == 0 && i5 == 0 && i2 != 3);
    }

    public static Object[] a(HiHealthData hiHealthData, HiHealthData hiHealthData2, int i2, int i3, HiHealthData hiHealthData3, List<String> list, List<String> list2, List<String> list3) {
        LogUtil.a("SleepUtil", "judgeDataForTwoDevice");
        Object[] objArr = new Object[3];
        usu usuVarC = c(hiHealthData, i2);
        usu usuVarC2 = c(hiHealthData2, i3);
        if (usuVarC == null || usuVarC2 == null) {
            LogUtil.j("SleepUtil", "judgeDataForTwoDevice judge ", usuVarC, " judge2 ", usuVarC2);
            return objArr;
        }
        if (usuVarC.d() && usuVarC2.d()) {
            LogUtil.a("SleepUtil", "judgeDataForTwoDevice DATA_PLATFORMS_TYPE_NO_DATA_CODE");
            qqk.c().c(5001);
        }
        boolean zB = usuVarC.b();
        int i4 = FitnessStatusCodes.UNKNOWN_AUTH_ERROR;
        if (zB && usuVarC.a()) {
            if (usuVarC.c()) {
                LogUtil.a("SleepUtil", "judgeDataForTwoDevice DATA_PLATFORMS_TYPE_INSUFFICIENT_HEART_RATE_CODE");
                qqk.c().c(5002);
            } else {
                LogUtil.a("SleepUtil", "judgeDataForTwoDevice DATA_PLATFORMS_TYPE_CORE_SLEEP_CODE");
                qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
            }
            if (i2 == 1) {
                objArr[0] = hiHealthData;
                objArr[1] = 2;
            } else if (i2 == 3) {
                objArr[0] = hiHealthData;
                objArr[1] = 3;
            } else {
                LogUtil.j("SleepUtil", "judgeDataForTwoDevice type ", Integer.valueOf(i2));
            }
        }
        if (!usuVarC.b() && usuVarC2.b()) {
            LogUtil.a("SleepUtil", "judgeDataForTwoDevice type2 ", Integer.valueOf(i3));
            qqk qqkVarC = qqk.c();
            if (i3 == 2) {
                i4 = FitnessStatusCodes.EQUIVALENT_SESSION_ENDED;
            }
            qqkVarC.c(i4);
            if (i3 == 2) {
                objArr[0] = hiHealthData2;
                objArr[1] = 1;
            } else if (i3 == 3) {
                objArr[0] = hiHealthData2;
                objArr[1] = 3;
            } else {
                LogUtil.j("SleepUtil", "judgeDataForTwoDevice type2 else");
            }
        }
        if (!usuVarC.b() && !usuVarC2.b()) {
            if (!usuVarC.a()) {
                LogUtil.a("SleepUtil", "judgeDataForTwoDevice DATA_PLATFORMS_TYPE_COMMON_SLEEP_CODE");
                qqk.c().c(5004);
                objArr[0] = hiHealthData3;
                objArr[1] = 2;
            } else {
                b(hiHealthData, hiHealthData2, i2, i3, objArr, usuVarC, usuVarC2);
            }
        }
        if (((Integer) objArr[1]).intValue() == 1) {
            objArr[2] = list3.get(list3.size() - 1);
            return objArr;
        }
        if (((Integer) objArr[1]).intValue() == 3) {
            objArr[2] = list2.get(list2.size() - 1);
            return objArr;
        }
        objArr[2] = list.get(list.size() - 1);
        return objArr;
    }

    private static void b(HiHealthData hiHealthData, HiHealthData hiHealthData2, int i2, int i3, Object[] objArr, usu usuVar, usu usuVar2) {
        if (usuVar == null || usuVar2 == null) {
            LogUtil.j("SleepUtil", "judgeOnlyNoon judge ", usuVar, " judge2 ", usuVar2);
            return;
        }
        if (usuVar.e()) {
            LogUtil.a("SleepUtil", "judgeOnlyNoon DATA_PLATFORMS_TYPE_ONLY_NOON_CODE");
            qqk.c().c(5003);
            if (i2 == 1) {
                objArr[0] = hiHealthData;
                objArr[1] = 2;
                return;
            } else if (i2 != 3) {
                LogUtil.j("SleepUtil", "judgeOnlyNoon type ", Integer.valueOf(i2));
                return;
            } else {
                objArr[0] = hiHealthData;
                objArr[1] = 3;
                return;
            }
        }
        if (usuVar2.e()) {
            LogUtil.a("SleepUtil", "judgeOnlyNoon DATA_PLATFORMS_TYPE_PHONE_ONLY_NOON_CODE");
            qqk.c().c(FitnessStatusCodes.TRANSIENT_ERROR);
            if (i3 == 2) {
                objArr[0] = hiHealthData2;
                objArr[1] = 1;
                return;
            } else if (i3 != 3) {
                LogUtil.j("SleepUtil", "judgeOnlyNoon type2 ", Integer.valueOf(i3));
                return;
            } else {
                objArr[0] = hiHealthData2;
                objArr[1] = 3;
                return;
            }
        }
        LogUtil.j("SleepUtil", "judgeOnlyNoon else");
    }

    public static Object[] b(HiHealthData hiHealthData, HiHealthData hiHealthData2, HiHealthData hiHealthData3, List<String> list, List<String> list2, List<String> list3) {
        LogUtil.a("SleepUtil", "judgeDataForThirdDevice");
        Object[] objArr = new Object[3];
        usu usuVarC = c(hiHealthData, 1);
        usu usuVarC2 = c(hiHealthData2, 3);
        usu usuVarC3 = c(hiHealthData3, 2);
        if (usuVarC == null || usuVarC2 == null || usuVarC3 == null) {
            LogUtil.j("SleepUtil", "judgeDataForThirdDevice judgeWear ", usuVarC, " judgePillow ", usuVarC2, " judgePhone ", usuVarC3);
            return objArr;
        }
        if (usuVarC.d() && usuVarC2.d() && usuVarC3.d()) {
            LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_NO_DATA_CODE");
            qqk.c().c(5001);
        }
        if (usuVarC.b() && usuVarC.a()) {
            if (usuVarC.c()) {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_INSUFFICIENT_HEART_RATE_CODE");
                qqk.c().c(5002);
            } else {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_CORE_SLEEP_CODE");
                qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
            }
            objArr[0] = hiHealthData;
            objArr[1] = 2;
        }
        if (!usuVarC.b() && usuVarC2.b()) {
            LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_CORE_SLEEP_CODE");
            qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
            objArr[0] = hiHealthData2;
            objArr[1] = 3;
            return objArr;
        }
        if (!usuVarC.b() && !usuVarC2.b() && usuVarC3.b()) {
            LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_PHONE_SLEEP_CODE");
            qqk.c().c(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED);
            objArr[0] = hiHealthData3;
            objArr[1] = 1;
        }
        if (!usuVarC.b() && !usuVarC2.b() && !usuVarC3.b()) {
            if (!usuVarC.a()) {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_COMMON_SLEEP_CODE");
                qqk.c().c(5004);
                objArr[0] = hiHealthData;
                objArr[1] = 2;
            } else if (usuVarC.e()) {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_ONLY_NOON_CODE");
                qqk.c().c(5003);
                objArr[0] = hiHealthData;
                objArr[1] = 2;
            } else if (usuVarC2.e()) {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_ONLY_NOON_CODE");
                qqk.c().c(5003);
                objArr[0] = hiHealthData2;
                objArr[1] = 3;
            } else if (usuVarC3.e()) {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice DATA_PLATFORMS_TYPE_PHONE_ONLY_NOON_CODE");
                qqk.c().c(FitnessStatusCodes.TRANSIENT_ERROR);
                objArr[0] = hiHealthData3;
                objArr[1] = 1;
            } else {
                LogUtil.a("SleepUtil", "judgeDataForThirdDevice else");
            }
        }
        if (((Integer) objArr[1]).intValue() == 1) {
            if (njy.b(list3)) {
                objArr[2] = list3.get(list3.size() - 1);
                return objArr;
            }
        } else if (((Integer) objArr[1]).intValue() == 3) {
            if (njy.b(list2)) {
                objArr[2] = list2.get(list2.size() - 1);
                return objArr;
            }
        } else if (njy.b(list)) {
            objArr[2] = list.get(list.size() - 1);
        }
        return objArr;
    }

    public static void d(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, HiDataClientListener hiDataClientListener) {
        HiHealthManager.d(BaseApplication.b()).fetchDataSourceByType(22100, new HiTimeInterval(j * 1000, (((((long) (FitnessDataQueryDefine.e(j, fitnessQueryId) * FitnessDataQueryDefine.b(fitnessQueryId))) * 60) + j) * 1000) - 1), hiDataClientListener);
    }

    public static ArrayList<uif> c(List<HiHealthClient> list, List<HiHealthClient> list2) {
        ArrayList<uif> arrayList = new ArrayList<>();
        List<HiHealthClient> listD = lsm.d(list, HiHealthClient.CREATOR);
        List<HiHealthClient> listD2 = lsm.d(list2, HiHealthClient.CREATOR);
        if (listD != null) {
            for (HiHealthClient hiHealthClient : listD) {
                if (hiHealthClient != null) {
                    if (hiHealthClient.getHiDeviceInfo() != null) {
                        LogUtil.a("SleepUtil", "core NAME ", LogAnonymous.c(hiHealthClient.getHiDeviceInfo().getDeviceName()), " Model ", hiHealthClient.getHiDeviceInfo().getModel(), " DeviceType ", Integer.valueOf(hiHealthClient.getHiDeviceInfo().getDeviceType()), " uuid ", hiHealthClient.getHiDeviceInfo().getDeviceUniqueCode());
                    }
                    uif uifVar = new uif();
                    if (hiHealthClient.getHiDeviceInfo() != null) {
                        int deviceType = hiHealthClient.getHiDeviceInfo().getDeviceType();
                        String deviceName = hiHealthClient.getHiDeviceInfo().getDeviceName();
                        String prodId = hiHealthClient.getHiDeviceInfo().getProdId();
                        String model = hiHealthClient.getHiDeviceInfo().getModel();
                        String deviceUniqueCode = hiHealthClient.getHiDeviceInfo().getDeviceUniqueCode();
                        if (TextUtils.isEmpty(model)) {
                            model = hiHealthClient.getHiDeviceInfo().getManufacturer();
                        }
                        if (deviceType == 30) {
                            deviceType = 32;
                        }
                        if (deviceType != 32 || !TextUtils.isEmpty(model)) {
                            if (deviceType == 51) {
                                deviceType = 23;
                            }
                            Iterator<uif> it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    uif next = it.next();
                                    if (next.a() == deviceType && c(next.b(), deviceUniqueCode)) {
                                        break;
                                    }
                                } else {
                                    if (uifVar.a() >= 10000) {
                                        break;
                                    }
                                    uifVar.b(deviceType);
                                    uifVar.c(prodId);
                                    uifVar.b(deviceName);
                                    uifVar.a(model);
                                    uifVar.e(deviceUniqueCode);
                                    if (deviceType != 32 && deviceType != 506) {
                                        uifVar.e((Object) true);
                                    }
                                    arrayList.add(uifVar);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (listD2 != null) {
            for (HiHealthClient hiHealthClient2 : listD2) {
                if (hiHealthClient2 != null && hiHealthClient2.getHiDeviceInfo() != null) {
                    uif uifVar2 = new uif();
                    LogUtil.a("SleepUtil", "normal NAME ", LogAnonymous.c(hiHealthClient2.getHiDeviceInfo().getDeviceName()), " Model ", hiHealthClient2.getHiDeviceInfo().getModel(), " DeviceType ", Integer.valueOf(hiHealthClient2.getHiDeviceInfo().getDeviceType()), " uuid ", hiHealthClient2.getHiDeviceInfo().getDeviceUniqueCode());
                    int deviceType2 = hiHealthClient2.getHiDeviceInfo().getDeviceType();
                    String deviceName2 = hiHealthClient2.getHiDeviceInfo().getDeviceName();
                    String prodId2 = hiHealthClient2.getHiDeviceInfo().getProdId();
                    String model2 = hiHealthClient2.getHiDeviceInfo().getModel();
                    String deviceUniqueCode2 = hiHealthClient2.getHiDeviceInfo().getDeviceUniqueCode();
                    uifVar2.b(deviceType2);
                    uifVar2.c(prodId2);
                    uifVar2.b(deviceName2);
                    uifVar2.a(model2);
                    uifVar2.e(deviceUniqueCode2);
                    uifVar2.e((Object) false);
                    arrayList.add(uifVar2);
                }
            }
        }
        return arrayList;
    }

    private static boolean c(String str, String str2) {
        if (str.length() >= str2.length()) {
            return str.contains(str2);
        }
        return str2.contains(str);
    }

    public static void d(int i2, List<String> list, long j, long j2, HiAggregateListener hiAggregateListener) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        if (njy.b(list)) {
            hiAggregateOption.setDeviceUuid(list.get(list.size() - 1));
        }
        if (i2 == 2) {
            hiAggregateOption.setType(f50812a);
            hiAggregateOption.setConstantsKey(e);
        } else {
            hiAggregateOption.setType(i);
            hiAggregateOption.setConstantsKey(g);
        }
        hiAggregateOption.setReadType(2);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(FitnessDataQueryDefine.a(FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC));
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthDataPro(HiDataAggregateProOption.builder().c(hiAggregateOption).e(BaseApplication.d()).e(), hiAggregateListener);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0295  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x028f  */
    public static Object[] a(HiHealthData hiHealthData, HiHealthData hiHealthData2, List<String> list, List<String> list2) {
        boolean z;
        int i2;
        int i3;
        Object[] objArr = new Object[3];
        if (hiHealthData == null || hiHealthData2 == null) {
            LogUtil.j("SleepUtil", "judgeTwoData wear ", hiHealthData, " phone ", hiHealthData2);
            return objArr;
        }
        int i4 = hiHealthData.getInt("core_sleep_deep_key");
        int i5 = hiHealthData.getInt("core_sleep_shallow_key");
        int i6 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i7 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i8 = hiHealthData.getInt("sleep_deep_key");
        int i9 = hiHealthData.getInt("sleep_shallow_key");
        if (i5 > 0 || i4 > 0 || i6 > 0 || i7 > 0) {
            z = true;
        } else {
            i4 = i8;
            i5 = i9;
            i6 = 0;
            i7 = 0;
            z = false;
        }
        boolean z2 = i4 == 0 && i5 == 0;
        boolean z3 = i6 == 0 && i7 == 0;
        boolean z4 = i7 == ((i7 + i4) + i5) + i6 && i7 != 0;
        LogUtil.a("SleepUtil", "judgeTwoData deepSleepTime ", Integer.valueOf(i4), " lightSleepTime ", Integer.valueOf(i5), " dreamSleepTime ", Integer.valueOf(i6), " noonSleepTime ", Integer.valueOf(i7), " isCoreSleep ", Boolean.valueOf(z));
        int i10 = hiHealthData2.getInt("core_sleep_deep_key");
        int i11 = hiHealthData2.getInt("core_sleep_shallow_key");
        int i12 = hiHealthData2.getInt("core_sleep_wake_dream_key");
        int i13 = hiHealthData2.getInt("core_sleep_day_sleep_time_key");
        boolean z5 = (i10 == 0 && i11 == 0) && (i12 == 0 && i13 == 0);
        boolean z6 = i13 == ((i13 + i10) + i11) + i12 && i13 != 0;
        LogUtil.a("SleepUtil", "judgeTwoData deepSum2 ", Integer.valueOf(i10), " shallowSum2 ", Integer.valueOf(i11), " dreamSum2 ", Integer.valueOf(i12), " noonSum2 ", Integer.valueOf(i13));
        if (!z2 || !z3) {
            if (z5) {
                if (z4) {
                    if (z) {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_ONLY_NOON_CODE");
                        qqk.c().c(5003);
                    } else {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_COMMON_SLEEP_CODE");
                        qqk.c().c(5004);
                    }
                } else if (!z) {
                    LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_COMMON_SLEEP_CODE");
                    qqk.c().c(5004);
                } else if (i5 <= 0 || i4 != 0 || i6 != 0) {
                    LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_CORE_SLEEP_CODE");
                    qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
                } else {
                    LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_INSUFFICIENT_HEART_RATE_CODE");
                    qqk.c().c(5002);
                }
                objArr[0] = hiHealthData;
                i2 = 1;
                objArr[1] = 2;
            } else {
                i2 = 1;
                if (z4 && z6) {
                    if (z) {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_ONLY_NOON_CODE");
                        qqk.c().c(5003);
                        objArr[0] = hiHealthData;
                        objArr[1] = 2;
                    } else {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_PHONE_ONLY_NOON_CODE");
                        qqk.c().c(FitnessStatusCodes.TRANSIENT_ERROR);
                        objArr[0] = hiHealthData2;
                        objArr[1] = 1;
                    }
                } else if (z4) {
                    LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_PHONE_SLEEP_CODE");
                    qqk.c().c(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED);
                    objArr[0] = hiHealthData2;
                    objArr[1] = 1;
                } else if (z6) {
                    if (!z) {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_COMMON_SLEEP_CODE");
                        qqk.c().c(5004);
                    } else if (i5 <= 0 || i4 != 0 || i6 != 0) {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_CORE_SLEEP_CODE");
                        qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
                    } else {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_INSUFFICIENT_HEART_RATE_CODE");
                        qqk.c().c(5002);
                    }
                    objArr[0] = hiHealthData;
                    objArr[1] = 2;
                    i3 = 1;
                } else if (!z) {
                    i3 = 1;
                    LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_PHONE_SLEEP_CODE");
                    qqk.c().c(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED);
                    objArr[0] = hiHealthData2;
                    objArr[1] = 1;
                } else {
                    if (i5 <= 0 || i4 != 0 || i6 != 0) {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_CORE_SLEEP_CODE");
                        qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
                    } else {
                        LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_INSUFFICIENT_HEART_RATE_CODE");
                        qqk.c().c(5002);
                    }
                    objArr[0] = hiHealthData;
                    i3 = 1;
                    objArr[1] = 2;
                }
                if (((Integer) objArr[i3]).intValue() == i3) {
                    if (njy.b(list2)) {
                        objArr[2] = list2.get(list2.size() - i3);
                        return objArr;
                    }
                } else if (njy.b(list)) {
                    objArr[2] = list.get(list.size() - i3);
                }
                return objArr;
            }
            i3 = i2;
            if (((Integer) objArr[i3]).intValue() == i3) {
                if (njy.b(list2)) {
                    objArr[2] = list2.get(list2.size() - i3);
                    return objArr;
                }
            } else if (njy.b(list)) {
                objArr[2] = list.get(list.size() - i3);
            }
            return objArr;
        }
        if (z5) {
            LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_NO_DATA_CODE");
            qqk.c().c(5001);
        } else {
            if (z6) {
                LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_PHONE_ONLY_NOON_CODE");
                qqk.c().c(FitnessStatusCodes.TRANSIENT_ERROR);
            } else {
                LogUtil.a("SleepUtil", "judgeTwoData DATA_PLATFORMS_TYPE_PHONE_SLEEP_CODE");
                qqk.c().c(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED);
            }
            objArr[0] = hiHealthData2;
            objArr[1] = 1;
        }
        i3 = 1;
        if (((Integer) objArr[i3]).intValue() == i3) {
            if (njy.b(list2)) {
                objArr[2] = list2.get(list2.size() - i3);
                return objArr;
            }
        } else if (njy.b(list)) {
            objArr[2] = list.get(list.size() - i3);
        }
        return objArr;
    }

    public static void c(long j, long j2, int i2, HiDataReadResultListener hiDataReadResultListener) {
        int[] iArr;
        LogUtil.a("SleepUtil", "getData startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (i2 == 3) {
            iArr = f50814c;
        } else {
            iArr = i2 != 4 ? null : f50813b;
        }
        if (iArr != null) {
            hiDataReadOption.setType(iArr);
        }
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setTimeInterval(j, j2);
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, hiDataReadResultListener);
    }

    public static HiDataReadOption e(String str, int i2, long j, long j2, int[] iArr) {
        int[] iArr2;
        LogUtil.a("SleepUtil", "enter getOption");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (str != null && !str.equals("")) {
            hiDataReadOption.setDeviceUuid(str);
        }
        if (i2 == 3) {
            iArr2 = f50814c;
        } else {
            iArr2 = i2 != 4 ? null : f50813b;
        }
        if (iArr2 != null) {
            hiDataReadOption.setType(iArr2);
        } else if (iArr != null) {
            hiDataReadOption.setType(iArr);
        } else {
            LogUtil.a("SleepUtil", "no types");
        }
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setReadType(2);
        return hiDataReadOption;
    }

    public static HiDataReadOption d(long j, int i2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jE = ltb.e(new Date(j)) * 1000;
        hiDataReadOption.setTimeInterval(jE, ((jE / 1000) + k.b.m) * 1000);
        hiDataReadOption.setType(new int[]{22100});
        hiDataReadOption.setCount(i2);
        hiDataReadOption.setSortOrder(0);
        return hiDataReadOption;
    }

    public static List<HiDataReadProOption> c(List<HiDataReadOption> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<HiDataReadOption> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(HiDataReadProOption.builder().e(it.next()).b());
        }
        return arrayList;
    }

    public static void b(List<HiDataReadProOption> list, HiDataReadResultListener hiDataReadResultListener) {
        LogUtil.a("SleepUtil", "getDataList, list size=", Integer.valueOf(list.size()));
        HiHealthManager.d(BaseApplication.b()).readHiHealthDataEx(list, hiDataReadResultListener);
    }

    public static void b(List<HiHealthClient> list) {
        HiDeviceInfo hiDeviceInfo;
        SleepDayBarChartProvider.e.clear();
        SleepDayBarChartProvider.f28054a.clear();
        SleepDayBarChartProvider.d.clear();
        if (njy.b(list)) {
            for (HiHealthClient hiHealthClient : list) {
                if (hiHealthClient != null && (hiDeviceInfo = hiHealthClient.getHiDeviceInfo()) != null) {
                    int deviceType = hiDeviceInfo.getDeviceType();
                    String deviceUniqueCode = hiDeviceInfo.getDeviceUniqueCode();
                    if (deviceType == 506 && !SleepDayBarChartProvider.f28054a.contains(deviceUniqueCode)) {
                        SleepDayBarChartProvider.f28054a.add(deviceUniqueCode);
                    } else if (deviceType == 32 && !SleepDayBarChartProvider.e.contains(deviceUniqueCode)) {
                        SleepDayBarChartProvider.e.add(deviceUniqueCode);
                    } else if (!SleepDayBarChartProvider.d.contains(deviceUniqueCode)) {
                        SleepDayBarChartProvider.d.add(deviceUniqueCode);
                    }
                }
            }
        }
    }

    public static void b(int i2) {
        String str = Integer.toString(i2 / 60) + " ";
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(36, true), 0, str.length(), 17);
        String str2 = BaseApplication.b().getString(R.string.IDS_messagecenter_time_hour_value) + " ";
        SpannableString spannableString2 = new SpannableString(str2);
        spannableString2.setSpan(new AbsoluteSizeSpan(16, true), 0, str2.length(), 17);
        String str3 = Integer.toString(i2 % 60) + " ";
        SpannableString spannableString3 = new SpannableString(str3);
        spannableString3.setSpan(new AbsoluteSizeSpan(36, true), 0, str3.length(), 17);
        String string = BaseApplication.b().getString(R.string.IDS_hw_show_main_home_page_minutes);
        SpannableString spannableString4 = new SpannableString(string);
        spannableString4.setSpan(new AbsoluteSizeSpan(16, true), 0, string.length(), 17);
        new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append((CharSequence) spannableString3).append((CharSequence) spannableString4);
    }

    public static void b(SleepDayBarChartProvider sleepDayBarChartProvider) {
        if (!fxl.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            LogUtil.a("SleepUtil", "RecommendSwitch is close.");
            return;
        }
        Context contextE = sleepDayBarChartProvider.e();
        if (contextE == null || SleepDayBarChartProvider.f28055b == null) {
            LogUtil.j("SleepUtil", "context is null or sleepDayBarChartProvider.mInteractor is null.");
            return;
        }
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            HashMap map = new HashMap();
            map.put("sleep_score", Integer.valueOf(sleepDayBarChartProvider.f28056c.k().aq()));
            marketingApi.triggerMarketingResourceEvent(new MarketingOption.Builder().setContext(contextE).setPageId(1).setTypeId(300).setTriggerEventParams(map).build());
        }
    }

    public static void b(HashMap<String, Object> map, SleepDayBarChartProvider sleepDayBarChartProvider) {
        LogUtil.a("SleepUtil", "parseParams");
        synchronized (d) {
            if (sleepDayBarChartProvider != null) {
                map.put("SLEEP_DAY_BAR_CHART_DEVICE_ID", Integer.valueOf(sleepDayBarChartProvider.a()));
                map.putAll(sleepDayBarChartProvider.g);
                if (sleepDayBarChartProvider.g != null && sleepDayBarChartProvider.f28056c != null) {
                    c(sleepDayBarChartProvider.g, "BAR_CHART_PROCESS_TEXT_VISIBILITY", (Object) Integer.MAX_VALUE);
                    sleepDayBarChartProvider.f28056c.e(sleepDayBarChartProvider.g);
                }
            } else {
                map.putAll(sleepDayBarChartProvider.g);
                if (sleepDayBarChartProvider.g != null) {
                    c(sleepDayBarChartProvider.g, "BAR_CHART_PROCESS_TEXT_VISIBILITY", (Object) Integer.MAX_VALUE);
                    sleepDayBarChartProvider.f28056c.e(sleepDayBarChartProvider.g);
                }
            }
            throw th;
        }
    }

    public static void e(final Map<String, Object> map, Context context, final gxq gxqVar, final SectionBean sectionBean) {
        LogUtil.a("SleepUtil", "setCoreSleepGoToEcgTips");
        c(map, "ECG_TEXT_TRY_TEXT", context.getText(R.string.IDS_heart_rate_ecg_go_Measure));
        c(map, "ECG_TEXT_TRY_CLICK_EVENT", new OnClickSectionListener() { // from class: uzo.2
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, int i3) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                LogUtil.a("SleepUtil", "subView: " + str);
                if (str.equals("ECG_TEXT_TRY_CLICK_EVENT")) {
                    ukb.c(ukb.h() ? 2 : 1);
                    uzo.c((Map<String, Object>) map, "ECG_TIPS_LAYOUT_VISIBILITY", (Object) 8);
                    gxqVar.e(map);
                    sectionBean.c(gxqVar);
                }
            }
        });
        c(map, "TEXT_CANCEL_CLICK", new View.OnClickListener() { // from class: uzo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uzo.c((Map<String, Object>) map, "ECG_TIPS_LAYOUT_VISIBILITY", (Object) 8);
                gxqVar.e(map);
                sectionBean.c(gxqVar);
            }
        });
        if (!e()) {
            c(map, "ECG_TEXT_CONTENT_TEXT", context.getText(R.string.IDS_heart_rate_ecg_sleep_tips));
            c(map, "ECG_TIPS_LAYOUT_VISIBILITY", (Object) 0);
        }
        gxqVar.e(map);
    }

    private static boolean e() {
        long jD = SharedPreferenceManager.d(String.valueOf(10000), "ECG_TIPS_LAYOUT_VISIBILITY", 0L);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        LogUtil.a("SleepUtil", "saveTime: ", Long.valueOf(jD), " currentTime: ", Long.valueOf(timeInMillis));
        if (lsl.c(jD, timeInMillis)) {
            return true;
        }
        SharedPreferenceManager.c(String.valueOf(10000), "ECG_TIPS_LAYOUT_VISIBILITY", timeInMillis);
        return false;
    }

    public static void c(Map<String, Object> map, final Context context, gxq gxqVar) {
        LogUtil.a("SleepUtil", "setCoreSleepBtnTips");
        c(map, "CORE_SLEEP_BTN_TIPS", new IBaseResponseCallback() { // from class: uzo.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a("SleepUtil", "bindParamsToView onResponse");
                if (!(obj instanceof RelativeLayout)) {
                    LogUtil.e("SleepUtil", "objData type is invalid");
                    return;
                }
                String string = context.getResources().getString(R.string.IDS_core_sleep_switch_dialog_note);
                qjy.d(context, new IBaseResponseCallback() { // from class: uzo.4.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj2) {
                        LogUtil.a("SleepUtil", "onResponse");
                        if (i3 == 0) {
                            Intent intent = new Intent();
                            intent.setFlags(268435456);
                            intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
                            intent.putExtra("core_sleep_active_open_control_btn", true);
                            intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity");
                            iov.d(context, intent);
                        }
                    }
                }, (RelativeLayout) obj, string, new String[]{"core_sleep_btn_tips_do_not_remind_again", "core_sleep_btn_tips_intervals", "core_sleep_btn_tips_cnt", "core_sleep_btn_tips_if_show"});
            }
        });
        gxqVar.e(map);
    }

    public static void d(int i2) {
        if (i2 == 3) {
            LogUtil.a("SleepUtil", "6、Data platform gets phone normal");
            qqk.c().c(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED);
        } else if (i2 == 4) {
            LogUtil.a("SleepUtil", "8、Data platform gets pillow only normal");
            qqk.c().c(FitnessStatusCodes.API_EXCEPTION);
        } else {
            LogUtil.a("SleepUtil", "2、Data platform gets insufficient heart rate effectiveness");
            qqk.c().c(5002);
        }
    }

    public static void a(int i2) {
        if (i2 == 3) {
            LogUtil.a("SleepUtil", "7、Data platform gets phone only noon");
            qqk.c().c(FitnessStatusCodes.TRANSIENT_ERROR);
        } else if (i2 == 4) {
            LogUtil.a("SleepUtil", "9、Data platform gets pillow only noon");
            qqk.c().c(FitnessStatusCodes.APP_NOT_FIT_ENABLED);
        } else {
            LogUtil.a("SleepUtil", "3、Data platform gets to only sporadic naps");
            qqk.c().c(5003);
        }
    }

    public static void e(int i2) {
        if (i2 == 3) {
            LogUtil.a("SleepUtil", "6、Data platform gets phone only normal");
            qqk.c().c(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED);
        } else if (i2 == 4) {
            LogUtil.a("SleepUtil", "8、Data platform gets pillow only normal");
            qqk.c().c(FitnessStatusCodes.API_EXCEPTION);
        } else {
            LogUtil.a("SleepUtil", "4、Data platform gets to normal scientific sleep");
            qqk.c().c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR);
        }
    }

    public static void c(boolean z, BroadcastReceiver broadcastReceiver, Context context, BroadcastReceiver broadcastReceiver2, BroadcastReceiver broadcastReceiver3) {
        LogUtil.a("SleepUtil", "unRegisterBroadcast !!!");
        if (z) {
            if (broadcastReceiver != null) {
                try {
                    BroadcastManagerUtil.b(context, broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                    LogUtil.a("SleepUtil", "unRegisterBroadcast exception!!!");
                    return;
                }
            }
            if (broadcastReceiver2 != null) {
                context.unregisterReceiver(broadcastReceiver2);
            }
            if (broadcastReceiver3 != null) {
                LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver3);
            }
        }
    }

    public static void b(Context context, final Handler handler) {
        LogUtil.a("SleepUtil", "initSwitchSetting");
        boolean isLogined = LoginInit.getInstance(context).getIsLogined();
        LogUtil.a("SleepUtil", "initSwitchSetting ", "isLogin = ", Boolean.valueOf(isLogined));
        if (isLogined && wud.e()) {
            LogUtil.a("SleepUtil", "hasCoreSleepDeviceConnected: true");
            mhs.a().getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: uzo.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("SleepUtil", "getWearCommonSetting, coreSleep btn err_code = ", Integer.valueOf(i2));
                    if (i2 == -1) {
                        handler.sendEmptyMessage(6008);
                        return;
                    }
                    if (i2 == 0 && (obj instanceof String)) {
                        String str = (String) obj;
                        LogUtil.a("SleepUtil", "coreSleep btn info = ", str);
                        if ("0".equals(str)) {
                            handler.sendEmptyMessage(6008);
                            return;
                        }
                        return;
                    }
                    LogUtil.a("SleepUtil", "errCode = ", Integer.valueOf(i2));
                }
            });
        } else {
            LogUtil.e("SleepUtil", "currentDeviceInfo is null!");
        }
    }

    public static void a(Context context, Map<String, Object> map) {
        if (context == null) {
            ReleaseLogUtil.e("SleepUtil", "isRtlImage obj is null");
            return;
        }
        if (LanguageUtil.ba(context)) {
            BitmapDrawable bitmapDrawableE = qqz.e(context, R.drawable.ic_home_data_origin_red);
            if (bitmapDrawableE == null) {
                c(map, "BAR_CHART_HELP_ICON", context.getDrawable(R.drawable.ic_home_data_origin_red));
                return;
            } else {
                c(map, "BAR_CHART_HELP_ICON", bitmapDrawableE);
                return;
            }
        }
        c(map, "BAR_CHART_HELP_ICON", context.getDrawable(R.drawable.ic_home_data_origin_red));
    }

    public static int a(SparseArray<Object> sparseArray, int i2, long j, long j2) {
        int value = -1;
        if (!(sparseArray.get(i2) instanceof List)) {
            return -1;
        }
        for (HiHealthData hiHealthData : (List) sparseArray.get(i2)) {
            LogUtil.a("SleepUtil", "scoreData: ", hiHealthData.toString());
            if (hiHealthData.getStartTime() >= j && hiHealthData.getStartTime() <= j2) {
                value = (int) hiHealthData.getValue();
            }
        }
        return value;
    }

    public static long d(SparseArray<Object> sparseArray, int i2, long j, long j2) {
        long value;
        if (!(sparseArray.get(i2) instanceof List)) {
            return 0L;
        }
        Iterator it = ((List) sparseArray.get(i2)).iterator();
        long value2 = 0;
        while (true) {
            if (!it.hasNext()) {
                value = 0;
                break;
            }
            HiHealthData hiHealthData = (HiHealthData) it.next();
            if (hiHealthData.getStartTime() >= j && hiHealthData.getStartTime() <= j2) {
                value2 = (long) hiHealthData.getValue();
            } else if (hiHealthData.getStartTime() > j2 && value2 == 0) {
                value = (long) hiHealthData.getValue();
                break;
            }
        }
        return value2 == 0 ? value : value2;
    }

    public static String c(SparseArray<Object> sparseArray, int i2) {
        String strC = HiDateUtil.c((String) null);
        if (sparseArray.get(i2) instanceof List) {
            for (HiHealthData hiHealthData : (List) sparseArray.get(i2)) {
                if (hiHealthData != null && !TextUtils.isEmpty(hiHealthData.getTimeZone())) {
                    return hiHealthData.getTimeZone();
                }
            }
        }
        return strC;
    }

    public static int b(SparseArray<Object> sparseArray, int i2, long j, long j2) {
        int value = 0;
        if (!(sparseArray.get(i2) instanceof List)) {
            return 0;
        }
        int value2 = 0;
        for (HiHealthData hiHealthData : (List) sparseArray.get(i2)) {
            if (hiHealthData.getStartTime() < j || hiHealthData.getStartTime() > j2) {
                if (hiHealthData.getStartTime() > j2 && value2 == 0) {
                    value = (int) hiHealthData.getValue();
                    break;
                }
            } else {
                value2 = (int) hiHealthData.getValue();
            }
        }
        return value2 == 0 ? value : value2;
    }

    public static void e(int i2, Date date, Handler handler, boolean z) {
        if (ltb.m(date) == ltb.m(ltb.b())) {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = i2;
            if (i2 >= 100) {
                messageObtain.what = 24;
                handler.removeMessages(messageObtain.what);
                handler.sendMessageDelayed(messageObtain, 1000L);
            } else if (z) {
                messageObtain.what = 23;
                handler.sendMessage(messageObtain);
            }
        }
    }

    public static void c(Map<String, Object> map, String str, Object obj) {
        if (map == null || obj == null) {
            return;
        }
        map.put(str, obj);
    }

    public static void a(Map<String, Object> map, String str) {
        if (map != null) {
            map.remove(str);
        }
    }
}
