package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.SyncDataManager;
import com.huawei.ui.thirdpartservice.syncdata.receiver.SyncBroadcastReceiver;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f52657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f52658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f52659c;
    private List<Integer> d;
    private volatile boolean e;
    private SyncDataManager f;
    private SyncBroadcastReceiver j;

    private xan() {
        this.f52657a = false;
        this.e = false;
        this.f52658b = new c(Looper.getMainLooper(), this);
    }

    public static xan a() {
        return e.d;
    }

    public void c() {
        ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "Start SyncData");
        this.f52658b.sendEmptyMessage(512);
    }

    public void b() {
        d();
        c();
    }

    public void d() {
        if (this.j == null) {
            ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "registerSyncDataToThirdPart");
            this.j = new SyncBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.account.login");
            intentFilter.addAction("com.huawei.sync_activity_to_third_platform");
            LocalBroadcastManager.getInstance().registerReceiver(this.j, intentFilter);
        }
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(1, new HiSubscribeListener() { // from class: xan.5
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                LogUtil.a("SyncDataToThirdPartManager", "onResult successList= ", list, "failList= ", list2);
                xan.this.d = list;
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "SportHiSubscribeListener onChange type= ", i + " changeKey= " + str);
                xan.a().c();
            }
        });
    }

    public void e() {
        if (this.j != null) {
            ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "unregisterSyncDataToThirdPart");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.j);
            this.j = null;
        }
        HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!Utils.f()) {
            ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "No Login");
        } else {
            if (!CommonUtil.ab(BaseApplication.b())) {
                ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "No network!");
                return;
            }
            ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "Start SyncDataToThirdPartManager!");
            i();
            g();
        }
    }

    private void i() {
        if (this.f == null) {
            LogUtil.a("SyncDataToThirdPartManager", "prepare SyncDataToThirdPartManager!");
            this.f = new SyncDataManager(BaseApplication.b(), new SyncDataManager.SyncStatusListener() { // from class: xan.1
                @Override // com.huawei.ui.thirdpartservice.syncdata.SyncDataManager.SyncStatusListener
                public void endSyncData() {
                    LogUtil.a("SyncDataToThirdPartManager", "SyncDataManager endSyncData!");
                    xan.this.f52658b.sendEmptyMessage(HealthData.TIMELINE);
                }
            });
            this.f52659c = new a(this.f52658b);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.account.logout");
            LocalBroadcastManager.getInstance().registerReceiver(this.f52659c, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ReleaseLogUtil.d("SyncDataToThirdPartManager", "release SyncDataToThirdPartManager!", Boolean.valueOf(this.f != null));
        if (this.f != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f52659c);
            this.f52659c = null;
            this.f.d();
            this.f = null;
        }
        this.f52657a = false;
        this.e = false;
    }

    private void g() {
        if (this.e) {
            LogUtil.j("SyncDataToThirdPartManager", "mIsPendingSync!");
            return;
        }
        if (this.f52657a) {
            LogUtil.a("SyncDataToThirdPartManager", "In sync!");
            this.e = true;
        } else {
            LogUtil.a("SyncDataToThirdPartManager", "startSync!");
            this.f52657a = true;
            this.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!Utils.f()) {
            h();
        } else {
            if (this.e) {
                LogUtil.a("SyncDataToThirdPartManager", "start pending sync!");
                this.e = false;
                this.f.c();
                return;
            }
            this.f52658b.sendEmptyMessage(256);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        SyncDataManager syncDataManager;
        LogUtil.a("SyncDataToThirdPartManager", "User logout");
        if (this.f52657a && (syncDataManager = this.f) != null) {
            syncDataManager.e();
        }
        h();
    }

    static class c extends BaseHandler<xan> {
        private c(Looper looper, xan xanVar) {
            super(looper, xanVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(xan xanVar, Message message) {
            ReleaseLogUtil.d("R_SyncDataToThirdPartManager", "handleMessageWhenReferenceNotNull :", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 256) {
                xanVar.h();
                return;
            }
            if (i == 512) {
                xanVar.k();
            } else if (i == 768) {
                xanVar.f();
            } else {
                if (i != 1024) {
                    return;
                }
                xanVar.j();
            }
        }
    }

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<c> f52661c;

        private a(c cVar) {
            this.f52661c = new WeakReference<>(cVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar;
            if (!"com.huawei.plugin.account.logout".equals(intent.getAction()) || (cVar = this.f52661c.get()) == null) {
                return;
            }
            cVar.sendEmptyMessage(1024);
        }
    }

    static class e {
        private static final xan d = new xan();
    }
}
