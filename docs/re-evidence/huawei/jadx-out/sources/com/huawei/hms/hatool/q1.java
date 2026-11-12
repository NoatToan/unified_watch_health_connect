package com.huawei.hms.hatool;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes3.dex */
public class q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q1 f13488c = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13489a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f13490b = q0.i();

    public boolean a() {
        if (!this.f13489a) {
            Context context = this.f13490b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f13489a = userManager.isUserUnlocked();
            } else {
                this.f13489a = false;
            }
        }
        return this.f13489a;
    }

    public static q1 b() {
        return f13488c;
    }

    private q1() {
    }
}
