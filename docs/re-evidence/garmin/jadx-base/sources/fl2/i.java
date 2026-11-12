package fl2;

import android.content.SharedPreferences;
import fb1.d0;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfl2/i;", "", "<init>", "()V", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f72080a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f72081b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f72082c = m.b(new d0(9));

    private i() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(rs2.c cVar, a aVar, v13.c cVar2) {
        h hVar;
        i iVar;
        String str;
        long j8;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i14 = hVar.f72079f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f72079f = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar2);
            }
        } else {
            hVar = new h(this, cVar2);
        }
        Object obj = hVar.f72077d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f72079f;
        t tVar = f72082c;
        if (i15 == 0) {
            r.b(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strN = fb1.c.n("cachedSwUpdateCheckTimeMillis_", cVar.getF92741e());
            long j14 = ((SharedPreferences) tVar.getValue()).getLong(strN, 0L);
            long j15 = f72081b;
            long j16 = j15 > 1 ? 3600000 * j15 : 3600000L;
            if (j14 <= 0 || jCurrentTimeMillis - j14 > j16) {
                hVar.f72074a = this;
                hVar.f72075b = strN;
                hVar.f72076c = jCurrentTimeMillis;
                hVar.f72079f = 1;
                if (aVar.g(cVar, hVar, false) == obj2) {
                    return obj2;
                }
                iVar = this;
                str = strN;
                j8 = jCurrentTimeMillis;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = hVar.f72076c;
        str = hVar.f72075b;
        iVar = hVar.f72074a;
        r.b(obj);
        iVar.getClass();
        ((SharedPreferences) tVar.getValue()).edit().putLong(str, j8).apply();
        return Unit.INSTANCE;
    }
}
