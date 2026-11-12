package jx2;

import com.garmin.samd.exception.NullAppDelegateException;
import com.garmin.samd.exception.UserDoesNotConsentToUploadException;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDAccountManager$createDeviceEmbeddedHealthToken$2", f = "SaMDAccountManager.kt", l = {154, 157}, m = "invokeSuspend")
public final class c extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f101514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f101515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f101516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nx2.a.C2459a f101517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f101518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f101519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f101520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j8, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f101519f = bVar;
        this.f101520g = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f101519f, this.f101520g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j8;
        nx2.a.C2459a c2459a;
        gx2.a aVar;
        b bVar;
        nx2.d dVar;
        nx2.c.a aVar2;
        long j14;
        b bVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101518e;
        b bVar3 = this.f101519f;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    bVar3.h("createDeviceEmbeddedHealthToken");
                    bVar3.d().debug("createDeviceEmbeddedHealthToken");
                    gx2.a aVarC = a.c();
                    if (aVarC == null) {
                        throw new NullAppDelegateException();
                    }
                    if (!aVarC.b()) {
                        throw new UserDoesNotConsentToUploadException("", "createDeviceEmbeddedHealthToken");
                    }
                    gx2.a aVarC2 = a.c();
                    if (aVarC2 == null) {
                        throw new NullAppDelegateException();
                    }
                    j8 = this.f101520g;
                    c2459a = nx2.a.f128272b;
                    this.f101515b = bVar3;
                    this.f101516c = aVarC2;
                    this.f101517d = c2459a;
                    this.f101514a = j8;
                    this.f101518e = 1;
                    Object objO = og2.k.o(aVarC2, this);
                    if (objO != aVar3) {
                        aVar = aVarC2;
                        obj = objO;
                        bVar = bVar3;
                    }
                    return aVar3;
                }
                if (i14 == 1) {
                    j8 = this.f101514a;
                    c2459a = this.f101517d;
                    aVar = (gx2.a) this.f101516c;
                    bVar = this.f101515b;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j14 = this.f101514a;
                    aVar2 = (nx2.c.a) this.f101516c;
                    bVar2 = this.f101515b;
                    o13.r.b(obj);
                }
                nx2.f fVar = (nx2.f) obj;
                aVar2.getClass();
                fVar.getClass();
                try {
                    String string = new JSONObject(fVar.f128280a).getString("embeddedHealthToken");
                    string.getClass();
                    String str = new nx2.c(string).f128277a;
                    bVar2.d().debug("createDeviceEmbeddedHealthToken: success, deviceUnitId " + j14);
                    return str;
                } catch (Throwable th3) {
                    ge1.b.L("EmbeddedHealthToken").error("fromGHSJson", th3);
                    throw th3;
                }
                String string2 = new JSONObject(dVar.f128278a).getString("accountAuthCode");
                string2.getClass();
                String str2 = new nx2.a(string2).f128273a;
                nx2.c.a aVar4 = nx2.c.f128276b;
                nx2.e eVar = new nx2.e(new nx2.b(str2, j8));
                this.f101515b = bVar;
                this.f101516c = aVar4;
                this.f101517d = null;
                this.f101514a = j8;
                this.f101518e = 2;
                obj = oi0.c.n(eVar, aVar, this);
                if (obj != aVar3) {
                    aVar2 = aVar4;
                    j14 = j8;
                    bVar2 = bVar;
                    nx2.f fVar2 = (nx2.f) obj;
                    aVar2.getClass();
                    fVar2.getClass();
                    String string3 = new JSONObject(fVar2.f128280a).getString("embeddedHealthToken");
                    string3.getClass();
                    String str3 = new nx2.c(string3).f128277a;
                    bVar2.d().debug("createDeviceEmbeddedHealthToken: success, deviceUnitId " + j14);
                    return str3;
                }
                return aVar3;
            } catch (Throwable th4) {
                ge1.b.L("AuthCode").error("fromGHSJson", th4);
                throw th4;
            }
            dVar = (nx2.d) obj;
            c2459a.getClass();
            dVar.getClass();
        } catch (Throwable th5) {
            bVar3.e("createDeviceEmbeddedHealthToken", th5);
            throw bVar3.g(th5);
        }
    }
}
