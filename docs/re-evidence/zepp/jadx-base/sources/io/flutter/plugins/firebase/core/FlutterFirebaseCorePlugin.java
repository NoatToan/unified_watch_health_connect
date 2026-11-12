package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes22.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String CHANNEL_NAME = "plugins.flutter.io/firebase_core";
    private static final String KEY_API_KEY = "apiKey";
    private static final String KEY_APP_ID = "appId";
    private static final String KEY_APP_NAME = "appName";
    private static final String KEY_DATABASE_URL = "databaseURL";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_IS_AUTOMATIC_DATA_COLLECTION_ENABLED = "isAutomaticDataCollectionEnabled";
    private static final String KEY_MESSAGING_SENDER_ID = "messagingSenderId";
    private static final String KEY_NAME = "name";
    private static final String KEY_OPTIONS = "options";
    private static final String KEY_PLUGIN_CONSTANTS = "pluginConstants";
    private static final String KEY_PROJECT_ID = "projectId";
    private static final String KEY_STORAGE_BUCKET = "storageBucket";
    private static final String KEY_TRACKING_ID = "trackingId";
    private Context applicationContext;
    private MethodChannel channel;
    private boolean coreInitialized = false;

    public FlutterFirebaseCorePlugin() {
    }

    private Task<Void> deleteApp(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: b92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCorePlugin.lambda$deleteApp$5(map);
            }
        });
    }

    private Task<Map<String, Object>> firebaseAppToMap(final FirebaseApp firebaseApp) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: w82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCorePlugin.lambda$firebaseAppToMap$0(firebaseApp);
            }
        });
    }

    private Task<Map<String, Object>> initializeApp(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: y82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$initializeApp$1(map);
            }
        });
    }

    private Task<List<Map<String, Object>>> initializeCore() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: x82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$initializeCore$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$deleteApp$5(Map map) throws Exception {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        try {
            FirebaseApp.getInstance((String) obj).delete();
            return null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$firebaseAppToMap$0(FirebaseApp firebaseApp) throws Exception {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        FirebaseOptions options = firebaseApp.getOptions();
        map2.put("apiKey", options.getApiKey());
        map2.put("appId", options.getApplicationId());
        if (options.getGcmSenderId() != null) {
            map2.put(KEY_MESSAGING_SENDER_ID, options.getGcmSenderId());
        }
        if (options.getProjectId() != null) {
            map2.put(KEY_PROJECT_ID, options.getProjectId());
        }
        if (options.getDatabaseUrl() != null) {
            map2.put(KEY_DATABASE_URL, options.getDatabaseUrl());
        }
        if (options.getStorageBucket() != null) {
            map2.put(KEY_STORAGE_BUCKET, options.getStorageBucket());
        }
        if (options.getGaTrackingId() != null) {
            map2.put(KEY_TRACKING_ID, options.getGaTrackingId());
        }
        map.put("name", firebaseApp.getName());
        map.put("options", map2);
        map.put(KEY_IS_AUTOMATIC_DATA_COLLECTION_ENABLED, Boolean.valueOf(firebaseApp.isDataCollectionDefaultEnabled()));
        map.put(KEY_PLUGIN_CONSTANTS, Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(firebaseApp)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$initializeApp$1(Map map) throws Exception {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        Object obj2 = map.get("options");
        Objects.requireNonNull(obj2);
        Map map2 = (Map) obj2;
        FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
        Object obj3 = map2.get("apiKey");
        Objects.requireNonNull(obj3);
        FirebaseOptions.Builder apiKey = builder.setApiKey((String) obj3);
        Object obj4 = map2.get("appId");
        Objects.requireNonNull(obj4);
        FirebaseOptions firebaseOptionsBuild = apiKey.setApplicationId((String) obj4).setDatabaseUrl((String) map2.get(KEY_DATABASE_URL)).setGcmSenderId((String) map2.get(KEY_MESSAGING_SENDER_ID)).setProjectId((String) map2.get(KEY_PROJECT_ID)).setStorageBucket((String) map2.get(KEY_STORAGE_BUCKET)).setGaTrackingId((String) map2.get(KEY_TRACKING_ID)).build();
        try {
            Looper.prepare();
        } catch (Exception unused) {
        }
        return (Map) Tasks.await(firebaseAppToMap(FirebaseApp.initializeApp(this.applicationContext, firebaseOptionsBuild, str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$initializeCore$2() throws Exception {
        if (this.coreInitialized) {
            Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
        } else {
            this.coreInitialized = true;
        }
        List<FirebaseApp> apps = FirebaseApp.getApps(this.applicationContext);
        ArrayList arrayList = new ArrayList(apps.size());
        Iterator<FirebaseApp> it2 = apps.iterator();
        while (it2.hasNext()) {
            arrayList.add(Tasks.await(firebaseAppToMap(it2.next())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$6(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_core", exception != null ? exception.getMessage() : null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$setAutomaticDataCollectionEnabled$3(Map map) throws Exception {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("enabled");
        Objects.requireNonNull(obj2);
        FirebaseApp.getInstance((String) obj).setDataCollectionDefaultEnabled((Boolean) obj2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$setAutomaticResourceManagementEnabled$4(Map map) throws Exception {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("enabled");
        Objects.requireNonNull(obj2);
        FirebaseApp.getInstance((String) obj).setAutomaticResourceManagementEnabled(((Boolean) obj2).booleanValue());
        return null;
    }

    private Task<Void> setAutomaticDataCollectionEnabled(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: a92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$3(map);
            }
        });
    }

    private Task<Void> setAutomaticResourceManagementEnabled(final Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: z82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$4(map);
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.applicationContext = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull final MethodChannel.Result result) {
        Task taskInitializeCore;
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "Firebase#initializeCore":
                taskInitializeCore = initializeCore();
                break;
            case "FirebaseApp#setAutomaticDataCollectionEnabled":
                taskInitializeCore = setAutomaticDataCollectionEnabled((Map) methodCall.arguments());
                break;
            case "Firebase#initializeApp":
                taskInitializeCore = initializeApp((Map) methodCall.arguments());
                break;
            case "FirebaseApp#delete":
                taskInitializeCore = deleteApp((Map) methodCall.arguments());
                break;
            case "FirebaseApp#setAutomaticResourceManagementEnabled":
                taskInitializeCore = setAutomaticResourceManagementEnabled((Map) methodCall.arguments());
                break;
            default:
                result.notImplemented();
                return;
        }
        taskInitializeCore.addOnCompleteListener(new OnCompleteListener() { // from class: v82
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseCorePlugin.lambda$onMethodCall$6(result, task);
            }
        });
    }

    private FlutterFirebaseCorePlugin(Context context) {
        this.applicationContext = context;
    }
}
