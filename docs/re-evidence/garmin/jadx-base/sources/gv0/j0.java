package gv0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import kd0.e1;
import l72.c1;
import l72.r1;
import o4.m1;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79300a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.Both.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.Sender.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.Receiver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79300a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        p3.o0 o0Var;
        x0 x0VarF;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-684223230);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(-408522032);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.b(j92.f.f97931h, o0VarE);
            } else {
                o0VarE.C(-408520910);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
            }
            o0VarE.g0(false);
            x0 x0Var = x0VarF;
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z15 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new gt1.s(aVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.s(aVar, 1);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, z14, null, null, (e23.a) objQ, 14);
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            mh.c(str, c2.l.y(rVarD, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, i16 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(str, z14, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r26v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v16, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v18, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
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
    public static final void b(y yVar, pu0.b bVar, hl.a aVar, e23.p<? super pu0.b, ? super y, Unit> pVar, p3.m mVar, int i14) {
        ?? r14;
        Object dVar;
        boolean z14;
        ?? r15;
        ?? r16;
        ?? r17;
        Object obj;
        y yVar2 = yVar;
        pu0.b bVar2 = bVar;
        Object obj2 = pVar;
        p3.o0 o0VarE = mVar.E(1051421048);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(yVar2.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(bVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(obj2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_garmin_messenger_app_name), null, o0VarE, 0, 2);
            boolean z15 = yVar2 != y.Receiver && (aVar instanceof hl.a.c);
            y yVar3 = y.Sender;
            p3.m.a aVar4 = p3.m.f135153a;
            if (yVar2 == yVar3) {
                o0VarE.C(583260002);
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_invite_to_messenger);
                gv0.a.f79152a.getClass();
                z3.e eVar = gv0.a.f79153b;
                boolean zR = ((i15 & 14) == 4) | ((i15 & 7168) == 2048) | o0VarE.r(bVar2);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new fk0.a(obj2, 17, bVar2, yVar2);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fk0.a(obj2, 17, bVar2, yVar2);
                        o0VarE.K(objQ);
                    }
                }
                r16 = 0;
                r17 = 1;
                p2Var.g(strQ, null, null, eVar, null, false, false, (e23.a) objQ, o0VarE, 3072, 246);
                p3.o0 o0Var = o0VarE;
                o0Var.g0(false);
                r15 = o0Var;
            } else {
                p3.o0 o0Var2 = o0VarE;
                boolean z16 = false;
                boolean z17 = true;
                o0Var2.C(583878886);
                for (pu0.h hVar : bVar2.f141192j) {
                    if (hVar.f141238b == null) {
                        o0Var2.C(445008549);
                        o0Var2.g0(z16);
                    } else {
                        o0Var2.C(445008550);
                        l72.p2 p2Var2 = l72.p2.f111205a;
                        String strV = jg.b.v((Context) o0Var2.A(AndroidCompositionLocals_androidKt.f6042b), hVar.f141238b);
                        gv0.a.f79152a.getClass();
                        z3.e eVar2 = gv0.a.f79154c;
                        boolean z18 = (((o0Var2.h(z15) ? 1 : 0) | ((i15 & 7168) == 2048 ? z17 ? 1 : 0 : z16 ? 1 : 0)) | (o0Var2.r(bVar2) ? 1 : 0) ? 1 : 0) | ((i15 & 14) == 4 ? z17 ? 1 : 0 : z16 ? 1 : 0);
                        Object objQ2 = o0Var2.q();
                        if (z18 == 0) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                boolean z19 = z17 ? 1 : 0;
                                boolean z24 = z16 ? 1 : 0;
                                Object obj3 = obj2;
                                y yVar4 = yVar2;
                                boolean z25 = z15;
                                z14 = z19 ? 1 : 0;
                                pu0.b bVar4 = bVar2;
                                dVar = new an0.d(z25, obj3, bVar4, yVar4, 2);
                                z16 = z24 ? 1 : 0;
                                z15 = z25;
                                yVar2 = yVar4;
                                obj2 = obj3;
                                bVar2 = bVar4;
                                o0Var2.K(dVar);
                            } else {
                                z14 = z17 ? 1 : 0;
                                dVar = objQ2;
                                z16 = z16;
                            }
                        } else {
                            boolean z110 = z17 ? 1 : 0;
                            boolean z26 = z16 ? 1 : 0;
                            Object obj4 = obj2;
                            y yVar5 = yVar2;
                            boolean z27 = z15;
                            z14 = z110 ? 1 : 0;
                            pu0.b bVar5 = bVar2;
                            dVar = new an0.d(z27, obj4, bVar5, yVar5, 2);
                            z16 = z26 ? 1 : 0;
                            z15 = z27;
                            yVar2 = yVar5;
                            obj2 = obj4;
                            bVar2 = bVar5;
                            o0Var2.K(dVar);
                        }
                        e23.a aVar5 = (e23.a) dVar;
                        i15 = i15;
                        p3.o0 o0Var3 = o0Var2;
                        z17 = z14 ? 1 : 0;
                        p2Var2.g(strV, null, null, eVar2, null, z15, false, aVar5, o0Var3, 3072, 214);
                        o0Var2 = o0Var3;
                        Unit unit = Unit.INSTANCE;
                        o0Var2.g0(z16);
                    }
                }
                o0Var2.g0(z16);
                r17 = z17;
                r16 = z16;
                r15 = o0Var2;
            }
            s5.c.b bVarH = l2.h(r15, 1404341664, r16, r17, null);
            if (aVar instanceof hl.a.b) {
                r15.C(650840423);
                bVarH.b(gl1.y.Q(r15, R.string.lbl_messenger_notifs_not_available));
                r15.g0(r16);
            } else {
                r15.C(650977846);
                r15.g0(r16);
                int i16 = a.f79300a[yVar2.ordinal()];
                if (i16 == r17) {
                    r15.C(-1364471544);
                    bVarH.b(gl1.y.Q(r15, R.string.lbl_messenger_view_contacts));
                    r15.g0(r16);
                    Unit unit2 = Unit.INSTANCE;
                } else if (i16 == 2) {
                    r15.C(-1364435127);
                    bVarH.b(gl1.y.Q(r15, R.string.lbl_contact_not_on_messenger));
                    r15.g0(r16);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    if (i16 != 3) {
                        throw kg.f.h(r15, -1364472344, r16);
                    }
                    r15.C(651187127);
                    String strQ2 = gl1.y.Q(r15, R.string.lbl_garmin_messenger_app_name);
                    String strP = gl1.y.P(R.string.msg_this_contact_is_on_garmin_messenger, new Object[]{strQ2}, r15);
                    int iL = d53.w.L(r16, 6, strP, strQ2);
                    String string = d53.w.P(iL, strP.length(), strP).toString();
                    String string2 = d53.w.P(r16, strQ2.length() + iL, strP).toString();
                    bVarH.b(string);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.r0 r0Var = new s5.r0(x0.a(j92.f.f97933j, hb.a.e(r15), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a, null, null, null, 14, null);
                    int i17 = ((i15 & 14) == 4 ? r17 : r16) | ((i15 & 7168) == 2048 ? r17 : r16) | (r15.r(bVar2) ? 1 : 0);
                    Object objQ3 = r15.q();
                    if (i17 == 0) {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj = objQ3;
                            e0 e0Var = new e0(obj2, r16, bVar2, yVar2);
                            r15.K(e0Var);
                            obj = e0Var;
                        }
                    } else {
                        obj = objQ3;
                        e0 e0Var2 = new e0(obj2, r16, bVar2, yVar2);
                        r15.K(e0Var2);
                        obj = e0Var2;
                    }
                    obj = objQ3;
                    int iG = bVarH.g(new s5.m.a(strQ2, r0Var, (s5.n) obj));
                    try {
                        bVarH.b(strQ2);
                        Unit unit4 = Unit.INSTANCE;
                        bVarH.f(iG);
                        bVarH.b(string2);
                        r15.g0(r16);
                    } catch (Throwable th3) {
                        bVarH.f(iG);
                        throw th3;
                    }
                }
            }
            s5.c cVarK = bVarH.k();
            r15.g0(r16);
            h4.r.a aVar6 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar6.getClass();
            h4.r rVarZ = c2.l.z(aVar6, f14, eVar3.f97917b);
            d92.b.f58624b.getClass();
            ?? r26 = r15;
            mh.d(cVarK, rVarZ, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(j92.f.f97933j, r15), r26, 0, 0, 262140);
            ?? r18 = r26;
            r18.g0(r17);
            x1 x1Var2 = p3.n.f135158a;
            r14 = r18;
        } else {
            p3.o0 o0Var4 = o0VarE;
            o0Var4.e();
            r14 = o0Var4;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.q0(yVar2, bVar2, aVar, obj2, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0474 A[PHI: r7
      0x0474: PHI (r7v10 hl.a) = (r7v6 hl.a), (r7v11 hl.a) binds: [B:152:0x0472, B:148:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x0483  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(final d dVar, final String str, final hl.a aVar, final e23.a aVar2, final e23.l lVar, final e23.l lVar2, final e23.a aVar3, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String strQ;
        String strQ2;
        p1 p1Var;
        t13.d dVar2;
        boolean z14;
        p3.m.a.C2565a c2565a;
        p1 p1Var2;
        p1 p1Var3;
        p3.m.a.C2565a c2565a2;
        hl.a aVar4;
        boolean z15;
        boolean z16;
        Object objQ;
        boolean z17;
        fw.p pVar2;
        fw.p pVar3;
        p1 p1Var4;
        dVar.getClass();
        str.getClass();
        aVar2.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(-1341004933);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        boolean z18 = true;
        if (o0VarE.n(i15 & 1, (i15 & 599187) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b)) {
                o0VarE.C(1908281487);
                strQ = gl1.y.Q(o0VarE, R.string.livetrack_notification_method_question);
                strQ2 = gl1.y.Q(o0VarE, R.string.livetrack_text_notifications_availability_gc_plus_inreach);
                o0VarE.g0(false);
            } else {
                if (!(aVar instanceof hl.a.b)) {
                    throw kg.f.h(o0VarE, -215538767, false);
                }
                o0VarE.C(1908543995);
                strQ = gl1.y.Q(o0VarE, R.string.msg_child_livetrack_notification_method_question);
                strQ2 = gl1.y.Q(o0VarE, R.string.msg_child_livetrack_text_notifications_availability_gc_plus_inreach);
                o0VarE.g0(false);
            }
            String str2 = strQ;
            String str3 = strQ2;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            if (activity == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(dVar, str, aVar, aVar2, lVar, lVar2, aVar3, i14, i16) { // from class: gv0.z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f79434a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f79435b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f79436c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ hl.a f79437d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.a f79438e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.l f79439f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.l f79440g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ e23.a f79441h;

                    {
                        this.f79434a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f79434a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(1);
                                j0.c(this.f79435b, this.f79436c, this.f79437d, this.f79438e, this.f79439f, this.f79440g, this.f79441h, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p3.p0.t(1);
                                j0.c(this.f79435b, this.f79436c, this.f79437d, this.f79438e, this.f79439f, this.f79440g, this.f79441h, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                o0VarE.L(414512006);
                Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
                p1 p1VarQ = p3.p0.q(null, o0VarE);
                o0VarE.L(855641119);
                boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
                Object objQ2 = o0VarE.q();
                p3.m.a aVar5 = p3.m.f135153a;
                if (zB) {
                    objQ2 = scopeCurrentKoinScope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(uu0.c.class), (Qualifier) null, new f0(p1VarQ));
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = scopeCurrentKoinScope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(uu0.c.class), (Qualifier) null, new f0(p1VarQ));
                        o0VarE.K(objQ2);
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(false);
                uu0.c cVar = (uu0.c) objQ2;
                g.h hVar = new g.h();
                boolean z19 = (458752 & i15) == 131072;
                Object objQ3 = o0VarE.q();
                int i17 = 5;
                if (z19) {
                    objQ3 = new fb0.d(lVar2, i17);
                    o0VarE.K(objQ3);
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new fb0.d(lVar2, i17);
                        o0VarE.K(objQ3);
                    }
                }
                c.q qVarC = c.w.c(hVar, (e23.l) objQ3, o0VarE, 0);
                e1 e1VarF = ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).getF104144a();
                p1 p1VarC = s9.c.c(dVar.f79197n, o0VarE);
                p1 p1VarB = s9.c.b(dVar.f79192j, g3.a.c(g3.f35298f), o0VarE, g3.f35299g << 3);
                p1 p1VarC2 = s9.c.c(dVar.f79206y, o0VarE);
                boolean zK4 = dVar.K4();
                Object objQ4 = o0VarE.q();
                aVar5.getClass();
                p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                if (objQ4 == c2565a3) {
                    objQ4 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1 p1Var5 = (p1) objQ4;
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a3) {
                    objQ5 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ5);
                }
                p1 p1Var6 = (p1) objQ5;
                boolean z24 = (i15 & 57344) == 16384;
                Object objQ6 = o0VarE.q();
                if (z24 || objQ6 == c2565a3) {
                    objQ6 = new b71.n(lVar, 7, (byte) 0);
                    o0VarE.K(objQ6);
                }
                m0.a(dVar, (e23.p) objQ6, o0VarE, i15 & 14);
                fw.p pVar4 = ((g3) p1VarB.getF182175a()).f35300a;
                int i18 = i15 & 3670016;
                boolean zB2 = (i18 == 1048576) | o0VarE.B(p1VarB) | o0VarE.r(context);
                Object objQ7 = o0VarE.q();
                if (zB2 || objQ7 == c2565a3) {
                    objQ7 = new g0(context, aVar3, p1VarB, null);
                    o0VarE.K(objQ7);
                }
                p3.l0.e((e23.p) objQ7, pVar4, o0VarE);
                fw.p pVar5 = ((g3) p1VarC.getF182175a()).f35300a;
                Exception exc = ((g3) p1VarC.getF182175a()).f35303d;
                T t7 = ((g3) p1VarC.getF182175a()).f35301b;
                boolean zB3 = o0VarE.B(p1VarC) | o0VarE.r(dVar) | ((i15 & 7168) == 2048) | (i18 == 1048576);
                Object objQ8 = o0VarE.q();
                if (zB3 || objQ8 == c2565a3) {
                    p1Var = p1Var6;
                    dVar2 = null;
                    h0 h0Var = new h0(dVar, aVar2, aVar3, p1VarC, p1Var5, p1Var, null);
                    o0VarE.K(h0Var);
                    objQ8 = h0Var;
                } else {
                    p1Var = p1Var6;
                    dVar2 = null;
                }
                p3.l0.g(pVar5, exc, t7, (e23.p) objQ8, o0VarE);
                boolean zR = o0VarE.r(dVar) | ((i15 & 112) == 32);
                Object objQ9 = o0VarE.q();
                if (zR || objQ9 == c2565a3) {
                    objQ9 = new i0(dVar, str, dVar2);
                    o0VarE.K(objQ9);
                }
                p3.l0.e((e23.p) objQ9, str, o0VarE);
                pu0.b bVar = (pu0.b) ((g3) p1VarB.getF182175a()).f35301b;
                if (bVar == null) {
                    o0VarE.C(1911851973);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1911851974);
                    y yVarB = lv0.c.b(bVar, ((Boolean) p1VarC2.getF182175a()).booleanValue());
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        o0VarE.C(-2045999028);
                        c1 c1Var = c1.f110940a;
                        String strQ3 = gl1.y.Q(o0VarE, R.string.live_track_title_max_emails_reached);
                        String strQ4 = gl1.y.Q(o0VarE, R.string.live_track_max_emails_reached);
                        String strQ5 = gl1.y.Q(o0VarE, android.R.string.ok);
                        Object objQ10 = o0VarE.q();
                        if (objQ10 == c2565a3) {
                            objQ10 = new gp.e(p1Var5, 4);
                            o0VarE.K(objQ10);
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ10;
                        Object objQ11 = o0VarE.q();
                        if (objQ11 == c2565a3) {
                            objQ11 = new gp.e(p1Var5, 5);
                            o0VarE.K(objQ11);
                        }
                        p1Var2 = p1VarB;
                        z14 = false;
                        c2565a = c2565a3;
                        p1Var3 = p1Var;
                        c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, aVar6, null, (e23.a) objQ11, o0VarE, 100663296, 6, 729);
                        o0VarE.g0(false);
                    } else {
                        z14 = false;
                        c2565a = c2565a3;
                        p1Var2 = p1VarB;
                        p1Var3 = p1Var;
                        o0VarE.C(-2045590603);
                        o0VarE.g0(false);
                    }
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        o0VarE.C(-2045538833);
                        c1 c1Var2 = c1.f110940a;
                        String strQ6 = gl1.y.Q(o0VarE, R.string.contact_management_title_max_reached);
                        String strP = gl1.y.P(R.string.contact_management_livetrack_max_reched, new Object[]{50}, o0VarE);
                        String strQ7 = gl1.y.Q(o0VarE, android.R.string.ok);
                        Object objQ12 = o0VarE.q();
                        p3.m.a.C2565a c2565a4 = c2565a;
                        if (objQ12 == c2565a4) {
                            p1Var4 = p1Var3;
                            objQ12 = new gp.e(p1Var4, 6);
                            o0VarE.K(objQ12);
                        } else {
                            p1Var4 = p1Var3;
                        }
                        e23.a<Unit> aVar7 = (e23.a) objQ12;
                        Object objQ13 = o0VarE.q();
                        if (objQ13 == c2565a4) {
                            objQ13 = new gp.e(p1Var4, 7);
                            o0VarE.K(objQ13);
                        }
                        c2565a2 = c2565a4;
                        c1Var2.a(false, strQ6, strP, null, null, strQ7, false, false, aVar7, null, (e23.a) objQ13, o0VarE, 100663296, 6, 729);
                        o0VarE.g0(z14);
                    } else {
                        c2565a2 = c2565a;
                        o0VarE.C(-2045071787);
                        o0VarE.g0(z14);
                    }
                    T t14 = ((g3) p1Var2.getF182175a()).f35301b;
                    t14.getClass();
                    String strA = og.a.A((pu0.b) t14);
                    boolean zR2 = o0VarE.r(qVarC) | (i18 == 1048576 ? true : z14) | o0VarE.r(cVar) | o0VarE.r(activity) | o0VarE.r(dVar);
                    if (((i15 & 896) ^ 384) > 256) {
                        aVar4 = aVar;
                        if (o0VarE.r(aVar4)) {
                            z15 = true;
                        }
                        z16 = zR2 | z15;
                        objQ = o0VarE.q();
                        if (!z16 || objQ == c2565a2) {
                            z17 = z14;
                            ck0.j jVar = new ck0.j(aVar3, qVarC, cVar, activity, dVar, aVar4);
                            o0VarE.K(jVar);
                            objQ = jVar;
                        } else {
                            z17 = z14;
                        }
                        e23.a aVar8 = (e23.a) objQ;
                        pVar2 = ((g3) p1Var2.getF182175a()).f35300a;
                        pVar3 = fw.p.LOADING;
                        if (pVar2 != pVar3 && ((g3) p1VarC.getF182175a()).f35300a != pVar3) {
                            z18 = z17;
                        }
                        gl1.d.b(strA, aVar8, z18, null, null, null, z3.f.c(202016031, new av0.g(activity, lVar, dVar, yVarB, aVar, str2, str3, bVar, e1VarF, zK4), o0VarE), o0VarE, 1572864, 56);
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(z17);
                    } else {
                        aVar4 = aVar;
                    }
                    if ((i15 & 384) == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    z16 = zR2 | z15;
                    objQ = o0VarE.q();
                    if (z16) {
                        z17 = z14;
                        ck0.j jVar2 = new ck0.j(aVar3, qVarC, cVar, activity, dVar, aVar4);
                        o0VarE.K(jVar2);
                        objQ = jVar2;
                    } else {
                        z17 = z14;
                        ck0.j jVar3 = new ck0.j(aVar3, qVarC, cVar, activity, dVar, aVar4);
                        o0VarE.K(jVar3);
                        objQ = jVar3;
                    }
                    e23.a aVar9 = (e23.a) objQ;
                    pVar2 = ((g3) p1Var2.getF182175a()).f35300a;
                    pVar3 = fw.p.LOADING;
                    if (pVar2 != pVar3) {
                        z18 = z17;
                    }
                    gl1.d.b(strA, aVar9, z18, null, null, null, z3.f.c(202016031, new av0.g(activity, lVar, dVar, yVarB, aVar, str2, str3, bVar, e1VarF, zK4), o0VarE), o0VarE, 1572864, 56);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(z17);
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i19 = 1;
            pVar = new e23.p(dVar, str, aVar, aVar2, lVar, lVar2, aVar3, i14, i19) { // from class: gv0.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f79434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f79435b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f79436c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ hl.a f79437d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f79438e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f79439f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f79440g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.a f79441h;

                {
                    this.f79434a = i19;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f79434a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(1);
                            j0.c(this.f79435b, this.f79436c, this.f79437d, this.f79438e, this.f79439f, this.f79440g, this.f79441h, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p3.p0.t(1);
                            j0.c(this.f79435b, this.f79436c, this.f79437d, this.f79438e, this.f79439f, this.f79440g, this.f79441h, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
