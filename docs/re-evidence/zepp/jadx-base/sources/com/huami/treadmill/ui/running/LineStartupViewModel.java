package com.huami.treadmill.ui.running;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiSuccessResponse;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.source.TdmillRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/treadmill/ui/running/LineStartupViewModel;", "Landroidx/lifecycle/ViewModel;", "", "id", "time", "next", "", "getLineDetail", "Lcom/huami/treadmill/data/source/TdmillRepository;", "a", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "()Lcom/huami/treadmill/data/source/TdmillRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdLineDetail;", "b", "Landroidx/lifecycle/MutableLiveData;", "_lineDetail", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "lineDetail", "<init>", "(Lcom/huami/treadmill/data/source/TdmillRepository;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineStartupViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TdmillRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Items<TdLineDetail>> _lineDetail;

    public LineStartupViewModel(@NotNull TdmillRepository tdmillRepository) {
        this.repository = tdmillRepository;
        MutableLiveData<Items<TdLineDetail>> mutableLiveData = new MutableLiveData<>();
        CollectionsKt__CollectionsKt.emptyList();
        Unit unit = Unit.INSTANCE;
        this._lineDetail = mutableLiveData;
    }

    @NotNull
    public final LiveData<Items<TdLineDetail>> getLineDetail() {
        return this._lineDetail;
    }

    @NotNull
    public final TdmillRepository getRepository() {
        return this.repository;
    }

    public final void getLineDetail(long id, long time, long next) {
        this.repository.getLineDetail(id, time, next, new Callback<Items<TdLineDetail>>() { // from class: com.huami.treadmill.ui.running.LineStartupViewModel.getLineDetail.1
            @Override // com.huami.treadmill.api.Callback
            public void onFailure(@NotNull String message) {
            }

            @Override // com.huami.treadmill.api.Callback
            public void onResponse(@NotNull ApiResponse<Items<TdLineDetail>> response) {
                if (response instanceof ApiSuccessResponse) {
                    LineStartupViewModel.this._lineDetail.setValue(((ApiSuccessResponse) response).getBody());
                }
            }
        });
    }
}
