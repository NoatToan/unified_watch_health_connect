package bk2;

import d53.t;
import d53.w;
import e23.p;
import o13.r;
import o53.b0;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$cacheMessage$2", f = "CIQMessageManager.kt", l = {}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f18530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f18529a = bVar;
        this.f18530b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f18529a, this.f18530b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long lJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f18529a;
        ck2.a aVarInvoke = bVar.f18503b.invoke();
        a aVar2 = this.f18530b;
        long j8 = aVar2.f18497a;
        String str = aVar2.f18500d;
        String str2 = aVar2.f18498b;
        int iH = w.H(str2, "-", 0, false, 6);
        long j14 = Long.MAX_VALUE;
        long jLongValue = (iH == -1 || (lJ = t.j(str2.substring(0, iH))) == null) ? Long.MAX_VALUE : lJ.longValue();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("gns")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("gns");
                if (jSONObject2.has("expiration")) {
                    j14 = jSONObject2.getLong("expiration");
                }
            }
        } catch (JSONException unused) {
        }
        aVarInvoke.d(new ck2.c(j8, jLongValue, j14, str2, aVar2.f18499c, str));
        bVar.f18504c.debug("Cached message " + str2 + " for device " + aVar2.f18497a);
        return Unit.INSTANCE;
    }
}
