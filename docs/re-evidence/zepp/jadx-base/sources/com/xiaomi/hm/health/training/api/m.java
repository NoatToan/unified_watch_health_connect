package com.xiaomi.hm.health.training.api;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.xiaomi.hm.health.training.api.exception.AccountException;
import com.xiaomi.hm.health.training.api.exception.NetworkNotConnectedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes21.dex */
class m {
    private static Gson a;

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData[] a;

        public a(HMHttpResponseData[] hMHttpResponseDataArr) {
            this.a = hMHttpResponseDataArr;
        }

        private RuntimeException a(int i) {
            if (i == 1) {
                return new AccountException("登录信息不可用");
            }
            if (i == 2) {
                return new AccountException("登录过期");
            }
            if (i == 3) {
                return new AccountException("互斥登录");
            }
            if (i == 4) {
                return new NetworkNotConnectedException();
            }
            if (i == 5) {
                return new AccountException("清除数据/注销帐号");
            }
            return new RuntimeException("网络请求被取消了，原因未知，错误码：" + i);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
            hMHttpResponseData.setStatusCode(-2);
            hMHttpResponseData.setError(a(i));
            this.a[0] = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
            hMHttpResponseData.setStatusCode(-1);
            hMHttpResponseData.setError(th);
            this.a[0] = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            this.a[0] = hMHttpResponseData;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Support.RequestSupport.values().length];
            a = iArr;
            try {
                iArr[Support.RequestSupport.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Support.RequestSupport.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Support.RequestSupport.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static Pair<IHMHttpResponseHandler, HMHttpResponseData[]> a() {
        HMHttpResponseData[] hMHttpResponseDataArr = new HMHttpResponseData[1];
        return new Pair<>(new a(hMHttpResponseDataArr), hMHttpResponseDataArr);
    }

    public static Gson b() {
        if (a == null) {
            a = new GsonBuilder().create();
        }
        return a;
    }

    @NonNull
    @WorkerThread
    private static HMHttpResponseData c(@NonNull String str, @NonNull String str2, @NonNull Support.RequestSupport requestSupport) {
        HashSet hashSet = new HashSet();
        hashSet.add(str2);
        hashSet.add("application/json");
        Pair<IHMHttpResponseHandler, HMHttpResponseData[]> pairA = a();
        IHMHttpResponseHandler iHMHttpResponseHandler = (IHMHttpResponseHandler) pairA.first;
        HMHttpResponseData[] hMHttpResponseDataArr = (HMHttpResponseData[]) pairA.second;
        HMWebUtil.doSeparateRequest(str, hashSet, requestSupport, true, true, iHMHttpResponseHandler, new HMHttpConfig[0]);
        return hMHttpResponseDataArr[0];
    }

    @NonNull
    @WorkerThread
    public static HMHttpResponseData d(@NonNull String str, @NonNull String str2) {
        return c(str, str2, Support.RequestSupport.POST);
    }

    @NonNull
    @WorkerThread
    public static HMHttpResponseData e(@NonNull String str, @NonNull String str2) {
        return c(str, str2, Support.RequestSupport.PUT);
    }

    @NonNull
    @WorkerThread
    public static HMHttpResponseData f(@NonNull String str, @Nullable Map<String, Object> map, @NonNull Support.RequestSupport requestSupport) {
        Pair<IHMHttpResponseHandler, HMHttpResponseData[]> pairA = a();
        IHMHttpResponseHandler iHMHttpResponseHandler = (IHMHttpResponseHandler) pairA.first;
        HMHttpResponseData[] hMHttpResponseDataArr = (HMHttpResponseData[]) pairA.second;
        int i = b.a[requestSupport.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            String strG = g(map);
            if (!strG.isEmpty()) {
                str = str + "?" + strG;
            }
            map = null;
        }
        HMWebUtil.doRequest(str, map, requestSupport, true, iHMHttpResponseHandler);
        return hMHttpResponseDataArr[0];
    }

    @NonNull
    private static String g(@Nullable Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + SearchCriteria.EQ + String.valueOf(entry.getValue()));
        }
        return TextUtils.join(com.alipay.sdk.m.s.a.l, arrayList);
    }
}
