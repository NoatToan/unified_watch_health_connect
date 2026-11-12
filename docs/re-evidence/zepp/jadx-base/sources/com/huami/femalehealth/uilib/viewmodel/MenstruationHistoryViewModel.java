package com.huami.femalehealth.uilib.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.femalehealth.logiclib.repo.HistoryRepo;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.logiclib.vo.Listing;
import com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryViewModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178\u0010@\u0010X\u0090D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R3\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r +*\n\u0012\u0004\u0012\u00020\r\u0018\u00010*0*0)8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u0007018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "onDestroy", "Lkotlin/Pair;", "", "filter", "filterHistory", "showAllHistory", "initRefresh", "", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "list", "calcCycle", "clearCycleCatch", "Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;", "getRepo", "()Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;", CommonLanguageSettingFragment.KEY_REPO, "", "e", "Z", "getShowCurrentMenstruation$uilib_release", "()Z", "showCurrentMenstruation", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "f", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "filterLiveData", "Lcom/huami/femalehealth/logiclib/vo/Listing;", "h", "Lcom/huami/femalehealth/logiclib/vo/Listing;", "result", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "kotlin.jvm.PlatformType", "i", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "pagedList", "", "", z.j, "Ljava/util/Map;", "cycleCache", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public class MenstruationHistoryViewModel extends FHBaseViewModel {

    @NotNull
    public static final String TAG = "MenstruationHistoryViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HistoryRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showCurrentMenstruation = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferencesUtils sp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Integer>> filterLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Listing<HistoryItemVo> result;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<HistoryItemVo>> pagedList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Integer> cycleCache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HistoryItemVo> a;
        public final /* synthetic */ MenstruationHistoryViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<HistoryItemVo> list, MenstruationHistoryViewModel menstruationHistoryViewModel) {
            super(0);
            this.a = list;
            this.b = menstruationHistoryViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "calcCycle, list=" + this.a + ", final cycleCache=" + this.b.cycleCache;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> initRefresh = MenstruationHistoryViewModel.this.result.getInitRefresh();
            if (initRefresh == null) {
                return;
            }
            initRefresh.invoke();
        }
    }

    public MenstruationHistoryViewModel(@NotNull HistoryRepo historyRepo, @NotNull MenstruationDataManager menstruationDataManager) {
        this.repo = historyRepo;
        this.sp = menstruationDataManager.getSp();
        MutableLiveData<Pair<Integer, Integer>> mutableLiveData = new MutableLiveData<>();
        this.filterLiveData = mutableLiveData;
        this.result = historyRepo.loadHistory(null, getShowCurrentMenstruation());
        this.pagedList = Transformations.switchMap(mutableLiveData, new Function() { // from class: d05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MenstruationHistoryViewModel.b(this.a, (Pair) obj);
            }
        });
        this.cycleCache = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData b(MenstruationHistoryViewModel menstruationHistoryViewModel, Pair pair) {
        return menstruationHistoryViewModel.getRepo().loadHistory(pair, menstruationHistoryViewModel.getShowCurrentMenstruation()).getPagedList();
    }

    public final void calcCycle(@NotNull List<HistoryItemVo> list) {
        long menstrualPeriod = 0;
        for (HistoryItemVo historyItemVo : CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.filterNotNull(list), new Comparator() { // from class: com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryViewModel$calcCycle$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryItemVo) t).getMenstrualPeriod()), Long.valueOf(((HistoryItemVo) t2).getMenstrualPeriod()));
            }
        })) {
            if (!this.cycleCache.containsKey(historyItemVo.getId()) || this.cycleCache.get(historyItemVo.getId()) == null) {
                if (menstrualPeriod > 0) {
                    historyItemVo.setCycle(DateHelper.INSTANCE.daysBetween(new Date(menstrualPeriod), new Date(historyItemVo.getMenstrualPeriod())) - 1);
                } else if (historyItemVo.getCycle() == 0) {
                    historyItemVo.setCycle(this.sp.getCycleLen());
                }
                this.cycleCache.put(historyItemVo.getId(), Integer.valueOf(historyItemVo.getCycle()));
            } else {
                historyItemVo.setCycle(this.cycleCache.get(historyItemVo.getId()).intValue());
            }
            menstrualPeriod = historyItemVo.getMenstrualPeriod();
        }
        HMLog.info(TAG, new a(list, this));
    }

    public final void clearCycleCatch() {
        this.cycleCache.clear();
    }

    public final void filterHistory(@NotNull Pair<Integer, Integer> filter) {
        this.filterLiveData.setValue(filter);
    }

    @NotNull
    public final LiveData<PagedList<HistoryItemVo>> getPagedList() {
        return this.pagedList;
    }

    @NotNull
    public final HistoryRepo getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: getShowCurrentMenstruation$uilib_release, reason: from getter */
    public boolean getShowCurrentMenstruation() {
        return this.showCurrentMenstruation;
    }

    public final void initRefresh() {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new b(), 1, null);
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel, com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        super.onDestroy(owner);
        this.cycleCache.clear();
    }

    public final void showAllHistory() {
        this.filterLiveData.setValue(null);
    }
}
