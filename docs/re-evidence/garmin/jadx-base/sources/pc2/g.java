package pc2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o13.r;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.diapi.DI2ValidateAccessTokenRequest$run$2", f = "DI2ValidateAccessTokenRequest.kt", l = {68}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super wc2.a<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f137334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f137334b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f137334b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wc2.a<? extends Boolean>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137333a;
        if (i14 == 0) {
            r.b(obj);
            this.f137333a = 1;
            int i15 = h.f137335l;
            obj = this.f137334b.e(true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        wc2.a aVar2 = (wc2.a) obj;
        if (!(aVar2 instanceof wc2.a.b)) {
            aVar2.getClass();
            return aVar2;
        }
        String str = ((sc2.r) ((wc2.a.b) aVar2).f184316a).f158564a;
        str.getClass();
        return new wc2.a.b(Boolean.valueOf(new JSONObject(str).optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false)), 200);
    }
}
