package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.UiElement;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a implements io.sentry.internal.gestures.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21479b = new int[2];

    public a(boolean z) {
        this.f21478a = z;
    }

    public static boolean c(@NotNull View view, boolean z) {
        if (z) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    public static boolean d(@NotNull View view, boolean z) {
        return (c(view, z) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    public static boolean e(@NotNull View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.a
    @Nullable
    public UiElement a(@NotNull Object obj, float f, float f2, UiElement.Type type) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (f(view, f, f2)) {
            if (type == UiElement.Type.CLICKABLE && e(view)) {
                return b(view);
            }
            if (type == UiElement.Type.SCROLLABLE && d(view, this.f21478a)) {
                return b(view);
            }
        }
        return null;
    }

    public final UiElement b(@NotNull View view) {
        try {
            return new UiElement(view, io.sentry.android.core.internal.util.d.a(view), i.b(view), null, "old_view_system");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final boolean f(@NotNull View view, float f, float f2) {
        view.getLocationOnScreen(this.f21479b);
        int[] iArr = this.f21479b;
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + view.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + view.getHeight()));
    }
}
