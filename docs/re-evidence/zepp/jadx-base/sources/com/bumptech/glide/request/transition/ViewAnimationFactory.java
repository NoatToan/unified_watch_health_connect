package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes2.dex */
public class ViewAnimationFactory<R> implements TransitionFactory<R> {
    private final ViewTransition.a a;
    private Transition<R> b;

    public static class a implements ViewTransition.a {
        private final Animation a;

        public a(Animation animation) {
            this.a = animation;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.a
        public Animation a(Context context) {
            return this.a;
        }
    }

    public static class b implements ViewTransition.a {
        private final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.a);
        }
    }

    public ViewAnimationFactory(Animation animation) {
        this(new a(animation));
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return NoTransition.get();
        }
        if (this.b == null) {
            this.b = new ViewTransition(this.a);
        }
        return this.b;
    }

    public ViewAnimationFactory(int i) {
        this(new b(i));
    }

    public ViewAnimationFactory(ViewTransition.a aVar) {
        this.a = aVar;
    }
}
