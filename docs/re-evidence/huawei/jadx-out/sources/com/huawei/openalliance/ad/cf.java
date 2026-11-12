package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.android.SystemUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class cf implements cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f18346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.huawei.openalliance.ad.utils.cn f18347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18348c;
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.cf.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.cf.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Intent intent2 = intent;
                        if (intent2 != null && intent2.getExtras() != null) {
                            if (intent.getExtras().getBoolean("connected")) {
                                cf.this.f18348c = true;
                                df.o();
                            } else {
                                cf.this.f18348c = false;
                            }
                        }
                    } catch (Throwable th) {
                        hw.c("BaseDeviceImpl", "onReceive error:" + th.getClass().getSimpleName());
                    }
                }
            });
        }
    };

    @Override // com.huawei.openalliance.ad.cr
    public int a(View view) {
        return 0;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean a() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean a(Context context) {
        return false;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean d() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String e() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String f() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean g() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.cr
    public Integer h() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String i() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean l() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean m() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String p() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String q() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean r() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String o() {
        return com.huawei.openalliance.ad.utils.dg.n(m() ? fp.b(this.f18346a).cc() : cd.a(this.f18346a).a());
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean n() {
        return this.f18348c;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String k() {
        String strA = com.huawei.openalliance.ad.utils.dk.a(SystemUtils.PRODUCT_BRAND);
        if (TextUtils.isEmpty(strA)) {
            strA = Build.BOARD;
        }
        return strA.toUpperCase(Locale.ENGLISH);
    }

    @Override // com.huawei.openalliance.ad.cr
    public String j() {
        String strA = com.huawei.openalliance.ad.utils.dk.a("ro.product.manufacturer");
        if (TextUtils.isEmpty(strA)) {
            strA = Build.MANUFACTURER;
        }
        return strA.toUpperCase(Locale.ENGLISH);
    }

    @Override // com.huawei.openalliance.ad.cr
    public String c() {
        String strA = com.huawei.openalliance.ad.utils.dk.a("ro.build.huawei.display.id");
        return TextUtils.isEmpty(strA) ? Build.DISPLAY : strA;
    }

    @Override // com.huawei.openalliance.ad.cr
    public String b() {
        String strA = com.huawei.openalliance.ad.utils.dk.a("ro.product.model");
        return TextUtils.isEmpty(strA) ? Build.MODEL : strA;
    }

    @Override // com.huawei.openalliance.ad.cr
    public boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            hw.c("BaseDeviceImpl", "check widget available error");
            return false;
        }
    }

    private void s() {
        hw.a("BaseDeviceImpl", "registerUSBObserver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ACTION_USB_STATE);
        com.huawei.openalliance.ad.utils.as.a(this.f18346a, this.d, intentFilter);
    }

    protected cf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f18346a = applicationContext;
        this.f18347b = com.huawei.openalliance.ad.utils.cn.a(applicationContext);
        s();
    }
}
