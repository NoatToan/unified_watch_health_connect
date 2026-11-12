package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.xiaomi.smarthome.controls.AllReadyCallback;
import com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager;
import com.xiaomi.smarthome.devicesubscribe.SubscribeCallback;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.framework.plugin.rn.constants.MiotNativeModuleConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.state.SmartHomePropManager;
import com.xiaomi.smarthome.utils.Watcher;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class wno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile wno f38167a;

    public class a implements q2i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f38169b;
        public final /* synthetic */ ReadableArray c;
        public final /* synthetic */ Callback d;

        public a(ReactApplicationContext reactApplicationContext, ReadableArray readableArray, Callback callback) {
            this.f38169b = reactApplicationContext;
            this.c = readableArray;
            this.d = callback;
        }

        public static /* synthetic */ void c(String str, String str2, JSONArray jSONArray, Integer num) {
            SmartHomePropManager.getInstance().onReceive(str, str2, jSONArray);
        }

        @Override // defpackage.q2i
        public void a(bd8 bd8Var) {
            RnPluginLog.addFrameworkLog("SubscribeMessagesLogTag", "订阅失败: " + this.c.toString() + "\n error=" + bd8Var.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("   subscribeEvent : onFailure   ");
            sb.append(bd8Var);
            RnPluginLog.e(sb.toString());
            Callback callback = this.d;
            if (callback != null) {
                callback.invoke(Boolean.FALSE, "" + bd8Var);
            }
        }

        @Override // defpackage.q2i
        public void onReceive(final String str, final String str2, final JSONArray jSONArray) {
            AllReadyCallback.isReady(0, 1024, new Watcher() { // from class: vno
                @Override // com.xiaomi.smarthome.utils.Watcher
                public final void accept(Object obj) {
                    wno.a.c(str, str2, jSONArray, (Integer) obj);
                }
            });
            RnPluginLog.addFrameworkLog("SubscribeMessagesLogTag", "收到消息: subId=" + this.f38168a + "  data=" + jSONArray.toString());
            ReactApplicationContext reactApplicationContext = this.f38169b;
            if (reactApplicationContext != null) {
                aje.b(reactApplicationContext).d(new Intent().setAction(MiotNativeModuleConstants.DEVICESTATUSCHANGED).putExtra(MiotNativeModuleConstants.EMIT_DATA, jSONArray.toString()).putExtra(MiotNativeModuleConstants.EMIT_SUBID, this.f38168a).putExtra(MiotNativeModuleConstants.EMIT_DID, str));
            }
        }

        @Override // defpackage.q2i
        public void onSuccess(String str) {
            this.f38168a = str;
            RnPluginLog.addFrameworkLog("SubscribeMessagesLogTag", "订阅成功:  subId=" + str + "  " + this.c.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("   subscribeEvent : onSuccess");
            sb.append(str);
            RnPluginLog.i(sb.toString());
            Callback callback = this.d;
            if (callback != null) {
                callback.invoke(Boolean.TRUE, str);
            }
        }
    }

    public class b implements fwc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q2i f38170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Looper f38171b;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f38172a;

            public a(String str) {
                this.f38172a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f38170a.onSuccess(this.f38172a);
            }
        }

        /* JADX INFO: renamed from: wno$b$b, reason: collision with other inner class name */
        public class RunnableC1135b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f38174a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f38175b;
            public final /* synthetic */ JSONArray c;

            public RunnableC1135b(String str, String str2, JSONArray jSONArray) {
                this.f38174a = str;
                this.f38175b = str2;
                this.c = jSONArray;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f38170a.onReceive(this.f38174a, this.f38175b, this.c);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f38176a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f38177b;

            public c(int i, String str) {
                this.f38176a = i;
                this.f38177b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f38170a.a(new bd8(this.f38176a, this.f38177b));
            }
        }

        public b(q2i q2iVar, Looper looper) {
            this.f38170a = q2iVar;
            this.f38171b = looper;
        }

        @Override // defpackage.fwc
        public void a(Intent intent) {
            JSONArray jSONArray;
            String stringExtra = intent.getStringExtra("subscribeDeviceV2_flag");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            if (stringExtra.equalsIgnoreCase("onSuccess")) {
                String stringExtra2 = intent.getStringExtra("subscribeDeviceV2_subid");
                if (this.f38170a != null) {
                    new Handler(wno.this.b(this.f38171b)).post(new a(stringExtra2));
                    return;
                }
                return;
            }
            if (stringExtra.equalsIgnoreCase("onReceive")) {
                String stringExtra3 = intent.getStringExtra("subscribeDeviceV2_did");
                String stringExtra4 = intent.getStringExtra("subscribeDeviceV2_model");
                try {
                    jSONArray = new JSONArray(intent.getStringExtra("subscribeDeviceV2_entry"));
                } catch (JSONException unused) {
                    jSONArray = null;
                }
                if (this.f38170a != null) {
                    new Handler(wno.this.b(this.f38171b)).post(new RunnableC1135b(stringExtra3, stringExtra4, jSONArray));
                }
            }
        }

        @Override // defpackage.fwc
        public void onRequestFailed(int i, String str) {
            if (this.f38170a != null) {
                new Handler(wno.this.b(this.f38171b)).post(new c(i, str));
            }
        }
    }

    public class c implements SubscribeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fwc f38178a;

        public c(fwc fwcVar) {
            this.f38178a = fwcVar;
        }

        @Override // com.xiaomi.smarthome.devicesubscribe.SubscribeCallback
        public void onFailure(Error error) {
            fwc fwcVar = this.f38178a;
            if (fwcVar != null) {
                fwcVar.onRequestFailed(error.getCode(), error.getDetail());
            }
        }

        @Override // com.xiaomi.smarthome.devicesubscribe.SubscribeCallback
        public void onReceive(String str, String str2, JSONArray jSONArray) {
            if (this.f38178a != null) {
                Intent intent = new Intent();
                intent.putExtra("subscribeDeviceV2_flag", "onReceive");
                intent.putExtra("subscribeDeviceV2_did", str);
                intent.putExtra("subscribeDeviceV2_model", str2);
                intent.putExtra("subscribeDeviceV2_entry", jSONArray.toString());
                this.f38178a.a(intent);
            }
        }

        @Override // com.xiaomi.smarthome.devicesubscribe.SubscribeCallback
        public void onSuccess(String str) {
            if (this.f38178a != null) {
                Intent intent = new Intent();
                intent.putExtra("subscribeDeviceV2_flag", "onSuccess");
                intent.putExtra("subscribeDeviceV2_subid", str);
                this.f38178a.a(intent);
            }
        }
    }

    public static wno c() {
        if (f38167a == null) {
            synchronized (wno.class) {
                try {
                    if (f38167a == null) {
                        f38167a = new wno();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38167a;
    }

    public final Looper b(Looper looper) {
        return looper == null ? Looper.getMainLooper() : looper;
    }

    public Looper d() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
    }

    public void e(ReactApplicationContext reactApplicationContext, String str, int i, ReadableArray readableArray, Callback callback) {
        g(str, i, Arguments.toList(readableArray), 10, new a(reactApplicationContext, readableArray, callback));
    }

    public final void f(String str, int i, List<String> list, int i2, fwc fwcVar) {
        DeviceSubscribeManager.getInstance().startSubscribe(str, i, list, i2, "", new c(fwcVar));
    }

    public final void g(String str, int i, List<String> list, int i2, q2i q2iVar) {
        f(str, i, list, i2, new b(q2iVar, d()));
    }
}
