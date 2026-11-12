package com.huawei.hms.iapfull;

import android.app.Activity;
import android.widget.Toast;

/* JADX INFO: loaded from: classes10.dex */
class f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f13664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f13665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f13666c;

    @Override // java.lang.Runnable
    public void run() {
        Activity activity = this.f13664a;
        Toast.makeText(activity, activity.getResources().getString(this.f13665b), this.f13666c).show();
    }

    f1(Activity activity, int i, int i2) {
        this.f13664a = activity;
        this.f13665b = i;
        this.f13666c = i2;
    }
}
