package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.provider.HealthFaDataExtendHelper;
import com.huawei.health.provider.HealthFaSportTrackHelper;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f35969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f35970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f35971c;
    private static boolean d;
    private static a e;
    private static final List<Integer> h;
    private static List<Integer> i;

    static {
        ArrayList arrayList = new ArrayList();
        h = arrayList;
        f35969a = false;
        d = false;
        f35971c = false;
        arrayList.add(4);
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class e implements HiSubscribeListener {
        e() {
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a("HealthFaProvider", "onResult successList= ", list, "failList= ", list2);
                boolean unused = gsa.d = true;
                List unused2 = gsa.i = list;
            } else {
                LogUtil.e("HealthFaProvider", "onResult SportHiSubscribeListener fail.");
                boolean unused3 = gsa.d = false;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("HealthFaProvider", "SportHiSubscribeListener onChange type= ", i + " changeKey= " + str);
            if (i == 4 && ArkUIXConstants.INSERT.equals(str)) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: gsf
                    @Override // java.lang.Runnable
                    public final void run() {
                        HealthFaSportTrackHelper.a().e(new HealthFaSportTrackHelper.ISportTrackCallback() { // from class: grz
                            @Override // com.huawei.health.provider.HealthFaSportTrackHelper.ISportTrackCallback
                            public final void onResponse(Object obj) {
                                gsa.e.d(obj);
                            }
                        });
                    }
                });
            }
        }

        static /* synthetic */ void d(Object obj) {
            HealthFaDataExtendHelper.d().d(obj);
            etr.d().j();
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("HealthFaProvider", "AccountStatusReceiver intent is null");
                return;
            }
            try {
                if ("com.huawei.hihealth.action_account_login_datas_switch_finish".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("account_switch_status", 0);
                    LogUtil.a("HealthFaProvider", "AccountStatusReceiver onReceive,", Integer.valueOf(intExtra));
                    if (intExtra != 0 || gsa.d) {
                        return;
                    }
                    HiHealthNativeApi.a(context).subscribeHiHealthData(gsa.h, new e());
                }
            } catch (BadParcelableException unused) {
                LogUtil.e("HealthFaProvider", "catch BadParcelableException");
            }
        }
    }

    public static void e(Context context) {
        HiHealthNativeApi.a(context).subscribeHiHealthData(h, new e());
        d(context);
        f35970b = new b();
        IntentFilter intentFilter = new IntentFilter("com.huawei.hihealth.action_account_login_datas_switch_finish");
        intentFilter.addAction("com.huawei.hihealth.action_account_login_datas_switch_finish");
        BroadcastManagerUtil.d(context, f35970b, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
        f35971c = true;
    }

    public static void b(Context context) {
        HiHealthNativeApi.a(context).unSubscribeHiHealthData(i, new HiUnSubscribeListener() { // from class: gsb
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z) {
                LogUtil.a("HealthFaProvider", "unRegisterHealthData isSuccess:", Boolean.valueOf(z));
            }
        });
        a(context);
        if (f35970b == null || !f35971c) {
            return;
        }
        LogUtil.j("HealthFaProvider", "unregisterReceiver AccountStatusReceiver");
        try {
            BaseApplication.getContext().unregisterReceiver(f35970b);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HealthFaProvider", "unregisterSportData IllegalArgumentException");
        }
        f35970b = null;
        f35971c = false;
    }

    private static void d(Context context) {
        LogUtil.a("HealthFaProvider", "registerFaClickBroadcast enter");
        e = new a();
        BroadcastManagerUtil.d(context, e, new IntentFilter("com.huawei.health.action.ACTION_FA_CLICK"), LocalBroadcast.f36595c, null);
        f35969a = true;
    }

    private static void a(Context context) {
        LogUtil.a("HealthFaProvider", "unRegisterFaClickBroadcast enter");
        if (e == null || !f35969a) {
            return;
        }
        try {
            BroadcastManagerUtil.b(context, e);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HealthFaProvider", "unRegisterFaClickBroadcast IllegalArgumentException");
        }
        e = null;
        f35969a = false;
    }

    /* JADX INFO: loaded from: classes8.dex */
    static final class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HealthFaProvider", "FaClickReceiver intent is null");
                return;
            }
            try {
                if ("com.huawei.health.action.ACTION_FA_CLICK".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("scene_id");
                    LogUtil.a("HealthFaProvider", "FaClickReceiver onReceive sceneCode :", stringExtra);
                    HealthFaDataExtendHelper.d().d(stringExtra);
                    etr.d().j();
                }
            } catch (BadParcelableException unused) {
                LogUtil.e("HealthFaProvider", "catch BadParcelableException");
            }
        }
    }
}
