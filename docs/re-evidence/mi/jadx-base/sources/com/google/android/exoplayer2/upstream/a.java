package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import defpackage.fxp;
import defpackage.zm5;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends zm5 {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a$a, reason: collision with other inner class name */
    public interface InterfaceC0205a {
        a a();
    }

    long b(b bVar) throws IOException;

    void close() throws IOException;

    default Map<String, List<String>> d() {
        return Collections.emptyMap();
    }

    void f(fxp fxpVar);

    Uri h();
}
