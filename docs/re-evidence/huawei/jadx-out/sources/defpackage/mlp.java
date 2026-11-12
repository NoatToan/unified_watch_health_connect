package defpackage;

import android.os.Bundle;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseParams;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41884a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41885c = new Object();
    private static mlp d;
    private List<JSONArray> h;
    private IBaseResponseCallback i;
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41886b = 0;
    private Map<Integer, List<JSONArray>> j = new HashMap(16);

    public static mlp a() {
        mlp mlpVar;
        synchronized (f41884a) {
            if (d == null) {
                LogUtil.a("BloodOxygenManager", "getInstance()");
                d = new mlp();
            }
            mlpVar = d;
        }
        return mlpVar;
    }

    public void b(int i) {
        this.f41886b = i;
        LogUtil.a("BloodOxygenManager", "getDeviceWorkoutRecordStatistic() mBloodOxygenIndex :", Integer.valueOf(i));
    }

    public void d(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("BloodOxygenManager", "mBloodOxygenIndex :", Integer.valueOf(this.f41886b), "workout_record_id :", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            LogUtil.a("BloodOxygenManager", "handleBloodOxygen callback is null.");
        } else if (this.f41886b != 0) {
            this.h = new ArrayList(16);
            c(i, this.f41886b, i2, iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(i2, null);
        }
    }

    public void d() {
        this.j.clear();
    }

    public void a(int i, int i2, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        LogUtil.a("BloodOxygenManager", "getBloodOxygenListStatistic enter");
        synchronized (f41885c) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(20);
            String strE = eeq.e(i);
            String strB = eeq.b(strE.length() / 2);
            String strD = eeq.d(1);
            String strE2 = eeq.e(i2);
            String strB2 = eeq.b(strE2.length() / 2);
            String strD2 = eeq.d(2);
            String strD3 = eeq.d(3);
            String strD4 = eeq.d(0);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            sb.append(strE);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strE2);
            sb.append(strD3);
            sb.append(strD4);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
            this.i = iBaseResponseCallback;
        }
    }

    public void c(List<eew> list, List<ees> list2) {
        mls mlsVar = new mls();
        for (eew eewVar : list) {
            int iB = CommonUtil.b(eewVar.e(), 16);
            if (iB == 1) {
                mlsVar.a(Integer.parseInt(eewVar.b(), 16));
            } else if (iB == 2) {
                mlsVar.e(Integer.parseInt(eewVar.b(), 16));
            } else {
                LogUtil.d("BloodOxygenManager", "Invalid value");
            }
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                b(it2.next(), arrayList);
            }
        }
        mlsVar.a(arrayList);
        IBaseResponseCallback iBaseResponseCallback = this.i;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, nfo.a(mlsVar, "getWorkoutRecordBloodOxygenList"));
        }
    }

    private void b(ees eesVar, List<mlr> list) {
        mlr mlrVar = new mlr();
        Bundle bundle = new Bundle();
        for (eew eewVar : eesVar.e()) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 5) {
                bundle.putLong("interval", CommonUtil.x(eewVar.b()));
            } else if (iV == 6) {
                bundle.putInt("value", CommonUtil.v(eewVar.b()));
            } else {
                LogUtil.d("BloodOxygenManager", "Invalid value");
            }
        }
        mlrVar.a(bundle);
        list.add(mlrVar);
    }

    public void c(int i, MotionPath motionPath) {
        try {
            ArrayList arrayList = new ArrayList(16);
            Map<Integer, List<JSONArray>> map = this.j;
            char c2 = 2;
            char c3 = 1;
            if (map != null && map.get(Integer.valueOf(i)) != null) {
                arrayList.addAll(this.j.get(Integer.valueOf(i)));
                LogUtil.a("BloodOxygenManager", "RecordBlood bloodOxygenArrayList size:", Integer.valueOf(arrayList.size()));
            }
            ArrayList arrayList2 = new ArrayList(16);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                int size = arrayList.size();
                Object[] objArr = new Object[4];
                objArr[0] = "Enter for i bloodOxygenArrayList.size :";
                objArr[c3] = Integer.valueOf(size);
                objArr[c2] = "i :";
                char c4 = 3;
                objArr[3] = Integer.valueOf(i2);
                LogUtil.d("BloodOxygenManager", objArr);
                if (arrayList.get(i2) instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) arrayList.get(i2);
                    int i3 = 0;
                    while (i3 < jSONArray.length()) {
                        int length = jSONArray.length();
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = "Enter for i blood_oxygen_struct.length() :";
                        objArr2[c3] = Integer.valueOf(length);
                        objArr2[c2] = "j :";
                        objArr2[c4] = Integer.valueOf(i3);
                        LogUtil.d("BloodOxygenManager", objArr2);
                        JSONObject jSONObject = jSONArray.getJSONObject(i3);
                        arrayList2.add(new nju(jSONObject.getLong("interval"), jSONObject.getInt("value")));
                        c3 = 1;
                        c4 = 3;
                        LogUtil.d("BloodOxygenManager", "interval:", Long.valueOf(jSONObject.getLong("interval")), "value:", Integer.valueOf(jSONObject.getInt("value")));
                        i3++;
                        c2 = 2;
                    }
                }
                i2++;
                c2 = c2;
            }
            motionPath.saveSpo2List(arrayList2);
        } catch (JSONException unused) {
            LogUtil.e("BloodOxygenManager", "saveOxygenData JSONException");
        }
    }

    private void c(final int i, final int i2, final int i3, final IBaseResponseCallback iBaseResponseCallback) {
        try {
            int i4 = this.e;
            if (i4 < i2) {
                LogUtil.a("BloodOxygenManager", "getBloodOxygenList. workout_record_id :", Integer.valueOf(i), "bloodOxygenIndex :", Integer.valueOf(i4), "errorCode :", Integer.valueOf(i3));
                a(i, this.e, new IBaseResponseCallback() { // from class: mlp.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i5, Object obj) {
                        LogUtil.a("BloodOxygenManager", "Enter getBloodOxygenList().onResponse()");
                        mlp.this.d(obj, i, i2, i3, iBaseResponseCallback);
                    }
                });
                return;
            }
            b();
            if (this.h != null) {
                this.j.put(Integer.valueOf(i), this.h);
                LogUtil.a("BloodOxygenManager", "mWorkoutRecordBloodOxygenMapList.size :", Integer.valueOf(this.j.size()));
            }
            iBaseResponseCallback.a(i3, null);
            this.f41886b = 0;
            this.e = 0;
        } catch (JSONException unused) {
            LogUtil.e("BloodOxygenManager", "getBloodOxygenList JSONException");
            d(i3);
        }
    }

    private void d(int i) {
        HwExerciseAdviceManager.getInstance().setWorkoutRunPlayFailCount(HwExerciseAdviceManager.getInstance().getWorkoutRunPlayFailCount() + 1);
        HwExerciseParams.getInstance().setWorkoutRecordStatisticIndex(HwExerciseParams.getInstance().getWorkoutRecordStatisticIndex() + 1);
        HwExerciseAdviceManager.getInstance().getDeviceWorkoutRecordStatistic(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        try {
            if (obj == null) {
                LogUtil.j("BloodOxygenManager", "Enter getBloodOxygenStatisticJsonList objectData is null");
                d(i3);
                return;
            }
            if (!(obj instanceof Map)) {
                LogUtil.j("BloodOxygenManager", "Enter getBloodOxygenStatisticJsonList objectData not instanceof Map");
                d(i3);
                return;
            }
            Object obj2 = ((Map) obj).get("value");
            if (!(obj2 instanceof String)) {
                LogUtil.j("BloodOxygenManager", "Enter getBloodOxygenStatisticJsonList valueObject not instanceof String");
                d(i3);
                return;
            }
            String str = (String) obj2;
            JSONObject jSONObject = new JSONObject(str);
            if (!(jSONObject.get("bloodOxygenStructList") instanceof JSONArray)) {
                LogUtil.j("BloodOxygenManager", "Enter getBloodOxygenStatisticJsonList not instanceof JSONArray");
                d(i3);
                return;
            }
            JSONArray jSONArray = (JSONArray) jSONObject.get("bloodOxygenStructList");
            LogUtil.a("BloodOxygenManager", "value :", str);
            this.e++;
            List<JSONArray> list = this.h;
            if (list != null) {
                list.add(jSONArray);
            }
            c(i, i2, i3, iBaseResponseCallback);
        } catch (JSONException unused) {
            LogUtil.e("BloodOxygenManager", "getBloodOxygenStatisticJsonList onResponse JSONException");
            this.e++;
            c(i, i2, 2, iBaseResponseCallback);
        }
    }

    private void b() {
        List<JSONArray> list = this.h;
        if (list == null) {
            LogUtil.j("BloodOxygenManager", "printWorkoutRecordBloodOxygenInfo mBloodOxygenStatisticJsonList is null");
            return;
        }
        LogUtil.a("BloodOxygenManager", "printWorkoutRecordBloodOxygenInfo enter. mSectionRecordsStatisticJsonObjects.size :", Integer.valueOf(list.size()));
        for (int i = 0; i < this.h.size(); i++) {
            try {
                if (this.h.get(i) instanceof JSONArray) {
                    JSONArray jSONArray = this.h.get(i);
                    LogUtil.d("BloodOxygenManager", "printWorkoutRecordBloodOxygenInfo bloodOxygenStruct.length() :", Integer.valueOf(jSONArray.length()));
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        LogUtil.d("BloodOxygenManager", "interval :", Long.valueOf(jSONObject.getLong("interval")), "value :", Integer.valueOf(jSONObject.getInt("value")));
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e("BloodOxygenManager", "printWorkoutRecordBloodOxygenInfo JSONException");
                return;
            }
        }
    }
}
