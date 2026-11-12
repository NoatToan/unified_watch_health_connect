package com.baseflow.permissionhandler;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: loaded from: classes2.dex */
public final class PermissionHandlerPlugin implements FlutterPlugin, ActivityAware {
    private final n a = new n();
    private MethodChannel b;

    @Nullable
    private PluginRegistry.Registrar c;

    @Nullable
    private ActivityPluginBinding d;

    @Nullable
    private l e;

    private void a() {
        ActivityPluginBinding activityPluginBinding = this.d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.a);
            this.d.removeRequestPermissionsResultListener(this.a);
        }
    }

    private void b() {
        PluginRegistry.Registrar registrar = this.c;
        if (registrar != null) {
            registrar.addActivityResultListener(this.a);
            this.c.addRequestPermissionsResultListener(this.a);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.d;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.a);
            this.d.addRequestPermissionsResultListener(this.a);
        }
    }

    private void c(Context context, BinaryMessenger binaryMessenger) {
        this.b = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.a, new o());
        this.e = lVar;
        this.b.setMethodCallHandler(lVar);
    }

    private void d(Activity activity) {
        l lVar = this.e;
        if (lVar != null) {
            lVar.i(activity);
        }
    }

    private void e() {
        this.b.setMethodCallHandler(null);
        this.b = null;
        this.e = null;
    }

    private void f() {
        l lVar = this.e;
        if (lVar != null) {
            lVar.i(null);
        }
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        PermissionHandlerPlugin permissionHandlerPlugin = new PermissionHandlerPlugin();
        permissionHandlerPlugin.c = registrar;
        permissionHandlerPlugin.b();
        permissionHandlerPlugin.c(registrar.context(), registrar.messenger());
        if (registrar.activeContext() instanceof Activity) {
            permissionHandlerPlugin.d(registrar.activity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        d(activityPluginBinding.getActivity());
        this.d = activityPluginBinding;
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        f();
        a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
