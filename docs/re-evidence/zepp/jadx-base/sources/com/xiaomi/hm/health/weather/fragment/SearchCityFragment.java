package com.xiaomi.hm.health.weather.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.device.HMSelectCityActivity;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.weather.adapter.Builder;
import com.xiaomi.hm.health.weather.adapter.HotCityAdapter;
import com.xiaomi.hm.health.weather.events.WeatherFragmentCallback;
import com.xiaomi.hm.health.weather.fragment.SearchCityFragment;
import com.xiaomi.hm.health.weather.viewmodel.SearchCityViewModel;
import com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R1\u0010-\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/weather/fragment/SearchCityFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", z.j, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", "Lcom/xiaomi/hm/health/weather/viewmodel/SearchCityViewModel;", "a", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/weather/viewmodel/SearchCityViewModel;", "searchCityViewModel", "Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "b", "g", "()Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "weatherViewModel", "Lcom/xiaomi/hm/health/weather/adapter/HotCityAdapter;", "c", "Lcom/xiaomi/hm/health/weather/adapter/HotCityAdapter;", "adapter", "Lcom/xiaomi/hm/health/weather/events/WeatherFragmentCallback;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/weather/events/WeatherFragmentCallback;", "fragmentCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cityName", "e", "Lkotlin/jvm/functions/Function1;", "hotCitySelectCallback", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class SearchCityFragment extends Fragment {
    private static final int f = 96;
    private static final int g = 36;
    private static final int h = 17;
    private static final int i = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy searchCityViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private HotCityAdapter adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private WeatherFragmentCallback fragmentCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, Unit> hotCitySelectCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "cityName", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            HMSelectCityActivity.closeKeyboard(SearchCityFragment.this.getActivity());
            WeatherFragmentCallback weatherFragmentCallback = SearchCityFragment.this.fragmentCallback;
            if (weatherFragmentCallback != null) {
                weatherFragmentCallback.startLoading();
            }
            SearchCityFragment.this.f().searchCity(str, true);
        }
    }

    public SearchCityFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.hm.health.weather.fragment.SearchCityFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.searchCityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SearchCityViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.weather.fragment.SearchCityFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
        this.weatherViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WeatherViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.weather.fragment.SearchCityFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.weather.fragment.SearchCityFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.hotCitySelectCallback = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchCityViewModel f() {
        return (SearchCityViewModel) this.searchCityViewModel.getValue();
    }

    private final WeatherViewModel g() {
        return (WeatherViewModel) this.weatherViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SearchCityFragment searchCityFragment, View view) {
        FragmentManager supportFragmentManager;
        HMSelectCityActivity.closeKeyboard(searchCityFragment.getActivity());
        FragmentActivity activity = searchCityFragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(SearchCityFragment searchCityFragment, TextView textView, int i2, KeyEvent keyEvent) {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentTransaction fragmentTransactionBeginTransaction;
        FragmentTransaction fragmentTransactionAddToBackStack;
        if (i2 != 3) {
            return false;
        }
        HMSelectCityActivity.closeKeyboard(searchCityFragment.getActivity());
        FragmentActivity activity = searchCityFragment.getActivity();
        Fragment fragmentFindFragmentById = (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentById(R.id.city_result_container);
        if (fragmentFindFragmentById instanceof CityResultFragment) {
            CityResultFragment cityResultFragment = (CityResultFragment) fragmentFindFragmentById;
            View view = searchCityFragment.getView();
            cityResultFragment.searchCity(((EditText) (view != null ? view.findViewById(R.id.search_city_et) : null)).getText().toString());
            return true;
        }
        FragmentActivity activity2 = searchCityFragment.getActivity();
        if (activity2 != null && (supportFragmentManager2 = activity2.getSupportFragmentManager()) != null && (fragmentTransactionBeginTransaction = supportFragmentManager2.beginTransaction()) != null && (fragmentTransactionAddToBackStack = fragmentTransactionBeginTransaction.addToBackStack("CityResult")) != null) {
            int i3 = R.id.city_result_container;
            CityResultFragment.Companion companion = CityResultFragment.INSTANCE;
            View view2 = searchCityFragment.getView();
            FragmentTransaction fragmentTransactionReplace = fragmentTransactionAddToBackStack.replace(i3, companion.newInstance(((EditText) (view2 != null ? view2.findViewById(R.id.search_city_et) : null)).getText().toString()));
            if (fragmentTransactionReplace != null) {
                fragmentTransactionReplace.commitAllowingStateLoss();
            }
        }
        return true;
    }

    private final void initView() {
        View view = getView();
        ((EditText) (view == null ? null : view.findViewById(R.id.search_city_et))).requestFocus();
        FragmentActivity activity = getActivity();
        View view2 = getView();
        HMSelectCityActivity.openKeyboard(activity, (EditText) (view2 == null ? null : view2.findViewById(R.id.search_city_et)));
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.weather_cancel_tv))).setOnClickListener(new View.OnClickListener() { // from class: vk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SearchCityFragment.h(this.a, view4);
            }
        });
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            View view4 = getView();
            View viewFindViewById = view4 == null ? null : view4.findViewById(R.id.hot_city_rc);
            HotCityAdapter hotCityAdapter = new HotCityAdapter(this.hotCitySelectCallback, new Pair(96, 36), new ArrayList());
            this.adapter = hotCityAdapter;
            Unit unit = Unit.INSTANCE;
            ((RecyclerView) viewFindViewById).setAdapter(hotCityAdapter);
            View view5 = getView();
            ((RecyclerView) (view5 == null ? null : view5.findViewById(R.id.hot_city_rc))).setLayoutManager(new GridLayoutManager(activity2, 3));
            Builder itemWidth = new Builder().setContext(activity2).setItemWidth(96);
            View view6 = getView();
            itemWidth.setRecyclerView((RecyclerView) (view6 == null ? null : view6.findViewById(R.id.hot_city_rc))).setVerticalGap(17).setSpanCount(3).build().setup();
        }
        int i2 = HMLoginManager.isInChina() ? 0 : 8;
        View view7 = getView();
        ((RecyclerView) (view7 == null ? null : view7.findViewById(R.id.hot_city_rc))).setVisibility(i2);
        View view8 = getView();
        ((TextView) (view8 == null ? null : view8.findViewById(R.id.hot_city_tv))).setVisibility(i2);
        View view9 = getView();
        ((EditText) (view9 != null ? view9.findViewById(R.id.search_city_et) : null)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: wk6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                return SearchCityFragment.i(this.a, textView, i3, keyEvent);
            }
        });
    }

    private final void j() {
        f().getHotCityLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: zk6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCityFragment.k(this.a, (List) obj);
            }
        });
        f().getHotCitySearchLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: xk6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCityFragment.l(this.a, (CityInfo) obj);
            }
        });
        g().getAddCityResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: yk6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCityFragment.m(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SearchCityFragment searchCityFragment, List list) {
        HotCityAdapter hotCityAdapter = searchCityFragment.adapter;
        Objects.requireNonNull(hotCityAdapter);
        hotCityAdapter.setCityList(list);
        HotCityAdapter hotCityAdapter2 = searchCityFragment.adapter;
        Objects.requireNonNull(hotCityAdapter2);
        hotCityAdapter2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SearchCityFragment searchCityFragment, CityInfo cityInfo) {
        searchCityFragment.g().addCity(cityInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SearchCityFragment searchCityFragment, Boolean bool) {
        FragmentManager supportFragmentManager;
        WeatherFragmentCallback weatherFragmentCallback = searchCityFragment.fragmentCallback;
        if (weatherFragmentCallback != null) {
            weatherFragmentCallback.stopLoading();
        }
        if (!bool.booleanValue()) {
            IconToast.showError(searchCityFragment.getActivity(), R.string.setting_fail);
            return;
        }
        FragmentActivity activity = searchCityFragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.popBackStack((String) null, 1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        KeyEventDispatcher.Component activity = getActivity();
        WeatherFragmentCallback weatherFragmentCallback = activity instanceof WeatherFragmentCallback ? (WeatherFragmentCallback) activity : null;
        this.fragmentCallback = weatherFragmentCallback;
        if (weatherFragmentCallback == null) {
            return;
        }
        weatherFragmentCallback.onEnter(SearchCityFragment.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_city, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        WeatherFragmentCallback weatherFragmentCallback = this.fragmentCallback;
        if (weatherFragmentCallback == null) {
            return;
        }
        weatherFragmentCallback.onBack(SearchCityFragment.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        j();
        f().loadHotCity();
    }
}
