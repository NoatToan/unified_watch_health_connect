package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class pir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jyo f30449b;
    public List<kyo> c;
    public int d;
    public hir e;
    public int f;
    public boolean g;

    public pir(int i, int i2) {
        this.f30448a = i;
        this.f = i2;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f30448a;
    }

    public boolean d() {
        return this.g;
    }

    public jyo e() {
        jyo jyoVar = this.f30449b;
        jyoVar.c = this.f;
        jyoVar.e = (kyo[]) this.c.toArray(new kyo[0]);
        return this.f30449b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pir.class != obj.getClass()) {
            return false;
        }
        pir pirVar = (pir) obj;
        return this.d == pirVar.d && this.f == pirVar.f && Objects.equals(this.f30449b, pirVar.f30449b) && Objects.equals(this.c, pirVar.c) && Objects.equals(this.e, pirVar.e);
    }

    public final String f() {
        if (this.f30449b == null) {
            return "WidgetGroup = null";
        }
        return "WidgetGroup{sequence = " + this.f30449b.c + ", style = " + this.f30449b.d + "}";
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        sb.append(",WidgetList = {");
        int i = 0;
        while (true) {
            List<kyo> list = this.c;
            if (list == null || i >= list.size()) {
                break;
            }
            kyo kyoVar = this.c.get(i);
            sb.append("[widget:");
            sb.append(i);
            sb.append(", style = ");
            sb.append(kyoVar.c);
            sb.append(", function = ");
            sb.append(kyoVar.d);
            sb.append(", appId = ");
            sb.append(kyoVar.h);
            sb.append(", name = ");
            sb.append(kyoVar.f);
            sb.append(", subType = ");
            sb.append(kyoVar.e);
            sb.append("],");
            i++;
        }
        sb.append("}, ");
        return sb.toString();
    }

    public List<kyo> h() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(this.f30449b, this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f));
    }

    public void i(int i) {
        int iA = this.e.a();
        int iB = this.e.b();
        if (i >= iB && i <= iA) {
            this.f = i;
            return;
        }
        throw new IllegalStateException("sequence is out of the range, sequence = " + i + "，min = " + iB + ", max = " + iA);
    }

    public void j(boolean z) {
        this.g = z;
    }

    public String toString() {
        String str = " -> type = " + this.f30448a + "," + f() + g();
        if (this.e == null) {
            return str;
        }
        return str + ", Config = { minNum = " + this.e.b() + ", maxNum = " + this.e.a() + ", supportStyles = " + this.e.c();
    }

    public pir(jyo jyoVar, hir hirVar) {
        this.f30448a = 1;
        Objects.requireNonNull(jyoVar);
        this.f30449b = jyoVar;
        Objects.requireNonNull(hirVar);
        this.e = hirVar;
        jyo jyoVar2 = this.f30449b;
        int i = jyoVar2.d;
        this.d = i;
        this.f = jyoVar2.c;
        kyo[] kyoVarArr = jyoVar2.e;
        if (kyoVarArr != null) {
            int length = kyoVarArr.length;
            if (ikr.a(i) == length) {
                this.c = Arrays.asList(kyoVarArr);
                return;
            }
            throw new IllegalStateException("widgets array length doesn't match the style,style = " + this.d + ",len = " + length + "，mSequence = " + this.f);
        }
        throw new IllegalStateException("widgets array cannot be null");
    }
}
