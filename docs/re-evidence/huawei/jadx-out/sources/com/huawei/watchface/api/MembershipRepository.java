package com.huawei.watchface.api;

import com.huawei.watchface.mvp.model.datatype.BatchReportResp;
import com.huawei.watchface.mvp.model.datatype.ResApplyRecord;
import com.huawei.watchface.mvp.model.datatype.orderhistory.OrderHistoryRequestModel;
import com.huawei.watchface.mvp.model.datatype.orderhistory.OrderHistoryResponse;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.mvp.model.thread.OrderHistoryRequest;
import com.huawei.watchface.mvp.model.thread.QueryAllRequest;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.y;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class MembershipRepository {
    public static void getOrderHistoryResponse(final List<OrderHistoryRequestModel> list, final ResponseListener<OrderHistoryResponse> responseListener) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.MembershipRepository$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MembershipRepository.lambda$getOrderHistoryResponse$0(list, responseListener);
            }
        });
    }

    public static void getQueryAll(ResponseListener<QuerySubInfoDetailResp> responseListener) {
        new QueryAllRequest(responseListener);
    }

    static /* synthetic */ void lambda$getOrderHistoryResponse$0(List list, ResponseListener responseListener) {
        OrderHistoryRequest orderHistoryRequest = new OrderHistoryRequest();
        OrderHistoryResponse orderHistoryResponseB = orderHistoryRequest.b(orderHistoryRequest.b(list));
        if (orderHistoryResponseB != null) {
            responseListener.onResponse(orderHistoryResponseB);
        } else {
            HwLog.e("OrderHistoryResponse", "could not get any response");
            responseListener.onError();
        }
    }

    public static void postBatchReport(List<ResApplyRecord> list, ResponseListener<BatchReportResp> responseListener) {
        new y(list, responseListener);
    }
}
