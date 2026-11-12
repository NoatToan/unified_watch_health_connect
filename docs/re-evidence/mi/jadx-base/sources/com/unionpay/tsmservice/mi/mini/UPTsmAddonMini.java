package com.unionpay.tsmservice.mi.mini;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.miui.tsmclient.util.Constants;
import com.unionpay.tsmservice.mi.mini.data.Constant;
import com.unionpay.tsmservice.mi.mini.request.QueryVendorPayStatusRequestParams;
import com.unionpay.tsmservice.mi.mini.request.wrapper.BaseRequestParamsWrapper;
import com.unionpay.tsmservice.mi.mini.request.wrapper.QueryVendorPayStatusRequestParamsWrapper;
import com.unionpay.tsmservice.mi.mini.result.wrapper.BaseResultCallbackWrapper;
import com.unionpay.tsmservice.mi.mini.result.wrapper.QueryVendorPayStatusResultCallbackWrapper;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class UPTsmAddonMini {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UPTsmAddonMini f10791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CopyOnWriteArrayList f10792b;
    private final Handler.Callback c;
    private ITsmServiceMini d;
    private final Handler e;
    private Context f;
    private ServiceConnection g;
    private boolean h;

    public interface UPTsmConnectionListener {
        void onTsmConnected();

        void onTsmDisconnected();
    }

    final class a {
        private final String c;
        private final BaseRequestParamsWrapper d;
        private final BaseResultCallbackWrapper e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10796b = 4001;
        private final ITsmProgressCallback f = null;

        public a(String str, BaseRequestParamsWrapper baseRequestParamsWrapper, BaseResultCallbackWrapper baseResultCallbackWrapper) {
            this.c = str;
            this.d = baseRequestParamsWrapper;
            this.e = baseResultCallbackWrapper;
        }

        public final int a() {
            if (!UPTsmAddonMini.this.a(this.c)) {
                return -8;
            }
            if (this.d.isParamsValid() && this.e != null) {
                try {
                    JSONObject reserveJSONObject = this.d.getReserveJSONObject();
                    JSONObject requestJSONObject = this.d.getRequestJSONObject();
                    requestJSONObject.put("interfaceId", this.f10796b);
                    return UPTsmAddonMini.this.commonInterface(requestJSONObject, reserveJSONObject, this.e, this.f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return -3;
        }
    }

    final class b extends ITsmCallback.Stub {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ITsmCallback f10798b;
        private final int c;

        private b(ITsmCallback iTsmCallback, int i) {
            this.f10798b = iTsmCallback;
            this.c = i;
        }

        @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
        public final void onError(String str, String str2) {
            ITsmCallback iTsmCallback = this.f10798b;
            if (iTsmCallback != null) {
                iTsmCallback.onError(str, str2);
            }
        }

        @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
        public final void onResult(Bundle bundle) {
            if (this.f10798b != null) {
                bundle.putInt("interfaceId", this.c);
                this.f10798b.onResult(bundle);
            }
        }

        public /* synthetic */ b(UPTsmAddonMini uPTsmAddonMini, ITsmCallback iTsmCallback, int i, byte b2) {
            this(iTsmCallback, i);
        }
    }

    private UPTsmAddonMini(Context context) {
        Handler.Callback callback = new Handler.Callback() { // from class: com.unionpay.tsmservice.mi.mini.UPTsmAddonMini.1
            @Override // android.os.Handler.Callback
            public final synchronized boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    UPTsmAddonMini.this.a();
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                UPTsmAddonMini.this.b();
                return true;
            }
        };
        this.c = callback;
        this.d = null;
        this.e = new Handler(Looper.getMainLooper(), callback);
        this.g = null;
        this.h = false;
        this.f = context;
    }

    private String b(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    public static synchronized UPTsmAddonMini getInstance(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (f10791a == null) {
                f10791a = new UPTsmAddonMini(context.getApplicationContext());
            }
            if (f10792b == null) {
                f10792b = new CopyOnWriteArrayList();
            }
            return f10791a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void addConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            f10792b.add(uPTsmConnectionListener);
        }
    }

    public boolean bind() {
        try {
            if (this.g == null) {
                this.g = new ServiceConnection() { // from class: com.unionpay.tsmservice.mi.mini.UPTsmAddonMini.2
                    @Override // android.content.ServiceConnection
                    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        UPTsmAddonMini.this.h = true;
                        UPTsmAddonMini.this.d = ITsmServiceMini.Stub.asInterface(iBinder);
                        UPTsmAddonMini.this.e.sendEmptyMessage(0);
                    }

                    @Override // android.content.ServiceConnection
                    public final synchronized void onServiceDisconnected(ComponentName componentName) {
                        UPTsmAddonMini.this.h = false;
                        UPTsmAddonMini.this.d = null;
                        UPTsmAddonMini.this.e.sendEmptyMessage(1);
                    }
                };
            }
            if (this.h) {
                return true;
            }
            Intent intent = new Intent("com.unionpay.tsmservice.mi.UPServiceTsmMini");
            intent.setPackage(Constants.PACKAGE_NAME_UNIONPAY);
            return this.f.bindService(intent, this.g, 1);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized int commonInterface(JSONObject jSONObject, JSONObject jSONObject2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) {
        if (jSONObject == null || iTsmCallback == null) {
            return -3;
        }
        int iOptInt = jSONObject.optInt("interfaceId", -1);
        if (iOptInt == -1) {
            return -3;
        }
        if (this.d == null) {
            return -1;
        }
        if (!a(Constant.APK_VERSION_010035)) {
            return -8;
        }
        String strB = b(Constants.PACKAGE_NAME_UNIONPAY);
        if (strB != null && strB.compareTo(Constant.APK_VERSION_010002) >= 0) {
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("jarVersionCode", 36);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jSONObject2 != null) {
                    try {
                        jSONObject2.put("packageName", this.f.getPackageName());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (jSONObject2 != null) {
                jSONObject2.put("packageName", this.f.getPackageName());
            }
            throw th;
        }
        return this.d.commonInterface(jSONObject.toString(), jSONObject2.toString(), new b(this, iTsmCallback, iOptInt, (byte) 0), iTsmProgressCallback);
    }

    public Context getContext() {
        return this.f;
    }

    public synchronized int getListenerCount() {
        CopyOnWriteArrayList copyOnWriteArrayList = f10792b;
        if (copyOnWriteArrayList == null) {
            return 0;
        }
        return copyOnWriteArrayList.size();
    }

    public boolean isConnected() {
        return this.h;
    }

    public synchronized int queryVendorPayStatus(QueryVendorPayStatusRequestParams queryVendorPayStatusRequestParams, ITsmCallback iTsmCallback) {
        return new a(Constant.APK_VERSION_010035, new QueryVendorPayStatusRequestParamsWrapper(queryVendorPayStatusRequestParams), new QueryVendorPayStatusResultCallbackWrapper(4001, iTsmCallback)).a();
    }

    public synchronized void removeConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            f10792b.remove(uPTsmConnectionListener);
        }
    }

    public void unbind() {
        ServiceConnection serviceConnection = this.g;
        if (serviceConnection == null || !this.h) {
            return;
        }
        this.f.unbindService(serviceConnection);
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = f10792b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            for (UPTsmConnectionListener uPTsmConnectionListener : f10792b) {
                if (uPTsmConnectionListener != null) {
                    uPTsmConnectionListener.onTsmConnected();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = f10792b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            for (UPTsmConnectionListener uPTsmConnectionListener : f10792b) {
                if (uPTsmConnectionListener != null) {
                    uPTsmConnectionListener.onTsmDisconnected();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        String strB = b(Constants.PACKAGE_NAME_UNIONPAY);
        return strB != null && strB.compareTo(str) >= 0;
    }
}
