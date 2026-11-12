package kd0;

import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/b5;", "Lja1/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b5 implements ja1.b {
    @Override // ja1.b
    public final Intent a(Context context, long j8) {
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        am.h hVar = am.h.VIEW_EDIT;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11825d = true;
        return bVar.a(context);
    }

    @Override // ja1.b
    public final void b(long j8, qa1.d dVar) {
        am.b bVarM = am.b.M();
        bVarM.getClass();
        lj0.a aVar = lj0.a.f112941n;
        Object[] objArr = {Long.toString(j8)};
        fp.a aVar2 = new fp.a(true);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("excludeFromPowerCurveReports", aVar2.f73141a);
            aVar.f112948f = jSONObject.toString();
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        d80.f.b bVar = new d80.f.b(objArr, aVar);
        bVar.f58274d = new am.c(bVarM, dVar);
        bVar.f58275e = d80.g.NO_PARSING;
        bVar.a().b();
    }
}
