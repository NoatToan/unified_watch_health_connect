package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessagePushBean;
import com.huawei.health.utils.SyncCloudUtils;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gsy implements IpushBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f36010c;
    private e d;

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("8002");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        LogUtil.a("SyncDataPushReceiver", "enter processPushMsg");
        if (context == null) {
            ReleaseLogUtil.d("HiH_SyncDataPushReceiver", "processPushMsg context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("HiH_SyncDataPushReceiver", "processPushMsg push message is Empty");
            return;
        }
        ReleaseLogUtil.c("HiH_SyncDataPushReceiver", "processPushMsg message: ", str);
        try {
            MessagePushBean messagePushBean = (MessagePushBean) new Gson().fromJson(str, MessagePushBean.class);
            if (messagePushBean == null) {
                LogUtil.j("SyncDataPushReceiver", "processPushMsg MessagePushBean is null");
                return;
            }
            if (messagePushBean.getPushType() != Integer.valueOf("8002").intValue()) {
                LogUtil.j("SyncDataPushReceiver", "processPushMsg pushType invaild");
                return;
            }
            this.f36010c = context;
            d();
            e();
            b();
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.b("HiH_SyncDataPushReceiver", "processPushMsg JsonSyntaxException");
        }
    }

    private void d() {
        ReleaseLogUtil.c("HiH_SyncDataPushReceiver", "enter registerSyncReceiver");
        if (this.d == null) {
            this.d = new e();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        LocalBroadcastManager.getInstance().registerReceiver(this.d, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ReleaseLogUtil.c("HiH_SyncDataPushReceiver", "enter unregisterSyncReceiver");
        if (this.d != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.d);
            this.d = null;
        }
    }

    private void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        lvb.e().a(new IBaseResponseCallback() { // from class: gsy.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("SyncDataPushReceiver", "work out sync errorCode: ", Integer.valueOf(i));
            }
        });
        LogUtil.a("SyncDataPushReceiver", "deviceDataSync finished, time cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            HealthSyncUtil.b(SyncApi.FITNESS);
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.b("HiH_SyncDataPushReceiver", "FitnessAdvice syncData failed");
        }
        try {
            HealthSyncUtil.b(SyncApi.HEALTH_LIFE);
        } catch (IllegalArgumentException unused2) {
            ReleaseLogUtil.b("HiH_SyncDataPushReceiver", "HealthLifeModel syncData failed");
        }
        SyncCloudUtils.e(0, 20000, 0);
        LogUtil.a("SyncDataPushReceiver", "cloudSync finished, time cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: loaded from: classes30.dex */
    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.d("SyncDataPushReceiver", "enter syncBroadcastReceiver");
            if (intent == null) {
                ReleaseLogUtil.d("HiH_SyncDataPushReceiver", "onReceive intent is null");
                return;
            }
            if ("com.huawei.hihealth.action_sync".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
                ReleaseLogUtil.c("HiH_SyncDataPushReceiver", "action sync status = ", Integer.valueOf(intExtra));
                if (intExtra == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SyncCloudUtils.c(jCurrentTimeMillis);
                    SharedPreferenceManager.e(context, Integer.toString(10000), "last_sync_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
                    gsy.this.a();
                }
            }
        }
    }
}
