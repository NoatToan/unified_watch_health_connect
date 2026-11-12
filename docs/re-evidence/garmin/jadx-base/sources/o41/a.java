package o41;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f32.e;
import f32.j;
import f32.l;
import f32.m;
import f32.p;
import g22.k;
import i41.f;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import t13.d;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo41/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m41.b f129055a = m41.b.a.a(m41.b.f116598c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g41.a f129056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<List<f>> f129057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<i41.b> f129058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<i41.b> f129059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f129060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f129061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f129062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f129063i;

    /* JADX INFO: renamed from: o41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"o41/a$a", "Lf32/e;", "Li41/b;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2469a implements e<i41.b> {

        /* JADX INFO: renamed from: o41.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.overnighthrv.viewmodel.HrvDetailViewModel$detailsDataAdapter$1", f = "HrvDetailViewModel.kt", l = {53}, m = "requestDetails", v = 2)
        public static final class C2470a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f129065a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f129067c;

            public C2470a(d<? super C2470a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f129065a = obj;
                this.f129067c |= Integer.MIN_VALUE;
                return C2469a.this.a(null, this);
            }
        }

        public C2469a() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        @Override // f32.e
        public final Object a(DateTime dateTime, d<? super i41.b> dVar) throws Exception {
            C2470a c2470a;
            if (dVar instanceof C2470a) {
                c2470a = (C2470a) dVar;
                int i14 = c2470a.f129067c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2470a.f129067c = i14 - Integer.MIN_VALUE;
                } else {
                    c2470a = new C2470a(dVar);
                }
            } else {
                c2470a = new C2470a(dVar);
            }
            Object objJ = c2470a.f129065a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2470a.f129067c;
            a aVar2 = a.this;
            if (i15 == 0) {
                r.b(objJ);
                m41.b bVar = aVar2.f129055a;
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                c2470a.f129067c = 1;
                bVar.getClass();
                objJ = f0.J(bVar, new m41.d(bVar, oVarT, null), c2470a);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                T t7 = ((v2.b) v2Var).f47386a;
                if (t7 instanceof i41.b) {
                    aVar2.f129058d.j(t7);
                    return (i41.b) t7;
                }
            }
            if (v2Var instanceof v2.a) {
                aVar2.f129058d.j(null);
                throw ((v2.a) v2Var).f47383a;
            }
            aVar2.f129058d.j(null);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"o41/a$b", "Lf32/p;", "", "Li41/f;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends p<List<? extends f>> {

        /* JADX INFO: renamed from: o41.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.overnighthrv.viewmodel.HrvDetailViewModel$hrvSummaryDataAdapter$1", f = "HrvDetailViewModel.kt", l = {75}, m = "requestSafeSummary", v = 2)
        public static final class C2471a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f129069a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f129071c;

            public C2471a(d<? super C2471a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f129069a = obj;
                this.f129071c |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, d<? super v2<? extends List<? extends f>>> dVar) throws Exception {
            C2471a c2471a;
            if (dVar instanceof C2471a) {
                c2471a = (C2471a) dVar;
                int i14 = c2471a.f129071c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2471a.f129071c = i14 - Integer.MIN_VALUE;
                } else {
                    c2471a = new C2471a(dVar);
                }
            } else {
                c2471a = new C2471a(dVar);
            }
            Object objA = c2471a.f129069a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2471a.f129071c;
            a aVar2 = a.this;
            if (i15 == 0) {
                r.b(objA);
                m41.b bVar = aVar2.f129055a;
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                LocalDate localDate2 = dateTime2.toLocalDate();
                localDate2.getClass();
                o oVarT2 = k.t(localDate2);
                c2471a.f129071c = 1;
                objA = bVar.a(oVarT, oVarT2, c2471a);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            v2 v2Var = (v2) objA;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    throw ((v2.a) v2Var).f47383a;
                }
                u0.r();
                return null;
            }
            v2.b bVar2 = (v2.b) v2Var;
            T t7 = bVar2.f47386a;
            if (!(t7 instanceof i41.e)) {
                aVar2.f129057c.j(null);
                return new v2.b(null, bVar2.f47387b, null, null, 12, null);
            }
            i41.e eVar = (i41.e) t7;
            aVar2.f129057c.j(eVar.b());
            return new v2.b(eVar.b(), bVar2.f47387b, null, null, 12, null);
        }
    }

    public a() {
        g41.a aVar = (g41.a) KoinJavaComponent.get$default(g41.a.class, null, null, 6, null);
        this.f129056b = aVar;
        new y0();
        this.f129057c = new y0<>();
        y0<i41.b> y0Var = new y0<>();
        this.f129058d = y0Var;
        this.f129059e = y0Var;
        p2 p2VarA = q2.a(new o41.b(aVar.a()));
        this.f129060f = p2VarA;
        this.f129061g = s.d(p2VarA);
        this.f129062h = new l(new f32.a(v1.a(this), new C2469a(), null, 4, null));
        this.f129063i = new m(new j(v1.a(this), new b(), null, 4, null));
    }
}
