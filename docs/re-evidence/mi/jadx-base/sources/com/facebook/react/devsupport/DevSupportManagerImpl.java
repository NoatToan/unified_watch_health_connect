package com.facebook.react.devsupport;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.util.Pair;
import android.widget.EditText;
import android.widget.Toast;
import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.c9i;
import defpackage.cm8;
import defpackage.gd8;
import defpackage.k06;
import defpackage.kdj;
import defpackage.l06;
import defpackage.l1j;
import defpackage.m06;
import defpackage.m8o;
import defpackage.mhh;
import defpackage.mr5;
import defpackage.n06;
import defpackage.nok;
import defpackage.nrk;
import defpackage.p06;
import defpackage.p8o;
import defpackage.q2m;
import defpackage.sk1;
import defpackage.ycj;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class DevSupportManagerImpl implements n06, com.facebook.react.devsupport.c.l, com.facebook.react.devsupport.b.a {
    public static final String EMOJI_FACE_WITH_NO_GOOD_GESTURE = " 🙅";
    public static final String EMOJI_HUNDRED_POINTS_SYMBOL = " 💯";
    private static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    private static final int JAVA_ERROR_COOKIE = -1;
    private static final int JSEXCEPTION_ERROR_COOKIE = -1;
    private static final String JS_BUNDLE_FILE_NAME = "ReactNativeDevBundle.js";
    private static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";
    private final Context mApplicationContext;
    private k06 mBundleDownloadListener;
    private com.facebook.react.devsupport.d.b mBundleStatus;
    private ReactContext mCurrentContext;
    private final LinkedHashMap<String, m06> mCustomDevOptions;
    private Map<String, nok> mCustomPackagerCommandHandlers;
    private mr5 mDebugOverlayController;
    private final DefaultNativeModuleCallExceptionHandler mDefaultNativeModuleCallExceptionHandler;
    private final l06 mDevLoadingViewController;
    private boolean mDevLoadingViewVisible;
    private AlertDialog mDevOptionsDialog;
    private final com.facebook.react.devsupport.c mDevServerHelper;
    private com.facebook.react.devsupport.b mDevSettings;
    private List<gd8> mErrorCustomizers;
    private final List<f0> mExceptionLoggers;
    private boolean mIsDevSupportEnabled;
    private boolean mIsReceiverRegistered;
    private boolean mIsSamplingProfilerEnabled;
    private boolean mIsShakeDetectorStarted;
    private final String mJSAppBundleName;
    private final File mJSBundleTempFile;
    private int mLastErrorCookie;
    private m8o[] mLastErrorStack;
    private String mLastErrorTitle;
    private e0 mLastErrorType;
    private final kdj mReactInstanceManagerHelper;
    private com.facebook.react.devsupport.g mRedBoxDialog;
    private RedBoxHandler mRedBoxHandler;
    private final BroadcastReceiver mReloadAppBroadcastReceiver;
    private final q2m mShakeDetector;

    public class a implements m06 {
        public a() {
        }

        @Override // defpackage.m06
        public void a() {
            DevSupportManagerImpl.this.mDevSettings.n(!DevSupportManagerImpl.this.mDevSettings.f());
            DevSupportManagerImpl.this.mReactInstanceManagerHelper.toggleElementInspector();
        }
    }

    public class a0 implements m06 {
        public a0() {
        }

        @Override // defpackage.m06
        public void a() {
            if (!DevSupportManagerImpl.this.mDevSettings.i() && DevSupportManagerImpl.this.mDevSettings.h()) {
                Toast.makeText(DevSupportManagerImpl.this.mApplicationContext, DevSupportManagerImpl.this.mApplicationContext.getString(l1j.l), 1).show();
                DevSupportManagerImpl.this.mDevSettings.p(false);
            }
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class b implements m06 {
        public b() {
        }

        @Override // defpackage.m06
        public void a() {
            boolean z = !DevSupportManagerImpl.this.mDevSettings.h();
            DevSupportManagerImpl.this.mDevSettings.p(z);
            if (DevSupportManagerImpl.this.mCurrentContext != null) {
                if (z) {
                    ((HMRClient) DevSupportManagerImpl.this.mCurrentContext.getJSModule(HMRClient.class)).enable();
                } else {
                    ((HMRClient) DevSupportManagerImpl.this.mCurrentContext.getJSModule(HMRClient.class)).disable();
                }
            }
            if (!z || DevSupportManagerImpl.this.mDevSettings.i()) {
                return;
            }
            Toast.makeText(DevSupportManagerImpl.this.mApplicationContext, DevSupportManagerImpl.this.mApplicationContext.getString(l1j.m), 1).show();
            DevSupportManagerImpl.this.mDevSettings.q(true);
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class b0 implements m06 {
        public b0() {
        }

        @Override // defpackage.m06
        public void a() {
            DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(!DevSupportManagerImpl.this.mDevSettings.b());
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class c implements m06 {
        public c() {
        }

        @Override // defpackage.m06
        public void a() {
            DevSupportManagerImpl.this.toggleJSSamplingProfiler();
        }
    }

    public class c0 implements m06 {
        public c0() {
        }

        @Override // defpackage.m06
        public void a() {
            DevSupportManagerImpl.this.mDevServerHelper.n(DevSupportManagerImpl.this.mApplicationContext, "ReactNative");
        }
    }

    public class d implements m06 {
        public d() {
        }

        @Override // defpackage.m06
        public void a() {
            if (!DevSupportManagerImpl.this.mDevSettings.g()) {
                Activity activityD = DevSupportManagerImpl.this.mReactInstanceManagerHelper.d();
                if (activityD == null) {
                    cm8.i("ReactNative", "Unable to get reference to react activity");
                } else {
                    mr5.h(activityD);
                }
            }
            DevSupportManagerImpl.this.mDevSettings.o(!DevSupportManagerImpl.this.mDevSettings.g());
        }
    }

    public class d0 implements m06 {

        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f7234a;

            public a(EditText editText) {
                this.f7234a = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                DevSupportManagerImpl.this.mDevSettings.c().d(this.f7234a.getText().toString());
                DevSupportManagerImpl.this.handleReloadJS();
            }
        }

        public d0() {
        }

        @Override // defpackage.m06
        public void a() {
            Activity activityD = DevSupportManagerImpl.this.mReactInstanceManagerHelper.d();
            if (activityD == null || activityD.isFinishing()) {
                cm8.i("ReactNative", "Unable to launch change bundle location because react activity is not available");
                return;
            }
            EditText editText = new EditText(activityD);
            editText.setHint("localhost:8081");
            new AlertDialog.Builder(activityD).setTitle(DevSupportManagerImpl.this.mApplicationContext.getString(l1j.f24528b)).setView(editText).setPositiveButton(R.string.ok, new a(editText)).create().show();
        }
    }

    public class e implements m06 {
        public e() {
        }

        @Override // defpackage.m06
        public void a() {
            Intent intent = new Intent(DevSupportManagerImpl.this.mApplicationContext, (Class<?>) DevSettingsActivity.class);
            intent.setFlags(268435456);
            DevSupportManagerImpl.this.mApplicationContext.startActivity(intent);
        }
    }

    public enum e0 {
        JS,
        NATIVE
    }

    public class f implements DialogInterface.OnCancelListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            DevSupportManagerImpl.this.mDevOptionsDialog = null;
        }
    }

    public interface f0 {
        void a(Exception exc);
    }

    public class g implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m06[] f7240a;

        public g(m06[] m06VarArr) {
            this.f7240a = m06VarArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f7240a[i].a();
            DevSupportManagerImpl.this.mDevOptionsDialog = null;
        }
    }

    public class g0 implements f0 {
        public g0() {
        }

        @Override // com.facebook.react.devsupport.DevSupportManagerImpl.f0
        public void a(Exception exc) {
            StringBuilder sb = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
            for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
                sb.append("\n\n");
                sb.append(cause.getMessage());
            }
            if (!(exc instanceof JSException)) {
                DevSupportManagerImpl.this.showNewJavaError(sb.toString(), exc);
                return;
            }
            cm8.j("ReactNative", "Exception in native call from JS", exc);
            String stack = ((JSException) exc).getStack();
            sb.append("\n\n");
            sb.append(stack);
            DevSupportManagerImpl.this.showNewError(sb.toString(), new m8o[0], -1, e0.JS);
        }

        public /* synthetic */ g0(DevSupportManagerImpl devSupportManagerImpl, k kVar) {
            this();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.reload();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.showDevOptionsDialog();
        }
    }

    public class k implements com.facebook.react.devsupport.d.c {
        public k() {
        }

        @Override // com.facebook.react.devsupport.d.c
        public com.facebook.react.devsupport.d.b a() {
            return DevSupportManagerImpl.this.mBundleStatus;
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nrk f7247a;

        public l(nrk nrkVar) {
            this.f7247a = nrkVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.handleCaptureHeap(this.f7247a);
        }
    }

    public class m implements JSCHeapCapture.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nrk f7249a;

        public m(nrk nrkVar) {
            this.f7249a = nrkVar;
        }

        @Override // com.facebook.react.devsupport.JSCHeapCapture.a
        public void a(JSCHeapCapture.CaptureException captureException) {
            this.f7249a.a(captureException.toString());
        }

        @Override // com.facebook.react.devsupport.JSCHeapCapture.a
        public void onSuccess(File file) {
            this.f7249a.b(file.toString());
        }
    }

    public class n implements JavaJSExecutor.Factory {
        public n() {
        }

        @Override // com.facebook.react.bridge.JavaJSExecutor.Factory
        public JavaJSExecutor create() throws Exception {
            WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
            SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
            websocketJavaScriptExecutor.c(DevSupportManagerImpl.this.mDevServerHelper.K(), DevSupportManagerImpl.this.getExecutorConnectCallback(simpleSettableFuture));
            try {
                simpleSettableFuture.get(90L, TimeUnit.SECONDS);
                return websocketJavaScriptExecutor;
            } catch (InterruptedException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (ExecutionException e2) {
                throw ((Exception) e2.getCause());
            } catch (TimeoutException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        }
    }

    public class o implements WebsocketJavaScriptExecutor.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SimpleSettableFuture f7252a;

        public o(SimpleSettableFuture simpleSettableFuture) {
            this.f7252a = simpleSettableFuture;
        }

        @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.e
        public void onFailure(Throwable th) {
            DevSupportManagerImpl.this.mDevLoadingViewController.e();
            DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
            cm8.j("ReactNative", "Failed to connect to debugger!", th);
            this.f7252a.c(new IOException(DevSupportManagerImpl.this.mApplicationContext.getString(l1j.g), th));
        }

        @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.e
        public void onSuccess() {
            this.f7252a.set(Boolean.TRUE);
            DevSupportManagerImpl.this.mDevLoadingViewController.e();
            DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
        }
    }

    public class p implements k06 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.facebook.react.devsupport.a.c f7254a;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NativeDeltaClient f7256a;

            public a(NativeDeltaClient nativeDeltaClient) {
                this.f7256a = nativeDeltaClient;
            }

            @Override // java.lang.Runnable
            public void run() {
                ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, p.this.f7254a.d());
                DevSupportManagerImpl.this.mReactInstanceManagerHelper.b(this.f7256a);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f7258a;

            public b(Exception exc) {
                this.f7258a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                Exception exc = this.f7258a;
                if (exc instanceof DebugServerException) {
                    DevSupportManagerImpl.this.showNewJavaError(((DebugServerException) exc).getMessage(), this.f7258a);
                } else {
                    DevSupportManagerImpl devSupportManagerImpl = DevSupportManagerImpl.this;
                    devSupportManagerImpl.showNewJavaError(devSupportManagerImpl.mApplicationContext.getString(l1j.t), this.f7258a);
                }
            }
        }

        public p(com.facebook.react.devsupport.a.c cVar) {
            this.f7254a = cVar;
        }

        @Override // defpackage.k06
        public void a(NativeDeltaClient nativeDeltaClient) {
            DevSupportManagerImpl.this.mDevLoadingViewController.e();
            DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
            synchronized (DevSupportManagerImpl.this) {
                DevSupportManagerImpl.this.mBundleStatus.f7327a = Boolean.TRUE;
                DevSupportManagerImpl.this.mBundleStatus.f7328b = System.currentTimeMillis();
            }
            if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                DevSupportManagerImpl.this.mBundleDownloadListener.a(nativeDeltaClient);
            }
            UiThreadUtil.runOnUiThread(new a(nativeDeltaClient));
        }

        @Override // defpackage.k06
        public void b(String str, Integer num, Integer num2) {
            DevSupportManagerImpl.this.mDevLoadingViewController.l(str, num, num2);
            if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                DevSupportManagerImpl.this.mBundleDownloadListener.b(str, num, num2);
            }
        }

        @Override // defpackage.k06
        public void onFailure(Exception exc) {
            DevSupportManagerImpl.this.mDevLoadingViewController.e();
            DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
            synchronized (DevSupportManagerImpl.this) {
                DevSupportManagerImpl.this.mBundleStatus.f7327a = Boolean.FALSE;
            }
            if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                DevSupportManagerImpl.this.mBundleDownloadListener.onFailure(exc);
            }
            cm8.j("ReactNative", "Unable to download JS bundle", exc);
            UiThreadUtil.runOnUiThread(new b(exc));
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7260a;

        public q(boolean z) {
            this.f7260a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.mDevSettings.p(this.f7260a);
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7262a;

        public r(boolean z) {
            this.f7262a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(this.f7262a);
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7264a;

        public s(boolean z) {
            this.f7264a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.mDevSettings.r(this.f7264a);
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7266a;

        public t(boolean z) {
            this.f7266a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.mDevSettings.o(this.f7266a);
        }
    }

    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerImpl.this.mDevSettings.n(!DevSupportManagerImpl.this.mDevSettings.f());
            DevSupportManagerImpl.this.mReactInstanceManagerHelper.toggleElementInspector();
        }
    }

    public class v implements q2m.a {
        public v() {
        }

        @Override // q2m.a
        public void onShake() {
            DevSupportManagerImpl.this.showDevOptionsDialog();
        }
    }

    public class w implements com.facebook.react.devsupport.c.k {
        public w() {
        }

        @Override // com.facebook.react.devsupport.c.k
        public void a() {
            DevSupportManagerImpl.this.handleReloadJS();
        }
    }

    public class x extends BroadcastReceiver {
        public x() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (DevSupportManagerImpl.getReloadAppAction(context).equals(intent.getAction())) {
                if (intent.getBooleanExtra("jsproxy", false)) {
                    DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(true);
                    DevSupportManagerImpl.this.mDevServerHelper.N();
                } else {
                    DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(false);
                }
                DevSupportManagerImpl.this.handleReloadJS();
            }
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7273b;
        public final /* synthetic */ String c;

        public y(int i, ReadableArray readableArray, String str) {
            this.f7272a = i;
            this.f7273b = readableArray;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DevSupportManagerImpl.this.mRedBoxDialog != null && DevSupportManagerImpl.this.mRedBoxDialog.isShowing() && this.f7272a == DevSupportManagerImpl.this.mLastErrorCookie) {
                m8o[] m8oVarArrB = p8o.b(this.f7273b);
                Pair pairProcessErrorCustomizers = DevSupportManagerImpl.this.processErrorCustomizers(Pair.create(this.c, m8oVarArrB));
                DevSupportManagerImpl.this.mRedBoxDialog.k((String) pairProcessErrorCustomizers.first, (m8o[]) pairProcessErrorCustomizers.second);
                DevSupportManagerImpl.this.updateLastErrorInfo(this.c, m8oVarArrB, this.f7272a, e0.JS);
                if (DevSupportManagerImpl.this.mRedBoxHandler != null) {
                    DevSupportManagerImpl.this.mRedBoxHandler.c(this.c, m8oVarArrB, RedBoxHandler.ErrorType.JS);
                    DevSupportManagerImpl.this.mRedBoxDialog.j();
                }
                DevSupportManagerImpl.this.mRedBoxDialog.show();
            }
        }
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m8o[] f7275b;
        public final /* synthetic */ int c;
        public final /* synthetic */ e0 d;

        public z(String str, m8o[] m8oVarArr, int i, e0 e0Var) {
            this.f7274a = str;
            this.f7275b = m8oVarArr;
            this.c = i;
            this.d = e0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DevSupportManagerImpl.this.mRedBoxDialog == null) {
                Activity activityD = DevSupportManagerImpl.this.mReactInstanceManagerHelper.d();
                if (activityD == null || activityD.isFinishing()) {
                    cm8.i("ReactNative", "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + this.f7274a);
                    return;
                }
                DevSupportManagerImpl devSupportManagerImpl = DevSupportManagerImpl.this;
                DevSupportManagerImpl devSupportManagerImpl2 = DevSupportManagerImpl.this;
                devSupportManagerImpl.mRedBoxDialog = new com.facebook.react.devsupport.g(activityD, devSupportManagerImpl2, devSupportManagerImpl2.mRedBoxHandler);
            }
            if (DevSupportManagerImpl.this.mRedBoxDialog.isShowing()) {
                return;
            }
            Pair pairProcessErrorCustomizers = DevSupportManagerImpl.this.processErrorCustomizers(Pair.create(this.f7274a, this.f7275b));
            DevSupportManagerImpl.this.mRedBoxDialog.k((String) pairProcessErrorCustomizers.first, (m8o[]) pairProcessErrorCustomizers.second);
            DevSupportManagerImpl.this.updateLastErrorInfo(this.f7274a, this.f7275b, this.c, this.d);
            if (DevSupportManagerImpl.this.mRedBoxHandler != null && this.d == e0.NATIVE) {
                DevSupportManagerImpl.this.mRedBoxHandler.c(this.f7274a, this.f7275b, RedBoxHandler.ErrorType.NATIVE);
            }
            DevSupportManagerImpl.this.mRedBoxDialog.j();
            DevSupportManagerImpl.this.mRedBoxDialog.show();
        }
    }

    public DevSupportManagerImpl(Context context, kdj kdjVar, String str, boolean z2, int i2) {
        this(context, kdjVar, str, z2, null, null, i2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebsocketJavaScriptExecutor.e getExecutorConnectCallback(SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new o(simpleSettableFuture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getReloadAppAction(Context context) {
        return context.getPackageName() + RELOAD_APP_ACTION_SUFFIX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCaptureHeap(nrk nrkVar) {
        ReactContext reactContext = this.mCurrentContext;
        if (reactContext == null) {
            return;
        }
        ((JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)).captureHeap(this.mApplicationContext.getCacheDir().getPath(), new m(nrkVar));
    }

    private void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.mDevOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.mDevOptionsDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<String, m8o[]> processErrorCustomizers(Pair<String, m8o[]> pair) {
        List<gd8> list = this.mErrorCustomizers;
        if (list == null) {
            return pair;
        }
        Iterator<gd8> it = list.iterator();
        while (it.hasNext()) {
            Pair<String, m8o[]> pairA = it.next().a(pair);
            if (pairA != null) {
                pair = pairA;
            }
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reload() {
        UiThreadUtil.assertOnUiThread();
        if (!this.mIsDevSupportEnabled) {
            mr5 mr5Var = this.mDebugOverlayController;
            if (mr5Var != null) {
                mr5Var.i(false);
            }
            if (this.mIsShakeDetectorStarted) {
                this.mShakeDetector.f();
                this.mIsShakeDetectorStarted = false;
            }
            if (this.mIsReceiverRegistered) {
                this.mApplicationContext.unregisterReceiver(this.mReloadAppBroadcastReceiver);
                this.mIsReceiverRegistered = false;
            }
            hideRedboxDialog();
            hideDevOptionsDialog();
            this.mDevLoadingViewController.e();
            this.mDevServerHelper.p();
            this.mDevServerHelper.Q();
            return;
        }
        mr5 mr5Var2 = this.mDebugOverlayController;
        if (mr5Var2 != null) {
            mr5Var2.i(this.mDevSettings.g());
        }
        if (!this.mIsShakeDetectorStarted) {
            this.mShakeDetector.e((SensorManager) this.mApplicationContext.getSystemService("sensor"));
            this.mIsShakeDetectorStarted = true;
        }
        if (!this.mIsReceiverRegistered) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(getReloadAppAction(this.mApplicationContext));
            this.mApplicationContext.registerReceiver(this.mReloadAppBroadcastReceiver, intentFilter);
            this.mIsReceiverRegistered = true;
        }
        if (this.mDevLoadingViewVisible) {
            this.mDevLoadingViewController.k("Reloading...");
        }
        this.mDevServerHelper.P(getClass().getSimpleName(), this);
        if (this.mDevSettings.l()) {
            this.mDevServerHelper.startPollingOnChangeEndpoint(new w());
        } else {
            this.mDevServerHelper.Q();
        }
    }

    private void reloadJSInProxyMode() {
        this.mDevServerHelper.N();
        this.mReactInstanceManagerHelper.c(new n());
    }

    private void resetCurrentContext(ReactContext reactContext) {
        if (this.mCurrentContext == reactContext) {
            return;
        }
        this.mCurrentContext = reactContext;
        mr5 mr5Var = this.mDebugOverlayController;
        if (mr5Var != null) {
            mr5Var.i(false);
        }
        if (reactContext != null) {
            this.mDebugOverlayController = new mr5(reactContext);
        }
        if (this.mCurrentContext != null) {
            try {
                URL url = new URL(getSourceUrl());
                ((HMRClient) this.mCurrentContext.getJSModule(HMRClient.class)).setup(PluginPackageConstant.RN_DIR_A, url.getPath().substring(1), url.getHost(), url.getPort(), this.mDevSettings.h());
            } catch (MalformedURLException e2) {
                showNewJavaError(e2.getMessage(), e2);
            }
        }
        reloadSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNewError(String str, m8o[] m8oVarArr, int i2, e0 e0Var) {
        UiThreadUtil.runOnUiThread(new z(str, m8oVarArr, i2, e0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleJSSamplingProfiler() {
        JavaScriptExecutorFactory javaScriptExecutorFactoryA = this.mReactInstanceManagerHelper.a();
        try {
            if (!this.mIsSamplingProfilerEnabled) {
                try {
                    try {
                        javaScriptExecutorFactoryA.startSamplingProfiler();
                        Toast.makeText(this.mApplicationContext, "Starting Sampling Profiler", 0).show();
                    } catch (UnsupportedOperationException unused) {
                        Toast.makeText(this.mApplicationContext, javaScriptExecutorFactoryA.toString() + " does not support Sampling Profiler", 1).show();
                    }
                    return;
                } finally {
                    this.mIsSamplingProfilerEnabled = true;
                }
            }
            try {
                String path = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.mApplicationContext.getCacheDir()).getPath();
                javaScriptExecutorFactoryA.stopSamplingProfiler(path);
                Toast.makeText(this.mApplicationContext, "Saved results from Profiler to " + path, 1).show();
            } catch (IOException unused2) {
                cm8.i("ReactNative", "Could not create temporary file for saving results from Sampling Profiler");
            } catch (UnsupportedOperationException unused3) {
                Toast.makeText(this.mApplicationContext, javaScriptExecutorFactoryA.toString() + "does not support Sampling Profiler", 1).show();
            }
        } finally {
            this.mIsSamplingProfilerEnabled = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLastErrorInfo(String str, m8o[] m8oVarArr, int i2, e0 e0Var) {
        this.mLastErrorTitle = str;
        this.mLastErrorStack = m8oVarArr;
        this.mLastErrorCookie = i2;
        this.mLastErrorType = e0Var;
    }

    public void addCustomDevOption(String str, m06 m06Var) {
        this.mCustomDevOptions.put(str, m06Var);
    }

    @Override // com.facebook.react.devsupport.c.l
    public Map<String, nok> customCommandHandlers() {
        return this.mCustomPackagerCommandHandlers;
    }

    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return this.mDevServerHelper.y(str, file);
    }

    @Override // defpackage.n06
    public p06 getDevSettings() {
        return this.mDevSettings;
    }

    @Override // defpackage.n06
    public boolean getDevSupportEnabled() {
        return this.mIsDevSupportEnabled;
    }

    @Override // defpackage.n06
    public String getDownloadedJSBundleFile() {
        return this.mJSBundleTempFile.getAbsolutePath();
    }

    @Override // defpackage.n06
    public String getJSBundleURLForRemoteDebugging() {
        return this.mDevServerHelper.G((String) sk1.c(this.mJSAppBundleName));
    }

    @Override // defpackage.n06
    public m8o[] getLastErrorStack() {
        return this.mLastErrorStack;
    }

    @Override // defpackage.n06
    public String getLastErrorTitle() {
        return this.mLastErrorTitle;
    }

    public String getSourceMapUrl() {
        String str = this.mJSAppBundleName;
        return str == null ? "" : this.mDevServerHelper.I((String) sk1.c(str));
    }

    @Override // defpackage.n06
    public String getSourceUrl() {
        String str = this.mJSAppBundleName;
        return str == null ? "" : this.mDevServerHelper.J((String) sk1.c(str));
    }

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        if (!this.mIsDevSupportEnabled) {
            this.mDefaultNativeModuleCallExceptionHandler.handleException(exc);
            return;
        }
        Iterator<f0> it = this.mExceptionLoggers.iterator();
        while (it.hasNext()) {
            it.next().a(exc);
        }
    }

    @Override // defpackage.n06
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, this.mDevSettings.c().a());
        hideRedboxDialog();
        if (!this.mDevSettings.b()) {
            c9i.a().a(ycj.c, "RNCore: load from Server");
            reloadJSFromServer(this.mDevServerHelper.C((String) sk1.c(this.mJSAppBundleName)));
        } else {
            c9i.a().a(ycj.c, "RNCore: load from Proxy");
            this.mDevLoadingViewController.h();
            this.mDevLoadingViewVisible = true;
            reloadJSInProxyMode();
        }
    }

    public boolean hasBundleInAssets(String str) {
        try {
            for (String str2 : this.mApplicationContext.getAssets().list("")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        } catch (IOException unused) {
            cm8.i("ReactNative", "Error while loading assets list");
        }
        return false;
    }

    @Override // defpackage.n06
    public boolean hasUpToDateJSBundleInCache() {
        if (this.mIsDevSupportEnabled && this.mJSBundleTempFile.exists()) {
            try {
                String packageName = this.mApplicationContext.getPackageName();
                if (this.mJSBundleTempFile.lastModified() > this.mApplicationContext.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, EXOPACKAGE_LOCATION_FORMAT, packageName));
                    return !file.exists() || this.mJSBundleTempFile.lastModified() > file.lastModified();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                cm8.i("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @Override // defpackage.n06
    public void hideRedboxDialog() {
        com.facebook.react.devsupport.g gVar = this.mRedBoxDialog;
        if (gVar != null) {
            gVar.dismiss();
            this.mRedBoxDialog = null;
        }
    }

    @Override // defpackage.n06
    public void isPackagerRunning(mhh mhhVar) {
        this.mDevServerHelper.M(mhhVar);
    }

    @Override // com.facebook.react.devsupport.c.l
    public void onCaptureHeapCommand(nrk nrkVar) {
        UiThreadUtil.runOnUiThread(new l(nrkVar));
    }

    @Override // com.facebook.react.devsupport.b.a
    public void onInternalSettingsChanged() {
        reloadSettings();
    }

    @Override // defpackage.n06
    public void onNewReactContextCreated(ReactContext reactContext) {
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.c.l
    public void onPackagerConnected() {
    }

    @Override // com.facebook.react.devsupport.c.l
    public void onPackagerDevMenuCommand() {
        UiThreadUtil.runOnUiThread(new j());
    }

    @Override // com.facebook.react.devsupport.c.l
    public void onPackagerDisconnected() {
    }

    @Override // com.facebook.react.devsupport.c.l
    public void onPackagerReloadCommand() {
        this.mDevServerHelper.w();
        UiThreadUtil.runOnUiThread(new i());
    }

    @Override // defpackage.n06
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        if (reactContext == this.mCurrentContext) {
            resetCurrentContext(null);
        }
    }

    public void registerErrorCustomizer(gd8 gd8Var) {
        if (this.mErrorCustomizers == null) {
            this.mErrorCustomizers = new ArrayList();
        }
        this.mErrorCustomizers.add(gd8Var);
    }

    public void reloadJSFromServer(String str) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        this.mDevLoadingViewController.i(str);
        this.mDevLoadingViewVisible = true;
        com.facebook.react.devsupport.a.c cVar = new com.facebook.react.devsupport.a.c();
        this.mDevServerHelper.x(new p(cVar), this.mJSBundleTempFile, str, cVar);
    }

    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new h());
        }
    }

    @Override // defpackage.n06
    public void setDevSupportEnabled(boolean z2) {
        this.mIsDevSupportEnabled = z2;
        reloadSettings();
    }

    @Override // defpackage.n06
    public void setFpsDebugEnabled(boolean z2) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new t(z2));
        }
    }

    @Override // defpackage.n06
    public void setHotModuleReplacementEnabled(boolean z2) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new q(z2));
        }
    }

    @Override // defpackage.n06
    public void setReloadOnJSChangeEnabled(boolean z2) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new s(z2));
        }
    }

    @Override // defpackage.n06
    public void setRemoteJSDebugEnabled(boolean z2) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new r(z2));
        }
    }

    @Override // defpackage.n06
    public void showDevOptionsDialog() {
        String string;
        if (this.mDevOptionsDialog == null && this.mIsDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(this.mApplicationContext.getString(l1j.s), new a0());
            if (this.mDevSettings.k()) {
                string = this.mDevSettings.b() ? this.mApplicationContext.getString(l1j.e) : this.mApplicationContext.getString(l1j.d);
            } else {
                string = this.mDevSettings.b() ? this.mApplicationContext.getString(l1j.j) : this.mApplicationContext.getString(l1j.c);
            }
            linkedHashMap.put(string, new b0());
            if (this.mDevSettings.k()) {
                linkedHashMap.put(this.mApplicationContext.getString(l1j.h), new c0());
            }
            linkedHashMap.put(this.mApplicationContext.getString(l1j.f24528b), new d0());
            linkedHashMap.put(this.mApplicationContext.getString(l1j.o), new a());
            linkedHashMap.put(this.mDevSettings.h() ? this.mApplicationContext.getString(l1j.n) : this.mApplicationContext.getString(l1j.f24529k), new b());
            linkedHashMap.put(this.mIsSamplingProfilerEnabled ? this.mApplicationContext.getString(l1j.u) : this.mApplicationContext.getString(l1j.v), new c());
            linkedHashMap.put(this.mDevSettings.g() ? this.mApplicationContext.getString(l1j.f24530r) : this.mApplicationContext.getString(l1j.q), new d());
            linkedHashMap.put(this.mApplicationContext.getString(l1j.w), new e());
            if (this.mCustomDevOptions.size() > 0) {
                linkedHashMap.putAll(this.mCustomDevOptions);
            }
            m06[] m06VarArr = (m06[]) linkedHashMap.values().toArray(new m06[0]);
            Activity activityD = this.mReactInstanceManagerHelper.d();
            if (activityD == null || activityD.isFinishing()) {
                cm8.i("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activityD).setItems((CharSequence[]) linkedHashMap.keySet().toArray(new String[0]), new g(m06VarArr)).setOnCancelListener(new f()).create();
            this.mDevOptionsDialog = alertDialogCreate;
            alertDialogCreate.show();
        }
    }

    @Override // defpackage.n06
    public void showNewJSError(String str, ReadableArray readableArray, int i2) {
        showNewError(str, p8o.b(readableArray), i2, e0.JS);
    }

    public void showNewJavaError(String str, Throwable th) {
        cm8.j("ReactNative", "Exception in native call", th);
        showNewError(str, p8o.a(th), -1, e0.NATIVE);
    }

    @Override // defpackage.n06
    public void startInspector() {
        if (this.mIsDevSupportEnabled) {
            this.mDevServerHelper.O();
        }
    }

    @Override // defpackage.n06
    public void stopInspector() {
        this.mDevServerHelper.o();
    }

    @Override // defpackage.n06
    public void toggleElementInspector() {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new u());
        }
    }

    @Override // defpackage.n06
    public void updateJSError(String str, ReadableArray readableArray, int i2) {
        UiThreadUtil.runOnUiThread(new y(i2, readableArray, str));
    }

    public DevSupportManagerImpl(Context context, kdj kdjVar, String str, boolean z2, RedBoxHandler redBoxHandler, k06 k06Var, int i2, Map<String, nok> map) {
        this.mIsSamplingProfilerEnabled = false;
        ArrayList arrayList = new ArrayList();
        this.mExceptionLoggers = arrayList;
        this.mCustomDevOptions = new LinkedHashMap<>();
        this.mDevLoadingViewVisible = false;
        this.mIsReceiverRegistered = false;
        this.mIsShakeDetectorStarted = false;
        this.mIsDevSupportEnabled = false;
        this.mLastErrorCookie = 0;
        this.mReactInstanceManagerHelper = kdjVar;
        this.mApplicationContext = context;
        this.mJSAppBundleName = str;
        this.mDevSettings = new com.facebook.react.devsupport.b(context, this);
        this.mBundleStatus = new com.facebook.react.devsupport.d.b();
        this.mDevServerHelper = new com.facebook.react.devsupport.c(this.mDevSettings, context.getPackageName(), new k());
        this.mBundleDownloadListener = k06Var;
        this.mShakeDetector = new q2m(new v(), i2);
        this.mCustomPackagerCommandHandlers = map;
        this.mReloadAppBroadcastReceiver = new x();
        this.mJSBundleTempFile = new File(context.getFilesDir(), JS_BUNDLE_FILE_NAME);
        this.mDefaultNativeModuleCallExceptionHandler = new DefaultNativeModuleCallExceptionHandler();
        setDevSupportEnabled(z2);
        this.mRedBoxHandler = redBoxHandler;
        this.mDevLoadingViewController = new l06(context, kdjVar);
        arrayList.add(new g0(this, null));
        if (this.mDevSettings.m()) {
            if (!this.mIsSamplingProfilerEnabled) {
                toggleJSSamplingProfiler();
            } else {
                Toast.makeText(context, "JS Sampling Profiler was already running, so did not start the sampling profiler", 1).show();
            }
        }
    }
}
