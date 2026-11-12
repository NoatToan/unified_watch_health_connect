package com.huami.femalehealth.logiclib.api;

import androidx.annotation.WorkerThread;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b \u0010!J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u001a\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000eH\u0002J\u001e\u0010\u0012\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0002J0\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J(\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007J(\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR.\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u000e0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/WebUtils;", "", "", "url", "", "queryParams", "Lcom/huami/network/base/model/Support$RequestSupport;", "method", "Lcom/huami/network/base/model/HMHttpResponseData;", GoogleApiAvailabilityLight.a, "body", "Lcom/huami/femalehealth/logiclib/api/WebUtils$ContentType;", CameraActivity.KEY_CONTENT_TYPE, "c", "Lkotlin/Pair;", "Lcom/huami/network/base/handler/IHMHttpResponseHandler;", "", "a", "e", "", "aging", "getFromCatch", "get", DataItem.HTTP_METHOD_POST, DataItem.HTTP_METHOD_PUT, "delete", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "catch", "<init>", "()V", "ContentType", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class WebUtils {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WebUtils";

    @NotNull
    public static final WebUtils INSTANCE = new WebUtils();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<String, Pair<Long, HMHttpResponseData>> catch = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/WebUtils$ContentType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", JsonFactory.FORMAT_NAME_JSON, "TEXT", "logiclib_release"}, k = 1, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, String str) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "from web because time out (" + (this.a - this.b) + ")-> " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("time change no catch -> ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("from catch -> ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("from web because no catch -> ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("web request time:", Long.valueOf(this.a - this.b));
        }
    }

    private WebUtils() {
    }

    private final Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> a() {
        final ArrayList arrayList = new ArrayList();
        return new Pair<>(new IHMHttpResponseHandler() { // from class: com.huami.femalehealth.logiclib.api.WebUtils$createHttpResponseHandler$responseHandler$1
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
                } else if (reason != 4) {
                    accountException = reason != 5 ? new RuntimeException(Intrinsics.stringPlus("网络请求被取消了，原因未知，错误码：", Integer.valueOf(reason))) : new AccountException("清除数据/注销帐号");
                } else {
                    accountException = new NetworkNotConnectedException();
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

    private static final String b(String str, Map<String, ? extends Object> map) {
        StringBuilder sb = new StringBuilder(str);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(entry.getValue().toString());
            }
        }
        return sb.toString();
    }

    @WorkerThread
    private final HMHttpResponseData c(String url, String body, ContentType contentType, Support.RequestSupport method) {
        Set of = y.setOf((Object[]) new String[]{body, contentType.getValue()});
        Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> pairA = a();
        IHMHttpResponseHandler iHMHttpResponseHandlerComponent1 = pairA.component1();
        List<HMHttpResponseData> listComponent2 = pairA.component2();
        HMWebUtil.doSeparateRequest(url, of, method, true, true, iHMHttpResponseHandlerComponent1, new HMHttpConfig[0]);
        return listComponent2.get(0);
    }

    @WorkerThread
    private final HMHttpResponseData d(String url, Map<String, ? extends Object> queryParams, Support.RequestSupport method) {
        Pair<IHMHttpResponseHandler, List<HMHttpResponseData>> pairA = a();
        IHMHttpResponseHandler iHMHttpResponseHandlerComponent1 = pairA.component1();
        List<HMHttpResponseData> listComponent2 = pairA.component2();
        int i = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            String strE = e(queryParams);
            url = Intrinsics.stringPlus(url, strE.length() == 0 ? "" : Intrinsics.stringPlus("?", strE));
            queryParams = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMWebUtil.doRequest(url, queryParams, method, true, iHMHttpResponseHandlerComponent1);
        HMLog.warn$default("xys", null, new e(System.currentTimeMillis(), jCurrentTimeMillis), 2, null);
        return listComponent2.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMHttpResponseData delete$default(WebUtils webUtils, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return webUtils.delete(str, map);
    }

    private final String e(Map<String, ? extends Object> queryParams) {
        if (queryParams == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : queryParams.entrySet()) {
            arrayList.add(entry.getKey() + com.alipay.sdk.m.n.a.h + entry.getValue().toString());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, com.alipay.sdk.m.s.a.l, null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMHttpResponseData get$default(WebUtils webUtils, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return webUtils.get(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMHttpResponseData getFromCatch$default(WebUtils webUtils, String str, Map map, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return webUtils.getFromCatch(str, map, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMHttpResponseData put$default(WebUtils webUtils, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return webUtils.put(str, map);
    }

    @WorkerThread
    @NotNull
    public final HMHttpResponseData delete(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams) {
        return d(url, queryParams, Support.RequestSupport.DELETE);
    }

    @WorkerThread
    @NotNull
    public final HMHttpResponseData get(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams) {
        return d(url, queryParams, Support.RequestSupport.GET);
    }

    @WorkerThread
    @NotNull
    public final synchronized HMHttpResponseData getFromCatch(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams, long aging) {
        HMHttpResponseData hMHttpResponseDataD;
        Long first;
        String strB = b(url, queryParams);
        ConcurrentHashMap<String, Pair<Long, HMHttpResponseData>> concurrentHashMap = catch;
        if (concurrentHashMap.get(strB) != null) {
            Pair<Long, HMHttpResponseData> pair = concurrentHashMap.get(strB);
            long jLongValue = (pair == null || (first = pair.getFirst()) == null) ? 0L : first.longValue();
            hMHttpResponseDataD = pair == null ? null : pair.getSecond();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > aging) {
                HMLog.debug("xys_WebUtils", new a(jCurrentTimeMillis, jLongValue, url));
                hMHttpResponseDataD = d(url, queryParams, Support.RequestSupport.GET);
                concurrentHashMap.put(strB, TuplesKt.to(Long.valueOf(System.currentTimeMillis()), hMHttpResponseDataD));
            } else if (jLongValue - jCurrentTimeMillis > 0) {
                concurrentHashMap.clear();
                HMLog.debug("xys_WebUtils", new b(url));
                hMHttpResponseDataD = d(url, queryParams, Support.RequestSupport.GET);
                concurrentHashMap.put(strB, TuplesKt.to(Long.valueOf(System.currentTimeMillis()), hMHttpResponseDataD));
            } else {
                HMLog.debug("xys_WebUtils", new c(url));
            }
        } else {
            HMLog.debug("xys_WebUtils", new d(url));
            hMHttpResponseDataD = d(url, queryParams, Support.RequestSupport.GET);
            concurrentHashMap.put(strB, TuplesKt.to(Long.valueOf(System.currentTimeMillis()), hMHttpResponseDataD));
        }
        return hMHttpResponseDataD;
    }

    @WorkerThread
    @NotNull
    public final HMHttpResponseData post(@NotNull String url, @NotNull String body, @NotNull ContentType contentType) {
        return c(url, body, contentType, Support.RequestSupport.POST);
    }

    @WorkerThread
    @NotNull
    public final HMHttpResponseData put(@NotNull String url, @NotNull String body, @NotNull ContentType contentType) {
        return c(url, body, contentType, Support.RequestSupport.PUT);
    }

    @WorkerThread
    @NotNull
    public final HMHttpResponseData put(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams) {
        return d(url, queryParams, Support.RequestSupport.PUT);
    }
}
