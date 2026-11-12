package com.huami.network.base.handler;

import com.huami.network.base.model.HMHttpResponseData;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IHMFileDownloadResponseHandler implements IHMBasicHttpResponseHandler {
    private File a;

    public File getTargetFile() {
        return this.a;
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public void onCancel(int i) {
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public void onCompleted() {
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public void onError(Throwable th) {
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public final void onFailure(HMHttpResponseData hMHttpResponseData) {
        onFailure(hMHttpResponseData, this.a);
    }

    public abstract void onFailure(HMHttpResponseData hMHttpResponseData, File file);

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public final void onSuccess(HMHttpResponseData hMHttpResponseData) {
        onSuccess(hMHttpResponseData, this.a);
    }

    public abstract void onSuccess(HMHttpResponseData hMHttpResponseData, File file);

    public void setFile(File file) {
        this.a = file;
    }
}
