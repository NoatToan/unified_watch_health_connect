package com.huawei.hianalytics;

import android.content.pm.ActivityInfo;
import com.hihonor.android.app.ActivityManagerEx;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f11451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f11452b;

    @Override // com.huawei.hianalytics.e1
    public final List a() {
        return ActivityManagerEx.getTasks(1);
    }

    @Override // com.huawei.hianalytics.e1
    public final ActivityInfo b() {
        return ActivityManagerEx.getLastResumedActivity();
    }

    @Override // com.huawei.hianalytics.e1
    public final d1 c() {
        if (this.f11451a == null) {
            this.f11451a = new z0(1);
        }
        return this.f11451a;
    }

    @Override // com.huawei.hianalytics.e1
    public final d1 d() {
        if (this.f11452b == null) {
            this.f11452b = new z0(2);
        }
        return this.f11452b;
    }
}
