package com.xiaomi.hm.health.device.earbud.fragment;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudModePlayFragment;
import com.xiaomi.hm.health.device.earbud.view.PlayLoadingView;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudModePlayFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, z.j, hl.k, "h", "i", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudModePlayFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudModePlayFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudModePlayFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

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
            EarbudModePlayFragment.this.j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            EarbudModePlayFragment.this.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            EarbudModePlayFragment.this.i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            EarbudModePlayFragment.this.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            EarbudModePlayFragment.this.k();
        }
    }

    private final EarbudMusicViewModel c() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    private final void d() {
        c().getRestData().observe(this, new Observer() { // from class: te1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudModePlayFragment.e(this.a, (RestModeInfo) obj);
            }
        });
        c().getTomatoData().observe(this, new Observer() { // from class: ue1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudModePlayFragment.f(this.a, (TomatoModeInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(EarbudModePlayFragment earbudModePlayFragment, RestModeInfo restModeInfo) {
        if (restModeInfo == null) {
            return;
        }
        View view = earbudModePlayFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.play_info_time))).setText(DateUtils.formatElapsedTime(restModeInfo.getRemainTime()));
        View view2 = earbudModePlayFragment.getView();
        ((PlayLoadingView) (view2 == null ? null : view2.findViewById(R.id.play_loading))).setMax(restModeInfo.getTime());
        View view3 = earbudModePlayFragment.getView();
        ((PlayLoadingView) (view3 == null ? null : view3.findViewById(R.id.play_loading))).setProgress(restModeInfo.getRemainTime());
        View view4 = earbudModePlayFragment.getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.music_oper_btn_two))).setText(R.string.earbud_next_rest);
        View view5 = earbudModePlayFragment.getView();
        ((TextView) (view5 == null ? null : view5.findViewById(R.id.music_oper_btn_one))).setVisibility(0);
        View view6 = earbudModePlayFragment.getView();
        ((TextView) (view6 == null ? null : view6.findViewById(R.id.music_oper_btn_two))).setVisibility(0);
        if (restModeInfo.getRemainTime() > 0) {
            View view7 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view7 == null ? null : view7.findViewById(R.id.play_loading))).setPlay(true);
            View view8 = earbudModePlayFragment.getView();
            ((TextView) (view8 == null ? null : view8.findViewById(R.id.play_info_name))).setText(R.string.earbud_rest);
            View view9 = earbudModePlayFragment.getView();
            ((TextView) (view9 == null ? null : view9.findViewById(R.id.music_oper_btn_two))).setVisibility(8);
            View view10 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view10 == null ? null : view10.findViewById(R.id.play_loading))).setVisibility(0);
        } else {
            View view11 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view11 == null ? null : view11.findViewById(R.id.play_loading))).setPlay(false);
            View view12 = earbudModePlayFragment.getView();
            ((TextView) (view12 == null ? null : view12.findViewById(R.id.play_info_name))).setText(R.string.earbud_rest_is_end);
            View view13 = earbudModePlayFragment.getView();
            ((TextView) (view13 == null ? null : view13.findViewById(R.id.music_oper_btn_two))).setVisibility(0);
            View view14 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view14 == null ? null : view14.findViewById(R.id.play_loading))).setVisibility(4);
        }
        View view15 = earbudModePlayFragment.getView();
        ExtKt.smartClick$default(view15 == null ? null : view15.findViewById(R.id.music_oper_btn_one), 0L, earbudModePlayFragment.new a(), 1, null);
        View view16 = earbudModePlayFragment.getView();
        ExtKt.smartClick$default(view16 != null ? view16.findViewById(R.id.music_oper_btn_two) : null, 0L, earbudModePlayFragment.new b(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EarbudModePlayFragment earbudModePlayFragment, TomatoModeInfo tomatoModeInfo) {
        if (tomatoModeInfo == null) {
            return;
        }
        View view = earbudModePlayFragment.getView();
        ((PlayLoadingView) (view == null ? null : view.findViewById(R.id.play_loading))).setVisibility(0);
        View view2 = earbudModePlayFragment.getView();
        ((PlayLoadingView) (view2 == null ? null : view2.findViewById(R.id.play_loading))).setPlay(true);
        View view3 = earbudModePlayFragment.getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.music_oper_btn_one))).setVisibility(0);
        View view4 = earbudModePlayFragment.getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.music_oper_btn_two))).setVisibility(0);
        if (tomatoModeInfo.getRemainTime() > 0) {
            View view5 = earbudModePlayFragment.getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.play_info_time))).setText(DateUtils.formatElapsedTime(tomatoModeInfo.getRemainTime()));
            View view6 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view6 == null ? null : view6.findViewById(R.id.play_loading))).setMax(tomatoModeInfo.getTime());
            View view7 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view7 == null ? null : view7.findViewById(R.id.play_loading))).setProgress(tomatoModeInfo.getRemainTime());
            View view8 = earbudModePlayFragment.getView();
            ((TextView) (view8 == null ? null : view8.findViewById(R.id.play_info_name))).setText(R.string.earbud_tomato);
            View view9 = earbudModePlayFragment.getView();
            ((TextView) (view9 == null ? null : view9.findViewById(R.id.music_oper_btn_two))).setText(R.string.earbud_rest);
            View view10 = earbudModePlayFragment.getView();
            ExtKt.smartClick$default(view10 == null ? null : view10.findViewById(R.id.music_oper_btn_two), 0L, earbudModePlayFragment.new c(), 1, null);
        } else {
            View view11 = earbudModePlayFragment.getView();
            ((TextView) (view11 == null ? null : view11.findViewById(R.id.play_info_time))).setText(DateUtils.formatElapsedTime(tomatoModeInfo.getRestRemainTime()));
            View view12 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view12 == null ? null : view12.findViewById(R.id.play_loading))).setMax(tomatoModeInfo.getRestTime());
            View view13 = earbudModePlayFragment.getView();
            ((PlayLoadingView) (view13 == null ? null : view13.findViewById(R.id.play_loading))).setProgress(tomatoModeInfo.getRestRemainTime());
            View view14 = earbudModePlayFragment.getView();
            ((TextView) (view14 == null ? null : view14.findViewById(R.id.play_info_name))).setText(R.string.earbud_rest);
            View view15 = earbudModePlayFragment.getView();
            ((TextView) (view15 == null ? null : view15.findViewById(R.id.music_oper_btn_two))).setText(R.string.earbud_tomato);
            View view16 = earbudModePlayFragment.getView();
            ExtKt.smartClick$default(view16 == null ? null : view16.findViewById(R.id.music_oper_btn_two), 0L, earbudModePlayFragment.new d(), 1, null);
        }
        View view17 = earbudModePlayFragment.getView();
        ExtKt.smartClick$default(view17 != null ? view17.findViewById(R.id.music_oper_btn_one) : null, 0L, earbudModePlayFragment.new e(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        RestModeInfo value = c().getRestData().getValue();
        if (value == null) {
            return;
        }
        c().setRest(value.getTimeInMinute(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        TomatoModeInfo value = c().getTomatoData().getValue();
        if (value == null) {
            return;
        }
        c().setTomato(value.getTimeInMinute(), value.getRestTimeInMinute(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        TomatoModeInfo value = c().getTomatoData().getValue();
        if (value == null) {
            return;
        }
        c().setTomato(value.getTimeInMinute(), value.getRestTimeInMinute(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        RestModeInfo value = c().getRestData().getValue();
        if (value == null) {
            return;
        }
        c().setRest(value.getTimeInMinute(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        TomatoModeInfo value = c().getTomatoData().getValue();
        if (value == null) {
            return;
        }
        c().setTomato(value.getTimeInMinute(), value.getRestTimeInMinute(), 3);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_earbud_mode_play, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d();
    }
}
