package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class x5 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f16418a = new ArrayList();

    public void a(f4 f4Var) {
        if (this.f16418a == null) {
            this.f16418a = new ArrayList();
        }
        this.f16418a.add(f4Var);
    }

    @Override // com.huawei.hms.scankit.p.f4
    public void a(w5 w5Var, long j) {
        Iterator it = this.f16418a.iterator();
        while (it.hasNext()) {
            ((f4) it.next()).a(w5Var, j);
        }
    }
}
