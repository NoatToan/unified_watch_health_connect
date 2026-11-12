package com.xiaomi.fitness.access.wechatsportimport.manager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.access.bean.DeviceModelsInfo;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.aui;
import defpackage.g40;
import defpackage.mzi;
import defpackage.o3r;
import defpackage.xv1;
import defpackage.yaa;
import defpackage.yii;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerViewModel;", "Lg40;", "Lyaa;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "", "TAG", "Ljava/lang/String;", "", "Lcom/xiaomi/fitness/access/bean/DeviceModelsInfo;", "mDeviceList", "Ljava/util/List;", "getMDeviceList", "()Ljava/util/List;", "setMDeviceList", "(Ljava/util/List;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AccessDeviceManagerActivity extends Hilt_AccessDeviceManagerActivity<AccessDeviceManagerViewModel, g40> implements yaa {

    @NotNull
    public static final String URL_WECHAT_SPORT_SETTING_FAQ = "https://watch.iot.mi.com/html/wechat-sync-faq/index.html";

    @NotNull
    private final String TAG = "AccessDeviceManagerActivity";

    @NotNull
    private List<DeviceModelsInfo> mDeviceList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(AccessDeviceManagerActivity this$0, FrameLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewUtilKt.startWebView$default(URL_WECHAT_SPORT_SETTING_FAQ, this$0.getString(mzi.u0), false, false, null, false, null, false, 252, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(AccessDeviceManagerActivity this$0, DeviceModelsInfo deviceModelsInfo, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModelsInfo, "deviceModelsInfo");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (o3r.i().p()) {
            ((AccessDeviceManagerViewModel) this$0.getMViewModel()).handleDeviceAddOrDeleteToWechat(i, this$0.mDeviceList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(AccessDeviceManagerActivity this$0, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (arrayList == null || arrayList.isEmpty()) {
            ((g40) this$0.getMBinding()).B.setVisibility(8);
            return Unit.INSTANCE;
        }
        ((g40) this$0.getMBinding()).B.setVisibility(8);
        FrameLayout faqTv = ((g40) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(faqTv, "faqTv");
        ViewExtKt.visible(faqTv);
        this$0.mDeviceList = arrayList;
        Logger.i(this$0.TAG, "mDeviceList is " + arrayList.size());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(AccessDeviceManagerActivity this$0, DeviceModelsInfo deviceModelsInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra(ThirdPartAccessConstants.DEVICE_DID, deviceModelsInfo.getDid());
        intent.putExtra(ThirdPartAccessConstants.DEVICE_MODLE_NAME, deviceModelsInfo.getName());
        intent.setClass(this$0, DeleteDeviceFromWechatActivity.class);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.h;
    }

    @NotNull
    public final List<DeviceModelsInfo> getMDeviceList() {
        return this.mDeviceList;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.wechatsportimport.manager.Hilt_AccessDeviceManagerActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d(this.TAG, "onCreate");
        setTitle(mzi.u0);
        setTitleBackground(yii.d);
        ViewExtKt.clickWithTrigger$default(((g40) getMBinding()).C, 0L, new Function1() { // from class: b40
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessDeviceManagerActivity.onCreate$lambda$0(this.f3767a, (FrameLayout) obj);
            }
        }, 1, null);
        ((g40) getMBinding()).B.setVisibility(0);
        ((AccessDeviceManagerViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3() { // from class: c40
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AccessDeviceManagerActivity.onCreate$lambda$1(this.f4905a, (DeviceModelsInfo) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        ((AccessDeviceManagerViewModel) getMViewModel()).getDeviceModelsItems().observe(this, new AccessDeviceManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d40
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessDeviceManagerActivity.onCreate$lambda$2(this.f15064a, (ArrayList) obj);
            }
        }));
        ((AccessDeviceManagerViewModel) getMViewModel()).getDeviceInfoUnBindWechat().observe(this, new AccessDeviceManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e40
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessDeviceManagerActivity.onCreate$lambda$3(this.f16240a, (DeviceModelsInfo) obj);
            }
        }));
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((AccessDeviceManagerViewModel) getMViewModel()).getDeviceModelList();
    }

    public final void setMDeviceList(@NotNull List<DeviceModelsInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDeviceList = list;
    }
}
