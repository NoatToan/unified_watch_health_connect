package ue;

import android.os.Trace;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u0000¨\u0006\u0001"}, d2 = {"Lue/d;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {
    public final void a(String str) {
        Trace.beginSection(ce.a.d(str));
    }

    public final void b() {
        Trace.endSection();
    }

    public final boolean c() {
        return ce.a.b();
    }
}
