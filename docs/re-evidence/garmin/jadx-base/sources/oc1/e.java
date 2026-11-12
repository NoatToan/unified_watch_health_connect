package oc1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.queueddownload.QueuedDownloadViewModel$createBodyAndSendToDevice$1", f = "QueuedDownloadViewModel.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f131167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f131168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f131169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, long j8, String str, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f131167b = dVar;
        this.f131168c = j8;
        this.f131169d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f131167b, this.f131168c, this.f131169d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131166a;
        long j8 = this.f131168c;
        if (i14 == 0) {
            r.b(obj);
            int i15 = d.f131164b;
            d dVar = this.f131167b;
            dVar.getClass();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", j8);
            jSONObject.put("fileType", "FIT");
            jSONObject.put("messageType", "device-settings");
            jSONObject.put("messageUrl", "device-service/deviceservice/all-settings/fit/" + j8);
            jSONObject.put("messageName", "Device Settings");
            jSONObject.put("priority", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            jSONArray.put(jSONObject);
            String string = jSONArray.toString();
            string.getClass();
            b bVar = dVar.f131165a;
            this.f131166a = 1;
            bVar.getClass();
            obj = f0.J(bVar, new c(bVar, string, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            yr1.e.a(j8, this.f131169d);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a.j(i2.f36769a, "QueuedDownloadViewModel", "Fail to compose device message JSON object: " + ((v2.a) v2Var).f47383a);
        }
        return Unit.INSTANCE;
    }
}
