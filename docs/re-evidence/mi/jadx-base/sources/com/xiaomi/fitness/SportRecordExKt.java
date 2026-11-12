package com.xiaomi.fitness;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.SportRecordExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.trail.widget.DeleteRecordPopupWindow;
import defpackage.av6;
import defpackage.j1j;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u001a\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0017"}, d2 = {"getTrainEffectLevel", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getPeekTrainEffectLevel", "getAnaerobicTrainEffectLevel", "buildSpanWithUnit", "Landroid/text/SpannableStringBuilder;", "fullStr", "", "unitStr", "proportion", "", "showDeletePopupWindow", "", "itemView", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "deleteCallback", "Lkotlin/Function0;", "showDeleteConfirmDialog", "setWindowAlpha", SleepAnalyzerAlpha.NAME_ALPHA, "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportRecordExKt {
    @NotNull
    public static final SpannableStringBuilder buildSpanWithUnit(@NotNull String fullStr, @NotNull String unitStr, float f) {
        Intrinsics.checkNotNullParameter(fullStr, "fullStr");
        Intrinsics.checkNotNullParameter(unitStr, "unitStr");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fullStr);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) fullStr, unitStr, 0, false, 6, (Object) null);
        int length = unitStr.length() + iIndexOf$default;
        if (iIndexOf$default == -1) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new RelativeSizeSpan(f), iIndexOf$default, length, 17);
        return spannableStringBuilder;
    }

    public static /* synthetic */ SpannableStringBuilder buildSpanWithUnit$default(String str, String str2, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 0.47f;
        }
        return buildSpanWithUnit(str, str2, f);
    }

    public static final int getAnaerobicTrainEffectLevel(@NotNull SportBasicReport sportBasicReport) {
        Integer anaerobicTrainEffectLevel;
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        if (sportBasicReport.getAnaerobicTrainEffectLevel() != null && ((anaerobicTrainEffectLevel = sportBasicReport.getAnaerobicTrainEffectLevel()) == null || anaerobicTrainEffectLevel.intValue() != 0)) {
            Integer anaerobicTrainEffectLevel2 = sportBasicReport.getAnaerobicTrainEffectLevel();
            Intrinsics.checkNotNull(anaerobicTrainEffectLevel2);
            return anaerobicTrainEffectLevel2.intValue();
        }
        if (sportBasicReport.getAnaerobicTrainEffect() == null) {
            return 0;
        }
        Float anaerobicTrainEffect = sportBasicReport.getAnaerobicTrainEffect();
        Intrinsics.checkNotNull(anaerobicTrainEffect);
        if (xr5.a(anaerobicTrainEffect.floatValue(), 4.9f)) {
            return 6;
        }
        Float anaerobicTrainEffect2 = sportBasicReport.getAnaerobicTrainEffect();
        Intrinsics.checkNotNull(anaerobicTrainEffect2);
        if (xr5.a(anaerobicTrainEffect2.floatValue(), 3.9f)) {
            return 5;
        }
        Float anaerobicTrainEffect3 = sportBasicReport.getAnaerobicTrainEffect();
        Intrinsics.checkNotNull(anaerobicTrainEffect3);
        if (xr5.a(anaerobicTrainEffect3.floatValue(), 2.9f)) {
            return 4;
        }
        Float anaerobicTrainEffect4 = sportBasicReport.getAnaerobicTrainEffect();
        Intrinsics.checkNotNull(anaerobicTrainEffect4);
        if (xr5.a(anaerobicTrainEffect4.floatValue(), 1.9f)) {
            return 3;
        }
        Float anaerobicTrainEffect5 = sportBasicReport.getAnaerobicTrainEffect();
        Intrinsics.checkNotNull(anaerobicTrainEffect5);
        return xr5.a(anaerobicTrainEffect5.floatValue(), 0.9f) ? 2 : 1;
    }

    public static final int getPeekTrainEffectLevel(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        return 0;
    }

    public static final int getTrainEffectLevel(@NotNull SportBasicReport sportBasicReport) {
        Integer trainEffectLevel;
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        if (sportBasicReport.getTrainEffectLevel() != null && ((trainEffectLevel = sportBasicReport.getTrainEffectLevel()) == null || trainEffectLevel.intValue() != 0)) {
            Integer trainEffectLevel2 = sportBasicReport.getTrainEffectLevel();
            Intrinsics.checkNotNull(trainEffectLevel2);
            return trainEffectLevel2.intValue();
        }
        if (sportBasicReport.getTrainEffect() == null) {
            return 0;
        }
        Float trainEffect = sportBasicReport.getTrainEffect();
        Intrinsics.checkNotNull(trainEffect);
        if (xr5.a(trainEffect.floatValue(), 4.9f)) {
            return 6;
        }
        Float trainEffect2 = sportBasicReport.getTrainEffect();
        Intrinsics.checkNotNull(trainEffect2);
        if (xr5.a(trainEffect2.floatValue(), 3.9f)) {
            return 5;
        }
        Float trainEffect3 = sportBasicReport.getTrainEffect();
        Intrinsics.checkNotNull(trainEffect3);
        if (xr5.a(trainEffect3.floatValue(), 2.9f)) {
            return 4;
        }
        Float trainEffect4 = sportBasicReport.getTrainEffect();
        Intrinsics.checkNotNull(trainEffect4);
        if (xr5.a(trainEffect4.floatValue(), 1.9f)) {
            return 3;
        }
        Float trainEffect5 = sportBasicReport.getTrainEffect();
        Intrinsics.checkNotNull(trainEffect5);
        return xr5.a(trainEffect5.floatValue(), 0.9f) ? 2 : 1;
    }

    private static final void setWindowAlpha(float f, FragmentActivity fragmentActivity) {
        Window window = fragmentActivity.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = f;
        window.addFlags(2);
        window.setAttributes(attributes);
    }

    private static final void showDeleteConfirmDialog(final Function0<Unit> function0, FragmentActivity fragmentActivity) {
        new CommonDialog.c("delete sport record").setDialogTitle(j1j.O0).setDialogDescription(j1j.N0).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.SportRecordExKt.showDeleteConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    function0.invoke();
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(fragmentActivity.getSupportFragmentManager());
    }

    public static final void showDeletePopupWindow(@NotNull View itemView, @NotNull final FragmentActivity fragment, @NotNull final Function0<Unit> deleteCallback) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(deleteCallback, "deleteCallback");
        try {
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final DeleteRecordPopupWindow deleteRecordPopupWindow = new DeleteRecordPopupWindow(context);
            deleteRecordPopupWindow.setOnBtnClickListener(new View.OnClickListener() { // from class: xtn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportRecordExKt.showDeletePopupWindow$lambda$2$lambda$0(deleteRecordPopupWindow, deleteCallback, fragment, view);
                }
            });
            deleteRecordPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ytn
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    SportRecordExKt.showDeletePopupWindow$lambda$2$lambda$1(fragment);
                }
            });
            setWindowAlpha(0.3f, fragment);
            int[] iArr = new int[2];
            itemView.getLocationOnScreen(iArr);
            Logger.d("showUnbindWindow " + iArr[0] + iArr[1], new Object[0]);
            deleteRecordPopupWindow.showAtLocation(itemView, (AppUtil.isRTLDirection() ? 8388611 : 8388613) | 48, ExtUtilsKt.getDp(15), iArr[1] + ExtUtilsKt.getDp(10));
        } catch (Exception e) {
            Logger.e("showDeletePopupWindow: " + e, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePopupWindow$lambda$2$lambda$0(DeleteRecordPopupWindow this_apply, Function0 deleteCallback, FragmentActivity fragment, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(deleteCallback, "$deleteCallback");
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        this_apply.dismiss();
        showDeleteConfirmDialog(deleteCallback, fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePopupWindow$lambda$2$lambda$1(FragmentActivity fragment) {
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        setWindowAlpha(1.0f, fragment);
    }
}
