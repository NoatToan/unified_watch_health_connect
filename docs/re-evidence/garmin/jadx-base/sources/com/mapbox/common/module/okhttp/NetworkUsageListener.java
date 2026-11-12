package com.mapbox.common.module.okhttp;

import com.google.protobuf.a;
import com.mapbox.common.NetworkUsageMetricsMeter;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkUsageListener extends EventListener {
    public static NetworkUsageMetricCallback CALLBACK = null;
    public static final EventListener.Factory FACTORY = new a(18);
    private static final String TAG = "CommonNetworkUsage";
    private long bytesRequest;
    private long bytesResponse;
    private boolean reported;

    public interface NetworkUsageMetricCallback {
        void onBytesTransferred(String str, long j8, long j14);
    }

    private NetworkUsageListener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ EventListener lambda$static$0(Call call) {
        return new NetworkUsageListener();
    }

    private void notifyCallback(Call call) {
        if (this.reported) {
            return;
        }
        String string = call.request().url().getUrl();
        NetworkUsageMetricCallback networkUsageMetricCallback = CALLBACK;
        if (networkUsageMetricCallback != null) {
            try {
                networkUsageMetricCallback.onBytesTransferred(string, this.bytesRequest, this.bytesResponse);
            } catch (NullPointerException unused) {
            }
        }
        notifyInternalMetrics(string, (int) this.bytesRequest, (int) this.bytesResponse);
        this.reported = true;
    }

    public static void notifyInternalMetrics(String str, int i14, int i15) {
        NetworkUsageMetricsMeter.onBytesTransferred(str, i14, i15);
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        super.callEnd(call);
        notifyCallback(call);
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        notifyCallback(call);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j8) {
        super.requestBodyEnd(call, j8);
        this.bytesRequest += j8;
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        this.bytesRequest = request.headers().byteCount() + this.bytesRequest;
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j8) {
        super.responseBodyEnd(call, j8);
        this.bytesResponse += j8;
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        this.bytesResponse = response.headers().byteCount() + this.bytesResponse;
    }
}
