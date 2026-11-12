package w63;

import java.io.File;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lw63/y;", "", "Lw63/h;", "bytes", "<init>", "(Lw63/h;)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements Comparable<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f183408b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f183409c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f183410a;

    static {
        String str = File.separator;
        str.getClass();
        f183409c = str;
    }

    public y(h hVar) {
        hVar.getClass();
        this.f183410a = hVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = x63.c.a(this);
        h hVar = this.f183410a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < hVar.d() && hVar.i(iA) == 92) {
            iA++;
        }
        int iD = hVar.d();
        int i14 = iA;
        while (iA < iD) {
            if (hVar.i(iA) == 47 || hVar.i(iA) == 92) {
                arrayList.add(hVar.p(i14, iA));
                i14 = iA + 1;
            }
            iA++;
        }
        if (i14 < hVar.d()) {
            arrayList.add(hVar.p(i14, hVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        h hVar = x63.c.f189312a;
        h hVarQ = this.f183410a;
        int iL = h.l(hVarQ, hVar);
        if (iL == -1) {
            iL = h.l(hVarQ, x63.c.f189313b);
        }
        if (iL != -1) {
            hVarQ = h.q(hVarQ, iL + 1, 0, 2);
        } else if (f() != null && hVarQ.d() == 2) {
            hVarQ = h.f183362e;
        }
        return hVarQ.s();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final y c() {
        h hVar = x63.c.f189315d;
        h hVar2 = this.f183410a;
        if (hVar2.equals(hVar)) {
            return null;
        }
        h hVar3 = x63.c.f189312a;
        if (hVar2.equals(hVar3)) {
            return null;
        }
        h hVar4 = x63.c.f189313b;
        if (hVar2.equals(hVar4)) {
            return null;
        }
        h hVar5 = x63.c.f189316e;
        hVar5.getClass();
        int iD = hVar2.d();
        byte[] bArr = hVar5.f183363a;
        if (hVar2.n(iD - bArr.length, hVar5, bArr.length) && (hVar2.d() == 2 || hVar2.n(hVar2.d() - 3, hVar3, 1) || hVar2.n(hVar2.d() - 3, hVar4, 1))) {
            return null;
        }
        int iL = h.l(hVar2, hVar3);
        if (iL == -1) {
            iL = h.l(hVar2, hVar4);
        }
        if (iL == 2 && f() != null) {
            if (hVar2.d() == 3) {
                return null;
            }
            return new y(h.q(hVar2, 0, 3, 1));
        }
        if (iL == 1) {
            hVar4.getClass();
            if (hVar2.n(0, hVar4, hVar4.d())) {
                return null;
            }
        }
        if (iL != -1 || f() == null) {
            if (iL == -1) {
                return new y(hVar);
            }
            return iL == 0 ? new y(h.q(hVar2, 0, 1, 1)) : new y(h.q(hVar2, 0, iL, 1));
        }
        if (hVar2.d() == 2) {
            return null;
        }
        return new y(h.q(hVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(y yVar) {
        y yVar2 = yVar;
        yVar2.getClass();
        return this.f183410a.compareTo(yVar2.f183410a);
    }

    public final y d(y yVar) {
        yVar.getClass();
        h hVar = yVar.f183410a;
        int iA = x63.c.a(this);
        h hVar2 = this.f183410a;
        y yVar2 = iA == -1 ? null : new y(hVar2.p(0, iA));
        int iA2 = x63.c.a(yVar);
        if (!p005kotlin.jvm.internal.s.g(yVar2, iA2 != -1 ? new y(hVar.p(0, iA2)) : null)) {
            vb.h.A("Paths of different roots cannot be relative to each other: ", this, " and ", yVar);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = yVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i14 = 0;
        while (i14 < iMin && p005kotlin.jvm.internal.s.g(arrayListA.get(i14), arrayListA2.get(i14))) {
            i14++;
        }
        if (i14 == iMin && hVar2.d() == hVar.d()) {
            f183408b.getClass();
            return a.a(".");
        }
        if (arrayListA2.subList(i14, arrayListA2.size()).indexOf(x63.c.f189316e) != -1) {
            vb.h.A("Impossible relative path to resolve: ", this, " and ", yVar);
            return null;
        }
        if (hVar.equals(x63.c.f189315d)) {
            return this;
        }
        e eVar = new e();
        h hVarC = x63.c.c(yVar);
        if (hVarC == null && (hVarC = x63.c.c(this)) == null) {
            hVarC = x63.c.f(f183409c);
        }
        int size = arrayListA2.size();
        for (int i15 = i14; i15 < size; i15++) {
            eVar.E(x63.c.f189316e);
            eVar.E(hVarC);
        }
        int size2 = arrayListA.size();
        while (i14 < size2) {
            eVar.E((h) arrayListA.get(i14));
            eVar.E(hVarC);
            i14++;
        }
        return x63.c.d(eVar, false);
    }

    public final y e(String str) {
        str.getClass();
        e eVar = new e();
        eVar.R(str);
        return x63.c.b(this, x63.c.d(eVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && ((y) obj).f183410a.equals(this.f183410a);
    }

    public final Character f() {
        h hVar = x63.c.f189312a;
        h hVar2 = this.f183410a;
        if (h.g(hVar2, hVar) != -1 || hVar2.d() < 2 || hVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) hVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f183410a.hashCode();
    }

    public final File toFile() {
        return new File(this.f183410a.s());
    }

    public final String toString() {
        return this.f183410a.s();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw63/y$a;", "", "<init>", "()V", "", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static y a(String str) {
            str.getClass();
            h hVar = x63.c.f189312a;
            e eVar = new e();
            eVar.R(str);
            return x63.c.d(eVar, false);
        }

        private a() {
        }
    }
}
