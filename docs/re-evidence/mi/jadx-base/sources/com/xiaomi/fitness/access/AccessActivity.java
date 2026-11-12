package com.xiaomi.fitness.access;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.access.AccessActivity;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.access.wechatsportimport.WechatDeviceActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import defpackage.aui;
import defpackage.mzi;
import defpackage.r30;
import defpackage.xv1;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/access/AccessActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/AccessViewModel;", "Lr30;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "", "TAG", "Ljava/lang/String;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AccessActivity extends Hilt_AccessActivity<AccessViewModel, r30> {

    @NotNull
    private final String TAG = "AccessActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(AccessActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (bool.booleanValue()) {
            Logger.i(this$0.TAG, "gotoWechatDeviceActivity");
            LaunchExtensionKt.startActivity$default(this$0, WechatDeviceActivity.class, (Function1) null, 2, (Object) null);
        } else {
            Logger.i(this$0.TAG, "gotoWechatActivity");
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoWechatActivity(this$0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(AccessActivity this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        String string = this$0.getString(mzi.x0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showLoading(string, 0, false);
        ((AccessViewModel) this$0.getMViewModel()).checkWechatSupportBindDevice();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(AccessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoAlipayActivity(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(AccessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoStravaActivity(this$0);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.f39496a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.Hilt_AccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(mzi.w);
        setTitleBackground(yii.f40215b);
        if (RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ((r30) getMBinding()).C.setVisibility(8);
            ((r30) getMBinding()).D.setVisibility(8);
            ((r30) getMBinding()).E.setVisibility(0);
            ((r30) getMBinding()).B.setVisibility(0);
        } else {
            ((r30) getMBinding()).D.setVisibility(0);
            ((r30) getMBinding()).E.setVisibility(8);
            ((r30) getMBinding()).B.setVisibility(8);
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            ((r30) getMBinding()).D.setVisibility(0);
        }
        ((AccessViewModel) getMViewModel()).getWechatSupportBindDevice().observe(this, new AccessActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessActivity.onCreate$lambda$0(this.f20723a, (Boolean) obj);
            }
        }));
        ViewExtKt.clickWithTrigger(((r30) getMBinding()).E, 500L, new Function1() { // from class: j30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessActivity.onCreate$lambda$1(this.f22365a, (RightArrowBindingSingleLineTextView) obj);
            }
        });
        ((r30) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: k30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessActivity.onCreate$lambda$2(this.f23371a, view);
            }
        });
        ((r30) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: l30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessActivity.onCreate$lambda$3(view);
            }
        });
        ((r30) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: m30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessActivity.onCreate$lambda$4(this.f25697a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        dismissDialog();
    }
}
