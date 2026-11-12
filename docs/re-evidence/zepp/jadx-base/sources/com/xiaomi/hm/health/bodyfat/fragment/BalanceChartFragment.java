package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.FamilyListActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity;
import com.xiaomi.hm.health.bodyfat.fragment.BalanceChartFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTransToChartUtil;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;
import com.xiaomi.hm.health.bodyfat.viewmodel.BalanceDetailViewModel;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import defpackage.jc4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010#\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001e\u0010'\u001a\n %*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\r068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010<\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b7\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/BalanceChartFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "o", "l", "m", "Lcom/huami/chart/provider/DrawConfig;", "e", "Lcom/huami/chart/provider/RenderConfig;", "f", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfos", "g", "", "r", "", z.j, "h", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "a", LogUtil.I, "ALPHA_70", "b", "ALPHA_50", "c", "ALPHA_20", "J", "LAST_USER_ID", "EXTRA_DATA", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/huami/chart/chart/ChartProvider;", "Lkotlin/Lazy;", "i", "()Lcom/huami/chart/chart/ChartProvider;", "mChartProvider", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "mContainer", "Lcom/xiaomi/hm/health/bodyfat/view/WeightUserQuickPicker;", "Lcom/xiaomi/hm/health/bodyfat/view/WeightUserQuickPicker;", "mWeightUserPicker", "Lcom/huami/chart/data/ChartDataList;", "Lcom/huami/chart/data/ChartDataList;", "mData", "", hl.k, "Ljava/util/List;", "userList", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BalanceChartFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int ALPHA_70;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int ALPHA_50;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int ALPHA_20;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long LAST_USER_ID;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int EXTRA_DATA;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mChartProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ViewGroup mContainer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private WeightUserQuickPicker mWeightUserPicker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ChartDataList mData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final List<UserInfos> userList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<WeightInfos> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends WeightInfos> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List<WeightInfos> list = this.a;
            return Intrinsics.stringPlus("Observer weightInfos size=", list == null ? null : Integer.valueOf(list.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/chart/ChartProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ChartProvider> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartProvider getA() {
            return new ChartProvider(BalanceChartFragment.this.requireContext(), true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BalanceDetailViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BalanceDetailViewModel getA() {
            return (BalanceDetailViewModel) ViewModelProviders.of(BalanceChartFragment.this.requireActivity()).get(BalanceDetailViewModel.class);
        }
    }

    public BalanceChartFragment() {
        super(R.layout.fragment_balance_chart);
        this.ALPHA_70 = DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING;
        this.ALPHA_50 = 127;
        this.ALPHA_20 = 51;
        this.LAST_USER_ID = -1000L;
        this.EXTRA_DATA = 6;
        this.TAG = BalanceChartFragment.class.getSimpleName();
        this.mChartProvider = LazyKt__LazyJVMKt.lazy(new b());
        this.userList = new ArrayList();
        this.viewModel = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x002b A[ORIG_RETURN, RETURN] */
    private final boolean d() {
        long j = j();
        for (Object obj : this.userList) {
            if (Intrinsics.areEqual(((UserInfos) obj).getUserId(), String.valueOf(j))) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig e() {
        DrawConfig.Builder dataWidth = new DrawConfig.Builder(requireContext()).setDataMarginTop(ChartUtil.dp2px(requireContext(), 20.0f)).setDataWidth(ChartUtil.dp2px(requireContext(), 58.8f));
        ViewGroup viewGroup = this.mContainer;
        Objects.requireNonNull(viewGroup);
        DrawConfig.Builder canvasHeight = dataWidth.setCanvasHeight(viewGroup.getMeasuredHeight());
        ViewGroup viewGroup2 = this.mContainer;
        Objects.requireNonNull(viewGroup2);
        return canvasHeight.setCanvasWidth(viewGroup2.getMeasuredWidth()).setDataMarginBottom(ChartUtil.dp2px(requireContext(), 10.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig f() {
        Context contextRequireContext = requireContext();
        int i = R.color.balance_curve_shadow_origin_color;
        int color = ContextCompat.getColor(contextRequireContext, i);
        return new RenderConfig.Builder().setLineJoinStyle(new LineJoinStyle.Builder(requireContext()).setLineJointColor(ContextCompat.getColor(requireContext(), i)).setLineJointStyle(8).setLineJointSize(ChartUtil.dp2px(requireContext(), 1.5f)).create()).setLineStyle(new LineStyle.Builder(requireContext()).setLineStyle(4).setLineWidth(ChartUtil.dp2px(requireContext(), 1.6f)).setLineColor(ContextCompat.getColor(requireContext(), i)).setShadowColors(new int[]{color, ColorUtils.setAlphaComponent(color, this.ALPHA_70), ColorUtils.setAlphaComponent(color, this.ALPHA_50), ColorUtils.setAlphaComponent(color, this.ALPHA_20), 0}).create()).create();
    }

    private final List<UserInfos> g(List<? extends UserInfos> userInfos) {
        this.userList.clear();
        this.userList.addAll(userInfos);
        int i = this.EXTRA_DATA;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                UserInfos userInfos2 = new UserInfos();
                userInfos2.setName(getString(R.string.family_manager));
                userInfos2.setUserId(String.valueOf(this.LAST_USER_ID - ((long) i2)));
                if (i2 == 0) {
                    List<UserInfos> list = this.userList;
                    list.add(list.size(), userInfos2);
                } else if (i2 < 4) {
                    this.userList.add(0, userInfos2);
                } else {
                    this.userList.add(userInfos2);
                }
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return this.userList;
    }

    private final long h() {
        return Utils.INSTANCE.toLongValue(BFCallback.getHMPersonInfo().getUserid(), 0L);
    }

    private final ChartProvider i() {
        return (ChartProvider) this.mChartProvider.getValue();
    }

    private final long j() {
        return k().getUid().getValue() == null ? h() : k().getUid().getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BalanceDetailViewModel k() {
        return (BalanceDetailViewModel) this.viewModel.getValue();
    }

    private final void l() {
        List<UserInfos> value = k().getUserInfos().getValue();
        if ((value == null ? 0 : value.size()) > 1) {
            startActivity(new Intent(getActivity(), (Class<?>) FamilyListActivity.class));
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) WeightMemberDetailActivity.class);
        intent.putExtra(BFConstant.KET_ADD_NEW, true);
        startActivity(intent);
    }

    private final void m() {
        k().getWeightInfos().observe(getViewLifecycleOwner(), new Observer() { // from class: nm
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceChartFragment.n(this.a, (List) obj);
            }
        });
        i().getChart().setIScrollListener(new IScrollListener() { // from class: com.xiaomi.hm.health.bodyfat.fragment.BalanceChartFragment$initChart$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Index a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Index index) {
                    super(0);
                    this.a = index;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("onScrollStopCurrentIndex ", this.a);
                }
            }

            @Override // com.huami.chart.listener.IScrollListener
            public /* synthetic */ void offset(float f) {
                jc4.a(this, f);
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onScrollCurrentIndex(@NotNull Index baseIndex) {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onStartIndex(@NotNull Index baseIndex) {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onStopIndex(@NotNull Index index) {
                HMLog.info(this.a.TAG, new a(index));
                if (index.getDataIndex() == -1) {
                    return;
                }
                MutableLiveData<WeightInfos> selectData = this.a.k().getSelectData();
                List<WeightInfos> value = this.a.k().getWeightInfos().getValue();
                selectData.postValue(value == null ? null : (WeightInfos) CollectionsKt.getOrNull(value, index.getDataIndex()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final BalanceChartFragment balanceChartFragment, final List list) {
        HMLog.info(balanceChartFragment.TAG, new a(list));
        balanceChartFragment.mData = BFTransToChartUtil.getInstance().createOfmtWeightData((List<WeightInfos>) list);
        boolean z = list != null && (list.isEmpty() ^ true);
        if (z) {
            WeightUserQuickPicker weightUserQuickPicker = balanceChartFragment.mWeightUserPicker;
            Objects.requireNonNull(weightUserQuickPicker);
            weightUserQuickPicker.setSelectionUser(balanceChartFragment.j());
        }
        MutableLiveData<WeightInfos> selectData = balanceChartFragment.k().getSelectData();
        WeightInfos weightInfos = null;
        if (z && list != null) {
            weightInfos = (WeightInfos) CollectionsKt.last(list);
        }
        selectData.postValue(weightInfos);
        balanceChartFragment.k().getDeleteEnable().setValue(Boolean.valueOf(z));
        balanceChartFragment.i().createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.bodyfat.fragment.BalanceChartFragment$initChart$1$2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getD() {
                ViewGroup viewGroup = this.a.mContainer;
                Objects.requireNonNull(viewGroup);
                return viewGroup;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getG() {
                return this.a.mData;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                List<WeightInfos> list2 = list;
                int size = list2 == null ? 0 : list2.size();
                int i = size != 0 ? size - 1 : 0;
                return new Index(i, new BaseIndex(i));
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return this.a.e();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return this.a.f();
            }
        }, true, true, true);
    }

    private final void o(View view) {
        WeightUserQuickPicker weightUserQuickPicker = (WeightUserQuickPicker) view.findViewById(R.id.user_picker);
        this.mWeightUserPicker = weightUserQuickPicker;
        Objects.requireNonNull(weightUserQuickPicker);
        weightUserQuickPicker.setOnUserItemClickListener(new WeightUserQuickPicker.OnUserItemClickListener() { // from class: pm
            @Override // com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker.OnUserItemClickListener
            public final void onClick(View view2, UserInfos userInfos, int i) {
                BalanceChartFragment.p(this.a, view2, userInfos, i);
            }
        });
        k().getUserInfos().observe(getViewLifecycleOwner(), new Observer() { // from class: om
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceChartFragment.q(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BalanceChartFragment balanceChartFragment, View view, UserInfos userInfos, int i) {
        if (userInfos != null) {
            if (Long.parseLong(userInfos.getUserId()) == balanceChartFragment.LAST_USER_ID) {
                balanceChartFragment.l();
            } else if (i < balanceChartFragment.userList.size()) {
                balanceChartFragment.k().getUid().setValue(Long.valueOf(Utils.INSTANCE.toLongValue(balanceChartFragment.userList.get(i).getUserId(), balanceChartFragment.h())));
                WeightUserQuickPicker weightUserQuickPicker = balanceChartFragment.mWeightUserPicker;
                Objects.requireNonNull(weightUserQuickPicker);
                weightUserQuickPicker.setSelection(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BalanceChartFragment balanceChartFragment, List list) {
        if (balanceChartFragment.r(list)) {
            WeightUserQuickPicker weightUserQuickPicker = balanceChartFragment.mWeightUserPicker;
            Objects.requireNonNull(weightUserQuickPicker);
            weightUserQuickPicker.bindUsers(balanceChartFragment.g(list));
            if (!balanceChartFragment.d()) {
                WeightUserQuickPicker weightUserQuickPicker2 = balanceChartFragment.mWeightUserPicker;
                Objects.requireNonNull(weightUserQuickPicker2);
                weightUserQuickPicker2.setSelectionUser(balanceChartFragment.h());
            } else {
                WeightUserQuickPicker weightUserQuickPicker3 = balanceChartFragment.mWeightUserPicker;
                Objects.requireNonNull(weightUserQuickPicker3);
                Objects.requireNonNull(weightUserQuickPicker3);
                weightUserQuickPicker3.setSelection(weightUserQuickPicker3.getSelection(balanceChartFragment.j()));
            }
        }
    }

    private final boolean r(List<? extends UserInfos> userInfos) {
        Object next;
        for (UserInfos userInfos2 : userInfos) {
            Iterator<T> it2 = this.userList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(userInfos2.getUserId(), ((UserInfos) next).getUserId()));
            UserInfos userInfos3 = (UserInfos) next;
            if (userInfos3 == null || ExtentionUtilsKt.isChange(userInfos2, userInfos3)) {
                return true;
            }
        }
        return false;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mContainer = (ViewGroup) view.findViewById(R.id.chart_container);
        o(view);
        m();
    }
}
