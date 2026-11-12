package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes22.dex */
@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static Task<Void> didReinitializeFirebaseCore() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: q92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1();
            }
        });
    }

    public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final FirebaseApp firebaseApp) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: p92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(firebaseApp);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$didReinitializeFirebaseCore$1() throws Exception {
        Iterator<Map.Entry<String, FlutterFirebasePlugin>> it2 = registeredPlugins.entrySet().iterator();
        while (it2.hasNext()) {
            Tasks.await(it2.next().getValue().didReinitializeFirebaseCore());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getPluginConstantsForFirebaseApp$0(FirebaseApp firebaseApp) throws Exception {
        Map<String, FlutterFirebasePlugin> map = registeredPlugins;
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
            map2.put(entry.getKey(), Tasks.await(entry.getValue().getPluginConstantsForFirebaseApp(firebaseApp)));
        }
        return map2;
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
