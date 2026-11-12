package androidx.room;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/g;", "T", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g<T> {
    public abstract void a(ud.c cVar, T t7);

    public abstract String b();

    public final void c(ud.a aVar, Iterable<? extends T> iterable) {
        aVar.getClass();
        if (iterable == null) {
            return;
        }
        ud.c cVarM0 = aVar.M0(b());
        try {
            for (T t7 : iterable) {
                if (t7 != null) {
                    a(cVarM0, t7);
                    cVarM0.J0();
                    cVarM0.reset();
                }
            }
            Unit unit = Unit.INSTANCE;
            zf.b.h(cVarM0, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }

    public final void d(ud.a aVar, T t7) {
        aVar.getClass();
        if (t7 == null) {
            return;
        }
        ud.c cVarM0 = aVar.M0(b());
        try {
            a(cVarM0, t7);
            cVarM0.J0();
            zf.b.h(cVarM0, null);
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
