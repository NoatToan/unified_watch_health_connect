package z2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.NoSuchElementException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz2/m;", "Lz2/y0;", "Lp1/s;", "selectableIdToInfoListIndex", "", "Lz2/z;", "infoList", "", "startSlot", "endSlot", "", "isStartHandle", "Lz2/b0;", "previousSelection", "<init>", "(Lp1/s;Ljava/util/List;IIZLz2/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.s f201683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<z> f201684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f201686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f201687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f201688f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201689a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f201689a = iArr;
        }
    }

    public m(p1.s sVar, List<z> list, int i14, int i15, boolean z14, b0 b0Var) {
        this.f201683a = sVar;
        this.f201684b = list;
        this.f201685c = i14;
        this.f201686d = i15;
        this.f201687e = z14;
        this.f201688f = b0Var;
        if (list.size() > 1) {
            return;
        }
        b2.e.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void m(p1.m0 m0Var, b0 b0Var, z zVar, int i14, int i15) {
        b0 b0Var2;
        if (b0Var.f201525c) {
            b0Var2 = new b0(zVar.a(i15), zVar.a(i14), i15 > i14);
        } else {
            b0Var2 = new b0(zVar.a(i14), zVar.a(i15), i14 > i15);
        }
        if (i14 > i15) {
            b2.e.c("minOffset should be less than or equal to maxOffset: " + b0Var2);
        }
        long j8 = zVar.f201848a;
        int iD = m0Var.d(j8);
        Object[] objArr = m0Var.f134842c;
        Object obj = objArr[iD];
        m0Var.f134841b[iD] = j8;
        objArr[iD] = b0Var2;
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF201687e() {
        return this.f201687e;
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: b */
    public final z getF201823e() {
        return this.f201687e ? i() : h();
    }

    @Override // z2.y0
    public final g c() {
        int i14 = this.f201685c;
        int i15 = this.f201686d;
        if (i14 < i15) {
            return g.NOT_CROSSED;
        }
        if (i14 > i15) {
            return g.CROSSED;
        }
        return this.f201684b.get(i14 / 2).b();
    }

    @Override // z2.y0
    public final z d() {
        return c() == g.CROSSED ? h() : i();
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF201686d() {
        return this.f201686d;
    }

    @Override // z2.y0
    public final void f(e23.l<? super z, Unit> lVar) {
        int iN = n(d().f201848a);
        int iN2 = n((c() == g.CROSSED ? i() : h()).f201848a);
        int i14 = iN + 1;
        if (i14 >= iN2) {
            return;
        }
        while (i14 < iN2) {
            lVar.invoke(this.f201684b.get(i14));
            i14++;
        }
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getF201688f() {
        return this.f201688f;
    }

    @Override // z2.y0
    public final int getSize() {
        return this.f201684b.size();
    }

    @Override // z2.y0
    public final z h() {
        return this.f201684b.get(o(this.f201686d, false));
    }

    @Override // z2.y0
    public final z i() {
        return this.f201684b.get(o(this.f201685c, true));
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF201685c() {
        return this.f201685c;
    }

    @Override // z2.y0
    public final boolean k(y0 y0Var) {
        if (this.f201688f != null && y0Var != null && (y0Var instanceof m)) {
            m mVar = (m) y0Var;
            List<z> list = mVar.f201684b;
            if (this.f201687e == mVar.f201687e && this.f201685c == mVar.f201685c && this.f201686d == mVar.f201686d) {
                List<z> list2 = this.f201684b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        z zVar = list2.get(i14);
                        z zVar2 = list.get(i14);
                        if (zVar.f201848a != zVar2.f201848a || zVar.f201850c != zVar2.f201850c || zVar.f201851d != zVar2.f201851d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // z2.y0
    public final p1.m0 l(b0 b0Var) {
        b0.a aVar = b0Var.f201523a;
        boolean z14 = b0Var.f201525c;
        long j8 = aVar.f201528c;
        int i14 = aVar.f201527b;
        b0.a aVar2 = b0Var.f201524b;
        long j14 = aVar2.f201528c;
        int i15 = aVar2.f201527b;
        if (j8 != j14) {
            p1.m0 m0VarA = p1.w.a();
            m(m0VarA, b0Var, d(), (z14 ? aVar2 : aVar).f201527b, d().f201853f.f157280a.f157265a.f157138b.length());
            f(new yt.f(this, m0VarA, b0Var));
            if (!z14) {
                aVar = aVar2;
            }
            m(m0VarA, b0Var, c() == g.CROSSED ? i() : h(), 0, aVar.f201527b);
            return m0VarA;
        }
        if ((!z14 || i14 < i15) && (z14 || i14 > i15)) {
            b2.e.c("unexpectedly miss-crossed selection: " + b0Var);
        }
        long j15 = aVar.f201528c;
        p1.m0 m0Var = p1.w.f134861a;
        p1.m0 m0Var2 = new p1.m0(0, 1, null);
        m0Var2.h(j15, b0Var);
        return m0Var2;
    }

    public final int n(long j8) {
        try {
            return this.f201683a.b(j8);
        } catch (NoSuchElementException e4) {
            com.airbnb.lottie.animation.keyframe.a.x(org.apache.commons.lang3.e.e(j8, "Invalid selectableId: "), e4);
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i14, boolean z14) {
        int i15 = a.f201689a[c().ordinal()];
        boolean z15 = z14;
        if (i15 == 1) {
            z15 = 1;
        } else if (i15 != 2) {
            if (i15 != 3) {
                lc.u0.r();
                return 0;
            }
            if (z14) {
                z15 = 0;
            } else {
                z15 = 1;
            }
        }
        return (i14 - (!z15)) / 2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb3.append(this.f201687e);
        sb3.append(", startPosition=");
        boolean z14 = true;
        float f14 = 2;
        sb3.append((this.f201685c + 1) / f14);
        sb3.append(", endPosition=");
        sb3.append((this.f201686d + 1) / f14);
        sb3.append(", crossed=");
        sb3.append(c());
        sb3.append(", infos=");
        StringBuilder sb4 = new StringBuilder("[\n\t");
        List<z> list = this.f201684b;
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            z zVar = list.get(i14);
            if (z14) {
                z14 = false;
            } else {
                sb4.append(",\n\t");
            }
            StringBuilder sb5 = new StringBuilder();
            i14++;
            sb5.append(i14);
            sb5.append(" -> ");
            sb5.append(zVar);
            sb4.append(sb5.toString());
        }
        sb4.append("\n]");
        sb3.append(sb4.toString());
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }
}
