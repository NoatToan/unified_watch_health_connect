package androidx.navigation.ui;

import android.view.Menu;
import androidx.navigation.e;
import defpackage.fbh;
import defpackage.ze1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\f\u001a:\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/navigation/e;", "navGraph", "Lfbh;", "drawerLayout", "Lkotlin/Function0;", "", "fallbackOnNavigateUpListener", "Lze1;", "AppBarConfiguration", "(Landroidx/navigation/e;Lfbh;Lkotlin/jvm/functions/Function0;)Lze1;", "Landroid/view/Menu;", "topLevelMenu", "(Landroid/view/Menu;Lfbh;Lkotlin/jvm/functions/Function0;)Lze1;", "", "", "topLevelDestinationIds", "(Ljava/util/Set;Lfbh;Lkotlin/jvm/functions/Function0;)Lze1;", "navigation-ui-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class AppBarConfigurationKt {

    /* JADX INFO: renamed from: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    @NotNull
    public static final ze1 AppBarConfiguration(@NotNull e eVar, @Nullable fbh fbhVar, @NotNull Function0<Boolean> function0) {
        ze1 ze1VarA = new ze1.b(eVar).c(fbhVar).b(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return ze1VarA;
    }

    public static /* synthetic */ ze1 AppBarConfiguration$default(Menu menu, fbh fbhVar, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            fbhVar = null;
        }
        if ((i & 4) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.valueOf(invoke2());
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2() {
                    return false;
                }
            };
        }
        ze1 ze1VarA = new ze1.b(menu).c(fbhVar).b(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return ze1VarA;
    }

    @NotNull
    public static final ze1 AppBarConfiguration(@NotNull Menu menu, @Nullable fbh fbhVar, @NotNull Function0<Boolean> function0) {
        ze1 ze1VarA = new ze1.b(menu).c(fbhVar).b(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return ze1VarA;
    }

    public static /* synthetic */ ze1 AppBarConfiguration$default(e eVar, fbh fbhVar, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            fbhVar = null;
        }
        if ((i & 4) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        ze1 ze1VarA = new ze1.b(eVar).c(fbhVar).b(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return ze1VarA;
    }

    @NotNull
    public static final ze1 AppBarConfiguration(@NotNull Set<Integer> set, @Nullable fbh fbhVar, @NotNull Function0<Boolean> function0) {
        ze1 ze1VarA = new ze1.b(set).c(fbhVar).b(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return ze1VarA;
    }

    public static /* synthetic */ ze1 AppBarConfiguration$default(Set set, fbh fbhVar, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            fbhVar = null;
        }
        if ((i & 4) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.valueOf(invoke2());
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2() {
                    return false;
                }
            };
        }
        ze1 ze1VarA = new ze1.b((Set<Integer>) set).c(fbhVar).b(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).a();
        Intrinsics.checkExpressionValueIsNotNull(ze1VarA, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return ze1VarA;
    }
}
