package i91;

import com.garmin.android.apps.connectmobile.R;
import d91.s;
import d91.t;
import e23.l;
import e23.p;
import gl1.y;
import java.util.Set;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li91/g;", "Lr70/r;", "Li91/j;", "stateHolder", "Ll91/a;", "messageLinkNavigation", "<init>", "(Li91/j;Ll91/a;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f92338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l91.a f92339b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<String, Unit> {
        public a(Object obj) {
            super(1, obj, f91.c.class, "invoke", "invoke(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            f91.c cVar = (f91.c) this.receiver;
            cVar.getClass();
            cVar.f69998a.d(str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dashboard.PersonalizedInsightsSection$DashboardItem$2$1$1", f = "PersonalizedInsightsSection.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r70.q f92340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f92341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r70.q qVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f92340a = qVar;
            this.f92341b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f92340a, this.f92341b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r70.q.d(this.f92340a, this.f92341b, null, 30);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<String, Unit> {
        public c(Object obj) {
            super(1, obj, f91.c.class, "invoke", "invoke(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            f91.c cVar = (f91.c) this.receiver;
            cVar.getClass();
            cVar.f69998a.d(str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<String, Unit> {
        public d(Object obj) {
            super(1, obj, f91.c.class, "invoke", "invoke(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            f91.c cVar = (f91.c) this.receiver;
            cVar.getClass();
            cVar.f69998a.d(str2);
            return Unit.INSTANCE;
        }
    }

    public g(j jVar, l91.a aVar) {
        jVar.getClass();
        aVar.getClass();
        this.f92338a = jVar;
        this.f92339b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0308  */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, m mVar, int i14) {
        int i15;
        j jVar = this.f92338a;
        f91.c cVar = jVar.f92357b;
        c91.b bVar = jVar.f92360e;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1524481766);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Unit unit = null;
            t tVar = (t) s9.c.b(jVar.f92356a, null, o0VarQ, 48).getF182175a();
            boolean z14 = tVar instanceof t.g;
            l91.a aVar = this.f92339b;
            m.a aVar2 = m.f135153a;
            if (z14) {
                o0VarQ.C(852409160);
                String strQ = y.Q(o0VarQ, R.string.lbl_thank_you_for_sharing);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(rVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                s sVar = ((t.g) tVar).f58597b;
                boolean zR = o0VarQ.r(cVar);
                Object objQ = o0VarQ.q();
                if (zR) {
                    objQ = new a(cVar);
                    o0VarQ.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(cVar);
                        o0VarQ.K(objQ);
                    }
                }
                l lVar = (l) ((k23.g) objQ);
                boolean zR2 = o0VarQ.r(this) | o0VarQ.r(qVar) | o0VarQ.B(strQ);
                Object objQ2 = o0VarQ.q();
                if (zR2) {
                    objQ2 = new e(this, i17, qVar, strQ);
                    o0VarQ.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e(this, i17, qVar, strQ);
                        o0VarQ.K(objQ2);
                    }
                }
                h.c(rVarC, sVar, bVar, aVar, lVar, (e23.r) objQ2, o0VarQ, 0, 0);
                o0VarQ = o0VarQ;
                o0VarQ.g0(false);
            } else if (tVar instanceof t.f) {
                o0VarQ.C(853436128);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(rVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                s sVar2 = ((t.f) tVar).f58596b;
                boolean zR3 = o0VarQ.r(cVar);
                Object objQ3 = o0VarQ.q();
                if (zR3) {
                    objQ3 = new c(cVar);
                    o0VarQ.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new c(cVar);
                        o0VarQ.K(objQ3);
                    }
                }
                h.c(rVarC2, sVar2, bVar, aVar, (l) ((k23.g) objQ3), null, o0VarQ, 0, 32);
                o0VarQ = o0VarQ;
                o0VarQ.g0(false);
            } else if (tVar instanceof t.c) {
                o0VarQ.C(853880978);
                s sVar3 = ((t.c) tVar).f58593b;
                boolean zR4 = o0VarQ.r(cVar);
                Object objQ4 = o0VarQ.q();
                if (zR4) {
                    objQ4 = new d(cVar);
                    o0VarQ.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new d(cVar);
                        o0VarQ.K(objQ4);
                    }
                }
                h.b(rVar, sVar3, (l) ((k23.g) objQ4), o0VarQ, i15 & 14, 0);
                o0VarQ.g0(false);
            } else if (tVar instanceof t.e) {
                o0VarQ.C(854196093);
                s sVar4 = ((t.e) tVar).f58595b;
                if (sVar4 == null) {
                    o0VarQ.C(854202943);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(854202944);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h.c(c2.l.C(rVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), sVar4, bVar, aVar, null, null, o0VarQ, 0, 48);
                    o0VarQ.g0(false);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    o0VarQ = o0VarQ;
                    o0VarQ.C(854548780);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h.e(c2.l.C(rVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), bVar, o0VarQ, 0, 0);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ = o0VarQ;
                    o0VarQ.C(443196709);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(false);
            } else if (tVar instanceof t.b) {
                o0VarQ.C(854884696);
                s sVar5 = ((t.b) tVar).f58592b;
                if (sVar5 == null) {
                    o0VarQ.C(854888415);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(854888416);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h.c(c2.l.C(rVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), sVar5, bVar, aVar, null, null, o0VarQ, 0, 48);
                    o0VarQ.g0(false);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    o0VarQ = o0VarQ;
                    o0VarQ.C(855237383);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h.a(0, 2, c2.l.C(rVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), y.Q(o0VarQ, R.string.loading_error_sentence_case), y.Q(o0VarQ, R.string.msg_ai_error), o0VarQ, null);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ = o0VarQ;
                    o0VarQ.C(443218922);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(false);
            } else if (tVar instanceof t.h) {
                o0VarQ.C(855663168);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC3 = c2.l.C(rVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                final t.h hVar = (t.h) tVar;
                String str = hVar.f58598b;
                boolean zR5 = o0VarQ.r(this) | o0VarQ.B(tVar);
                Object objQ5 = o0VarQ.q();
                if (zR5) {
                    objQ5 = new e23.a(this) { // from class: i91.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f92336b;

                        {
                            this.f92336b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    f91.a aVar3 = this.f92336b.f92338a.f92359d;
                                    t.h hVar2 = hVar;
                                    String str2 = hVar2.f58598b;
                                    Set<String> set = hVar2.f58599c;
                                    str2.getClass();
                                    set.getClass();
                                    aVar3.f69996a.c(str2, set, true);
                                    break;
                                default:
                                    f91.a aVar4 = this.f92336b.f92338a.f92359d;
                                    t.h hVar3 = hVar;
                                    String str3 = hVar3.f58598b;
                                    Set<String> set2 = hVar3.f58599c;
                                    str3.getClass();
                                    set2.getClass();
                                    aVar4.f69996a.c(str3, set2, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarQ.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new e23.a(this) { // from class: i91.f

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ g f92336b;

                            {
                                this.f92336b = this;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        f91.a aVar3 = this.f92336b.f92338a.f92359d;
                                        t.h hVar2 = hVar;
                                        String str2 = hVar2.f58598b;
                                        Set<String> set = hVar2.f58599c;
                                        str2.getClass();
                                        set.getClass();
                                        aVar3.f69996a.c(str2, set, true);
                                        break;
                                    default:
                                        f91.a aVar4 = this.f92336b.f92338a.f92359d;
                                        t.h hVar3 = hVar;
                                        String str3 = hVar3.f58598b;
                                        Set<String> set2 = hVar3.f58599c;
                                        str3.getClass();
                                        set2.getClass();
                                        aVar4.f69996a.c(str3, set2, false);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarQ.K(objQ5);
                    }
                }
                e23.a aVar3 = (e23.a) objQ5;
                boolean zR6 = o0VarQ.r(this) | o0VarQ.B(tVar);
                Object objQ6 = o0VarQ.q();
                if (zR6) {
                    objQ6 = new e23.a(this) { // from class: i91.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f92336b;

                        {
                            this.f92336b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    f91.a aVar4 = this.f92336b.f92338a.f92359d;
                                    t.h hVar2 = hVar;
                                    String str2 = hVar2.f58598b;
                                    Set<String> set = hVar2.f58599c;
                                    str2.getClass();
                                    set.getClass();
                                    aVar4.f69996a.c(str2, set, true);
                                    break;
                                default:
                                    f91.a aVar5 = this.f92336b.f92338a.f92359d;
                                    t.h hVar3 = hVar;
                                    String str3 = hVar3.f58598b;
                                    Set<String> set2 = hVar3.f58599c;
                                    str3.getClass();
                                    set2.getClass();
                                    aVar5.f69996a.c(str3, set2, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarQ.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new e23.a(this) { // from class: i91.f

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ g f92336b;

                            {
                                this.f92336b = this;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        f91.a aVar4 = this.f92336b.f92338a.f92359d;
                                        t.h hVar2 = hVar;
                                        String str2 = hVar2.f58598b;
                                        Set<String> set = hVar2.f58599c;
                                        str2.getClass();
                                        set.getClass();
                                        aVar4.f69996a.c(str2, set, true);
                                        break;
                                    default:
                                        f91.a aVar5 = this.f92336b.f92338a.f92359d;
                                        t.h hVar3 = hVar;
                                        String str3 = hVar3.f58598b;
                                        Set<String> set2 = hVar3.f58599c;
                                        str3.getClass();
                                        set2.getClass();
                                        aVar5.f69996a.c(str3, set2, false);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarQ.K(objQ6);
                    }
                }
                h.f(rVarC3, str, aVar3, (e23.a) objQ6, o0VarQ, 0, 0);
                o0VarQ.g0(false);
            } else {
                if (!p005kotlin.jvm.internal.s.g(tVar, t.d.f58594b) && tVar != null) {
                    throw kg.f.h(o0VarQ, 443140052, false);
                }
                o0VarQ.C(856269962);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(this, rVar, qVar, i14, 10);
        }
    }
}
