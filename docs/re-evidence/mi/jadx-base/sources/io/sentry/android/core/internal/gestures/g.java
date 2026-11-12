package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.owp;
import defpackage.rwp;
import defpackage.wzc;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.UiElement;
import io.sentry.m;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.y;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<Activity> f21487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ftc f21488b;

    @NotNull
    public final SentryAndroidOptions c;

    @Nullable
    public UiElement d = null;

    @Nullable
    public wzc e = null;

    @NotNull
    public b f = b.Unknown;
    public final c g = new c(null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21489a;

        static {
            int[] iArr = new int[b.values().length];
            f21489a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21489a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21489a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21489a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(@NotNull Activity activity, @NotNull ftc ftcVar, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f21487a = new WeakReference<>(activity);
        this.f21488b = ftcVar;
        this.c = sentryAndroidOptions;
    }

    @NotNull
    public static String j(@NotNull b bVar) {
        int i = a.f21489a[bVar.ordinal()];
        if (i == 1) {
            return "click";
        }
        if (i != 2) {
            return i != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    public final void e(@NotNull UiElement uiElement, @NotNull b bVar, @NotNull Map<String, Object> map, @NotNull MotionEvent motionEvent) {
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar);
            c8c c8cVar = new c8c();
            c8cVar.l("android:motionEvent", motionEvent);
            c8cVar.l("android:view", uiElement.f());
            this.f21488b.o(io.sentry.a.s(strJ, uiElement.d(), uiElement.a(), uiElement.e(), map), c8cVar);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull final io.sentry.e eVar, @NotNull final wzc wzcVar) {
        eVar.y(new m.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.m.c
            public final void a(wzc wzcVar2) {
                this.f21483a.k(eVar, wzcVar, wzcVar2);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void n(@NotNull final io.sentry.e eVar) {
        eVar.y(new m.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.m.c
            public final void a(wzc wzcVar) {
                this.f21485a.l(eVar, wzcVar);
            }
        });
    }

    @Nullable
    public final View h(@NotNull String str) {
        Activity activity = this.f21487a.get();
        if (activity == null) {
            this.c.getLogger().c(SentryLevel.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.c.getLogger().c(SentryLevel.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.c.getLogger().c(SentryLevel.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    @NotNull
    public final String i(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public final /* synthetic */ void k(io.sentry.e eVar, wzc wzcVar, wzc wzcVar2) {
        if (wzcVar2 == null) {
            eVar.p(wzcVar);
        } else {
            this.c.getLogger().c(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", wzcVar.getName());
        }
    }

    public final /* synthetic */ void l(io.sentry.e eVar, wzc wzcVar) {
        if (wzcVar == this.e) {
            eVar.h();
        }
    }

    public void o(@NotNull MotionEvent motionEvent) {
        View viewH = h("onUp");
        UiElement uiElement = this.g.f21491b;
        if (viewH == null || uiElement == null) {
            return;
        }
        if (this.g.f21490a == b.Unknown) {
            this.c.getLogger().c(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(uiElement, this.g.f21490a, Collections.singletonMap("direction", this.g.i(motionEvent)), motionEvent);
        p(uiElement, this.g.f21490a);
        this.g.j();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.g.j();
        this.g.c = motionEvent.getX();
        this.g.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        this.g.f21490a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.g.f21490a == b.Unknown) {
            UiElement uiElementA = i.a(this.c, viewH, motionEvent.getX(), motionEvent.getY(), UiElement.Type.SCROLLABLE);
            if (uiElementA == null) {
                this.c.getLogger().c(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.c.getLogger().c(SentryLevel.DEBUG, "Scroll target found: " + uiElementA.b(), new Object[0]);
            this.g.k(uiElementA);
            this.g.f21490a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            UiElement uiElementA = i.a(this.c, viewH, motionEvent.getX(), motionEvent.getY(), UiElement.Type.CLICKABLE);
            if (uiElementA == null) {
                this.c.getLogger().c(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(uiElementA, bVar, Collections.emptyMap(), motionEvent);
            p(uiElementA, bVar);
        }
        return false;
    }

    public final void p(@NotNull UiElement uiElement, @NotNull b bVar) {
        boolean z = bVar == b.Click || !(bVar == this.f && uiElement.equals(this.d));
        if (!this.c.isTracingEnabled() || !this.c.isEnableUserInteractionTracing()) {
            if (z) {
                y.h(this.f21488b);
                this.d = uiElement;
                this.f = bVar;
                return;
            }
            return;
        }
        Activity activity = this.f21487a.get();
        if (activity == null) {
            this.c.getLogger().c(SentryLevel.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = uiElement.b();
        wzc wzcVar = this.e;
        if (wzcVar != null) {
            if (!z && !wzcVar.a()) {
                this.c.getLogger().c(SentryLevel.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.c.getIdleTimeout() != null) {
                    this.e.c();
                    return;
                }
                return;
            }
            q(SpanStatus.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar);
        rwp rwpVar = new rwp();
        rwpVar.r(true);
        rwpVar.n(30000L);
        rwpVar.o(this.c.getIdleTimeout());
        rwpVar.d(true);
        final wzc wzcVarQ = this.f21488b.q(new owp(str, TransactionNameSource.COMPONENT, str2), rwpVar);
        wzcVarQ.d().m("auto.ui.gesture_listener." + uiElement.c());
        this.f21488b.v(new hgl() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // defpackage.hgl
            public final void a(io.sentry.e eVar) {
                this.f21481a.m(wzcVarQ, eVar);
            }
        });
        this.e = wzcVarQ;
        this.d = uiElement;
        this.f = bVar;
    }

    public void q(@NotNull SpanStatus spanStatus) {
        wzc wzcVar = this.e;
        if (wzcVar != null) {
            if (wzcVar.getStatus() == null) {
                this.e.n(spanStatus);
            } else {
                this.e.finish();
            }
        }
        this.f21488b.v(new hgl() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // defpackage.hgl
            public final void a(io.sentry.e eVar) {
                this.f21480a.n(eVar);
            }
        });
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = b.Unknown;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public b f21490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public UiElement f21491b;
        public float c;
        public float d;

        public c() {
            this.f21490a = b.Unknown;
            this.c = 0.0f;
            this.d = 0.0f;
        }

        @NotNull
        public final String i(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.c;
            float y = motionEvent.getY() - this.d;
            if (Math.abs(x) > Math.abs(y)) {
                return x > 0.0f ? TSMAuthContants.PARAM_KEY_RIGHT : "left";
            }
            return y > 0.0f ? "down" : "up";
        }

        public final void j() {
            this.f21491b = null;
            this.f21490a = b.Unknown;
            this.c = 0.0f;
            this.d = 0.0f;
        }

        public final void k(@NotNull UiElement uiElement) {
            this.f21491b = uiElement;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
