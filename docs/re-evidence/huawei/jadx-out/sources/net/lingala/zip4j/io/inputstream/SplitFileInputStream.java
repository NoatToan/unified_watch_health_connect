package net.lingala.zip4j.io.inputstream;

import defpackage.zpy;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes46.dex */
public abstract class SplitFileInputStream extends InputStream {
    public abstract void prepareExtractionForFileHeader(zpy zpyVar) throws IOException;
}
