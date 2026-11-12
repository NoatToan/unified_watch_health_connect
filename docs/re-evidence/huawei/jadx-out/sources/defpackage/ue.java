package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
class ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f49976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49978c;
    private String d;
    private String e;

    ue(boolean z) {
        this.f49977b = z;
    }

    ue e(String str) {
        this.d = str;
        return this;
    }

    ue c(String str) {
        this.e = str.substring(0, Math.min(str.length(), 32));
        return this;
    }

    HashMap<String, String> c() {
        return this.f49976a;
    }

    String d() {
        return this.d;
    }

    String e() {
        return this.e;
    }

    public boolean b() {
        return this.f49977b;
    }

    boolean a() {
        return this.f49978c;
    }
}
