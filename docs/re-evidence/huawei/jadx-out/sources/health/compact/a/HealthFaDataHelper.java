package health.compact.a;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.C;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.provider.cursor.HealthCursor;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryCbk;
import defpackage.gsl;
import defpackage.gwa;
import defpackage.gwc;
import defpackage.irz;
import defpackage.iun;
import defpackage.lsl;
import defpackage.njy;
import defpackage.vgo;
import defpackage.vgt;
import health.compact.a.HealthFaDataHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class HealthFaDataHelper {
    private static final int[] e = {DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f36566a = {"data_session_manual_sleep_go_to_bed_time_key", "data_session_manual_sleep_get_up_time_key", "data_session_manual_sleep_sleep_time_key", "data_session_manual_sleep_wake_time_key"};

    private HealthFaDataHelper() {
    }

    public static HealthCursor a(Uri uri) {
        int i;
        String string;
        try {
            i = Integer.parseInt(uri.getQueryParameter("type"));
        } catch (NumberFormatException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "getHealthCursorForFa numberFormatException");
            i = 0;
        }
        com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getHealthCursorForFa type ", Integer.valueOf(i));
        HashMap map = new HashMap(3);
        map.put("version_code", Integer.valueOf(BaseApplication.c()));
        boolean zN = SharedPerferenceUtils.n(BaseApplication.b());
        map.put("is_browse_mode", Boolean.valueOf(zN));
        map.put("is_oversea", Boolean.valueOf(CloudUtils.d()));
        boolean zC = AuthorizationUtils.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        map.put("is_authorized", Boolean.valueOf(zC));
        if (!zN && zC) {
            if (i != 3) {
                switch (i) {
                    case 10:
                        string = b().toString();
                        break;
                    case 11:
                        string = d().toString();
                        break;
                    case 12:
                        string = c().toString();
                        break;
                    case 13:
                        string = g().toString();
                        break;
                    case 14:
                        string = a().toString();
                        break;
                    case 15:
                        string = j().toString();
                        break;
                    default:
                        com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getHealthCursorForFa type error");
                        string = "";
                        break;
                }
            } else {
                map.put("is_vip_user", Boolean.valueOf(irz.i()));
                string = e().toString();
            }
            map.put("health_data", string);
        }
        return new gsl(map);
    }

    private static JsonObject b() {
        final WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            return new JsonObject();
        }
        final JsonObject jsonObject = new JsonObject();
        boolean zIsJoinDietDiary = weightApi.isJoinDietDiary();
        jsonObject.addProperty("isJoinDietDiary", Boolean.valueOf(zIsJoinDietDiary));
        if (!zIsJoinDietDiary) {
            return jsonObject;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        weightApi.getWeightControlSetting(new DietDiaryCbk<vgt>() { // from class: health.compact.a.HealthFaDataHelper.5
            @Override // com.huawei.ui.main.stories.health.weight.callback.DietDiaryCbk
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(vgt vgtVar) {
                jsonObject.addProperty("weightControlSetting", HiJsonUtil.d(vgtVar));
                countDownLatch.countDown();
            }

            @Override // com.huawei.ui.main.stories.health.weight.callback.DietDiaryCbk
            public void onFailure(int i, String str) {
                com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getWeightControlSetting onFailure");
                countDownLatch.countDown();
            }
        });
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        ReleaseLogUtil.c("HealthFaDataHelper", "getDietData dayFormat ", Integer.valueOf(iA));
        iun.c(iA, iA, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, new ResponseCallback() { // from class: gsd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                HealthFaDataHelper.a(weightApi, iA, jsonObject, countDownLatch, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "interrupted while waiting for getDietData");
        }
        com.huawei.hwlogsmodel.LogUtil.d("HealthFaDataHelper", "getDietData ", jsonObject.toString());
        return jsonObject;
    }

    public static /* synthetic */ void a(WeightApi weightApi, int i, JsonObject jsonObject, CountDownLatch countDownLatch, int i2, List list) {
        vgo vgoVar;
        com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getDietData errorCode ", Integer.valueOf(i2), " list ", list);
        if (njy.b(list) && (vgoVar = (vgo) list.get(0)) != null) {
            if (vgoVar.d() == null || vgoVar.d().e() == 0.0f) {
                com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getDietData has no goal.");
                weightApi.refreshDietOverview(i);
            }
            jsonObject.addProperty("dietRecord", HiJsonUtil.d(vgoVar));
        }
        countDownLatch.countDown();
    }

    private static JsonObject d() {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            return new JsonObject();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fastingLiteStatus", weightApi.getFastingLiteStatus());
        jsonObject.addProperty("fastingLiteViewData", weightApi.getFastingLiteViewData());
        com.huawei.hwlogsmodel.LogUtil.d("HealthFaDataHelper", "getFastingLiteData ", jsonObject.toString());
        return jsonObject;
    }

    private static JsonObject c() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final JsonObject jsonObject = new JsonObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jE = e(jCurrentTimeMillis, 0, 0, 0, 0);
        long jE2 = e(jCurrentTimeMillis, 23, 59, 59, 999);
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()});
        hiAggregateOption.setConstantsKey(new String[]{"breathTrain"});
        hiAggregateOption.setAggregateType(2);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setStartTime(jE);
        hiAggregateOption.setEndTime(jE2);
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: health.compact.a.HealthFaDataHelper.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getBreathTrainData onResult errorCode ", Integer.valueOf(i));
                if (njy.e(list)) {
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getBreathTrainData dataList is empty");
                    countDownLatch.countDown();
                    return;
                }
                HiHealthData hiHealthData = list.get(0);
                if (hiHealthData == null) {
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getBreathTrainData hiHealthData is null");
                    countDownLatch.countDown();
                } else {
                    jsonObject.addProperty("breathCount", Integer.valueOf(hiHealthData.getInt("breathTrain")));
                    countDownLatch.countDown();
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "interrupted while waiting for getBreathTrainData");
        }
        com.huawei.hwlogsmodel.LogUtil.d("HealthFaDataHelper", "getBreathTrainData ", jsonObject.toString());
        return jsonObject;
    }

    private static long e(long j, int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, i4);
        return calendar.getTime().getTime();
    }

    private static void b(HiAggregateListener hiAggregateListener) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(gwa.f36110b);
        hiAggregateOption.setType(gwa.e);
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(HiDateUtil.g(System.currentTimeMillis()));
        hiAggregateOption.setCount(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(3);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(true).e();
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthDataPro(hiDataAggregateProOptionE, hiAggregateListener);
    }

    private static JsonObject j() {
        com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getSleepDataMain enter");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final JsonObject jsonObject = new JsonObject();
        b(new HiAggregateListener() { // from class: health.compact.a.HealthFaDataHelper.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getSleepDataMain datas is empty.");
                    countDownLatch.countDown();
                } else {
                    HealthFaDataHelper.b(jsonObject, list.get(0));
                    countDownLatch.countDown();
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getSleepDataMain onResultIntent errorCode:", Integer.valueOf(i2));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "getSleepDataMain InterruptedException");
        }
        com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getSleepDataMain sleepData:", jsonObject.toString());
        return jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(JsonObject jsonObject, HiHealthData hiHealthData) {
        SleepViewConstants.SleepTypeEnum sleepTypeEnumE = gwc.e(hiHealthData, new ArrayList());
        jsonObject.addProperty("sleepCategory", sleepTypeEnumE.toString());
        jsonObject.addProperty("startTime", Long.valueOf(hiHealthData.getStartTime()));
        double d = hiHealthData.getDouble("core_sleep_fall_key");
        double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
        jsonObject.addProperty("fallAsleepTime", Long.valueOf((long) d));
        jsonObject.addProperty("wakeupTime", Long.valueOf((long) d2));
        jsonObject.addProperty(ParsedFieldTag.RECORD_DAY, Integer.valueOf(DateFormatUtil.a(lsl.r(hiHealthData.getStartTime()))));
        if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.COMMON) {
            jsonObject.addProperty("deepSleepTime", Integer.valueOf(hiHealthData.getInt("sleep_deep_key") / 60));
            jsonObject.addProperty("allSleepDuration", Integer.valueOf(hiHealthData.getInt("common_sleep_duration_sleep_sum_key") / 60));
            return;
        }
        if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            jsonObject.addProperty("daySleepTime", Integer.valueOf(hiHealthData.getInt("core_sleep_day_sleep_time_key")));
            jsonObject.addProperty("allSleepDuration", Long.valueOf(hiHealthData.getLong("core_sleep_total_sleep_time_key")));
            jsonObject.addProperty(JsUtil.SCORE, Integer.valueOf(hiHealthData.getInt("core_sleep_score_key")));
            int i = hiHealthData.getInt("sleep_version");
            int i2 = hiHealthData.getInt("core_sleep_deep_key");
            if (i == 5) {
                i2 = hiHealthData.getInt("core_sleep_deep_key_aasm");
            }
            jsonObject.addProperty("deepSleepTime", Integer.valueOf(i2));
            return;
        }
        if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.MANUAL) {
            jsonObject.addProperty("allSleepDuration", Integer.valueOf(hiHealthData.getInt("core_sleep_total_sleep_time_key")));
        } else {
            if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.PHONE) {
                jsonObject.addProperty("allSleepDuration", Integer.valueOf(hiHealthData.getInt("core_sleep_total_sleep_time_key")));
                jsonObject.addProperty("daySleepTime", Integer.valueOf(hiHealthData.getInt("core_sleep_day_sleep_time_key")));
                jsonObject.addProperty("deepSleepTime", Integer.valueOf(hiHealthData.getInt("core_sleep_deep_key")));
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getSleepDataMain unknown type:");
        }
    }

    private static JsonObject e() {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(h(), new AnonymousClass2(jsonObject, countDownLatch, jsonObject2));
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            if (jsonObject2.has("fallAsleepTime") && jsonObject2.has("wakeupTime")) {
                jsonObject.addProperty("fallAsleepTime", Long.valueOf(jsonObject2.get("fallAsleepTime").getAsLong()));
                jsonObject.addProperty("wakeupTime", Long.valueOf(jsonObject2.get("wakeupTime").getAsLong()));
            }
        } catch (InterruptedException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "getSleepData InterruptedException");
        } catch (NumberFormatException unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "NumberFormatException occurs");
        }
        com.huawei.hwlogsmodel.LogUtil.d("HealthFaDataHelper", "sleepData: ", jsonObject.toString());
        return jsonObject;
    }

    /* JADX INFO: renamed from: health.compact.a.HealthFaDataHelper$2, reason: invalid class name */
    public class AnonymousClass2 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsonObject f36568a;
        final /* synthetic */ JsonObject d;
        final /* synthetic */ CountDownLatch e;

        AnonymousClass2(JsonObject jsonObject, CountDownLatch countDownLatch, JsonObject jsonObject2) {
            this.d = jsonObject;
            this.e = countDownLatch;
            this.f36568a = jsonObject2;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getSleepData success");
            if (njy.b(list)) {
                final HiHealthData hiHealthData = list.get(0);
                HealthFaDataHelper.a(this.d, hiHealthData);
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final CountDownLatch countDownLatch = this.e;
                final JsonObject jsonObject = this.f36568a;
                threadPoolManagerC.execute(new Runnable() { // from class: gsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        HealthFaDataHelper.b(countDownLatch, jsonObject, hiHealthData);
                    }
                });
            } else {
                com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getSleepData data is empty");
                this.e.countDown();
            }
            this.e.countDown();
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getSleepData onResultIntent", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
            this.e.countDown();
            this.e.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final CountDownLatch countDownLatch, final JsonObject jsonObject, HiHealthData hiHealthData) {
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthDataPro(d(hiHealthData), new HiAggregateListener() { // from class: health.compact.a.HealthFaDataHelper.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getSleepDataPro success");
                if (njy.b(list)) {
                    HealthFaDataHelper.c(list, jsonObject);
                } else {
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getSleepDataPro data is empty");
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List<HiHealthData> list, JsonObject jsonObject) {
        if (jsonObject == null || list == null) {
            com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "parsesProSleepData error, healthDataList or json is null");
            return;
        }
        HiHealthData hiHealthData = null;
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2 != null && (hiHealthData == null || hiHealthData.getLong("data_session_manual_sleep_wake_time_key") < hiHealthData2.getLong("data_session_manual_sleep_wake_time_key"))) {
                hiHealthData = hiHealthData2;
            }
        }
        if (hiHealthData == null) {
            return;
        }
        jsonObject.addProperty("fallAsleepTime", Long.valueOf(hiHealthData.getLong("data_session_manual_sleep_sleep_time_key")));
        jsonObject.addProperty("wakeupTime", Long.valueOf(hiHealthData.getLong("data_session_manual_sleep_wake_time_key")));
    }

    private static HiAggregateOption h() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        hiAggregateOption.setTimeInterval(String.valueOf(20140101), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setType(new int[]{44102, 44103, 44101, 44108, 44001, 44002, 44110, 44105, 44235, 44111, 44112, 44113});
        hiAggregateOption.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "sleep_core_sleep_noon_duration_key", "sleep_deep_key", "sleep_shallow_key", "sleep_device_category", "sleep_duration_sum", "sleep_version", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"});
        return hiAggregateOption;
    }

    private static HiDataAggregateProOption d(HiHealthData hiHealthData) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(DateFormatUtil.e(lsl.r(lsl.d(hiHealthData.getStartTime(), -3)), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(lsl.c(lsl.d(hiHealthData.getStartTime(), 3)), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        hiAggregateOption.setType(e);
        hiAggregateOption.setConstantsKey(f36566a);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        HiDataFilter.DataFilterExpression dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, lsl.r(hiHealthData.getStartTime()));
        HiDataFilter.DataFilterExpression dataFilterExpression2 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_get_up_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, lsl.c(hiHealthData.getStartTime()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataFilterExpression);
        arrayList.add(dataFilterExpression2);
        return HiDataAggregateProOption.builder().c(hiAggregateOption).b(HiJsonUtil.d(new HiDataFilter(arrayList, Collections.singletonList(0)))).e((String) null).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(JsonObject jsonObject, HiHealthData hiHealthData) {
        int i = hiHealthData.getInt("core_sleep_deep_key");
        int i2 = hiHealthData.getInt("core_sleep_shallow_key");
        int i3 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i4 = hiHealthData.getInt("sleep_core_sleep_noon_duration_key");
        int i5 = hiHealthData.getInt("sleep_deep_key");
        int i6 = hiHealthData.getInt("sleep_shallow_key");
        int iRound = Math.round(hiHealthData.getFloat("sleep_device_category"));
        int i7 = hiHealthData.getInt("sleep_duration_sum");
        if (hiHealthData.getInt("sleep_version") == 5) {
            i = hiHealthData.getInt("core_sleep_deep_key_aasm");
            i2 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            i3 = hiHealthData.getInt("core_sleep_rem_key_aasm");
        }
        jsonObject.addProperty("cordDeepTime", Integer.valueOf(i));
        jsonObject.addProperty("cordShallowTime", Integer.valueOf(i2));
        jsonObject.addProperty("cordRemTime", Integer.valueOf(i3));
        jsonObject.addProperty("cordNoonTime", Integer.valueOf(i4));
        jsonObject.addProperty("deepTime", Integer.valueOf(i5));
        jsonObject.addProperty("shallowTime", Integer.valueOf(i6));
        jsonObject.addProperty("startTime", Long.valueOf(hiHealthData.getStartTime()));
        jsonObject.addProperty("endTime", Long.valueOf(hiHealthData.getEndTime()));
        jsonObject.addProperty("deviceCategory", Integer.valueOf(iRound));
        jsonObject.addProperty("totalSleepDuration", Integer.valueOf(i7));
    }

    private static JsonArray g() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final JsonArray jsonArray = new JsonArray();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{2034});
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(true).b(), new HiDataReadResultListener() { // from class: health.compact.a.HealthFaDataHelper.8
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getStressData success");
                List listD = HealthFaDataHelper.d(obj, 2034);
                if (njy.b(listD)) {
                    HealthFaDataHelper.a(jsonArray, (List<HiHealthData>) listD);
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getStressData list size:", Integer.valueOf(listD.size()));
                } else {
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getStressData is empty!");
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                com.huawei.hwlogsmodel.LogUtil.a("HealthFaDataHelper", "getStressData onResultIntent : read failed errorCode is", Integer.valueOf(i2));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            return jsonArray;
        } catch (InterruptedException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "getStressData InterruptedException");
            return jsonArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(JsonArray jsonArray, List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("startTime", Long.valueOf(hiHealthData.getStartTime()));
            jsonObject.addProperty("endTime", Long.valueOf(hiHealthData.getStartTime()));
            jsonObject.addProperty("value", Double.valueOf(hiHealthData.getValue()));
            jsonArray.add(jsonObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> d(Object obj, int i) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof SparseArray) {
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                Object obj2 = sparseArray.get(i);
                if (obj2 instanceof List) {
                    return (List) obj2;
                }
            }
        }
        return arrayList;
    }

    private static JsonArray a() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final JsonArray jsonArray = new JsonArray();
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).readDeviceInfo(new HiDataHiDeviceInfoListener() { // from class: health.compact.a.HealthFaDataHelper.6
            @Override // com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener
            public void onResult(List<HiDeviceInfo> list) {
                com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getDevices success");
                if (njy.b(list)) {
                    HealthFaDataHelper.d(jsonArray, list);
                } else {
                    com.huawei.hwlogsmodel.LogUtil.j("HealthFaDataHelper", "getDevices is empty!");
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            return jsonArray;
        } catch (InterruptedException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HealthFaDataHelper", "getDevices InterruptedException");
            return jsonArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(JsonArray jsonArray, List<HiDeviceInfo> list) {
        for (HiDeviceInfo hiDeviceInfo : list) {
            int deviceTypeMapping = hiDeviceInfo.getDeviceTypeMapping();
            if (deviceTypeMapping == 0 || deviceTypeMapping == 1) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("deviceName", hiDeviceInfo.getDeviceName());
                jsonObject.addProperty(DeviceInfo.TAG_DEVICE_ID, hiDeviceInfo.getDeviceUniqueCode());
                jsonObject.addProperty("deviceType", Integer.valueOf(hiDeviceInfo.getDeviceType()));
                jsonArray.add(jsonObject);
            }
        }
    }
}
