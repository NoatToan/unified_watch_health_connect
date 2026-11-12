package com.google.android.exoplayer2.source;

import android.net.Uri;
import defpackage.kl8;
import defpackage.r4i;
import defpackage.zm5;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface n {

    public interface a {
        n a();
    }

    void a(long j, long j2);

    long b();

    void c();

    void d(zm5 zm5Var, Uri uri, Map<String, List<String>> map, long j, long j2, kl8 kl8Var) throws IOException;

    int e(r4i r4iVar) throws IOException;

    void release();
}
