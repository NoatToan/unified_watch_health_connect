package org.eclipse.californium.core.network;

import defpackage.zve;
import defpackage.zvt;

/* JADX INFO: loaded from: classes20.dex */
public interface TokenGenerator {

    public enum Scope {
        LONG_TERM,
        SHORT_TERM,
        SHORT_TERM_CLIENT_LOCAL
    }

    zve createToken(Scope scope);

    zvt getKeyToken(zve zveVar, Object obj);

    Scope getScope(zve zveVar);
}
