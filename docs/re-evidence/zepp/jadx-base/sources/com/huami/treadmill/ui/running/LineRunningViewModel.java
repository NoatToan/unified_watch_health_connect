package com.huami.treadmill.ui.running;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiSuccessResponse;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.data.source.TdmillRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001f\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/treadmill/ui/running/LineRunningViewModel;", "Landroidx/lifecycle/ViewModel;", "", "id", "time", "next", "", "getLineDetail", "getOriginLine", "Lcom/huami/treadmill/data/source/TdmillRepository;", "a", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "()Lcom/huami/treadmill/data/source/TdmillRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdLineDetail;", "b", "Landroidx/lifecycle/MutableLiveData;", "_lineDetail", "Lcom/huami/treadmill/data/TdLineDetailRun;", "c", "_orginLine", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "lineDetail", "getOrginLine", "orginLine", "<init>", "(Lcom/huami/treadmill/data/source/TdmillRepository;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineRunningViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TdmillRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Items<TdLineDetail>> _lineDetail;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TdLineDetailRun> _orginLine;

    public LineRunningViewModel(@NotNull TdmillRepository tdmillRepository) {
        this.repository = tdmillRepository;
        MutableLiveData<Items<TdLineDetail>> mutableLiveData = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        Unit unit = Unit.INSTANCE;
        this._lineDetail = mutableLiveData;
        MutableLiveData<TdLineDetailRun> mutableLiveData2 = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        this._orginLine = mutableLiveData2;
    }

    @NotNull
    public final LiveData<Items<TdLineDetail>> getLineDetail() {
        return this._lineDetail;
    }

    @NotNull
    public final LiveData<TdLineDetailRun> getOrginLine() {
        return this._orginLine;
    }

    public final void getOriginLine(long id) {
        this.repository.getOriginLine(id, new Callback<TdLineDetailRun>() { // from class: com.huami.treadmill.ui.running.LineRunningViewModel.getOriginLine.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<TdLineDetailRun> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineRunningViewModel.this._orginLine.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }

    @NotNull
    public final TdmillRepository getRepository() {
        return this.repository;
    }

    public final void getLineDetail(long id, long time, long next) {
        this.repository.getLineDetail(id, time, next, new Callback<Items<TdLineDetail>>() { // from class: com.huami.treadmill.ui.running.LineRunningViewModel.getLineDetail.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<Items<TdLineDetail>> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineRunningViewModel.this._lineDetail.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }
}
