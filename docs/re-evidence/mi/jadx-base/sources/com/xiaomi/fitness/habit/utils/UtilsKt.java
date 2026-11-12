package com.xiaomi.fitness.habit.utils;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.av6;
import defpackage.b0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u001ah\u0010\u0000\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u001a\u0098\u0001\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00162'\b\u0002\u0010\t\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2'\b\u0002\u0010\f\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0016¨\u0006\u001b"}, d2 = {"showMsgDialog", "", "titleResId", "", "msgResId", "positiveResId", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "negativeResId", "positiveCallback", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "negativeCallback", "title", "", "msg", "showCustomerDialog", "customerView", "Landroid/view/View;", "positiveString", "negativeString", "isCancelable", "", "Lkotlin/ParameterName;", "name", "dialog", "isShowGotIt", "habit_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilsKt {
    public static final void showCustomerDialog(@NotNull String title, @NotNull View customerView, @Nullable String str, @NotNull FragmentManager fragmentManager, @Nullable String str2, boolean z, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(customerView, "customerView");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog.c cancelable = new CommonDialog.c("TransitionCardDetailFragment.bullet").setDialogTitle(new DialogParams.DialogDescriptionString(title)).setCancelable(z);
        if (str != null && !StringsKt__StringsKt.isBlank(str)) {
            cancelable.setPositiveText(str);
        }
        if (str2 != null && !StringsKt__StringsKt.isBlank(str2)) {
            cancelable.setNegativeText(str2);
        }
        if ((str == null || StringsKt__StringsKt.isBlank(str)) && ((str2 == null || StringsKt__StringsKt.isBlank(str2)) && z2)) {
            cancelable.setPositiveText(b0j.n);
        }
        cancelable.setCustomView(customerView);
        CommonDialog commonDialogCreate = cancelable.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.habit.utils.UtilsKt.showCustomerDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function1<DialogInterface, Unit> function3;
                if (which == -2) {
                    Function1<DialogInterface, Unit> function4 = function2;
                    if (function4 != null) {
                        function4.invoke2(dialog);
                    }
                } else if (which == -1 && (function3 = function1) != null) {
                    function3.invoke2(dialog);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public static final void showMsgDialog(int i, int i2, int i3, @NotNull FragmentManager fragmentManager, int i4, @Nullable Function1<? super DialogInterface, Unit> function1, @Nullable Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        showMsgDialog(AppUtil.getApp().getString(i), AppUtil.getApp().getString(i2), i3, fragmentManager, i4, function1, function2);
    }

    public static /* synthetic */ void showMsgDialog$default(int i, int i2, int i3, FragmentManager fragmentManager, int i4, Function1 function1, Function1 function2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        showMsgDialog(i, i2, i3, fragmentManager, i4, (Function1<? super DialogInterface, Unit>) ((i5 & 32) != 0 ? null : function1), (Function1<? super DialogInterface, Unit>) ((i5 & 64) != 0 ? null : function2));
    }

    public static final void showMsgDialog(@Nullable String str, @Nullable String str2, int i, @NotNull FragmentManager fragmentManager, int i2, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog.c cVar = new CommonDialog.c("CardManagerFragment.delete.mi");
        if (str != null) {
            cVar.setDialogTitle(new DialogParams.DialogDescriptionString(str));
        }
        if (str2 != null) {
            cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(str2));
        }
        cVar.setPositiveText(i);
        if (i2 != -1) {
            cVar.setNegativeText(i2);
        }
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.habit.utils.UtilsKt.showMsgDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function1<DialogInterface, Unit> function3;
                if (which == -2) {
                    Function1<DialogInterface, Unit> function4 = function2;
                    if (function4 != null) {
                        function4.invoke2(dialog);
                    }
                } else if (which == -1 && (function3 = function1) != null) {
                    function3.invoke2(dialog);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public static /* synthetic */ void showMsgDialog$default(String str, String str2, int i, FragmentManager fragmentManager, int i2, Function1 function1, Function1 function2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        showMsgDialog(str, str2, i, fragmentManager, i2, (Function1<? super DialogInterface, Unit>) ((i3 & 32) != 0 ? null : function1), (Function1<? super DialogInterface, Unit>) ((i3 & 64) != 0 ? null : function2));
    }
}
