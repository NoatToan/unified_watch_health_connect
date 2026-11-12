package com.huawei.hms.findnetwork.sdk;

import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13202a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13204c;

    public B(int i) {
        this.f13203b = i;
    }

    public void a() {
        synchronized (this) {
            this.f13202a.clear();
        }
    }

    public int b() {
        return this.f13204c;
    }

    public A c() {
        synchronized (this) {
            for (A a2 : this.f13202a) {
                if (a2.c().compareAndSet(true, false)) {
                    return a2;
                }
            }
            if (this.f13202a.size() >= this.f13203b) {
                return null;
            }
            A a3 = a(this.f13202a.size());
            this.f13202a.add(a3);
            a3.a(false);
            return a3;
        }
    }

    public final A a(int i) {
        A a2 = new A();
        a2.a(new byte[this.f13204c]);
        a2.a(true);
        a2.a(i);
        return a2;
    }

    public void b(int i) {
        this.f13204c = i;
    }

    public void a(A a2) {
        synchronized (this) {
            try {
                if (a2 == null) {
                    HmsFindSDKLog.i("RecordByteArrayPool", "record byte array can not be null.");
                    return;
                }
                if (this.f13202a.size() > a2.b()) {
                    A a3 = (A) this.f13202a.get(a2.b());
                    Arrays.fill(a3.a(), (byte) 0);
                    a3.c().set(true);
                } else {
                    HmsFindSDKLog.i("RecordByteArrayPool", "pool size is less than byte array's id, size is: " + this.f13202a.size() + "id is:" + a2.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
