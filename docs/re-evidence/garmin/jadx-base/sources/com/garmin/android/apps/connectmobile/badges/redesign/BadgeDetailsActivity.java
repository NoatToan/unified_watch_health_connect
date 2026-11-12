package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k0;
import fw.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import uu.q;
import uu.r;
import uu.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/BadgeDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/k0;", "Lcom/garmin/android/apps/connectmobile/social/share/b$b;", "Lcom/garmin/android/apps/connectmobile/badges/redesign/b$b;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeDetailsActivity extends k0 implements com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b, com.garmin.android.apps.connectmobile.badges.redesign.b.InterfaceC0478b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f30322l = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f30325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.redesign.b f30326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.l<q> f30328j = KoinJavaComponent.inject$default(q.class, null, null, 6, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ru.d f30329k = (ru.d) KoinJavaComponent.get$default(ru.d.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30330a;

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
            f30330a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30331a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f30331a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30331a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30331a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.badges.redesign.b.InterfaceC0478b
    public final void M1(Uri uri) {
        if (isFinishing()) {
            return;
        }
        if (uri == null) {
            displayFailedMessage();
            return;
        }
        com.garmin.android.apps.connectmobile.social.share.b.a aVar = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
        Intent intentM = this.f30329k.m(uri);
        aVar.getClass();
        com.garmin.android.apps.connectmobile.social.share.b bVarA = com.garmin.android.apps.connectmobile.social.share.b.a.a(intentM, true);
        bVarA.show(getSupportFragmentManager(), bVarA.getTag());
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        fa(true);
    }

    public final void fa(boolean z14) {
        q value = this.f30328j.getValue();
        int i14 = this.f30323e;
        value.getClass();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(value), null, null, new y(y0Var, value, i14, 6, z14, null), 3);
        y0Var.f(this, new c(new uu.b(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b
    public final void i8(ro1.e eVar, Intent intent) {
        String strY;
        eVar.getClass();
        intent.getClass();
        ActivityInfo activityInfo = eVar.f153929a;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        String string = getString(R.string.string_space_string_pattern, getString(R.string.garmin_hashtag), getString(R.string.beat_yesterday_hashtag));
        string.getClass();
        intent.putExtra("android.intent.extra.TEXT", getString(R.string.string_space_string_pattern, getString(R.string.badges_earned_badge_msg), string));
        this.f30327i = true;
        m mVar = this.f30325g;
        if (mVar == null || (strY = mVar.y()) == null) {
            return;
        }
        String str = activityInfo.packageName;
        str.getClass();
        this.f30329k.g(this, intent, str, strY);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        this.f30329k.getClass();
        if (!(i14 == 7 && i15 == -1) && (intent == null || !intent.getBooleanExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", false))) {
            return;
        }
        fa(true);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.lbl_badge);
        if (bundle != null) {
            i14 = bundle.getInt("key_badge_id", -1);
        } else {
            Bundle extras = getIntent().getExtras();
            i14 = extras != null ? extras.getInt("GCM_extra_badge_id", -1) : -1;
        }
        this.f30323e = i14;
        boolean z14 = false;
        if (bundle != null) {
            z14 = bundle.getBoolean("key_should_back_navigate", false);
        } else {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                z14 = extras2.getBoolean("GCM_extra_badge_navigation_from_activity", false);
            }
        }
        this.f30324f = z14;
        if (this.f30323e == -1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.BADGES;
            aVar.getClass();
            i2.a.p(a2Var, "BadgeDetailsActivity", "Invalid badge ID.");
            finish();
            return;
        }
        com.garmin.android.apps.connectmobile.badges.redesign.b.X.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("GCM_extra_badge_navigation_from_activity", z14);
        com.garmin.android.apps.connectmobile.badges.redesign.b bVar = new com.garmin.android.apps.connectmobile.badges.redesign.b();
        bVar.setArguments(bundle2);
        this.f30326h = bVar;
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        com.garmin.android.apps.connectmobile.badges.redesign.b bVar2 = this.f30326h;
        bVar2.getClass();
        aVarB.l(R.id.content_frame_layout, bVar2, null);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        fa(false);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f30327i) {
            q value = this.f30328j.getValue();
            int i14 = this.f30323e;
            value.getClass();
            xy2.b.K(value, new r(i14, null)).f(this, new c(new uu.b(this, 1)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("key_badge_id", this.f30323e);
        bundle.putBoolean("key_should_back_navigate", this.f30324f);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/BadgeDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INVALID_BADGE_ID", "I", "KEY_BADGE_ID", "KEY_SHOULD_BACK_NAVIGATE", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(int i14, Context context) {
            Intent intent = new Intent(context, (Class<?>) BadgeDetailsActivity.class);
            intent.putExtra("GCM_extra_badge_id", i14);
            return intent;
        }

        private a() {
        }
    }
}
