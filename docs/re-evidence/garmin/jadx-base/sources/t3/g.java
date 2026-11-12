package t3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import s3.l;
import sg0.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lt3/g;", "Lt3/h;", "<init>", "()V", "b", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f162134b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f162136d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f162138f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f162133a = new d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f162135c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f162137e = new Object[16];

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt3/g$a;", "", "<init>", "(Lt3/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f162140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162141c;

        public a() {
        }

        public final int a(int i14) {
            return g.this.f162135c[this.f162140b + i14];
        }

        public final <T> T b(int i14) {
            return (T) g.this.f162137e[this.f162141c + i14];
        }
    }

    @d23.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lt3/g$b;", "", "stack", "Lt3/g;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f162143a;

        public static final <T> void a(g gVar, int i14, T t7) {
            gVar.f162137e[(gVar.f162138f - gVar.f162133a[gVar.f162134b - 1].f162094b) + i14] = t7;
        }

        public static final <T, U> void b(g gVar, int i14, T t7, int i15, U u8) {
            int i16 = gVar.f162138f - gVar.f162133a[gVar.f162134b - 1].f162094b;
            Object[] objArr = gVar.f162137e;
            objArr[i14 + i16] = t7;
            objArr[i16 + i15] = u8;
        }

        public static final void c(g gVar, Object obj, Object obj2, Object obj3) {
            int i14 = gVar.f162138f - gVar.f162133a[gVar.f162134b - 1].f162094b;
            Object[] objArr = gVar.f162137e;
            objArr[i14] = obj;
            objArr[i14 + 1] = obj2;
            objArr[i14 + 2] = obj3;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return s.g(this.f162143a, ((b) obj).f162143a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f162143a.hashCode();
        }

        public final String toString() {
            return "WriteScope(stack=" + this.f162143a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public final void a() {
        this.f162134b = 0;
        this.f162136d = 0;
        p13.s.m(0, this.f162138f, null, this.f162137e);
        this.f162138f = 0;
    }

    public final void b(p3.c<?> cVar, l lVar, z3.l lVar2, e eVar) {
        if (this.f162134b != 0) {
            a aVar = new a();
            while (true) {
                g gVar = g.this;
                d dVar = gVar.f162133a[aVar.f162139a];
                s3.b bVarB = dVar.b(aVar);
                p3.c<?> cVar2 = cVar;
                l lVar3 = lVar;
                z3.l lVar4 = lVar2;
                e eVar2 = eVar;
                try {
                    dVar.a(aVar, cVar2, lVar3, lVar4, eVar2);
                    int i14 = aVar.f162139a;
                    int i15 = gVar.f162134b;
                    if (i14 < i15) {
                        d dVar2 = gVar.f162133a[i14];
                        aVar.f162140b += dVar2.f162093a;
                        aVar.f162141c += dVar2.f162094b;
                        int i16 = i14 + 1;
                        aVar.f162139a = i16;
                        if (i16 >= i15) {
                            break;
                        }
                        cVar = cVar2;
                        lVar = lVar3;
                        lVar2 = lVar4;
                        eVar = eVar2;
                    } else {
                        break;
                    }
                } catch (Throwable th3) {
                    if (eVar2 == null) {
                        throw th3;
                    }
                    jg.b.R(th3, new j(bVarB, 10, lVar3, eVar2));
                    throw th3;
                }
            }
        }
        a();
    }

    public final boolean c() {
        return this.f162134b == 0;
    }

    public final void d(d dVar) {
        int i14 = this.f162134b;
        d[] dVarArr = this.f162133a;
        if (i14 == dVarArr.length) {
            d[] dVarArr2 = new d[(i14 > 1024 ? 1024 : i14) + i14];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, i14);
            this.f162133a = dVarArr2;
        }
        int i15 = this.f162136d;
        int i16 = dVar.f162093a;
        int i17 = dVar.f162094b;
        int i18 = i15 + i16;
        int[] iArr = this.f162135c;
        int length = iArr.length;
        if (i18 > length) {
            int i19 = (length > 1024 ? 1024 : length) + length;
            if (i19 >= i18) {
                i18 = i19;
            }
            int[] iArr2 = new int[i18];
            p13.s.d(0, 0, length, iArr, iArr2);
            this.f162135c = iArr2;
        }
        int i24 = this.f162138f + i17;
        Object[] objArr = this.f162137e;
        int length2 = objArr.length;
        if (i24 > length2) {
            int i25 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i25 >= i24) {
                i24 = i25;
            }
            Object[] objArr2 = new Object[i24];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f162137e = objArr2;
        }
        d[] dVarArr3 = this.f162133a;
        int i26 = this.f162134b;
        this.f162134b = i26 + 1;
        dVarArr3[i26] = dVar;
        this.f162136d += dVar.f162093a;
        this.f162138f += i17;
    }
}
