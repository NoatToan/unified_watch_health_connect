package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class e0 implements b0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f31864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f31865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.k f31866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f31867d;

    public e0(b0 b0Var, List list, List list2, b0.k kVar) {
        this.f31867d = b0Var;
        this.f31864a = list;
        this.f31865b = list2;
        this.f31866c = kVar;
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
    public final void a(long j8, long j14, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.f31864a.addAll(arrayList);
        }
        this.f31867d.f(this.f31865b, GDIConnectIQInstalledApps.AppType.WATCH_APP, this.f31866c);
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
    public final void b() {
        this.f31866c.K3();
    }
}
