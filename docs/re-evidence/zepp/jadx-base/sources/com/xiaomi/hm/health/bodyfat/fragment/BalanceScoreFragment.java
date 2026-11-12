package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.fragment.BalanceScoreFragment;
import com.xiaomi.hm.health.bodyfat.viewmodel.BalanceDetailViewModel;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/BalanceScoreFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BalanceScoreFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WeightInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightInfos weightInfos) {
            super(0);
            this.a = weightInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WeightInfos weightInfos = this.a;
            return String.valueOf(weightInfos == null ? null : weightInfos.getOfmt());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<BalanceDetailViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BalanceDetailViewModel invoke() {
            return (BalanceDetailViewModel) ViewModelProviders.of(BalanceScoreFragment.this.requireActivity()).get(BalanceDetailViewModel.class);
        }
    }

    public BalanceScoreFragment() {
        super(R.layout.fragment_balance_score);
        this.viewModel = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final BalanceDetailViewModel b() {
        return (BalanceDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(TextView textView, TextView textView2, BalanceScoreFragment balanceScoreFragment, WeightInfos weightInfos) {
        HMLog.info("selectData", new a(weightInfos));
        if (weightInfos == null || weightInfos.getOfmt() == null) {
            textView.setText(balanceScoreFragment.getString(R.string.empty_value));
        } else {
            textView.setText(String.valueOf((int) weightInfos.getOfmt().floatValue()));
            textView2.setText(balanceScoreFragment.getResources().getQuantityText(R.plurals.bodyfat_unit_score, (int) weightInfos.getOfmt().floatValue()));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final TextView textView = (TextView) view.findViewById(R.id.tv_balance_score);
        final TextView textView2 = (TextView) view.findViewById(R.id.tv_unit);
        b().getSelectData().observe(getViewLifecycleOwner(), new Observer() { // from class: ym
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceScoreFragment.c(textView, textView2, this, (WeightInfos) obj);
            }
        });
    }
}
