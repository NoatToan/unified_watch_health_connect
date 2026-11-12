package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class cxa extends dzo {
    public final k4b c;
    public final AtomicReference<Object> d;
    public final AtomicReference<Object> e;
    public final AtomicReference<Object> f;

    public static class b extends dzo.a<cxa> {
        public final k4b.a g;

        public b(ylb ylbVar, jgj jgjVar) {
            super(ylbVar, jgjVar);
            this.g = new k4b.a(jgjVar, false);
        }

        public static b w(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        @Override // xz9.a
        public void p() {
        }

        @Override // xz9.a
        public int q() {
            return 0;
        }

        @Override // xz9.a
        public boolean r() {
            return this.g.r();
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            return this.g.s(aprVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public cxa o(jgj jgjVar) {
            return new cxa(u(), jgjVar, false);
        }
    }

    public cxa(ylb ylbVar, jgj jgjVar, boolean z) {
        super(ylbVar, jgjVar);
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
        this.c = new k4b(jgjVar, z);
    }
}
