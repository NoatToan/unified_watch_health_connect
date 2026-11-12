package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dmw {
    private static dmw e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f32032a;
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: dmw.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("HonorDeviceModelListData", "sConnectStateChangedReceiver intent is null");
                return;
            }
            LogUtil.b("HonorDeviceModelListData", "sConnectStateChangedReceiver action: ", intent.getAction());
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                dmw.this.a();
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32031c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f32030b = {"Aragorn-B19", "Aragorn-B29", "Aragorn-B39", "Aragorn-B59", "Crius-B59", "Crius-B39", "Hes-B39", "Hes-B59", "Minos-B39", "Hebe-B39", "Kanon-B39"};

    private dmw() {
        BroadcastManagerUtil.c(BaseApplication.b(), this.d, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), clx.e, null);
        this.f32032a = b();
    }

    public static dmw c() {
        dmw dmwVar;
        synchronized (f32031c) {
            if (e == null) {
                e = new dmw();
            }
            dmwVar = e;
        }
        return dmwVar;
    }

    public List<String> e() {
        return this.f32032a;
    }

    public void a() {
        LogUtil.b("HonorDeviceModelListData", "updateModelList");
        ThreadPoolManager.c().a("HonorDeviceModelListData", new Runnable() { // from class: dmw.2
            @Override // java.lang.Runnable
            public void run() {
                dmw dmwVar = dmw.this;
                dmwVar.f32032a = dmwVar.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> b() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f32030b));
        String strE = cpk.e("honor_device_model_list", "");
        if (!TextUtils.isEmpty(strE)) {
            String[] strArrSplit = strE.split(";");
            if (strArrSplit.length != 0) {
                arrayList.addAll(Arrays.asList(strArrSplit));
            }
        }
        LogUtil.b("HonorDeviceModelListData", "currentModelList: ", arrayList);
        return arrayList;
    }
}
