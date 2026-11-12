package com.garmin.android.apps.connectmobile.newsfeed.db;

import androidx.room.j0;
import com.garmin.android.apps.connectmobile.newsfeed.db.NewsFeedDatabase_Impl;
import e23.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jz0.b;
import kz0.c;
import kz0.d;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase;", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewsFeedDatabase_Impl extends NewsFeedDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f39519e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f39520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f39521d;

    public NewsFeedDatabase_Impl() {
        final int i14 = 0;
        this.f39520c = m.b(new a(this) { // from class: jz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFeedDatabase_Impl f101900b;

            {
                this.f101900b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                NewsFeedDatabase_Impl newsFeedDatabase_Impl = this.f101900b;
                switch (i15) {
                    case 0:
                        int i16 = NewsFeedDatabase_Impl.f39519e;
                        return new d(newsFeedDatabase_Impl);
                    default:
                        int i17 = NewsFeedDatabase_Impl.f39519e;
                        return new kz0.b(newsFeedDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f39521d = m.b(new a(this) { // from class: jz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFeedDatabase_Impl f101900b;

            {
                this.f101900b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                NewsFeedDatabase_Impl newsFeedDatabase_Impl = this.f101900b;
                switch (i16) {
                    case 0:
                        int i17 = NewsFeedDatabase_Impl.f39519e;
                        return new d(newsFeedDatabase_Impl);
                    default:
                        int i18 = NewsFeedDatabase_Impl.f39519e;
                        return new kz0.b(newsFeedDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "edited_posts", "edited_connections");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<k23.d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "edited_posts", "edited_connections");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.newsfeed.db.NewsFeedDatabase
    public final kz0.a e() {
        return (kz0.a) this.f39521d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.newsfeed.db.NewsFeedDatabase
    public final c f() {
        return (c) this.f39520c.getValue();
    }

    @Override // androidx.room.b0
    public final Set<k23.d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<k23.d<?>, List<k23.d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t0 t0Var = s0.f105811a;
        k23.d dVarB = t0Var.b(c.class);
        d.f107782c.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        k23.d dVarB2 = t0Var.b(kz0.a.class);
        kz0.b.f107780b.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        return linkedHashMap;
    }
}
