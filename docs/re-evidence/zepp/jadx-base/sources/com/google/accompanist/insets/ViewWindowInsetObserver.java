package com.google.accompanist.insets;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.accompanist.insets.ViewWindowInsetObserver;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u000e*\u0001\u0012\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J'\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\r\u001a\u00020\tR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/google/accompanist/insets/ViewWindowInsetObserver;", "", "", "consumeWindowInsets", "windowInsetsAnimationsEnabled", "Lcom/google/accompanist/insets/WindowInsets;", "start", "Lcom/google/accompanist/insets/RootWindowInsets;", "windowInsets", "", "observeInto$insets_release", "(Lcom/google/accompanist/insets/RootWindowInsets;ZZ)V", "observeInto", Command.STOP, "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "com/google/accompanist/insets/ViewWindowInsetObserver$attachListener$1", "b", "Lcom/google/accompanist/insets/ViewWindowInsetObserver$attachListener$1;", "attachListener", "<set-?>", "c", "Z", "isObserving", "()Z", "isObserving$annotations", "()V", "<init>", "(Landroid/view/View;)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class ViewWindowInsetObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ViewWindowInsetObserver$attachListener$1 attachListener = new View.OnAttachStateChangeListener() { // from class: com.google.accompanist.insets.ViewWindowInsetObserver$attachListener$1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v) {
            v.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v) {
        }
    };

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isObserving;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.accompanist.insets.ViewWindowInsetObserver$attachListener$1] */
    public ViewWindowInsetObserver(@NotNull View view) {
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat b(RootWindowInsets rootWindowInsets, boolean z, View view, WindowInsetsCompat windowInsetsCompat) {
        MutableWindowInsetsType statusBars = rootWindowInsets.getStatusBars();
        InsetsKt.updateFrom(statusBars.getLayoutInsets(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()));
        statusBars.setVisible(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.statusBars()));
        MutableWindowInsetsType navigationBars = rootWindowInsets.getNavigationBars();
        InsetsKt.updateFrom(navigationBars.getLayoutInsets(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()));
        navigationBars.setVisible(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.navigationBars()));
        MutableWindowInsetsType systemGestures = rootWindowInsets.getSystemGestures();
        InsetsKt.updateFrom(systemGestures.getLayoutInsets(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemGestures()));
        systemGestures.setVisible(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.systemGestures()));
        MutableWindowInsetsType ime = rootWindowInsets.getIme();
        InsetsKt.updateFrom(ime.getLayoutInsets(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()));
        ime.setVisible(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime()));
        MutableWindowInsetsType displayCutout = rootWindowInsets.getDisplayCutout();
        InsetsKt.updateFrom(displayCutout.getLayoutInsets(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout()));
        displayCutout.setVisible(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.displayCutout()));
        return z ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    public static /* synthetic */ void isObserving$annotations() {
    }

    public static /* synthetic */ WindowInsets start$default(ViewWindowInsetObserver viewWindowInsetObserver, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return viewWindowInsetObserver.start(z, z2);
    }

    /* JADX INFO: renamed from: isObserving, reason: from getter */
    public final boolean getIsObserving() {
        return this.isObserving;
    }

    public final void observeInto$insets_release(@NotNull final RootWindowInsets windowInsets, final boolean consumeWindowInsets, boolean windowInsetsAnimationsEnabled) {
        if (!(!this.isObserving)) {
            throw new IllegalArgumentException("start() called, but this ViewWindowInsetObserver is already observing".toString());
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.view, new OnApplyWindowInsetsListener() { // from class: xb8
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ViewWindowInsetObserver.b(windowInsets, consumeWindowInsets, view, windowInsetsCompat);
            }
        });
        this.view.addOnAttachStateChangeListener(this.attachListener);
        if (windowInsetsAnimationsEnabled) {
            ViewCompat.setWindowInsetsAnimationCallback(this.view, new b(windowInsets));
        } else {
            ViewCompat.setWindowInsetsAnimationCallback(this.view, null);
        }
        if (this.view.isAttachedToWindow()) {
            this.view.requestApplyInsets();
        }
        this.isObserving = true;
    }

    @NotNull
    public final WindowInsets start(boolean consumeWindowInsets, boolean windowInsetsAnimationsEnabled) {
        RootWindowInsets rootWindowInsets = new RootWindowInsets();
        observeInto$insets_release(rootWindowInsets, consumeWindowInsets, windowInsetsAnimationsEnabled);
        return rootWindowInsets;
    }

    public final void stop() {
        if (!this.isObserving) {
            throw new IllegalArgumentException("stop() called, but this ViewWindowInsetObserver is not currently observing".toString());
        }
        this.view.removeOnAttachStateChangeListener(this.attachListener);
        ViewCompat.setOnApplyWindowInsetsListener(this.view, null);
        this.isObserving = false;
    }
}
