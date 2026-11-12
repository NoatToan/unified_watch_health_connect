package androidx.navigation;

import defpackage.hn0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhn0;", "activityOptions", "", "flags", "Landroidx/navigation/a$b;", "ActivityNavigatorExtras", "(Lhn0;I)Landroidx/navigation/a$b;", "navigation-runtime-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class ActivityNavigatorExtrasKt {
    @NotNull
    public static final a.b ActivityNavigatorExtras(@Nullable hn0 hn0Var, int i) {
        a.b.C0046a c0046a = new a.b.C0046a();
        c0046a.a(i);
        a.b bVarB = c0046a.b();
        Intrinsics.checkExpressionValueIsNotNull(bVarB, "ActivityNavigator.Extras…(flags)\n        }.build()");
        return bVarB;
    }

    public static /* synthetic */ a.b ActivityNavigatorExtras$default(hn0 hn0Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hn0Var = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ActivityNavigatorExtras(hn0Var, i);
    }
}
