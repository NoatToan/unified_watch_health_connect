package io.jsonwebtoken;

import defpackage.yxz;

/* JADX INFO: loaded from: classes46.dex */
public abstract class LocatorAdapter<T> implements Locator<T> {
    protected T doLocate(Header header) {
        return null;
    }

    protected T locate(JweHeader jweHeader) {
        return null;
    }

    protected T locate(JwsHeader jwsHeader) {
        return null;
    }

    @Override // io.jsonwebtoken.Locator
    public final T locate(Header header) {
        yxz.b(header, "Header cannot be null.");
        if (header instanceof ProtectedHeader) {
            return locate((ProtectedHeader) header);
        }
        return doLocate(header);
    }

    protected T locate(ProtectedHeader protectedHeader) {
        if (protectedHeader instanceof JwsHeader) {
            return locate((JwsHeader) protectedHeader);
        }
        yxz.e(JweHeader.class, protectedHeader, "Unrecognized ProtectedHeader type.");
        return locate((JweHeader) protectedHeader);
    }
}
