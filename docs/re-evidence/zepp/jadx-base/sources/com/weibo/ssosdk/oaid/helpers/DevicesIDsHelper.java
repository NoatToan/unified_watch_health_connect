package com.weibo.ssosdk.oaid.helpers;

import android.content.Context;
import android.os.Build;
import com.weibo.ssosdk.AppUtils;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;

/* JADX INFO: loaded from: classes18.dex */
public class DevicesIDsHelper {

    public class a implements Runnable {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(AppUtils.getManufacturer())) {
                new HWDeviceIDHelper(this.a).getHWID();
            } else if ("OPPO".equals(AppUtils.getManufacturer())) {
                new OppoDeviceIDHelper(this.a).getID();
            }
        }
    }

    private String a() {
        return Build.BRAND.toUpperCase();
    }

    private void b(Context context) {
        new Thread(new a(context)).start();
    }

    public void getOAID(Context context) {
        if (AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(AppUtils.getManufacturer())) {
            b(context);
            return;
        }
        if ("OPPO".equals(AppUtils.getManufacturer())) {
            b(context);
        } else if ("VIVO".equals(AppUtils.getManufacturer())) {
            new VivoDeviceIDHelper(context).getOaid();
        } else if (AndroidManufacturerUtils.MANUFACTURE_XIAOMI.equals(AppUtils.getManufacturer())) {
            new XiaomiDeviceIDHelper(context).getOAID();
        }
    }
}
