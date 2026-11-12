package g8;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import e23.l;
import e23.p;
import h4.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: g8.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C1530a<T> extends w implements l<T, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1530a f76215a = new C1530a();

        public C1530a() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/fragment/app/Fragment;", "T", "Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends w implements l<i0, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f76216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f76217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f76218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Class<T> f76219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<l<T, Unit>> f76220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f76221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Bundle f76222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f76223h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v vVar, d dVar, Context context, Class<T> cls, x3<? extends l<? super T, Unit>> x3Var, e eVar, Bundle bundle, int i14) {
            super(1);
            this.f76216a = vVar;
            this.f76217b = dVar;
            this.f76218c = context;
            this.f76219d = cls;
            this.f76220e = x3Var;
            this.f76221f = eVar;
            this.f76222g = bundle;
            this.f76223h = i14;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            m0 m0Var = new m0();
            d dVar = this.f76217b;
            int id3 = dVar.a().getId();
            v vVar = this.f76216a;
            Fragment fragmentF = vVar.F(id3);
            e eVar = this.f76221f;
            if (fragmentF == null) {
                fragmentF = vVar.P().instantiate(this.f76218c.getClassLoader(), this.f76219d.getName());
                fragmentF.setInitialSavedState(eVar.f76239a.getF182175a());
                fragmentF.setArguments(this.f76222g);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
                aVar.f7250r = true;
                aVar.b(dVar.a(), fragmentF, String.valueOf(this.f76223h));
                if (vVar.V()) {
                    m0Var.f105804a = true;
                    fragmentF.getF158016a().a(new g8.b(m0Var, fragmentF));
                    aVar.f();
                } else {
                    aVar.t();
                }
            }
            vVar.Y(dVar.a());
            ((l) this.f76220e.getF182175a()).invoke(fragmentF);
            return new g8.c(vVar, fragmentF, eVar, m0Var);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class<T> f76224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f76225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f76226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f76227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<T, Unit> f76228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f76229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f76230g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Class<T> cls, r rVar, e eVar, Bundle bundle, l<? super T, Unit> lVar, int i14, int i15) {
            super(2);
            this.f76224a = cls;
            this.f76225b = rVar;
            this.f76226c = eVar;
            this.f76227d = bundle;
            this.f76228e = lVar;
            this.f76229f = i14;
            this.f76230g = i15;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            num.intValue();
            a.a(this.f76224a, this.f76225b, this.f76226c, this.f76227d, this.f76228e, mVar, p0.t(this.f76229f | 1), this.f76230g);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0191  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x018b  */
    public static final <T extends Fragment> void a(Class<T> cls, r rVar, e eVar, Bundle bundle, l<? super T, Unit> lVar, m mVar, int i14, int i15) {
        int i16;
        r rVar2;
        e eVar2;
        Bundle bundle2;
        int i17;
        l<? super T, Unit> lVar2;
        int i18;
        r rVar3;
        e eVarU;
        Bundle bundle3;
        int i19;
        e eVar3;
        l<? super T, Unit> lVar3;
        Bundle bundle4;
        p1 p1VarQ;
        int iP;
        View view2;
        boolean zB;
        Object objQ;
        m.a aVar;
        v vVar;
        Context context;
        Object objK;
        m.a.C2565a c2565a;
        d dVar;
        boolean zR;
        Object objQ2;
        e eVar4;
        o0 o0Var;
        Bundle bundle5;
        e eVar5;
        Bundle bundle6;
        l<? super T, Unit> lVar4;
        r rVar4;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(-1012439764);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(cls) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4) == 0) {
                    eVar2 = eVar;
                    int i25 = o0VarE.B(eVar2) ? 256 : 128;
                    i16 |= i25;
                } else {
                    eVar2 = eVar;
                }
                i16 |= i25;
            } else {
                eVar2 = eVar;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    bundle2 = bundle;
                    int i26 = o0VarE.r(bundle2) ? 2048 : 1024;
                    i16 |= i26;
                } else {
                    bundle2 = bundle;
                }
                i16 |= i26;
            } else {
                bundle2 = bundle;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((i16 & 9363) == 9362 || !o0VarE.b()) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i24 != 0) {
                            rVar3 = r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i15 & 4) != 0) {
                            eVarU = i.U(o0VarE);
                            i16 &= -897;
                        } else {
                            eVarU = eVar2;
                        }
                        if ((i15 & 8) != 0) {
                            bundle3 = Bundle.EMPTY;
                            i16 &= -7169;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i17 != 0) {
                            i19 = i16;
                            eVar3 = eVarU;
                            bundle4 = bundle3;
                            lVar3 = C1530a.f76215a;
                            rVar2 = rVar3;
                        } else {
                            i19 = i16;
                            eVar3 = eVarU;
                            lVar3 = lVar2;
                            rVar2 = rVar3;
                            bundle4 = bundle3;
                        }
                    } else {
                        o0VarE.e();
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                        }
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                        i19 = i16;
                        eVar3 = eVar2;
                        lVar3 = lVar2;
                        bundle4 = bundle2;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    p1VarQ = p0.q(lVar3, o0VarE);
                    iP = o0VarE.P();
                    view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                    o0VarE.L(485393906);
                    zB = o0VarE.B(view2);
                    objQ = o0VarE.q();
                    aVar = m.f135153a;
                    if (zB) {
                        objQ = v.H(view2);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = v.H(view2);
                            o0VarE.K(objQ);
                        }
                    }
                    vVar = (v) objQ;
                    o0VarE.g0(false);
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objK = fb1.c.k(o0VarE, 485398332, aVar);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = new d(iP);
                        o0VarE.K(objK);
                    }
                    dVar = (d) objK;
                    o0VarE.g0(false);
                    p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
                    r rVar5 = rVar2;
                    Object[] objArr = {vVar, dVar, cls, eVar3};
                    o0VarE.L(485406992);
                    zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
                    objQ2 = o0VarE.q();
                    if (!zR || objQ2 == c2565a) {
                        eVar4 = eVar3;
                        o0Var = o0VarE;
                        bundle5 = bundle4;
                        b bVar = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                        o0Var.K(bVar);
                        objQ2 = bVar;
                    } else {
                        eVar4 = eVar3;
                        o0Var = o0VarE;
                        bundle5 = bundle4;
                    }
                    o0Var.g0(false);
                    l0.d(objArr, (l) objQ2, o0Var);
                    eVar5 = eVar4;
                    bundle6 = bundle5;
                    lVar4 = lVar3;
                    rVar4 = rVar5;
                } else {
                    o0VarE.e();
                    rVar4 = rVar2;
                    eVar5 = eVar2;
                    o0Var = o0VarE;
                    bundle6 = bundle2;
                    lVar4 = lVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c(cls, rVar4, eVar5, bundle6, lVar4, i14, i15);
                }
            }
            i16 |= 24576;
            lVar2 = lVar;
            if ((i16 & 9363) == 9362) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                }
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                p1VarQ = p0.q(lVar3, o0VarE);
                iP = o0VarE.P();
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                o0VarE.L(485393906);
                zB = o0VarE.B(view2);
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zB) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = v.H(view2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = v.H(view2);
                    o0VarE.K(objQ);
                }
                vVar = (v) objQ;
                o0VarE.g0(false);
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objK = fb1.c.k(o0VarE, 485398332, aVar);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = new d(iP);
                    o0VarE.K(objK);
                }
                dVar = (d) objK;
                o0VarE.g0(false);
                p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
                r rVar6 = rVar2;
                Object[] objArr2 = {vVar, dVar, cls, eVar3};
                o0VarE.L(485406992);
                zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
                objQ2 = o0VarE.q();
                if (zR) {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar2 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar2);
                    objQ2 = bVar2;
                } else {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar3 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar3);
                    objQ2 = bVar3;
                }
                o0Var.g0(false);
                l0.d(objArr2, (l) objQ2, o0Var);
                eVar5 = eVar4;
                bundle6 = bundle5;
                lVar4 = lVar3;
                rVar4 = rVar6;
            } else {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                p1VarQ = p0.q(lVar3, o0VarE);
                iP = o0VarE.P();
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                o0VarE.L(485393906);
                zB = o0VarE.B(view2);
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zB) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = v.H(view2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = v.H(view2);
                    o0VarE.K(objQ);
                }
                vVar = (v) objQ;
                o0VarE.g0(false);
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objK = fb1.c.k(o0VarE, 485398332, aVar);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = new d(iP);
                    o0VarE.K(objK);
                }
                dVar = (d) objK;
                o0VarE.g0(false);
                p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
                r rVar7 = rVar2;
                Object[] objArr3 = {vVar, dVar, cls, eVar3};
                o0VarE.L(485406992);
                zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
                objQ2 = o0VarE.q();
                if (zR) {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar4 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar4);
                    objQ2 = bVar4;
                } else {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar5 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar5);
                    objQ2 = bVar5;
                }
                o0Var.g0(false);
                l0.d(objArr3, (l) objQ2, o0Var);
                eVar5 = eVar4;
                bundle6 = bundle5;
                lVar4 = lVar3;
                rVar4 = rVar7;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c(cls, rVar4, eVar5, bundle6, lVar4, i14, i15);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                eVar2 = eVar;
                if (o0VarE.B(eVar2)) {
                }
                i16 |= i25;
            } else {
                eVar2 = eVar;
            }
            i16 |= i25;
        } else {
            eVar2 = eVar;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                bundle2 = bundle;
                if (o0VarE.r(bundle2)) {
                }
                i16 |= i26;
            } else {
                bundle2 = bundle;
            }
            i16 |= i26;
        } else {
            bundle2 = bundle;
        }
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((i16 & 9363) == 9362) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                }
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                p1VarQ = p0.q(lVar3, o0VarE);
                iP = o0VarE.P();
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                o0VarE.L(485393906);
                zB = o0VarE.B(view2);
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zB) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = v.H(view2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = v.H(view2);
                    o0VarE.K(objQ);
                }
                vVar = (v) objQ;
                o0VarE.g0(false);
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objK = fb1.c.k(o0VarE, 485398332, aVar);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = new d(iP);
                    o0VarE.K(objK);
                }
                dVar = (d) objK;
                o0VarE.g0(false);
                p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
                r rVar8 = rVar2;
                Object[] objArr4 = {vVar, dVar, cls, eVar3};
                o0VarE.L(485406992);
                zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
                objQ2 = o0VarE.q();
                if (zR) {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar6 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar6);
                    objQ2 = bVar6;
                } else {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar7 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar7);
                    objQ2 = bVar7;
                }
                o0Var.g0(false);
                l0.d(objArr4, (l) objQ2, o0Var);
                eVar5 = eVar4;
                bundle6 = bundle5;
                lVar4 = lVar3;
                rVar4 = rVar8;
            } else {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        eVarU = i.U(o0VarE);
                        i16 &= -897;
                    } else {
                        eVarU = eVar2;
                    }
                    if ((i15 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i16 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i17 != 0) {
                        i19 = i16;
                        eVar3 = eVarU;
                        bundle4 = bundle3;
                        lVar3 = C1530a.f76215a;
                        rVar2 = rVar3;
                    } else {
                        i19 = i16;
                        eVar3 = eVarU;
                        lVar3 = lVar2;
                        rVar2 = rVar3;
                        bundle4 = bundle3;
                    }
                }
                o0VarE.h0();
                x1 x1Var5 = n.f135158a;
                p1VarQ = p0.q(lVar3, o0VarE);
                iP = o0VarE.P();
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                o0VarE.L(485393906);
                zB = o0VarE.B(view2);
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zB) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = v.H(view2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = v.H(view2);
                    o0VarE.K(objQ);
                }
                vVar = (v) objQ;
                o0VarE.g0(false);
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objK = fb1.c.k(o0VarE, 485398332, aVar);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = new d(iP);
                    o0VarE.K(objK);
                }
                dVar = (d) objK;
                o0VarE.g0(false);
                p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
                r rVar9 = rVar2;
                Object[] objArr5 = {vVar, dVar, cls, eVar3};
                o0VarE.L(485406992);
                zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
                objQ2 = o0VarE.q();
                if (zR) {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar8 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar8);
                    objQ2 = bVar8;
                } else {
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    bundle5 = bundle4;
                    b bVar9 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                    o0Var.K(bVar9);
                    objQ2 = bVar9;
                }
                o0Var.g0(false);
                l0.d(objArr5, (l) objQ2, o0Var);
                eVar5 = eVar4;
                bundle6 = bundle5;
                lVar4 = lVar3;
                rVar4 = rVar9;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c(cls, rVar4, eVar5, bundle6, lVar4, i14, i15);
            }
        }
        i16 |= 24576;
        lVar2 = lVar;
        if ((i16 & 9363) == 9362) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 4) != 0) {
                    eVarU = i.U(o0VarE);
                    i16 &= -897;
                } else {
                    eVarU = eVar2;
                }
                if ((i15 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i16 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i17 != 0) {
                    i19 = i16;
                    eVar3 = eVarU;
                    bundle4 = bundle3;
                    lVar3 = C1530a.f76215a;
                    rVar2 = rVar3;
                } else {
                    i19 = i16;
                    eVar3 = eVarU;
                    lVar3 = lVar2;
                    rVar2 = rVar3;
                    bundle4 = bundle3;
                }
            } else {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 4) != 0) {
                    eVarU = i.U(o0VarE);
                    i16 &= -897;
                } else {
                    eVarU = eVar2;
                }
                if ((i15 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i16 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i17 != 0) {
                    i19 = i16;
                    eVar3 = eVarU;
                    bundle4 = bundle3;
                    lVar3 = C1530a.f76215a;
                    rVar2 = rVar3;
                } else {
                    i19 = i16;
                    eVar3 = eVarU;
                    lVar3 = lVar2;
                    rVar2 = rVar3;
                    bundle4 = bundle3;
                }
            }
            o0VarE.h0();
            x1 x1Var6 = n.f135158a;
            p1VarQ = p0.q(lVar3, o0VarE);
            iP = o0VarE.P();
            view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            o0VarE.L(485393906);
            zB = o0VarE.B(view2);
            objQ = o0VarE.q();
            aVar = m.f135153a;
            if (zB) {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = v.H(view2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = v.H(view2);
                o0VarE.K(objQ);
            }
            vVar = (v) objQ;
            o0VarE.g0(false);
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            objK = fb1.c.k(o0VarE, 485398332, aVar);
            c2565a = m.a.f135155b;
            if (objK == c2565a) {
                objK = new d(iP);
                o0VarE.K(objK);
            }
            dVar = (d) objK;
            o0VarE.g0(false);
            p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
            r rVar10 = rVar2;
            Object[] objArr6 = {vVar, dVar, cls, eVar3};
            o0VarE.L(485406992);
            zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
            objQ2 = o0VarE.q();
            if (zR) {
                eVar4 = eVar3;
                o0Var = o0VarE;
                bundle5 = bundle4;
                b bVar10 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                o0Var.K(bVar10);
                objQ2 = bVar10;
            } else {
                eVar4 = eVar3;
                o0Var = o0VarE;
                bundle5 = bundle4;
                b bVar11 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                o0Var.K(bVar11);
                objQ2 = bVar11;
            }
            o0Var.g0(false);
            l0.d(objArr6, (l) objQ2, o0Var);
            eVar5 = eVar4;
            bundle6 = bundle5;
            lVar4 = lVar3;
            rVar4 = rVar10;
        } else {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 4) != 0) {
                    eVarU = i.U(o0VarE);
                    i16 &= -897;
                } else {
                    eVarU = eVar2;
                }
                if ((i15 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i16 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i17 != 0) {
                    i19 = i16;
                    eVar3 = eVarU;
                    bundle4 = bundle3;
                    lVar3 = C1530a.f76215a;
                    rVar2 = rVar3;
                } else {
                    i19 = i16;
                    eVar3 = eVarU;
                    lVar3 = lVar2;
                    rVar2 = rVar3;
                    bundle4 = bundle3;
                }
            } else {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 4) != 0) {
                    eVarU = i.U(o0VarE);
                    i16 &= -897;
                } else {
                    eVarU = eVar2;
                }
                if ((i15 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i16 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i17 != 0) {
                    i19 = i16;
                    eVar3 = eVarU;
                    bundle4 = bundle3;
                    lVar3 = C1530a.f76215a;
                    rVar2 = rVar3;
                } else {
                    i19 = i16;
                    eVar3 = eVarU;
                    lVar3 = lVar2;
                    rVar2 = rVar3;
                    bundle4 = bundle3;
                }
            }
            o0VarE.h0();
            x1 x1Var7 = n.f135158a;
            p1VarQ = p0.q(lVar3, o0VarE);
            iP = o0VarE.P();
            view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            o0VarE.L(485393906);
            zB = o0VarE.B(view2);
            objQ = o0VarE.q();
            aVar = m.f135153a;
            if (zB) {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = v.H(view2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = v.H(view2);
                o0VarE.K(objQ);
            }
            vVar = (v) objQ;
            o0VarE.g0(false);
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            objK = fb1.c.k(o0VarE, 485398332, aVar);
            c2565a = m.a.f135155b;
            if (objK == c2565a) {
                objK = new d(iP);
                o0VarE.K(objK);
            }
            dVar = (d) objK;
            o0VarE.g0(false);
            p002j6.c.b(dVar, rVar2, null, o0VarE, i19 & 112, 4);
            r rVar11 = rVar2;
            Object[] objArr7 = {vVar, dVar, cls, eVar3};
            o0VarE.L(485406992);
            zR = o0VarE.r(vVar) | o0VarE.r(dVar) | o0VarE.r(context) | o0VarE.r(cls) | ((((i19 & 896) ^ 384) <= 256 && o0VarE.B(eVar3)) || (i19 & 384) == 256) | o0VarE.r(bundle4) | o0VarE.k(iP) | o0VarE.B(p1VarQ);
            objQ2 = o0VarE.q();
            if (zR) {
                eVar4 = eVar3;
                o0Var = o0VarE;
                bundle5 = bundle4;
                b bVar12 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                o0Var.K(bVar12);
                objQ2 = bVar12;
            } else {
                eVar4 = eVar3;
                o0Var = o0VarE;
                bundle5 = bundle4;
                b bVar13 = new b(vVar, dVar, context, cls, p1VarQ, eVar4, bundle5, iP);
                o0Var.K(bVar13);
                objQ2 = bVar13;
            }
            o0Var.g0(false);
            l0.d(objArr7, (l) objQ2, o0Var);
            eVar5 = eVar4;
            bundle6 = bundle5;
            lVar4 = lVar3;
            rVar4 = rVar11;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(cls, rVar4, eVar5, bundle6, lVar4, i14, i15);
        }
    }
}
