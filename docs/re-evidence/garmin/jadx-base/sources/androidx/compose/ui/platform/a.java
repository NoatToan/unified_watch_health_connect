package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import gl1.d;
import h4.e;
import java.lang.ref.WeakReference;
import kotlin.s1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int a(int i14, View view2) {
        int i15 = 0;
        int i16 = Integer.MAX_VALUE;
        Object obj = null;
        while (view2 != null) {
            Object tag = view2.getTag(i14);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i16 = i15;
            }
            i15++;
            Object objA = d.A(view2);
            view2 = objA instanceof View ? (View) objA : null;
        }
        return i16;
    }

    public static final View b(View view2) {
        if (!view2.isAttachedToWindow() || !e.f81539a) {
            return view2;
        }
        int iMin = Math.min(a(R.id.view_tree_lifecycle_owner, view2), a(R.id.view_tree_saved_state_registry_owner, view2));
        View view3 = view2;
        int i14 = 0;
        View view4 = view3;
        while (view2 != null) {
            if (i14 == iMin) {
                if (!(view2.getParent() instanceof ViewGroup)) {
                    return view3;
                }
            } else if (c(view2) == null) {
                i14++;
                Object objA = d.A(view2);
                View view5 = view3;
                view3 = view2;
                view2 = objA instanceof View ? (View) objA : null;
                view4 = view5;
            }
            return view2;
        }
        return view4;
    }

    public static final s1 c(View view2) {
        Object tag = view2.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (s1) weakReference.get();
        }
        return null;
    }
}
