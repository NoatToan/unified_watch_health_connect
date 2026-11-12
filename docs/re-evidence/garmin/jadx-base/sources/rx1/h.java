package rx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.messaging.Constants;
import i3.e9;
import i3.mc;
import j02.d0;
import j02.h0;
import java.util.List;
import mt0.e0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<j02.j, Boolean, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dy1.v f154969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f154970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f154971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dy1.u f154972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<dy1.u, Unit> f154973e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dy1.v vVar, Context context, int i14, dy1.u uVar, e23.l<? super dy1.u, Unit> lVar) {
            this.f154969a = vVar;
            this.f154970b = context;
            this.f154971c = i14;
            this.f154972d = uVar;
            this.f154973e = lVar;
        }

        @Override // e23.r
        public final Unit invoke(j02.j jVar, Boolean bool, p3.m mVar, Integer num) {
            j02.j jVar2 = jVar;
            bool.getClass();
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            jVar2.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= mVar2.B(jVar2) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 131) != 130)) {
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                Context context = this.f154970b;
                int i14 = this.f154971c;
                dy1.v vVar = this.f154969a;
                qx1.e.a(jVar2, vVar.c(i14, context), this.f154972d, rVarC, vVar.f61642c.size() > 1, this.f154973e, mVar2, iIntValue & 14);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.CustomWorkoutStepsBottomSheetKt$CustomWorkoutStepsBottomSheet$2$reorderableLazyColumnState$1$1", f = "CustomWorkoutStepsBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.r<b0, e2.n, e2.n, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ e2.n f154974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ e2.n f154975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<Integer, Integer, Unit> f154976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f154977d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super Integer, ? super Integer, Unit> pVar, int i14, t13.d<? super b> dVar) {
            super(4, dVar);
            this.f154976c = pVar;
            this.f154977d = i14;
        }

        @Override // e23.r
        public final Object invoke(b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f154976c, this.f154977d, dVar);
            bVar.f154974a = nVar;
            bVar.f154975b = nVar2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e2.n nVar = this.f154974a;
            e2.n nVar2 = this.f154975b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int f62559a = nVar.getF62559a();
            int i14 = this.f154977d;
            this.f154976c.invoke(new Integer(f62559a - i14), new Integer(nVar2.getF62559a() - i14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p f154978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f154979b;

        public c(e23.p pVar, List list) {
            this.f154978a = pVar;
            this.f154979b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f154978a.invoke(Integer.valueOf(iIntValue), this.f154979b.get(iIntValue));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f154980a;

        public d(List list) {
            this.f154980a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f154980a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f154981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f154982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dy1.v f154983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f154984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l f154985e;

        public e(List list, h0 h0Var, dy1.v vVar, Context context, e23.l lVar) {
            this.f154981a = list;
            this.f154982b = h0Var;
            this.f154983c = vVar;
            this.f154984d = context;
            this.f154985e = lVar;
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
            int i15 = i14;
            if (mVar2.n(i15 & 1, (i15 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                dy1.u uVar = (dy1.u) this.f154981a.get(iIntValue);
                mVar2.C(1880708188);
                d0.a(dVar2, this.f154982b, p13.h0.k0(x.k(uVar.a(), Integer.valueOf(iIntValue)), null, null, null, null, 63), null, false, null, z3.f.c(911670116, new a(this.f154983c, this.f154984d, iIntValue, uVar, this.f154985e), mVar2), mVar2, (i15 & 14) | 1572864, 28);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.CustomWorkoutStepsBottomSheetKt$CustomWorkoutStepsBottomSheet$onDismissRequest$1$1$1", f = "CustomWorkoutStepsBottomSheet.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f154987b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mc mcVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f154987b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f154987b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154986a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f154986a = 1;
                if (this.f154987b.d(this) == aVar) {
                    return aVar;
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

    public static final void a(int i14, dy1.v vVar, e23.a aVar, e23.a aVar2, e23.l lVar, e23.p pVar, e23.p pVar2, p3.m mVar) {
        e23.p pVar3;
        mc mcVar;
        aVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-278709590);
        int i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            pVar3 = pVar;
            i15 |= o0VarE.r(pVar3) ? 256 : 128;
        } else {
            pVar3 = pVar;
        }
        int i16 = i15 | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i16 & 458752) == 131072) | ((i16 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                mcVar = mcVarF;
                e0 e0Var = new e0(b0Var, aVar, mcVar, aVar2, 22);
                o0VarE.K(e0Var);
                objQ2 = e0Var;
            } else {
                mcVar = mcVarF;
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean zB = o0VarE.B(lVar2);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new me2.d(lVar2, 15);
                o0VarE.K(objQ3);
            }
            l.b(mcVar, (e23.a) objQ3, null, null, null, z3.f.c(1824694240, new ak0.h(lVar2, pVar2, vVar, pVar3, context, lVar), o0VarE), o0VarE, 196608);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.f(vVar, aVar, pVar, pVar2, lVar, aVar2, i14);
        }
    }
}
