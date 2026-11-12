package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vgx extends EngineLogicBaseManager {
    private static volatile vgx e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f51086b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f51085c = Arrays.asList("CN", "DE", "IT");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vhi f51084a = new vhi(k.b.m, 36000, 0);

    private vgx() {
        super(BaseApplication.getContext());
        this.f51086b = new BroadcastReceiver() { // from class: vgx.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action == null) {
                    LogUtil.j("FastingLiteDeviceManager", "action == null");
                } else if ("android.intent.action.TIME_SET".equals(action)) {
                    LogUtil.a("FastingLiteDeviceManager", "curTime", Long.valueOf(System.currentTimeMillis()));
                    vgx.this.b("fromTimeSet", null);
                }
            }
        };
        LogUtil.a("FastingLiteDeviceManager", "FastingLiteDeviceManager init");
        registerNotificationAction();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        BaseApplication.getContext().registerReceiver(this.f51086b, intentFilter, LocalBroadcast.f36595c, null);
        e("init", null);
    }

    public static vgx d() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new vgx();
                }
            }
        }
        return e;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.FASTING_LITE_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.ohos.fastinglite";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "com.huawei.ohos.fastinglite_BIb2XuytBs7qSFJ/NqCPA/GoxtGMY4FM9QgucHV2IAutlvlmEqDiiSvWhK2kJhF5904rA6WQv2BTrEh0BN5TUNA=";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        if (xiuVar == null) {
            LogUtil.j("FastingLiteDeviceManager", "data is null");
        } else if (xiuVar.c() == 2) {
            d(xiuVar.e());
        } else {
            a(xiuVar.b());
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("FastingLiteDeviceManager", "connectState ", connectState);
        if (connectState == ConnectState.CONNECTED) {
            LogUtil.a("FastingLiteDeviceManager", "onDeviceConnected");
            b("fromDeviceConnect", null);
        }
    }

    private void d(final File file) {
        LogUtil.a("FastingLiteDeviceManager", "batchRecordBiData enter");
        if (file == null) {
            LogUtil.a("FastingLiteDeviceManager", "batchRecordBiData file is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vgz
                @Override // java.lang.Runnable
                public final void run() {
                    vgx.b(file);
                }
            });
        }
    }

    static /* synthetic */ void b(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 1024);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        vgy vgyVar = (vgy) HiJsonUtil.d(line, vgy.class);
                        LogUtil.d("FastingLiteDeviceManager", "biMetaData：", line);
                        lmf.d().c(BaseApplication.getContext(), vgyVar.e(), vgyVar.c(), 0);
                    } else {
                        bufferedReader.close();
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                LogUtil.j("FastingLiteDeviceManager", "batchRecordBiData FileNotFoundException.");
            }
        } catch (FileNotFoundException unused) {
            LogUtil.j("FastingLiteDeviceManager", "batchRecordBiData FileNotFoundException.");
        } catch (IOException unused2) {
            LogUtil.j("FastingLiteDeviceManager", "batchRecordBiData IOException.");
        }
    }

    private void a(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, StandardCharsets.UTF_8);
        } catch (UnsupportedOperationException unused) {
            LogUtil.j("FastingLiteDeviceManager", "handleMessage UnsupportedOperationException!");
            str = "";
        }
        LogUtil.a("FastingLiteDeviceManager", "handleMessage, json: ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("FastingLiteDeviceManager", "handleMessage, json is empty ");
            return;
        }
        if ("Sync".equals(str)) {
            b("fromWatch", null);
            return;
        }
        try {
            vhe vheVar = (vhe) HiJsonUtil.d(str, vhe.class);
            int iB = vheVar.b();
            boolean zE = vheVar.e();
            LogUtil.a("FastingLiteDeviceManager", "version = ", Integer.valueOf(iB), ",needSync = ", Boolean.valueOf(zE));
            if (zE) {
                b("fromWatch", null);
            }
            List<vgy> listA = vheVar.a();
            if (listA == null) {
                LogUtil.j("FastingLiteDeviceManager", "biMetaDataList is empty");
                return;
            }
            for (vgy vgyVar : listA) {
                lmf.d().c(BaseApplication.getContext(), vgyVar.e(), vgyVar.c(), 0);
                LogUtil.d("FastingLiteDeviceManager", "eventId:", vgyVar.e(), ",biMap:", vgyVar.c());
            }
        } catch (JsonSyntaxException e2) {
            LogUtil.j("FastingLiteDeviceManager", "handleMessage JsonSyntaxException, e is ", e2.getMessage());
        }
    }

    private boolean a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        LogUtil.a("FastingLiteDeviceManager", "country:", accountInfo);
        return f51085c.contains(accountInfo);
    }

    public void b(String str, final SendCallback sendCallback) {
        if (!a()) {
            LogUtil.a("FastingLiteDeviceManager", "current country is not support fasting lite");
        } else {
            LogUtil.a("FastingLiteDeviceManager", "sendFastingLitePlan, fromType : ", str);
            pingComand(new PingCallback() { // from class: vhd
                @Override // com.huawei.health.deviceconnect.callback.PingCallback
                public final void onPingResult(int i) {
                    this.d.a(sendCallback, i);
                }
            }, "com.huawei.ohos.fastinglite");
        }
    }

    /* synthetic */ void a(SendCallback sendCallback, int i) {
        LogUtil.a("FastingLiteDeviceManager", "onPingResult code = ", Integer.valueOf(i));
        if (i == 202) {
            e("", sendCallback);
        }
    }

    public void e(final String str, final SendCallback sendCallback) {
        if (!a()) {
            LogUtil.a("FastingLiteDeviceManager", "current country is not support fasting lite");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("FastingLiteDeviceManager", "sendPlanWithoutPing, fromType : ", str);
        }
        ThreadPoolManager.c().b("FastingLiteDeviceManager", new Runnable() { // from class: vhf
            @Override // java.lang.Runnable
            public final void run() {
                this.f51094a.d(sendCallback, str);
            }
        });
    }

    /* synthetic */ void d(SendCallback sendCallback, String str) {
        e(HiJsonUtil.d(b()), sendCallback, str);
    }

    private vhh b() {
        vhh vhhVar = new vhh();
        vgp vgpVarB = vhn.b();
        if (vgpVarB == null || !vgpVarB.c() || vgpVarB.d() == null) {
            vhhVar.e(f51084a);
            return vhhVar;
        }
        vhhVar.e(vgpVarB.d().d());
        vhhVar.d(uxb.c().h());
        return vhhVar;
    }

    private void e(String str, SendCallback sendCallback, String str2) {
        xiu xiuVarC = new xiu.c().a(str.getBytes(StandardCharsets.UTF_8)).c();
        LogUtil.a("FastingLiteDeviceManager", "sendCommand json = ", str, " ,fromType = ", str2);
        if (sendCallback != null) {
            sendComand(xiuVarC, sendCallback);
        } else {
            sendComand(xiuVarC, new SendCallback() { // from class: vgx.3
                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendResult(int i) {
                    if (i == 206) {
                        LogUtil.j("FastingLiteDeviceManager", "sendCommand fail");
                    } else if (i != 207) {
                        LogUtil.j("FastingLiteDeviceManager", "sendCommand other Result =", Integer.valueOf(i));
                    } else {
                        LogUtil.a("FastingLiteDeviceManager", "sendCommand success");
                    }
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendProgress(long j) {
                    LogUtil.a("FastingLiteDeviceManager", "onSendProgress=", Long.valueOf(j));
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onFileTransferReport(String str3) {
                    LogUtil.a("FastingLiteDeviceManager", "onFileTransferReport transferWay: ", str3);
                }
            });
        }
    }

    public static void c() {
        ReleaseLogUtil.c("FastingLiteDeviceManager", "resetFastingLiteDeviceManager");
        synchronized (d) {
            if (e == null) {
                ReleaseLogUtil.d("FastingLiteDeviceManager", "resetFastingLiteDeviceManager sInstance is null");
                return;
            }
            e.onDestroy();
            BaseApplication.getContext().unregisterReceiver(e.f51086b);
            ThreadPoolManager.c().c("FastingLiteDeviceManager", null);
            e = null;
        }
    }
}
