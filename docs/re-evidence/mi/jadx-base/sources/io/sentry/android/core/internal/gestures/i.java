package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.UiElement;
import io.sentry.util.p;
import java.util.Iterator;
import java.util.LinkedList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class i {
    @Nullable
    public static UiElement a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull View view, float f, float f2, UiElement.Type type) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) p.c((View) linkedList.poll(), "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            Iterator<io.sentry.internal.gestures.a> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
            while (it.hasNext()) {
                UiElement uiElementA = it.next().a(view2, f, f2, type);
                if (uiElementA != null) {
                    if (type != UiElement.Type.CLICKABLE) {
                        return uiElementA;
                    }
                    uiElement = uiElementA;
                }
            }
        }
        return uiElement;
    }

    public static String b(@NotNull View view) throws Resources.NotFoundException {
        int id = view.getId();
        if (id == -1 || c(id)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static boolean c(int i) {
        return ((-16777216) & i) == 0 && (i & 16777215) != 0;
    }
}
