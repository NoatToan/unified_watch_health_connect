package com.baseflow.permissionhandler;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class l implements MethodChannel.MethodCallHandler {
    private final Context a;
    private final a b;
    private final n c;
    private final o d;

    @Nullable
    private Activity e;

    public l(Context context, a aVar, n nVar, o oVar) {
        this.a = context;
        this.b = aVar;
        this.c = nVar;
        this.d = oVar;
    }

    public void i(@Nullable Activity activity) {
        this.e = activity;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NonNull MethodCall methodCall, @NonNull final MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "checkServiceStatus":
                int i = Integer.parseInt(methodCall.arguments.toString());
                o oVar = this.d;
                Context context = this.a;
                result.getClass();
                oVar.a(i, context, new o.a() { // from class: com.baseflow.permissionhandler.k
                    @Override // com.baseflow.permissionhandler.o.a
                    public final void onSuccess(int i2) {
                        result.success(Integer.valueOf(i2));
                    }
                }, new b() { // from class: com.baseflow.permissionhandler.e
                    @Override // com.baseflow.permissionhandler.b
                    public final void onError(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "shouldShowRequestPermissionRationale":
                int i2 = Integer.parseInt(methodCall.arguments.toString());
                n nVar = this.c;
                Activity activity = this.e;
                result.getClass();
                nVar.h(i2, activity, new n.c() { // from class: com.baseflow.permissionhandler.j
                    @Override // com.baseflow.permissionhandler.n.c
                    public final void onSuccess(boolean z) {
                        result.success(Boolean.valueOf(z));
                    }
                }, new b() { // from class: com.baseflow.permissionhandler.g
                    @Override // com.baseflow.permissionhandler.b
                    public final void onError(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "checkPermissionStatus":
                int i3 = Integer.parseInt(methodCall.arguments.toString());
                n nVar2 = this.c;
                Context context2 = this.a;
                result.getClass();
                nVar2.c(i3, context2, new n.a() { // from class: com.baseflow.permissionhandler.h
                    @Override // com.baseflow.permissionhandler.n.a
                    public final void onSuccess(int i4) {
                        result.success(Integer.valueOf(i4));
                    }
                });
                break;
            case "openAppSettings":
                a aVar = this.b;
                Context context3 = this.a;
                result.getClass();
                aVar.a(context3, new a.InterfaceC0116a() { // from class: com.baseflow.permissionhandler.c
                    @Override // com.baseflow.permissionhandler.a.InterfaceC0116a
                    public final void onSuccess(boolean z) {
                        result.success(Boolean.valueOf(z));
                    }
                }, new b() { // from class: com.baseflow.permissionhandler.f
                    @Override // com.baseflow.permissionhandler.b
                    public final void onError(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "requestPermissions":
                List<Integer> list = (List) methodCall.arguments();
                n nVar3 = this.c;
                Activity activity2 = this.e;
                result.getClass();
                nVar3.g(list, activity2, new n.b() { // from class: com.baseflow.permissionhandler.i
                    @Override // com.baseflow.permissionhandler.n.b
                    public final void onSuccess(Map map) {
                        result.success(map);
                    }
                }, new b() { // from class: com.baseflow.permissionhandler.d
                    @Override // com.baseflow.permissionhandler.b
                    public final void onError(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
