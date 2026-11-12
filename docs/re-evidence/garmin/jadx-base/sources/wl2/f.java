package wl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwl2/f;", "Ltl2/f;", "<init>", "()V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f implements tl2.f {
    @Override // tl2.f
    public final <T extends tl2.c> void a(T t7) {
        b bVar = t7 instanceof b ? (b) t7 : null;
        if (bVar != null) {
            c(bVar);
        }
    }

    public abstract void c(b bVar);
}
