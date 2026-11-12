package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.ae8;
import defpackage.c8c;
import defpackage.dm1;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class ViewHierarchyEventProcessor implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryAndroidOptions f21421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.android.core.internal.util.g f21422b = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.b(), VibrateModeProgressBar.sLongToLong, 3);

    public ViewHierarchyEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f21421a = (SentryAndroidOptions) io.sentry.util.p.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.k.a("ViewHierarchy");
        }
    }

    public static void e(@NotNull View view, @NotNull io.sentry.protocol.a0 a0Var, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        if (view instanceof ViewGroup) {
            Iterator<io.sentry.internal.viewhierarchy.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(a0Var, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.a0 a0VarI = i(childAt);
                    arrayList.add(a0VarI);
                    e(childAt, a0VarI, list);
                }
            }
            a0Var.m(arrayList);
        }
    }

    public static /* synthetic */ void f(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(h(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    @Nullable
    public static io.sentry.protocol.z g(@Nullable Activity activity, @NotNull final List<io.sentry.internal.viewhierarchy.a> list, @NotNull io.sentry.util.thread.a aVar, @NotNull final ILogger iLogger) {
        if (activity == null) {
            iLogger.c(SentryLevel.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(SentryLevel.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(SentryLevel.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (aVar.a()) {
                return h(viewPeekDecorView, list);
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference(null);
            activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.a2
                @Override // java.lang.Runnable
                public final void run() {
                    ViewHierarchyEventProcessor.f(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger);
                }
            });
            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                return (io.sentry.protocol.z) atomicReference.get();
            }
            return null;
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    @NotNull
    public static io.sentry.protocol.z h(@NotNull View view, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.z zVar = new io.sentry.protocol.z("android_view_system", arrayList);
        io.sentry.protocol.a0 a0VarI = i(view);
        arrayList.add(a0VarI);
        e(view, a0VarI, list);
        return zVar;
    }

    @NotNull
    public static io.sentry.protocol.a0 i(@NotNull View view) {
        io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0();
        a0Var.p(io.sentry.android.core.internal.util.d.a(view));
        try {
            a0Var.o(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        a0Var.t(Double.valueOf(view.getX()));
        a0Var.u(Double.valueOf(view.getY()));
        a0Var.s(Double.valueOf(view.getWidth()));
        a0Var.n(Double.valueOf(view.getHeight()));
        a0Var.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            a0Var.r("visible");
        } else if (visibility == 4) {
            a0Var.r("invisible");
        } else if (visibility == 8) {
            a0Var.r("gone");
        }
        return a0Var;
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.s a(@NotNull io.sentry.s sVar, @NotNull c8c c8cVar) {
        io.sentry.protocol.z zVarG;
        if (!sVar.y0()) {
            return sVar;
        }
        if (!this.f21421a.isAttachViewHierarchy()) {
            this.f21421a.getLogger().c(SentryLevel.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return sVar;
        }
        if (io.sentry.util.j.i(c8cVar)) {
            return sVar;
        }
        boolean zA = this.f21422b.a();
        this.f21421a.getBeforeViewHierarchyCaptureCallback();
        if (!zA && (zVarG = g(v0.c().b(), this.f21421a.getViewHierarchyExporters(), this.f21421a.getMainThreadChecker(), this.f21421a.getLogger())) != null) {
            c8cVar.p(dm1.c(zVarG));
        }
        return sVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.protocol.w b(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar) {
        return wVar;
    }
}
