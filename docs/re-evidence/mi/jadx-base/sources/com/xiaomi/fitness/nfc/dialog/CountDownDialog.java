package com.xiaomi.fitness.nfc.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import com.miui.tsmclient.entity.UIConfig;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.dialog.CountDownDialog;
import defpackage.o0j;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/nfc/dialog/CountDownDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mHandler", "Landroid/os/Handler;", UIConfig.KEY_CURRENT_TIME, "", "timerRunnable", "Ljava/lang/Runnable;", "sendPostDelay", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "Builder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountDownDialog extends CommonDialog<DialogParams> {

    @Nullable
    private Handler mHandler;
    private int currentTime = 5;

    @NotNull
    private Runnable timerRunnable = new Runnable() { // from class: wl4
        @Override // java.lang.Runnable
        public final void run() {
            CountDownDialog.timerRunnable$lambda$0(this.f38084a);
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/dialog/CountDownDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getThis", "()Lcom/xiaomi/fitness/nfc/dialog/CountDownDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialogParams", "<init>", "(Lcom/xiaomi/fitness/baseui/dialog/DialogParams;)V", "", "name", "(Ljava/lang/String;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static class Builder extends a<Builder, DialogParams, CommonDialog<?>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull DialogParams dialogParams) {
            super(dialogParams);
            Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<?> internalCreate() {
            return new CountDownDialog();
        }

        public Builder(@Nullable String str) {
            this(new DialogParams(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timerRunnable$lambda$0(CountDownDialog this$0) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
        Button buttonM = ((c) dialog).m(-1);
        Intrinsics.checkNotNullExpressionValue(buttonM, "getButton(...)");
        int i = this$0.currentTime - 1;
        this$0.currentTime = i;
        if (i > 0) {
            this$0.sendPostDelay();
            string = AppUtil.getApp().getString(o0j.n2, Integer.valueOf(this$0.currentTime));
        } else {
            buttonM.setEnabled(true);
            string = AppUtil.getApp().getString(o0j.l2);
        }
        Intrinsics.checkNotNull(string);
        buttonM.setText(string);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        vqg.d("CountDownDialog   onCreate");
        super.onCreate(savedInstanceState);
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.timerRunnable);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        vqg.d("CountDownDialog   onResume");
        if (this.currentTime == 5) {
            sendPostDelay();
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
            Button buttonM = ((c) dialog).m(-1);
            Intrinsics.checkNotNullExpressionValue(buttonM, "getButton(...)");
            buttonM.setEnabled(false);
        }
    }

    public final void sendPostDelay() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(this.timerRunnable, 1000L);
        }
    }
}
