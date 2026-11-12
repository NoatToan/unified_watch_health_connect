package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.electronic.scale.PairGuideActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import defpackage.av1;
import defpackage.eji;
import defpackage.gui;
import defpackage.hk0;
import defpackage.kb;
import defpackage.wc0;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_PAIR_GUIDE)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/PairGuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/PairGuideViewModel;", "Lhk0;", "", "initView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "key", "getIntentString", "(Ljava/lang/String;)Ljava/lang/String;", LifecycleConstantKt.ON_DESTROY, "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PairGuideActivity extends Hilt_PairGuideActivity<PairGuideViewModel, hk0> {
    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.A4));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setBackgroundDrawable(ResourceExtKt.getResourceDrawable(this, eji.s));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        ImageView guideImg = ((hk0) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(guideImg, "guideImg");
        electronicScaleManagerExtKt.loadImageFromNet(guideImg, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_2, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_2_NIGHT);
        ((hk0) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: ojh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PairGuideActivity.initView$lambda$1(this.f29219a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$1(PairGuideActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final int i = 9710;
        kb.c().a(EcoDeviceManagerExtKt.BIND_ECO_DEVICE_PATH).withString("key_device_address", this$0.getIntentString("key_device_address")).withString("key_device_name", this$0.getIntentString("key_device_name")).withParcelable("key_product_info", (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: pjh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PairGuideActivity.initView$lambda$1$lambda$0(i, (EcoProduct) obj));
            }
        })).withString("KEY_SHARE_ID", this$0.getIntentString("KEY_SHARE_ID")).withString("KEY_SHARE_USER_ID", this$0.getIntentString("KEY_SHARE_USER_ID")).withString("KEY_SHARE_DID", this$0.getIntentString("KEY_SHARE_DID")).withString("KEY_SHARE_MODEL", this$0.getIntentString("KEY_SHARE_MODEL")).withString("to", "").withInt("from", 4).navigation(this$0);
        ElectronicScaleActivityFinishHelperExtKt.getInstance(ElectronicScaleActivityFinishHelper.INSTANCE).add(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1$lambda$0(int i, EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == i;
    }

    @Nullable
    public final String getIntentString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getIntent().getStringExtra(key);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.p;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_PairGuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_PairGuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ElectronicScaleActivityFinishHelperExtKt.getInstance(ElectronicScaleActivityFinishHelper.INSTANCE).remove(this);
    }
}
