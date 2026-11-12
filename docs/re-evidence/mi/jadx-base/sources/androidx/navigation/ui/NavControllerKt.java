package androidx.navigation.ui;

import androidx.navigation.NavController;
import androidx.navigation.e;
import defpackage.fbh;
import defpackage.sig;
import defpackage.ze1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Landroidx/navigation/NavController;", "Lfbh;", "drawerLayout", "", "navigateUp", "(Landroidx/navigation/NavController;Lfbh;)Z", "Lze1;", "appBarConfiguration", "(Landroidx/navigation/NavController;Lze1;)Z", "navigation-ui-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class NavControllerKt {
    public static final boolean navigateUp(@NotNull NavController navController, @Nullable fbh fbhVar) {
        e graph = navController.j();
        Intrinsics.checkExpressionValueIsNotNull(graph, "graph");
        AppBarConfigurationKt.AnonymousClass1 anonymousClass1 = AppBarConfigurationKt.AnonymousClass1.INSTANCE;
        ze1.b bVarC = new ze1.b(graph).c(fbhVar);
        Object appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = anonymousClass1;
        if (anonymousClass1 != null) {
            appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(anonymousClass1);
        }
        ze1 ze1VarA = bVarC.b((ze1.c) appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return sig.e(navController, ze1VarA);
    }

    public static final boolean navigateUp(@NotNull NavController navController, @NotNull ze1 ze1Var) {
        return sig.e(navController, ze1Var);
    }
}
