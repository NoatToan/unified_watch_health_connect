package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class nms implements Result {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43298c;
    private String d;
    private boolean e;

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return null;
    }

    public nms(int i, String str) {
        this.f43297b = i;
        this.d = str;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public boolean d() {
        return this.e;
    }

    public int e() {
        return this.f43297b;
    }

    public void d(int i) {
        this.f43298c = i;
    }

    public String a() {
        return this.d;
    }
}
