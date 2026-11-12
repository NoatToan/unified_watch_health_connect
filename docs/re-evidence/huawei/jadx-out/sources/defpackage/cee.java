package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.medicine.MedicinesRule;
import com.huawei.basichealthmodel.receiver.ReminderReceiver;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class cee {
    private static boolean e(int i, int i2) {
        if (i < 1 || i > 127) {
            return false;
        }
        return ((i & 127) & (1 << (i2 == 1 ? 6 : i2 + (-2)))) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(ResponseCallback<Object> responseCallback, int i, Object obj) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setCallback callback is null");
        } else {
            responseCallback.onResponse(i, obj);
        }
    }

    public static void b(final ResponseCallback<Pair<Long, bwd>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getDrinkWaterAlarm callback is null");
        } else {
            xkb.c("900300061", new ResponseCallback() { // from class: ceh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    cee.b(responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, int i, Pair pair) {
        if (pair == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getDrinkWaterAlarm pair is null");
            responseCallback.onResponse(i, null);
            return;
        }
        Long l = (Long) pair.first;
        l.longValue();
        String str = (String) pair.second;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getDrinkWaterAlarm configData ", str);
            responseCallback.onResponse(i, new Pair(l, null));
            return;
        }
        bwd bwdVar = (bwd) HiJsonUtil.d(str, bwd.class);
        if (bwdVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getDrinkWaterAlarm reminderBean is null");
            responseCallback.onResponse(i, new Pair(l, null));
        } else {
            LogUtil.b("ReminderSampleConfigUtils", "getDrinkWaterAlarm modifiedTime ", l, " configData ", str);
            responseCallback.onResponse(i, new Pair(l, bwdVar));
        }
    }

    public static void a(bwd bwdVar, final ResponseCallback<Object> responseCallback) {
        if (bwdVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setDrinkWaterAlarm reminderBean false");
            d(responseCallback, -1, (Object) null);
        } else if (!lua.e() && Utils.h()) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setDrinkWaterAlarm isPullAllStatus false");
            d(responseCallback, -1, (Object) null);
        } else {
            xkb.d("900300061", HiJsonUtil.d(bwdVar), new HiDataOperateListener() { // from class: cet
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    cee.d((ResponseCallback<Object>) responseCallback, i, obj);
                }
            });
        }
    }

    public static void e(final ResponseCallback<Pair<Long, bwj>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getWeightMeasureAlarm callback is null");
        } else {
            xkb.c("900300062", new ResponseCallback() { // from class: cep
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    cee.c(responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, Pair pair) {
        if (pair == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getSampleConfigForHealth pair is null");
            responseCallback.onResponse(i, null);
            return;
        }
        Long l = (Long) pair.first;
        l.longValue();
        String str = (String) pair.second;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getWeightMeasureAlarm configData ", str);
            responseCallback.onResponse(i, new Pair(l, null));
            return;
        }
        bwj bwjVar = (bwj) HiJsonUtil.d(str, bwj.class);
        if (bwjVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getWeightMeasureAlarm reminderBean is null");
            responseCallback.onResponse(i, new Pair(l, null));
        } else {
            LogUtil.b("ReminderSampleConfigUtils", "getWeightMeasureAlarm modifiedTime ", l, " configData ", str);
            responseCallback.onResponse(i, new Pair(l, bwjVar));
        }
    }

    public static void a(bwj bwjVar, final ResponseCallback<Object> responseCallback) {
        if (bwjVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setWeightMeasureAlarm reminderBean false");
            d(responseCallback, -1, (Object) null);
        } else if (!lua.e() && Utils.h()) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setWeightMeasureAlarm isPullAllStatus false");
            d(responseCallback, -1, (Object) null);
        } else {
            xkb.d("900300062", HiJsonUtil.d(bwjVar), new HiDataOperateListener() { // from class: ceo
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    cee.d((ResponseCallback<Object>) responseCallback, i, obj);
                }
            });
        }
    }

    public static void a(final ResponseCallback<Pair<Long, Boolean>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getMedicationAlarm callback is null");
        } else {
            xkb.c("900300063", new ResponseCallback() { // from class: cew
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    cee.e(responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, Pair pair) {
        if (pair == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getMedicationAlarm pair is null");
            responseCallback.onResponse(i, null);
            return;
        }
        Long l = (Long) pair.first;
        l.longValue();
        String str = (String) pair.second;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getMedicationAlarm configData ", str);
            responseCallback.onResponse(i, new Pair(l, null));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LogUtil.b("ReminderSampleConfigUtils", "getMedicationAlarm modifiedTime ", l, " configData ", str);
            responseCallback.onResponse(i, new Pair(l, Boolean.valueOf(jSONObject.optBoolean("enabled"))));
        } catch (JSONException e) {
            ReleaseLogUtil.b("R_HL_ReminderSampleConfigUtils", "getMedicationAlarm exception ", ExceptionUtils.c(e));
            responseCallback.onResponse(i, new Pair(l, null));
        }
    }

    public static void e(boolean z, final ResponseCallback<Object> responseCallback) {
        if (!lua.e() && Utils.h()) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setMedicationAlarm isPullAllStatus false");
            d(responseCallback, -1, (Object) null);
        } else {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("enabled", Boolean.valueOf(z));
            xkb.d("900300063", jsonObject.toString(), new HiDataOperateListener() { // from class: cek
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    cee.d((ResponseCallback<Object>) responseCallback, i, obj);
                }
            });
        }
    }

    private static cao b(Map<Integer, cao> map, int i) {
        if (map == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getHealthModeReminder map is null key ", Integer.valueOf(i));
            return null;
        }
        return map.get(Integer.valueOf(i));
    }

    public static void e(final Map<Integer, cao> map, final boolean z) {
        final cao caoVarB = b(map, 11);
        if (caoVarB == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationMedicationAlarm reminderBean is null");
        } else {
            a((ResponseCallback<Pair<Long, Boolean>>) new ResponseCallback() { // from class: cex
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: ceq
                        @Override // java.lang.Runnable
                        public final void run() {
                            cee.d(caoVar, pair, z, map);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void d(cao caoVar, Pair pair, boolean z, Map map) {
        boolean zD = caoVar.d();
        if (pair == null) {
            e(zD, (ResponseCallback<Object>) new ResponseCallback() { // from class: ceu
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ReleaseLogUtil.c("R_HL_ReminderSampleConfigUtils", "migrationMedicationAlarm resultCode ", Integer.valueOf(i), " object ", obj);
                }
            });
            return;
        }
        boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
        if (zD == zBooleanValue) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationMedicationAlarm is same");
        } else if (z) {
            caoVar.d(zBooleanValue);
            e((Map<Integer, cao>) map);
        } else {
            e(zD, (ResponseCallback<Object>) new ResponseCallback() { // from class: ces
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ReleaseLogUtil.c("R_HL_ReminderSampleConfigUtils", "migrationMedicationAlarm resultCode ", Integer.valueOf(i), " object ", obj);
                }
            });
        }
    }

    public static void c(final Map<Integer, cao> map, final boolean z) {
        final cao caoVarB = b(map, 14);
        if (caoVarB == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm reminderBean is null");
        } else {
            e((ResponseCallback<Pair<Long, bwj>>) new ResponseCallback() { // from class: cel
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: cei
                        @Override // java.lang.Runnable
                        public final void run() {
                            cee.b(pair, map, caoVar, z);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void b(Pair pair, Map map, cao caoVar, boolean z) {
        if (pair != null) {
            bwj bwjVar = (bwj) pair.second;
            if (bwjVar == null) {
                ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm reminder is null");
                return;
            }
            List<bwb> listC = bwjVar.c();
            if (CollectionUtils.a(listC)) {
                ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm list ", listC);
                return;
            } else {
                e(map, caoVar, bwjVar, listC, z);
                return;
            }
        }
        List<ayx> listB = caoVar.b();
        if (CollectionUtils.a(listB)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm alarmInfoList ", listB);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ayx ayxVar : listB) {
            if (ayxVar != null) {
                arrayList.add(new bwb(ayxVar.c(), ayxVar.e()));
            }
        }
        if (CollectionUtils.a(arrayList)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm reminderPlanList is null");
        } else {
            a(new bwj(CommonUtils.j("900300062"), 127, caoVar.d(), arrayList), (ResponseCallback<Object>) new ResponseCallback() { // from class: cer
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    cee.d(i, obj);
                }
            });
        }
    }

    static /* synthetic */ void d(int i, Object obj) {
        ReleaseLogUtil.c("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm resultCode ", Integer.valueOf(i), " object ", obj);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            weightApi.scheduleWeightMeasureNextReminder();
        }
    }

    private static void e(Map<Integer, cao> map, cao caoVar, bwj bwjVar, List<bwb> list, boolean z) {
        List<ayx> listB = caoVar.b();
        boolean zE = bwjVar.e();
        if (CollectionUtils.a(listB)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm alarmInfoList ", listB);
            b(map, caoVar, list, zE, listB);
            return;
        }
        boolean zD = caoVar.d();
        if (zD == zE && c(listB, list)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm is same");
            return;
        }
        if (z) {
            b(map, caoVar, list, zE, listB);
            return;
        }
        list.clear();
        for (ayx ayxVar : listB) {
            if (ayxVar != null) {
                list.add(new bwb(ayxVar.c(), ayxVar.e()));
            }
        }
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm list is null");
            return;
        }
        bwjVar.a(list);
        bwjVar.b(zD);
        a(bwjVar, (ResponseCallback<Object>) new ResponseCallback() { // from class: ceg
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                cee.i(i, obj);
            }
        });
    }

    static /* synthetic */ void i(int i, Object obj) {
        ReleaseLogUtil.c("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm errorCode ", Integer.valueOf(i), " object ", obj);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            weightApi.scheduleWeightMeasureNextReminder();
        }
    }

    private static void b(Map<Integer, cao> map, cao caoVar, List<bwb> list, boolean z, List<ayx> list2) {
        if (list2 == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm alarmInfoList is null");
            list2 = new ArrayList<>();
        }
        list2.clear();
        for (bwb bwbVar : list) {
            if (bwbVar != null) {
                ayx ayxVar = new ayx();
                ayxVar.b(z);
                ayxVar.d(bwbVar.d());
                ayxVar.c(bwbVar.c());
                list2.add(ayxVar);
            }
        }
        if (CollectionUtils.a(list2)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationWeightMeasureAlarm alarmInfoList ", list2);
            return;
        }
        caoVar.d(z);
        e(map);
        ObserverManagerUtil.e(ObserveLabels.REFRESH_WEIGHT_MEASURE_ALARM, new Object[0]);
    }

    private static boolean c(List<ayx> list, List<bwb> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (ayx ayxVar : list) {
            if (ayxVar != null) {
                int iC = ayxVar.c();
                int iE = ayxVar.e();
                boolean z = false;
                for (bwb bwbVar : list2) {
                    if (bwbVar != null) {
                        z = iC == bwbVar.d() && iE == bwbVar.c();
                        if (z) {
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void d(final Map<Integer, cao> map, final boolean z) {
        final cao caoVarB = b(map, 10);
        if (caoVarB == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationDrinkWaterAlarm reminderBean is null");
        } else {
            b(new ResponseCallback() { // from class: cev
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: cem
                        @Override // java.lang.Runnable
                        public final void run() {
                            cee.b(caoVar, pair, z, map);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void b(cao caoVar, Pair pair, boolean z, Map map) {
        List<ayx> listB = caoVar.b();
        Pair<Integer, Integer> pairD = d(listB, true);
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        Pair<Integer, Integer> pairD2 = d(listB, false);
        int iIntValue3 = ((Integer) pairD2.first).intValue();
        int iIntValue4 = ((Integer) pairD2.second).intValue();
        boolean zD = caoVar.d();
        if (pair == null) {
            b(new bwd(CommonUtils.j("900300061"), zD), iIntValue, iIntValue2, iIntValue3, iIntValue4);
            return;
        }
        bwd bwdVar = (bwd) pair.second;
        if (bwdVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationDrinkWaterAlarm reminder is null");
            return;
        }
        if (b(caoVar, bwdVar)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "migrationDrinkWaterAlarm is same");
            return;
        }
        if (z) {
            boolean zC = bwdVar.c();
            caoVar.d(zC);
            ayx ayxVarB = b(listB, true);
            if (ayxVarB != null) {
                ayxVarB.b(zC);
                ayxVarB.d(bwdVar.e());
                ayxVarB.c(bwdVar.a());
            }
            ayx ayxVarB2 = b(listB, false);
            if (ayxVarB2 != null) {
                ayxVarB2.b(zC);
                ayxVarB2.d(bwdVar.b());
                ayxVarB2.c(bwdVar.d());
            }
            e((Map<Integer, cao>) map);
            return;
        }
        bwdVar.c(zD);
        b(bwdVar, iIntValue, iIntValue2, iIntValue3, iIntValue4);
    }

    private static boolean b(cao caoVar, bwd bwdVar) {
        List<ayx> listB = caoVar.b();
        Pair<Integer, Integer> pairD = d(listB, true);
        Pair<Integer, Integer> pairD2 = d(listB, false);
        return ((Integer) pairD.first).intValue() == bwdVar.e() && ((Integer) pairD.second).intValue() == bwdVar.a() && ((Integer) pairD2.first).intValue() == bwdVar.b() && ((Integer) pairD2.second).intValue() == bwdVar.d() && caoVar.d() == bwdVar.c();
    }

    private static ayx b(List<ayx> list, boolean z) {
        if (CollectionUtils.d(list, 1)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getDrinkWaterAlarmInfo list ", list, " isStart ", Boolean.valueOf(z));
            return null;
        }
        return list.get(!z ? 1 : 0);
    }

    private static Pair<Integer, Integer> d(List<ayx> list, boolean z) {
        int iC;
        int iE;
        ayx ayxVarB = b(list, z);
        if (ayxVarB == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "getDrinkWaterTime alarmInfo is null isStart ", Boolean.valueOf(z), " list ", list);
            iC = z ? 8 : 18;
            iE = 0;
        } else {
            iC = ayxVarB.c();
            iE = ayxVarB.e();
        }
        return new Pair<>(Integer.valueOf(iC), Integer.valueOf(iE));
    }

    private static void b(bwd bwdVar, int i, int i2, int i3, int i4) {
        bwdVar.d(i);
        bwdVar.a(i2);
        bwdVar.c(i3);
        bwdVar.e(i4);
        a(bwdVar, (ResponseCallback<Object>) new ResponseCallback() { // from class: cef
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i5, Object obj) {
                ReleaseLogUtil.c("R_HL_ReminderSampleConfigUtils", "migrationDrinkWaterAlarm resultCode ", Integer.valueOf(i5), " object ", obj);
            }
        });
    }

    private static void e(Map<Integer, cao> map) {
        if (map == null) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setUserPreference map is null");
            return;
        }
        HashMap map2 = new HashMap();
        cfb.b(map, map2);
        String strE = HiJsonUtil.e(map2, new TypeToken<HashMap<Integer, cam>>() { // from class: com.huawei.basichealthmodel.util.ReminderSampleConfigUtils$1
        }.getType());
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.d("R_HL_ReminderSampleConfigUtils", "setUserPreference value ", strE);
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_reminder");
        hiUserPreference.setValue(strE);
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        LogUtil.b("ReminderSampleConfigUtils", "setUserPreference isSuccess ", Boolean.valueOf(userPreference), " value ", strE);
        if (userPreference) {
            ccy.d("health_model_reminder", HiJsonUtil.d(map));
            cbg.al();
        }
    }

    public static void d() {
        ReleaseLogUtil.c("ReminderSampleConfigUtils", "scheduleDrinkWaterNextReminder enter");
        a(300011, "DRINK_WATER_REMIND_ACTION");
        b(new ResponseCallback() { // from class: cen
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                cee.c(i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void c(int i, Pair pair) {
        if (i != 0) {
            ReleaseLogUtil.c("ReminderSampleConfigUtils", "scheduleDrinkWaterNextReminder getDrinkWaterAlarm error: ", Integer.valueOf(i));
            return;
        }
        if (pair == null) {
            ReleaseLogUtil.c("ReminderSampleConfigUtils", "scheduleDrinkWaterNextReminder result is null");
            return;
        }
        bwd bwdVar = (bwd) pair.second;
        if (bwdVar == null) {
            ReleaseLogUtil.c("ReminderSampleConfigUtils", "scheduleDrinkWaterNextReminder drinkWaterReminderBean is null");
            return;
        }
        if (!bwdVar.c()) {
            LogUtil.b("ReminderSampleConfigUtils", "scheduleDrinkWaterNextReminder enable false");
            return;
        }
        long jD = d(bwdVar.e(), bwdVar.a(), bwdVar.b(), bwdVar.d());
        LogUtil.b("ReminderSampleConfigUtils", "NextDrinkWaterReminder :", Long.valueOf(jD));
        if (jD == -1) {
            return;
        }
        xjk.c(300011, c("DRINK_WATER_REMIND_ACTION", lsl.m(jD), lsl.n(jD)), 201326592, 0, jD);
    }

    public static long d(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendarD = d(i, i2);
        Calendar calendarD2 = d(i3, i4);
        long timeInMillis = calendar.getTimeInMillis();
        if (timeInMillis < calendarD.getTimeInMillis()) {
            Calendar calendarA = a(calendarD, i2);
            if (calendarA.before(calendarD2) || calendarA.equals(calendarD2)) {
                return calendarA.getTimeInMillis();
            }
            return -1L;
        }
        if (timeInMillis >= calendarD2.getTimeInMillis()) {
            return -1L;
        }
        Calendar calendarA2 = (Calendar) calendar.clone();
        calendarA2.set(12, i2);
        calendarA2.set(13, 0);
        calendarA2.set(14, 0);
        if (calendarA2.getTimeInMillis() <= timeInMillis) {
            calendarA2.add(10, 1);
        }
        while (calendarA2.getTimeInMillis() <= timeInMillis && calendarA2.before(calendarD2)) {
            calendarA2.add(10, 1);
            calendarA2 = a(calendarA2, i2);
        }
        if (calendarA2.before(calendarD2) || calendarA2.equals(calendarD2)) {
            return calendarA2.getTimeInMillis();
        }
        return -1L;
    }

    private static Calendar d(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private static Calendar a(Calendar calendar, int i) {
        Calendar calendar2 = (Calendar) calendar.clone();
        int i2 = calendar2.get(11);
        if (i2 == 12 || i2 == 13) {
            calendar2.set(11, 14);
            calendar2.set(12, i);
            return calendar2;
        }
        if (i2 == 14 && calendar2.get(12) < i) {
            calendar2.set(12, i);
        }
        return calendar2;
    }

    public static void a() {
        ReleaseLogUtil.c("ReminderSampleConfigUtils", "scheduleTakeMedicineNextReminder enter");
        d("TAKE_MEDICINE_MODULEID", "TAKE_MEDICINE_KEY", "TAKE_MEDICINE_REMIND_ACTION");
        a((ResponseCallback<Pair<Long, Boolean>>) new ResponseCallback() { // from class: ced
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                cee.d(i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void d(int i, final Pair pair) {
        if (pair == null || pair.second == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: cfa
            @Override // java.lang.Runnable
            public final void run() {
                cee.a((Pair<Long, Boolean>) pair);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Pair<Long, Boolean> pair) {
        if (((Boolean) pair.second).booleanValue()) {
            bzr.b(DateFormatUtil.a(System.currentTimeMillis()), new IBaseResponseCallback() { // from class: cej
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    cee.h(i, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(int i, Object obj) {
        if (i != 0 || !(obj instanceof Map)) {
            ReleaseLogUtil.d("ReminderSampleConfigUtils", "scheduleTakeMedicineNextReminder getMedicineRulesInfo errorCode ", Integer.valueOf(i));
            return;
        }
        Map map = (Map) obj;
        LogUtil.b("ReminderSampleConfigUtils", "scheduleTakeMedicineNextReminder medicinesRuleBeans ", map.toString());
        Map<Integer, List<Integer>> mapA = a((Map<Integer, List<MedicinesRule>>) map);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, List<Integer>> entry : mapA.entrySet()) {
            String strA = a(entry.getValue(), entry.getKey().intValue());
            if (!TextUtils.isEmpty(strA)) {
                if (sb.length() > 0) {
                    sb.append(":");
                }
                sb.append(strA);
            }
        }
        LogUtil.b("ReminderSampleConfigUtils", "SharedPreferences requestCodes: ", sb.toString());
        if (sb.length() > 0) {
            lua.h("TAKE_MEDICINE_MODULEID", "TAKE_MEDICINE_KEY", sb.toString());
        }
    }

    private static Map<Integer, List<Integer>> a(Map<Integer, List<MedicinesRule>> map) {
        HashMap map2 = new HashMap();
        map2.put(0, e(map, 0));
        for (int i = 1; i <= 6; i++) {
            List<Integer> listE = e(map, i);
            if (!listE.isEmpty()) {
                map2.put(Integer.valueOf(i), listE);
                return map2;
            }
        }
        return map2;
    }

    private static List<Integer> e(Map<Integer, List<MedicinesRule>> map, int i) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i);
        int i2 = calendar.get(7);
        Iterator<Map.Entry<Integer, List<MedicinesRule>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            for (MedicinesRule medicinesRule : it.next().getValue()) {
                if (e(medicinesRule.getMedicinePeriod(), i2)) {
                    arrayList.add(Integer.valueOf(medicinesRule.getMedicineTime()));
                }
            }
        }
        return arrayList;
    }

    private static String a(List<Integer> list, int i) {
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.a(list)) {
            return "";
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iIntValue = list.get(i2).intValue();
            int i3 = (i * 100) + 300012 + i2;
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, i);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(13, iIntValue);
            long timeInMillis = calendar.getTimeInMillis();
            if (i != 0 || timeInMillis >= System.currentTimeMillis()) {
                LogUtil.b("ReminderSampleConfigUtils", "setTakeMedicineRemind: ", Long.valueOf(timeInMillis));
                xjk.c(i3, c("TAKE_MEDICINE_REMIND_ACTION", calendar.get(11), calendar.get(11)), 201326592, 0, timeInMillis);
                if (i2 > 0) {
                    sb.append(":");
                }
                sb.append(i3);
            }
        }
        return sb.toString();
    }

    private static void d(String str, String str2, String str3) {
        String strD = lua.d(str, str2, "");
        if (TextUtils.isEmpty(strD)) {
            LogUtil.b("ReminderSampleConfigUtils", "No request codes found in cache");
            return;
        }
        for (String str4 : strD.split(":")) {
            try {
                int i = Integer.parseInt(str4);
                a(i, str3);
                LogUtil.b("ReminderSampleConfigUtils", "Cancelled reminder with requestCode: " + i);
            } catch (NumberFormatException e) {
                LogUtil.e("ReminderSampleConfigUtils", "Invalid requestCode format: " + str4, e);
            }
        }
        lua.e(str, str2);
        LogUtil.b("ReminderSampleConfigUtils", "All reminders cancelled and cache cleared");
    }

    public static void a(int i, String str) {
        LogUtil.b("ReminderSampleConfigUtils", "cancelReminders enter, requestCode:", Integer.valueOf(i), ",action:", str);
        xjk.d(i, c(str, -1, -1), 201326592);
    }

    private static Intent c(String str, int i, int i2) {
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) ReminderReceiver.class);
        intent.setPackage(BaseApplication.d());
        intent.setAction(str);
        intent.putExtra("HOUR_OF_DAY", i);
        intent.putExtra("MINUTE", i2);
        return intent;
    }
}
