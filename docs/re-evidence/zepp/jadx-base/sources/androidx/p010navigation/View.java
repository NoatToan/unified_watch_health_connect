package androidx.p010navigation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.navigation.ViewKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/view/View;", "Landroidx/navigation/NavController;", "findNavController", "navigation-runtime-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class View {
    @NotNull
    public static final NavController findNavController(@NotNull android.view.View view) {
        return Navigation.findNavController(view);
    }
}
