package com.huami.wallet.ui.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.nfc.bus.entities.ButtonInfo;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.helper.XiaomiBulletinHelper;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\bH\u0007¨\u0006\u0013"}, d2 = {"Lcom/huami/wallet/ui/helper/XiaomiBulletinHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "xiaomiBulletin", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "", "toWeb", "keepIt", "showXiaomiBulletin", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiBulletinHelper {

    @NotNull
    public static final XiaomiBulletinHelper INSTANCE = new XiaomiBulletinHelper();

    private XiaomiBulletinHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(XiaomiBulletin xiaomiBulletin, Function1 function1, Function1 function2, DialogInterface dialogInterface, int i) {
        ButtonInfo negativeButton;
        String link;
        dialogInterface.dismiss();
        ButtonInfo negativeButton2 = xiaomiBulletin.getNegativeButton();
        if (negativeButton2 != null) {
            Boolean boolValueOf = Boolean.valueOf(negativeButton2.getNoMorePrompt());
            if (!boolValueOf.booleanValue()) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                function1.invoke(xiaomiBulletin);
            }
        }
        ButtonInfo negativeButton3 = xiaomiBulletin.getNegativeButton();
        boolean z = false;
        if (negativeButton3 != null && negativeButton3.getLinkType() == 1) {
            z = true;
        }
        if (!z || (negativeButton = xiaomiBulletin.getNegativeButton()) == null || (link = negativeButton.getLink()) == null) {
            return;
        }
        function2.invoke(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(XiaomiBulletin xiaomiBulletin, Function1 function1, Function1 function2, DialogInterface dialogInterface, int i) {
        ButtonInfo positiveButton;
        String link;
        dialogInterface.dismiss();
        ButtonInfo positiveButton2 = xiaomiBulletin.getPositiveButton();
        if (positiveButton2 != null) {
            Boolean boolValueOf = Boolean.valueOf(positiveButton2.getNoMorePrompt());
            if (!boolValueOf.booleanValue()) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                function1.invoke(xiaomiBulletin);
            }
        }
        ButtonInfo positiveButton3 = xiaomiBulletin.getPositiveButton();
        boolean z = false;
        if (positiveButton3 != null && positiveButton3.getLinkType() == 1) {
            z = true;
        }
        if (!z || (positiveButton = xiaomiBulletin.getPositiveButton()) == null || (link = positiveButton.getLink()) == null) {
            return;
        }
        function2.invoke(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Ref.ObjectRef objectRef, Function1 function1, XiaomiBulletin xiaomiBulletin, Function1 function2, DialogInterface dialogInterface, int i) {
        ButtonInfo buttonInfo;
        String link;
        dialogInterface.dismiss();
        ButtonInfo buttonInfo2 = (ButtonInfo) objectRef.element;
        if (buttonInfo2 != null) {
            Boolean boolValueOf = Boolean.valueOf(buttonInfo2.getNoMorePrompt());
            if (!boolValueOf.booleanValue()) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                function1.invoke(xiaomiBulletin);
            }
        }
        ButtonInfo buttonInfo3 = (ButtonInfo) objectRef.element;
        boolean z = false;
        if (buttonInfo3 != null && buttonInfo3.getLinkType() == 1) {
            z = true;
        }
        if (!z || (buttonInfo = (ButtonInfo) objectRef.element) == null || (link = buttonInfo.getLink()) == null) {
            return;
        }
        function2.invoke(link);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.huami.nfc.bus.entities.ButtonInfo] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.huami.nfc.bus.entities.ButtonInfo] */
    @JvmStatic
    public static final void showXiaomiBulletin(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull final XiaomiBulletin xiaomiBulletin, @NotNull final Function1<? super String, Unit> toWeb, @NotNull final Function1<? super XiaomiBulletin, Unit> keepIt) {
        Spanned spannedFromHtml = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(xiaomiBulletin.getContent(), 0) : Html.fromHtml(xiaomiBulletin.getContent());
        Object systemService = context.getSystemService("layout_inflater");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.wl_view_bulletin, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_view_content)).setText(spannedFromHtml);
        AlertDialogFragment.Builder contentView = new AlertDialogFragment.Builder(context).setCancelable(false).setTitle(xiaomiBulletin.getTitle()).setContentView(viewInflate);
        if (xiaomiBulletin.getNegativeButton() == null || xiaomiBulletin.getPositiveButton() == null) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? negativeButton = xiaomiBulletin.getNegativeButton();
            if (negativeButton != 0) {
                objectRef.element = negativeButton;
            }
            ?? positiveButton = xiaomiBulletin.getPositiveButton();
            if (positiveButton != 0) {
                objectRef.element = positiveButton;
            }
            T t = objectRef.element;
            if (((ButtonInfo) t) != null) {
                ButtonInfo buttonInfo = (ButtonInfo) t;
                contentView.setNeutralButton(buttonInfo != null ? buttonInfo.getTitle() : null, new DialogInterface.OnClickListener() { // from class: mz8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        XiaomiBulletinHelper.f(objectRef, keepIt, xiaomiBulletin, toWeb, dialogInterface, i);
                    }
                });
            }
        } else {
            if (xiaomiBulletin.getNegativeButton() != null) {
                ButtonInfo negativeButton2 = xiaomiBulletin.getNegativeButton();
                String title = negativeButton2 == null ? null : negativeButton2.getTitle();
                if (!(title == null || title.length() == 0)) {
                    ButtonInfo negativeButton3 = xiaomiBulletin.getNegativeButton();
                    contentView.setPositiveButton(negativeButton3 == null ? null : negativeButton3.getTitle(), new DialogInterface.OnClickListener() { // from class: kz8
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            XiaomiBulletinHelper.d(xiaomiBulletin, keepIt, toWeb, dialogInterface, i);
                        }
                    });
                }
            }
            if (xiaomiBulletin.getPositiveButton() != null) {
                ButtonInfo positiveButton2 = xiaomiBulletin.getPositiveButton();
                String title2 = positiveButton2 == null ? null : positiveButton2.getTitle();
                if (!(title2 == null || title2.length() == 0)) {
                    ButtonInfo positiveButton3 = xiaomiBulletin.getPositiveButton();
                    contentView.setNegativeButton(positiveButton3 != null ? positiveButton3.getTitle() : null, new DialogInterface.OnClickListener() { // from class: lz8
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            XiaomiBulletinHelper.e(xiaomiBulletin, keepIt, toWeb, dialogInterface, i);
                        }
                    });
                }
            }
        }
        contentView.show(fragmentManager);
    }
}
