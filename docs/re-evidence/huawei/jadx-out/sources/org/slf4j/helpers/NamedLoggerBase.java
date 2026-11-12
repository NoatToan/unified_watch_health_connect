package org.slf4j.helpers;

import defpackage.aaex;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    NamedLoggerBase() {
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    protected Object readResolve() throws ObjectStreamException {
        return aaex.a(getName());
    }
}
