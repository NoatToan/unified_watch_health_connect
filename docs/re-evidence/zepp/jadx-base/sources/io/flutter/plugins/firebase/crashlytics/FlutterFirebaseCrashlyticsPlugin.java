package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes22.dex */
public class FlutterFirebaseCrashlyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    public static final String TAG = "FLTFirebaseCrashlytics";
    private MethodChannel channel;

    private Task<Map<String, Object>> checkForUnsentReports() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: i92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$checkForUnsentReports$0();
            }
        });
    }

    private void crash() {
        new Handler().postDelayed(new Runnable() { // from class: g92
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$crash$1();
            }
        }, 50L);
    }

    private Task<Void> deleteUnsentReports() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: e92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2();
            }
        });
    }

    private Task<Map<String, Object>> didCrashOnPreviousExecution() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: h92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$didCrashOnPreviousExecution$3();
            }
        });
    }

    private StackTraceElement generateStackTraceElement(Map<String, String> map) {
        try {
            String str = map.get("file");
            String str2 = map.get("line");
            String str3 = map.get(Constants.CLASS);
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(TAG, "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences getCrashlyticsSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_crashlytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCrashlyticsCollectionEnabled(FirebaseApp firebaseApp) {
        SharedPreferences crashlyticsSharedPrefs = getCrashlyticsSharedPrefs(firebaseApp.getApplicationContext());
        if (crashlyticsSharedPrefs.contains("firebase_crashlytics_collection_enabled")) {
            return crashlyticsSharedPrefs.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!firebaseApp.isDataCollectionDefaultEnabled()) {
            return false;
        }
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$checkForUnsentReports$0() throws Exception {
        return new HashMap<String, Object>(((Boolean) Tasks.await(FirebaseCrashlytics.getInstance().checkForUnsentReports())).booleanValue()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.1
            public final /* synthetic */ boolean val$unsentReports;

            {
                this.val$unsentReports = z;
                put(Constants.UNSENT_REPORTS, Boolean.valueOf(z));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crash$1() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$deleteUnsentReports$2() throws Exception {
        FirebaseCrashlytics.getInstance().deleteUnsentReports();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$didCrashOnPreviousExecution$3() throws Exception {
        return new HashMap<String, Object>(FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.2
            public final /* synthetic */ boolean val$didCrashOnPreviousExecution;

            {
                this.val$didCrashOnPreviousExecution = z;
                put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$didReinitializeFirebaseCore$12() throws Exception {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$getPluginConstantsForFirebaseApp$11(FirebaseApp firebaseApp) throws Exception {
        return new HashMap<String, Object>(firebaseApp) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.4
            public final /* synthetic */ FirebaseApp val$firebaseApp;

            {
                this.val$firebaseApp = firebaseApp;
                if (firebaseApp.getName().equals(FirebaseApp.DEFAULT_APP_NAME)) {
                    put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(FirebaseApp.getInstance())));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$log$5(Map map) throws Exception {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        FirebaseCrashlytics.getInstance().log((String) obj);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$10(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$recordError$4(Map map) throws Exception {
        FlutterError flutterError;
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Object obj = map.get(Constants.EXCEPTION);
        Objects.requireNonNull(obj);
        String str = (String) obj;
        String str2 = (String) map.get("reason");
        Object obj2 = map.get("information");
        Objects.requireNonNull(obj2);
        String str3 = (String) obj2;
        boolean zBooleanValue = ((Boolean) map.get("fatal")).booleanValue();
        if (str2 != null) {
            firebaseCrashlytics.setCustomKey(Constants.FLUTTER_ERROR_REASON, "thrown " + str2);
            flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
        } else {
            flutterError = new FlutterError(str);
        }
        if (zBooleanValue) {
            CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger((AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class));
            Bundle bundle = new Bundle();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", jCurrentTimeMillis);
            firebaseCrashlytics.setCustomKey(Constants.CRASH_EVENT_KEY, jCurrentTimeMillis);
            crashlyticsOriginAnalyticsEventLogger.logEvent("_ae", bundle);
        }
        firebaseCrashlytics.setCustomKey(Constants.FLUTTER_ERROR_EXCEPTION, str);
        ArrayList arrayList = new ArrayList();
        Object obj3 = map.get(Constants.STACK_TRACE_ELEMENTS);
        Objects.requireNonNull(obj3);
        Iterator it2 = ((List) obj3).iterator();
        while (it2.hasNext()) {
            StackTraceElement stackTraceElementGenerateStackTraceElement = generateStackTraceElement((Map) it2.next());
            if (stackTraceElementGenerateStackTraceElement != null) {
                arrayList.add(stackTraceElementGenerateStackTraceElement);
            }
        }
        flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        if (!str3.isEmpty()) {
            firebaseCrashlytics.log(str3);
        }
        firebaseCrashlytics.recordException(flutterError);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$sendUnsentReports$6() throws Exception {
        FirebaseCrashlytics.getInstance().sendUnsentReports();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$setCrashlyticsCollectionEnabled$7(Map map) throws Exception {
        Object obj = map.get(Constants.ENABLED);
        Objects.requireNonNull(obj);
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled((Boolean) obj);
        return new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.3
            {
                put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(FirebaseApp.getInstance())));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$setCustomKey$9(Map map) throws Exception {
        Object obj = map.get("key");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("value");
        Objects.requireNonNull(obj2);
        FirebaseCrashlytics.getInstance().setCustomKey((String) obj, (String) obj2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$setUserIdentifier$8(Map map) throws Exception {
        Object obj = map.get("identifier");
        Objects.requireNonNull(obj);
        FirebaseCrashlytics.getInstance().setUserId((String) obj);
        return null;
    }

    private Task<Void> log(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: m92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCrashlyticsPlugin.lambda$log$5(map);
            }
        });
    }

    private Task<Void> recordError(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: k92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$recordError$4(map);
            }
        });
    }

    private Task<Void> sendUnsentReports() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: f92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCrashlyticsPlugin.lambda$sendUnsentReports$6();
            }
        });
    }

    private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: l92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$setCrashlyticsCollectionEnabled$7(map);
            }
        });
    }

    private Task<Void> setCustomKey(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: o92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$9(map);
            }
        });
    }

    private Task<Void> setUserIdentifier(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: n92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$8(map);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        return Tasks.call(new Callable() { // from class: d92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12();
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final FirebaseApp firebaseApp) {
        return Tasks.call(new Callable() { // from class: j92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$getPluginConstantsForFirebaseApp$11(firebaseApp);
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull final MethodChannel.Result result) {
        Task taskDidCrashOnPreviousExecution;
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                taskDidCrashOnPreviousExecution = didCrashOnPreviousExecution();
                break;
            case "Crashlytics#recordError":
                taskDidCrashOnPreviousExecution = recordError((Map) methodCall.arguments());
                break;
            case "Crashlytics#checkForUnsentReports":
                taskDidCrashOnPreviousExecution = checkForUnsentReports();
                break;
            case "Crashlytics#sendUnsentReports":
                taskDidCrashOnPreviousExecution = sendUnsentReports();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                taskDidCrashOnPreviousExecution = setCrashlyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case "Crashlytics#log":
                taskDidCrashOnPreviousExecution = log((Map) methodCall.arguments());
                break;
            case "Crashlytics#setCustomKey":
                taskDidCrashOnPreviousExecution = setCustomKey((Map) methodCall.arguments());
                break;
            case "Crashlytics#deleteUnsentReports":
                taskDidCrashOnPreviousExecution = deleteUnsentReports();
                break;
            case "Crashlytics#setUserIdentifier":
                taskDidCrashOnPreviousExecution = setUserIdentifier((Map) methodCall.arguments());
                break;
            case "Crashlytics#crash":
                crash();
                return;
            default:
                result.notImplemented();
                return;
        }
        taskDidCrashOnPreviousExecution.addOnCompleteListener(new OnCompleteListener() { // from class: c92
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10(result, task);
            }
        });
    }
}
