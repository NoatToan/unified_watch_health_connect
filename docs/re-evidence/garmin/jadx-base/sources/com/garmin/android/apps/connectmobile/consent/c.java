package com.garmin.android.apps.connectmobile.consent;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import lc.q0;
import p005kotlin.Metadata;
import q92.x;
import vb.h;
import z10.f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/c;", "Llc/q0;", "Lz10/f0;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends q0<f0> {
    public c() {
        super(false);
    }

    @Override // lc.q0
    public final f0 a(Bundle bundle, String str) {
        Object serializable;
        Parcelable parcelable;
        bundle.getClass();
        str.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializable = bundle.getSerializable("extra_consent_feature", x.class);
        } else {
            Object serializable2 = bundle.getSerializable("extra_consent_feature");
            if (!(serializable2 instanceof x)) {
                serializable2 = null;
            }
            serializable = (x) serializable2;
        }
        x xVar = (x) serializable;
        if (xVar == null) {
            h.s("Missing ConsentTypeId");
            return null;
        }
        boolean z14 = bundle.getBoolean("extra_revoke_navigate_my_day", false);
        if (i14 >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("GCM_extra_screen_access_role", hl.a.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("GCM_extra_screen_access_role");
            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
        }
        hl.a aVar = (hl.a) parcelable;
        if (aVar == null) {
            aVar = hl.a.c.f84256b;
        }
        return new f0(xVar, z14, aVar, bundle.getBoolean("extra_creation_consent_flow", false));
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final f0 h(String str) {
        str.getClass();
        n63.b.a aVar = n63.b.f123892d;
        aVar.getClass();
        return (f0) aVar.c(f0.INSTANCE.serializer(), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, f0 f0Var) {
        f0 f0Var2 = f0Var;
        str.getClass();
        f0Var2.getClass();
        bundle.putSerializable("extra_consent_feature", f0Var2.f200982a);
        bundle.putBoolean("extra_revoke_navigate_my_day", f0Var2.f200983b);
        bundle.putParcelable("GCM_extra_screen_access_role", f0Var2.f200984c);
        bundle.putBoolean("extra_creation_consent_flow", f0Var2.f200985d);
    }

    @Override // lc.q0
    public final String f(f0 f0Var) {
        f0 f0Var2 = f0Var;
        f0Var2.getClass();
        n63.b.a aVar = n63.b.f123892d;
        aVar.getClass();
        return aVar.b(f0.INSTANCE.serializer(), f0Var2);
    }
}
