package com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import b.j;
import c22.g;
import com.garmin.android.apps.connectmobile.c;
import jy0.l;
import o13.m;
import o13.n;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import xy2.b;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/creation/MultiDayActivitiesCreationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class MultiDayActivitiesCreationActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39228b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39229a = m.a(n.SYNCHRONIZED, new a(b.v(), null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f39230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39232c;

        public a(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f39230a = scope;
            this.f39231b = qualifier;
            this.f39232c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jy0.l] */
        @Override // e23.a
        public final l invoke() {
            return this.f39230a.get(s0.f105811a.b(l.class), this.f39231b, this.f39232c);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        Uri data = getIntent().getData();
        if (data != null) {
            g.f23056a.getClass();
            g.b(data);
        }
        c.j.a(this, new e(1206683477, true, new jy0.j(this, 0)));
    }
}
