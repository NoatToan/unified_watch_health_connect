package com.garmin.android.apps.connectmobile.liveeventsharing.database;

import androidx.room.j0;
import com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase_Impl;
import e23.a;
import eu0.b;
import fu0.c;
import fu0.e;
import fu0.f;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/database/LiveEventDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/liveeventsharing/database/LiveEventDatabase;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveEventDatabase_Impl extends LiveEventDatabase {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f38502f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f38503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f38504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f38505e;

    public LiveEventDatabase_Impl() {
        final int i14 = 0;
        this.f38503c = m.b(new a(this) { // from class: eu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveEventDatabase_Impl f66091b;

            {
                this.f66091b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                LiveEventDatabase_Impl liveEventDatabase_Impl = this.f66091b;
                switch (i15) {
                    case 0:
                        int i16 = LiveEventDatabase_Impl.f38502f;
                        return new fu0.d(liveEventDatabase_Impl);
                    case 1:
                        int i17 = LiveEventDatabase_Impl.f38502f;
                        return new fu0.b(liveEventDatabase_Impl);
                    default:
                        int i18 = LiveEventDatabase_Impl.f38502f;
                        return new f(liveEventDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f38504d = m.b(new a(this) { // from class: eu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveEventDatabase_Impl f66091b;

            {
                this.f66091b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                LiveEventDatabase_Impl liveEventDatabase_Impl = this.f66091b;
                switch (i16) {
                    case 0:
                        int i17 = LiveEventDatabase_Impl.f38502f;
                        return new fu0.d(liveEventDatabase_Impl);
                    case 1:
                        int i18 = LiveEventDatabase_Impl.f38502f;
                        return new fu0.b(liveEventDatabase_Impl);
                    default:
                        int i19 = LiveEventDatabase_Impl.f38502f;
                        return new f(liveEventDatabase_Impl);
                }
            }
        });
        final int i16 = 2;
        this.f38505e = m.b(new a(this) { // from class: eu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveEventDatabase_Impl f66091b;

            {
                this.f66091b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                LiveEventDatabase_Impl liveEventDatabase_Impl = this.f66091b;
                switch (i17) {
                    case 0:
                        int i18 = LiveEventDatabase_Impl.f38502f;
                        return new fu0.d(liveEventDatabase_Impl);
                    case 1:
                        int i19 = LiveEventDatabase_Impl.f38502f;
                        return new fu0.b(liveEventDatabase_Impl);
                    default:
                        int i110 = LiveEventDatabase_Impl.f38502f;
                        return new f(liveEventDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "live_event_settings", "live_event_contacts", "transitions_counter");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "live_event_settings", "live_event_contacts", "transitions_counter");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase
    public final fu0.a e() {
        return (fu0.a) this.f38504d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase
    public final c f() {
        return (c) this.f38503c.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase
    public final e g() {
        return (e) this.f38505e.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t0 t0Var = s0.f105811a;
        d dVarB = t0Var.b(c.class);
        fu0.d.f73497d.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        d dVarB2 = t0Var.b(fu0.a.class);
        fu0.b.f73492d.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        d dVarB3 = t0Var.b(e.class);
        f.f73502c.getClass();
        linkedHashMap.put(dVarB3, j0Var);
        return linkedHashMap;
    }
}
