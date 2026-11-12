package com.huami.sleepassistant.apilib.utils.ext;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.android.vo.Resource;
import com.huami.sleepassistant.apilib.helper.PagingRequestHelper;
import com.huami.sleepassistant.apilib.utils.ext.PagingRequestHelperExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0016\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/huami/sleepassistant/apilib/helper/PagingRequestHelper$StatusReport;", PointCategory.REPORT, "", "c", "Lcom/huami/sleepassistant/apilib/helper/PagingRequestHelper;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "createStatusLiveData", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class PagingRequestHelperExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableLiveData mutableLiveData, PagingRequestHelper.StatusReport statusReport) {
        if (statusReport.hasRunning()) {
            mutableLiveData.postValue(Resource.INSTANCE.loading(null));
        } else if (statusReport.hasError()) {
            mutableLiveData.postValue(Resource.INSTANCE.error(c(statusReport), null));
        } else {
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
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
    public static final LiveData<Resource<Unit>> createStatusLiveData(@NotNull PagingRequestHelper pagingRequestHelper) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        pagingRequestHelper.addListener(new PagingRequestHelper.Listener() { // from class: gr5
            @Override // com.huami.sleepassistant.apilib.helper.PagingRequestHelper.Listener
            public final void onStatusChange(PagingRequestHelper.StatusReport statusReport) {
                PagingRequestHelperExtKt.b(mutableLiveData, statusReport);
            }
        });
        return mutableLiveData;
    }
}
