package com.xiaomi.fitness.common.viewbinding;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import androidx.fragment.app.DialogFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a&\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0007\u001a\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"requireViewByIdCompat", "V", "Landroid/view/View;", "id", "", "(Landroid/view/View;I)Landroid/view/View;", "Landroid/app/Activity;", "(Landroid/app/Activity;I)Landroid/view/View;", "findRootView", LifecycleConstantKt.TYPE_ACTIVITY, "getRootView", "Landroidx/fragment/app/DialogFragment;", "viewBindingRootId", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewBindingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewBindingUtil.kt\ncom/xiaomi/fitness/common/viewbinding/ViewBindingUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n18#1:54\n1#2:53\n*S KotlinDebug\n*F\n+ 1 ViewBindingUtil.kt\ncom/xiaomi/fitness/common/viewbinding/ViewBindingUtilKt\n*L\n48#1:54\n*E\n"})
public final class ViewBindingUtilKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final View findRootView(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null) {
            throw new IllegalStateException("Activity has no content view".toString());
        }
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            throw new IllegalStateException("Content view has no children. Provide root view explicitly".toString());
        }
        if (childCount != 1) {
            throw new IllegalStateException("More than one child view found in Activity content view".toString());
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        return childAt;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final View getRootView(@NotNull DialogFragment dialogFragment, int i) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment doesn't have dialog. Use viewBinding delegate after onCreateDialog".toString());
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("Fragment's Dialog has no window".toString());
        }
        View decorView = window.getDecorView();
        if (i != 0) {
            Intrinsics.checkNotNull(decorView);
            decorView = c.o0(decorView, i);
        }
        Intrinsics.checkNotNullExpressionValue(decorView, "with(...)");
        return decorView;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final <V extends View> V requireViewByIdCompat(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (V) c.o0(view, i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final <V extends View> V requireViewByIdCompat(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return (V) androidx.core.app.a.w(activity, i);
    }
}
