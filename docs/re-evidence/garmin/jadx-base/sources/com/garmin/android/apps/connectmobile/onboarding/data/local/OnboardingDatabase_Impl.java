package com.garmin.android.apps.connectmobile.onboarding.data.local;

import androidx.room.j0;
import c31.c;
import c31.h;
import c31.j;
import com.garmin.android.apps.connectmobile.onboarding.data.local.OnboardingDatabase_Impl;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/data/local/OnboardingDatabase_Impl;", "Lcom/garmin/android/apps/connectmobile/onboarding/data/local/OnboardingDatabase;", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnboardingDatabase_Impl extends OnboardingDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f39659e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f39660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f39661d;

    public OnboardingDatabase_Impl() {
        final int i14 = 0;
        this.f39660c = m.b(new e23.a(this) { // from class: c31.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingDatabase_Impl f24091b;

            {
                this.f24091b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                OnboardingDatabase_Impl onboardingDatabase_Impl = this.f24091b;
                switch (i15) {
                    case 0:
                        int i16 = OnboardingDatabase_Impl.f39659e;
                        return new com.garmin.android.apps.connectmobile.onboarding.data.local.a(onboardingDatabase_Impl);
                    default:
                        int i17 = OnboardingDatabase_Impl.f39659e;
                        return new com.garmin.android.apps.connectmobile.onboarding.data.local.b(onboardingDatabase_Impl);
                }
            }
        });
        final int i15 = 1;
        this.f39661d = m.b(new e23.a(this) { // from class: c31.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingDatabase_Impl f24091b;

            {
                this.f24091b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                OnboardingDatabase_Impl onboardingDatabase_Impl = this.f24091b;
                switch (i16) {
                    case 0:
                        int i17 = OnboardingDatabase_Impl.f39659e;
                        return new com.garmin.android.apps.connectmobile.onboarding.data.local.a(onboardingDatabase_Impl);
                    default:
                        int i18 = OnboardingDatabase_Impl.f39659e;
                        return new com.garmin.android.apps.connectmobile.onboarding.data.local.b(onboardingDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        performClear(false, "device_onboarding_items", "prompt_onboarding_items");
    }

    @Override // androidx.room.b0
    public final List<kd.a> createAutoMigrations(Map<d<Object>, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // androidx.room.b0
    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new LinkedHashMap(), new LinkedHashMap(), "device_onboarding_items", "prompt_onboarding_items");
    }

    @Override // androidx.room.b0
    public final j0 createOpenDelegate() {
        return new h(this);
    }

    @Override // com.garmin.android.apps.connectmobile.onboarding.data.local.OnboardingDatabase
    public final c e() {
        return (c) this.f39660c.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.onboarding.data.local.OnboardingDatabase
    public final j f() {
        return (j) this.f39661d.getValue();
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
        a.f39662d.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        linkedHashMap.put(dVarB, j0Var);
        d dVarB2 = t0Var.b(j.class);
        b.f39667d.getClass();
        linkedHashMap.put(dVarB2, j0Var);
        return linkedHashMap;
    }
}
