package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.electronic.scale.DeviceShareActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelperExtKt;
import defpackage.av1;
import defpackage.gui;
import defpackage.wc0;
import defpackage.zj0;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/DeviceShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/DeviceShareViewModel;", "Lzj0;", "", "initView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceShareActivity extends Hilt_DeviceShareActivity<DeviceShareViewModel, zj0> {

    @NotNull
    public static final String DEVICE_DID = "DEVICE_DID";

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.y));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setSubtitle(getString(zzi.x));
        }
        ((zj0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: rn6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceShareActivity.initView$lambda$0(this.f32721a, view);
            }
        });
        ((zj0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: tn6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceShareActivity.initView$lambda$1(this.f34865a, view);
            }
        });
        if (NetworkExtKt.isNetworkAvailable()) {
            return;
        }
        ToastUtil.showShortToast(getResources().getString(zzi.g4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(DeviceShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ShareMemberActivity.class);
        intent.putExtra("DEVICE_DID", this$0.getIntent().getStringExtra("DEVICE_DID"));
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(DeviceShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ElectronicScaleShareHelper electronicScaleShareHelperExtKt = ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE);
        String stringExtra = this$0.getIntent().getStringExtra("DEVICE_DID");
        Intrinsics.checkNotNull(stringExtra);
        if (!electronicScaleShareHelperExtKt.full(stringExtra)) {
            Intent intent = new Intent(this$0, (Class<?>) AddShareActivity.class);
            intent.putExtra("DEVICE_DID", this$0.getIntent().getStringExtra("DEVICE_DID"));
            this$0.startActivity(intent);
        } else {
            Context baseContext = this$0.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            String string = this$0.getBaseContext().getString(zzi.g);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(baseContext, string);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.l;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_DeviceShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).refreshShareToOtherList();
    }
}
