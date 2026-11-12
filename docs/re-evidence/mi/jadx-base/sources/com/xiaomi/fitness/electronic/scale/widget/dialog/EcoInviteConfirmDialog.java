package com.xiaomi.fitness.electronic.scale.widget.dialog;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialog;
import com.xiaomi.fitness.electronic.scale.export.InviteCallback;
import defpackage.av6;
import defpackage.bri;
import defpackage.gui;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/EcoInviteConfirmDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/electronic/scale/export/EcoShareDialog;", "<init>", "()V", "initCustomView", "", "rootView", "Landroid/view/View;", "showDialog", "context", "Landroidx/fragment/app/FragmentActivity;", "inviter", "", "pIcon", "inviteCallback", "Lcom/xiaomi/fitness/electronic/scale/export/InviteCallback;", "Builder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoInviteConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoInviteConfirmDialog.kt\ncom/xiaomi/fitness/electronic/scale/widget/dialog/EcoInviteConfirmDialog\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,73:1\n54#2,3:74\n24#2:77\n57#2,6:78\n63#2,2:85\n57#3:84\n*S KotlinDebug\n*F\n+ 1 EcoInviteConfirmDialog.kt\ncom/xiaomi/fitness/electronic/scale/widget/dialog/EcoInviteConfirmDialog\n*L\n43#1:74,3\n43#1:77\n43#1:78,6\n43#1:85,2\n43#1:84\n*E\n"})
public final class EcoInviteConfirmDialog extends CommonDialog<DialogParams> implements EcoShareDialog {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/EcoInviteConfirmDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {
        public Builder() {
            super("InviteConfirmDialog");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new EcoInviteConfirmDialog();
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.EcoShareDialog
    public void showDialog(@NotNull FragmentActivity context, @NotNull String inviter, @Nullable String pIcon, @NotNull final InviteCallback inviteCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(inviteCallback, "inviteCallback");
        String str = inviter + context.getString(zzi.b5);
        View viewInflate = LayoutInflater.from(context).inflate(gui.C, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(bri.t);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(pIcon).target(imageView).build());
        new Builder().setDialogTitle(zzi.S0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(str)).setPositiveText(zzi.Z4).setNegativeText(zzi.f41831b).setCustomView(viewInflate).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.widget.dialog.EcoInviteConfirmDialog.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    inviteCallback.onDenied();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    inviteCallback.onAccepted();
                }
            }
        }).show(context.getSupportFragmentManager(), "");
    }
}
