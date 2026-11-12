package cu0;

import android.content.Context;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import e23.l;
import e23.p;
import f20.e0;
import fw.m;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import ju0.q;
import l20.r;
import o13.t;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcu0/i;", "Landroidx/lifecycle/u1;", "Lf20/e0;", "phonePrefixProvider", "<init>", "(Lf20/e0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f55582o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f55583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju0.e f55584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<String> f55585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f55586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f55587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f55588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f55589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f55590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<String> f55591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<w61.f<Integer>> f55592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<w61.f<r>> f55593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<w61.f<Unit>> f55594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<w61.f<Unit>> f55595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f55596n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f55597a;

        public b(l lVar) {
            lVar.getClass();
            this.f55597a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f55597a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55597a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventViewModel$save$1", f = "LiveEventViewModel.kt", l = {426, 428}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f55598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2.b f55599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f55601d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q f55603f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f55603f = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(this.f55603f, dVar);
            cVar.f55601d = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            v2 v2Var;
            b0 b0Var = (b0) this.f55601d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55600c;
            i iVar = i.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    qVar = this.f55598a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v2Var = this.f55599b;
                    o13.r.b(obj);
                }
                a2 a2Var = a2.LIVE_EVENT_SHARING;
                v2.b bVar = (v2.b) v2Var;
                String strF = e5.f(bVar.f47386a, "call was successful, sending value: ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LiveEventViewModel", strF);
                int i15 = i.f55582o;
                iVar.A4().j(m.a.g(m.f73767e, bVar.f47386a, 1));
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            int i16 = i.f55582o;
            m<q> mVarD = iVar.A4().d();
            qVar = mVarD != null ? mVarD.f73770c : null;
            q qVar2 = this.f55603f;
            q qVar3 = qVar2 == null ? qVar : qVar2;
            String strD = iVar.f55585c.d();
            i2.f36769a.getClass();
            i2.a.k(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "dtoToSave: " + qVar2 + ", \ncurrentSettingsDTO: " + qVar + ", \npayload: " + qVar3 + ", \ndeviceId: " + strD);
            if (qVar3 != null && strD != null) {
                iVar.A4().j(m.a.f(m.f73767e, null, null, 3));
                ju0.e eVar = iVar.f55584b;
                this.f55601d = b0Var;
                this.f55598a = qVar;
                this.f55600c = 1;
                obj = eVar.g(strD, qVar3, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.b) {
                this.f55601d = b0Var;
                this.f55598a = null;
                this.f55599b = (v2.b) v2Var2;
                this.f55600c = 2;
                if (i.x4(iVar, this) != aVar) {
                    v2Var = v2Var2;
                    a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                    v2.b bVar2 = (v2.b) v2Var;
                    String strF2 = e5.f(bVar2.f47386a, "call was successful, sending value: ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "LiveEventViewModel", strF2);
                    int i17 = i.f55582o;
                    iVar.A4().j(m.a.g(m.f73767e, bVar2.f47386a, 1));
                }
                return aVar;
            }
            i2.f36769a.getClass();
            i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "call was un-successful, sending previous value: " + qVar);
            int i18 = i.f55582o;
            iVar.A4().j(m.a.b(m.f73767e, new fw.l(), qVar, 1));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public i(e0 e0Var) {
        e0Var.getClass();
        this.f55583a = e0Var;
        ju0.e.f100881g.getClass();
        this.f55584b = ju0.e.a.a();
        y0<String> y0Var = new y0<>();
        this.f55585c = y0Var;
        final int i14 = 0;
        this.f55586d = t1.b(y0Var, new l(this) { // from class: cu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f55581b;

            {
                this.f55581b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
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
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x01a2: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:87:0x01a1, B:144:0x01a2] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x0192: CHECK_CAST (iu0.a) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 658
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: cu0.h.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.f55587e = o13.m.b(new cq0.g(this, 4));
        final int i15 = 1;
        this.f55588f = t1.a(A4(), new l(this) { // from class: cu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f55581b;

            {
                this.f55581b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
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
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x01a2: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:87:0x01a1, B:144:0x01a2] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x0192: CHECK_CAST (iu0.a) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 658
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: cu0.h.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i16 = 2;
        this.f55589g = t1.a(A4(), new l(this) { // from class: cu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f55581b;

            {
                this.f55581b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
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
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x01a2: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:87:0x01a1, B:144:0x01a2] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x0192: CHECK_CAST (iu0.a) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 658
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: cu0.h.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i17 = 3;
        this.f55590h = t1.a(A4(), new l(this) { // from class: cu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f55581b;

            {
                this.f55581b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
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
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x01a2: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:87:0x01a1, B:144:0x01a2] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x0192: CHECK_CAST (iu0.a) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 658
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: cu0.h.invoke(java.lang.Object):java.lang.Object");
            }
        });
        y0<String> y0Var2 = new y0<>();
        this.f55591i = y0Var2;
        this.f55592j = new y0<>();
        this.f55593k = new y0<>();
        this.f55594l = new y0<>();
        this.f55595m = new y0<>();
        this.f55596n = o13.m.b(new com.google.accompanist.drawablepainter.a(12));
        y0Var2.m(s3.b() ? "LiveEventSharingUnsupportedFragment" : "LiveEventSharingMainFragment");
        sd2.f fVar = null;
        Object obj = null;
        long jR = GCMSettingManager.r(fd0.d.LIVE_EVENT_SHARING, null);
        boolean zC = g.c(jR);
        f12.l.f68084a.getClass();
        String strValueOf = g.c(f12.l.a.a().s4()) ? String.valueOf(f12.l.a.a().s4()) : null;
        a2 a2Var = a2.LIVE_EVENT_SHARING;
        String strU = v.h.u(jR, "init{} lastDeviceSelected: ", ", preferredActivityTracker: ", strValueOf);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveEventViewModel", strU);
        if (jR != -1 && zC) {
            strValueOf = String.valueOf(jR);
        } else if (!g22.n.d(strValueOf)) {
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE != null) {
                for (Object obj2 : arrayListE) {
                    if (g.c(((sd2.f) obj2).getUnitID())) {
                        obj = obj2;
                        break;
                    }
                }
                fVar = (sd2.f) obj;
            }
            if (fVar == null || (strValueOf = String.valueOf(fVar.getUnitID())) == null) {
                strValueOf = "-1";
            }
        }
        this.f55585c.m(strValueOf != null ? strValueOf : "-1");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler.sendSubscription(r2, r3, r12, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler.cancelSubscription(r11, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(i iVar, v13.c cVar) {
        j jVar;
        Long l14;
        iVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f55607d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f55607d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(iVar, cVar);
            }
        } else {
            jVar = new j(iVar, cVar);
        }
        Object obj = jVar.f55605b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f55607d;
        if (i15 == 0) {
            o13.r.b(obj);
            String strD = iVar.f55585c.d();
            Long lJ = strD != null ? d53.t.j(strD) : null;
            if (lJ == null) {
                return Unit.INSTANCE;
            }
            ju0.e eVar = iVar.f55584b;
            long jLongValue = lJ.longValue();
            jVar.f55604a = lJ;
            jVar.f55607d = 1;
            ju0.e.a aVar2 = ju0.e.f100881g;
            Object objA = eVar.a(jLongValue, jVar, false);
            if (objA != aVar) {
                Long l15 = lJ;
                obj = objA;
                l14 = l15;
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l14 = jVar.f55604a;
        o13.r.b(obj);
        gu0.b bVar = (gu0.b) obj;
        if (bVar != null ? s.g(bVar.f79037b, Boolean.TRUE) : false) {
            GarminConnectMobileApp.f28685g.getClass();
            Context contextA = GarminConnectMobileApp.a.a();
            long jLongValue2 = l14.longValue();
            jVar.f55604a = null;
            jVar.f55607d = 2;
        } else {
            long jLongValue3 = l14.longValue();
            jVar.f55604a = null;
            jVar.f55607d = 3;
        }
        return aVar;
    }

    public final y0<m<q>> A4() {
        return (y0) this.f55587e.getValue();
    }

    public final void B4(boolean z14) {
        q qVar;
        m<q> mVarD = A4().d();
        q qVarA = null;
        if (mVarD != null && (qVar = mVarD.f73770c) != null) {
            qVarA = q.a(qVar, null, Boolean.valueOf(z14), null, 253);
        }
        A4().m(m.a.g(m.f73767e, qVarA, 1));
    }

    public final void C4(q qVar) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new c(qVar, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    public final void D4(boolean z14) {
        q qVar;
        q qVarA;
        q qVar2;
        a2 a2Var = a2.LIVE_EVENT_SHARING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("toggleLiveEventSharing() selectedValue: ", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveEventViewModel", strH);
        if (z14) {
            m<q> mVarD = A4().d();
            if (mVarD == null || (qVar2 = mVarD.f73770c) == null) {
                qVarA = null;
            } else {
                qVarA = q.a(qVar2, Boolean.valueOf(z14), null, Long.valueOf(DateTime.now().plusHours(24).getMillis()), 250);
            }
        } else {
            m<q> mVarD2 = A4().d();
            if (mVarD2 == null || (qVar = mVarD2.f73770c) == null) {
                qVarA = null;
            } else {
                qVarA = q.a(qVar, Boolean.valueOf(z14), null, null, 250);
            }
        }
        i2.a.b(a2Var, "LiveEventViewModel", "dto to Save: " + qVarA);
        C4(qVarA);
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new k(this, z14, null), 2);
    }

    public final void E4(boolean z14) {
        q qVar;
        a2 a2Var = a2.LIVE_EVENT_SHARING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("toggleLiveTrack() selectedValue: ", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveEventViewModel", strH);
        m<q> mVarD = A4().d();
        q qVarA = null;
        if (mVarD != null && (qVar = mVarD.f73770c) != null) {
            qVarA = q.a(qVar, null, Boolean.valueOf(z14), null, 253);
        }
        i2.a.b(a2Var, "LiveEventViewModel", "dto to Save: " + qVarA);
        C4(qVarA);
    }

    public final void F4(ju0.c cVar) {
        List<ju0.c> listF;
        List<ju0.c> listF2;
        List<ju0.c> listF3;
        List<ju0.c> listF4;
        List<ju0.c> listF5;
        cVar.getClass();
        i2.f36769a.getClass();
        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "updateIntervalsFrequency() field: " + cVar);
        m<q> mVarD = A4().d();
        q qVar = mVarD != null ? mVarD.f73770c : null;
        if (qVar == null || (listF5 = qVar.f()) == null || !listF5.contains(cVar)) {
            if (qVar != null && (listF4 = qVar.f()) != null) {
                listF4.remove(ju0.c.EVERY_LAP);
            }
            if (qVar != null && (listF3 = qVar.f()) != null) {
                listF3.remove(ju0.c.DISTANCE);
            }
            if (qVar != null && (listF2 = qVar.f()) != null) {
                listF2.remove(ju0.c.TIME);
            }
            if ((qVar != null ? qVar.f() : null) == null && qVar != null) {
                qVar.p(new ArrayList());
            }
            if (qVar != null && (listF = qVar.f()) != null) {
                listF.add(cVar);
            }
            A4().m(m.a.g(m.f73767e, qVar, 1));
        }
    }

    public final void G4(ju0.b bVar) {
        List<ju0.b> listE;
        List<ju0.b> listE2;
        bVar.getClass();
        i2.f36769a.getClass();
        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "updateMsgContentToggle() field: " + bVar);
        m<q> mVarD = A4().d();
        q qVar = mVarD != null ? mVarD.f73770c : null;
        if (qVar == null || (listE2 = qVar.e()) == null || !listE2.contains(bVar)) {
            if ((qVar != null ? qVar.e() : null) == null && qVar != null) {
                qVar.o(new ArrayList());
            }
            if (qVar != null && (listE = qVar.e()) != null) {
                listE.add(bVar);
            }
        } else {
            List<ju0.b> listE3 = qVar.e();
            if (listE3 != null) {
                listE3.remove(bVar);
            }
        }
        A4().m(m.a.g(m.f73767e, qVar, 1));
    }

    public final void H4(double d14) {
        i2.f36769a.getClass();
        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "updateTargetDistance() meters: " + d14);
        m<q> mVarD = A4().d();
        q qVar = mVarD != null ? mVarD.f73770c : null;
        if (qVar != null) {
            qVar.q(Integer.valueOf((int) (d14 * 100.0d)));
        }
        A4().m(m.a.g(m.f73767e, qVar, 1));
    }

    public final void y4(ju0.c cVar) {
        List<ju0.c> listF;
        List<ju0.c> listF2;
        cVar.getClass();
        i2.f36769a.getClass();
        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "addBasicUpdates() field: " + cVar);
        m<q> mVarD = A4().d();
        q qVar = mVarD != null ? mVarD.f73770c : null;
        if (qVar == null || (listF2 = qVar.f()) == null || !listF2.contains(cVar)) {
            if ((qVar != null ? qVar.f() : null) == null && qVar != null) {
                qVar.p(new ArrayList());
            }
            if (qVar != null && (listF = qVar.f()) != null) {
                listF.add(cVar);
            }
        } else {
            List<ju0.c> listF3 = qVar.f();
            if (listF3 != null) {
                listF3.remove(cVar);
            }
        }
        A4().m(m.a.g(m.f73767e, qVar, 1));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    public final iu0.e z4(q qVar, sd2.f fVar) {
        ju0.c cVar;
        Integer numValueOf;
        List<ju0.c> listF;
        List<ju0.b> listE;
        List<ju0.b> listE2;
        List<ju0.b> listE3;
        List<ju0.c> listF2;
        Integer liveEventSharingTargetDistance;
        List<ju0.b> listE4;
        i2.f36769a.getClass();
        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "buildMessageContentUIModel() settingsDTO: " + qVar);
        boolean zContains = false;
        boolean z14 = (qVar == null || (listE4 = qVar.e()) == null || !listE4.contains(ju0.b.EST_COMPLETION_TIME)) ? false : true;
        String productNumber = fVar != null ? fVar.getProductNumber() : null;
        boolean zV = productNumber != null ? u0.v(productNumber) : false;
        double dIntValue = (zV ? iu0.b.METRIC_CENTURY : iu0.b.FIVE_K).f95011a;
        if (qVar != null && (liveEventSharingTargetDistance = qVar.getLiveEventSharingTargetDistance()) != null) {
            dIntValue = ((double) liveEventSharingTargetDistance.intValue()) / 100.0d;
        }
        double d14 = dIntValue;
        if (qVar != null && (listF2 = qVar.f()) != null) {
            cVar = ju0.c.TIME;
            if (listF2.contains(cVar) && qVar.k() > 0) {
                numValueOf = Integer.valueOf(qVar.k());
            } else if (qVar != null) {
                cVar = ju0.c.EVERY_LAP;
                if (qVar != null) {
                    numValueOf = Integer.valueOf(qVar.k());
                } else {
                    numValueOf = null;
                }
            } else {
                cVar = ju0.c.EVERY_LAP;
                if (qVar != null) {
                    numValueOf = Integer.valueOf(qVar.k());
                } else {
                    numValueOf = null;
                }
            }
        } else if (qVar != null || (listF = qVar.f()) == null) {
            cVar = ju0.c.EVERY_LAP;
            if (qVar != null) {
                numValueOf = Integer.valueOf(qVar.k());
            } else {
                numValueOf = null;
            }
        } else {
            cVar = ju0.c.DISTANCE;
            if (!listF.contains(cVar) || qVar.b() <= 0) {
                cVar = ju0.c.EVERY_LAP;
                if (qVar != null) {
                    numValueOf = Integer.valueOf(qVar.k());
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = Integer.valueOf(qVar.b());
            }
        }
        Integer num = numValueOf;
        ju0.c cVar2 = cVar;
        y0<String> y0Var = this.f55585c;
        String strD = y0Var.d();
        long j8 = strD != null ? Long.parseLong(strD) : -1L;
        boolean zI = km2.a.i(j8, null, SupportedCapability.LTE_SUPPORT.ordinal());
        boolean zI2 = km2.a.i(j8, null, SupportedCapability.SPORT_CYCLING.ordinal());
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        String strD2 = y0Var.d();
        boolean z15 = s.g(lVarA.g0(strD2 != null ? Long.parseLong(strD2) : -1L).getLivetrackWithLiveEventSharing(), Boolean.TRUE) || zI;
        boolean zContains2 = (qVar == null || (listE3 = qVar.e()) == null) ? false : listE3.contains(ju0.b.CUMULATIVE_TIME);
        boolean zContains3 = (qVar == null || (listE2 = qVar.e()) == null) ? false : listE2.contains(ju0.b.PACE_SPEED);
        if (qVar != null && (listE = qVar.e()) != null) {
            zContains = listE.contains(ju0.b.LAST_LAP_TIME);
        }
        return new iu0.e(zContains2, zContains3, zContains, cVar2, num, z14, d14, qVar != null ? qVar.getLiveTrackEnabled() : null, z15, zI, zI2, zV);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
