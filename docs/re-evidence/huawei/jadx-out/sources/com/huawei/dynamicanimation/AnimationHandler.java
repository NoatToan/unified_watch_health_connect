package com.huawei.dynamicanimation;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AnimationHandler {
    public static final ThreadLocal<AnimationHandler> e = new ThreadLocal<>();
    private AnimationFrameCallbackProvider j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<AnimationFrameCallback, Long> f5485c = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<AnimationFrameCallback> f5484b = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f5483a = new b();
    private long d = 0;
    private boolean h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface AnimationFrameCallback {
        boolean doAnimationFrame(long j);
    }

    AnimationHandler() {
    }

    class b {
        b() {
        }

        void d() {
            AnimationHandler.this.d = SystemClock.uptimeMillis();
            AnimationHandler animationHandler = AnimationHandler.this;
            animationHandler.c(animationHandler.d);
            if (AnimationHandler.this.f5484b.size() > 0) {
                AnimationHandler.this.d().postFrameCallback();
            }
        }
    }

    public static AnimationHandler b() {
        ThreadLocal<AnimationHandler> threadLocal = e;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        return threadLocal.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnimationFrameCallbackProvider d() {
        if (this.j == null) {
            this.j = new c(this.f5483a);
        }
        return this.j;
    }

    public void d(AnimationFrameCallback animationFrameCallback, long j) {
        if (this.f5484b.size() == 0) {
            d().postFrameCallback();
        }
        if (!this.f5484b.contains(animationFrameCallback)) {
            this.f5484b.add(animationFrameCallback);
        }
        if (j > 0) {
            this.f5485c.put(animationFrameCallback, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public void b(AnimationFrameCallback animationFrameCallback) {
        this.f5485c.remove(animationFrameCallback);
        int iIndexOf = this.f5484b.indexOf(animationFrameCallback);
        if (iIndexOf >= 0) {
            this.f5484b.set(iIndexOf, null);
            this.h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f5484b.size(); i++) {
            AnimationFrameCallback animationFrameCallback = this.f5484b.get(i);
            if (animationFrameCallback != null && b(animationFrameCallback, jUptimeMillis)) {
                animationFrameCallback.doAnimationFrame(j);
            }
        }
        a();
    }

    private boolean b(AnimationFrameCallback animationFrameCallback, long j) {
        if (this.f5485c.get(animationFrameCallback) == null) {
            return true;
        }
        if (this.f5485c.get(animationFrameCallback).longValue() >= j) {
            return false;
        }
        this.f5485c.remove(animationFrameCallback);
        return true;
    }

    private void a() {
        if (this.h) {
            for (int size = this.f5484b.size() - 1; size >= 0; size--) {
                if (this.f5484b.get(size) == null) {
                    this.f5484b.remove(size);
                }
            }
            this.h = false;
        }
    }

    static class c extends AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Choreographer.FrameCallback f5486b;
        private final Choreographer e;

        c(b bVar) {
            super(bVar);
            this.e = Choreographer.getInstance();
            this.f5486b = new Choreographer.FrameCallback() { // from class: com.huawei.dynamicanimation.AnimationHandler.c.2
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    c.this.mDispatcher.d();
                }
            };
        }

        @Override // com.huawei.dynamicanimation.AnimationHandler.AnimationFrameCallbackProvider
        void postFrameCallback() {
            this.e.postFrameCallback(this.f5486b);
        }
    }

    static abstract class AnimationFrameCallbackProvider {
        final b mDispatcher;

        abstract void postFrameCallback();

        AnimationFrameCallbackProvider(b bVar) {
            this.mDispatcher = bVar;
        }
    }
}
