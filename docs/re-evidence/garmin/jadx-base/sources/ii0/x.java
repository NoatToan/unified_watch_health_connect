package ii0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import ca0.s0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import i3.s4;
import id0.p5;
import java.util.List;
import java.util.Locale;
import o4.m1;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.k2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.j1;
import yc.l2;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.MyFollowerListKt$MyFollowerList$1$1", f = "MyFollowerList.kt", l = {117}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zc.d<li0.d0> f93750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f93751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93754f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<li0.d0> dVar, e2.i0 i0Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f93750b = dVar;
            this.f93751c = i0Var;
            this.f93752d = p1Var;
            this.f93753e = p1Var2;
            this.f93754f = p1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f93750b, this.f93751c, this.f93752d, this.f93753e, this.f93754f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93749a;
            p1<Boolean> p1Var = this.f93753e;
            zc.d<li0.d0> dVar = this.f93750b;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!p005kotlin.jvm.internal.s.g(dVar.d().f196385a, z0.b.f196664b)) {
                    this.f93752d.setValue(Boolean.FALSE);
                    if (p1Var.getF182175a().booleanValue()) {
                        this.f93749a = 1;
                        e2.i0.a aVar2 = e2.i0.f62432x;
                        if (this.f93751c.l(0, 0, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                z0 z0Var = dVar.d().f196385a;
                z0.b bVar = z0.b.f196664b;
                this.f93754f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar)));
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p1Var.setValue(Boolean.FALSE);
            z0 z0Var2 = dVar.d().f196385a;
            z0.b bVar2 = z0.b.f196664b;
            this.f93754f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var2, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar2)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.MyFollowerListKt$MyFollowerList$isQueryLoading$2$1", f = "MyFollowerList.kt", l = {130}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<k2<Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zc.d<li0.d0> f93757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zc.d<li0.d0> dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f93757c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f93757c, dVar);
            bVar.f93756b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(k2<Boolean> k2Var, t13.d<? super Unit> dVar) {
            return ((b) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            k2 k2Var = (k2) this.f93756b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93755a;
            zc.d<li0.d0> dVar = this.f93757c;
            if (i14 == 0) {
                o13.r.b(obj);
                if (dVar.d().f196390f) {
                    k2Var.setValue(Boolean.FALSE);
                } else {
                    this.f93756b = k2Var;
                    this.f93755a = 1;
                    if (o53.m0.b(500L, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k2Var.setValue(Boolean.valueOf(!dVar.d().f196390f));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00cd  */
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(40937776);
        int i15 = 1;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            z5.b.f202439b.getClass();
            Locale locale = new Locale(z5.b.a.a().f202440a.getLanguage());
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            gi0.a aVar = (gi0.a) KoinJavaComponent.get$default(gi0.a.class, null, null, 6, null);
            s5.c.b bVarH = l2.h(o0VarE, 686504663, 0, 1, null);
            bVarH.b(gl1.y.Q(o0VarE, R.string.msg_follower_list_implicit_consent));
            if (lg.d.O(locale)) {
                bVarH.b(StringUtils.SPACE);
            }
            o0VarE.C(686510977);
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).d().a().a();
            w5.f0.f182097b.getClass();
            w5.f0 f0Var = w5.f0.f182100e;
            k92.a.f103644a.getClass();
            s5.r0 r0Var = new s5.r0(new s5.i0(jA, k92.a.f103653j, f0Var, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65528, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
            boolean zR = o0VarE.r(context) | o0VarE.r(aVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new hl1.k(i15, context, aVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hl1.k(i15, context, aVar);
                    o0VarE.K(objQ);
                }
            }
            int iG = bVarH.g(new s5.m.a("", r0Var, (s5.n) objQ));
            try {
                bVarH.b(gl1.y.Q(o0VarE, R.string.lbl_edit_privacy));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iG);
                o0VarE.g0(false);
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                d92.b.f58624b.getClass();
                x0 x0VarA = x0.a(j92.f.f97933j, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                h4.r.a aVar2 = h4.r.S;
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                o0Var = o0VarE;
                mh.d(cVarK, c2.l.z(aVar2, f14, eVar.f97919d), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA, o0Var, 0, 0, 262140);
            } catch (Throwable th3) {
                bVarH.f(iG);
                throw th3;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p5(i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x017a  */
    /* JADX WARN: Code duplicated, block: B:188:0x032e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0346  */
    /* JADX WARN: Code duplicated, block: B:191:0x0349  */
    /* JADX WARN: Code duplicated, block: B:200:0x036f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0380  */
    /* JADX WARN: Code duplicated, block: B:211:0x0387  */
    /* JADX WARN: Code duplicated, block: B:212:0x038a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0394  */
    /* JADX WARN: Code duplicated, block: B:227:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:230:0x03df  */
    /* JADX WARN: Code duplicated, block: B:231:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:244:0x0411  */
    /* JADX WARN: Code duplicated, block: B:246:0x0417  */
    /* JADX WARN: Code duplicated, block: B:250:0x0420  */
    /* JADX WARN: Code duplicated, block: B:254:0x0428  */
    /* JADX WARN: Code duplicated, block: B:262:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x0454  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(zc.d<li0.d0> dVar, zc.d<li0.d0> dVar2, li0.f fVar, u2.h hVar, p003ji0.a aVar, e2.i0 i0Var, e2.i0 i0Var2, mi0.f.c cVar, li0.f fVar2, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        int i16;
        int i17;
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        e2.i0 i0Var3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objQ;
        zc.d<li0.d0> dVar3;
        p3.o0 o0Var2;
        boolean z18;
        boolean z19;
        li0.f fVar3;
        boolean z24;
        li0.f fVar4;
        boolean z25;
        boolean zR;
        Object objQ2;
        dVar2.getClass();
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        i0Var.getClass();
        i0Var2.getClass();
        cVar.getClass();
        fVar2.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(835855437);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar2) : o0VarE.r(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(hVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(i0Var) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.B(i0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.r(cVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= (i14 & 134217728) == 0 ? o0VarE.B(fVar2) : o0VarE.r(fVar2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(aVar2) ? 536870912 : 268435456;
        }
        boolean z26 = true;
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            gi0.a aVar3 = (gi0.a) KoinJavaComponent.get$default(gi0.a.class, null, null, 6, null);
            g.h hVar2 = new g.h();
            int i18 = i15 & 14;
            int i19 = i15 & 1879048192;
            int i24 = i15;
            boolean z27 = (i18 == 4 || ((i15 & 8) != 0 && o0VarE.r(dVar))) | (i19 == 536870912);
            Object objQ3 = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z27) {
                objQ3 = new hy.h(18, dVar, aVar2);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new hy.h(18, dVar, aVar2);
                    o0VarE.K(objQ3);
                }
            }
            c.q qVarC = c.w.c(hVar2, (e23.l) objQ3, o0VarE, 0);
            Object objQ4 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var5 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var6 = (p1) objQ6;
            boolean zB = o0VarE.B(hVar.b().f167839c);
            Object objQ7 = o0VarE.q();
            if (zB || objQ7 == c2565a) {
                objQ7 = hb.a.n(hVar.b().f167839c.length() == 0, o0VarE);
            }
            p1 p1Var7 = (p1) objQ7;
            z0 z0Var = dVar.d().f196385a;
            boolean z28 = (i18 == 4 || ((i24 & 8) != 0 && o0VarE.r(dVar))) | ((i24 & 458752) == 131072);
            Object objQ8 = o0VarE.q();
            if (z28 || objQ8 == c2565a) {
                i16 = 32;
                i17 = i18;
                a aVar5 = new a(dVar, i0Var, p1Var5, p1Var6, p1Var4, null);
                p1Var = p1Var5;
                p1Var2 = p1Var4;
                o0VarE.K(aVar5);
                objQ8 = aVar5;
            } else {
                p1Var = p1Var5;
                p1Var2 = p1Var4;
                i17 = i18;
                i16 = 32;
            }
            p3.l0.e((e23.p) objQ8, z0Var, o0VarE);
            Boolean bool = Boolean.FALSE;
            Boolean boolValueOf = Boolean.valueOf(dVar2.d().f196390f);
            CharSequence charSequence = hVar.b().f167839c;
            int i25 = i24 & 112;
            boolean z29 = i25 == i16 || ((i24 & 64) != 0 && o0VarE.r(dVar2));
            Object objQ9 = o0VarE.q();
            if (z29 || objQ9 == c2565a) {
                objQ9 = new b(dVar2, null);
                o0VarE.K(objQ9);
            }
            p1 p1VarP = p3.p0.p(bool, boolValueOf, charSequence, (e23.p) objQ9, o0VarE, 6);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                p1Var3 = p1Var;
                o0VarE.C(-1247622189);
                if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                    i0Var3 = i0Var;
                } else {
                    i0Var3 = i0Var2;
                }
                boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                boolean zJ = d53.w.J(hVar.b().f167839c);
                if (i17 != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (i25 != i16) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                boolean z34 = z14 | z15;
                if (i19 == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z34 | z16;
                objQ = o0VarE.q();
                if (z17) {
                    dVar3 = dVar2;
                    o0Var2 = o0VarE;
                    ho.d0 d0Var = new ho.d0((Object) dVar, (Object) dVar3, (Object) aVar2, false, (Object) p1Var3, 8);
                    o0Var2.K(d0Var);
                    objQ = d0Var;
                } else {
                    dVar3 = dVar2;
                    o0Var2 = o0VarE;
                    ho.d0 d0Var2 = new ho.d0((Object) dVar, (Object) dVar3, (Object) aVar2, false, (Object) p1Var3, 8);
                    o0Var2.K(d0Var2);
                    objQ = d0Var2;
                }
                e23.a aVar6 = (e23.a) objQ;
                z3.e eVarC = z3.f.c(-1340890378, new w(hVar, 0), o0Var2);
                if (i25 != i16) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                boolean zB2 = o0Var2.B(p1VarP) | z18;
                if ((i24 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z35 = zB2 | z19;
                if ((i24 & 896) != 256) {
                    fVar3 = fVar;
                    if ((i24 & 512) != 0) {
                    }
                    z24 = false;
                    boolean zB3 = z35 | z24 | o0Var2.B(p1Var7) | o0Var2.r(cVar);
                    if ((234881024 & i24) != 67108864) {
                        fVar4 = fVar2;
                        if ((i24 & 134217728) != 0) {
                        }
                        z25 = false;
                        boolean z36 = zB3 | z25;
                        if (i17 != 4) {
                            z26 = false;
                        }
                        zR = z36 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                        objQ2 = o0Var2.q();
                        if (zR) {
                            s0 s0Var = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                            o0Var2.K(s0Var);
                            objQ2 = s0Var;
                        } else {
                            s0 s0Var2 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                            o0Var2.K(s0Var2);
                            objQ2 = s0Var2;
                        }
                        p3.o0 o0Var3 = o0Var2;
                        p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar6, eVarC, aVar, (e23.l) objQ2, o0Var3, ((i24 << 3) & 458752) | 24576);
                        o0Var = o0Var3;
                        o0Var.g0(false);
                    } else {
                        fVar4 = fVar2;
                    }
                    z25 = true;
                    boolean z37 = zB3 | z25;
                    if (i17 != 4) {
                        z26 = false;
                    }
                    zR = z37 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                    objQ2 = o0Var2.q();
                    if (zR) {
                        s0 s0Var3 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                        o0Var2.K(s0Var3);
                        objQ2 = s0Var3;
                    } else {
                        s0 s0Var4 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                        o0Var2.K(s0Var4);
                        objQ2 = s0Var4;
                    }
                    p3.o0 o0Var4 = o0Var2;
                    p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar6, eVarC, aVar, (e23.l) objQ2, o0Var4, ((i24 << 3) & 458752) | 24576);
                    o0Var = o0Var4;
                    o0Var.g0(false);
                } else {
                    fVar3 = fVar;
                }
                z24 = true;
                boolean zB4 = z35 | z24 | o0Var2.B(p1Var7) | o0Var2.r(cVar);
                if ((234881024 & i24) != 67108864) {
                    fVar4 = fVar2;
                    if ((i24 & 134217728) != 0) {
                    }
                    z25 = false;
                    boolean z38 = zB4 | z25;
                    if (i17 != 4) {
                        z26 = false;
                    }
                    zR = z38 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                    objQ2 = o0Var2.q();
                    if (zR) {
                        s0 s0Var5 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                        o0Var2.K(s0Var5);
                        objQ2 = s0Var5;
                    } else {
                        s0 s0Var6 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                        o0Var2.K(s0Var6);
                        objQ2 = s0Var6;
                    }
                    p3.o0 o0Var5 = o0Var2;
                    p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar6, eVarC, aVar, (e23.l) objQ2, o0Var5, ((i24 << 3) & 458752) | 24576);
                    o0Var = o0Var5;
                    o0Var.g0(false);
                } else {
                    fVar4 = fVar2;
                }
                z25 = true;
                boolean z39 = zB4 | z25;
                if (i17 != 4) {
                    z26 = false;
                }
                zR = z39 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                objQ2 = o0Var2.q();
                if (zR) {
                    s0 s0Var7 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                    o0Var2.K(s0Var7);
                    objQ2 = s0Var7;
                } else {
                    s0 s0Var8 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                    o0Var2.K(s0Var8);
                    objQ2 = s0Var8;
                }
                p3.o0 o0Var6 = o0Var2;
                p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar6, eVarC, aVar, (e23.l) objQ2, o0Var6, ((i24 << 3) & 458752) | 24576);
                o0Var = o0Var6;
                o0Var.g0(false);
            } else {
                int iB = dVar.b();
                Integer num = cVar.f118785a;
                if (iB + (num != null ? num.intValue() : 0) == 0) {
                    o0VarE.C(-1248432808);
                    boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    boolean z44 = (i17 == 4 || ((i24 & 8) != 0 && o0VarE.r(dVar))) | (i19 == 536870912);
                    Object objQ10 = o0VarE.q();
                    if (z44 || objQ10 == c2565a) {
                        ho.d0 d0Var3 = new ho.d0(dVar, aVar2, p1Var, p1Var6, 7);
                        o0VarE.K(d0Var3);
                        objQ10 = d0Var3;
                    }
                    m3.l.b(zBooleanValue2, (e23.a) objQ10, null, null, null, null, z3.f.c(-143198206, new hv0.d(6, aVar3, context), o0VarE), o0VarE, 1572864, 60);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                } else {
                    p1Var3 = p1Var;
                    o0VarE.C(-1247622189);
                    if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                        i0Var3 = i0Var;
                    } else {
                        i0Var3 = i0Var2;
                    }
                    boolean zBooleanValue3 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    boolean zJ2 = d53.w.J(hVar.b().f167839c);
                    if (i17 != 4 || ((i24 & 8) != 0 && o0VarE.r(dVar))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i25 != i16 || ((i24 & 64) != 0 && o0VarE.r(dVar2))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z310 = z14 | z15;
                    if (i19 == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z310 | z16;
                    objQ = o0VarE.q();
                    if (z17 || objQ == c2565a) {
                        dVar3 = dVar2;
                        o0Var2 = o0VarE;
                        ho.d0 d0Var4 = new ho.d0((Object) dVar, (Object) dVar3, (Object) aVar2, false, (Object) p1Var3, 8);
                        o0Var2.K(d0Var4);
                        objQ = d0Var4;
                    } else {
                        dVar3 = dVar2;
                        o0Var2 = o0VarE;
                    }
                    e23.a aVar7 = (e23.a) objQ;
                    z3.e eVarC2 = z3.f.c(-1340890378, new w(hVar, 0), o0Var2);
                    if (i25 != i16 || ((i24 & 64) != 0 && o0Var2.r(dVar3))) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zB5 = o0Var2.B(p1VarP) | z18;
                    if ((i24 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z311 = zB5 | z19;
                    if ((i24 & 896) != 256) {
                        fVar3 = fVar;
                        if ((i24 & 512) != 0 || !o0Var2.r(fVar3)) {
                            z24 = false;
                        }
                        boolean zB6 = z311 | z24 | o0Var2.B(p1Var7) | o0Var2.r(cVar);
                        if ((234881024 & i24) != 67108864) {
                            fVar4 = fVar2;
                            if ((i24 & 134217728) != 0 || !o0Var2.r(fVar4)) {
                                z25 = false;
                            }
                            boolean z312 = zB6 | z25;
                            if (i17 != 4 && ((i24 & 8) == 0 || !o0Var2.r(dVar))) {
                                z26 = false;
                            }
                            zR = z312 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                            objQ2 = o0Var2.q();
                            if (zR || objQ2 == c2565a) {
                                s0 s0Var9 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                                o0Var2.K(s0Var9);
                                objQ2 = s0Var9;
                            }
                            p3.o0 o0Var7 = o0Var2;
                            p003ji0.h.a(i0Var3, zBooleanValue3, zJ2, aVar7, eVarC2, aVar, (e23.l) objQ2, o0Var7, ((i24 << 3) & 458752) | 24576);
                            o0Var = o0Var7;
                            o0Var.g0(false);
                        } else {
                            fVar4 = fVar2;
                        }
                        z25 = true;
                        boolean z313 = zB6 | z25;
                        if (i17 != 4) {
                            z26 = false;
                        }
                        zR = z313 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                        objQ2 = o0Var2.q();
                        if (zR) {
                            s0 s0Var10 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                            o0Var2.K(s0Var10);
                            objQ2 = s0Var10;
                        } else {
                            s0 s0Var11 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                            o0Var2.K(s0Var11);
                            objQ2 = s0Var11;
                        }
                        p3.o0 o0Var8 = o0Var2;
                        p003ji0.h.a(i0Var3, zBooleanValue3, zJ2, aVar7, eVarC2, aVar, (e23.l) objQ2, o0Var8, ((i24 << 3) & 458752) | 24576);
                        o0Var = o0Var8;
                        o0Var.g0(false);
                    } else {
                        fVar3 = fVar;
                    }
                    z24 = true;
                    boolean zB7 = z311 | z24 | o0Var2.B(p1Var7) | o0Var2.r(cVar);
                    if ((234881024 & i24) != 67108864) {
                        fVar4 = fVar2;
                        if ((i24 & 134217728) != 0) {
                        }
                        z25 = false;
                        boolean z314 = zB7 | z25;
                        if (i17 != 4) {
                            z26 = false;
                        }
                        zR = z314 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                        objQ2 = o0Var2.q();
                        if (zR) {
                            s0 s0Var12 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                            o0Var2.K(s0Var12);
                            objQ2 = s0Var12;
                        } else {
                            s0 s0Var13 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                            o0Var2.K(s0Var13);
                            objQ2 = s0Var13;
                        }
                        p3.o0 o0Var9 = o0Var2;
                        p003ji0.h.a(i0Var3, zBooleanValue3, zJ2, aVar7, eVarC2, aVar, (e23.l) objQ2, o0Var9, ((i24 << 3) & 458752) | 24576);
                        o0Var = o0Var9;
                        o0Var.g0(false);
                    } else {
                        fVar4 = fVar2;
                    }
                    z25 = true;
                    boolean z315 = zB7 | z25;
                    if (i17 != 4) {
                        z26 = false;
                    }
                    zR = z315 | z26 | o0Var2.r(qVarC) | o0Var2.r(r2) | o0Var2.r(context);
                    objQ2 = o0Var2.q();
                    if (zR) {
                        s0 s0Var14 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                        o0Var2.K(s0Var14);
                        objQ2 = s0Var14;
                    } else {
                        s0 s0Var15 = new s0(dVar3, hVar, fVar3, p1VarP, p1Var7, cVar, dVar, fVar4, qVarC, aVar3, context, 3);
                        o0Var2.K(s0Var15);
                        objQ2 = s0Var15;
                    }
                    p3.o0 o0Var10 = o0Var2;
                    p003ji0.h.a(i0Var3, zBooleanValue3, zJ2, aVar7, eVarC2, aVar, (e23.l) objQ2, o0Var10, ((i24 << 3) & 458752) | 24576);
                    o0Var = o0Var10;
                    o0Var.g0(false);
                }
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, cVar, fVar2, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
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
    public static final void c(Integer num, List list, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        int i15;
        ?? r14;
        p3.o0 o0Var2;
        li0.d0 d0Var;
        p3.o0 o0VarE = mVar.E(2140606105);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.y(rVar, null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new h(aVar, 7);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(aVar, 7);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
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
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar3 = h4.r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            h4.r rVarY = c2.l.y(aVar3, f14);
            s2 s2VarA = q2.a(r1.q2.g(bVar2, c2.j.f22691a, f15), h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p3.p0.l();
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
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (list == null) {
                o0VarE.C(-516605604);
                i15 = 0;
                o0VarE.g0(false);
                r14 = 1;
                o0Var2 = o0VarE;
            } else {
                o0VarE.C(-516605603);
                bVar2.getClass();
                float f16 = j92.b.f97901d.f97906e;
                bVar2.getClass();
                float size = f15 * (list.size() - 1);
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarU = x2.u(aVar3, f16 + size);
                f5.z0 z0VarD2 = c2.q.d(gVar, false);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarU, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                o0VarE.C(-433947273);
                int i17 = 0;
                p3.o0 o0Var3 = o0VarE;
                for (Object obj : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    float f17 = i17;
                    h4.r rVarB = h4.p.b(c2.l.v(aVar5, j92.b.f97899b.f97921f * f17, 0.0f, 2), f17 * (-1.0f));
                    bVar3.getClass();
                    p3.o0 o0Var4 = o0Var3;
                    b12.k.b(rVarB, null, j92.b.f97901d.f97906e, ((li0.d0) obj).f112648a, o0Var4, b12.b.f14385f << 9, 18);
                    o0Var3 = o0Var4;
                    i17 = i18;
                }
                i15 = 0;
                o0Var3.g0(false);
                r14 = 1;
                o0Var3.g0(true);
                Unit unit = Unit.INSTANCE;
                o0Var3.g0(false);
                o0Var2 = o0Var3;
            }
            h4.r.a aVar6 = h4.r.S;
            h4.r rVarA = u2Var.a(aVar6, 1.0f, r14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var2, i15);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode4 = Long.hashCode(o0Var2.U);
            i2 i2VarA3 = o0Var2.a0();
            h4.r rVarC4 = h4.k.c(rVarA, o0Var2);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar7);
            } else {
                o0Var2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0Var2);
            b4.c(h5.g.a.f81809f, i2VarA3, o0Var2);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0Var2, iHashCode4, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC4, o0Var2);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0Var2, R.string.follower_setup_follower_approval_title);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            p3.o0 o0Var5 = o0Var2;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0Var5, 0, 0, 131070);
            String str = (list == null || (d0Var = (li0.d0) p13.h0.b0(list)) == null) ? null : d0Var.f112651d;
            if (str == null) {
                str = "";
            }
            String strP = gl1.y.P(R.string.msg_pending_requests_description, new Object[]{str, num != null ? b71.i.e(r14, num) : ""}, o0Var5);
            fVar2.getClass();
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var5), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var5, 0, 0, 131070);
            p3.o0 o0Var6 = o0Var5;
            o0Var6.g0(r14);
            s62.a.f157643a.getClass();
            u4.d dVarA = j1.a(t62.b.f162798a);
            d92.b.f58625c.getClass();
            i7.b(dVarA, null, x2.q(aVar6, j92.b.f97901d.f97904c), 0L, o0Var6, 48, 8);
            o0Var6.g0(r14);
            o0Var6.g0(r14);
            o0Var = o0Var6;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(num, list, rVar, aVar, i14, 25);
        }
    }
}
