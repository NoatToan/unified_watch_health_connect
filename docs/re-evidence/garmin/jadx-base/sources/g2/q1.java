package g2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg2/q1;", "Lg2/k0;", "Lj23/l;", "nearestRange", "Lg2/u;", "intervalContent", "<init>", "(Lj23/l;Lg2/u;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.p0 f75209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f75210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75211c;

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    public q1(j23.l lVar, u<?> uVar) {
        Object hVar;
        p1 f81020c = uVar.getF81020c();
        int i14 = lVar.f96796a;
        if (i14 < 0) {
            b2.e.c("negative nearestRange.first");
        }
        int iMin = Math.min(lVar.f96797b, f81020c.f75198b - 1);
        if (iMin < i14) {
            p1.p0<Object> p0Var = p1.z0.f134882a;
            p0Var.getClass();
            this.f75209a = p0Var;
            this.f75210b = new Object[0];
            this.f75211c = 0;
            return;
        }
        int i15 = (iMin - i14) + 1;
        this.f75210b = new Object[i15];
        this.f75211c = i14;
        p1.p0 p0Var2 = new p1.p0(i15);
        q3.c<j<T>> cVar = f81020c.f75197a;
        if (i14 < 0 || i14 >= f81020c.f75198b) {
            StringBuilder sbI = b71.i.i(i14, "Index ", ", size ");
            sbI.append(f81020c.f75198b);
            b2.e.e(sbI.toString());
        }
        if (iMin < 0 || iMin >= f81020c.f75198b) {
            StringBuilder sbI2 = b71.i.i(iMin, "Index ", ", size ");
            sbI2.append(f81020c.f75198b);
            b2.e.e(sbI2.toString());
        }
        if (iMin < i14) {
            b2.e.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i14 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        int iC = p.c(i14, cVar);
        int i16 = ((j) cVar.f142356a[iC]).f75138a;
        while (i16 <= iMin) {
            j jVar = (j) cVar.f142356a[iC];
            e23.l<Integer, Object> key = ((u.a) jVar.f75140c).getKey();
            int i17 = jVar.f75138a;
            int iMax = Math.max(i14, i17);
            int iMin2 = Math.min(iMin, (jVar.f75139b + i17) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        hVar = key.invoke(Integer.valueOf(iMax - i17));
                        hVar = hVar == null ? new h(iMax) : hVar;
                    }
                    p0Var2.h(hVar, iMax);
                    this.f75210b[iMax - this.f75211c] = hVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            Unit unit = Unit.INSTANCE;
            i16 += jVar.f75139b;
            iC++;
        }
        this.f75209a = p0Var2;
    }

    @Override // g2.k0
    public final int a(Object obj) {
        p1.p0 p0Var = this.f75209a;
        int iA = p0Var.a(obj);
        if (iA >= 0) {
            return p0Var.f134875c[iA];
        }
        return -1;
    }

    @Override // g2.k0
    public final Object getKey(int i14) {
        int i15 = i14 - this.f75211c;
        if (i15 < 0) {
            return null;
        }
        Object[] objArr = this.f75210b;
        if (i15 < objArr.length) {
            return objArr[i15];
        }
        return null;
    }
}
