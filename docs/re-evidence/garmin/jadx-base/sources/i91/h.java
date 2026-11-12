package i91;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.f0;
import b82.u0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d91.s;
import e23.l;
import e23.p;
import f2.o;
import g02.q0;
import g02.y1;
import h4.k;
import h5.e0;
import i3.bf;
import i3.e9;
import i3.mc;
import i3.mh;
import i3.v2;
import java.util.List;
import java.util.Locale;
import l72.c1;
import l72.w;
import o13.r;
import o4.d0;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.t0;
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
import p5.v;
import r53.a0;
import s5.i0;
import s5.x0;
import v62.fa;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dashboard.PersonalizedInsightsSectionKt$GenesisState$1$1", f = "PersonalizedInsightsSection.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f92342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<String, Unit> f92343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s sVar, l<? super String, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f92342a = sVar;
            this.f92343b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f92342a, this.f92343b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            s sVar = this.f92342a;
            if (!sVar.f58584f) {
                this.f92343b.invoke(sVar.f58579a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dashboard.PersonalizedInsightsSectionKt$IndividualMessage$1$1", f = "PersonalizedInsightsSection.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f92344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<String, Unit> f92345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(s sVar, l<? super String, Unit> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f92344a = sVar;
            this.f92345b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f92344a, this.f92345b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            l<String, Unit> lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            s sVar = this.f92344a;
            if (!sVar.f58584f && (lVar = this.f92345b) != null) {
                lVar.invoke(sVar.f58579a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dashboard.PersonalizedInsightsSectionKt$IndividualMessage$3$3$2$1$1", f = "PersonalizedInsightsSection.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f92346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c91.b f92347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z14, c91.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f92346a = z14;
            this.f92347b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f92346a, this.f92347b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f92346a) {
                this.f92347b.d();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f92348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f92349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f92350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b0 b0Var, mc mcVar, p1<Boolean> p1Var) {
            super(0, kotlin.jvm.internal.s.a.class, "closeBottomSheet", "IndividualMessage$lambda$2$5$closeBottomSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/MutableState;)V", 0);
            this.f92348a = b0Var;
            this.f92349b = mcVar;
            this.f92350c = p1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            ge1.b.T(this.f92348a, null, null, new i(this.f92349b, null), 3).J(new v2(this.f92350c, 5));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dashboard.PersonalizedInsightsSectionKt$IndividualMessage$3$4$1", f = "PersonalizedInsightsSection.kt", l = {430}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f92352b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f92353a = new a<>();

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ht.s sVar = ht.s.f85508a;
                zk.a aVar = new zk.a(b91.b.SEE_MORE_LESS.f16959a, t0.b(new o13.p("Action", zBooleanValue ? b91.a.SEE_MORE.f16956a : b91.a.SEE_LESS.f16956a)), 0L, 4, null);
                sVar.getClass();
                ht.s.b(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p1<Boolean> p1Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f92352b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f92352b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92351a;
            if (i14 == 0) {
                r.b(obj);
                a0 a0VarU = r53.s.u(p0.s(new i11.i(this.f92352b, 14)), 1);
                r53.j<? super Object> jVar = a.f92353a;
                this.f92351a = 1;
                if (a0VarU.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(int i14, int i15, h4.r rVar, String str, String str2, m mVar, u4.d dVar) {
        int i16;
        String str3;
        String str4;
        h4.r rVar2;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 481347126);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarK.B(rVar) ? 4 : 2) | i14;
        }
        int i18 = i16 | (((i15 & 2) == 0 && o0VarK.B(dVar)) ? 32 : 16) | (o0VarK.B(str) ? 256 : 128) | (o0VarK.B(str2) ? 2048 : 1024);
        if (o0VarK.n(i18 & 1, (i18 & 1171) != 1170)) {
            o0VarK.G0();
            if ((i14 & 1) == 0 || o0VarK.o0()) {
                if (i17 != 0) {
                    rVar = h4.r.S;
                }
                if ((i15 & 2) != 0) {
                    s62.a.f157643a.getClass();
                    dVar = fa.a(t62.b.f162798a);
                    i18 &= -113;
                }
            } else {
                o0VarK.e();
                if ((i15 & 2) != 0) {
                    i18 &= -113;
                }
            }
            h4.r rVar3 = rVar;
            u4.d dVar2 = dVar;
            o0VarK.h0();
            x1 x1Var = n.f135158a;
            b82.n.c(dVar2, str, str2, rVar3, null, o0VarK, ((i18 >> 3) & 1022) | ((i18 << 9) & 7168), 16);
            str4 = str;
            str3 = str2;
            dVar = dVar2;
            rVar2 = rVar3;
        } else {
            str3 = str2;
            str4 = str;
            o0VarK.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(i14, i15, rVar2, str4, str3, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    public static final void b(h4.r rVar, s sVar, l<? super String, Unit> lVar, m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        sVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1077519830);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(sVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            h4.r rVar3 = rVar;
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(sVar) | ((i16 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(sVar, lVar, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(sVar, lVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, sVar, o0VarE);
            i91.a.f92320a.getClass();
            ub1.f.a(((i16 << 12) & 57344) | 6, i91.a.f92323d, rVar3, sVar.f58580b, sVar.f58583e, sVar.f58581c, o0VarE);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(rVar2, sVar, lVar, i14, i15, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:103:0x0277  */
    /* JADX WARN: Code duplicated, block: B:104:0x0279  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x02be  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:118:0x0309  */
    /* JADX WARN: Code duplicated, block: B:120:0x0317  */
    /* JADX WARN: Code duplicated, block: B:123:0x036d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x038a  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:131:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x043b  */
    /* JADX WARN: Code duplicated, block: B:144:0x043d  */
    /* JADX WARN: Code duplicated, block: B:148:0x044a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x045f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0498  */
    /* JADX WARN: Code duplicated, block: B:161:0x049e  */
    /* JADX WARN: Code duplicated, block: B:163:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:91:0x0167  */
    /* JADX WARN: Code duplicated, block: B:94:0x0177  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h4.r rVar, s sVar, c91.b bVar, l91.a aVar, l<? super String, Unit> lVar, e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar2, m mVar, int i14, int i15) {
        h4.r rVar3;
        int i16;
        int i17;
        l<? super String, Unit> lVar2;
        int i18;
        int i19;
        int i24;
        boolean z14;
        o0 o0Var;
        e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar4;
        h4.r rVar5;
        l<? super String, Unit> lVar3;
        l91.a aVar2;
        p2 p2VarI0;
        h4.r rVar6;
        l91.a aVar3;
        l<? super String, Unit> lVar4;
        e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar7;
        boolean z15;
        boolean z16;
        Object objQ;
        m.a aVar4;
        Object objQ2;
        m.a.C2565a c2565a;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar5;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        h5.g.a.f fVar;
        Object objQ3;
        p1 p1Var;
        mc mcVarF;
        Object objQ4;
        b0 b0Var;
        Context context;
        h4.r.a aVar6;
        j92.b bVar3;
        j92.e eVar2;
        Object objQ5;
        j92.f fVar2;
        h4.r rVar8;
        l<? super String, Unit> lVar5;
        boolean z17;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        o0 o0Var2;
        s sVar2;
        int i25;
        e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar9;
        boolean z18;
        m.a.C2565a c2565a2;
        Object objQ6;
        p1 p1Var2;
        Object objQ7;
        p005kotlin.jvm.internal.j jVar;
        s5.c.b bVar4;
        int iJ;
        boolean z19;
        boolean z24;
        Object objQ8;
        e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar10;
        l91.a aVar7;
        Object objQ9;
        boolean zR;
        Object objQ10;
        sVar.getClass();
        bVar.getClass();
        o0 o0VarE = mVar.E(-435777415);
        p3.c<?> cVar = o0VarE.f135177b;
        int i26 = i15 & 1;
        if (i26 != 0) {
            i16 = i14 | 6;
            rVar3 = rVar;
        } else {
            rVar3 = rVar;
            i16 = (o0VarE.B(rVar3) ? 4 : 2) | i14;
        }
        int i27 = i16 | (o0VarE.r(sVar) ? 32 : 16) | (o0VarE.B(bVar) ? 256 : 128);
        int i28 = i15 & 8;
        if (i28 == 0) {
            if ((i14 & 3072) == 0) {
                i27 |= o0VarE.B(aVar) ? 2048 : 1024;
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
                    i27 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    i27 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (o0VarE.r(rVar2)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i27 |= i24;
                }
                if ((i27 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i27 & 1, z14)) {
                    if (i26 != 0) {
                        rVar6 = h4.r.S;
                    } else {
                        rVar6 = rVar3;
                    }
                    if (i28 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i17 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i19 != 0) {
                        rVar7 = null;
                    } else {
                        rVar7 = rVar2;
                    }
                    x1 x1Var = n.f135158a;
                    boolean zR2 = o0VarE.r(sVar);
                    if ((57344 & i27) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zR2 | z15;
                    objQ = o0VarE.q();
                    aVar4 = m.f135153a;
                    if (z16) {
                        objQ = new b(sVar, lVar4, null);
                        o0VarE.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new b(sVar, lVar4, null);
                            o0VarE.K(objQ);
                        }
                    }
                    l0.e((p) objQ, sVar, o0VarE);
                    objQ2 = o0VarE.q();
                    aVar4.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new bf(22);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarC3 = v.c((l) objQ2, rVar6, true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarC3, o0VarE);
                    h5.g.V.getClass();
                    aVar5 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    mcVarF = e9.f(true, null, o0VarE, 6, 2);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ4);
                    }
                    b0Var = (b0) objQ4;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    String str = sVar.f58580b;
                    aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    eVar2 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new bf(23);
                        o0VarE.K(objQ5);
                    }
                    h4.r rVarC4 = v.c((l) objQ5, rVarA, false);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57757g);
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    rVar8 = rVar6;
                    lVar5 = lVar4;
                    mh.c(str, rVarC4, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 130044);
                    bVar3.getClass();
                    float f14 = eVar2.f97920e;
                    bVar3.getClass();
                    h4.r rVarC5 = c2.l.C(aVar6, f14, eVar2.f97917b, 0.0f, 0.0f, 12);
                    if (rVar7 == null) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    h4.r rVarF = x2.f(wz1.i.e(rVarC5, z17, new h81.a(26), o0VarE, 0), 1.0f);
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarF, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    h4.r rVarA2 = u2.f22900a.a(aVar6, 1.0f, true);
                    c2.j.c cVar2 = c2.j.f22696f;
                    bVar3.getClass();
                    c2.t0.a(rVarA2, c2.j.i(eVar2.f97918c), cVar2, null, 0, 0, z3.f.c(-1677109896, new et1.v(sVar, 23), o0VarE), o0VarE, 1573248, 56);
                    o0Var2 = o0VarE;
                    if (rVar7 != null) {
                        o0Var2.C(641425389);
                        objQ9 = o0Var2.q();
                        c2565a2 = c2565a;
                        if (objQ9 == c2565a2) {
                            objQ9 = p0.n(Boolean.FALSE);
                            o0Var2.K(objQ9);
                        }
                        p1 p1Var3 = (p1) objQ9;
                        boolean z25 = !bVar.g();
                        String strQ = gl1.y.Q(o0Var2, R.string.help_us_improve_insights_rating);
                        i25 = i27;
                        e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar11 = rVar7;
                        z18 = false;
                        ck0.h hVar = new ck0.h(z25, bVar, p1Var3, sVar, rVar11, p1Var, 11);
                        sVar2 = sVar;
                        rVar9 = rVar11;
                        y1.b(strQ, z25, null, 0, z3.f.c(1757585000, hVar, o0Var2), o0Var2, 24576);
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            o0Var2.C(648150994);
                            String str2 = sVar2.f58579a;
                            zR = o0Var2.r(b0Var) | o0Var2.B(mcVarF);
                            objQ10 = o0Var2.q();
                            if (zR || objQ10 == c2565a2) {
                                objQ10 = new d(b0Var, mcVarF, p1Var);
                                o0Var2.K(objQ10);
                            }
                            d(str2, mcVarF, (e23.a) ((k23.g) objQ10), rVar9, o0Var2, (i25 >> 6) & 7168);
                            o0Var2 = o0Var2;
                            o0Var2.g0(false);
                        } else {
                            o0Var2 = o0Var2;
                            o0Var2.C(648701647);
                            o0Var2.g0(false);
                        }
                        o0Var2.g0(false);
                    } else {
                        sVar2 = sVar;
                        i25 = i27;
                        rVar9 = rVar7;
                        z18 = false;
                        c2565a2 = c2565a;
                        o0Var2.C(648715535);
                        o0Var2.g0(false);
                    }
                    o0Var2.g0(true);
                    objQ6 = o0Var2.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = p0.n(Boolean.TRUE);
                        o0Var2.K(objQ6);
                    }
                    p1Var2 = (p1) objQ6;
                    Unit unit = Unit.INSTANCE;
                    objQ7 = o0Var2.q();
                    if (objQ7 == c2565a2) {
                        jVar = null;
                        objQ7 = new e(p1Var2, null);
                        o0Var2.K(objQ7);
                    } else {
                        jVar = null;
                    }
                    l0.e((p) objQ7, unit, o0Var2);
                    o0Var2.C(1679095546);
                    bVar4 = new s5.c.b(z18 ? 1 : 0, 1, jVar);
                    fVar2.getClass();
                    iJ = bVar4.j(d92.c.b(j92.f.f97932i, o0Var2).f157322a);
                    try {
                        bVar4.b(sVar2.f58581c);
                        bVar4.f(iJ);
                        s5.c cVarK = bVar4.k();
                        o0Var2.g0(z18);
                        bVar3.getClass();
                        h4.r rVarF2 = x2.f(c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2), 1.0f);
                        List<d91.h> list = sVar2.f58589k;
                        if ((458752 & i25) == 131072) {
                            z19 = true;
                        } else {
                            z19 = z18 ? 1 : 0;
                        }
                        boolean z26 = z19 | (o0Var2.r(sVar2) ? 1 : 0);
                        if ((i25 & 7168) == 2048) {
                            z18 = true;
                        }
                        z24 = (z26 | z18 ? 1 : 0) | (o0Var2.r(r49) ? 1 : 0);
                        objQ8 = o0Var2.q();
                        if (z24 == 0 || objQ8 == c2565a2) {
                            rVar10 = rVar9;
                            aVar7 = aVar3;
                            ev2.f fVar3 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                            o0Var2.K(fVar3);
                            objQ8 = fVar3;
                        } else {
                            rVar10 = rVar9;
                            aVar7 = aVar3;
                        }
                        o0 o0Var3 = o0Var2;
                        i91.d.a(cVarK, rVarF2, 0, null, p1Var2, null, null, null, list, (l) objQ8, o0Var3, 24576);
                        o0Var = o0Var3;
                        o0Var.g0(true);
                        rVar4 = rVar10;
                        aVar2 = aVar7;
                        rVar5 = rVar8;
                        lVar3 = lVar5;
                    } catch (Throwable th3) {
                        bVar4.f(iJ);
                        throw th3;
                    }
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar4 = rVar2;
                    rVar5 = rVar3;
                    lVar3 = lVar2;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new u0(rVar5, sVar, bVar, aVar2, lVar3, rVar4, i14, i15, 5);
                }
            }
            i27 |= 24576;
            lVar2 = lVar;
            i19 = i15 & 32;
            if (i19 != 0) {
                i27 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (o0VarE.r(rVar2)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i27 |= i24;
            }
            if ((i27 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i27 & 1, z14)) {
                if (i26 != 0) {
                    rVar6 = h4.r.S;
                } else {
                    rVar6 = rVar3;
                }
                if (i28 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i17 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                if (i19 != 0) {
                    rVar7 = null;
                } else {
                    rVar7 = rVar2;
                }
                x1 x1Var2 = n.f135158a;
                boolean zR3 = o0VarE.r(sVar);
                if ((57344 & i27) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zR3 | z15;
                objQ = o0VarE.q();
                aVar4 = m.f135153a;
                if (z16) {
                    aVar4.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new b(sVar, lVar4, null);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new b(sVar, lVar4, null);
                    o0VarE.K(objQ);
                }
                l0.e((p) objQ, sVar, o0VarE);
                objQ2 = o0VarE.q();
                aVar4.getClass();
                c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = new bf(22);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC6 = v.c((l) objQ2, rVar6, true);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC6, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                mcVarF = e9.f(true, null, o0VarE, 6, 2);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ4);
                }
                b0Var = (b0) objQ4;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                String str3 = sVar.f58580b;
                aVar6 = h4.r.S;
                d92.b.f58623a.getClass();
                bVar3 = d92.b.f58625c;
                bVar3.getClass();
                eVar2 = j92.b.f97899b;
                h4.r rVarA3 = c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new bf(23);
                    o0VarE.K(objQ5);
                }
                h4.r rVarC7 = v.c((l) objQ5, rVarA3, false);
                d6.h.f57752b.getClass();
                d6.h hVarA2 = d6.h.a(d6.h.f57757g);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                rVar8 = rVar6;
                lVar5 = lVar4;
                mh.c(str3, rVarC7, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 130044);
                bVar3.getClass();
                float f15 = eVar2.f97920e;
                bVar3.getClass();
                h4.r rVarC8 = c2.l.C(aVar6, f15, eVar2.f97917b, 0.0f, 0.0f, 12);
                if (rVar7 == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                h4.r rVarF3 = x2.f(wz1.i.e(rVarC8, z17, new h81.a(26), o0VarE, 0), 1.0f);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarF3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarA4 = u2.f22900a.a(aVar6, 1.0f, true);
                c2.j.c cVar3 = c2.j.f22696f;
                bVar3.getClass();
                c2.t0.a(rVarA4, c2.j.i(eVar2.f97918c), cVar3, null, 0, 0, z3.f.c(-1677109896, new et1.v(sVar, 23), o0VarE), o0VarE, 1573248, 56);
                o0Var2 = o0VarE;
                if (rVar7 != null) {
                    o0Var2.C(641425389);
                    objQ9 = o0Var2.q();
                    c2565a2 = c2565a;
                    if (objQ9 == c2565a2) {
                        objQ9 = p0.n(Boolean.FALSE);
                        o0Var2.K(objQ9);
                    }
                    p1 p1Var4 = (p1) objQ9;
                    boolean z27 = !bVar.g();
                    String strQ2 = gl1.y.Q(o0Var2, R.string.help_us_improve_insights_rating);
                    i25 = i27;
                    e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar12 = rVar7;
                    z18 = false;
                    ck0.h hVar2 = new ck0.h(z27, bVar, p1Var4, sVar, rVar12, p1Var, 11);
                    sVar2 = sVar;
                    rVar9 = rVar12;
                    y1.b(strQ2, z27, null, 0, z3.f.c(1757585000, hVar2, o0Var2), o0Var2, 24576);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0Var2.C(648150994);
                        String str4 = sVar2.f58579a;
                        zR = o0Var2.r(b0Var) | o0Var2.B(mcVarF);
                        objQ10 = o0Var2.q();
                        if (zR) {
                            objQ10 = new d(b0Var, mcVarF, p1Var);
                            o0Var2.K(objQ10);
                        } else {
                            objQ10 = new d(b0Var, mcVarF, p1Var);
                            o0Var2.K(objQ10);
                        }
                        d(str4, mcVarF, (e23.a) ((k23.g) objQ10), rVar9, o0Var2, (i25 >> 6) & 7168);
                        o0Var2 = o0Var2;
                        o0Var2.g0(false);
                    } else {
                        o0Var2 = o0Var2;
                        o0Var2.C(648701647);
                        o0Var2.g0(false);
                    }
                    o0Var2.g0(false);
                } else {
                    sVar2 = sVar;
                    i25 = i27;
                    rVar9 = rVar7;
                    z18 = false;
                    c2565a2 = c2565a;
                    o0Var2.C(648715535);
                    o0Var2.g0(false);
                }
                o0Var2.g0(true);
                objQ6 = o0Var2.q();
                if (objQ6 == c2565a2) {
                    objQ6 = p0.n(Boolean.TRUE);
                    o0Var2.K(objQ6);
                }
                p1Var2 = (p1) objQ6;
                Unit unit2 = Unit.INSTANCE;
                objQ7 = o0Var2.q();
                if (objQ7 == c2565a2) {
                    jVar = null;
                    objQ7 = new e(p1Var2, null);
                    o0Var2.K(objQ7);
                } else {
                    jVar = null;
                }
                l0.e((p) objQ7, unit2, o0Var2);
                o0Var2.C(1679095546);
                bVar4 = new s5.c.b(z18 ? 1 : 0, 1, jVar);
                fVar2.getClass();
                iJ = bVar4.j(d92.c.b(j92.f.f97932i, o0Var2).f157322a);
                bVar4.b(sVar2.f58581c);
                bVar4.f(iJ);
                s5.c cVarK2 = bVar4.k();
                o0Var2.g0(z18);
                bVar3.getClass();
                h4.r rVarF4 = x2.f(c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2), 1.0f);
                List<d91.h> list2 = sVar2.f58589k;
                if ((458752 & i25) == 131072) {
                    z19 = true;
                } else {
                    z19 = z18 ? 1 : 0;
                }
                boolean z28 = z19 | (o0Var2.r(sVar2) ? 1 : 0);
                if ((i25 & 7168) == 2048) {
                    z18 = true;
                }
                z24 = (z28 | z18 ? 1 : 0) | (o0Var2.r(r49) ? 1 : 0);
                objQ8 = o0Var2.q();
                if (z24 == 0) {
                    rVar10 = rVar9;
                    aVar7 = aVar3;
                    ev2.f fVar4 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                    o0Var2.K(fVar4);
                    objQ8 = fVar4;
                } else {
                    rVar10 = rVar9;
                    aVar7 = aVar3;
                    ev2.f fVar5 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                    o0Var2.K(fVar5);
                    objQ8 = fVar5;
                }
                o0 o0Var4 = o0Var2;
                i91.d.a(cVarK2, rVarF4, 0, null, p1Var2, null, null, null, list2, (l) objQ8, o0Var4, 24576);
                o0Var = o0Var4;
                o0Var.g0(true);
                rVar4 = rVar10;
                aVar2 = aVar7;
                rVar5 = rVar8;
                lVar3 = lVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar4 = rVar2;
                rVar5 = rVar3;
                lVar3 = lVar2;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0(rVar5, sVar, bVar, aVar2, lVar3, rVar4, i14, i15, 5);
            }
        }
        i27 |= 3072;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i27 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                i27 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (o0VarE.r(rVar2)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i27 |= i24;
            }
            if ((i27 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i27 & 1, z14)) {
                if (i26 != 0) {
                    rVar6 = h4.r.S;
                } else {
                    rVar6 = rVar3;
                }
                if (i28 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i17 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                if (i19 != 0) {
                    rVar7 = null;
                } else {
                    rVar7 = rVar2;
                }
                x1 x1Var3 = n.f135158a;
                boolean zR4 = o0VarE.r(sVar);
                if ((57344 & i27) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zR4 | z15;
                objQ = o0VarE.q();
                aVar4 = m.f135153a;
                if (z16) {
                    aVar4.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new b(sVar, lVar4, null);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new b(sVar, lVar4, null);
                    o0VarE.K(objQ);
                }
                l0.e((p) objQ, sVar, o0VarE);
                objQ2 = o0VarE.q();
                aVar4.getClass();
                c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = new bf(22);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC9 = v.c((l) objQ2, rVar6, true);
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC9, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var4 = c2.b0.f22601a;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                mcVarF = e9.f(true, null, o0VarE, 6, 2);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ4);
                }
                b0Var = (b0) objQ4;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                String str5 = sVar.f58580b;
                aVar6 = h4.r.S;
                d92.b.f58623a.getClass();
                bVar3 = d92.b.f58625c;
                bVar3.getClass();
                eVar2 = j92.b.f97899b;
                h4.r rVarA5 = c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new bf(23);
                    o0VarE.K(objQ5);
                }
                h4.r rVarC10 = v.c((l) objQ5, rVarA5, false);
                d6.h.f57752b.getClass();
                d6.h hVarA3 = d6.h.a(d6.h.f57757g);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                rVar8 = rVar6;
                lVar5 = lVar4;
                mh.c(str5, rVarC10, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 130044);
                bVar3.getClass();
                float f16 = eVar2.f97920e;
                bVar3.getClass();
                h4.r rVarC11 = c2.l.C(aVar6, f16, eVar2.f97917b, 0.0f, 0.0f, 12);
                if (rVar7 == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                h4.r rVarF5 = x2.f(wz1.i.e(rVarC11, z17, new h81.a(26), o0VarE, 0), 1.0f);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarF5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarA6 = u2.f22900a.a(aVar6, 1.0f, true);
                c2.j.c cVar4 = c2.j.f22696f;
                bVar3.getClass();
                c2.t0.a(rVarA6, c2.j.i(eVar2.f97918c), cVar4, null, 0, 0, z3.f.c(-1677109896, new et1.v(sVar, 23), o0VarE), o0VarE, 1573248, 56);
                o0Var2 = o0VarE;
                if (rVar7 != null) {
                    o0Var2.C(641425389);
                    objQ9 = o0Var2.q();
                    c2565a2 = c2565a;
                    if (objQ9 == c2565a2) {
                        objQ9 = p0.n(Boolean.FALSE);
                        o0Var2.K(objQ9);
                    }
                    p1 p1Var5 = (p1) objQ9;
                    boolean z29 = !bVar.g();
                    String strQ3 = gl1.y.Q(o0Var2, R.string.help_us_improve_insights_rating);
                    i25 = i27;
                    e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar13 = rVar7;
                    z18 = false;
                    ck0.h hVar3 = new ck0.h(z29, bVar, p1Var5, sVar, rVar13, p1Var, 11);
                    sVar2 = sVar;
                    rVar9 = rVar13;
                    y1.b(strQ3, z29, null, 0, z3.f.c(1757585000, hVar3, o0Var2), o0Var2, 24576);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0Var2.C(648150994);
                        String str6 = sVar2.f58579a;
                        zR = o0Var2.r(b0Var) | o0Var2.B(mcVarF);
                        objQ10 = o0Var2.q();
                        if (zR) {
                            objQ10 = new d(b0Var, mcVarF, p1Var);
                            o0Var2.K(objQ10);
                        } else {
                            objQ10 = new d(b0Var, mcVarF, p1Var);
                            o0Var2.K(objQ10);
                        }
                        d(str6, mcVarF, (e23.a) ((k23.g) objQ10), rVar9, o0Var2, (i25 >> 6) & 7168);
                        o0Var2 = o0Var2;
                        o0Var2.g0(false);
                    } else {
                        o0Var2 = o0Var2;
                        o0Var2.C(648701647);
                        o0Var2.g0(false);
                    }
                    o0Var2.g0(false);
                } else {
                    sVar2 = sVar;
                    i25 = i27;
                    rVar9 = rVar7;
                    z18 = false;
                    c2565a2 = c2565a;
                    o0Var2.C(648715535);
                    o0Var2.g0(false);
                }
                o0Var2.g0(true);
                objQ6 = o0Var2.q();
                if (objQ6 == c2565a2) {
                    objQ6 = p0.n(Boolean.TRUE);
                    o0Var2.K(objQ6);
                }
                p1Var2 = (p1) objQ6;
                Unit unit3 = Unit.INSTANCE;
                objQ7 = o0Var2.q();
                if (objQ7 == c2565a2) {
                    jVar = null;
                    objQ7 = new e(p1Var2, null);
                    o0Var2.K(objQ7);
                } else {
                    jVar = null;
                }
                l0.e((p) objQ7, unit3, o0Var2);
                o0Var2.C(1679095546);
                bVar4 = new s5.c.b(z18 ? 1 : 0, 1, jVar);
                fVar2.getClass();
                iJ = bVar4.j(d92.c.b(j92.f.f97932i, o0Var2).f157322a);
                bVar4.b(sVar2.f58581c);
                bVar4.f(iJ);
                s5.c cVarK3 = bVar4.k();
                o0Var2.g0(z18);
                bVar3.getClass();
                h4.r rVarF6 = x2.f(c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2), 1.0f);
                List<d91.h> list3 = sVar2.f58589k;
                if ((458752 & i25) == 131072) {
                    z19 = true;
                } else {
                    z19 = z18 ? 1 : 0;
                }
                boolean z210 = z19 | (o0Var2.r(sVar2) ? 1 : 0);
                if ((i25 & 7168) == 2048) {
                    z18 = true;
                }
                z24 = (z210 | z18 ? 1 : 0) | (o0Var2.r(r49) ? 1 : 0);
                objQ8 = o0Var2.q();
                if (z24 == 0) {
                    rVar10 = rVar9;
                    aVar7 = aVar3;
                    ev2.f fVar6 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                    o0Var2.K(fVar6);
                    objQ8 = fVar6;
                } else {
                    rVar10 = rVar9;
                    aVar7 = aVar3;
                    ev2.f fVar7 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                    o0Var2.K(fVar7);
                    objQ8 = fVar7;
                }
                o0 o0Var5 = o0Var2;
                i91.d.a(cVarK3, rVarF6, 0, null, p1Var2, null, null, null, list3, (l) objQ8, o0Var5, 24576);
                o0Var = o0Var5;
                o0Var.g0(true);
                rVar4 = rVar10;
                aVar2 = aVar7;
                rVar5 = rVar8;
                lVar3 = lVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar4 = rVar2;
                rVar5 = rVar3;
                lVar3 = lVar2;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0(rVar5, sVar, bVar, aVar2, lVar3, rVar4, i14, i15, 5);
            }
        }
        i27 |= 24576;
        lVar2 = lVar;
        i19 = i15 & 32;
        if (i19 != 0) {
            i27 |= 196608;
        } else if ((i14 & 196608) == 0) {
            if (o0VarE.r(rVar2)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i27 |= i24;
        }
        if ((i27 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i27 & 1, z14)) {
            if (i26 != 0) {
                rVar6 = h4.r.S;
            } else {
                rVar6 = rVar3;
            }
            if (i28 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            if (i17 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar2;
            }
            if (i19 != 0) {
                rVar7 = null;
            } else {
                rVar7 = rVar2;
            }
            x1 x1Var4 = n.f135158a;
            boolean zR5 = o0VarE.r(sVar);
            if ((57344 & i27) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zR5 | z15;
            objQ = o0VarE.q();
            aVar4 = m.f135153a;
            if (z16) {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b(sVar, lVar4, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new b(sVar, lVar4, null);
                o0VarE.K(objQ);
            }
            l0.e((p) objQ, sVar, o0VarE);
            objQ2 = o0VarE.q();
            aVar4.getClass();
            c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new bf(22);
                o0VarE.K(objQ2);
            }
            h4.r rVarC12 = v.c((l) objQ2, rVar6, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC12, o0VarE);
            h5.g.V.getClass();
            aVar5 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var5 = c2.b0.f22601a;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var = (p1) objQ3;
            mcVarF = e9.f(true, null, o0VarE, 6, 2);
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0Var = (b0) objQ4;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str7 = sVar.f58580b;
            aVar6 = h4.r.S;
            d92.b.f58623a.getClass();
            bVar3 = d92.b.f58625c;
            bVar3.getClass();
            eVar2 = j92.b.f97899b;
            h4.r rVarA7 = c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2);
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new bf(23);
                o0VarE.K(objQ5);
            }
            h4.r rVarC13 = v.c((l) objQ5, rVarA7, false);
            d6.h.f57752b.getClass();
            d6.h hVarA4 = d6.h.a(d6.h.f57757g);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            rVar8 = rVar6;
            lVar5 = lVar4;
            mh.c(str7, rVarC13, 0L, null, 0L, null, 0L, hVarA4, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 130044);
            bVar3.getClass();
            float f17 = eVar2.f97920e;
            bVar3.getClass();
            h4.r rVarC14 = c2.l.C(aVar6, f17, eVar2.f97917b, 0.0f, 0.0f, 12);
            if (rVar7 == null) {
                z17 = true;
            } else {
                z17 = false;
            }
            h4.r rVarF7 = x2.f(wz1.i.e(rVarC14, z17, new h81.a(26), o0VarE, 0), 1.0f);
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarF7, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarA8 = u2.f22900a.a(aVar6, 1.0f, true);
            c2.j.c cVar5 = c2.j.f22696f;
            bVar3.getClass();
            c2.t0.a(rVarA8, c2.j.i(eVar2.f97918c), cVar5, null, 0, 0, z3.f.c(-1677109896, new et1.v(sVar, 23), o0VarE), o0VarE, 1573248, 56);
            o0Var2 = o0VarE;
            if (rVar7 != null) {
                o0Var2.C(641425389);
                objQ9 = o0Var2.q();
                c2565a2 = c2565a;
                if (objQ9 == c2565a2) {
                    objQ9 = p0.n(Boolean.FALSE);
                    o0Var2.K(objQ9);
                }
                p1 p1Var6 = (p1) objQ9;
                boolean z211 = !bVar.g();
                String strQ4 = gl1.y.Q(o0Var2, R.string.help_us_improve_insights_rating);
                i25 = i27;
                e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar14 = rVar7;
                z18 = false;
                ck0.h hVar4 = new ck0.h(z211, bVar, p1Var6, sVar, rVar14, p1Var, 11);
                sVar2 = sVar;
                rVar9 = rVar14;
                y1.b(strQ4, z211, null, 0, z3.f.c(1757585000, hVar4, o0Var2), o0Var2, 24576);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0Var2.C(648150994);
                    String str8 = sVar2.f58579a;
                    zR = o0Var2.r(b0Var) | o0Var2.B(mcVarF);
                    objQ10 = o0Var2.q();
                    if (zR) {
                        objQ10 = new d(b0Var, mcVarF, p1Var);
                        o0Var2.K(objQ10);
                    } else {
                        objQ10 = new d(b0Var, mcVarF, p1Var);
                        o0Var2.K(objQ10);
                    }
                    d(str8, mcVarF, (e23.a) ((k23.g) objQ10), rVar9, o0Var2, (i25 >> 6) & 7168);
                    o0Var2 = o0Var2;
                    o0Var2.g0(false);
                } else {
                    o0Var2 = o0Var2;
                    o0Var2.C(648701647);
                    o0Var2.g0(false);
                }
                o0Var2.g0(false);
            } else {
                sVar2 = sVar;
                i25 = i27;
                rVar9 = rVar7;
                z18 = false;
                c2565a2 = c2565a;
                o0Var2.C(648715535);
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
            objQ6 = o0Var2.q();
            if (objQ6 == c2565a2) {
                objQ6 = p0.n(Boolean.TRUE);
                o0Var2.K(objQ6);
            }
            p1Var2 = (p1) objQ6;
            Unit unit4 = Unit.INSTANCE;
            objQ7 = o0Var2.q();
            if (objQ7 == c2565a2) {
                jVar = null;
                objQ7 = new e(p1Var2, null);
                o0Var2.K(objQ7);
            } else {
                jVar = null;
            }
            l0.e((p) objQ7, unit4, o0Var2);
            o0Var2.C(1679095546);
            bVar4 = new s5.c.b(z18 ? 1 : 0, 1, jVar);
            fVar2.getClass();
            iJ = bVar4.j(d92.c.b(j92.f.f97932i, o0Var2).f157322a);
            bVar4.b(sVar2.f58581c);
            bVar4.f(iJ);
            s5.c cVarK4 = bVar4.k();
            o0Var2.g0(z18);
            bVar3.getClass();
            h4.r rVarF8 = x2.f(c2.l.A(aVar6, eVar2.f97920e, 0.0f, 2), 1.0f);
            List<d91.h> list4 = sVar2.f58589k;
            if ((458752 & i25) == 131072) {
                z19 = true;
            } else {
                z19 = z18 ? 1 : 0;
            }
            boolean z212 = z19 | (o0Var2.r(sVar2) ? 1 : 0);
            if ((i25 & 7168) == 2048) {
                z18 = true;
            }
            z24 = (z212 | z18 ? 1 : 0) | (o0Var2.r(r49) ? 1 : 0);
            objQ8 = o0Var2.q();
            if (z24 == 0) {
                rVar10 = rVar9;
                aVar7 = aVar3;
                ev2.f fVar8 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                o0Var2.K(fVar8);
                objQ8 = fVar8;
            } else {
                rVar10 = rVar9;
                aVar7 = aVar3;
                ev2.f fVar9 = new ev2.f(rVar10, sVar, aVar7, context, 12);
                o0Var2.K(fVar9);
                objQ8 = fVar9;
            }
            o0 o0Var6 = o0Var2;
            i91.d.a(cVarK4, rVarF8, 0, null, p1Var2, null, null, null, list4, (l) objQ8, o0Var6, 24576);
            o0Var = o0Var6;
            o0Var.g0(true);
            rVar4 = rVar10;
            aVar2 = aVar7;
            rVar5 = rVar8;
            lVar3 = lVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar4 = rVar2;
            rVar5 = rVar3;
            lVar3 = lVar2;
            aVar2 = aVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(rVar5, sVar, bVar, aVar2, lVar3, rVar4, i14, i15, 5);
        }
    }

    public static final void d(String str, mc mcVar, e23.a<Unit> aVar, e23.r<? super String, ? super d91.f, ? super List<? extends d91.b>, ? super String, Unit> rVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(319808552);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(mcVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(rVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            int i17 = i15;
            w.f111301a.f(gl1.y.Q(o0VarE, R.string.lbl_report_concern), null, null, z3.f.c(-1809587415, new hl1.i(aVar, i16), o0VarE), aVar, mcVar, false, null, z3.f.c(-464833473, new gw1.e(aVar, 11, rVar, str), o0VarE), o0VarE, (57344 & (i17 << 6)) | 805309440 | ((i17 << 12) & 458752), 454);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(str, (Object) mcVar, (e23.a) aVar, (o13.h) rVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    public static final void e(h4.r rVar, c91.b bVar, m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        h4.r rVar3;
        bVar.getClass();
        o0 o0VarE = mVar.E(1987173828);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i18 = i16 | (o0VarE.B(bVar) ? 32 : 16);
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long jC = d0.c(jg.b.F(o0VarE), d92.b.a(o0VarE).e().g(), 14);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_loading);
            h4.r rVarF = x2.f(rVar4, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new i11.g(strQ, 18);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new i11.g(strQ, 18);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = v.c((l) objQ, rVarF, true);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81536n;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarC, o0VarE);
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
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97917b;
            float f16 = eVar2.f97918c;
            float f17 = eVar2.f97920e;
            h4.r rVarF2 = x2.f(c2.l.A(aVar3, f14, 0.0f, 2), 1.0f);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            h4.r rVar5 = rVar4;
            float fD = g6.q.d(d92.c.b(d92.c.e(j92.f.f97930g), o0VarE).f157322a.fontSize);
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarH = x2.h(rVarF2, fD);
            m1.a aVar5 = m1.f128891a;
            c2.q.a(u1.n.e(rVarH, jC, aVar5), o0VarE, 0);
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            h4.r rVarF3 = x2.f(c2.l.B(aVar3, f17, f17, f17, f16), 1.0f);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = k.c(rVarF3, o0VarE);
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
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            h4.r rVarA = u2.f22900a.a(aVar3, 1.0f, true);
            c2.j.c cVar2 = c2.j.f22696f;
            bVar3.getClass();
            c2.t0.a(rVarA, c2.j.i(f16), cVar2, null, 0, 0, z3.f.c(1975651429, new et1.v(bVar, 22), o0VarE), o0VarE, 1573248, 56);
            o0VarE.g0(true);
            bVar3.getClass();
            h4.r rVarF4 = x2.f(c2.l.A(aVar3, f17, 0.0f, 2), 1.0f);
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            i0 i0Var = x0Var.f157322a;
            i0 i0Var2 = x0Var.f157322a;
            c2.q.a(u1.n.e(x2.h(rVarF4, g6.q.d(i0Var.fontSize)), jC, aVar5), o0VarE, 0);
            bVar3.getClass();
            c2.l.f(x2.h(aVar3, f15), o0VarE);
            bVar3.getClass();
            h4.r rVarF5 = x2.f(c2.l.A(aVar3, f17, 0.0f, 2), 1.0f);
            fVar2.getClass();
            c2.q.a(u1.n.e(x2.h(rVarF5, g6.q.d(i0Var2.fontSize)), jC, aVar5), o0VarE, 0);
            bVar3.getClass();
            c2.l.f(x2.h(aVar3, f15), o0VarE);
            bVar3.getClass();
            h4.r rVarF6 = x2.f(c2.l.A(aVar3, f17, 0.0f, 2), 0.66f);
            fVar2.getClass();
            c2.q.a(u1.n.e(x2.h(rVarF6, g6.q.d(i0Var2.fontSize)), jC, aVar5), o0VarE, 0);
            o0VarE.g0(true);
            rVar3 = rVar5;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar3, bVar, i14, i15, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(h4.r rVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        String string;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-583304418);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            s1.f23251a.getClass();
            context.getClass();
            Locale localeA = hb2.h.a(context);
            localeA.getClass();
            String displayName = Locale.forLanguageTag(u.v(str, "_", "-", false)).getDisplayName(localeA);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            i91.a.f92320a.getClass();
            z3.e eVar = i91.a.f92324e;
            displayName.getClass();
            if (displayName.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                char cCharAt = displayName.charAt(0);
                sb3.append((Object) (Character.isLowerCase(cCharAt) ? d53.a.c(cCharAt, localeA) : String.valueOf(cCharAt)));
                sb3.append(displayName.substring(1));
                string = sb3.toString();
            } else {
                string = displayName;
            }
            String strP = gl1.y.P(R.string.language_now_supported, new Object[]{string}, o0VarE);
            String strP2 = gl1.y.P(R.string.ai_now_supports_new_language, new Object[]{displayName}, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.update_language);
            String strQ2 = gl1.y.Q(o0VarE, R.string.not_now_lbl);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i11.i(p1Var, 12);
                o0VarE.K(objQ2);
            }
            int i18 = i16 << 9;
            h4.r rVar4 = rVar3;
            b82.n.b(eVar, strP, strP2, rVar4, strQ, aVar, strQ2, (e23.a) objQ2, o0VarE, (i18 & 7168) | 12582918 | (i18 & 458752), 0);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(217402446);
                c1 c1Var = c1.f110940a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.language_setting);
                String strQ4 = gl1.y.Q(o0VarE, R.string.update_later_in_garmin_connect_plus_feature_settings);
                String strQ5 = gl1.y.Q(o0VarE, R.string.common_button_ok);
                int i19 = i16 & 7168;
                boolean z14 = i19 == 2048;
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new gt1.s(aVar2, 23);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar3 = (e23.a) objQ3;
                boolean z15 = i19 == 2048;
                Object objQ4 = o0VarE.q();
                if (z15 || objQ4 == c2565a) {
                    objQ4 = new gt1.s(aVar2, 24);
                    o0VarE.K(objQ4);
                }
                c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, aVar3, null, (e23.a) objQ4, o0VarE, 0, 0, 729);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(217823364);
                o0VarE.g0(false);
            }
            rVar2 = rVar4;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar2, str, aVar, aVar2, i14, i15);
        }
    }
}
