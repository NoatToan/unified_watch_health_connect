package com.fasterxml.jackson.core.io;

import defpackage.xuc;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(xuc xucVar, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(xuc xucVar, Writer writer) throws IOException;
}
