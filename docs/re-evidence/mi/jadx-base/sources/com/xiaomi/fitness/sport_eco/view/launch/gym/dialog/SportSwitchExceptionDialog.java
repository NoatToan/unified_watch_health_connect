package com.xiaomi.fitness.sport_eco.view.launch.gym.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportSwitchExceptionDialog;
import defpackage.fvi;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/dialog/SportSwitchExceptionDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSwitchExceptionDialog extends CommonDialog<DialogParams> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/dialog/SportSwitchExceptionDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {
        public Builder() {
            super("sport");
            setCustomLayoutId(fvi.l0);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new SportSwitchExceptionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2$lambda$0(View this_apply, SportSwitchExceptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UploadFileManager uploadFileManagerExtKt = UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE);
        Context context = this_apply.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uploadFileManagerExtKt.launchFeedback(context);
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2$lambda$1(SportSwitchExceptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable final View rootView) {
        if (rootView != null) {
            TextView textView = (TextView) rootView.findViewById(zri.k2);
            Button button = (Button) rootView.findViewById(zri.m2);
            textView.setVisibility(0);
            textView.getPaint().setFlags(8);
            textView.getPaint().setAntiAlias(true);
            textView.setOnClickListener(new View.OnClickListener() { // from class: r3o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportSwitchExceptionDialog.initCustomView$lambda$2$lambda$0(rootView, this, view);
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: s3o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportSwitchExceptionDialog.initCustomView$lambda$2$lambda$1(this.f33248a, view);
                }
            });
        }
    }
}
