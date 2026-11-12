package j20;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import gg1.v0;
import m20.q0;
import m20.r0;
import m20.s0;
import m20.t0;
import m20.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$createShortLink$1", f = "EmergencyContactViewModel.kt", l = {534}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f96571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f96573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, String str2, t13.d<? super k> dVar2) {
        super(2, dVar2);
        this.f96571b = str;
        this.f96572c = dVar;
        this.f96573d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f96571b, this.f96572c, this.f96573d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96570a;
        if (i14 == 0) {
            o13.r.b(obj);
            v0.T.getClass();
            t0 t0Var = new t0(this.f96571b, v0.a.b().B, null, null, 12, null);
            r0.f116017b.getClass();
            r0 r0Var = new r0((q0) ez0.b.a(ez0.b.f67468a, ez0.c.SHORT_LINK, q0.class, new c83.h.a[0], null, null, null, 120));
            this.f96570a = 1;
            obj = f0.J(r0Var, new s0(r0Var, t0Var, null), this);
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
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        String str = this.f96573d;
        com.garmin.android.apps.connectmobile.contacts.emergency.d dVar = this.f96572c;
        if (z14) {
            y0<g3<o13.p<String, String>>> y0Var = dVar.C;
            g3.a aVar2 = g3.f35298f;
            o13.p pVar = new o13.p(((u0) ((v2.b) v2Var).f47386a).getShortURL(), str);
            aVar2.getClass();
            y0Var.j(g3.a.d(pVar));
        } else {
            dVar.C.j(g3.a.a(g3.f35298f, null, null, new o13.p(this.f96571b, str), null, 11));
        }
        return Unit.INSTANCE;
    }
}
