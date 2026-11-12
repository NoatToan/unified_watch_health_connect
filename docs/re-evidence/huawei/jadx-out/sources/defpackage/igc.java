package defpackage;

import android.content.Context;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.basesport.wearengine.DeviceStateListener;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.protobuf.PlanDataForDevice;
import com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class igc implements DeviceStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static igc f37580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f37581b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f37582c;
    private BaseCoursePlanDataCustomer e;
    private boolean f = false;
    private dfb h = dfb.a();

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onConnecting() {
    }

    private igc(Context context, int i) {
        this.f37582c = context;
        f37581b = i;
        d(this);
        b();
        d();
    }

    private void d() {
        if (f37581b == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            this.e = new igb();
        } else {
            this.e = new igi();
        }
    }

    public static igc a(int i) {
        igc igcVar;
        synchronized (d) {
            if (f37580a == null) {
                LogUtil.a("Suggestion_CoursePlanDeviceManager", "getInstance");
                f37580a = new igc(BaseApplication.getContext(), i);
            }
            if (i != IntPlan.PlanType.NA_PLAN.getType()) {
                f37581b = i;
            }
            igcVar = f37580a;
        }
        return igcVar;
    }

    public static boolean c(boolean z) {
        if (!z) {
            LogUtil.j("Suggestion_CoursePlanDeviceManager", "isConnectedWearDevice() bluetoothIsEnabled=false");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_CoursePlanDeviceManager");
        if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
            return true;
        }
        LogUtil.j("Suggestion_CoursePlanDeviceManager", "isConnectedWearDevice() false, failed");
        return false;
    }

    public boolean e() {
        b();
        return this.f;
    }

    public void b(FitWorkout fitWorkout, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        xiu.c cVarE;
        if (fitWorkout == null) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "pushFitRunCourseData failed with null workout");
            iBaseResponseCallback.a(1, 1);
            return;
        }
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "pushFitRunCourseData enter. workout id is:", fitWorkout.acquireId());
        int iE = dey.e();
        int typeValue = SportHiWearBusinessType.FITNESS_CUSTOM_COURSE_FILE.getTypeValue();
        String str = "pushFitRunCourseData_" + fitWorkout.acquireId() + "_" + typeValue + "_" + iE;
        try {
            cVarE = e(fitWorkout, iE, typeValue);
        } catch (dfh e) {
            LogUtil.j("Suggestion_CoursePlanDeviceManager", str, e.getMessage());
            cVarE = null;
        }
        if (cVarE == null) {
            ReleaseLogUtil.e("Suggestion_CoursePlanDeviceManager", str, "builder pushFitRunCourseData msg error");
            b(iBaseResponseCallback, 1, (Object) 1);
        } else {
            this.h.sendCommandToDevice(str, cVarE.c(), z ? new dff(this.h, "Suggestion_CoursePlanDeviceManager", typeValue, iE, iBaseResponseCallback) : null, iBaseResponseCallback);
        }
    }

    private xiu.c e(FitWorkout fitWorkout, int i, int i2) throws dfh {
        String str = i + "courseInfo.bin";
        byte[] courseData = this.e.getCourseData(fitWorkout, 0);
        dey.c cVar = new dey.c();
        cVar.d(i2).c(courseData.length).b(1).e(i);
        d(str, cVar.a().b(), courseData);
        xiu.c cVar2 = new xiu.c();
        cVar2.a(new File(d(str)));
        return cVar2;
    }

    private xiu.c d(Plan plan, int i, int i2, String str) {
        byte[] bArrB = b(plan);
        dey.c cVar = new dey.c();
        cVar.d(i2).c(bArrB.length).b(1).e(i);
        dey deyVarA = cVar.a();
        LogUtil.j("Suggestion_CoursePlanDeviceManager", str, deyVarA.toString());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deyVarA.h());
        byteBufferAllocate.put(deyVarA.b());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.flip();
        xiu.c cVar2 = new xiu.c();
        cVar2.a(byteBufferAllocate.array());
        return cVar2;
    }

    private void b(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, obj);
        }
    }

    public void d(Plan plan, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "sendPlanHandleShake enter.");
        if (plan == null) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "sendPlanHandleShake failed with plan is null.");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        if (!e()) {
            ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "sendPlanHandleShake failed with device not support");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        if (btw.e(plan)) {
            ReleaseLogUtil.e("Suggestion_CoursePlanDeviceManager", "sendPlanHandleShake failed with plan has not update.");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        int iE = dey.e();
        int iHandleShakeBusinessType = this.e.handleShakeBusinessType();
        String str = "sendPlanHandleShake_" + plan.acquireId() + "_" + iHandleShakeBusinessType + "_" + iE + ":";
        this.h.sendCommandToDevice(str, d(plan, iE, iHandleShakeBusinessType, str).c(), z ? new dff(this.h, "Suggestion_CoursePlanDeviceManager", iHandleShakeBusinessType, iE, iBaseResponseCallback) : null, iBaseResponseCallback);
    }

    public void b(String str, int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "sendFinishPlan enter.");
        if (StringUtils.g(str)) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "sendFinishPlan failed with plan id is null.");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        if (!ifz.c()) {
            ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "sendFinishPlan failed with device not support");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        int iE = dey.e();
        int finishPlanBusinessType = BaseCoursePlanDataCustomer.getFinishPlanBusinessType(i);
        String str2 = "sendFinishPlan_" + str + "_" + finishPlanBusinessType + "_" + iE + ":";
        this.h.sendCommandToDevice(str2, c(str, iE, finishPlanBusinessType, str2).c(), z ? new dff(this.h, "Suggestion_CoursePlanDeviceManager", finishPlanBusinessType, iE, iBaseResponseCallback) : null, iBaseResponseCallback);
    }

    private xiu.c c(String str, int i, int i2, String str2) {
        byte[] bArrA = a(str);
        dey.c cVar = new dey.c();
        cVar.d(i2).c(bArrA.length).b(1).e(i);
        dey deyVarA = cVar.a();
        LogUtil.j("Suggestion_CoursePlanDeviceManager", str2, deyVarA.toString());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deyVarA.h());
        byteBufferAllocate.put(deyVarA.b());
        byteBufferAllocate.put(bArrA);
        byteBufferAllocate.flip();
        xiu.c cVar2 = new xiu.c();
        cVar2.a(byteBufferAllocate.array());
        return cVar2;
    }

    private byte[] a(String str) {
        PlanDataForDevice.PlanShakeHandsInfo.Builder builderNewBuilder = PlanDataForDevice.PlanShakeHandsInfo.newBuilder();
        builderNewBuilder.setLanguage(CommonUtil.z());
        builderNewBuilder.setPlanId(str);
        builderNewBuilder.setPunchTimeStamp((int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        builderNewBuilder.setWeekStartTime((int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        LogUtil.j("Suggestion_CoursePlanDeviceManager", "getFinishRunPlanData() ", builderNewBuilder.build().toString());
        return builderNewBuilder.build().toByteArray();
    }

    private byte[] b(Plan plan) {
        PlanDataForDevice.PlanShakeHandsInfo.Builder builderNewBuilder = PlanDataForDevice.PlanShakeHandsInfo.newBuilder();
        builderNewBuilder.setLanguage(CommonUtil.z());
        builderNewBuilder.setPlanId(plan.acquireId());
        builderNewBuilder.setPunchTimeStamp((int) (plan.getLatestClockInTime() / 1000));
        builderNewBuilder.setWeekStartTime((int) btw.a(plan).b());
        LogUtil.j("Suggestion_CoursePlanDeviceManager", "getHandlerShakeData() ", builderNewBuilder.build().toString());
        return builderNewBuilder.build().toByteArray();
    }

    public void c(IntPlan intPlan, List<FitWorkout> list, int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        xiu.c cVarC;
        if (intPlan == null) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "pushPlanData failed with plan is null.");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        d();
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "pushPlanData enter. plan id is:", intPlan.getPlanId());
        if (!e(intPlan.getPlanType().getType())) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "pushPlanData failed with device not support", Integer.valueOf(intPlan.getPlanType().getType()));
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        if (btw.n(intPlan)) {
            ReleaseLogUtil.e("Suggestion_CoursePlanDeviceManager", "pushPlanData failed with plan has not update.");
            b(iBaseResponseCallback, 1, (Object) 1);
            return;
        }
        String str = "pushPlanData_" + intPlan.getPlanId();
        int iE = dey.e();
        int iDistributeBusinessType = this.e.distributeBusinessType();
        try {
            cVarC = c(intPlan, list, i, iE, str);
        } catch (dfh e) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", str, e.getMessage());
            cVarC = null;
        }
        SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "isSendCourseDevice", intPlan.getPlanId() + " true");
        if (cVarC != null) {
            this.h.sendCommandToDevice(str, cVarC.c(), z ? new dff(this.h, "Suggestion_CoursePlanDeviceManager", iDistributeBusinessType, iE, iBaseResponseCallback) : null, iBaseResponseCallback);
        } else {
            ReleaseLogUtil.e("Suggestion_CoursePlanDeviceManager", str, "builder pushPlanData msg error");
            b(iBaseResponseCallback, 1, (Object) 1);
        }
    }

    private xiu.c c(IntPlan intPlan, List<FitWorkout> list, int i, int i2, String str) throws dfh {
        Integer num;
        igd.a aVar = new igd.a();
        aVar.e(i2);
        aVar.d(this.e.distributeBusinessType());
        HashMap map = new HashMap(list.size());
        Map<String, Integer> mapC = c(intPlan.getWeekInfoByOrder(btw.h(intPlan)));
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", str, " can send courseIds is", mapC);
        for (FitWorkout fitWorkout : list) {
            map.put(fitWorkout.acquireId(), fitWorkout);
            if (i == 2 && (num = mapC.get(fitWorkout.acquireId())) != null && num.intValue() == CourseDataBean.PlanCourseType.RUN_COURSE.getValue()) {
                aVar.a(this.e.getCourseData(fitWorkout, 1), CourseDataBean.PlanCourseType.RUN_COURSE.getValue());
            }
        }
        Iterator<String> it = mapC.keySet().iterator();
        while (it.hasNext()) {
            if (map.get(it.next()) == null) {
                ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "relative courseId not has workout.");
                throw new dfh(-101, "relative courseId not has workout.");
            }
        }
        byte[] planBasicData = this.e.getPlanBasicData(intPlan, map);
        if (planBasicData == null) {
            ReleaseLogUtil.e("Suggestion_CoursePlanDeviceManager", "getPlanDataMsgBuilder planData null");
            return null;
        }
        aVar.a(planBasicData);
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "getPlanDataMsgBuilder logTag ", str);
        String str2 = i2 + this.e.getPlanFileName();
        d(str2, aVar.e().b());
        xiu.c cVar = new xiu.c();
        cVar.a(new File(d(str2)));
        return cVar;
    }

    public final void d(DeviceStateListener deviceStateListener) {
        if (deviceStateListener == null) {
            ReleaseLogUtil.a("Suggestion_CoursePlanDeviceManager", "registerDeviceStateListener failed with null params");
        }
        this.h.registerDeviceStateListener(deviceStateListener);
    }

    private Map<String, Integer> c(IntWeekPlan intWeekPlan) {
        if (intWeekPlan == null) {
            return new LinkedHashMap();
        }
        int dayCount = intWeekPlan.getDayCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap(dayCount);
        for (int i = 0; i < dayCount; i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                    if (inPlanAction != null && !"Race".equals(inPlanAction.getActionId())) {
                        linkedHashMap.put(inPlanAction.getActionId(), Integer.valueOf(inPlanAction.getActionType().getType()));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void d(String str, byte[]... bArr) throws dfh {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f37582c.openFileOutput(str, 0);
                for (byte[] bArr2 : bArr) {
                    fileOutputStreamOpenFileOutput.write(bArr2);
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused) {
                        LogUtil.e("Suggestion_CoursePlanDeviceManager", "writefile finally failed IOException");
                    }
                }
            } catch (Exception e) {
                LogUtil.e("Suggestion_CoursePlanDeviceManager", "writefile failed", ExceptionUtils.c(e));
                throw new dfh(-102, "write file failed");
            }
        } catch (Throwable th) {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused2) {
                    LogUtil.e("Suggestion_CoursePlanDeviceManager", "writefile finally failed IOException");
                }
            }
            throw th;
        }
    }

    private String d(String str) {
        return this.f37582c.getFilesDir() + File.separator + str;
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onDisconnected() {
        ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "the device disconnected.");
        this.f = false;
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onConnected() {
        b();
        if (this.f) {
            ReleaseLogUtil.d("Suggestion_CoursePlanDeviceManager", "the device support intelligent run plan.");
        } else {
            ReleaseLogUtil.e("Suggestion_CoursePlanDeviceManager", "the device not support intelligent run plan.");
        }
    }

    private void b() {
        this.f = ifz.d();
    }

    public static boolean e(int i) {
        if (i == IntPlan.PlanType.AI_RUN_PLAN.getType() && ifz.d()) {
            return true;
        }
        return i == IntPlan.PlanType.AI_FITNESS_PLAN.getType() && ifz.e();
    }
}
