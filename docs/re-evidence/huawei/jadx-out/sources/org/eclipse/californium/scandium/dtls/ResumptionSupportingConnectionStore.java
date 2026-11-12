package org.eclipse.californium.scandium.dtls;

import defpackage.aaae;
import defpackage.aaag;
import defpackage.aaam;
import defpackage.aacd;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.elements.PersistentConnector;
import org.eclipse.californium.scandium.ConnectionListener;

/* JADX INFO: loaded from: classes20.dex */
public interface ResumptionSupportingConnectionStore extends PersistentConnector, Iterable<aaag> {
    void attach(ConnectionIdGenerator connectionIdGenerator);

    void clear();

    aaam find(aacd aacdVar);

    aaag get(aaae aaaeVar);

    aaag get(InetSocketAddress inetSocketAddress);

    Iterator<aaag> iterator();

    @Override // org.eclipse.californium.elements.PersistentConnector
    int loadConnections(InputStream inputStream, long j) throws IOException;

    void markAllAsResumptionRequired();

    boolean put(aaag aaagVar);

    void putEstablishedSession(aaag aaagVar);

    int remainingCapacity();

    boolean remove(aaag aaagVar, boolean z);

    void removeFromEstablishedSessions(aaag aaagVar);

    boolean restore(aaag aaagVar);

    @Override // org.eclipse.californium.elements.PersistentConnector
    int saveConnections(OutputStream outputStream, long j) throws IOException;

    void setConnectionListener(ConnectionListener connectionListener);

    void stop(List<Runnable> list);

    boolean update(aaag aaagVar, InetSocketAddress inetSocketAddress);
}
