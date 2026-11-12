package com.xiaomi.hm.health.play;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.huami.account.event.EventAccountStatus;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.xiaomi.hm.health.databinding.FragmentPlayNewBinding;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.play.PlayFragment;
import com.xiaomi.hm.health.play.base.PlayBaseFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0017R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/play/PlayFragment;", "Lcom/xiaomi/hm/health/play/base/PlayBaseFragment;", "Lcom/xiaomi/hm/health/databinding/FragmentPlayNewBinding;", "", "i", "Landroid/view/View;", "customView", "", "isSelected", DTransferConstants.SEARCH_KEY, "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", b.r, ViewHierarchyConstants.VIEW_KEY, "initBinding", "initView", "Lcom/xiaomi/hm/health/play/PlayFragmentAdapter;", "b", "Lkotlin/Lazy;", "g", "()Lcom/xiaomi/hm/health/play/PlayFragmentAdapter;", "mFragmentAdapter", "Lcom/xiaomi/hm/health/play/PlayViewModel;", "c", "h", "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "healthTabRedDot", "e", "sportTabRedDot", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayFragment extends PlayBaseFragment<FragmentPlayNewBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFragmentAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private View healthTabRedDot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private View sportTabRedDot;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/PlayFragmentAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PlayFragmentAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlayFragmentAdapter getA() {
            return new PlayFragmentAdapter(PlayFragment.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayFragment() {
        super(R.layout.fragment_play_new);
        this.mFragmentAdapter = LazyKt__LazyJVMKt.lazy(new a());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.PlayFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.play.PlayFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PlayViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayFragmentAdapter g() {
        return (PlayFragmentAdapter) this.mFragmentAdapter.getValue();
    }

    private final PlayViewModel h() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    private final void i() {
        h().getIntelligenceLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: r06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayFragment.m(this.a, (List) obj);
            }
        });
        h().getDeviceBoundLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: o06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayFragment.n(this.a, (HMDeviceBindEvent) obj);
            }
        });
        h().getLoginLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: n06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayFragment.j(this.a, (EventAccountStatus) obj);
            }
        });
        h().getHealthNewData().observe(this, new Observer() { // from class: q06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayFragment.k(this.a, (Boolean) obj);
            }
        });
        h().getSportNewData().observe(this, new Observer() { // from class: p06
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PlayFragment.l(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PlayFragment playFragment, EventAccountStatus eventAccountStatus) {
        if (eventAccountStatus != null && eventAccountStatus.getStatus() == 2) {
            PlayFragmentAdapter playFragmentAdapterG = playFragment.g();
            PlayTabType playTabType = PlayTabType.INTELLIGENCE;
            if (playFragmentAdapterG.isFragmentContains(playTabType)) {
                return;
            }
            playFragment.h().loadSupportSorTools(playTabType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PlayFragment playFragment, Boolean bool) {
        View view = playFragment.healthTabRedDot;
        if (view == null) {
            return;
        }
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PlayFragment playFragment, Boolean bool) {
        View view = playFragment.sportTabRedDot;
        if (view == null) {
            return;
        }
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(PlayFragment playFragment, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlayTool) obj).isShow()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            playFragment.g().removeFragment(PlayTabType.INTELLIGENCE);
            return;
        }
        PlayFragmentAdapter playFragmentAdapterG = playFragment.g();
        PlayTabType playTabType = PlayTabType.INTELLIGENCE;
        if (playFragmentAdapterG.isFragmentContains(playTabType)) {
            return;
        }
        playFragment.g().addFragment(0, playTabType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(PlayFragment playFragment, HMDeviceBindEvent hMDeviceBindEvent) {
        if (hMDeviceBindEvent == null) {
            return;
        }
        PlayFragmentAdapter playFragmentAdapterG = playFragment.g();
        PlayTabType playTabType = PlayTabType.INTELLIGENCE;
        if (playFragmentAdapterG.isFragmentContains(playTabType)) {
            return;
        }
        playFragment.h().loadSupportSorTools(playTabType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(PlayFragment playFragment, TabLayout.Tab tab, int i) {
        View viewInflate = LayoutInflater.from(playFragment.requireContext()).inflate(R.layout.play_item_tab_layout, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.item_tab)).setText(playFragment.g().getTabType(i).getTitle());
        View viewFindViewById = viewInflate.findViewById(R.id.item_redot);
        PlayTabType tabType = playFragment.g().getTabType(i);
        if (tabType == PlayTabType.HEALTH) {
            playFragment.healthTabRedDot = viewFindViewById;
        } else if (tabType == PlayTabType.SPORT) {
            playFragment.sportTabRedDot = viewFindViewById;
        }
        tab.setCustomView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(PlayTabType tabType) {
        PlayTabType playTabType = PlayTabType.HEALTH;
        if (tabType == playTabType) {
            if (h().getPlayTabNewTool(playTabType)) {
                h().setPlayTabClicked(playTabType);
            }
        } else {
            PlayTabType playTabType2 = PlayTabType.SPORT;
            if (tabType == playTabType2 && h().getPlayTabNewTool(playTabType2)) {
                h().setPlayTabClicked(playTabType2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(View customView, boolean isSelected) {
        if (isSelected) {
            TextView textView = (TextView) customView.findViewById(R.id.item_tab);
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#ff312e"));
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            View viewFindViewById = customView.findViewById(R.id.tab_item_indicator);
            if (viewFindViewById == null) {
                return;
            }
            ExtensionsKt.visible(viewFindViewById);
            return;
        }
        TextView textView2 = (TextView) customView.findViewById(R.id.item_tab);
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor("#666666"));
            textView2.setTypeface(Typeface.defaultFromStyle(0));
        }
        View viewFindViewById2 = customView.findViewById(R.id.tab_item_indicator);
        if (viewFindViewById2 == null) {
            return;
        }
        ExtensionsKt.invisible(viewFindViewById2);
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    @SuppressLint({"InflateParams"})
    public void initView() throws IllegalAccessException, NoSuchFieldException {
        View customView;
        final FragmentPlayNewBinding binding = getBinding();
        TabLayout tabLayout = binding.playTabLayout;
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = BaseTitleActivity.getStatusBarHeight(getContext());
        Unit unit = Unit.INSTANCE;
        tabLayout.setLayoutParams(layoutParams2);
        ViewPager2 viewPager2 = binding.playViewpager;
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setOrientation(0);
        viewPager2.setAdapter(g());
        PlayFragmentKt.a(viewPager2);
        new TabLayoutMediator(binding.playTabLayout, binding.playViewpager, new TabLayoutMediator.TabConfigurationStrategy() { // from class: s06
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                PlayFragment.o(this.a, tab, i);
            }
        }).attach();
        binding.playTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.xiaomi.hm.health.play.PlayFragment$initView$1$4
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(@Nullable TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(@Nullable TabLayout.Tab tab) {
                View customView2;
                if (tab == null || (customView2 = tab.getCustomView()) == null) {
                    return;
                }
                PlayFragment playFragment = this.a;
                FragmentPlayNewBinding fragmentPlayNewBinding = binding;
                playFragment.q(customView2, true);
                fragmentPlayNewBinding.playViewpager.setCurrentItem(tab.getPosition(), true);
                playFragment.p(playFragment.g().getTabType(tab.getPosition()));
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(@Nullable TabLayout.Tab tab) {
                View customView2;
                if (tab == null || (customView2 = tab.getCustomView()) == null) {
                    return;
                }
                this.a.q(customView2, false);
            }
        });
        TabLayout.Tab tabAt = binding.playTabLayout.getTabAt(0);
        if (tabAt != null && (customView = tabAt.getCustomView()) != null) {
            q(customView, true);
        }
        i();
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    @NotNull
    public FragmentPlayNewBinding initBinding(@NotNull View view) {
        return FragmentPlayNewBinding.bind(view);
    }
}
