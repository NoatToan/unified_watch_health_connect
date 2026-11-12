package com.huami.ad.repo;

import android.os.Handler;
import android.os.Message;
import com.huami.ad.AdLoadListener;
import com.huami.ad.Constants;
import com.huami.ad.ITimeListener;
import com.huami.ad.config.AdConfig;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Repo<T, K extends AdConfig> implements Constants {
    private static final String a = "Repo";
    public AdLoadListener<T> adLoadListener;
    public K config;
    public T entity;
    public Handler handler = new a();
    public ITimeListener iTimeListener;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Repo.this.doHandleMessage(message);
        }
    }

    public class b extends ResponseHandler {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(HMHttpResponseData hMHttpResponseData) {
            Repo.this.a(hMHttpResponseData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(HMHttpResponseData hMHttpResponseData) {
            Repo.this.handleSuccess(hMHttpResponseData);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(final HMHttpResponseData hMHttpResponseData) {
            Repo.this.handler.post(new Runnable() { // from class: com.huami.ad.repo.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(hMHttpResponseData);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(final HMHttpResponseData hMHttpResponseData) {
            Repo.this.handler.post(new Runnable() { // from class: com.huami.ad.repo.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(hMHttpResponseData);
                }
            });
        }
    }

    public Repo(K k) {
        this.config = k;
    }

    public abstract void a(HMHttpResponseData hMHttpResponseData);

    public void doHandleMessage(Message message) {
    }

    public T getEntity() {
        return this.entity;
    }

    public abstract void handleSuccess(HMHttpResponseData hMHttpResponseData);

    public void requestAd() {
        String url = HMServerDef.getUrl(this.config.getUrl());
        HMLog.d(a, "request ad : " + url, new Object[0]);
        HMWebUtil.doRequest(url, this.config.getConfig(), Support.RequestSupport.GET, false, new b());
    }

    public void setAdLoadListener(AdLoadListener<T> adLoadListener) {
        this.adLoadListener = adLoadListener;
    }

    public void setTimeListener(ITimeListener iTimeListener) {
        this.iTimeListener = iTimeListener;
    }
}
