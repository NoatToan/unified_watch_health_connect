package if2;

import a11.g0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.google.common.base.Ascii;
import e23.p;
import f5.z0;
import h4.k;
import h5.e0;
import h5.g;
import i3.e5;
import java.util.LinkedHashMap;
import l72.f0;
import lc.u0;
import o13.r;
import o4.v0;
import o53.b0;
import o70.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;
import v.h;
import v13.e;
import v13.i;
import zd0.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.library.promotionlibrary.presentation.dashboard.component.CampaignCardKt$CampaignCardComposable$1$1", f = "CampaignCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ff2.c f93227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f93228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q0 f93229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ff2.c cVar, long j8, q0 q0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f93227a = cVar;
            this.f93228b = j8;
            this.f93229c = q0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f93227a, this.f93228b, this.f93229c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            kf2.a aVar2 = kf2.a.DISMISSED;
            ff2.c cVar = this.f93227a;
            long j8 = this.f93228b;
            cVar.c(aVar2, j8);
            cVar.f71143b.d(j8);
            this.f93229c.j();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.library.promotionlibrary.presentation.dashboard.component.CampaignCardKt$Card$1$1", f = "CampaignCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f93230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jf2.a f93231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ff2.c f93232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, jf2.a aVar, ff2.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f93230a = j8;
            this.f93231b = aVar;
            this.f93232c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f93230a, this.f93231b, this.f93232c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            long j8 = this.f93230a;
            if (j8 == -1) {
                this.f93231b.f98720b.a(f.CAMPAIGN.f129989a);
            } else {
                this.f93232c.c(kf2.a.SHOWN, j8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: if2.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C1785d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93234a;

        static {
            int[] iArr = new int[kf2.b.values().length];
            try {
                iArr[kf2.b.MY_DAY_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kf2.b.MY_DAY_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kf2.b.MODAL_POPUP_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kf2.b.MODAL_POPUP_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f93234a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(long j8, gf2.a aVar, jf2.a aVar2, h4.r rVar, ff2.c cVar, q0 q0Var, m mVar, int i14) {
        int i15;
        q0 q0Var2;
        o0 o0VarE = mVar.E(607851352);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(cVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.r(q0Var) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(917827263);
                Unit unit = Unit.INSTANCE;
                boolean zR = o0VarE.r(cVar) | ((i15 & 14) == 4) | o0VarE.r(q0Var);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    a aVar3 = new a(cVar, j8, q0Var, null);
                    q0Var2 = q0Var;
                    o0VarE.K(aVar3);
                    objQ2 = aVar3;
                } else {
                    q0Var2 = q0Var;
                }
                l0.e((p) objQ2, unit, o0VarE);
                o0VarE.g0(false);
            } else {
                q0Var2 = q0Var;
                o0VarE.C(918069869);
                boolean zR2 = o0VarE.r(q0Var2);
                Object objQ3 = o0VarE.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new i91.c(5, q0Var2, p1Var);
                    o0VarE.K(objQ3);
                }
                e23.a aVar4 = (e23.a) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new i31.e(22);
                    o0VarE.K(objQ4);
                }
                b(rVar, aVar, aVar2, cVar, aVar4, (e23.a) objQ4, o0VarE, ((i15 >> 9) & 14) | 196608 | (i15 & 112) | (i15 & 896) | ((i15 >> 3) & 7168));
                o0VarE.g0(false);
            }
        } else {
            q0Var2 = q0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gs.m(j8, aVar, aVar2, rVar, cVar, q0Var2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0301  */
    /* JADX WARN: Code duplicated, block: B:155:0x0304  */
    /* JADX WARN: Code duplicated, block: B:158:0x030c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0314  */
    /* JADX WARN: Code duplicated, block: B:162:0x0319  */
    /* JADX WARN: Code duplicated, block: B:165:0x0369  */
    /* JADX WARN: Code duplicated, block: B:167:0x0370  */
    /* JADX WARN: Code duplicated, block: B:168:0x0374  */
    /* JADX WARN: Code duplicated, block: B:173:0x0391  */
    /* JADX WARN: Code duplicated, block: B:178:0x0420  */
    /* JADX WARN: Code duplicated, block: B:180:0x0427  */
    /* JADX WARN: Code duplicated, block: B:181:0x042d  */
    /* JADX WARN: Code duplicated, block: B:186:0x044a  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:190:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:193:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:195:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:200:0x052f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0533  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    public static final void b(h4.r rVar, gf2.a aVar, jf2.a aVar2, ff2.c cVar, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        o0 o0Var;
        Long l14;
        char c14;
        Object obj;
        Object obj2;
        String str;
        j.l lVar;
        String str2;
        g.a.f fVar;
        h4.r.a aVar5;
        j.l lVar2;
        String str3;
        boolean z14;
        boolean z15;
        Object objQ;
        Object rVar2;
        long j8;
        long j14;
        h4.g.a aVar6;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        g.a.b bVar;
        j92.f fVar2;
        g.a.b bVar2;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z16;
        boolean z17;
        Object objQ2;
        String str4;
        String str5;
        String str6;
        Long l15;
        o0 o0VarE = mVar.E(936032031);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(cVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            long jLongValue = (aVar == null || (l15 = aVar.f77078b) == null) ? -1L : l15.longValue();
            Long lValueOf = Long.valueOf(jLongValue);
            long j15 = jLongValue;
            boolean zL = o0VarE.l(j15) | o0VarE.r(aVar2) | o0VarE.r(cVar);
            Object objQ3 = o0VarE.q();
            m.a aVar7 = m.f135153a;
            if (zL) {
                l14 = lValueOf;
                c14 = Ascii.MIN;
                b bVar3 = new b(j15, aVar2, cVar, null);
                obj = cVar;
                j15 = j15;
                obj2 = aVar2;
                o0VarE.K(bVar3);
                objQ3 = bVar3;
            } else {
                aVar7.getClass();
                if (objQ3 == m.a.f135155b) {
                    l14 = lValueOf;
                    c14 = Ascii.MIN;
                    b bVar4 = new b(j15, aVar2, cVar, null);
                    obj = cVar;
                    j15 = j15;
                    obj2 = aVar2;
                    o0VarE.K(bVar4);
                    objQ3 = bVar4;
                } else {
                    l14 = lValueOf;
                    c14 = Ascii.MIN;
                    obj = cVar;
                    obj2 = aVar2;
                }
            }
            l0.e((p) objQ3, l14, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c cVar3 = new i0() { // from class: if2.d.c
                @Override // p005kotlin.jvm.internal.i0, k23.n
                public final Object get(Object obj3) {
                    return ((kf2.b) obj3).name();
                }
            };
            String str7 = aVar != null ? aVar.f77079c : null;
            kf2.b[] bVarArrValues = kf2.b.values();
            int iA = t0.a(bVarArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            int length = bVarArrValues.length;
            int i17 = 0;
            while (i17 < length) {
                kf2.b bVar5 = bVarArrValues[i17];
                linkedHashMap.put(cVar3.invoke(bVar5), bVar5);
                i17++;
                j15 = j15;
            }
            long j16 = j15;
            kf2.b bVar6 = (kf2.b) ((Enum) linkedHashMap.get(str7));
            String str8 = "";
            String str9 = (aVar == null || (str6 = aVar.f77084h) == null) ? "" : str6;
            String str10 = (aVar == null || (str5 = aVar.f77081e) == null) ? "" : str5;
            if (aVar == null || (str = aVar.f77082f) == null) {
                str = "";
            }
            if (aVar != null && (str4 = aVar.f77083g) != null) {
                str8 = str4;
            }
            v0 v0Var = aVar != null ? aVar.f77080d : null;
            g6.f fVarA = v0Var != null ? g6.f.a(v0Var.getWidth()) : null;
            g6.f fVarA2 = v0Var != null ? g6.f.a(v0Var.getHeight()) : null;
            Float fValueOf = (fVarA == null || fVarA2 == null) ? null : Float.valueOf(fVarA.f75997a / fVarA2.f75997a);
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
            int i18 = bVar6 == null ? -1 : C1785d.f93234a[bVar6.ordinal()];
            if (i18 == -1 || i18 == 1) {
                j.f22691a.getClass();
                lVar = j.f22694d;
            } else if (i18 == 2) {
                j.f22691a.getClass();
                lVar = j.f22695e;
            } else if (i18 != 3 && i18 != 4) {
                u0.r();
                return;
            } else {
                j.f22691a.getClass();
                lVar = j.f22694d;
            }
            String strP = oi0.c.P(x.k(str10, str, str8));
            if (v0Var == null) {
                o0VarE.C(-1890826207);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-1890826206);
                d92.b.f58623a.getClass();
                j92.b bVar7 = d92.b.f58625c;
                bVar7.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97918c;
                h4.r rVarG = l.g(x2.f(l.y(rVar, f14), 1.0f), fFloatValue);
                long jA = d92.b.a(o0VarE).c().a();
                bVar7.getClass();
                h4.r rVarE = u1.n.e(rVarG, jA, k2.i.a(f15));
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                x1 x1Var2 = n.f135158a;
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = k.c(rVarE, o0VarE);
                g.V.getClass();
                e0.a aVar8 = g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                String str11 = str8;
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                g.a.e eVar2 = g.a.f81810g;
                b4.c(eVar2, z0VarD, o0VarE);
                g.a.C1623g c1623g = g.a.f81809f;
                b4.c(c1623g, i2VarA2, o0VarE);
                g.a.b bVar8 = g.a.f81813j;
                if (o0VarE.T) {
                    str2 = str;
                } else {
                    str2 = str;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    }
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC3, o0VarE);
                    u uVar = u.f22885a;
                    aVar5 = h4.r.S;
                    bVar7.getClass();
                    h4.r rVarF = x2.f(l4.k.b(aVar5, k2.i.a(f15)), 1.0f);
                    f5.k.f68985a.getClass();
                    lVar2 = lVar;
                    str3 = str10;
                    y0.c(v0Var, strP, rVarF, f5.k.a.f68990e, o0VarE, 24576, 232);
                    bVar7.getClass();
                    h4.r rVarC4 = uVar.c(l.y(aVar5, f15), h4.d.a.f81526d);
                    boolean zR = o0VarE.r(obj) | o0VarE.l(j16) | o0VarE.r(obj2);
                    if ((i16 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zR | z14;
                    objQ = o0VarE.q();
                    if (z15) {
                        Object obj3 = obj2;
                        Object obj4 = obj;
                        j8 = j16;
                        rVar2 = new d62.r(obj4, j8, obj3, aVar3, 2);
                        o0VarE.K(rVar2);
                    } else {
                        aVar7.getClass();
                        if (objQ == m.a.f135155b) {
                            Object obj5 = obj2;
                            Object obj6 = obj;
                            j8 = j16;
                            rVar2 = new d62.r(obj6, j8, obj5, aVar3, 2);
                            o0VarE.K(rVar2);
                        } else {
                            rVar2 = objQ;
                            j8 = j16;
                        }
                    }
                    j14 = j8;
                    l72.u0.a(rVarC4, null, null, null, (e23.a) rVar2, o0VarE, 0, 14);
                    bVar7.getClass();
                    h4.r rVarD = x2.d(l.y(aVar5, r33.f97920e), 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    aVar6 = h4.d.a.f81536n;
                    zVarA = y.a(kVar, aVar6, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarD, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar8);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T && s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        bVar = bVar8;
                    } else {
                        bVar = bVar8;
                        h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    bVar2 = bVar;
                    g02.c.a(str3, null, 0L, null, 0, false, 0, x0.a(j92.f.f97931h, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 0, 382);
                    h4.r rVarD2 = x2.d(aVar5, 1.0f);
                    zVarA2 = y.a(lVar2, aVar6, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarD2, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar8);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    fVar2.getClass();
                    g02.c.a(str2, null, 0L, null, 0, false, 0, x0.a(d92.c.e(j92.f.f97928e), d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 0, 382);
                    fVar2.getClass();
                    g02.c.a(str11, null, 0L, null, 0, false, 0, x0.a(j92.f.f97932i, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 0, 382);
                    f0.a aVar9 = f0.a.f111000a;
                    bVar7.getClass();
                    h4.r rVarC5 = l.C(aVar5, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    boolean zR2 = o0VarE.r(cVar) | o0VarE.l(j14) | o0VarE.r(context);
                    if ((i16 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zR2 | z16;
                    objQ2 = o0VarE.q();
                    if (z17) {
                        d62.r rVar3 = new d62.r(cVar, j14, context, aVar4, 3);
                        o0VarE.K(rVar3);
                        objQ2 = rVar3;
                    } else {
                        aVar7.getClass();
                        if (objQ2 == m.a.f135155b) {
                            d62.r rVar4 = new d62.r(cVar, j14, context, aVar4, 3);
                            o0VarE.K(rVar4);
                            objQ2 = rVar4;
                        }
                    }
                    aVar9.f(str9, rVarC5, false, (e23.a) objQ2, o0VarE, 0, 4);
                    o0Var = o0VarE;
                    e5.u(o0Var, true, r23, r23);
                    Unit unit = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                h.A(iHashCode3, o0VarE, iHashCode3, bVar8);
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u uVar2 = u.f22885a;
                aVar5 = h4.r.S;
                bVar7.getClass();
                h4.r rVarF2 = x2.f(l4.k.b(aVar5, k2.i.a(f15)), 1.0f);
                f5.k.f68985a.getClass();
                lVar2 = lVar;
                str3 = str10;
                y0.c(v0Var, strP, rVarF2, f5.k.a.f68990e, o0VarE, 24576, 232);
                bVar7.getClass();
                h4.r rVarC6 = uVar2.c(l.y(aVar5, f15), h4.d.a.f81526d);
                boolean zR3 = o0VarE.r(obj) | o0VarE.l(j16) | o0VarE.r(obj2);
                if ((i16 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zR3 | z14;
                objQ = o0VarE.q();
                if (z15) {
                    aVar7.getClass();
                    if (objQ == m.a.f135155b) {
                        Object obj7 = obj2;
                        Object obj8 = obj;
                        j8 = j16;
                        rVar2 = new d62.r(obj8, j8, obj7, aVar3, 2);
                        o0VarE.K(rVar2);
                    } else {
                        rVar2 = objQ;
                        j8 = j16;
                    }
                } else {
                    Object obj9 = obj2;
                    Object obj10 = obj;
                    j8 = j16;
                    rVar2 = new d62.r(obj10, j8, obj9, aVar3, 2);
                    o0VarE.K(rVar2);
                }
                j14 = j8;
                l72.u0.a(rVarC6, null, null, null, (e23.a) rVar2, o0VarE, 0, 14);
                bVar7.getClass();
                h4.r rVarD3 = x2.d(l.y(aVar5, r33.f97920e), 1.0f);
                j.f22691a.getClass();
                j.k kVar2 = j.f22694d;
                aVar6 = h4.d.a.f81536n;
                zVarA = y.a(kVar2, aVar6, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarD3, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    bVar = bVar8;
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    bVar = bVar8;
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                bVar2 = bVar;
                g02.c.a(str3, null, 0L, null, 0, false, 0, x0.a(j92.f.f97931h, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 0, 382);
                h4.r rVarD4 = x2.d(aVar5, 1.0f);
                zVarA2 = y.a(lVar2, aVar6, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarD4, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                fVar2.getClass();
                g02.c.a(str2, null, 0L, null, 0, false, 0, x0.a(d92.c.e(j92.f.f97928e), d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 0, 382);
                fVar2.getClass();
                g02.c.a(str11, null, 0L, null, 0, false, 0, x0.a(j92.f.f97932i, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 0, 382);
                f0.a aVar10 = f0.a.f111000a;
                bVar7.getClass();
                h4.r rVarC7 = l.C(aVar5, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                boolean zR4 = o0VarE.r(cVar) | o0VarE.l(j14) | o0VarE.r(context);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zR4 | z16;
                objQ2 = o0VarE.q();
                if (z17) {
                    aVar7.getClass();
                    if (objQ2 == m.a.f135155b) {
                        d62.r rVar5 = new d62.r(cVar, j14, context, aVar4, 3);
                        o0VarE.K(rVar5);
                        objQ2 = rVar5;
                    }
                } else {
                    d62.r rVar6 = new d62.r(cVar, j14, context, aVar4, 3);
                    o0VarE.K(rVar6);
                    objQ2 = rVar6;
                }
                aVar10.f(str9, rVarC7, false, (e23.a) objQ2, o0VarE, 0, 4);
                o0Var = o0VarE;
                e5.u(o0Var, true, r23, r23);
                Unit unit2 = Unit.INSTANCE;
                o0Var.g0(false);
            }
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0((Object) rVar, (Object) aVar, (Object) aVar2, (Object) cVar, (e23.a) aVar3, (Object) aVar4, i14, 22);
        }
    }
}
