package t70;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.a5;
import c2.l2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e9;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import l72.i3;
import o4.g1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import r53.e2;
import r53.m1;
import r53.p2;
import s70.j1;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditSecondaryStatsScreenKt$EditSecondaryStats$1$1", f = "EditSecondaryStatsScreen.kt", l = {151}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f162994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f162995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f162996d;

        /* JADX INFO: renamed from: t70.s0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3067a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f162997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f162998b;

            /* JADX INFO: renamed from: t70.s0$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3068a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f162999a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f162999a = iArr;
                }
            }

            public C3067a(e23.a<Unit> aVar, Context context) {
                this.f162997a = aVar;
                this.f162998b = context;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int i14 = C3068a.f162999a[((fw.p) obj).ordinal()];
                if (i14 == 1) {
                    this.f162997a.invoke();
                } else if (i14 == 2) {
                    Toast.makeText(this.f162998b, R.string.txt_error_occurred, 0).show();
                } else if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var, e23.a<Unit> aVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f162994b = x0Var;
            this.f162995c = aVar;
            this.f162996d = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f162994b, this.f162995c, this.f162996d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f162993a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = this.f162994b.f163056j;
                C3067a c3067a = new C3067a(this.f162995c, this.f162996d);
                this.f162993a = 1;
                e2Var.getClass();
                if (e2.m(e2Var, c3067a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditSecondaryStatsScreenKt$EditSecondaryStats$2$1", f = "EditSecondaryStatsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f163001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f163000a = aVar;
            this.f163001b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f163000a, this.f163001b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f163001b.getF182175a().booleanValue()) {
                this.f163000a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0 f163002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f163003b;

        public c(p0 p0Var, x0 x0Var) {
            this.f163002a = p0Var;
            this.f163003b = x0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            boolean z14 = ((p0.a) this.f163002a).f162945b;
            x0 x0Var = this.f163003b;
            if (z14) {
                x0Var.f163053g.k(null, Boolean.TRUE);
                r53.s.C(new m1(x0Var.f163047a.Z2(), new y0(x0Var, null)), v1.a(x0Var));
            } else {
                x0Var.f163057k.k(null, Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<o53.u0> f163004a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.a<? extends o53.u0> aVar) {
            this.f163004a = aVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f163004a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<j70.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<o53.u0> f163005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f163006b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(e23.a<? extends o53.u0> aVar, x0 x0Var) {
            this.f163005a = aVar;
            this.f163006b = x0Var;
        }

        @Override // e23.l
        public final Unit invoke(j70.b bVar) {
            ArrayList arrayList;
            j70.b bVar2 = bVar;
            bVar2.getClass();
            this.f163005a.invoke();
            String cardType = bVar2.getCardType();
            x0 x0Var = this.f163006b;
            ArrayList arrayList2 = x0Var.f163070z;
            ArrayList arrayList3 = x0Var.f163069y;
            cardType.getClass();
            p2 p2Var = x0Var.f163051e;
            List list = (List) p2Var.getValue();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!p005kotlin.jvm.internal.s.g(((j70.b) obj).getCardType(), cardType)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            p2Var.setValue(arrayList);
            if (!arrayList3.contains(cardType)) {
                arrayList2.add(cardType);
            }
            x0Var.f163049c.k(null, x0.x4(arrayList3, arrayList2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.s<c2.t, Boolean, h4.r, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f163007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p0 f163008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f163009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f163010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i02.m f163011e;

        public f(int i14, p0 p0Var, Context context, x0 x0Var, i02.m mVar) {
            this.f163007a = i14;
            this.f163008b = p0Var;
            this.f163009c = context;
            this.f163010d = x0Var;
            this.f163011e = mVar;
        }

        /* JADX WARN: Code duplicated, block: B:85:0x026e  */
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
        @Override // e23.s
        public final Unit invoke(c2.t tVar, Boolean bool, h4.r rVar, p3.m mVar, Integer num) {
            long jF;
            long jB;
            final int i14;
            o13.p pVar;
            boolean zBooleanValue = bool.booleanValue();
            h4.r rVar2 = rVar;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            tVar.getClass();
            rVar2.getClass();
            int i15 = (iIntValue & 48) == 0 ? (mVar2.h(zBooleanValue) ? 32 : 16) | iIntValue : iIntValue;
            if ((iIntValue & 384) == 0) {
                i15 |= mVar2.B(rVar2) ? 256 : 128;
            }
            if (mVar2.n(i15 & 1, (i15 & 1169) != 1168)) {
                x1 x1Var = p3.n.f135158a;
                int i16 = this.f163007a;
                p0 p0Var = this.f163008b;
                final i02.f fVar = new i02.f(i16, p0Var.f162944a);
                if (zBooleanValue) {
                    mVar2.C(644110408);
                    d92.b.f58623a.getClass();
                    jF = d92.b.a(mVar2).c().g();
                } else {
                    mVar2.C(644111592);
                    d92.b.f58623a.getClass();
                    jF = d92.b.a(mVar2).c().f();
                }
                mVar2.f();
                long j8 = jF;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97917b;
                h4.r rVarE = u1.n.e(c2.l.C(rVar2, 0.0f, f14, 0.0f, f14, 5), j8, k2.i.a(eVar.f97918c));
                o70.t tVar2 = ((p0.d) p0Var).f162952b;
                l22.a aVarS = w2.a0.s(mVar2);
                o70.t.a aVar = o70.t.f130062f;
                String strD = tVar2.d(aVarS, null);
                u4.d dVarB = o70.t.b(tVar2);
                o4.d0 d0VarE = tVar2.e(null, mVar2, 1);
                if (d0VarE == null) {
                    mVar2.C(644133287);
                    jB = d92.b.a(mVar2).f().b();
                    mVar2.f();
                } else {
                    mVar2.C(644131489);
                    mVar2.f();
                    jB = d0VarE.f128833a;
                }
                Context context = this.f163009c;
                context.getClass();
                final x0 x0Var = this.f163010d;
                x0Var.getClass();
                ArrayList arrayList = x0Var.f163070z;
                ArrayList<t70.d> arrayListD1 = p13.h0.d1(t70.d.f162830g);
                ArrayList arrayList2 = x0Var.f163069y;
                int size = arrayList2.size();
                Object obj = fVar.f86852b;
                if ((size == 1 && p13.h0.R(arrayList2, obj)) || p13.h0.R(arrayList, obj)) {
                    arrayListD1.remove(t70.d.REMOVE_FROM_HOME_SCREEN);
                }
                if (p13.h0.R(arrayList2, obj)) {
                    arrayListD1.remove(t70.d.REMOVE_FROM_AT_A_GLANCE);
                }
                if ((arrayList2.size() == 8 && p13.h0.R(arrayList, obj)) || p13.h0.R(arrayList2, obj)) {
                    arrayListD1.remove(t70.d.MOVE_TO_HOME_SCREEN);
                }
                if (p005kotlin.jvm.internal.s.g(p13.h0.n0(arrayList2), obj) || p005kotlin.jvm.internal.s.g(p13.h0.n0(arrayList), obj)) {
                    arrayListD1.remove(t70.d.MOVE_DOWN);
                }
                if (p005kotlin.jvm.internal.s.g(p13.h0.d0(arrayList2), obj) || p005kotlin.jvm.internal.s.g(p13.h0.d0(arrayList), obj)) {
                    arrayListD1.remove(t70.d.MOVE_UP);
                }
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayListD1, 10));
                for (t70.d dVar : arrayListD1) {
                    int i17 = t70.f.f162847a[dVar.ordinal()];
                    if (i17 != 1) {
                        final int i18 = 2;
                        if (i17 != 2) {
                            final int i19 = 3;
                            if (i17 != 3) {
                                final int i24 = 4;
                                if (i17 == 4) {
                                    pVar = new o13.p(Integer.valueOf(R.string.msg_remove_from_home_screen), new e23.a() { // from class: t70.e
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    x0 x0Var2 = x0Var;
                                                    x0Var2.getClass();
                                                    List list = (List) x0Var2.f163049c.getValue();
                                                    i02.f fVar2 = fVar;
                                                    int i25 = fVar2.f86851a;
                                                    p0 p0Var2 = (p0) p13.h0.e0(i25 - 1, list);
                                                    if (p0Var2 instanceof p0.d) {
                                                        x0Var2.A4(fVar2, new i02.f(i25 + 1, ((p0.d) p0Var2).f162944a));
                                                    }
                                                    break;
                                                case 1:
                                                    x0 x0Var3 = x0Var;
                                                    x0Var3.getClass();
                                                    List list2 = (List) x0Var3.f163049c.getValue();
                                                    i02.f fVar3 = fVar;
                                                    int i26 = fVar3.f86851a + 1;
                                                    p0 p0Var3 = (p0) p13.h0.e0(i26, list2);
                                                    if (p0Var3 instanceof p0.d) {
                                                        x0Var3.A4(fVar3, new i02.f(i26, ((p0.d) p0Var3).f162944a));
                                                    }
                                                    break;
                                                case 2:
                                                    x0 x0Var4 = x0Var;
                                                    x0Var4.getClass();
                                                    Iterator it = ((List) x0Var4.f163049c.getValue()).iterator();
                                                    int i27 = 0;
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            i27 = -1;
                                                        } else if (!p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, "HEADER_STATS_ADDITIONAL")) {
                                                            i27++;
                                                        }
                                                    }
                                                    if (i27 > 0) {
                                                        x0Var4.A4(fVar, new i02.f(i27, "HEADER_STATS_ADDITIONAL"));
                                                    }
                                                    break;
                                                case 3:
                                                    x0 x0Var5 = x0Var;
                                                    x0Var5.getClass();
                                                    p2 p2Var = x0Var5.f163049c;
                                                    p0 p0Var4 = (p0) p13.h0.n0((List) p2Var.getValue());
                                                    int iG0 = p13.h0.g0(p0Var4, (List) p2Var.getValue());
                                                    if (p0Var4 != null && iG0 > 0) {
                                                        x0Var5.A4(fVar, new i02.f(iG0, p0Var4.f162944a));
                                                    }
                                                    break;
                                                default:
                                                    x0Var.B4(fVar);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                } else {
                                    if (i17 != 5) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    pVar = new o13.p(Integer.valueOf(R.string.msg_remove_from_at_a_glance), new e23.a() { // from class: t70.e
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i24) {
                                                case 0:
                                                    x0 x0Var2 = x0Var;
                                                    x0Var2.getClass();
                                                    List list = (List) x0Var2.f163049c.getValue();
                                                    i02.f fVar2 = fVar;
                                                    int i25 = fVar2.f86851a;
                                                    p0 p0Var2 = (p0) p13.h0.e0(i25 - 1, list);
                                                    if (p0Var2 instanceof p0.d) {
                                                        x0Var2.A4(fVar2, new i02.f(i25 + 1, ((p0.d) p0Var2).f162944a));
                                                    }
                                                    break;
                                                case 1:
                                                    x0 x0Var3 = x0Var;
                                                    x0Var3.getClass();
                                                    List list2 = (List) x0Var3.f163049c.getValue();
                                                    i02.f fVar3 = fVar;
                                                    int i26 = fVar3.f86851a + 1;
                                                    p0 p0Var3 = (p0) p13.h0.e0(i26, list2);
                                                    if (p0Var3 instanceof p0.d) {
                                                        x0Var3.A4(fVar3, new i02.f(i26, ((p0.d) p0Var3).f162944a));
                                                    }
                                                    break;
                                                case 2:
                                                    x0 x0Var4 = x0Var;
                                                    x0Var4.getClass();
                                                    Iterator it = ((List) x0Var4.f163049c.getValue()).iterator();
                                                    int i27 = 0;
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            i27 = -1;
                                                        } else if (!p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, "HEADER_STATS_ADDITIONAL")) {
                                                            i27++;
                                                        }
                                                    }
                                                    if (i27 > 0) {
                                                        x0Var4.A4(fVar, new i02.f(i27, "HEADER_STATS_ADDITIONAL"));
                                                    }
                                                    break;
                                                case 3:
                                                    x0 x0Var5 = x0Var;
                                                    x0Var5.getClass();
                                                    p2 p2Var = x0Var5.f163049c;
                                                    p0 p0Var4 = (p0) p13.h0.n0((List) p2Var.getValue());
                                                    int iG0 = p13.h0.g0(p0Var4, (List) p2Var.getValue());
                                                    if (p0Var4 != null && iG0 > 0) {
                                                        x0Var5.A4(fVar, new i02.f(iG0, p0Var4.f162944a));
                                                    }
                                                    break;
                                                default:
                                                    x0Var.B4(fVar);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                }
                            } else {
                                pVar = new o13.p(Integer.valueOf(R.string.msg_move_to_home_screen), new e23.a() { // from class: t70.e
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                x0 x0Var2 = x0Var;
                                                x0Var2.getClass();
                                                List list = (List) x0Var2.f163049c.getValue();
                                                i02.f fVar2 = fVar;
                                                int i25 = fVar2.f86851a;
                                                p0 p0Var2 = (p0) p13.h0.e0(i25 - 1, list);
                                                if (p0Var2 instanceof p0.d) {
                                                    x0Var2.A4(fVar2, new i02.f(i25 + 1, ((p0.d) p0Var2).f162944a));
                                                }
                                                break;
                                            case 1:
                                                x0 x0Var3 = x0Var;
                                                x0Var3.getClass();
                                                List list2 = (List) x0Var3.f163049c.getValue();
                                                i02.f fVar3 = fVar;
                                                int i26 = fVar3.f86851a + 1;
                                                p0 p0Var3 = (p0) p13.h0.e0(i26, list2);
                                                if (p0Var3 instanceof p0.d) {
                                                    x0Var3.A4(fVar3, new i02.f(i26, ((p0.d) p0Var3).f162944a));
                                                }
                                                break;
                                            case 2:
                                                x0 x0Var4 = x0Var;
                                                x0Var4.getClass();
                                                Iterator it = ((List) x0Var4.f163049c.getValue()).iterator();
                                                int i27 = 0;
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        i27 = -1;
                                                    } else if (!p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, "HEADER_STATS_ADDITIONAL")) {
                                                        i27++;
                                                    }
                                                }
                                                if (i27 > 0) {
                                                    x0Var4.A4(fVar, new i02.f(i27, "HEADER_STATS_ADDITIONAL"));
                                                }
                                                break;
                                            case 3:
                                                x0 x0Var5 = x0Var;
                                                x0Var5.getClass();
                                                p2 p2Var = x0Var5.f163049c;
                                                p0 p0Var4 = (p0) p13.h0.n0((List) p2Var.getValue());
                                                int iG0 = p13.h0.g0(p0Var4, (List) p2Var.getValue());
                                                if (p0Var4 != null && iG0 > 0) {
                                                    x0Var5.A4(fVar, new i02.f(iG0, p0Var4.f162944a));
                                                }
                                                break;
                                            default:
                                                x0Var.B4(fVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            i14 = 1;
                        } else {
                            i14 = 1;
                            pVar = new o13.p(Integer.valueOf(R.string.move_down), new e23.a() { // from class: t70.e
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            x0 x0Var2 = x0Var;
                                            x0Var2.getClass();
                                            List list = (List) x0Var2.f163049c.getValue();
                                            i02.f fVar2 = fVar;
                                            int i25 = fVar2.f86851a;
                                            p0 p0Var2 = (p0) p13.h0.e0(i25 - 1, list);
                                            if (p0Var2 instanceof p0.d) {
                                                x0Var2.A4(fVar2, new i02.f(i25 + 1, ((p0.d) p0Var2).f162944a));
                                            }
                                            break;
                                        case 1:
                                            x0 x0Var3 = x0Var;
                                            x0Var3.getClass();
                                            List list2 = (List) x0Var3.f163049c.getValue();
                                            i02.f fVar3 = fVar;
                                            int i26 = fVar3.f86851a + 1;
                                            p0 p0Var3 = (p0) p13.h0.e0(i26, list2);
                                            if (p0Var3 instanceof p0.d) {
                                                x0Var3.A4(fVar3, new i02.f(i26, ((p0.d) p0Var3).f162944a));
                                            }
                                            break;
                                        case 2:
                                            x0 x0Var4 = x0Var;
                                            x0Var4.getClass();
                                            Iterator it = ((List) x0Var4.f163049c.getValue()).iterator();
                                            int i27 = 0;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i27 = -1;
                                                } else if (!p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, "HEADER_STATS_ADDITIONAL")) {
                                                    i27++;
                                                }
                                            }
                                            if (i27 > 0) {
                                                x0Var4.A4(fVar, new i02.f(i27, "HEADER_STATS_ADDITIONAL"));
                                            }
                                            break;
                                        case 3:
                                            x0 x0Var5 = x0Var;
                                            x0Var5.getClass();
                                            p2 p2Var = x0Var5.f163049c;
                                            p0 p0Var4 = (p0) p13.h0.n0((List) p2Var.getValue());
                                            int iG0 = p13.h0.g0(p0Var4, (List) p2Var.getValue());
                                            if (p0Var4 != null && iG0 > 0) {
                                                x0Var5.A4(fVar, new i02.f(iG0, p0Var4.f162944a));
                                            }
                                            break;
                                        default:
                                            x0Var.B4(fVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    } else {
                        i14 = 1;
                        final int i25 = 0;
                        pVar = new o13.p(Integer.valueOf(R.string.move_up), new e23.a() { // from class: t70.e
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        x0 x0Var2 = x0Var;
                                        x0Var2.getClass();
                                        List list = (List) x0Var2.f163049c.getValue();
                                        i02.f fVar2 = fVar;
                                        int i26 = fVar2.f86851a;
                                        p0 p0Var2 = (p0) p13.h0.e0(i26 - 1, list);
                                        if (p0Var2 instanceof p0.d) {
                                            x0Var2.A4(fVar2, new i02.f(i26 + 1, ((p0.d) p0Var2).f162944a));
                                        }
                                        break;
                                    case 1:
                                        x0 x0Var3 = x0Var;
                                        x0Var3.getClass();
                                        List list2 = (List) x0Var3.f163049c.getValue();
                                        i02.f fVar3 = fVar;
                                        int i27 = fVar3.f86851a + 1;
                                        p0 p0Var3 = (p0) p13.h0.e0(i27, list2);
                                        if (p0Var3 instanceof p0.d) {
                                            x0Var3.A4(fVar3, new i02.f(i27, ((p0.d) p0Var3).f162944a));
                                        }
                                        break;
                                    case 2:
                                        x0 x0Var4 = x0Var;
                                        x0Var4.getClass();
                                        Iterator it = ((List) x0Var4.f163049c.getValue()).iterator();
                                        int i28 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i28 = -1;
                                            } else if (!p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, "HEADER_STATS_ADDITIONAL")) {
                                                i28++;
                                            }
                                        }
                                        if (i28 > 0) {
                                            x0Var4.A4(fVar, new i02.f(i28, "HEADER_STATS_ADDITIONAL"));
                                        }
                                        break;
                                    case 3:
                                        x0 x0Var5 = x0Var;
                                        x0Var5.getClass();
                                        p2 p2Var = x0Var5.f163049c;
                                        p0 p0Var4 = (p0) p13.h0.n0((List) p2Var.getValue());
                                        int iG0 = p13.h0.g0(p0Var4, (List) p2Var.getValue());
                                        if (p0Var4 != null && iG0 > 0) {
                                            x0Var5.A4(fVar, new i02.f(iG0, p0Var4.f162944a));
                                        }
                                        break;
                                    default:
                                        x0Var.B4(fVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    int iIntValue2 = ((Number) pVar.f128594a).intValue();
                    e23.a aVar2 = (e23.a) pVar.f128595b;
                    String string = context.getString(iIntValue2);
                    string.getClass();
                    i02.f fVar2 = fVar;
                    x0 x0Var2 = x0Var;
                    arrayList3.add(new p5.g(string, new p50.d(aVar2, context, dVar, fVar2, x0Var2, 11)));
                    strD = strD;
                    fVar = fVar2;
                    x0Var = x0Var2;
                }
                i02.f fVar3 = fVar;
                x0 x0Var3 = x0Var;
                String str = strD;
                i53.f fVarJ = i53.a.j(arrayList3);
                boolean zR = mVar2.r(x0Var3) | mVar2.r(fVar3);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new t0(x0Var3, fVar3);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t0(x0Var3, fVar3);
                        mVar2.K(objQ);
                    }
                }
                s0.b(rVarE, str, dVarB, jB, this.f163011e, fVarJ, (e23.a) objQ, mVar2, i02.m.f86874s << 12);
                x1 x1Var2 = p3.n.f135158a;
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<o53.u0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f163012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f163013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0 f163014c;

        public g(o53.b0 b0Var, mc mcVar, x0 x0Var) {
            this.f163012a = b0Var;
            this.f163013b = mcVar;
            this.f163014c = x0Var;
        }

        @Override // e23.a
        public final o53.u0 invoke() {
            mc mcVar = this.f163013b;
            return ge1.b.T(this.f163012a, null, null, new u0(mcVar, null), 3).J(new v0(mcVar, this.f163014c));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p f163015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f163016b;

        public h(e23.p pVar, List list) {
            this.f163015a = pVar;
            this.f163016b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f163015a.invoke(Integer.valueOf(iIntValue), this.f163016b.get(iIntValue));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.p<f2.t, Integer, f2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.q f163017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f163018b;

        public i(e23.q qVar, List list) {
            this.f163017a = qVar;
            this.f163018b = list;
        }

        @Override // e23.p
        public final f2.c invoke(f2.t tVar, Integer num) {
            int iIntValue = num.intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Object obj = this.f163018b.get(iIntValue);
            return f2.c.a(((f2.c) this.f163017a.invoke(tVar, numValueOf, obj)).f68178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f163019a;

        public j(List list) {
            this.f163019a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f163019a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.r<f2.r, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f163020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f163021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f163022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ mc f163023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i02.m f163024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x3 f163025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x3 f163026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f163027h;

        public k(List list, x0 x0Var, o53.b0 b0Var, mc mcVar, i02.m mVar, x3 x3Var, x3 x3Var2, Context context) {
            this.f163020a = list;
            this.f163021b = x0Var;
            this.f163022c = b0Var;
            this.f163023d = mcVar;
            this.f163024e = mVar;
            this.f163025f = x3Var;
            this.f163026g = x3Var2;
            this.f163027h = context;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0082  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:49:0x010c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v2, types: [i53.c] */
        @Override // e23.r
        public final Unit invoke(f2.r rVar, Integer num, p3.m mVar, Integer num2) throws Throwable {
            int i14;
            f2.r rVar2 = rVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(rVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            int i15 = i14;
            if (mVar2.n(i15 & 1, (i15 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                p0 p0Var = (p0) this.f163020a.get(iIntValue);
                mVar2.C(-626731815);
                Object objP = null;
                if (p0Var instanceof p0.a) {
                    mVar2.C(-626769171);
                    boolean zB = mVar2.B(p0Var);
                    x0 x0Var = this.f163021b;
                    boolean zR = zB | mVar2.r(x0Var);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        objQ = new c(p0Var, x0Var);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c(p0Var, x0Var);
                            mVar2.K(objQ);
                        }
                    }
                    s0.a((e23.a) objQ, mVar2, 0);
                    o53.b0 b0Var = this.f163022c;
                    boolean zR2 = mVar2.r(b0Var);
                    mc mcVar = this.f163023d;
                    boolean zB2 = zR2 | mVar2.B(mcVar) | mVar2.r(x0Var);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new g(b0Var, mcVar, x0Var);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new g(b0Var, mcVar, x0Var);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ2;
                    if (((Boolean) this.f163025f.getF182175a()).booleanValue()) {
                        mVar2.C(-626046096);
                        List list = (List) this.f163026g.getF182175a();
                        ?? J = list != null ? i53.a.j(list) : null;
                        boolean zB3 = mVar2.B(aVar2);
                        Object objQ3 = mVar2.q();
                        if (zB3) {
                            objQ3 = new d(aVar2);
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new d(aVar2);
                                mVar2.K(objQ3);
                            }
                        }
                        e23.a aVar3 = (e23.a) objQ3;
                        boolean zB4 = mVar2.B(aVar2) | mVar2.r(x0Var);
                        Object objQ4 = mVar2.q();
                        if (zB4) {
                            objQ4 = new e(aVar2, x0Var);
                            mVar2.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e(aVar2, x0Var);
                                mVar2.K(objQ4);
                            }
                        }
                        s70.i.a(0, aVar3, (e23.l) objQ4, this.f163023d, J, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-625535805);
                        mVar2.f();
                    }
                    mVar2.f();
                } else if (p0Var instanceof p0.c) {
                    mVar2.C(-625434094);
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarB = f2.r.b(rVar2, aVar4);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (iIntValue != 0) {
                        mVar2.C(361002627);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        v5.a(0.0f, 0, 2, q2.f(mVar2), c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(361165036);
                        mVar2.f();
                    }
                    p0.c cVar = (p0.c) p0Var;
                    int i16 = cVar.f162950c;
                    Object obj = cVar.f162951d;
                    if (obj == null) {
                        mVar2.C(361256671);
                        mVar2.f();
                    } else {
                        mVar2.C(361256672);
                        objP = gl1.y.P(i16, new Object[]{obj}, mVar2);
                        mVar2.f();
                    }
                    if (objP == null) {
                        objP = sn.a.h(mVar2, 1120035610, i16, mVar2);
                    } else {
                        mVar2.C(1120031580);
                        mVar2.f();
                    }
                    ?? r14 = objP;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97932i, mVar2);
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    mh.c(r14, c2.l.C(aVar4, 0.0f, f14, 0.0f, f14, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                    mVar2 = mVar2;
                    mVar2.y();
                    mVar2.f();
                } else if (p0Var instanceof p0.b) {
                    mVar2.C(-624535807);
                    if (((p0.b) p0Var).f162948c) {
                        mVar2.C(-624306686);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f15 = eVar.f97917b;
                        g6.f.a aVar6 = g6.f.f75994b;
                        c2.l.f(x2.h(c2.l.y(c2.l.C(rVarF, 0.0f, f15, 0.0f, f15, 5), eVar.f97920e), 100), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-623875197);
                        mVar2.f();
                    }
                    mVar2.f();
                } else {
                    if (!(p0Var instanceof p0.d)) {
                        throw n23.j.m(mVar2, 1503803498);
                    }
                    mVar2.C(-623729125);
                    t70.c.f162815a.getClass();
                    z3.e eVar2 = t70.c.f162816b;
                    String str = p0Var.f162944a;
                    Context context = this.f163027h;
                    x0 x0Var2 = this.f163021b;
                    i02.m mVar3 = this.f163024e;
                    i02.h.a(rVar2, mVar3, str, null, eVar2, z3.f.c(1493406016, new f(iIntValue, p0Var, context, x0Var2, mVar3), mVar2), mVar2, (i15 & 14) | 1769472 | (i02.m.f86874s << 3));
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x018f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0196  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0269  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) throws Throwable {
        int i15;
        int i16;
        Throwable th3;
        h5.g.a.f fVar;
        boolean zB;
        Object objQ;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-791766656);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strP = gl1.y.P(R.string.lbl_button_desc, new Object[]{gl1.y.Q(o0VarE, R.string.lbl_add_stat)}, o0VarE);
            g6.f.a aVar2 = g6.f.f75994b;
            float fG = w02.b0.g(1, o0VarE);
            g1.a aVar3 = g1.f128855a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float fG2 = w02.b0.g(eVar.f97918c, o0VarE);
            bVar.getClass();
            float[] fArr = {fG2, w02.b0.g(eVar.f97918c, o0VarE)};
            aVar3.getClass();
            q4.k kVar = new q4.k(fG, 0.0f, 0, 0, g1.a.a(0.0f, fArr), 14, null);
            gl.c.f77766a.getClass();
            long jG = gl.c.a(o0VarE).g();
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF = x2.f(aVar4, 1.0f);
            bVar.getClass();
            float f14 = eVar.f97917b;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarF, 0.0f, f14, 0.0f, eVar.f97917b, 5);
            boolean zL = o0VarE.l(jG) | o0VarE.r(kVar);
            Object objQ2 = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zL) {
                objQ2 = new bb2.b(jG, kVar, 12);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new bb2.b(jG, kVar, 12);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarD = l4.k.d(rVarC2, (e23.l) objQ2);
            boolean z14 = (i15 & 14) == 4;
            Object objQ3 = o0VarE.q();
            if (z14) {
                objQ3 = new t21.a(aVar, 28);
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new t21.a(aVar, 28);
                    o0VarE.K(objQ3);
                }
            }
            h4.r rVarD2 = u1.w.d(rVarD, false, null, null, (e23.a) objQ3, 15);
            bVar.getClass();
            h4.r rVarH = x2.h(c2.l.y(rVarD2, eVar.f97920e), 100);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarH, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
            } else {
                th3 = null;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarD3 = x2.d(aVar4, 1.0f);
                zB = o0VarE.B(strP);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new s70.r0(strP, 19);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s70.r0(strP, 19);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ, rVarD3, false);
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2VarA = c2.q2.a(c2.j.f22696f, bVar3, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                t4.d dVarA = n5.c.a(R.drawable.ic_gcm_add_16, o0VarE, 0);
                bVar.getClass();
                i7.a(dVarA, "", x2.q(aVar4, j92.b.f97901d.f97904c), hb.a.s(o0VarE), o0VarE, 48, 0);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_add);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                bVar.getClass();
                i16 = 14;
                mh.c(strQ, c2.l.C(aVar4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarD4 = x2.d(aVar4, 1.0f);
            zB = o0VarE.B(strP);
            objQ = o0VarE.q();
            if (zB) {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s70.r0(strP, 19);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new s70.r0(strP, 19);
                o0VarE.K(objQ);
            }
            h4.r rVarC5 = p5.v.c((e23.l) objQ, rVarD4, false);
            h4.g.b bVar4 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2VarA = c2.q2.a(c2.j.f22696f, bVar4, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC5, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            t4.d dVarA2 = n5.c.a(R.drawable.ic_gcm_add_16, o0VarE, 0);
            bVar.getClass();
            i7.a(dVarA2, "", x2.q(aVar4, j92.b.f97901d.f97904c), hb.a.s(o0VarE), o0VarE, 48, 0);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_add);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0VarE);
            bVar.getClass();
            i16 = 14;
            mh.c(strQ2, c2.l.C(aVar4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            i16 = 14;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    public static final void b(final h4.r rVar, final String str, final u4.d dVar, final long j8, final i02.m mVar, final i53.c<p5.g> cVar, final e23.a<Unit> aVar, p3.m mVar2, final int i14) {
        int i15;
        p3.o0 o0VarE = mVar2.E(1561569967);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.l(j8) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(mVar) : o0VarE.r(mVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            w4.a aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            boolean z14 = (458752 & i15) == 131072 || ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 && o0VarE.r(cVar));
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new m92.q(cVar, 2);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m92.q(cVar, 2);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarF = x2.f(p5.v.c((e23.l) objQ, rVar, true), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarH = x2.h(c2.l.y(rVarF, eVar.f97920e), 100);
            rVarH.getClass();
            mVar.getClass();
            aVar2.getClass();
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarThen = rVarH.then(b5.s0.b(aVar5, Unit.INSTANCE, new i02.a(mVar, aVar2)));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF2 = x2.f(aVar5, 1.0f);
            h4.g.b bVar3 = h4.d.a.f81534l;
            s2 s2VarA = c2.q2.a(c2.j.f22698h, bVar3, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarF2, o0VarE);
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            j92.c cVar3 = j92.b.f97901d;
            float f14 = cVar3.f97904c;
            float f15 = cVar3.f97904c;
            h4.r rVarQ = x2.q(aVar5, f14);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new t21.f(23);
                o0VarE.K(objQ2);
            }
            e23.a aVar7 = (e23.a) objQ2;
            boolean z15 = (3670016 & i15) == 1048576;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new t21.a(aVar, 27);
                o0VarE.K(objQ3);
            }
            h4.r rVarF3 = u1.w.f(239, aVar7, (e23.a) objQ3, rVarQ, null, false);
            Object objQ4 = o0VarE.q();
            int i16 = 3;
            if (objQ4 == c2565a) {
                objQ4 = new t52.c(i16);
                o0VarE.K(objQ4);
            }
            int i17 = i15;
            u1.y0.a(n5.c.a(R.drawable.ic_remove_red, o0VarE, 0), "", p5.v.c((e23.l) objQ4, rVarF3, false), null, null, 0.0f, null, o0VarE, 48, 120);
            bVar.getClass();
            i7.a(n5.c.a(R.drawable.ic_drag, o0VarE, 0), "", x2.q(aVar5, f15), am.j.d(o0VarE), o0VarE, 48, 0);
            o0VarE.g0(true);
            h4.r rVarD = x2.d(aVar5, 1.0f);
            bVar.getClass();
            s2 s2VarA2 = c2.q2.a(c2.j.i(eVar.f97918c), bVar3, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            bVar.getClass();
            i7.b(dVar, "", x2.q(aVar5, f15 * f75992b), j8, o0VarE, ((i17 >> 6) & 14) | 48 | (i17 & 7168), 0);
            d92.b.f58624b.getClass();
            g02.c.a(str, null, 0L, null, 0, false, 3, d92.c.b(j92.f.f97933j, o0VarE), 0.0d, o0VarE, ((i17 >> 3) & 14) | 1572864, 318);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: t70.r0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    s0.b(rVar, str, dVar, j8, mVar, cVar, aVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0325  */
    /* JADX WARN: Code duplicated, block: B:103:0x0342  */
    /* JADX WARN: Code duplicated, block: B:105:0x036b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:112:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x038a  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:118:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:120:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:123:0x0402  */
    /* JADX WARN: Code duplicated, block: B:127:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x041c  */
    /* JADX WARN: Code duplicated, block: B:130:0x043b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0452  */
    /* JADX WARN: Code duplicated, block: B:135:0x0488  */
    /* JADX WARN: Code duplicated, block: B:136:0x048b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:142:0x0499  */
    /* JADX WARN: Code duplicated, block: B:146:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:150:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:153:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0226  */
    /* JADX WARN: Code duplicated, block: B:86:0x0270  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02de  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(x0 x0Var, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        final x0 x0Var2;
        int i16;
        int i17;
        boolean z14;
        x0 x0Var3;
        p3.p2 p2VarI0;
        ViewModelStoreOwner viewModelStoreOwnerA;
        Context context;
        w4.a aVar2;
        p1 p1VarB;
        p1 p1VarB2;
        Boolean bool;
        p1 p1VarB3;
        p1 p1VarB4;
        p1 p1VarB5;
        p1 p1VarB6;
        p1 p1VarB7;
        Object objQ;
        p3.m.a.C2565a c2565a;
        o53.b0 b0Var;
        mc mcVarF;
        Object objQ2;
        p1 p1Var;
        Object objQ3;
        p1 p1Var2;
        int i18;
        boolean z15;
        boolean zR;
        Object objQ4;
        boolean z16;
        Object objQ5;
        boolean zR2;
        Object objQ6;
        boolean zR3;
        Object objQ7;
        int i19;
        boolean zR4;
        Object objQ8;
        final int i24;
        i02.m mVarV;
        boolean z17;
        boolean zB;
        Object objQ9;
        int i25;
        int i26;
        int i27;
        p3.m.a.C2565a c2565a2;
        p3.m.a.C2565a c2565a3;
        int i28;
        int i29;
        Object objQ10;
        boolean zR5;
        Object objQ11;
        boolean zR6;
        Object objQ12;
        boolean zR7;
        Object objQ13;
        boolean zR8;
        Object objQ14;
        p3.m.a.C2565a c2565a4;
        boolean zR9;
        Object objQ15;
        boolean zR10;
        Object objQ16;
        boolean zR11;
        Object objQ17;
        final int i30;
        int i34;
        p3.o0 o0VarE = mVar.E(366737025);
        if ((i15 & 1) == 0) {
            x0Var2 = x0Var;
            if (o0VarE.r(x0Var2)) {
                i16 = 4;
            }
            i17 = i14 | i16;
            if ((i14 & 48) == 0) {
                if (o0VarE.r(aVar)) {
                    i34 = 32;
                } else {
                    i34 = 16;
                }
                i17 |= i34;
            }
            if ((i17 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) == 0 && !o0VarE.o0()) {
                    o0VarE.e();
                    if ((i15 & 1) != 0) {
                        i17 &= -15;
                    }
                } else if ((i15 & 1) != 0) {
                    o0VarE.L(-1614864554);
                    v9.a.f176280a.getClass();
                    viewModelStoreOwnerA = v9.a.a(o0VarE);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(x0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    x0Var2 = (x0) u1VarResolveViewModel;
                    i17 &= -15;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                aVar2 = (w4.a) o0VarE.A(t1.f91494l);
                p1VarB = s9.c.b(x0Var2.f163050d, p13.j0.f134944a, o0VarE, 48);
                p1VarB2 = s9.c.b(x0Var2.f163052f, null, o0VarE, 48);
                p2 p2Var = x0Var2.f163060n;
                bool = Boolean.FALSE;
                p1VarB3 = s9.c.b(p2Var, bool, o0VarE, 48);
                p1VarB4 = s9.c.b(x0Var2.f163062p, bool, o0VarE, 48);
                p1VarB5 = s9.c.b(x0Var2.f163058l, bool, o0VarE, 48);
                p1VarB6 = s9.c.b(x0Var2.f163064r, bool, o0VarE, 48);
                p1VarB7 = s9.c.b(x0Var2.f163066v, bool, o0VarE, 48);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var = (o53.b0) objQ;
                mcVarF = e9.f(true, null, o0VarE, 6, 2);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(Boolean.TRUE);
                    o0VarE.K(objQ2);
                }
                p1Var = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(bool);
                    o0VarE.K(objQ3);
                }
                p1Var2 = (p1) objQ3;
                boolean zR12 = o0VarE.r(x0Var2);
                i18 = i17 & 112;
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zR = zR12 | z15 | o0VarE.r(context);
                objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new a(x0Var2, aVar, context, null);
                    o0VarE.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, context, o0VarE);
                Boolean bool2 = (Boolean) p1Var2.getF182175a();
                bool2.booleanValue();
                if (i18 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ5 = o0VarE.q();
                if (z16 || objQ5 == c2565a) {
                    objQ5 = new b(aVar, p1Var2, null);
                    o0VarE.K(objQ5);
                }
                p3.l0.e((e23.p) objQ5, bool2, o0VarE);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                zR2 = o0VarE.r(x0Var2);
                objQ6 = o0VarE.q();
                if (zR2 || objQ6 == c2565a) {
                    objQ6 = new sg0.j(x0Var2, 13, p1Var, p1Var2);
                    o0VarE.K(objQ6);
                }
                c.w.a(0, 0, (e23.a) objQ6, o0VarE, zBooleanValue);
                zR3 = o0VarE.r(aVar2) | o0VarE.r(x0Var2);
                objQ7 = o0VarE.q();
                i19 = 8;
                if (zR3 || objQ7 == c2565a) {
                    objQ7 = new t21.l(i19, aVar2, x0Var2);
                    o0VarE.K(objQ7);
                }
                e23.p pVar = (e23.p) objQ7;
                zR4 = o0VarE.r(x0Var2);
                objQ8 = o0VarE.q();
                if (zR4 || objQ8 == c2565a) {
                    objQ8 = new s5.a(x0Var2, 22);
                    o0VarE.K(objQ8);
                }
                i24 = 0;
                mVarV = ge1.b.V(pVar, (e23.p) objQ8, o0VarE, 0);
                f2.b.C1415b c1415b = new f2.b.C1415b(2);
                f2.p0 p0Var = mVarV.f86875r;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                l2 l2VarB = c2.l.b(f14, eVar.f97917b);
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                float f15 = eVar.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f15);
                h4.r.a aVar3 = h4.r.S;
                if (!((Boolean) p1VarB4.getF182175a()).booleanValue() || ((Boolean) p1VarB3.getF182175a()).booleanValue()) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                aVar3.getClass();
                h4.r rVarD = x2.d(b5.s0.b(aVar3, Boolean.valueOf(z17), new i02.l(z17, mVarV)), 1.0f);
                zB = o0VarE.B(p1VarB) | o0VarE.r(x0Var2) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1VarB7) | o0VarE.B(p1VarB2) | o0VarE.r(mVarV) | o0VarE.r(context);
                objQ9 = o0VarE.q();
                if (zB || objQ9 == c2565a) {
                    objQ9 = new a5(p1VarB, x0Var2, b0Var, mcVarF, mVarV, p1VarB7, p1VarB2, context, 10);
                    o0VarE.K(objQ9);
                }
                f2.j.a(c1415b, rVarD, p0Var, l2VarB, null, iVarI, null, false, null, (e23.l) objQ9, o0VarE, 0, 0, 944);
                o0VarE = o0VarE;
                if (((Boolean) p1VarB3.getF182175a()).booleanValue()) {
                    o0VarE.C(-925461358);
                    l72.c1 c1Var = l72.c1.f110940a;
                    String strQ = gl1.y.Q(o0VarE, R.string.title_one_stat_required);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.msg_one_stat_required);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    zR10 = o0VarE.r(x0Var2);
                    objQ16 = o0VarE.q();
                    if (zR10 || objQ16 == c2565a) {
                        objQ16 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ16);
                    }
                    e23.a<Unit> aVar4 = (e23.a) objQ16;
                    zR11 = o0VarE.r(x0Var2);
                    objQ17 = o0VarE.q();
                    if (!zR11 || objQ17 == c2565a) {
                        i30 = 1;
                        objQ17 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i30) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ17);
                    } else {
                        i30 = 1;
                    }
                    i26 = i30;
                    i25 = R.string.lbl_ok;
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, null, (e23.a) objQ17, o0VarE, 6, 0, 728);
                    o0VarE.g0(false);
                } else {
                    i25 = R.string.lbl_ok;
                    i26 = 1;
                    o0VarE.C(-924985663);
                    o0VarE.g0(false);
                }
                if (((Boolean) p1VarB4.getF182175a()).booleanValue()) {
                    o0VarE.C(-924935567);
                    l72.c1 c1Var2 = l72.c1.f110940a;
                    String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_stat_limit_reached);
                    String strP = gl1.y.P(R.string.msg_stats_limit_reached, new Object[]{8}, o0VarE);
                    String strQ5 = gl1.y.Q(o0VarE, i25);
                    zR8 = o0VarE.r(x0Var2);
                    objQ14 = o0VarE.q();
                    if (zR8) {
                        c2565a4 = r1;
                    } else {
                        c2565a4 = c2565a;
                        if (objQ14 == c2565a4) {
                        }
                        e23.a<Unit> aVar5 = (e23.a) objQ14;
                        zR9 = o0VarE.r(x0Var2);
                        objQ15 = o0VarE.q();
                        if (zR9 || objQ15 == c2565a4) {
                            final int i35 = 3;
                            objQ15 = new e23.a() { // from class: t70.q0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i35) {
                                        case 0:
                                            x0Var2.f163059m.k(null, Boolean.FALSE);
                                            break;
                                        case 1:
                                            x0Var2.f163059m.k(null, Boolean.FALSE);
                                            break;
                                        case 2:
                                            x0Var2.f163061o.k(null, Boolean.FALSE);
                                            break;
                                        case 3:
                                            x0Var2.f163061o.k(null, Boolean.FALSE);
                                            break;
                                        case 4:
                                            x0Var2.f163057k.k(null, Boolean.FALSE);
                                            break;
                                        case 5:
                                            x0Var2.f163057k.k(null, Boolean.FALSE);
                                            break;
                                        default:
                                            x0Var2.f163063q.k(null, Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ15);
                        }
                        i27 = R.string.lbl_stat_limit_reached;
                        c2565a2 = c2565a4;
                        c1Var2.a(false, strQ4, strP, null, null, strQ5, false, false, aVar5, null, (e23.a) objQ15, o0VarE, 6, 0, 728);
                        o0VarE.g0(false);
                    }
                    final int i36 = 2;
                    objQ14 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i36) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ14);
                    e23.a<Unit> aVar6 = (e23.a) objQ14;
                    zR9 = o0VarE.r(x0Var2);
                    objQ15 = o0VarE.q();
                    if (zR9) {
                        final int i37 = 3;
                        objQ15 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i37) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ15);
                    } else {
                        final int i38 = 3;
                        objQ15 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i38) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ15);
                    }
                    i27 = R.string.lbl_stat_limit_reached;
                    c2565a2 = c2565a4;
                    c1Var2.a(false, strQ4, strP, null, null, strQ5, false, false, aVar6, null, (e23.a) objQ15, o0VarE, 6, 0, 728);
                    o0VarE.g0(false);
                } else {
                    i27 = R.string.lbl_stat_limit_reached;
                    c2565a2 = r1;
                    o0VarE.C(-924428159);
                    o0VarE.g0(false);
                }
                if (((Boolean) p1VarB5.getF182175a()).booleanValue()) {
                    o0VarE.C(-924381845);
                    l72.c1 c1Var3 = l72.c1.f110940a;
                    String strQ6 = gl1.y.Q(o0VarE, i27);
                    String strP2 = gl1.y.P(R.string.msg_stats_limit_reached_secondary_stats, new Object[]{20}, o0VarE);
                    String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    zR6 = o0VarE.r(x0Var2);
                    objQ12 = o0VarE.q();
                    if (zR6) {
                        c2565a3 = c2565a2;
                    } else {
                        c2565a3 = c2565a2;
                        if (objQ12 == c2565a3) {
                        }
                        e23.a<Unit> aVar7 = (e23.a) objQ12;
                        zR7 = o0VarE.r(x0Var2);
                        objQ13 = o0VarE.q();
                        if (zR7 || objQ13 == c2565a3) {
                            final int i39 = 5;
                            objQ13 = new e23.a() { // from class: t70.q0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i39) {
                                        case 0:
                                            x0Var2.f163059m.k(null, Boolean.FALSE);
                                            break;
                                        case 1:
                                            x0Var2.f163059m.k(null, Boolean.FALSE);
                                            break;
                                        case 2:
                                            x0Var2.f163061o.k(null, Boolean.FALSE);
                                            break;
                                        case 3:
                                            x0Var2.f163061o.k(null, Boolean.FALSE);
                                            break;
                                        case 4:
                                            x0Var2.f163057k.k(null, Boolean.FALSE);
                                            break;
                                        case 5:
                                            x0Var2.f163057k.k(null, Boolean.FALSE);
                                            break;
                                        default:
                                            x0Var2.f163063q.k(null, Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ13);
                        }
                        c1Var3.a(false, strQ6, strP2, null, null, strQ7, false, false, aVar7, null, (e23.a) objQ13, o0VarE, 6, 0, 728);
                        o0VarE.g0(false);
                    }
                    final int i44 = 4;
                    objQ12 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i44) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ12);
                    e23.a<Unit> aVar8 = (e23.a) objQ12;
                    zR7 = o0VarE.r(x0Var2);
                    objQ13 = o0VarE.q();
                    if (zR7) {
                        final int i310 = 5;
                        objQ13 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i310) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ13);
                    } else {
                        final int i311 = 5;
                        objQ13 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i311) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ13);
                    }
                    c1Var3.a(false, strQ6, strP2, null, null, strQ7, false, false, aVar8, null, (e23.a) objQ13, o0VarE, 6, 0, 728);
                    o0VarE.g0(false);
                } else {
                    c2565a3 = c2565a2;
                    o0VarE.C(-923868671);
                    o0VarE.g0(false);
                }
                if (((Boolean) p1VarB6.getF182175a()).booleanValue()) {
                    o0VarE.C(-923791791);
                    l72.c1 c1Var4 = l72.c1.f110940a;
                    String strQ8 = gl1.y.Q(o0VarE, R.string.save_strategy_details_confirmation_title);
                    String strQ9 = gl1.y.Q(o0VarE, R.string.msg_training_exit_plan_info);
                    String strG = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_common_continue));
                    String strG2 = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_close));
                    boolean zR13 = o0VarE.r(x0Var2);
                    if (i18 == 32) {
                        i28 = i26;
                    } else {
                        i28 = 0;
                    }
                    i29 = (zR13 ? 1 : 0) | i28;
                    objQ10 = o0VarE.q();
                    if (i29 == 0 || objQ10 == c2565a3) {
                        objQ10 = new j1(25, x0Var2, aVar);
                        o0VarE.K(objQ10);
                    }
                    e23.a<Unit> aVar9 = (e23.a) objQ10;
                    zR5 = o0VarE.r(x0Var2);
                    objQ11 = o0VarE.q();
                    if (zR5 || objQ11 == c2565a3) {
                        final int i45 = 6;
                        objQ11 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i45) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ11);
                    }
                    c1Var4.a(false, strQ8, strQ9, null, null, strG, false, false, aVar9, strG2, (e23.a) objQ11, o0VarE, 6, 0, 216);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-923124671);
                    o0VarE.g0(false);
                }
            } else {
                o0VarE.e();
            }
            x0Var3 = x0Var2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ba2.f(x0Var3, aVar, i14, i15, 17);
            }
        }
        x0Var2 = x0Var;
        i16 = 2;
        i17 = i14 | i16;
        if ((i14 & 48) == 0) {
            if (o0VarE.r(aVar)) {
                i34 = 32;
            } else {
                i34 = 16;
            }
            i17 |= i34;
        }
        if ((i17 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) == 0) {
                if ((i15 & 1) != 0) {
                    o0VarE.L(-1614864554);
                    v9.a.f176280a.getClass();
                    viewModelStoreOwnerA = v9.a.a(o0VarE);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(x0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    x0Var2 = (x0) u1VarResolveViewModel2;
                    i17 &= -15;
                }
            } else if ((i15 & 1) != 0) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(x0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                x0Var2 = (x0) u1VarResolveViewModel3;
                i17 &= -15;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            p1VarB = s9.c.b(x0Var2.f163050d, p13.j0.f134944a, o0VarE, 48);
            p1VarB2 = s9.c.b(x0Var2.f163052f, null, o0VarE, 48);
            p2 p2Var2 = x0Var2.f163060n;
            bool = Boolean.FALSE;
            p1VarB3 = s9.c.b(p2Var2, bool, o0VarE, 48);
            p1VarB4 = s9.c.b(x0Var2.f163062p, bool, o0VarE, 48);
            p1VarB5 = s9.c.b(x0Var2.f163058l, bool, o0VarE, 48);
            p1VarB6 = s9.c.b(x0Var2.f163064r, bool, o0VarE, 48);
            p1VarB7 = s9.c.b(x0Var2.f163066v, bool, o0VarE, 48);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var = (o53.b0) objQ;
            mcVarF = e9.f(true, null, o0VarE, 6, 2);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1Var = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(bool);
                o0VarE.K(objQ3);
            }
            p1Var2 = (p1) objQ3;
            boolean zR14 = o0VarE.r(x0Var2);
            i18 = i17 & 112;
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zR = zR14 | z15 | o0VarE.r(context);
            objQ4 = o0VarE.q();
            if (zR) {
                objQ4 = new a(x0Var2, aVar, context, null);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new a(x0Var2, aVar, context, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, context, o0VarE);
            Boolean bool3 = (Boolean) p1Var2.getF182175a();
            bool3.booleanValue();
            if (i18 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ5 = o0VarE.q();
            if (z16) {
                objQ5 = new b(aVar, p1Var2, null);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new b(aVar, p1Var2, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, bool3, o0VarE);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            zR2 = o0VarE.r(x0Var2);
            objQ6 = o0VarE.q();
            if (zR2) {
                objQ6 = new sg0.j(x0Var2, 13, p1Var, p1Var2);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new sg0.j(x0Var2, 13, p1Var, p1Var2);
                o0VarE.K(objQ6);
            }
            c.w.a(0, 0, (e23.a) objQ6, o0VarE, zBooleanValue2);
            zR3 = o0VarE.r(aVar2) | o0VarE.r(x0Var2);
            objQ7 = o0VarE.q();
            i19 = 8;
            if (zR3) {
                objQ7 = new t21.l(i19, aVar2, x0Var2);
                o0VarE.K(objQ7);
            } else {
                objQ7 = new t21.l(i19, aVar2, x0Var2);
                o0VarE.K(objQ7);
            }
            e23.p pVar2 = (e23.p) objQ7;
            zR4 = o0VarE.r(x0Var2);
            objQ8 = o0VarE.q();
            if (zR4) {
                objQ8 = new s5.a(x0Var2, 22);
                o0VarE.K(objQ8);
            } else {
                objQ8 = new s5.a(x0Var2, 22);
                o0VarE.K(objQ8);
            }
            i24 = 0;
            mVarV = ge1.b.V(pVar2, (e23.p) objQ8, o0VarE, 0);
            f2.b.C1415b c1415b2 = new f2.b.C1415b(2);
            f2.p0 p0Var2 = mVarV.f86875r;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f16 = eVar2.f97920e;
            bVar2.getClass();
            l2 l2VarB2 = c2.l.b(f16, eVar2.f97917b);
            c2.j jVar2 = c2.j.f22691a;
            bVar2.getClass();
            float f17 = eVar2.f97918c;
            jVar2.getClass();
            c2.j.i iVarI2 = c2.j.i(f17);
            h4.r.a aVar10 = h4.r.S;
            if (((Boolean) p1VarB4.getF182175a()).booleanValue()) {
                z17 = true;
            } else {
                z17 = true;
            }
            aVar10.getClass();
            h4.r rVarD2 = x2.d(b5.s0.b(aVar10, Boolean.valueOf(z17), new i02.l(z17, mVarV)), 1.0f);
            zB = o0VarE.B(p1VarB) | o0VarE.r(x0Var2) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1VarB7) | o0VarE.B(p1VarB2) | o0VarE.r(mVarV) | o0VarE.r(context);
            objQ9 = o0VarE.q();
            if (zB) {
                objQ9 = new a5(p1VarB, x0Var2, b0Var, mcVarF, mVarV, p1VarB7, p1VarB2, context, 10);
                o0VarE.K(objQ9);
            } else {
                objQ9 = new a5(p1VarB, x0Var2, b0Var, mcVarF, mVarV, p1VarB7, p1VarB2, context, 10);
                o0VarE.K(objQ9);
            }
            f2.j.a(c1415b2, rVarD2, p0Var2, l2VarB2, null, iVarI2, null, false, null, (e23.l) objQ9, o0VarE, 0, 0, 944);
            o0VarE = o0VarE;
            if (((Boolean) p1VarB3.getF182175a()).booleanValue()) {
                o0VarE.C(-925461358);
                l72.c1 c1Var5 = l72.c1.f110940a;
                String strQ10 = gl1.y.Q(o0VarE, R.string.title_one_stat_required);
                String strQ11 = gl1.y.Q(o0VarE, R.string.msg_one_stat_required);
                String strQ12 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                zR10 = o0VarE.r(x0Var2);
                objQ16 = o0VarE.q();
                if (zR10) {
                    objQ16 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ16);
                } else {
                    objQ16 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ16);
                }
                e23.a<Unit> aVar11 = (e23.a) objQ16;
                zR11 = o0VarE.r(x0Var2);
                objQ17 = o0VarE.q();
                if (zR11) {
                    i30 = 1;
                    objQ17 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i30) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ17);
                } else {
                    i30 = 1;
                    objQ17 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i30) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ17);
                }
                i26 = i30;
                i25 = R.string.lbl_ok;
                c1Var5.a(false, strQ10, strQ11, null, null, strQ12, false, false, aVar11, null, (e23.a) objQ17, o0VarE, 6, 0, 728);
                o0VarE.g0(false);
            } else {
                i25 = R.string.lbl_ok;
                i26 = 1;
                o0VarE.C(-924985663);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB4.getF182175a()).booleanValue()) {
                o0VarE.C(-924935567);
                l72.c1 c1Var6 = l72.c1.f110940a;
                String strQ13 = gl1.y.Q(o0VarE, R.string.lbl_stat_limit_reached);
                String strP3 = gl1.y.P(R.string.msg_stats_limit_reached, new Object[]{8}, o0VarE);
                String strQ14 = gl1.y.Q(o0VarE, i25);
                zR8 = o0VarE.r(x0Var2);
                objQ14 = o0VarE.q();
                if (zR8) {
                    c2565a4 = c2565a;
                    if (objQ14 == c2565a4) {
                    }
                    e23.a<Unit> aVar12 = (e23.a) objQ14;
                    zR9 = o0VarE.r(x0Var2);
                    objQ15 = o0VarE.q();
                    if (zR9) {
                        final int i312 = 3;
                        objQ15 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i312) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ15);
                    } else {
                        final int i313 = 3;
                        objQ15 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i313) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ15);
                    }
                    i27 = R.string.lbl_stat_limit_reached;
                    c2565a2 = c2565a4;
                    c1Var6.a(false, strQ13, strP3, null, null, strQ14, false, false, aVar12, null, (e23.a) objQ15, o0VarE, 6, 0, 728);
                    o0VarE.g0(false);
                } else {
                    c2565a4 = r1;
                }
                final int i314 = 2;
                objQ14 = new e23.a() { // from class: t70.q0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i314) {
                            case 0:
                                x0Var2.f163059m.k(null, Boolean.FALSE);
                                break;
                            case 1:
                                x0Var2.f163059m.k(null, Boolean.FALSE);
                                break;
                            case 2:
                                x0Var2.f163061o.k(null, Boolean.FALSE);
                                break;
                            case 3:
                                x0Var2.f163061o.k(null, Boolean.FALSE);
                                break;
                            case 4:
                                x0Var2.f163057k.k(null, Boolean.FALSE);
                                break;
                            case 5:
                                x0Var2.f163057k.k(null, Boolean.FALSE);
                                break;
                            default:
                                x0Var2.f163063q.k(null, Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ14);
                e23.a<Unit> aVar13 = (e23.a) objQ14;
                zR9 = o0VarE.r(x0Var2);
                objQ15 = o0VarE.q();
                if (zR9) {
                    final int i315 = 3;
                    objQ15 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i315) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ15);
                } else {
                    final int i316 = 3;
                    objQ15 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i316) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ15);
                }
                i27 = R.string.lbl_stat_limit_reached;
                c2565a2 = c2565a4;
                c1Var6.a(false, strQ13, strP3, null, null, strQ14, false, false, aVar13, null, (e23.a) objQ15, o0VarE, 6, 0, 728);
                o0VarE.g0(false);
            } else {
                i27 = R.string.lbl_stat_limit_reached;
                c2565a2 = r1;
                o0VarE.C(-924428159);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB5.getF182175a()).booleanValue()) {
                o0VarE.C(-924381845);
                l72.c1 c1Var7 = l72.c1.f110940a;
                String strQ15 = gl1.y.Q(o0VarE, i27);
                String strP4 = gl1.y.P(R.string.msg_stats_limit_reached_secondary_stats, new Object[]{20}, o0VarE);
                String strQ16 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                zR6 = o0VarE.r(x0Var2);
                objQ12 = o0VarE.q();
                if (zR6) {
                    c2565a3 = c2565a2;
                    if (objQ12 == c2565a3) {
                    }
                    e23.a<Unit> aVar14 = (e23.a) objQ12;
                    zR7 = o0VarE.r(x0Var2);
                    objQ13 = o0VarE.q();
                    if (zR7) {
                        final int i317 = 5;
                        objQ13 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i317) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ13);
                    } else {
                        final int i318 = 5;
                        objQ13 = new e23.a() { // from class: t70.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i318) {
                                    case 0:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 1:
                                        x0Var2.f163059m.k(null, Boolean.FALSE);
                                        break;
                                    case 2:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 3:
                                        x0Var2.f163061o.k(null, Boolean.FALSE);
                                        break;
                                    case 4:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    case 5:
                                        x0Var2.f163057k.k(null, Boolean.FALSE);
                                        break;
                                    default:
                                        x0Var2.f163063q.k(null, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ13);
                    }
                    c1Var7.a(false, strQ15, strP4, null, null, strQ16, false, false, aVar14, null, (e23.a) objQ13, o0VarE, 6, 0, 728);
                    o0VarE.g0(false);
                } else {
                    c2565a3 = c2565a2;
                }
                final int i46 = 4;
                objQ12 = new e23.a() { // from class: t70.q0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i46) {
                            case 0:
                                x0Var2.f163059m.k(null, Boolean.FALSE);
                                break;
                            case 1:
                                x0Var2.f163059m.k(null, Boolean.FALSE);
                                break;
                            case 2:
                                x0Var2.f163061o.k(null, Boolean.FALSE);
                                break;
                            case 3:
                                x0Var2.f163061o.k(null, Boolean.FALSE);
                                break;
                            case 4:
                                x0Var2.f163057k.k(null, Boolean.FALSE);
                                break;
                            case 5:
                                x0Var2.f163057k.k(null, Boolean.FALSE);
                                break;
                            default:
                                x0Var2.f163063q.k(null, Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ12);
                e23.a<Unit> aVar15 = (e23.a) objQ12;
                zR7 = o0VarE.r(x0Var2);
                objQ13 = o0VarE.q();
                if (zR7) {
                    final int i319 = 5;
                    objQ13 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i319) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ13);
                } else {
                    final int i3110 = 5;
                    objQ13 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i3110) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ13);
                }
                c1Var7.a(false, strQ15, strP4, null, null, strQ16, false, false, aVar15, null, (e23.a) objQ13, o0VarE, 6, 0, 728);
                o0VarE.g0(false);
            } else {
                c2565a3 = c2565a2;
                o0VarE.C(-923868671);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB6.getF182175a()).booleanValue()) {
                o0VarE.C(-923791791);
                l72.c1 c1Var8 = l72.c1.f110940a;
                String strQ17 = gl1.y.Q(o0VarE, R.string.save_strategy_details_confirmation_title);
                String strQ18 = gl1.y.Q(o0VarE, R.string.msg_training_exit_plan_info);
                String strG3 = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_common_continue));
                String strG4 = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_close));
                boolean zR15 = o0VarE.r(x0Var2);
                if (i18 == 32) {
                    i28 = i26;
                } else {
                    i28 = 0;
                }
                i29 = (zR15 ? 1 : 0) | i28;
                objQ10 = o0VarE.q();
                if (i29 == 0) {
                    objQ10 = new j1(25, x0Var2, aVar);
                    o0VarE.K(objQ10);
                } else {
                    objQ10 = new j1(25, x0Var2, aVar);
                    o0VarE.K(objQ10);
                }
                e23.a<Unit> aVar16 = (e23.a) objQ10;
                zR5 = o0VarE.r(x0Var2);
                objQ11 = o0VarE.q();
                if (zR5) {
                    final int i47 = 6;
                    objQ11 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i47) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ11);
                } else {
                    final int i48 = 6;
                    objQ11 = new e23.a() { // from class: t70.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i48) {
                                case 0:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 1:
                                    x0Var2.f163059m.k(null, Boolean.FALSE);
                                    break;
                                case 2:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 3:
                                    x0Var2.f163061o.k(null, Boolean.FALSE);
                                    break;
                                case 4:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                case 5:
                                    x0Var2.f163057k.k(null, Boolean.FALSE);
                                    break;
                                default:
                                    x0Var2.f163063q.k(null, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ11);
                }
                c1Var8.a(false, strQ17, strQ18, null, null, strG3, false, false, aVar16, strG4, (e23.a) objQ11, o0VarE, 6, 0, 216);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-923124671);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        x0Var3 = x0Var2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(x0Var3, aVar, i14, i15, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(x0 x0Var, e23.a aVar, p3.m mVar, int i14) {
        x0 x0Var2;
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(810815949);
        int i16 = (i14 & 6) == 0 ? i14 | 2 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(x0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                i15 = i16 & (-15);
                x0Var2 = (x0) u1VarResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i16 & (-15);
                x0Var2 = x0Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p1 p1VarB = s9.c.b(x0Var2.f163054h, Boolean.FALSE, o0VarE, 48);
            String strQ = gl1.y.Q(o0VarE, R.string.title_edit_at_a_glance);
            b3.b.f15502a.getClass();
            u4.d dVarA = d3.h.a();
            i3 i3Var = new i3("MenuSave", gl1.y.Q(o0VarE, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
            boolean zBooleanValue = ((Boolean) p1VarB.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(x0Var2);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.b0(x0Var2, 21);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s70.b0(x0Var2, 21);
                    o0VarE.K(objQ);
                }
            }
            og.a.k(strQ, i3Var, zBooleanValue, dVarA, aVar, (e23.l) objQ, z3.f.c(628133202, new ry0.g(17, x0Var2, aVar), o0VarE), o0VarE, 1572928 | ((i15 << 9) & 57344), 0);
        } else {
            o0VarE.e();
            x0Var2 = x0Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(x0Var2, aVar, i14, 12);
        }
    }
}
