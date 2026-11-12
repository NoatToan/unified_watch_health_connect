package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy;
import health.compact.a.HEXUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lxo implements DataReceiveCallback {
    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.b("UIDV_SportGoalListMgr", "onDataReceived errorCode ", Integer.valueOf(i));
    }

    public void d() {
        b("900200006");
    }

    public void b(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: lxr
            @Override // java.lang.Runnable
            public final void run() {
                this.f41097c.e(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str) {
        if (!c(str) && lxl.a()) {
            LogUtil.b("UIDV_SportGoalListMgr", "setThreeCircleGoal enter ");
            e();
            DeviceInfo deviceInfoD = mgg.d("UIDV_SportGoalListMgr");
            if (deviceInfoD != null) {
                ArrayList arrayList = new ArrayList(3);
                arrayList.add("900200006");
                arrayList.add("900200008");
                arrayList.add("900200009");
                qgm.a(arrayList, new d(deviceInfoD));
            }
        }
    }

    private boolean c(String str) {
        return str.equals("900200011") || str.equals("900200004") || str.equals("900200010");
    }

    private void e() {
        edc.e().registerDeviceSampleListener(SyncStrategy.SRC_PKG_NAME, this);
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DeviceInfo f41095b;

        private d(DeviceInfo deviceInfo) {
            this.f41095b = deviceInfo;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (this.f41095b == null) {
                LogUtil.e("UIDV_SportGoalListMgr", "SportAchievementGoalDataCallback mWeakReference|mDeviceInfo == null ");
                return;
            }
            if (!(obj instanceof HashMap)) {
                LogUtil.e("UIDV_SportGoalListMgr", "setThreeCircleGoal objData is not instanceof HashMap");
                return;
            }
            HashMap map = (HashMap) obj;
            int iD = qgm.d(map, "900200006", 10000);
            int iD2 = qgm.d(map, "900200008", 25);
            int iD3 = qgm.d(map, "900200009", 12);
            ReleaseLogUtil.c("UIDV_SportGoalListMgr", "setThreeCircleGoal stepValue is ", Integer.valueOf(iD), " intensityValue is ", Integer.valueOf(iD2), " standValue is ", Integer.valueOf(iD3));
            LogUtil.b("UIDV_SportGoalListMgr", "setThreeCircleGoal isSuccess ", Boolean.valueOf(edc.e().sendSampleConfigCommand(this.f41095b, lxo.d(new int[]{iD, iD2, iD3}), "UIDV_SportGoalListMgr")));
        }
    }

    public void b() {
        c();
    }

    private void c() {
        edc.e().unRegisterDeviceSampleListener(SyncStrategy.SRC_PKG_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static eef d(int[] iArr) {
        LogUtil.b("UIDV_SportGoalListMgr", "constructSampleConfig enter ");
        eef eefVar = new eef();
        eefVar.setSrcPkgName(SyncStrategy.SRC_PKG_NAME);
        eefVar.setWearPkgName(SyncStrategy.WEAR_PKG_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900200002L);
        eegVar.b(1);
        StringBuilder sb = new StringBuilder(16);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        sb.append(HEXUtils.b(1));
        sb.append(HEXUtils.b(HEXUtils.d(jCurrentTimeMillis).length() / 2));
        sb.append(HEXUtils.d(jCurrentTimeMillis));
        int[] iArr2 = {1, 3, 4};
        StringBuilder sb2 = new StringBuilder(16);
        for (int i = 0; i < 3; i++) {
            StringBuilder sb3 = new StringBuilder(16);
            sb3.append(HEXUtils.b(4));
            sb3.append(HEXUtils.b(HEXUtils.b(iArr2[i]).length() / 2));
            sb3.append(HEXUtils.b(iArr2[i]));
            sb3.append(HEXUtils.b(5));
            sb3.append(HEXUtils.b(HEXUtils.d(iArr[i]).length() / 2));
            sb3.append(HEXUtils.d(iArr[i]));
            sb2.append(HEXUtils.b(131));
            sb2.append(HEXUtils.b(sb3.toString().length() / 2));
            sb2.append((CharSequence) sb3);
        }
        sb.append(HEXUtils.b(130));
        sb.append(HEXUtils.b(sb2.toString().length() / 2));
        sb.append((CharSequence) sb2);
        LogUtil.b("UIDV_SportGoalListMgr", "constructSampleConfig structStringBuilder ", Integer.valueOf(sb.length()), " structStringBuilder is ", sb);
        eegVar.d(HEXUtils.a(sb.toString()));
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }
}
