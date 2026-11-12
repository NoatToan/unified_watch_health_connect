package w12;

import com.garmin.android.apps.connectmobile.userprofile.model.r;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.m0;
import lc.u0;
import lc.v0;
import lc.y;
import m12.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import r53.j;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.ProfilePrivacyNavKt$ProfilePrivacyNav$1$1", f = "ProfilePrivacyNav.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f181259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f181260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m0 f181261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p<String, String, Unit> f181262e;

        /* JADX INFO: renamed from: w12.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3379a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l<Boolean, Unit> f181263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f181264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p<String, String, Unit> f181265c;

            /* JADX WARN: Multi-variable type inference failed */
            public C3379a(l<? super Boolean, Unit> lVar, m0 m0Var, p<? super String, ? super String, Unit> pVar) {
                this.f181263a = lVar;
                this.f181264b = m0Var;
                this.f181265c = pVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                com.garmin.android.apps.connectmobile.userprofile.presentation.a aVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.a) obj;
                if (aVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.a.C0906a) {
                    this.f181263a.invoke(Boolean.valueOf(((com.garmin.android.apps.connectmobile.userprofile.presentation.a.C0906a) aVar).f47007a));
                } else if (aVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.a.b) {
                    y.l(this.f181264b, ((com.garmin.android.apps.connectmobile.userprofile.presentation.a.b) aVar).f47008a);
                } else {
                    if (!(aVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.a.c)) {
                        u0.r();
                        return null;
                    }
                    com.garmin.android.apps.connectmobile.userprofile.presentation.a.c cVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.a.c) aVar;
                    this.f181265c.invoke(cVar.f47009a, cVar.f47010b);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar, l<? super Boolean, Unit> lVar, m0 m0Var, p<? super String, ? super String, Unit> pVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f181259b = dVar;
            this.f181260c = lVar;
            this.f181261d = m0Var;
            this.f181262e = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f181259b, this.f181260c, this.f181261d, this.f181262e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to w12.c$a for r6v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r6.f181258a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r7)
            Le:
                r7 = 0
                return r7
            L10:
                o13.r.b(r7)
                goto L31
            L14:
                o13.r.b(r7)
                com.garmin.android.apps.connectmobile.userprofile.presentation.d r7 = r6.f181259b
                r53.a2 r7 = r7.f47034r
                w12.c$a$a r1 = new w12.c$a$a
                lc.m0 r3 = r6.f181261d
                e23.p<java.lang.String, java.lang.String, kotlin.Unit> r4 = r6.f181262e
                e23.l<java.lang.Boolean, kotlin.Unit> r5 = r6.f181260c
                r1.<init>(r5, r3, r4)
                r6.f181258a = r2
                r53.d2<T> r7 = r7.f150526a
                java.lang.Object r7 = r7.collect(r1, r6)
                if (r7 != r0) goto L31
                return r0
            L31:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: w12.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, com.garmin.android.apps.connectmobile.userprofile.presentation.d.class, "refreshProfileImage", "refreshProfileImage()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.d) this.receiver;
            dVar.f47017a.b();
            dVar.f47035t = true;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: w12.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C3380c extends q implements e23.a<Unit> {
        public C3380c(Object obj) {
            super(0, obj, com.garmin.android.apps.connectmobile.userprofile.presentation.d.class, "errorHandled", "errorHandled()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((com.garmin.android.apps.connectmobile.userprofile.presentation.d) this.receiver).f47029m;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.FALSE));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<com.garmin.android.apps.connectmobile.userprofile.presentation.f, Unit> {
        public d(Object obj) {
            super(1, obj, com.garmin.android.apps.connectmobile.userprofile.presentation.d.class, "onItemSelected", "onItemSelected(Lcom/garmin/android/apps/connectmobile/userprofile/presentation/ProfileEvent;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.android.apps.connectmobile.userprofile.presentation.f fVar) {
            com.garmin.android.apps.connectmobile.userprofile.presentation.f fVar2 = fVar;
            fVar2.getClass();
            ((com.garmin.android.apps.connectmobile.userprofile.presentation.d) this.receiver).x4(fVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements l<List<? extends y12.a>, Unit> {
        public e(Object obj) {
            super(1, obj, com.garmin.android.apps.connectmobile.userprofile.presentation.d.class, "updateActivityPreferences", "updateActivityPreferences(Ljava/util/List;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(List<? extends y12.a> list) {
            Object value;
            List<? extends y12.a> list2 = list;
            list2.getClass();
            com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.d) this.receiver;
            dVar.getClass();
            m12.q qVar = (m12.q) dVar.f47032p.f150540a.getValue();
            if (qVar != null) {
                dVar.f47022f.getClass();
                r rVar = qVar.f115856b;
                m12.q qVarA = null;
                if (rVar != null) {
                    ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((y12.a) it.next()).f194025a);
                    }
                    qVarA = m12.q.a(qVar, r.b(rVar, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, 2097119), null, false, 13);
                }
                if (qVarA != null) {
                    p2 p2Var = dVar.f47031o;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, qVarA));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181266a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f115876q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f115875p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f115873n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.O0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f181266a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    public static final void a(boolean z14, com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar, w12.d dVar2, p<? super String, ? super String, Unit> pVar, l<? super com.garmin.android.apps.connectmobile.userprofile.presentation.f, Unit> lVar, e23.a<Unit> aVar, l<? super Boolean, Unit> lVar2, m mVar, int i14) {
        Object aVar2;
        Unit unit;
        m0 m0Var;
        dVar.getClass();
        dVar2.getClass();
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1938619132);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.B(dVar2) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? 1048576 : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            Unit unit2 = Unit.INSTANCE;
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(dVar) | ((i15 & 3670016) == 1048576) | o0VarE.r(m0VarI);
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                unit = unit2;
                m0Var = m0VarI;
                aVar2 = new a(dVar, lVar2, m0Var, pVar, null);
                o0VarE.K(aVar2);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    unit = unit2;
                    m0Var = m0VarI;
                    aVar2 = new a(dVar, lVar2, m0Var, pVar, null);
                    o0VarE.K(aVar2);
                } else {
                    unit = unit2;
                    aVar2 = objQ;
                    m0Var = m0VarI;
                }
            }
            l0.e((p) aVar2, unit, o0VarE);
            boolean zR2 = o0VarE.r(dVar) | ((i15 & 14) == 4) | ((57344 & i15) == 16384) | ((458752 & i15) == 131072) | o0VarE.r(m0Var);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                m0 m0Var2 = m0Var;
                cq.m mVar2 = new cq.m(dVar, z14, lVar, aVar, m0Var2, 11);
                m0Var = m0Var2;
                o0VarE.K(mVar2);
                objQ2 = mVar2;
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    m0 m0Var3 = m0Var;
                    cq.m mVar3 = new cq.m(dVar, z14, lVar, aVar, m0Var3, 11);
                    m0Var = m0Var3;
                    o0VarE.K(mVar3);
                    objQ2 = mVar3;
                }
            }
            nc.y.a(m0Var, dVar2, null, null, null, null, null, null, null, (l) objQ2, o0VarE, (i15 >> 3) & 112, 2044);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(z14, dVar, dVar2, pVar, lVar, aVar, lVar2, i14);
        }
    }
}
