package androidx.navigation;

import defpackage.iig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Liig;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/navigation/e;", "createGraph", "(Liig;IILkotlin/jvm/functions/Function1;)Landroidx/navigation/e;", "navigation-runtime-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class NavHostKt {
    @NotNull
    public static final e createGraph(@NotNull iig iigVar, int i, int i2, @NotNull Function1<? super NavGraphBuilder, Unit> function1) {
        NavController navController = iigVar.p();
        Intrinsics.checkExpressionValueIsNotNull(navController, "navController");
        j navigatorProvider = navController.l();
        Intrinsics.checkExpressionValueIsNotNull(navigatorProvider, "navigatorProvider");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i, i2);
        function1.invoke2(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ e createGraph$default(iig iigVar, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        NavController navController = iigVar.p();
        Intrinsics.checkExpressionValueIsNotNull(navController, "navController");
        j navigatorProvider = navController.l();
        Intrinsics.checkExpressionValueIsNotNull(navigatorProvider, "navigatorProvider");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i, i2);
        function1.invoke2(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
