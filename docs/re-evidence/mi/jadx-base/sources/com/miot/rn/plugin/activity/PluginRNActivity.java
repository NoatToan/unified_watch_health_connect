package com.miot.rn.plugin.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.ReactRootView;
import com.facebook.react.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.miot.rn.plugin.activity.PluginRNActivity;
import com.miot.rn.plugin.rnevent.RNEventReceiver;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.entity.plugin.WearPluginErrorTips;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.constants.MiotNativeModuleConstants;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.RnCallbackHelper;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReport;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.DarkModeCompat;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.common.widget.nestscroll.internal.SimpleAnimatorListener;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginError;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import com.xiaomi.smarthome.server.PluginPackageManager;
import com.xiaomi.smarthome.server.PluginUpdateManager;
import com.xiaomi.smarthome.server.callback.PluginDownloadCallback;
import com.xiaomi.smarthome.server.callback.PluginInstallCallback;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import defpackage.aje;
import defpackage.d0d;
import defpackage.fv5;
import defpackage.lsi;
import defpackage.mvk;
import defpackage.r1i;
import defpackage.svi;
import defpackage.v7r;
import defpackage.x8j;
import defpackage.y8j;
import defpackage.zxc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class PluginRNActivity extends AppCompatActivity implements zxc {
    public static final /* synthetic */ int o = 0;
    public v7r h;
    public FrameLayout i;
    public View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f10205k;
    public BroadcastReceiver l;
    public AtomicBoolean m = new AtomicBoolean(true);
    public fv5 n = new d();

    public class a extends PluginDownloadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f10206a;

        public a(e eVar) {
            this.f10206a = eVar;
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onCancel(String str) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin onCancel(%s)", Thread.currentThread().getName(), str));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onDownInfoSuccess(ArrayList<PluginDownloadTask> arrayList) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin onDownInfoSuccess(%s)", Thread.currentThread().getName(), arrayList));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onFailure(String str, int i) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin onFailure(%s, %s)", Thread.currentThread().getName(), str, Integer.valueOf(i)));
            PluginRNActivity pluginRNActivity = PluginRNActivity.this;
            pluginRNActivity.S(WearPluginErrorTips.getCodeString(pluginRNActivity.getApplicationContext(), i));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onProgress(String str, float f) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin onProgress(%s, %s)", Thread.currentThread().getName(), str, Float.valueOf(f)));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onStart(ArrayList<PluginDownloadTask> arrayList) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin onStart(%s)", Thread.currentThread().getName(), arrayList));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onSuccess(String str) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin onSuccess(%s)", Thread.currentThread().getName(), str));
            e eVar = this.f10206a;
            if (eVar != null) {
                eVar.onSuccess(str);
            }
        }
    }

    public class b implements PluginInstallCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f10208a;

        public b(e eVar) {
            this.f10208a = eVar;
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onCancel(String str) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin->installPlugin onCancel(%s)", Thread.currentThread().getName(), str));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onFailure(String str, int i) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin->installPlugin onFailure(%s, %s)", Thread.currentThread().getName(), str, Integer.valueOf(i)));
            PluginRNActivity pluginRNActivity = PluginRNActivity.this;
            pluginRNActivity.S(WearPluginErrorTips.getCodeString(pluginRNActivity.getApplicationContext(), i));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onStart(String str) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin->installPlugin onStart(%s)", Thread.currentThread().getName(), str));
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onSuccess(String str) {
            MiJiaLog.onlyLogcat("[PluginRNActivity]", String.format("%s downloadPlugin->installPlugin onSuccess(%s)", Thread.currentThread().getName(), str));
            e eVar = this.f10208a;
            if (eVar != null) {
                eVar.onSuccess(str);
            }
        }
    }

    public class c implements x8j.h {

        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public SimpleAnimatorListener f10211a = new C0316a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReactRootView f10212b;

            /* JADX INFO: renamed from: com.miot.rn.plugin.activity.PluginRNActivity$c$a$a, reason: collision with other inner class name */
            public class C0316a extends SimpleAnimatorListener {
                public C0316a() {
                }

                @Override // com.xiaomi.smarthome.library.common.widget.nestscroll.internal.SimpleAnimatorListener, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (PluginRNActivity.this.j != null) {
                        PluginRNActivity.this.i.removeView(PluginRNActivity.this.j);
                    }
                    RnPluginLog.addFrameworkLog("Broadcast:  sendBroadcast ACTION_LAUNCH_PLUGIN_FINISH");
                    a.this.f10212b.setAlpha(1.0f);
                }
            }

            public a(ReactRootView reactRootView) {
                this.f10212b = reactRootView;
            }

            public final /* synthetic */ void b(ReactRootView reactRootView, ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (PluginRNActivity.this.j != null) {
                    PluginRNActivity.this.j.setAlpha(fFloatValue);
                }
                reactRootView.setAlpha((1.0f - fFloatValue) + 0.3f);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int childCount = this.f10212b.getChildCount();
                if (childCount <= 0) {
                    return true;
                }
                RnPluginLog.addFrameworkLog("OnPreDrawListener(), onPreDraw,childCount=" + childCount);
                MiJiaLog.onlyLogcat("PluginStartTime", "onPreDraw  " + childCount);
                this.f10212b.getViewTreeObserver().removeOnPreDrawListener(this);
                if (DarkModeCompat.isDarkMode(PluginRNActivity.this.getApplicationContext())) {
                    PluginRNActivity.this.i.setBackgroundColor(-16777216);
                    if (PluginRNActivity.this.j != null) {
                        PluginRNActivity.this.j.setBackgroundColor(-16777216);
                    }
                } else {
                    PluginRNActivity.this.i.setBackgroundColor(-1);
                    if (PluginRNActivity.this.j != null) {
                        PluginRNActivity.this.j.setBackgroundColor(-1);
                    }
                }
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.3f).setDuration(350L);
                final ReactRootView reactRootView = this.f10212b;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p2i
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f29937a.b(reactRootView, valueAnimator);
                    }
                });
                duration.addListener(this.f10211a);
                duration.start();
                return true;
            }
        }

        public c() {
        }

        @Override // x8j.h
        public void a(ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
            if (reactRootView == null) {
                RnReport.reportOpenPluginError("", PluginError.REACT_VIEW_IS_NULL);
                RnPluginLog.addFrameworkLog("doCreate,registerListener reactView==null");
                return;
            }
            if (reactRootView.getParent() instanceof ViewGroup) {
                ((ViewGroup) reactRootView.getParent()).removeView(reactRootView);
            }
            PluginRNActivity.this.i.addView(reactRootView, 0);
            MiJiaLog.onlyLogcat("PluginStartTime", "onAttachPlugin  " + System.currentTimeMillis());
            reactRootView.setAlpha(0.3f);
            reactRootView.getViewTreeObserver().addOnPreDrawListener(new a(reactRootView));
        }
    }

    public class d implements fv5 {
        public d() {
        }

        @Override // defpackage.fv5
        public void invokeDefaultOnBackPressed() {
            RnPluginLog.i("rn activity... invoke on backpressed");
            try {
                if (PluginRNActivity.this.isDestroyed()) {
                    return;
                }
                PluginRNActivity.super.lambda$onCreate$0();
            } catch (Exception e) {
                RnPluginLog.e("invokeDefaultOnBackPressed error:" + Log.getStackTraceString(e));
            }
        }
    }

    public interface e {
        void onSuccess(String str);
    }

    public static /* synthetic */ void P(String str) {
        PluginUpdateManager.getInstance().downloadPlugin(Collections.singletonList(str), false, null);
    }

    public final void B(int i, int i2, final Intent intent) {
        v7r v7rVar = this.h;
        if (v7rVar != null) {
            com.facebook.react.a instanceManager = v7rVar.getInstanceManager();
            if (instanceManager != null) {
                instanceManager.O(this, i, i2, intent);
            }
            this.h.Y(new x8j.h() { // from class: m2i
                @Override // x8j.h
                public final void a(ReactRootView reactRootView, a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
                    this.f25680a.F(intent, reactRootView, aVar, deviceStat, pluginPackageInfo);
                }
            });
        }
    }

    public final void C(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, RnPluginDeviceInfo rnPluginDeviceInfo, Bundle bundle) {
        this.h.J(deviceStat, pluginPackageInfo, rnPluginDeviceInfo, bundle, true);
        this.h.L(true);
        R();
        this.h.X(this);
        this.h.Y(new c());
        this.m.compareAndSet(true, false);
    }

    public final void D(String str, e eVar) {
        PluginUpdateManager.getInstance().downloadPlugin(Collections.singletonList(str), true, new a(eVar));
    }

    public final void E(String str, e eVar) {
        PluginUpdateManager.getInstance().installPlugin(str, true, new b(eVar));
    }

    public final /* synthetic */ void F(Intent intent, ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        WritableMap writableMapCreateMap;
        MRnLog.i("[PluginRNActivity]", "doActivityResult,onAttachPlugin");
        ReactContext reactContextC = aVar != null ? aVar.C() : null;
        if (reactContextC != null && reactContextC.getCurrentActivity() != this) {
            MRnLog.w("[PluginRNActivity]", "doActivityResult, currentActivity: " + reactContextC.getCurrentActivity() + ", PluginRNActivity.this:" + this + ", so just return");
            return;
        }
        if (intent == null || intent.getExtras() == null) {
            writableMapCreateMap = Arguments.createMap();
        } else {
            try {
                writableMapCreateMap = Arguments.fromBundle(intent.getExtras());
            } catch (IllegalArgumentException e2) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                MiJiaLog.onlyLogcat("PluginRNActivity", e2.toString());
                writableMapCreateMap = writableMapCreateMap2;
            }
        }
        writableMapCreateMap.putString(i.d, "packageViewWillAppear_36621");
        if (reactContextC != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextC.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("packageViewWillAppear_36621", writableMapCreateMap);
        } else {
            RnPluginLog.addFrameworkLog("PluginRnActivity-->doActivityResult-->onAttachPlugin RNEventReceiver.VIEWWILLAPPEAR  reactContext is null...");
        }
    }

    public final /* synthetic */ void G() {
        this.m.compareAndSet(true, false);
    }

    public final /* synthetic */ void H(ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        MRnLog.i("[PluginRNActivity]", "doDestroy,onAttachPlugin");
        ReactContext reactContextC = aVar.C();
        if (reactContextC != null && reactContextC.getCurrentActivity() != this) {
            MRnLog.w("[PluginRNActivity]", "doDestroy, currentActivity: " + reactContextC.getCurrentActivity() + ", PluginRNActivity.this:" + this + ", so just return");
            return;
        }
        if (reactRootView.getParent() instanceof ViewGroup) {
            ((ViewGroup) reactRootView.getParent()).removeView(reactRootView);
        }
        if (reactContextC != null) {
            MRnLog.i("[PluginRNActivity]", "doDestroy,unmountReactApplication");
            reactRootView.q();
        }
        aVar.R(this);
        aVar.z();
        RnCallbackHelper.getInstance().clear();
    }

    public final /* synthetic */ void I(ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        MRnLog.i("[PluginRNActivity]", "doPause,onAttachPlugin");
        ReactContext reactContextC = aVar != null ? aVar.C() : null;
        if (reactContextC != null && reactContextC.getCurrentActivity() != this) {
            MRnLog.w("[PluginRNActivity]", "doPause, currentActivity: " + reactContextC.getCurrentActivity() + ", PluginRNActivity.this:" + this + ", so just return");
            return;
        }
        if (aVar.F() == LifecycleState.RESUMED) {
            try {
                aVar.T(this);
            } catch (Exception unused) {
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(i.d, "packageWillPause_36621");
            if (reactContextC != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextC.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("packageWillPause_36621", writableMapCreateMap);
            } else {
                RnPluginLog.addFrameworkLog("PluginRnActivity-->doPause-->onAttachPlugin reactContext is null...");
            }
        }
    }

    public final /* synthetic */ void J(ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        if (aVar == null || aVar.F() == LifecycleState.RESUMED) {
            return;
        }
        RnPluginLog.addFrameworkLog("PluginRNActivity doResume  onAttachPlugin...");
        aVar.V(this, this.n);
        ReactContext reactContextC = aVar.C();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(i.d, "packageDidResume_36621");
        if (reactContextC != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextC.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("packageDidResume_36621", writableMapCreateMap);
        } else {
            RnPluginLog.addFrameworkLog("PluginRnActivity-->doResume-->onAttachPlugin reactContext is null...");
        }
    }

    public final /* synthetic */ void K(ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        MRnLog.i("[PluginRNActivity]", "doStop,onAttachPlugin");
        ReactContext reactContextC = aVar != null ? aVar.C() : null;
        if (reactContextC != null && reactContextC.getCurrentActivity() != this) {
            MRnLog.w("[PluginRNActivity]", "doStop, currentActivity: " + reactContextC.getCurrentActivity() + ", PluginRNActivity.this:" + this + ", so just return");
            return;
        }
        if (aVar == null || aVar.F() == LifecycleState.RESUMED) {
            return;
        }
        MRnLog.i("[PluginRNActivity]", "PluginRNActivity doOnStop  onAttachPlugin...");
        if (reactContextC == null) {
            RnPluginLog.addFrameworkLog("PluginRnActivity-->doResume-->onAttachPlugin reactContext is null...");
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(i.d, "packageWillStop_36621");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextC.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("packageWillStop_36621", writableMapCreateMap);
    }

    public final /* synthetic */ void L(DeviceStat deviceStat, RnPluginDeviceInfo rnPluginDeviceInfo, Intent intent, String str) {
        C(deviceStat, PluginPackageManager.getInstance().getInstallPackageInfo(deviceStat.model), rnPluginDeviceInfo, intent.getExtras());
    }

    public final /* synthetic */ void M(final DeviceStat deviceStat, final RnPluginDeviceInfo rnPluginDeviceInfo, final Intent intent, String str) {
        E(str, new e() { // from class: e2i
            @Override // com.miot.rn.plugin.activity.PluginRNActivity.e
            public final void onSuccess(String str2) {
                this.f16194a.L(deviceStat, rnPluginDeviceInfo, intent, str2);
            }
        });
    }

    public final /* synthetic */ void N(DeviceStat deviceStat, RnPluginDeviceInfo rnPluginDeviceInfo, Intent intent, String str) {
        C(deviceStat, PluginPackageManager.getInstance().getInstallPackageInfo(deviceStat.model), rnPluginDeviceInfo, intent.getExtras());
    }

    public final /* synthetic */ void O(DeviceStat deviceStat, RnPluginDeviceInfo rnPluginDeviceInfo, Intent intent, String str) {
        C(deviceStat, PluginPackageManager.getInstance().getInstallPackageInfo(deviceStat.model), rnPluginDeviceInfo, intent.getExtras());
    }

    public final void Q() {
        final Intent intent = getIntent();
        if (intent != null) {
            final DeviceStat deviceStat = (DeviceStat) intent.getParcelableExtra("deviceStat");
            if (deviceStat != null) {
                final RnPluginDeviceInfo rnPluginDeviceInfoB = r1i.b(deviceStat.model);
                PluginPackageInfo installPackageInfo = PluginPackageManager.getInstance().getInstallPackageInfo(deviceStat.model);
                PluginPackageInfo downloadPackageInfo = PluginPackageManager.getInstance().getDownloadPackageInfo(deviceStat.model);
                if (downloadPackageInfo == null && installPackageInfo == null) {
                    D(deviceStat.model, new e() { // from class: n2i
                        @Override // com.miot.rn.plugin.activity.PluginRNActivity.e
                        public final void onSuccess(String str) {
                            this.f27481a.M(deviceStat, rnPluginDeviceInfoB, intent, str);
                        }
                    });
                    return;
                }
                if (downloadPackageInfo != null && installPackageInfo == null) {
                    E(deviceStat.model, new e() { // from class: o2i
                        @Override // com.miot.rn.plugin.activity.PluginRNActivity.e
                        public final void onSuccess(String str) {
                            this.f28674a.N(deviceStat, rnPluginDeviceInfoB, intent, str);
                        }
                    });
                } else if (downloadPackageInfo == null || downloadPackageInfo.getPackageId() == installPackageInfo.getPackageId()) {
                    C(deviceStat, installPackageInfo, rnPluginDeviceInfoB, intent.getExtras());
                } else {
                    E(deviceStat.model, new e() { // from class: d2i
                        @Override // com.miot.rn.plugin.activity.PluginRNActivity.e
                        public final void onSuccess(String str) {
                            this.f14996a.O(deviceStat, rnPluginDeviceInfoB, intent, str);
                        }
                    });
                }
                T(deviceStat.model);
            }
        } else {
            S("illegal parameter");
        }
        this.m.compareAndSet(true, false);
    }

    public final void R() {
        this.l = new RNEventReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.more.rename.notify");
        intentFilter.addAction(MiotNativeModuleConstants.STARTSCAN_CALLBACK);
        intentFilter.addAction(MiotNativeModuleConstants.DISCOVERSERVICES_CALLBACK);
        intentFilter.addAction(MiotNativeModuleConstants.DISCOVERCHARACTERISTICS_CALLBACK);
        intentFilter.addAction(MiotNativeModuleConstants.DEVICESTATUSCHANGED);
        aje.b(this).c(this.l, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("action.more.rename.notify");
        intentFilter2.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter2.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
        intentFilter2.addAction("com.xiaomi.smarthome.bluetooth.character_changed");
        intentFilter2.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter2.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter2.addAction(BluetoothConstants.ACTION_DEVICE_STATUS_CHANGED);
        intentFilter2.addAction(BluetoothConstants.ACTION_FIRMWARE_HAS_NEW_VERSION);
        intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter2.addAction("com.xiaomi.smarthome.ble.spec.notify");
        intentFilter2.addAction(MiotNativeModuleConstants.DEVICE_PINCODE_SWITCH_CHANGED);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.l, intentFilter2, 2);
        } else {
            registerReceiver(this.l, intentFilter2);
        }
    }

    public final void S(String str) {
        ToastUtil.show(this, str);
    }

    public final void T(final String str) {
        this.f10205k.post(new Runnable() { // from class: f2i
            @Override // java.lang.Runnable
            public final void run() {
                PluginRNActivity.P(str);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RnCallbackHelper.getInstance().onActivityResult(i2, i, intent);
        B(i, i2, intent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed, reason: merged with bridge method [inline-methods] */
    public void lambda$onCreate$0() {
        RnPluginLog.addFrameworkLog("rn activity... onBackPressed");
        if (this.m.get()) {
            return;
        }
        com.facebook.react.a instanceManager = this.h.getInstanceManager();
        if (instanceManager == null || instanceManager.C() == null || !instanceManager.C().hasActiveCatalystInstance()) {
            super.lambda$onCreate$0();
        } else {
            instanceManager.P();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(svi.f34035a);
        Window window = getWindow();
        window.addFlags(67108864);
        DarkModeCompat.isDarkMode(getApplicationContext());
        window.getDecorView().setSystemUiVisibility(9472);
        this.i = (FrameLayout) findViewById(lsi.f25401b);
        String stringExtra = getIntent().getStringExtra("deviceName");
        d0d d0dVarH = mvk.e().h();
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "unknown";
        }
        View loadingRNView = d0dVarH.getLoadingRNView(stringExtra, "SubTitle", new d0d.a() { // from class: h2i
            @Override // d0d.a
            public final void a() {
                this.f19614a.lambda$onCreate$0();
            }
        });
        this.j = loadingRNView;
        if (loadingRNView != null) {
            this.i.addView(loadingRNView, 0);
        }
        RnPluginLog.addFrameworkLog("========== 进入插件 ============");
        this.h = new v7r();
        y8j.a().b(this.h);
        this.h.H();
        this.i.postDelayed(new Runnable() { // from class: i2i
            @Override // java.lang.Runnable
            public final void run() {
                this.f20703a.Q();
            }
        }, 1000L);
        this.i.postDelayed(new Runnable() { // from class: j2i
            @Override // java.lang.Runnable
            public final void run() {
                this.f22356a.G();
            }
        }, 5000L);
        HandlerThread handlerThread = new HandlerThread("worker");
        handlerThread.start();
        this.f10205k = new Handler(handlerThread.getLooper());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RnPluginLog.addFrameworkLog("================= 退出插件 ======================");
        RnPluginLog.addFrameworkLog("PluginRNActivity-->onDestroy..." + this);
        v7r v7rVar = this.h;
        if (v7rVar != null) {
            v7rVar.Y(new x8j.h() { // from class: k2i
                @Override // x8j.h
                public final void a(ReactRootView reactRootView, a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
                    this.f23364a.H(reactRootView, aVar, deviceStat, pluginPackageInfo);
                }
            });
        }
        BroadcastReceiver broadcastReceiver = this.l;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            aje.b(this).e(this.l);
            this.l = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        v7r v7rVar = this.h;
        if (v7rVar != null) {
            v7rVar.Y(new x8j.h() { // from class: l2i
                @Override // x8j.h
                public final void a(ReactRootView reactRootView, a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
                    this.f24569a.I(reactRootView, aVar, deviceStat, pluginPackageInfo);
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        v7r v7rVar = this.h;
        if (v7rVar != null) {
            com.facebook.react.a instanceManager = v7rVar.getInstanceManager();
            if (instanceManager != null) {
                instanceManager.V(this, this.n);
            }
            this.h.Y(new x8j.h() { // from class: c2i
                @Override // x8j.h
                public final void a(ReactRootView reactRootView, a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
                    this.f4863a.J(reactRootView, aVar, deviceStat, pluginPackageInfo);
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        v7r v7rVar = this.h;
        if (v7rVar != null) {
            v7rVar.Y(new x8j.h() { // from class: g2i
                @Override // x8j.h
                public final void a(ReactRootView reactRootView, a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
                    this.f18502a.K(reactRootView, aVar, deviceStat, pluginPackageInfo);
                }
            });
        }
    }

    @Override // defpackage.zxc
    public void sendEvent(String str, Object obj) {
        v7r v7rVar = this.h;
        if (v7rVar != null) {
            v7rVar.sendEvent(str, obj);
        }
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            i = 0;
        }
        super.startActivityForResult(intent, i, bundle);
    }
}
