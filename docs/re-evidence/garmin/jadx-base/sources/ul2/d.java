package ul2;

import p005kotlin.Metadata;
import tl2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lul2/d;", "Ltl2/f;", "<init>", "()V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d implements f {
    @Override // tl2.f
    public final <T extends tl2.c> void a(T t7) {
        c cVar = t7 instanceof c ? (c) t7 : null;
        if (cVar != null) {
            c(cVar);
        }
    }

    public abstract void c(c cVar);
}
