package com.huami.treadmill.ui.line;

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
import com.huami.treadmill.data.NetworkState;
import com.huami.treadmill.data.TdLine;
import com.huami.treadmill.data.source.TdmillRepository;
import com.huami.treadmill.data.source.db.TdlineDao;
import com.huami.treadmill.data.source.db.TreadmillDb;
import com.huami.treadmill.paging.PageKey;
import com.huami.treadmill.ui.line.TdmillLineViewModel;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0005J\b\u0010\u000e\u001a\u0004\u0018\u00010\tR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00190\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR3\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e0\u001e0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010!R'\u0010&\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010#0#0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010!R'\u0010(\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010#0#0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b'\u0010!¨\u0006+"}, d2 = {"Lcom/huami/treadmill/ui/line/TdmillLineViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdLine;", "body", "", "g", "f", "refresh", "", "key", "", "showLines", "retry", "currentkey", "Lcom/huami/treadmill/data/source/TdmillRepository;", "a", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "()Lcom/huami/treadmill/data/source/TdmillRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/treadmill/data/Listing;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "repoResult", "Landroidx/paging/PagedList;", GoogleApiAvailabilityLight.a, "getTdmillLines", "()Landroidx/lifecycle/LiveData;", "tdmillLines", "Lcom/huami/treadmill/data/NetworkState;", "e", "getNetworkState", "networkState", "getRefreshState", "refreshState", "<init>", "(Lcom/huami/treadmill/data/source/TdmillRepository;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillLineViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TdmillRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Listing<TdLine>> repoResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<TdLine>> tdmillLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<NetworkState> networkState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<NetworkState> refreshState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/treadmill/api/ApiResponse;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdLine;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, ApiResponse<Items<TdLine>>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<TdLine>> invoke(@Nullable String str) {
            return TdmillLineViewModel.this.getRepository().getTdmillApi().getLines(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Items<TdLine>, Unit> {
        public b(TdmillLineViewModel tdmillLineViewModel) {
            super(1, tdmillLineViewModel, TdmillLineViewModel.class, "insertResultLinesIntoDb", "insertResultLinesIntoDb(Lcom/huami/treadmill/data/Items;)V", 0);
        }

        public final void a(@Nullable Items<TdLine> items) {
            ((TdmillLineViewModel) this.receiver).g(items);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<TdLine> items) {
            a(items);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(TdmillLineViewModel tdmillLineViewModel) {
            super(0, tdmillLineViewModel, TdmillLineViewModel.class, "clearDbCache", "clearDbCache()V", 0);
        }

        public final void a() {
            ((TdmillLineViewModel) this.receiver).f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public TdmillLineViewModel(@NotNull TdmillRepository tdmillRepository) {
        this.repository = tdmillRepository;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.key = mutableLiveData;
        LiveData<Listing<TdLine>> map = Transformations.map(mutableLiveData, new Function() { // from class: tl7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillLineViewModel.j(this.a, (String) obj);
            }
        });
        this.repoResult = map;
        this.tdmillLines = Transformations.switchMap(map, new Function() { // from class: ul7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillLineViewModel.k((Listing) obj);
            }
        });
        this.networkState = Transformations.switchMap(map, new Function() { // from class: wl7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillLineViewModel.h((Listing) obj);
            }
        });
        this.refreshState = Transformations.switchMap(map, new Function() { // from class: vl7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillLineViewModel.i((Listing) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        TreadmillDb db = this.repository.getDb();
        if (db == null) {
            return;
        }
        db.lines().deleteLins();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Items<TdLine> body) {
        TreadmillDb db;
        if (body == null || (db = getRepository().getDb()) == null) {
            return;
        }
        TdlineDao tdlineDaoLines = db.lines();
        TdLine tdLineQueryLastLine = tdlineDaoLines.queryLastLine();
        int i = 0;
        int index = tdLineQueryLastLine == null ? 0 : tdLineQueryLastLine.getIndex();
        List<TdLine> items = body.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TdLine tdLine = (TdLine) obj;
            if (index != 0) {
                i += index + 1;
            }
            tdLine.setIndex(i);
            arrayList.add(tdLine);
            i = i2;
        }
        tdlineDaoLines.insert(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData h(Listing listing) {
        return listing.getNetworkState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData i(Listing listing) {
        return listing.getRefreshState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Listing j(TdmillLineViewModel tdmillLineViewModel, String str) {
        return tdmillLineViewModel.getRepository().getListing(tdmillLineViewModel.getRepository().getPagingDbSource(PageKey.TD_LINE), PageKey.TD_LINE, tdmillLineViewModel.new a(), new b(tdmillLineViewModel), new c(tdmillLineViewModel), tdmillLineViewModel.getRepository().getDb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData k(Listing listing) {
        return listing.getPagedList();
    }

    @Nullable
    public final String currentkey() {
        return this.key.getValue();
    }

    @NotNull
    public final LiveData<NetworkState> getNetworkState() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<NetworkState> getRefreshState() {
        return this.refreshState;
    }

    @NotNull
    public final TdmillRepository getRepository() {
        return this.repository;
    }

    @NotNull
    public final LiveData<PagedList<TdLine>> getTdmillLines() {
        return this.tdmillLines;
    }

    public final void refresh() {
        Function0<Unit> refresh;
        Listing<TdLine> value = this.repoResult.getValue();
        if (value == null || (refresh = value.getRefresh()) == null) {
            return;
        }
        refresh.invoke();
    }

    public final void retry() {
        Function0<Unit> retry;
        LiveData<Listing<TdLine>> liveData = this.repoResult;
        Listing<TdLine> value = liveData == null ? null : liveData.getValue();
        if (value == null || (retry = value.getRetry()) == null) {
            return;
        }
        retry.invoke();
    }

    public final boolean showLines(@NotNull String key) {
        if (Intrinsics.areEqual(this.key.getValue(), key)) {
            return false;
        }
        this.key.setValue(key);
        return true;
    }
}
