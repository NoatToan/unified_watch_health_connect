package com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps;

import android.annotation.SuppressLint;
import android.os.Bundle;
import b.j;
import com.garmin.android.apps.connectmobile.c;
import ly0.o;
import o13.m;
import o13.n;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/maps/MapFullscreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapFullscreenActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39249b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39250a = m.a(n.SYNCHRONIZED, new b(xy2.b.v(), null, new ly0.b(this, 0)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f39251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39253c;

        public b(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f39251a = scope;
            this.f39252b = qualifier;
            this.f39253c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ly0.o] */
        @Override // e23.a
        public final o invoke() {
            return this.f39251a.get(s0.f105811a.b(o.class), this.f39252b, this.f39253c);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        c.j.a(this, new e(1488798859, true, new ly0.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/maps/MapFullscreenActivity$a;", "", "<init>", "()V", "", "EPIC_ACTIVITY_ID", "Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
