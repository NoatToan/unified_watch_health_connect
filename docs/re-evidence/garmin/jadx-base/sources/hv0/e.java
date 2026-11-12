package hv0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b12.k;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.firebase.messaging.Constants;
import e23.l;
import e23.p;
import gl1.y;
import i3.i7;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import v62.e1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.grouptrack.GroupTrackFriendsScreenKt$GroupTrackFriendsScreen$1$1", f = "GroupTrackFriendsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f85799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<pu0.a>>> f85800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, x3<? extends g3<? extends List<pu0.a>>> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85799a = context;
            this.f85800b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f85799a, this.f85800b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f85800b.getF182175a().f35300a == fw.p.ERROR) {
                Toast.makeText(this.f85799a, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pu0.a f85801a;

        public b(pu0.a aVar) {
            this.f85801a = aVar;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                b12.b bVar = new b12.b(this.f85801a.f141181c, null, null, null, null, 30, null);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                k.b(null, null, j92.b.f97901d.f97906e, bVar, mVar2, b12.b.f14385f << 9, 19);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f85802a;

        public c(p1<Boolean> p1Var) {
            this.f85802a = p1Var;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                if (this.f85802a.getF182175a().booleanValue()) {
                    mVar2.C(-1372229253);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = e1.a(t62.b.f162798a);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97904c), a0.c(mVar2), mVar2, 48, 0);
                    mVar2.f();
                } else {
                    mVar2.C(-1371884254);
                    mVar2.f();
                }
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f85803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pu0.a f85804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f85805c;

        public d(gv0.d dVar, pu0.a aVar, p1<Boolean> p1Var) {
            this.f85803a = dVar;
            this.f85804b = aVar;
            this.f85805c = p1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            Object next;
            p1<Boolean> p1Var = this.f85805c;
            p1Var.setValue(Boolean.valueOf(!p1Var.getF182175a().booleanValue()));
            String str = this.f85804b.f141179a;
            Boolean f182175a = p1Var.getF182175a();
            f182175a.booleanValue();
            this.f85803a.getClass();
            str.getClass();
            su0.h.f160962a.getClass();
            List<pu0.a> list = su0.h.f160964c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!s.g(((pu0.a) next).f141179a, str));
                pu0.a aVar = (pu0.a) next;
                if (aVar != null) {
                    aVar.f141182d = f182175a;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: hv0.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1705e implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1705e f85806a = new C1705e();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f85807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f85808b;

        public f(l lVar, List list) {
            this.f85807a = lVar;
            this.f85808b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f85807a.invoke(this.f85808b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f85809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gv0.d f85810b;

        public g(List list, gv0.d dVar) {
            this.f85809a = list;
            this.f85810b = dVar;
        }

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
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            String str;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                pu0.a aVar = (pu0.a) this.f85809a.get(iIntValue);
                mVar2.C(-515216515);
                Object objQ = mVar2.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.valueOf(s.g(aVar.f141182d, Boolean.TRUE)));
                    mVar2.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                p2 p2Var = p2.f111205a;
                String str2 = aVar.f141180b;
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                String str3 = aVar.f141180b;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar2.C(1784536225);
                    str = ". " + y.Q(mVar2, R.string.lbl_selected);
                    mVar2.f();
                } else {
                    mVar2.C(-513903575);
                    mVar2.f();
                    str = "";
                }
                c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, tn.k.g(str3, str));
                b92.a aVarB = c0235a.b();
                z3.e eVarC = z3.f.c(1072023521, new b(aVar), mVar2);
                z3.e eVarC2 = z3.f.c(1384129728, new c(p1Var), mVar2);
                gv0.d dVar3 = this.f85810b;
                boolean zR = mVar2.r(dVar3) | mVar2.r(aVar);
                Object objQ2 = mVar2.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new d(dVar3, aVar, p1Var);
                    mVar2.K(objQ2);
                }
                int i15 = b92.a.f16960b;
                p2Var.g(str2, null, aVarB, eVarC, eVarC2, false, false, (e23.a) objQ2, mVar2, 27648, 226);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gv0.d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        e23.a<Unit> aVar2;
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1673452020);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(dVar.f79194k0, o0VarE);
            fw.p pVar = ((g3) p1VarC.getF182175a()).f35300a;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a(context, p1VarC, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(context, p1VarC, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, pVar, o0VarE);
            aVar2 = aVar;
            gl1.d.b(y.Q(o0VarE, R.string.concept_my_friends), aVar2, ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING, null, null, null, z3.f.c(283035802, new hv0.d(i16, p1VarC, dVar), o0VarE), o0VarE, (i15 & 112) | 1572864, 56);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g80.e(dVar, aVar2, i14, 29);
        }
    }
}
