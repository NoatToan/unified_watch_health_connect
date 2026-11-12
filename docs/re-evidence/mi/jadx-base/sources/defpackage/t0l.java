package defpackage;

import com.xiaomi.ai.nlp.lattice.rule.RefSlotType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class t0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34178b;
    public String c;
    public String d;
    public RefSlotType e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    public t0l() {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = -1;
        this.e = RefSlotType.STRING;
    }

    public int a() {
        return this.j;
    }

    public int b() {
        return this.i;
    }

    public String c() {
        return this.f34178b;
    }

    public RefSlotType d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t0l)) {
            return false;
        }
        t0l t0lVar = (t0l) obj;
        return this.f34177a.equals(t0lVar.f34177a) && this.c.equals(t0lVar.c);
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.f34177a;
    }

    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.f34177a + "/" + this.c;
        int i = this.f;
        if (i == 0 && str.length() > 0) {
            for (char c : str.toCharArray()) {
                i = (i * 31) + c;
            }
            this.f = i;
        }
        return i;
    }

    public boolean i() {
        return this.g;
    }

    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34177a);
        sb.append("/");
        sb.append(this.c);
        if (klo.d(this.d)) {
            sb.append("=");
            sb.append(this.d);
        }
        if (this.g) {
            sb.append(",is_start:");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(",is_end:");
            sb.append(this.h);
        }
        if (this.i != -1) {
            sb.append(",max_wind:");
            sb.append(this.i);
        }
        return sb.toString();
    }

    public void k(boolean z) {
        this.h = z;
    }

    public void l(int i) {
        this.j = i;
    }

    public void m(int i) {
        this.i = i;
    }

    public void n(String str) {
        this.f34178b = str;
    }

    public void o(RefSlotType refSlotType) {
        this.e = refSlotType;
    }

    public void p(String str) {
        this.f = 0;
        this.c = str;
    }

    public void q(String str) {
        this.d = str;
    }

    public void r(boolean z) {
        this.g = z;
    }

    public void s(String str) {
        this.f = 0;
        this.f34177a = str;
    }

    public String toString() {
        return "RuleElem{token='" + this.f34177a + "', refSlot='" + this.c + "', hash=" + this.f + ", maxWind=" + this.i + ", isStart=" + this.g + ", isEnd=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }

    public t0l(t0l t0lVar) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = -1;
        this.f34177a = t0lVar.g();
        this.f34178b = t0lVar.c();
        this.c = t0lVar.e();
        this.d = t0lVar.f();
        this.e = t0lVar.e;
        this.g = t0lVar.i();
        this.h = t0lVar.h();
        this.i = t0lVar.i;
        this.j = t0lVar.j;
    }

    public t0l(t0l t0lVar, String str) {
        this(t0lVar);
        this.f34177a = str;
    }

    public t0l(String str, String str2, String str3) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = -1;
        this.f34177a = str;
        this.c = str2;
        this.d = str3;
        this.e = RefSlotType.STRING;
    }

    public t0l(t0l t0lVar, String str, String str2) {
        this(t0lVar);
        this.f34177a = str;
        this.c = str2;
    }
}
