package com.xiaomi.fitness.rn.settings.ui;

import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.rn.settings.ui.DeviceUpdateActivity;
import com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel;
import defpackage.boi;
import defpackage.lv1;
import defpackage.nvk;
import defpackage.v0j;
import defpackage.zui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/ui/DeviceUpdateActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/rn/settings/viewmodel/DeviceUpdateViewModel;", "Lnvk;", "", "bindView", "(Lnvk;)V", "onBackPressed", "()V", "onBack", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceUpdateActivity extends BaseBindingActivity<DeviceUpdateViewModel, nvk> {

    @NotNull
    public static final String sDid = "sDid";

    @NotNull
    public static final String sType = "sType";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(DeviceUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull nvk nvkVar) {
        Intrinsics.checkNotNullParameter(nvkVar, "<this>");
        setTitle(v0j.i);
        String stringExtra = getIntent().getStringExtra("sDid");
        if (stringExtra != null) {
            ((DeviceUpdateViewModel) getMViewModel()).initTest(this, stringExtra);
        }
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, boi.f4421a, null, new View.OnClickListener() { // from class: iu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceUpdateActivity.bindView$lambda$1(this.f22094a, view);
            }
        }, 5, null);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return zui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return lv1.f25455b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBack() {
        if (((DeviceUpdateViewModel) getMViewModel()).getIsCanBack()) {
            finish();
        } else {
            ToastUtil.INSTANCE.showToast(v0j.n);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        onBack();
    }
}
