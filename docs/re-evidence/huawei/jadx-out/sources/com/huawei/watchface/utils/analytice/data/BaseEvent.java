package com.huawei.watchface.utils.analytice.data;

import com.huawei.watchface.m;
import com.huawei.watchface.s3;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseEvent<T extends BaseEvent> implements s3 {
    public static final String KEY_CONTENTINFO = "contentInfo";
    public static final String KEY_DESCINFO = "descinfo";
    public static final String KEY_ERRORCODE = "errorCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f30617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30619c;
    public String d;
    public String e;
    public String f;

    public BaseEvent a(long j) {
        this.f30618b = j;
        return this;
    }

    public BaseEvent b(long j) {
        this.f30617a = j;
        return this;
    }

    public long c() {
        return this.f30618b;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public long f() {
        return this.f30617a;
    }

    public long g() {
        return this.f30619c;
    }

    public String h() {
        return this.f;
    }

    public final /* synthetic */ void i() {
        LinkedHashMap linkedHashMapB = b();
        if (ArrayUtils.a(linkedHashMapB)) {
            return;
        }
        linkedHashMapB.putAll(m.b());
        m.d().a(1, a(), linkedHashMapB);
    }

    public void j() {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.utils.analytice.data.BaseEvent$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
    }

    public BaseEvent a(String str) {
        this.d = str;
        return this;
    }

    public BaseEvent b(String str) {
        this.e = str;
        return this;
    }

    public BaseEvent c(long j) {
        this.f30619c = j;
        return this;
    }

    public void c(String str) {
        this.f = str;
    }
}
