package org.eclipse.californium.scandium;

import defpackage.aaag;
import defpackage.aabr;
import java.net.DatagramPacket;

/* JADX INFO: loaded from: classes20.dex */
public interface DatagramFilter {
    boolean onMacError(aabr aabrVar, aaag aaagVar);

    boolean onReceiving(aabr aabrVar, aaag aaagVar);

    boolean onReceiving(DatagramPacket datagramPacket);
}
