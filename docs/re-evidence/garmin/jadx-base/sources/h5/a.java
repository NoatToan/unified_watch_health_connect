package h5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lh5/a;", "", "Lh5/b;", "alignmentLinesOwner", "<init>", "(Lh5/b;)V", "Lh5/g0;", "Lh5/k0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f81661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f81668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f81669i;

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/b;", "childOwner", "", "invoke", "(Lh5/b;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C1620a extends p005kotlin.jvm.internal.w implements e23.l<b, Unit> {
        public C1620a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(b bVar) {
            a aVar;
            b bVar2 = bVar;
            if (bVar2.getF81958i() != Integer.MAX_VALUE) {
                if (bVar2.p().f81662b) {
                    bVar2.J();
                }
                Iterator it = bVar2.p().f81669i.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar = a.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    a.a(aVar, (f5.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar2.K());
                }
                c1 c1Var = bVar2.K().f81715v;
                c1Var.getClass();
                while (!c1Var.equals(aVar.f81661a.K())) {
                    for (f5.a aVar2 : aVar.c(c1Var).keySet()) {
                        a.a(aVar, aVar2, aVar.d(c1Var, aVar2), c1Var);
                    }
                    c1Var = c1Var.f81715v;
                    c1Var.getClass();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private a(b bVar) {
        this.f81661a = bVar;
        this.f81662b = true;
        this.f81669i = new HashMap();
    }

    public static final void a(a aVar, f5.a aVar2, int i14, c1 c1Var) {
        HashMap map = aVar.f81669i;
        float f14 = i14;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.c.a aVar3 = n4.c.f123541b;
        while (true) {
            jFloatToRawIntBits = aVar.b(c1Var, jFloatToRawIntBits);
            c1Var = c1Var.f81715v;
            c1Var.getClass();
            if (c1Var.equals(aVar.f81661a.K())) {
                break;
            } else if (aVar.c(c1Var).containsKey(aVar2)) {
                float fD = aVar.d(c1Var, aVar2);
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
            }
        }
        int iRound = Math.round(aVar2 instanceof f5.p ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        if (map.containsKey(aVar2)) {
            int iIntValue = ((Number) p13.u0.c(aVar2, map)).intValue();
            f5.p pVar = f5.b.f68892a;
            iRound = aVar2.f68885a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound)).intValue();
        }
        map.put(aVar2, Integer.valueOf(iRound));
    }

    public abstract long b(c1 c1Var, long j8);

    public abstract Map<f5.a, Integer> c(c1 c1Var);

    public abstract int d(c1 c1Var, f5.a aVar);

    public final boolean e() {
        return this.f81663c || this.f81665e || this.f81666f || this.f81667g;
    }

    public final boolean f() {
        i();
        return this.f81668h != null;
    }

    public final void g() {
        this.f81662b = true;
        b bVar = this.f81661a;
        b bVarD0 = bVar.d0();
        if (bVarD0 == null) {
            return;
        }
        if (this.f81663c) {
            bVarD0.Z();
        } else if (this.f81665e || this.f81664d) {
            bVarD0.requestLayout();
        }
        if (this.f81666f) {
            bVar.Z();
        }
        if (this.f81667g) {
            bVar.requestLayout();
        }
        bVarD0.p().g();
    }

    public final void h() {
        HashMap map = this.f81669i;
        map.clear();
        C1620a c1620a = new C1620a();
        b bVar = this.f81661a;
        bVar.T(c1620a);
        map.putAll(c(bVar.K()));
        this.f81662b = false;
    }

    public final void i() {
        a aVarP;
        a aVarP2;
        boolean zE = e();
        b bVar = this.f81661a;
        if (!zE) {
            b bVarD0 = bVar.d0();
            if (bVarD0 == null) {
                return;
            }
            bVar = bVarD0.p().f81668h;
            if (bVar == null || !bVar.p().e()) {
                b bVar2 = this.f81668h;
                if (bVar2 == null || bVar2.p().e()) {
                    return;
                }
                b bVarD1 = bVar2.d0();
                if (bVarD1 != null && (aVarP2 = bVarD1.p()) != null) {
                    aVarP2.i();
                }
                b bVarD2 = bVar2.d0();
                bVar = (bVarD2 == null || (aVarP = bVarD2.p()) == null) ? null : aVarP.f81668h;
            }
        }
        this.f81668h = bVar;
    }

    public /* synthetic */ a(b bVar, p005kotlin.jvm.internal.j jVar) {
        this(bVar);
    }
}
