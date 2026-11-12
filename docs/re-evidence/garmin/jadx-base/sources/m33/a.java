package m33;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.c1;
import p43.c2;
import p43.d0;
import p43.v0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f116422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f116423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f116425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<d1> f116426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0 f116427i;

    public /* synthetic */ a(c2 c2Var, b bVar, boolean z14, boolean z15, Set set, v0 v0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c2Var, (i14 & 2) != 0 ? b.INFLEXIBLE : bVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? null : set, (i14 & 32) != 0 ? null : v0Var);
    }

    public static a e(a aVar, b bVar, boolean z14, Set set, v0 v0Var, int i14) {
        c2 c2Var = aVar.f116422d;
        if ((i14 & 2) != 0) {
            bVar = aVar.f116423e;
        }
        b bVar2 = bVar;
        if ((i14 & 4) != 0) {
            z14 = aVar.f116424f;
        }
        boolean z15 = z14;
        boolean z16 = aVar.f116425g;
        if ((i14 & 16) != 0) {
            set = aVar.f116426h;
        }
        Set set2 = set;
        if ((i14 & 32) != 0) {
            v0Var = aVar.f116427i;
        }
        aVar.getClass();
        c2Var.getClass();
        bVar2.getClass();
        return new a(c2Var, bVar2, z15, z16, set2, v0Var);
    }

    @Override // p43.d0
    public final v0 a() {
        return this.f116427i;
    }

    @Override // p43.d0
    public final c2 b() {
        return this.f116422d;
    }

    @Override // p43.d0
    public final Set<d1> c() {
        return this.f116426h;
    }

    @Override // p43.d0
    public final d0 d(d1 d1Var) {
        Set<d1> set = this.f116426h;
        return e(this, null, false, set != null ? c1.i(set, d1Var) : a1.b(d1Var), null, 47);
    }

    @Override // p43.d0
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(aVar.f116427i, this.f116427i) && aVar.f116422d == this.f116422d && aVar.f116423e == this.f116423e && aVar.f116424f == this.f116424f && aVar.f116425g == this.f116425g;
    }

    public final a f(b bVar) {
        bVar.getClass();
        return e(this, bVar, false, null, null, 61);
    }

    @Override // p43.d0
    public final int hashCode() {
        v0 v0Var = this.f116427i;
        int iHashCode = v0Var != null ? v0Var.hashCode() : 0;
        int iHashCode2 = this.f116422d.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f116423e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i14 = (iHashCode3 * 31) + (this.f116424f ? 1 : 0) + iHashCode3;
        return (i14 * 31) + (this.f116425g ? 1 : 0) + i14;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f116422d + ", flexibility=" + this.f116423e + ", isRaw=" + this.f116424f + ", isForAnnotationParameter=" + this.f116425g + ", visitedTypeParameters=" + this.f116426h + ", defaultType=" + this.f116427i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(c2 c2Var, b bVar, boolean z14, boolean z15, Set<? extends d1> set, v0 v0Var) {
        super(c2Var, set, v0Var);
        c2Var.getClass();
        bVar.getClass();
        this.f116422d = c2Var;
        this.f116423e = bVar;
        this.f116424f = z14;
        this.f116425g = z15;
        this.f116426h = set;
        this.f116427i = v0Var;
    }
}
