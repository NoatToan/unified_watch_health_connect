package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k0;
import fw.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import uu.q;
import uu.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/ConnectionBadgeDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/k0;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectionBadgeDetailsActivity extends k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f30365i = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f30368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.l<q> f30369h = KoinJavaComponent.inject$default(q.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30370a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30370a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30371a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f30371a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30371a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30371a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        fa();
    }

    public final void fa() {
        q value = this.f30369h.getValue();
        String str = this.f30367f;
        str.getClass();
        int i14 = this.f30366e;
        value.getClass();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(value), null, null, new v(y0Var, value, str, i14, null), 3);
        y0Var.f(this, new c(new uo1.a(this, 3)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.lbl_badge);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        this.f30367f = extras.getString("GCM_userDisplayName");
        int i14 = extras.getInt("GCM_extra_badge_id", -1);
        this.f30366e = i14;
        if (i14 == -1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.BADGES;
            aVar.getClass();
            i2.a.p(a2Var, "ConnectionBadgeDetailsActivity", "Invalid badge ID.");
            finish();
        }
        if (this.f30367f == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.BADGES;
            aVar2.getClass();
            i2.a.p(a2Var2, "ConnectionBadgeDetailsActivity", "Invalid display name.");
            finish();
        }
        e.f30447q.getClass();
        this.f30368g = new e();
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        e eVar = this.f30368g;
        eVar.getClass();
        aVarB.l(R.id.content_frame_layout, eVar, null);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        fa();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/ConnectionBadgeDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INVALID_BADGE_ID", "I", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, int i14, String str) {
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) ConnectionBadgeDetailsActivity.class);
            intent.putExtra("GCM_userDisplayName", str);
            intent.putExtra("GCM_extra_badge_id", i14);
            return intent;
        }

        private a() {
        }
    }
}
