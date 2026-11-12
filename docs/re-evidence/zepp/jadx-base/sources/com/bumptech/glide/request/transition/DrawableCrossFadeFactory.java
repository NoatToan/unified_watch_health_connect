package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes2.dex */
public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {
    private final int a;
    private final boolean b;
    private DrawableCrossFadeTransition c;

    public static class Builder {
        private static final int c = 300;
        private final int a;
        private boolean b;

        public Builder() {
            this(300);
        }

        public DrawableCrossFadeFactory build() {
            return new DrawableCrossFadeFactory(this.a, this.b);
        }

        public Builder setCrossFadeEnabled(boolean z) {
            this.b = z;
            return this;
        }

        public Builder(int i) {
            this.a = i;
        }
    }

    public DrawableCrossFadeFactory(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    private Transition<Drawable> a() {
        if (this.c == null) {
            this.c = new DrawableCrossFadeTransition(this.a, this.b);
        }
        return this.c;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<Drawable> build(DataSource dataSource, boolean z) {
        return dataSource == DataSource.MEMORY_CACHE ? NoTransition.get() : a();
    }
}
