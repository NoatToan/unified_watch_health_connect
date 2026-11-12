package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class czx implements Comparator<ikw>, Serializable {
    private static final long serialVersionUID = -4531604421710697216L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31560b;

    public czx(boolean z) {
        this.f31560b = z;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compare(ikw ikwVar, ikw ikwVar2) {
        return this.f31560b ? c(ikwVar2, ikwVar) : c(ikwVar, ikwVar2);
    }

    private int c(ikw ikwVar, ikw ikwVar2) {
        if (ikwVar.l() != ikwVar2.l()) {
            return Integer.compare(ikwVar.l(), ikwVar2.l());
        }
        if (ikwVar.l() == 256) {
            return this.f31560b ? -1 : 1;
        }
        if (ikwVar.l() == 512) {
            return 1;
        }
        return Long.compare(ikwVar2.g(), ikwVar.g());
    }
}
