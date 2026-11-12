package com.xiaomi.fitness.access;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.alipay.sdk.app.AuthTask;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.access.AlipayActivity;
import com.xiaomi.fitness.access.request.MiscModel;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import defpackage.aui;
import defpackage.av6;
import defpackage.mzi;
import defpackage.n30;
import defpackage.wi4;
import defpackage.xv1;
import defpackage.yii;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.WechatFileUtil;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b8\u0010\u000bJ\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\"J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u000bJ!\u0010)\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/access/AlipayActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/AccessViewModel;", "Ln30;", "Lcom/xiaomi/fitness/access/AliPayView;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "showLoadingDialog", "()V", "hideLoadingDialog", "loadStatusError", "unBindError", "", "isBind", "setBind", "(Z)V", "", "erroMsgReid", "bindError", "(Ljava/lang/Integer;)V", "", TSMAuthContants.PARAM_AUTH_CODE, "userId", "showBindOtherDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "isInValid", "()Z", "showLoading", "isCancelable", "cancelLoading", "msgRes", "(ZI)V", "(I)V", "goBack", "Landroid/content/Context;", "context", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/content/Context;Landroid/os/Message;)V", "Z", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "loadingDialog", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "getLoadingDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "setLoadingDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AlipayActivity extends Hilt_AlipayActivity<AccessViewModel, n30> implements AliPayView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sHandleBindAlipay = 10;
    private boolean isBind;

    @Nullable
    private CircleProgressDialog loadingDialog;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/access/AlipayActivity$Companion;", "", "<init>", "()V", "sHandleBindAlipay", "", "getSHandleBindAlipay", "()I", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSHandleBindAlipay() {
            return AlipayActivity.sHandleBindAlipay;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AccessViewModel access$getMViewModel(AlipayActivity alipayActivity) {
        return (AccessViewModel) alipayActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(final AlipayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isBind) {
            ((AccessViewModel) this$0.getMViewModel()).author(this$0);
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(mzi.h0).setDialogDescription(mzi.i0).setNegativeText(mzi.f27380b).setPositiveText(mzi.c).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.AlipayActivity$onCreate$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    dialog.dismiss();
                    AlipayActivity.access$getMViewModel(this.this$0).unBind();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AlipayActivity this$0, MiscModel.AlipayBindResult alipayBindResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (alipayBindResult.ret) {
            this$0.hideLoadingDialog();
            this$0.setBind(false);
        } else {
            this$0.hideLoadingDialog();
            this$0.unBindError();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(AlipayActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoadingDialog();
        AliPayView.DefaultImpls.bindError$default(this$0, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(AlipayActivity this$0, MiscModel.AlipayBindResult alipayBindResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (alipayBindResult.isBindOther()) {
            this$0.hideLoadingDialog();
            Map<String, String> value = ((AccessViewModel) this$0.getMViewModel()).getMAlipayBindOtherData().getValue();
            String str = value != null ? value.get(ThirdPartAccessConstants.PARAM_AUTH_CODE) : null;
            Map<String, String> value2 = ((AccessViewModel) this$0.getMViewModel()).getMAlipayBindOtherData().getValue();
            String str2 = value2 != null ? value2.get("third_user_id") : null;
            if (str != null && str2 != null) {
                this$0.showBindOtherDialog(str, str2);
            }
        } else {
            this$0.hideLoadingDialog();
            this$0.setBind(alipayBindResult.isBind());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(final AlipayActivity this$0, final MiscModel.AlipayBindResult alipayBindResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (alipayBindResult.query != null) {
            this$0.hideLoadingDialog();
            new Thread(new Runnable() { // from class: b61
                @Override // java.lang.Runnable
                public final void run() {
                    AlipayActivity.onCreate$lambda$6$lambda$5(this.f3840a, alipayBindResult);
                }
            }).start();
        } else {
            this$0.hideLoadingDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$5(AlipayActivity this$0, MiscModel.AlipayBindResult alipayBindResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Map<String, String> mapAuthV2 = new AuthTask(this$0).authV2(alipayBindResult.query, true);
        Message message = new Message();
        message.what = sHandleBindAlipay;
        message.obj = mapAuthV2;
        this$0.handleMessage(this$0, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(AlipayActivity this$0, MiscModel.AlipayBindResult alipayBindResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoadingDialog();
        this$0.setBind(alipayBindResult.isBind());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(AlipayActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.hideLoadingDialog();
            this$0.loadStatusError();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(AlipayActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showLoadingDialog();
        } else {
            this$0.hideLoadingDialog();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void bindError(@Nullable Integer erroMsgReid) {
        if (erroMsgReid != null) {
            WechatFileUtil.INSTANCE.showToastShort(erroMsgReid.intValue());
        } else {
            new Exception();
            WechatFileUtil.INSTANCE.showToastShort(mzi.d0);
        }
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public boolean cancelLoading() {
        CircleProgressDialog circleProgressDialog = this.loadingDialog;
        if (circleProgressDialog == null) {
            return false;
        }
        Intrinsics.checkNotNull(circleProgressDialog);
        circleProgressDialog.dismiss();
        this.loadingDialog = null;
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return aui.f3458a;
    }

    @Nullable
    public final CircleProgressDialog getLoadingDialog() {
        return this.loadingDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.f39496a;
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void goBack() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleMessage(@Nullable Context context, @Nullable Message msg) {
        Integer numValueOf = msg != null ? Integer.valueOf(msg.what) : null;
        int i = sHandleBindAlipay;
        if (numValueOf != null && numValueOf.intValue() == i) {
            AccessViewModel accessViewModel = (AccessViewModel) getMViewModel();
            Object obj = msg.obj;
            Intrinsics.checkNotNullExpressionValue(obj, "obj");
            accessViewModel.parseAlipay(obj);
        }
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void hideLoadingDialog() {
        cancelLoading();
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    @SuppressLint({"RestrictedApi"})
    public boolean isInValid() {
        if (wi4.a(getBaseContext()) != null) {
            Activity activityA = wi4.a(getBaseContext());
            Intrinsics.checkNotNull(activityA);
            if (!activityA.isFinishing()) {
                Activity activityA2 = wi4.a(this);
                Intrinsics.checkNotNull(activityA2);
                if (!activityA2.isDestroyed()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.AliPayView
    public void loadStatusError() {
        WechatFileUtil.INSTANCE.showToastShort(mzi.d);
        ((n30) getMBinding()).E.setEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.Hilt_AlipayActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(mzi.g0);
        setTitleBackground(yii.f40215b);
        ((n30) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: c61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlipayActivity.onCreate$lambda$0(this.f4973a, view);
            }
        });
        ((AccessViewModel) getMViewModel()).getMAlipayUnBindChange().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$1(this.f15122a, (MiscModel.AlipayBindResult) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getMAlipayBindOtherChange().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$4(this.f16300a, (MiscModel.AlipayBindResult) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getMAlipayAuthorBindChange().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$6(this.f17452a, (MiscModel.AlipayBindResult) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getMAlipayLoadBindChange().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$7(this.f18634a, (MiscModel.AlipayBindResult) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getMAlipayLoadBindError().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$8(this.f19733a, (Boolean) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getMStartLoading().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$9(this.f20822a, (Boolean) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getMRequestError().observe(this, new AlipayActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j61
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlipayActivity.onCreate$lambda$10(this.f22453a, (Boolean) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).loadBindStatus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.AliPayView
    public void setBind(boolean isBind) {
        this.isBind = isBind;
        if (isBind) {
            ((n30) getMBinding()).G.setVisibility(8);
            ((n30) getMBinding()).D.setVisibility(0);
            ((n30) getMBinding()).E.setText(mzi.h0);
        } else {
            ((n30) getMBinding()).D.setVisibility(8);
            ((n30) getMBinding()).G.setVisibility(0);
            ((n30) getMBinding()).E.setText(mzi.c0);
        }
    }

    public final void setLoadingDialog(@Nullable CircleProgressDialog circleProgressDialog) {
        this.loadingDialog = circleProgressDialog;
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void showBindOtherDialog(@NotNull final String authCode, @NotNull final String userId) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(userId, "userId");
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(mzi.f0).setDialogDescription(mzi.e0).setNegativeText(mzi.c).setPositiveText(mzi.f27380b).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.AlipayActivity.showBindOtherDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    dialog.dismiss();
                    AlipayActivity.access$getMViewModel(AlipayActivity.this).bindAlipay(authCode, userId, true);
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, com.xiaomi.fitness.baseui.view.PageState, com.xiaomi.fitness.access.AliPayView
    public void showLoading() {
        showLoading(true);
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void showLoadingDialog() {
        showLoading();
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void unBindError() {
        new Exception();
        WechatFileUtil.INSTANCE.showToastShort(mzi.d0);
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void showLoading(boolean isCancelable) {
        showLoading(isCancelable, -1);
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void showLoading(boolean isCancelable, int msgRes) {
        int i = mzi.e;
        if (msgRes <= 0) {
            msgRes = i;
        }
        if (this.loadingDialog == null) {
            this.loadingDialog = new CircleProgressDialog.a("repeat").setCustomLayoutId(aui.s).create();
        }
        CircleProgressDialog circleProgressDialog = this.loadingDialog;
        if (circleProgressDialog != null) {
            circleProgressDialog.showIfNeed(getSupportFragmentManager());
        }
        CircleProgressDialog circleProgressDialog2 = this.loadingDialog;
        if (circleProgressDialog2 != null) {
            circleProgressDialog2.setPickerHintText(getString(msgRes));
        }
    }

    @Override // com.xiaomi.fitness.access.AliPayView
    public void showLoading(int msgRes) {
        showLoading(true, msgRes);
    }
}
