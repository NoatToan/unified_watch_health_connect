package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12993b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12992a = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f12994c = new c();

    public void a(Context context, int i, String str) {
        this.f12992a = i;
        this.f12993b = str;
        this.f12994c.a(context, "HMSCore");
    }

    public void b(int i, String str, String str2, Throwable th) {
        try {
            if (a(i)) {
                e eVarA = a(i, str, str2, th);
                String str3 = eVarA.c() + eVarA.a();
                this.f12994c.a(str3, i, str, str2 + '\n' + Log.getStackTraceString(th));
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public d a() {
        return this.f12994c;
    }

    public void a(d dVar) {
        this.f12994c = dVar;
    }

    public boolean a(int i) {
        return i >= this.f12992a;
    }

    public void a(int i, String str, String str2) {
        try {
            if (a(i)) {
                e eVarA = a(i, str, str2, null);
                this.f12994c.a(eVarA.c() + eVarA.a(), i, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    private void b() {
        try {
            Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2) {
        try {
            e eVarA = a(4, str, str2, null);
            this.f12994c.a(eVarA.c() + '\n' + eVarA.a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    private e a(int i, String str, String str2, Throwable th) {
        e eVar = new e(8, this.f12993b, i, str);
        eVar.a(str2);
        eVar.a(th);
        return eVar;
    }
}
