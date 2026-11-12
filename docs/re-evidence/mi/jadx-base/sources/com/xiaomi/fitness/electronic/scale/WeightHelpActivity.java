package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import android.widget.ImageView;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import defpackage.av1;
import defpackage.bl0;
import defpackage.gui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WeightHelpActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/WeightHelpViewModel;", "Lbl0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightHelpActivity extends BaseBindingActivity<WeightHelpViewModel, bl0> {
    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.z;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitle("");
        ElectronicScaleManager.Companion companion = ElectronicScaleManager.INSTANCE;
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide1 = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(imgGuide1, "imgGuide1");
        electronicScaleManagerExtKt.loadImageFromNet(imgGuide1, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt2 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide2 = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(imgGuide2, "imgGuide2");
        electronicScaleManagerExtKt2.loadImageFromNet(imgGuide2, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt3 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide3 = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(imgGuide3, "imgGuide3");
        electronicScaleManagerExtKt3.loadImageFromNet(imgGuide3, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt4 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide4 = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(imgGuide4, "imgGuide4");
        electronicScaleManagerExtKt4.loadImageFromNet(imgGuide4, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt5 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide5 = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(imgGuide5, "imgGuide5");
        electronicScaleManagerExtKt5.loadImageFromNet(imgGuide5, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5_NIGHT);
        ElectronicScaleManager electronicScaleManagerExtKt6 = ElectronicScaleManagerExtKt.getInstance(companion);
        ImageView imgGuide6 = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(imgGuide6, "imgGuide6");
        electronicScaleManagerExtKt6.loadImageFromNet(imgGuide6, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6_NIGHT);
    }
}
