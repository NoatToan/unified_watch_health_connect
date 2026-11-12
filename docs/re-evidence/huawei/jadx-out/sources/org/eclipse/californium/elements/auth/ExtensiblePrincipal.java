package org.eclipse.californium.elements.auth;

import defpackage.zyj;
import java.security.Principal;

/* JADX INFO: loaded from: classes20.dex */
public interface ExtensiblePrincipal<T extends Principal> extends Principal {
    T amend(zyj zyjVar);

    zyj getExtendedInfo();
}
