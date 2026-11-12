package org.eclipse.californium.scandium.dtls;

import defpackage.aaag;
import defpackage.aaay;
import defpackage.aabr;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface RecordLayer {
    public static final int DEFAULT_ETH_MTU = 1500;
    public static final int DEFAULT_IPV4_MTU = 576;
    public static final int DEFAULT_IPV6_MTU = 1280;
    public static final int IPV4_HEADER_LENGTH = 64;
    public static final int IPV6_HEADER_LENGTH = 128;
    public static final int MAX_MTU = 65535;

    void dropReceivedRecord(aabr aabrVar);

    int getMaxDatagramSize(boolean z);

    boolean isRunning();

    void processHandshakeException(aaag aaagVar, aaay aaayVar);

    void processRecord(aabr aabrVar, aaag aaagVar);

    void sendFlight(List<DatagramPacket> list) throws IOException;
}
