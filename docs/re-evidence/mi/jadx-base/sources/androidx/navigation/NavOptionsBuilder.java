package androidx.navigation;

import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J0\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\t\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006&"}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "popUpTo", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/h;", "build$navigation_common_ktx_release", "()Landroidx/navigation/h;", OneTrack.Param.BUILD, "Landroidx/navigation/h$a;", "builder", "Landroidx/navigation/h$a;", "", "launchSingleTop", "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "value", "I", "getPopUpTo", "()I", "setPopUpTo", "(I)V", "inclusive", "<init>", "()V", "navigation-common-ktx_release"}, k = 1, mv = {1, 4, 0})
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;
    private final h.a builder = new h.a();
    private int popUpTo = -1;

    public final void anim(@NotNull Function1<? super AnimBuilder, Unit> animBuilder) {
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.builder.b(animBuilder2.getEnter()).c(animBuilder2.getExit()).e(animBuilder2.getPopEnter()).f(animBuilder2.getPopExit());
    }

    @NotNull
    public final h build$navigation_common_ktx_release() {
        h.a aVar = this.builder;
        aVar.d(this.launchSingleTop);
        aVar.g(this.popUpTo, this.inclusive);
        h hVarA = aVar.a();
        Intrinsics.checkExpressionValueIsNotNull(hVarA, "builder.apply {\n        … inclusive)\n    }.build()");
        return hVarA;
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final int getPopUpTo() {
        return this.popUpTo;
    }

    public final void popUpTo(int id, @NotNull Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        setPopUpTo(id);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
    }

    public final void setLaunchSingleTop(boolean z) {
        this.launchSingleTop = z;
    }

    public final void setPopUpTo(int i) {
        this.popUpTo = i;
        this.inclusive = false;
    }
}
