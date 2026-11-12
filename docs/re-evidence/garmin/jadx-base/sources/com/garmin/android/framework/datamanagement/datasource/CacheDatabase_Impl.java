package com.garmin.android.framework.datamanagement.datasource;

import androidx.room.j0;
import bb2.c;
import bb2.e;
import bb2.g;
import bb2.j;
import bb2.k;
import bb2.o;
import bb2.p;
import bb2.q;
import cb2.b;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase_Impl;
import e23.a;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/framework/datamanagement/datasource/CacheDatabase_Impl;", "Lcom/garmin/android/framework/datamanagement/datasource/CacheDatabase;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CacheDatabase_Impl extends CacheDatabase {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49879g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f49880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f49881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f49882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f49883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f49884f;

    public CacheDatabase_Impl() {
        final int i14 = 0;
        this.f49880b = m.b(new a(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CacheDatabase_Impl f26646b;

            {
                this.f26646b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                CacheDatabase_Impl cacheDatabase_Impl = this.f26646b;
                switch (i15) {
                    case 0:
                        int i16 = CacheDatabase_Impl.f49879g;
                        return new c(cacheDatabase_Impl);
                    case 1:
                        int i17 = CacheDatabase_Impl.f49879g;
                        return new g(cacheDatabase_Impl);
                    case 2:
                        int i18 = CacheDatabase_Impl.f49879g;
                        return new q(cacheDatabase_Impl);
                    case 3:
                        int i19 = CacheDatabase_Impl.f49879g;
                        return new o(cacheDatabase_Impl);
                    default:
                        int i24 = CacheDatabase_Impl.f49879g;
                        return new k(cacheDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f49881c = m.b(new a(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CacheDatabase_Impl f26646b;

            {
                this.f26646b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                CacheDatabase_Impl cacheDatabase_Impl = this.f26646b;
                switch (i16) {
                    case 0:
                        int i17 = CacheDatabase_Impl.f49879g;
                        return new c(cacheDatabase_Impl);
                    case 1:
                        int i18 = CacheDatabase_Impl.f49879g;
                        return new g(cacheDatabase_Impl);
                    case 2:
                        int i19 = CacheDatabase_Impl.f49879g;
                        return new q(cacheDatabase_Impl);
                    case 3:
                        int i110 = CacheDatabase_Impl.f49879g;
                        return new o(cacheDatabase_Impl);
                    default:
                        int i24 = CacheDatabase_Impl.f49879g;
                        return new k(cacheDatabase_Impl);
                }
            }
        });
        final int i16 = 2;
        this.f49882d = m.b(new a(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CacheDatabase_Impl f26646b;

            {
                this.f26646b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                CacheDatabase_Impl cacheDatabase_Impl = this.f26646b;
                switch (i17) {
                    case 0:
                        int i18 = CacheDatabase_Impl.f49879g;
                        return new c(cacheDatabase_Impl);
                    case 1:
                        int i19 = CacheDatabase_Impl.f49879g;
                        return new g(cacheDatabase_Impl);
                    case 2:
                        int i110 = CacheDatabase_Impl.f49879g;
                        return new q(cacheDatabase_Impl);
                    case 3:
                        int i111 = CacheDatabase_Impl.f49879g;
                        return new o(cacheDatabase_Impl);
                    default:
                        int i24 = CacheDatabase_Impl.f49879g;
                        return new k(cacheDatabase_Impl);
                }
            }
        });
        final int i17 = 3;
        this.f49883e = m.b(new a(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CacheDatabase_Impl f26646b;

            {
                this.f26646b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                CacheDatabase_Impl cacheDatabase_Impl = this.f26646b;
                switch (i18) {
                    case 0:
                        int i19 = CacheDatabase_Impl.f49879g;
                        return new c(cacheDatabase_Impl);
                    case 1:
                        int i110 = CacheDatabase_Impl.f49879g;
                        return new g(cacheDatabase_Impl);
                    case 2:
                        int i111 = CacheDatabase_Impl.f49879g;
                        return new q(cacheDatabase_Impl);
                    case 3:
                        int i112 = CacheDatabase_Impl.f49879g;
                        return new o(cacheDatabase_Impl);
                    default:
                        int i24 = CacheDatabase_Impl.f49879g;
                        return new k(cacheDatabase_Impl);
                }
            }
        });
        final int i18 = 4;
        this.f49884f = m.b(new a(this) { // from class: cb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CacheDatabase_Impl f26646b;

            {
                this.f26646b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                CacheDatabase_Impl cacheDatabase_Impl = this.f26646b;
                switch (i19) {
                    case 0:
                        int i110 = CacheDatabase_Impl.f49879g;
                        return new c(cacheDatabase_Impl);
                    case 1:
                        int i111 = CacheDatabase_Impl.f49879g;
                        return new g(cacheDatabase_Impl);
                    case 2:
                        int i112 = CacheDatabase_Impl.f49879g;
                        return new q(cacheDatabase_Impl);
                    case 3:
                        int i113 = CacheDatabase_Impl.f49879g;
                        return new o(cacheDatabase_Impl);
                    default:
                        int i24 = CacheDatabase_Impl.f49879g;
                        return new k(cacheDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "activity_polyline", "activity_summaries", "response_cache", "device_work_input", "device_needs_bond");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "activity_polyline", "activity_summaries", "response_cache", "device_work_input", "device_needs_bond");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new b(this);
    }

    @Override // com.garmin.android.framework.datamanagement.datasource.CacheDatabase
    public final bb2.a e() {
        return (bb2.a) this.f49880b.getValue();
    }

    @Override // com.garmin.android.framework.datamanagement.datasource.CacheDatabase
    public final e f() {
        return (e) this.f49881c.getValue();
    }

    @Override // com.garmin.android.framework.datamanagement.datasource.CacheDatabase
    public final j g() {
        return (j) this.f49884f.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t0 t0Var = s0.f105811a;
        d dVarB = t0Var.b(bb2.a.class);
        c.f17328d.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        d dVarB2 = t0Var.b(e.class);
        g.f17352c.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        d dVarB3 = t0Var.b(p.class);
        q.f17382c.getClass();
        linkedHashMap.put(dVarB3, j0Var);
        d dVarB4 = t0Var.b(bb2.m.class);
        o.f17378d.getClass();
        linkedHashMap.put(dVarB4, j0Var);
        d dVarB5 = t0Var.b(j.class);
        k.f17367c.getClass();
        linkedHashMap.put(dVarB5, j0Var);
        return linkedHashMap;
    }

    @Override // com.garmin.android.framework.datamanagement.datasource.CacheDatabase
    public final bb2.m h() {
        return (bb2.m) this.f49883e.getValue();
    }

    @Override // com.garmin.android.framework.datamanagement.datasource.CacheDatabase
    public final p j() {
        return (p) this.f49882d.getValue();
    }
}
