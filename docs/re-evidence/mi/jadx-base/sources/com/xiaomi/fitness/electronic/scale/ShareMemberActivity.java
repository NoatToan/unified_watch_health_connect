package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.ShareMemberActivity;
import com.xiaomi.fitness.electronic.scale.adapter.SharedAccountAdapter;
import com.xiaomi.fitness.electronic.scale.callback.OnDelDeviceCallback;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.DelShareResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import com.xiaomi.fitness.electronic.scale.export.bean.SharedUser;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.av1;
import defpackage.av6;
import defpackage.eji;
import defpackage.gui;
import defpackage.wc0;
import defpackage.xj0;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ShareMemberActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/ShareMemberViewModel;", "Lxj0;", "Lcom/xiaomi/fitness/electronic/scale/callback/OnDelDeviceCallback;", "", "initView", "()V", "initData", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "shareAccount", "showDelDeviceSharedDialog", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;)V", "delShare", "delShareByNet", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDel", "Lcom/xiaomi/fitness/electronic/scale/adapter/SharedAccountAdapter;", "sharedAccountAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/SharedAccountAdapter;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nShareMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareMemberActivity.kt\ncom/xiaomi/fitness/electronic/scale/ShareMemberActivity\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,217:1\n29#2:218\n29#2:219\n*S KotlinDebug\n*F\n+ 1 ShareMemberActivity.kt\ncom/xiaomi/fitness/electronic/scale/ShareMemberActivity\n*L\n99#1:218\n199#1:219\n*E\n"})
public final class ShareMemberActivity extends Hilt_ShareMemberActivity<ShareMemberViewModel, xj0> implements OnDelDeviceCallback {

    @NotNull
    public static final String LOG_TAG = "ShareMemberActivity";

    @Nullable
    private SharedAccountAdapter sharedAccountAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public final void delShare(final ShareAccount shareAccount) {
        showLoading();
        String stringExtra = getIntent().getStringExtra("DEVICE_DID");
        if (!shareAccount.isBondBoolean()) {
            delShareByNet(shareAccount);
            return;
        }
        ElectronicScaleCMDHelper electronicScaleCMDHelperExtKt = ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE);
        long j = Long.parseLong(shareAccount.getShareUserId());
        Intrinsics.checkNotNull(stringExtra);
        electronicScaleCMDHelperExtKt.delSharedMember(j, stringExtra, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.ShareMemberActivity.delShare.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                if (code == -3) {
                    ShareMemberActivity.this.delShareByNet(shareAccount);
                    return;
                }
                Context baseContext = ShareMemberActivity.this.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                ToastExtKt.toastShort(baseContext, zzi.common_delete_failure);
                ShareMemberActivity.this.dismissDialogForce();
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                ShareMemberActivity.this.delShareByNet(shareAccount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delShareByNet(final ShareAccount shareAccount) {
        ElectronicScaleRequest.DefaultImpls.delShare$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), shareAccount.getUserId(), shareAccount.getShareUserId(), shareAccount.getShareId(), null, new Function1() { // from class: u5m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareMemberActivity.delShareByNet$lambda$3(this.f35432a, shareAccount, (ScaleData) obj);
            }
        }, new Function1() { // from class: v5m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareMemberActivity.delShareByNet$lambda$4(this.f36508a, (ApiException) obj);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delShareByNet$lambda$3(ShareMemberActivity this$0, ShareAccount shareAccount, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareAccount, "$shareAccount");
        Intrinsics.checkNotNullParameter(it, "it");
        if (((DelShareResponse) new Gson().fromJson(it.getResp(), new TypeToken<DelShareResponse>() { // from class: com.xiaomi.fitness.electronic.scale.ShareMemberActivity$delShareByNet$lambda$3$$inlined$fromJson$1
        }.getType())).getCode() == 200) {
            Logger.INSTANCE.v(LOG_TAG, "delShare success");
            SharedAccountAdapter sharedAccountAdapter = this$0.sharedAccountAdapter;
            if (sharedAccountAdapter != null) {
                sharedAccountAdapter.remove(shareAccount);
            }
            this$0.initData();
        } else {
            Logger.e(LOG_TAG, "delShare error", it);
            Context baseContext = this$0.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            ToastExtKt.toastShort(baseContext, zzi.common_delete_failure);
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delShareByNet$lambda$4(ShareMemberActivity this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(LOG_TAG, "delShare error", it);
        Context baseContext = this$0.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        ToastExtKt.toastShort(baseContext, zzi.common_delete_failure);
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initData() {
        ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).refreshShareToOtherList();
        ((xj0) getMBinding()).A.setLayoutManager(new LinearLayoutManager(this));
        final String stringExtra = getIntent().getStringExtra("DEVICE_DID");
        if (NetworkExtKt.isNetworkAvailable()) {
            ElectronicScaleRequest.DefaultImpls.getShareList$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), 1, null, new Function1() { // from class: r5m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ShareMemberActivity.initData$lambda$1(stringExtra, this, (ScaleData) obj);
                }
            }, new Function1() { // from class: s5m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ShareMemberActivity.initData$lambda$2((ApiException) obj);
                }
            }, 2, null);
        } else {
            ToastUtil.showShortToast(getResources().getString(zzi.g4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$1(String str, ShareMemberActivity this$0, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String resp = it.getResp();
        Logger.INSTANCE.v(LOG_TAG, "initData, ScaleRequest().getShareList success, resp: " + resp);
        List<ShareAccount> data = ((SharedUser) new Gson().fromJson(resp, new TypeToken<SharedUser>() { // from class: com.xiaomi.fitness.electronic.scale.ShareMemberActivity$initData$lambda$1$$inlined$fromJson$1
        }.getType())).getData();
        ArrayList arrayList = new ArrayList();
        for (ShareAccount shareAccount : data) {
            if (Intrinsics.areEqual(shareAccount.getDid(), str)) {
                arrayList.add(shareAccount);
            }
        }
        this$0.sharedAccountAdapter = new SharedAccountAdapter(arrayList, this$0);
        ((xj0) this$0.getMBinding()).A.setAdapter(this$0.sharedAccountAdapter);
        if (arrayList.isEmpty()) {
            ((xj0) this$0.getMBinding()).C.setVisibility(0);
            ((xj0) this$0.getMBinding()).E.setVisibility(8);
        } else {
            ((xj0) this$0.getMBinding()).C.setVisibility(8);
            ((xj0) this$0.getMBinding()).E.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(LOG_TAG, "initData, ScaleRequest().getShareList error", it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.w));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setBackgroundDrawable(ResourceExtKt.getResourceDrawable(this, eji.s));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        ((xj0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: t5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareMemberActivity.initView$lambda$0(this.f34347a, view);
            }
        });
        initData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$0(final ShareMemberActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String stringExtra = this$0.getIntent().getStringExtra("DEVICE_DID");
        ElectronicScaleShareHelper electronicScaleShareHelperExtKt = ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE);
        Intrinsics.checkNotNull(stringExtra);
        if (!electronicScaleShareHelperExtKt.full(stringExtra)) {
            ((ShareMemberViewModel) this$0.getMViewModel()).startAddShareActivity(this$0, stringExtra, new ShareMemberViewModel.AddSuccessCallback() { // from class: com.xiaomi.fitness.electronic.scale.ShareMemberActivity$initView$1$1
                @Override // com.xiaomi.fitness.electronic.scale.ShareMemberViewModel.AddSuccessCallback
                public void onAddSuccess() {
                    this.this$0.initData();
                }
            });
            return;
        }
        Context baseContext = this$0.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        String string = this$0.getBaseContext().getString(zzi.g);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastExtKt.toastShort(baseContext, string);
    }

    private final void showDelDeviceSharedDialog(final ShareAccount shareAccount) {
        CommonDialog commonDialogCreate = new CommonDialog.c("show_device_shared").setDialogDescription(zzi.R0).setPositiveText(zzi.c).setNegativeText(zzi.f1).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.ShareMemberActivity.showDelDeviceSharedDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    } else if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                ShareMemberActivity.this.delShare(shareAccount);
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.f19343k;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_ShareMemberActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        initView();
    }

    @Override // com.xiaomi.fitness.electronic.scale.callback.OnDelDeviceCallback
    public void onDel(@NotNull ShareAccount shareAccount) {
        Intrinsics.checkNotNullParameter(shareAccount, "shareAccount");
        showDelDeviceSharedDialog(shareAccount);
    }
}
