package com.alipay.sdk.widget;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Stack<e> f5920a = new Stack<>();

    public e a() {
        return this.f5920a.pop();
    }

    public void b(e eVar) {
        this.f5920a.push(eVar);
    }

    public boolean c() {
        return this.f5920a.isEmpty();
    }

    public void d() {
        if (c()) {
            return;
        }
        Iterator<e> it = this.f5920a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f5920a.clear();
    }
}
