package com.xiaomi.fitness.access.wechatsportimport;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.access.AccessViewModel;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.wechatsportimport.WechatDeviceActivity;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerActivity;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import defpackage.aui;
import defpackage.l70;
import defpackage.mzi;
import defpackage.xv1;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/access/wechatsportimport/WechatDeviceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/AccessViewModel;", "Ll70;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "mAccessRequest", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "getMAccessRequest", "()Lcom/xiaomi/fitness/access/request/AccessRequest;", "setMAccessRequest", "(Lcom/xiaomi/fitness/access/request/AccessRequest;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WechatDeviceActivity extends Hilt_WechatDeviceActivity<AccessViewModel, l70> {
    public AccessRequest mAccessRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(WechatDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoWechatActivity(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(final WechatDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (NetworkExtKt.isNetworkAvailable()) {
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).getWechatSupportBindDeviceLiveData(this$0).observe(this$0, new WechatDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ddr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WechatDeviceActivity.onCreate$lambda$2$lambda$1(this.f15419a, (Boolean) obj);
                }
            }));
        } else {
            ToastExtKt.toastShort(this$0, mzi.common_network_error_retry_later);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2$lambda$1(WechatDeviceActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            LaunchExtensionKt.startActivity$default(this$0, AccessDeviceManagerActivity.class, (Function1) null, 2, (Object) null);
        } else {
            LaunchExtensionKt.startActivity$default(this$0, WechatSportSettingsNoDevicesActivity.class, (Function1) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.n;
    }

    @NotNull
    public final AccessRequest getMAccessRequest() {
        AccessRequest accessRequest = this.mAccessRequest;
        if (accessRequest != null) {
            return accessRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccessRequest");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.f39496a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.wechatsportimport.Hilt_WechatDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(mzi.p0);
        setTitleBackground(yii.f40214a);
        ((l70) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: bdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatDeviceActivity.onCreate$lambda$0(this.f4114a, view);
            }
        });
        ((l70) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: cdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatDeviceActivity.onCreate$lambda$2(this.f5231a, view);
            }
        });
    }

    public final void setMAccessRequest(@NotNull AccessRequest accessRequest) {
        Intrinsics.checkNotNullParameter(accessRequest, "<set-?>");
        this.mAccessRequest = accessRequest;
    }
}
