package j20;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import m20.m0;
import m20.n0;
import m20.p0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$validateContactPhoneNumber$1", f = "EmergencyContactViewModel.kt", l = {GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f96599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l20.a f96600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, String str, l20.a aVar, t13.d<? super q> dVar2) {
        super(2, dVar2);
        this.f96598b = dVar;
        this.f96599c = str;
        this.f96600d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f96598b, this.f96599c, this.f96600d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96597a;
        com.garmin.android.apps.connectmobile.contacts.emergency.d dVar = this.f96598b;
        if (i14 == 0) {
            o13.r.b(obj);
            dVar.f32662w.j(g3.a.c(g3.f35298f));
            n0 n0Var = (n0) dVar.Z.getValue();
            this.f96597a = 1;
            n0Var.getClass();
            objJ = f0.J(n0Var, new m0(this.f96599c, n0Var, null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        boolean z14 = v2Var instanceof v2.b;
        l20.a aVar2 = this.f96600d;
        if (z14) {
            y0<g3<o13.p<p0, l20.a>>> y0Var = dVar.f32662w;
            g3.a aVar3 = g3.f35298f;
            o13.p pVar = new o13.p(((v2.b) v2Var).f47386a, aVar2);
            aVar3.getClass();
            y0Var.j(g3.a.d(pVar));
        } else {
            dVar.f32662w.j(g3.a.a(g3.f35298f, null, null, new o13.p(new p0(null, null, null, null, null, null, null, 127, null), aVar2), null, 11));
        }
        return Unit.INSTANCE;
    }
}
