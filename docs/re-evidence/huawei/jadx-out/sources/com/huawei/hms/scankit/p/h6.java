package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes10.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u4 f16117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b3 f16118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b8 f16119c;
    private int d = -1;
    private c0 e;

    public static boolean a(int i) {
        return i >= 0 && i < 8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.f16117a);
        sb.append("\n ecLevel: ");
        sb.append(this.f16118b);
        sb.append("\n version: ");
        sb.append(this.f16119c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        sb.append(">>\n");
        return sb.toString();
    }

    public c0 a() {
        return this.e;
    }

    public void b(int i) {
        this.d = i;
    }

    public void a(b3 b3Var) {
        this.f16118b = b3Var;
    }

    public void a(c0 c0Var) {
        this.e = c0Var;
    }

    public void a(u4 u4Var) {
        this.f16117a = u4Var;
    }

    public void a(b8 b8Var) {
        this.f16119c = b8Var;
    }
}
