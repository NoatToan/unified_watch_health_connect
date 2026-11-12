package v2;

import android.view.autofill.AutofillValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.i3;
import p006l2.t2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lv2/y;", "Lh5/m;", "Lh5/y1;", "Lx5/q0;", "transformedText", "Lx5/l0;", "value", "Ll2/b2;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "readOnly", "enabled", "isPassword", "Lx5/c0;", "offsetMapping", "Lz2/h2;", "manager", "Lx5/q;", "imeOptions", "Lm4/b0;", "focusRequester", "<init>", "(Lx5/q0;Lx5/l0;Ll2/b2;ZZZLx5/c0;Lz2/h2;Lx5/q;Lm4/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y extends h5.m implements h5.y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x5.q0 f175254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x5.l0 f175255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p006l2.b2 f175256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f175257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f175258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f175259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x5.c0 f175260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z2.h2 f175261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x5.q f175262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m4.b0 f175263l;

    public y(x5.q0 q0Var, x5.l0 l0Var, p006l2.b2 b2Var, boolean z14, boolean z15, boolean z16, x5.c0 c0Var, z2.h2 h2Var, x5.q qVar, m4.b0 b0Var) {
        this.f175254c = q0Var;
        this.f175255d = l0Var;
        this.f175256e = b2Var;
        this.f175257f = z14;
        this.f175258g = z15;
        this.f175259h = z16;
        this.f175260i = c0Var;
        this.f175261j = h2Var;
        this.f175262k = qVar;
        this.f175263l = b0Var;
        h2Var.f201610g = new w(this, 4);
    }

    public static void X1(p006l2.b2 b2Var, String str, boolean z14, boolean z15) {
        if (z14 || !z15) {
            return;
        }
        x5.p0 p0Var = b2Var.f108395e;
        p006l2.x0 x0Var = b2Var.f108412v;
        if (p0Var == null) {
            int length = str.length();
            x0Var.invoke(new x5.l0(str, og.a.l(length, length), (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
            return;
        }
        t2.a aVar = t2.f108797a;
        List<? extends x5.k> listK = p13.x.k(new x5.h(), new x5.b(str, 1));
        x5.l lVar = b2Var.f108394d;
        aVar.getClass();
        x5.l0 l0VarA = lVar.a(listK);
        if (p005kotlin.jvm.internal.s.g(p0Var.f188928a.f188887b.get(), p0Var)) {
            p0Var.f188929b.c(null, l0VarA);
        }
        x0Var.invoke(l0VarA);
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        s5.c cVar = this.f175255d.f188878a;
        k23.l<Object>[] lVarArr = p5.h0.f136016a;
        p5.d0 d0Var = p5.d0.f135959a;
        d0Var.getClass();
        p5.j0<s5.c> j0Var = p5.d0.G;
        k23.l<Object>[] lVarArr2 = p5.h0.f136016a;
        k23.l<Object> lVar = lVarArr2[18];
        j0Var.getClass();
        k0Var.a(j0Var, cVar);
        s5.c cVar2 = this.f175254c.f188939a;
        d0Var.getClass();
        p5.j0<s5.c> j0Var2 = p5.d0.H;
        k23.l<Object> lVar2 = lVarArr2[19];
        j0Var2.getClass();
        k0Var.a(j0Var2, cVar2);
        long j8 = this.f175255d.f188879b;
        d0Var.getClass();
        p5.j0<s5.w0> j0Var3 = p5.d0.I;
        k23.l<Object> lVar3 = lVarArr2[20];
        s5.w0 w0VarA = s5.w0.a(j8);
        j0Var3.getClass();
        k0Var.a(j0Var3, w0VarA);
        i4.r.f90875a.getClass();
        p5.h0.m(k0Var, i4.r.a.f90877b);
        int i14 = i4.t.f90884a;
        p5.h0.q(k0Var, new i4.h(AutofillValue.forText(this.f175255d.f188878a)));
        boolean z14 = false;
        z14 = false;
        final int i15 = z14 ? 1 : 0;
        p5.h0.j(k0Var, new e23.l(this) { // from class: v2.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f175249b;

            {
                this.f175249b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z15;
                switch (i15) {
                    case 0:
                        y yVar = this.f175249b;
                        p3.c2 c2Var = yVar.f175256e.f108410t;
                        Boolean bool = Boolean.TRUE;
                        c2Var.setValue(bool);
                        yVar.f175256e.f108409s.setValue(bool);
                        p006l2.b2 b2Var = yVar.f175256e;
                        CharSequence charSequenceB = ((i4.t) obj).b();
                        charSequenceB.getClass();
                        y.X1(b2Var, (String) charSequenceB, yVar.f175257f, yVar.f175258g);
                        return bool;
                    case 1:
                        List list = (List) obj;
                        y yVar2 = this.f175249b;
                        if (yVar2.f175256e.d() != null) {
                            i3 i3VarD = yVar2.f175256e.d();
                            i3VarD.getClass();
                            list.add(i3VarD.f108575a);
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        return Boolean.valueOf(z15);
                    default:
                        y yVar3 = this.f175249b;
                        y.X1(yVar3.f175256e, ((s5.c) obj).f157138b, yVar3.f175257f, yVar3.f175258g);
                        return Boolean.TRUE;
                }
            }
        });
        int i16 = this.f175262k.f188935d;
        x5.v.f188954b.getClass();
        if (i16 == x5.v.f188960h) {
            i4.s.f90879a.getClass();
            p5.h0.o(k0Var, i4.s.a.f90882c);
        } else if (i16 == x5.v.f188961i || i16 == x5.v.f188962j) {
            i4.s.f90879a.getClass();
            p5.h0.o(k0Var, i4.s.a.f90881b);
        } else if (i16 == x5.v.f188958f) {
            i4.s.f90879a.getClass();
            p5.h0.o(k0Var, i4.s.a.f90883d);
        }
        if (!this.f175258g) {
            p5.h0.b(k0Var);
        }
        boolean z15 = this.f175259h;
        if (z15) {
            d0Var.getClass();
            k0Var.a(p5.d0.M, Unit.INSTANCE);
        }
        final int i17 = 1;
        if (this.f175258g && !this.f175257f) {
            z14 = true;
        }
        d0Var.getClass();
        p5.j0<Boolean> j0Var4 = p5.d0.P;
        k23.l<Object> lVar4 = lVarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z14);
        j0Var4.getClass();
        k0Var.a(j0Var4, boolValueOf);
        p5.h0.e(k0Var, new e23.l(this) { // from class: v2.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f175249b;

            {
                this.f175249b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z16;
                switch (i17) {
                    case 0:
                        y yVar = this.f175249b;
                        p3.c2 c2Var = yVar.f175256e.f108410t;
                        Boolean bool = Boolean.TRUE;
                        c2Var.setValue(bool);
                        yVar.f175256e.f108409s.setValue(bool);
                        p006l2.b2 b2Var = yVar.f175256e;
                        CharSequence charSequenceB = ((i4.t) obj).b();
                        charSequenceB.getClass();
                        y.X1(b2Var, (String) charSequenceB, yVar.f175257f, yVar.f175258g);
                        return bool;
                    case 1:
                        List list = (List) obj;
                        y yVar2 = this.f175249b;
                        if (yVar2.f175256e.d() != null) {
                            i3 i3VarD = yVar2.f175256e.d();
                            i3VarD.getClass();
                            list.add(i3VarD.f108575a);
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        return Boolean.valueOf(z16);
                    default:
                        y yVar3 = this.f175249b;
                        y.X1(yVar3.f175256e, ((s5.c) obj).f157138b, yVar3.f175257f, yVar3.f175258g);
                        return Boolean.TRUE;
                }
            }
        });
        final int i18 = 2;
        if (z14) {
            e23.l lVar5 = new e23.l(this) { // from class: v2.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y f175249b;

                {
                    this.f175249b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    boolean z16;
                    switch (i18) {
                        case 0:
                            y yVar = this.f175249b;
                            p3.c2 c2Var = yVar.f175256e.f108410t;
                            Boolean bool = Boolean.TRUE;
                            c2Var.setValue(bool);
                            yVar.f175256e.f108409s.setValue(bool);
                            p006l2.b2 b2Var = yVar.f175256e;
                            CharSequence charSequenceB = ((i4.t) obj).b();
                            charSequenceB.getClass();
                            y.X1(b2Var, (String) charSequenceB, yVar.f175257f, yVar.f175258g);
                            return bool;
                        case 1:
                            List list = (List) obj;
                            y yVar2 = this.f175249b;
                            if (yVar2.f175256e.d() != null) {
                                i3 i3VarD = yVar2.f175256e.d();
                                i3VarD.getClass();
                                list.add(i3VarD.f108575a);
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            return Boolean.valueOf(z16);
                        default:
                            y yVar3 = this.f175249b;
                            y.X1(yVar3.f175256e, ((s5.c) obj).f157138b, yVar3.f175257f, yVar3.f175258g);
                            return Boolean.TRUE;
                    }
                }
            };
            p5.p pVar = p5.p.f136057a;
            pVar.getClass();
            k0Var.a(p5.p.f136068l, new p5.a(null, lVar5));
            ty1.g2 g2Var = new ty1.g2(8, this, k0Var);
            pVar.getClass();
            k0Var.a(p5.p.f136072p, new p5.a(null, g2Var));
        }
        t21.v0 v0Var = new t21.v0(this, 11);
        p5.p pVar2 = p5.p.f136057a;
        pVar2.getClass();
        k0Var.a(p5.p.f136067k, new p5.a(null, v0Var));
        p5.h0.k(k0Var, this.f175262k.f188936e, new w(this, 6));
        p5.h0.i(k0Var, null, new w(this, 7));
        w wVar = new w(this, 1);
        pVar2.getClass();
        k0Var.a(p5.p.f136060d, new p5.a(null, wVar));
        if (!s5.w0.e(this.f175255d.f188879b) && !z15) {
            w wVar2 = new w(this, 2);
            pVar2.getClass();
            k0Var.a(p5.p.f136074r, new p5.a(null, wVar2));
            if (this.f175258g && !this.f175257f) {
                w wVar3 = new w(this, 3);
                pVar2.getClass();
                k0Var.a(p5.p.f136075s, new p5.a(null, wVar3));
            }
        }
        if (!this.f175258g || this.f175257f) {
            return;
        }
        w wVar4 = new w(this, 5);
        pVar2.getClass();
        k0Var.a(p5.p.f136076t, new p5.a(null, wVar4));
    }

    @Override // h5.y1
    /* JADX INFO: renamed from: l1 */
    public final boolean getF136009a() {
        return true;
    }
}
