package com.xiaomi.hm.health.bodyfat.slimming.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.bodyIndex.LoseWeightSportType;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.chart.util.ChartUtil;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityLoseWeightSelectSportBinding;
import com.xiaomi.hm.health.bodyfat.slimming.constants.SportTypeContants;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightPlan;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightWeightInfo;
import com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightSelectSportFragment;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSportDetail;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.view.CustomGridView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bU\u0010VJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0006\u0010\u001e\u001a\u00020\u0002R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010%R\u001d\u00100\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00104\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00106R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000205088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u00109R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u000205088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00109R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u000205088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R+\u0010F\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010B\u001a\u0004\b;\u0010C\"\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010L¨\u0006X"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/LoseWeightSelectSportFragment;", "Landroidx/fragment/app/Fragment;", "", "initData", "", "position", "type", "t", SOAP.XMLNS, DTransferConstants.SEARCH_KEY, "h", "g", hl.k, "", "value", "", z.j, "Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "algoSportType", "v", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "initView", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityLoseWeightSelectSportBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityLoseWeightSelectSportBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/slimming/view/GridViewAdapter;", "b", "Lcom/xiaomi/hm/health/bodyfat/slimming/view/GridViewAdapter;", "basicAdapter", "c", "ballAdapter", GoogleApiAvailabilityLight.a, "otherAdapter", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSelectSportViewModel;", "e", "Lkotlin/Lazy;", "l", "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSelectSportViewModel;", "sportViewModel", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "f", "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "activityViewModel", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "selectSport", "", "Ljava/util/List;", "basicSportList", "i", "ballSportList", "otherSportList", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "loseWeightPlan", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", "()I", "r", "(I)V", "loseWeightGoal", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "m", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "currentWeightInfo", GoogleApiAvailabilityLight.b, LogUtil.I, "selectType", "o", "selectPosition", "", b.r, "Z", "showModifyDialog", "modifyType", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightSelectSportFragment extends Fragment {
    public static final int BALL_SPORT_TYPE = 101;
    public static final int BASIC_SPORT_TYPE = 100;
    public static final float DEFAULT_TOTAL_PADDING_DP = 50.0f;
    public static final int MAX_COLUMN_NUM = 3;
    public static final int OTHER_SPORT_TYPE = 102;
    public static final float TEXT_WIDTH_SCALE = 1.1f;
    public static final /* synthetic */ KProperty<Object>[] r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivityLoseWeightSelectSportBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private GridViewAdapter basicAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private GridViewAdapter ballAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private GridViewAdapter otherAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private LoseWeightSportDetail selectSport;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private List<LoseWeightSportDetail> basicSportList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List<LoseWeightSportDetail> ballSportList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private List<LoseWeightSportDetail> otherSportList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private LoseWeightPlan loseWeightPlan;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty loseWeightGoal;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private LoseWeightWeightInfo currentWeightInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int selectType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int selectPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean showModifyDialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int modifyType;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoseWeightSportType.values().length];
            iArr[LoseWeightSportType.WALKING.ordinal()] = 1;
            iArr[LoseWeightSportType.RUNNING.ordinal()] = 2;
            iArr[LoseWeightSportType.SKIPPING.ordinal()] = 3;
            iArr[LoseWeightSportType.BIKE.ordinal()] = 4;
            iArr[LoseWeightSportType.AEROBICS.ordinal()] = 5;
            iArr[LoseWeightSportType.BADMINTON.ordinal()] = 6;
            iArr[LoseWeightSportType.GATEBALL.ordinal()] = 7;
            iArr[LoseWeightSportType.BOUNCY_BALL.ordinal()] = 8;
            iArr[LoseWeightSportType.TABLE_TENNIS.ordinal()] = 9;
            iArr[LoseWeightSportType.FOOTBALL.ordinal()] = 10;
            iArr[LoseWeightSportType.SQUASH.ordinal()] = 11;
            iArr[LoseWeightSportType.BASKETBALL.ordinal()] = 12;
            iArr[LoseWeightSportType.TENNIS.ordinal()] = 13;
            iArr[LoseWeightSportType.HIKING.ordinal()] = 14;
            iArr[LoseWeightSportType.SWIM.ordinal()] = 15;
            iArr[LoseWeightSportType.FENCING.ordinal()] = 16;
            iArr[LoseWeightSportType.TAE_KWON_DO.ordinal()] = 17;
            iArr[LoseWeightSportType.GOLF.ordinal()] = 18;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LoseWeightSelectSportFragment.class), "loseWeightGoal", "getLoseWeightGoal()I"));
        r = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoseWeightSelectSportFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoseWeightSelectSportViewModel>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightSelectSportFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final LoseWeightSelectSportViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(LoseWeightSelectSportViewModel.class), qualifier, objArr);
            }
        });
        this.activityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LoseWeightPlanEnterViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightSelectSportFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightSelectSportFragment$special$$inlined$activityViewModels$default$2
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
        this.loseWeightGoal = Delegates.INSTANCE.notNull();
        this.selectType = -1;
        this.selectPosition = -1;
        this.modifyType = -1;
    }

    private final LoseWeightPlanEnterViewModel f() {
        return (LoseWeightPlanEnterViewModel) this.activityViewModel.getValue();
    }

    private final int g() {
        int i = 0;
        String str = "";
        for (String str2 : CollectionsKt__CollectionsKt.mutableListOf(getString(R.string.lose_weight_sport_badminton), getString(R.string.lose_weight_sport_gate_ball), getString(R.string.lose_weight_sport_bouncy_ball), getString(R.string.lose_weight_sport_sport_table_tennis), getString(R.string.lose_weight_sport_sport_football), getString(R.string.lose_weight_sport_squash), getString(R.string.lose_weight_sport_basketball), getString(R.string.lose_weight_sport_sport_tennis))) {
            int length = str2.length();
            if (length > i) {
                str = str2;
                i = length;
            }
        }
        float screenWidth = (Utils.INSTANCE.getScreenWidth(requireContext()) - ChartUtil.dp2px(requireContext(), 50.0f)) / j(str);
        if (screenWidth > 3.0f) {
            return 3;
        }
        return (int) screenWidth;
    }

    private final int h() {
        int i = 0;
        String str = "";
        for (String str2 : CollectionsKt__CollectionsKt.mutableListOf(getString(R.string.lose_weight_sport_sport_walking), getString(R.string.lose_weight_sport_jogging), getString(R.string.lose_weight_sport_sport_skipping), getString(R.string.lose_weight_sport_ride), getString(R.string.lose_weight_sport_aerobics))) {
            int length = str2.length();
            if (length > i) {
                str = str2;
                i = length;
            }
        }
        float screenWidth = (Utils.INSTANCE.getScreenWidth(requireContext()) - ChartUtil.dp2px(requireContext(), 50.0f)) / j(str);
        if (screenWidth > 3.0f) {
            return 3;
        }
        return (int) screenWidth;
    }

    private final int i() {
        return ((Number) this.loseWeightGoal.getValue(this, r[2])).intValue();
    }

    private final void initData() {
        int currentModifyType = f().getCurrentModifyType();
        this.modifyType = currentModifyType;
        if (currentModifyType == 100) {
            this.showModifyDialog = true;
        }
        r(f().getCurrentLoseWeightGoal());
        this.loseWeightPlan = f().getCurrentLoseWeightPlan();
        this.currentWeightInfo = f().getCurrentLoseWeightInfo();
        if (f().getCurrentSportsList().size() >= 3) {
            this.basicSportList = f().getCurrentSportsList().get(0);
            this.ballSportList = f().getCurrentSportsList().get(1);
            this.otherSportList = f().getCurrentSportsList().get(2);
        } else {
            this.basicSportList = new ArrayList();
            this.ballSportList = new ArrayList();
            this.otherSportList = new ArrayList();
        }
        q();
    }

    private final float j(String value) {
        return ((TextView) View.inflate(requireContext(), R.layout.item_lose_weight_sport, null).findViewById(R.id.tv_sport_type)).getPaint().measureText(value) * 1.1f;
    }

    private final int k() {
        int i = 0;
        String str = "";
        for (String str2 : CollectionsKt__CollectionsKt.mutableListOf(getString(R.string.lose_weight_sport_climb), getString(R.string.lose_weight_sport_swimming), getString(R.string.lose_weight_sport_fencing), getString(R.string.lose_weight_sport_taekwondo), getString(R.string.lose_weight_sport_golf))) {
            int length = str2.length();
            if (length > i) {
                str = str2;
                i = length;
            }
        }
        float screenWidth = (Utils.INSTANCE.getScreenWidth(requireContext()) - ChartUtil.dp2px(requireContext(), 50.0f)) / j(str);
        if (screenWidth > 3.0f) {
            return 3;
        }
        return (int) screenWidth;
    }

    private final LoseWeightSelectSportViewModel l() {
        return (LoseWeightSelectSportViewModel) this.sportViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(LoseWeightSelectSportFragment loseWeightSelectSportFragment, AdapterView adapterView, View view, int i, long j) {
        loseWeightSelectSportFragment.t(i, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LoseWeightSelectSportFragment loseWeightSelectSportFragment, AdapterView adapterView, View view, int i, long j) {
        loseWeightSelectSportFragment.t(i, 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(LoseWeightSelectSportFragment loseWeightSelectSportFragment, AdapterView adapterView, View view, int i, long j) {
        loseWeightSelectSportFragment.t(i, 102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(LoseWeightSelectSportFragment loseWeightSelectSportFragment, View view) {
        if (!Utils.INSTANCE.isNetworkConnected(loseWeightSelectSportFragment.requireContext())) {
            IconToast.showError(loseWeightSelectSportFragment.requireContext(), loseWeightSelectSportFragment.getString(R.string.no_network_connection));
            return;
        }
        LoseWeightSportDetail loseWeightSportDetail = loseWeightSelectSportFragment.selectSport;
        if (loseWeightSportDetail == null) {
            return;
        }
        loseWeightSelectSportFragment.v(loseWeightSportDetail == null ? null : loseWeightSportDetail.getAlgoSportType());
        LoseWeightPlan loseWeightPlan = new LoseWeightPlan("1", loseWeightSelectSportFragment.i(), loseWeightSelectSportFragment.selectSport.getInterfaceSportName(), 1, loseWeightSelectSportFragment.selectSport.getSportTime());
        loseWeightSelectSportFragment.l().savePlan(loseWeightPlan);
        loseWeightSelectSportFragment.l().saveWeightInfo(loseWeightSelectSportFragment.currentWeightInfo);
        loseWeightSelectSportFragment.f().setCurrentLoseWeightPlan(loseWeightPlan);
        ((LoseWeightPlanEnterActivity) loseWeightSelectSportFragment.requireActivity()).showResultFragment();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void q() {
        LoseWeightPlan loseWeightPlan = this.loseWeightPlan;
        if (loseWeightPlan != null) {
            if ((loseWeightPlan == null ? null : loseWeightPlan.getExerciseName()) == null) {
                return;
            }
            LoseWeightPlan loseWeightPlan2 = this.loseWeightPlan;
            String exerciseName = loseWeightPlan2 != null ? loseWeightPlan2.getExerciseName() : null;
            switch (exerciseName.hashCode()) {
                case -1719045402:
                    if (exerciseName.equals(SportTypeContants.TIAO_SHENG)) {
                        this.selectType = 100;
                        this.selectPosition = 2;
                        break;
                    }
                    break;
                case -1609817420:
                    if (exerciseName.equals("jianzou")) {
                        this.selectType = 100;
                        this.selectPosition = 0;
                        break;
                    }
                    break;
                case -1587393147:
                    if (exerciseName.equals(SportTypeContants.TAI_QUAN_DAO)) {
                        this.selectType = 102;
                        this.selectPosition = 3;
                        break;
                    }
                    break;
                case -1481835519:
                    if (exerciseName.equals(SportTypeContants.PING_PANG_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 3;
                        break;
                    }
                    break;
                case -1160045717:
                    if (exerciseName.equals(SportTypeContants.JI_JIAN)) {
                        this.selectType = 102;
                        this.selectPosition = 2;
                        break;
                    }
                    break;
                case -1110048476:
                    if (exerciseName.equals(SportTypeContants.LAN_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 6;
                        break;
                    }
                    break;
                case -1081420540:
                    if (exerciseName.equals(SportTypeContants.MAN_PAO)) {
                        this.selectType = 100;
                        this.selectPosition = 1;
                        break;
                    }
                    break;
                case -1077725241:
                    if (exerciseName.equals(SportTypeContants.MEN_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 1;
                        break;
                    }
                    break;
                case -995391821:
                    if (exerciseName.equals(SportTypeContants.PA_SHAN)) {
                        this.selectType = 102;
                        this.selectPosition = 0;
                        break;
                    }
                    break;
                case -991601682:
                    if (exerciseName.equals(SportTypeContants.YOU_YONG)) {
                        this.selectType = 102;
                        this.selectPosition = 1;
                        break;
                    }
                    break;
                case -551733313:
                    if (exerciseName.equals(SportTypeContants.TAN_LI_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 2;
                        break;
                    }
                    break;
                case -421356431:
                    if (exerciseName.equals(SportTypeContants.YOU_YANG_CAO)) {
                        this.selectType = 100;
                        this.selectPosition = 4;
                        break;
                    }
                    break;
                case -193741167:
                    if (exerciseName.equals(SportTypeContants.GAO_ER_FU)) {
                        this.selectType = 102;
                        this.selectPosition = 4;
                        break;
                    }
                    break;
                case 93745078:
                    if (exerciseName.equals(SportTypeContants.BI_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 5;
                        break;
                    }
                    break;
                case 103979070:
                    if (exerciseName.equals(SportTypeContants.YU_MAO_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 0;
                        break;
                    }
                    break;
                case 107584392:
                    if (exerciseName.equals(SportTypeContants.QI_CHE)) {
                        this.selectType = 100;
                        this.selectPosition = 3;
                        break;
                    }
                    break;
                case 116267074:
                    if (exerciseName.equals(SportTypeContants.ZU_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 4;
                        break;
                    }
                    break;
                case 1120551034:
                    if (exerciseName.equals(SportTypeContants.WANG_QIU)) {
                        this.selectType = 101;
                        this.selectPosition = 7;
                        break;
                    }
                    break;
            }
        }
    }

    private final void r(int i) {
        this.loseWeightGoal.setValue(this, r[2], Integer.valueOf(i));
    }

    private final void s(int position, int type) {
        switch (type) {
            case 100:
                GridViewAdapter gridViewAdapter = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter);
                gridViewAdapter.setSelectPosition(-1);
                GridViewAdapter gridViewAdapter2 = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter2);
                gridViewAdapter2.notifyDataSetInvalidated();
                GridViewAdapter gridViewAdapter3 = this.otherAdapter;
                Objects.requireNonNull(gridViewAdapter3);
                gridViewAdapter3.setSelectPosition(-1);
                GridViewAdapter gridViewAdapter4 = this.otherAdapter;
                Objects.requireNonNull(gridViewAdapter4);
                gridViewAdapter4.notifyDataSetInvalidated();
                GridViewAdapter gridViewAdapter5 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter5);
                gridViewAdapter5.setSelectPosition(position);
                GridViewAdapter gridViewAdapter6 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter6);
                gridViewAdapter6.notifyDataSetInvalidated();
                List<LoseWeightSportDetail> list = this.basicSportList;
                Objects.requireNonNull(list);
                this.selectSport = list.get(position);
                break;
            case 101:
                GridViewAdapter gridViewAdapter7 = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter7);
                gridViewAdapter7.setSelectPosition(position);
                GridViewAdapter gridViewAdapter8 = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter8);
                gridViewAdapter8.notifyDataSetInvalidated();
                GridViewAdapter gridViewAdapter9 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter9);
                gridViewAdapter9.setSelectPosition(-1);
                GridViewAdapter gridViewAdapter10 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter10);
                gridViewAdapter10.notifyDataSetInvalidated();
                GridViewAdapter gridViewAdapter11 = this.otherAdapter;
                Objects.requireNonNull(gridViewAdapter11);
                gridViewAdapter11.setSelectPosition(-1);
                GridViewAdapter gridViewAdapter12 = this.otherAdapter;
                Objects.requireNonNull(gridViewAdapter12);
                gridViewAdapter12.notifyDataSetInvalidated();
                List<LoseWeightSportDetail> list2 = this.ballSportList;
                Objects.requireNonNull(list2);
                this.selectSport = list2.get(position);
                break;
            case 102:
                GridViewAdapter gridViewAdapter13 = this.otherAdapter;
                Objects.requireNonNull(gridViewAdapter13);
                gridViewAdapter13.setSelectPosition(position);
                GridViewAdapter gridViewAdapter14 = this.otherAdapter;
                Objects.requireNonNull(gridViewAdapter14);
                gridViewAdapter14.notifyDataSetInvalidated();
                GridViewAdapter gridViewAdapter15 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter15);
                gridViewAdapter15.setSelectPosition(-1);
                GridViewAdapter gridViewAdapter16 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter16);
                gridViewAdapter16.notifyDataSetInvalidated();
                GridViewAdapter gridViewAdapter17 = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter17);
                gridViewAdapter17.setSelectPosition(-1);
                GridViewAdapter gridViewAdapter18 = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter18);
                gridViewAdapter18.notifyDataSetInvalidated();
                List<LoseWeightSportDetail> list3 = this.otherSportList;
                Objects.requireNonNull(list3);
                this.selectSport = list3.get(position);
                break;
        }
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding);
        activityLoseWeightSelectSportBinding.tvLoseWeightSportConfirm.setEnabled(true);
    }

    private final void t(final int position, final int type) {
        if (!this.showModifyDialog || ((this.selectType == type && this.selectPosition == position) || this.modifyType != 100)) {
            s(position, type);
        } else {
            new AlertDialogFragment.Builder(requireContext()).setMessage(getString(R.string.lose_weight_modify_sport_type_text)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.lose_weight_confirm, new DialogInterface.OnClickListener() { // from class: mt4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LoseWeightSelectSportFragment.u(this.a, position, type, dialogInterface, i);
                }
            }).show(requireActivity().getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(LoseWeightSelectSportFragment loseWeightSelectSportFragment, int i, int i2, DialogInterface dialogInterface, int i3) {
        loseWeightSelectSportFragment.showModifyDialog = false;
        loseWeightSelectSportFragment.modifyType = -1;
        loseWeightSelectSportFragment.s(i, i2);
    }

    private final void v(LoseWeightSportType algoSportType) {
        String str;
        if (algoSportType == null) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[algoSportType.ordinal()]) {
            case 1:
                str = StatEvent.SLIM_SPORT_WALK_C;
                break;
            case 2:
                str = StatEvent.SLIM_SPORT_RUN_C;
                break;
            case 3:
                str = StatEvent.SLIM_SPORT_ROPES_C;
                break;
            case 4:
                str = StatEvent.SLIM_SPORT_BICYCLE_C;
                break;
            case 5:
                str = StatEvent.SLIM_SPORT_AEROBICS_C;
                break;
            case 6:
                str = StatEvent.SLIM_SPORT_BADMINTON_C;
                break;
            case 7:
                str = StatEvent.SLIM_SPORT_GOALBALL_C;
                break;
            case 8:
                str = StatEvent.SLIM_SPORT_ELASTICBALL_C;
                break;
            case 9:
                str = StatEvent.SLIM_SPORT_TABLETENNIS_C;
                break;
            case 10:
                str = StatEvent.SLIM_SPORT_FOOTBALL_C;
                break;
            case 11:
                str = StatEvent.SLIM_SPORT_SQUASH_C;
                break;
            case 12:
                str = StatEvent.SLIM_SPORT_BASKETBALL_C;
                break;
            case 13:
                str = StatEvent.SLIM_SPORT_TENNIS_C;
                break;
            case 14:
                str = StatEvent.SLIM_SPORT_CLIMBING_C;
                break;
            case 15:
                str = StatEvent.SLIM_SPORT_SWIM_C;
                break;
            case 16:
                str = StatEvent.SLIM_SPORT_FENCING_C;
                break;
            case 17:
                str = StatEvent.SLIM_SPORT_TEAKWONDO_C;
                break;
            case 18:
                str = StatEvent.SLIM_SPORT_GOLF_C;
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            Analytics.recordEvent(new CountEventBuilder(str));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initView() {
        Pair<String, String> unitPair = MyLoseWeightPlanFragment.INSTANCE.getUnitPair(requireContext(), i());
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding);
        activityLoseWeightSelectSportBinding.tvLoseWeightGoal.setText(getString(R.string.lose_weight_goal_detail_without_unit, unitPair.getSecond()));
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding2 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding2);
        activityLoseWeightSelectSportBinding2.tvLoseWeightGoalUnit.setText(unitPair.getFirst());
        Context contextRequireContext = requireContext();
        List<LoseWeightSportDetail> list = this.basicSportList;
        Objects.requireNonNull(list);
        this.basicAdapter = new GridViewAdapter(contextRequireContext, list);
        Context contextRequireContext2 = requireContext();
        List<LoseWeightSportDetail> list2 = this.ballSportList;
        Objects.requireNonNull(list2);
        this.ballAdapter = new GridViewAdapter(contextRequireContext2, list2);
        Context contextRequireContext3 = requireContext();
        List<LoseWeightSportDetail> list3 = this.otherSportList;
        Objects.requireNonNull(list3);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(contextRequireContext3, list3);
        this.otherAdapter = gridViewAdapter;
        switch (this.selectType) {
            case 100:
                GridViewAdapter gridViewAdapter2 = this.basicAdapter;
                Objects.requireNonNull(gridViewAdapter2);
                gridViewAdapter2.setSelectPosition(this.selectPosition);
                List<LoseWeightSportDetail> list4 = this.basicSportList;
                Objects.requireNonNull(list4);
                this.selectSport = list4.get(this.selectPosition);
                break;
            case 101:
                GridViewAdapter gridViewAdapter3 = this.ballAdapter;
                Objects.requireNonNull(gridViewAdapter3);
                gridViewAdapter3.setSelectPosition(this.selectPosition);
                List<LoseWeightSportDetail> list5 = this.ballSportList;
                Objects.requireNonNull(list5);
                this.selectSport = list5.get(this.selectPosition);
                break;
            case 102:
                Objects.requireNonNull(gridViewAdapter);
                gridViewAdapter.setSelectPosition(this.selectPosition);
                List<LoseWeightSportDetail> list6 = this.otherSportList;
                Objects.requireNonNull(list6);
                this.selectSport = list6.get(this.selectPosition);
                break;
        }
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding3 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding3);
        activityLoseWeightSelectSportBinding3.gridviewBasicSport.setNumColumns(h());
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding4 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding4);
        CustomGridView customGridView = activityLoseWeightSelectSportBinding4.gridviewBasicSport;
        GridViewAdapter gridViewAdapter4 = this.basicAdapter;
        Objects.requireNonNull(gridViewAdapter4);
        customGridView.setAdapter((ListAdapter) gridViewAdapter4);
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding5 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding5);
        activityLoseWeightSelectSportBinding5.gridviewBasicSport.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: pt4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                LoseWeightSelectSportFragment.m(this.a, adapterView, view, i, j);
            }
        });
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding6 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding6);
        activityLoseWeightSelectSportBinding6.gridviewBallSport.setNumColumns(g());
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding7 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding7);
        CustomGridView customGridView2 = activityLoseWeightSelectSportBinding7.gridviewBallSport;
        GridViewAdapter gridViewAdapter5 = this.ballAdapter;
        Objects.requireNonNull(gridViewAdapter5);
        customGridView2.setAdapter((ListAdapter) gridViewAdapter5);
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding8 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding8);
        activityLoseWeightSelectSportBinding8.gridviewBallSport.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ot4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                LoseWeightSelectSportFragment.n(this.a, adapterView, view, i, j);
            }
        });
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding9 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding9);
        activityLoseWeightSelectSportBinding9.gridviewOtherSport.setNumColumns(k());
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding10 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding10);
        CustomGridView customGridView3 = activityLoseWeightSelectSportBinding10.gridviewOtherSport;
        GridViewAdapter gridViewAdapter6 = this.otherAdapter;
        Objects.requireNonNull(gridViewAdapter6);
        customGridView3.setAdapter((ListAdapter) gridViewAdapter6);
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding11 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding11);
        activityLoseWeightSelectSportBinding11.gridviewOtherSport.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: qt4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                LoseWeightSelectSportFragment.o(this.a, adapterView, view, i, j);
            }
        });
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding12 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding12);
        activityLoseWeightSelectSportBinding12.tvLoseWeightSportConfirm.setEnabled((this.selectType == -1 || this.selectPosition == -1) ? false : true);
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBinding13 = this.binding;
        Objects.requireNonNull(activityLoseWeightSelectSportBinding13);
        activityLoseWeightSelectSportBinding13.tvLoseWeightSportConfirm.setOnClickListener(new View.OnClickListener() { // from class: nt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoseWeightSelectSportFragment.p(this.a, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_SPORTSELECT_PAGE_V));
        ActivityLoseWeightSelectSportBinding activityLoseWeightSelectSportBindingInflate = ActivityLoseWeightSelectSportBinding.inflate(inflater);
        this.binding = activityLoseWeightSelectSportBindingInflate;
        Objects.requireNonNull(activityLoseWeightSelectSportBindingInflate);
        return activityLoseWeightSelectSportBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        initView();
    }
}
