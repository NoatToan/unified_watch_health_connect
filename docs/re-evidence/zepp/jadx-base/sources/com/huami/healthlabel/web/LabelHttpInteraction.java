package com.huami.healthlabel.web;

import androidx.annotation.WorkerThread;
import com.alipay.sdk.m.s.a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.y;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003J\u001e\u0010\u000b\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u001a\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\fH\u0002J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/healthlabel/web/LabelHttpInteraction;", "Lcom/huami/healthlabel/web/HttpInteraction;", "", "url", "", "", "queryParams", "Lcom/huami/network/base/model/Support$RequestSupport;", "method", "Lcom/huami/network/base/model/HMHttpResponseData;", "b", GoogleApiAvailabilityLight.a, "Lkotlin/Pair;", "Lcom/huami/network/base/handler/IHMHttpResponseHandler;", "", "a", "params", "Lcom/huami/healthlabel/web/Response;", "get", "body", "Lcom/huami/healthlabel/web/ContentType;", CameraActivity.KEY_CONTENT_TYPE, DataItem.HTTP_METHOD_POST, "delete", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class LabelHttpInteraction implements HttpInteraction {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Support.RequestSupport.values().length];
            iArr[Support.RequestSupport.POST.ordinal()] = 1;
            iArr[Support.RequestSupport.PUT.ordinal()] = 2;
            iArr[Support.RequestSupport.DELETE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> a() {
        final ArrayList arrayList = new ArrayList();
        return new Pair<>(new IHMHttpResponseHandler() { // from class: com.huami.healthlabel.web.LabelHttpInteraction$createHttpResponseHandler$responseHandler$1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int reason) {
                Throwable accountException;
                HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
                hMHttpResponseData.setStatusCode(-2);
                if (reason == 1) {
                    accountException = new AccountException("登录信息不可用");
                } else if (reason == 2) {
                    accountException = new AccountException("登录过期");
                } else if (reason == 3) {
                    accountException = new AccountException("互斥登录");
                } else if (reason == 4) {
                    accountException = new NetworkNotConnectedException();
                } else if (reason != 5) {
                    accountException = new RuntimeException("网络请求被取消了，原因未知，错误码：" + reason);
                } else {
                    accountException = new AccountException("清除数据/注销帐号");
                }
                hMHttpResponseData.setError(accountException);
                arrayList.add(hMHttpResponseData);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
                HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
                hMHttpResponseData.setStatusCode(-1);
                hMHttpResponseData.setError(throwable);
                arrayList.add(hMHttpResponseData);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@NotNull HMHttpResponseData item) {
                arrayList.add(item);
            }
        }, arrayList);
    }

    @WorkerThread
    private final HMHttpResponseData b(String url, Map<String, ? extends Object> queryParams, Support.RequestSupport method) {
        String str;
        Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> pairA = a();
        IHMHttpResponseHandler iHMHttpResponseHandlerComponent1 = pairA.component1();
        List<HMHttpResponseData> listComponent2 = pairA.component2();
        int i = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            String strD = d(queryParams);
            if (strD.length() == 0) {
                str = "";
            } else {
                str = "?" + strD;
            }
            url = url + ((Object) str);
            queryParams = null;
        }
        HMWebUtil.doRequest(url, queryParams, method, true, iHMHttpResponseHandlerComponent1);
        return listComponent2.get(0);
    }

    public static /* synthetic */ HMHttpResponseData c(LabelHttpInteraction labelHttpInteraction, String str, Map map, Support.RequestSupport requestSupport, int i, Object obj) {
        if ((i & 4) != 0) {
            requestSupport = Support.RequestSupport.GET;
        }
        return labelHttpInteraction.b(str, map, requestSupport);
    }

    private final String d(Map<String, ? extends Object> queryParams) {
        if (queryParams == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : queryParams.entrySet()) {
            arrayList.add(entry.getKey() + SearchCriteria.EQ + entry.getValue().toString());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, a.l, null, null, 0, null, null, 62, null);
    }

    @Override // com.huami.healthlabel.web.HttpInteraction
    @NotNull
    public Response delete(@NotNull String url, @NotNull Map<String, String> params) {
        HMHttpResponseData hMHttpResponseDataB = b(url, params, Support.RequestSupport.DELETE);
        return new Response(hMHttpResponseDataB.getStatusCode(), hMHttpResponseDataB.getResponseString(), hMHttpResponseDataB.getError());
    }

    @Override // com.huami.healthlabel.web.HttpInteraction
    @NotNull
    public Response get(@NotNull String url, @NotNull Map<String, String> params) {
        HMHttpResponseData hMHttpResponseDataC = c(this, url, params, null, 4, null);
        return new Response(hMHttpResponseDataC.getStatusCode(), hMHttpResponseDataC.getResponseString(), hMHttpResponseDataC.getError());
    }

    @Override // com.huami.healthlabel.web.HttpInteraction
    @NotNull
    public Response post(@NotNull String url, @NotNull String body, @NotNull ContentType contentType) {
        Set of = y.setOf((Object[]) new String[]{body, contentType.getValue()});
        Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> pairA = a();
        IHMHttpResponseHandler iHMHttpResponseHandlerComponent1 = pairA.component1();
        List<HMHttpResponseData> listComponent2 = pairA.component2();
        HMWebUtil.doSeparateRequest(url, of, Support.RequestSupport.POST, true, true, iHMHttpResponseHandlerComponent1, new HMHttpConfig[0]);
        HMHttpResponseData hMHttpResponseData = listComponent2.get(0);
        return new Response(hMHttpResponseData.getStatusCode(), hMHttpResponseData.getResponseString(), hMHttpResponseData.getError());
    }
}
