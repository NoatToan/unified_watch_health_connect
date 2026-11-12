package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.adapter.IdleCardsAdapter;
import com.huami.wallet.ui.fragment.OpenedBusCardsFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.viewmodel.OpenedBusCardsViewModel;
import com.loopeer.cardstack.CardStackView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0002R\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010/¨\u00064"}, d2 = {"Lcom/huami/wallet/ui/fragment/OpenedBusCardsFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initView", "Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "r", GoogleApiAvailabilityLight.b, "", "show", hl.k, "card", "m", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "initViewModel", "navigateToBusCardList", "Lcom/huami/wallet/ui/navigation/NavigationController;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/ui/viewmodel/OpenedBusCardsViewModel;", "c", "g", "()Lcom/huami/wallet/ui/viewmodel/OpenedBusCardsViewModel;", "viewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "e", "Landroid/view/View;", "rootView", "Lcom/huami/wallet/ui/adapter/IdleCardsAdapter;", "Lcom/huami/wallet/ui/adapter/IdleCardsAdapter;", "adapter", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OpenedBusCardsFragment extends BaseFragment {
    public static final int HEIGHT_SPAN = 10;
    public static final float RATIO = 1.5804878f;
    public static final float RATIO_EXTRA = 4.0f;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private View rootView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private IdleCardsAdapter adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<List<? extends BusCardSimple2>>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<List<BusCardSimple2>> resource) {
            LoadingDialogHelper loadingDialogHelper = OpenedBusCardsFragment.this.loadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.showOrError(resource);
            }
            OpenedBusCardsFragment.this.n(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends BusCardSimple2>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ BusCardSimple2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BusCardSimple2 busCardSimple2) {
            super(1);
            this.b = busCardSimple2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            NavigationController navigationControllerF = OpenedBusCardsFragment.this.f();
            FragmentActivity activity = OpenedBusCardsFragment.this.getActivity();
            BusCardSimple2 busCardSimple2 = this.b;
            String str = busCardSimple2.id;
            String str2 = busCardSimple2.name;
            String str3 = busCardSimple2.xiaomiCardName;
            String str4 = busCardSimple2.imageUrl;
            boolean zBooleanValue = busCardSimple2.shiftEnable.booleanValue();
            BusCardSimple2 busCardSimple3 = this.b;
            navigationControllerF.navigateToBusCardDetail(activity, str, str2, str3, str4, zBooleanValue, busCardSimple3.packageName, busCardSimple3.appName, busCardSimple3.redirectTo, busCardSimple3.serviceContact);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenedBusCardsFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.OpenedBusCardsFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.OpenedBusCardsFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<OpenedBusCardsViewModel>() { // from class: com.huami.wallet.ui.fragment.OpenedBusCardsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.OpenedBusCardsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final OpenedBusCardsViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(OpenedBusCardsViewModel.class), function0, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController f() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final OpenedBusCardsViewModel g() {
        return (OpenedBusCardsViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(OpenedBusCardsFragment openedBusCardsFragment, View view) {
        openedBusCardsFragment.g().getBusCardListLiveData().refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(OpenedBusCardsFragment openedBusCardsFragment, int i, BusCardSimple2 busCardSimple2) {
        openedBusCardsFragment.f().navigateToBusCardDetail(openedBusCardsFragment.getActivity(), busCardSimple2.id, busCardSimple2.name, busCardSimple2.xiaomiCardName, busCardSimple2.imageUrl, busCardSimple2.shiftEnable.booleanValue(), busCardSimple2.packageName, busCardSimple2.appName, busCardSimple2.redirectTo, busCardSimple2.serviceContact);
    }

    private final void initView() {
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        View view = this.rootView;
        Objects.requireNonNull(view);
        ((ConstraintLayout) view.findViewById(R.id.retry_view)).setOnClickListener(new View.OnClickListener() { // from class: zm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OpenedBusCardsFragment.h(this.a, view2);
            }
        });
        IdleCardsAdapter idleCardsAdapter = new IdleCardsAdapter(getActivity());
        this.adapter = idleCardsAdapter;
        Objects.requireNonNull(idleCardsAdapter);
        idleCardsAdapter.setOnItemClick(new IdleCardsAdapter.OnItemClick() { // from class: an5
            @Override // com.huami.wallet.ui.adapter.IdleCardsAdapter.OnItemClick
            public final void onItemClick(int i, BusCardSimple2 busCardSimple2) {
                OpenedBusCardsFragment.i(this.a, i, busCardSimple2);
            }
        });
        View view2 = this.rootView;
        Objects.requireNonNull(view2);
        int i = R.id.card_stack;
        CardStackView cardStackView = (CardStackView) view2.findViewById(i);
        IdleCardsAdapter idleCardsAdapter2 = this.adapter;
        Objects.requireNonNull(idleCardsAdapter2);
        cardStackView.setAdapter(idleCardsAdapter2);
        View view3 = this.rootView;
        Objects.requireNonNull(view3);
        ((CardStackView) view3.findViewById(i)).setItemExpendListener(new CardStackView.ItemExpendListener() { // from class: bn5
            @Override // com.loopeer.cardstack.CardStackView.ItemExpendListener
            public final void onItemExpend(boolean z) {
                OpenedBusCardsFragment.j(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(boolean z) {
    }

    private final void k(boolean show) {
        View view = this.rootView;
        Objects.requireNonNull(view);
        ((ConstraintLayout) view.findViewById(R.id.retry_view)).setVisibility(show ? 0 : 8);
        View view2 = this.rootView;
        Objects.requireNonNull(view2);
        ((NestedScrollView) view2.findViewById(R.id.nested_scrollview)).setVisibility(show ? 8 : 0);
    }

    private final void l(List<? extends BusCardSimple2> cards) {
        if ((cards == null ? null : Integer.valueOf(cards.size())).intValue() <= 0) {
            View view = this.rootView;
            Objects.requireNonNull(view);
            ((LinearLayout) view.findViewById(R.id.cards_idle)).setVisibility(8);
            return;
        }
        View view2 = this.rootView;
        Objects.requireNonNull(view2);
        ((LinearLayout) view2.findViewById(R.id.cards_idle)).setVisibility(0);
        IdleCardsAdapter idleCardsAdapter = this.adapter;
        Objects.requireNonNull(idleCardsAdapter);
        idleCardsAdapter.updateData(cards);
        int size = cards.size();
        View view3 = this.rootView;
        Objects.requireNonNull(view3);
        int i = R.id.card_stack;
        float measuredWidth = ((CardStackView) view3.findViewById(i)).getMeasuredWidth() / 1.5804878f;
        View view4 = this.rootView;
        Objects.requireNonNull(view4);
        ((CardStackView) view4.findViewById(i)).getLayoutParams().height = ((int) (measuredWidth + (((size - 1) * measuredWidth) / 4.0f))) + 10;
    }

    private final void m(BusCardSimple2 card) {
        if (card == null) {
            View view = this.rootView;
            Objects.requireNonNull(view);
            ((LinearLayout) view.findViewById(R.id.card_in_use)).setVisibility(8);
            return;
        }
        View view2 = this.rootView;
        Objects.requireNonNull(view2);
        ((LinearLayout) view2.findViewById(R.id.card_in_use)).setVisibility(0);
        View view3 = this.rootView;
        Objects.requireNonNull(view3);
        int i = R.id.card_image_default;
        KTViewExtensionKt.singleClick((ImageView) view3.findViewById(i), new b(card));
        View view4 = this.rootView;
        Objects.requireNonNull(view4);
        ImageView imageView = (ImageView) view4.findViewById(i);
        String str = card.imageUrl;
        Context context = getContext();
        ImageLoadUtils.loadImageInRoundRect(imageView, str, (context == null ? null : context.getResources()).getDimensionPixelOffset(R.dimen.wl_image_round_rect_radius));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Resource<List<BusCardSimple2>> r) {
        if (r.isSuccessful()) {
            List<BusCardSimple2> list = r.data;
            if (list != null && (list.isEmpty() ^ true)) {
                BusCardSimple2 busCardSimple2 = null;
                ArrayList arrayList = new ArrayList();
                List<BusCardSimple2> list2 = r.data;
                if (list2 != null) {
                    for (BusCardSimple2 busCardSimple3 : list2) {
                        if (busCardSimple3.isDefault) {
                            busCardSimple2 = busCardSimple3;
                        } else {
                            arrayList.add(busCardSimple3);
                        }
                    }
                }
                k(false);
                m(busCardSimple2);
                l(arrayList);
                return;
            }
        }
        if (r.status == Status.ERROR) {
            k(true);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initViewModel() {
        g().getBusCardListLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载卡片的余额和详情"));
        LiveDataExtensionKt.observeResourceWithNotNull(g().getBusCardListLiveData(), this, new a());
    }

    public final void navigateToBusCardList() {
        f().navigateToBusCardList(getContext(), null);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.rootView = inflater.inflate(R.layout.wl_fragment_opened_bus_cards, container, false);
        initView();
        View view = this.rootView;
        Objects.requireNonNull(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
    }
}
