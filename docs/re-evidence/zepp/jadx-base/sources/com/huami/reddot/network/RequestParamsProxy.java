package com.huami.reddot.network;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RequestParamsProxy implements IRequestParams {
    private IRequestParams a;

    public RequestParamsProxy(IRequestParams iRequestParams) {
        this.a = iRequestParams;
    }

    @Override // com.huami.reddot.network.IRequestParams
    public List<String> getMineParams() {
        return this.a.getMineParams();
    }

    @Override // com.huami.reddot.network.IRequestParams
    public List<String> getMsgBoxParams() {
        return this.a.getMsgBoxParams();
    }

    @Override // com.huami.reddot.network.IRequestParams
    public List<String> getWatchSkinParams() {
        return this.a.getWatchSkinParams();
    }
}
