package com.huawei.hms.network.embedded;

/* JADX INFO: loaded from: classes34.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f15318a = new a();

    public class a extends s0 {
    }

    public interface c {
        s0 a(f0 f0Var);
    }

    public void a() {
    }

    public void a(m0 m0Var) {
    }

    public void a(Exception exc) {
    }

    public class b implements c {
        @Override // com.huawei.hms.network.embedded.s0.c
        public s0 a(f0 f0Var) {
            return s0.this;
        }

        public b() {
        }
    }

    public static c a(s0 s0Var) {
        return s0Var.new b();
    }
}
