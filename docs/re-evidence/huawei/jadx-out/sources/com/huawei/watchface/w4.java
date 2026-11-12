package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class w4 {
    public static final String d = "w4";
    public static volatile w4 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30646a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30647b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30648c = "";

    public static w4 c() {
        w4 w4Var;
        synchronized (w4.class) {
            if (e == null) {
                synchronized (w4.class) {
                    if (e == null) {
                        e = new w4();
                    }
                }
            }
            w4Var = e;
        }
        return w4Var;
    }

    public boolean a() {
        return this.f30646a;
    }

    public String b() {
        return this.f30647b;
    }

    public String d() {
        return this.f30648c;
    }

    public void a(boolean z) {
        this.f30646a = z;
    }

    public void b(String str) {
        synchronized (this) {
            this.f30648c = str;
        }
    }

    public void a(String str) {
        this.f30647b = str;
    }

    public void b(String str, String str2) {
        a(true);
        a(str);
        b(str2);
    }

    public void a(String str, String str2) {
        synchronized (this) {
            String str3 = d;
            HwLog.i(str3, "dealLastTask");
            if (HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
                HwLog.i(str3, "dealLastTask isSupportMemberSignature true");
                return;
            }
            w4 w4VarC = c();
            if (w4VarC.a() && f2.a(Environment.getApplicationContext()).d(w4VarC.b())) {
                if (!TextUtils.equals(str, w4VarC.b())) {
                    HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitMembershipDialogStatus();
                }
                HwWatchFaceManager.getInstance(Environment.getApplicationContext()).cancelInstallWatchFace(w4VarC.b(), w4VarC.d());
            }
            w4VarC.b(str, str2);
        }
    }
}
