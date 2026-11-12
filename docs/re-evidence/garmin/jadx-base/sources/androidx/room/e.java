package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/e;", "T", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<T> {
    public abstract void a(ud.c cVar, T t7);

    public abstract String b();

    public final int c(ud.a aVar, T t7) {
        aVar.getClass();
        if (t7 == null) {
            return 0;
        }
        ud.c cVarM0 = aVar.M0(b());
        try {
            a(cVarM0, t7);
            cVarM0.J0();
            zf.b.h(cVarM0, null);
            return g8.i.L(aVar);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }
}
