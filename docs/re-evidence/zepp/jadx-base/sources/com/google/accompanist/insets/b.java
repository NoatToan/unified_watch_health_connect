package com.google.accompanist.insets;

import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/google/accompanist/insets/b;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Lcom/google/accompanist/insets/MutableWindowInsetsType;", "Landroidx/core/view/WindowInsetsCompat;", "platformInsets", "", "Landroidx/core/view/WindowInsetsAnimationCompat;", "runningAnimations", "", "type", "", "a", "animation", "onPrepare", "onProgress", "onEnd", "Lcom/google/accompanist/insets/RootWindowInsets;", "Lcom/google/accompanist/insets/RootWindowInsets;", "windowInsets", "<init>", "(Lcom/google/accompanist/insets/RootWindowInsets;)V", "insets_release"}, k = 1, mv = {1, 5, 1})
final class b extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RootWindowInsets windowInsets;

    public b(@NotNull RootWindowInsets rootWindowInsets) {
        super(0);
        this.windowInsets = rootWindowInsets;
    }

    private final void a(MutableWindowInsetsType mutableWindowInsetsType, WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list, int i) {
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
            } while (!((((WindowInsetsAnimationCompat) it2.next()).getTypeMask() | i) != 0));
        } else {
            z = false;
            break;
        }
        if (z) {
            InsetsKt.updateFrom(mutableWindowInsetsType.getAnimatedInsets(), windowInsetsCompat.getInsets(i));
            Iterator<T> it3 = list.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float fraction = ((WindowInsetsAnimationCompat) it3.next()).getFraction();
            while (it3.hasNext()) {
                fraction = Math.max(fraction, ((WindowInsetsAnimationCompat) it3.next()).getFraction());
            }
            mutableWindowInsetsType.setAnimationFraction(fraction);
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@NotNull WindowInsetsAnimationCompat animation) {
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
            this.windowInsets.getIme().onAnimationEnd();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.statusBars()) != 0) {
            this.windowInsets.getStatusBars().onAnimationEnd();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.navigationBars()) != 0) {
            this.windowInsets.getNavigationBars().onAnimationEnd();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.systemGestures()) != 0) {
            this.windowInsets.getSystemGestures().onAnimationEnd();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.displayCutout()) != 0) {
            this.windowInsets.getDisplayCutout().onAnimationEnd();
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(@NotNull WindowInsetsAnimationCompat animation) {
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
            this.windowInsets.getIme().onAnimationStart();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.statusBars()) != 0) {
            this.windowInsets.getStatusBars().onAnimationStart();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.navigationBars()) != 0) {
            this.windowInsets.getNavigationBars().onAnimationStart();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.systemGestures()) != 0) {
            this.windowInsets.getSystemGestures().onAnimationStart();
        }
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.displayCutout()) != 0) {
            this.windowInsets.getDisplayCutout().onAnimationStart();
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NotNull
    public WindowInsetsCompat onProgress(@NotNull WindowInsetsCompat platformInsets, @NotNull List<WindowInsetsAnimationCompat> runningAnimations) {
        a(this.windowInsets.getIme(), platformInsets, runningAnimations, WindowInsetsCompat.Type.ime());
        a(this.windowInsets.getStatusBars(), platformInsets, runningAnimations, WindowInsetsCompat.Type.statusBars());
        a(this.windowInsets.getNavigationBars(), platformInsets, runningAnimations, WindowInsetsCompat.Type.navigationBars());
        a(this.windowInsets.getSystemGestures(), platformInsets, runningAnimations, WindowInsetsCompat.Type.systemGestures());
        a(this.windowInsets.getDisplayCutout(), platformInsets, runningAnimations, WindowInsetsCompat.Type.displayCutout());
        return platformInsets;
    }
}
