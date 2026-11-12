package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/z1;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/y1;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f33443a;

    static {
        new a(null);
    }

    public z1(f12.l lVar) {
        lVar.getClass();
        this.f33443a = lVar;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.y1
    public final void a(String str) {
        if (str != null) {
            this.f33443a.S("heart_rate_zones", str);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.y1
    public final String b() {
        return this.f33443a.A4("heart_rate_zones", null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/z1$a;", "", "<init>", "()V", "", "HEART_RATE_ZONES_KEY", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
