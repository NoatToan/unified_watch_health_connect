package p51;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o51.g;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.a2;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;
import v41.b0;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp51/c;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr41/a;", "paceProApiRepository", "Ls41/a;", "paceProDelegate", "<init>", "(Landroid/content/Context;Lr41/a;Ls41/a;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r41.a f136152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41.a f136153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f136154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f136155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f136156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f136157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o22.b f136158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f136159h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProListViewModel$1", f = "PaceProListViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136160a;

        /* JADX INFO: renamed from: p51.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2576a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f136162a;

            public C2576a(c cVar) {
                this.f136162a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object value;
                g gVar = (g) obj;
                p2 p2Var = this.f136162a.f136155d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, o51.d.b((o51.d) value, false, false, false, null, gVar, 15)));
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to p51.c$a for r4v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f136160a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
            Le:
                r5 = 0
                return r5
            L10:
                o13.r.b(r5)
                goto L2d
            L14:
                o13.r.b(r5)
                p51.c r5 = p51.c.this
                v41.b0 r1 = r5.f136154c
                r53.b2 r1 = r1.f175576f
                p51.c$a$a r3 = new p51.c$a$a
                r3.<init>(r5)
                r4.f136160a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L2d
                return r0
            L2d:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: p51.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProListViewModel$fetchPaceProPlans$1", f = "PaceProListViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136163a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f136165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f136166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, Context context, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f136165c = z14;
            this.f136166d = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f136165c, this.f136166d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            o51.d dVar;
            Object value2;
            Object value3;
            o51.d dVar2;
            Object value4;
            Object value5;
            o51.d dVar3;
            ArrayList arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136163a;
            boolean z14 = this.f136165c;
            c cVar = c.this;
            if (i14 == 0) {
                r.b(obj);
                p2 p2Var = cVar.f136155d;
                do {
                    value = p2Var.getValue();
                    dVar = (o51.d) value;
                } while (!p2Var.b(value, z14 ? o51.d.b(dVar, false, true, false, null, null, 29) : o51.d.b(dVar, true, false, false, null, null, 30)));
                r41.a aVar2 = cVar.f136152a;
                this.f136163a = 1;
                r41.a.C2825a c2825a = r41.a.f150289c;
                aVar2.getClass();
                obj = f0.J(aVar2, new r41.e(aVar2, null, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                List list = (List) ((v2.b) v2Var).f47386a;
                p2 p2Var2 = cVar.f136157f;
                do {
                    value4 = p2Var2.getValue();
                } while (!p2Var2.b(value4, h0.M0(list)));
                p2 p2Var3 = cVar.f136155d;
                do {
                    value5 = p2Var3.getValue();
                    dVar3 = (o51.d) value5;
                    List listM0 = h0.M0(list);
                    arrayList = new ArrayList(y.r(listM0, 10));
                    Iterator it = listM0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(k51.b.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) it.next(), this.f136166d));
                    }
                } while (!p2Var3.b(value5, o51.d.b(dVar3, false, false, false, i53.a.j(arrayList), null, 19)));
            } else {
                cVar.f136158g.a();
                p2 p2Var4 = cVar.f136155d;
                do {
                    value2 = p2Var4.getValue();
                } while (!p2Var4.b(value2, o51.d.b((o51.d) value2, false, false, true, null, null, 27)));
            }
            p2 p2Var5 = cVar.f136155d;
            do {
                value3 = p2Var5.getValue();
                dVar2 = (o51.d) value3;
            } while (!p2Var5.b(value3, z14 ? o51.d.b(dVar2, false, false, false, null, null, 29) : o51.d.b(dVar2, false, false, false, null, null, 30)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: p51.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lo51/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProListViewModel$paceProListFlow$1", f = "PaceProListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2577c extends i implements p<j<? super o51.d>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f136168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2577c(Context context, t13.d<? super C2577c> dVar) {
            super(2, dVar);
            this.f136168b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C2577c(this.f136168b, dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super o51.d> jVar, t13.d<? super Unit> dVar) {
            return ((C2577c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            c.this.x4(this.f136168b, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, r41.a aVar, s41.a aVar2) {
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f136152a = aVar;
        this.f136153b = aVar2;
        this.f136154c = new b0(v1.a(this), aVar, aVar2);
        boolean z14 = false;
        boolean z15 = false;
        p2 p2VarA = q2.a(new o51.d(false, z14, z15, null, null, 31, null));
        this.f136155d = p2VarA;
        v vVar = new v(new C2577c(context, null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.f136156e = s.K(vVar, aVarA, k2.a.f150706c, new o51.d(z14, z15, false, objArr, null, 31, null));
        this.f136157f = q2.a(j0.f134944a);
        o22.b bVar = new o22.b(context, v1.a(this));
        this.f136158g = bVar;
        this.f136159h = bVar.f128682d;
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        aVar2.d();
    }

    public final void x4(Context context, boolean z14) {
        context.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new b(z14, context, null), 2);
    }
}
