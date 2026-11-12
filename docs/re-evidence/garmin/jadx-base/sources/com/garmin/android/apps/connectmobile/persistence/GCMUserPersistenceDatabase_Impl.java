package com.garmin.android.apps.connectmobile.persistence;

import androidx.room.j0;
import com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase_Impl;
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
import p005kotlin.jvm.internal.t0;
import ru.c;
import w10.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMUserPersistenceDatabase_Impl extends GCMUserPersistenceDatabase {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f40311f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f40312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f40313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f40314e;

    public GCMUserPersistenceDatabase_Impl() {
        final int i14 = 0;
        this.f40312c = m.b(new e23.a(this) { // from class: z81.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMUserPersistenceDatabase_Impl f203094b;

            {
                this.f203094b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                GCMUserPersistenceDatabase_Impl gCMUserPersistenceDatabase_Impl = this.f203094b;
                switch (i15) {
                    case 0:
                        int i16 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new e(gCMUserPersistenceDatabase_Impl);
                    case 1:
                        int i17 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new com.garmin.android.apps.connectmobile.persistence.a(gCMUserPersistenceDatabase_Impl);
                    default:
                        int i18 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new ru.c(gCMUserPersistenceDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f40313d = m.b(new e23.a(this) { // from class: z81.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMUserPersistenceDatabase_Impl f203094b;

            {
                this.f203094b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                GCMUserPersistenceDatabase_Impl gCMUserPersistenceDatabase_Impl = this.f203094b;
                switch (i16) {
                    case 0:
                        int i17 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new e(gCMUserPersistenceDatabase_Impl);
                    case 1:
                        int i18 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new com.garmin.android.apps.connectmobile.persistence.a(gCMUserPersistenceDatabase_Impl);
                    default:
                        int i19 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new ru.c(gCMUserPersistenceDatabase_Impl);
                }
            }
        });
        final int i16 = 2;
        this.f40314e = m.b(new e23.a(this) { // from class: z81.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMUserPersistenceDatabase_Impl f203094b;

            {
                this.f203094b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                GCMUserPersistenceDatabase_Impl gCMUserPersistenceDatabase_Impl = this.f203094b;
                switch (i17) {
                    case 0:
                        int i18 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new e(gCMUserPersistenceDatabase_Impl);
                    case 1:
                        int i19 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new com.garmin.android.apps.connectmobile.persistence.a(gCMUserPersistenceDatabase_Impl);
                    default:
                        int i110 = GCMUserPersistenceDatabase_Impl.f40311f;
                        return new ru.c(gCMUserPersistenceDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "open_web_page_requests", "activity_types", "badges_unredeemed_rewards_table");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        return arrayList;
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "open_web_page_requests", "activity_types", "badges_unredeemed_rewards_table");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new z81.d(this);
    }

    @Override // com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase
    public final z81.a e() {
        return (z81.a) this.f40313d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase
    public final ru.a f() {
        return (ru.a) this.f40314e.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase
    public final w10.d g() {
        return (w10.d) this.f40312c.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t0 t0Var = s0.f105811a;
        d dVarB = t0Var.b(w10.d.class);
        e.f181186d.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        d dVarB2 = t0Var.b(z81.a.class);
        a.f40315c.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        d dVarB3 = t0Var.b(ru.a.class);
        c.f154570e.getClass();
        linkedHashMap.put(dVarB3, j0Var);
        return linkedHashMap;
    }
}
