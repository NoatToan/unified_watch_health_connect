package com.garmin.android.apps.connectmobile.activities.stats.exercises.database;

import androidx.room.j0;
import i3.f2;
import iq.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k23.d;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/RecentSelectedExercisesDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/RecentSelectedExercisesDatabase;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecentSelectedExercisesDatabase_Impl extends RecentSelectedExercisesDatabase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f29921d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f29922c = m.b(new f2(this, 11));

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "recent_selected_exercises");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "recent_selected_exercises");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase
    public final iq.a e() {
        return (iq.a) this.f29922c.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVarB = s0.f105811a.b(iq.a.class);
        a.f29923c.getClass();
        linkedHashMap.put(dVarB, p13.j0.f134944a);
        return linkedHashMap;
    }
}
