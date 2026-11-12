package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ech {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32737c;
    private String d;
    private String e;

    public ech(String str) {
        this.e = str;
    }

    public ech() {
    }

    public void c() {
        this.f32737c = System.currentTimeMillis();
    }

    public void b() {
        dyg.e(false, "AddDeviceLogger", "this ", Long.valueOf(System.currentTimeMillis()), " last ", Long.valueOf(this.f32737c), " dis ", Long.valueOf(System.currentTimeMillis() - this.f32737c));
        this.f32736b = (int) (((System.currentTimeMillis() - this.f32737c) / 1000) + 1);
        a();
    }

    public void d(String str) {
        this.e = str;
    }

    public void c(String str) {
        this.f32735a = str;
        b();
    }

    public void e(String str, String str2) {
        this.f32735a = str;
        this.d = str2;
        b();
    }

    private void a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("WiFi Config  Mode ");
        sb.append(this.e);
        sb.append(" Time ");
        sb.append(this.f32736b);
        sb.append("s Result ");
        sb.append(this.f32735a);
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(" Fail Result: ");
            sb.append(this.d);
            dyg.c(false, "AddDeviceLogger", sb.toString());
            return;
        }
        dyg.a(false, "AddDeviceLogger", sb.toString());
    }
}
