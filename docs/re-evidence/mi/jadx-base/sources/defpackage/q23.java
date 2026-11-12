package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler;
import com.xiaomi.smarthome.frame.core.CoreApi;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class q23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f31005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HandlerThread f31006b;
    public static ISecureConnectHandler c;
    public static Map<String, IBleSecureConnectResponse> d = new ConcurrentHashMap();

    public class a implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IBleSecureConnectResponse f31008b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BleConnectOptions e;

        /* JADX INFO: renamed from: q23$a$a, reason: collision with other inner class name */
        public class RunnableC1085a implements Runnable {
            public RunnableC1085a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                q23.d(aVar.f31007a, aVar.d, aVar.e, aVar.f31008b, aVar.c - 1);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                q23.d(aVar.f31007a, aVar.d, aVar.e, aVar.f31008b, aVar.c - 1);
            }
        }

        public a(String str, IBleSecureConnectResponse iBleSecureConnectResponse, int i, String str2, BleConnectOptions bleConnectOptions) {
            this.f31007a = str;
            this.f31008b = iBleSecureConnectResponse;
            this.c = i;
            this.d = str2;
            this.e = bleConnectOptions;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            q23.f("bleStandardAuthConnect  code: " + i + ", optimize: " + CoreApi.getInstance().is6OptimizeBleLoginConnectModel(this.f31007a));
            if (q23.f31005a == null) {
                this.f31008b.onLastResponse(-2, null);
                return;
            }
            if ((i == -6 || i == -27) && CoreApi.getInstance().is6OptimizeBleLoginConnectModel(this.f31007a) && this.c > 0) {
                BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(this.d, 2, new Bundle(), null);
                q23.f31005a.postDelayed(new RunnableC1085a(), CoreApi.getInstance().get6OptimizeBleLoginConnectRetryDelay(this.f31007a));
            } else {
                if (i == -13 && CoreApi.getInstance().is13OptimizeBleLoginConnectModel(this.f31007a) && this.c > 0) {
                    q23.f31005a.postDelayed(new b(), CoreApi.getInstance().get13OptimizeBleLoginConnectRetryDelay(this.f31007a));
                    return;
                }
                q23.f("bleStandardAuthConnect   response code: " + i);
                this.f31008b.onLastResponse(i, bundle);
            }
        }
    }

    public static void c(String str, String str2, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        d(str, str2, bleConnectOptions, iBleSecureConnectResponse, CoreApi.getInstance().getOptimizeBleLoginConnectRetryTimes());
    }

    public static void d(String str, String str2, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse, int i) {
        e();
        f("bleStandardAuthConnect  " + str + ", retry: " + i);
        c = g23.b(str2, bleConnectOptions, new a(str, iBleSecureConnectResponse, i, str2, bleConnectOptions));
    }

    public static void e() {
        if (f31005a == null) {
            HandlerThread handlerThread = new HandlerThread("BluetoothOptimizeHelper");
            f31006b = handlerThread;
            handlerThread.start();
            f31005a = new Handler(f31006b.getLooper());
        }
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "rn-plugin-framework", 4, "core-bluetooth", str);
    }
}
