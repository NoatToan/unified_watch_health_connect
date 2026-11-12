package com.xiaomi.fitness.common.viewbinding;

import android.view.View;
import androidx.p004activity.ComponentActivity;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aG\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001ac\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\u00042\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\r\u001aM\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Landroidx/activity/ComponentActivity;", "A", "Lbsq;", "T", "Lkotlin/Function1;", "viewBinder", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "viewBindingActivity", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "viewBinding", "Landroid/view/View;", "vbFactory", "viewProvider", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "", "viewBindingRootId", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;I)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "common_release"}, k = 2, mv = {2, 0, 0})
@JvmName(name = "ActivityViewBindings")
public final class ActivityViewBindings {
    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <A extends ComponentActivity, T extends bsq> ViewBindingProperty<A, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Function1<? super A, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new ActivityViewBindingProperty(viewBinder);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = ActivityViewBindings$viewBinding$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingActivity(componentActivity, new ActivityViewBindings$viewBinding$2(vbFactory, viewProvider));
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <A extends ComponentActivity, T extends bsq> ViewBindingProperty<A, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Function1<? super View, ? extends T> vbFactory, @NotNull Function1<? super A, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingActivity(componentActivity, new ActivityViewBindings$viewBinding$2(vbFactory, viewProvider));
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <T extends bsq> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull final Function1<? super View, ? extends T> vbFactory, final int i) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewBindingActivity(componentActivity, new Function1<ComponentActivity, T>() { // from class: com.xiaomi.fitness.common.viewbinding.ActivityViewBindings$viewBinding$3
            /* JADX WARN: Incorrect return type in method signature: (Landroidx/activity/ComponentActivity;)TT; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final bsq invoke2(ComponentActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return (bsq) vbFactory.invoke2(androidx.core.app.a.w(activity, i));
            }
        });
    }
}
