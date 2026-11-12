package defpackage;

import java.util.Random;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vcp implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36754b;

    public vcp() {
        this(null);
    }

    public String a() {
        return this.f36753a;
    }

    public String b() {
        return this.f36754b;
    }

    public vcp(String str) {
        this.f36753a = System.currentTimeMillis() + "" + new Random().nextLong();
        this.f36754b = str;
    }
}
