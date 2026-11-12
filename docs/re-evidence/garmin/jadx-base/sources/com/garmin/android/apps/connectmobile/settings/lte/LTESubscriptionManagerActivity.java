package com.garmin.android.apps.connectmobile.settings.lte;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import e23.l;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import qi1.f;
import qi1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/LTESubscriptionManagerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LTESubscriptionManagerActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43457e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f43458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43461d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43462a;

        public b(l lVar) {
            lVar.getClass();
            this.f43462a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43462a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43462a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        f fVar = this.f43458a;
        if (fVar == null) {
            s.m("lteSubscriptionViewModel");
            throw null;
        }
        intent.putExtra("LTE_DEVICE_ACTIVATED", fVar.f144871m);
        if (this.f43461d) {
            intent.putExtra("LTE_DEVICE_ASSISTANCE_PLUS_SUPPORTED", this.f43460c);
        }
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f43459b = getIntent().getBooleanExtra("NAVIGATION_FROM_SAFETY_FEATURES", false);
        this.f43461d = getIntent().getBooleanExtra("NAVIGATION_FROM_SAFETY_WIZARD_FLOW", false);
        f fVar = (f) new x1(this, new r(longExtra, new l22.a(this))).b(s0.f105811a.b(f.class));
        this.f43458a = fVar;
        fVar.f144861c.f(this, new b(new qd0.a(this, 17)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/LTESubscriptionManagerActivity$a;", "", "<init>", "()V", "", "NAVIGATION_FROM_SAFETY_FEATURES", "Ljava/lang/String;", "NAVIGATION_FROM_SAFETY_WIZARD_FLOW", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, long j8, boolean z14, int i14) {
            if ((i14 & 4) != 0) {
                z14 = false;
            }
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) LTESubscriptionManagerActivity.class);
            intent.putExtra("GCM_deviceUnitID", j8);
            intent.putExtra("NAVIGATION_FROM_SAFETY_FEATURES", z14);
            intent.putExtra("NAVIGATION_FROM_SAFETY_WIZARD_FLOW", false);
            return intent;
        }

        private a() {
        }
    }
}
