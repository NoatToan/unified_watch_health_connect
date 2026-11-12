package com.garmin.android.library.promotionlibrary.database;

import androidx.room.j0;
import cq0.g;
import df2.b;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/promotionlibrary/database/CampaignDatabase_Impl;", "Lcom/garmin/android/library/promotionlibrary/database/CampaignDatabase;", "<init>", "()V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CampaignDatabase_Impl extends CampaignDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f50539e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f50540d = m.b(new g(this, 17));

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "campaigns");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "campaigns");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new b(this);
    }

    @Override // com.garmin.android.library.promotionlibrary.database.CampaignDatabase
    public final df2.a e() {
        return (df2.a) this.f50540d.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVarB = s0.f105811a.b(df2.a.class);
        a.f50541c.getClass();
        linkedHashMap.put(dVarB, p13.j0.f134944a);
        return linkedHashMap;
    }
}
