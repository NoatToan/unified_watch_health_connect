package com.huami.homepage.promotion.net;

import androidx.annotation.WorkerThread;
import com.alipay.sdk.m.s.a;
import com.fasterxml.jackson.core.JsonFactory;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u001a\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\nH\u0002J\u001e\u0010\u000e\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007¨\u0006\u0013"}, d2 = {"Lcom/huami/homepage/promotion/net/WebUtils;", "", "", "url", "", "queryParams", "Lcom/huami/network/base/model/Support$RequestSupport;", "method", "Lcom/huami/network/base/model/HMHttpResponseData;", "b", "Lkotlin/Pair;", "Lcom/huami/network/base/handler/IHMHttpResponseHandler;", "", "a", "c", "get", "<init>", "()V", "ContentType", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class WebUtils {

    @NotNull
    public static final WebUtils INSTANCE = new WebUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huami/homepage/promotion/net/WebUtils$ContentType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", JsonFactory.FORMAT_NAME_JSON, "TEXT", "promotion_release"}, k = 1, mv = {1, 5, 1})
    public enum ContentType {
        JSON("application/json"),
        TEXT("text/plain");


        @NotNull
        private final String value;

        ContentType(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

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

    private WebUtils() {
    }

    private final Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> a() {
        final ArrayList arrayList = new ArrayList();
        return new Pair<>(new IHMHttpResponseHandler() { // from class: com.huami.homepage.promotion.net.WebUtils$createHttpResponseHandler$responseHandler$1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int reason) {
                RuntimeException runtimeException;
                HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
                hMHttpResponseData.setStatusCode(-2);
                if (reason == 1) {
                    runtimeException = new RuntimeException("登录信息不可用");
                } else if (reason == 2) {
                    runtimeException = new RuntimeException("登录过期");
                } else if (reason == 3) {
                    runtimeException = new RuntimeException("互斥登录");
                } else if (reason == 4) {
                    runtimeException = new RuntimeException();
                } else if (reason != 5) {
                    runtimeException = new RuntimeException("网络请求被取消了，原因未知，错误码：" + reason);
                } else {
                    runtimeException = new RuntimeException("清除数据/注销帐号");
                }
                hMHttpResponseData.setError(runtimeException);
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
            String strC = c(queryParams);
            if (strC.length() == 0) {
                str = "";
            } else {
                str = "?" + strC;
            }
            url = url + ((Object) str);
            queryParams = null;
        }
        HMWebUtil.doRequest(url, queryParams, method, true, iHMHttpResponseHandlerComponent1);
        return listComponent2.get(0);
    }

    private final String c(Map<String, ? extends Object> queryParams) {
        if (queryParams == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : queryParams.entrySet()) {
            arrayList.add(entry.getKey() + SearchCriteria.EQ + entry.getValue().toString());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, a.l, null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMHttpResponseData get$default(WebUtils webUtils, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return webUtils.get(str, map);
    }

    @WorkerThread
    @NotNull
    public final HMHttpResponseData get(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams) {
        return b(url, queryParams, Support.RequestSupport.GET);
    }
}
