package org.eclipse.californium.core.coap;

import defpackage.zvf;
import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public interface MessageObserver {
    boolean isInternal();

    void onAcknowledgement();

    void onCancel();

    void onConnecting();

    void onContextEstablished(EndpointContext endpointContext);

    void onDtlsRetransmission(int i);

    void onReadyToSend();

    void onReject();

    void onResponse(zvf zvfVar);

    void onResponseHandlingError(Throwable th);

    void onRetransmission();

    void onSendError(Throwable th);

    void onSent(boolean z);

    void onTimeout();

    void onTransferComplete();
}
