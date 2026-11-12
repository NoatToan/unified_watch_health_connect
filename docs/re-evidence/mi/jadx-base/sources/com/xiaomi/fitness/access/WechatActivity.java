package com.xiaomi.fitness.access;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import com.xiaomi.fitness.access.WechatActivity;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.export.MineSettingManagerExtKt;
import defpackage.aui;
import defpackage.av6;
import defpackage.mzi;
import defpackage.nuf;
import defpackage.p70;
import defpackage.xv1;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/access/WechatActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/AccessViewModel;", "Lp70;", "Lkotlin/Function0;", "", "callback", "showUnbindConfirmDialog", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WechatActivity extends Hilt_WechatActivity<AccessViewModel, p70> {

    @NotNull
    public static final String TAG = "WechatActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final WechatActivity this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showUnbindConfirmDialog(new Function0() { // from class: wcr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WechatActivity.onCreate$lambda$3$lambda$2(this.f37856a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3$lambda$2(final WechatActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: zcr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WechatActivity.onCreate$lambda$3$lambda$2$lambda$1(this.f41132a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3$lambda$2$lambda$1(final WechatActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AccessViewModel) this$0.getMViewModel()).unbindWechat(new Function0() { // from class: ycr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WechatActivity.onCreate$lambda$3$lambda$2$lambda$1$lambda$0(this.f40055a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3$lambda$2$lambda$1$lambda$0(WechatActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).goToAuthConfigListActivityAsTaskTop(this$0);
        return Unit.INSTANCE;
    }

    private final void showUnbindConfirmDialog(final Function0<Unit> callback) {
        CommonDialog commonDialogCreate = new CommonDialog.c("unbind_confirm").setDialogTitle(mzi.h0).setDialogDescription(mzi.r0).setNegativeText(mzi.f27380b).setPositiveText(mzi.c).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.WechatActivity.showUnbindConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    callback.invoke();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.p;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.f39496a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.Hilt_WechatActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(mzi.o0, getString(mzi.p0)));
        setTitleBackground(yii.f40215b);
        nuf.f(((p70) getMBinding()).H);
        ViewExtKt.clickWithTrigger$default(((p70) getMBinding()).H, 0L, new Function1() { // from class: xcr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WechatActivity.onCreate$lambda$3(this.f38987a, (Button) obj);
            }
        }, 1, null);
    }
}
