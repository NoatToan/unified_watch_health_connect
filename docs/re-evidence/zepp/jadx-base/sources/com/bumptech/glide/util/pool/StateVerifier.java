package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StateVerifier {
    private static final boolean a = false;

    public static class b extends StateVerifier {
        private volatile RuntimeException b;

        public b() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void a(boolean z) {
            if (z) {
                this.b = new RuntimeException("Released");
            } else {
                this.b = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
            if (this.b != null) {
                throw new IllegalStateException("Already released", this.b);
            }
        }
    }

    public static class c extends StateVerifier {
        private volatile boolean b;

        public c() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void a(boolean z) {
            this.b = z;
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
            if (this.b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static StateVerifier newInstance() {
        return new c();
    }

    public abstract void a(boolean z);

    public abstract void throwIfRecycled();

    private StateVerifier() {
    }
}
