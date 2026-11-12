package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.p008lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.entity.ResultInfo;
import com.huami.wallet.ui.fragment.TradeRecordFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.utils.NoticeActionType;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import com.huami.wallet.ui.utils.ViewUtils;
import com.huami.wallet.ui.view.MyTextView;
import com.huami.wallet.ui.view.NoticeBarView;
import com.huami.wallet.ui.viewmodel.TradeRecordViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/huami/wallet/ui/fragment/TradeRecordFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", GoogleApiAvailabilityLight.b, "initViews", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/huami/wallet/ui/navigation/NavigationController;", "b", "Lkotlin/Lazy;", "g", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/repository/NoticeRepo;", "c", "h", "()Lcom/huami/wallet/ui/repository/NoticeRepo;", "mNoticeRepo", "Lcom/huami/wallet/ui/fragment/TradeRecordFragment$ViewHolder;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/fragment/TradeRecordFragment$ViewHolder;", "mViewHolder", "Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "e", "i", "()Lcom/huami/wallet/ui/viewmodel/TradeRecordViewModel;", "mViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "f", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "<init>", "()V", "Companion", "TradeAdapter", "ViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class TradeRecordFragment extends BaseFragment {

    @NotNull
    public static final String ARG_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String ARG_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String ARG_BUS_CARD_NUMBER = "ARG_BUS_CARD_NUMBER";

    @NotNull
    public static final String ARG_XIAO_MI_CARDNAME = "ARG_XIAO_MI_CARDNAME";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNoticeRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ViewHolder mViewHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/ui/fragment/TradeRecordFragment$TradeAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class TradeAdapter extends FragmentPagerAdapter {
        public TradeAdapter(@NotNull FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPageCount() {
            return 2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            return position == 0 ? new BusCardConsumeListFragment() : new BusCardRechargeListFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/huami/wallet/ui/fragment/TradeRecordFragment$ViewHolder;", "", "Landroidx/viewpager/widget/ViewPager;", "a", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "viewPager", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "b", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "getMagicIndicator", "()Lnet/lucode/hackware/magicindicator/MagicIndicator;", "magicIndicator", "Lcom/huami/wallet/ui/view/NoticeBarView;", "c", "Lcom/huami/wallet/ui/view/NoticeBarView;", "getNoticeBarView", "()Lcom/huami/wallet/ui/view/NoticeBarView;", "noticeBarView", "Lcom/huami/wallet/ui/view/MyTextView;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/view/MyTextView;", "getXiaomiNoticeView", "()Lcom/huami/wallet/ui/view/MyTextView;", "xiaomiNoticeView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ViewPager viewPager;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final MagicIndicator magicIndicator;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final NoticeBarView noticeBarView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final MyTextView xiaomiNoticeView;

        public ViewHolder(@NotNull View view) {
            this.viewPager = (ViewPager) view.findViewById(R.id.view_pager);
            this.magicIndicator = (MagicIndicator) view.findViewById(R.id.magic_indicator);
            this.noticeBarView = (NoticeBarView) view.findViewById(R.id.wl_noticebarview);
            this.xiaomiNoticeView = (MyTextView) view.findViewById(R.id.wl_tv_xiaomi_notice);
        }

        @NotNull
        public final MagicIndicator getMagicIndicator() {
            return this.magicIndicator;
        }

        @NotNull
        public final NoticeBarView getNoticeBarView() {
            return this.noticeBarView;
        }

        @NotNull
        public final ViewPager getViewPager() {
            return this.viewPager;
        }

        @NotNull
        public final MyTextView getXiaomiNoticeView() {
            return this.xiaomiNoticeView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "url", "msg", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<String, String, Object> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable String str, @Nullable String str2) {
            if (TextUtils.isEmpty(str)) {
                NoticeViewUtils.showDialog(TradeRecordFragment.this.requireContext(), TradeRecordFragment.this.getChildFragmentManager(), str2);
                return null;
            }
            TradeRecordFragment.this.g().navigateToWeb(str, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huami.wallet.ui.fragment.TradeRecordFragment$initViews$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/huami/wallet/ui/fragment/TradeRecordFragment$initViews$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "", "getCount", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "index", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "getIndicator", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends CommonNavigatorAdapter {
        public final /* synthetic */ int[] b;
        public final /* synthetic */ TradeRecordFragment c;

        public AnonymousClass1(int[] iArr, TradeRecordFragment tradeRecordFragment) {
            this.b = iArr;
            this.c = tradeRecordFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TradeRecordFragment tradeRecordFragment, int i, View view) {
            tradeRecordFragment.mViewHolder.getViewPager().setCurrentItem(i);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public int getCount() {
            return this.b.length;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        @NotNull
        public IPagerIndicator getIndicator(@NotNull Context context) {
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setLineHeight(ViewUtils.dpToPx(context, 2.0f));
            linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(context, R.color.s15)));
            linePagerIndicator.setMode(1);
            linePagerIndicator.setXOffset(-ViewUtils.dpToPx(context, 8.0f));
            return linePagerIndicator;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        @NotNull
        public IPagerTitleView getTitleView(@NotNull Context context, final int index) {
            ColorTransitionPagerTitleView colorTransitionPagerTitleView = new ColorTransitionPagerTitleView(context);
            TextViewCompat.setTextAppearance(colorTransitionPagerTitleView, R.style.TextAppearance_MiFit_Caption_Inverse);
            colorTransitionPagerTitleView.setNormalColor(ContextCompat.getColor(context, R.color.s1));
            colorTransitionPagerTitleView.setSelectedColor(ContextCompat.getColor(context, R.color.s15));
            colorTransitionPagerTitleView.setText(this.b[index]);
            final TradeRecordFragment tradeRecordFragment = this.c;
            colorTransitionPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: ls7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TradeRecordFragment.AnonymousClass1.b(tradeRecordFragment, index, view);
                }
            });
            return colorTransitionPagerTitleView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TradeRecordFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.TradeRecordFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mNoticeRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NoticeRepo>() { // from class: com.huami.wallet.ui.fragment.TradeRecordFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.repository.NoticeRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NoticeRepo getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NoticeRepo.class), objArr2, objArr3);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.TradeRecordFragment$special$$inlined$sharedViewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<TradeRecordViewModel>() { // from class: com.huami.wallet.ui.fragment.TradeRecordFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.TradeRecordViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TradeRecordViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(TradeRecordViewModel.class), function0, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController g() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final NoticeRepo h() {
        return (NoticeRepo) this.mNoticeRepo.getValue();
    }

    private final TradeRecordViewModel i() {
        return (TradeRecordViewModel) this.mViewModel.getValue();
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        i().consumeRecordsLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载消费记录列表"));
        i().consumeRecordsLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: hs7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TradeRecordFragment.j(this.a, (Resource) obj);
            }
        });
        i().rechargeRecordsLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载充值记录列表"));
        i().rechargeRecordsLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: js7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TradeRecordFragment.k(this.a, (Resource) obj);
            }
        });
        i().rechargeRecordDetailLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: ks7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TradeRecordFragment.l(this.a, (ResultInfo) obj);
            }
        });
        i().xiaomiNoticesLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("checkXiaoNotice"));
        i().xiaomiNoticesLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: is7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TradeRecordFragment.m(this.a, (Resource) obj);
            }
        });
    }

    private final void initViews() {
        this.mLoadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        int[] iArr = {R.string.wl_consume, R.string.wl_recharge};
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setAdapter(new AnonymousClass1(iArr, this));
        commonNavigator.setAdjustMode(true);
        this.mViewHolder.getMagicIndicator().setNavigator(commonNavigator);
        ViewPagerHelper.bind(this.mViewHolder.getMagicIndicator(), this.mViewHolder.getViewPager());
        this.mViewHolder.getViewPager().setAdapter(new TradeAdapter(getChildFragmentManager()));
        this.mViewHolder.getNoticeBarView().setTypeList(CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.TOPUP)).setNoticeRepo(h()).setAppCode(i().getCardId()).setOnReadMore(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TradeRecordFragment tradeRecordFragment, Resource resource) {
        if (resource != null) {
            tradeRecordFragment.mLoadingDialogHelper.showOrError(resource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TradeRecordFragment tradeRecordFragment, Resource resource) {
        if (resource != null) {
            tradeRecordFragment.mLoadingDialogHelper.showOrError(resource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TradeRecordFragment tradeRecordFragment, ResultInfo resultInfo) {
        if (resultInfo != null) {
            tradeRecordFragment.g().navigateToBusCardOperationResult(tradeRecordFragment.getContext(), resultInfo.busCardId, resultInfo.orderId, resultInfo.busCardName, true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TradeRecordFragment tradeRecordFragment, Resource resource) {
        ViewHolder viewHolder;
        if (resource == null || resource.status != Status.SUCCESS || (viewHolder = tradeRecordFragment.mViewHolder) == null) {
            return;
        }
        KTExtFunKt.shouldShowXiaomiNoticeCrossBar(viewHolder.getXiaomiNoticeView(), (List) resource.data, tradeRecordFragment.i().xiaomiCardName, "RECHARGE");
    }

    private final void n() {
        if (getArguments() == null) {
            return;
        }
        i().setCardInfo(requireArguments().getString("ARG_BUS_CARD_ID"), requireArguments().getString("ARG_BUS_CARD_NAME"), requireArguments().getString("ARG_XIAO_MI_CARDNAME"), requireArguments().getString("ARG_BUS_CARD_NUMBER"));
        i().checkXiaoNotice();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_trade_record, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        h().dispose();
        this.mViewHolder.getNoticeBarView().destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new ViewHolder(view);
        initViews();
        initViewModel();
        n();
    }
}
