package z2;

import java.util.ArrayList;
import java.util.ListIterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f201643b;

    public /* synthetic */ i0(o1 o1Var, int i14) {
        this.f201642a = i14;
        this.f201643b = o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [T, s5.w0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, s5.c] */
    @Override // e23.a
    public final Object invoke() {
        long j8;
        long j14;
        int iNextIndex;
        o53.b0 b0Var;
        switch (this.f201642a) {
            case 0:
                n4.c cVar = (n4.c) this.f201643b.f201726q.getF182175a();
                if (cVar != null) {
                    j8 = cVar.f123544a;
                } else {
                    n4.c.f123541b.getClass();
                    j8 = n4.c.f123543d;
                }
                return n4.c.a(j8);
            case 1:
                n4.c cVar2 = (n4.c) this.f201643b.f201727r.getF182175a();
                if (cVar2 != null) {
                    j14 = cVar2.f123544a;
                } else {
                    n4.c.f123541b.getClass();
                    j14 = n4.c.f123543d;
                }
                return n4.c.a(j14);
            case 2:
                this.f201643b.k();
                return Unit.INSTANCE;
            case 3:
                return this.f201643b.d();
            case 4:
                o1 o1Var = this.f201643b;
                o1Var.f201734y = true;
                o1Var.r();
                o1Var.f201728s.setValue(null);
                o1Var.f201729t.setValue(null);
                if (o1Var.f201731v && o1Var.j()) {
                    p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                    p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                    p005kotlin.jvm.internal.q0 q0Var = new p005kotlin.jvm.internal.q0();
                    r1 r1Var = o1Var.f201710a;
                    ArrayList arrayListK = r1Var.k(o1Var.l());
                    ListIterator listIterator = arrayListK.listIterator(arrayListK.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            b0 b0VarB = r1Var.h().b(((y) listIterator.previous()).getF201695a());
                            if (b0VarB != null && b0VarB.f201523a.f201527b != b0VarB.f201524b.f201527b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = arrayListK.size();
                        int i14 = 0;
                        while (i14 < size) {
                            y yVar = (y) arrayListK.get(i14);
                            r1 r1Var2 = r1Var;
                            b0 b0VarB2 = r1Var.h().b(yVar.getF201695a());
                            if (b0VarB2 != null) {
                                ?? text = yVar.getText();
                                long jL = og.a.l(b0VarB2.f201523a.f201527b, b0VarB2.f201524b.f201527b);
                                boolean z14 = i14 >= iNextIndex;
                                long f201695a = yVar.getF201695a();
                                if (z14) {
                                    r0Var.f105810a = text;
                                    r0Var2.f105810a = s5.w0.a(jL);
                                    q0Var.f105808a = f201695a;
                                }
                            } else {
                                i14++;
                                r1Var = r1Var2;
                            }
                        }
                    }
                    T t7 = r0Var.f105810a;
                    if (t7 != 0 && r0Var2.f105810a != 0 && q0Var.f105808a != 0 && ((CharSequence) t7).length() > 0 && (b0Var = o1Var.f201732w) != null) {
                        ge1.b.T(b0Var, null, null, new l1(o1Var, r0Var, r0Var2, q0Var, null), 3);
                    }
                }
                o1Var.f201731v = false;
                return Unit.INSTANCE;
            case 5:
                this.f201643b.b();
                return Unit.INSTANCE;
            case 6:
                this.f201643b.m();
                return Unit.INSTANCE;
            case 7:
                o1 o1Var2 = this.f201643b;
                o1Var2.b();
                if (o1Var2.i()) {
                    o1Var2.k();
                }
                return Unit.INSTANCE;
            case 8:
                o1 o1Var3 = this.f201643b;
                return Boolean.valueOf((o1Var3.f201734y && o1Var3.i()) ? false : true);
            default:
                this.f201643b.m();
                return Unit.INSTANCE;
        }
    }
}
