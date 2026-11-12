package com.huami.pai.repository.detail;

import androidx.p008lifecycle.LiveData;
import com.facebook.appevents.UserDataStore;
import com.huami.pai.converter.PoToVoKt;
import com.huami.pai.converter.WebBeanToPoKt;
import com.huami.pai.db.PaiDb;
import com.huami.pai.db.po.FitnessAge;
import com.huami.pai.db.po.Pai;
import com.huami.pai.livedata.LoadOnActiveLiveData;
import com.huami.pai.repository.AppExecutors;
import com.huami.pai.repository.NetworkBoundResource;
import com.huami.pai.repository.Resource;
import com.huami.pai.vo.FitnessAgeVo;
import com.huami.pai.web.ApiResponse;
import com.huami.pai.web.IPaiWebApi;
import com.huami.pai.web.bean.FitnessAgeBean;
import com.huami.pai.web.bean.Items;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0005H\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/pai/repository/detail/FitnessAgeRepoImpl;", "Lcom/huami/pai/repository/detail/FitnessAgeRepo;", "Lkotlin/Pair;", "Ljava/util/Date;", "a", "Landroidx/lifecycle/LiveData;", "Lcom/huami/pai/db/po/Pai;", "loadTodayPai", "Lcom/huami/pai/repository/Resource;", "", "Lcom/huami/pai/vo/FitnessAgeVo;", "loadFitnessAges", "Lcom/huami/pai/repository/AppExecutors;", "Lcom/huami/pai/repository/AppExecutors;", "appExecutors", "Lcom/huami/pai/db/PaiDb;", "b", "Lcom/huami/pai/db/PaiDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/pai/web/IPaiWebApi;", "c", "Lcom/huami/pai/web/IPaiWebApi;", "IPaiWebApi", "<init>", "(Lcom/huami/pai/repository/AppExecutors;Lcom/huami/pai/db/PaiDb;Lcom/huami/pai/web/IPaiWebApi;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FitnessAgeRepoImpl implements FitnessAgeRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PaiDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IPaiWebApi IPaiWebApi;

    public FitnessAgeRepoImpl(@NotNull AppExecutors appExecutors, @NotNull PaiDb paiDb, @NotNull IPaiWebApi iPaiWebApi) {
        this.appExecutors = appExecutors;
        this.db = paiDb;
        this.IPaiWebApi = iPaiWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Date, Date> a() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, 10);
        Date time = calendar.getTime();
        calendar.add(6, -80);
        return new Pair<>(calendar.getTime(), time);
    }

    @Override // com.huami.pai.repository.detail.FitnessAgeRepo
    @NotNull
    public LiveData<Resource<List<FitnessAgeVo>>> loadFitnessAges() {
        return new NetworkBoundResource<List<? extends FitnessAge>, Items<FitnessAgeBean>, List<? extends FitnessAgeVo>>(this.appExecutors) { // from class: com.huami.pai.repository.detail.FitnessAgeRepoImpl.loadFitnessAges.1

            /* JADX INFO: renamed from: com.huami.pai.repository.detail.FitnessAgeRepoImpl$loadFitnessAges$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/pai/web/ApiResponse;", "Lcom/huami/pai/web/bean/Items;", "Lcom/huami/pai/web/bean/FitnessAgeBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ApiResponse<Items<FitnessAgeBean>>> {
                public final /* synthetic */ FitnessAgeRepoImpl a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(FitnessAgeRepoImpl fitnessAgeRepoImpl) {
                    super(0);
                    this.a = fitnessAgeRepoImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ApiResponse<Items<FitnessAgeBean>> invoke() {
                    Pair pairA = this.a.a();
                    return this.a.IPaiWebApi.loadFitnessAges((Date) pairA.component1(), (Date) pairA.component2());
                }
            }

            @Override // com.huami.pai.repository.NetworkBoundResource
            @NotNull
            public LiveData<ApiResponse<Items<FitnessAgeBean>>> createCall() {
                return LoadOnActiveLiveData.INSTANCE.create(FitnessAgeRepoImpl.this.appExecutors.networkIO(), new a(FitnessAgeRepoImpl.this));
            }

            @Override // com.huami.pai.repository.NetworkBoundResource
            @NotNull
            public LiveData<List<? extends FitnessAge>> loadFromDb() {
                Pair pairA = FitnessAgeRepoImpl.this.a();
                return FitnessAgeRepoImpl.this.db.fitnessAgeDao().queryAges((Date) pairA.component1(), (Date) pairA.component2());
            }

            @Override // com.huami.pai.repository.NetworkBoundResource
            public /* bridge */ /* synthetic */ List<? extends FitnessAgeVo> poToVo(List<? extends FitnessAge> list) {
                return poToVo2((List<FitnessAge>) list);
            }

            @Override // com.huami.pai.repository.NetworkBoundResource
            public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends FitnessAge> list) {
                return shouldFetch2((List<FitnessAge>) list);
            }

            /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
            public boolean shouldFetch2(@Nullable List<FitnessAge> data) {
                return true;
            }

            @Nullable
            /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
            public List<FitnessAgeVo> poToVo2(@Nullable List<FitnessAge> po) {
                if (po == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(po, 10));
                Iterator<T> it2 = po.iterator();
                while (it2.hasNext()) {
                    arrayList.add(PoToVoKt.toFitnessAgeVo((FitnessAge) it2.next()));
                }
                return arrayList;
            }

            @Override // com.huami.pai.repository.NetworkBoundResource
            public void saveCallResult(@NotNull Items<FitnessAgeBean> result) {
                List<FitnessAgeBean> items = result.getItems();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList.add(WebBeanToPoKt.toFitnessAge((FitnessAgeBean) it2.next()));
                }
                FitnessAgeRepoImpl.this.db.fitnessAgeDao().insertAges(arrayList);
            }
        }.asLiveData();
    }

    @Override // com.huami.pai.repository.detail.FitnessAgeRepo
    @NotNull
    public LiveData<Pai> loadTodayPai() {
        return this.db.paiDao().queryPai(new Date());
    }
}
