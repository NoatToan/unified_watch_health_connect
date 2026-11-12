package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BodyFatDetailAdapter;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentChildBodyIndexBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChildBodyIndexFragment;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.BodyFatDetailsViewModel;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChildBodyIndexFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChildBodyIndexBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChildBodyIndexBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ChildBodyIndexFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentChildBodyIndexBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BodyFatDetailsViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BodyFatDetailsViewModel invoke() {
            return (BodyFatDetailsViewModel) ViewModelProviders.of(ChildBodyIndexFragment.this.requireActivity()).get(BodyFatDetailsViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ChildBodyIndexFragment childBodyIndexFragment, WeightInfos weightInfos) {
        if (weightInfos == null) {
            return;
        }
        List<List<ScoreParamsObject>> scoreShowInfos = BodyParamsUtils.getScoreShowInfos(childBodyIndexFragment.requireContext(), childBodyIndexFragment.getViewModel().getUserInfos(), weightInfos);
        ArrayList arrayList = new ArrayList();
        Iterator<List<ScoreParamsObject>> it2 = scoreShowInfos.iterator();
        while (it2.hasNext()) {
            for (ScoreParamsObject scoreParamsObject : it2.next()) {
                if (scoreParamsObject.getWfType() != 8) {
                    arrayList.add(scoreParamsObject);
                }
            }
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(childBodyIndexFragment.getActivity(), 1, false);
        FragmentChildBodyIndexBinding fragmentChildBodyIndexBinding = childBodyIndexFragment.binding;
        Objects.requireNonNull(fragmentChildBodyIndexBinding);
        fragmentChildBodyIndexBinding.allParamRv.setLayoutManager(linearLayoutManager);
        BodyFatDetailAdapter bodyFatDetailAdapter = new BodyFatDetailAdapter(childBodyIndexFragment.getActivity(), arrayList, ContextCompat.getColor(childBodyIndexFragment.requireContext(), R.color.bf3_list_health));
        FragmentChildBodyIndexBinding fragmentChildBodyIndexBinding2 = childBodyIndexFragment.binding;
        Objects.requireNonNull(fragmentChildBodyIndexBinding2);
        fragmentChildBodyIndexBinding2.allParamRv.setAdapter(bodyFatDetailAdapter);
        FragmentChildBodyIndexBinding fragmentChildBodyIndexBinding3 = childBodyIndexFragment.binding;
        Objects.requireNonNull(fragmentChildBodyIndexBinding3);
        fragmentChildBodyIndexBinding3.allParamRv.setNestedScrollingEnabled(false);
    }

    private final BodyFatDetailsViewModel getViewModel() {
        return (BodyFatDetailsViewModel) this.viewModel.getValue();
    }

    private final void initView() {
        getViewModel().getSelectWeightInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: do0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ChildBodyIndexFragment.b(this.a, (WeightInfos) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChildBodyIndexBinding fragmentChildBodyIndexBindingInflate = FragmentChildBodyIndexBinding.inflate(inflater);
        this.binding = fragmentChildBodyIndexBindingInflate;
        Objects.requireNonNull(fragmentChildBodyIndexBindingInflate);
        return fragmentChildBodyIndexBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
