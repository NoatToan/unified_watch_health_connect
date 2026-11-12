package com.huami.treadmill.ui.tdmillhome;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.data.BoltRecordStatics;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.Listing;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.source.TdmillRepository;
import com.huami.treadmill.data.source.db.TdPromotionLineDao;
import com.huami.treadmill.data.source.db.TreadmillDb;
import com.huami.treadmill.paging.PageKey;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.tdmillhome.TdmillHmViewModel;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b3\u00104J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b!\u0010\"R0\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 %*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$0$0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R0\u0010+\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 %*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010)0)0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0019\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190#8F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0#8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0#8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010-R\u001f\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030)0#8F@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010-¨\u00065"}, d2 = {"Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdPromotionLine;", "body", "", "f", "e", "getBoltStatisticsInfo", "getNoOwnerNum", "getBindStatus", "", "isBinding", "setBindStatus", "", "key", "showLines", "Lcom/huami/treadmill/data/source/TdmillRepository;", "a", "Lcom/huami/treadmill/data/source/TdmillRepository;", "tdmillRepository", "b", "Ljava/lang/String;", "TAG", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/treadmill/data/BoltRecordStatics;", "c", "Landroidx/lifecycle/MutableLiveData;", "_boltRecordStatics", "", GoogleApiAvailabilityLight.a, "_not_upload", "_isBinding", "getKey", "()Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/treadmill/data/Listing;", "kotlin.jvm.PlatformType", "g", "Landroidx/lifecycle/LiveData;", "repoResult", "Landroidx/paging/PagedList;", "h", "_tdmillLines", "getBoltRecordStatics", "()Landroidx/lifecycle/LiveData;", "boltRecordStatics", "getNot_upload", "not_upload", "getTdmillLines", "tdmillLines", "<init>", "(Lcom/huami/treadmill/data/source/TdmillRepository;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillHmViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TdmillRepository tdmillRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String TAG = TdmillHmViewModel.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BoltRecordStatics> _boltRecordStatics = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _not_upload = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isBinding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> key;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Listing<TdPromotionLine>> repoResult;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<TdPromotionLine>> _tdmillLines;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/data/BoltRecordStatics;", "bolts", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<BoltRecordStatics, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull BoltRecordStatics boltRecordStatics) {
            TdmillHmViewModel.this._boltRecordStatics.setValue(boltRecordStatics);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BoltRecordStatics boltRecordStatics) {
            a(boltRecordStatics);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/treadmill/api/ApiResponse;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdPromotionLine;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, ApiResponse<Items<TdPromotionLine>>> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<TdPromotionLine>> invoke(@Nullable String str) {
            return TdmillHmViewModel.this.tdmillRepository.getTdmillApi().getPromotionLines();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Items<TdPromotionLine>, Unit> {
        public c(TdmillHmViewModel tdmillHmViewModel) {
            super(1, tdmillHmViewModel, TdmillHmViewModel.class, "insertResultLinesIntoDb", "insertResultLinesIntoDb(Lcom/huami/treadmill/data/Items;)V", 0);
        }

        public final void a(@Nullable Items<TdPromotionLine> items) {
            ((TdmillHmViewModel) this.receiver).f(items);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<TdPromotionLine> items) {
            a(items);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        public d(TdmillHmViewModel tdmillHmViewModel) {
            super(0, tdmillHmViewModel, TdmillHmViewModel.class, "clearDbCache", "clearDbCache()V", 0);
        }

        public final void a() {
            ((TdmillHmViewModel) this.receiver).e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public TdmillHmViewModel(@NotNull TdmillRepository tdmillRepository) {
        this.tdmillRepository = tdmillRepository;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        this._isBinding = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.key = mutableLiveData2;
        LiveData<Listing<TdPromotionLine>> map = Transformations.map(mutableLiveData2, new Function() { // from class: rl7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillHmViewModel.g(this.a, (String) obj);
            }
        });
        this.repoResult = map;
        this._tdmillLines = Transformations.switchMap(map, new Function() { // from class: sl7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillHmViewModel.c((Listing) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(Listing listing) {
        return listing.getPagedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        TreadmillDb db = this.tdmillRepository.getDb();
        if (db == null) {
            return;
        }
        db.promotionLines().deleteLins();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Items<TdPromotionLine> body) {
        TreadmillDb db;
        if (body == null || (db = this.tdmillRepository.getDb()) == null) {
            return;
        }
        TdPromotionLineDao tdPromotionLineDaoPromotionLines = db.promotionLines();
        TdPromotionLine tdPromotionLineQueryLastLine = tdPromotionLineDaoPromotionLines.queryLastLine();
        int i = 0;
        int index = tdPromotionLineQueryLastLine == null ? 0 : tdPromotionLineQueryLastLine.getIndex();
        List<TdPromotionLine> items = body.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TdPromotionLine tdPromotionLine = (TdPromotionLine) obj;
            if (index != 0) {
                i += index + 1;
            }
            tdPromotionLine.setIndex(i);
            arrayList.add(tdPromotionLine);
            i = i2;
        }
        tdPromotionLineDaoPromotionLines.insert(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Listing g(TdmillHmViewModel tdmillHmViewModel, String str) {
        TdmillRepository tdmillRepository = tdmillHmViewModel.tdmillRepository;
        return tdmillRepository.getListing(tdmillRepository.getPagingDbSource(PageKey.TD_PROMOTION_LINE), PageKey.TD_PROMOTION_LINE, tdmillHmViewModel.new b(), new c(tdmillHmViewModel), new d(tdmillHmViewModel), tdmillHmViewModel.tdmillRepository.getDb());
    }

    public final void getBindStatus() {
        this._isBinding.setValue(Boolean.valueOf(ProxyTreadmill.INSTANCE.getInstance().hasBoundBolt()));
    }

    @NotNull
    public final LiveData<BoltRecordStatics> getBoltRecordStatics() {
        return this._boltRecordStatics;
    }

    public final void getBoltStatisticsInfo() {
        ProxyBoltTrackRecord.INSTANCE.getInstance().getCurrentUserBoltRecordStatisticsInfo(new a());
    }

    @NotNull
    public final MutableLiveData<String> getKey() {
        return this.key;
    }

    public final void getNoOwnerNum() {
        Integer noOwnerNum = ProxyBoltTrackRecord.INSTANCE.getInstance().getNoOwnerNum();
        if (noOwnerNum == null) {
            return;
        }
        this._not_upload.setValue(Integer.valueOf(noOwnerNum.intValue()));
    }

    @NotNull
    public final LiveData<Integer> getNot_upload() {
        return this._not_upload;
    }

    @NotNull
    public final LiveData<PagedList<TdPromotionLine>> getTdmillLines() {
        return this._tdmillLines;
    }

    @NotNull
    public final LiveData<Boolean> isBinding() {
        return this._isBinding;
    }

    public final void setBindStatus(boolean isBinding) {
        this._isBinding.setValue(Boolean.valueOf(isBinding));
    }

    public final boolean showLines(@NotNull String key) {
        if (Intrinsics.areEqual(this.key.getValue(), key)) {
            return false;
        }
        this.key.setValue(key);
        return true;
    }
}
