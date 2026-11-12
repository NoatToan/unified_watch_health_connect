package com.garmin.android.apps.connectmobile.leaderboard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.h0;
import com.garmin.android.apps.connectmobile.r0;
import e23.l;
import o13.h;
import o13.m;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import pt0.f0;
import pt0.j0;
import pt0.n0;
import z10.i3;
import z10.l0;
import z10.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/LeaderboardActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LeaderboardActivity extends r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37145i = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kt0.a f37146e = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f37147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f37148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f37149h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37150a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.CONSENT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m0.CONSENT_ALREADY_GRANTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_GRANTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_GRANTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_REVOKED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_UPDATE_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_REVOKE_406_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_REVOKED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_UPDATE_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[m0.CONSENT_CHECK_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[m0.CONSENT_PARENTAL_REQUEST_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[m0.CONSENT_PARENTAL_REQUEST_NEEDED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[m0.CONSENT_PARENTAL_ALREADY_REQUESTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[m0.CONSENT_PARENTAL_REQUESTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f37150a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37151a;

        public c(l lVar) {
            lVar.getClass();
            this.f37151a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f37151a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37151a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f37152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37155d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f37152a = gVar;
            this.f37153b = qualifier;
            this.f37154c = aVar;
            this.f37155d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pt0.f0] */
        @Override // e23.a
        public final f0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f37152a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f37154c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f37153b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f37155d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<i3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f37156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37159d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f37156a = gVar;
            this.f37157b = qualifier;
            this.f37158c = aVar;
            this.f37159d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.i3] */
        @Override // e23.a
        public final i3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f37156a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f37158c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i3.class), viewModelStore, null, defaultViewModelCreationExtras, this.f37157b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f37159d, 4, null);
        }
    }

    public LeaderboardActivity() {
        o13.n nVar = o13.n.NONE;
        this.f37148g = m.a(nVar, new d(this, null, null, null));
        this.f37149h = m.a(nVar, new e(this, null, null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "CHALLENGES";
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.CHALLENGES;
    }

    @Override // android.app.Activity
    public final Intent getParentActivityIntent() {
        return this.f37146e.m(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i3 ma() {
        return (i3) this.f37149h.getValue();
    }

    public final void na() {
        if (getSupportFragmentManager().M() > 0) {
            getSupportFragmentManager().Z();
            setTitle(getString(R.string.concept_challenges));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 7 && i15 == -1) {
            h0 h0Var = this.f37147f;
            if (h0Var != null) {
                h0Var.I6();
                return;
            }
            return;
        }
        if (i14 == 7 && i15 == 701) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.social_challenge_not_available).setPositiveButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).setCancelable(true).create().show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() > 0) {
            na();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.leaderboard_3_0);
        int i14 = 1;
        initActionBar(true, R.string.concept_challenges);
        ca("CHALLENGES");
        int i15 = 0;
        if (getIntent() != null && getIntent().getIntExtra("EXTRA_VIEW_DETAIL_RESULT", 0) == 701) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.social_challenge_not_available).setPositiveButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).setCancelable(true).create().show();
        }
        ma().f201049b.f(this, new c(new kt0.b(this, i15)));
        j0 j0Var = (j0) new x1(this).b(s0.f105811a.b(j0.class));
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(j0Var);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new n0(y0Var, null), 2);
        y0Var.f(this, new c(new kt0.b(this, i14)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/LeaderboardActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context) {
            if (context != null) {
                return new Intent(context, (Class<?>) LeaderboardActivity.class);
            }
            vb.h.s("Context is null");
            return null;
        }

        private a() {
        }
    }
}
