package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class kus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownLatch f24317a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public urs f24318b = null;

    public urs a() {
        return this.f24318b;
    }

    public void b(int i) {
        try {
            this.f24317a.await(i, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
    }

    public void c(urs ursVar) {
        this.f24318b = ursVar;
        this.f24317a.countDown();
    }
}
