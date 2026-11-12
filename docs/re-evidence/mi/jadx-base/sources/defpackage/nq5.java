package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class nq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Locale f28244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wr5 f28245b;
    public org.threeten.bp.chrono.b c;
    public ZoneId d;
    public boolean e;
    public boolean f;
    public final ArrayList<b> g;

    public final class b extends sv5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public org.threeten.bp.chrono.b f28246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZoneId f28247b;
        public final Map<z4p, Long> c;
        public boolean d;
        public Period e;
        public List<Object[]> f;

        public b a() {
            b bVar = nq5.this.new b();
            bVar.f28246a = this.f28246a;
            bVar.f28247b = this.f28247b;
            bVar.c.putAll(this.c);
            bVar.d = this.d;
            return bVar;
        }

        public eq5 b() {
            eq5 eq5Var = new eq5();
            eq5Var.f16952a.putAll(this.c);
            eq5Var.f16953b = nq5.this.h();
            ZoneId zoneId = this.f28247b;
            if (zoneId != null) {
                eq5Var.c = zoneId;
            } else {
                eq5Var.c = nq5.this.d;
            }
            eq5Var.f = this.d;
            eq5Var.g = this.e;
            return eq5Var;
        }

        @Override // defpackage.sv5, defpackage.t4p
        public int get(z4p z4pVar) {
            if (this.c.containsKey(z4pVar)) {
                return crd.q(this.c.get(z4pVar).longValue());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }

        @Override // defpackage.t4p
        public long getLong(z4p z4pVar) {
            if (this.c.containsKey(z4pVar)) {
                return this.c.get(z4pVar).longValue();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }

        @Override // defpackage.t4p
        public boolean isSupported(z4p z4pVar) {
            return this.c.containsKey(z4pVar);
        }

        @Override // defpackage.sv5, defpackage.t4p
        public <R> R query(b5p<R> b5pVar) {
            if (b5pVar == a5p.a()) {
                return (R) this.f28246a;
            }
            return (b5pVar == a5p.g() || b5pVar == a5p.f()) ? (R) this.f28247b : (R) super.query(b5pVar);
        }

        public String toString() {
            return this.c.toString() + "," + this.f28246a + "," + this.f28247b;
        }

        public b() {
            this.f28246a = null;
            this.f28247b = null;
            this.c = new HashMap();
            this.e = Period.ZERO;
        }
    }

    public nq5(iq5 iq5Var) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.f28244a = iq5Var.f();
        this.f28245b = iq5Var.e();
        this.c = iq5Var.d();
        this.d = iq5Var.g();
        arrayList.add(new b());
    }

    public static boolean d(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public void b(kq5.n nVar, long j, int i, int i2) {
        b bVarF = f();
        if (bVarF.f == null) {
            bVarF.f = new ArrayList(2);
        }
        bVarF.f.add(new Object[]{nVar, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public boolean c(char c, char c2) {
        if (l()) {
            return c == c2;
        }
        return d(c, c2);
    }

    public nq5 e() {
        return new nq5(this);
    }

    public final b f() {
        ArrayList<b> arrayList = this.g;
        return arrayList.get(arrayList.size() - 1);
    }

    public void g(boolean z) {
        if (z) {
            ArrayList<b> arrayList = this.g;
            arrayList.remove(arrayList.size() - 2);
        } else {
            ArrayList<b> arrayList2 = this.g;
            arrayList2.remove(arrayList2.size() - 1);
        }
    }

    public org.threeten.bp.chrono.b h() {
        org.threeten.bp.chrono.b bVar = f().f28246a;
        if (bVar != null) {
            return bVar;
        }
        org.threeten.bp.chrono.b bVar2 = this.c;
        return bVar2 == null ? IsoChronology.INSTANCE : bVar2;
    }

    public Locale i() {
        return this.f28244a;
    }

    public Long j(z4p z4pVar) {
        return f().c.get(z4pVar);
    }

    public wr5 k() {
        return this.f28245b;
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.f;
    }

    public void n(boolean z) {
        this.e = z;
    }

    public void o(ZoneId zoneId) {
        crd.i(zoneId, "zone");
        f().f28247b = zoneId;
    }

    public void p(org.threeten.bp.chrono.b bVar) {
        crd.i(bVar, "chrono");
        b bVarF = f();
        bVarF.f28246a = bVar;
        if (bVarF.f != null) {
            ArrayList<Object[]> arrayList = new ArrayList(bVarF.f);
            bVarF.f.clear();
            for (Object[] objArr : arrayList) {
                ((kq5.n) objArr[0]).e(this, ((Long) objArr[1]).longValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            }
        }
    }

    public int q(z4p z4pVar, long j, int i, int i2) {
        crd.i(z4pVar, "field");
        Long lPut = f().c.put(z4pVar, Long.valueOf(j));
        return (lPut == null || lPut.longValue() == j) ? i2 : ~i;
    }

    public void r() {
        f().d = true;
    }

    public void s(boolean z) {
        this.f = z;
    }

    public void t() {
        this.g.add(f().a());
    }

    public String toString() {
        return f().toString();
    }

    public boolean u(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (l()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char cCharAt = charSequence.charAt(i + i5);
            char cCharAt2 = charSequence2.charAt(i2 + i5);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    public b v() {
        return f();
    }

    public nq5(nq5 nq5Var) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.f28244a = nq5Var.f28244a;
        this.f28245b = nq5Var.f28245b;
        this.c = nq5Var.c;
        this.d = nq5Var.d;
        this.e = nq5Var.e;
        this.f = nq5Var.f;
        arrayList.add(new b());
    }
}
