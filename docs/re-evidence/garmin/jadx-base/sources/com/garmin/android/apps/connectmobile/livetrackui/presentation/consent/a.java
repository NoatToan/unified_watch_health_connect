package com.garmin.android.apps.connectmobile.livetrackui.presentation.consent;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import lc.u0;
import o13.h;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.x;
import q92.y;
import v92.i;
import v92.k;
import wu0.g;
import z10.a1;
import z10.d1;
import z10.d2;
import z10.e2;
import z10.h2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/consent/a;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f38674f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu0.a f38675a = (uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f38676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f38677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f38678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f38679e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38681b;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38680a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.DI_CONNECT_LIVETRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[x.DI_CONNECT_LIVETRACK_GROUP_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[x.DI_CONNECT_LIVETRACK_STRAVA_BEACON.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f38681b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f38682a;

        public c(l lVar) {
            lVar.getClass();
            this.f38682a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f38682a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38682a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38683a;

        public d(b.g gVar) {
            this.f38683a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38683a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f38685b;

        public e(e23.a aVar, b.g gVar) {
            this.f38684a = aVar;
            this.f38685b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38684a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38685b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new C0684a(null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [wu0.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [wu0.g] */
    public a() {
        final int i14 = 0;
        this.f38676b = new w1(s0.f105811a.b(d2.class), new d(this), new e23.a(this) { // from class: wu0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a f187263b;

            {
                this.f187263b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar = this.f187263b;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        return new h2((hl.a) aVar.f38677c.getValue());
                    case 1:
                        int i17 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        Bundle extras = aVar.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        hl.a aVar3 = (hl.a) aVar.f38677c.getValue();
                        hl.a.b bVar = aVar3 instanceof hl.a.b ? (hl.a.b) aVar3 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                }
            }
        }, new e(null, this));
        final int i15 = 1;
        this.f38677c = m.b(new e23.a(this) { // from class: wu0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a f187263b;

            {
                this.f187263b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar = this.f187263b;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        return new h2((hl.a) aVar.f38677c.getValue());
                    case 1:
                        int i18 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        Bundle extras = aVar.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        int i19 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        hl.a aVar3 = (hl.a) aVar.f38677c.getValue();
                        hl.a.b bVar = aVar3 instanceof hl.a.b ? (hl.a.b) aVar3 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                }
            }
        });
        final int i16 = 2;
        m.b(new e23.a(this) { // from class: wu0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a f187263b;

            {
                this.f187263b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar = this.f187263b;
                switch (i17) {
                    case 0:
                        int i18 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        return new h2((hl.a) aVar.f38677c.getValue());
                    case 1:
                        int i19 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        Bundle extras = aVar.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        int i110 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        hl.a aVar3 = (hl.a) aVar.f38677c.getValue();
                        hl.a.b bVar = aVar3 instanceof hl.a.b ? (hl.a.b) aVar3 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                }
            }
        });
        final int i17 = 0;
        this.f38678d = new z0(this) { // from class: wu0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a f187265b;

            {
                this.f187265b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                x xVar;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar = this.f187265b;
                switch (i18) {
                    case 0:
                        k kVar = (k) obj;
                        int i19 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        kVar.getClass();
                        if (kVar instanceof k.d) {
                            aVar.showProgressOverlay();
                            break;
                        } else if (kVar instanceof k.c) {
                            aVar.hideProgressOverlay();
                            break;
                        } else if (kVar instanceof k.b) {
                            v92.e eVar = ((k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                aVar.hideProgressOverlay();
                                x xVar2 = ((v92.e.a) eVar).f176355a;
                                int i24 = xVar2 == null ? -1 : com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.b.f38681b[xVar2.ordinal()];
                                if (i24 == 1) {
                                    aVar.hideProgressOverlay();
                                    aVar.displayFailedMessage();
                                    aVar.finish();
                                } else if (i24 == 3) {
                                    aVar.hideProgressOverlay();
                                    aVar.displayFailedMessage();
                                    aVar.onNavigateUp();
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var, "LivetrackConsentEnforcementActivity", "onConsentFetchError: skip " + xVar2);
                                }
                            } else if (!(eVar instanceof v92.e.b)) {
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar3.getClass();
                                i2.a.b(a2Var2, "LivetrackConsentEnforcementActivity", "consentParentViewState: skip " + kVar);
                            } else {
                                aVar.hideProgressOverlay();
                                aVar.displayFailedMessage();
                            }
                            break;
                        } else if (!(kVar instanceof k.a)) {
                            u0.r();
                            break;
                        } else {
                            a1 a1VarD = aVar.ca().f200958c.d();
                            if (a1VarD != null && (xVar = a1VarD.f200881a) != null) {
                                aVar.showProgressOverlay();
                                d2 d2VarCa = aVar.ca();
                                ge1.b.T(v1.a(d2VarCa), null, null, new e2(d2VarCa, xVar, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        i iVar = (i) obj;
                        int i25 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        iVar.getClass();
                        if (iVar instanceof i.e) {
                            i.e eVar2 = (i.e) iVar;
                            GCMWebViewActivity.fa(aVar, eVar2.f176402a, eVar2.f176403b);
                            break;
                        } else if (iVar instanceof i.b) {
                            d1.u(d1.f200951a, aVar, (i.b) iVar);
                            break;
                        } else if (!(iVar instanceof i.a)) {
                            if (iVar instanceof i.c) {
                                i.c cVar = (i.c) iVar;
                                int i26 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.b.f38680a[cVar.f176399b.ordinal()];
                                if (i26 == 1) {
                                    aVar.hideProgressOverlay();
                                    aVar.ea(cVar.f176398a, true);
                                } else if (i26 != 2) {
                                    u0.r();
                                } else {
                                    aVar.hideProgressOverlay();
                                    aVar.getIntent().getClass();
                                    aVar.finish();
                                }
                                break;
                            } else if (!iVar.equals(i.d.f176401a)) {
                                u0.r();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i18 = 1;
        this.f38679e = new z0(this) { // from class: wu0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a f187265b;

            {
                this.f187265b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                x xVar;
                int i19 = i18;
                com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar = this.f187265b;
                switch (i19) {
                    case 0:
                        k kVar = (k) obj;
                        int i110 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        kVar.getClass();
                        if (kVar instanceof k.d) {
                            aVar.showProgressOverlay();
                            break;
                        } else if (kVar instanceof k.c) {
                            aVar.hideProgressOverlay();
                            break;
                        } else if (kVar instanceof k.b) {
                            v92.e eVar = ((k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                aVar.hideProgressOverlay();
                                x xVar2 = ((v92.e.a) eVar).f176355a;
                                int i24 = xVar2 == null ? -1 : com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.b.f38681b[xVar2.ordinal()];
                                if (i24 == 1) {
                                    aVar.hideProgressOverlay();
                                    aVar.displayFailedMessage();
                                    aVar.finish();
                                } else if (i24 == 3) {
                                    aVar.hideProgressOverlay();
                                    aVar.displayFailedMessage();
                                    aVar.onNavigateUp();
                                } else {
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var, "LivetrackConsentEnforcementActivity", "onConsentFetchError: skip " + xVar2);
                                }
                            } else if (!(eVar instanceof v92.e.b)) {
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar3.getClass();
                                i2.a.b(a2Var2, "LivetrackConsentEnforcementActivity", "consentParentViewState: skip " + kVar);
                            } else {
                                aVar.hideProgressOverlay();
                                aVar.displayFailedMessage();
                            }
                            break;
                        } else if (!(kVar instanceof k.a)) {
                            u0.r();
                            break;
                        } else {
                            a1 a1VarD = aVar.ca().f200958c.d();
                            if (a1VarD != null && (xVar = a1VarD.f200881a) != null) {
                                aVar.showProgressOverlay();
                                d2 d2VarCa = aVar.ca();
                                ge1.b.T(v1.a(d2VarCa), null, null, new e2(d2VarCa, xVar, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        i iVar = (i) obj;
                        int i25 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                        iVar.getClass();
                        if (iVar instanceof i.e) {
                            i.e eVar2 = (i.e) iVar;
                            GCMWebViewActivity.fa(aVar, eVar2.f176402a, eVar2.f176403b);
                            break;
                        } else if (iVar instanceof i.b) {
                            d1.u(d1.f200951a, aVar, (i.b) iVar);
                            break;
                        } else if (!(iVar instanceof i.a)) {
                            if (iVar instanceof i.c) {
                                i.c cVar = (i.c) iVar;
                                int i26 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.b.f38680a[cVar.f176399b.ordinal()];
                                if (i26 == 1) {
                                    aVar.hideProgressOverlay();
                                    aVar.ea(cVar.f176398a, true);
                                } else if (i26 != 2) {
                                    u0.r();
                                } else {
                                    aVar.hideProgressOverlay();
                                    aVar.getIntent().getClass();
                                    aVar.finish();
                                }
                                break;
                            } else if (!iVar.equals(i.d.f176401a)) {
                                u0.r();
                                break;
                            }
                        }
                        break;
                }
            }
        };
    }

    public final d2 ca() {
        return (d2) this.f38676b.getValue();
    }

    public int da() {
        return R.string.title_live_track;
    }

    public final void ea(x xVar, boolean z14) {
        int i14 = b.f38681b[xVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            ga();
            return;
        }
        if (i14 == 3) {
            if (z14) {
                getSupportFragmentManager().Z();
                return;
            }
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LivetrackConsentEnforcementActivity", "onConsentGranted: skip " + xVar);
    }

    public void fa(x xVar) {
        xVar.getClass();
    }

    public void ga() {
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        View view2;
        hl.a aVar = (hl.a) this.f38677c.getValue();
        if (aVar instanceof hl.a.b) {
            super.onBackPressed();
            return;
        }
        if (!(aVar instanceof hl.a.c)) {
            u0.r();
            return;
        }
        if (getSupportFragmentManager().G("CONSENT_FRAGMENT") == null) {
            super.onBackPressed();
            return;
        }
        initActionBar(true, R.string.title_live_track);
        getSupportFragmentManager().b0();
        Fragment fragmentF = getSupportFragmentManager().F(R.id.livetrack_content_frame);
        if (fragmentF != null && (view2 = fragmentF.getView()) != null) {
            view2.setImportantForAccessibility(1);
        }
        a1 a1VarD = ca().f200958c.d();
        if (!(a1VarD instanceof a1.g)) {
            super.onBackPressed();
            return;
        }
        x xVar = ((a1.g) a1VarD).f200881a;
        if (d1.i(xVar)) {
            return;
        }
        fa(xVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.livetrack_activity);
        initActionBar(true, da());
        ca().f200958c.f(this, new c(new wu0.e(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/consent/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CONSENT_FRAGMENT_TAG", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0684a {
        public /* synthetic */ C0684a(j jVar) {
            this();
        }

        private C0684a() {
        }
    }
}
