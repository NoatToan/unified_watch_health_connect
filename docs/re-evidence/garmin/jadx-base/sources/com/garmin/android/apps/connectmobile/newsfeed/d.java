package com.garmin.android.apps.connectmobile.newsfeed;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import f2.o;
import f4.s;
import f5.a1;
import f5.b1;
import f5.i2;
import f5.v1;
import f5.y0;
import f5.z0;
import g6.m;
import h4.k;
import h4.r;
import h5.e0;
import hz0.u;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import l6.m.b;
import l72.f0;
import li0.d0;
import li0.n0;
import li0.v0;
import o4.m1;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p007l6.b0;
import p007l6.c0;
import p007l6.p;
import p007l6.q;
import p007l6.v;
import p007l6.y;
import p13.j0;
import p3.b4;
import p3.c2;
import p3.l0;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p5.k0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u0012²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lcom/garmin/android/apps/connectmobile/newsfeed/d$j;", "eventListener", "Lli0/f;", "followAction", "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/newsfeed/d$j;Lli0/f;)V", "j", "a", "", "allDismissed", "", "measuredHeight", "Lg6/f;", "measuredHeightDp", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f39492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f39493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f39494f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f39495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final li0.f f39496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f39497c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/b1;", "", "Lf5/y0;", "measurables", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Ljava/util/List;J)Lf5/a1;", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$measurePolicy$1", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1 f39498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f39499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f39500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f39501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1 f39502e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        public static final class a extends w implements l<v1.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f39503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f39504b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, List list) {
                super(1);
                this.f39503a = yVar;
                this.f39504b = list;
            }

            @Override // e23.l
            public final Unit invoke(v1.a aVar) {
                this.f39503a.e(aVar, this.f39504b);
                return Unit.INSTANCE;
            }
        }

        public b(p1 p1Var, y yVar, p pVar, int i14, p1 p1Var2) {
            this.f39498a = p1Var;
            this.f39499b = yVar;
            this.f39500c = pVar;
            this.f39501d = i14;
            this.f39502e = p1Var2;
        }

        @Override // f5.z0
        public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
            this.f39498a.getF182175a();
            long jF = this.f39499b.f(j8, b1Var.getF68910b(), this.f39500c, list, this.f39501d);
            this.f39502e.getF182175a();
            m.a aVar = m.f76012b;
            return b1.h0(b1Var, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.f39499b, list));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1 f39505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f39506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p1 p1Var, p pVar) {
            super(0);
            this.f39505a = p1Var;
            this.f39506b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.a
        public final Unit invoke() {
            p1 p1Var = this.f39505a;
            p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
            this.f39506b.f110492d = true;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.newsfeed.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp5/k0;", "", "invoke", "(Lp5/k0;)V", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$1", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0707d extends w implements l<k0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f39507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0707d(y yVar) {
            super(1);
            this.f39507a = yVar;
        }

        @Override // e23.l
        public final Unit invoke(k0 k0Var) {
            b0.a(k0Var, this.f39507a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1 f39508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p007l6.m f39509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f39511d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p1 p1Var, p007l6.m mVar, int i14, e23.a aVar, j jVar) {
            super(2);
            this.f39508a = p1Var;
            this.f39509b = mVar;
            this.f39510c = aVar;
            this.f39511d = jVar;
        }

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
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            if ((num.intValue() & 11) == 2 && mVar2.b()) {
                mVar2.e();
            } else {
                x1 x1Var = n.f135158a;
                this.f39508a.setValue(Unit.INSTANCE);
                p007l6.m mVar3 = this.f39509b;
                mVar3.getClass();
                mVar3.c();
                mVar2.C(-874570090);
                l6.m.b bVar = mVar3.f110483b;
                if (bVar == null) {
                    bVar = mVar3.new b();
                    mVar3.f110483b = bVar;
                }
                p007l6.m mVar4 = p007l6.m.this;
                p007l6.e eVarB = mVar4.b();
                p007l6.e eVarB2 = mVar4.b();
                r.a aVar = r.S;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = g.f39514a;
                    mVar2.K(objQ);
                }
                r rVarA = c2.l.A(p007l6.m.a(aVar, eVarB, (l) objQ), d.f39492d, 0.0f, 2);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(gl1.y.Q(mVar2, R.string.msg_no_suggestions_description), rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar2), mVar2, 0, 0, 131068);
                f0 f0Var = f0.f110999a;
                boolean zB = mVar2.B(eVarB);
                Object objQ2 = mVar2.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new h(eVarB);
                    mVar2.K(objQ2);
                }
                r rVarA2 = p007l6.m.a(aVar, eVarB2, (l) objQ2);
                String strQ = gl1.y.Q(mVar2, R.string.social_find_friends);
                hz0.a.f86402a.getClass();
                z3.e eVar = hz0.a.f86403b;
                j jVar = this.f39511d;
                boolean zR = mVar2.r(jVar);
                Object objQ3 = mVar2.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new i(jVar);
                    mVar2.K(objQ3);
                }
                f0Var.e(eVar, strQ, rVarA2, false, (e23.a) objQ3, mVar2, 6, 8);
                mVar2.f();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedSuggestedFollowingViewHolder$EmptySuggestedView$1$1", f = "NewsFeedViewHolders.kt", l = {196}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f39513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(j jVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f39513b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f39513b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39512a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f39512a = 1;
                if (m0.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f39513b.c();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<p007l6.d, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f39514a = new g();

        @Override // e23.l
        public final Unit invoke(p007l6.d dVar) {
            p007l6.d dVar2 = dVar;
            dVar2.getClass();
            p007l6.e eVar = dVar2.f110450c;
            l6.h.c cVar = eVar.f110466c;
            l6.h.b bVar = eVar.f110467d;
            l6.h.c cVar2 = eVar.f110468e;
            l6.h.b bVar2 = eVar.f110469f;
            float f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
            dVar2.f110451d.b(cVar, f14, f14);
            dVar2.f110453f.b(cVar2, f14, f14);
            p6.g gVar = dVar2.f110449b;
            gVar.getClass();
            gVar.u("hRtlBias", new p6.f(0.5f));
            dVar2.f110452e.a(bVar, f14, f14);
            dVar2.f110454g.a(bVar2, f14, f14);
            gVar.u("vBias", new p6.f(0.5f));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements l<p007l6.d, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p007l6.e f39515a;

        public h(p007l6.e eVar) {
            this.f39515a = eVar;
        }

        @Override // e23.l
        public final Unit invoke(p007l6.d dVar) {
            p007l6.d dVar2 = dVar;
            dVar2.getClass();
            p007l6.g gVar = dVar2.f110452e;
            l6.h.b bVar = this.f39515a.f110469f;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            v.b(gVar, bVar, eVar.f97920e, 4);
            q qVar = dVar2.f110451d;
            p007l6.e eVar2 = dVar2.f110450c;
            c0.a(qVar, eVar2.f110466c);
            c0.a(dVar2.f110453f, eVar2.f110468e);
            v.b(dVar2.f110454g, eVar2.f110469f, eVar.f97920e, 4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f39516a;

        public i(j jVar) {
            this.f39516a = jVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f39516a.a();
            return Unit.INSTANCE;
        }
    }

    public interface j {
        void a();

        void b();

        void c();
    }

    static {
        new a(null);
        g6.f.a aVar = g6.f.f75994b;
        f39492d = 60;
        f39493e = PsExtractor.VIDEO_STREAM_MASK;
        f39494f = SyslogConstants.LOG_LOCAL4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2, j jVar, li0.f fVar) {
        super(view2);
        view2.getClass();
        jVar.getClass();
        fVar.getClass();
        this.f39495a = jVar;
        this.f39496b = fVar;
        this.f39497c = view2 instanceof ComposeView ? (ComposeView) view2 : null;
        h(this, j0.f134944a);
    }

    public static void h(d dVar, List list) {
        j jVar = dVar.f39495a;
        dVar.getClass();
        list.getClass();
        jVar.getClass();
        ComposeView composeView = dVar.f39497c;
        if (composeView != null) {
            composeView.setContent(new z3.e(125845329, true, new u(dVar, list, jVar, 0)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    public final void d(j jVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(2086361003);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(jVar) : o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean z14 = (i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(jVar));
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = new f(jVar, null);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(jVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, unit, o0VarE);
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = f39493e + eVar.f97922g;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarB = x2.b(rVarF, 0.0f, f14, 1);
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarC = c2.l.C(rVarB, 0.0f, f15, 0.0f, eVar.f97920e, 5);
            o0VarE.L(-2033384074);
            s1.l.d(0, 0, null, 7);
            o0VarE.L(-270254335);
            o0VarE.g0(false);
            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objK == c2565a) {
                objK = new y(cVar);
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            y yVar = (y) objK;
            o0VarE.L(-492369756);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new p007l6.m();
                o0VarE.K(objQ2);
            }
            o0VarE.g0(false);
            p007l6.m mVar2 = (p007l6.m) objQ2;
            o0VarE.L(-492369756);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            o0VarE.g0(false);
            p1 p1Var = (p1) objQ3;
            o0VarE.L(-492369756);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new p(mVar2);
                o0VarE.K(objQ4);
            }
            o0VarE.g0(false);
            p pVar = (p) objQ4;
            o0VarE.L(-492369756);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                p3.t1 t1Var = p3.t1.f135313a;
                t1Var.getClass();
                c2 c2Var = new c2(unit, t1Var);
                o0VarE.K(c2Var);
                objQ5 = c2Var;
            }
            o0VarE.g0(false);
            p1 p1Var2 = (p1) objQ5;
            f5.k0.a(p5.v.c(new C0707d(yVar), rVarC, false), z3.f.b(-1908965773, new e(p1Var2, mVar2, 0, new c(p1Var, pVar), jVar), o0VarE), new b(p1Var2, yVar, pVar, TsExtractor.TS_STREAM_TYPE_AIT, p1Var), o0VarE, 48, 0);
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, jVar, i14, 25);
        }
    }

    public final void e(s sVar, float f14, li0.f fVar, r rVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-598133140);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(sVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.f(new gp.f(24, cVar, n1Var));
                o0VarE.K(objQ2);
            }
            x3 x3Var = (x3) objQ2;
            if (n1Var.getIntValue() == 0) {
                o0VarE.C(835575687);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                o53.b0 b0Var = (o53.b0) objQ3;
                boolean zR = ((i15 & 112) == 32) | o0VarE.r(b0Var) | o0VarE.r(sVar);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new hz0.w(b0Var, sVar, f14, n1Var);
                    o0VarE.K(objQ4);
                }
                i2.b(null, (e23.p) objQ4, o0VarE, 0, 1);
                o0VarE.g0(false);
            } else {
                o0VarE.C(837239829);
                r rVarH = x2.h(r.S, ((g6.f) x3Var.getF182175a()).f75997a + f15);
                bVar.getClass();
                float f16 = eVar.f97918c;
                bVar.getClass();
                v0.a(sVar, f14, fVar, rVar.then(c2.l.C(rVarH, 0.0f, f16, 0.0f, eVar.f97918c, 5)), o0VarE, (i15 & 896) | (i15 & 126) | (li0.f.f112658h << 6));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dt1.c(this, sVar, f14, fVar, rVar, i14);
        }
    }

    public final void f(i53.c<d0> cVar, j jVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(24673425);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.B(jVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            ArrayList arrayList = new ArrayList();
            for (d0 d0Var : cVar) {
                n0 n0Var = d0Var.f112656i;
                if (!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false)) {
                    arrayList.add(d0Var);
                }
            }
            s sVar = new s();
            sVar.addAll(arrayList);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.f(new et1.d(sVar, 4));
                o0VarE.K(objQ);
            }
            x3 x3Var = (x3) objQ;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            m1.a aVar2 = m1.f128891a;
            r rVarE = u1.n.e(rVarF, jC, aVar2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            r rVarF2 = x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            bVar2.getClass();
            g(c2.l.z(rVarF2, f14, eVar.f97919d), jVar, o0VarE, i15 & 1008);
            if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1625860003);
                d(jVar, o0VarE, (i15 >> 3) & 126);
                o0VarE.g0(false);
            } else {
                c2.l.f(x2.h(ds.e0.g(o0VarE, -1625636028, aVar, 1.0f, bVar2), f15), o0VarE);
                r rVarF3 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                float f16 = f39493e + f15;
                g6.f.a aVar4 = g6.f.f75994b;
                e(sVar, f39494f, this.f39496b, x2.b(rVarF3, 0.0f, f16, 1), o0VarE, (li0.f.f112658h << 6) | 48 | ((i15 << 6) & 57344));
                r rVarF4 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                c2.l.f(x2.h(rVarF4, f15), o0VarE);
                o0VarE.g0(false);
            }
            r rVarF5 = x2.f(aVar, 1.0f);
            bVar2.getClass();
            c2.l.f(u1.n.e(x2.h(rVarF5, f15), d92.b.a(o0VarE).c().b(), aVar2), o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(this, cVar, jVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    public final void g(r rVar, j jVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1845265596);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(jVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = gl1.y.Q(o0VarE, R.string.suggested_following_title);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130046);
            r.a aVar2 = r.S;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new h62.j(jVar, 21);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h62.j(jVar, 21);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = u1.w.d(aVar2, false, null, null, (e23.a) objQ, 15);
            String strQ2 = gl1.y.Q(o0VarE, R.string.see_all_camel_case);
            fVar.getClass();
            mh.c(strQ2, rVarD, d92.b.a(o0VarE).k().a(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(this, rVar, jVar, i14, 10);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/d$a;", "", "<init>", "()V", "", "HIDE_EMPTY_VIEW_DURATION", "J", "Lg6/f;", "suggestionEmptyMessagePadding", "F", "suggestionCardHeight", "suggestionCardWidth", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
