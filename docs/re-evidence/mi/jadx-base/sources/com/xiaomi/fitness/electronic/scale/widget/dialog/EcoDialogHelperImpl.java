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
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/EcoDialogHelperImpl;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/electronic/scale/export/EcoDialogHelper;", "<init>", "()V", "initCustomView", "", "rootView", "Landroid/view/View;", "showDialog", "context", "Landroidx/fragment/app/FragmentActivity;", "inviter", "", "pIcon", "inviteCallback", "Lcom/xiaomi/fitness/electronic/scale/export/InviteCallback;", "showConnectDialogForUnbindMember", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "showWeightErrorDialog", "errorType", "", "Builder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoDialogHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDialogHelperImpl.kt\ncom/xiaomi/fitness/electronic/scale/widget/dialog/EcoDialogHelperImpl\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,125:1\n54#2,3:126\n24#2:129\n57#2,6:130\n63#2,2:137\n57#3:136\n*S KotlinDebug\n*F\n+ 1 EcoDialogHelperImpl.kt\ncom/xiaomi/fitness/electronic/scale/widget/dialog/EcoDialogHelperImpl\n*L\n43#1:126,3\n43#1:129\n43#1:130,6\n43#1:137,2\n43#1:136\n*E\n"})
public final class EcoDialogHelperImpl extends CommonDialog<DialogParams> implements EcoDialogHelper {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/EcoDialogHelperImpl$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {
        public Builder() {
            super("InviteConfirmDialog");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new EcoDialogHelperImpl();
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper
    public void showConnectDialogForUnbindMember(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        new CommonDialog.c("commonDialog").setDialogTitle(zzi.q).setDialogDescription(zzi.p).setNeutralText(zzi.n4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.widget.dialog.EcoDialogHelperImpl.showConnectDialogForUnbindMember.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -3 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        }).show(activity.getSupportFragmentManager(), "");
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper
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
        new Builder().setDialogTitle(zzi.S0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(str)).setPositiveText(zzi.Z4).setNegativeText(zzi.f41831b).setCustomView(viewInflate).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.widget.dialog.EcoDialogHelperImpl.showDialog.1
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

    @Override // com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper
    public void showWeightErrorDialog(@NotNull BaseActivity activity, int errorType) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (errorType == -1) {
            i = zzi.N5;
        } else if (errorType == 0) {
            i = zzi.K5;
        } else if (errorType != 1) {
            i = errorType != 2 ? zzi.N5 : zzi.M5;
        } else {
            i = zzi.L5;
        }
        new CommonDialog.c("recall_privacy").setDialogTitle(zzi.y0).setCanceledOnBackPressed(false).setDialogDescriptionString(new DialogParams.DialogDescriptionString(i, new Object[0])).setPositiveText(zzi.n4).create().showIfNeed(activity.getSupportFragmentManager());
    }
}
