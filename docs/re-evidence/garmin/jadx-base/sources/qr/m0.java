package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityEpics$1", f = "ActivityDetailsViewModel.kt", l = {4233}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.z1 f146337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f146341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(t tVar, String str, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f146340d = tVar;
        this.f146341e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f146340d, this.f146341e, dVar);
        m0Var.f146339c = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        r53.z1 z1Var;
        Object value4;
        o53.b0 b0Var = (o53.b0) this.f146339c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146338b;
        t tVar = this.f146340d;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.p2 p2Var = tVar.f146532k0;
                    do {
                        value3 = p2Var.getValue();
                    } while (!q6.f.z(((Number) value3).intValue() + 1, p2Var, value3));
                    r53.z1 z1Var2 = (r53.z1) tVar.f146539m1.getValue();
                    mr.q qVar = tVar.f146558t;
                    long j8 = tVar.f146575z;
                    String str = this.f146341e;
                    this.f146339c = b0Var;
                    this.f146337a = z1Var2;
                    this.f146338b = 1;
                    Object objC = qVar.c(j8, str, this);
                    if (objC == aVar) {
                        return aVar;
                    }
                    z1Var = z1Var2;
                    obj = objC;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1Var = this.f146337a;
                    o13.r.b(obj);
                }
                z1Var.setValue(obj);
                r53.p2 p2Var2 = tVar.f146532k0;
                do {
                    value4 = p2Var2.getValue();
                } while (!q6.f.z(((Number) value4).intValue() - 1, p2Var2, value4));
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String str2 = "Error fetching activity epics: " + e4.getMessage();
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", str2);
                r53.p2 p2Var3 = tVar.f146532k0;
                do {
                    value = p2Var3.getValue();
                } while (!q6.f.z(((Number) value).intValue() - 1, p2Var3, value));
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            r53.p2 p2Var4 = tVar.f146532k0;
            do {
                value2 = p2Var4.getValue();
            } while (!q6.f.z(((Number) value2).intValue() - 1, p2Var4, value2));
            throw th3;
        }
    }
}
