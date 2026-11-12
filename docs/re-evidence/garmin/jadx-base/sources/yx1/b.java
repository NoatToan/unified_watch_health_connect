package yx1;

import androidx.lifecycle.v1;
import dy1.o;
import e23.p;
import ey1.j;
import ey1.k;
import i3.fe;
import i3.se;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.l1;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.navigation.DashboardStrengthTrainingPlanNavHostKt$DashboardStrengthTrainingPlanNavHost$2$1", f = "DashboardStrengthTrainingPlanNavHost.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f200025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f200026c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldy1/o;", "snackbarDataState", "", "<anonymous>", "(Ldy1/o;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.navigation.DashboardStrengthTrainingPlanNavHostKt$DashboardStrengthTrainingPlanNavHost$2$1$1", f = "DashboardStrengthTrainingPlanNavHost.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<o, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f200027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f200028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f200029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f200030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f200029c = feVar;
            this.f200030d = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f200029c, this.f200030d, dVar);
            aVar.f200028b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o oVar, t13.d<? super Unit> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            e23.a<Unit> aVar2;
            o oVar = (o) this.f200028b;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f200027a;
            if (i14 == 0) {
                r.b(obj);
                String str = oVar.f61592a;
                if (str != null && str.length() != 0) {
                    String str2 = oVar.f61592a;
                    String str3 = oVar.f61593b;
                    this.f200028b = oVar;
                    this.f200027a = 1;
                    aVar = this;
                    obj = fe.b(this.f200029c, str2, str3, null, aVar, 12);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            aVar = this;
            if (((se) obj) == se.ActionPerformed && (aVar2 = oVar.f61594c) != null) {
                aVar2.invoke();
            }
            j jVar = aVar.f200030d;
            jVar.getClass();
            w9.a aVarA = v1.a(jVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new k(jVar, null), 2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, fe feVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f200025b = jVar;
        this.f200026c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f200025b, this.f200026c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200024a;
        if (i14 == 0) {
            r.b(obj);
            j jVar = this.f200025b;
            l1 l1Var = new l1(jVar.X);
            a aVar2 = new a(this.f200026c, jVar, null);
            this.f200024a = 1;
            if (s.k(l1Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
