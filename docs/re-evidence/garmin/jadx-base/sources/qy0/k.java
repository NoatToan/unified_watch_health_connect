package qy0;

import am.i1;
import c2.x2;
import c2.y;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.C;
import e23.l;
import e23.p;
import ew1.v1;
import h5.e0;
import i3.mh;
import i3.r3;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import l72.c1;
import l72.r1;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import qk0.o;
import sy0.m;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditScreenKt$MultiDayActivitiesEditScreen$2$1$11$1", f = "MultiDayActivitiesEditScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cy0.e f148539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f148540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(cy0.e eVar, l<? super Boolean, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148539a = eVar;
            this.f148540b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148539a, this.f148540b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f148539a != null) {
                this.f148540b.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditScreenKt$MultiDayActivitiesEditScreen$2$1$14$1", f = "MultiDayActivitiesEditScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f148541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f148542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z14, l<? super Boolean, Unit> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f148541a = z14;
            this.f148542b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f148541a, this.f148542b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f148541a) {
                this.f148542b.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditScreenKt$MultiDayActivitiesEditScreen$2$1$6$1$1", f = "MultiDayActivitiesEditScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f148543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f148544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Calendar> f148545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Calendar> f148546d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super Long, Unit> lVar, l<? super Long, Unit> lVar2, p1<Calendar> p1Var, p1<Calendar> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f148543a = lVar;
            this.f148544b = lVar2;
            this.f148545c = p1Var;
            this.f148546d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f148543a, this.f148544b, this.f148545c, this.f148546d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Calendar f182175a = this.f148545c.getF182175a();
            Long l14 = f182175a != null ? new Long(f182175a.getTimeInMillis()) : null;
            p1<Calendar> p1Var = this.f148546d;
            Calendar f182175a2 = p1Var.getF182175a();
            Long l15 = f182175a2 != null ? new Long(f182175a2.getTimeInMillis()) : null;
            this.f148543a.invoke(l14);
            if (l14 != null && l15 != null) {
                long jLongValue = l14.longValue();
                long jLongValue2 = l15.longValue();
                l<Long, Unit> lVar = this.f148544b;
                if (jLongValue > jLongValue2 || (l15.longValue() - l14.longValue()) / 86400000 > 91) {
                    p1Var.setValue(null);
                    lVar.invoke(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditScreenKt$MultiDayActivitiesEditScreen$2$1$8$1$1", f = "MultiDayActivitiesEditScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f148547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Calendar> f148548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(l<? super Long, Unit> lVar, p1<Calendar> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f148547a = lVar;
            this.f148548b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f148547a, this.f148548b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Calendar f182175a = this.f148548b.getF182175a();
            this.f148547a.invoke(f182175a != null ? new Long(f182175a.getTimeInMillis()) : null);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148549a;

        static {
            int[] iArr = new int[cy0.e.values().length];
            try {
                iArr[cy0.e.MULTI_DAY_ACTIVITY_OVERLAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cy0.e.MAX_FUTURE_ACTIVITIES_EXCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f148549a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final l<? super String, Unit> lVar, final Long l14, final Long l15, final l<? super Long, Unit> lVar2, final l<? super Long, Unit> lVar3, final String str2, m mVar, boolean z14, final boolean z15, final boolean z16, final cy0.e eVar, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final l<? super Boolean, Unit> lVar4, final Set<? extends ActivityListItemDTO> set, final boolean z17, final e23.a<Unit> aVar4, final e23.a<Unit> aVar5, final e23.a<Unit> aVar6, final e23.a<Unit> aVar7, final boolean z18, final e23.a<Unit> aVar8, p3.m mVar2, final int i14, final int i15, final int i16, final int i17) {
        int i18;
        l<? super String, Unit> lVar5;
        Object obj;
        l<? super Long, Unit> lVar6;
        int i19;
        boolean z19;
        int i24;
        int i25;
        int i26;
        final m mVar3;
        final boolean z24;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar4.getClass();
        set.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        aVar8.getClass();
        o0 o0VarE = mVar2.E(247183122);
        if ((i14 & 6) == 0) {
            i18 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i18 = i14;
        }
        if ((i14 & 48) == 0) {
            lVar5 = lVar;
            i18 |= o0VarE.r(lVar5) ? 32 : 16;
        } else {
            lVar5 = lVar;
        }
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.B(l14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj = l15;
            i18 |= o0VarE.B(obj) ? 2048 : 1024;
        } else {
            obj = l15;
        }
        if ((i14 & 24576) == 0) {
            lVar6 = lVar2;
            i18 |= o0VarE.r(lVar6) ? 16384 : 8192;
        } else {
            lVar6 = lVar2;
        }
        if ((i14 & 196608) == 0) {
            i18 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i18 |= o0VarE.B(str2) ? 1048576 : 524288;
        }
        int i27 = i17 & 128;
        if (i27 != 0) {
            i19 = i18 | 12582912;
        } else {
            i19 = i18 | (o0VarE.k(mVar == null ? -1 : mVar.ordinal()) ? 8388608 : 4194304);
        }
        int i28 = i17 & 256;
        if (i28 != 0) {
            i24 = i19 | 100663296;
            z19 = z14;
        } else {
            z19 = z14;
            i24 = i19 | (o0VarE.h(z19) ? 67108864 : 33554432);
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i24 |= o0VarE.h(z15) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i25 = i15 | (o0VarE.h(z16) ? 4 : 2);
        } else {
            i25 = i15;
        }
        if ((i15 & 48) == 0) {
            i25 |= o0VarE.k(eVar != null ? eVar.ordinal() : -1) ? 32 : 16;
        }
        if ((i15 & 3072) == 0) {
            i25 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i25 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i25 |= o0VarE.r(lVar4) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i25 |= o0VarE.r(set) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i25 |= o0VarE.h(z17) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i25 |= o0VarE.r(aVar4) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i25 |= o0VarE.r(aVar5) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i26 = i16 | (o0VarE.r(aVar6) ? 4 : 2);
        } else {
            i26 = i16;
        }
        if ((i16 & 48) == 0) {
            i26 |= o0VarE.r(aVar7) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i26 |= o0VarE.h(z18) ? 256 : 128;
        }
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (i25 & 306783379) == 306783378 && (i26 & 1171) == 1170) ? false : true)) {
            final m mVar4 = i27 != 0 ? m.ONLY_ME : mVar;
            final boolean z25 = i28 != 0 ? false : z19;
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new pp.b(p1Var3, 9);
                o0VarE.K(objQ4);
            }
            final l lVar7 = (l) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ5);
            }
            final b0 b0Var = (b0) objQ5;
            final l<? super Long, Unit> lVar8 = lVar6;
            final l<? super String, Unit> lVar9 = lVar5;
            z02.d.a(((Boolean) p1Var3.getF182175a()).booleanValue(), z3.f.c(-1424712873, new oy0.b(aVar5, str, l14, obj, aVar6, lVar7, 10), o0VarE), null, null, null, z3.f.c(2086756955, new p() { // from class: qy0.i
                /* JADX WARN: Code duplicated, block: B:116:0x0464  */
                /* JADX WARN: Code duplicated, block: B:118:0x0477  */
                /* JADX WARN: Code duplicated, block: B:120:0x047a  */
                /* JADX WARN: Code duplicated, block: B:123:0x049f  */
                /* JADX WARN: Code duplicated, block: B:125:0x04d2  */
                /* JADX WARN: Code duplicated, block: B:127:0x04da  */
                /* JADX WARN: Code duplicated, block: B:129:0x0506  */
                /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                /* JADX WARN: Code duplicated, block: B:137:0x0536  */
                /* JADX WARN: Code duplicated, block: B:141:0x0555  */
                /* JADX WARN: Code duplicated, block: B:144:0x0567  */
                /* JADX WARN: Code duplicated, block: B:147:0x0592  */
                /* JADX WARN: Code duplicated, block: B:149:0x05b1  */
                /* JADX WARN: Code duplicated, block: B:152:0x05c6  */
                /* JADX WARN: Code duplicated, block: B:154:0x05e9  */
                /* JADX WARN: Code duplicated, block: B:156:0x060b  */
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
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    l lVar10;
                    p1 p1Var4;
                    p1 p1Var5;
                    p3.m.a.C2565a c2565a2;
                    boolean z26;
                    p3.m.a.C2565a c2565a3;
                    p3.m.a.C2565a c2565a4;
                    Object obj4;
                    p3.m.a.C2565a c2565a5;
                    l lVar11;
                    boolean z27;
                    boolean zH;
                    Object objQ6;
                    Object objQ7;
                    e23.a aVar9;
                    boolean zB;
                    Object objQ8;
                    int i29;
                    e23.a aVar10;
                    p3.m.a.C2565a c2565a6;
                    boolean zB2;
                    Object objQ9;
                    p3.m.a.C2565a c2565a7;
                    boolean zB3;
                    Object objQ10;
                    p1 p1Var6;
                    p1 p1Var7;
                    p1 p1Var8;
                    Object pVar;
                    Calendar calendar;
                    Calendar calendar2;
                    p3.m mVar5 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (mVar5.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = n.f135158a;
                        h4.r.a aVar11 = h4.r.S;
                        h4.r rVarD = x2.d(aVar11, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                        int iHashCode = Long.hashCode(mVar5.getU());
                        i2 i2VarX = mVar5.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar5);
                        h5.g.V.getClass();
                        e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar5.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar12);
                        } else {
                            mVar5.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar5);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar5, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar5);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        Object objQ11 = mVar5.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a8 = p3.m.a.f135155b;
                        if (objQ11 == c2565a8) {
                            objQ11 = p0.n(Boolean.FALSE);
                            mVar5.K(objQ11);
                        }
                        p1 p1Var9 = (p1) objQ11;
                        Object objQ12 = mVar5.q();
                        if (objQ12 == c2565a8) {
                            objQ12 = p0.n(Boolean.FALSE);
                            mVar5.K(objQ12);
                        }
                        p1 p1Var10 = (p1) objQ12;
                        Object objQ13 = mVar5.q();
                        if (objQ13 == c2565a8) {
                            Long l16 = l14;
                            if (l16 != null) {
                                long jLongValue = l16.longValue();
                                calendar2 = Calendar.getInstance();
                                calendar2.setTimeInMillis(jLongValue);
                            } else {
                                calendar2 = null;
                            }
                            objQ13 = p0.n(calendar2);
                            mVar5.K(objQ13);
                        }
                        p1 p1Var11 = (p1) objQ13;
                        Object objQ14 = mVar5.q();
                        if (objQ14 == c2565a8) {
                            Long l17 = l15;
                            if (l17 != null) {
                                long jLongValue2 = l17.longValue();
                                calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(jLongValue2);
                            } else {
                                calendar = null;
                            }
                            objQ14 = p0.n(calendar);
                            mVar5.K(objQ14);
                        }
                        p1 p1Var12 = (p1) objQ14;
                        r1.b("Epic Info", z3.f.c(1909698988, new dd1.d(str, lVar9, str2, aVar2, p1Var11, p1Var9, p1Var12, p1Var10), mVar5), mVar5, 54, 0);
                        r1.b(gl1.y.Q(mVar5, R.string.lbl_activites), z3.f.c(1296859299, new i1(set, aVar4, z17, 29), mVar5), mVar5, 48, 0);
                        m mVar6 = mVar4;
                        e23.a aVar13 = aVar3;
                        boolean z28 = z15;
                        boolean z29 = z16;
                        p1 p1Var13 = p1Var2;
                        boolean z34 = z25;
                        l lVar12 = lVar4;
                        p1 p1Var14 = p1Var;
                        r1.b("Epic Options", z3.f.c(1485801572, new r3(mVar6, aVar13, z28, z29, p1Var13, z34, lVar12, p1Var14), mVar5), mVar5, 54, 0);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarF = x2.f(c2.l.y(aVar11, j92.b.f97899b.f97921f), 1.0f);
                        e23.a aVar14 = aVar7;
                        boolean zB4 = mVar5.B(aVar14);
                        Object objQ15 = mVar5.q();
                        if (zB4 || objQ15 == c2565a8) {
                            objQ15 = new o(aVar14, 1);
                            mVar5.K(objQ15);
                        }
                        h4.r rVarD2 = w.d(rVarF, false, null, null, (e23.a) objQ15, 15);
                        String strQ = gl1.y.Q(mVar5, R.string.txt_privacy_policy);
                        d6.h.f57752b.getClass();
                        int i30 = d6.h.f57755e;
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarD2, ds.e0.e(mVar5), null, 0L, null, 0L, d6.h.a(i30), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 130040);
                        boolean zBooleanValue = ((Boolean) p1Var9.getF182175a()).booleanValue();
                        b0 b0Var3 = b0Var;
                        l lVar13 = lVar3;
                        if (zBooleanValue) {
                            mVar5.C(437369301);
                            boolean zB5 = mVar5.B((Calendar) p1Var11.getF182175a());
                            Object objQ16 = mVar5.q();
                            c2565a2 = c2565a8;
                            if (zB5 || objQ16 == c2565a2) {
                                Calendar calendar3 = (Calendar) p1Var11.getF182175a();
                                if (calendar3 == null) {
                                    calendar3 = Calendar.getInstance(Locale.getDefault());
                                }
                                objQ16 = calendar3;
                                mVar5.K(objQ16);
                            }
                            Calendar calendar4 = (Calendar) objQ16;
                            calendar4.getClass();
                            DateTime dateTime = new DateTime(0L);
                            z26 = true;
                            DateTime dateTimePlusYears = DateTime.now().plusYears(1);
                            long millis = dateTime.getMillis();
                            long millis2 = dateTimePlusYears.getMillis();
                            Object objQ17 = mVar5.q();
                            if (objQ17 == c2565a2) {
                                p1Var8 = p1Var9;
                                objQ17 = new qk0.m(p1Var8, 5);
                                mVar5.K(objQ17);
                            } else {
                                p1Var8 = p1Var9;
                            }
                            e23.a aVar15 = (e23.a) objQ17;
                            boolean zR = mVar5.r(b0Var3);
                            l lVar14 = lVar8;
                            boolean zB6 = zR | mVar5.B(lVar14) | mVar5.B(lVar13);
                            Object objQ18 = mVar5.q();
                            if (zB6 || objQ18 == c2565a2) {
                                p1Var4 = p1Var11;
                                p1Var5 = p1Var12;
                                pVar = new aa2.p(b0Var3, p1Var4, p1Var8, lVar14, lVar13, p1Var5);
                                lVar10 = lVar13;
                                mVar5.K(pVar);
                            } else {
                                pVar = objQ18;
                                p1Var4 = p1Var11;
                                p1Var5 = p1Var12;
                                lVar10 = lVar13;
                            }
                            jy0.y.a(millis, millis2, calendar4, aVar15, (l) pVar, mVar5, 3072);
                            mVar5.f();
                        } else {
                            lVar10 = lVar13;
                            p1Var4 = p1Var11;
                            p1Var5 = p1Var12;
                            c2565a2 = c2565a8;
                            z26 = true;
                            mVar5.C(439395089);
                            mVar5.f();
                        }
                        if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                            mVar5.C(439469272);
                            boolean zB7 = mVar5.B((Calendar) p1Var5.getF182175a());
                            Object objQ19 = mVar5.q();
                            if (zB7 || objQ19 == c2565a2) {
                                Calendar calendar5 = (Calendar) p1Var5.getF182175a();
                                if (calendar5 == null && (calendar5 = (Calendar) p1Var4.getF182175a()) == null) {
                                    calendar5 = Calendar.getInstance(Locale.getDefault());
                                }
                                objQ19 = calendar5;
                                mVar5.K(objQ19);
                            }
                            Calendar calendar6 = (Calendar) objQ19;
                            calendar6.getClass();
                            Calendar calendar7 = (Calendar) p1Var4.getF182175a();
                            DateTime dateTime2 = calendar7 != null ? new DateTime(calendar7.getTimeInMillis()) : DateTime.now();
                            DateTime dateTimePlusDays = dateTime2.plusDays(91);
                            long millis3 = dateTime2.getMillis();
                            long millis4 = dateTimePlusDays.getMillis();
                            Object objQ20 = mVar5.q();
                            if (objQ20 == c2565a2) {
                                p1Var7 = p1Var10;
                                objQ20 = new qk0.m(p1Var7, 6);
                                mVar5.K(objQ20);
                            } else {
                                p1Var7 = p1Var10;
                            }
                            e23.a aVar16 = (e23.a) objQ20;
                            boolean zR2 = mVar5.r(b0Var3) | mVar5.B(lVar10);
                            Object objQ21 = mVar5.q();
                            if (zR2 || objQ21 == c2565a2) {
                                objQ21 = new mt0.e0(b0Var3, p1Var5, p1Var7, lVar10, 16);
                                mVar5.K(objQ21);
                            }
                            jy0.y.a(millis3, millis4, calendar6, aVar16, (l) objQ21, mVar5, 3072);
                            mVar5.f();
                        } else {
                            mVar5.C(440538865);
                            mVar5.f();
                        }
                        if (((Boolean) p1Var14.getF182175a()).booleanValue()) {
                            mVar5.C(440598044);
                            c1 c1Var = c1.f110940a;
                            x0.f23314a.getClass();
                            String strW = gl1.d.W(x0.f23394eb);
                            String strW2 = gl1.d.W(x0.f23411fb);
                            String strQ2 = gl1.y.Q(mVar5, R.string.lbl_common_continue);
                            boolean zB8 = mVar5.B(lVar12);
                            Object objQ22 = mVar5.q();
                            if (zB8 || objQ22 == c2565a2) {
                                p1Var6 = p1Var14;
                                objQ22 = new v1(lVar12, p1Var6, 17);
                                mVar5.K(objQ22);
                            } else {
                                p1Var6 = p1Var14;
                            }
                            e23.a<Unit> aVar17 = (e23.a) objQ22;
                            String strQ3 = gl1.y.Q(mVar5, R.string.lbl_cancel);
                            Object objQ23 = mVar5.q();
                            if (objQ23 == c2565a2) {
                                objQ23 = new qk0.m(p1Var6, 7);
                                mVar5.K(objQ23);
                            }
                            c2565a3 = c2565a2;
                            c1Var.a(false, strW, strW2, null, null, strQ2, false, false, aVar17, strQ3, (e23.a) objQ23, mVar5, 0, 6, 217);
                            mVar5.f();
                        } else {
                            c2565a3 = c2565a2;
                            mVar5.C(441233265);
                            mVar5.f();
                        }
                        cy0.e eVar2 = eVar;
                        boolean zK = mVar5.k(eVar2 == null ? -1 : eVar2.ordinal());
                        Object objQ24 = mVar5.q();
                        l lVar15 = lVar7;
                        if (zK) {
                            c2565a4 = c2565a3;
                        } else {
                            c2565a4 = c2565a3;
                            if (objQ24 != c2565a4) {
                                obj4 = null;
                            }
                            l0.e((p) objQ24, eVar2, mVar5);
                            if (eVar2 != null) {
                                mVar5.C(441504546);
                                i29 = k.e.f148549a[eVar2.ordinal()];
                                aVar10 = aVar;
                                if (i29 != 1) {
                                    c2565a6 = c2565a4;
                                    lVar11 = lVar15;
                                    mVar5.C(441577117);
                                    c1 c1Var2 = c1.f110940a;
                                    x0.f23314a.getClass();
                                    String strW3 = gl1.d.W(x0.f23428gb);
                                    String strW4 = gl1.d.W(x0.f23444hb);
                                    String strQ4 = gl1.y.Q(mVar5, R.string.lbl_ok);
                                    zB2 = mVar5.B(aVar10);
                                    objQ9 = mVar5.q();
                                    if (zB2) {
                                        c2565a7 = c2565a6;
                                    } else {
                                        c2565a7 = c2565a6;
                                        if (objQ9 == c2565a7) {
                                        }
                                        c2565a5 = c2565a7;
                                        c1Var2.a(false, strW3, strW4, null, null, strQ4, false, false, (e23.a) objQ9, null, null, mVar5, 0, 0, 1753);
                                        mVar5.f();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    objQ9 = new o(aVar10, 5);
                                    mVar5.K(objQ9);
                                    c2565a5 = c2565a7;
                                    c1Var2.a(false, strW3, strW4, null, null, strQ4, false, false, (e23.a) objQ9, null, null, mVar5, 0, 0, 1753);
                                    mVar5.f();
                                    Unit unit2 = Unit.INSTANCE;
                                } else {
                                    if (i29 == 2) {
                                        throw n23.j.m(mVar5, 2092452064);
                                    }
                                    mVar5.C(442106535);
                                    c1 c1Var3 = c1.f110940a;
                                    x0.f23314a.getClass();
                                    String strW5 = gl1.d.W(x0.f23576pa);
                                    String strQ5 = gl1.y.Q(mVar5, R.string.lbl_ok);
                                    zB3 = mVar5.B(aVar10);
                                    objQ10 = mVar5.q();
                                    if (zB3 || objQ10 == c2565a4) {
                                        objQ10 = new o(aVar10, 6);
                                        mVar5.K(objQ10);
                                    }
                                    lVar11 = lVar15;
                                    c1Var3.a(false, null, strW5, null, null, strQ5, false, false, (e23.a) objQ10, null, null, mVar5, 0, 0, 1755);
                                    mVar5.f();
                                    Unit unit3 = Unit.INSTANCE;
                                    c2565a5 = c2565a4;
                                }
                                mVar5.f();
                            } else {
                                c2565a5 = c2565a4;
                                lVar11 = lVar15;
                                mVar5.C(442486161);
                                mVar5.f();
                            }
                            z27 = z18;
                            Boolean boolValueOf = Boolean.valueOf(z27);
                            zH = mVar5.h(z27);
                            objQ6 = mVar5.q();
                            if (zH || objQ6 == c2565a5) {
                                objQ6 = new k.b(z27, lVar11, null);
                                mVar5.K(objQ6);
                            }
                            l0.e((p) objQ6, boolValueOf, mVar5);
                            if (z27) {
                                mVar5.C(442676935);
                                c1 c1Var4 = c1.f110940a;
                                String strQ6 = gl1.y.Q(mVar5, R.string.lbl_error_occurred);
                                String strQ7 = gl1.y.Q(mVar5, R.string.lbl_error_occurred_try_again);
                                String strQ8 = gl1.y.Q(mVar5, R.string.lbl_ok);
                                aVar9 = aVar8;
                                zB = mVar5.B(aVar9);
                                objQ8 = mVar5.q();
                                if (zB || objQ8 == c2565a5) {
                                    objQ8 = new o(aVar9, 7);
                                    mVar5.K(objQ8);
                                }
                                c1Var4.a(false, strQ6, strQ7, null, null, strQ8, false, false, (e23.a) objQ8, null, null, mVar5, 0, 0, 1753);
                                mVar5.f();
                            } else {
                                mVar5.C(443024817);
                                mVar5.f();
                            }
                            if (((Boolean) p1Var13.getF182175a()).booleanValue()) {
                                mVar5.C(443079346);
                                c1 c1Var5 = c1.f110940a;
                                String strQ9 = gl1.y.Q(mVar5, R.string.multi_day_activities_child_epic_privacy_header);
                                String strQ10 = gl1.y.Q(mVar5, R.string.multi_day_activities_child_epic_privacy_body);
                                String strQ11 = gl1.y.Q(mVar5, R.string.lbl_ok);
                                objQ7 = mVar5.q();
                                if (objQ7 == c2565a5) {
                                    objQ7 = new qk0.m(p1Var13, 10);
                                    mVar5.K(objQ7);
                                }
                                c1Var5.a(false, strQ9, strQ10, null, null, strQ11, false, false, (e23.a) objQ7, null, null, mVar5, 100663296, 0, 1753);
                                mVar5.f();
                            } else {
                                mVar5.C(443478161);
                                mVar5.f();
                            }
                            mVar5.y();
                            x1 x1Var3 = n.f135158a;
                        }
                        obj4 = null;
                        objQ24 = new k.a(eVar2, lVar15, null);
                        mVar5.K(objQ24);
                        l0.e((p) objQ24, eVar2, mVar5);
                        if (eVar2 != null) {
                            mVar5.C(441504546);
                            i29 = k.e.f148549a[eVar2.ordinal()];
                            aVar10 = aVar;
                            if (i29 != 1) {
                                c2565a6 = c2565a4;
                                lVar11 = lVar15;
                                mVar5.C(441577117);
                                c1 c1Var6 = c1.f110940a;
                                x0.f23314a.getClass();
                                String strW6 = gl1.d.W(x0.f23428gb);
                                String strW7 = gl1.d.W(x0.f23444hb);
                                String strQ12 = gl1.y.Q(mVar5, R.string.lbl_ok);
                                zB2 = mVar5.B(aVar10);
                                objQ9 = mVar5.q();
                                if (zB2) {
                                    c2565a7 = c2565a6;
                                    if (objQ9 == c2565a7) {
                                    }
                                    c2565a5 = c2565a7;
                                    c1Var6.a(false, strW6, strW7, null, null, strQ12, false, false, (e23.a) objQ9, null, null, mVar5, 0, 0, 1753);
                                    mVar5.f();
                                    Unit unit4 = Unit.INSTANCE;
                                } else {
                                    c2565a7 = c2565a6;
                                }
                                objQ9 = new o(aVar10, 5);
                                mVar5.K(objQ9);
                                c2565a5 = c2565a7;
                                c1Var6.a(false, strW6, strW7, null, null, strQ12, false, false, (e23.a) objQ9, null, null, mVar5, 0, 0, 1753);
                                mVar5.f();
                                Unit unit5 = Unit.INSTANCE;
                            } else {
                                if (i29 == 2) {
                                    throw n23.j.m(mVar5, 2092452064);
                                }
                                mVar5.C(442106535);
                                c1 c1Var7 = c1.f110940a;
                                x0.f23314a.getClass();
                                String strW8 = gl1.d.W(x0.f23576pa);
                                String strQ13 = gl1.y.Q(mVar5, R.string.lbl_ok);
                                zB3 = mVar5.B(aVar10);
                                objQ10 = mVar5.q();
                                if (zB3) {
                                    objQ10 = new o(aVar10, 6);
                                    mVar5.K(objQ10);
                                } else {
                                    objQ10 = new o(aVar10, 6);
                                    mVar5.K(objQ10);
                                }
                                lVar11 = lVar15;
                                c1Var7.a(false, null, strW8, null, null, strQ13, false, false, (e23.a) objQ10, null, null, mVar5, 0, 0, 1755);
                                mVar5.f();
                                Unit unit6 = Unit.INSTANCE;
                                c2565a5 = c2565a4;
                            }
                            mVar5.f();
                        } else {
                            c2565a5 = c2565a4;
                            lVar11 = lVar15;
                            mVar5.C(442486161);
                            mVar5.f();
                        }
                        z27 = z18;
                        Boolean boolValueOf2 = Boolean.valueOf(z27);
                        zH = mVar5.h(z27);
                        objQ6 = mVar5.q();
                        if (zH) {
                            objQ6 = new k.b(z27, lVar11, null);
                            mVar5.K(objQ6);
                        } else {
                            objQ6 = new k.b(z27, lVar11, null);
                            mVar5.K(objQ6);
                        }
                        l0.e((p) objQ6, boolValueOf2, mVar5);
                        if (z27) {
                            mVar5.C(442676935);
                            c1 c1Var8 = c1.f110940a;
                            String strQ14 = gl1.y.Q(mVar5, R.string.lbl_error_occurred);
                            String strQ15 = gl1.y.Q(mVar5, R.string.lbl_error_occurred_try_again);
                            String strQ16 = gl1.y.Q(mVar5, R.string.lbl_ok);
                            aVar9 = aVar8;
                            zB = mVar5.B(aVar9);
                            objQ8 = mVar5.q();
                            if (zB) {
                                objQ8 = new o(aVar9, 7);
                                mVar5.K(objQ8);
                            } else {
                                objQ8 = new o(aVar9, 7);
                                mVar5.K(objQ8);
                            }
                            c1Var8.a(false, strQ14, strQ15, null, null, strQ16, false, false, (e23.a) objQ8, null, null, mVar5, 0, 0, 1753);
                            mVar5.f();
                        } else {
                            mVar5.C(443024817);
                            mVar5.f();
                        }
                        if (((Boolean) p1Var13.getF182175a()).booleanValue()) {
                            mVar5.C(443079346);
                            c1 c1Var9 = c1.f110940a;
                            String strQ17 = gl1.y.Q(mVar5, R.string.multi_day_activities_child_epic_privacy_header);
                            String strQ18 = gl1.y.Q(mVar5, R.string.multi_day_activities_child_epic_privacy_body);
                            String strQ19 = gl1.y.Q(mVar5, R.string.lbl_ok);
                            objQ7 = mVar5.q();
                            if (objQ7 == c2565a5) {
                                objQ7 = new qk0.m(p1Var13, 10);
                                mVar5.K(objQ7);
                            }
                            c1Var9.a(false, strQ17, strQ18, null, null, strQ19, false, false, (e23.a) objQ7, null, null, mVar5, 100663296, 0, 1753);
                            mVar5.f();
                        } else {
                            mVar5.C(443478161);
                            mVar5.f();
                        }
                        mVar5.y();
                        x1 x1Var4 = n.f135158a;
                    } else {
                        mVar5.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 196656, 28);
            mVar3 = mVar4;
            z24 = z25;
        } else {
            o0VarE.e();
            mVar3 = mVar;
            z24 = z19;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: qy0.j
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    int iT3 = p0.t(i16);
                    k.a(str, lVar, l14, l15, lVar2, lVar3, str2, mVar3, z24, z15, z16, eVar, aVar, aVar2, aVar3, lVar4, set, z17, aVar4, aVar5, aVar6, aVar7, z18, aVar8, (p3.m) obj2, iT, iT2, iT3, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
