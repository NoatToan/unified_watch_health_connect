package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmUpToRemoteFragment;
import defpackage.jui;
import defpackage.wvb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmUpToRemoteFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Lwvb;", "", "initView", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lwvb;)V", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmUpToRemoteFragment extends Hilt_SleepRhythmUpToRemoteFragment<SleepRhythmDetailViewModel, wvb> {

    @NotNull
    public static final String INTENT_REQUEST_END_LIMIT = "request_end_limit";

    @NotNull
    public static final String INTENT_REQUEST_START_TIME = "request_start_time";

    public SleepRhythmUpToRemoteFragment() {
        super(jui.O3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(SleepRhythmUpToRemoteFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$2(final SleepRhythmUpToRemoteFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
        ((SleepRhythmDetailViewModel) this$0.getMViewModel()).setThirdPartyAuthStatus().observe(this$0.getViewLifecycleOwner(), new Observer() { // from class: awm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepRhythmUpToRemoteFragment.bindView$lambda$2$lambda$1(this.f3521a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2$lambda$1(SleepRhythmUpToRemoteFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Intent intent = new Intent();
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1, intent);
            }
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 != null) {
                mActivity2.finish();
            }
        }
    }

    private final void initView() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull wvb wvbVar) {
        Intrinsics.checkNotNullParameter(wvbVar, "<this>");
        wvbVar.B.setOnClickListener(new View.OnClickListener() { // from class: bwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmUpToRemoteFragment.bindView$lambda$0(this.f4677a, view);
            }
        });
        wvbVar.A.setOnClickListener(new View.OnClickListener() { // from class: cwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmUpToRemoteFragment.bindView$lambda$2(this.f14806a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle("");
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        initView();
    }
}
