package com.ingenic.iwds.datatransactor;

import android.content.Context;
import android.os.Parcelable;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.utils.IwdsAssert;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class ProviderTransactionModel<T> implements DataTransactor.DataTransactorCallback {
    private ProviderTransactionModelCallback<T> m_callback;
    private DataTransactor m_transactor;

    public interface ProviderTransactionModelCallback<T> {
        void onChannelAvailable(boolean z);

        void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z);

        void onObjectArrived(T t);

        void onRequest();

        void onRequestFailed();

        void onSendResult(DataTransactor.DataTransactResult dataTransactResult);
    }

    public static class Request implements Serializable {
        private static final long serialVersionUID = -8398132141094564822L;
    }

    public static class RequestFailed implements Serializable {
        private static final long serialVersionUID = -130038790971468020L;
    }

    public ProviderTransactionModel(Context context, Parcelable.Creator<T> creator, ProviderTransactionModelCallback<T> providerTransactionModelCallback, String str) {
        IwdsAssert.dieIf(this, providerTransactionModelCallback == null, "Callback is null.");
        this.m_callback = providerTransactionModelCallback;
        this.m_transactor = new ParcelTransactor(context, creator, this, str);
    }

    public boolean isStarted() {
        return this.m_transactor.isStarted();
    }

    public void notifyRequestFailed() {
        this.m_transactor.send(new RequestFailed());
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onChannelAvailable(boolean z) {
        this.m_callback.onChannelAvailable(z);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) {
        if (obj instanceof Request) {
            this.m_callback.onRequest();
        } else if (obj instanceof RequestFailed) {
            this.m_callback.onRequestFailed();
        } else {
            this.m_callback.onObjectArrived(obj);
        }
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
        this.m_callback.onLinkConnected(deviceDescriptor, z);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onRecvFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
        this.m_callback.onSendResult(dataTransactResult);
    }

    public void request() {
        this.m_transactor.send(new Request());
    }

    public void send(T t) {
        this.m_transactor.send(t);
    }

    public void start() {
        this.m_transactor.start();
    }

    public void stop() {
        this.m_transactor.stop();
    }
}
