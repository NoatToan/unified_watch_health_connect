package org.eclipse.californium.scandium.dtls;

import defpackage.aaam;
import defpackage.aacd;

/* JADX INFO: loaded from: classes20.dex */
public interface SessionStore {
    aaam get(aacd aacdVar);

    void put(aaam aaamVar);

    void remove(aacd aacdVar);
}
