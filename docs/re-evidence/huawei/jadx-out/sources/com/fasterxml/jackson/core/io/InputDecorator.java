package com.fasterxml.jackson.core.io;

import defpackage.xa;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract InputStream decorate(xa xaVar, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(xa xaVar, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(xa xaVar, Reader reader) throws IOException;

    public DataInput decorate(xa xaVar, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }
}
