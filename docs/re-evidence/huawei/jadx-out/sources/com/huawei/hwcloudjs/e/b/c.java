package com.huawei.hwcloudjs.e.b;

import com.huawei.hwcloudjs.e.b.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c<T extends d> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<T>> f17105a = new ArrayList();

    @Override // com.huawei.hwcloudjs.e.b.a
    public void b(b<T> bVar) {
        synchronized (this.f17105a) {
            if (bVar != null) {
                if (!this.f17105a.contains(bVar)) {
                    this.f17105a.add(bVar);
                }
            }
        }
    }

    @Override // com.huawei.hwcloudjs.e.b.a
    public void a(T t) {
        synchronized (this.f17105a) {
            ArrayList arrayList = new ArrayList();
            for (b<T> bVar : this.f17105a) {
                if (!bVar.onReceive(t)) {
                    arrayList.add(bVar);
                }
            }
            if (arrayList.size() > 0) {
                this.f17105a.removeAll(arrayList);
            }
        }
    }

    @Override // com.huawei.hwcloudjs.e.b.a
    public void a(b<T> bVar) {
        synchronized (this.f17105a) {
            this.f17105a.remove(bVar);
        }
    }
}
