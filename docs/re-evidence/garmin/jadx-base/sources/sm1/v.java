package sm1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$checkHistoricalPerformanceDevice$1", f = "SleepReportsViewModel.kt", l = {513}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f160254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f160255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar, long j8, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f160254b = sVar;
        this.f160255c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f160254b, this.f160255c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160253a;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
            this.f160253a = 1;
            obj = jVarA.h(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        bm2.c[] cVarArr = (bm2.c[]) obj;
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    z14 = false;
                    break;
                }
                bm2.c cVar = cVarArr[i15];
                if (cVar.f18941w1 && cVar.f18942x == this.f160255c) {
                    break;
                }
                i15++;
            }
            this.f160254b.A4(z14);
        }
        return Unit.INSTANCE;
    }
}
