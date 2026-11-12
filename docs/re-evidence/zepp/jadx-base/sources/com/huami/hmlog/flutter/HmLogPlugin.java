package com.huami.hmlog.flutter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class HmLogPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private static Executor a;
    private static Executor b = new a();
    private static Context c;
    private static String d;

    public class a implements Executor {
        private Handler a = new Handler();

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.a.post(runnable);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ MethodChannel.Result a;
        public final /* synthetic */ Object b;

        public b(MethodChannel.Result result, Object obj) {
            this.a = result;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.success(this.b);
        }
    }

    public class c implements Function0<String> {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String invoke() {
            return this.a;
        }
    }

    public class d implements ThreadFactory {
        public d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "flutter-plugin-thread");
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ MethodChannel.Result a;
        public final /* synthetic */ Object b;

        public e(MethodChannel.Result result, Object obj) {
            this.a = result;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(HmLogPlugin.d);
            if (!file.exists()) {
                HmLogPlugin.this.i(this.a, "");
                return;
            }
            String strG = com.huami.hmlog.flutter.a.g((Map) this.b, "date");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                HmLogPlugin.this.i(this.a, "");
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    String strC = com.huami.hmlog.flutter.a.c(Long.parseLong(file2.getName()));
                    if (strG != null && strG.equals(strC)) {
                        HmLogPlugin.this.i(this.a, file2.getAbsolutePath());
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            HmLogPlugin.this.i(this.a, "");
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ MethodChannel.Result a;

        public f(MethodChannel.Result result) {
            this.a = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.huami.hmlog.flutter.a.a(new File(HmLogPlugin.d), false);
            } catch (Exception unused) {
            } finally {
                HmLogPlugin.this.i(this.a, null);
            }
        }
    }

    private void c() {
        if (a == null) {
            synchronized (this) {
                if (a == null) {
                    a = Executors.newSingleThreadExecutor(new d());
                }
            }
        }
    }

    private void d(MethodChannel.Result result) {
        if (com.huami.hmlog.flutter.a.i(d)) {
            result.success(null);
        } else {
            c();
            a.execute(new f(result));
        }
    }

    private void e(MethodChannel.Result result) {
        File file = new File(d);
        if (!file.exists()) {
            i(result, Collections.emptyList());
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            i(result, Collections.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            try {
                arrayList.add(file2.getAbsolutePath());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        i(result, arrayList);
    }

    private void f(MethodChannel.Result result) {
        HMLog.flush();
        result.success(null);
    }

    private void g(Object obj, MethodChannel.Result result) {
        if (!(obj instanceof Map)) {
            result.success("");
        } else if (com.huami.hmlog.flutter.a.i(d)) {
            result.success("");
        } else {
            c();
            a.execute(new e(result, obj));
        }
    }

    private void h(Object obj, MethodChannel.Result result) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            String strG = com.huami.hmlog.flutter.a.g(map, "log");
            Integer numD = com.huami.hmlog.flutter.a.d(map, "type");
            if (com.huami.hmlog.flutter.a.j(strG) && numD != null) {
                HMLog.warn("flutter_hmlog", new c(strG));
            }
        }
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(MethodChannel.Result result, Object obj) {
        b.execute(new b(result, obj));
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new MethodChannel(registrar.messenger(), BuildConfig.LIBRARY_PACKAGE_NAME).setMethodCallHandler(new HmLogPlugin());
        c = registrar.context();
    }

    public static void setLogDir(String str) {
        d = str;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        new MethodChannel(flutterPluginBinding.getBinaryMessenger(), BuildConfig.LIBRARY_PACKAGE_NAME).setMethodCallHandler(new HmLogPlugin());
        c = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "getUploadPath":
                g(methodCall.arguments, result);
                break;
            case "fetchAllLogPaths":
                e(result);
                break;
            case "log":
                h(methodCall.arguments, result);
                break;
            case "flush":
                f(result);
                break;
            case "cleanAllLogs":
                d(result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
