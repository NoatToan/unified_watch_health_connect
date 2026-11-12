package com.huami.treadmill.ui.kings;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.Listing;
import com.huami.treadmill.data.TdSpeedKingBean;
import com.huami.treadmill.data.source.TdmillRepository;
import com.huami.treadmill.data.source.db.TdKingSpeedDao;
import com.huami.treadmill.data.source.db.TreadmillDb;
import com.huami.treadmill.paging.PageKey;
import com.huami.treadmill.ui.kings.SpeedKingsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0005R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R0\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001d*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c0\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR3\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001d*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!0!0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/treadmill/ui/kings/SpeedKingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdSpeedKingBean;", "body", "", "e", "c", "refresh", "", "id", "", "key", "", "showSpeeds", "retry", "Lcom/huami/treadmill/data/source/TdmillRepository;", "a", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "()Lcom/huami/treadmill/data/source/TdmillRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "J", "lineId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/treadmill/data/Listing;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "repoResult_speed", "Landroidx/paging/PagedList;", "getSpeeds", "()Landroidx/lifecycle/LiveData;", "speeds", "<init>", "(Lcom/huami/treadmill/data/source/TdmillRepository;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SpeedKingsViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TdmillRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long lineId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Listing<TdSpeedKingBean>> repoResult_speed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<TdSpeedKingBean>> speeds;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/treadmill/api/ApiResponse;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdSpeedKingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, ApiResponse<Items<TdSpeedKingBean>>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<TdSpeedKingBean>> invoke(@Nullable String str) {
            return SpeedKingsViewModel.this.getRepository().getTdmillApi().getSpeedKins(SpeedKingsViewModel.this.lineId, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Items<TdSpeedKingBean>, Unit> {
        public b(SpeedKingsViewModel speedKingsViewModel) {
            super(1, speedKingsViewModel, SpeedKingsViewModel.class, "handleSpeedDb", "handleSpeedDb(Lcom/huami/treadmill/data/Items;)V", 0);
        }

        public final void a(@Nullable Items<TdSpeedKingBean> items) {
            ((SpeedKingsViewModel) this.receiver).e(items);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<TdSpeedKingBean> items) {
            a(items);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(SpeedKingsViewModel speedKingsViewModel) {
            super(0, speedKingsViewModel, SpeedKingsViewModel.class, "clearDbCache", "clearDbCache()V", 0);
        }

        public final void a() {
            ((SpeedKingsViewModel) this.receiver).c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public SpeedKingsViewModel(@NotNull TdmillRepository tdmillRepository) {
        this.repository = tdmillRepository;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.key = mutableLiveData;
        LiveData<Listing<TdSpeedKingBean>> map = Transformations.map(mutableLiveData, new Function() { // from class: n77
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SpeedKingsViewModel.f(this.a, (String) obj);
            }
        });
        this.repoResult_speed = map;
        this.speeds = Transformations.switchMap(map, new Function() { // from class: o77
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SpeedKingsViewModel.g((Listing) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        TreadmillDb db = this.repository.getDb();
        if (db == null) {
            return;
        }
        db.kingsSpeed().deleteKings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Items<TdSpeedKingBean> body) {
        TreadmillDb db;
        if (body == null || (db = getRepository().getDb()) == null) {
            return;
        }
        TdKingSpeedDao tdKingSpeedDaoKingsSpeed = db.kingsSpeed();
        TdSpeedKingBean tdSpeedKingBeanQueryLastKing = tdKingSpeedDaoKingsSpeed.queryLastKing();
        int i = 0;
        int index = tdSpeedKingBeanQueryLastKing == null ? 0 : tdSpeedKingBeanQueryLastKing.getIndex();
        List<TdSpeedKingBean> items = body.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TdSpeedKingBean tdSpeedKingBean = (TdSpeedKingBean) obj;
            if (index != 0) {
                i += index + 1;
            }
            tdSpeedKingBean.setIndex(i);
            arrayList.add(tdSpeedKingBean);
            i = i2;
        }
        tdKingSpeedDaoKingsSpeed.insert(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Listing f(SpeedKingsViewModel speedKingsViewModel, String str) {
        return speedKingsViewModel.getRepository().getListing(speedKingsViewModel.getRepository().getPagingDbSource(PageKey.TD_KING_SPEED), PageKey.TD_KING_SPEED, speedKingsViewModel.new a(), new b(speedKingsViewModel), new c(speedKingsViewModel), speedKingsViewModel.getRepository().getDb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData g(Listing listing) {
        return listing.getPagedList();
    }

    @NotNull
    public final TdmillRepository getRepository() {
        return this.repository;
    }

    @NotNull
    public final LiveData<PagedList<TdSpeedKingBean>> getSpeeds() {
        return this.speeds;
    }

    public final void refresh() {
        Function0<Unit> refresh;
        Listing<TdSpeedKingBean> value = this.repoResult_speed.getValue();
        if (value == null || (refresh = value.getRefresh()) == null) {
            return;
        }
        refresh.invoke();
    }

    public final void retry() {
        Function0<Unit> retry;
        LiveData<Listing<TdSpeedKingBean>> liveData = this.repoResult_speed;
        Listing<TdSpeedKingBean> value = liveData == null ? null : liveData.getValue();
        if (value == null || (retry = value.getRetry()) == null) {
            return;
        }
        retry.invoke();
    }

    public final boolean showSpeeds(long id, @NotNull String key) {
        if (Intrinsics.areEqual(this.key.getValue(), key)) {
            return false;
        }
        this.key.setValue(key);
        this.lineId = id;
        return true;
    }
}
