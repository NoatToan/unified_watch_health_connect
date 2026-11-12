package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.RemoteException;
import android.os.SystemClock;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.util.HiJsonUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class lbj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f39825b = new AtomicBoolean(false);
    private Map<Long, ICommonCallback> e = new HashMap();
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: lbj.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.a("R_HiHealthKitSyncDataHelper", "SyncDataReceiver intent is null");
                return;
            }
            long longExtra = intent.getLongExtra("sync_data_result_id", 0L);
            if (lbj.this.e.containsKey(Long.valueOf(longExtra))) {
                boolean booleanExtra = intent.getBooleanExtra("sync_data_result_success", false);
                ReleaseLogUtil.d("R_HiHealthKitSyncDataHelper", "receive syncId: ", Long.valueOf(longExtra), " sync result: ", Boolean.valueOf(booleanExtra));
                ICommonCallback iCommonCallback = (ICommonCallback) lbj.this.e.get(Long.valueOf(longExtra));
                lbj.this.e.remove(Long.valueOf(longExtra));
                try {
                    if (booleanExtra) {
                        iCommonCallback.onResult(0, lcr.b(0));
                    } else {
                        iCommonCallback.onResult(1022, lcr.b(1022));
                    }
                } catch (RemoteException e) {
                    ReleaseLogUtil.a("R_HiHealthKitSyncDataHelper", "SyncDataReceiver RemoteException: ", e.getMessage());
                }
            }
            if (lbj.this.e.isEmpty() && lbj.f39825b.compareAndSet(true, false)) {
                lbj.this.e();
            }
        }
    };

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lbj f39827b = new lbj();
    }

    public static lbj a() {
        return b.f39827b;
    }

    public void c(int[] iArr, ICommonCallback iCommonCallback) {
        ReleaseLogUtil.d("R_HiHealthKitSyncDataHelper", "enter syncDataTypes: ", HiJsonUtil.d(iArr));
        if (f39825b.compareAndSet(false, true)) {
            d();
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.e.put(Long.valueOf(jElapsedRealtimeNanos), iCommonCallback);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataTypes(b(iArr));
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncId(jElapsedRealtimeNanos);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
    }

    private void d() {
        ReleaseLogUtil.d("R_HiHealthKitSyncDataHelper", "register sync receiver");
        BroadcastManagerUtil.d(BaseApplication.b(), this.d, new IntentFilter("com.huawei.hihealth.action_sync_data_result"), "com.huawei.hihealth.DEFAULT_PERMISSION", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ReleaseLogUtil.d("R_HiHealthKitSyncDataHelper", "unregister sync receiver");
        BaseApplication.b().unregisterReceiver(this.d);
    }

    private List<Integer> b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
