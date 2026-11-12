package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class z5 implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f16456a = new ArrayList();

    public void a(g4 g4Var) {
        if (this.f16456a == null) {
            this.f16456a = new ArrayList();
        }
        this.f16456a.add(g4Var);
    }

    @Override // com.huawei.hms.scankit.p.g4
    public void a(w5 w5Var) {
        Iterator it = this.f16456a.iterator();
        while (it.hasNext()) {
            ((g4) it.next()).a(w5Var);
        }
    }
}
