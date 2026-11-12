package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f7391b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Choreographer f7392a = c();

    /* JADX INFO: renamed from: com.facebook.react.modules.core.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0164a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Choreographer.FrameCallback f7393a;

        /* JADX INFO: renamed from: com.facebook.react.modules.core.a$a$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0165a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0165a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                AbstractC0164a.this.a(j);
            }
        }

        public abstract void a(long j);

        public Choreographer.FrameCallback b() {
            if (this.f7393a == null) {
                this.f7393a = new ChoreographerFrameCallbackC0165a();
            }
            return this.f7393a;
        }
    }

    public static a d() {
        UiThreadUtil.assertOnUiThread();
        if (f7391b == null) {
            f7391b = new a();
        }
        return f7391b;
    }

    public final void a(Choreographer.FrameCallback frameCallback) {
        this.f7392a.postFrameCallback(frameCallback);
    }

    public final void b(Choreographer.FrameCallback frameCallback) {
        this.f7392a.removeFrameCallback(frameCallback);
    }

    public final Choreographer c() {
        return Choreographer.getInstance();
    }

    public void e(AbstractC0164a abstractC0164a) {
        a(abstractC0164a.b());
    }

    public void f(AbstractC0164a abstractC0164a) {
        b(abstractC0164a.b());
    }
}
