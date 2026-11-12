package gm2;

import lm2.g;
import lm2.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgm2/b;", "", "<init>", "()V", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f78015a = new b();

    private b() {
    }

    public static d a() {
        if (h.f113619b) {
            try {
                g gVarC = h.c();
                d dVar = gVarC instanceof d ? (d) gVarC : null;
                if (dVar != null) {
                    return dVar;
                }
                d.f78016a.getClass();
                return new c();
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
