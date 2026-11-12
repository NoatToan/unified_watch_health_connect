package com.huawei.hms.network.embedded;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes34.dex */
public class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f14858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Condition f14859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f14860c;
    public final Object[] d;
    public int e;
    public int f;
    public int g;

    public Object take() throws InterruptedException {
        int i;
        this.f14858a.lock();
        while (true) {
            try {
                i = this.g;
                if (i != 0) {
                    break;
                }
                this.f14860c.await();
            } catch (Throwable th) {
                this.f14858a.unlock();
                throw th;
            }
        }
        Object[] objArr = this.d;
        int i2 = this.f;
        Object obj = objArr[i2];
        int i3 = i2 + 1;
        this.f = i3;
        if (i3 == objArr.length) {
            this.f = 0;
        }
        this.g = i - 1;
        this.f14859b.signal();
        this.f14858a.unlock();
        return obj;
    }

    public void put(Object obj) throws InterruptedException {
        int i;
        Object[] objArr;
        this.f14858a.lock();
        while (true) {
            try {
                i = this.g;
                objArr = this.d;
                if (i != objArr.length) {
                    break;
                } else {
                    this.f14859b.await();
                }
            } catch (Throwable th) {
                this.f14858a.unlock();
                throw th;
            }
        }
        int i2 = this.e;
        objArr[i2] = obj;
        int i3 = i2 + 1;
        this.e = i3;
        if (i3 == objArr.length) {
            this.e = 0;
        }
        this.g = i + 1;
        this.f14860c.signal();
        this.f14858a.unlock();
    }

    public h4() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f14858a = reentrantLock;
        this.f14859b = reentrantLock.newCondition();
        this.f14860c = reentrantLock.newCondition();
        this.d = new Object[1];
    }
}
