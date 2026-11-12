package io.flutter.plugins.connectivity;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes22.dex */
class ConnectivityMethodChannelHandler implements MethodChannel.MethodCallHandler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private Connectivity connectivity;

    public ConnectivityMethodChannelHandler(Connectivity connectivity) {
        this.connectivity = connectivity;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("check")) {
            result.success(this.connectivity.getNetworkType());
        } else {
            result.notImplemented();
        }
    }
}
