package com.huawei.openalliance.ad.ipc;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0217a f19246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19247b = "unbindTask" + hashCode();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19248c = 0;
    private String d;
    private Context e;

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.ipc.a$a, reason: collision with other inner class name */
    public interface InterfaceC0217a {
        void a();
    }

    public void b() {
        synchronized (this) {
            int i = this.f19248c - 1;
            this.f19248c = i;
            if (i < 0) {
                this.f19248c = 0;
            }
            hw.a(c(), "dec count: %d", Integer.valueOf(this.f19248c));
            if (this.f19248c <= 0) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.ipc.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.e();
                    }
                }, this.f19247b, d());
            }
        }
    }

    public void a() {
        synchronized (this) {
            this.f19248c++;
            dq.a(this.f19247b);
            hw.b(c(), "inc count: " + this.f19248c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        hw.b(c(), "unbindService");
        this.f19246a.a();
    }

    private int d() {
        return TextUtils.equals(Constants.HW_INTELLIEGNT_PACKAGE, this.e.getPackageName()) ? 0 : 60000;
    }

    private String c() {
        return "Monitor_" + this.d;
    }

    public a(Context context, String str, InterfaceC0217a interfaceC0217a) {
        this.e = context.getApplicationContext();
        this.d = str;
        this.f19246a = interfaceC0217a;
    }
}
