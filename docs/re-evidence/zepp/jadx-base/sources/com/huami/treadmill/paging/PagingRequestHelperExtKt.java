package com.huami.treadmill.paging;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.treadmill.data.NetworkState;
import com.huami.treadmill.paging.PagingRequestHelper;
import com.huami.treadmill.paging.PagingRequestHelperExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004*\u0016\u0010\n\"\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/paging/PagingRequestHelper$StatusReport;", PointCategory.REPORT, "", "c", "Lcom/huami/treadmill/paging/PagingRequestHelper;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/treadmill/data/NetworkState;", "createStatusLiveData", "Lkotlin/Function0;", "", "ClearDataInDb", "treadmill_release"}, k = 2, mv = {1, 5, 1})
public final class PagingRequestHelperExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableLiveData mutableLiveData, PagingRequestHelper.StatusReport statusReport) {
        if (statusReport.hasRunning()) {
            mutableLiveData.postValue(NetworkState.INSTANCE.getLOADING());
        } else if (statusReport.hasError()) {
            mutableLiveData.postValue(NetworkState.INSTANCE.error(c(statusReport)));
        } else {
            mutableLiveData.postValue(NetworkState.INSTANCE.getLOADED());
        }
    }

    private static final String c(PagingRequestHelper.StatusReport statusReport) {
        PagingRequestHelper.RequestType[] requestTypeArrValues = PagingRequestHelper.RequestType.values();
        ArrayList arrayList = new ArrayList();
        for (PagingRequestHelper.RequestType requestType : requestTypeArrValues) {
            Throwable errorFor = statusReport.getErrorFor(requestType);
            String message = errorFor == null ? null : errorFor.getMessage();
            if (message != null) {
                arrayList.add(message);
            }
        }
        return (String) CollectionsKt.first((List) arrayList);
    }

    @NotNull
    public static final LiveData<NetworkState> createStatusLiveData(@NotNull PagingRequestHelper pagingRequestHelper) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        pagingRequestHelper.addListener(new PagingRequestHelper.Listener() { // from class: ir5
            @Override // com.huami.treadmill.paging.PagingRequestHelper.Listener
            public final void onStatusChange(PagingRequestHelper.StatusReport statusReport) {
                PagingRequestHelperExtKt.b(mutableLiveData, statusReport);
            }
        });
        return mutableLiveData;
    }
}
