package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.up.utils.ErrorCode;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes38.dex */
public class lwz extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lwz f40997c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f40998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f40999b;
    private Context d;
    private lvb f;

    private int a(int i) {
        return (i <= 127 || i > 16383) ? i : (i & 127) + ((i & 16256) << 1) + 32768;
    }

    private int e(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return 0;
            case 7:
            case 8:
            case 9:
                return 1;
            default:
                return -1;
        }
    }

    private lwz(Context context) {
        super(context);
        this.f40998a = new BroadcastReceiver() { // from class: lwz.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                DeviceInfo deviceInfo;
                if (context2 == null || intent == null) {
                    return;
                }
                LogUtil.a("HwExerciseAdviceManager", "mConnectStateChangedReceiver() action : ", intent.getAction());
                if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                    return;
                }
                LogUtil.a("HwExerciseAdviceManager", "mConnectStateChangedReceiver() status : ", Integer.valueOf(deviceInfo.getDeviceConnectState()), " is callback null: ", Boolean.valueOf(lwz.this.f40999b == null));
                if (lwz.this.f40999b == null) {
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                if (deviceConnectState == 2) {
                    lwz.this.f40999b.a(100000, 100001);
                } else if (deviceConnectState == 3) {
                    lwz.this.f40999b.a(100000, Integer.valueOf(ErrorCode.HWID_IS_STOPED));
                } else {
                    LogUtil.j("HwExerciseAdviceManager", "Invalid device connect state.");
                }
            }
        };
        this.d = context;
        lvb lvbVarE = lvb.e();
        this.f = lvbVarE;
        if (lvbVarE != null) {
            lvbVarE.d(22, this);
        } else {
            LogUtil.e("HwExerciseAdviceManager", "mDeviceConfigManager is null");
        }
        BroadcastManagerUtil.c(this.d, this.f40998a, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public static lwz e() {
        lwz lwzVar;
        synchronized (e) {
            if (f40997c == null) {
                LogUtil.a("HwExerciseAdviceManager", "getInstance");
                f40997c = new lwz(BaseApplication.getContext());
            }
            lwzVar = f40997c;
        }
        return lwzVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 22;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwExerciseAdviceManager", "registerDataCallback");
        this.f40999b = iBaseResponseCallback;
    }

    public void d() {
        LogUtil.a("HwExerciseAdviceManager", "unRegisterDataCallback");
        this.f40999b = null;
    }

    public void c() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(12);
        String strB = eeq.b(0);
        String strD = eeq.d(129);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("HwExerciseAdviceManager", "getFitRunCourseInfo deviceCommand : ", deviceCommand.toString());
        this.f.c(deviceCommand);
    }

    private int b(byte[] bArr) {
        LogUtil.a("HwExerciseAdviceManager", "Enter parseFitRunCourseInfo");
        ees eesVarA = a(bArr);
        int i = -1;
        if (eesVarA == null) {
            return -1;
        }
        for (eew eewVar : eesVarA.e()) {
            try {
                LogUtil.a("HwExerciseAdviceManager", "the case is ", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                int i2 = Integer.parseInt(eewVar.e(), 16);
                if (i2 == 1) {
                    LogUtil.a("HwExerciseAdviceManager", "RUNNING_COURSE_STURCT value ", eewVar.b());
                } else if (i2 == 2) {
                    LogUtil.a("HwExerciseAdviceManager", "DEVICE_FRAME_ABILITY value ", eewVar.b());
                } else if (i2 == 3) {
                    LogUtil.a("HwExerciseAdviceManager", "DEVICE_FRAME_VERSION value ", eewVar.b());
                    i = Integer.parseInt(eewVar.b());
                } else if (i2 == 4) {
                    LogUtil.a("HwExerciseAdviceManager", "EXERCISE_ID_LIST value ", eewVar.b());
                } else if (i2 == 5) {
                    LogUtil.a("HwExerciseAdviceManager", "EXERCISE_VERSION_LIST value ", eewVar.b());
                } else {
                    LogUtil.j("HwExerciseAdviceManager", "parseFitRunCourseInfo switch defalt");
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwExerciseAdviceManager", "parseFitRunCourseInfo NumberFormatException");
            }
        }
        return i;
    }

    public void d(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.j("HwExerciseAdviceManager", "map is null,can not push to watch!");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(13);
        StringBuffer stringBuffer = new StringBuffer(16);
        d(fitWorkout, stringBuffer);
        stringBuffer.append(e(3, fitWorkout.acquireMeasurementType(), 0));
        i(fitWorkout, stringBuffer);
        e(fitWorkout, stringBuffer);
        b(fitWorkout, stringBuffer);
        stringBuffer.append(e(14, 1, 0));
        stringBuffer.append(e(15, fitWorkout.acquireRunActionNum(), 0));
        c(fitWorkout, stringBuffer);
        a(fitWorkout, stringBuffer);
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        LogUtil.a("HwExerciseAdviceManager", "pushFitRunCourseData deviceCommand : ", deviceCommand.toString());
        this.f.c(deviceCommand);
    }

    private void i(FitWorkout fitWorkout, StringBuffer stringBuffer) {
        if (fitWorkout == null || stringBuffer == null) {
            return;
        }
        stringBuffer.append(e(4, (int) fitWorkout.acquireDistance(), 2));
        stringBuffer.append(e(5, fitWorkout.acquireDuration(), 2));
    }

    private void e(FitWorkout fitWorkout, StringBuffer stringBuffer) {
        if (fitWorkout == null || stringBuffer == null) {
            return;
        }
        stringBuffer.append(e(7, fitWorkout.acquireDifficulty(), 0));
        String strAccquireVersion = fitWorkout.accquireVersion();
        String strD = eeq.d(9);
        String strA = eeq.a(strAccquireVersion);
        stringBuffer.append(strD);
        stringBuffer.append(eeq.d(strA.length() / 2));
        stringBuffer.append(strA);
    }

    private void d(FitWorkout fitWorkout, StringBuffer stringBuffer) {
        if (fitWorkout == null || stringBuffer == null) {
            return;
        }
        String strAcquireId = fitWorkout.acquireId();
        String strD = eeq.d(1);
        String strA = eeq.a(strAcquireId);
        stringBuffer.append(strD);
        stringBuffer.append(eeq.d(strA.length() / 2));
        stringBuffer.append(strA);
        String strAcquireName = fitWorkout.acquireName();
        String strD2 = eeq.d(2);
        String strI = eeq.i(strAcquireName);
        stringBuffer.append(strD2);
        stringBuffer.append(eeq.d(strI.length() / 2));
        stringBuffer.append(strI);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    private void b(FitWorkout fitWorkout, StringBuffer stringBuffer) {
        String strOptString;
        if (fitWorkout == null || stringBuffer == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(fitWorkout.acquireNarrowDesc());
            if (!jSONObject.has("extendMap") || TextUtils.isEmpty(jSONObject.optString("extendMap"))) {
                strOptString = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("extendMap"));
                if (jSONObject2.isNull("课程说明")) {
                    strOptString = null;
                } else {
                    strOptString = jSONObject2.optString("课程说明");
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("HwExerciseAdviceManager", "detailInfo exception");
        }
        if (strOptString != null) {
            String strI = eeq.i(strOptString);
            stringBuffer.append(eeq.d(12));
            stringBuffer.append(eeq.d(a(strI.length() / 2)));
            stringBuffer.append(strI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    private void c(FitWorkout fitWorkout, StringBuffer stringBuffer) {
        int iB;
        if (fitWorkout == null || stringBuffer == null) {
            return;
        }
        String strAcquireExtendSeaMap = fitWorkout.acquireExtendSeaMap();
        if (TextUtils.isEmpty(strAcquireExtendSeaMap)) {
            iB = -1;
        } else {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(strAcquireExtendSeaMap).optJSONObject(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE);
                if (jSONObjectOptJSONObject != null) {
                    pcs pcsVar = new pcs(jSONObjectOptJSONObject.optString("title"), jSONObjectOptJSONObject.optString(ParamConstants.Param.CONTEXT));
                    if (TextUtils.isEmpty(pcsVar.e())) {
                        iB = -1;
                    } else {
                        iB = CommonUtil.b(pcsVar.e(), 10);
                    }
                } else {
                    iB = -1;
                }
            } catch (JSONException unused) {
                LogUtil.e("HwExerciseAdviceManager", "workoutTypeObject exception");
            }
        }
        if (iB != -1) {
            stringBuffer.append(e(31, iB, 0));
        }
    }

    private void a(FitWorkout fitWorkout, StringBuffer stringBuffer) {
        if (fitWorkout == null || stringBuffer == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(a(fitWorkout.acquireWarmUpRunAction(), 0));
        Iterator<WorkoutAction> it = fitWorkout.acquireWorkoutActions().iterator();
        while (it.hasNext()) {
            sb.append(a(it.next(), 1));
        }
        sb.append(a(fitWorkout.acquireCoolDownRunAction(), 3));
        stringBuffer.append(eeq.d(16));
        stringBuffer.append(eeq.d(a(sb.length() / 2)));
        stringBuffer.append(sb.toString());
    }

    private int c(byte[] bArr) {
        LogUtil.a("HwExerciseAdviceManager", "Enter parseFitRunCourseResponseData");
        ees eesVarA = a(bArr);
        if (eesVarA == null) {
            return -1;
        }
        try {
            return Integer.parseInt(eesVarA.e().get(0).b(), 16);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwExerciseAdviceManager", "parseFitRunCourseResponseData NumberFormatException");
            return -1;
        }
    }

    private ees a(byte[] bArr) {
        LogUtil.a("HwExerciseAdviceManager", "Enter getTlvList is dataContent null ", Boolean.valueOf(bArr == null));
        if (bArr != null) {
            String strE = eeq.e(bArr);
            if (strE.length() <= 4) {
                LogUtil.j("HwExerciseAdviceManager", "getTlvList dataStrInfo.length() is invalid");
                return null;
            }
            try {
                return new eet().b(strE.substring(4, strE.length()));
            } catch (eeu unused) {
                LogUtil.e("HwExerciseAdviceManager", "resloveWatchStatus TlvException.");
            }
        }
        return null;
    }

    private String e(int i, int i2, int i3) {
        String strD;
        int i4 = 1;
        if (i3 == 0) {
            strD = eeq.d(i2);
        } else if (i3 == 1) {
            strD = eeq.e(i2);
            i4 = 2;
        } else if (i3 != 2) {
            LogUtil.j("HwExerciseAdviceManager", "formTlvForIntType unknown valueType : ", Integer.valueOf(i3));
            i4 = 0;
            strD = "";
        } else {
            strD = eeq.c(i2);
            i4 = 4;
        }
        String str = eeq.d(i) + eeq.d(i4) + strD;
        LogUtil.d("HwExerciseAdviceManager", "formTlvForIntType() result : ", str);
        return str;
    }

    private String a(WorkoutAction workoutAction, int i) {
        if (workoutAction == null) {
            LogUtil.j("HwExerciseAdviceManager", "workoutAction is null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        b(workoutAction, stringBuffer);
        int iAcquireIntensityType = workoutAction.acquireIntensityType();
        int iE = e(iAcquireIntensityType);
        if (iE != -1) {
            stringBuffer.append(e(25, iE, 0));
        }
        stringBuffer.append(e(26, iAcquireIntensityType, 0));
        String strC = c(workoutAction, iAcquireIntensityType);
        String strD = eeq.d(27);
        String strA = eeq.a(strC);
        stringBuffer.append(strD);
        stringBuffer.append(eeq.d(strA.length() / 2));
        stringBuffer.append(strA);
        stringBuffer.append(e(28, i, 0));
        String strD2 = eeq.d(145);
        stringBuffer.insert(0, eeq.d(a(stringBuffer.length() / 2)));
        stringBuffer.insert(0, strD2);
        return stringBuffer.toString();
    }

    private void b(WorkoutAction workoutAction, StringBuffer stringBuffer) {
        if (workoutAction == null || stringBuffer == null) {
            return;
        }
        String actionId = workoutAction.getActionId();
        String strD = eeq.d(18);
        String strA = eeq.a(actionId);
        stringBuffer.append(strD);
        stringBuffer.append(eeq.d(strA.length() / 2));
        stringBuffer.append(strA);
        AtomicAction action = workoutAction.getAction();
        if (action == null) {
            return;
        }
        String name = action.getName();
        String strD2 = eeq.d(19);
        String strI = eeq.i(name);
        stringBuffer.append(strD2);
        stringBuffer.append(eeq.d(strI.length() / 2));
        stringBuffer.append(strI);
        stringBuffer.append(e(21, workoutAction.acquireMeasurementValue(), 2));
        stringBuffer.append(e(22, workoutAction.acquireMeasurementType(), 0));
    }

    private String c(WorkoutAction workoutAction, int i) {
        if (workoutAction == null) {
            return null;
        }
        if (i == 0) {
            return String.valueOf((int) (workoutAction.acquireSpeedL() * 1000.0f)) + "," + String.valueOf((int) (workoutAction.acquireSpeedH() * 1000.0f));
        }
        if (i == 1) {
            return String.valueOf(workoutAction.acquireRelativeHeartRatePercentL()) + "," + String.valueOf(workoutAction.acquireRelativeHeartRatePercentH());
        }
        if (i == 2) {
            return workoutAction.acquireAbsoluteHeartRateL() + "," + workoutAction.acquireAbsoluteHeartRateH();
        }
        if (i == 3) {
            int iAcquireSpeedL = (int) (workoutAction.acquireSpeedL() * 1000.0f);
            int iAcquireSpeedH = (int) (workoutAction.acquireSpeedH() * 1000.0f);
            return String.valueOf(workoutAction.acquireRelativeHeartRatePercentL()) + "," + String.valueOf(workoutAction.acquireRelativeHeartRatePercentH()) + "|" + String.valueOf(iAcquireSpeedL) + "," + String.valueOf(iAcquireSpeedH);
        }
        if (i == 4) {
            return String.valueOf(workoutAction.acquireRelativeHeartRateRangeL()) + "," + String.valueOf(workoutAction.acquireRelativeHeartRateRangeH());
        }
        if (i == 5) {
            int iAcquireSpeedL2 = (int) (workoutAction.acquireSpeedL() * 1000.0f);
            int iAcquireSpeedH2 = (int) (workoutAction.acquireSpeedH() * 1000.0f);
            return String.valueOf(workoutAction.acquireAbsoluteHeartRateL()) + "," + String.valueOf(workoutAction.acquireAbsoluteHeartRateH()) + "|" + String.valueOf(iAcquireSpeedL2) + "," + String.valueOf(iAcquireSpeedH2);
        }
        if (i == 6) {
            int iAcquireSpeedL3 = (int) (workoutAction.acquireSpeedL() * 1000.0f);
            int iAcquireSpeedH3 = (int) (workoutAction.acquireSpeedH() * 1000.0f);
            return String.valueOf(workoutAction.acquireRelativeHeartRateRangeL()) + "," + String.valueOf(workoutAction.acquireRelativeHeartRateRangeH()) + "|" + String.valueOf(iAcquireSpeedL3) + "," + String.valueOf(iAcquireSpeedH3);
        }
        return e(workoutAction, i);
    }

    private String e(WorkoutAction workoutAction, int i) {
        if (workoutAction == null) {
            return null;
        }
        if (i == 7) {
            return String.valueOf(workoutAction.acquireReserveHeartRatePercentL()) + "," + String.valueOf(workoutAction.acquireReserveHeartRatePercentH());
        }
        if (i == 8) {
            return String.valueOf(workoutAction.acquireReserveHeartRateRangeL()) + "," + String.valueOf(workoutAction.acquireReserveHeartRateRangeH());
        }
        if (i == 9) {
            return String.valueOf(workoutAction.acquireMaf180HeartRateBase()) + "," + String.valueOf(workoutAction.acquireMaf180HeartRateRange());
        }
        LogUtil.j("HwExerciseAdviceManager", "Invalid type");
        return null;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (i != 0 || bArr == null) {
            return;
        }
        LogUtil.a("HwExerciseAdviceManager", "onDataReceived bluetooth data", eeq.e(bArr), " is callback null: ", Boolean.valueOf(this.f40999b == null));
        IBaseResponseCallback iBaseResponseCallback = this.f40999b;
        if (iBaseResponseCallback == null) {
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 12) {
            iBaseResponseCallback.a(12, Integer.valueOf(b(bArr)));
        } else if (b2 != 13) {
            LogUtil.j("HwExerciseAdviceManager", "Invalid course information type.");
        } else {
            iBaseResponseCallback.a(13, Integer.valueOf(c(bArr)));
        }
    }
}
