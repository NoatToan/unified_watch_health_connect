package dn2;

import c83.a0;
import e23.p;
import o13.r;
import o53.b0;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.device.sharing.management.devices.GCDeviceRetriever$fetchRegisteredGcDevices$1", f = "GCDeviceRetriever.kt", l = {248, 248}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f60554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.c f60555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, d.c cVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f60554b = dVar;
        this.f60555c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f60554b, this.f60555c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r11 == r3) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60553a;
        d.c cVar = this.f60555c;
        d dVar = this.f60554b;
        try {
            if (i14 == 0) {
                r.b(obj);
                this.f60553a = 1;
                obj = dVar.c(this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a0 a0Var = (a0) obj;
            if (a0Var.f25745a.isSuccessful()) {
                ResponseBody responseBody = (ResponseBody) a0Var.f25746b;
                String strString = responseBody != null ? responseBody.string() : null;
                d.a aVar2 = d.f60543e;
                dVar.getClass();
                if (strString != null && strString.length() != 0) {
                    try {
                        JSONArray jSONArray = new JSONArray(strString);
                        dVar.e().debug("getRegisteredDevices success, device count " + jSONArray.length());
                        cVar.a(jSONArray);
                        return Unit.INSTANCE;
                    } catch (JSONException e4) {
                        dVar.e().error("getRegisteredDevices parsing response failed", (Throwable) e4);
                        d.a aVar3 = d.f60543e;
                        dVar.e().error("getRegisteredDevices failed " + a0Var.f25745a.code());
                        cVar.onFailure(new Throwable("response code " + a0Var.f25745a.code()));
                        return Unit.INSTANCE;
                    }
                }
            }
            d.a aVar4 = d.f60543e;
            dVar.e().error("getRegisteredDevices failed " + a0Var.f25745a.code());
            cVar.onFailure(new Throwable("response code " + a0Var.f25745a.code()));
            return Unit.INSTANCE;
            en2.a aVar5 = (en2.a) ((c83.b0) obj).b(en2.a.class);
            this.f60553a = 2;
            obj = aVar5.c(this);
        } catch (Throwable th3) {
            d.a aVar6 = d.f60543e;
            dVar.e().error("getRegisteredDevices failed", th3);
            cVar.onFailure(th3);
        }
    }
}
