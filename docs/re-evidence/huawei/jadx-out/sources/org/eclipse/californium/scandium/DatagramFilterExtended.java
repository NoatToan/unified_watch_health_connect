package org.eclipse.californium.scandium;

import defpackage.aabr;
import java.net.DatagramPacket;

/* JADX INFO: loaded from: classes20.dex */
public interface DatagramFilterExtended {
    void onDrop(aabr aabrVar);

    void onDrop(DatagramPacket datagramPacket);
}
