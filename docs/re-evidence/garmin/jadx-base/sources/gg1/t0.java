package gg1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.PersistUserSettingsTask$invoke$2", f = "PersistUserSettingsTask.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f77315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f77317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(String str, s0 s0Var, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f77316b = str;
        this.f77317c = s0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t0 t0Var = new t0(this.f77316b, this.f77317c, dVar);
        t0Var.f77315a = obj;
        return t0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Object> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        String str = this.f77316b;
        if (str == null || !(!d53.w.J(str))) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "PersistUserSettingsTask", "Cannot save user settings. JSON is null or empty!");
            return Unit.INSTANCE;
        }
        s0 s0Var = this.f77317c;
        try {
            int i14 = o13.q.f128596b;
            JSONObject jSONObject = new JSONObject(str);
            s0.c(s0Var, jSONObject);
            s0.d(s0Var, jSONObject);
            s0.a(s0Var, jSONObject);
            s0.b(s0Var, jSONObject);
            bVar = o13.q.a(s0.e(s0Var, jSONObject));
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var2 = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.g(a2Var2, "PersistUserSettingsTask", thB);
        }
        return o13.q.a(bVar);
    }
}
