package com.ingenic.iwds.datatransactor;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class FileInfo implements Serializable {
    private static final long serialVersionUID = 6561042250086394606L;
    public int chunkIndex;
    public int chunkSize;
    public long length;
    public String name;
}
