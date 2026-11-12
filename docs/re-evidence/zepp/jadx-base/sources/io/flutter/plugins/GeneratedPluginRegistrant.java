package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.baseflow.permissionhandler.PermissionHandlerPlugin;
import com.huami.flutter.appletcompanionplugin.AppletCompanionPlugin;
import com.huami.flutter.bluechannelplugin.BlueChannelPlugin;
import com.huami.flutter.commonchannelplugin.CommonChannelPlugin;
import com.huami.flutter.qrcode.FlutterQRCodePlugin;
import com.huami.hmlog.flutter.HmLogPlugin;
import com.tekartik.sqflite.SqflitePlugin;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.connectivity.ConnectivityPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin;

/* JADX INFO: loaded from: classes22.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new AppletCompanionPlugin());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin applet_companion_plugin, com.huami.flutter.appletcompanionplugin.AppletCompanionPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add(new BlueChannelPlugin());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin blue_channel_plugin, com.huami.flutter.bluechannelplugin.BlueChannelPlugin", e2);
        }
        try {
            flutterEngine.getPlugins().add(new CommonChannelPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin common_channel_plugin, com.huami.flutter.commonchannelplugin.CommonChannelPlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add(new ConnectivityPlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin connectivity, io.flutter.plugins.connectivity.ConnectivityPlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add(new HmLogPlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin flutter_hmlog, com.huami.hmlog.flutter.HmLogPlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterQRCodePlugin());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin flutter_qrcode, com.huami.flutter.qrcode.FlutterQRCodePlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterToastPlugin());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin path_provider, io.flutter.plugins.pathprovider.PathProviderPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new PermissionHandlerPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin permission_handler, com.baseflow.permissionhandler.PermissionHandlerPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new SqflitePlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e13);
        }
    }
}
