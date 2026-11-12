package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.security.InvalidParameterException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getTriathlonEvent$1", f = "FBTPlanWizardViewModel.kt", l = {4255, 4258}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f13359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h hVar, String str, Long l14, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f13357c = hVar;
        this.f13358d = str;
        this.f13359e = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f13357c, this.f13358d, this.f13359e, dVar);
        f0Var.f13356b = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r11 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f13356b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13355a;
        Long l14 = this.f13359e;
        String str = this.f13358d;
        v2 v2Var = null;
        h hVar = this.f13357c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            y0<g3<fg0.k>> y0VarO6 = hVar.o6();
            zf0.d dVar = hVar.f204384a;
            y0VarO6.j(g3.a.c(g3.f35298f));
            if (str != null) {
                this.f13356b = b0Var;
                this.f13355a = 1;
                obj = dVar.f(str, this);
            } else if (l14 != null) {
                long jLongValue = l14.longValue();
                this.f13356b = b0Var;
                this.f13355a = 2;
                obj = dVar.d(jLongValue, this);
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
            int i16 = h.S1;
            u62.z.h(g3.f35298f, ((v2.b) v2Var).f47386a, hVar.o6());
        } else if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            String str2 = "Error fetching triathlon event (uuid=" + str + " id=" + l14 + "). Response Code=" + aVar2.f47384b + ", Exception=" + aVar2.f47383a;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", str2);
            int i17 = h.S1;
            hVar.o6().j(g3.a.a(g3.f35298f, null, aVar2.f47383a, null, null, 13));
        } else {
            InvalidParameterException invalidParameterException = new InvalidParameterException("Both the event UUID and ID are null");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.g(a2Var2, "FBTPlanWizardViewModel", invalidParameterException);
            int i18 = h.S1;
            hVar.o6().j(g3.a.a(g3.f35298f, null, invalidParameterException, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
