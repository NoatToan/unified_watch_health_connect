package xx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.u0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import dy1.u;
import dy1.v;
import e23.l;
import e23.p;
import e23.r;
import gl1.y;
import j02.d0;
import j02.h0;
import j02.j;
import java.util.List;
import o53.b0;
import og2.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import wx1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r<j, Boolean, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f192536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f192537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f192538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u f192539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<u, Unit> f192540e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(v vVar, Context context, int i14, u uVar, l<? super u, Unit> lVar) {
            this.f192536a = vVar;
            this.f192537b = context;
            this.f192538c = i14;
            this.f192539d = uVar;
            this.f192540e = lVar;
        }

        @Override // e23.r
        public final Unit invoke(j jVar, Boolean bool, m mVar, Integer num) {
            j jVar2 = jVar;
            bool.getClass();
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            jVar2.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= mVar2.B(jVar2) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 131) != 130)) {
                x1 x1Var = n.f135158a;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                Context context = this.f192537b;
                int i14 = this.f192538c;
                v vVar = this.f192536a;
                qx1.e.a(jVar2, vVar.c(i14, context), this.f192539d, rVarC, vVar.f61642c.size() > 1, this.f192540e, mVar2, iIntValue & 14);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: xx1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.screen.wizard.customplans.CustomPlansWorkoutStepsScreenKt$CustomPlansWorkoutStepsScreen$1$1$reorderableLazyColumnState$1$1", f = "CustomPlansWorkoutStepsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3594b extends v13.i implements r<b0, e2.n, e2.n, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ e2.n f192541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ e2.n f192542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Integer, Integer, Unit> f192543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f192544d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3594b(p<? super Integer, ? super Integer, Unit> pVar, int i14, t13.d<? super C3594b> dVar) {
            super(4, dVar);
            this.f192543c = pVar;
            this.f192544d = i14;
        }

        @Override // e23.r
        public final Object invoke(b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Unit> dVar) {
            C3594b c3594b = new C3594b(this.f192543c, this.f192544d, dVar);
            c3594b.f192541a = nVar;
            c3594b.f192542b = nVar2;
            return c3594b.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e2.n nVar = this.f192541a;
            e2.n nVar2 = this.f192542b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int f62559a = nVar.getF62559a();
            int i14 = this.f192544d;
            this.f192543c.invoke(new Integer(f62559a - i14), new Integer(nVar2.getF62559a() - i14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f192545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f192546b;

        public c(p pVar, List list) {
            this.f192545a = pVar;
            this.f192546b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f192545a.invoke(Integer.valueOf(iIntValue), this.f192546b.get(iIntValue));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f192547a;

        public d(List list) {
            this.f192547a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f192547a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f192548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f192549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f192550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f192551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f192552e;

        public e(List list, h0 h0Var, v vVar, Context context, l lVar) {
            this.f192548a = list;
            this.f192549b = h0Var;
            this.f192550c = vVar;
            this.f192551d = context;
            this.f192552e = lVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
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
            int i15 = i14;
            if (mVar2.n(i15 & 1, (i15 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                u uVar = (u) this.f192548a.get(iIntValue);
                mVar2.C(1263689924);
                d0.a(dVar2, this.f192549b, p13.h0.k0(x.k(uVar.a(), Integer.valueOf(iIntValue)), null, null, null, null, 63), null, false, null, z3.f.c(-1766122509, new a(this.f192550c, this.f192551d, iIntValue, uVar, this.f192552e), mVar2), mVar2, (i15 & 14) | 1572864, 28);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(int i14, int i15, int i16, v vVar, e23.a aVar, e23.a aVar2, e23.a aVar3, l lVar, p pVar, p pVar2, m mVar) {
        pVar.getClass();
        pVar2.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1684657880);
        int i17 = i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.r(vVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(pVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432);
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            x1 x1Var = n.f135158a;
            int i18 = i17 >> 18;
            k.g(y.Q(o0VarE, R.string.lbl_stp_workout_steps), aVar2, aVar3, false, null, z3.f.c(1328905975, new u0(i14, i15, pVar2, vVar, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), pVar, lVar, aVar), o0VarE), o0VarE, (i18 & 112) | 196608 | (i18 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(i14, i15, vVar, pVar, pVar2, lVar, aVar, aVar2, aVar3, i16);
        }
    }
}
