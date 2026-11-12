package com.xiaomi.fitness.notify;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.notify.PermissionDialog;
import defpackage.p80;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0014\u0010\t\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/notify/PermissionDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "onClick", "Lkotlin/Function0;", "", "onShow", "setOnMessageViewClickListener", "Builder", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionDialog extends CommonDialog<DialogParams> {

    @Nullable
    private Function0<Unit> onClick;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/notify/PermissionDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/notify/PermissionDialog;", "getThis", "()Lcom/xiaomi/fitness/notify/PermissionDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/notify/PermissionDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends com.xiaomi.fitness.baseui.dialog.a<Builder, DialogParams, PermissionDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new DialogParams(name));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public PermissionDialog internalCreate() {
            return new PermissionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onShow$lambda$0(PermissionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onShow() {
        super.onShow();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
        TextView textViewO = ((miuix.appcompat.app.c) dialog).o();
        Logger.i("PERMISSIONDIALOG", "messageView " + textViewO);
        if (textViewO == null || !p80.a(ApplicationExtKt.getApplication())) {
            return;
        }
        textViewO.setOnClickListener(new View.OnClickListener() { // from class: vrh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionDialog.onShow$lambda$0(this.f37158a, view);
            }
        });
    }

    public final void setOnMessageViewClickListener(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
    }
}
