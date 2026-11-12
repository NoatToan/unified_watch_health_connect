package com.fasterxml.jackson.core.io;

import defpackage.xa;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(xa xaVar, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(xa xaVar, Writer writer) throws IOException;
}
