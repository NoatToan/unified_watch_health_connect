package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.miot.rn.plugin.debug.PluginErrorInfoActivity;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearancePackage;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReport;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnTracePluginOpen;
import com.xiaomi.smarthome.framework.plugin.rn.utils.PluginUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import com.xiaomi.smarthome.rn.core.bean.RnSdkInfo;
import com.xiaomi.smarthome.server.PluginPackageManager;
import com.xiaomi.smarthome.setting.PluginSetting;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x8j implements IRNRuntime {
    public static int G;
    public static final Thread.UncaughtExceptionHandler H = Thread.getDefaultUncaughtExceptionHandler();
    public String D;
    public Context g;
    public Activity h;
    public Bundle i;
    public RnSdkInfo j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DeviceStat f38851k;
    public String l;
    public String m;
    public PluginPackageInfo n;
    public RnPluginDeviceInfo o;
    public ReactRootView p;
    public com.facebook.react.a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gye f38852r;
    public ArrayList<h> s;
    public gwc t;
    public boolean u;
    public boolean x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38849a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38850b = -1;
    public long c = -1;
    public String d = null;
    public volatile byte e = 0;
    public int f = 0;
    public boolean v = true;
    public boolean w = false;
    public StringBuilder y = new StringBuilder();
    public StringBuilder z = new StringBuilder();
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public final BroadcastReceiver E = new a();
    public fv5 F = new b();

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003a  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b2;
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1513001754) {
                    if (iHashCode != 158859398) {
                        if (iHashCode == 1415192249 && action.equals(PluginPackageConstant.ACTION_DOWNRNSDK)) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (action.equals(AppearanceModule.APPEARANCE_CHANGED_ACTION)) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (action.equals(PluginPackageConstant.ACTION_RN_PLUGIN_SWITCH_CHANGED)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                if (b2 != 0) {
                    if (b2 != 1) {
                        return;
                    }
                    String strColorSchemeForCurrentConfiguration = ColorSchemeHelper.colorSchemeForCurrentConfiguration(x8j.this.g);
                    if (TextUtils.equals(x8j.this.D, strColorSchemeForCurrentConfiguration)) {
                        RnPluginLog.addFrameworkLog("system appearance changed, color scheme still: " + strColorSchemeForCurrentConfiguration);
                        return;
                    }
                    x8j.this.D = strColorSchemeForCurrentConfiguration;
                    RnPluginLog.addFrameworkLog("system appearance changed, color scheme changed to: " + strColorSchemeForCurrentConfiguration);
                    RnPluginLog.addFrameworkLog("receiver broadcast rn sdk will re init, system color scheme changed");
                    x8j.this.c0(true, 3);
                    return;
                }
                long longExtra = intent.getLongExtra(PluginPackageConstant.KEY_RNSDK_API_LEVEL, -1L);
                if (longExtra < x8j.this.f38850b || x8j.this.h != null) {
                    RnPluginLog.addFrameworkLog("receiver broadcast rn sdk can not re init, apiLevel is " + longExtra + " and mLoadedSdkApiLevel is " + x8j.this.f38850b);
                    return;
                }
                RnPluginLog.addFrameworkLog("receiver broadcast rn sdk will re init, apiLevel is " + longExtra + " and mLoadedSdkApiLevel is " + x8j.this.f38850b);
                x8j.this.c0(true, 2);
            }
        }
    }

    public class b implements fv5 {
        public b() {
        }

        @Override // defpackage.fv5
        public void invokeDefaultOnBackPressed() {
            RnPluginLog.i("rn runtime... invoke on backpressed");
            Activity activity = x8j.this.h;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public class c implements Thread.UncaughtExceptionHandler {
        public c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            x8j.this.e = (byte) 3;
            x8j.this.d0();
            x8j.this.y(",exception_plugin_record_null");
            RnPluginLog.addFrameworkLog("ReactInstanceManager init error: " + Log.getStackTraceString(th));
            x8j.this.i0();
            Thread.setDefaultUncaughtExceptionHandler(x8j.H);
        }
    }

    public class d extends JSBundleLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38856a;

        public d(boolean z) {
            this.f38856a = z;
        }

        @Override // com.facebook.react.bridge.JSBundleLoader
        public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) throws Throwable {
            RnPluginLog.addFrameworkLog("1、 will loadScript rn sdk bundle...");
            x8j.this.y(",sdk_load_script_cache");
            x8j x8jVar = x8j.this;
            x8jVar.V(jSBundleLoaderDelegate, x8jVar.j, this.f38856a);
            return "";
        }
    }

    public class e implements com.facebook.react.a.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RnSdkInfo f38859b;
        public final /* synthetic */ DeviceStat c;
        public final /* synthetic */ PluginPackageInfo d;
        public final /* synthetic */ int e;

        public e(boolean z, RnSdkInfo rnSdkInfo, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, int i) {
            this.f38858a = z;
            this.f38859b = rnSdkInfo;
            this.c = deviceStat;
            this.d = pluginPackageInfo;
            this.e = i;
        }

        @Override // com.facebook.react.a.l
        public void onReactContextInitialized(ReactContext reactContext) throws Throwable {
            MRnLog.e("RNRuntime", "wait context over,start load");
            x8j.this.y(",plugin_init_context_wait_ready");
            RnPluginLog.addFrameworkLog("releaseRnPluginInit(),context wait ready,needShow=" + this.f38858a);
            x8j.this.q.e0(this);
            if (this.f38858a || !x8j.this.w) {
                x8j.this.h0(reactContext, this.f38859b, this.f38858a);
                x8j.this.g0(this.c, this.d, this.e, this.f38858a);
            } else {
                x8j.this.y(",plugin_init_context_wait_ready_not_load");
                RnPluginLog.addFrameworkLog("releaseRnPluginInit(),context wait ready not load");
            }
        }
    }

    public class f implements com.facebook.react.a.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DeviceStat f38860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PluginPackageInfo f38861b;

        public f(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
            this.f38860a = deviceStat;
            this.f38861b = pluginPackageInfo;
        }

        @Override // com.facebook.react.a.l
        public void onReactContextInitialized(ReactContext reactContext) throws Throwable {
            x8j.this.A(this.f38860a, this.f38861b);
            PluginSetting.LogTimestamp("runtime plugin ready");
        }
    }

    public class g implements com.facebook.react.a.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeviceStat f38863b;
        public final /* synthetic */ PluginPackageInfo c;
        public final /* synthetic */ int d;

        public g(boolean z, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, int i) {
            this.f38862a = z;
            this.f38863b = deviceStat;
            this.c = pluginPackageInfo;
            this.d = i;
        }

        @Override // com.facebook.react.a.l
        public void onReactContextInitialized(ReactContext reactContext) throws Throwable {
            MRnLog.e("RNRuntime", "----initRuntime onReactContextInitialized");
            RnPluginLog.addFrameworkLog("release new reactview,context wait ready,needShow=" + this.f38862a);
            x8j.this.v = false;
            x8j.this.y(",load_show_0_" + x8j.this.l + "_ns_" + this.f38862a);
            x8j x8jVar = x8j.this;
            x8jVar.p = x8jVar.B();
            if (this.f38862a) {
                RnPluginLog.addFrameworkLog("release new reactview, start react application");
                x8j.this.p.n(x8j.this.q, x8j.this.l);
                x8j.this.w = true;
                x8j.this.A(this.f38863b, this.c);
                PluginSetting.LogTimestamp("runtime plugin ready");
                if (RnTracePluginOpen.needTrace(this.d, this.f38863b.model)) {
                    RnReport.tracePluginOpen(this.f38863b.model, this.c, RnReportConst.PluginOpenTrace.ACTION_SDK_LOADED);
                }
            }
        }
    }

    public interface h {
        void a(ReactRootView reactRootView, com.facebook.react.a aVar, DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo);
    }

    public x8j() {
        Context appContext = MiJiaEnvironment.getAppContext();
        this.g = appContext;
        if (appContext != null) {
            Z();
        }
    }

    public final void A(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                h hVar = this.s.get(i);
                if (hVar != null) {
                    hVar.a(this.p, this.q, deviceStat, pluginPackageInfo);
                }
            }
            this.s = null;
        }
    }

    public final ReactRootView B() {
        Configuration configuration = new Configuration();
        configuration.fontScale = 1.0f;
        Context contextCreateConfigurationContext = this.g.createConfigurationContext(configuration);
        edj.g = 1.0f;
        if (SystemApi.isMiui()) {
            try {
                int i = Settings.System.getInt(this.g.getContentResolver(), "key_miui_font_weight_scale");
                if (i > 50) {
                    edj.g = (((i - 50.0f) / 50.0f) * 0.05f) + 1.0f;
                    RnPluginLog.addFrameworkLog("fontWeightScale --> " + edj.g);
                }
            } catch (Exception unused) {
            }
        }
        return new ReactRootView(contextCreateConfigurationContext);
    }

    public byte C() {
        return this.e;
    }

    public abstract String D();

    public abstract String E();

    public abstract boolean F(Exception exc);

    public abstract boolean G(Thread thread, Throwable th);

    public void H() {
        I(true);
    }

    public void I(boolean z) throws Throwable {
        RnPluginLog.addFrameworkLog("RNRuntime init(),ins=" + this);
        if (this.q != null) {
            RnPluginLog.addFrameworkLog("RNRuntime init() return mReactInstanceManager is not null!");
            return;
        }
        this.x = Q();
        PluginSetting.LogTimestamp("runtime init");
        e0((byte) 1);
        Thread.setDefaultUncaughtExceptionHandler(new c());
        d0();
        y(",init_plugin_record_null");
        this.A = P();
        RnPluginLog.initShowLog(true);
        f0();
        M(z);
    }

    public void J(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, RnPluginDeviceInfo rnPluginDeviceInfo, Bundle bundle, boolean z) {
        RnPluginLog.addFrameworkLog("RNRuntime initRNDevice(),ins=" + this + ",needShow" + z);
        StringBuilder sb = new StringBuilder();
        sb.append("tolu RNRuntime initRNDevice :deviceInfo.mPrivacyVer=");
        sb.append(rnPluginDeviceInfo.mPrivacyVer);
        RnPluginLog.addFrameworkLog(sb.toString());
        DeviceStat deviceStat2 = this.f38851k;
        if (deviceStat2 != null && this.n != null && deviceStat != null && pluginPackageInfo != null && (!TextUtils.equals(deviceStat2.did, deviceStat.did) || this.n.getPackageId() != pluginPackageInfo.getPackageId())) {
            this.v = true;
        }
        this.f38851k = deviceStat;
        this.n = pluginPackageInfo;
        if (pluginPackageInfo != null) {
            y(",init_device_plugin_record_0_" + this.n.getPackageName() + "_ns_" + z);
        } else {
            y(",init_device_plugin_record_null_ns_" + z);
        }
        this.o = rnPluginDeviceInfo;
        this.i = bundle;
        this.t = z1i.a(deviceStat, this.n);
        if (pluginPackageInfo != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileUtils.getAppFilesDir(this.g));
            String str = File.separator;
            sb2.append(str);
            sb2.append("plugin");
            sb2.append(str);
            sb2.append(PluginPackageConstant.RN_INSTALL_DIR_KEY);
            sb2.append(str);
            sb2.append("rn");
            pluginPackageInfo.setPackagePath(sb2.toString() + str + pluginPackageInfo.getPluginId() + str + pluginPackageInfo.getPackageId());
        }
    }

    public void K(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, RnPluginDeviceInfo rnPluginDeviceInfo, Bundle bundle, boolean z) throws Throwable {
        String packageName;
        com.facebook.react.a aVar;
        ReadableMap map;
        y(",init_runtime_ns_" + z);
        int i = bundle != null ? bundle.getInt("package_msgType", 1) : 1;
        int i2 = this.f38849a;
        if (!this.v && this.p != null && (aVar = this.q) != null && aVar.C() != null && this.q.C().getCurrentActivity() == null && !TextUtils.isEmpty(this.l) && i != 3) {
            if (i2 == 1) {
                RnPluginLog.addFrameworkLog("RNRuntime initRuntime, 性能优化, 复用 RN环境,model=" + deviceStat.model + ",packageId=" + pluginPackageInfo.getPackageId());
            } else if (i2 == 2) {
                RnPluginLog.addFrameworkLog("RNRuntime initRuntime, 性能优化, 预加载 RN环境,model=" + deviceStat.model + ",packageId=" + pluginPackageInfo.getPackageId());
            } else {
                RnPluginLog.addFrameworkLog("RNRuntime initRuntime, 性能优化, Cache RN环境 异常,model=" + deviceStat.model + ",packageId=" + pluginPackageInfo.getPackageId() + ",cacheHitType=" + i2);
            }
            ReadableMap readableMapA = this.f38852r.a(this);
            if (readableMapA == null || (map = readableMapA.getMap("package")) == null) {
                y(",cache_constant_1_hit_type_" + i2);
            } else {
                y(",cache_constant_0_" + map.getString("packageName") + "_hit_type_" + i2);
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.q.C().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPluginConfigUpdate", readableMapA);
            this.D = ColorSchemeHelper.colorSchemeForCurrentConfiguration(this.q.C());
            if (z) {
                b0(pluginPackageInfo.getPackageId(), pluginPackageInfo.getPluginId(), deviceStat.model, 1, i2);
            }
            y(",cache_show_" + this.l);
            ReactRootView reactRootViewB = B();
            this.p = reactRootViewB;
            reactRootViewB.n(this.q, this.l);
            this.w = true;
            A(deviceStat, pluginPackageInfo);
            if (z && RnTracePluginOpen.needTrace(i, deviceStat.model)) {
                RnReport.tracePluginOpen(deviceStat.model, pluginPackageInfo, RnReportConst.PluginOpenTrace.ACTION_SDK_LOADED);
            }
            this.u = true;
            return;
        }
        this.u = false;
        if (z) {
            RnPluginLog.addFrameworkLog("RNRuntime initRuntime, 性能优化, 未复用 RN环境,model=" + deviceStat.model + ",packageId=" + pluginPackageInfo.getPackageId() + ",cacheHitType=" + i2);
            b0(pluginPackageInfo.getPackageId(), pluginPackageInfo.getPluginId(), deviceStat.model, 0, i2);
        }
        PluginSetting.LogTimestamp(PluginSetting.NAME_LOAD_PLUGIN_SCRIPT);
        this.i = bundle;
        if (TextUtils.isEmpty(D())) {
            if (!this.A) {
                a0(deviceStat, pluginPackageInfo, rnPluginDeviceInfo, i, z);
                return;
            }
            l06.g(false);
            this.l = E();
            this.B = false;
            if ("ttt".equals(deviceStat.model)) {
                RnPluginLog.i("RNRuntime  mock device, 仅供UI调试...");
                this.B = true;
                packageName = E();
            } else {
                JSONObject jSONObjectA = euk.a(deviceStat.model);
                if (jSONObjectA != null) {
                    this.B = jSONObjectA.optBoolean(a7j.c);
                    packageName = jSONObjectA.optString(a7j.f720a);
                } else {
                    this.B = false;
                    packageName = pluginPackageInfo.getPackageName();
                }
            }
            RnPluginLog.addFrameworkLog("RNRuntime  调试的插件包： " + packageName + "   model: " + deviceStat.model);
            this.l = packageName;
            if (this.B) {
                z(deviceStat, pluginPackageInfo, rnPluginDeviceInfo, i, z);
            } else {
                a0(deviceStat, pluginPackageInfo, rnPluginDeviceInfo, i, z);
                if (R()) {
                    if (this.j != null) {
                        ToastUtil.show(this.g, "model: " + deviceStat.model + "\nnative apiLevel: " + PluginSetting.RN_NATIVE_API_LEVEL + "\nsdk Version: " + this.j.api_level + "\nsdk createTime: " + (this.j.build_time / 1000) + "\nplugin version: " + pluginPackageInfo.getVersion() + "\nis_inner_sdk: " + this.j.is_inner_sdk, 1);
                    } else {
                        ToastUtil.show(this.g, "加载 rn sdk error", 1);
                    }
                }
            }
            this.f38852r.c(this.B);
        }
    }

    public void L(boolean z) {
        RnPluginLog.addFrameworkLog("RNRuntime initRuntime(),ins=" + this + ",needShow=" + z);
        K(this.f38851k, this.n, this.o, this.i, z);
    }

    public final void M(boolean z) {
        jdj jdjVarT = com.facebook.react.a.t();
        this.f38852r = new gye(R());
        if (n1i.b().a() != null) {
            jdjVarT.b(n1i.b().a());
        }
        jdjVarT.e((Application) this.g).a(new qw9()).a(new mch()).a(new hye()).a(new AppearancePackage()).a(new q7j()).a(this.f38852r).a(new ql1()).a(new ljg()).a(new w6j()).a(new wfj()).h(LifecycleState.BEFORE_CREATE).g(this.F).l(new NativeModuleCallExceptionHandler() { // from class: u8j
            @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
            public final void handleException(Exception exc) {
                this.f35523a.S(exc);
            }
        }).m(R());
        if (R()) {
            jdjVarT.k("projects/" + this.l + "/index");
            this.q = jdjVarT.c();
        } else {
            jdjVarT.j(new d(z));
            try {
                this.q = jdjVarT.c();
                ReactRootView reactRootView = this.p;
                if (reactRootView != null) {
                    reactRootView.q();
                    this.p = null;
                }
                y(",show_sdk");
                B().n(this.q, "sdk");
                MiJiaLog.onlyLogcat("PluginStartTime", "initRnRuntime  " + System.currentTimeMillis() + "  " + this.j.install_dir);
            } catch (Exception e2) {
                RnPluginLog.addFrameworkLog("failed to build ReactInstanceManager: " + Log.getStackTraceString(e2));
                return;
            }
        }
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() { // from class: v8j
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.f36623a.T(thread, th);
            }
        };
        this.q.q(new com.facebook.react.a.l() { // from class: w8j
            @Override // com.facebook.react.a.l
            public final void onReactContextInitialized(ReactContext reactContext) throws Throwable {
                this.f37722a.U(uncaughtExceptionHandler, reactContext);
            }
        });
    }

    public boolean N() {
        com.facebook.react.a aVar;
        return (this.n == null || this.o == null || this.f38851k == null || (aVar = this.q) == null || aVar.C() == null) ? false : true;
    }

    public abstract boolean O();

    public abstract boolean P();

    public abstract boolean Q();

    public boolean R() {
        return (this.A && this.B) || this.C;
    }

    public final /* synthetic */ void S(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("NativeModuleCallExceptionHandler,  process name is ");
        sb.append(MIOTUtils.getProcessName(this.g));
        sb.append(",launchErrorCode:");
        sb.append(this.f);
        RnPluginLog.addFrameworkLog("NativeModuleCallExceptionHandler,exception=" + exc);
        PluginErrorInfoActivity.k(MiJiaEnvironment.getAppContext(), exc);
        F(exc);
        this.v = true;
    }

    public final /* synthetic */ void T(Thread thread, Throwable th) {
        MRnLog.e("RNRuntime", "uncaughtException:", th);
        if (this.h == null && this.n == null && this.f38851k == null) {
            MRnLog.w("RNRuntime", "not rn plugin,let sDefaultExceptionHandler handle it");
            H.uncaughtException(thread, th);
            return;
        }
        int i = G;
        if (i > 1) {
            MRnLog.w("RNRuntime", "uncaughtException: sSdkNativeOutSideRnCrashCount=" + G);
            return;
        }
        G = i + 1;
        try {
            G(thread, th);
            RnPluginLog.addFrameworkLog("uncaughtException,runtimeReused=" + this.u);
            RnPluginLog.addFrameworkLog("uncaughtException,packageNameOperation=" + this.z.toString());
        } catch (Throwable th2) {
            MRnLog.w("RNRuntime", "uncaughtException,handle exception error:", th2);
        }
    }

    public final /* synthetic */ void U(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ReactContext reactContext) throws Throwable {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        this.e = (byte) 2;
        PluginSetting.LogTimestamp("runtime sdk ready");
    }

    public final void V(JSBundleLoaderDelegate jSBundleLoaderDelegate, RnSdkInfo rnSdkInfo, boolean z) throws Throwable {
        RnSdkInfo rnSdkInfo2;
        RnPluginLog.addFrameworkLog("RNRuntime loadScriptCache(),ifLoadPluginBundle=" + z);
        y(",load_script_cache_if_plugin_" + z);
        if (jSBundleLoaderDelegate == null || (rnSdkInfo2 = this.j) == null || rnSdkInfo2 != rnSdkInfo) {
            RnSdkInfo rnSdkInfo3 = this.j;
            if (rnSdkInfo3 == null) {
                y(",load_script_cache_sdk_info_null");
                return;
            }
            if (rnSdkInfo3 == rnSdkInfo) {
                y(",load_script_cache_instance_null");
                return;
            }
            RnPluginLog.addFrameworkLog("RNRuntime loadScriptCache(),mSdkInfo=" + this.j + ",usedSdkInfo=" + rnSdkInfo);
            y(",load_script_cache_sdk_info_not_match");
            return;
        }
        try {
            if (this.f38850b < 0) {
                this.f38850b = rnSdkInfo2.api_level;
                this.c = rnSdkInfo2.build_time;
                y(",load_sdk_" + this.f38850b);
                PluginSetting.LogTimestamp("runtime load sdk script");
                RnPluginLog.addFrameworkLog("2、 start load rn sdk bundle, PluginStartTime  loadScript  is_inner_sdk: " + this.j.is_inner_sdk + "  path: " + this.j.install_path);
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    RnSdkInfo rnSdkInfo4 = this.j;
                    if (rnSdkInfo4.is_inner_sdk) {
                        JSBundleLoader.createAssetLoader(this.g, rnSdkInfo4.install_path, false).loadScript(jSBundleLoaderDelegate);
                    } else {
                        JSBundleLoader.createFileLoader(rnSdkInfo4.install_path, rnSdkInfo4.install_dir, false).loadScript(jSBundleLoaderDelegate);
                    }
                    RnReport.reportLoadRes(RnReportConst.PluginLoad.LOAD_SDK, "", 0, System.currentTimeMillis() - jCurrentTimeMillis);
                } catch (Throwable th) {
                    RnPluginLog.addFrameworkLog("load sdk error,message" + Log.getStackTraceString(th));
                    this.f = this.f | 2;
                    y(",load_sdk_error_" + this.f38850b);
                    RnReport.reportLoadRes(RnReportConst.PluginLoad.LOAD_SDK, "", -1001, System.currentTimeMillis() - jCurrentTimeMillis);
                }
            }
            if (!z) {
                RnPluginLog.addFrameworkLog("load sdk over,no need to load plugin");
                return;
            }
            if (this.d != null || TextUtils.isEmpty(this.m)) {
                RnPluginLog.addFrameworkLog("RNRuntime loadScriptCache(),mLoadedPluginPath:" + this.d);
                RnPluginLog.addFrameworkLog("RNRuntime loadScriptCache(),mPluginBundlePath:" + this.m);
                y(",load_plugin_loaded_or_no_path");
                return;
            }
            PluginSetting.LogTimestamp(PluginSetting.NAME_LOAD_PLUGIN_SCRIPT);
            File file = new File(this.m, PluginSetting.FILE_BUNDLE_MAIN);
            if (!file.exists()) {
                RnPluginLog.addFrameworkLog("RNRuntime loadScriptCache(),bundleFile not exist,path:" + this.m);
                this.f = this.f | 65536;
                y(",load_plugin_bundle_not_exist");
                return;
            }
            this.d = this.m;
            file.getAbsolutePath();
            PluginSetting.RnSdkLog(PluginSetting.NAME_LOAD_PLUGIN_SCRIPT, Long.valueOf(this.f38850b), this.j.install_path, this.d);
            MiJiaLog.onlyLogcat("PluginStartTime", "loadScript  " + System.currentTimeMillis() + "  " + file);
            StringBuilder sb = new StringBuilder();
            sb.append("3、 start load plugin bundle, path:");
            sb.append(this.d);
            RnPluginLog.addFrameworkLog(sb.toString());
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            RnPluginDeviceInfo rnPluginDeviceInfo = this.o;
            String model = rnPluginDeviceInfo != null ? rnPluginDeviceInfo.getModel() : "";
            try {
                y(",load_plugin_" + this.l);
                JSBundleLoader.createFileLoader(file.getAbsolutePath(), this.d, false).loadScript(jSBundleLoaderDelegate);
                RnReport.reportLoadRes(RnReportConst.PluginLoad.LOAD_PLUGIN, model, 0, System.currentTimeMillis() - jCurrentTimeMillis2);
            } catch (Throwable th2) {
                y(",load_plugin_error_" + this.l);
                this.f = this.f | 131072;
                RnPluginLog.addFrameworkLog("load plugin error,message:" + Log.getStackTraceString(th2));
                RnReport.reportLoadRes(RnReportConst.PluginLoad.LOAD_PLUGIN, model, -1001, System.currentTimeMillis() - jCurrentTimeMillis2);
            }
        } catch (Exception e2) {
            RnPluginLog.addFrameworkLog("loadScript: " + Log.getStackTraceString(e2));
            y(",load_script_cache_error");
            MiJiaLog.onlyLogcat(6, "loadScriptCache", Log.getStackTraceString(e2));
        }
    }

    public synchronized void W(int i) {
        this.y.append(i);
    }

    public void X(Activity activity) {
        this.h = activity;
        this.f38852r.b();
        if (R()) {
            try {
                this.q.V(activity, this.F);
            } catch (Exception unused) {
            }
        }
    }

    public void Y(h hVar) {
        if (hVar != null) {
            if (N()) {
                try {
                    hVar.a(this.p, this.q, this.f38851k, this.n);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            ArrayList<h> arrayList = this.s;
            if (arrayList == null) {
                ArrayList<h> arrayList2 = new ArrayList<>();
                this.s = arrayList2;
                arrayList2.add(hVar);
            } else {
                if (arrayList.contains(hVar)) {
                    return;
                }
                this.s.add(hVar);
            }
        }
    }

    public final void Z() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PluginPackageConstant.ACTION_DOWNRNSDK);
        intentFilter.addAction(AppearanceModule.APPEARANCE_CHANGED_ACTION);
        intentFilter.addAction(PluginPackageConstant.ACTION_RN_PLUGIN_SWITCH_CHANGED);
        if (Build.VERSION.SDK_INT >= 33) {
            this.g.registerReceiver(this.E, intentFilter, 4);
        } else {
            this.g.registerReceiver(this.E, intentFilter);
        }
    }

    public final void a0(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, RnPluginDeviceInfo rnPluginDeviceInfo, int i, boolean z) throws Throwable {
        boolean zIsEmpty;
        RnSdkInfo rnSdkInfo = this.j;
        if (PluginSetting.isDebug()) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        }
        String packageName = pluginPackageInfo.getPackageName();
        if (i == 3) {
            zIsEmpty = TextUtils.isEmpty(this.l);
            DeviceStat deviceStat2 = this.f38851k;
            if (deviceStat2 != null && deviceStat != null && !TextUtils.equals(deviceStat.did, deviceStat2.did)) {
                zIsEmpty = false;
            }
        } else {
            zIsEmpty = true;
        }
        y(",set_package_name_" + packageName);
        this.l = packageName;
        if (z && (rnSdkInfo.api_level > this.j.api_level || !zIsEmpty)) {
            RnPluginLog.addFrameworkLog("RnPluginInfo releaseRnPluginInit(),recordReInit isSamePlugin=" + zIsEmpty);
            this.q = null;
            y(",same_plugin_init_sdk");
            H();
        }
        this.m = PluginUtils.getRnPackageRealPath(this.t.a()) + File.separator;
        RnPluginLog.addFrameworkLog("RnPluginInfo releaseRnPluginInit:  sdkInfo=" + this.j.toString() + "   PluginBundlePath=" + this.m);
        this.f38851k = deviceStat;
        this.n = pluginPackageInfo;
        y(",release_plugin_record_" + this.n.getPackageName());
        this.o = rnPluginDeviceInfo;
        ReactContext reactContextC = this.q.C();
        if (reactContextC == null) {
            MRnLog.e("RNRuntime", "wait context then load");
            y(",plugin_init_context_wait");
            RnPluginLog.addFrameworkLog("RnPluginInfo releaseRnPluginInit(),context null,needShow=" + z);
            this.q.q(new e(z, rnSdkInfo, deviceStat, pluginPackageInfo, i));
            this.f = this.f | 262144;
            return;
        }
        RnPluginLog.addFrameworkLog("releaseRnPluginInit(),context not null,needShow=" + z);
        MRnLog.e("RNRuntime", "context!=null,start load");
        y(",plugin_init_context_ready");
        if (z || !this.w) {
            h0(reactContextC, rnSdkInfo, z);
            g0(deviceStat, pluginPackageInfo, i, z);
        } else {
            y(",plugin_init_context_ready_not_load");
            RnPluginLog.addFrameworkLog("releaseRnPluginInit(),context ready not load");
        }
    }

    public final void b0(long j, long j2, String str, int i, int i2) {
        HashMap map = new HashMap();
        map.put("open_plugin_status", Integer.valueOf(i));
        map.put("cache_hit_type", Integer.valueOf(i2));
        RnReport.reportOpenPluginStatus(j, j2, str, map);
    }

    public boolean c0(boolean z, int i) {
        if (C() == 1) {
            MRnLog.w("RNRuntime", "requestInit,invalid init request,RNRuntime is being initialized,wait a moment for the process to finish");
            return false;
        }
        if (z) {
            this.q = null;
        }
        W(i);
        H();
        return true;
    }

    public final void d0() {
        this.q = null;
        this.v = true;
        this.f38850b = -1L;
        this.c = -1L;
        this.f38851k = null;
        this.n = null;
        this.o = null;
        this.d = null;
        this.m = null;
    }

    public final void e0(byte b2) {
        this.e = b2;
    }

    public final void f0() {
        RnSdkInfo newestRnSdkInfo = PluginPackageManager.getInstance().getNewestRnSdkInfo(this.g);
        this.j = newestRnSdkInfo;
        if (newestRnSdkInfo != null || R()) {
            if (this.j != null) {
                RnPluginLog.addFrameworkLog("init> isRnCanDebug:" + R() + " rnSdkInfo: " + this.j.api_level + "  install_path: " + this.j.install_path + "  mIsRnDevSettingOpen:" + this.A);
            } else {
                RnPluginLog.addFrameworkLog("init> rnSdkInfo is null...");
            }
            if (P() && O() && PluginSetting.getInnerRnSdkInfo(this.g, "") != null) {
                this.j = PluginSetting.getInnerRnSdkInfo(this.g, "");
            }
        }
    }

    public final void g0(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, int i, boolean z) {
        ReactRootView reactRootView = this.p;
        if (reactRootView != null) {
            reactRootView.q();
        }
        RnPluginLog.addFrameworkLog("start react app > " + this.l + ",needShow=" + z);
        if (R()) {
            y(",debug_show_" + this.l + "_ns_" + z);
            ReactRootView reactRootViewB = B();
            this.p = reactRootViewB;
            if (z) {
                reactRootViewB.n(this.q, this.l);
                this.w = true;
                if (this.q.C() == null) {
                    this.q.q(new f(deviceStat, pluginPackageInfo));
                    return;
                } else {
                    A(deviceStat, pluginPackageInfo);
                    return;
                }
            }
            return;
        }
        if (this.q.C() == null) {
            RnPluginLog.addFrameworkLog("release new reactview,context null need wait,needShow=" + z);
            y(",load_show_context_wait_ns_" + z);
            this.q.q(new g(z, deviceStat, pluginPackageInfo, i));
            return;
        }
        RnPluginLog.addFrameworkLog("release new reactview, context not null,needShow=" + z);
        this.v = false;
        y(",load_show_1_" + this.l + "_ns_" + z);
        this.p = B();
        if (z) {
            RnPluginLog.addFrameworkLog("release new reactview, start react application");
            this.p.n(this.q, this.l);
            this.w = true;
            A(deviceStat, pluginPackageInfo);
            if (RnTracePluginOpen.needTrace(i, deviceStat.model)) {
                RnReport.tracePluginOpen(deviceStat.model, pluginPackageInfo, RnReportConst.PluginOpenTrace.ACTION_SDK_LOADED);
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime
    public DeviceStat getDeviceStat() {
        return this.f38851k;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime
    public com.facebook.react.a getInstanceManager() {
        return this.q;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime
    public RnPluginDeviceInfo getPluginInfo() {
        return this.o;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime
    public PluginPackageInfo getPluginRecord() {
        return this.n;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime
    public WritableMap getSceneExtra() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.i;
        if (bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj instanceof String) {
                        jSONObject.put(str, bundle.getString(str));
                        writableMapCreateMap.putString(str, bundle.getString(str));
                    } else if (obj instanceof Float) {
                        jSONObject.put(str, bundle.getFloat(str));
                        writableMapCreateMap.putDouble(str, bundle.getFloat(str));
                    } else if (obj instanceof Boolean) {
                        jSONObject.put(str, bundle.getBoolean(str));
                        writableMapCreateMap.putBoolean(str, bundle.getBoolean(str));
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str, bundle.getInt(str));
                        writableMapCreateMap.putInt(str, bundle.getInt(str));
                    }
                }
            } catch (JSONException unused) {
            }
            writableMapCreateMap.putString("extra", jSONObject.toString());
        }
        return writableMapCreateMap;
    }

    public final void h0(ReactContext reactContext, RnSdkInfo rnSdkInfo, boolean z) throws Throwable {
        RnPluginLog.addFrameworkLog("RNRuntime tryLoadPlugin(),needShow=" + z);
        if (this.f38850b > 0) {
            RnPluginLog.i("RNRuntime --> will send onPluginConfigUpdate event...");
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPluginConfigUpdate", this.f38852r.a(this));
        } else {
            y(",load_constant_2");
            RnPluginLog.e("RNRuntime --> not send onPluginConfigUpdate event...");
        }
        this.D = ColorSchemeHelper.colorSchemeForCurrentConfiguration(reactContext);
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        if (catalystInstance == null) {
            y(",load_plugin_catalyst_null");
        } else {
            y(",plugin_load_script_cache");
            V((CatalystInstanceImpl) catalystInstance, rnSdkInfo, true);
        }
    }

    public final void i0() {
        Context context = this.g;
        if (context != null) {
            try {
                context.unregisterReceiver(this.E);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void y(String str) {
        StringBuilder sb;
        if (!this.x || (sb = this.z) == null) {
            return;
        }
        sb.append(str);
    }

    public final void z(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, RnPluginDeviceInfo rnPluginDeviceInfo, int i, boolean z) {
        this.q = null;
        y(",debug_init_sdk");
        H();
        this.m = PluginUtils.getRnPackageRealPath(this.t.a()) + File.separator;
        pluginPackageInfo.setPackageName(this.l);
        this.f38851k = deviceStat;
        this.n = pluginPackageInfo;
        y(",debug_plugin_record_" + this.n.getPackageName());
        this.o = rnPluginDeviceInfo;
        RnPluginLog.i("RNRuntime  initRuntime debug>" + this.l + ">" + this.m);
        g0(deviceStat, pluginPackageInfo, i, z);
    }
}
