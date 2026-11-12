package com.garmin.android.apps.connectmobile.persistence;

import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/b;", "Lkd/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends kd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMUserPersistenceDatabase.b f40318a;

    public b() {
        super(10, 11);
        this.f40318a = new GCMUserPersistenceDatabase.b();
    }

    @Override // kd.a
    public final void migrate(ud.a aVar) {
        h.v(aVar, aVar, "DROP TABLE `onboarding_device_status`", aVar, "DROP TABLE `onboarding_app_feature_status`");
        this.f40318a.getClass();
    }
}
