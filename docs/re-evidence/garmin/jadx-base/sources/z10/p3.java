package z10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.manual.ActivitiesCreateManualActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.UploadConsentActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz10/p3;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p3 extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f201204b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.w1 f201205a = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(i3.class), new d(this), new yx2.b(22), new e(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201206a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.CONSENT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_UPDATE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m0.UPLOAD_CONSENT_REVOKE_406_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_REQUIRED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_GRANTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_REVOKED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[m0.DEVICE_UPLOAD_CONSENT_UPDATE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[m0.CONSENT_ALREADY_GRANTED.ordinal()] = 12;
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
            f201206a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f201207a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f201207a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f201207a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f201207a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f201208a;

        public d(b.g gVar) {
            this.f201208a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f201208a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f201209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f201210b;

        public e(e23.a aVar, b.g gVar) {
            this.f201209a = aVar;
            this.f201210b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f201209a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f201210b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public abstract Fragment ca();

    public abstract String da();

    public String ea() {
        return getString(R.string.lbl_heading, getTitle());
    }

    public final i3 fa() {
        return (i3) this.f201205a.getValue();
    }

    public void ga() {
    }

    public final void ha() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CONSENT;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "UploadConsentEnforcementActivity", "showFeatureFragment()");
        setTitle(da());
        String strEa = ea();
        if (strEa != null) {
            setTitleContentDescription(strEa);
        }
        if (getSupportFragmentManager().G("FEATURE_FRAGMENT") != null) {
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "UploadConsentEnforcementActivity", "-resume feature fragment from back stack. BackStack count = " + getSupportFragmentManager().M());
            if (getSupportFragmentManager().M() > 0) {
                getSupportFragmentManager().Z();
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "UploadConsentEnforcementActivity", "-add new feature fragment. BackStack count = " + getSupportFragmentManager().M());
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, ca(), "FEATURE_FRAGMENT");
        aVar.e();
    }

    public boolean ia() {
        return this instanceof ActivitiesCreateManualActivity;
    }

    public boolean ja() {
        return !(this instanceof UploadConsentActivity);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (isFinishing() || getSupportFragmentManager().M() != 0) {
            return;
        }
        setTitle(da());
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, da());
        ga();
        String strEa = ea();
        if (strEa != null) {
            setTitleContentDescription(strEa);
        }
        fa().f201049b.f(this, new c(new n3(this, 0)));
        if (!ja()) {
            ha();
            return;
        }
        if (d1.f()) {
            d1.o(this, new o3(this, 0));
        } else if (ia()) {
            fa().x4(null, true, null);
        } else {
            fa().x4(null, false, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lz10/p3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FEATURE_FRAGMENT_TAG", "CONSENT_FRAGMENT_TAG", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
