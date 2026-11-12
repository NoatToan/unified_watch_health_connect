package com.xiaomi.fitness.sport_eco.view.launch.gym.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportDeviceExceptionDialog;
import defpackage.fvi;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/dialog/SportDeviceExceptionDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "title", "", "des", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportDeviceExceptionDialog extends CommonDialog<DialogParams> {

    @NotNull
    private final String des;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/dialog/SportDeviceExceptionDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "title", "Ljava/lang/String;", "des", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {

        @NotNull
        private final String des;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String title, @NotNull String des) {
            super("sport");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            this.title = title;
            this.des = des;
            setCustomLayoutId(fvi.h0);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new SportDeviceExceptionDialog(this.title, this.des);
        }
    }

    public SportDeviceExceptionDialog(@NotNull String title, @NotNull String des) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        this.title = title;
        this.des = des;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2$lambda$0(View this_apply, SportDeviceExceptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UploadFileManager uploadFileManagerExtKt = UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE);
        Context context = this_apply.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uploadFileManagerExtKt.launchFeedback(context);
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2$lambda$1(SportDeviceExceptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable final View rootView) {
        if (rootView != null) {
            TextView textView = (TextView) rootView.findViewById(zri.l2);
            TextView textView2 = (TextView) rootView.findViewById(zri.j2);
            TextView textView3 = (TextView) rootView.findViewById(zri.k2);
            Button button = (Button) rootView.findViewById(zri.m2);
            textView.setText(this.title);
            textView2.setText(this.des);
            textView3.setVisibility(0);
            textView3.getPaint().setFlags(8);
            textView3.getPaint().setAntiAlias(true);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: aln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDeviceExceptionDialog.initCustomView$lambda$2$lambda$0(rootView, this, view);
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: bln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDeviceExceptionDialog.initCustomView$lambda$2$lambda$1(this.f4346a, view);
                }
            });
        }
    }
}
