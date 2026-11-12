package com.huami.treadmill.ui.linedetail;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiSuccessResponse;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.TdRankingItem;
import com.huami.treadmill.data.TdRankingList;
import com.huami.treadmill.data.source.TdmillRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R.\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0019\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120+8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010,R\u0019\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120+8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010,R\u001f\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180+8F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010,R\u0019\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0+8F@\u0006¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00064"}, d2 = {"Lcom/huami/treadmill/ui/linedetail/LineDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "id", "", "getDiligentRanks", "getSpeedRanks", "time", "next", "getLineDetail", "getPromotionLinesDetail", "Lcom/huami/treadmill/data/source/TdmillRepository;", "a", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "()Lcom/huami/treadmill/data/source/TdmillRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/treadmill/data/TdRankingList;", "b", "Landroidx/lifecycle/MutableLiveData;", "_diligentRanks", "c", "_speedRanks", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdLineDetail;", GoogleApiAvailabilityLight.a, "_lineDetail", "Lcom/huami/treadmill/data/TdPromotionLine;", "e", "_promotionLineDetail", "", "Lcom/huami/treadmill/data/TdRankingItem;", "f", "getMeSpeedRank", "()Landroidx/lifecycle/MutableLiveData;", "setMeSpeedRank", "(Landroidx/lifecycle/MutableLiveData;)V", "meSpeedRank", "g", "getMeDiligentRank", "setMeDiligentRank", "meDiligentRank", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "diligentRanks", "speedRanks", "lineDetail", "getPromotionLineDetail", "promotionLineDetail", "<init>", "(Lcom/huami/treadmill/data/source/TdmillRepository;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TdmillRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TdRankingList> _diligentRanks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TdRankingList> _speedRanks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Items<TdLineDetail>> _lineDetail;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TdPromotionLine> _promotionLineDetail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<List<TdRankingItem>> meSpeedRank;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<List<TdRankingItem>> meDiligentRank;

    public LineDetailViewModel(@NotNull TdmillRepository tdmillRepository) {
        this.repository = tdmillRepository;
        MutableLiveData<TdRankingList> mutableLiveData = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        Unit unit = Unit.INSTANCE;
        this._diligentRanks = mutableLiveData;
        MutableLiveData<TdRankingList> mutableLiveData2 = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        this._speedRanks = mutableLiveData2;
        MutableLiveData<Items<TdLineDetail>> mutableLiveData3 = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        this._lineDetail = mutableLiveData3;
        MutableLiveData<TdPromotionLine> mutableLiveData4 = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        this._promotionLineDetail = mutableLiveData4;
        this.meSpeedRank = new MutableLiveData<>();
        this.meDiligentRank = new MutableLiveData<>();
    }

    @NotNull
    public final LiveData<TdRankingList> getDiligentRanks() {
        return this._diligentRanks;
    }

    @NotNull
    public final LiveData<Items<TdLineDetail>> getLineDetail() {
        return this._lineDetail;
    }

    @NotNull
    public final MutableLiveData<List<TdRankingItem>> getMeDiligentRank() {
        return this.meDiligentRank;
    }

    @NotNull
    public final MutableLiveData<List<TdRankingItem>> getMeSpeedRank() {
        return this.meSpeedRank;
    }

    @NotNull
    public final LiveData<TdPromotionLine> getPromotionLineDetail() {
        return this._promotionLineDetail;
    }

    public final void getPromotionLinesDetail(long id) {
        this.repository.getPromotionLinesDetail(id, new Callback<TdPromotionLine>() { // from class: com.huami.treadmill.ui.linedetail.LineDetailViewModel.getPromotionLinesDetail.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<TdPromotionLine> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineDetailViewModel.this._promotionLineDetail.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }

    @NotNull
    public final TdmillRepository getRepository() {
        return this.repository;
    }

    @NotNull
    public final LiveData<TdRankingList> getSpeedRanks() {
        return this._speedRanks;
    }

    public final void setMeDiligentRank(@NotNull MutableLiveData<List<TdRankingItem>> mutableLiveData) {
        this.meDiligentRank = mutableLiveData;
    }

    public final void setMeSpeedRank(@NotNull MutableLiveData<List<TdRankingItem>> mutableLiveData) {
        this.meSpeedRank = mutableLiveData;
    }

    public final void getDiligentRanks(long id) {
        this.repository.getDiligentRank(id, new Callback<TdRankingList>() { // from class: com.huami.treadmill.ui.linedetail.LineDetailViewModel.getDiligentRanks.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<TdRankingList> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineDetailViewModel.this._diligentRanks.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }

    public final void getLineDetail(long id, long time, long next) {
        this.repository.getLineDetail(id, time, next, new Callback<Items<TdLineDetail>>() { // from class: com.huami.treadmill.ui.linedetail.LineDetailViewModel.getLineDetail.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<Items<TdLineDetail>> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineDetailViewModel.this._lineDetail.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }

    public final void getSpeedRanks(long id) {
        this.repository.getSpeedRank(id, new Callback<TdRankingList>() { // from class: com.huami.treadmill.ui.linedetail.LineDetailViewModel.getSpeedRanks.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<TdRankingList> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineDetailViewModel.this._speedRanks.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }
}
