package androidx.p008lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.ViewKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "findViewTreeLifecycleOwner", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 4, 1})
public final class View {
    @Nullable
    public static final LifecycleOwner findViewTreeLifecycleOwner(@NotNull android.view.View view) {
        return ViewTreeLifecycleOwner.get(view);
    }
}
