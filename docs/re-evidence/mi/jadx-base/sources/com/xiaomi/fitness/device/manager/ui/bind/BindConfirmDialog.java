package com.xiaomi.fitness.device.manager.ui.bind;

import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import defpackage.dui;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindConfirmDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindConfirmDialog extends CommonDialog<DialogParams> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindConfirmDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "num", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {

        @NotNull
        private final String num;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String num) {
            super("bind_device_confirm_button");
            Intrinsics.checkNotNullParameter(num, "num");
            this.num = num;
            setCustomLayoutId(dui.j);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new BindConfirmDialog();
        }
    }

    @JvmOverloads
    public BindConfirmDialog() {
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
    }
}
