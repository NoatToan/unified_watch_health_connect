package com.garmin.android.apps.connectmobile.webtranslation;

import androidx.room.j0;
import i3.f2;
import i42.h;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/WebTranslationDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/webtranslation/WebTranslationDatabase;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebTranslationDatabase_Impl extends WebTranslationDatabase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47966d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f47967c = m.b(new f2(this, 4));

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(true, "translation", "installation_record");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "translation", "installation_record");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new i42.m(this);
    }

    @Override // com.garmin.android.apps.connectmobile.webtranslation.WebTranslationDatabase
    public final h e() {
        return (h) this.f47967c.getValue();
    }

    @Override // androidx.room.b0
    public final Set<d<Object>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    public final Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVarB = s0.f105811a.b(h.class);
        b.f47973e.getClass();
        linkedHashMap.put(dVarB, p13.j0.f134944a);
        return linkedHashMap;
    }
}
