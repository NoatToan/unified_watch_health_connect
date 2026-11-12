package j20;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$saveContactDTO$1", f = "EmergencyContactViewModel.kt", l = {841, 842}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l20.a f96590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, l20.a aVar, t13.d<? super n> dVar2) {
        super(2, dVar2);
        this.f96589c = dVar;
        this.f96590d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f96589c, this.f96590d, dVar);
        nVar.f96588b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r14 == r1) goto L24;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        b0 b0Var = (b0) this.f96588b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96587a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.contacts.emergency.d dVar = this.f96589c;
            hl.a aVar2 = dVar.f32645d;
            boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
            l20.a aVar3 = this.f96590d;
            if (zG) {
                m20.z zVar = dVar.T;
                this.f96588b = b0Var;
                this.f96587a = 1;
                obj = zVar.h(aVar3, this);
            } else {
                if (!(aVar2 instanceof hl.a.b)) {
                    u0.r();
                    return null;
                }
                re0.o oVar = dVar.X;
                long j8 = ((hl.a.b) dVar.f32645d).f84252b;
                String contactId = aVar3.getContactId();
                if (contactId == null) {
                    contactId = "";
                }
                this.f96588b = b0Var;
                this.f96587a = 2;
                obj = oVar.q(j8, contactId, this.f96590d, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            v2Var = (v2) obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
        }
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EmergencyContactViewModel", "[saveContactDTO] Contact update Successfully!");
        } else {
            a2 a2Var2 = a2.SAFETY_FEATURES;
            String strF = b71.i.f("[saveContactDTO] Could not update contact! Result = ", v2Var);
            i2.f36769a.getClass();
            i2.a.p(a2Var2, "EmergencyContactViewModel", strF);
        }
        return Unit.INSTANCE;
    }
}
