package com.huami.femalehealth.logiclib.repo;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.db.po.MenstruationWithSymptoms;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.ext.BeanExKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.repo.HistoryDetailRepo;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/HistoryDetailRepo;", "", "", "id", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationWithSymptoms;", "loadLiveMenstruationWithSymptoms", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "appExecutors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "b", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryDetailRepo {

    @NotNull
    public static final String TAG = "HistoryDetailRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<List<HistoryDetailBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ApiResponse<List<HistoryDetailBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadLiveMenstruationWithSymptoms, response=" + this.a + ".body";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationWithSymptoms> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<MenstruationWithSymptoms> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("loadLiveMenstruationWithSymptoms, Symptoms=", this.a);
        }
    }

    public HistoryDetailRepo(@NotNull AppExecutors appExecutors, @NotNull FemaleHealthWebApi femaleHealthWebApi) {
        this.appExecutors = appExecutors;
        this.webApi = femaleHealthWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, MediatorLiveData mediatorLiveData) {
        Object next;
        ApiResponse<List<HistoryDetailBean>> apiResponseLoadHistoryDetail = DataCacheManager.INSTANCE.loadHistoryDetail(str);
        if (apiResponseLoadHistoryDetail instanceof ApiSuccessResponse) {
            List<MenstruationRecord> listFindByServerId = MenstruationSearchRepo.INSTANCE.findByServerId(str);
            List list = (List) ((ApiSuccessResponse) apiResponseLoadHistoryDetail).getBody();
            HMLog.info("xys_HistoryDetailRepo", new a(apiResponseLoadHistoryDetail));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindByServerId, 10));
            for (MenstruationRecord menstruationRecord : listFindByServerId) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(menstruationRecord.getDate().getTime() == AidKt.resetZeroHour(((HistoryDetailBean) next).getMenstruationTime())));
                HistoryDetailBean historyDetailBean = (HistoryDetailBean) next;
                arrayList.add(historyDetailBean != null ? new MenstruationWithSymptoms(menstruationRecord, CollectionsKt__CollectionsKt.listOf((Object[]) new Symptom[]{BeanExKt.toSymptomPo(historyDetailBean, SymptomType.PAIN), BeanExKt.toSymptomPo(historyDetailBean, SymptomType.MOOD), BeanExKt.toSymptomPo(historyDetailBean, SymptomType.BLOOD)})) : new MenstruationWithSymptoms(menstruationRecord, CollectionsKt__CollectionsKt.emptyList()));
            }
            HMLog.info("xys_HistoryDetailRepo", new b(arrayList));
            mediatorLiveData.postValue(Resource.INSTANCE.success(arrayList));
        }
    }

    @NotNull
    public final LiveData<Resource<List<MenstruationWithSymptoms>>> loadLiveMenstruationWithSymptoms(@Nullable final String id) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        if (id == null) {
            return mediatorLiveData;
        }
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: u04
            @Override // java.lang.Runnable
            public final void run() {
                HistoryDetailRepo.b(id, mediatorLiveData);
            }
        });
        return mediatorLiveData;
    }
}
