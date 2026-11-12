package ht1;

import am.l1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.s0;
import b82.d1;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f2.r0;
import g02.a1;
import i3.mh;
import i3.p7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.m3;
import kotlin.t1;
import l72.c1;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p3.a2;
import p3.b2;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.o1;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.trail.actions.TrailSubmitReviewContainerKt$TrailSubmitReviewContainer$5$1", f = "TrailSubmitReviewContainer.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pt1.l f85605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o1 f85606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<String> f85607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f85608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f4.s<String> f85609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f4.s<String> f85610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f85611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f4.s<String> f85612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f85613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n1 f85614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1<String> f85615k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pt1.l lVar, o1 o1Var, p1<String> p1Var, Context context, f4.s<String> sVar, f4.s<String> sVar2, p1<Boolean> p1Var2, f4.s<String> sVar3, p1<Boolean> p1Var3, n1 n1Var, p1<String> p1Var4, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85605a = lVar;
            this.f85606b = o1Var;
            this.f85607c = p1Var;
            this.f85608d = context;
            this.f85609e = sVar;
            this.f85610f = sVar2;
            this.f85611g = p1Var2;
            this.f85612h = sVar3;
            this.f85613i = p1Var3;
            this.f85614j = n1Var;
            this.f85615k = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f85605a, this.f85606b, this.f85607c, this.f85608d, this.f85609e, this.f85610f, this.f85611g, this.f85612h, this.f85613i, this.f85614j, this.f85615k, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Long l14;
            Collection<? extends String> arrayList;
            Collection<? extends String> arrayList2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            pt1.l lVar = this.f85605a;
            Long l15 = lVar.f140876c;
            o1 o1Var = this.f85606b;
            long j8 = o1Var.j();
            if ((l15 == null || l15.longValue() != j8) && (l14 = lVar.f140876c) != null) {
                o1Var.k(l14.longValue());
                this.f85614j.t(lVar.f140878e);
                String str = lVar.f140881h;
                String string = "";
                if (str == null) {
                    str = "";
                }
                this.f85607c.setValue(str);
                us1.h hVar = lVar.f140883j;
                Context context = this.f85608d;
                if (hVar != null) {
                    string = context.getString(hVar.f172408b);
                    string.getClass();
                }
                this.f85615k.setValue(string);
                f4.s<String> sVar = this.f85609e;
                sVar.clear();
                i53.c<us1.g> cVar = lVar.f140884k;
                if (cVar != null) {
                    arrayList = new ArrayList<>(p13.y.r(cVar, 10));
                    Iterator<us1.g> it = cVar.iterator();
                    while (it.hasNext()) {
                        String string2 = context.getString(it.next().f172402b);
                        string2.getClass();
                        arrayList.add(string2);
                    }
                } else {
                    arrayList = j0.f134944a;
                }
                sVar.addAll(arrayList);
                f4.s<String> sVar2 = this.f85610f;
                sVar2.clear();
                i53.c<us1.i> cVar2 = lVar.f140885l;
                if (cVar2 != null) {
                    arrayList2 = new ArrayList<>(p13.y.r(cVar2, 10));
                    Iterator<us1.i> it3 = cVar2.iterator();
                    while (it3.hasNext()) {
                        String string3 = context.getString(it3.next().f172418b);
                        string3.getClass();
                        arrayList2.add(string3);
                    }
                } else {
                    arrayList2 = j0.f134944a;
                }
                sVar2.addAll(arrayList2);
                this.f85611g.setValue(Boolean.valueOf(lVar.f140882i));
                f4.s<String> sVar3 = this.f85612h;
                sVar3.clear();
                i53.c<pt1.u> cVar3 = lVar.f140886m;
                ArrayList arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
                Iterator<pt1.u> it4 = cVar3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(it4.next().f140986a);
                }
                sVar3.addAll(arrayList3);
            }
            this.f85613i.setValue(Boolean.valueOf(lVar.f140888o));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p1 p1Var, long j8, o1 o1Var, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        o0 o0VarE = mVar.E(650991014);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(p1Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(o1Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1896228630);
                String strQ = gl1.y.Q(o0VarE, R.string.date_picker_select_date);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j8);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(DateTime.now().getMillis());
                int i16 = i15 & 14;
                int i17 = i15 & 896;
                boolean z15 = ((i15 & 7168) == 2048) | (i16 == 4) | (i17 == 256);
                Object objQ = o0VarE.q();
                p3.m.a aVar = p3.m.f135153a;
                if (z15) {
                    objQ = new h51.c(p1Var, lVar, o1Var);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h51.c(p1Var, lVar, o1Var);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean z16 = ((i15 & 112) == 32) | (i16 == 4) | (i17 == 256);
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new d62.s(p1Var, o1Var, j8);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d62.s(p1Var, o1Var, j8);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                boolean z17 = i17 == 256;
                Object objQ3 = o0VarE.q();
                if (z17) {
                    z14 = false;
                    objQ3 = new m(o1Var, 0);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        z14 = false;
                        objQ3 = new m(o1Var, 0);
                        o0VarE.K(objQ3);
                    } else {
                        z14 = false;
                    }
                }
                e23.l lVar2 = (e23.l) objQ3;
                boolean z18 = z14;
                g82.a.a(false, strQ, strQ2, aVar2, strQ3, aVar3, null, calendar, null, calendar2, lVar2, o0VarE, 0, 0, 645);
                o0Var = o0VarE;
                o0Var.g0(z18);
            } else {
                o0Var = o0VarE;
                o0Var.C(1897009148);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.h(j8, p1Var, o1Var, lVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public static final void b(int i14, h4.r rVar, String str, p3.m mVar, p1 p1Var) {
        String str2;
        o0 o0VarE = mVar.E(-507012503);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(p1Var) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new gp.e(p1Var, 25);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.e(p1Var, 25);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ, 15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.trail_review_activity_date);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(strQ, c2.l.A(aVar3, 0.0f, eVar.f97917b, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r rVarB = b0Var.b(aVar3, aVar);
            bVar2.getClass();
            str2 = str;
            mh.c(str2, c2.l.A(rVarB, 0.0f, eVar.f97917b, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i15 >> 6) & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            str2 = str;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, p1Var, str2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    public static final void c(p1<Boolean> p1Var, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-908473244);
        int i15 = (o0VarE.B(p1Var) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (p1Var.getF182175a().booleanValue()) {
                o0VarE.C(-1737291736);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.dialog_exit_trail_review_title);
                String strQ2 = gl1.y.Q(o0VarE, z14 ? R.string.dialog_exit_trail_review_edit_message : R.string.dialog_exit_trail_review_message);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_exit);
                int i16 = i15 & 14;
                boolean z15 = (i16 == 4) | ((i15 & 896) == 256);
                Object objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (z15) {
                    objQ = new a11.a0(p1Var, aVar, 16);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a11.a0(p1Var, aVar, 16);
                        o0VarE.K(objQ);
                    }
                }
                e23.a<Unit> aVar3 = (e23.a) objQ;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                boolean z16 = i16 == 4;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new gp.e(p1Var, 24);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new gp.e(p1Var, 24);
                        o0VarE.K(objQ2);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, strQ4, (e23.a) objQ2, o0VarE, 6, 0, 216);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1736532546);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gs.r(i14, aVar, p1Var, z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03a0 A[LOOP:2: B:167:0x039a->B:169:0x03a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03da  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:231:0x0528  */
    /* JADX WARN: Code duplicated, block: B:234:0x0569  */
    /* JADX WARN: Code duplicated, block: B:236:0x0570  */
    /* JADX WARN: Code duplicated, block: B:237:0x0574  */
    /* JADX WARN: Code duplicated, block: B:242:0x0595  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:251:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:254:0x0628  */
    /* JADX WARN: Code duplicated, block: B:255:0x062b  */
    /* JADX WARN: Code duplicated, block: B:258:0x063f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0641  */
    /* JADX WARN: Code duplicated, block: B:262:0x065e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0660  */
    /* JADX WARN: Code duplicated, block: B:266:0x066b  */
    /* JADX WARN: Code duplicated, block: B:267:0x066d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0678  */
    /* JADX WARN: Code duplicated, block: B:271:0x067a  */
    /* JADX WARN: Code duplicated, block: B:278:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:281:0x071d  */
    /* JADX WARN: Code duplicated, block: B:283:0x072e  */
    /* JADX WARN: Code duplicated, block: B:286:0x074f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0755  */
    /* JADX WARN: Code duplicated, block: B:290:0x075a  */
    /* JADX WARN: Code duplicated, block: B:291:0x075c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0765  */
    /* JADX WARN: Code duplicated, block: B:295:0x0767  */
    /* JADX WARN: Code duplicated, block: B:298:0x079f  */
    /* JADX WARN: Code duplicated, block: B:299:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:304:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:309:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:310:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:313:0x0825  */
    /* JADX WARN: Code duplicated, block: B:314:0x0827  */
    /* JADX WARN: Code duplicated, block: B:321:0x083a  */
    /* JADX WARN: Code duplicated, block: B:324:0x087b  */
    /* JADX WARN: Code duplicated, block: B:326:0x087f  */
    /* JADX WARN: Code duplicated, block: B:331:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:335:0x08de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r11v7, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v97, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r9v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v72, types: [java.util.ArrayList] */
    public static final void d(final pt1.l lVar, e23.a<Unit> aVar, e23.l<? super pt1.l, Unit> lVar2, e23.l<? super pt1.l, Unit> lVar3, final e23.l<? super Integer, Unit> lVar4, final e23.p<? super Integer, ? super Integer, Unit> pVar, final e23.l<? super pt1.u, Unit> lVar5, e23.l<? super Long, Unit> lVar6, final e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        final int i15;
        int i16;
        ?? arrayList;
        ?? arrayList2;
        String string;
        boolean z14;
        o1 o1Var;
        ArrayList arrayList3;
        Iterator<pt1.u> it;
        f4.s sVarH;
        f4.s sVar;
        boolean z15;
        h4.r.a aVar3;
        j92.b bVar;
        j92.e eVar;
        final h4.r rVarY;
        boolean zB;
        Object objQ;
        boolean zB2;
        Object objQ2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar4;
        h5.g.a.b bVar2;
        ?? r14;
        boolean z16;
        boolean z17;
        Object objQ3;
        final String str;
        final p1 p1Var;
        f4.s sVar2;
        o0 o0Var2;
        boolean z18;
        boolean z19;
        final f4.s sVar3;
        boolean z24;
        boolean z25;
        boolean z26;
        final boolean z27;
        boolean zH;
        Object objQ4;
        final n1 n1Var;
        p1 p1Var2;
        f4.s sVar4;
        p1 p1Var3;
        o0 o0Var3;
        boolean z28;
        String strJ;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objQ5;
        o1 o1Var2;
        Context context;
        boolean z38;
        boolean z39;
        boolean z44;
        Object dVar;
        f4.s sVar5;
        f4.s sVar6;
        Context context2;
        boolean z45;
        boolean zB3;
        Object objQ6;
        final pt1.l lVar7 = lVar;
        lVar7.getClass();
        i53.c<us1.i> cVar = lVar7.f140885l;
        i53.c<us1.g> cVar2 = lVar7.f140884k;
        Long l14 = lVar7.f140876c;
        i53.c<pt1.u> cVar3 = lVar7.f140886m;
        aVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        pVar.getClass();
        lVar5.getClass();
        lVar6.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-427433404);
        int i17 = (o0VarE.B(lVar7) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        int i18 = i17 | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(lVar4) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536) | (o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar6) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432);
        if (o0VarE.n(i18 & 1, (i18 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Context context3 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ7 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ7 == c2565a) {
                objQ7 = new ha0.a(28);
                o0VarE.K(objQ7);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr, (e23.a) objQ7, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new ha0.a(29);
                o0VarE.K(objQ8);
            }
            final p1 p1Var5 = (p1) d4.a.e(objArr2, (e23.a) objQ8, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new v(0);
                o0VarE.K(objQ9);
            }
            p1 p1Var6 = (p1) d4.a.e(objArr3, (e23.a) objQ9, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            int i19 = i18 & 14;
            boolean z46 = i19 == 4;
            Object objQ10 = o0VarE.q();
            if (z46 || objQ10 == c2565a) {
                i15 = 0;
                objQ10 = new e23.a() { // from class: ht1.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return new a2(lVar7.f140878e);
                            case 1:
                                Long l15 = lVar7.f140876c;
                                return new b2(l15 != null ? l15.longValue() : -1L);
                            case 2:
                                return new b2(lVar7.f140879f);
                            case 3:
                                String str2 = lVar7.f140881h;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                return p0.n(str2);
                            case 4:
                                return p0.n(Boolean.valueOf(lVar7.f140882i));
                            default:
                                return new b2(lVar7.f140879f);
                        }
                    }
                };
                o0VarE.K(objQ10);
            } else {
                i15 = 0;
            }
            n1 n1Var2 = (n1) d4.a.e(objArr4, (e23.a) objQ10, o0VarE, i15);
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ11;
            Object[] objArr5 = new Object[0];
            boolean zR = (i19 == 4) | o0VarE.r(context3);
            Object objQ12 = o0VarE.q();
            if (zR || objQ12 == c2565a) {
                i16 = 0;
                objQ12 = new gp.f(lVar7, 22, context3, 0 == true ? 1 : 0);
                o0VarE.K(objQ12);
            } else {
                i16 = 0;
            }
            p1 p1Var7 = (p1) d4.a.e(objArr5, (e23.a) objQ12, o0VarE, i16);
            Object[] objArr6 = new Object[i16];
            boolean z47 = i19 == 4;
            Object objQ13 = o0VarE.q();
            if (z47 || objQ13 == c2565a) {
                final int i24 = 1;
                objQ13 = new e23.a() { // from class: ht1.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return new a2(lVar7.f140878e);
                            case 1:
                                Long l15 = lVar7.f140876c;
                                return new b2(l15 != null ? l15.longValue() : -1L);
                            case 2:
                                return new b2(lVar7.f140879f);
                            case 3:
                                String str2 = lVar7.f140881h;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                return p0.n(str2);
                            case 4:
                                return p0.n(Boolean.valueOf(lVar7.f140882i));
                            default:
                                return new b2(lVar7.f140879f);
                        }
                    }
                };
                o0VarE.K(objQ13);
            }
            o1 o1Var3 = (o1) d4.a.e(objArr6, (e23.a) objQ13, o0VarE, 0);
            if (cVar2 != null) {
                arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<us1.g> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    String string2 = context3.getString(it3.next().f172402b);
                    string2.getClass();
                    arrayList.add(string2);
                }
            } else {
                arrayList = j0.f134944a;
            }
            Object[] array = arrayList.toArray(new String[0]);
            final f4.s sVarH2 = gl1.y.H(Arrays.copyOf(array, array.length), o0VarE);
            if (cVar != null) {
                arrayList2 = new ArrayList(p13.y.r(cVar, 10));
                Iterator<us1.i> it4 = cVar.iterator();
                while (it4.hasNext()) {
                    String string3 = context3.getString(it4.next().f172418b);
                    string3.getClass();
                    arrayList2.add(string3);
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            Object[] array2 = arrayList2.toArray(new String[0]);
            f4.s sVarH3 = gl1.y.H(Arrays.copyOf(array2, array2.length), o0VarE);
            Object[] objArr7 = new Object[0];
            boolean z48 = i19 == 4;
            Object objQ14 = o0VarE.q();
            if (z48 || objQ14 == p3.m.a.f135155b) {
                final int i25 = 2;
                objQ14 = new e23.a() { // from class: ht1.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                return new a2(lVar7.f140878e);
                            case 1:
                                Long l15 = lVar7.f140876c;
                                return new b2(l15 != null ? l15.longValue() : -1L);
                            case 2:
                                return new b2(lVar7.f140879f);
                            case 3:
                                String str2 = lVar7.f140881h;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                return p0.n(str2);
                            case 4:
                                return p0.n(Boolean.valueOf(lVar7.f140882i));
                            default:
                                return new b2(lVar7.f140879f);
                        }
                    }
                };
                o0VarE.K(objQ14);
            }
            o1 o1Var4 = (o1) d4.a.e(objArr7, (e23.a) objQ14, o0VarE, 0);
            Object[] objArr8 = new Object[0];
            boolean z49 = i19 == 4;
            Object objQ15 = o0VarE.q();
            if (z49 || objQ15 == p3.m.a.f135155b) {
                final int i26 = 3;
                objQ15 = new e23.a() { // from class: ht1.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                return new a2(lVar7.f140878e);
                            case 1:
                                Long l15 = lVar7.f140876c;
                                return new b2(l15 != null ? l15.longValue() : -1L);
                            case 2:
                                return new b2(lVar7.f140879f);
                            case 3:
                                String str2 = lVar7.f140881h;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                return p0.n(str2);
                            case 4:
                                return p0.n(Boolean.valueOf(lVar7.f140882i));
                            default:
                                return new b2(lVar7.f140879f);
                        }
                    }
                };
                o0VarE.K(objQ15);
            }
            final p1 p1Var8 = (p1) d4.a.e(objArr8, (e23.a) objQ15, o0VarE, 0);
            Object[] objArr9 = new Object[0];
            boolean z54 = i19 == 4;
            Object objQ16 = o0VarE.q();
            if (z54 || objQ16 == p3.m.a.f135155b) {
                final int i27 = 4;
                objQ16 = new e23.a() { // from class: ht1.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i27) {
                            case 0:
                                return new a2(lVar7.f140878e);
                            case 1:
                                Long l15 = lVar7.f140876c;
                                return new b2(l15 != null ? l15.longValue() : -1L);
                            case 2:
                                return new b2(lVar7.f140879f);
                            case 3:
                                String str2 = lVar7.f140881h;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                return p0.n(str2);
                            case 4:
                                return p0.n(Boolean.valueOf(lVar7.f140882i));
                            default:
                                return new b2(lVar7.f140879f);
                        }
                    }
                };
                o0VarE.K(objQ16);
            }
            final p1 p1Var9 = (p1) d4.a.e(objArr9, (e23.a) objQ16, o0VarE, 0);
            if (((Boolean) p1Var9.getF182175a()).booleanValue()) {
                string = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 911477923, R.string.lbl_anonymous, o0VarE, false);
            } else {
                o0VarE.C(911545193);
                string = d53.w.i0(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName()).toString();
                if (string.length() == 0) {
                    string = gl1.y.Q(o0VarE, R.string.lbl_anonymous_user);
                }
                o0VarE.g0(false);
            }
            f12.l.f68084a.getClass();
            final String strZ4 = f12.l.a.a().z4("PREMIUM_FRIEND");
            boolean z55 = d53.w.J((CharSequence) p1Var8.getF182175a()) && ((String) p1Var7.getF182175a()).length() == 0 && sVarH2.isEmpty() && sVarH3.isEmpty() && cVar3.isEmpty();
            Object[] objArr10 = new Object[0];
            boolean z56 = i19 == 4;
            Object objQ17 = o0VarE.q();
            if (z56) {
                z14 = z55;
            } else {
                z14 = z55;
                if (objQ17 == p3.m.a.f135155b) {
                }
                o1Var = (o1) d4.a.e(objArr10, (e23.a) objQ17, o0VarE, 0);
                arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
                it = cVar3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().f140986a);
                }
                Object[] array3 = arrayList3.toArray(new String[0]);
                sVarH = gl1.y.H(Arrays.copyOf(array3, array3.length), o0VarE);
                if (o1Var4.j() == o1Var.j() || n1Var2.getIntValue() != lVar7.f140878e || (n1Var2.getIntValue() >= 1 && l14 == null)) {
                    sVar = sVarH;
                    z15 = true;
                } else {
                    Object f182175a = p1Var8.getF182175a();
                    String str2 = lVar7.f140881h;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (p005kotlin.jvm.internal.s.g(f182175a, str2)) {
                        us1.h.a aVar5 = us1.h.f172403e;
                        String str3 = (String) p1Var7.getF182175a();
                        aVar5.getClass();
                        if (us1.h.a.b(context3, str3) == lVar7.f140883j) {
                            ArrayList arrayList4 = new ArrayList();
                            ListIterator listIterator = sVarH2.listIterator();
                            while (true) {
                                f4.z zVar = (f4.z) listIterator;
                                if (!zVar.hasNext()) {
                                    break;
                                }
                                f4.s sVar7 = sVarH;
                                String str4 = (String) zVar.next();
                                us1.g.f172395c.getClass();
                                us1.g gVarA = us1.g.a.a(context3, str4);
                                if (gVarA != null) {
                                    arrayList4.add(gVarA);
                                }
                                sVarH = sVar7;
                            }
                            sVar = sVarH;
                            if (p005kotlin.jvm.internal.s.g(h0.g1(arrayList4), h0.g1(cVar2 != 0 ? cVar2 : j0.f134944a))) {
                                ArrayList arrayList5 = new ArrayList();
                                ListIterator listIterator2 = sVarH3.listIterator();
                                while (true) {
                                    f4.z zVar2 = (f4.z) listIterator2;
                                    if (!zVar2.hasNext()) {
                                        break;
                                    }
                                    String str5 = (String) zVar2.next();
                                    us1.i.f172411c.getClass();
                                    us1.i iVarB = us1.i.a.b(context3, str5);
                                    if (iVarB != null) {
                                        arrayList5.add(iVarB);
                                    }
                                }
                                if (p005kotlin.jvm.internal.s.g(h0.g1(arrayList5), h0.g1(cVar != null ? cVar : j0.f134944a))) {
                                    sVar.getClass();
                                    u3.c cVar4 = f4.t.d(sVar).f68716c;
                                    ArrayList arrayList6 = new ArrayList(p13.y.r(cVar3, 10));
                                    Iterator<pt1.u> it5 = cVar3.iterator();
                                    while (it5.hasNext()) {
                                        arrayList6.add(it5.next().f140986a);
                                    }
                                    if (p005kotlin.jvm.internal.s.g(cVar4, arrayList6) && ((Boolean) p1Var9.getF182175a()).booleanValue() == lVar7.f140882i) {
                                        z15 = false;
                                    }
                                }
                            }
                        } else {
                            sVar = sVarH;
                        }
                        z15 = true;
                    } else {
                        sVar = sVarH;
                        z15 = true;
                    }
                }
                aVar3 = h4.r.S;
                h4.r rVarF = x2.f(aVar3, 1.0f);
                long jC = am.j.c(d92.b.f58623a, o0VarE);
                m1.a aVar6 = m1.f128891a;
                h4.r rVarE = u1.n.e(rVarF, jC, aVar6);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                rVarY = c2.l.y(rVarE, eVar.f97920e);
                zB = o0VarE.B(p1Var4);
                objQ = o0VarE.q();
                if (zB || objQ == p3.m.a.f135155b) {
                    objQ = new gp.e(p1Var4, 23);
                    o0VarE.K(objQ);
                }
                c.w.a(0, 0, (e23.a) objQ, o0VarE, z15);
                h4.r rVarE2 = u1.n.e(aVar3, d92.b.a(o0VarE).c().b(), aVar6);
                zB2 = o0VarE.B(m3Var);
                objQ2 = o0VarE.q();
                if (zB2 || objQ2 == p3.m.a.f135155b) {
                    objQ2 = new au0.l(m3Var, 1);
                    o0VarE.K(objQ2);
                }
                h4.r rVarD = wz1.i.d(rVarE2, jVar, (e23.a) objQ2);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.getU());
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                String strP = gl1.y.P(R.string.review_trail_name, new Object[]{lVar7.f140877d}, o0VarE);
                c.f85540a.getClass();
                z3.e eVar2 = c.f85541b;
                boolean zH2 = o0VarE.h(z15) | o0VarE.B(p1Var4);
                r14 = i18 & 112;
                if (r14 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zH2 | z16;
                objQ3 = o0VarE.q();
                if (z17 || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new r(aVar, p1Var4, z15);
                    o0VarE.K(objQ3);
                }
                str = string;
                p1Var = p1Var7;
                sVar2 = sVar;
                d.b(strP, eVar2, rVarY, (e23.a) objQ3, o0VarE, 48);
                o0Var2 = o0VarE;
                h4.r rVarA = b0Var.a(aVar3, 1.0f, true);
                bVar.getClass();
                l2 l2VarE = c2.l.e(0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                bVar.getClass();
                c2.j.i iVarI = c2.j.i(eVar.f97918c);
                boolean zB4 = o0Var2.B(rVarY) | o0Var2.B(p1Var5);
                if (i19 != 4) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                boolean zB5 = zB4 | z18 | o0Var2.B(n1Var2) | o0Var2.B(p1Var8);
                if ((i18 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zB6 = zB5 | z19 | o0Var2.B(p1Var) | o0Var2.B(sVarH2);
                sVar3 = sVarH3;
                boolean zB7 = zB6 | o0Var2.B(sVar3);
                if ((i18 & 57344) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z57 = zB7 | z24;
                if ((i18 & 458752) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z58 = z57 | z25;
                if ((i18 & 3670016) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z59 = z58 | z26;
                z27 = z14;
                zH = z59 | o0Var2.h(z27) | o0Var2.B(str) | o0Var2.B(strZ4) | o0Var2.B(p1Var9);
                objQ4 = o0Var2.q();
                if (!zH || objQ4 == p3.m.a.f135155b) {
                    n1Var = n1Var2;
                    objQ4 = new e23.l() { // from class: ht1.t
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            e2.f0 f0Var = (e2.f0) obj;
                            f0Var.getClass();
                            final h4.r rVar = rVarY;
                            p1 p1Var10 = p1Var5;
                            pt1.l lVar8 = lVar;
                            e2.f0.b(f0Var, null, new z3.e(569293721, true, new gw1.e(rVar, 8, p1Var10, lVar8)), 3);
                            e2.f0.b(f0Var, null, new z3.e(662085506, true, new e11.c0(28, rVar, n1Var)), 3);
                            e2.f0.b(f0Var, null, new z3.e(1678305633, true, new fb0.b(rVar, lVar8, p1Var8, aVar2)), 3);
                            e2.f0.b(f0Var, null, new z3.e(-1600441536, true, new e11.c0(29, rVar, p1Var)), 3);
                            final int i28 = 0;
                            final f4.s sVar8 = sVarH2;
                            e2.f0.b(f0Var, null, new z3.e(-584221409, true, new e23.q() { // from class: ht1.n
                                /* JADX WARN: Code duplicated, block: B:17:0x0088  */
                                /* JADX WARN: Code duplicated, block: B:35:0x011a  */
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i29 = i28;
                                    p3.m.a aVar7 = p3.m.f135153a;
                                    f4.s sVar9 = sVar8;
                                    switch (i29) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var3 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_header);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_caption);
                                                mVar2.C(1203953197);
                                                w13.c cVar5 = us1.g.f172400h;
                                                ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                                                Iterator<T> it6 = cVar5.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList7.add(gl1.y.Q(mVar2, ((us1.g) it6.next()).f172402b));
                                                }
                                                mVar2.f();
                                                i53.c cVarE = i53.a.e(arrayList7);
                                                i53.c cVarE2 = i53.a.e(sVar9);
                                                boolean zB8 = mVar2.B(sVar9);
                                                Object objQ18 = mVar2.q();
                                                if (zB8) {
                                                    objQ18 = new et1.c(sVar9, 5);
                                                    mVar2.K(objQ18);
                                                } else {
                                                    aVar7.getClass();
                                                    if (objQ18 == p3.m.a.f135155b) {
                                                        objQ18 = new et1.c(sVar9, 5);
                                                        mVar2.K(objQ18);
                                                    }
                                                }
                                                w.f(rVar, strQ, strQ2, cVarE, cVarE2, (e23.l) objQ18, mVar2, 0);
                                                x1 x1Var4 = p3.n.f135158a;
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                String strQ3 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_header);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_caption);
                                                mVar3.C(-1461048436);
                                                w13.c cVar6 = us1.i.f172416h;
                                                ArrayList arrayList8 = new ArrayList(p13.y.r(cVar6, 10));
                                                Iterator<T> it7 = cVar6.iterator();
                                                while (it7.hasNext()) {
                                                    arrayList8.add(gl1.y.Q(mVar3, ((us1.i) it7.next()).f172418b));
                                                }
                                                mVar3.f();
                                                i53.c cVarE3 = i53.a.e(arrayList8);
                                                i53.c cVarE4 = i53.a.e(sVar9);
                                                boolean zB9 = mVar3.B(sVar9);
                                                Object objQ19 = mVar3.q();
                                                if (zB9) {
                                                    objQ19 = new et1.c(sVar9, 4);
                                                    mVar3.K(objQ19);
                                                } else {
                                                    aVar7.getClass();
                                                    if (objQ19 == p3.m.a.f135155b) {
                                                        objQ19 = new et1.c(sVar9, 4);
                                                        mVar3.K(objQ19);
                                                    }
                                                }
                                                w.f(rVar, strQ3, strQ4, cVarE3, cVarE4, (e23.l) objQ19, mVar3, 0);
                                                x1 x1Var6 = p3.n.f135158a;
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            final int i29 = 1;
                            final f4.s sVar9 = sVar3;
                            e2.f0.b(f0Var, null, new z3.e(431998718, true, new e23.q() { // from class: ht1.n
                                /* JADX WARN: Code duplicated, block: B:17:0x0088  */
                                /* JADX WARN: Code duplicated, block: B:35:0x011a  */
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i210 = i29;
                                    p3.m.a aVar7 = p3.m.f135153a;
                                    f4.s sVar10 = sVar9;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var3 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_header);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_caption);
                                                mVar2.C(1203953197);
                                                w13.c cVar5 = us1.g.f172400h;
                                                ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                                                Iterator<T> it6 = cVar5.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList7.add(gl1.y.Q(mVar2, ((us1.g) it6.next()).f172402b));
                                                }
                                                mVar2.f();
                                                i53.c cVarE = i53.a.e(arrayList7);
                                                i53.c cVarE2 = i53.a.e(sVar10);
                                                boolean zB8 = mVar2.B(sVar10);
                                                Object objQ18 = mVar2.q();
                                                if (zB8) {
                                                    objQ18 = new et1.c(sVar10, 5);
                                                    mVar2.K(objQ18);
                                                } else {
                                                    aVar7.getClass();
                                                    if (objQ18 == p3.m.a.f135155b) {
                                                        objQ18 = new et1.c(sVar10, 5);
                                                        mVar2.K(objQ18);
                                                    }
                                                }
                                                w.f(rVar, strQ, strQ2, cVarE, cVarE2, (e23.l) objQ18, mVar2, 0);
                                                x1 x1Var4 = p3.n.f135158a;
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                String strQ3 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_header);
                                                String strQ4 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_caption);
                                                mVar3.C(-1461048436);
                                                w13.c cVar6 = us1.i.f172416h;
                                                ArrayList arrayList8 = new ArrayList(p13.y.r(cVar6, 10));
                                                Iterator<T> it7 = cVar6.iterator();
                                                while (it7.hasNext()) {
                                                    arrayList8.add(gl1.y.Q(mVar3, ((us1.i) it7.next()).f172418b));
                                                }
                                                mVar3.f();
                                                i53.c cVarE3 = i53.a.e(arrayList8);
                                                i53.c cVarE4 = i53.a.e(sVar10);
                                                boolean zB9 = mVar3.B(sVar10);
                                                Object objQ19 = mVar3.q();
                                                if (zB9) {
                                                    objQ19 = new et1.c(sVar10, 4);
                                                    mVar3.K(objQ19);
                                                } else {
                                                    aVar7.getClass();
                                                    if (objQ19 == p3.m.a.f135155b) {
                                                        objQ19 = new et1.c(sVar10, 4);
                                                        mVar3.K(objQ19);
                                                    }
                                                }
                                                w.f(rVar, strQ3, strQ4, cVarE3, cVarE4, (e23.l) objQ19, mVar3, 0);
                                                x1 x1Var6 = p3.n.f135158a;
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            e2.f0.b(f0Var, null, new z3.e(1448218845, true, new ak0.j(rVar, lVar8, lVar4, pVar, lVar5, 28)), 3);
                            if (!z27) {
                                e2.f0.b(f0Var, null, new z3.e(1607375070, true, new fb0.b(rVar, str, strZ4, p1Var9, 9)), 3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p1Var2 = p1Var5;
                    p1Var8 = p1Var8;
                    p1Var = p1Var;
                    sVar4 = sVarH2;
                    sVar3 = sVar3;
                    p1Var3 = p1Var9;
                    o0Var2 = o0Var2;
                    o0Var2.K(objQ4);
                } else {
                    p1Var2 = p1Var5;
                    p1Var3 = p1Var9;
                    n1Var = n1Var2;
                    sVar4 = sVarH2;
                }
                o0Var3 = o0Var2;
                e2.c.b(rVarA, null, l2VarE, iVarI, null, null, false, null, (e23.l) objQ4, o0Var3, 0, 490);
                l72.f0 f0Var = l72.f0.f110999a;
                if (l14 != 0) {
                    z28 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -993865815, R.string.update_review, o0Var3, false);
                } else {
                    z28 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -993784843, R.string.trail_detail_submit_review_button, o0Var3, false);
                }
                String str6 = strJ;
                h4.r rVarF2 = x2.f(aVar3, 1.0f);
                bVar.getClass();
                h4.r rVarY2 = c2.l.y(rVarF2, eVar.f97920e);
                if (n1Var.getIntValue() != 0) {
                    z29 = true;
                } else {
                    z29 = z28;
                }
                if (i19 != 4) {
                    z34 = z28;
                } else {
                    z34 = true;
                }
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z28;
                }
                boolean zB8 = z34 | z35 | o0Var3.B(n1Var) | o0Var3.B(o1Var4) | o0Var3.B(p1Var8) | o0Var3.B(p1Var3) | o0Var3.r(context3) | o0Var3.B(p1Var) | o0Var3.B(sVar4) | o0Var3.B(sVar3);
                if ((i18 & 896) == 256) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z36 | zB8;
                objQ5 = o0Var3.q();
                if (!z37 || objQ5 == p3.m.a.f135155b) {
                    f4.s sVar8 = sVar3;
                    n1 n1Var3 = n1Var;
                    p1 p1Var10 = p1Var3;
                    p1 p1Var11 = p1Var8;
                    p1 p1Var12 = p1Var;
                    com.google.maps.android.compose.h hVar = new com.google.maps.android.compose.h(lVar, lVar3, o1Var4, p1Var11, p1Var10, context3, sVar4, sVar8, lVar2, n1Var3, p1Var12);
                    o1Var2 = o1Var4;
                    p1Var8 = p1Var11;
                    p1Var3 = p1Var10;
                    context = context3;
                    sVar3 = sVar8;
                    n1Var = n1Var3;
                    p1Var = p1Var12;
                    o0Var3.K(hVar);
                    objQ5 = hVar;
                } else {
                    context = context3;
                    o1Var2 = o1Var4;
                }
                f0Var.d(0, 1, (e23.a) objQ5, rVarY2, str6, o0Var3, null, z29);
                o0Var3.g0(true);
                if (l14 != 0) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                boolean zB9 = o0Var3.B(n1Var) | o0Var3.B(p1Var8) | o0Var3.B(p1Var) | o0Var3.B(sVar4) | o0Var3.B(sVar3) | o0Var3.B(p1Var3) | o0Var3.B(sVar2);
                if (r14 == 32) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                z44 = zB9 | z39;
                Object objQ18 = o0Var3.q();
                if (!z44 || objQ18 == p3.m.a.f135155b) {
                    f4.s sVar9 = sVar4;
                    n1 n1Var4 = n1Var;
                    p1 p1Var13 = p1Var;
                    p1 p1Var14 = p1Var8;
                    f4.s sVar10 = sVar3;
                    dVar = new av0.d(p1Var14, sVar9, sVar10, p1Var3, sVar2, aVar, n1Var4, p1Var13);
                    sVar4 = sVar9;
                    sVar5 = sVar2;
                    n1Var = n1Var4;
                    sVar3 = sVar10;
                    p1Var8 = p1Var14;
                    p1Var = p1Var13;
                    o0Var3.K(dVar);
                } else {
                    dVar = objQ18;
                    sVar5 = sVar2;
                }
                c(p1Var4, z38, (e23.a) dVar, o0Var3, r24);
                sVar6 = sVar5;
                o0Var = o0Var3;
                context2 = context;
                a(p1Var2, lVar.f140879f, o1Var2, lVar6, o0Var, (i18 >> 12) & 7168);
                zf.b.e(p1Var6, o0Var, 0);
                if (i19 != 4) {
                    z45 = false;
                } else {
                    z45 = true;
                }
                zB3 = o0Var.B(o1Var3) | z45 | o0Var.B(n1Var) | o0Var.B(p1Var8) | o0Var.B(p1Var) | o0Var.r(context2) | o0Var.B(sVar4) | o0Var.B(sVar3) | o0Var.B(p1Var3) | o0Var.B(sVar6) | o0Var.B(p1Var6);
                objQ6 = o0Var.q();
                if (!zB3 || objQ6 == p3.m.a.f135155b) {
                    p1 p1Var15 = p1Var;
                    lVar7 = lVar;
                    a aVar7 = new a(lVar7, o1Var3, p1Var8, context2, sVar4, sVar3, p1Var3, sVar6, p1Var6, n1Var, p1Var15, null);
                    o0Var.K(aVar7);
                    objQ6 = aVar7;
                } else {
                    lVar7 = lVar;
                }
                l0.e((e23.p) objQ6, lVar7, o0Var);
            }
            final int i28 = 5;
            objQ17 = new e23.a() { // from class: ht1.l
                @Override // e23.a
                public final Object invoke() {
                    switch (i28) {
                        case 0:
                            return new a2(lVar7.f140878e);
                        case 1:
                            Long l15 = lVar7.f140876c;
                            return new b2(l15 != null ? l15.longValue() : -1L);
                        case 2:
                            return new b2(lVar7.f140879f);
                        case 3:
                            String str7 = lVar7.f140881h;
                            if (str7 == null) {
                                str7 = "";
                            }
                            return p0.n(str7);
                        case 4:
                            return p0.n(Boolean.valueOf(lVar7.f140882i));
                        default:
                            return new b2(lVar7.f140879f);
                    }
                }
            };
            o0VarE.K(objQ17);
            o1Var = (o1) d4.a.e(objArr10, (e23.a) objQ17, o0VarE, 0);
            arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
            it = cVar3.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().f140986a);
            }
            Object[] array4 = arrayList3.toArray(new String[0]);
            sVarH = gl1.y.H(Arrays.copyOf(array4, array4.length), o0VarE);
            if (o1Var4.j() == o1Var.j()) {
                sVar = sVarH;
                z15 = true;
            } else {
                sVar = sVarH;
                z15 = true;
            }
            aVar3 = h4.r.S;
            h4.r rVarF3 = x2.f(aVar3, 1.0f);
            long jC2 = am.j.c(d92.b.f58623a, o0VarE);
            m1.a aVar8 = m1.f128891a;
            h4.r rVarE3 = u1.n.e(rVarF3, jC2, aVar8);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            rVarY = c2.l.y(rVarE3, eVar.f97920e);
            zB = o0VarE.B(p1Var4);
            objQ = o0VarE.q();
            if (zB) {
                objQ = new gp.e(p1Var4, 23);
                o0VarE.K(objQ);
            } else {
                objQ = new gp.e(p1Var4, 23);
                o0VarE.K(objQ);
            }
            c.w.a(0, 0, (e23.a) objQ, o0VarE, z15);
            h4.r rVarE4 = u1.n.e(aVar3, d92.b.a(o0VarE).c().b(), aVar8);
            zB2 = o0VarE.B(m3Var);
            objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new au0.l(m3Var, 1);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new au0.l(m3Var, 1);
                o0VarE.K(objQ2);
            }
            h4.r rVarD2 = wz1.i.d(rVarE4, jVar, (e23.a) objQ2);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var3 = p3.n.f135158a;
            iHashCode = Long.hashCode(o0VarE.getU());
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD2, o0VarE);
            h5.g.V.getClass();
            aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            String strP2 = gl1.y.P(R.string.review_trail_name, new Object[]{lVar7.f140877d}, o0VarE);
            c.f85540a.getClass();
            z3.e eVar3 = c.f85541b;
            boolean zH3 = o0VarE.h(z15) | o0VarE.B(p1Var4);
            r14 = i18 & 112;
            if (r14 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zH3 | z16;
            objQ3 = o0VarE.q();
            if (z17) {
                objQ3 = new r(aVar, p1Var4, z15);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new r(aVar, p1Var4, z15);
                o0VarE.K(objQ3);
            }
            str = string;
            p1Var = p1Var7;
            sVar2 = sVar;
            d.b(strP2, eVar3, rVarY, (e23.a) objQ3, o0VarE, 48);
            o0Var2 = o0VarE;
            h4.r rVarA2 = b0Var2.a(aVar3, 1.0f, true);
            bVar.getClass();
            l2 l2VarE2 = c2.l.e(0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            bVar.getClass();
            c2.j.i iVarI2 = c2.j.i(eVar.f97918c);
            boolean zB10 = o0Var2.B(rVarY) | o0Var2.B(p1Var5);
            if (i19 != 4) {
                z18 = false;
            } else {
                z18 = true;
            }
            boolean zB11 = zB10 | z18 | o0Var2.B(n1Var2) | o0Var2.B(p1Var8);
            if ((i18 & 234881024) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean zB12 = zB11 | z19 | o0Var2.B(p1Var) | o0Var2.B(sVarH2);
            sVar3 = sVarH3;
            boolean zB13 = zB12 | o0Var2.B(sVar3);
            if ((i18 & 57344) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z510 = zB13 | z24;
            if ((i18 & 458752) == 131072) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z511 = z510 | z25;
            if ((i18 & 3670016) == 1048576) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z512 = z511 | z26;
            z27 = z14;
            zH = z512 | o0Var2.h(z27) | o0Var2.B(str) | o0Var2.B(strZ4) | o0Var2.B(p1Var9);
            objQ4 = o0Var2.q();
            if (zH) {
                n1Var = n1Var2;
                objQ4 = new e23.l() { // from class: ht1.t
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        e2.f0 f0Var2 = (e2.f0) obj;
                        f0Var2.getClass();
                        final h4.r rVar = rVarY;
                        p1 p1Var16 = p1Var5;
                        pt1.l lVar8 = lVar;
                        e2.f0.b(f0Var2, null, new z3.e(569293721, true, new gw1.e(rVar, 8, p1Var16, lVar8)), 3);
                        e2.f0.b(f0Var2, null, new z3.e(662085506, true, new e11.c0(28, rVar, n1Var)), 3);
                        e2.f0.b(f0Var2, null, new z3.e(1678305633, true, new fb0.b(rVar, lVar8, p1Var8, aVar2)), 3);
                        e2.f0.b(f0Var2, null, new z3.e(-1600441536, true, new e11.c0(29, rVar, p1Var)), 3);
                        final int i29 = 0;
                        final f4.s sVar11 = sVarH2;
                        e2.f0.b(f0Var2, null, new z3.e(-584221409, true, new e23.q() { // from class: ht1.n
                            /* JADX WARN: Code duplicated, block: B:17:0x0088  */
                            /* JADX WARN: Code duplicated, block: B:35:0x011a  */
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i210 = i29;
                                p3.m.a aVar9 = p3.m.f135153a;
                                f4.s sVar12 = sVar11;
                                switch (i210) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            String strQ = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_header);
                                            String strQ2 = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_caption);
                                            mVar2.C(1203953197);
                                            w13.c cVar5 = us1.g.f172400h;
                                            ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                                            Iterator<T> it6 = cVar5.iterator();
                                            while (it6.hasNext()) {
                                                arrayList7.add(gl1.y.Q(mVar2, ((us1.g) it6.next()).f172402b));
                                            }
                                            mVar2.f();
                                            i53.c cVarE = i53.a.e(arrayList7);
                                            i53.c cVarE2 = i53.a.e(sVar12);
                                            boolean zB14 = mVar2.B(sVar12);
                                            Object objQ19 = mVar2.q();
                                            if (zB14) {
                                                objQ19 = new et1.c(sVar12, 5);
                                                mVar2.K(objQ19);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ19 == p3.m.a.f135155b) {
                                                    objQ19 = new et1.c(sVar12, 5);
                                                    mVar2.K(objQ19);
                                                }
                                            }
                                            w.f(rVar, strQ, strQ2, cVarE, cVarE2, (e23.l) objQ19, mVar2, 0);
                                            x1 x1Var5 = p3.n.f135158a;
                                        } else {
                                            mVar2.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar3 = (p3.m) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            String strQ3 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_header);
                                            String strQ4 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_caption);
                                            mVar3.C(-1461048436);
                                            w13.c cVar6 = us1.i.f172416h;
                                            ArrayList arrayList8 = new ArrayList(p13.y.r(cVar6, 10));
                                            Iterator<T> it7 = cVar6.iterator();
                                            while (it7.hasNext()) {
                                                arrayList8.add(gl1.y.Q(mVar3, ((us1.i) it7.next()).f172418b));
                                            }
                                            mVar3.f();
                                            i53.c cVarE3 = i53.a.e(arrayList8);
                                            i53.c cVarE4 = i53.a.e(sVar12);
                                            boolean zB15 = mVar3.B(sVar12);
                                            Object objQ110 = mVar3.q();
                                            if (zB15) {
                                                objQ110 = new et1.c(sVar12, 4);
                                                mVar3.K(objQ110);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ110 == p3.m.a.f135155b) {
                                                    objQ110 = new et1.c(sVar12, 4);
                                                    mVar3.K(objQ110);
                                                }
                                            }
                                            w.f(rVar, strQ3, strQ4, cVarE3, cVarE4, (e23.l) objQ110, mVar3, 0);
                                            x1 x1Var7 = p3.n.f135158a;
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }), 3);
                        final int i210 = 1;
                        final f4.s sVar12 = sVar3;
                        e2.f0.b(f0Var2, null, new z3.e(431998718, true, new e23.q() { // from class: ht1.n
                            /* JADX WARN: Code duplicated, block: B:17:0x0088  */
                            /* JADX WARN: Code duplicated, block: B:35:0x011a  */
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i211 = i210;
                                p3.m.a aVar9 = p3.m.f135153a;
                                f4.s sVar13 = sVar12;
                                switch (i211) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            String strQ = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_header);
                                            String strQ2 = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_caption);
                                            mVar2.C(1203953197);
                                            w13.c cVar5 = us1.g.f172400h;
                                            ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                                            Iterator<T> it6 = cVar5.iterator();
                                            while (it6.hasNext()) {
                                                arrayList7.add(gl1.y.Q(mVar2, ((us1.g) it6.next()).f172402b));
                                            }
                                            mVar2.f();
                                            i53.c cVarE = i53.a.e(arrayList7);
                                            i53.c cVarE2 = i53.a.e(sVar13);
                                            boolean zB14 = mVar2.B(sVar13);
                                            Object objQ19 = mVar2.q();
                                            if (zB14) {
                                                objQ19 = new et1.c(sVar13, 5);
                                                mVar2.K(objQ19);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ19 == p3.m.a.f135155b) {
                                                    objQ19 = new et1.c(sVar13, 5);
                                                    mVar2.K(objQ19);
                                                }
                                            }
                                            w.f(rVar, strQ, strQ2, cVarE, cVarE2, (e23.l) objQ19, mVar2, 0);
                                            x1 x1Var5 = p3.n.f135158a;
                                        } else {
                                            mVar2.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar3 = (p3.m) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            String strQ3 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_header);
                                            String strQ4 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_caption);
                                            mVar3.C(-1461048436);
                                            w13.c cVar6 = us1.i.f172416h;
                                            ArrayList arrayList8 = new ArrayList(p13.y.r(cVar6, 10));
                                            Iterator<T> it7 = cVar6.iterator();
                                            while (it7.hasNext()) {
                                                arrayList8.add(gl1.y.Q(mVar3, ((us1.i) it7.next()).f172418b));
                                            }
                                            mVar3.f();
                                            i53.c cVarE3 = i53.a.e(arrayList8);
                                            i53.c cVarE4 = i53.a.e(sVar13);
                                            boolean zB15 = mVar3.B(sVar13);
                                            Object objQ110 = mVar3.q();
                                            if (zB15) {
                                                objQ110 = new et1.c(sVar13, 4);
                                                mVar3.K(objQ110);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ110 == p3.m.a.f135155b) {
                                                    objQ110 = new et1.c(sVar13, 4);
                                                    mVar3.K(objQ110);
                                                }
                                            }
                                            w.f(rVar, strQ3, strQ4, cVarE3, cVarE4, (e23.l) objQ110, mVar3, 0);
                                            x1 x1Var7 = p3.n.f135158a;
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }), 3);
                        e2.f0.b(f0Var2, null, new z3.e(1448218845, true, new ak0.j(rVar, lVar8, lVar4, pVar, lVar5, 28)), 3);
                        if (!z27) {
                            e2.f0.b(f0Var2, null, new z3.e(1607375070, true, new fb0.b(rVar, str, strZ4, p1Var9, 9)), 3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                p1Var2 = p1Var5;
                p1Var8 = p1Var8;
                p1Var = p1Var;
                sVar4 = sVarH2;
                sVar3 = sVar3;
                p1Var3 = p1Var9;
                o0Var2 = o0Var2;
                o0Var2.K(objQ4);
            } else {
                n1Var = n1Var2;
                objQ4 = new e23.l() { // from class: ht1.t
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        e2.f0 f0Var2 = (e2.f0) obj;
                        f0Var2.getClass();
                        final h4.r rVar = rVarY;
                        p1 p1Var16 = p1Var5;
                        pt1.l lVar8 = lVar;
                        e2.f0.b(f0Var2, null, new z3.e(569293721, true, new gw1.e(rVar, 8, p1Var16, lVar8)), 3);
                        e2.f0.b(f0Var2, null, new z3.e(662085506, true, new e11.c0(28, rVar, n1Var)), 3);
                        e2.f0.b(f0Var2, null, new z3.e(1678305633, true, new fb0.b(rVar, lVar8, p1Var8, aVar2)), 3);
                        e2.f0.b(f0Var2, null, new z3.e(-1600441536, true, new e11.c0(29, rVar, p1Var)), 3);
                        final int i29 = 0;
                        final f4.s sVar11 = sVarH2;
                        e2.f0.b(f0Var2, null, new z3.e(-584221409, true, new e23.q() { // from class: ht1.n
                            /* JADX WARN: Code duplicated, block: B:17:0x0088  */
                            /* JADX WARN: Code duplicated, block: B:35:0x011a  */
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i211 = i29;
                                p3.m.a aVar9 = p3.m.f135153a;
                                f4.s sVar13 = sVar11;
                                switch (i211) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            String strQ = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_header);
                                            String strQ2 = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_caption);
                                            mVar2.C(1203953197);
                                            w13.c cVar5 = us1.g.f172400h;
                                            ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                                            Iterator<T> it6 = cVar5.iterator();
                                            while (it6.hasNext()) {
                                                arrayList7.add(gl1.y.Q(mVar2, ((us1.g) it6.next()).f172402b));
                                            }
                                            mVar2.f();
                                            i53.c cVarE = i53.a.e(arrayList7);
                                            i53.c cVarE2 = i53.a.e(sVar13);
                                            boolean zB14 = mVar2.B(sVar13);
                                            Object objQ19 = mVar2.q();
                                            if (zB14) {
                                                objQ19 = new et1.c(sVar13, 5);
                                                mVar2.K(objQ19);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ19 == p3.m.a.f135155b) {
                                                    objQ19 = new et1.c(sVar13, 5);
                                                    mVar2.K(objQ19);
                                                }
                                            }
                                            w.f(rVar, strQ, strQ2, cVarE, cVarE2, (e23.l) objQ19, mVar2, 0);
                                            x1 x1Var5 = p3.n.f135158a;
                                        } else {
                                            mVar2.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar3 = (p3.m) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            String strQ3 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_header);
                                            String strQ4 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_caption);
                                            mVar3.C(-1461048436);
                                            w13.c cVar6 = us1.i.f172416h;
                                            ArrayList arrayList8 = new ArrayList(p13.y.r(cVar6, 10));
                                            Iterator<T> it7 = cVar6.iterator();
                                            while (it7.hasNext()) {
                                                arrayList8.add(gl1.y.Q(mVar3, ((us1.i) it7.next()).f172418b));
                                            }
                                            mVar3.f();
                                            i53.c cVarE3 = i53.a.e(arrayList8);
                                            i53.c cVarE4 = i53.a.e(sVar13);
                                            boolean zB15 = mVar3.B(sVar13);
                                            Object objQ110 = mVar3.q();
                                            if (zB15) {
                                                objQ110 = new et1.c(sVar13, 4);
                                                mVar3.K(objQ110);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ110 == p3.m.a.f135155b) {
                                                    objQ110 = new et1.c(sVar13, 4);
                                                    mVar3.K(objQ110);
                                                }
                                            }
                                            w.f(rVar, strQ3, strQ4, cVarE3, cVarE4, (e23.l) objQ110, mVar3, 0);
                                            x1 x1Var7 = p3.n.f135158a;
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }), 3);
                        final int i210 = 1;
                        final f4.s sVar12 = sVar3;
                        e2.f0.b(f0Var2, null, new z3.e(431998718, true, new e23.q() { // from class: ht1.n
                            /* JADX WARN: Code duplicated, block: B:17:0x0088  */
                            /* JADX WARN: Code duplicated, block: B:35:0x011a  */
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i211 = i210;
                                p3.m.a aVar9 = p3.m.f135153a;
                                f4.s sVar13 = sVar12;
                                switch (i211) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            String strQ = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_header);
                                            String strQ2 = gl1.y.Q(mVar2, R.string.trails_submit_review_conditions_caption);
                                            mVar2.C(1203953197);
                                            w13.c cVar5 = us1.g.f172400h;
                                            ArrayList arrayList7 = new ArrayList(p13.y.r(cVar5, 10));
                                            Iterator<T> it6 = cVar5.iterator();
                                            while (it6.hasNext()) {
                                                arrayList7.add(gl1.y.Q(mVar2, ((us1.g) it6.next()).f172402b));
                                            }
                                            mVar2.f();
                                            i53.c cVarE = i53.a.e(arrayList7);
                                            i53.c cVarE2 = i53.a.e(sVar13);
                                            boolean zB14 = mVar2.B(sVar13);
                                            Object objQ19 = mVar2.q();
                                            if (zB14) {
                                                objQ19 = new et1.c(sVar13, 5);
                                                mVar2.K(objQ19);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ19 == p3.m.a.f135155b) {
                                                    objQ19 = new et1.c(sVar13, 5);
                                                    mVar2.K(objQ19);
                                                }
                                            }
                                            w.f(rVar, strQ, strQ2, cVarE, cVarE2, (e23.l) objQ19, mVar2, 0);
                                            x1 x1Var5 = p3.n.f135158a;
                                        } else {
                                            mVar2.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar3 = (p3.m) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            String strQ3 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_header);
                                            String strQ4 = gl1.y.Q(mVar3, R.string.trails_submit_review_features_caption);
                                            mVar3.C(-1461048436);
                                            w13.c cVar6 = us1.i.f172416h;
                                            ArrayList arrayList8 = new ArrayList(p13.y.r(cVar6, 10));
                                            Iterator<T> it7 = cVar6.iterator();
                                            while (it7.hasNext()) {
                                                arrayList8.add(gl1.y.Q(mVar3, ((us1.i) it7.next()).f172418b));
                                            }
                                            mVar3.f();
                                            i53.c cVarE3 = i53.a.e(arrayList8);
                                            i53.c cVarE4 = i53.a.e(sVar13);
                                            boolean zB15 = mVar3.B(sVar13);
                                            Object objQ110 = mVar3.q();
                                            if (zB15) {
                                                objQ110 = new et1.c(sVar13, 4);
                                                mVar3.K(objQ110);
                                            } else {
                                                aVar9.getClass();
                                                if (objQ110 == p3.m.a.f135155b) {
                                                    objQ110 = new et1.c(sVar13, 4);
                                                    mVar3.K(objQ110);
                                                }
                                            }
                                            w.f(rVar, strQ3, strQ4, cVarE3, cVarE4, (e23.l) objQ110, mVar3, 0);
                                            x1 x1Var7 = p3.n.f135158a;
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }), 3);
                        e2.f0.b(f0Var2, null, new z3.e(1448218845, true, new ak0.j(rVar, lVar8, lVar4, pVar, lVar5, 28)), 3);
                        if (!z27) {
                            e2.f0.b(f0Var2, null, new z3.e(1607375070, true, new fb0.b(rVar, str, strZ4, p1Var9, 9)), 3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                p1Var2 = p1Var5;
                p1Var8 = p1Var8;
                p1Var = p1Var;
                sVar4 = sVarH2;
                sVar3 = sVar3;
                p1Var3 = p1Var9;
                o0Var2 = o0Var2;
                o0Var2.K(objQ4);
            }
            o0Var3 = o0Var2;
            e2.c.b(rVarA2, null, l2VarE2, iVarI2, null, null, false, null, (e23.l) objQ4, o0Var3, 0, 490);
            l72.f0 f0Var2 = l72.f0.f110999a;
            if (l14 != 0) {
                z28 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -993865815, R.string.update_review, o0Var3, false);
            } else {
                z28 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -993784843, R.string.trail_detail_submit_review_button, o0Var3, false);
            }
            String str7 = strJ;
            h4.r rVarF4 = x2.f(aVar3, 1.0f);
            bVar.getClass();
            h4.r rVarY3 = c2.l.y(rVarF4, eVar.f97920e);
            if (n1Var.getIntValue() != 0) {
                z29 = true;
            } else {
                z29 = z28;
            }
            if (i19 != 4) {
                z34 = z28;
            } else {
                z34 = true;
            }
            if ((i18 & 7168) == 2048) {
                z35 = true;
            } else {
                z35 = z28;
            }
            boolean zB14 = z34 | z35 | o0Var3.B(n1Var) | o0Var3.B(o1Var4) | o0Var3.B(p1Var8) | o0Var3.B(p1Var3) | o0Var3.r(context3) | o0Var3.B(p1Var) | o0Var3.B(sVar4) | o0Var3.B(sVar3);
            if ((i18 & 896) == 256) {
                z36 = true;
            } else {
                z36 = false;
            }
            z37 = z36 | zB14;
            objQ5 = o0Var3.q();
            if (z37) {
                f4.s sVar11 = sVar3;
                n1 n1Var5 = n1Var;
                p1 p1Var16 = p1Var3;
                p1 p1Var17 = p1Var8;
                p1 p1Var18 = p1Var;
                com.google.maps.android.compose.h hVar2 = new com.google.maps.android.compose.h(lVar, lVar3, o1Var4, p1Var17, p1Var16, context3, sVar4, sVar11, lVar2, n1Var5, p1Var18);
                o1Var2 = o1Var4;
                p1Var8 = p1Var17;
                p1Var3 = p1Var16;
                context = context3;
                sVar3 = sVar11;
                n1Var = n1Var5;
                p1Var = p1Var18;
                o0Var3.K(hVar2);
                objQ5 = hVar2;
            } else {
                f4.s sVar12 = sVar3;
                n1 n1Var6 = n1Var;
                p1 p1Var19 = p1Var3;
                p1 p1Var110 = p1Var8;
                p1 p1Var111 = p1Var;
                com.google.maps.android.compose.h hVar3 = new com.google.maps.android.compose.h(lVar, lVar3, o1Var4, p1Var110, p1Var19, context3, sVar4, sVar12, lVar2, n1Var6, p1Var111);
                o1Var2 = o1Var4;
                p1Var8 = p1Var110;
                p1Var3 = p1Var19;
                context = context3;
                sVar3 = sVar12;
                n1Var = n1Var6;
                p1Var = p1Var111;
                o0Var3.K(hVar3);
                objQ5 = hVar3;
            }
            f0Var2.d(0, 1, (e23.a) objQ5, rVarY3, str7, o0Var3, null, z29);
            o0Var3.g0(true);
            if (l14 != 0) {
                z38 = true;
            } else {
                z38 = false;
            }
            boolean zB15 = o0Var3.B(n1Var) | o0Var3.B(p1Var8) | o0Var3.B(p1Var) | o0Var3.B(sVar4) | o0Var3.B(sVar3) | o0Var3.B(p1Var3) | o0Var3.B(sVar2);
            if (r14 == 32) {
                z39 = true;
            } else {
                z39 = false;
            }
            z44 = zB15 | z39;
            Object objQ19 = o0Var3.q();
            if (z44) {
                f4.s sVar13 = sVar4;
                n1 n1Var7 = n1Var;
                p1 p1Var112 = p1Var;
                p1 p1Var113 = p1Var8;
                f4.s sVar14 = sVar3;
                dVar = new av0.d(p1Var113, sVar13, sVar14, p1Var3, sVar2, aVar, n1Var7, p1Var112);
                sVar4 = sVar13;
                sVar5 = sVar2;
                n1Var = n1Var7;
                sVar3 = sVar14;
                p1Var8 = p1Var113;
                p1Var = p1Var112;
                o0Var3.K(dVar);
            } else {
                f4.s sVar15 = sVar4;
                n1 n1Var8 = n1Var;
                p1 p1Var114 = p1Var;
                p1 p1Var115 = p1Var8;
                f4.s sVar16 = sVar3;
                dVar = new av0.d(p1Var115, sVar15, sVar16, p1Var3, sVar2, aVar, n1Var8, p1Var114);
                sVar4 = sVar15;
                sVar5 = sVar2;
                n1Var = n1Var8;
                sVar3 = sVar16;
                p1Var8 = p1Var115;
                p1Var = p1Var114;
                o0Var3.K(dVar);
            }
            c(p1Var4, z38, (e23.a) dVar, o0Var3, r24);
            sVar6 = sVar5;
            o0Var = o0Var3;
            context2 = context;
            a(p1Var2, lVar.f140879f, o1Var2, lVar6, o0Var, (i18 >> 12) & 7168);
            zf.b.e(p1Var6, o0Var, 0);
            if (i19 != 4) {
                z45 = false;
            } else {
                z45 = true;
            }
            zB3 = o0Var.B(o1Var3) | z45 | o0Var.B(n1Var) | o0Var.B(p1Var8) | o0Var.B(p1Var) | o0Var.r(context2) | o0Var.B(sVar4) | o0Var.B(sVar3) | o0Var.B(p1Var3) | o0Var.B(sVar6) | o0Var.B(p1Var6);
            objQ6 = o0Var.q();
            if (zB3) {
                p1 p1Var116 = p1Var;
                lVar7 = lVar;
                a aVar9 = new a(lVar7, o1Var3, p1Var8, context2, sVar4, sVar3, p1Var3, sVar6, p1Var6, n1Var, p1Var116, null);
                o0Var.K(aVar9);
                objQ6 = aVar9;
            } else {
                p1 p1Var117 = p1Var;
                lVar7 = lVar;
                a aVar10 = new a(lVar7, o1Var3, p1Var8, context2, sVar4, sVar3, p1Var3, sVar6, p1Var6, n1Var, p1Var117, null);
                o0Var.K(aVar10);
                objQ6 = aVar10;
            }
            l0.e((e23.p) objQ6, lVar7, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(lVar7, aVar, lVar2, lVar3, lVar4, pVar, lVar5, lVar6, aVar2, i14);
        }
    }

    public static final void e(h4.r rVar, boolean z14, p1 p1Var, e23.a aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(375883468);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(p1Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.trails_submit_review_detail_header);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97936m, o0VarE)), o0VarE, 0, 0, 131070);
            String strQ2 = gl1.y.Q(o0VarE, R.string.trails_submit_review_detail_caption);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            h4.r.a aVar3 = h4.r.S;
            o0VarE = o0VarE;
            gt1.d.a(x2.f(aVar3, 1.0f), z14, p1Var, null, 0, false, o0VarE, (i15 & 112) | 1572870 | (i15 & 896), 56);
            if (z14) {
                o0VarE.C(-825833714);
                j(((i15 >> 6) & 112) | 6, aVar, x2.f(aVar3, 1.0f), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-825681876);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(rVar, z14, p1Var, aVar, i14, 18);
        }
    }

    public static final void f(h4.r rVar, String str, String str2, i53.c cVar, i53.c cVar2, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(8055783);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(cVar) ? 2048 : 1024) | (o0VarE.B(cVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97936m, o0VarE)), o0VarE, (i15 >> 3) & 14, 0, 131070);
            fVar.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131070);
            o0VarE = o0VarE;
            bVar.getClass();
            t0.a(null, c2.j.i(eVar.f97918c), null, null, 0, 0, z3.f.c(-1250704852, new gw1.e(cVar, 9, cVar2, lVar), o0VarE), o0VarE, 1572864, 61);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(rVar, str, str2, cVar, cVar2, lVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x026c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void g(h4.r rVar, i53.c cVar, e23.l lVar, e23.p pVar, e23.l lVar2, p3.m mVar, int i14) {
        ?? r14;
        float f14;
        float f15;
        ?? r15;
        o0 o0Var;
        boolean z14;
        o0 o0VarE = mVar.E(77225962);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f16 = eVar.f97918c;
            float f17 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f16);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            String strQ = gl1.y.Q(o0VarE, R.string.title_photos);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97936m, o0VarE)), o0VarE, 0, 0, 131070);
            String strQ2 = gl1.y.Q(o0VarE, R.string.trails_submit_review_photos_info);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            o0 o0Var2 = o0VarE;
            int size = cVar.size();
            p3.m.a aVar2 = p3.m.f135153a;
            if (size > 0) {
                o0Var2.C(-177470336);
                f2.p0 p0VarA = r0.a(0, o0Var2, 3);
                boolean z15 = (i15 & 7168) == 2048;
                Object objQ = o0Var2.q();
                if (z15) {
                    objQ = new a3.d(pVar, 17);
                    o0Var2.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a3.d(pVar, 17);
                        o0Var2.K(objQ);
                    }
                }
                k02.d dVarV = g8.i.V(p0VarA, (e23.p) objQ, o0Var2);
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarJ = x2.j(h4.r.S, 0.0f, 1000, 1);
                rVarJ.getClass();
                dVarV.getClass();
                h4.r rVarB = s0.b(rVarJ, dVarV, new k02.f(dVarV));
                f2.b.C1415b c1415b = new f2.b.C1415b(3);
                bVar.getClass();
                l2 l2VarE = c2.l.e(0.0f, f17, 0.0f, 0.0f, 13);
                bVar.getClass();
                c2.j.i iVarI2 = c2.j.i(f17);
                bVar.getClass();
                c2.j.i iVarI3 = c2.j.i(f17);
                boolean zR = ((i15 & 57344) == 16384) | ((i15 & 112) == 32) | o0Var2.r(dVarV);
                Object objQ2 = o0Var2.q();
                if (zR) {
                    z14 = false;
                    objQ2 = new p(cVar, dVarV, lVar2, 0);
                    o0Var2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        z14 = false;
                        objQ2 = new p(cVar, dVarV, lVar2, 0);
                        o0Var2.K(objQ2);
                    } else {
                        z14 = false;
                    }
                }
                f14 = 0.0f;
                f15 = f17;
                r15 = 1;
                f2.j.a(c1415b, rVarB, p0VarA, l2VarE, iVarI3, iVarI2, null, false, null, (e23.l) objQ2, o0Var2, 0, 0, 912);
                o0 o0Var3 = o0Var2;
                o0Var3.g0(z14);
                o0Var = o0Var3;
            } else {
                f14 = 0.0f;
                f15 = f17;
                r15 = 1;
                o0Var2.C(-173040126);
                o0Var2.g0(false);
                o0Var = o0Var2;
            }
            h4.r.a aVar4 = h4.r.S;
            bVar.getClass();
            h4.r rVarA = c2.l.A(aVar4, f14, f15, r15);
            String strQ3 = gl1.y.Q(o0Var, cVar.isEmpty() ? R.string.title_select_photos : R.string.trail_review_select_more_photos);
            ?? r16 = cVar.size() != 10 ? r15 : 0;
            int i16 = ((i15 & 112) != 32 ? 0 : r15) | ((i15 & 896) == 256 ? r15 : 0);
            Object objQ3 = o0Var.q();
            if (i16 == 0) {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new q(0, lVar, cVar);
                    o0Var.K(objQ3);
                }
            } else {
                objQ3 = new q(0, lVar, cVar);
                o0Var.K(objQ3);
            }
            gt1.h.a(rVarA, strQ3, R.drawable.add_photo_filled, false, false, r16, (e23.a) objQ3, o0Var, 0, 24);
            String strQ4 = gl1.y.Q(o0Var, R.string.trails_submit_review_photos_caption);
            fVar.getClass();
            o0 o0Var4 = o0Var;
            mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var4, 0, 0, 131070);
            ?? r17 = o0Var4;
            r17.g0(r15);
            r14 = r17;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p(rVar, cVar, lVar, pVar, lVar2, i14, 21);
        }
    }

    public static final void h(int i14, int i15, e23.l lVar, h4.r rVar, p3.m mVar) {
        o0 o0VarE = mVar.E(1175146266);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_trail_rating);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97936m, o0VarE)), o0VarE, 0, 0, 131070);
            String strQ2 = gl1.y.Q(o0VarE, R.string.trails_submit_review_rating_message);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            a1.a(null, i14, 0.0f, lVar, o0VarE, (i16 & 112) | ((i16 << 3) & 7168), 5);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s(rVar, i14, lVar, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(h4.r rVar, String str, String str2, p1 p1Var, p3.m mVar, int i14) {
        p1 p1Var2;
        o0 o0VarE = mVar.E(-698539877);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(p1Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar2 = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new hq.f0(20);
                o0VarE.K(objQ);
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, aVar2, true);
            h4.g.b bVar3 = h4.d.a.f81534l;
            bVar.getClass();
            s2 s2VarA = q2.a(c2.j.i(f15), bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            b12.k.b(null, null, j92.b.f97901d.f97906e, new b12.b((((Boolean) p1Var.getF182175a()).booleanValue() || !g22.n.d(str2)) ? null : str2, ((Boolean) p1Var.getF182175a()).booleanValue() ? 2131231047 : null, null, null, null, 28, null), o0VarE, b12.b.f14385f << 9, 19);
            String strP = gl1.y.P(R.string.trails_submit_review_reviewed_as, new Object[]{str}, o0VarE);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE.g0(true);
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            p5.l.f136032b.getClass();
            p5.l lVarA = p5.l.a(p5.l.f136033c);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                p1Var2 = p1Var;
                objQ2 = new et1.b2(p1Var2, 27);
                o0VarE.K(objQ2);
            } else {
                p1Var2 = p1Var;
            }
            h4.r rVarB = j2.g.b(rVarC4, zBooleanValue, false, lVarA, (e23.l) objQ2, 10);
            bVar.getClass();
            s2 s2VarA2 = q2.a(c2.j.i(f15), bVar3, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC5 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC5, o0VarE);
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(517188010, new l1(p1Var2, 11, (byte) 0), o0VarE), o0VarE, 56);
            String strQ = gl1.y.Q(o0VarE, R.string.trails_submit_review_make_review_anonymous);
            fVar2.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(rVar, str, str2, p1Var, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01b5  */
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
    public static final void j(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(1775026405);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = yc.l2.h(o0VarE, 698363208, 0, 1, null);
            o0VarE.C(698363754);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            int iJ = bVarH.j(d92.c.b(x0Var, o0VarE).f157322a);
            try {
                bVarH.b(gl1.y.Q(o0VarE, R.string.review_rejected_warning_label_without_annotation));
                bVarH.b(StringUtils.SPACE);
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                o0VarE.g0(false);
                bVarH.h("termsOfUse", "");
                o0VarE.C(698373559);
                fVar.getClass();
                int iJ2 = bVarH.j(x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a);
                try {
                    bVarH.b(gl1.y.Q(o0VarE, R.string.account_terms_of_use_page_title));
                    bVarH.f(iJ2);
                    o0VarE.g0(false);
                    bVarH.e();
                    fVar.getClass();
                    int iJ3 = bVarH.j(d92.c.b(x0Var, o0VarE).f157322a);
                    try {
                        bVarH.b(".");
                        bVarH.f(iJ3);
                        s5.c cVarK = bVarH.k();
                        o0VarE.g0(false);
                        c2.j jVar = c2.j.f22691a;
                        j92.b bVar = d92.b.f58625c;
                        bVar.getClass();
                        float f14 = j92.b.f97899b.f97917b;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(f14);
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
                        int iHashCode = Long.hashCode(o0VarE.U);
                        i2 i2VarA0 = o0VarE.a0();
                        h4.r rVarC = h4.k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        h5.e0.a aVar2 = h5.g.a.f81805b;
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
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        u2 u2Var = u2.f22900a;
                        d1 d1Var = d1.f16531a;
                        bVar.getClass();
                        j92.c cVar = j92.b.f97901d;
                        float f15 = cVar.f97904c;
                        bVar.getClass();
                        d1Var.a(f15, R.drawable.ic_exclamation, cVar.f97903b, d92.b.a(o0VarE).f().f63508c, d92.b.a(o0VarE).f().f(), o0VarE, 0, 0);
                        boolean zB = o0VarE.B(cVarK) | ((i15 & 112) == 32);
                        Object objQ = o0VarE.q();
                        if (zB) {
                            objQ = new u(cVarK, aVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new u(cVarK, aVar, 0);
                                o0VarE.K(objQ);
                            }
                        }
                        p006l2.c0.a(cVarK, null, null, false, 0, 0, null, (e23.l) objQ, o0VarE, 0, 126);
                        o0VarE.g0(true);
                    } catch (Throwable th3) {
                        bVarH.f(iJ3);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVarH.f(iJ2);
                    throw th4;
                }
            } catch (Throwable th5) {
                bVarH.f(iJ);
                throw th5;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar, aVar, i14, 4, (byte) 0);
        }
    }
}
