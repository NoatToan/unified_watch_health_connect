package com.garmin.android.apps.connectmobile.bikesensors;

import bd0.b0;
import bd0.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d implements s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f30871a;

    public d(c cVar) {
        this.f30871a = cVar;
    }

    @Override // bd0.s.c
    public final void a() {
    }

    @Override // bd0.s.c
    public final void b(b0 b0Var) {
        c cVar = this.f30871a;
        if (cVar.f30862b.get() != null) {
            cVar.f30862b.get().c(b0Var);
        }
    }

    @Override // bd0.s.c
    public final void c(lj0.e.a aVar) {
        c cVar = this.f30871a;
        if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject((String) aVar.f112977a);
                boolean z14 = jSONObject.optBoolean("messageExistInQueue", false) || jSONObject.optBoolean("messageAddedInQueue", false);
                if (cVar.f30862b.get() != null) {
                    cVar.f30862b.get().b(z14);
                }
            } catch (JSONException unused) {
                if (cVar.f30862b.get() != null) {
                    cVar.f30862b.get().b(false);
                }
            }
        }
    }
}
