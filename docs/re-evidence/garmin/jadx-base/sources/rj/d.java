package rj;

import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    public static class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f152956a;

        public b() {
            super();
        }

        public final void a() {
            if (this.f152956a) {
                h.z("Already released");
            }
        }
    }

    private d() {
    }
}
