package com.xiaomi.fitness.nfc.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.nfc.dialog.CountDownDialog;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.cih;
import defpackage.o0j;
import defpackage.pli;
import defpackage.rji;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001aj\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015\u001an\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015\u001ap\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015\u001a\u0094\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\"\u001a\u00020\n2%\u0010\u0014\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152%\u0010\u0017\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\b\b\u0002\u0010&\u001a\u00020\n\u001a\u0010\u0010'\u001a\u00020\u00012\b\u0010(\u001a\u0004\u0018\u00010!\u001a\u0016\u0010)\u001a\u0004\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0,\u001a \u0010-\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000100¨\u00061"}, d2 = {"gotoPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/content/Context;", "clazz", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "isParcelable", "", "showMsgDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "titleResId", "", "msgResId", "positiveResId", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "negativeResId", "positiveCallback", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "negativeCallback", "title", "", "msg", "", "showCountDownDialog", "positiveString", "negativeString", "showCustomerDialog", "customerView", "Landroid/view/View;", "isCancelable", "Lkotlin/ParameterName;", "name", "dialog", "isShowGotIt", "resetL18BtnView", "view", "findMaxCoupon", "Lcom/miui/tsmclient/sesdk/OrderData$Coupon;", "list", "", "showMiPayPrivacy", "Landroidx/fragment/app/FragmentActivity;", "success", "Lkotlin/Function0;", "nfc_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/xiaomi/fitness/nfc/utils/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1971#2,14:262\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/xiaomi/fitness/nfc/utils/UtilsKt\n*L\n219#1:262,14\n*E\n"})
public final class UtilsKt {
    @Nullable
    public static final OrderData.Coupon findMaxCoupon(@NotNull List<? extends OrderData.Coupon> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int totalDiscount = ((OrderData.Coupon) next).getTotalDiscount();
                do {
                    Object next2 = it.next();
                    int totalDiscount2 = ((OrderData.Coupon) next2).getTotalDiscount();
                    if (totalDiscount < totalDiscount2) {
                        next = next2;
                        totalDiscount = totalDiscount2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (OrderData.Coupon) obj;
    }

    public static final void gotoPage(@NotNull Context activity, @NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        cih.a().b(activity, new FragmentParams.b().e(clazz).c(bundle).a(true).b(), z);
    }

    public static /* synthetic */ void gotoPage$default(Context context, Class cls, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        gotoPage(context, cls, bundle, z);
    }

    public static final void resetL18BtnView(@Nullable View view) {
        ViewGroup.LayoutParams layoutParams;
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            if (view != null) {
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = AppUtil.getApp().getResources().getDimensionPixelOffset(pli.common_btn_single_line_width);
            layoutParams2.addRule(14);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.width = AppUtil.getApp().getResources().getDimensionPixelOffset(pli.common_btn_single_line_width);
            layoutParams3.gravity = 1;
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams4.width = AppUtil.getApp().getResources().getDimensionPixelOffset(pli.common_btn_single_line_width);
            layoutParams4.gravity = 1;
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    @Nullable
    public static final CommonDialog<?> showCountDownDialog(@Nullable String str, @NotNull CharSequence msg, @NotNull String positiveString, @NotNull FragmentManager fragmentManager, @Nullable String str2, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(positiveString, "positiveString");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CountDownDialog.Builder dialogDescriptionString = new CountDownDialog.Builder("showCountDownDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg));
        if (str != null) {
            dialogDescriptionString.setDialogTitle(new DialogParams.DialogDescriptionString(str));
        }
        dialogDescriptionString.setPositiveText(positiveString);
        if (str2 != null) {
            dialogDescriptionString.setNegativeText(str2);
        }
        CommonDialog<?> commonDialogCreate = dialogDescriptionString.create();
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.utils.UtilsKt.showCountDownDialog.1
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
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(fragmentManager);
        }
        return commonDialogCreate;
    }

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
            cancelable.setPositiveText(o0j.u2);
        }
        cancelable.setCustomView(customerView);
        CommonDialog commonDialogCreate = cancelable.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.utils.UtilsKt.showCustomerDialog.1
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

    public static final boolean showMiPayPrivacy(@NotNull final FragmentActivity activity, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (NfcPreference.INSTANCE.getKEY_NFC_CARD_MANAGER_POLICY()) {
            return true;
        }
        new CommonDialog.c("commonDialog").setDialogTitle(o0j.F5).setNegativeText(o0j.d).setPositiveText(o0j.f28615a).setCanceledOnBackPressed(false).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(activity, activity.getString(o0j.A4, "https://sf.pay.xiaomi.com/views/smartCardProtocol/privacyPolicy.html", "https://watch.iot.mi.com/html/privacy/index.html?type=smartcard&region=CN"), Integer.valueOf(rji.common_blue), new LinkSpanHelper.a() { // from class: nmq
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                UtilsKt.showMiPayPrivacy$lambda$1(view, str);
            }
        }))).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.utils.UtilsKt.showMiPayPrivacy.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    activity.finish();
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                NfcPreference.INSTANCE.setKEY_NFC_CARD_MANAGER_POLICY(true);
                Function0<Unit> function1 = function0;
                if (function1 != null) {
                    function1.invoke();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(activity.getSupportFragmentManager());
        return false;
    }

    public static /* synthetic */ boolean showMiPayPrivacy$default(FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        return showMiPayPrivacy(fragmentActivity, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMiPayPrivacy$lambda$1(View view, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        WebViewUtilKt.startWebView$default(str, " ", false, false, null, false, null, false, 252, null);
    }

    @Nullable
    public static final CommonDialog<?> showMsgDialog(int i, int i2, int i3, @NotNull FragmentManager fragmentManager, int i4, @Nullable Function1<? super DialogInterface, Unit> function1, @Nullable Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        String string = AppUtil.getApp().getString(i);
        String string2 = AppUtil.getApp().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return showMsgDialog(string, string2, i3, fragmentManager, i4, function1, function2);
    }

    public static /* synthetic */ CommonDialog showMsgDialog$default(int i, int i2, int i3, FragmentManager fragmentManager, int i4, Function1 function1, Function1 function2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        return showMsgDialog(i, i2, i3, fragmentManager, i4, (Function1<? super DialogInterface, Unit>) ((i5 & 32) != 0 ? null : function1), (Function1<? super DialogInterface, Unit>) ((i5 & 64) != 0 ? null : function2));
    }

    @Nullable
    public static final CommonDialog<?> showMsgDialog(@Nullable String str, @NotNull CharSequence msg, int i, @NotNull FragmentManager fragmentManager, int i2, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog.c dialogDescriptionString = new CommonDialog.c("CardManagerFragment.delete.mi").setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg));
        if (str != null) {
            dialogDescriptionString.setDialogTitle(new DialogParams.DialogDescriptionString(str));
        }
        dialogDescriptionString.setPositiveText(i);
        if (i2 != -1) {
            dialogDescriptionString.setNegativeText(i2);
        }
        CommonDialog<?> commonDialogCreate = dialogDescriptionString.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.utils.UtilsKt.showMsgDialog.1
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
        return commonDialogCreate;
    }
}
