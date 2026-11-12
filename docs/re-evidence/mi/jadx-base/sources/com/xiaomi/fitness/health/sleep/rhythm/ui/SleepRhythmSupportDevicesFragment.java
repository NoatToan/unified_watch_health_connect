package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmSupportDevicesFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.awb;
import defpackage.c0j;
import defpackage.jui;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSupportDevicesFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSupportDevicesViewModel;", "Lawb;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lawb;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter;", "mSleepRhythmSleepSupportDeviceAdapter$delegate", "Lkotlin/Lazy;", "getMSleepRhythmSleepSupportDeviceAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter;", "mSleepRhythmSleepSupportDeviceAdapter", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmSupportDevicesFragment extends Hilt_SleepRhythmSupportDevicesFragment<SleepRhythmSupportDevicesViewModel, awb> {

    /* JADX INFO: renamed from: mSleepRhythmSleepSupportDeviceAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmSleepSupportDeviceAdapter;

    public SleepRhythmSupportDevicesFragment() {
        super(jui.R3);
        this.mSleepRhythmSleepSupportDeviceAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: svm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmSupportDevicesFragment.mSleepRhythmSleepSupportDeviceAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(Button it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewUtilKt.startWebView$default(SleepAnimalExtKt.guideBuyDeviceUrl(), null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(SleepRhythmSupportDevicesFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        MainExtKt.showTabWithIndex(mActivity, MainTab.INSTANCE.getINDEX_DEVICE());
        return Unit.INSTANCE;
    }

    private final SleepRhythmSleepSupportDeviceAdapter getMSleepRhythmSleepSupportDeviceAdapter() {
        return (SleepRhythmSleepSupportDeviceAdapter) this.mSleepRhythmSleepSupportDeviceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmSleepSupportDeviceAdapter mSleepRhythmSleepSupportDeviceAdapter_delegate$lambda$0() {
        return new SleepRhythmSleepSupportDeviceAdapter();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull awb awbVar) {
        Intrinsics.checkNotNullParameter(awbVar, "<this>");
        awbVar.C.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        awbVar.C.setAdapter(getMSleepRhythmSleepSupportDeviceAdapter());
        ViewExtKt.clickWithTrigger$default(awbVar.B, 0L, new Function1() { // from class: tvm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepRhythmSupportDevicesFragment.bindView$lambda$1((Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(awbVar.A, 0L, new Function1() { // from class: uvm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepRhythmSupportDevicesFragment.bindView$lambda$2(this.f36194a, (Button) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(c0j.Ij));
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        List<WearableProduct> allSupportDeviceList = ((SleepRhythmSupportDevicesViewModel) getMViewModel()).getAllSupportDeviceList();
        getMSleepRhythmSleepSupportDeviceAdapter().submitList(allSupportDeviceList);
        Logger.d("SleepRhythmSupportDevicesFragment", "supportDeviceList:" + allSupportDeviceList);
    }
}
