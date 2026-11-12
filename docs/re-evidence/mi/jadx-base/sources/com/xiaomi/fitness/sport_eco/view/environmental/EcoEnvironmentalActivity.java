package com.xiaomi.fitness.sport_eco.view.environmental;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco.view.environmental.EcoEnvironmentalActivity;
import com.xiaomi.fitness.sport_eco.view.environmental.model.EnvironmentalVO;
import com.xiaomi.fitness.sport_eco.viewmodel.EcoEnvironmentalViewModel;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.gt7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/environmental/EcoEnvironmentalActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/EcoEnvironmentalViewModel;", "Lgt7;", "", "initViewModel", "()V", "requestEnvironmentalValue", "initTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, "", "mTotal", "I", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoEnvironmentalActivity extends BaseBindingActivity<EcoEnvironmentalViewModel, gt7> {

    @NotNull
    public static final String TOTAL = "TOTAL_VALUE";
    private int mTotal;

    private final void initTitle() {
        setTitle(e1j.X0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewModel() {
        ((EcoEnvironmentalViewModel) getMViewModel()).getEnvironmentalValue().observe(this, new EcoEnvironmentalActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ft7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoEnvironmentalActivity.initViewModel$lambda$0(this.f18219a, (EnvironmentalVO) obj);
            }
        }));
        ((EcoEnvironmentalViewModel) getMViewModel()).initData(new EnvironmentalVO(Integer.valueOf(this.mTotal)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$0(EcoEnvironmentalActivity this$0, EnvironmentalVO environmentalVO) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTitle(environmentalVO.getCurrentLevelDes());
        return Unit.INSTANCE;
    }

    private final void requestEnvironmentalValue() {
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.p;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getIntExtra(TOTAL, -1) != -1) {
            this.mTotal = getIntent().getIntExtra(TOTAL, -1);
        }
        initTitle();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        initViewModel();
    }
}
