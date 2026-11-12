package lm0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b82.t0;
import c.w;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.u;
import h5.e0;
import kotlin.m3;
import kotlin.t1;
import l72.r1;
import lc.u0;
import li0.x;
import o13.r;
import o4.m1;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import x5.v;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupInformationPageScreenKt$GroupInformationPageScreen$1$1", f = "GroupInformationPageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km0.b f113565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(km0.b bVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f113565a = bVar;
            this.f113566b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f113565a, this.f113566b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0021  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            String str = this.f113565a.f105299c;
            if (g22.n.d(str)) {
                jm0.e.f99565a.getClass();
                str.getClass();
                if (g22.n.c(str) > 200) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            this.f113566b.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupInformationPageScreenKt$GroupInformationPageScreen$2$1", f = "GroupInformationPageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km0.b f113567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(km0.b bVar, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f113567a = bVar;
            this.f113568b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f113567a, this.f113568b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0021  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            String str = this.f113567a.f105300d;
            if (g22.n.d(str)) {
                jm0.e.f99565a.getClass();
                str.getClass();
                if (g22.n.c(str) > 70) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            this.f113568b.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupInformationPageScreenKt$GroupInformationPageScreen$3$1", f = "GroupInformationPageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km0.b f113569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(km0.b bVar, p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f113569a = bVar;
            this.f113570b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f113569a, this.f113570b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            String str = this.f113569a.f105301e;
            if (g22.n.d(str)) {
                jm0.e.f99565a.getClass();
                if (jm0.e.g(str)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            this.f113570b.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupInformationPageScreenKt$GroupInformationPageScreen$4$1", f = "GroupInformationPageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km0.b f113571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(km0.b bVar, p1<Boolean> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f113571a = bVar;
            this.f113572b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f113571a, this.f113572b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            String str = this.f113571a.f105302f;
            if (g22.n.d(str)) {
                jm0.e.f99565a.getClass();
                if (jm0.e.h(str)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            this.f113572b.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupInformationPageScreenKt$GroupInformationPageScreen$5$1", f = "GroupInformationPageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km0.b f113573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(km0.b bVar, p1<Boolean> p1Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f113573a = bVar;
            this.f113574b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f113573a, this.f113574b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            String str = this.f113573a.f105303g;
            if (g22.n.d(str)) {
                jm0.e.f99565a.getClass();
                if (jm0.e.i(str)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            this.f113574b.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113575a;

        static {
            int[] iArr = new int[t0.a.values().length];
            try {
                iArr[t0.a.ON_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.a.ON_FOCUS_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113575a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final km0.b bVar, e23.l<? super String, Unit> lVar, e23.l<? super String, Unit> lVar2, final e23.l<? super String, Unit> lVar3, final e23.l<? super String, Unit> lVar4, final e23.l<? super String, Unit> lVar5, e23.a<Unit> aVar, p3.m mVar, int i14) {
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarP = a0.p(lVar5, aVar, mVar, 988736345);
        int i15 = i14 | (o0VarP.r(bVar) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(lVar2) ? 256 : 128) | (o0VarP.r(lVar3) ? 2048 : 1024) | (o0VarP.r(lVar4) ? 16384 : 8192) | (o0VarP.r(lVar5) ? 131072 : 65536) | (o0VarP.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            m4.q qVar = (m4.q) o0VarP.A(t1.f91491i);
            m3 m3Var = (m3) o0VarP.A(t1.f91499q);
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Boolean.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f());
                o0VarP.K(objQ);
            }
            final boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            g.f fVar = new g.f();
            boolean zR = ((i15 & 3670016) == 1048576) | o0VarP.r(qVar) | o0VarP.B(m3Var);
            Object objQ2 = o0VarP.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new i(qVar, m3Var, aVar);
                o0VarP.K(objQ2);
            }
            c.q qVarC = w.c(fVar, (e23.l) objQ2, o0VarP, 0);
            Object objQ3 = o0VarP.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            String str = bVar.f105299c;
            boolean zR2 = o0VarP.r(bVar);
            Object objQ4 = o0VarP.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new a(bVar, p1Var, null);
                o0VarP.K(objQ4);
            }
            l0.e((e23.p) objQ4, str, o0VarP);
            Object objQ5 = o0VarP.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            Object objQ6 = o0VarP.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ6);
            }
            p1 p1Var3 = (p1) objQ6;
            jm0.e eVar = jm0.e.f99565a;
            boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            eVar.getClass();
            boolean zL = jm0.e.l(zBooleanValue2, zBooleanValue3, o0VarP);
            String str2 = bVar.f105300d;
            boolean zR3 = o0VarP.r(bVar);
            Object objQ7 = o0VarP.q();
            if (zR3 || objQ7 == c2565a) {
                objQ7 = new b(bVar, p1Var2, null);
                o0VarP.K(objQ7);
            }
            l0.e((e23.p) objQ7, str2, o0VarP);
            Object objQ8 = o0VarP.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ8);
            }
            final p1 p1Var4 = (p1) objQ8;
            Object objQ9 = o0VarP.q();
            if (objQ9 == c2565a) {
                objQ9 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ9);
            }
            final p1 p1Var5 = (p1) objQ9;
            final boolean zL2 = jm0.e.l(((Boolean) p1Var5.getF182175a()).booleanValue(), ((Boolean) p1Var4.getF182175a()).booleanValue(), o0VarP);
            String str3 = bVar.f105301e;
            boolean zR4 = o0VarP.r(bVar);
            Object objQ10 = o0VarP.q();
            if (zR4 || objQ10 == c2565a) {
                objQ10 = new c(bVar, p1Var4, null);
                o0VarP.K(objQ10);
            }
            l0.e((e23.p) objQ10, str3, o0VarP);
            Object objQ11 = o0VarP.q();
            if (objQ11 == c2565a) {
                objQ11 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ11);
            }
            final p1 p1Var6 = (p1) objQ11;
            Object objQ12 = o0VarP.q();
            if (objQ12 == c2565a) {
                objQ12 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ12);
            }
            final p1 p1Var7 = (p1) objQ12;
            final boolean zL3 = jm0.e.l(((Boolean) p1Var7.getF182175a()).booleanValue(), ((Boolean) p1Var6.getF182175a()).booleanValue(), o0VarP);
            String str4 = bVar.f105302f;
            boolean zR5 = o0VarP.r(bVar);
            Object objQ13 = o0VarP.q();
            if (zR5 || objQ13 == c2565a) {
                objQ13 = new d(bVar, p1Var6, null);
                o0VarP.K(objQ13);
            }
            l0.e((e23.p) objQ13, str4, o0VarP);
            Object objQ14 = o0VarP.q();
            if (objQ14 == c2565a) {
                objQ14 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ14);
            }
            final p1 p1Var8 = (p1) objQ14;
            Object objQ15 = o0VarP.q();
            if (objQ15 == c2565a) {
                objQ15 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ15);
            }
            final p1 p1Var9 = (p1) objQ15;
            final boolean zL4 = jm0.e.l(((Boolean) p1Var9.getF182175a()).booleanValue(), ((Boolean) p1Var8.getF182175a()).booleanValue(), o0VarP);
            String str5 = bVar.f105303g;
            boolean zR6 = o0VarP.r(bVar);
            Object objQ16 = o0VarP.q();
            if (zR6 || objQ16 == c2565a) {
                objQ16 = new e(bVar, p1Var8, null);
                o0VarP.K(objQ16);
            }
            l0.e((e23.p) objQ16, str5, o0VarP);
            h4.r rVarF = x2.f(u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarP), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarP);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar2);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.Q(o0VarP, R.string.lbl_group_info), z3.f.c(-98373016, new ck0.i(bVar, lVar, lVar2, p1Var, p1Var2, p1Var3, context, aVar, qVar, m3Var, qVarC, zL), o0VarP), o0VarP, 48, 0);
            r1.b(gl1.y.Q(o0VarP, R.string.lbl_group_online), z3.f.c(26077201, new e23.p() { // from class: lm0.k
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    final km0.b bVar3;
                    final byte b14;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    final int i16 = 2;
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        boolean z14 = zBooleanValue;
                        final km0.b bVar4 = bVar;
                        p3.m.a aVar3 = p3.m.f135153a;
                        if (z14) {
                            bVar3 = bVar4;
                            mVar2.C(-518063887);
                            mVar2.f();
                        } else {
                            mVar2.C(-522988051);
                            t0 t0Var = t0.f16792a;
                            String strQ = gl1.y.Q(mVar2, R.string.facebook);
                            String str6 = bVar4.f105301e;
                            String str7 = bVar4.f105302f;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strQ2 = gl1.y.Q(mVar2, R.string.lbl_profile_url);
                            String str8 = bVar4.f105301e;
                            boolean z15 = str8 == null || str8.length() == 0;
                            boolean zBooleanValue4 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                            v.f188954b.getClass();
                            boolean z16 = z15;
                            int i17 = v.f188955c;
                            Object objQ17 = mVar2.q();
                            aVar3.getClass();
                            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                            if (objQ17 == c2565a2) {
                                objQ17 = new x(17);
                                mVar2.K(objQ17);
                            }
                            e23.l<? super x5.l0, x5.l0> lVar6 = (e23.l) objQ17;
                            final e23.l lVar7 = lVar3;
                            boolean zB = mVar2.B(lVar7);
                            Object objQ18 = mVar2.q();
                            if (zB || objQ18 == c2565a2) {
                                objQ18 = new k11.n(lVar7, 14);
                                mVar2.K(objQ18);
                            }
                            e23.l<? super String, Unit> lVar8 = (e23.l) objQ18;
                            boolean zR7 = mVar2.r(bVar4) | mVar2.B(lVar7);
                            Object objQ19 = mVar2.q();
                            if (zR7 || objQ19 == c2565a2) {
                                final p1 p1Var10 = p1Var5;
                                objQ19 = new e23.l() { // from class: lm0.j
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        t0.a aVar4 = (t0.a) obj3;
                                        switch (i16) {
                                            case 0:
                                                aVar4.getClass();
                                                int i18 = l.f.f113575a[aVar4.ordinal()];
                                                km0.b bVar5 = bVar4;
                                                e23.l lVar9 = lVar7;
                                                p1 p1Var11 = p1Var10;
                                                if (i18 == 1) {
                                                    String str9 = bVar5.f105302f;
                                                    if (str9 == null || !u.y(str9, "@", false)) {
                                                        String str10 = bVar5.f105302f;
                                                        if (str10 == null) {
                                                            str10 = "";
                                                        }
                                                        lVar9.invoke("@".concat(str10));
                                                    }
                                                    p1Var11.setValue(Boolean.TRUE);
                                                } else {
                                                    if (i18 != 2) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    o13.p<Boolean, String> pVarN = jm0.e.n(bVar5.f105302f);
                                                    boolean zBooleanValue5 = pVarN.f128594a.booleanValue();
                                                    String str11 = pVarN.f128595b;
                                                    if (zBooleanValue5) {
                                                        lVar9.invoke(str11);
                                                    }
                                                    if (s.g(bVar5.f105302f, "@")) {
                                                        lVar9.invoke(null);
                                                    }
                                                    p1Var11.setValue(Boolean.FALSE);
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                aVar4.getClass();
                                                int i19 = l.f.f113575a[aVar4.ordinal()];
                                                p1 p1Var12 = p1Var10;
                                                if (i19 == 1) {
                                                    p1Var12.setValue(Boolean.TRUE);
                                                } else {
                                                    if (i19 != 2) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    o13.p<Boolean, String> pVarO = jm0.e.o(bVar4.f105303g);
                                                    boolean zBooleanValue6 = pVarO.f128594a.booleanValue();
                                                    String str12 = pVarO.f128595b;
                                                    if (zBooleanValue6) {
                                                        lVar7.invoke(str12);
                                                    }
                                                    p1Var12.setValue(Boolean.FALSE);
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                aVar4.getClass();
                                                int i24 = l.f.f113575a[aVar4.ordinal()];
                                                p1 p1Var13 = p1Var10;
                                                if (i24 == 1) {
                                                    p1Var13.setValue(Boolean.TRUE);
                                                } else {
                                                    if (i24 != 2) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    o13.p<Boolean, String> pVarM = jm0.e.m(bVar4.f105301e);
                                                    boolean zBooleanValue7 = pVarM.f128594a.booleanValue();
                                                    String str13 = pVarM.f128595b;
                                                    if (zBooleanValue7) {
                                                        lVar7.invoke(str13);
                                                    }
                                                    p1Var13.setValue(Boolean.FALSE);
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                mVar2.K(objQ19);
                            }
                            t0Var.k(null, strQ, str6, strQ2, z16, null, zBooleanValue4, lVar6, lVar8, (e23.l) objQ19, i17, 0, null, z3.f.c(-814408059, new j30.d(zL2, 17, (byte) 0), mVar2), mVar2, 12779520, 3078, 6145);
                            String strQ3 = gl1.y.Q(mVar2, R.string.f28714x);
                            String str9 = str7 == null ? "" : str7;
                            String strQ4 = gl1.y.Q(mVar2, R.string.lbl_group_twitter_example);
                            String strO = str7 != null ? d53.w.O(str7, "@") : null;
                            boolean z17 = strO == null || strO.length() == 0;
                            boolean zBooleanValue5 = ((Boolean) p1Var6.getF182175a()).booleanValue();
                            Object objQ20 = mVar2.q();
                            if (objQ20 == c2565a2) {
                                objQ20 = new x(13);
                                mVar2.K(objQ20);
                            }
                            e23.l<? super x5.l0, x5.l0> lVar9 = (e23.l) objQ20;
                            final e23.l lVar10 = lVar4;
                            boolean zB2 = mVar2.B(lVar10);
                            Object objQ21 = mVar2.q();
                            if (zB2 || objQ21 == c2565a2) {
                                objQ21 = new k11.n(lVar10, 10);
                                mVar2.K(objQ21);
                            }
                            e23.l<? super String, Unit> lVar11 = (e23.l) objQ21;
                            boolean zR8 = mVar2.r(bVar4) | mVar2.B(lVar10);
                            Object objQ22 = mVar2.q();
                            if (zR8 || objQ22 == c2565a2) {
                                final p1 p1Var11 = p1Var7;
                                b14 = 0;
                                objQ22 = new e23.l() { // from class: lm0.j
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        t0.a aVar4 = (t0.a) obj3;
                                        switch (b14) {
                                            case 0:
                                                aVar4.getClass();
                                                int i18 = l.f.f113575a[aVar4.ordinal()];
                                                km0.b bVar5 = bVar4;
                                                e23.l lVar12 = lVar10;
                                                p1 p1Var12 = p1Var11;
                                                if (i18 == 1) {
                                                    String str10 = bVar5.f105302f;
                                                    if (str10 == null || !u.y(str10, "@", false)) {
                                                        String str11 = bVar5.f105302f;
                                                        if (str11 == null) {
                                                            str11 = "";
                                                        }
                                                        lVar12.invoke("@".concat(str11));
                                                    }
                                                    p1Var12.setValue(Boolean.TRUE);
                                                } else {
                                                    if (i18 != 2) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    o13.p<Boolean, String> pVarN = jm0.e.n(bVar5.f105302f);
                                                    boolean zBooleanValue6 = pVarN.f128594a.booleanValue();
                                                    String str12 = pVarN.f128595b;
                                                    if (zBooleanValue6) {
                                                        lVar12.invoke(str12);
                                                    }
                                                    if (s.g(bVar5.f105302f, "@")) {
                                                        lVar12.invoke(null);
                                                    }
                                                    p1Var12.setValue(Boolean.FALSE);
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                aVar4.getClass();
                                                int i19 = l.f.f113575a[aVar4.ordinal()];
                                                p1 p1Var13 = p1Var11;
                                                if (i19 == 1) {
                                                    p1Var13.setValue(Boolean.TRUE);
                                                } else {
                                                    if (i19 != 2) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    o13.p<Boolean, String> pVarO = jm0.e.o(bVar4.f105303g);
                                                    boolean zBooleanValue7 = pVarO.f128594a.booleanValue();
                                                    String str13 = pVarO.f128595b;
                                                    if (zBooleanValue7) {
                                                        lVar10.invoke(str13);
                                                    }
                                                    p1Var13.setValue(Boolean.FALSE);
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                aVar4.getClass();
                                                int i24 = l.f.f113575a[aVar4.ordinal()];
                                                p1 p1Var14 = p1Var11;
                                                if (i24 == 1) {
                                                    p1Var14.setValue(Boolean.TRUE);
                                                } else {
                                                    if (i24 != 2) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    o13.p<Boolean, String> pVarM = jm0.e.m(bVar4.f105301e);
                                                    boolean zBooleanValue8 = pVarM.f128594a.booleanValue();
                                                    String str14 = pVarM.f128595b;
                                                    if (zBooleanValue8) {
                                                        lVar10.invoke(str14);
                                                    }
                                                    p1Var14.setValue(Boolean.FALSE);
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                mVar2.K(objQ22);
                            } else {
                                b14 = 0;
                            }
                            bVar3 = bVar4;
                            t0Var.k(null, strQ3, str9, strQ4, z17, null, zBooleanValue5, lVar9, lVar11, (e23.l) objQ22, i17, 0, null, z3.f.c(-2102198482, new j30.d(zL3, 15, b14), mVar2), mVar2, 12779520, 3078, 6145);
                            mVar2 = mVar2;
                            mVar2.f();
                        }
                        t0 t0Var2 = t0.f16792a;
                        String strQ5 = gl1.y.Q(mVar2, R.string.lbl_website);
                        String str10 = bVar3.f105303g;
                        if (str10 == null) {
                            str10 = "";
                        }
                        String strQ6 = gl1.y.Q(mVar2, R.string.lbl_group_website_example);
                        String str11 = bVar3.f105303g;
                        boolean z18 = str11 == null || str11.length() == 0;
                        boolean zBooleanValue6 = ((Boolean) p1Var8.getF182175a()).booleanValue();
                        v.f188954b.getClass();
                        int i18 = v.f188955c;
                        Object objQ23 = mVar2.q();
                        aVar3.getClass();
                        p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                        if (objQ23 == c2565a3) {
                            objQ23 = new x(14);
                            mVar2.K(objQ23);
                        }
                        e23.l<? super x5.l0, x5.l0> lVar12 = (e23.l) objQ23;
                        final e23.l lVar13 = lVar5;
                        boolean zB3 = mVar2.B(lVar13);
                        Object objQ24 = mVar2.q();
                        if (zB3 || objQ24 == c2565a3) {
                            objQ24 = new k11.n(lVar13, 11);
                            mVar2.K(objQ24);
                        }
                        e23.l<? super String, Unit> lVar14 = (e23.l) objQ24;
                        boolean zR9 = mVar2.r(bVar3) | mVar2.B(lVar13);
                        Object objQ25 = mVar2.q();
                        if (zR9 || objQ25 == c2565a3) {
                            final p1 p1Var12 = p1Var9;
                            final int i19 = 1;
                            objQ25 = new e23.l() { // from class: lm0.j
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    t0.a aVar4 = (t0.a) obj3;
                                    switch (i19) {
                                        case 0:
                                            aVar4.getClass();
                                            int i110 = l.f.f113575a[aVar4.ordinal()];
                                            km0.b bVar5 = bVar3;
                                            e23.l lVar15 = lVar13;
                                            p1 p1Var13 = p1Var12;
                                            if (i110 == 1) {
                                                String str12 = bVar5.f105302f;
                                                if (str12 == null || !u.y(str12, "@", false)) {
                                                    String str13 = bVar5.f105302f;
                                                    if (str13 == null) {
                                                        str13 = "";
                                                    }
                                                    lVar15.invoke("@".concat(str13));
                                                }
                                                p1Var13.setValue(Boolean.TRUE);
                                            } else {
                                                if (i110 != 2) {
                                                    u0.r();
                                                    return null;
                                                }
                                                o13.p<Boolean, String> pVarN = jm0.e.n(bVar5.f105302f);
                                                boolean zBooleanValue7 = pVarN.f128594a.booleanValue();
                                                String str14 = pVarN.f128595b;
                                                if (zBooleanValue7) {
                                                    lVar15.invoke(str14);
                                                }
                                                if (s.g(bVar5.f105302f, "@")) {
                                                    lVar15.invoke(null);
                                                }
                                                p1Var13.setValue(Boolean.FALSE);
                                            }
                                            return Unit.INSTANCE;
                                        case 1:
                                            aVar4.getClass();
                                            int i111 = l.f.f113575a[aVar4.ordinal()];
                                            p1 p1Var14 = p1Var12;
                                            if (i111 == 1) {
                                                p1Var14.setValue(Boolean.TRUE);
                                            } else {
                                                if (i111 != 2) {
                                                    u0.r();
                                                    return null;
                                                }
                                                o13.p<Boolean, String> pVarO = jm0.e.o(bVar3.f105303g);
                                                boolean zBooleanValue8 = pVarO.f128594a.booleanValue();
                                                String str15 = pVarO.f128595b;
                                                if (zBooleanValue8) {
                                                    lVar13.invoke(str15);
                                                }
                                                p1Var14.setValue(Boolean.FALSE);
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            aVar4.getClass();
                                            int i24 = l.f.f113575a[aVar4.ordinal()];
                                            p1 p1Var15 = p1Var12;
                                            if (i24 == 1) {
                                                p1Var15.setValue(Boolean.TRUE);
                                            } else {
                                                if (i24 != 2) {
                                                    u0.r();
                                                    return null;
                                                }
                                                o13.p<Boolean, String> pVarM = jm0.e.m(bVar3.f105301e);
                                                boolean zBooleanValue9 = pVarM.f128594a.booleanValue();
                                                String str16 = pVarM.f128595b;
                                                if (zBooleanValue9) {
                                                    lVar13.invoke(str16);
                                                }
                                                p1Var15.setValue(Boolean.FALSE);
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ25);
                        }
                        t0Var2.k(null, strQ5, str10, strQ6, z18, null, zBooleanValue6, lVar12, lVar14, (e23.l) objQ25, i18, 0, null, z3.f.c(-1051769536, new j30.d(zL4, 16, (byte) 0), mVar2), mVar2, 12779520, 3078, 6145);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarP), o0VarP, 48, 0);
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(i14, 20, bVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar);
        }
    }
}
