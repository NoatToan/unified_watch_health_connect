package com.xiaomi.fitness.heartrate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.heartrate.ui.DetectManualActivity;
import com.xiaomi.fitness.heartrate.utils.HeartRatePreference;
import defpackage.d0j;
import defpackage.kji;
import defpackage.lui;
import defpackage.rni;
import defpackage.w6c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0014\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/DetectManualActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/heartrate/ui/HeartRateDetectViewModel;", "Lw6c;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lw6c;)V", LifecycleConstantKt.ON_RESUME, "()V", "", "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "<init>", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDetectManualActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetectManualActivity.kt\ncom/xiaomi/fitness/heartrate/ui/DetectManualActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,60:1\n54#2,3:61\n24#2:64\n57#2,6:65\n63#2,2:72\n54#2,3:74\n24#2:77\n57#2,6:78\n63#2,2:85\n57#3:71\n57#3:84\n*S KotlinDebug\n*F\n+ 1 DetectManualActivity.kt\ncom/xiaomi/fitness/heartrate/ui/DetectManualActivity\n*L\n41#1:61,3\n41#1:64\n41#1:65,6\n41#1:72,2\n44#1:74,3\n44#1:77\n44#1:78,6\n44#1:85,2\n41#1:71\n44#1:84\n*E\n"})
public final class DetectManualActivity extends BaseBindingActivity<HeartRateDetectViewModel, w6c> {

    @NotNull
    public static final String DETECT_TYPE = "detect_type";
    private final int layoutId = lui.d;
    private final int viewModelId = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(Integer num, DetectManualActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 2) {
            LaunchExtensionKt.startActivity$default(this$0, CameraDetectActivity.class, (Function1) null, 2, (Object) null);
        } else {
            LaunchExtensionKt.startActivity$default(this$0, FingerDetectActivity.class, (Function1) null, 2, (Object) null);
        }
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull w6c w6cVar) {
        Intrinsics.checkNotNullParameter(w6cVar, "<this>");
        Intent intent = getIntent();
        final Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra(DETECT_TYPE, 2)) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            w6cVar.B.setText(d0j.g);
            ImageView heartrateIvDetectExample = w6cVar.A;
            Intrinsics.checkNotNullExpressionValue(heartrateIvDetectExample, "heartrateIvDetectExample");
            Coil.imageLoader(heartrateIvDetectExample.getContext()).enqueue(new ImageRequest.Builder(heartrateIvDetectExample.getContext()).data(Integer.valueOf(rni.f32724a)).target(heartrateIvDetectExample).build());
        } else {
            w6cVar.B.setText(d0j.u);
            ImageView heartrateIvDetectExample2 = w6cVar.A;
            Intrinsics.checkNotNullExpressionValue(heartrateIvDetectExample2, "heartrateIvDetectExample");
            Coil.imageLoader(heartrateIvDetectExample2.getContext()).enqueue(new ImageRequest.Builder(heartrateIvDetectExample2.getContext()).data(Integer.valueOf(rni.f32725b)).target(heartrateIvDetectExample2).build());
        }
        w6cVar.C.setOnClickListener(new View.OnClickListener() { // from class: uz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetectManualActivity.bindView$lambda$0(numValueOf, this, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(d0j.f);
        setTitleBackground(kji.f23920a);
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, kji.f23920a);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightNavigationBar(window, false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HeartRatePreference.INSTANCE.setSHOW_MANUAL(false);
    }
}
