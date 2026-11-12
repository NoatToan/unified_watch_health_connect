package com.huami.sleep.sleepintrodetail.ui;

import android.content.ComponentCallbacks;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.sleepintrodetail.adapter.SleepIntroAdapter;
import com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailFragment;
import com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.view.UnitTextView;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/ui/SleepIntroDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/sleep/sleepintrodetail/adapter/SleepIntroAdapter;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/sleep/sleepintrodetail/adapter/SleepIntroAdapter;", "introItemAdapter", "Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailViewModel;", "b", "h", "()Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailViewModel;", "viewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 15;

    @NotNull
    private static final String d = "detail";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy introItemAdapter = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/ui/SleepIntroDetailFragment$Companion;", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "detail", "Lcom/huami/sleep/sleepintrodetail/ui/SleepIntroDetailFragment;", "getInstance", "", "ARG_DETAIL", "Ljava/lang/String;", "", "DETAIL_SPACING", LogUtil.I, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepIntroDetailFragment getInstance(@NotNull SleepIntroDetailVo detail) {
            SleepIntroDetailFragment sleepIntroDetailFragment = new SleepIntroDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("detail", detail);
            Unit unit = Unit.INSTANCE;
            sleepIntroDetailFragment.setArguments(bundle);
            return sleepIntroDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/adapter/SleepIntroAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SleepIntroAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepIntroAdapter invoke() {
            return new SleepIntroAdapter();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepIntroDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepIntroDetailViewModel>() { // from class: com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepIntroDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepIntroDetailViewModel.class), function0, objArr);
            }
        });
    }

    private final SleepIntroAdapter g() {
        return (SleepIntroAdapter) this.introItemAdapter.getValue();
    }

    private final SleepIntroDetailViewModel h() {
        return (SleepIntroDetailViewModel) this.viewModel.getValue();
    }

    private final void i() {
        SleepIntroDetailViewModel sleepIntroDetailViewModelH = h();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("detail");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo");
            SleepIntroDetailVo sleepIntroDetailVo = (SleepIntroDetailVo) serializable;
            sleepIntroDetailViewModelH.setIntroDetail(sleepIntroDetailVo);
            sleepIntroDetailViewModelH.statistics(sleepIntroDetailVo);
        }
        sleepIntroDetailViewModelH.getIntroValue().observe(getViewLifecycleOwner(), new Observer() { // from class: q07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailFragment.j(this.a, (String[]) obj);
            }
        });
        sleepIntroDetailViewModelH.getIntroValueImgRes().observe(getViewLifecycleOwner(), new Observer() { // from class: l07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailFragment.k(this.a, (Integer) obj);
            }
        });
        sleepIntroDetailViewModelH.getIntroTrendInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: m07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailFragment.l(this.a, (String) obj);
            }
        });
        sleepIntroDetailViewModelH.getRefValue().observe(getViewLifecycleOwner(), new Observer() { // from class: n07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailFragment.m(this.a, (String) obj);
            }
        });
        sleepIntroDetailViewModelH.getIntroItem().observe(getViewLifecycleOwner(), new Observer() { // from class: p07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailFragment.n(this.a, (List) obj);
            }
        });
        sleepIntroDetailViewModelH.getRefDoc().observe(getViewLifecycleOwner(), new Observer() { // from class: o07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailFragment.o(this.a, (String) obj);
            }
        });
    }

    private final void initView() {
        View view = getView();
        final RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycle_view));
        recyclerView.setAdapter(g());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailFragment$initView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                outRect.top = (int) ViewUtils.dp2px(recyclerView.getContext(), 15.0f);
            }
        });
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SleepIntroDetailFragment sleepIntroDetailFragment, String[] strArr) {
        View view = sleepIntroDetailFragment.getView();
        ((UnitTextView) (view == null ? null : view.findViewById(R.id.sleep_intro_detail_value))).setValues((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SleepIntroDetailFragment sleepIntroDetailFragment, Integer num) {
        View view = sleepIntroDetailFragment.getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.sleep_intro_detail_value_img))).setImageResource(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SleepIntroDetailFragment sleepIntroDetailFragment, String str) {
        View view = sleepIntroDetailFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.sleep_intro_detail_value_trend), true ^ (str == null || str.length() == 0));
        View view2 = sleepIntroDetailFragment.getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.sleep_intro_detail_value_trend) : null)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SleepIntroDetailFragment sleepIntroDetailFragment, String str) {
        View view = sleepIntroDetailFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.sleep_intro_detail_ref))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SleepIntroDetailFragment sleepIntroDetailFragment, List list) {
        sleepIntroDetailFragment.g().setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SleepIntroDetailFragment sleepIntroDetailFragment, String str) {
        View view = sleepIntroDetailFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.sleep_reference_documents_info))).setText(str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sleep_intro_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        i();
    }
}
