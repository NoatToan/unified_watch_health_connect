package defpackage;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.yrn.manager.OnYRNInstanceListener;
import com.facebook.yrn.manager.YRNBizInstance;
import com.facebook.yrn.manager.YRNInstanceManager;
import com.facebook.yrn.manager.YRNOptionsConfig;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class exr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17169a;

    public class a implements com.facebook.react.a.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.facebook.react.a f17170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1d f17171b;
        public final /* synthetic */ fwr c;
        public final /* synthetic */ gur d;
        public final /* synthetic */ YRNBundleInfo e;
        public final /* synthetic */ long f;

        public a(com.facebook.react.a aVar, f1d f1dVar, fwr fwrVar, gur gurVar, YRNBundleInfo yRNBundleInfo, long j) {
            this.f17170a = aVar;
            this.f17171b = f1dVar;
            this.c = fwrVar;
            this.d = gurVar;
            this.e = yRNBundleInfo;
            this.f = j;
        }

        @Override // com.facebook.react.a.l
        public void onReactContextInitialized(ReactContext reactContext) {
            this.f17170a.e0(this);
            f1d f1dVar = this.f17171b;
            if (f1dVar != null) {
                f1dVar.onSuccess(this.c);
            }
            ezr.c().f(YRNTraceEvent.newEvent(this.d.j(), 130, "执行基础包的 js 代码成功", this.e, null, System.currentTimeMillis() - this.f));
        }
    }

    public class b implements OnYRNInstanceListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNBizInstance f17172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1d f17173b;
        public final /* synthetic */ our c;
        public final /* synthetic */ String d;
        public final /* synthetic */ fwr e;
        public final /* synthetic */ YRNBundleInfo f;
        public final /* synthetic */ long g;

        public b(YRNBizInstance yRNBizInstance, f1d f1dVar, our ourVar, String str, fwr fwrVar, YRNBundleInfo yRNBundleInfo, long j) {
            this.f17172a = yRNBizInstance;
            this.f17173b = f1dVar;
            this.c = ourVar;
            this.d = str;
            this.e = fwrVar;
            this.f = yRNBundleInfo;
            this.g = j;
        }

        @Override // com.facebook.yrn.manager.OnYRNInstanceListener
        public void onInstanceInitialized() {
            this.f17172a.removeYRNInstanceEventListener(this);
            f1d f1dVar = this.f17173b;
            if (f1dVar != null) {
                f1dVar.onSuccess(this.c);
            }
            ezr.c().f(YRNTraceEvent.newEvent(this.d, 140, "执行业务包的 js 代码成功", this.e.b(), this.f, System.currentTimeMillis() - this.g));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final exr f17174a = new exr(null);
    }

    public /* synthetic */ exr(a aVar) {
        this();
    }

    public static exr f() {
        return c.f17174a;
    }

    public final void a(YRNBundleInfo yRNBundleInfo) {
        if (yRNBundleInfo == null || TextUtils.isEmpty(yRNBundleInfo.getAppName()) || !TextUtils.isEmpty(yRNBundleInfo.getBundlePathFileName())) {
            return;
        }
        yRNBundleInfo.setBundlePathFileName(yur.d(yRNBundleInfo.getBundlePath(), yRNBundleInfo.getModule(), vwr.g().d(yRNBundleInfo.getAppName())));
    }

    public void b(YRNBundleInfo yRNBundleInfo, fwr fwrVar, f1d<our> f1dVar) {
        UiThreadUtil.assertOnUiThread();
        if (yRNBundleInfo == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createBizInstance error: bizBundleInfo ==  null");
                return;
            }
            return;
        }
        String module = yRNBundleInfo.getModule();
        String appName = yRNBundleInfo.getAppName();
        if (fwrVar == null || fwrVar.o() == null || fwrVar.m() == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createBizInstance error: module is " + module + ", reactInstanceManager == null");
            }
            yxr.f(appName, module);
            return;
        }
        ReactContext reactContextC = fwrVar.o().C();
        if (reactContextC == null || reactContextC.getCatalystInstance() == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createBizInstance error: module is  " + module + ": ReactContext == null");
            }
            yxr.f(appName, module);
            return;
        }
        a(yRNBundleInfo);
        String bundlePathFileName = yRNBundleInfo.getBundlePathFileName();
        if (!wwr.h(bundlePathFileName)) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createBizInstance error: module is " + module + ", file does not exist,bundlePathFileName is :" + bundlePathFileName);
            }
            ezr.c().f(YRNTraceEvent.newEvent(appName, 1100, "bundleFileName 不存在", null, module + "," + bundlePathFileName));
            yxr.f(appName, module);
            return;
        }
        ezr.c().f(YRNTraceEvent.newEvent(appName, 14, "执行业务包的 js 代码", fwrVar.b(), yRNBundleInfo));
        long jCurrentTimeMillis = System.currentTimeMillis();
        YRNBizInstance yRNBizInstanceE = e(appName, module, bundlePathFileName, fwrVar.m());
        our ourVar = new our(yRNBizInstanceE, yRNBundleInfo.m873clone());
        zxr.a("YRN_YRNV3_SDK", "YRNInstanceFactory.createBizInstance: " + module + " success\nBundleInfo: " + yRNBundleInfo);
        if (yRNBizInstanceE.hasInstanceCreated()) {
            if (f1dVar != null) {
                f1dVar.onSuccess(ourVar);
            }
            ezr.c().f(YRNTraceEvent.newEvent(appName, 140, "执行业务包的 js 代码成功-已创建", fwrVar.b(), yRNBundleInfo, System.currentTimeMillis() - jCurrentTimeMillis));
        } else {
            yRNBizInstanceE.addYRNBizInstanceListener(new b(yRNBizInstanceE, f1dVar, ourVar, appName, fwrVar, yRNBundleInfo, jCurrentTimeMillis));
        }
        yxr.f(appName, module);
    }

    public void c(gur gurVar, YRNBundleInfo yRNBundleInfo, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, f1d<fwr> f1dVar) {
        UiThreadUtil.assertOnUiThread();
        if (gurVar == null || yRNBundleInfo == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createCommonInstance error: info is null");
                return;
            }
            return;
        }
        a(yRNBundleInfo);
        String bundlePathFileName = yRNBundleInfo.getBundlePathFileName();
        if (!wwr.h(bundlePathFileName)) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createCommonInstance error: file does not exist:" + bundlePathFileName);
                return;
            }
            return;
        }
        if (gurVar.p() == null) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "createCommonInstance error: config.getInfoProvider() ==  null");
                return;
            }
            return;
        }
        com.facebook.react.a aVarA = kyr.a(ayr.b().a(), yRNBundleInfo.getBundlePathFileName(), gurVar.p().getJSMainModulePath(), gurVar.p().getReactPackages(), false, null, nativeModuleCallExceptionHandler);
        ezr.c().f(YRNTraceEvent.newEvent(gurVar.j(), 13, "执行基础包的 js 代码", yRNBundleInfo, bundlePathFileName));
        long jCurrentTimeMillis = System.currentTimeMillis();
        fwr fwrVar = new fwr(aVarA, new YRNInstanceManager(aVarA, true), yRNBundleInfo.m873clone());
        if (aVarA.C() == null || !aVarA.C().hasActiveCatalystInstance()) {
            aVarA.q(new a(aVarA, f1dVar, fwrVar, gurVar, yRNBundleInfo, jCurrentTimeMillis));
            return;
        }
        if (f1dVar != null) {
            f1dVar.onSuccess(fwrVar);
        }
        ezr.c().f(YRNTraceEvent.newEvent(gurVar.j(), 130, "执行基础包的 js 代码成功-已创建", yRNBundleInfo, null, System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public fwr d(gur gurVar, YRNDevModeInfo yRNDevModeInfo, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        UiThreadUtil.assertOnUiThread();
        if (gurVar == null || gurVar.p() == null) {
            zxr.b("YRN_YRNV3_SDK", "YRNInstanceFactory.createDevCommonInstance: config is null!");
            return null;
        }
        if (yRNDevModeInfo == null || TextUtils.isEmpty(yRNDevModeInfo.d())) {
            zxr.b("YRN_YRNV3_SDK", "YRNInstanceFactory.createDevCommonInstance: devModeInfo is null!");
            return null;
        }
        List<cej> reactPackages = gurVar.p().getReactPackages();
        com.facebook.react.a aVarA = kyr.a(ayr.b().a(), "", gurVar.p().getJSMainModulePath(), reactPackages, true, yRNDevModeInfo.d(), nativeModuleCallExceptionHandler);
        YRNInstanceManager yRNInstanceManager = new YRNInstanceManager(aVarA, true);
        fwr fwrVar = new fwr();
        fwrVar.v(aVarA);
        fwrVar.u(yRNInstanceManager);
        fwrVar.t(true);
        return fwrVar;
    }

    public final YRNBizInstance e(String str, String str2, String str3, YRNInstanceManager yRNInstanceManager) {
        sk1.b(!TextUtils.isEmpty(str), "appName can not be empty!");
        sk1.b(!TextUtils.isEmpty(str2), "module can not be empty!");
        sk1.d(yRNInstanceManager, "yrnInstanceManager can not be null!");
        sk1.b(!TextUtils.isEmpty(str3), "jsBundleLoader fileName can not be empty!");
        WritableMap writableMapCreateMap = Arguments.createMap();
        gur gurVarD = vwr.g().d(str);
        int iMax = 2;
        if (gurVarD != null) {
            iMax = Math.max(gurVarD.q(), 2);
            writableMapCreateMap = (gurVarD.p() == null || gurVarD.p().getBizInjectJSGlobalMap(str2) == null) ? Arguments.createMap() : gurVarD.p().getBizInjectJSGlobalMap(str2);
        }
        return yRNInstanceManager.initBizInstance(JSBundleLoader.createFileLoader(str3), new YRNOptionsConfig(iMax, writableMapCreateMap));
    }

    public exr() {
        this.f17169a = "YRN_YRNV3_SDK";
    }
}
