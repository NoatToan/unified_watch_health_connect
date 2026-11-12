package com.huawei.threecircle.manager;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.lua;
import defpackage.njy;
import defpackage.npt;
import defpackage.qhq;
import defpackage.qqt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class WheelChairStateManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile WheelChairStateManager f23181c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<SwitchStateListener> f23182a = new CopyOnWriteArrayList();
    private List<Integer> e = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23183b = f();

    public interface SwitchStateListener {
        void onSwitchStateChanged(boolean z);
    }

    public static WheelChairStateManager a() {
        WheelChairStateManager wheelChairStateManager;
        synchronized (WheelChairStateManager.class) {
            if (f23181c == null) {
                synchronized (d) {
                    if (f23181c == null) {
                        ReleaseLogUtil.d("WheelChairStateManager", "getInstance()");
                        f23181c = new WheelChairStateManager();
                    }
                }
            }
            wheelChairStateManager = f23181c;
        }
        return wheelChairStateManager;
    }

    public void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: qhi
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    public /* synthetic */ void e() {
        h();
        j();
    }

    public boolean d() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isCanadaCountry()) {
            return false;
        }
        if (LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).isBrowseMode()) {
            ReleaseLogUtil.d("WheelChairStateManager", "isSwitchOn() isBrowseMode");
            return false;
        }
        return this.f23183b;
    }

    private void f(boolean z) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isCanadaCountry()) {
            this.f23183b = false;
        } else {
            this.f23183b = z;
        }
        b(this.f23183b);
        e(this.f23183b);
    }

    public void b(SwitchStateListener switchStateListener) {
        if (switchStateListener == null || this.f23182a.contains(switchStateListener)) {
            return;
        }
        this.f23182a.add(switchStateListener);
    }

    public void c(SwitchStateListener switchStateListener) {
        if (njy.e(this.f23182a)) {
            LogUtil.a("WheelChairStateManager", "removeListener listeners empty");
        } else {
            this.f23182a.remove(switchStateListener);
        }
    }

    private void g() {
        if (njy.e(this.f23182a)) {
            LogUtil.a("WheelChairStateManager", "removeAllListener listeners empty");
        } else {
            this.f23182a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(final boolean z) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: qhj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46234c.b(z);
                }
            });
            return;
        }
        Iterator<SwitchStateListener> it = this.f23182a.iterator();
        while (it.hasNext()) {
            it.next().onSwitchStateChanged(z);
        }
    }

    public void j() {
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).subscribeHiHealthData(103, new e(this));
    }

    /* JADX INFO: loaded from: classes15.dex */
    static final class e implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<WheelChairStateManager> f23184a;

        e(WheelChairStateManager wheelChairStateManager) {
            this.f23184a = new WeakReference<>(wheelChairStateManager);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            ReleaseLogUtil.d("R_WheelChairStateManager", "SampleConfigData onResult");
            WheelChairStateManager wheelChairStateManager = this.f23184a.get();
            if (wheelChairStateManager == null) {
                ReleaseLogUtil.e("R_WheelChairStateManager", "SampleConfigData onResult manager == null");
            } else if (njy.b(list)) {
                if (wheelChairStateManager.e == null) {
                    wheelChairStateManager.e = new ArrayList();
                }
                wheelChairStateManager.e.addAll(list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            WheelChairStateManager wheelChairStateManager = this.f23184a.get();
            LogUtil.a("WheelChairStateManager", "changeKey:", str);
            if (wheelChairStateManager == null) {
                ReleaseLogUtil.e("R_WheelChairStateManager", "SampleConfigData onChange manager == null");
            } else if ("900500039".equals(str)) {
                wheelChairStateManager.h();
            } else {
                LogUtil.a("WheelChairStateManager", "mConfigMap not containsKey");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900500039");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: com.huawei.threecircle.manager.WheelChairStateManager.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_WheelChairStateManager", npt.d("onResult errorCode: ", Integer.valueOf(i), ", data: ", obj));
                if (WheelChairStateManager.b(obj)) {
                    WheelChairStateManager.this.a((HiSampleConfig) ((List) obj).get(0));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiSampleConfig hiSampleConfig) {
        if (hiSampleConfig != null) {
            try {
                f("1".equals(new JSONObject(hiSampleConfig.getConfigData()).getString("wheelchairSwitch")));
            } catch (JSONException e2) {
                ReleaseLogUtil.d("R_WheelChairStateManager", "WheelChairSender JSONException:", ExceptionUtils.c(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Object obj) {
        if (!njy.b(obj, HiSampleConfig.class)) {
            ReleaseLogUtil.e("R_WheelChairStateManager", "list getSampleConfigData isListTypeMatch false ");
            return false;
        }
        if (!njy.e((List) obj)) {
            return true;
        }
        ReleaseLogUtil.e("R_WheelChairStateManager", "list getSampleConfigData list is empty ");
        return false;
    }

    public static void b() {
        ReleaseLogUtil.d("R_WheelChairStateManager", "releaseMgr");
        synchronized (d) {
            if (f23181c == null) {
                ReleaseLogUtil.d("R_WheelChairStateManager", "sInstance is null");
                return;
            }
            f23181c.i();
            f23181c.g();
            f23181c = null;
        }
    }

    public void i() {
        if (njy.b(this.e)) {
            ReleaseLogUtil.d("WheelChairStateManager", "unregisterSubscribeListener");
            HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).unSubscribeHiHealthData(this.e, new HiUnSubscribeListener() { // from class: qhk
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("WheelChairStateManager", "unregisterSubscribeListener isSuccess = ", Boolean.valueOf(z));
                }
            });
        }
    }

    public static void a(final boolean z) {
        d dVar = new d();
        dVar.a(z ? "1" : "0");
        qhq.d("9005", "900500039", qqt.b(dVar), new HiDataOperateListener() { // from class: qhh
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                ReleaseLogUtil.d("WheelChairStateManager", "changWheelStatus errorCode:", Integer.valueOf(i), "isOn:", Boolean.valueOf(z));
            }
        }, System.currentTimeMillis());
    }

    private static void e(boolean z) {
        lua.d(String.valueOf(10000), "WHEEL_CHAIR_MODEL_STATE_SP", z);
    }

    private static boolean f() {
        return lua.a(String.valueOf(10000), "WHEEL_CHAIR_MODEL_STATE_SP", false);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class d implements Serializable {

        @SerializedName("wheelchairSwitch")
        private String e;

        public void a(String str) {
            this.e = str;
        }
    }
}
