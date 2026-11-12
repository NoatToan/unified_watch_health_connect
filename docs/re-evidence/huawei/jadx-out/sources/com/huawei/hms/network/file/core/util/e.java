package com.huawei.hms.network.file.core.util;

import android.os.Process;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e f15774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f15775c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    g f15776a = new g(Process.myPid(), new SecureRandom().nextInt(16));

    public long a() {
        return this.f15776a.a();
    }

    public static e b() {
        if (f15774b != null) {
            return f15774b;
        }
        synchronized (f15775c) {
            if (f15774b == null) {
                f15774b = new e();
            }
        }
        return f15774b;
    }

    private e() {
    }
}
