package org.eclipse.californium.elements.auth;

import defpackage.zyj;
import java.security.Principal;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractExtensiblePrincipal<T extends Principal> implements ExtensiblePrincipal<T> {
    private final zyj additionalInfo;

    protected AbstractExtensiblePrincipal() {
        this(null);
    }

    public AbstractExtensiblePrincipal(zyj zyjVar) {
        if (zyjVar == null) {
            this.additionalInfo = zyj.a();
        } else {
            this.additionalInfo = zyjVar;
        }
    }

    @Override // org.eclipse.californium.elements.auth.ExtensiblePrincipal
    public final zyj getExtendedInfo() {
        return this.additionalInfo;
    }
}
