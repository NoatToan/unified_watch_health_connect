package ll1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zd0.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.init.RecordActivitySelectDeviceViewModel$checkOnboardingCompleted$1", f = "RecordActivitySelectDeviceViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o.a f113417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f113418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f113420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o.a f113421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f113422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o.a aVar, m mVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f113421e = aVar;
        this.f113422f = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f113421e, this.f113422f, dVar);
        nVar.f113420d = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object value;
        Object value2;
        Object value3;
        Object objA;
        o.a aVar;
        b0 b0Var = (b0) this.f113420d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113419c;
        m mVar = this.f113422f;
        try {
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.RECORD_ACTIVITY;
                o.a aVar3 = this.f113421e;
                String strE = org.apache.commons.lang3.e.e(aVar3.f204090a, "Starting onboarding completed check for deviceId=");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "RecordActivitySelectDeviceViewModel", strE);
                p2 p2Var = mVar.f113414b;
                do {
                    value3 = p2Var.getValue();
                    ((l) value3).getClass();
                } while (!p2Var.b(value3, new l(true, false, null)));
                int i15 = q.f128596b;
                fl1.b bVar2 = mVar.f113413a;
                long j8 = aVar3.f204090a;
                this.f113420d = b0Var;
                this.f113417a = aVar3;
                this.f113418b = b0Var;
                this.f113419c = 1;
                objA = bVar2.a(j8, this);
                if (objA == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f113417a;
                r.b(obj);
                objA = ((q) obj).f128597a;
            }
            r.b(objA);
            if (((Boolean) objA).booleanValue()) {
                a2 a2Var2 = a2.RECORD_ACTIVITY;
                String str = "Onboarding completed for deviceId: " + aVar.f204090a + ", and no initial selected sport type, navigating to select activity";
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "RecordActivitySelectDeviceViewModel", str);
                bVar = new k.b(aVar.f204090a);
            } else {
                a2 a2Var3 = a2.RECORD_ACTIVITY;
                String str2 = "Onboarding not completed for deviceId: " + aVar.f204090a + ", navigating to onboarding";
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "RecordActivitySelectDeviceViewModel", str2);
                bVar = new k.a(aVar.f204090a, aVar.f204091b);
            }
            int i16 = q.f128596b;
        } catch (Throwable th3) {
            int i17 = q.f128596b;
            bVar = new q.b(th3);
        }
        if (!(bVar instanceof q.b)) {
            k kVar = (k) bVar;
            i2.f36769a.getClass();
            i2.a.b(a2.RECORD_ACTIVITY, "RecordActivitySelectDeviceViewModel", "Onboarding completed check successful, onboarding completed: " + kVar);
            p2 p2Var2 = mVar.f113414b;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, l.a((l) value2, kVar, 2)));
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            a2 a2Var4 = a2.RECORD_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.g(a2Var4, "RecordActivitySelectDeviceViewModel", thB);
            p2 p2Var3 = mVar.f113414b;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, l.a((l) value, null, 4)));
        }
        return Unit.INSTANCE;
    }
}
