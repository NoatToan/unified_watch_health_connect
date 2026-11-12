package com.huawei.updatesdk.sdk.foundation.utils.device;

import android.car.Car;
import android.car.CarInfoManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.operation.utils.CloudParamKeys;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Car f29900a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f29901b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f29902c = null;
    private static boolean d = false;

    public static String e() {
        return f29901b;
    }

    public static String d() {
        return f29902c;
    }

    public static void b(Context context) {
        a(context);
    }

    /* JADX INFO: renamed from: com.huawei.updatesdk.sdk.foundation.utils.device.a$a, reason: collision with other inner class name */
    class ServiceConnectionC0290a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.huawei.updatesdk.sdk.foundation.a.b("CarInfoUtil", "onServiceDisconnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                CarInfoManager carInfoManager = (CarInfoManager) a.f29900a.getCarManager(CloudParamKeys.INFO);
                String unused = a.f29902c = carInfoManager.getManufacturer();
                String unused2 = a.f29901b = carInfoManager.getModel();
                com.huawei.updatesdk.sdk.foundation.a.b("CarInfoUtil", "car getManufacturer = " + a.f29902c + "  getModel = " + a.f29901b);
            } catch (Throwable th) {
                com.huawei.updatesdk.sdk.foundation.a.a("CarInfoUtil", "Car not connected in onServiceConnected" + th.getMessage());
            }
        }

        ServiceConnectionC0290a() {
        }
    }

    private static void a(Context context) {
        if (context == null || d) {
            return;
        }
        try {
            d = true;
            Car carCreateCar = Car.createCar(context.getApplicationContext(), new ServiceConnectionC0290a());
            f29900a = carCreateCar;
            if (carCreateCar != null) {
                carCreateCar.connect();
            }
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.a.a("CarInfoUtil", "Car Service Connect Error" + th.getMessage());
        }
    }
}
