package hw2;

import am.j;
import cx2.h;
import iw2.i1;
import j20.x;
import java.io.Serializable;
import java.util.HashMap;
import o13.r;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhw2/e;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f85994a = new h("UIDeviceDataLoader:", null, 2, null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(int i14, v13.c cVar) throws JSONException {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f85993d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f85993d = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objD = dVar.f85991b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar.f85993d;
        h hVar = this.f85994a;
        if (i16 == 0) {
            r.b(objD);
            hVar.b("getDataValues: Requesting Data Values for -> " + i14);
            i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
            if (i1VarD != null) {
                dVar.f85990a = i14;
                dVar.f85993d = 1;
                objD = i1VarD.d(i14, dVar);
                if (objD == aVar) {
                    return aVar;
                }
            }
            x.l(j.h(i14, "data values must not be null for composition "));
            return null;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = dVar.f85990a;
        r.b(objD);
        String str = (String) objD;
        if (str != null) {
            com.garmin.realtimesettings.app.util.a.f52669a.getClass();
            HashMap mapB = com.garmin.realtimesettings.app.util.a.C1130a.b(str);
            String str2 = "Data Values: " + i14 + ": " + new JSONObject(mapB).toString(4);
            hVar.getClass();
            h.a(str2);
            return mapB;
        }
        x.l(j.h(i14, "data values must not be null for composition "));
        return null;
    }
}
