package ht;

import am.x0;
import am.z0;
import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht/d;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f85467a = new d();

    private d() {
    }

    public static void a(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, boolean z14) {
        hVar.getClass();
        String str = hVar.C().f4358a;
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.D, str)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("newDive", z14);
            a.f85464a.getClass();
            a.a(bundle, "EditedDiveLog");
        }
    }
}
