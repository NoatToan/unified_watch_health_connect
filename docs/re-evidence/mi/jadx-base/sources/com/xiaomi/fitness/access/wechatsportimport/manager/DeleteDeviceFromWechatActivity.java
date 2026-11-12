package com.xiaomi.fitness.access.wechatsportimport.manager;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.access.wechatsportimport.manager.DeleteDeviceFromWechatActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.aui;
import defpackage.av6;
import defpackage.mzi;
import defpackage.x30;
import defpackage.xv1;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/access/wechatsportimport/manager/DeleteDeviceFromWechatActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerViewModel;", "Lx30;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "did", "showDeleteDevice", "(Ljava/lang/String;)V", LifecycleConstantKt.ON_DESTROY, "()V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mDeleteDeviceFromWechatDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "TAG", "Ljava/lang/String;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeleteDeviceFromWechatActivity extends Hilt_DeleteDeviceFromWechatActivity<AccessDeviceManagerViewModel, x30> {

    @NotNull
    private final String TAG = "DeleteDeviceFromWechat";

    @Nullable
    private CommonDialog<?> mDeleteDeviceFromWechatDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AccessDeviceManagerViewModel access$getMViewModel(DeleteDeviceFromWechatActivity deleteDeviceFromWechatActivity) {
        return (AccessDeviceManagerViewModel) deleteDeviceFromWechatActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DeleteDeviceFromWechatActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showDeleteDevice$lambda$1(final DeleteDeviceFromWechatActivity this$0, final String did, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        if (((x30) this$0.getMBinding()).B.getText().equals(this$0.getString(mzi.common_known))) {
            this$0.finish();
            return;
        }
        CommonDialog<?> commonDialog = this$0.mDeleteDeviceFromWechatDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this$0.mDeleteDeviceFromWechatDialog == null) {
                this$0.mDeleteDeviceFromWechatDialog = new CommonDialog.c("deletedevice").setDialogDescription(mzi.g).setPositiveText(mzi.f).setNegativeText(mzi.f27380b).setCanceledOnBackPressed(false).setCancelable(false).create();
            }
            CommonDialog<?> commonDialog2 = this$0.mDeleteDeviceFromWechatDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.wechatsportimport.manager.DeleteDeviceFromWechatActivity$showDeleteDevice$1$1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            dialog.dismiss();
                            this.this$0.mDeleteDeviceFromWechatDialog = null;
                        } else {
                            if (which != -1) {
                                return;
                            }
                            dialog.dismiss();
                            DeleteDeviceFromWechatActivity.access$getMViewModel(this.this$0).deleteDeviceFromWechat(did);
                            this.this$0.mDeleteDeviceFromWechatDialog = null;
                        }
                    }
                });
            }
            Logger.i(this$0.TAG, "device delete from wechat showIfNeed");
            CommonDialog<?> commonDialog3 = this$0.mDeleteDeviceFromWechatDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(this$0.getSupportFragmentManager());
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.f39496a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.wechatsportimport.manager.Hilt_DeleteDeviceFromWechatActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"ResourceAsColor"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(ThirdPartAccessConstants.DEVICE_DID);
        setTitle(getIntent().getStringExtra(ThirdPartAccessConstants.DEVICE_MODLE_NAME));
        setTitleBackground(yii.f40214a);
        if (stringExtra != null) {
            showDeleteDevice(stringExtra);
        }
        ((AccessDeviceManagerViewModel) getMViewModel()).isDeleteDeviceFromWechat().observe(this, new DeleteDeviceFromWechatActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ty5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteDeviceFromWechatActivity.onCreate$lambda$0(this.f35176a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.access.wechatsportimport.manager.Hilt_DeleteDeviceFromWechatActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CommonDialog<?> commonDialog = this.mDeleteDeviceFromWechatDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDeleteDevice(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        ((x30) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: uy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteDeviceFromWechatActivity.showDeleteDevice$lambda$1(this.f36269a, did, view);
            }
        });
    }
}
