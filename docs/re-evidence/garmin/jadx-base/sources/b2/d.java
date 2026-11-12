package b2;

import android.os.Parcel;
import g6.q;
import g6.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb2/d;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f14462a = Parcel.obtain();

    public final void a(byte b14) {
        this.f14462a.writeByte(b14);
    }

    public final void b(float f14) {
        this.f14462a.writeFloat(f14);
    }

    public final void c(long j8) {
        long jC = q.c(j8);
        r.a aVar = r.f76022b;
        aVar.getClass();
        byte b14 = 0;
        if (!r.b(jC, 0L)) {
            aVar.getClass();
            if (r.b(jC, r.f76023c)) {
                b14 = 1;
            } else {
                aVar.getClass();
                if (r.b(jC, r.f76024d)) {
                    b14 = 2;
                }
            }
        }
        a(b14);
        long jC2 = q.c(j8);
        aVar.getClass();
        if (r.b(jC2, 0L)) {
            return;
        }
        b(q.d(j8));
    }
}
