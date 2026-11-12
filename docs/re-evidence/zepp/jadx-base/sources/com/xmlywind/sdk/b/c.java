package com.xmlywind.sdk.b;

import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class c {
    public final File a;
    public final com.xmlywind.sdk.b.a.c b;
    public final com.xmlywind.sdk.b.a.a c;
    public final com.xmlywind.sdk.b.c.c d;
    public final com.xmlywind.sdk.b.b.b e;

    public c(File file, com.xmlywind.sdk.b.a.c cVar, com.xmlywind.sdk.b.a.a aVar, com.xmlywind.sdk.b.c.c cVar2, com.xmlywind.sdk.b.b.b bVar) {
        this.a = file;
        this.b = cVar;
        this.c = aVar;
        this.d = cVar2;
        this.e = bVar;
    }

    public File a(String str) {
        return new File(this.a, this.b.a(str));
    }
}
