package com.huawei.hianalytics;

import android.content.pm.ActivityInfo;
import com.huawei.android.app.ActivityManagerEx;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1 f11466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1 f11467b;

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
        if (this.f11466a == null) {
            this.f11466a = new b1(1);
        }
        return this.f11466a;
    }

    @Override // com.huawei.hianalytics.e1
    public final d1 d() {
        if (this.f11467b == null) {
            this.f11467b = new b1(2);
        }
        return this.f11467b;
    }
}
