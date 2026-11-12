package com.garmin.android.library.livetrack.data;

import androidx.room.j0;
import com.garmin.android.library.livetrack.data.LocalDatabase_Impl;
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
import xd2.e1;
import zd2.c;
import zd2.e;
import zd2.f;
import zd2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/livetrack/data/LocalDatabase_Impl;", "Lcom/garmin/android/library/livetrack/data/LocalDatabase;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocalDatabase_Impl extends LocalDatabase {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f50201g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f50202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f50203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f50204f;

    public LocalDatabase_Impl() {
        final int i14 = 0;
        this.f50202d = m.b(new a(this) { // from class: xd2.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocalDatabase_Impl f190095b;

            {
                this.f190095b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                LocalDatabase_Impl localDatabase_Impl = this.f190095b;
                switch (i15) {
                    case 0:
                        int i16 = LocalDatabase_Impl.f50201g;
                        return new zd2.e(localDatabase_Impl);
                    case 1:
                        int i17 = LocalDatabase_Impl.f50201g;
                        return new zd2.h(localDatabase_Impl);
                    default:
                        int i18 = LocalDatabase_Impl.f50201g;
                        return new zd2.c(localDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f50203e = m.b(new a(this) { // from class: xd2.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocalDatabase_Impl f190095b;

            {
                this.f190095b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                LocalDatabase_Impl localDatabase_Impl = this.f190095b;
                switch (i16) {
                    case 0:
                        int i17 = LocalDatabase_Impl.f50201g;
                        return new zd2.e(localDatabase_Impl);
                    case 1:
                        int i18 = LocalDatabase_Impl.f50201g;
                        return new zd2.h(localDatabase_Impl);
                    default:
                        int i19 = LocalDatabase_Impl.f50201g;
                        return new zd2.c(localDatabase_Impl);
                }
            }
        });
        final int i16 = 2;
        this.f50204f = m.b(new a(this) { // from class: xd2.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocalDatabase_Impl f190095b;

            {
                this.f190095b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                LocalDatabase_Impl localDatabase_Impl = this.f190095b;
                switch (i17) {
                    case 0:
                        int i18 = LocalDatabase_Impl.f50201g;
                        return new zd2.e(localDatabase_Impl);
                    case 1:
                        int i19 = LocalDatabase_Impl.f50201g;
                        return new zd2.h(localDatabase_Impl);
                    default:
                        int i110 = LocalDatabase_Impl.f50201g;
                        return new zd2.c(localDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "general_settings", "session_info", "livetrack_publishers");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "general_settings", "session_info", "livetrack_publishers");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new e1(this);
    }

    @Override // com.garmin.android.library.livetrack.data.LocalDatabase
    public final zd2.a f() {
        return (zd2.a) this.f50204f.getValue();
    }

    @Override // com.garmin.android.library.livetrack.data.LocalDatabase
    public final zd2.d g() {
        return (zd2.d) this.f50202d.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t0 t0Var = s0.f105811a;
        d dVarB = t0Var.b(zd2.d.class);
        e.f204232d.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        d dVarB2 = t0Var.b(f.class);
        h.f204240e.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        d dVarB3 = t0Var.b(zd2.a.class);
        c.f204229c.getClass();
        linkedHashMap.put(dVarB3, j0Var);
        return linkedHashMap;
    }

    @Override // com.garmin.android.library.livetrack.data.LocalDatabase
    public final f h() {
        return (f) this.f50203e.getValue();
    }
}
