package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<cqg> f31252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31253c;
    private int e;

    public cqg(int i, String str, String str2) {
        this.e = i;
        this.f31251a = str2;
        this.f31253c = str;
    }

    public cqg() {
        this.f31252b = new ArrayList(16);
    }

    public List<cqg> d() {
        return this.f31252b;
    }

    public int c() {
        return this.e;
    }

    public String a() {
        return this.f31251a;
    }

    public void a(String str) {
        this.f31251a = str;
    }

    public String b() {
        return this.f31253c;
    }

    public void b(String str) {
        this.f31253c = str;
    }
}
