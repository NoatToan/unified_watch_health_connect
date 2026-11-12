package com.fasterxml.jackson.core.io;

import defpackage.xuc;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public DataInput decorate(xuc xucVar, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(xuc xucVar, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(xuc xucVar, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(xuc xucVar, Reader reader) throws IOException;
}
