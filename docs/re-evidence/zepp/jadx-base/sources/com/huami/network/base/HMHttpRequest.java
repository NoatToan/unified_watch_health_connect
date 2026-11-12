package com.huami.network.base;

import com.huami.network.base.callback.IHMHttpCallback;
import com.huami.network.base.exception.OnItemErrorException;
import com.huami.network.base.framework.HMHttpFramework;
import com.huami.network.base.framework.asynchttp.AsyncHttpFramework;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMFileDownloadResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class HMHttpRequest {
    private static final String c = "HMHttpRequest";
    private static HMHttpRequest d;
    private HMHttpFramework a = new AsyncHttpFramework();
    private IHMHttpCallback b;

    public class a implements Observer<HMHttpResponseData> {
        public final /* synthetic */ IHMBasicHttpResponseHandler a;
        public final /* synthetic */ List b;

        public a(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, List list) {
            this.a = iHMBasicHttpResponseHandler;
            this.b = list;
        }

        private HMHttpRequestData a(HMHttpResponseData hMHttpResponseData) {
            for (HMHttpRequestData hMHttpRequestData : this.b) {
                if (hMHttpRequestData != null && hMHttpRequestData.getTag().equals(hMHttpResponseData.getTag())) {
                    return hMHttpRequestData;
                }
            }
            return null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(HMHttpResponseData hMHttpResponseData) {
            if (HMHttpRequest.this.b != null) {
                HMHttpRequest.this.b.log(hMHttpResponseData);
            }
            if ((HMHttpRequest.this.b == null || !HMHttpRequest.this.b.needCancelBeforeResponse(a(hMHttpResponseData), hMHttpResponseData, this.a)) && this.a != null) {
                if (hMHttpResponseData.isSuccess()) {
                    this.a.onSuccess(hMHttpResponseData);
                } else {
                    this.a.onFailure(hMHttpResponseData);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            HMLog.e(HMHttpRequest.c, ">>>> onCompleted <<<<", new Object[0]);
            IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler = this.a;
            if (iHMBasicHttpResponseHandler != null) {
                iHMBasicHttpResponseHandler.onCompleted();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            HMLog.e(HMHttpRequest.c, ">>>> onError <<<<", new Object[0]);
            if (th != null) {
                HMLog.e(HMHttpRequest.c, th.toString(), new Object[0]);
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    HMLog.e(HMHttpRequest.c, stackTraceElement.toString(), new Object[0]);
                }
            }
            IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler = this.a;
            if (iHMBasicHttpResponseHandler != null) {
                iHMBasicHttpResponseHandler.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    private HMHttpRequest() {
    }

    private Scheduler c(boolean z) {
        if (z) {
            return Schedulers.trampoline();
        }
        return HMHttpUtils.isMainThread() ? AndroidSchedulers.mainThread() : Schedulers.trampoline();
    }

    public static HMHttpResponseData createFailureResponse(HMHttpRequestData hMHttpRequestData) {
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        if (hMHttpRequestData == null) {
            hMHttpResponseData.setUrl("");
            hMHttpResponseData.setTag("");
        } else {
            hMHttpResponseData.setUrl(hMHttpRequestData.getUrl());
            hMHttpResponseData.setTag(hMHttpRequestData.getTag());
        }
        hMHttpResponseData.setResponseBody(null);
        hMHttpResponseData.setStatusCode(0);
        hMHttpResponseData.setSuccess(false);
        hMHttpResponseData.setHeader(null);
        hMHttpResponseData.setError(new Exception("Http request interrupt."));
        return hMHttpResponseData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(Map map, boolean z, HMHttpConfig[] hMHttpConfigArr, HMHttpRequestData hMHttpRequestData) throws Exception {
        return Observable.fromArray(e(map, z, hMHttpRequestData, hMHttpConfigArr));
    }

    private HMHttpResponseData e(Map<String, String> map, boolean z, HMHttpRequestData hMHttpRequestData, HMHttpConfig... hMHttpConfigArr) {
        if (z) {
            IHMHttpCallback iHMHttpCallback = this.b;
            if (iHMHttpCallback != null) {
                try {
                    map = iHMHttpCallback.getHeader();
                } catch (Exception e) {
                    HMHttpResponseData hMHttpResponseDataCreateFailureResponse = createFailureResponse(hMHttpRequestData);
                    hMHttpResponseDataCreateFailureResponse.setError(e);
                    return hMHttpResponseDataCreateFailureResponse;
                }
            } else {
                map = null;
            }
        }
        IHMHttpCallback iHMHttpCallback2 = this.b;
        if (iHMHttpCallback2 == null || iHMHttpCallback2.onPreRequest(map, hMHttpRequestData)) {
            return (hMHttpConfigArr == null || hMHttpConfigArr.length != 1 || hMHttpConfigArr[0] == null) ? this.a.request(hMHttpRequestData, hMHttpRequestData.getSupport(), map) : this.a.request(hMHttpRequestData, hMHttpRequestData.getSupport(), map, hMHttpConfigArr[0]);
        }
        return createFailureResponse(hMHttpRequestData);
    }

    private void f(HMHttpRequestData hMHttpRequestData, Map<String, String> map, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hMHttpRequestData);
        requestList(arrayList, map, false, z, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    private void g(HMHttpRequestData hMHttpRequestData, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hMHttpRequestData);
        requestList(arrayList, null, true, z, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    public static HMHttpRequest getInstance() {
        if (d == null) {
            synchronized (HMHttpRequest.class) {
                HMLog.e(c, "wait http init", new Object[0]);
            }
        }
        return d;
    }

    public static void initHttpRequest(HMHttpConfig hMHttpConfig) {
        synchronized (HMHttpRequest.class) {
            HMHttpRequest hMHttpRequest = new HMHttpRequest();
            d = hMHttpRequest;
            hMHttpRequest.a.init(hMHttpConfig);
        }
    }

    public boolean cancel(String str) {
        return this.a.cancel(str);
    }

    public void cancelAll() {
        this.a.cancelAll();
    }

    public void onItemErrorCancel(String str) {
        throw new OnItemErrorException(str);
    }

    public void request(String str, Map<String, Object> map, Support.RequestSupport requestSupport, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMHttpRequestData hMHttpRequestData = new HMHttpRequestData(str, map, requestSupport);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hMHttpRequestData);
        requestList(arrayList, null, true, z, iHMBasicHttpResponseHandler, new HMHttpConfig[0]);
    }

    public void requestList(List<HMHttpRequestData> list, final Map<String, String> map, final boolean z, boolean z2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, final HMHttpConfig... hMHttpConfigArr) {
        Observable.fromIterable(list).flatMap(new Function() { // from class: yz2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.d(map, z, hMHttpConfigArr, (HMHttpRequestData) obj);
            }
        }).subscribeOn(z2 ? Schedulers.trampoline() : Schedulers.newThread()).observeOn(c(z2)).subscribe(new a(iHMBasicHttpResponseHandler, list));
    }

    public void separateRequest(String str, Map<String, String> map, Map<String, Object> map2, Support.RequestSupport requestSupport, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        f(new HMHttpRequestData(str, map2, requestSupport), map, z, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    public void setCallback(IHMHttpCallback iHMHttpCallback) {
        this.b = iHMHttpCallback;
    }

    public void onItemErrorCancel() {
        throw new OnItemErrorException();
    }

    public void separateRequest(String str, Map<String, String> map, Set<Object> set, Support.RequestSupport requestSupport, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        f(new HMHttpRequestData(str, set, requestSupport), map, z, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    public void separateRequest(String str, Map<String, String> map, File file, Support.RequestSupport requestSupport, boolean z, IHMFileDownloadResponseHandler iHMFileDownloadResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        iHMFileDownloadResponseHandler.setFile(file);
        f(new HMHttpRequestData(str, file, requestSupport), map, z, iHMFileDownloadResponseHandler, hMHttpConfigArr);
    }

    public void separateRequest(String str, Set<Object> set, Support.RequestSupport requestSupport, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        g(new HMHttpRequestData(str, set, requestSupport), z, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }
}
