package com.garmin.android.apps.connectmobile.googlehealthconnect.data.database;

import androidx.room.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k23.d;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import xn.r;
import yl0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/data/database/GoogleHealthConnectDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/googlehealthconnect/data/database/GoogleHealthConnectDatabase;", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GoogleHealthConnectDatabase_Impl extends GoogleHealthConnectDatabase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f36057c = 0;

    public GoogleHealthConnectDatabase_Impl() {
        m.b(new r(this, 22));
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "google_health_connect_record_entity");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "google_health_connect_record_entity");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new yl0.a(this);
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVarB = s0.f105811a.b(b.class);
        a.f36058a.getClass();
        linkedHashMap.put(dVarB, p13.j0.f134944a);
        return linkedHashMap;
    }
}
