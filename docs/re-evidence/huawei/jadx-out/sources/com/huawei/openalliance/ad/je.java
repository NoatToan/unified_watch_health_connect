package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes41.dex */
public class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jb f19304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ja f19306c;
    private final String d;

    public String toString() {
        return "HttpResponse{header=" + this.f19304a + ", status=" + this.f19305b + ", body=" + this.f19306c + '}';
    }

    public String d() {
        return this.d;
    }

    public ja c() {
        return this.f19306c;
    }

    public int b() {
        return this.f19305b;
    }

    public jb a() {
        return this.f19304a;
    }

    public je(jb jbVar, int i, ja jaVar, String str) {
        this.f19304a = jbVar;
        this.f19305b = i;
        this.f19306c = jaVar;
        this.d = str;
    }
}
