package com.garmin.android.apps.connectmobile.activities.manual.eventType;

import am.x0;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.io.Serializable;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/eventType/ActivitiesEventTypeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesEventTypeActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29178b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29179a = new w1(s0.f105811a.b(oo.b.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29180a;

        public b(l lVar) {
            lVar.getClass();
            this.f29180a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29180a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29180a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29181a;

        public c(g gVar) {
            this.f29181a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29181a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29182a;

        public d(g gVar) {
            this.f29182a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29182a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29184b;

        public e(e23.a aVar, g gVar) {
            this.f29183a = aVar;
            this.f29184b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29183a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29184b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qs.g gVar;
        Object serializable;
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, R.string.activity_details_event_type);
        Bundle extras = getIntent().getExtras();
        Serializable serializable2 = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("GCM_extra_event_type", qs.g.class);
            } else {
                Object serializable3 = extras.getSerializable("GCM_extra_event_type");
                if (!(serializable3 instanceof qs.g)) {
                    serializable3 = null;
                }
                serializable = (qs.g) serializable3;
            }
            gVar = (qs.g) serializable;
        } else {
            gVar = null;
        }
        gVar.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializable4 = extras != null ? extras.getSerializable("GCM_extra_activity_type") : null;
            serializable2 = (x0) (serializable4 instanceof x0 ? serializable4 : null);
        } else if (extras != null) {
            serializable2 = extras.getSerializable("GCM_extra_activity_type", x0.class);
        }
        serializable2.getClass();
        w1 w1Var = this.f29179a;
        ((oo.b) w1Var.getValue()).f133056f = (x0) serializable2;
        ((oo.b) w1Var.getValue()).f133065o.f(this, new b(new m2.b(this, gVar, extras.getString("GCM_extra_start_date"), extras.getLong("GCM_extra_activity_id"), extras.getBoolean("CAN_TRIATHLON_ACTIVITY_LINKED", false))));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/eventType/ActivitiesEventTypeActivity$a;", "", "<init>", "()V", "", "CAN_TRIATHLON_ACTIVITY_LINKED", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
