package com.huami.network.base.http;

import com.huami.network.base.HMHttpConfig;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbsHMHttpInit<Request> {
    public abstract Request create();

    public abstract Request createRequest(HMHttpConfig hMHttpConfig);

    public abstract void init(HMHttpConfig hMHttpConfig);

    public abstract void setRetries(Request request, int i);

    public abstract void setTimeout(Request request, int i);

    public abstract void supportGzip(Request request, boolean z);

    public abstract void supportHttps(Request request, boolean z);
}
