package com.huawei.ui.device.interactors;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lzi;
import defpackage.mir;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationPushInteractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lzi f24955c = lzi.a();

    public NotificationPushInteractor(Context context) {
    }

    public int b(String str) {
        return this.f24955c.c(str);
    }

    public void b(String str, int i) {
        this.f24955c.d(str, i);
    }

    public boolean b() {
        return this.f24955c.d();
    }

    public void e(int i) {
        this.f24955c.a("notificationStatus", i, true);
    }

    public void a(int i) {
        this.f24955c.a("notificationStatus", i, false);
    }

    public boolean e() {
        return mir.a();
    }

    public boolean a(String str) {
        return mir.d(str);
    }

    public boolean a() {
        return this.f24955c.b();
    }

    public void d(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("NotificationPushUtil", "setRotateSwitchScreenSwitchStatus() Status " + z);
        this.f24955c.b(z, iBaseResponseCallback);
    }
}
