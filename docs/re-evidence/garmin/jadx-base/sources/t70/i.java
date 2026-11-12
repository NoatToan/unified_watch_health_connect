package t70;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.t1;
import l72.i3;
import l72.p2;
import l72.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import p3.x3;
import s70.j1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsStatsScreenKt$EditEssentialsSelection$1$1", f = "EditEssentialsStatsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f162858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f162858a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f162858a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f162858a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsStatsScreenKt$EditEssentialsSelection$2$1", f = "EditEssentialsStatsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f162859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f162860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f162861c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, q qVar, e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f162859a = context;
            this.f162860b = qVar;
            this.f162861c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f162859a, this.f162860b, this.f162861c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Toast.makeText(this.f162859a, R.string.txt_error_occurred, 0).show();
            q qVar = this.f162860b;
            q.z4(qVar, (List) qVar.f162966n.getValue());
            this.f162861c.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.r<j02.j, Boolean, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f162862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f162863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<List<b1>> f162864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f162865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f162866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f162867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b92.a.C0235a f162868g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f162869h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f162870i;

        /* JADX WARN: Multi-variable type inference failed */
        public c(b1 b1Var, q qVar, x3<? extends List<? extends b1>> x3Var, String str, String str2, String str3, b92.a.C0235a c0235a, float f14, int i14) {
            this.f162862a = b1Var;
            this.f162863b = qVar;
            this.f162864c = x3Var;
            this.f162865d = str;
            this.f162866e = str2;
            this.f162867f = str3;
            this.f162868g = c0235a;
            this.f162869h = f14;
            this.f162870i = i14;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x007e  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:46:0x0114  */
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
        public final Unit invoke(j02.j jVar, Boolean bool, p3.m mVar, Integer num) {
            int i14;
            h4.r rVarO;
            j02.j jVar2 = jVar;
            boolean zBooleanValue = bool.booleanValue();
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            jVar2.getClass();
            if ((iIntValue & 6) == 0) {
                i14 = (mVar2.B(jVar2) ? 4 : 2) | iIntValue;
            } else {
                i14 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i14 |= mVar2.h(zBooleanValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                p2 p2Var = p2.f111205a;
                b1 b1Var = this.f162862a;
                boolean z14 = ((b1.a) b1Var).f162812c;
                p3.m.a aVar = p3.m.f135153a;
                q qVar = this.f162863b;
                if (z14) {
                    mVar2.C(185641158);
                    int i15 = i14;
                    h4.r.a aVar2 = h4.r.S;
                    boolean zR = mVar2.r(qVar) | mVar2.B(b1Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new t70.j(qVar, b1Var);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t70.j(qVar, b1Var);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    x3<List<b1>> x3Var = this.f162864c;
                    boolean zB = mVar2.B(x3Var) | mVar2.B(b1Var) | mVar2.r(qVar);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new k(b1Var, qVar, x3Var);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k(b1Var, qVar, x3Var);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ2;
                    boolean zB2 = mVar2.B(x3Var) | mVar2.B(b1Var) | mVar2.r(qVar);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new l(b1Var, qVar, x3Var);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l(b1Var, qVar, x3Var);
                            mVar2.K(objQ3);
                        }
                    }
                    rVarO = jVar2.a(og.a.a0(aVar2, zBooleanValue, aVar3, aVar4, (e23.a) objQ3, this.f162865d, this.f162866e, this.f162867f, mVar2, (i15 & 112) | 6), (View) mVar2.A(AndroidCompositionLocals_androidKt.f6046f), new ig2.d(29), new ik2.b(23));
                    mVar2.f();
                } else {
                    mVar2.C(186823157);
                    h4.r.a aVar5 = h4.r.S;
                    boolean zR2 = mVar2.r(qVar) | mVar2.B(b1Var);
                    Object objQ4 = mVar2.q();
                    if (zR2) {
                        objQ4 = new m(qVar, b1Var);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new m(qVar, b1Var);
                            mVar2.K(objQ4);
                        }
                    }
                    rVarO = og.a.O(aVar5, (e23.a) objQ4, this.f162865d, mVar2);
                    mVar2.f();
                }
                h4.r rVar = rVarO;
                b92.a aVarB = this.f162868g.b();
                z3.e eVarC = z3.f.c(87807717, new p(this.f162869h, b1Var, qVar, this.f162870i), mVar2);
                int i16 = b92.a.f16960b;
                p2Var.f(rVar, eVarC, aVarB, false, false, null, null, mVar2, 48, 120);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f162871a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f162872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f162873b;

        public e(e23.l lVar, List list) {
            this.f162872a = lVar;
            this.f162873b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f162872a.invoke(this.f162873b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f162874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f162875b;

        public f(e23.l lVar, List list) {
            this.f162874a = lVar;
            this.f162875b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f162874a.invoke(this.f162875b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f162876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j02.h0 f162877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f162878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3 f162879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f162880e;

        public g(List list, j02.h0 h0Var, q qVar, x3 x3Var, float f14) {
            this.f162876a = list;
            this.f162877b = h0Var;
            this.f162878c = qVar;
            this.f162879d = x3Var;
            this.f162880e = f14;
        }

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
                b1 b1Var = (b1) this.f162876a.get(iIntValue);
                mVar2.C(731171189);
                if (b1Var instanceof b1.b) {
                    mVar2.C(731072453);
                    r1.b(gl1.y.Q(mVar2, ((b1.b) b1Var).f162813b), null, mVar2, 0, 2);
                    mVar2.f();
                } else {
                    if (!(b1Var instanceof b1.a)) {
                        throw n23.j.m(mVar2, -1361887154);
                    }
                    mVar2.C(731375447);
                    b1.a aVar = (b1.a) b1Var;
                    boolean z14 = aVar.f162812c;
                    int i15 = z14 ? R.drawable.ic_remove_red : R.drawable.ic_add_round;
                    mVar2.C(-1361880080);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    int i16 = R.string.lbl_add;
                    c0235a.f16962a.put("onClickLabel", gl1.y.Q(mVar2, z14 ? R.string.lbl_remove : R.string.lbl_add));
                    mVar2.f();
                    String strQ = gl1.y.Q(mVar2, R.string.move_up);
                    String strQ2 = gl1.y.Q(mVar2, R.string.move_down);
                    if (z14) {
                        i16 = R.string.lbl_remove;
                    }
                    j02.d0.a(dVar2, this.f162877b, b1Var.f162810a, null, aVar.f162812c, null, z3.f.c(1563817789, new c(b1Var, this.f162878c, this.f162879d, gl1.y.Q(mVar2, i16), strQ, strQ2, c0235a, this.f162880e, i15), mVar2), mVar2, (i14 & 14) | 1572864, 20);
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsStatsScreenKt$EditEssentialsSelection$reorderableLazyListState$1$1", f = "EditEssentialsStatsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.r<o53.b0, e2.n, e2.n, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ e2.n f162881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ e2.n f162882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f162883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q qVar, t13.d<? super h> dVar) {
            super(4, dVar);
            this.f162883c = qVar;
        }

        @Override // e23.r
        public final Object invoke(o53.b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Unit> dVar) {
            h hVar = new h(this.f162883c, dVar);
            hVar.f162881a = nVar;
            hVar.f162882b = nVar2;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e2.n nVar = this.f162881a;
            e2.n nVar2 = this.f162882b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f162883c.B4(nVar.getF62559a() - 1, nVar2.getF62559a() - 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: t70.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsStatsScreenKt$EditEssentialsStatsScreen$1$1", f = "EditEssentialsStatsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3064i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f162884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f162885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3064i(e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super C3064i> dVar) {
            super(2, dVar);
            this.f162884a = aVar;
            this.f162885b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3064i(this.f162884a, this.f162885b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3064i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f162885b.getF182175a().booleanValue()) {
                this.f162884a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162886a;

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
            f162886a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0217  */
    /* JADX WARN: Code duplicated, block: B:68:0x0234  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q qVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-2099413890);
        int i16 = (o0VarE.r(qVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            p1 p1VarB = s9.c.b(qVar.f162955c, p13.j0.f134944a, o0VarE, 48);
            p1 p1VarB2 = s9.c.b(qVar.f162957e, null, o0VarE, 48);
            r53.p2 p2Var = qVar.f162961i;
            Boolean bool = Boolean.FALSE;
            p1 p1VarB3 = s9.c.b(p2Var, bool, o0VarE, 48);
            p1 p1VarB4 = s9.c.b(qVar.f162963k, bool, o0VarE, 48);
            p1 p1VarB5 = s9.c.b(qVar.f162965m, bool, o0VarE, 48);
            g3 g3Var = (g3) p1VarB2.getF182175a();
            fw.p pVar = g3Var != null ? g3Var.f35300a : null;
            int i17 = pVar == null ? -1 : j.f162886a[pVar.ordinal()];
            p3.m.a aVar2 = p3.m.f135153a;
            if (i17 == 1) {
                o0VarE.C(1097906245);
                Unit unit = Unit.INSTANCE;
                Object objQ = o0VarE.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar, null);
                    o0VarE.K(objQ);
                }
                p3.l0.e((e23.p) objQ, unit, o0VarE);
                o0VarE.g0(false);
            } else if (i17 != 2) {
                o0VarE.C(-324321534);
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
            } else {
                o0VarE.C(1097909863);
                Unit unit3 = Unit.INSTANCE;
                boolean zR = o0VarE.r(context) | o0VarE.r(qVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new b(context, qVar, aVar, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(context, qVar, aVar, null);
                        o0VarE.K(objQ2);
                    }
                }
                p3.l0.e((e23.p) objQ2, unit3, o0VarE);
                o0VarE.g0(false);
            }
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            boolean zR2 = o0VarE.r(qVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new h(qVar, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new h(qVar, null);
                    o0VarE.K(objQ3);
                }
            }
            j02.h0 h0VarB = j02.d0.b(i0VarA, (e23.r) objQ3, o0VarE);
            boolean zB = o0VarE.B(p1VarB) | o0VarE.B(h0VarB) | o0VarE.r(qVar) | o0VarE.i(f75992b);
            Object objQ4 = o0VarE.q();
            if (zB) {
                io0.a aVar3 = new io0.a(f75992b, 1, p1VarB, h0VarB, qVar);
                o0VarE.K(aVar3);
                objQ4 = aVar3;
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    io0.a aVar4 = new io0.a(f75992b, 1, p1VarB, h0VarB, qVar);
                    o0VarE.K(aVar4);
                    objQ4 = aVar4;
                }
            }
            e23.l lVar = (e23.l) objQ4;
            i15 = 0;
            e2.c.b(null, i0VarA, null, null, null, null, false, null, lVar, o0VarE, 0, 509);
            o0VarE = o0VarE;
            if (((Boolean) p1VarB3.getF182175a()).booleanValue()) {
                o0VarE.C(-318317888);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.title_two_stats_required);
                String strQ2 = gl1.y.Q(o0VarE, R.string.msg_two_stats_required);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean zR3 = o0VarE.r(qVar);
                Object objQ5 = o0VarE.q();
                if (zR3) {
                    objQ5 = new t70.g(qVar, 3);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new t70.g(qVar, 3);
                        o0VarE.K(objQ5);
                    }
                }
                e23.a<Unit> aVar5 = (e23.a) objQ5;
                boolean zR4 = o0VarE.r(qVar);
                Object objQ6 = o0VarE.q();
                if (zR4) {
                    objQ6 = new t70.g(qVar, 4);
                    o0VarE.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new t70.g(qVar, 4);
                        o0VarE.K(objQ6);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, null, (e23.a) objQ6, o0VarE, 6, 0, 728);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-317852764);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB4.getF182175a()).booleanValue()) {
                o0VarE.C(-317806884);
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_stat_limit_reached);
                String strP = gl1.y.P(R.string.msg_stats_limit_reached, new Object[]{4}, o0VarE);
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean zR5 = o0VarE.r(qVar);
                Object objQ7 = o0VarE.q();
                if (zR5) {
                    objQ7 = new t70.g(qVar, 0);
                    o0VarE.K(objQ7);
                } else {
                    aVar2.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new t70.g(qVar, 0);
                        o0VarE.K(objQ7);
                    }
                }
                e23.a<Unit> aVar6 = (e23.a) objQ7;
                boolean zR6 = o0VarE.r(qVar);
                Object objQ8 = o0VarE.q();
                if (zR6) {
                    objQ8 = new t70.g(qVar, 1);
                    o0VarE.K(objQ8);
                } else {
                    aVar2.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new t70.g(qVar, 1);
                        o0VarE.K(objQ8);
                    }
                }
                p3.o0 o0Var = o0VarE;
                c1Var2.a(false, strQ4, strP, null, null, strQ5, false, false, aVar6, null, (e23.a) objQ8, o0Var, 6, 0, 728);
                o0VarE = o0Var;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-317307164);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB5.getF182175a()).booleanValue()) {
                o0VarE.C(-317230098);
                l72.c1 c1Var3 = l72.c1.f110940a;
                String strQ6 = gl1.y.Q(o0VarE, R.string.save_strategy_details_confirmation_title);
                String strQ7 = gl1.y.Q(o0VarE, R.string.msg_training_exit_plan_info);
                String strG = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_common_continue));
                String strG2 = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_close));
                boolean zR7 = o0VarE.r(qVar);
                Object objQ9 = o0VarE.q();
                if (zR7) {
                    objQ9 = new j1(23, qVar, aVar);
                    o0VarE.K(objQ9);
                } else {
                    aVar2.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new j1(23, qVar, aVar);
                        o0VarE.K(objQ9);
                    }
                }
                e23.a<Unit> aVar7 = (e23.a) objQ9;
                boolean zR8 = o0VarE.r(qVar);
                Object objQ10 = o0VarE.q();
                if (zR8) {
                    objQ10 = new t70.g(qVar, 2);
                    o0VarE.K(objQ10);
                } else {
                    aVar2.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new t70.g(qVar, 2);
                        o0VarE.K(objQ10);
                    }
                }
                p3.o0 o0Var2 = o0VarE;
                c1Var3.a(false, strQ6, strQ7, null, null, strG, false, false, aVar7, strG2, (e23.a) objQ10, o0Var2, 6, 0, 216);
                o0VarE = o0Var2;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-316557212);
                o0VarE.g0(false);
            }
        } else {
            i15 = 0;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t70.h(qVar, aVar, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(q qVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        qVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1698368769);
        int i15 = (o0VarE.r(qVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.booleanValue();
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new C3064i(aVar, p1Var2, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, bool, o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(qVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new sg0.j(qVar, 11, p1Var, p1Var2);
                o0VarE.K(objQ4);
            }
            c.w.a(0, 0, (e23.a) objQ4, o0VarE, zBooleanValue);
            p1 p1VarB = s9.c.b(qVar.f162959g, Boolean.FALSE, o0VarE, 48);
            p1 p1VarC = s9.c.c(qVar.f162968p, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_edit_essentials);
            b3.b.f15502a.getClass();
            u4.d dVarA = d3.h.a();
            i3 i3Var = new i3("MenuSave", gl1.y.Q(o0VarE, R.string.lbl_save), ((Boolean) p1VarC.getF182175a()).booleanValue(), (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null);
            boolean zBooleanValue2 = ((Boolean) p1VarB.getF182175a()).booleanValue();
            boolean zR2 = o0VarE.r(qVar);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new s70.b0(qVar, 19);
                o0VarE.K(objQ5);
            }
            og.a.k(strQ, i3Var, zBooleanValue2, dVarA, aVar, (e23.l) objQ5, z3.f.c(-1184592956, new ng2.i(qVar, 24, p1Var, p1Var2), o0VarE), o0VarE, ((i15 << 9) & 57344) | 1572928, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t70.h(qVar, aVar, i14, 1);
        }
    }
}
