package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.airoha.android.lib.RaceCommand.constant.RaceId;

/* JADX INFO: loaded from: classes22.dex */
final class c0 implements Runnable {
    public final /* synthetic */ Context a;

    public c0(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), RaceId.RACE_ANC_READ_PARAM_FROM_NVKEY);
            p.i(this.a);
            p.k(this.a, packageInfo);
            p.j(this.a, packageInfo);
        } catch (Throwable th) {
            Log.e("ManifestChecker", "", th);
        }
    }
}
