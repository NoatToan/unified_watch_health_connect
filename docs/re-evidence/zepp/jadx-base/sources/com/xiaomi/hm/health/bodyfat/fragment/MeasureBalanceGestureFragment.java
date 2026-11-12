package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureSuccess;
import com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureTimeout;
import com.huami.bluetooth.profile.channel.module.scale.BalanceResult;
import com.huami.bluetooth.profile.channel.module.scale.Failure;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceGestureFragment;
import com.xiaomi.hm.health.bodyfat.model.MeasureBalanceState;
import com.xiaomi.hm.health.bodyfat.viewmodel.MeasureBalanceViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBalanceGestureFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasureBalanceGestureFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MeasureBalanceViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MeasureBalanceViewModel invoke() {
            return (MeasureBalanceViewModel) ViewModelProviders.of(MeasureBalanceGestureFragment.this.requireActivity()).get(MeasureBalanceViewModel.class);
        }
    }

    public MeasureBalanceGestureFragment() {
        super(R.layout.fragment_measure_balance_gesture);
        this.viewModel = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final MeasureBalanceViewModel b() {
        return (MeasureBalanceViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MeasureBalanceGestureFragment measureBalanceGestureFragment, BalanceResult balanceResult) {
        if (balanceResult instanceof BalanceMeasureSuccess) {
            measureBalanceGestureFragment.b().getPageIndex().postValue(MeasureBalanceState.Measuring.INSTANCE);
        } else if (balanceResult instanceof BalanceMeasureTimeout) {
            measureBalanceGestureFragment.b().getPageIndex().postValue(MeasureBalanceState.Failure.INSTANCE);
        } else if (balanceResult instanceof Failure) {
            measureBalanceGestureFragment.b().getPageIndex().postValue(MeasureBalanceState.Failure.INSTANCE);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b().setMeasureBalanceMode(true);
        b().getMeasureResult().observe(getViewLifecycleOwner(), new Observer() { // from class: qv4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MeasureBalanceGestureFragment.c(this.a, (BalanceResult) obj);
            }
        });
    }
}
