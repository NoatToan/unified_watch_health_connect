package com.huawei.hianalytics;

import android.os.Bundle;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.android.app.IHwActivityNotifierEx;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends IHwActivityNotifierEx implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11461b = new CopyOnWriteArrayList();

    public b1(int i) {
        this.f11460a = i;
    }

    @Override // com.huawei.hianalytics.d1
    public final void a() {
        int i = this.f11460a;
        if (i == 1) {
            ActivityManagerEx.registerHwActivityNotifier(this, "appSwitch");
        } else if (i == 2) {
            ActivityManagerEx.registerHwActivityNotifier(this, "activityLifeState");
        }
    }

    @Override // com.huawei.hianalytics.d1
    public final void b() {
        this.f11461b.clear();
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
            while (i < this.f11461b.size()) {
                ((e2) this.f11461b.get(i)).a(bundle);
                i++;
            }
        } else {
            HiLog.d("HwAM", "call, screen is off");
            while (i < this.f11461b.size()) {
                ((e2) this.f11461b.get(i)).a();
                i++;
            }
        }
    }

    @Override // com.huawei.hianalytics.d1
    public final void a(e2 e2Var) {
        this.f11461b.add(e2Var);
    }
}
