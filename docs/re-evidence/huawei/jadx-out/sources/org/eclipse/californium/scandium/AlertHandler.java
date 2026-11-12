package org.eclipse.californium.scandium;

import java.net.InetSocketAddress;
import org.eclipse.californium.scandium.dtls.AlertMessage;

/* JADX INFO: loaded from: classes20.dex */
public interface AlertHandler {
    void onAlert(InetSocketAddress inetSocketAddress, AlertMessage alertMessage);
}
