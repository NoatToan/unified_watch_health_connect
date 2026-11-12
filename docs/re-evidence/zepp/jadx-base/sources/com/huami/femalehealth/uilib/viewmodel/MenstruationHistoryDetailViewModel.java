package com.huami.femalehealth.uilib.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.femalehealth.logiclib.db.po.MenstruationWithSymptoms;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.ext.PoToVoKt;
import com.huami.femalehealth.logiclib.repo.HistoryDetailRepo;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import com.huami.femalehealth.uilib.adapter.DetailSummaryVo;
import com.huami.femalehealth.uilib.adapter.DetailSymptomVo;
import com.huami.femalehealth.uilib.adapter.HistoryDetailVo;
import com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryDetailViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R3\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e0\u000e0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryDetailViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "historyItemVo", "", "initHistoryDetail", "Landroidx/lifecycle/MediatorLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MediatorLiveData;", "historyVo", "e", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationWithSymptoms;", "f", "Landroidx/lifecycle/LiveData;", "menstruationWithSymptom", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailVo;", "kotlin.jvm.PlatformType", "g", "getHistoryDetail", "()Landroidx/lifecycle/LiveData;", "historyDetail", "Lcom/huami/femalehealth/logiclib/repo/HistoryDetailRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/femalehealth/logiclib/repo/HistoryDetailRepo;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationHistoryDetailViewModel extends FHBaseViewModel {

    @NotNull
    private static final String h = "MenstruationHistoryDetailViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<HistoryItemVo> historyVo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HistoryItemVo historyItemVo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<MenstruationWithSymptoms>>> menstruationWithSymptom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<HistoryDetailVo>> historyDetail;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MenstruationHistoryDetailViewModel(@NotNull final HistoryDetailRepo historyDetailRepo) {
        MediatorLiveData<HistoryItemVo> mediatorLiveData = new MediatorLiveData<>();
        this.historyVo = mediatorLiveData;
        LiveData<Resource<List<MenstruationWithSymptoms>>> liveDataSwitchMap = Transformations.switchMap(mediatorLiveData, new Function() { // from class: b05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MenstruationHistoryDetailViewModel.e(historyDetailRepo, (HistoryItemVo) obj);
            }
        });
        this.menstruationWithSymptom = liveDataSwitchMap;
        this.historyDetail = Transformations.switchMap(liveDataSwitchMap, new Function() { // from class: c05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MenstruationHistoryDetailViewModel.c(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(MenstruationHistoryDetailViewModel menstruationHistoryDetailViewModel, Resource resource) {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        ArrayList arrayList = new ArrayList();
        HistoryItemVo historyItemVo = menstruationHistoryDetailViewModel.historyItemVo;
        if (historyItemVo != null) {
            arrayList.add(new DetailSummaryVo(historyItemVo.getCycle(), DateHelper.INSTANCE.daysBetween(new Date(historyItemVo.getMenstrualPeriod()), new Date(historyItemVo.getMenstrualEndTime())), historyItemVo.getMenstrualPeriod(), historyItemVo.getMenstrualEndTime(), historyItemVo.isEnd()));
            mediatorLiveData.setValue(arrayList);
        }
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            List list = (List) resource.getData();
            if (list != null) {
                SymptomType[] symptomTypeArrValues = SymptomType.values();
                int length = symptomTypeArrValues.length;
                for (int i = 0; i < length; i++) {
                    SymptomType symptomType = symptomTypeArrValues[i];
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        h.addAll(arrayList2, ((MenstruationWithSymptoms) it2.next()).getSymptoms());
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(PoToVoKt.toSymptomVo((Symptom) it3.next()));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        if (((SymptomVo) obj).getType() == symptomType) {
                            arrayList4.add(obj);
                        }
                    }
                    HistoryItemVo historyItemVo2 = menstruationHistoryDetailViewModel.historyItemVo;
                    if (historyItemVo2 != null) {
                        arrayList.add(new DetailSymptomVo(symptomType, arrayList4, historyItemVo2.getMenstrualPeriod(), historyItemVo2.getMenstrualEndTime()));
                    }
                }
            }
            mediatorLiveData.setValue(arrayList);
        }
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(HistoryDetailRepo historyDetailRepo, HistoryItemVo historyItemVo) {
        if (historyItemVo == null) {
            return null;
        }
        return historyDetailRepo.loadLiveMenstruationWithSymptoms(historyItemVo.getId());
    }

    @NotNull
    public final LiveData<List<HistoryDetailVo>> getHistoryDetail() {
        return this.historyDetail;
    }

    public final void initHistoryDetail(@Nullable HistoryItemVo historyItemVo) {
        if (historyItemVo == null) {
            return;
        }
        this.historyItemVo = historyItemVo;
        this.historyVo.setValue(historyItemVo);
    }
}
