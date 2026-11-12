package org.eclipse.californium.elements;

import defpackage.zxx;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes20.dex */
public interface Connector {
    void destroy();

    InetSocketAddress getAddress();

    String getProtocol();

    boolean isRunning();

    void processDatagram(DatagramPacket datagramPacket);

    void send(zxx zxxVar);

    void setEndpointContextMatcher(EndpointContextMatcher endpointContextMatcher);

    void setRawDataReceiver(RawDataChannel rawDataChannel);

    void start() throws IOException;

    void stop();
}
