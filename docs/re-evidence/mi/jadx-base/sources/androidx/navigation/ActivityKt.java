package androidx.navigation;

import android.app.Activity;
import defpackage.mig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/app/Activity;", "viewId", "", "navigation-runtime-ktx_release"}, k = 2, mv = {1, 1, 16})
public final class ActivityKt {
    @NotNull
    public static final NavController findNavController(@NotNull Activity activity, int i) {
        NavController navControllerA = mig.a(activity, i);
        Intrinsics.checkExpressionValueIsNotNull(navControllerA, "Navigation.findNavController(this, viewId)");
        return navControllerA;
    }
}
