package com.huawei.hianalytics;

import android.os.Bundle;
import com.hihonor.android.app.ActivityManagerEx;
import com.hihonor.android.app.IHwActivityNotifierEx;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends IHwActivityNotifierEx implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11736b = new CopyOnWriteArrayList();

    public z0(int i) {
        this.f11735a = i;
    }

    @Override // com.huawei.hianalytics.d1
    public final void a() {
        int i = this.f11735a;
        if (i == 1) {
            ActivityManagerEx.registerHwActivityNotifier(this, "appSwitch");
        } else if (i == 2) {
            ActivityManagerEx.registerHwActivityNotifier(this, "activityLifeState");
        }
    }

    @Override // com.huawei.hianalytics.d1
    public final void b() {
        this.f11736b.clear();
    }

    @Override // com.huawei.hianalytics.d1
    public final void c() {
        ActivityManagerEx.unregisterHwActivityNotifier(this);
    }

    public final void call(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i = 0;
        if (t.c(EnvUtils.getAppContext())) {
            while (i < this.f11736b.size()) {
                ((e2) this.f11736b.get(i)).a(bundle);
                i++;
            }
        } else {
            HiLog.d("HnAM", "call, screen is off");
            while (i < this.f11736b.size()) {
                ((e2) this.f11736b.get(i)).a();
                i++;
            }
        }
    }

    @Override // com.huawei.hianalytics.d1
    public final void a(e2 e2Var) {
        this.f11736b.add(e2Var);
    }
}
