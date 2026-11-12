package com.xiaomi.fitness.common.extension;

import android.content.Context;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldih;", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "target", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/baseui/common/FragmentParams$b;", "", "Lkotlin/ExtensionFunctionType;", "extra", "goCommonActivity", "(Ldih;Landroid/content/Context;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class PageUtilExtKt {
    public static final void goCommonActivity(@NotNull dih dihVar, @NotNull Context context, @NotNull Class<?> target, @Nullable Function1<? super FragmentParams.b, Unit> function1) {
        Intrinsics.checkNotNullParameter(dihVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        FragmentParams.b bVarE = new FragmentParams.b().e(target);
        if (function1 != null) {
            Intrinsics.checkNotNull(bVarE);
            function1.invoke(bVarE);
        }
        dihVar.e(context, bVarE.b());
    }

    public static /* synthetic */ void goCommonActivity$default(dih dihVar, Context context, Class cls, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        goCommonActivity(dihVar, context, cls, function1);
    }
}
