package defpackage;

import android.content.res.Resources;
import android.util.Pair;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dfp {
    private static BloodPressureApi a() {
        return (BloodPressureApi) Services.d("Main", BloodPressureApi.class);
    }

    public static List<dfl> c() {
        BloodPressureApi bloodPressureApiA = a();
        if (bloodPressureApiA == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlan bloodPressureApi is null");
            return new ArrayList();
        }
        return bloodPressureApiA.getBloodPressureMeasurePlan();
    }

    public static void c(ResponseCallback<List<dfl>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlan callback is null");
            return;
        }
        BloodPressureApi bloodPressureApiA = a();
        if (bloodPressureApiA == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlan bloodPressureApi is null");
            responseCallback.onResponse(-1, null);
        } else {
            bloodPressureApiA.getBloodPressureMeasurePlan(responseCallback);
        }
    }

    public static void e(ResponseCallback<Pair<Long, List<dfl>>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlanWithModifiedTime callback is null");
            return;
        }
        BloodPressureApi bloodPressureApiA = a();
        if (bloodPressureApiA == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlanWithModifiedTime bloodPressureApi is null");
            responseCallback.onResponse(-1, null);
        } else {
            bloodPressureApiA.getBloodPressureMeasurePlanWithModifiedTime(responseCallback);
        }
    }

    public static void c(List<dfl> list, boolean z, ResponseCallback<List<dfl>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "updateAllAlarm callback is null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("BloodPressureUtils", "updateAllAlarm alarmInfoList ", list);
            responseCallback.onResponse(-1, null);
            return;
        }
        BloodPressureApi bloodPressureApiA = a();
        if (bloodPressureApiA == null) {
            LogUtil.j("BloodPressureUtils", "updateAllAlarm bloodPressureApi is null");
            responseCallback.onResponse(-1, null);
        } else {
            bloodPressureApiA.updateAllAlarm(list, z, responseCallback);
        }
    }

    public static dfm c(List<dfl> list) {
        if (njy.e(list)) {
            LogUtil.j("BloodPressureUtils", "convertBloodPressureMeasurePlan list ", list);
            return new dfm();
        }
        ArrayList arrayList = new ArrayList();
        for (dfl dflVar : list) {
            if (dflVar != null) {
                dfj dfjVar = new dfj();
                dfjVar.d(dflVar.d());
                dfjVar.c(dflVar.g());
                dfjVar.b(dflVar.a());
                dfjVar.a(dflVar.c());
                dfjVar.e(dflVar.e());
                dfjVar.c(dflVar.h());
                arrayList.add(dfjVar);
            }
        }
        dfm dfmVar = new dfm();
        dfmVar.e(arrayList);
        return dfmVar;
    }

    public static List<dfl> d(dfm dfmVar) {
        if (dfmVar == null) {
            LogUtil.j("BloodPressureUtils", "convertBloodPressureAlarmInfoList measurePlan is null");
            return new ArrayList();
        }
        List<dfj> listD = dfmVar.d();
        if (njy.e(listD)) {
            LogUtil.j("BloodPressureUtils", "convertBloodPressureAlarmInfoList list ", listD);
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (dfj dfjVar : listD) {
            if (dfjVar != null) {
                dfl dflVar = new dfl(dfjVar.b(), dfjVar.c(), dfjVar.a(), dfjVar.i());
                dflVar.b(dfjVar.d());
                dflVar.b(dfjVar.e());
                arrayList.add(dflVar);
            }
        }
        return arrayList;
    }

    public static String a(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        return qrk.a(BaseApplication.b(), calendar.getTimeInMillis(), 1);
    }

    public static Comparator<dfl> e() {
        return new Comparator() { // from class: dfq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dfp.b((dfl) obj, (dfl) obj2);
            }
        };
    }

    static /* synthetic */ int b(dfl dflVar, dfl dflVar2) {
        if (dflVar == null || dflVar2 == null) {
            return 0;
        }
        int iC = dflVar.c();
        int iC2 = dflVar2.c();
        if (iC == iC2) {
            return dflVar.e() - dflVar2.e();
        }
        if ((iC > 2 && iC2 > 2) || (iC < 2 && iC2 < 2)) {
            return iC - iC2;
        }
        if (iC < 2) {
            return 1;
        }
        return iC2 < 2 ? -1 : 0;
    }

    public static String e(dfl dflVar) {
        if (dflVar == null) {
            LogUtil.j("BloodPressureUtils", "getTargetName plan is null");
            return "";
        }
        Resources resources = BaseApplication.b().getResources();
        int iD = dflVar.d();
        if (iD == 0) {
            return resources.getString(R.string.IDS_blood_pressure_get_up_comp);
        }
        if (iD == 9) {
            return resources.getString(R.string.IDS_blood_pressure_before_sleep_comp);
        }
        return resources.getString(R.string.IDS_blood_pressure_customize_title_comp, Integer.valueOf(iD));
    }

    public static void a(ResponseCallback<JSONObject> responseCallback) {
        BloodPressureApi bloodPressureApiA = a();
        if (bloodPressureApiA == null) {
            LogUtil.j("BloodPressureUtils", "queryBloodPressureDeviceStatus bloodPressureApi is null");
            responseCallback.onResponse(-1, null);
        }
        JSONObject jSONObjectQueryBloodPressureDeviceStatus = bloodPressureApiA.queryBloodPressureDeviceStatus();
        if (jSONObjectQueryBloodPressureDeviceStatus == null) {
            LogUtil.j("BloodPressureUtils", "queryBloodPressureDeviceStatus jsonObject is null");
            responseCallback.onResponse(-1, null);
        }
        responseCallback.onResponse(0, jSONObjectQueryBloodPressureDeviceStatus);
    }

    public static void a(List<dfl> list) {
        BloodPressureApi bloodPressureApiA = a();
        if (bloodPressureApiA == null) {
            LogUtil.j("BloodPressureUtils", "saveBloodPressurePlan bloodPressureApi is null");
        } else {
            bloodPressureApiA.saveBloodPressurePlan(list);
        }
    }

    public static void d() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.blood-pressure");
        if (fdiVarD == null || fdiVarD.e() == null) {
            LogUtil.e("BloodPressureUtils", "featureByFile or getExtInfo() is null");
            return;
        }
        Map mapE = fdiVarD.e();
        if (!(mapE instanceof LinkedTreeMap)) {
            LogUtil.j("BloodPressureUtils", "extInfoObject is not LinkedTreeMap");
            return;
        }
        LinkedTreeMap linkedTreeMap = (LinkedTreeMap) mapE;
        LogUtil.d("BloodPressureUtils", "extInfo," + linkedTreeMap);
        Object obj = linkedTreeMap.get("typeList");
        if (obj instanceof ArrayList) {
            Object obj2 = linkedTreeMap.get("dynamicBloodPressureTypeList");
            Object obj3 = linkedTreeMap.get("descriptionid");
            if (obj3 == null) {
                LogUtil.e("BloodPressureUtils", "objectId null");
                return;
            }
            int iH = (int) qrs.h(obj3.toString());
            LogUtil.d("BloodPressureUtils", "descriptionId," + iH);
            try {
                if (obj2 instanceof ArrayList) {
                    fdm.d().c(HiJsonUtil.d(obj2));
                }
                ArrayList<fde> arrayList = (ArrayList) HiJsonUtil.d(HiJsonUtil.d(obj), new TypeToken<ArrayList<fde>>() { // from class: com.huawei.health.bloodpressure.util.BloodPressureUtils$1
                }.getType());
                ArrayList<fdg> arrayList2 = new ArrayList<>();
                if (obj2 instanceof ArrayList) {
                    arrayList2 = (ArrayList) HiJsonUtil.d(HiJsonUtil.d(obj2), new TypeToken<ArrayList<fdg>>() { // from class: com.huawei.health.bloodpressure.util.BloodPressureUtils$2
                    }.getType());
                }
                if (arrayList == null) {
                    LogUtil.j("BloodPressureUtils", "get typeList list is null");
                    return;
                }
                LogUtil.d("BloodPressureUtils", "typeList," + arrayList.size() + "typeList," + arrayList, "dynamicBloodPressureTypeList," + arrayList2.size() + "dynamicBloodPressureTypeList," + arrayList2);
                if (njy.c(arrayList, 3)) {
                    b(arrayList.get(3));
                }
                fdm.d().b(arrayList);
                fdm.d().d(iH);
                fdm.d().a(arrayList2);
            } catch (JsonSyntaxException e) {
                LogUtil.e("BloodPressureUtils", "JsonSyntaxException in get typeList: ", e.getMessage());
            } catch (NullPointerException unused) {
                LogUtil.e("BloodPressureUtils", "Json NullPointerException");
            }
        }
    }

    private static void b(fde fdeVar) {
        if (fdeVar == null) {
            LogUtil.e("BloodPressureUtils", "bloodPressureFeatureInfo is null");
            return;
        }
        List<fde.b> listE = fdeVar.e();
        if (njy.e(listE)) {
            LogUtil.e("BloodPressureUtils", "Categorization list is null");
            return;
        }
        for (int i = 0; i < listE.size(); i++) {
            fde.b bVar = listE.get(i);
            if (bVar != null) {
                bVar.c(i);
            }
        }
    }
}
