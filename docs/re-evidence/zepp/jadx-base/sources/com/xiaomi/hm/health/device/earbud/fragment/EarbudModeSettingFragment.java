package com.xiaomi.hm.health.device.earbud.fragment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.loc.z;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudModeSettingFragment;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
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
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J(\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0006\u0010\u0018\u001a\u00020\tR\u001d\u0010\u001d\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudModeSettingFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "initView", z.j, "m", "Lcom/huami/widget/wheelview/WheelView;", "wheel", "", "start", "end", "defaultValue", "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "getMainBg", "a", "Lkotlin/Lazy;", "g", "()I", "mMode", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "b", "h", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "c", "e", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", GoogleApiAvailabilityLight.a, "f", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudModeSettingFragment extends Fragment implements KoinComponent {

    @NotNull
    public static final String ARGS = "mode";
    public static final int SET_REST_MODE = 0;
    public static final int SET_TOMATO_MODE = 1;
    private static final int e;
    private static final int f;
    private static final int g = 120;
    private static final int h;
    private static final int i = 60;
    private static final int j;
    private static final int k = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMode = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudModeSettingFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudModeSettingFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (EarbudModeSettingFragment.this.g() == 0) {
                EarbudModeSettingFragment.this.j();
            } else {
                EarbudModeSettingFragment.this.m();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            Bundle arguments = EarbudModeSettingFragment.this.getArguments();
            if (arguments == null) {
                return 0;
            }
            return arguments.getInt("mode", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }
    }

    static {
        e = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 1 : 5;
        f = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 1 : 10;
        h = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 1 : 10;
        j = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 1 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudModeSettingFragment() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudModeSettingFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudModeSettingFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceUtilsApi e() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final KeeperProxyApi f() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g() {
        return ((Number) this.mMode.getValue()).intValue();
    }

    private final EarbudMusicViewModel h() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    private final void i(WheelView wheel, int start, int end, int defaultValue) {
        wheel.setVisibleItems(3);
        FragmentActivity activity = getActivity();
        int i2 = e;
        wheel.setViewAdapter(new PickAdapter(activity, start / i2, end / i2, wheel, Color.parseColor("#ffffff"), Color.parseColor("#3cffffff"), Color.parseColor("#3cffffff"), false, 45, 36, 20, 20, i2));
        wheel.setCurrentItem((defaultValue - start) / i2);
        wheel.setLineColor(Color.parseColor("#1affffff"));
        wheel.setStyle(WheelView.Style.LINE);
    }

    private final void initView() {
        if (g() == 0) {
            View view = getView();
            ((TextView) (view == null ? null : view.findViewById(R.id.setting_one_title))).setText(R.string.earbud_set_rest_time_tip);
            View view2 = getView();
            ((TextView) (view2 == null ? null : view2.findViewById(R.id.setting_two_title))).setVisibility(8);
            View view3 = getView();
            ((RelativeLayout) (view3 == null ? null : view3.findViewById(R.id.time_set_two))).setVisibility(8);
            View view4 = getView();
            i((WheelView) (view4 == null ? null : view4.findViewById(R.id.time_set_one_wheel)), f, 120, f().getEarbudRestTime());
        } else {
            View view5 = getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.setting_one_title))).setText(R.string.earbud_tomato);
            View view6 = getView();
            ((TextView) (view6 == null ? null : view6.findViewById(R.id.setting_two_title))).setVisibility(0);
            View view7 = getView();
            ((TextView) (view7 == null ? null : view7.findViewById(R.id.setting_two_title))).setText(R.string.earbud_rest);
            View view8 = getView();
            ((RelativeLayout) (view8 == null ? null : view8.findViewById(R.id.time_set_two))).setVisibility(0);
            View view9 = getView();
            i((WheelView) (view9 == null ? null : view9.findViewById(R.id.time_set_one_wheel)), h, 60, f().getEarbudTomatoTime());
            View view10 = getView();
            i((WheelView) (view10 == null ? null : view10.findViewById(R.id.time_set_two_wheel)), j, 60, f().getEarbudTomatoRestTime());
        }
        View view11 = getView();
        ExtKt.smartClick$default(view11 != null ? view11.findViewById(R.id.start_btn) : null, 0L, new a(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        View view = getView();
        final int currentItem = (((WheelView) (view == null ? null : view.findViewById(R.id.time_set_one_wheel))).getCurrentItem() * e) + f;
        if (f().isShowEarbudRestDialog()) {
            new AlertDialogFragment.Builder(requireActivity()).setMessage(getString(R.string.earbud_start_rest_msg, e().formatMinute(currentItem))).setCancelable(false).setNegativeButton(R.string.no_tip, new DialogInterface.OnClickListener() { // from class: we1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    EarbudModeSettingFragment.k(this.a, currentItem, dialogInterface, i2);
                }
            }).setPositiveButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: ve1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    EarbudModeSettingFragment.l(this.a, currentItem, dialogInterface, i2);
                }
            }).show(getChildFragmentManager());
        } else {
            h().setRest(currentItem, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(EarbudModeSettingFragment earbudModeSettingFragment, int i2, DialogInterface dialogInterface, int i3) {
        earbudModeSettingFragment.f().saveIsShowEarbudRestDialog(false);
        earbudModeSettingFragment.h().setRest(i2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EarbudModeSettingFragment earbudModeSettingFragment, int i2, DialogInterface dialogInterface, int i3) {
        earbudModeSettingFragment.h().setRest(i2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        View view = getView();
        int currentItem = ((WheelView) (view == null ? null : view.findViewById(R.id.time_set_one_wheel))).getCurrentItem();
        int i2 = e;
        final int i3 = (currentItem * i2) + h;
        View view2 = getView();
        final int currentItem2 = (((WheelView) (view2 != null ? view2.findViewById(R.id.time_set_two_wheel) : null)).getCurrentItem() * i2) + j;
        if (f().isShowEarbudTomatoDialog()) {
            new AlertDialogFragment.Builder(requireActivity()).setMessage(getString(R.string.earbud_start_tomato_msg, e().formatMinute(i3), e().formatMinute(currentItem2))).setCancelable(false).setNegativeButton(R.string.no_tip, new DialogInterface.OnClickListener() { // from class: ye1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    EarbudModeSettingFragment.n(this.a, i3, currentItem2, dialogInterface, i4);
                }
            }).setPositiveButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: xe1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    EarbudModeSettingFragment.o(this.a, i3, currentItem2, dialogInterface, i4);
                }
            }).show(getChildFragmentManager());
        } else {
            h().setTomato(i3, currentItem2, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(EarbudModeSettingFragment earbudModeSettingFragment, int i2, int i3, DialogInterface dialogInterface, int i4) {
        earbudModeSettingFragment.f().saveIsShowEarbudTomatoDialog(false);
        earbudModeSettingFragment.h().setTomato(i2, i3, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EarbudModeSettingFragment earbudModeSettingFragment, int i2, int i3, DialogInterface dialogInterface, int i4) {
        earbudModeSettingFragment.h().setTomato(i2, i3, 2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final int getMainBg() {
        return g() == 0 ? R.drawable.bg_rest : R.drawable.bg_tomato;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_earbud_mode_setting, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
