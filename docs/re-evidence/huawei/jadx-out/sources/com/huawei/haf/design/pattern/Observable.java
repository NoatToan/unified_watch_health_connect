package com.huawei.haf.design.pattern;

import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Observable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f5927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Observer> f5928c = new ArrayList<>();

    public Observable(String str) {
        this.f5927b = str;
    }

    public void b(Object... objArr) {
        synchronized (this.f5928c) {
            if (this.f5928c.isEmpty()) {
                return;
            }
            Iterator it = new ArrayList(this.f5928c).iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).notify(this.f5927b, objArr);
            }
        }
    }

    public void b(Observer observer) {
        if (observer == null) {
            ReleaseLogUtil.d("Observable", "registerObserver observer is null");
            return;
        }
        synchronized (this.f5928c) {
            if (this.f5928c.contains(observer)) {
                ReleaseLogUtil.d("Observable", "registerObserver already registered observer ", observer);
            } else {
                this.f5928c.add(observer);
            }
        }
    }

    public int d(Observer observer) {
        int size;
        if (observer == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (this.f5928c) {
            int iIndexOf = this.f5928c.indexOf(observer);
            if (iIndexOf == -1) {
                LogUtil.b("Observable", "Observer ", observer, " was not registered.");
            } else {
                this.f5928c.remove(iIndexOf);
            }
            size = this.f5928c.size();
        }
        return size;
    }

    public void c() {
        synchronized (this.f5928c) {
            this.f5928c.clear();
        }
    }
}
