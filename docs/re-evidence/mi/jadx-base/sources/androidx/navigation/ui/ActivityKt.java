package androidx.navigation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.e;
import defpackage.sig;
import defpackage.ze1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "", "setupActionBarWithNavController", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/NavController;Landroidx/drawerlayout/widget/DrawerLayout;)V", "Lze1;", "configuration", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/NavController;Lze1;)V", "navigation-ui-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class ActivityKt {
    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity, @NotNull NavController navController, @Nullable DrawerLayout drawerLayout) {
        e eVarJ = navController.j();
        Intrinsics.checkExpressionValueIsNotNull(eVarJ, "navController.graph");
        AppBarConfigurationKt.AnonymousClass1 anonymousClass1 = AppBarConfigurationKt.AnonymousClass1.INSTANCE;
        ze1.b bVarC = new ze1.b(eVarJ).c(drawerLayout);
        Object appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = anonymousClass1;
        if (anonymousClass1 != null) {
            appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(anonymousClass1);
        }
        ze1 ze1VarA = bVarC.b((ze1.c) appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        sig.g(appCompatActivity, navController, ze1VarA);
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, ze1 ze1Var, int i, Object obj) {
        Object appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0;
        if ((i & 2) != 0) {
            e eVarJ = navController.j();
            Intrinsics.checkExpressionValueIsNotNull(eVarJ, "navController.graph");
            AppBarConfigurationKt.AnonymousClass1 anonymousClass1 = AppBarConfigurationKt.AnonymousClass1.INSTANCE;
            ze1.b bVarC = new ze1.b(eVarJ).c(null);
            if (anonymousClass1 != null) {
                appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = anonymousClass1;
                appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(anonymousClass1);
            }
            appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = anonymousClass1;
            ze1Var = bVarC.b((ze1.c) appBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0).a();
            Intrinsics.checkExpressionValueIsNotNull(ze1Var, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        }
        setupActionBarWithNavController(appCompatActivity, navController, ze1Var);
    }

    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity, @NotNull NavController navController, @NotNull ze1 ze1Var) {
        sig.g(appCompatActivity, navController, ze1Var);
    }
}
