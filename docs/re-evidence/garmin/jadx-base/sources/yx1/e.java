package yx1;

import androidx.lifecycle.v1;
import dy1.o;
import e23.p;
import i3.fe;
import i3.se;
import l72.d3;
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
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.navigation.SetupStrengthTrainingPlanNavHostKt$SetupStrengthTrainingPlanNavHost$3$1", f = "SetupStrengthTrainingPlanNavHost.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f200037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f200038c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldy1/o;", "snackbarDataState", "", "<anonymous>", "(Ldy1/o;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.navigation.SetupStrengthTrainingPlanNavHostKt$SetupStrengthTrainingPlanNavHost$3$1$1", f = "SetupStrengthTrainingPlanNavHost.kt", l = {130}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<o, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f200039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f200040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f200041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ey1.a f200042d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, ey1.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f200041c = feVar;
            this.f200042d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f200041c, this.f200042d, dVar);
            aVar.f200040b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o oVar, t13.d<? super Unit> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e23.a<Unit> aVar;
            o oVar = (o) this.f200040b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f200039a;
            if (i14 == 0) {
                r.b(obj);
                String str = oVar.f61592a;
                if (str != null && str.length() != 0) {
                    String str2 = oVar.f61592a;
                    String str3 = oVar.f61593b;
                    this.f200040b = oVar;
                    this.f200039a = 1;
                    obj = d3.c(this.f200041c, str2, str3, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            if (((se) obj) == se.ActionPerformed && (aVar = oVar.f61594c) != null) {
                aVar.invoke();
            }
            ey1.a aVar3 = this.f200042d;
            aVar3.getClass();
            w9.a aVarA = v1.a(aVar3);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new ey1.b(aVar3, null), 2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ey1.a aVar, fe feVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f200037b = aVar;
        this.f200038c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f200037b, this.f200038c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200036a;
        if (i14 == 0) {
            r.b(obj);
            ey1.a aVar2 = this.f200037b;
            l1 l1Var = new l1(aVar2.F);
            a aVar3 = new a(this.f200038c, aVar2, null);
            this.f200036a = 1;
            if (s.k(l1Var, aVar3, this) == aVar) {
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
