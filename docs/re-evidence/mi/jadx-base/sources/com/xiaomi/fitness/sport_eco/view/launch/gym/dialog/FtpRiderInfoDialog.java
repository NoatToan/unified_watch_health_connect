package com.xiaomi.fitness.sport_eco.view.launch.gym.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.FtpRiderInfoDialog;
import defpackage.fvi;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/dialog/FtpRiderInfoDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mFtpResultButton", "Landroid/widget/Button;", "mFtpResultDes", "Landroid/widget/TextView;", "mFtpResultTitle", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtpRiderInfoDialog extends CommonDialog<DialogParams> {
    private Button mFtpResultButton;
    private TextView mFtpResultDes;
    private TextView mFtpResultTitle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/dialog/FtpRiderInfoDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {
        public Builder() {
            super("Ftp");
            setCustomLayoutId(fvi.n);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new FtpRiderInfoDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$1$lambda$0(FtpRiderInfoDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        if (rootView != null) {
            this.mFtpResultTitle = (TextView) rootView.findViewById(zri.q0);
            this.mFtpResultDes = (TextView) rootView.findViewById(zri.p0);
            Button button = (Button) rootView.findViewById(zri.o0);
            this.mFtpResultButton = button;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFtpResultButton");
                button = null;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: ara
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FtpRiderInfoDialog.initCustomView$lambda$1$lambda$0(this.f3379a, view);
                }
            });
        }
    }
}
