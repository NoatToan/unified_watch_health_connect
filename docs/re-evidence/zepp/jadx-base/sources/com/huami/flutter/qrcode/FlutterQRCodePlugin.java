package com.huami.flutter.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.flutter.qrcode.FlutterQRCodePlugin;
import com.huami.lib.qrcode.QRCodeActivity;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: loaded from: classes9.dex */
public class FlutterQRCodePlugin implements FlutterPlugin, ActivityAware, PigeonQRCode.Api, PluginRegistry.ActivityResultListener {
    private static final String c = "FlutterQRCodePlugin";
    private Activity a;
    private PigeonQRCode.OnScanResultCallback b;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Void r1) {
        Log.d(c, "✅===> 发送扫码结果成功");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 49374 || i2 != -1) {
            return false;
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        if (this.b == null || TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        this.b.onScanResult(stringExtra, new PigeonQRCode.OnScanResultCallback.Reply() { // from class: s92
            @Override // com.huami.flutter.qrcode.PigeonQRCode.OnScanResultCallback.Reply
            public final void reply(Object obj) {
                FlutterQRCodePlugin.b((Void) obj);
            }
        });
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        Log.d(c, "✅===> onAttachedToActivity");
        this.a = activityPluginBinding.getActivity();
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.d(c, "✅===> onAttachedToEngine");
        a.d(flutterPluginBinding.getBinaryMessenger(), this);
        this.b = new PigeonQRCode.OnScanResultCallback(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        Log.d(c, "✅===> onDetachedFromActivity");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        Log.d(c, "✅===> onDetachedFromActivityForConfigChanges");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.d(c, "✅===> onDetachedFromEngine");
        a.d(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        Log.d(c, "✅===> onReattachedToActivityForConfigChanges");
    }

    @Override // com.huami.flutter.qrcode.PigeonQRCode.Api
    public void startScanActivity() {
        this.a.startActivityForResult(new Intent(this.a, (Class<?>) QRCodeActivity.class), 49374);
    }
}
