package com.xiaomi.fitness.heartrate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.heartrate.ui.BaseDetectActivity;
import defpackage.kji;
import defpackage.rni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0012\u0010\f\u001a\u00020\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/BaseDetectActivity;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "detectType", "", "getDetectType", "()I", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseDetectActivity<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingActivity<VM, VDB> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(BaseDetectActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(final BaseDetectActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchExtensionKt.startActivity(this$0, (Class<?>) PrincipleActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: t62
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseDetectActivity.onCreate$lambda$2$lambda$1(this.f34356a, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2$lambda$1(BaseDetectActivity this$0, Intent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra(DetectManualActivity.DETECT_TYPE, this$0.getDetectType());
        return Unit.INSTANCE;
    }

    public abstract int getDetectType();

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(kji.f23920a);
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, kji.f23920a);
        setActionBarNormalTitleMode();
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
        IActionBar.DefaultImpls.setStartView$default(this, 0, rni.d, null, new View.OnClickListener() { // from class: u62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseDetectActivity.onCreate$lambda$0(this.f35442a, view);
            }
        }, 5, null);
        setTitle("");
        IActionBar.DefaultImpls.setEndView$default(this, 0, rni.c, null, new View.OnClickListener() { // from class: v62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseDetectActivity.onCreate$lambda$2(this.f36518a, view);
            }
        }, 5, null);
        showBack();
    }
}
