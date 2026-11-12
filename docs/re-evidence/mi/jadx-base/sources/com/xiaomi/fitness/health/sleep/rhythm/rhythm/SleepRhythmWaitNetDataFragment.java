package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmWaitNetDataFragment;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt;
import defpackage.c0j;
import defpackage.jui;
import defpackage.w0c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWaitNetDataFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Lw0c;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmWaitNetDataFragment extends BaseBindingFragment<SleepRhythmDetailViewModel, w0c> {
    public SleepRhythmWaitNetDataFragment() {
        super(jui.b5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(SleepRhythmWaitNetDataFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            Logger.i("SleepRhythmWaitNetDataFragment", "getPullRecentOneYearDataStatus true");
            HealthPrefer.INSTANCE.setPULL_RECENT_ONE_YEAR_DATA_DONE(true);
            Context context = this$0.getContext();
            if (context != null) {
                SleepRhythmExtKt.startSleepRhythmActivity(context);
            }
            this$0.finish();
        } else {
            ((SleepRhythmDetailViewModel) this$0.getMViewModel()).getPullRecentOneYearDataStatus();
            Logger.i("SleepRhythmWaitNetDataFragment", "getPullRecentOneYearDataStatus false");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.vj);
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        ((SleepRhythmDetailViewModel) getMViewModel()).getHasPullAllData().observe(getViewLifecycleOwner(), new SleepRhythmWaitNetDataFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmWaitNetDataFragment.onViewCreated$lambda$0(this.f22175a, (Boolean) obj);
            }
        }));
    }
}
