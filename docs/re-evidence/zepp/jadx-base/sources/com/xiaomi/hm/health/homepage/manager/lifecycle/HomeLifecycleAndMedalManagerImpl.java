package com.xiaomi.hm.health.homepage.manager.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.ad.repo.AdStatusPopupRepo;
import com.huami.medal.ui.MedalUiHelper;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.module.homepage.sync.manager.IHomeLifecycleAndMedalManager;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.ui.event.EventCurrSportFinished;
import com.huami.moving.webapi.ConfigAPI;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.loc.z;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.apprate.AppRateDialog;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.eventbus.EventQuietModeChange;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.homepage.manager.lifecycle.HomeLifecycleAndMedalManagerImpl;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.subview.manager.StatusPopupAdObserver;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.traininglib.event.EventFinishCurrentTraining;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatData;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0007J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0010J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0012J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0013R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/lifecycle/HomeLifecycleAndMedalManagerImpl;", "Lcom/huami/module/homepage/sync/manager/IHomeLifecycleAndMedalManager;", "Lcom/huami/medal/ui/MedalUiHelper;", "", "F", LogUtil.D, "onStart", "onDestroy", "requestStatusPopupAd", "popMedalUi", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setInForegroundListener", "Lcom/xiaomi/hm/health/eventbus/EventUnitChanged;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/traininglib/event/EventFinishCurrentTraining;", "Lcom/huami/moving/ui/event/EventCurrSportFinished;", "Lcom/xiaomi/hm/health/eventbus/EventAppInBackground;", "Lcom/xiaomi/hm/health/eventbus/EventQuietModeChange;", "Landroidx/fragment/app/Fragment;", "i", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment", "Lcom/xiaomi/hm/health/subview/manager/StatusPopupAdObserver;", z.j, "Lcom/xiaomi/hm/health/subview/manager/StatusPopupAdObserver;", "statusPopAdObserver", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", hl.k, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "", "l", "Z", "hasRequestStatusPopupAd", "", "m", "J", "statusPopupAdUpdateTime", GoogleApiAvailabilityLight.b, "Lkotlin/jvm/functions/Function0;", "foregroundListener", "<init>", "(Landroidx/fragment/app/Fragment;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HomeLifecycleAndMedalManagerImpl extends MedalUiHelper implements IHomeLifecycleAndMedalManager {
    private static final int o = 14400000;

    @NotNull
    private static final String p = "StatusPopupAd";

    @NotNull
    private static final String q = "StatusPopupAdKey";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private StatusPopupAdObserver statusPopAdObserver;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean hasRequestStatusPopupAd;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long statusPopupAdUpdateTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> foregroundListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAppInBackground a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EventAppInBackground eventAppInBackground) {
            super(0);
            this.a = eventAppInBackground;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "收到app background foreground 消息 " + this.a.isInBackground;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "requestStatusPopupAd....";
        }
    }

    public HomeLifecycleAndMedalManagerImpl(@NotNull Fragment fragment) {
        super(fragment.requireContext(), fragment.getViewLifecycleOwner(), !Utils.shouldHideDiscovery());
        this.fragment = fragment;
        this.statusPopAdObserver = new StatusPopupAdObserver(fragment.requireContext(), new StatusPopupAdObserver.WhichTabAtListener() { // from class: s84
            @Override // com.xiaomi.hm.health.subview.manager.StatusPopupAdObserver.WhichTabAtListener
            public final boolean isTabOnStatus() {
                return HomeLifecycleAndMedalManagerImpl.I(this.a);
            }
        });
        KvPersistence kvPersistence$default = KvKit.getKvPersistence$default(p + HMPersonInfo.getInstance().getUserInfo().getUserid(), false, 2, null);
        this.kv = kvPersistence$default;
        this.statusPopupAdUpdateTime = ((Number) kvPersistence$default.getValue(q, 0L)).longValue();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        AdStatusPopupRepo.getInstance().setListener(this.statusPopAdObserver);
        setShowListener(new MedalUiHelper.MedalDialogShowListener() { // from class: com.xiaomi.hm.health.homepage.manager.lifecycle.HomeLifecycleAndMedalManagerImpl.1
            @Override // com.huami.medal.ui.MedalUiHelper.MedalDialogShowListener
            public void onDismiss(boolean hasSportMedal) {
                AppRateDialog.INSTANCE.show(HomeLifecycleAndMedalManagerImpl.this.getFragment().requireActivity());
            }

            @Override // com.huami.medal.ui.MedalUiHelper.MedalDialogShowListener
            public void onShow() {
            }
        });
    }

    private final void D() {
        TrainingBus.finishedCourseTraining().observe(this.fragment.getViewLifecycleOwner(), new Observer() { // from class: r84
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeLifecycleAndMedalManagerImpl.E(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HomeLifecycleAndMedalManagerImpl homeLifecycleAndMedalManagerImpl, Resource resource) {
        if (!resource.isComplete() || resource.getData() == null) {
            return;
        }
        TrainingRecord trainingRecord = new TrainingRecord();
        trainingRecord.trainingId = Long.valueOf(Long.parseLong(((com.xiaomi.hm.health.training.api.entity.TrainingRecord) resource.getData()).trainingId));
        trainingRecord.startTime = Long.valueOf(((com.xiaomi.hm.health.training.api.entity.TrainingRecord) resource.getData()).startTime);
        trainingRecord.endTime = Long.valueOf(((com.xiaomi.hm.health.training.api.entity.TrainingRecord) resource.getData()).endTime);
        trainingRecord.duration = Long.valueOf(((com.xiaomi.hm.health.training.api.entity.TrainingRecord) resource.getData()).duration);
        trainingRecord.consumption = Integer.valueOf((int) ((com.xiaomi.hm.health.training.api.entity.TrainingRecord) resource.getData()).consumption);
        homeLifecycleAndMedalManagerImpl.onEventMainThread(new EventFinishCurrentTraining(trainingRecord));
    }

    private final void F() {
        HistoryRecordManager.getInstance().getStatInfoInRx().observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: t84
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HomeLifecycleAndMedalManagerImpl.G((ExerciseStatData) obj);
            }
        }, new Action1() { // from class: u84
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HomeLifecycleAndMedalManagerImpl.H((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(ExerciseStatData exerciseStatData) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Throwable th) {
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(HomeLifecycleAndMedalManagerImpl homeLifecycleAndMedalManagerImpl) {
        return ((MainTabActivity) homeLifecycleAndMedalManagerImpl.getFragment().requireActivity()).isTabOnStatus();
    }

    @NotNull
    public final Fragment getFragment() {
        return this.fragment;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        AdStatusPopupRepo.getInstance().clear();
    }

    public final void onEventMainThread(@NotNull EventQuietModeChange event) {
    }

    public final void onEventMainThread(@NotNull EventUnitChanged event) {
        RunnerData.getRunner().setMetric(!(event.lengthUnit == 1));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        SportConfigDbClient.generateConfigs();
        ConfigAPI.requestRunConfig();
        D();
        requestStatusPopupAd();
        F();
    }

    @Override // com.huami.module.homepage.sync.manager.IHomeLifecycleAndMedalManager
    public void popMedalUi() {
        if (this.statusPopAdObserver.isPopupAdShowing()) {
            return;
        }
        loadNotTakenMedalsThenShowMedalDialog(null, this.fragment.requireActivity());
    }

    @Override // com.huami.module.homepage.sync.manager.IHomeLifecycleAndMedalManager
    public void requestStatusPopupAd() {
        HMLog.info("HomePage", b.a);
        if (this.hasRequestStatusPopupAd || Utils.shouldHideDiscovery()) {
            return;
        }
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            if (System.currentTimeMillis() - this.statusPopupAdUpdateTime > 14400000) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.statusPopupAdUpdateTime = jCurrentTimeMillis;
                this.kv.setValue(q, Long.valueOf(jCurrentTimeMillis));
                AdStatusPopupRepo.getInstance().requestAd();
            }
            this.hasRequestStatusPopupAd = true;
            return;
        }
        if (System.currentTimeMillis() - this.statusPopupAdUpdateTime > 14400000) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.statusPopupAdUpdateTime = jCurrentTimeMillis2;
            this.kv.setValue(q, Long.valueOf(jCurrentTimeMillis2));
            AdStatusPopupRepo.getInstance().tryLoadStatusPopAd();
        }
        this.hasRequestStatusPopupAd = true;
    }

    @Override // com.huami.module.homepage.sync.manager.IHomeLifecycleAndMedalManager
    public void setInForegroundListener(@NotNull Function0<Unit> listener) {
        this.foregroundListener = listener;
    }

    public final void onEventMainThread(@NotNull EventFinishCurrentTraining event) {
        HistoryRecordManager.getInstance().updateTrainingRecordToStatData(event.trainingRecord);
    }

    public final void onEventMainThread(@NotNull EventCurrSportFinished event) {
        PostRunningDataToServer.postRunningData(null);
        HistoryRecordManager.getInstance().updateTrackRecordToStatData(event.trackId, event.deviceSource);
    }

    public final void onEventMainThread(@NotNull EventAppInBackground event) {
        HMLog.info("HomePage", new a(event));
        if (event.isInBackground) {
            this.hasRequestStatusPopupAd = false;
            return;
        }
        requestStatusPopupAd();
        Function0<Unit> function0 = this.foregroundListener;
        if (function0 == null) {
            return;
        }
        function0.getA();
    }
}
