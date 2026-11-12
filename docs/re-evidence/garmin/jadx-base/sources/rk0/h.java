package rk0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.s4;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o72.z2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsScreenKt$CollectionDetailsScreenImpl$1$1", f = "CollectionDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f153136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f153137b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f153136a = jVar;
            this.f153137b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f153136a, this.f153137b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f153136a.f153168d) {
                this.f153137b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsScreenKt$CollectionDetailsScreenImpl$15$1", f = "CollectionDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f153138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f153139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f153140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, q0 q0Var, Context context, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f153138a = jVar;
            this.f153139b = q0Var;
            this.f153140c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f153138a, this.f153139b, this.f153140c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            j jVar = this.f153138a;
            if (jVar.f153166b == u0.Failed && jVar.f153165a != null) {
                this.f153139b.O2();
                Toast.makeText(this.f153140c, R.string.generic_error_message, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.CollectionDetailsScreenKt$CollectionDetailsScreenImpl$2$1", f = "CollectionDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f153141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f153142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f153141a = jVar;
            this.f153142b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f153141a, this.f153142b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f153141a.f153169e) {
                this.f153142b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f153143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f153144b;

        public d(Comparator comparator, Context context) {
            this.f153143a = comparator;
            this.f153144b = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            uk0.g gVar = (uk0.g) t7;
            uk0.r rVar = uk0.r.f171870a;
            String str = gVar.f171814c;
            String str2 = gVar.f171815d;
            String str3 = gVar.f171816e;
            rVar.getClass();
            Context context = this.f153144b;
            uk0.g gVar2 = (uk0.g) t14;
            return this.f153143a.compare(uk0.r.a(context, str, str2, str3), uk0.r.a(context, gVar2.f171814c, gVar2.f171815d, gVar2.f171816e));
        }
    }

    public static final void a(h4.r rVar, final jk0.j jVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(979230006);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(jVar) ? 32 : 16);
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar2 = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar2.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            l72.x0 x0Var = l72.x0.f111346a;
            z3.e eVarC = z3.f.c(1239774791, new e23.q() { // from class: rk0.d
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
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i18;
                    int i19;
                    int i24 = i16;
                    jk0.j jVar3 = jVar;
                    switch (i24) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                                List<jk0.s> list = jVar3.f99268g;
                                int size = list != null ? list.size() : 0;
                                if (size == 1) {
                                    i18 = 1707201946;
                                    i19 = R.string.lbl_item;
                                } else {
                                    i18 = 1707272409;
                                    i19 = R.string.lbl_items;
                                }
                                String strH = sn.a.h(mVar2, i18, i19, mVar2);
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                String str = integerInstance.format(Integer.valueOf(size));
                                str.getClass();
                                x0Var2.f((iIntValue & 14) | (l72.x0.f111348c << 24), 124, null, t2Var, null, null, str, strH, null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            int i25 = iIntValue2;
                            if (mVar3.n(i25 & 1, (i25 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                pi0.e eVar = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                                b63.o oVar = jVar3.f99266e;
                                if (oVar == null) {
                                    mVar3.C(-1728168905);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-1728168904);
                                    l72.x0.f111346a.a((i25 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var2, null, null, eVar.d(g22.l.h(oVar), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), gl1.y.Q(mVar3, R.string.lbl_last_modified), null, null, mVar3);
                                    mVar3.f();
                                }
                                l72.x0.f111346a.a((i25 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var2, null, null, eVar.d(g22.l.h(jVar3.f99263b), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), gl1.y.Q(mVar3, R.string.lbl_gear_first_use), null, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i18 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(null, eVarC, o0VarE, i18, 1);
            x0Var.e(null, z3.f.c(315097520, new e23.q() { // from class: rk0.d
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
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19;
                    int i110;
                    int i24 = i17;
                    jk0.j jVar3 = jVar;
                    switch (i24) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                                List<jk0.s> list = jVar3.f99268g;
                                int size = list != null ? list.size() : 0;
                                if (size == 1) {
                                    i19 = 1707201946;
                                    i110 = R.string.lbl_item;
                                } else {
                                    i19 = 1707272409;
                                    i110 = R.string.lbl_items;
                                }
                                String strH = sn.a.h(mVar2, i19, i110, mVar2);
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                String str = integerInstance.format(Integer.valueOf(size));
                                str.getClass();
                                x0Var2.f((iIntValue & 14) | (l72.x0.f111348c << 24), 124, null, t2Var, null, null, str, strH, null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            int i25 = iIntValue2;
                            if (mVar3.n(i25 & 1, (i25 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                pi0.e eVar = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                                b63.o oVar = jVar3.f99266e;
                                if (oVar == null) {
                                    mVar3.C(-1728168905);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-1728168904);
                                    l72.x0.f111346a.a((i25 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var2, null, null, eVar.d(g22.l.h(oVar), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), gl1.y.Q(mVar3, R.string.lbl_last_modified), null, null, mVar3);
                                    mVar3.f();
                                }
                                l72.x0.f111346a.a((i25 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var2, null, null, eVar.d(g22.l.h(jVar3.f99263b), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), gl1.y.Q(mVar3, R.string.lbl_gear_first_use), null, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i18, 1);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(rVar, jVar, i14, 29);
        }
    }

    public static final void b(k kVar, bv.d dVar, GearActivity.w wVar, e23.l lVar, e23.a aVar, e23.a aVar2, e23.l lVar2, e23.l lVar3, e23.p pVar, e23.l lVar4, p3.m mVar, int i14) {
        kVar.getClass();
        dVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        lVar4.getClass();
        p3.o0 o0VarE = mVar.E(1269195123);
        int i15 = i14 | (o0VarE.r(kVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(wVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar3) ? 8388608 : 4194304) | (o0VarE.r(pVar) ? 67108864 : 33554432) | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            c(kVar, dVar.g(), wVar, lVar, aVar, aVar2, lVar2, lVar3, pVar, lVar4, o0VarE, i15 & 2147483534);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(kVar, dVar, wVar, lVar, aVar, aVar2, lVar2, lVar3, pVar, lVar4, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0299  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:162:0x0335  */
    /* JADX WARN: Code duplicated, block: B:164:0x033d  */
    /* JADX WARN: Code duplicated, block: B:165:0x033f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0348  */
    /* JADX WARN: Code duplicated, block: B:172:0x0354  */
    /* JADX WARN: Code duplicated, block: B:173:0x0356  */
    /* JADX WARN: Code duplicated, block: B:177:0x035f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0372  */
    /* JADX WARN: Code duplicated, block: B:181:0x0376  */
    /* JADX WARN: Code duplicated, block: B:183:0x037e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0380  */
    /* JADX WARN: Code duplicated, block: B:188:0x038e  */
    /* JADX WARN: Code duplicated, block: B:191:0x039d  */
    /* JADX WARN: Code duplicated, block: B:192:0x039f  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:200:0x03be  */
    /* JADX WARN: Code duplicated, block: B:202:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:204:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:205:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:209:0x03db  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:213:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:219:0x0406  */
    /* JADX WARN: Code duplicated, block: B:221:0x040e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0416  */
    /* JADX WARN: Code duplicated, block: B:224:0x0418  */
    /* JADX WARN: Code duplicated, block: B:228:0x0421  */
    /* JADX WARN: Code duplicated, block: B:230:0x0433  */
    /* JADX WARN: Code duplicated, block: B:239:0x0455  */
    /* JADX WARN: Code duplicated, block: B:240:0x0457  */
    /* JADX WARN: Code duplicated, block: B:244:0x0469  */
    /* JADX WARN: Code duplicated, block: B:86:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x015e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r16v3, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    public static final void c(q0 q0Var, gg1.o0 o0Var, e23.a<Unit> aVar, e23.l<? super jk0.j, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super List<uk0.a>, Unit> lVar2, e23.l<? super f0, Unit> lVar3, e23.p<? super List<? extends am.x0>, ? super qk0.c, Unit> pVar, e23.l<? super List<jk0.n>, Unit> lVar4, p3.m mVar, int i14) {
        ?? r14;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        p3.m.a.C2565a c2565a;
        ?? r15;
        Object obj5;
        int i15;
        int i16;
        ?? r16;
        Object obj6;
        ?? r17;
        int i17;
        Object obj7;
        ?? r18;
        Object obj8;
        ?? r19;
        int i18;
        Object obj9;
        ?? r110;
        Object obj10;
        ?? r111;
        boolean z14;
        Object obj11;
        ?? r112;
        Object obj12;
        ?? r113;
        Object obj13;
        String str;
        ?? r114;
        int i19;
        Object obj14;
        boolean zB;
        Object obj15;
        p3.o0 o0VarE = mVar.E(208787410);
        int i24 = (o0VarE.B(q0Var) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i24 |= o0VarE.k(o0Var.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i24 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i24 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i24 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i24 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i24 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i24 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i24 |= o0VarE.r(pVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i24 |= o0VarE.r(lVar4) ? 536870912 : 268435456;
        }
        int i25 = i24;
        if (o0VarE.n(i25 & 1, (i25 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = p3.p0.c(q0Var.getUiState(), o0VarE, 0);
            j jVar = (j) p1VarC.getF182175a();
            boolean z15 = jVar.f153168d;
            v0 v0Var = jVar.f153167c;
            u0 u0Var = jVar.f153166b;
            jk0.j jVar2 = jVar.f153165a;
            Boolean boolValueOf = Boolean.valueOf(z15);
            boolean zR = o0VarE.r(jVar) | ((i25 & 57344) == 16384);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                obj = objQ;
                a aVar5 = new a(jVar, aVar2, null);
                o0VarE.K(aVar5);
                obj = aVar5;
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    obj = objQ;
                    a aVar6 = new a(jVar, aVar2, null);
                    o0VarE.K(aVar6);
                    obj = aVar6;
                }
            }
            obj = objQ;
            p3.l0.e((e23.p) obj, boolValueOf, o0VarE);
            Boolean boolValueOf2 = Boolean.valueOf(jVar.f153169e);
            boolean zR2 = o0VarE.r(jVar) | ((i25 & 458752) == 131072);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                obj2 = objQ2;
                c cVar = new c(jVar, aVar3, null);
                o0VarE.K(cVar);
                obj2 = cVar;
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj2 = objQ2;
                    c cVar2 = new c(jVar, aVar3, null);
                    o0VarE.K(cVar2);
                    obj2 = cVar2;
                }
            }
            obj2 = objQ2;
            p3.l0.e((e23.p) obj2, boolValueOf2, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ3 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            Object obj16 = objQ3;
            if (objQ3 == c2565a2) {
                ri1.b bVar = new ri1.b(9);
                o0VarE.K(bVar);
                obj16 = bVar;
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) obj16, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                ri1.b bVar2 = new ri1.b(10);
                o0VarE.K(bVar2);
                obj3 = bVar2;
            } else {
                obj3 = objQ4;
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) obj3, o0VarE, 48);
            Object objQ5 = o0VarE.q();
            Object obj17 = objQ5;
            if (objQ5 == c2565a2) {
                p3.d0 d0VarF = p3.p0.f(new z2(p1VarC, context, 15));
                o0VarE.K(d0VarF);
                obj17 = d0VarF;
            }
            x3 x3Var = (x3) obj17;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                p3.d0 d0VarF2 = p3.p0.f(new z2(p1VarC, context, 16));
                o0VarE.K(d0VarF2);
                obj4 = d0VarF2;
            } else {
                obj4 = objQ6;
            }
            x3 x3Var2 = (x3) obj4;
            boolean z16 = u0Var == u0.InProgress;
            boolean z17 = (z16 && jVar2 == null) || (v0Var instanceof v0.d);
            c2.n0 n0Var = n3.f22788a;
            ?? r24 = o0VarE;
            z02.d.a(z17, z3.f.c(-1324926505, new qy0.d((Object) aVar, (e23.l) lVar, (Object) jVar, (Object) p1Var2, 7), o0VarE), null, null, new c2.n0(0, 0, 0, 0), z3.f.c(-503428133, new ck0.i(jVar, q0Var, z16, lVar4, p1Var, lVar2, x3Var2, o0Var, lVar3, x3Var, p1VarC, pVar), o0VarE), r24, 196656, 12);
            String str2 = jVar2 != null ? jVar2.f99267f : null;
            int i26 = i25 & 14;
            boolean zR3 = r24.r(jVar) | (i26 == 4);
            Object objQ7 = r24.q();
            if (zR3) {
                c2565a = c2565a2;
            } else {
                c2565a = c2565a2;
                if (objQ7 != c2565a) {
                    r15 = 0;
                    obj5 = objQ7;
                }
                uk0.o.b(p1Var, str2, (e23.l) obj5, r24, r15);
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    r24.C(887099665);
                    ?? r115 = l72.c1.f110940a;
                    if (jVar2 != null || (str = jVar2.f99262a) == null) {
                        str = "";
                    }
                    String strP = gl1.y.P(R.string.delete_name_collection_question, new Object[]{str}, r24);
                    String strQ = gl1.y.Q(r24, R.string.delete_gear_collection_confirmation_gear_persists);
                    String strQ2 = gl1.y.Q(r24, R.string.lbl_delete);
                    String strQ3 = gl1.y.Q(r24, R.string.lbl_cancel);
                    if (i26 != 4) {
                        r114 = r15;
                    } else {
                        r114 = 1;
                    }
                    i19 = (r24.B(p1Var2) ? 1 : 0) | r114;
                    Object objQ8 = r24.q();
                    if (i19 == 0 || objQ8 == c2565a) {
                        i15 = 2;
                        f fVar = new f(i15, q0Var, p1Var2);
                        r24.K(fVar);
                        obj14 = fVar;
                    } else {
                        i15 = 2;
                        obj14 = objQ8;
                    }
                    e23.a aVar7 = (e23.a) obj14;
                    zB = r24.B(p1Var2);
                    Object objQ9 = r24.q();
                    obj15 = objQ9;
                    if (zB || objQ9 == c2565a) {
                        qk0.m mVar2 = new qk0.m(p1Var2, 27);
                        r24.K(mVar2);
                        obj15 = mVar2;
                    }
                    r115.a(false, strP, strQ, null, null, strQ2, true, false, aVar7, strQ3, (e23.a) obj15, r24, 1572864, 0, 153);
                    r24.g0(r15);
                } else {
                    i15 = 2;
                    r24.C(887719696);
                    r24.g0(r15);
                }
                if (p005kotlin.jvm.internal.s.g(v0Var, v0.a.f153281a)) {
                    r24.C(887811549);
                    if (i26 != 4) {
                        r112 = r15;
                    } else {
                        r112 = 1;
                    }
                    Object objQ10 = r24.q();
                    obj12 = objQ10;
                    if (r112 == 0 || objQ10 == c2565a) {
                        e eVar = new e(q0Var, 4);
                        r24.K(eVar);
                        obj12 = eVar;
                    }
                    e23.a aVar8 = (e23.a) obj12;
                    if (i26 != 4) {
                        r113 = r15;
                    } else {
                        r113 = 1;
                    }
                    Object objQ11 = r24.q();
                    obj13 = objQ11;
                    if (r113 == 0 || objQ11 == c2565a) {
                        e eVar2 = new e(q0Var, r15);
                        r24.K(eVar2);
                        obj13 = eVar2;
                    }
                    uk0.h.d(aVar8, (e23.a) obj13, r24, r15);
                    r24.g0(r15);
                    i16 = 1;
                } else if (v0Var instanceof v0.b) {
                    r24.C(888090859);
                    if (i26 != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    i18 = (r24.r(v0Var) ? 1 : 0) | r19;
                    Object objQ12 = r24.q();
                    obj9 = objQ12;
                    if (i18 == 0 || objQ12 == c2565a) {
                        f fVar2 = new f(r15, q0Var, (v0.b) v0Var);
                        r24.K(fVar2);
                        obj9 = fVar2;
                    }
                    e23.a aVar9 = (e23.a) obj9;
                    if (i26 != 4) {
                        r110 = r15;
                    } else {
                        r110 = 1;
                    }
                    Object objQ13 = r24.q();
                    if (r110 == 0 || objQ13 == c2565a) {
                        i16 = 1;
                        e eVar3 = new e(q0Var, 1);
                        r24.K(eVar3);
                        obj10 = eVar3;
                    } else {
                        i16 = 1;
                        obj10 = objQ13;
                    }
                    uk0.h.d(aVar9, (e23.a) obj10, r24, r15);
                    r24.g0(r15);
                } else {
                    i16 = 1;
                    if (v0Var instanceof v0.c) {
                        r24.C(888421629);
                        if (i26 != 4) {
                            r17 = r15;
                        } else {
                            r17 = 1;
                        }
                        i17 = (r24.r(v0Var) ? 1 : 0) | r17;
                        Object objQ14 = r24.q();
                        obj7 = objQ14;
                        if (i17 == 0 || objQ14 == c2565a) {
                            f fVar3 = new f(i16, q0Var, (v0.c) v0Var);
                            r24.K(fVar3);
                            obj7 = fVar3;
                        }
                        e23.a aVar10 = (e23.a) obj7;
                        if (i26 != 4) {
                            r18 = r15;
                        } else {
                            r18 = 1;
                        }
                        Object objQ15 = r24.q();
                        obj8 = objQ15;
                        if (r18 == 0 || objQ15 == c2565a) {
                            e eVar4 = new e(q0Var, i15);
                            r24.K(eVar4);
                            obj8 = eVar4;
                        }
                        uk0.h.d(aVar10, (e23.a) obj8, r24, r15);
                        r24.g0(r15);
                    } else if (p005kotlin.jvm.internal.s.g(v0Var, v0.e.f153286a)) {
                        r24.C(888732311);
                        if (i26 != 4) {
                            r16 = r15;
                        } else {
                            r16 = 1;
                        }
                        Object objQ16 = r24.q();
                        obj6 = objQ16;
                        if (r16 == 0 || objQ16 == c2565a) {
                            e eVar5 = new e(q0Var, 3);
                            r24.K(eVar5);
                            obj6 = eVar5;
                        }
                        uk0.h.c((e23.a) obj6, r24, r15);
                        r24.g0(r15);
                    } else {
                        if (v0Var == null && !v0Var.equals(v0.d.f153285a)) {
                            throw kg.f.h(r24, -1218288467, r15);
                        }
                        r24.C(888919086);
                        r24.g0(r15);
                    }
                }
                boolean zR4 = r24.r(jVar);
                if (i26 != 4) {
                    r111 = r15;
                } else {
                    r111 = i16;
                }
                z14 = (((zR4 ? 1 : 0) | r111) == true ? 1 : 0) | (r24.r(context) ? 1 : 0);
                Object objQ17 = r24.q();
                obj11 = objQ17;
                if (z14 || objQ17 == c2565a) {
                    b bVar3 = new b(jVar, q0Var, context, null);
                    r24.K(bVar3);
                    obj11 = bVar3;
                }
                p3.l0.e((e23.p) obj11, u0Var, r24);
                r14 = r24;
            }
            r15 = 0;
            g gVar = new g(false ? 1 : 0, jVar, q0Var);
            r24.K(gVar);
            obj5 = gVar;
            uk0.o.b(p1Var, str2, (e23.l) obj5, r24, r15);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                r24.C(887099665);
                ?? r116 = l72.c1.f110940a;
                if (jVar2 != null) {
                    str = "";
                } else {
                    str = "";
                }
                String strP2 = gl1.y.P(R.string.delete_name_collection_question, new Object[]{str}, r24);
                String strQ4 = gl1.y.Q(r24, R.string.delete_gear_collection_confirmation_gear_persists);
                String strQ5 = gl1.y.Q(r24, R.string.lbl_delete);
                String strQ6 = gl1.y.Q(r24, R.string.lbl_cancel);
                if (i26 != 4) {
                    r114 = r15;
                } else {
                    r114 = 1;
                }
                i19 = (r24.B(p1Var2) ? 1 : 0) | r114;
                Object objQ18 = r24.q();
                if (i19 == 0) {
                    i15 = 2;
                    f fVar4 = new f(i15, q0Var, p1Var2);
                    r24.K(fVar4);
                    obj14 = fVar4;
                } else {
                    i15 = 2;
                    f fVar5 = new f(i15, q0Var, p1Var2);
                    r24.K(fVar5);
                    obj14 = fVar5;
                }
                e23.a aVar11 = (e23.a) obj14;
                zB = r24.B(p1Var2);
                Object objQ19 = r24.q();
                obj15 = objQ19;
                if (zB) {
                    qk0.m mVar3 = new qk0.m(p1Var2, 27);
                    r24.K(mVar3);
                    obj15 = mVar3;
                } else {
                    qk0.m mVar4 = new qk0.m(p1Var2, 27);
                    r24.K(mVar4);
                    obj15 = mVar4;
                }
                r116.a(false, strP2, strQ4, null, null, strQ5, true, false, aVar11, strQ6, (e23.a) obj15, r24, 1572864, 0, 153);
                r24.g0(r15);
            } else {
                i15 = 2;
                r24.C(887719696);
                r24.g0(r15);
            }
            if (p005kotlin.jvm.internal.s.g(v0Var, v0.a.f153281a)) {
                r24.C(887811549);
                if (i26 != 4) {
                    r112 = r15;
                } else {
                    r112 = 1;
                }
                Object objQ110 = r24.q();
                obj12 = objQ110;
                if (r112 == 0) {
                    e eVar6 = new e(q0Var, 4);
                    r24.K(eVar6);
                    obj12 = eVar6;
                } else {
                    e eVar7 = new e(q0Var, 4);
                    r24.K(eVar7);
                    obj12 = eVar7;
                }
                e23.a aVar12 = (e23.a) obj12;
                if (i26 != 4) {
                    r113 = r15;
                } else {
                    r113 = 1;
                }
                Object objQ111 = r24.q();
                obj13 = objQ111;
                if (r113 == 0) {
                    e eVar8 = new e(q0Var, r15);
                    r24.K(eVar8);
                    obj13 = eVar8;
                } else {
                    e eVar9 = new e(q0Var, r15);
                    r24.K(eVar9);
                    obj13 = eVar9;
                }
                uk0.h.d(aVar12, (e23.a) obj13, r24, r15);
                r24.g0(r15);
                i16 = 1;
            } else if (v0Var instanceof v0.b) {
                r24.C(888090859);
                if (i26 != 4) {
                    r19 = r15;
                } else {
                    r19 = 1;
                }
                i18 = (r24.r(v0Var) ? 1 : 0) | r19;
                Object objQ112 = r24.q();
                obj9 = objQ112;
                if (i18 == 0) {
                    f fVar6 = new f(r15, q0Var, (v0.b) v0Var);
                    r24.K(fVar6);
                    obj9 = fVar6;
                } else {
                    f fVar7 = new f(r15, q0Var, (v0.b) v0Var);
                    r24.K(fVar7);
                    obj9 = fVar7;
                }
                e23.a aVar13 = (e23.a) obj9;
                if (i26 != 4) {
                    r110 = r15;
                } else {
                    r110 = 1;
                }
                Object objQ113 = r24.q();
                if (r110 == 0) {
                    i16 = 1;
                    e eVar10 = new e(q0Var, 1);
                    r24.K(eVar10);
                    obj10 = eVar10;
                } else {
                    i16 = 1;
                    e eVar11 = new e(q0Var, 1);
                    r24.K(eVar11);
                    obj10 = eVar11;
                }
                uk0.h.d(aVar13, (e23.a) obj10, r24, r15);
                r24.g0(r15);
            } else {
                i16 = 1;
                if (v0Var instanceof v0.c) {
                    r24.C(888421629);
                    if (i26 != 4) {
                        r17 = r15;
                    } else {
                        r17 = 1;
                    }
                    i17 = (r24.r(v0Var) ? 1 : 0) | r17;
                    Object objQ114 = r24.q();
                    obj7 = objQ114;
                    if (i17 == 0) {
                        f fVar8 = new f(i16, q0Var, (v0.c) v0Var);
                        r24.K(fVar8);
                        obj7 = fVar8;
                    } else {
                        f fVar9 = new f(i16, q0Var, (v0.c) v0Var);
                        r24.K(fVar9);
                        obj7 = fVar9;
                    }
                    e23.a aVar14 = (e23.a) obj7;
                    if (i26 != 4) {
                        r18 = r15;
                    } else {
                        r18 = 1;
                    }
                    Object objQ115 = r24.q();
                    obj8 = objQ115;
                    if (r18 == 0) {
                        e eVar12 = new e(q0Var, i15);
                        r24.K(eVar12);
                        obj8 = eVar12;
                    } else {
                        e eVar13 = new e(q0Var, i15);
                        r24.K(eVar13);
                        obj8 = eVar13;
                    }
                    uk0.h.d(aVar14, (e23.a) obj8, r24, r15);
                    r24.g0(r15);
                } else if (p005kotlin.jvm.internal.s.g(v0Var, v0.e.f153286a)) {
                    r24.C(888732311);
                    if (i26 != 4) {
                        r16 = r15;
                    } else {
                        r16 = 1;
                    }
                    Object objQ116 = r24.q();
                    obj6 = objQ116;
                    if (r16 == 0) {
                        e eVar14 = new e(q0Var, 3);
                        r24.K(eVar14);
                        obj6 = eVar14;
                    } else {
                        e eVar15 = new e(q0Var, 3);
                        r24.K(eVar15);
                        obj6 = eVar15;
                    }
                    uk0.h.c((e23.a) obj6, r24, r15);
                    r24.g0(r15);
                } else {
                    if (v0Var == null) {
                    }
                    r24.C(888919086);
                    r24.g0(r15);
                }
            }
            boolean zR5 = r24.r(jVar);
            if (i26 != 4) {
                r111 = r15;
            } else {
                r111 = i16;
            }
            z14 = (((zR5 ? 1 : 0) | r111) == true ? 1 : 0) | (r24.r(context) ? 1 : 0);
            Object objQ117 = r24.q();
            obj11 = objQ117;
            if (z14) {
                b bVar4 = new b(jVar, q0Var, context, null);
                r24.K(bVar4);
                obj11 = bVar4;
            } else {
                b bVar5 = new b(jVar, q0Var, context, null);
                r24.K(bVar5);
                obj11 = bVar5;
            }
            p3.l0.e((e23.p) obj11, u0Var, r24);
            r14 = r24;
        } else {
            p3.o0 o0Var2 = o0VarE;
            o0Var2.e();
            r14 = o0Var2;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(q0Var, o0Var, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(p1 p1Var, e23.p pVar, List list) {
        Iterable iterable;
        jk0.j jVar = ((j) p1Var.getF182175a()).f153165a;
        if (jVar == null || (iterable = jVar.f99268g) == null) {
            iterable = p13.j0.f134944a;
        }
        qk0.c.Companion companion = qk0.c.INSTANCE;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((jk0.s) it.next()).f99324c);
        }
        Set setG1 = p13.h0.g1(arrayList);
        ArrayList arrayList2 = new ArrayList(p13.y.r(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((jk0.s) it3.next()).f99322a);
        }
        Set setG2 = p13.h0.g1(arrayList2);
        jk0.j jVar2 = ((j) p1Var.getF182175a()).f153165a;
        String str = jVar2 != null ? jVar2.f99264c : null;
        Set setB = str != null ? p13.a1.b(str) : p13.l0.f134950a;
        companion.getClass();
        pVar.invoke(list, qk0.c.Companion.a(setG1, setG2, setB));
    }

    public static final void e(h4.r rVar, ArrayList arrayList, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(284260776);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(arrayList) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(-1703296604);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(z3.f.c(523273104, new g02.u0(it.next(), aVar, 1, (byte) 0), o0VarE));
            }
            o0VarE.g0(false);
            o0Var = o0VarE;
            m82.d.b(rVar, i53.a.j(arrayList2), 0.0f, null, 0.0f, null, null, null, null, 0, false, z1.u.b.f200876a, o0Var, (i15 & 14) | 1572864, 48, 1980);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(rVar, arrayList, aVar, i14, 20);
        }
    }
}
