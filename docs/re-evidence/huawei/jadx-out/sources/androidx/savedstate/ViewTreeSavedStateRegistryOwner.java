package androidx.savedstate;

import android.view.View;
import defpackage.zcp;
import defpackage.zdz;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "get", "setViewTreeSavedStateRegistryOwner", "", "owner", "set", "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeSavedStateRegistryOwner {
    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        zcp.c(view, "");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }

    public static final SavedStateRegistryOwner get(View view) {
        zcp.c(view, "");
        return (SavedStateRegistryOwner) zdz.a(zdz.b(zdz.b(view, new Function1<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
            @Override // kotlin.jvm.functions.Function1
            public final View invoke(View view2) {
                zcp.c(view2, "");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), (Function1) new Function1<View, SavedStateRegistryOwner>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // kotlin.jvm.functions.Function1
            public final SavedStateRegistryOwner invoke(View view2) {
                zcp.c(view2, "");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof SavedStateRegistryOwner) {
                    return (SavedStateRegistryOwner) tag;
                }
                return null;
            }
        }));
    }
}
