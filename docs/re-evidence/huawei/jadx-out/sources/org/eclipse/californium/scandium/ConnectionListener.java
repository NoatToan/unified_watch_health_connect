package org.eclipse.californium.scandium;

import defpackage.aaag;

/* JADX INFO: loaded from: classes20.dex */
public interface ConnectionListener {
    void afterExecution(aaag aaagVar);

    void beforeExecution(aaag aaagVar);

    void onConnectionEstablished(aaag aaagVar);

    boolean onConnectionMacError(aaag aaagVar);

    void onConnectionRemoved(aaag aaagVar);

    boolean onConnectionUpdatesSequenceNumbers(aaag aaagVar, boolean z);

    void updateExecution(aaag aaagVar);
}
