package com.xiaomi.hm.health.weather.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.weather.adapter.CityResultAdapter;
import com.xiaomi.hm.health.weather.events.CityResultCallback;
import com.xiaomi.hm.health.weather.events.WeatherFragmentCallback;
import com.xiaomi.hm.health.weather.fragment.CityResultFragment;
import com.xiaomi.hm.health.weather.viewmodel.SearchCityViewModel;
import com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0016\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/weather/fragment/CityResultFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "f", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "", "cityName", "searchCity", "com/xiaomi/hm/health/weather/fragment/CityResultFragment$cityResultCallback$1", "a", "Lcom/xiaomi/hm/health/weather/fragment/CityResultFragment$cityResultCallback$1;", "cityResultCallback", "Lcom/xiaomi/hm/health/weather/events/WeatherFragmentCallback;", "b", "Lcom/xiaomi/hm/health/weather/events/WeatherFragmentCallback;", "fragmentCallback", "Lcom/xiaomi/hm/health/weather/viewmodel/SearchCityViewModel;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/weather/viewmodel/SearchCityViewModel;", "searchCityViewModel", "Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "weatherViewModel", "Lcom/xiaomi/hm/health/weather/adapter/CityResultAdapter;", "Lcom/xiaomi/hm/health/weather/adapter/CityResultAdapter;", "adapter", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class CityResultFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "city_name";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CityResultFragment$cityResultCallback$1 cityResultCallback = new CityResultCallback() { // from class: com.xiaomi.hm.health.weather.fragment.CityResultFragment$cityResultCallback$1
        @Override // com.xiaomi.hm.health.weather.events.CityResultCallback
        public void onCitySelect(@NotNull CityInfo cityInfo) {
            WeatherFragmentCallback weatherFragmentCallback = this.a.fragmentCallback;
            if (weatherFragmentCallback != null) {
                weatherFragmentCallback.startLoading();
            }
            this.a.d().addCity(cityInfo);
        }
    };

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WeatherFragmentCallback fragmentCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy searchCityViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private CityResultAdapter adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/weather/fragment/CityResultFragment$Companion;", "", "", "cityName", "Lcom/xiaomi/hm/health/weather/fragment/CityResultFragment;", "newInstance", "KEY_CITY_NAME", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CityResultFragment newInstance(@NotNull String cityName) {
            CityResultFragment cityResultFragment = new CityResultFragment();
            Bundle bundle = new Bundle();
            bundle.putString(CityResultFragment.f, cityName);
            Unit unit = Unit.INSTANCE;
            cityResultFragment.setArguments(bundle);
            return cityResultFragment;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.weather.fragment.CityResultFragment$cityResultCallback$1] */
    public CityResultFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.hm.health.weather.fragment.CityResultFragment$special$$inlined$viewModels$default$1
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
        this.searchCityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SearchCityViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.weather.fragment.CityResultFragment$special$$inlined$viewModels$default$2
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
        this.weatherViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WeatherViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.weather.fragment.CityResultFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.weather.fragment.CityResultFragment$special$$inlined$activityViewModels$default$2
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
    }

    private final SearchCityViewModel c() {
        return (SearchCityViewModel) this.searchCityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeatherViewModel d() {
        return (WeatherViewModel) this.weatherViewModel.getValue();
    }

    private final void e() {
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString(f);
        WeatherFragmentCallback weatherFragmentCallback = this.fragmentCallback;
        if (weatherFragmentCallback != null) {
            weatherFragmentCallback.startLoading();
        }
        SearchCityViewModel.searchCity$default(c(), string, false, 2, null);
    }

    private final void f() {
        c().getCityResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: cp0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CityResultFragment.g(this.a, (List) obj);
            }
        });
        d().getAddCityResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: bp0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CityResultFragment.h(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(CityResultFragment cityResultFragment, List list) {
        WeatherFragmentCallback weatherFragmentCallback = cityResultFragment.fragmentCallback;
        if (weatherFragmentCallback != null) {
            weatherFragmentCallback.stopLoading();
        }
        if (list == null || list.isEmpty()) {
            View view = cityResultFragment.getView();
            ((RecyclerView) (view == null ? null : view.findViewById(R.id.city_result_rv))).setVisibility(8);
            View view2 = cityResultFragment.getView();
            ((TextView) (view2 != null ? view2.findViewById(R.id.no_result_tv) : null)).setVisibility(0);
            return;
        }
        View view3 = cityResultFragment.getView();
        ((RecyclerView) (view3 == null ? null : view3.findViewById(R.id.city_result_rv))).setVisibility(0);
        View view4 = cityResultFragment.getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.no_result_tv) : null)).setVisibility(8);
        CityResultAdapter cityResultAdapter = cityResultFragment.adapter;
        Objects.requireNonNull(cityResultAdapter);
        cityResultAdapter.setData(list);
        CityResultAdapter cityResultAdapter2 = cityResultFragment.adapter;
        Objects.requireNonNull(cityResultAdapter2);
        cityResultAdapter2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CityResultFragment cityResultFragment, Boolean bool) {
        FragmentManager supportFragmentManager;
        if (!bool.booleanValue()) {
            IconToast.showError(cityResultFragment.getActivity(), R.string.setting_fail);
            return;
        }
        FragmentActivity activity = cityResultFragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.popBackStack((String) null, 1);
    }

    private final void initView() {
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.city_result_rv);
        CityResultAdapter cityResultAdapter = new CityResultAdapter(new ArrayList(), this.cityResultCallback);
        this.adapter = cityResultAdapter;
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(cityResultAdapter);
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.city_result_rv) : null)).setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        KeyEventDispatcher.Component activity = getActivity();
        this.fragmentCallback = activity instanceof WeatherFragmentCallback ? (WeatherFragmentCallback) activity : null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_city_result, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        f();
        e();
    }

    public final void searchCity(@Nullable String cityName) {
        WeatherFragmentCallback weatherFragmentCallback = this.fragmentCallback;
        if (weatherFragmentCallback != null) {
            weatherFragmentCallback.startLoading();
        }
        SearchCityViewModel.searchCity$default(c(), cityName, false, 2, null);
    }
}
