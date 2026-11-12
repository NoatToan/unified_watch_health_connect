package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jrs extends jrt {
    private List<jpg> e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38947c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f38946a = null;

    public void a(List<jpg> list) {
        if (this.e == null) {
            this.e = new ArrayList(16);
        }
        this.e.addAll(list);
    }

    public List<jpg> g() {
        return this.e;
    }

    public boolean i() {
        return this.f38947c;
    }

    public List<Integer> h() {
        return this.f38946a;
    }
}
