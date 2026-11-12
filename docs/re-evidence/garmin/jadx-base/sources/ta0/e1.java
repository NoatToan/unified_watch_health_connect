package ta0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.mlkit.common.MlKitException;
import java.util.Collection;
import java.util.List;
import kotlin.m3;
import kotlin.t1;
import l72.p2;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.q f163290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f163291b;

        /* JADX INFO: renamed from: ta0.e1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceSelectionScreenKt$DeviceSelectionScreen$1$1$1$1", f = "DeviceSelectionScreen.kt", l = {157}, m = "invokeSuspend", v = 2)
        public static final class C3076a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f163292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f163293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m4.q f163294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m3 f163295d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3076a(m4.q qVar, m3 m3Var, t13.d<? super C3076a> dVar) {
                super(2, dVar);
                this.f163294c = qVar;
                this.f163295d = m3Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3076a c3076a = new C3076a(this.f163294c, this.f163295d, dVar);
                c3076a.f163293b = obj;
                return c3076a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C3076a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b5.c cVar = (b5.c) this.f163293b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f163292a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b5.s sVar = b5.s.Initial;
                    this.f163293b = null;
                    this.f163292a = 1;
                    if (k3.c(cVar, sVar, this, 1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                this.f163294c.y(false);
                m3 m3Var = this.f163295d;
                if (m3Var != null) {
                    m3Var.hide();
                }
                return Unit.INSTANCE;
            }
        }

        public a(m4.q qVar, m3 m3Var) {
            this.f163290a = qVar;
            this.f163291b = m3Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = p008y1.h1.c(h0Var, new C3076a(this.f163290a, this.f163291b, null), dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceSelectionScreenKt$DeviceSelectionScreen$1$2$3$1", f = "DeviceSelectionScreen.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f163297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f163298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, e2.i0 i0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f163297b = str;
            this.f163298c = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f163297b, this.f163298c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163296a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (this.f163297b.length() == 0) {
                    this.f163296a = 1;
                    e2.i0.a aVar2 = e2.i0.f62432x;
                    if (this.f163298c.l(0, 0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<zb0.l, Unit> f163299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ va0.c f163300b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super zb0.l, Unit> lVar, va0.c cVar) {
            this.f163299a = lVar;
            this.f163300b = cVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f163299a.invoke(((va0.c.b) this.f163300b).f176575a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<l90.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<l90.b, Unit> f163301a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.l<? super l90.b, Unit> lVar) {
            this.f163301a = lVar;
        }

        @Override // e23.l
        public final Unit invoke(l90.b bVar) {
            l90.b bVar2 = bVar;
            bVar2.getClass();
            this.f163301a.invoke(bVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f163302a = new e();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f163303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f163304b;

        public f(e23.l lVar, List list) {
            this.f163303a = lVar;
            this.f163304b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f163303a.invoke(this.f163304b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f163305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f163306b;

        public g(e23.l lVar, List list) {
            this.f163305a = lVar;
            this.f163306b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f163305a.invoke(this.f163306b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f163307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f163308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f163309c;

        public h(List list, e23.l lVar, e23.l lVar2) {
            this.f163307a = list;
            this.f163308b = lVar;
            this.f163309c = lVar2;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0089  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
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
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
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
                x1 x1Var = p3.n.f135158a;
                va0.c cVar = (va0.c) this.f163307a.get(iIntValue);
                mVar2.C(125904310);
                boolean z14 = cVar instanceof va0.c.b;
                p3.m.a aVar = p3.m.f135153a;
                if (z14) {
                    mVar2.C(125964418);
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, ((va0.c.b) cVar).f176575a.f203556b);
                    e23.l lVar = this.f163308b;
                    boolean zB = mVar2.B(lVar) | mVar2.B(cVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new c(lVar, cVar);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c(lVar, cVar);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, mVar2, 0, 254);
                    mVar2.f();
                } else {
                    if (!(cVar instanceof va0.c.a)) {
                        throw n23.j.m(mVar2, -273033235);
                    }
                    mVar2.C(126251509);
                    l90.b bVar = ((va0.c.a) cVar).f176574a;
                    e23.l lVar2 = this.f163309c;
                    boolean zB2 = mVar2.B(lVar2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new d(lVar2);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new d(lVar2);
                            mVar2.K(objQ2);
                        }
                    }
                    ua0.b.a(bVar, (e23.l) objQ2, mVar2, 0);
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    public static final void a(x xVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar, e23.a aVar2, ca0.u0 u0Var, p3.m mVar, int i14) {
        p3.o0 o0Var;
        List list;
        ?? r14;
        int i15;
        xVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1761243557);
        int i16 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(u0Var) ? 1048576 : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(xVar.f163469m, o0VarE);
            o13.q qVar = (o13.q) p1VarC.getF182175a();
            p3.m.a aVar3 = p3.m.f135153a;
            if (qVar == null) {
                o0VarE.C(1886782040);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1886782041);
                Object obj = qVar.f128597a;
                if (obj instanceof o13.q.b) {
                    obj = null;
                }
                Collection collection = (Collection) obj;
                if (collection == null || collection.isEmpty()) {
                    o0VarE.C(735194381);
                    boolean z14 = (3670016 & i16) == 1048576;
                    Object objQ = o0VarE.q();
                    if (z14) {
                        objQ = new r(u0Var, 1);
                        o0VarE.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r(u0Var, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    og2.k.d(xVar, (e23.a) objQ, o0VarE, i16 & 14);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(735315467);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            o13.q qVar2 = (o13.q) p1VarC.getF182175a();
            if (qVar2 != null) {
                Object obj2 = qVar2.f128597a;
                if (obj2 instanceof o13.q.b) {
                    obj2 = null;
                }
                list = (List) obj2;
            } else {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                o0VarE.C(1887061506);
                da0.p.d(null, true, null, null, null, null, null, o0VarE, 48, 253);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(1887184359);
                p1 p1VarC2 = s9.c.c(xVar.f163471o, o0VarE);
                boolean zB = o0VarE.B(p1VarC2);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new by1.h(p1VarC2, 12);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new by1.h(p1VarC2, 12);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA);
                Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(f1.class), viewModelStoreOwnerA.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, aVar4);
                o0VarE.g0(false);
                f1 f1Var = (f1) u1VarResolveViewModel;
                p1 p1VarC3 = s9.c.c(f1Var.f163317d, o0VarE);
                Object objQ3 = o0VarE.q();
                aVar3.getClass();
                Object obj3 = p3.m.a.f135155b;
                if (objQ3 == obj3) {
                    objQ3 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1 p1Var = (p1) objQ3;
                Unit unit = Unit.INSTANCE;
                boolean zR = o0VarE.r(xVar) | ((i16 & 112) == 32);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == obj3) {
                    objQ4 = new b1(xVar, lVar, null);
                    o0VarE.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, unit, o0VarE);
                Boolean bool = (Boolean) p1Var.getF182175a();
                bool.booleanValue();
                boolean zR2 = o0VarE.r(xVar);
                Object objQ5 = o0VarE.q();
                if (zR2 || objQ5 == obj3) {
                    objQ5 = new c1(xVar, p1Var, null);
                    o0VarE.K(objQ5);
                }
                p3.l0.e((e23.p) objQ5, bool, o0VarE);
                String str = ((va0.d) p1VarC3.getF182175a()).f176576a;
                boolean zB2 = o0VarE.B(p1VarC3);
                Object objQ6 = o0VarE.q();
                if (zB2 || objQ6 == obj3) {
                    objQ6 = new d1(p1VarC3, p1Var, null);
                    o0VarE.K(objQ6);
                }
                p3.l0.e((e23.p) objQ6, str, o0VarE);
                boolean z15 = !d53.w.J(((va0.d) p1VarC3.getF182175a()).f176576a);
                boolean zR3 = o0VarE.r(f1Var);
                Object objQ7 = o0VarE.q();
                if (zR3 || objQ7 == obj3) {
                    r14 = 0;
                    objQ7 = new z0(f1Var, 0);
                    o0VarE.K(objQ7);
                } else {
                    r14 = 0;
                }
                c.w.a(r14, r14, (e23.a) objQ7, o0VarE, z15);
                o0VarE.L(-1614864554);
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(k0.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(o0VarE, r14), null);
                o0VarE.g0(r14);
                k0 k0Var = (k0) u1VarResolveViewModel2;
                x0.a(k0Var, lVar3, o0VarE, (i16 >> 6) & 112);
                String str2 = ((va0.d) p1VarC3.getF182175a()).f176576a;
                List<va0.c> list2 = ((va0.d) p1VarC3.getF182175a()).f176578c;
                boolean z16 = ((va0.d) p1VarC3.getF182175a()).f176577b;
                boolean zR4 = o0VarE.r(f1Var);
                Object objQ8 = o0VarE.q();
                if (zR4 || objQ8 == obj3) {
                    objQ8 = new a1(f1Var, 0);
                    o0VarE.K(objQ8);
                }
                e23.l lVar4 = (e23.l) objQ8;
                boolean z17 = (i16 & 896) == 256;
                Object objQ9 = o0VarE.q();
                if (z17 || objQ9 == obj3) {
                    objQ9 = new oy0.c(lVar2, p1Var, 7);
                    o0VarE.K(objQ9);
                }
                e23.l lVar5 = (e23.l) objQ9;
                boolean zR5 = o0VarE.r(k0Var);
                Object objQ10 = o0VarE.q();
                if (zR5 || objQ10 == obj3) {
                    i15 = 0;
                    objQ10 = new y0(k0Var, i15);
                    o0VarE.K(objQ10);
                } else {
                    i15 = 0;
                }
                b(str2, list2, z16, lVar4, lVar5, (e23.l) objQ10, aVar, aVar2, o0VarE, (i16 << 6) & 33030144);
                p3.o0 o0Var2 = o0VarE;
                o0Var2.g0(i15);
                o0Var = o0Var2;
            }
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(xVar, lVar, lVar2, lVar3, aVar, aVar2, u0Var, i14, 13);
        }
    }

    public static final void b(String str, List<? extends va0.c> list, boolean z14, e23.l<? super String, Unit> lVar, e23.l<? super zb0.l, Unit> lVar2, e23.l<? super l90.b, Unit> lVar3, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-471245439);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            da0.p.d("device_discovery_device_selection_screen", z14, aVar2, null, null, null, z3.f.c(-1943016118, new dd1.d(o0VarE.A(t1.f91491i), o0VarE.A(t1.f91499q), (Object) str, (e23.l) lVar, (Object) list, (Object) lVar2, (Object) lVar3, (Object) aVar, 25), o0VarE), o0Var, ((i15 >> 3) & 112) | 12582918 | ((i15 >> 15) & 896), 120);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(str, list, z14, lVar, lVar2, lVar3, aVar, aVar2, i14);
        }
    }
}
