package rg2;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import e23.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l72.x0;
import lc.u0;
import mg2.t;
import o72.h3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import yg2.h0;
import yg2.i0;
import yg2.v;

/* JADX INFO: loaded from: classes11.dex */
public final class g {
    public static final void a(r rVar, final List list, final h0 h0Var, final boolean z14, final rf2.l lVar, final zf2.d dVar, final boolean z15, final h0 h0Var2, final Map map, final boolean z16, final boolean z17, p3.m mVar, final int i14, final int i15) {
        r rVar2;
        int i16;
        boolean z18;
        rf2.l lVar2;
        boolean z19;
        Map map2;
        List list2;
        final r rVar3;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0Var;
        boolean z24;
        i0 i0Var;
        list.getClass();
        dVar.getClass();
        map.getClass();
        o0 o0VarE = mVar.E(534173964);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(h0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z18 = z14;
            i16 |= o0VarE.h(z18) ? 2048 : 1024;
        } else {
            z18 = z14;
        }
        if ((i14 & 24576) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.B(lVar2) ? 16384 : 8192;
        } else {
            lVar2 = lVar;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.k(dVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            z19 = z15;
            i16 |= o0VarE.h(z19) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z19 = z15;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.r(h0Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            map2 = map;
            i16 |= o0VarE.r(map2) ? 67108864 : 33554432;
        } else {
            map2 = map;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.h(z16) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && ((o0VarE.h(z17) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final r rVar4 = i17 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            if (z16 && h0Var != null && h0Var.p()) {
                p2 p2VarI1 = o0VarE.i0();
                if (p2VarI1 == null) {
                    return;
                }
                final int i18 = 0;
                final rf2.l lVar3 = lVar2;
                final Map map3 = map2;
                p2VarI0 = p2VarI1;
                final boolean z25 = z18;
                final boolean z26 = z19;
                pVar = new p() { // from class: rg2.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        switch (i18) {
                            case 0:
                                ((Integer) obj2).getClass();
                                g.a(rVar4, list, h0Var, z25, lVar3, dVar, z26, h0Var2, map3, z16, z17, mVar2, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                g.a(rVar4, list, h0Var, z25, lVar3, dVar, z26, h0Var2, map3, z16, z17, mVar2, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                r rVar5 = rVar4;
                list2 = list;
                String str = null;
                i0 i0Var2 = h0Var != null ? h0Var.f197040g : null;
                if (i0Var2 == null) {
                    o0VarE.C(723414914);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                } else {
                    boolean z27 = false;
                    o0VarE.C(723414915);
                    if (z16 || z17) {
                        o0Var = o0VarE;
                    } else {
                        c(i0Var2, y.Q(o0VarE, v.a(h0Var)), o0VarE, 0);
                        int i19 = i16 >> 6;
                        b(h0Var, z14, lVar, map, z15, dVar, h0Var2, o0VarE, (i19 & 57344) | (i19 & 1022) | ((i16 >> 15) & 7168) | (458752 & i16) | (3670016 & (i16 >> 3)));
                        o0Var = o0VarE;
                        z27 = false;
                    }
                    o0Var.g0(z27);
                }
                if (list2.isEmpty()) {
                    o0VarE = o0Var;
                    o0VarE.C(725700886);
                    o0VarE.g0(false);
                } else {
                    o0Var.C(723979735);
                    ArrayList arrayListI1 = p13.h0.i1(list2, 2, 2, true);
                    o0Var.C(-2054854147);
                    final int i24 = 0;
                    for (Object obj : arrayListI1) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            x.q();
                            throw null;
                        }
                        final List list3 = (List) obj;
                        x0 x0Var = x0.f111346a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        x0Var.e(c2.l.A(rVar5, 0.0f, j92.b.f97899b.f97919d, 1), z3.f.c(429606120, new q() { // from class: rg2.d
                            /* JADX WARN: Multi-variable type inference failed */
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
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i26;
                                String str2;
                                String str3;
                                String str4;
                                String str5;
                                t2 t2Var = (t2) obj2;
                                p3.m mVar2 = (p3.m) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                t2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                }
                                int i27 = iIntValue;
                                int i28 = 0;
                                int i29 = 1;
                                if (mVar2.n(i27 & 1, (i27 & 19) != 18)) {
                                    x1 x1Var2 = n.f135158a;
                                    List<ag2.c> list4 = list3;
                                    boolean z28 = list4.size() < 2;
                                    mVar2.C(534624601);
                                    for (ag2.c cVar : list4) {
                                        mVar2.C(-606489253);
                                        ag2.c.a aVarA = cVar.a();
                                        if (aVarA == null) {
                                            mVar2.f();
                                        } else {
                                            String strQ = y.Q(mVar2, aVarA.f3219b);
                                            if (strQ.length() > 0) {
                                                StringBuilder sb3 = new StringBuilder();
                                                String strValueOf = String.valueOf(strQ.charAt(i28));
                                                strValueOf.getClass();
                                                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                                upperCase.getClass();
                                                sb3.append((Object) upperCase);
                                                sb3.append(strQ.substring(i29));
                                                strQ = sb3.toString();
                                            }
                                            String str6 = strQ;
                                            b.f152669a.getClass();
                                            String strA = b.a(aVarA, z15, dVar, mVar2);
                                            ah2.e eVar = (ah2.e) map.get(aVarA);
                                            String str7 = "--";
                                            if (i24 == 0 && (h0Var == null || z16 || z17)) {
                                                mVar2.C(-606012256);
                                                x0 x0Var2 = x0.f111346a;
                                                if (eVar == null || (str5 = eVar.f3289a) == null) {
                                                    switch (ag2.c.a.b.f3220a[aVarA.ordinal()]) {
                                                        case 60:
                                                        case 61:
                                                        case 62:
                                                        case 63:
                                                        case 64:
                                                        case 65:
                                                        case 66:
                                                        case 67:
                                                        case 68:
                                                        case 69:
                                                        case 70:
                                                        case 71:
                                                        case 72:
                                                        case 73:
                                                        case 74:
                                                        case 75:
                                                        case 76:
                                                        case 77:
                                                            str7 = "--:--";
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 14:
                                                        case 15:
                                                        case 16:
                                                        case 17:
                                                        case 18:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                        case 23:
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                        case 27:
                                                        case 28:
                                                        case 29:
                                                        case 30:
                                                        case 31:
                                                        case 32:
                                                        case 33:
                                                        case 34:
                                                        case 35:
                                                        case 36:
                                                        case 37:
                                                        case 38:
                                                        case 39:
                                                        case 40:
                                                        case 41:
                                                        case 42:
                                                        case 43:
                                                        case 44:
                                                        case 45:
                                                        case 46:
                                                        case 47:
                                                        case 48:
                                                        case 49:
                                                        case 50:
                                                        case 51:
                                                        case 52:
                                                        case 53:
                                                        case 54:
                                                        case 55:
                                                        case 56:
                                                        case 57:
                                                        case 58:
                                                        case 59:
                                                            str4 = str7;
                                                            break;
                                                        default:
                                                            u0.r();
                                                            return null;
                                                    }
                                                } else {
                                                    str4 = str5;
                                                }
                                                boolean z29 = (eVar == null || eVar.f3291c != i29) ? i28 : i29;
                                                i26 = i29;
                                                x0Var2.g((i27 & 14) | (x0.f111348c << 27), 228, null, t2Var, null, null, str4, str6, strA, null, mVar2, z29);
                                                mVar2.f();
                                            } else {
                                                i26 = i29;
                                                mVar2.C(-605663351);
                                                x0 x0Var3 = x0.f111346a;
                                                if (eVar == null || (str3 = eVar.f3289a) == null) {
                                                    switch (ag2.c.a.b.f3220a[aVarA.ordinal()]) {
                                                        case 60:
                                                        case 61:
                                                        case 62:
                                                        case 63:
                                                        case 64:
                                                        case 65:
                                                        case 66:
                                                        case 67:
                                                        case 68:
                                                        case 69:
                                                        case 70:
                                                        case 71:
                                                        case 72:
                                                        case 73:
                                                        case 74:
                                                        case 75:
                                                        case 76:
                                                        case 77:
                                                            str7 = "--:--";
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 14:
                                                        case 15:
                                                        case 16:
                                                        case 17:
                                                        case 18:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                        case 23:
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                        case 27:
                                                        case 28:
                                                        case 29:
                                                        case 30:
                                                        case 31:
                                                        case 32:
                                                        case 33:
                                                        case 34:
                                                        case 35:
                                                        case 36:
                                                        case 37:
                                                        case 38:
                                                        case 39:
                                                        case 40:
                                                        case 41:
                                                        case 42:
                                                        case 43:
                                                        case 44:
                                                        case 45:
                                                        case 46:
                                                        case 47:
                                                        case 48:
                                                        case 49:
                                                        case 50:
                                                        case 51:
                                                        case 52:
                                                        case 53:
                                                        case 54:
                                                        case 55:
                                                        case 56:
                                                        case 57:
                                                        case 58:
                                                        case 59:
                                                            str2 = str7;
                                                            break;
                                                        default:
                                                            u0.r();
                                                            return null;
                                                    }
                                                } else {
                                                    str2 = str3;
                                                }
                                                x0Var3.b((i27 & 14) | (x0.f111348c << 27), 212, null, t2Var, null, null, str2, str6, strA, null, mVar2, (eVar == null || eVar.f3291c != i26) ? 0 : i26);
                                                mVar2.f();
                                            }
                                            mVar2.f();
                                            i29 = i26;
                                            i28 = 0;
                                        }
                                    }
                                    mVar2.f();
                                    if (z28) {
                                        mVar2.C(-605279230);
                                        x0.f111346a.h(t2Var, mVar2, (i27 & 14) | (x0.f111348c << 3));
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-605225414);
                                        mVar2.f();
                                    }
                                    x1 x1Var3 = n.f135158a;
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0Var), o0Var, (x0.f111348c << 6) | 48, 0);
                        i24 = i25;
                    }
                    o0VarE = o0Var;
                    o0VarE.g0(false);
                    if (h0Var != null && (i0Var = h0Var.f197040g) != null) {
                        str = i0Var.f197057e;
                    }
                    if (str == null) {
                        o0VarE.C(725641117);
                        z24 = false;
                        o0VarE.g0(false);
                    } else {
                        z24 = false;
                        o0VarE.C(725641118);
                        d(str, o0VarE, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z24);
                }
                x1 x1Var2 = n.f135158a;
                rVar3 = rVar5;
            }
            p2VarI0.f135219d = pVar;
        }
        list2 = list;
        o0VarE.e();
        rVar3 = rVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i26 = 1;
            final List list4 = list2;
            pVar = new p() { // from class: rg2.c
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    switch (i26) {
                        case 0:
                            ((Integer) obj3).getClass();
                            g.a(rVar3, list4, h0Var, z14, lVar, dVar, z15, h0Var2, map, z16, z17, mVar2, p0.t(i14 | 1), i15);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            g.a(rVar3, list4, h0Var, z14, lVar, dVar, z15, h0Var2, map, z16, z17, mVar2, p0.t(i14 | 1), i15);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void b(final h0 h0Var, final boolean z14, final rf2.l lVar, final Map<ag2.c.a, ah2.e> map, final boolean z15, final zf2.d dVar, final h0 h0Var2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        mt2.c cVar;
        h0Var.getClass();
        map.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(880941848);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(h0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(map) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.k(dVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(h0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            final lt2.b primaryTarget = h0Var.getPrimaryTarget();
            lt2.a duration = h0Var.getDuration();
            ag2.c.a aVarE = null;
            mt2.c cVar2 = duration != null ? duration.f114866a : null;
            lt2.a duration2 = h0Var.getDuration();
            if (duration2 != null && (cVar = duration2.f114866a) != null) {
                aVarE = zg2.f.e(cVar, z14);
            }
            final boolean z16 = aVarE == ag2.c.a.REPS;
            final boolean z17 = cVar2 == mt2.c.CALORIES || cVar2 == mt2.c.FIXED_REPETITION || cVar2 == mt2.c.POWER || cVar2 == mt2.c.DISTANCE || cVar2 == mt2.c.HEART_RATE;
            final ag2.c.a aVar = ag2.c.a.INTERVALS;
            final boolean zContainsKey = map.containsKey(aVar);
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            final mt2.c cVar3 = cVar2;
            float f14 = eVar.f97920e;
            bVar.getClass();
            o0Var = o0VarE;
            x0Var.e(c2.l.z(aVar2, f14, eVar.f97919d), z3.f.c(243251249, new q() { // from class: rg2.f
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    mt2.c cVar4;
                    Map map2;
                    boolean z18;
                    zf2.d dVar2;
                    String str;
                    Unit unit;
                    String str2;
                    o13.p pVar;
                    String str3;
                    t2 t2Var = (t2) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                    }
                    int i16 = iIntValue;
                    if (mVar2.n(i16 & 1, (i16 & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        mt2.c cVar5 = cVar3;
                        boolean z19 = z15;
                        zf2.d dVar3 = dVar;
                        Map map3 = map;
                        if (cVar5 == null) {
                            mVar2.C(1088176302);
                            mVar2.f();
                            cVar4 = cVar5;
                            z18 = z19;
                            dVar2 = dVar3;
                            i16 = i16;
                            map2 = map3;
                        } else {
                            mVar2.C(1088176303);
                            ag2.c.a aVarE2 = z16 ? ag2.c.a.STEP_TIMER : zg2.f.e(cVar5, z14);
                            if (aVarE2 == null) {
                                mVar2.C(795065065);
                                mVar2.f();
                                cVar4 = cVar5;
                                z18 = z19;
                                dVar2 = dVar3;
                                map2 = map3;
                            } else {
                                mVar2.C(795065066);
                                b.f152669a.getClass();
                                String strA = b.a(aVarE2, z19, dVar3, mVar2);
                                ah2.e eVar2 = (ah2.e) map3.get(aVarE2);
                                String str4 = (eVar2 == null || (str = eVar2.f3289a) == null) ? "--" : str;
                                String strQ = y.Q(mVar2, aVarE2.f3219b);
                                if (strQ.length() > 0) {
                                    StringBuilder sb3 = new StringBuilder();
                                    String strValueOf = String.valueOf(strQ.charAt(0));
                                    strValueOf.getClass();
                                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                    sb3.append((Object) upperCase);
                                    sb3.append(strQ.substring(1));
                                    strQ = sb3.toString();
                                }
                                x0 x0Var2 = x0.f111346a;
                                int i17 = (i16 & 14) | (x0.f111348c << 24);
                                cVar4 = cVar5;
                                map2 = map3;
                                z18 = z19;
                                dVar2 = dVar3;
                                x0Var2.f(i17, 116, null, t2Var, null, null, str4, strQ, strA, null, mVar2);
                                mVar2.f();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            mVar2.f();
                        }
                        lt2.b bVar2 = primaryTarget;
                        if (bVar2 == null) {
                            mVar2.C(1088804145);
                            mVar2.f();
                            unit = null;
                        } else {
                            mVar2.C(1088804146);
                            ag2.c.a aVarF = zg2.f.f(bVar2.f114870a, dVar2);
                            if (aVarF == null) {
                                mVar2.C(1167627977);
                                mVar2.f();
                                unit = null;
                            } else {
                                mVar2.C(1167627978);
                                b.f152669a.getClass();
                                String strA2 = b.a(aVarF, z18, dVar2, mVar2);
                                ah2.e eVar3 = (ah2.e) map2.get(aVarF);
                                String str5 = (eVar3 == null || (str2 = eVar3.f3289a) == null) ? "--" : str2;
                                String strQ2 = y.Q(mVar2, aVarF.f3219b);
                                if (strQ2.length() > 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    String strValueOf2 = String.valueOf(strQ2.charAt(0));
                                    strValueOf2.getClass();
                                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                                    upperCase2.getClass();
                                    sb4.append((Object) upperCase2);
                                    sb4.append(strQ2.substring(1));
                                    strQ2 = sb4.toString();
                                }
                                x0.f111346a.f((i16 & 14) | (x0.f111348c << 24), 116, null, t2Var, null, null, str5, strQ2, strA2, null, mVar2);
                                mVar2.f();
                                unit = Unit.INSTANCE;
                            }
                            mVar2.f();
                        }
                        if (unit == null) {
                            mVar2.C(1089416799);
                            if (zContainsKey) {
                                mVar2.C(45312138);
                                boolean zG = s.g(lVar, rf2.l.c.f152498a);
                                ag2.c.a aVar3 = aVar;
                                if (zG && h0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.COOL_DOWN && h0Var2 == null) {
                                    mVar2.C(45529541);
                                    pVar = new o13.p("", y.Q(mVar2, R.string.lbl_complete));
                                    mVar2.f();
                                } else {
                                    mVar2.C(45631376);
                                    ah2.e eVar4 = (ah2.e) map2.get(aVar3);
                                    if (eVar4 == null || (str3 = eVar4.f3289a) == null) {
                                        str3 = "--";
                                    }
                                    b.f152669a.getClass();
                                    pVar = new o13.p(str3, b.a(aVar3, z18, dVar2, mVar2));
                                    mVar2.f();
                                }
                                String str6 = (String) pVar.f128594a;
                                String str7 = (String) pVar.f128595b;
                                String strQ3 = y.Q(mVar2, aVar3.f3219b);
                                if (strQ3.length() > 0) {
                                    StringBuilder sb5 = new StringBuilder();
                                    String strValueOf3 = String.valueOf(strQ3.charAt(0));
                                    strValueOf3.getClass();
                                    String upperCase3 = strValueOf3.toUpperCase(Locale.ROOT);
                                    upperCase3.getClass();
                                    sb5.append((Object) upperCase3);
                                    sb5.append(strQ3.substring(1));
                                    strQ3 = sb5.toString();
                                }
                                x0.f111346a.f(x0.f111348c << 24, 116, null, t2Var, null, null, str6, strQ3, str7, null, mVar2);
                                mVar2.f();
                                Unit unit3 = Unit.INSTANCE;
                            } else if (z17) {
                                mVar2.C(46377267);
                                ag2.c.a aVar4 = ag2.c.a.STEP_TIMER;
                                ah2.e eVar5 = (ah2.e) map2.get(aVar4);
                                String str8 = eVar5 != null ? eVar5.f3289a : null;
                                if (str8 == null) {
                                    mVar2.C(46480620);
                                    mVar2.f();
                                } else {
                                    mVar2.C(46480621);
                                    b.f152669a.getClass();
                                    String strA3 = b.a(aVar4, z18, dVar2, mVar2);
                                    String strQ4 = y.Q(mVar2, aVar4.f3219b);
                                    if (strQ4.length() > 0) {
                                        StringBuilder sb6 = new StringBuilder();
                                        String strValueOf4 = String.valueOf(strQ4.charAt(0));
                                        strValueOf4.getClass();
                                        String upperCase4 = strValueOf4.toUpperCase(Locale.ROOT);
                                        upperCase4.getClass();
                                        sb6.append((Object) upperCase4);
                                        sb6.append(strQ4.substring(1));
                                        strQ4 = sb6.toString();
                                    }
                                    x0.f111346a.f(x0.f111348c << 24, 116, null, t2Var, null, null, str8, strQ4, strA3, null, mVar2);
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                mVar2.C(46946892);
                                x0.f111346a.h(t2Var, mVar2, x0.f111348c << 3);
                                mVar2.f();
                                Unit unit4 = Unit.INSTANCE;
                            }
                            mVar2.f();
                        } else {
                            mVar2.C(1836239381);
                            mVar2.f();
                        }
                        if (cVar4 == null) {
                            mVar2.C(1091196137);
                            x0.f111346a.h(t2Var, mVar2, (i16 & 14) | (x0.f111348c << 3));
                            mVar2.f();
                        } else {
                            mVar2.C(1091234577);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, (x0.f111348c << 6) | 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(h0Var, z14, lVar, map, z15, dVar, h0Var2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0268  */
    public static final void c(i0 i0Var, String str, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        nt2.e eVar = i0Var.f197054b;
        o0 o0VarE = mVar.E(-2041922626);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.B(i0Var) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarC = c2.l.C(aVar, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
            bVar.getClass();
            r rVarA = c2.l.A(rVarC, eVar2.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.g.b bVar3 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean z15 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                objQ = new qw0.y(i0Var, 13);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qw0.y(i0Var, 13);
                    o0VarE.K(objQ);
                }
            }
            r rVarC4 = p5.v.c((e23.l) objQ, aVar, false);
            i53.c<nt2.e> cVar2 = i0Var.f197055c;
            String str2 = !eVar.f127844a.equals("--") ? eVar.f127844a : str;
            d92.b.f58624b.getClass();
            mh.c(str2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (cVar2.isEmpty()) {
                o0Var.C(-1308705094);
                o0Var.g0(false);
            } else {
                o0Var.C(-1309696846);
                s2 s2VarA2 = q2.a(c0343j, bVar3, o0Var, 0);
                int iHashCode3 = Long.hashCode(o0Var.U);
                i2 i2VarA2 = o0Var.a0();
                r rVarC5 = h4.k.c(aVar, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.c(eVar3, s2VarA2, o0Var);
                b4.c(c1623g, i2VarA2, o0Var);
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC5, o0Var);
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                int i16 = 0;
                for (nt2.e eVar4 : cVar2) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        x.q();
                        throw null;
                    }
                    nt2.e eVar5 = eVar4;
                    sb3.append(i16 > 0 ? " • ".concat(eVar5.f127844a) : eVar5.f127844a);
                    sb4.append(eVar5.f127845b.concat(StringUtils.SPACE));
                    i16 = i17;
                }
                r rVarF = x2.f(r.S, 1.0f);
                boolean zR = o0Var.r(sb4);
                Object objQ2 = o0Var.q();
                if (zR) {
                    z14 = false;
                    objQ2 = new e(0, sb4);
                    o0Var.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        z14 = false;
                        objQ2 = new e(0, sb4);
                        o0Var.K(objQ2);
                    } else {
                        z14 = false;
                    }
                }
                r rVarC6 = p5.v.c((e23.l) objQ2, rVarF, z14);
                String string = sb3.toString();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97931h, o0Var);
                d6.p.f57793b.getClass();
                mh.c(string, rVarC6, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 3, 0, null, x0VarF, o0Var, 0, 24960, 110588);
                o0Var = o0Var;
                o0Var.g0(true);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(i0Var, str, i14, 28);
        }
    }

    public static final void d(String str, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2072716625);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarZ = c2.l.z(aVar, f14, eVar.f97918c);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            v5.a(0.0f, 0, 2, sn.a.c(o0VarE), c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), o0VarE);
            t.a(str, null, 0, null, null, null, null, null, false, o0VarE, i15 & 14, 510);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 14);
        }
    }
}
