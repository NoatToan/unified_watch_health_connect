package com.xiaomi.fitness.baseui.extension;

import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogCoroutineScope;
import com.xiaomi.passport.ui.settings.SimpleDialogFragment;
import defpackage.av6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a^\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2%\u0010\u0011\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000e¢\u0006\u0004\b\b\u0010\u0012\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00132\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0014\u001aV\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052%\u0010\u0011\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000e¢\u0006\u0004\b\b\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialog", "", SimpleDialogFragment.ARG_CANCELABLE, "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", "scopeDialogShow", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;ZLkotlinx/coroutines/CoroutineDispatcher;)Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", "", "dialogName", "Lav6;", "dialogCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "create", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;ZLkotlinx/coroutines/CoroutineDispatcher;Lav6;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;ZLkotlinx/coroutines/CoroutineDispatcher;)Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", "", "adaptCutoutFullScreen", "(Landroidx/fragment/app/FragmentActivity;)V", "ui_release"}, k = 2, mv = {2, 0, 0})
public final class ActivityExtKt {
    public static final void adaptCutoutFullScreen(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        WindowManager.LayoutParams attributes = fragmentActivity.getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.xiaomi.fitness.baseui.dialog.DialogCoroutineScope] */
    @Nullable
    public static final DialogCoroutineScope scopeDialogShow(@NotNull FragmentActivity fragmentActivity, @NotNull String dialogName, boolean z, @NotNull CoroutineDispatcher dispatcher, @NotNull final av6 dialogCallback, @NotNull Function1<? super String, ? extends CommonDialog<?>> create) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dialogCallback, "dialogCallback");
        Intrinsics.checkNotNullParameter(create, "create");
        Fragment fragmentL0 = fragmentActivity.getSupportFragmentManager().l0(dialogName);
        CommonDialog<?> commonDialogInvoke = fragmentL0 instanceof CommonDialog ? (CommonDialog) fragmentL0 : null;
        if (commonDialogInvoke != null && commonDialogInvoke.isShowing()) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (commonDialogInvoke == null) {
            commonDialogInvoke = create.invoke2(dialogName);
            commonDialogInvoke.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.baseui.extension.ActivityExtKt.scopeDialogShow.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName2, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName2, dialog, which);
                    dialogCallback.onDialogClick(dialogName2, dialog, which);
                }

                @Override // defpackage.av6
                public void onDialogEvent(String dialogName2, DialogInterface dialog, int what) {
                    DialogCoroutineScope dialogCoroutineScope;
                    super.onDialogEvent(dialogName2, dialog, what);
                    if (what == 3 && (dialogCoroutineScope = objectRef.element) != null) {
                        dialogCoroutineScope.close();
                    }
                    dialogCallback.onDialogEvent(dialogName2, dialog, what);
                }

                @Override // defpackage.av6
                public boolean onDialogKeyEvent(String dialogName2, DialogInterface dialog, int keyCode, KeyEvent event) {
                    return dialogCallback.onDialogKeyEvent(dialogName2, dialog, keyCode, event);
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName2, int which, boolean isChecked) {
                    super.onDialogMultiClick(dialogName2, which, isChecked);
                    dialogCallback.onDialogMultiClick(dialogName2, which, isChecked);
                }
            });
        }
        ?? Launch = new DialogCoroutineScope(fragmentActivity, commonDialogInvoke, z, dispatcher).launch();
        objectRef.element = Launch;
        return Launch;
    }

    public static /* synthetic */ DialogCoroutineScope scopeDialogShow$default(FragmentActivity fragmentActivity, String str, boolean z, CoroutineDispatcher coroutineDispatcher, av6 av6Var, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeDialogShow(fragmentActivity, str, z2, coroutineDispatcher, av6Var, function1);
    }

    public static /* synthetic */ DialogCoroutineScope scopeDialogShow$default(FragmentActivity fragmentActivity, CommonDialog commonDialog, boolean z, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
        if ((i & 1) != 0) {
            commonDialog = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeDialogShow(fragmentActivity, (CommonDialog<?>) commonDialog, z, coroutineDispatcher);
    }

    public static /* synthetic */ DialogCoroutineScope scopeDialogShow$default(Fragment fragment, CommonDialog commonDialog, boolean z, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
        if ((i & 1) != 0) {
            commonDialog = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeDialogShow(fragment, (CommonDialog<?>) commonDialog, z, coroutineDispatcher);
    }

    public static /* synthetic */ DialogCoroutineScope scopeDialogShow$default(Fragment fragment, String str, boolean z, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeDialogShow(fragment, str, z, coroutineDispatcher, function1);
    }

    @NotNull
    public static final DialogCoroutineScope scopeDialogShow(@NotNull FragmentActivity fragmentActivity, @Nullable CommonDialog<?> commonDialog, boolean z, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new DialogCoroutineScope(fragmentActivity, commonDialog, z, dispatcher).launch();
    }

    @NotNull
    public static final DialogCoroutineScope scopeDialogShow(@NotNull Fragment fragment, @Nullable CommonDialog<?> commonDialog, boolean z, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new DialogCoroutineScope(fragmentActivityRequireActivity, commonDialog, z, dispatcher).launch();
    }

    @Nullable
    public static final DialogCoroutineScope scopeDialogShow(@NotNull Fragment fragment, @NotNull String dialogName, boolean z, @NotNull CoroutineDispatcher dispatcher, @NotNull Function1<? super String, ? extends CommonDialog<?>> create) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(create, "create");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Fragment fragmentL0 = fragmentActivityRequireActivity.getSupportFragmentManager().l0(dialogName);
        CommonDialog<?> commonDialogInvoke = fragmentL0 instanceof CommonDialog ? (CommonDialog) fragmentL0 : null;
        if (commonDialogInvoke != null && commonDialogInvoke.isShowing()) {
            return null;
        }
        if (commonDialogInvoke == null) {
            commonDialogInvoke = create.invoke2(dialogName);
        }
        return new DialogCoroutineScope(fragmentActivityRequireActivity, commonDialogInvoke, z, dispatcher).launch();
    }
}
