package com.xiaomi.fitness.training_plan_export.utils;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import defpackage.av6;
import defpackage.m1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/DialogUtils;", "", "<init>", "()V", "showTipDialog", "", "context", "Landroidx/fragment/app/FragmentActivity;", "builder", "Lcom/xiaomi/fitness/training_plan_export/utils/DialogUtils$DialogBuilder;", "showSimpleTipDialog", "titleRes", "", "msgRes", "", "DialogBuilder", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialogUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogUtils.kt\ncom/xiaomi/fitness/training_plan_export/utils/DialogUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class DialogUtils {

    @NotNull
    public static final DialogUtils INSTANCE = new DialogUtils();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR*\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/DialogUtils$DialogBuilder;", "", "<init>", "()V", "titleRes", "", "getTitleRes", "()Ljava/lang/Integer;", "setTitleRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "positiveRes", "getPositiveRes", "setPositiveRes", "negativeRes", "getNegativeRes", "setNegativeRes", "positiveClickListener", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "", "getPositiveClickListener", "()Lkotlin/jvm/functions/Function1;", "setPositiveClickListener", "(Lkotlin/jvm/functions/Function1;)V", "negativeClickListener", "getNegativeClickListener", "setNegativeClickListener", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DialogBuilder {

        @Nullable
        private String message;

        @Nullable
        private Function1<? super DialogInterface, Unit> negativeClickListener;

        @Nullable
        private Integer negativeRes;

        @Nullable
        private Function1<? super DialogInterface, Unit> positiveClickListener;

        @Nullable
        private Integer positiveRes;

        @Nullable
        private Integer titleRes;

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final Function1<DialogInterface, Unit> getNegativeClickListener() {
            return this.negativeClickListener;
        }

        @Nullable
        public final Integer getNegativeRes() {
            return this.negativeRes;
        }

        @Nullable
        public final Function1<DialogInterface, Unit> getPositiveClickListener() {
            return this.positiveClickListener;
        }

        @Nullable
        public final Integer getPositiveRes() {
            return this.positiveRes;
        }

        @Nullable
        public final Integer getTitleRes() {
            return this.titleRes;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }

        public final void setNegativeClickListener(@Nullable Function1<? super DialogInterface, Unit> function1) {
            this.negativeClickListener = function1;
        }

        public final void setNegativeRes(@Nullable Integer num) {
            this.negativeRes = num;
        }

        public final void setPositiveClickListener(@Nullable Function1<? super DialogInterface, Unit> function1) {
            this.positiveClickListener = function1;
        }

        public final void setPositiveRes(@Nullable Integer num) {
            this.positiveRes = num;
        }

        public final void setTitleRes(@Nullable Integer num) {
            this.titleRes = num;
        }
    }

    private DialogUtils() {
    }

    public final void showSimpleTipDialog(@NotNull FragmentActivity context, int titleRes, @NotNull String msgRes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msgRes, "msgRes");
        CommonDialog.c cVar = new CommonDialog.c("training_plan");
        cVar.setDialogTitle(titleRes);
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(msgRes));
        cVar.setNegativeText(m1j.s);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan_export.utils.DialogUtils.showSimpleTipDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        commonDialogCreate.showIfNeed(context.getSupportFragmentManager());
    }

    public final void showTipDialog(@NotNull FragmentActivity context, @NotNull final DialogBuilder builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        CommonDialog.c cVar = new CommonDialog.c("training_plan");
        Integer titleRes = builder.getTitleRes();
        if (titleRes != null) {
            cVar.setDialogTitle(titleRes.intValue());
        }
        String message = builder.getMessage();
        if (message != null) {
            cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(message));
        }
        Integer positiveRes = builder.getPositiveRes();
        if (positiveRes == null || cVar.setPositiveText(positiveRes.intValue()) == null) {
            cVar.setPositiveText(m1j.f25649b);
        }
        Integer negativeRes = builder.getNegativeRes();
        if (negativeRes == null || cVar.setNegativeText(negativeRes.intValue()) == null) {
            cVar.setNegativeText(m1j.f25648a);
        }
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.setCancelable(true);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan_export.utils.DialogUtils.showTipDialog.7
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Function1<DialogInterface, Unit> negativeClickListener = builder.getNegativeClickListener();
                    if (negativeClickListener != null) {
                        negativeClickListener.invoke2(dialog);
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                Function1<DialogInterface, Unit> positiveClickListener = builder.getPositiveClickListener();
                if (positiveClickListener != null) {
                    positiveClickListener.invoke2(dialog);
                }
            }
        });
        commonDialogCreate.showIfNeed(context.getSupportFragmentManager());
    }
}
