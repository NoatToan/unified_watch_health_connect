package cq;

import am.e1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import b21.v4;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import c22.q3;
import ca0.v0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.e5;
import i3.e9;
import i3.mc;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import l72.v2;
import lc.u0;
import o4.m1;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import ps.x1;
import s5.i0;
import s5.x0;
import u1.a2;
import u1.d2;
import w5.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((x1) t7).getStartDateTime(), ((x1) t14).getStartDateTime());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.climbs.ClimbListModalKt$ClimbListModal$4$1$1", f = "ClimbListModal.kt", l = {228}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f55103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f55104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f55105d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, p1<Boolean> p1Var, n1 n1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f55103b = mcVar;
            this.f55104c = p1Var;
            this.f55105d = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f55103b, this.f55104c, this.f55105d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55102a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f55102a = 1;
                if (this.f55103b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f55104c.setValue(Boolean.FALSE);
            this.f55105d.t(-1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0212  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x030c  */
    /* JADX WARN: Code duplicated, block: B:187:0x032f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0335  */
    /* JADX WARN: Code duplicated, block: B:193:0x0370  */
    /* JADX WARN: Code duplicated, block: B:197:0x0399  */
    /* JADX WARN: Code duplicated, block: B:200:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:201:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:207:0x0414  */
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
    public static final void a(final String str, final com.garmin.android.apps.connectmobile.activities.newmodel.a aVar, final ArrayList arrayList, final x1 x1Var, final yo1.f fVar, final mc mcVar, final boolean z14, final String str2, final boolean z15, e23.l lVar, final boolean z16, final boolean z17, final e23.a aVar2, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        boolean z18;
        int i18;
        o0 o0Var;
        final e23.l lVar2;
        yo1.d dVar;
        boolean z19;
        int i19;
        int i24;
        i53.f fVarA;
        yo1.d dVar2;
        boolean zR;
        Object objQ;
        int i25;
        h2.b bVarB;
        Object objQ2;
        e23.a aVar3;
        float f14;
        float f15;
        Object objQ3;
        o53.b0 b0Var;
        p1 p1VarQ;
        p005kotlin.jvm.internal.o0 o0Var2;
        p005kotlin.jvm.internal.o0 o0Var3;
        boolean zB;
        Object objQ4;
        g3.f fVar2;
        boolean zR2;
        Object objQ5;
        boolean z24;
        Object objQ6;
        boolean z25;
        List<yo1.d> listD;
        Object obj;
        str.getClass();
        x1Var.getClass();
        mcVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(2005322287);
        int i26 = (i14 & 6) == 0 ? (o0VarE.B(str) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i26 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i26 |= o0VarE.r(arrayList) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i26 |= (i14 & 4096) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i26 |= (32768 & i14) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i26 |= o0VarE.B(mcVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i26 |= o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i26 |= o0VarE.B(str2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i26 |= o0VarE.h(z15) ? 67108864 : 33554432;
        }
        int i27 = i16 & 512;
        if (i27 != 0) {
            i27 = i27;
            i17 = i26 | C.ENCODING_PCM_32BIT;
        } else {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                i26 |= o0VarE.r(lVar) ? 536870912 : 268435456;
            }
            i17 = i26;
        }
        if ((i15 & 6) == 0) {
            z18 = z16;
            i18 = i15 | (o0VarE.h(z18) ? 4 : 2);
        } else {
            z18 = z16;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.h(z17) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        int i28 = i18;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i28 & 147) == 146) ? false : true)) {
            e23.l lVar3 = i27 != 0 ? null : lVar;
            p3.x1 x1Var2 = p3.n.f135158a;
            Bundle bundle = new Bundle(1);
            bundle.putString("Screen", "ActivityDetails");
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "ViewClimbDetails");
            dq.a aVar4 = new dq.a(aVar, x1Var, arrayList);
            if (x1Var.getGroupRideCompetitionId() == null || fVar == null || (listD = fVar.d()) == null) {
                dVar = null;
            } else {
                Iterator<T> it = listD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    long competitionId = ((yo1.d) next).getCompetitionId();
                    Long groupRideCompetitionId = x1Var.getGroupRideCompetitionId();
                    if (groupRideCompetitionId != null && competitionId == groupRideCompetitionId.longValue() && (str2 == null || str2.equals(x1Var.getGroupRideSessionUuid()))) {
                        obj = next;
                        break;
                    }
                }
                dVar = (yo1.d) obj;
            }
            if (dVar != null) {
                List<yo1.e> listF = dVar.f();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listF) {
                    yo1.e eVar = (yo1.e) obj2;
                    if (eVar.getRanking() != null) {
                        Integer ranking = eVar.getRanking();
                        ranking.getClass();
                        if (ranking.intValue() > 0) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        z25 = false;
                    }
                    if (z25) {
                        arrayList2.add(obj2);
                    }
                }
                dVar.h(arrayList2);
            }
            if (z17) {
                i19 = -1325548991;
                i24 = R.string.device_text_my_stats;
                z19 = false;
            } else {
                z19 = false;
                i19 = -1325547199;
                i24 = R.string.app_tour_stats_title;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i19, i24, o0VarE, z19);
            if (dVar == null || dVar.f().isEmpty()) {
                o0VarE.C(1858124046);
                fVarA = i53.a.a(new g02.p1(gl1.y.Q(o0VarE, R.string.climb_details), null, null, 6, null), new g02.p1(strJ, null, null, 6, null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1857881378);
                fVarA = i53.a.a(new g02.p1(gl1.y.Q(o0VarE, R.string.climb_details), null, null, 6, null), new g02.p1(strJ, null, null, 6, null), new g02.p1(gl1.y.Q(o0VarE, R.string.lbl_rankings), null, null, 6, null));
                o0VarE.g0(false);
            }
            i53.f fVar3 = fVarA;
            Object objQ7 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ7 == c2565a) {
                objQ7 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ7);
            }
            o53.b0 b0Var2 = (o53.b0) objQ7;
            if (z15) {
                dVar2 = dVar;
                int i29 = fVar3.size() == 3 ? 2 : 0;
                zR = o0VarE.r(fVar3);
                objQ = o0VarE.q();
                if (!zR || objQ == c2565a) {
                    i25 = 2;
                    objQ = new ak0.w(fVar3, 2);
                    o0VarE.K(objQ);
                } else {
                    i25 = 2;
                }
                bVarB = h2.o0.b(i29, (e23.a) objQ, o0VarE, 0, i25);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new com.google.accompanist.drawablepainter.a(9);
                    o0VarE.K(objQ2);
                }
                aVar3 = (e23.a) objQ2;
                g3.a.f75580a.getClass();
                f14 = g3.a.f75581b;
                f15 = g3.a.f75582c;
                p3.x1 x1Var3 = p3.n.f135158a;
                if (g6.f.b(f14, 0) > 0) {
                    vb.h.s("The refresh trigger must be greater than zero!");
                    return;
                }
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                b0Var = (o53.b0) objQ3;
                p1VarQ = p0.q(aVar3, o0VarE);
                o0Var2 = new p005kotlin.jvm.internal.o0();
                o0Var3 = new p005kotlin.jvm.internal.o0();
                g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
                o0Var2.f105806a = cVar.s0(f14);
                o0Var3.f105806a = cVar.s0(f15);
                zB = o0VarE.B(b0Var);
                objQ4 = o0VarE.q();
                if (zB || objQ4 == c2565a) {
                    objQ4 = new g3.f(b0Var, p1VarQ, o0Var3.f105806a, o0Var2.f105806a);
                    o0VarE.K(objQ4);
                }
                fVar2 = (g3.f) objQ4;
                zR2 = o0VarE.r(fVar2) | o0VarE.i(o0Var2.f105806a) | o0VarE.i(o0Var3.f105806a);
                objQ5 = o0VarE.q();
                if (zR2 || objQ5 == c2565a) {
                    objQ5 = new fk0.a(fVar2, 7, o0Var2, o0Var3);
                    o0VarE.K(objQ5);
                }
                l0.i((e23.a) objQ5, o0VarE);
                l72.w wVar = l72.w.f111301a;
                z3.e eVarC = z3.f.c(-1793182736, new a51.g(aVar2, 29), o0VarE);
                if ((i28 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ6 = o0VarE.q();
                if (z24 || objQ6 == c2565a) {
                    objQ6 = new v0(aVar2, 19);
                    o0VarE.K(objQ6);
                }
                o0Var = o0VarE;
                wVar.f(str, null, null, eVarC, (e23.a) objQ6, mcVar, true, null, z3.f.c(-184290938, new j(fVar2, bVarB, b0Var2, fVar3, x1Var, aVar4, z14, fVar, dVar2, z18, lVar3), o0Var), o0Var, (i17 & 14) | 806882304 | (i17 & 458752), 390);
                lVar2 = lVar3;
            } else {
                dVar2 = dVar;
            }
            zR = o0VarE.r(fVar3);
            objQ = o0VarE.q();
            if (zR) {
                i25 = 2;
                objQ = new ak0.w(fVar3, 2);
                o0VarE.K(objQ);
            } else {
                i25 = 2;
                objQ = new ak0.w(fVar3, 2);
                o0VarE.K(objQ);
            }
            bVarB = h2.o0.b(i29, (e23.a) objQ, o0VarE, 0, i25);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new com.google.accompanist.drawablepainter.a(9);
                o0VarE.K(objQ2);
            }
            aVar3 = (e23.a) objQ2;
            g3.a.f75580a.getClass();
            f14 = g3.a.f75581b;
            f15 = g3.a.f75582c;
            p3.x1 x1Var4 = p3.n.f135158a;
            if (g6.f.b(f14, 0) > 0) {
                vb.h.s("The refresh trigger must be greater than zero!");
                return;
            }
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0Var = (o53.b0) objQ3;
            p1VarQ = p0.q(aVar3, o0VarE);
            o0Var2 = new p005kotlin.jvm.internal.o0();
            o0Var3 = new p005kotlin.jvm.internal.o0();
            g6.c cVar2 = (g6.c) o0VarE.A(t1.f91490h);
            o0Var2.f105806a = cVar2.s0(f14);
            o0Var3.f105806a = cVar2.s0(f15);
            zB = o0VarE.B(b0Var);
            objQ4 = o0VarE.q();
            if (zB) {
                objQ4 = new g3.f(b0Var, p1VarQ, o0Var3.f105806a, o0Var2.f105806a);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new g3.f(b0Var, p1VarQ, o0Var3.f105806a, o0Var2.f105806a);
                o0VarE.K(objQ4);
            }
            fVar2 = (g3.f) objQ4;
            zR2 = o0VarE.r(fVar2) | o0VarE.i(o0Var2.f105806a) | o0VarE.i(o0Var3.f105806a);
            objQ5 = o0VarE.q();
            if (zR2) {
                objQ5 = new fk0.a(fVar2, 7, o0Var2, o0Var3);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new fk0.a(fVar2, 7, o0Var2, o0Var3);
                o0VarE.K(objQ5);
            }
            l0.i((e23.a) objQ5, o0VarE);
            l72.w wVar2 = l72.w.f111301a;
            z3.e eVarC2 = z3.f.c(-1793182736, new a51.g(aVar2, 29), o0VarE);
            if ((i28 & 896) == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            objQ6 = o0VarE.q();
            if (z24) {
                objQ6 = new v0(aVar2, 19);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new v0(aVar2, 19);
                o0VarE.K(objQ6);
            }
            o0Var = o0VarE;
            wVar2.f(str, null, null, eVarC2, (e23.a) objQ6, mcVar, true, null, z3.f.c(-184290938, new j(fVar2, bVarB, b0Var2, fVar3, x1Var, aVar4, z14, fVar, dVar2, z18, lVar3), o0Var), o0Var, (i17 & 14) | 806882304 | (i17 & 458752), 390);
            lVar2 = lVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            lVar2 = lVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cq.k
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    u.a(str, aVar, arrayList, x1Var, fVar, mcVar, z14, str2, z15, lVar2, z16, z17, aVar2, (p3.m) obj3, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    public static final void b(String str, com.garmin.android.apps.connectmobile.activities.newmodel.a aVar, ArrayList arrayList, x1 x1Var, mc mcVar, boolean z14, e23.a aVar2, p3.m mVar, int i14) {
        String str2;
        int i15;
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar3;
        str.getClass();
        mcVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1619892032);
        if ((i14 & 6) == 0) {
            str2 = str;
            i15 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar3 = aVar;
            i15 |= o0VarE.r(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(arrayList) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 1048576 : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var2 = p3.n.f135158a;
            boolean z15 = (3670016 & i15) == 1048576;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new v0(aVar2, 18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v0(aVar2, 18);
                    o0VarE.K(objQ);
                }
            }
            a(str2, aVar3, arrayList, x1Var, null, mcVar, true, null, false, null, false, z14, (e23.a) objQ, o0VarE, (i15 & 14) | 114843648 | (i15 & 112) | (i15 & 896) | (x1.G1 << 9) | (i15 & 7168) | ((i15 << 3) & 458752), ((i15 >> 12) & 112) | 6, 512);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(str, aVar, arrayList, x1Var, mcVar, z14, aVar2, i14);
        }
    }

    public static final void c(x1 x1Var, dq.a aVar, boolean z14, p3.m mVar, int i14) {
        o0 o0Var;
        x1Var.getClass();
        o0 o0VarE = mVar.E(1767251678);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        boolean z15 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var2 = p3.n.f135158a;
            m00.a aVar2 = new m00.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), null, 2, null);
            eq.a aVar3 = new eq.a(aVar2);
            h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), a2.a(o0VarE), true);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new com.google.maps.android.compose.clustering.d(9);
                o0VarE.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(aVar) | o0VarE.r(aVar2) | o0VarE.r(aVar3);
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(x1Var))) {
                z15 = true;
            }
            boolean z16 = zR | z15;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                m mVar2 = new m(aVar, aVar2, z14, aVar3, x1Var, 0);
                o0VarE.K(mVar2);
                objQ2 = mVar2;
            }
            e23.l lVar2 = (e23.l) objQ2;
            o0Var = o0VarE;
            p002j6.c.b(lVar, rVarB, lVar2, o0Var, 6, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(x1Var, aVar, z14, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:146:0x0244  */
    /* JADX WARN: Code duplicated, block: B:161:0x029c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(x1 x1Var, String str, final int i14, m00.a aVar, yo1.f fVar, final e23.p<? super Integer, ? super Boolean, Unit> pVar, p3.m mVar, int i15) {
        int i16;
        String str2;
        yo1.d dVar;
        Object obj;
        int iIntValue;
        Integer ranking;
        boolean z14;
        List<yo1.d> listD;
        Object next;
        long competitionId;
        Long groupRideCompetitionId;
        String strB;
        x1Var.getClass();
        str.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-798237615);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= (32768 & i15) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            p3.x1 x1Var2 = p3.n.f135158a;
            String strC = aVar.c(x1Var.getAverageGrade());
            Double distance = x1Var.getDistance();
            String str3 = aVar.f115519d;
            if (distance != null && (strB = ss.k.b(ls.e.BIKE_DISTANCE, aVar.f115517b, distance, 1)) != null) {
                str3 = strB;
            }
            String strP = gl1.y.P(R.string.string_space_dot_space_string_space_dot_space_string_space_dot_space_string_pattern, new Object[]{strC, str3, aVar.a(x1Var.getElevationGain(), true)}, o0VarE);
            if (x1Var.getGroupRideCompetitionId() == null || fVar == null || (listD = fVar.d()) == null) {
                dVar = null;
            } else {
                Iterator<T> it = listD.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        competitionId = ((yo1.d) next).getCompetitionId();
                        groupRideCompetitionId = x1Var.getGroupRideCompetitionId();
                    }
                } while (!(groupRideCompetitionId != null && competitionId == groupRideCompetitionId.longValue()));
                dVar = (yo1.d) next;
            }
            p3.m.a aVar2 = p3.m.f135153a;
            if (dVar != null) {
                o0VarE.C(938021917);
                if (dVar.getUserRanking() > 0) {
                    iIntValue = dVar.getUserRanking();
                } else {
                    Iterator<T> it3 = dVar.f().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it3.next();
                        if (fVar != null && ((yo1.e) next2).getUserPk() == fVar.getForUserPk()) {
                            obj = next2;
                            break;
                        }
                    }
                    yo1.e eVar = (yo1.e) obj;
                    iIntValue = (eVar == null || (ranking = eVar.getRanking()) == null) ? 0 : ranking.intValue();
                }
                int size = (!dVar.getFinal() || fVar == null) ? dVar.f().size() : fVar.getUserCount();
                if (iIntValue != 0) {
                    o0VarE.C(938587264);
                    String strP2 = gl1.y.P(R.string.lbl_value1_of_value2, new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(size)}, o0VarE);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_group_ride_rank);
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarA = c2.l.A(h4.r.S, 0.0f, 8, 1);
                    boolean z15 = ((i16 & 458752) == 131072) | ((i16 & 896) == 256);
                    Object objQ = o0VarE.q();
                    if (z15) {
                        z14 = false;
                        final Object[] objArr = 0 == true ? 1 : 0;
                        objQ = new e23.a() { // from class: cq.o
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr) {
                                    case 0:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                    case 1:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                    default:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            z14 = false;
                            final int objArr2 = 0 == true ? 1 : 0;
                            objQ = new e23.a() { // from class: cq.o
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr2) {
                                        case 0:
                                            pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                            break;
                                        case 1:
                                            pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                            break;
                                        default:
                                            pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ);
                        } else {
                            z14 = false;
                        }
                    }
                    l72.l.e(str2, strP, strQ, strP2, null, null, rVarA, null, false, (e23.a) objQ, o0VarE, ((i16 >> 3) & 14) | 1572864, 432);
                    o0VarE = o0VarE;
                    o0VarE.g0(z14);
                } else {
                    z14 = false;
                    o0VarE.C(939140335);
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarA2 = c2.l.A(h4.r.S, 0.0f, 8, 1);
                    boolean z16 = ((i16 & 896) == 256) | ((i16 & 458752) == 131072);
                    Object objQ2 = o0VarE.q();
                    if (z16) {
                        final int i17 = 1;
                        objQ2 = new e23.a() { // from class: cq.o
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                    case 1:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                    default:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i18 = 1;
                            objQ2 = new e23.a() { // from class: cq.o
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                            break;
                                        case 1:
                                            pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                            break;
                                        default:
                                            pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ2);
                        }
                    }
                    l72.l.d(str, strP, null, rVarA2, null, false, (e23.a) objQ2, o0VarE, ((i16 >> 3) & 14) | 3072, 52);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            } else {
                o0VarE.C(939407183);
                g6.f.a aVar5 = g6.f.f75994b;
                h4.r rVarA3 = c2.l.A(h4.r.S, 0.0f, 8, 1);
                boolean z17 = ((i16 & 458752) == 131072) | ((i16 & 896) == 256);
                Object objQ3 = o0VarE.q();
                if (z17) {
                    final int i19 = 2;
                    objQ3 = new e23.a() { // from class: cq.o
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                    break;
                                case 1:
                                    pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                    break;
                                default:
                                    pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        final int i110 = 2;
                        objQ3 = new e23.a() { // from class: cq.o
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                    case 1:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                    default:
                                        pVar.invoke(Integer.valueOf(i14), Boolean.TRUE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    }
                }
                l72.l.d(str, strP, null, rVarA3, null, false, (e23.a) objQ3, o0VarE, ((i16 >> 3) & 14) | 3072, 52);
                o0VarE.g0(false);
            }
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(x1Var, str, i14, aVar, fVar, pVar, i15, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:154:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[LOOP:1: B:111:0x0244->B:157:?, LOOP_END, SYNTHETIC] */
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
    @SuppressLint({"UnrememberedMutableState"})
    public static final void e(List<x1> list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, mc mcVar, boolean z14, String str, boolean z15, e23.l<? super mc, Unit> lVar, p3.m mVar, int i14) {
        String strJ;
        boolean z16;
        String str2;
        boolean z17;
        boolean zR;
        Object objQ;
        List<yo1.d> listD;
        boolean z18;
        mcVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(292407038);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(activityDetailChartDTO) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            m00.a aVar = new m00.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), null, 2, null);
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var = (o53.b0) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (z.c((x1) obj)) {
                    arrayList.add(obj);
                }
            }
            List listN0 = h0.N0(arrayList, new a());
            Object objQ4 = o0VarE.q();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ4 == c2565a2) {
                objQ4 = e5.o(-1, o0VarE);
            }
            n1 n1Var = (n1) objQ4;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            if (listN0.size() > 1) {
                o0VarE.C(905323299);
                strJ = gl1.y.P(R.string.lbl_climbs_number_format, new Object[]{String.valueOf(listN0.size())}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 905424266, R.string.lbl_climb, o0VarE, false);
            }
            String str3 = strJ;
            l72.w wVar = l72.w.f111301a;
            z3.e eVarC = z3.f.c(-974312833, new c42.c0(19, lVar, mcVar), o0VarE);
            int i16 = i15;
            boolean z19 = ((i15 & 7168) == 2048) | ((i15 & 29360128) == 8388608);
            Object objQ5 = o0VarE.q();
            if (z19 || objQ5 == c2565a2) {
                z16 = false;
                objQ5 = new h(lVar, mcVar, 0);
                o0VarE.K(objQ5);
            } else {
                z16 = false;
            }
            Object obj2 = null;
            int i17 = i16 << 6;
            wVar.f(str3, null, null, eVarC, (e23.a) objQ5, mcVar, true, null, z3.f.c(-1178689899, new ak0.j(listN0, aVar, fVar, n1Var, p1Var, 12), o0VarE), o0VarE, (i17 & 458752) | 806882304, 390);
            if (n1Var.getIntValue() == -1 || !((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(908277444);
                o0VarE.g0(false);
            } else {
                o0VarE.C(907065623);
                x1 x1Var2 = (x1) listN0.get(n1Var.getIntValue());
                ArrayList arrayListA = z.a(list, x1Var2);
                String strP = gl1.y.P(R.string.climb_details_title, new Object[]{Integer.valueOf(n1Var.getIntValue() + 1), Integer.valueOf(listN0.size())}, o0VarE);
                if (fVar == null || (listD = fVar.d()) == null) {
                    str2 = str;
                } else {
                    Iterator<T> it = listD.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = str;
                            break;
                        }
                        Object next = it.next();
                        long competitionId = ((yo1.d) next).getCompetitionId();
                        Long groupRideCompetitionId = x1Var2.getGroupRideCompetitionId();
                        if (groupRideCompetitionId != null && competitionId == groupRideCompetitionId.longValue()) {
                            if (str != null) {
                                str2 = str;
                                if (str2.equals(x1Var2.getGroupRideSessionUuid())) {
                                }
                                if (z18) {
                                    obj2 = next;
                                    break;
                                }
                            } else {
                                str2 = str;
                            }
                            z18 = true;
                            if (z18) {
                                obj2 = next;
                                break;
                            }
                        } else {
                            str2 = str;
                        }
                        z18 = false;
                        if (z18) {
                            obj2 = next;
                            break;
                        }
                    }
                    yo1.d dVar = (yo1.d) obj2;
                    if (dVar != null && dVar.getFinal()) {
                        z17 = true;
                    }
                    zR = o0VarE.r(r26) | o0VarE.B(mcVarF);
                    objQ = o0VarE.q();
                    if (zR || objQ == p3.m.a.f135155b) {
                        objQ = new af0.e((Object) b0Var, (Object) mcVarF, (Object) p1Var, (Object) n1Var, 14);
                        o0VarE.K(objQ);
                    }
                    a(strP, activityDetailChartDTO, arrayListA, x1Var2, fVar, mcVarF, z14, str2, false, null, z17, z15, (e23.a) objQ, o0VarE, (i16 & 112) | 905969664 | (x1.G1 << 9) | (yo1.f.f198451e << 12) | (i17 & 57344) | (i17 & 3670016) | (i17 & 29360128), (i16 >> 15) & 112, 0);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                z17 = false;
                zR = o0VarE.r(r26) | o0VarE.B(mcVarF);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new af0.e((Object) b0Var, (Object) mcVarF, (Object) p1Var, (Object) n1Var, 14);
                    o0VarE.K(objQ);
                } else {
                    objQ = new af0.e((Object) b0Var, (Object) mcVarF, (Object) p1Var, (Object) n1Var, 14);
                    o0VarE.K(objQ);
                }
                a(strP, activityDetailChartDTO, arrayListA, x1Var2, fVar, mcVarF, z14, str2, false, null, z17, z15, (e23.a) objQ, o0VarE, (i16 & 112) | 905969664 | (x1.G1 << 9) | (yo1.f.f198451e << 12) | (i17 & 57344) | (i17 & 3670016) | (i17 & 29360128), (i16 >> 15) & 112, 0);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(list, activityDetailChartDTO, fVar, mcVar, z14, str, z15, lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    public static final void f(x1 x1Var, p3.m mVar, int i14) {
        x1Var.getClass();
        o0 o0VarE = mVar.E(1111442748);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var2 = p3.n.f135158a;
            ArrayList arrayListC = new eq.a(new m00.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), null, 2, null)).c(x1Var);
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            h4.r rVarA = c2.b0.f22601a.a(aVar, 1.0f, true);
            float f14 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
            l2 l2VarB = c2.l.b(f14, f14);
            boolean zR = o0VarE.r(arrayListC);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new g0(1, arrayListC);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g0(1, arrayListC);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarA, null, l2VarB, null, null, null, false, null, (e23.l) objQ, o0VarE, 384, 506);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(x1Var, i14, 13);
        }
    }

    public static final void g(long j8, yo1.d dVar, boolean z14, int i14, e23.l lVar, p3.m mVar, int i15) {
        long j14;
        int i16;
        boolean z15;
        int i17;
        e23.l lVar2;
        dVar.getClass();
        o0 o0VarE = mVar.E(-118465123);
        if ((i15 & 6) == 0) {
            j14 = j8;
            i16 = (o0VarE.l(j14) ? 4 : 2) | i15;
        } else {
            j14 = j8;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            z15 = z14;
            i16 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i15 & 3072) == 0) {
            i17 = i14;
            i16 |= o0VarE.k(i17) ? 2048 : 1024;
        } else {
            i17 = i14;
        }
        if ((i15 & 24576) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.r(lVar2) ? 16384 : 8192;
        } else {
            lVar2 = lVar;
        }
        int i18 = i16;
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            int i19 = (i18 & 112) | (i18 & 14) | (yo1.d.f198429g << 3);
            o(j14, dVar, z15, o0VarE, (i18 & 896) | i19);
            h(j8, dVar, lVar2, i17, o0VarE, ((i18 >> 6) & 896) | i19 | (i18 & 7168));
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(j8, dVar, z14, i14, lVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0722  */
    /* JADX WARN: Code duplicated, block: B:216:0x0752  */
    /* JADX WARN: Code duplicated, block: B:218:0x0758  */
    /* JADX WARN: Code duplicated, block: B:220:0x0764  */
    /* JADX WARN: Code duplicated, block: B:272:0x079a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(long j8, yo1.d dVar, e23.l lVar, int i14, p3.m mVar, int i15) {
        boolean z14;
        String strP;
        long jB;
        int i16;
        Object obj;
        boolean z15;
        Object aVar;
        Class cls;
        String str;
        String strE0;
        oi0.b bVar;
        String str2;
        oi0.b bVar2;
        boolean z16;
        String strB;
        String strQ;
        String str3;
        e23.l lVar2 = lVar;
        o0 o0VarE = mVar.E(-2019229098);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = (i15 & 6) == 0 ? (o0VarE.l(j8) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            d2 d2VarA = a2.a(o0VarE);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar2, 1.0f), d2VarA, false);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            float f14 = 52;
            g6.f.a aVar4 = g6.f.f75994b;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            eq.c cVar2 = new eq.c(context, new oi0.h(context), new m00.c(w2.a0.s(o0VarE)));
            g6.c cVar3 = (g6.c) o0VarE.A(t1.f91490h);
            float fW = w02.b0.w(c22.b.c(context, w02.b0.g(36, o0VarE), 1.5f), o0VarE);
            g.h hVar = new g.h();
            boolean z17 = (i17 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (z17) {
                objQ = new ci0.f(lVar2, 1);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ci0.f(lVar2, 1);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ, o0VarE, 0);
            h4.r rVarE = u1.n.e(aVar2, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            c.q qVar = qVarC;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(328169867);
            eq.e[] eVarArrValues = eq.e.values();
            int length = eVarArrValues.length;
            int i18 = 0;
            while (true) {
                String strQ2 = "";
                if (i18 >= length) {
                    break;
                }
                eq.e eVar2 = eVarArrValues[i18];
                Integer num = eVar2.f65036a;
                Integer numA = eq.c.a(eVar2, false);
                Integer numA2 = eq.c.a(eVar2, true);
                if (num != null) {
                    o0VarE.C(-389435088);
                    String strQ3 = gl1.y.Q(o0VarE, num.intValue());
                    Object objQ2 = o0VarE.q();
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new com.google.maps.android.compose.clustering.d(10);
                        o0VarE.K(objQ2);
                    }
                    strB = oi0.c.B(strQ3, (e23.l) objQ2, o0VarE);
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(-389314188);
                    o0VarE.g0(false);
                    strB = "";
                }
                if (numA2 != null) {
                    o0VarE.C(-389145083);
                    strQ = gl1.y.Q(o0VarE, numA2.intValue());
                    o0VarE.g0(z16);
                } else {
                    o0VarE.C(-389044364);
                    o0VarE.g0(z16);
                    strQ = "";
                }
                if (num != null) {
                    o0VarE.C(264549079);
                    String strQ4 = gl1.y.Q(o0VarE, num.intValue());
                    o0VarE.g0(z16);
                    str3 = strQ4;
                } else {
                    o0VarE.C(-388881182);
                    o0VarE.g0(z16);
                    str3 = "";
                }
                if (numA != null) {
                    o0VarE.C(264552251);
                    strQ2 = gl1.y.Q(o0VarE, numA.intValue());
                } else {
                    o0VarE.C(-388779006);
                }
                o0VarE.g0(z16);
                i(str3, strQ2, e5.g(strB, StringUtils.SPACE, strQ), dh.b.t(eVar2, o0VarE), f14, o0VarE, 24576);
                i18++;
                qVar = qVar;
                eVarArrValues = eVarArrValues;
            }
            c.q qVar2 = qVar;
            o0VarE.g0(false);
            o0VarE.g0(true);
            d92.b.f58623a.getClass();
            v5.a(2, 48, 1, d92.b.a(o0VarE).j().c(), null, o0VarE);
            o0VarE.C(1818116331);
            List<yo1.e> listF = dVar.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listF) {
                if (((yo1.e) obj2).getFinal()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i24 = i19 + 1;
                if (i19 < 0) {
                    p13.x.q();
                    throw null;
                }
                yo1.e eVar3 = (yo1.e) next;
                if (j8 == eVar3.getUserPk()) {
                    o0VarE.C(1840949401);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().g();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1841027521);
                    if (i19 % 2 == 0) {
                        o0VarE.C(613579274);
                        jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
                    } else {
                        o0VarE.C(613580457);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().b();
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                Object objQ3 = o0VarE.q();
                aVar5.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(g6.f.a(f14));
                    o0VarE.K(objQ3);
                }
                p1 p1Var = (p1) objQ3;
                h4.r rVarE2 = u1.n.e(h4.r.S, jB, m1.f128891a);
                boolean zB = o0VarE.B(cVar3);
                Object objQ4 = o0VarE.q();
                if (zB || objQ4 == c2565a) {
                    i16 = 0;
                    objQ4 = new p(cVar3, f14, p1Var, i16);
                    o0VarE.K(objQ4);
                } else {
                    i16 = 0;
                }
                h4.r rVarF = f5.g0.f(rVarE2, (e23.l) objQ4);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA2 = q2.a(c0343j, h4.d.a.f81533k, o0VarE, i16);
                p3.x1 x1Var2 = p3.n.f135158a;
                c.q qVar3 = qVar2;
                g6.c cVar4 = cVar3;
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar6 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA2, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                u2 u2Var2 = u2.f22900a;
                o0VarE.C(-145369163);
                eq.e[] eVarArrValues2 = eq.e.values();
                int length2 = eVarArrValues2.length;
                int i25 = 0;
                while (i25 < length2) {
                    eq.e eVar4 = eVarArrValues2[i25];
                    m00.c cVar5 = cVar2.f65021c;
                    String strO0 = cVar5.f115523b;
                    eq.e[] eVarArr = eVarArrValues2;
                    l22.b bVar5 = cVar5.f115522a;
                    eVar4.getClass();
                    int i26 = eq.c.a.f65022a[eVar4.ordinal()];
                    int i27 = length2;
                    Context context2 = cVar2.f65019a;
                    Iterator it3 = it;
                    p1 p1Var2 = p1Var;
                    switch (i26) {
                        case 1:
                            i17 = i17;
                            i25 = i25;
                            obj = null;
                            z15 = true;
                            String strValueOf = String.valueOf(eVar3.getRanking());
                            String string = context2.getString(R.string.segments_rank, strValueOf);
                            string.getClass();
                            aVar = new eq.d.a(strValueOf, string);
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar7 = (eq.d.a) aVar;
                                j(aVar7.f65023a, aVar7.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar6 = (eq.d.b) aVar;
                                str2 = bVar6.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar6.f65025a, fW, str2, bVar6.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        case 2:
                            i17 = i17;
                            i25 = i25;
                            obj = null;
                            z15 = true;
                            String str4 = eVar3.f198450o;
                            String fullName = eVar3.getFullName();
                            if (fullName == null) {
                                fullName = "";
                            }
                            aVar = new eq.d.b(str4, fullName, eVar3.getDisplayName());
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar8 = (eq.d.a) aVar;
                                j(aVar8.f65023a, aVar8.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar7 = (eq.d.b) aVar;
                                str2 = bVar7.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar7.f65025a, fW, str2, bVar7.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        case 3:
                            i17 = i17;
                            yo1.e eVar5 = eVar3;
                            i25 = i25;
                            obj = null;
                            String strA = cVar5.a(eVar5.getRideData().getDuration());
                            z15 = true;
                            String string2 = context2.getString(R.string.lbl_time_with_value, cVar2.f65020b.d(eVar5.getRideData().i(), true));
                            string2.getClass();
                            aVar = new eq.d.a(strA, string2);
                            eVar3 = eVar5;
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar9 = (eq.d.a) aVar;
                                j(aVar9.f65023a, aVar9.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar8 = (eq.d.b) aVar;
                                str2 = bVar8.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar8.f65025a, fW, str2, bVar8.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        case 4:
                            i17 = i17;
                            yo1.e eVar6 = eVar3;
                            Double averageSpeed = eVar6.getRideData().getAverageSpeed();
                            i25 = i25;
                            if (averageSpeed == null || Double.isNaN(averageSpeed.doubleValue()) || Double.isInfinite(averageSpeed.doubleValue())) {
                                cls = f12.l.class;
                            } else if (p005kotlin.jvm.internal.s.c(averageSpeed, 0.0d)) {
                                l3.f23124b.getClass();
                                strO0 = l3.f23130h.format(0L);
                                strO0.getClass();
                                cls = f12.l.class;
                            } else {
                                cls = f12.l.class;
                                q3 q3Var = ((f12.l) KoinJavaComponent.get$default(cls, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                                l3.a aVar10 = l3.f23124b;
                                double dDoubleValue = averageSpeed.doubleValue();
                                aVar10.getClass();
                                strO0 = l3.a.O0(bVar5, dDoubleValue, q3Var, l3.f23130h, false, cVar5.f115523b);
                            }
                            Double averageSpeed2 = eVar6.getRideData().getAverageSpeed();
                            if (averageSpeed2 == null || Double.isNaN(averageSpeed2.doubleValue()) || Double.isInfinite(averageSpeed2.doubleValue())) {
                                obj = null;
                                oi0.b bVar9 = new oi0.b(bVar5, com.nimbusds.jose.shaded.gson.internal.a.h(bVar5.getString(R.string.lbl_avg_speed), StringUtils.SPACE, bVar5.getString(R.string.txt_empty_page_no_data), StringSubstitutor.DEFAULT_VAR_END));
                                bVar9.a();
                                Unit unit = Unit.INSTANCE;
                                str = bVar9.f132238b;
                            } else {
                                obj = null;
                                q3 q3Var2 = ((f12.l) KoinJavaComponent.get$default(cls, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                                if (p005kotlin.jvm.internal.s.c(averageSpeed2, 0.0d)) {
                                    l3.f23124b.getClass();
                                    oi0.b bVar10 = new oi0.b(bVar5, j20.x.d(bVar5.getString(R.string.lbl_avg_speed), StringUtils.SPACE, l3.f23130h.format(0L), StringUtils.SPACE, bVar5.getString(q3Var2.f23223e)));
                                    bVar10.a();
                                    bVar10.t();
                                    bVar10.C();
                                    Unit unit2 = Unit.INSTANCE;
                                    str = bVar10.f132238b;
                                } else {
                                    l3.a aVar11 = l3.f23124b;
                                    double dDoubleValue2 = averageSpeed2.doubleValue();
                                    aVar11.getClass();
                                    oi0.b bVar11 = new oi0.b(bVar5, e5.g(bVar5.getString(R.string.lbl_avg_speed), StringUtils.SPACE, l3.a.O0(bVar5, dDoubleValue2, q3Var2, l3.f23130h, true, cVar5.f115523b)));
                                    bVar11.t();
                                    bVar11.C();
                                    bVar11.a();
                                    Unit unit3 = Unit.INSTANCE;
                                    str = bVar11.f132238b;
                                }
                            }
                            aVar = new eq.d.a(strO0, str);
                            eVar3 = eVar6;
                            z15 = true;
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar12 = (eq.d.a) aVar;
                                j(aVar12.f65023a, aVar12.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar12 = (eq.d.b) aVar;
                                str2 = bVar12.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar12.f65025a, fW, str2, bVar12.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        case 5:
                            eVar3 = eVar3;
                            Double averageHR = eVar3.getRideData().getAverageHR();
                            if (averageHR != null) {
                                l3.a aVar13 = l3.f23124b;
                                double dDoubleValue3 = averageHR.doubleValue();
                                aVar13.getClass();
                                strO0 = l3.a.k0(bVar5, dDoubleValue3, false, strO0);
                            }
                            aVar = new eq.d.a(strO0, cVar5.f115525d.c(eVar3.getRideData().getAverageHR()));
                            eVar3 = eVar3;
                            obj = null;
                            z15 = true;
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar14 = (eq.d.a) aVar;
                                j(aVar14.f65023a, aVar14.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar13 = (eq.d.b) aVar;
                                str2 = bVar13.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar13.f65025a, fW, str2, bVar13.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        case 6:
                            Double averagePower = eVar3.getRideData().getAveragePower();
                            if (averagePower == null) {
                                strE0 = strO0;
                            } else {
                                l3.a aVar15 = l3.f23124b;
                                double dDoubleValue4 = averagePower.doubleValue();
                                aVar15.getClass();
                                strE0 = l3.a.E0(bVar5, dDoubleValue4, false, strO0);
                            }
                            Double averagePower2 = eVar3.getRideData().getAveragePower();
                            if (averagePower2 == null) {
                                bVar = new oi0.b(bVar5, com.nimbusds.jose.shaded.gson.internal.a.h(bVar5.getString(R.string.activity_details_average_power), StringUtils.SPACE, bVar5.getString(R.string.txt_empty_page_no_data), StringSubstitutor.DEFAULT_VAR_END));
                                bVar.a();
                                Unit unit4 = Unit.INSTANCE;
                            } else {
                                l3.a aVar16 = l3.f23124b;
                                double dDoubleValue5 = averagePower2.doubleValue();
                                aVar16.getClass();
                                bVar = new oi0.b(bVar5, e5.g(bVar5.getString(R.string.activity_details_average_power), StringUtils.SPACE, l3.a.E0(bVar5, dDoubleValue5, true, strO0)));
                                bVar.X();
                                bVar.M();
                                bVar.T();
                                bVar.a();
                                Unit unit5 = Unit.INSTANCE;
                            }
                            aVar = new eq.d.a(strE0, bVar.f132238b);
                            eVar3 = eVar3;
                            obj = null;
                            z15 = true;
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar17 = (eq.d.a) aVar;
                                j(aVar17.f65023a, aVar17.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar14 = (eq.d.b) aVar;
                                str2 = bVar14.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar14.f65025a, fW, str2, bVar14.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        case 7:
                            Double averageBikeCadence = eVar3.getRideData().getAverageBikeCadence();
                            if (averageBikeCadence != null && !Double.isNaN(averageBikeCadence.doubleValue()) && !Double.isInfinite(averageBikeCadence.doubleValue())) {
                                l3.a aVar18 = l3.f23124b;
                                double dDoubleValue6 = averageBikeCadence.doubleValue();
                                aVar18.getClass();
                                strO0 = l3.a.F(bVar5, dDoubleValue6, false, true);
                            }
                            Double averageBikeCadence2 = eVar3.getRideData().getAverageBikeCadence();
                            if (averageBikeCadence2 == null || Double.isNaN(averageBikeCadence2.doubleValue()) || Double.isInfinite(averageBikeCadence2.doubleValue())) {
                                bVar2 = new oi0.b(bVar5, com.nimbusds.jose.shaded.gson.internal.a.h(bVar5.getString(R.string.activity_details_avg_cadence), StringUtils.SPACE, bVar5.getString(R.string.txt_empty_page_no_data), StringSubstitutor.DEFAULT_VAR_END));
                                bVar2.a();
                                Unit unit6 = Unit.INSTANCE;
                            } else {
                                l3.a aVar19 = l3.f23124b;
                                double dDoubleValue7 = averageBikeCadence2.doubleValue();
                                aVar19.getClass();
                                bVar2 = new oi0.b(bVar5, e5.g(bVar5.getString(R.string.activity_details_avg_cadence), StringUtils.SPACE, l3.a.F(bVar5, dDoubleValue7, true, true)));
                                bVar2.T();
                                bVar2.a();
                                bVar2.M();
                                Unit unit7 = Unit.INSTANCE;
                            }
                            aVar = new eq.d.a(strO0, bVar2.f132238b);
                            obj = null;
                            z15 = true;
                            if (aVar instanceof eq.d.a) {
                                o0VarE.C(-1549674794);
                                eq.d.a aVar110 = (eq.d.a) aVar;
                                j(aVar110.f65023a, aVar110.f65024b, dh.b.t(eVar4, o0VarE), ((g6.f) p1Var2.getF182175a()).f75997a, eVar4, o0VarE, 0);
                                o0VarE.g0(false);
                            } else {
                                if (!(aVar instanceof eq.d.b)) {
                                    throw kg.f.h(o0VarE, 1612574727, false);
                                }
                                o0VarE.C(-1549190109);
                                eq.d.b bVar15 = (eq.d.b) aVar;
                                str2 = bVar15.f65026b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                k(bVar15.f65025a, fW, str2, bVar15.f65027c, dh.b.t(eVar4, o0VarE), f14, qVar3, lVar2, o0VarE, ((i17 << 15) & 29360128) | 2293760);
                                o0VarE.g0(false);
                            }
                            i25++;
                            lVar2 = lVar;
                            eVarArrValues2 = eVarArr;
                            length2 = i27;
                            it = it3;
                            p1Var = p1Var2;
                            i17 = i17;
                            eVar3 = eVar3;
                            break;
                        default:
                            u0.r();
                            return;
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                lVar2 = lVar;
                cVar3 = cVar4;
                qVar2 = qVar3;
                i19 = i24;
                it = it;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            List<yo1.e> listF2 = dVar.f();
            if (listF2 == null || !listF2.isEmpty()) {
                Iterator<T> it4 = listF2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z14 = false;
                    } else if (!((yo1.e) it4.next()).getFinal()) {
                        z14 = true;
                    }
                }
            } else {
                z14 = false;
            }
            int size = i14 - dVar.f().size();
            if (z14) {
                o0VarE.C(463059564);
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_group_ride_results_preliminary);
                h4.r.a aVar20 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar16 = d92.b.f58625c;
                bVar16.getClass();
                j92.e eVar7 = j92.b.f97899b;
                float f15 = eVar7.f97920e;
                bVar16.getClass();
                h4.r rVarZ = c2.l.z(aVar20, f15, eVar7.f97917b);
                d92.b.f58624b.getClass();
                mh.c(strQ5, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE.g0(false);
            } else if (size > 0) {
                o0VarE.C(463388195);
                if (size == 1) {
                    strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 463438756, R.string.lbl_group_ride_private_activity_rider_data, o0VarE, false);
                } else {
                    o0VarE.C(463548372);
                    strP = gl1.y.P(R.string.lbl_group_ride_private_activity_data, new Object[]{Integer.valueOf(size)}, o0VarE);
                    o0VarE.g0(false);
                }
                String str5 = strP;
                h4.r.a aVar21 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar17 = d92.b.f58625c;
                bVar17.getClass();
                j92.e eVar8 = j92.b.f97899b;
                float f16 = eVar8.f97920e;
                bVar17.getClass();
                h4.r rVarZ2 = c2.l.z(aVar21, f16, eVar8.f97917b);
                d92.b.f58624b.getClass();
                mh.c(str5, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE.g0(false);
            } else {
                o0VarE.C(463888876);
                o0VarE.g0(false);
            }
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(j8, dVar, lVar, i14, i15);
        }
    }

    public static final void i(String str, String str2, String str3, float f14, float f15, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1334134995);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.i(f14) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarJ = x2.j(x2.u(h4.r.S, f14), f15, 0.0f, 2);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f16 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarA = v2.a(c2.l.z(rVarJ, f16, eVar.f97917b), str3.length() > 0, new as.s(str3, 6), o0VarE, 0);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(cVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, i15 & 14, 0, 131070);
            o0Var = o0VarE;
            fVar.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(str, str2, str3, f14, f15, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    public static final void j(String str, String str2, float f14, float f15, eq.e eVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1532074332);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.i(f15) ? 2048 : 1024) | (o0VarE.k(eVar.ordinal()) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarJ = x2.j(x2.u(h4.r.S, f14), f15, 0.0f, 2);
            eq.e eVar2 = eq.e.f65028c;
            h4.r rVarA = v2.a(v2.a(rVarJ, eVar == eVar2, new bk0.i(11), o0VarE, 0), eVar != eVar2, new bk0.i(12), o0VarE, 0);
            h4.d.f81522a.getClass();
            h4.r rVarX = x2.x(rVarA, h4.d.a.f81534l, 2);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new c82.b(str2, 28);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c82.b(str2, 28);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarB = p5.v.b(rVarX, (e23.l) objQ);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(str, str2, f14, f15, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x024a  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    public static final void k(final String str, final float f14, final String str2, final String str3, final float f15, final float f16, final c.q<Intent, f.a> qVar, final e23.l<? super Boolean, Unit> lVar, p3.m mVar, final int i14) {
        int i15;
        Context context;
        boolean z14;
        o0 o0VarE = mVar.E(1987764811);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.i(f15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.i(f16) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= (i14 & 2097152) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (i15 & 4793491) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarJ = x2.j(x2.u(aVar, f15), f16, 0.0f, 2);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarJ, eVar.f97918c);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            h4.r rVarX = x2.x(rVarY, bVar2, 2);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarX, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            b12.k.b(u2Var.c(aVar, bVar2), null, f14, new b12.b(str, null, null, null, null, 30, null), o0VarE, ((i15 << 3) & 896) | (b12.b.f14385f << 9), 18);
            bVar.getClass();
            c2.l.f(x2.u(aVar, eVar.f97918c), o0VarE);
            o0VarE.C(-405404524);
            s5.c.b bVar4 = new s5.c.b(0, 1, null);
            int iJ = bVar4.j(new i0(hb.a.e(o0VarE), 0L, (f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            try {
                bVar4.b(str2);
                Unit unit = Unit.INSTANCE;
                bVar4.f(iJ);
                s5.c cVarK = bVar4.k();
                o0VarE.g0(false);
                Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                d92.b.f58624b.getClass();
                x0 x0Var = j92.f.f97932i;
                h4.r rVarC2 = u2Var.c(aVar, bVar2);
                int i16 = i15 & 29360128;
                int i17 = i15 & 3670016;
                int i18 = i15 & 7168;
                int i19 = i15 & 896;
                boolean zR = (i16 == 8388608) | (i17 == 1048576 || ((i15 & 2097152) != 0 && o0VarE.r(qVar))) | o0VarE.r(context2) | (i18 == 2048) | (i19 == 256);
                Object objQ = o0VarE.q();
                p3.m.a aVar3 = p3.m.f135153a;
                if (zR) {
                    context = context2;
                    z14 = false;
                    v4 v4Var = new v4(lVar, qVar, context, str3, str2, 4);
                    o0VarE.K(v4Var);
                    objQ = v4Var;
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        context = context2;
                        z14 = false;
                        v4 v4Var2 = new v4(lVar, qVar, context, str3, str2, 4);
                        o0VarE.K(v4Var2);
                        objQ = v4Var2;
                    } else {
                        context = context2;
                        z14 = false;
                    }
                }
                h4.r rVarD = u1.w.d(rVarC2, false, null, null, (e23.a) objQ, 15);
                boolean zR2 = (i16 == 8388608 ? true : z14) | ((i17 == 1048576 || ((i15 & 2097152) != 0 && o0VarE.r(qVar))) ? true : z14) | o0VarE.r(context) | (i18 == 2048 ? true : z14);
                if (i19 == 256) {
                    z14 = true;
                }
                boolean z15 = zR2 | z14;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    e1 e1Var = new e1(lVar, qVar, context, str3, str2);
                    o0VarE.K(e1Var);
                    objQ2 = e1Var;
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        e1 e1Var2 = new e1(lVar, qVar, context, str3, str2);
                        o0VarE.K(e1Var2);
                        objQ2 = e1Var2;
                    }
                }
                p006l2.c0.a(cVarK, rVarD, x0Var, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 120);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            } catch (Throwable th3) {
                bVar4.f(iJ);
                throw th3;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cq.d
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u.k(str, f14, str2, str3, f15, f16, qVar, lVar, (p3.m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void l(ArrayList arrayList, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-360722699);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarC2 = c2.u.f22885a.c(aVar, h4.d.a.f81528f);
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(rVarC2, 1.0f), 2);
            d92.b.f58623a.getClass();
            c2.q.a(u1.n.e(rVarH, d92.b.a(o0VarE).j().c(), k2.i.a(4)), o0VarE, 0);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(1812388797);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p(0, u2Var.a(h4.r.S, 1.0f / arrayList.size(), true), ((c0) it.next()).f54993b, o0VarE);
            }
            e5.u(o0VarE, false, true, true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [h4.d$b, h4.d$c] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    public static final void m(ArrayList arrayList, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1392877225);
        int i15 = 2;
        int i16 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        boolean z14 = true;
        boolean z15 = false;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            ?? r14 = 0;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-2016501887);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                String str = c0Var.f54994c;
                x0 x0VarA = g02.q1.a(c0Var.f54997f, 1.3f, o0VarE);
                h4.r rVarA = u2Var.a(x2.x(x2.z(h4.r.S, r14, 3), r14, 3), 1.0f / arrayList.size(), z14);
                h4.d.f81522a.getClass();
                h4.r rVarZ = x2.z(rVarA, h4.d.a.f81537o, i15);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                bVar2.getClass();
                o0 o0Var2 = o0VarE;
                mh.c(str, c2.l.z(rVarZ, eVar.f97917b, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var2, 0, 0, 131068);
                z15 = z15;
                o0VarE = o0Var2;
                u2Var = u2Var;
                r14 = r14;
                i15 = 2;
                z14 = true;
            }
            o0Var = o0VarE;
            o0Var.g0(z15);
            o0Var.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    public static final void n(ArrayList arrayList, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2133400320);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(1498310772);
            StringBuilder sb3 = new StringBuilder();
            o0VarE.C(1498311940);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                boolean z14 = c0Var.f54996e;
                String str = c0Var.f54993b;
                if (z14) {
                    o0VarE.C(-1602078305);
                    sb3.append(gl1.y.P(R.string.lbl_your_rank, new Object[]{str}, o0VarE));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1601968193);
                    sb3.append(gl1.y.P(R.string.segments_rank, new Object[]{str}, o0VarE));
                    o0VarE.g0(false);
                }
                sb3.append(".");
                sb3.append(gl1.y.Q(o0VarE, R.string.lbl_time));
                sb3.append(c0Var.f54995d);
                sb3.append(". ");
            }
            o0VarE.g0(false);
            String string = sb3.toString();
            o0VarE.g0(false);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97918c);
            boolean zB = o0VarE.B(string);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new t(string, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t(string, i16);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarB = p5.v.b(rVarZ, (e23.l) objQ);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            int i17 = i15 & 14;
            q(arrayList, o0VarE, i17);
            l(arrayList, o0VarE, i17);
            m(arrayList, o0VarE, i17);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 4);
        }
    }

    public static final void o(long j8, yo1.d dVar, boolean z14, p3.m mVar, int i14) {
        o0 o0Var;
        Object next;
        o0 o0VarE = mVar.E(724977899);
        int i15 = (i14 & 6) == 0 ? (o0VarE.l(j8) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Iterator<T> it = dVar.f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((yo1.e) next).getUserPk() == j8));
            yo1.e eVar = (yo1.e) next;
            if (eVar != null) {
                o0VarE.C(-1573468514);
                List<yo1.e> listF = dVar.f();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (((yo1.e) obj).getFinal()) {
                        arrayList.add(obj);
                    }
                }
                yo1.e eVar2 = (yo1.e) h0.b0(arrayList);
                yo1.e eVar3 = (yo1.e) h0.m0(arrayList);
                String strQ = gl1.y.Q(o0VarE, z14 ? R.string.lbl_group_climb_rankings : R.string.lbl_group_ride_preliminary_rankings);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r.a aVar = h4.r.S;
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar4 = j92.b.f97899b;
                float f14 = eVar4.f97920e;
                float f15 = eVar4.f97920e;
                bVar.getClass();
                float f16 = eVar4.f97920e;
                bVar.getClass();
                mh.c(strQ, c2.l.C(aVar, f14, eVar4.f97920e, f16, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                if (z14) {
                    o0Var.C(-1573135357);
                    bVar.getClass();
                    c2.l.f(x2.h(aVar, f15), o0Var);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1573037211);
                    String strP = gl1.y.P(R.string.lbl_riders_finished, new Object[]{String.valueOf(arrayList.size()), String.valueOf(dVar.f().size())}, o0Var);
                    bVar.getClass();
                    bVar.getClass();
                    h4.r rVarZ = c2.l.z(aVar, f15, eVar4.f97918c);
                    fVar.getClass();
                    mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0Var), o0Var, 0, 0, 131068);
                    o0Var = o0Var;
                    o0Var.g0(false);
                }
                m00.c cVar = new m00.c(w2.a0.s(o0Var));
                oi0.h hVar = new oi0.h((Context) o0Var.A(AndroidCompositionLocals_androidKt.f6042b));
                Integer ranking = eVar.getRanking();
                if (ranking != null && ranking.intValue() == 1 && arrayList.size() == 1) {
                    o0Var.C(-1572317329);
                    String str = eVar.f198450o;
                    String strA = cVar.a(eVar.getRideData().getDuration());
                    String strD = hVar.d(eVar.getRideData().i(), true);
                    fVar.getClass();
                    n(p13.x.d(new c0(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strA, strD, true, x0.a(d92.c.e(j92.f.f97928e), com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, new s5.c0(false), null, 16252926))), o0Var, 0);
                    o0Var.g0(false);
                } else if (ranking != null && ranking.intValue() == 1) {
                    o0Var.C(-1571297739);
                    String str2 = eVar.f198450o;
                    String strA2 = cVar.a(eVar.getRideData().getDuration());
                    String strD2 = hVar.d(eVar.getRideData().i(), true);
                    fVar.getClass();
                    c0 c0Var = new c0(str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strA2, strD2, true, x0.a(d92.c.e(j92.f.f97928e), com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, new s5.c0(false), null, 16252926));
                    String strValueOf = String.valueOf(arrayList.size());
                    String strA3 = cVar.a(eVar3.getRideData().getDuration());
                    String strD3 = hVar.d(eVar3.getRideData().i(), true);
                    fVar.getClass();
                    n(p13.x.d(c0Var, new c0(null, strValueOf, strA3, strD3, false, x0.a(j92.f.f97930g, com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 16, null)), o0Var, 0);
                    o0Var.g0(false);
                } else {
                    int size = arrayList.size();
                    if (ranking != null && ranking.intValue() == size) {
                        o0Var.C(-1569618221);
                        String strA4 = cVar.a(eVar2.getRideData().getDuration());
                        String strD4 = hVar.d(eVar2.getRideData().i(), true);
                        fVar.getClass();
                        c0 c0Var2 = new c0(null, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strA4, strD4, false, x0.a(j92.f.f97930g, com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 16, null);
                        String str3 = eVar.f198450o;
                        String strValueOf2 = String.valueOf(arrayList.size());
                        String strA5 = cVar.a(eVar.getRideData().getDuration());
                        String strD5 = hVar.d(eVar.getRideData().i(), true);
                        fVar.getClass();
                        n(p13.x.d(c0Var2, new c0(str3, strValueOf2, strA5, strD5, true, x0.a(d92.c.e(j92.f.f97928e), com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, new s5.c0(false), null, 16252926))), o0Var, 0);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1567944221);
                        String strA6 = cVar.a(eVar2.getRideData().getDuration());
                        String strD6 = hVar.d(eVar2.getRideData().i(), true);
                        fVar.getClass();
                        x0 x0Var = j92.f.f97930g;
                        c0 c0Var3 = new c0(null, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strA6, strD6, false, x0.a(x0Var, com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 16, null);
                        String str4 = eVar.f198450o;
                        String strValueOf3 = String.valueOf(ranking);
                        String strA7 = cVar.a(eVar.getRideData().getDuration());
                        String strD7 = hVar.d(eVar.getRideData().i(), true);
                        fVar.getClass();
                        c0 c0Var4 = new c0(str4, strValueOf3, strA7, strD7, true, x0.a(d92.c.e(j92.f.f97928e), com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, new s5.c0(false), null, 16252926));
                        String strValueOf4 = String.valueOf(arrayList.size());
                        String strA8 = cVar.a(eVar3.getRideData().getDuration());
                        String strD8 = hVar.d(eVar3.getRideData().i(), true);
                        fVar.getClass();
                        n(p13.x.d(c0Var3, c0Var4, new c0(null, strValueOf4, strA8, strD8, false, x0.a(x0Var, com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 16, null)), o0Var, 0);
                        o0Var.g0(false);
                    }
                }
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1565756489);
                o0Var.g0(false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s(j8, dVar, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    public static final void p(int i14, h4.r rVar, String str, p3.m mVar) {
        o0 o0Var;
        o0 o0VarE = mVar.E(172815987);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jG = d92.b.a(o0VarE).e().g();
            long jB = d92.b.a(o0VarE).c().b();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97935l), o0VarE);
            h4.r rVarX = x2.x(x2.z(rVar, null, 3), null, 3);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarX, j92.b.f97899b.f97918c);
            boolean zL = o0VarE.l(jG) | o0VarE.l(jB);
            Object objQ = o0VarE.q();
            if (zL) {
                f fVar = new f(jG, jB, 0);
                o0VarE.K(fVar);
                objQ = fVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    f fVar2 = new f(jG, jB, 0);
                    o0VarE.K(fVar2);
                    objQ = fVar2;
                }
            }
            o0Var = o0VarE;
            mh.c(str, l4.k.d(rVarY, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, (i15 >> 3) & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, str, i14, 0);
        }
    }

    public static final void q(ArrayList arrayList, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1443978198);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = 2;
        int i16 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            float fW = w02.b0.w(c22.b.c((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), w02.b0.g(wz1.b.f188181a, o0VarE), 1.5f), o0VarE);
            h4.r rVarA = u2Var.a(aVar, 1.0f / arrayList.size(), true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarA, j92.b.f97899b.f97918c);
            o0VarE.C(1035036962);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                if (c0Var.f54992a == null) {
                    o0VarE.C(-10143917);
                    c2.l.f(rVarY, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-10070416);
                    h4.d.f81522a.getClass();
                    h4.r rVarZ = x2.z(rVarY, h4.d.a.f81537o, i15);
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    b12.k.b(null, null, fW, new b12.b(c0Var.f54992a, null, null, null, null, 30, null), o0VarE, b12.b.f14385f << 9, 19);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
                i15 = 2;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 1);
        }
    }

    public static final void r(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 345309235);
        int i15 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16);
        if (o0VarK.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarK), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarK);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarK.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarK);
            u2 u2Var = u2.f22900a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            x0 x0VarF = d92.c.f(x0Var, o0VarK);
            float f14 = 8;
            g6.f.a aVar3 = g6.f.f75994b;
            float f15 = 16;
            mh.c(str, u2Var.a(c2.l.z(aVar, f15, f14), 5.5f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarK, i15 & 14, 0, 131068);
            fVar.getClass();
            x0 x0VarB = d92.c.b(x0Var, o0VarK);
            d6.h.f57752b.getClass();
            str3 = str2;
            mh.c(str3, u2Var.a(c2.l.z(aVar, f15, f14), 4.5f, true), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB, o0VarK, (i15 >> 3) & 14, 0, 130044);
            o0Var = o0VarK;
            o0Var.g0(true);
        } else {
            str3 = str2;
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str3, i14, 4);
        }
    }
}
