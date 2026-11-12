package com.xiaomi.hm.health.running;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ad.AdRepository;
import com.huami.ad.db.AdProvider;
import com.huami.ad.utils.EventAdDownloadFinished;
import com.huami.ad.web.AdAPI;
import com.huami.devicex.injection.other.TreadmillApiHandler;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.training.dto.PromotePlace;
import com.huami.training.ui.promotion.PromotionalCourseFragment;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.treadmill.ui.tdmillhome.TdmillHmViewModel;
import com.loc.z;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.bolt.JsTreadmillMaintainEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.fragment.SportView;
import com.xiaomi.hm.health.running.SportTabFragment;
import com.xiaomi.hm.health.running.event.EventSportTypeSwitched;
import com.xiaomi.hm.health.running.treadmill.BoltTrackRecordImp;
import com.xiaomi.hm.health.running.treadmill.TreadmillImp;
import com.xiaomi.hm.health.utils.FragmentTrackHelper;
import com.xiaomi.hm.health.utils.FragmentTrackHelperKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import defpackage.u6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u0007¢\u0006\u0004\b[\u0010\\J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020$J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020)H\u0016R\u0016\u00100\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u000209078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0016\u0010G\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010H\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u001d\u0010S\u001a\u00020P8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bJ\u0010RR\u0016\u0010V\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006^"}, d2 = {"Lcom/xiaomi/hm/health/running/SportTabFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/fragment/SportView;", "", "h", "", z.j, "f", "", "sportType", "g", DTransferConstants.SEARCH_KEY, "o", "adsCategory", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "showSportType", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "onResume", "onPause", "onDestroyView", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "e", "onEventMainThread", "Lcom/huami/ad/utils/EventAdDownloadFinished;", "Lcom/xiaomi/hm/health/running/event/EventSportTypeSwitched;", "event", "Lcom/xiaomi/hm/health/device/bolt/JsTreadmillMaintainEvent;", "jsTreadmillMaintainEvent", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "a", "Z", TdmillHmFragment.ARG_IS_OVERSEA, "b", LogUtil.I, "getSportType", "()I", "setSportType", "(I)V", "", "Lcom/huami/training/dto/PromotePlace;", "Lcom/huami/training/ui/promotion/PromotionalCourseFragment;", "c", "Ljava/util/Map;", "promotionalCourseFragments", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmFragment;", GoogleApiAvailabilityLight.a, "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmFragment;", "treadmillFragment", "Landroidx/lifecycle/Observer;", "Landroidx/lifecycle/Observer;", "bindingObserver", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "boltHomeViewModel", "isFirstVisible", "showDataAfterViewInited", "Lrx/Subscription;", "i", "Lrx/Subscription;", "adSubscription", "Lcom/xiaomi/hm/health/running/SportMapFragment;", "Lcom/xiaomi/hm/health/running/SportMapFragment;", "mapCard", "Lcom/xiaomi/hm/health/running/SportTabAdapter;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/running/SportTabAdapter;", "mAdapter", "l", "Ljava/lang/String;", "adType", "Lcom/xiaomi/hm/health/utils/FragmentTrackHelper;", "m", "Lcom/xiaomi/hm/health/utils/FragmentTrackHelper;", "trackHelper", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTabFragment extends Fragment implements SportView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String n = "SportTabFragment";
    private static final int o = 6;

    @NotNull
    private static final String p = "is_oversea";

    @NotNull
    private static final String q = "sport_type";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isOversea;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TdmillHmFragment treadmillFragment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Observer<Boolean> bindingObserver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TdmillHmViewModel boltHomeViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isFirstVisible;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean showDataAfterViewInited;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Subscription adSubscription;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private SportMapFragment mapCard;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String adType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int sportType = 6;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<PromotePlace, PromotionalCourseFragment> promotionalCourseFragments = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper = FragmentTrackHelperKt.trackHelper(this, new d(), new e());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/running/SportTabFragment$Companion;", "", "", TdmillHmFragment.ARG_IS_OVERSEA, "", "sportType", "Lcom/xiaomi/hm/health/running/SportTabFragment;", "newInstance", "", "ARG_IS_OVERSEA", "Ljava/lang/String;", "ARG_SPORT_TYPE", "DEFAULT_SPORT_TYPE", LogUtil.I, "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SportTabFragment newInstance(boolean isOversea, int sportType) {
            SportTabFragment sportTabFragment = new SportTabFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(SportTabFragment.p, isOversea);
            bundle.putInt("sport_type", sportType);
            Unit unit = Unit.INSTANCE;
            sportTabFragment.setArguments(bundle);
            return sportTabFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/running/SportTabAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SportTabAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportTabAdapter getA() {
            return new SportTabAdapter(SportTabFragment.this.requireContext(), new ArrayList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ JsTreadmillMaintainEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JsTreadmillMaintainEvent jsTreadmillMaintainEvent) {
            super(1);
            this.a = jsTreadmillMaintainEvent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            TreadmillApiHandler handler = this.a.getHandler();
            if (handler == null) {
                return;
            }
            handler.maintainCallback(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setUserVisibleHint " + SportTabFragment.this.getSportType() + " visible: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Long, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Analytics.recordEvent(new CalculationEventBuilder(StatEvent.SPORT_TOP_TAB_T, j).addExtra("fr", SportTabFragment.this.h()).addExtra("time", String.valueOf(j)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.SPORT_TOP_TAB_V).addExtra("fr", SportTabFragment.this.h()));
        }
    }

    private final void f() {
        Trackrecord restoreRecord;
        if (!getUserVisibleHint() || getView() == null || (restoreRecord = SportRestoreUtils.getRestoreRecord()) == null) {
            return;
        }
        SportRestoreUtils.showRestoreDialog(requireContext(), getChildFragmentManager(), restoreRecord);
    }

    private final void g(int sportType) {
        String str;
        if (sportType == 1) {
            str = AdAPI.TYPE_RUN_OUTBSPORT;
        } else if (sportType == 25) {
            str = "";
        } else if (sportType != 8) {
            str = sportType != 9 ? AdAPI.TYPE_WALK_BSPORT : AdAPI.TYPE_RIDE_BSPORT;
        } else {
            str = AdAPI.TYPE_RUN_INBSPORT;
        }
        this.adType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h() {
        int i = this.sportType;
        if (i == 1) {
            return "run";
        }
        if (i == 6) {
            return "walk";
        }
        if (i != 8) {
            return i != 9 ? "" : "ride";
        }
        return "run";
    }

    private final SportTabAdapter i() {
        return (SportTabAdapter) this.mAdapter.getValue();
    }

    private final void j() {
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        if (companion.getInstance().getDelegate() == null) {
            companion.getInstance().setDelegate(new TreadmillImp());
            companion.getInstance().registerEventBus();
        }
        ProxyBoltTrackRecord.Companion companion2 = ProxyBoltTrackRecord.INSTANCE;
        if (companion2.getInstance().getDelegate() == null) {
            companion2.getInstance().setDelegate(new BoltTrackRecordImp());
        }
    }

    private final void k(final String adsCategory) {
        View view = getView();
        if (((TextView) (view == null ? null : view.findViewById(R.id.sport_tab_advertise_title))) == null) {
            return;
        }
        this.adSubscription = Observable.fromCallable(new Callable() { // from class: md7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportTabFragment.l(adsCategory);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: od7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportTabFragment.m(this.a, (List) obj);
            }
        }, u6.a, new Action0() { // from class: nd7
            @Override // rx.functions.Action0
            public final void call() {
                SportTabFragment.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(String str) {
        return AdProvider.getHomePagesAdByType(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SportTabFragment sportTabFragment, List list) {
        if (list.size() == 0) {
            View view = sportTabFragment.getView();
            ((TextView) (view == null ? null : view.findViewById(R.id.sport_tab_advertise_title))).setVisibility(8);
            View view2 = sportTabFragment.getView();
            ((ExpendRecyclerView) (view2 != null ? view2.findViewById(R.id.sport_tab_body) : null)).setVisibility(8);
            return;
        }
        View view3 = sportTabFragment.getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.sport_tab_advertise_title))).setVisibility(0);
        View view4 = sportTabFragment.getView();
        ((ExpendRecyclerView) (view4 != null ? view4.findViewById(R.id.sport_tab_body) : null)).setVisibility(0);
        sportTabFragment.i().updateData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n() {
    }

    @JvmStatic
    @NotNull
    public static final SportTabFragment newInstance(boolean z, int i) {
        return INSTANCE.newInstance(z, i);
    }

    private final void o() {
        PromotePlace promotePlace;
        if (this.isOversea) {
            return;
        }
        int i = this.sportType;
        if (i == 1) {
            promotePlace = PromotePlace.BEFORE_RUNNING_OUTDOOR;
        } else if (i == 6) {
            promotePlace = PromotePlace.BEFORE_RACE_WALKING;
        } else if (i != 8) {
            promotePlace = i != 9 ? null : PromotePlace.BEFORE_CYCLING;
        } else {
            promotePlace = PromotePlace.BEFORE_RUNNING_INDOOR;
        }
        if (promotePlace != null) {
            PromotionalCourseFragment promotionalCourseFragmentCreate = this.promotionalCourseFragments.get(promotePlace);
            if (promotionalCourseFragmentCreate == null) {
                promotionalCourseFragmentCreate = PromotionalCourseFragment.INSTANCE.create(promotePlace);
                this.promotionalCourseFragments.put(promotePlace, promotionalCourseFragmentCreate);
            }
            getChildFragmentManager().beginTransaction().replace(com.huami.watch.hmwatchmanager.R.id.promotional_course, promotionalCourseFragmentCreate).commit();
            if (!promotionalCourseFragmentCreate.getVisible().hasObservers()) {
                promotionalCourseFragmentCreate.getVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: kd7
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        SportTabFragment.p(this.a, (Boolean) obj);
                    }
                });
            }
        }
        if (this.sportType == 25) {
            View view = getView();
            ((FrameLayout) (view != null ? view.findViewById(R.id.promotional_course) : null)).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SportTabFragment sportTabFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (sportTabFragment.getSportType() != 25) {
            View view = sportTabFragment.getView();
            ((FrameLayout) (view == null ? null : view.findViewById(R.id.promotional_course))).setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    private final void q(int sportType) {
        if (sportType != 25) {
            View view = getView();
            ((FrameLayout) (view == null ? null : view.findViewById(R.id.promotional_treadmill))).setVisibility(8);
            View view2 = getView();
            ((FrameLayout) (view2 != null ? view2.findViewById(R.id.promotional_course) : null)).setVisibility(0);
            return;
        }
        View view3 = getView();
        FrameLayout frameLayout = (FrameLayout) (view3 == null ? null : view3.findViewById(R.id.sport_tab_head));
        View view4 = getView();
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) (view4 == null ? null : view4.findViewById(R.id.sport_tab_head))).getLayoutParams();
        layoutParams.height = -2;
        Unit unit = Unit.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        View view5 = getView();
        ((FrameLayout) (view5 == null ? null : view5.findViewById(R.id.promotional_treadmill))).setVisibility(0);
        View view6 = getView();
        ((FrameLayout) (view6 == null ? null : view6.findViewById(R.id.promotional_course))).setVisibility(8);
        if (this.treadmillFragment == null) {
            this.treadmillFragment = TdmillHmFragment.INSTANCE.newInstance(this.isOversea, RunnerData.getRunner().isMetric());
        }
        TdmillHmFragment tdmillHmFragment = this.treadmillFragment;
        if (tdmillHmFragment != null) {
            if ((tdmillHmFragment == null || tdmillHmFragment.isAdded()) ? false : true) {
                getChildFragmentManager().beginTransaction().replace(com.huami.watch.hmwatchmanager.R.id.promotional_treadmill, tdmillHmFragment).commit();
            }
        }
        final int iDp2px = (int) ViewUtils.dp2px(getContext(), 10.0f);
        final int iDp2px2 = (int) ViewUtils.dp2px(getContext(), 5.0f);
        TdmillHmViewModel tdmillHmViewModel = this.boltHomeViewModel;
        Objects.requireNonNull(tdmillHmViewModel);
        Boolean value = tdmillHmViewModel.isBinding().getValue();
        if (value != null) {
            View view7 = getView();
            ViewGroup.LayoutParams layoutParams2 = ((FrameLayout) (view7 != null ? view7.findViewById(R.id.promotional_treadmill) : null)).getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).setMargins(0, value.booleanValue() ? -iDp2px2 : -iDp2px, 0, 0);
            }
        }
        if (this.bindingObserver == null) {
            this.bindingObserver = new Observer() { // from class: ld7
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SportTabFragment.r(this.a, iDp2px2, iDp2px, (Boolean) obj);
                }
            };
        }
        TdmillHmViewModel tdmillHmViewModel2 = this.boltHomeViewModel;
        Objects.requireNonNull(tdmillHmViewModel2);
        tdmillHmViewModel2.isBinding().observe(getViewLifecycleOwner(), this.bindingObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SportTabFragment sportTabFragment, int i, int i2, Boolean bool) {
        View view = sportTabFragment.getView();
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) (view == null ? null : view.findViewById(R.id.promotional_treadmill))).getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, bool.booleanValue() ? -i : -i2, 0, 0);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getSportType() {
        return this.sportType;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.boltHomeViewModel = (TdmillHmViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity, TdmillHmViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.isOversea = arguments == null ? false : arguments.getBoolean(p);
        Bundle arguments2 = getArguments();
        this.sportType = arguments2 == null ? 6 : arguments2.getInt("sport_type");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(com.huami.watch.hmwatchmanager.R.layout.fragment_sport_tab, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Subscription subscription = this.adSubscription;
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull HMDeviceBindEvent e2) {
        if (e2.getDeviceType() == HMDeviceType.TREADMILL && this.sportType == 25) {
            TdmillHmViewModel tdmillHmViewModel = this.boltHomeViewModel;
            Objects.requireNonNull(tdmillHmViewModel);
            tdmillHmViewModel.setBindStatus(e2.isBound());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        j();
        if (GlobalConfig.get().isBuildMidong()) {
            View view2 = getView();
            (view2 == null ? null : view2.findViewById(R.id.bottom_space)).setVisibility(8);
            View view3 = getView();
            ((ExpendRecyclerView) (view3 == null ? null : view3.findViewById(R.id.sport_tab_body))).setVisibility(8);
            View view4 = getView();
            ((FrameLayout) (view4 == null ? null : view4.findViewById(R.id.promotional_course))).setVisibility(8);
            View view5 = getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.sport_tab_advertise_title))).setVisibility(8);
        }
        SportMapFragment.Companion companion = SportMapFragment.INSTANCE;
        boolean z = this.isOversea;
        int i = this.sportType;
        SportMapFragment sportMapFragmentNewInstance = companion.newInstance(z, i, "sport_" + i);
        this.mapCard = sportMapFragmentNewInstance;
        if (sportMapFragmentNewInstance != null) {
            getChildFragmentManager().beginTransaction().replace(com.huami.watch.hmwatchmanager.R.id.sport_tab_head, sportMapFragmentNewInstance).commit();
        }
        g(this.sportType);
        if (this.showDataAfterViewInited) {
            String str = this.adType;
            Objects.requireNonNull(str);
            k(str);
            o();
            q(this.sportType);
            SportMapFragment sportMapFragment = this.mapCard;
            if (sportMapFragment != null) {
                sportMapFragment.setUserVisibleHint(getUserVisibleHint());
            }
        }
        View view6 = getView();
        ExpendRecyclerView expendRecyclerView = (ExpendRecyclerView) (view6 != null ? view6.findViewById(R.id.sport_tab_body) : null);
        expendRecyclerView.setLayoutManager(new LinearLayoutManager(expendRecyclerView.getContext()));
        expendRecyclerView.setAdapter(i());
        expendRecyclerView.addItemDecoration(new SportTabDecoration());
        f();
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        HMLog.debug(n, new c(isVisibleToUser));
        this.trackHelper.trackOnUserVisibleHint();
        SportMapFragment sportMapFragment = this.mapCard;
        if (sportMapFragment != null) {
            sportMapFragment.setUserVisibleHint(getUserVisibleHint());
        }
        if (isVisibleToUser && !this.isOversea) {
            AdRepository.getInstance().updateSportImgAd();
        }
        if (this.isFirstVisible || !isVisibleToUser) {
            return;
        }
        this.isFirstVisible = true;
        if (isResumed()) {
            String str = this.adType;
            Objects.requireNonNull(str);
            k(str);
            o();
            q(this.sportType);
        } else {
            this.showDataAfterViewInited = true;
        }
        f();
    }

    @Override // com.xiaomi.hm.health.fragment.SportView
    public void showSportType(int sportType) {
        this.sportType = sportType;
        SportMapFragment sportMapFragment = this.mapCard;
        if (sportMapFragment != null) {
            sportMapFragment.showSportType(sportType);
        }
        q(sportType);
    }

    public final void onEventMainThread(@NotNull EventAdDownloadFinished e2) {
        System.out.println((Object) "onEventMainThread : start");
        String str = this.adType;
        Objects.requireNonNull(str);
        k(str);
    }

    public final void onEventMainThread(@NotNull EventSportTypeSwitched event) {
        System.out.println((Object) ("onEventMainThread : " + event.getLastSportType() + ", " + event.getCurrentSportType()));
        if (event.getLastSportType() == this.sportType) {
            int currentSportType = event.getCurrentSportType();
            this.sportType = currentSportType;
            g(currentSportType);
            String str = this.adType;
            Objects.requireNonNull(str);
            k(str);
            o();
            q(this.sportType);
        }
    }

    public final void onEventMainThread(@NotNull JsTreadmillMaintainEvent jsTreadmillMaintainEvent) {
        FtmsErrorHelper.INSTANCE.disableNotify(new b(jsTreadmillMaintainEvent));
    }
}
