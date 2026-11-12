package com.garmin.android.apps.connectmobile.consent;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.consent.network.GdprRevokeException406;
import e23.l;
import java.util.Date;
import kotlin.w3;
import lc.u0;
import o13.h;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p92.o;
import q92.u;
import q92.v;
import q92.x;
import q92.y;
import v92.e0;
import v92.k;
import z10.d1;
import z10.i;
import z10.j;
import z10.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/a;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends r0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f32246n = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f32248f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f32253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z10.f f32254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z10.f f32255m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32247e = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hl.a f32249g = hl.a.c.f84256b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32250h = s3.b();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32256a;

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
            f32256a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32257a;

        public c(l lVar) {
            lVar.getClass();
            this.f32257a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32257a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32257a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32261d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32258a = gVar;
            this.f32259b = qualifier;
            this.f32260c = aVar;
            this.f32261d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.j] */
        @Override // e23.a
        public final j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32258a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f32260c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32259b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32261d, 4, null);
        }
    }

    static {
        new C0524a(null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [z10.f] */
    /* JADX WARN: Type inference failed for: r0v5, types: [z10.f] */
    public a() {
        final int i14 = 0;
        this.f32254l = new z0(this) { // from class: z10.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200980b;

            {
                this.f200980b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.consent.a aVar = this.f200980b;
                switch (i15) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        int i16 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            aVar.showProgressOverlay();
                        } else if (kVar instanceof v92.k.c) {
                            aVar.hideProgressOverlay();
                        } else if (!(kVar instanceof v92.k.b)) {
                            if (!(kVar instanceof v92.k.a)) {
                                lc.u0.r();
                            } else {
                                aVar.pa().x4(aVar.getF32154o());
                            }
                            break;
                        } else {
                            v92.e eVar = ((v92.k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                aVar.hideProgressOverlay();
                                if (!aVar.f32251i) {
                                    aVar.sa();
                                } else if (!(aVar.f32253k instanceof v92.k.b)) {
                                    aVar.qa(true);
                                }
                            } else if (eVar instanceof v92.e.C3293e) {
                                aVar.hideProgressOverlay();
                                d1.w(aVar);
                            } else if (eVar instanceof v92.e.b) {
                                Exception exc = ((v92.e.b) eVar).f176358b;
                                aVar.hideProgressOverlay();
                                if (exc instanceof GdprRevokeException406) {
                                    d1.s(aVar);
                                } else if (aVar.f32251i) {
                                    aVar.qa(false);
                                } else {
                                    aVar.displayFailedMessage();
                                }
                            } else {
                                aVar.hideProgressOverlay();
                                aVar.displayFailedMessage();
                            }
                        }
                        aVar.f32253k = kVar;
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        int i17 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            v92.i.e eVar2 = (v92.i.e) iVar;
                            GCMWebViewActivity.fa(aVar, eVar2.f176402a, eVar2.f176403b);
                        } else if (iVar instanceof v92.i.b) {
                            hl.a aVar2 = aVar.f32249g;
                            if (!(aVar2 instanceof hl.a.b)) {
                                d1.f200951a.getClass();
                                d1.t(aVar, (v92.i.b) iVar, aVar2);
                            } else {
                                p92.o oVar = p92.o.f136619a;
                                q92.x f32154o = aVar.getF32154o();
                                hl.a aVar3 = aVar.f32249g;
                                aVar3.getClass();
                                s92.l lVar = new s92.l(String.valueOf(((hl.a.b) aVar3).f84252b));
                                oVar.getClass();
                                q92.v vVarO = p92.o.o(f32154o, lVar);
                                if (vVarO != null && q92.c.a(vVarO)) {
                                    ((v92.i.b) iVar).f176397c.invoke(Boolean.TRUE);
                                } else {
                                    d1 d1Var = d1.f200951a;
                                    hl.a aVar4 = aVar.f32249g;
                                    d1Var.getClass();
                                    d1.t(aVar, (v92.i.b) iVar, aVar4);
                                }
                            }
                        } else if (iVar instanceof v92.i.a) {
                            aVar.onBackPressed();
                        } else if (iVar instanceof v92.i.c) {
                            int i18 = com.garmin.android.apps.connectmobile.consent.a.b.f32256a[((v92.i.c) iVar).f176399b.ordinal()];
                            if (i18 == 1) {
                                hl.a aVar5 = aVar.f32249g;
                                if (p005kotlin.jvm.internal.s.g(aVar5, hl.a.c.f84256b)) {
                                    aVar.ta();
                                } else if (!(aVar5 instanceof hl.a.b)) {
                                    lc.u0.r();
                                } else {
                                    hl.a aVar6 = aVar.f32249g;
                                    hl.a.b bVar = aVar6 instanceof hl.a.b ? (hl.a.b) aVar6 : null;
                                    Long lValueOf = bVar != null ? Long.valueOf(bVar.f84252b) : null;
                                    if (lValueOf != null && aVar.getF32154o() == q92.x.DI_CONNECT_LIVETRACK) {
                                        aVar.showProgressOverlay();
                                        j jVarPa = aVar.pa();
                                        long jLongValue = lValueOf.longValue();
                                        jVarPa.getClass();
                                        ge1.b.T(androidx.lifecycle.v1.a(jVarPa), null, null, new n(jVarPa, jLongValue, null), 3);
                                        j jVarPa2 = aVar.pa();
                                        long jLongValue2 = lValueOf.longValue();
                                        jVarPa2.getClass();
                                        androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0(null);
                                        ge1.b.T(androidx.lifecycle.v1.a(jVarPa2), null, null, new r(y0Var, jVarPa2, jLongValue2, null), 3);
                                        y0Var.f(aVar, new com.garmin.android.apps.connectmobile.consent.a.c(new a(aVar, 0)));
                                    } else {
                                        aVar.ta();
                                    }
                                }
                            } else if (i18 != 2) {
                                lc.u0.r();
                            } else {
                                hl.a aVar7 = aVar.f32249g;
                                if (p005kotlin.jvm.internal.s.g(aVar7, hl.a.c.f84256b)) {
                                    aVar.ua();
                                } else if (!(aVar7 instanceof hl.a.b)) {
                                    lc.u0.r();
                                } else {
                                    hl.a aVar8 = aVar.f32249g;
                                    hl.a.b bVar2 = aVar8 instanceof hl.a.b ? (hl.a.b) aVar8 : null;
                                    Long lValueOf2 = bVar2 != null ? Long.valueOf(bVar2.f84252b) : null;
                                    if (lValueOf2 != null && aVar.getF32154o() == q92.x.DI_CONNECT_LIVETRACK) {
                                        f12.l.f68084a.getClass();
                                        f12.l.a.a().u0(lValueOf2.longValue(), false);
                                    }
                                    aVar.ua();
                                }
                            }
                        } else if (!iVar.equals(v92.i.d.f176401a)) {
                            lc.u0.r();
                        } else {
                            DataStorageConsentActivity.a aVar9 = DataStorageConsentActivity.f32194t;
                            hl.a aVar10 = aVar.f32249g;
                            aVar9.getClass();
                            DataStorageConsentActivity.a.b(aVar, false, false, aVar10);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f32255m = new z0(this) { // from class: z10.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200980b;

            {
                this.f200980b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.consent.a aVar = this.f200980b;
                switch (i16) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        int i17 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            aVar.showProgressOverlay();
                        } else if (kVar instanceof v92.k.c) {
                            aVar.hideProgressOverlay();
                        } else if (!(kVar instanceof v92.k.b)) {
                            if (!(kVar instanceof v92.k.a)) {
                                lc.u0.r();
                            } else {
                                aVar.pa().x4(aVar.getF32154o());
                            }
                            break;
                        } else {
                            v92.e eVar = ((v92.k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                aVar.hideProgressOverlay();
                                if (!aVar.f32251i) {
                                    aVar.sa();
                                } else if (!(aVar.f32253k instanceof v92.k.b)) {
                                    aVar.qa(true);
                                }
                            } else if (eVar instanceof v92.e.C3293e) {
                                aVar.hideProgressOverlay();
                                d1.w(aVar);
                            } else if (eVar instanceof v92.e.b) {
                                Exception exc = ((v92.e.b) eVar).f176358b;
                                aVar.hideProgressOverlay();
                                if (exc instanceof GdprRevokeException406) {
                                    d1.s(aVar);
                                } else if (aVar.f32251i) {
                                    aVar.qa(false);
                                } else {
                                    aVar.displayFailedMessage();
                                }
                            } else {
                                aVar.hideProgressOverlay();
                                aVar.displayFailedMessage();
                            }
                        }
                        aVar.f32253k = kVar;
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        int i18 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            v92.i.e eVar2 = (v92.i.e) iVar;
                            GCMWebViewActivity.fa(aVar, eVar2.f176402a, eVar2.f176403b);
                        } else if (iVar instanceof v92.i.b) {
                            hl.a aVar2 = aVar.f32249g;
                            if (!(aVar2 instanceof hl.a.b)) {
                                d1.f200951a.getClass();
                                d1.t(aVar, (v92.i.b) iVar, aVar2);
                            } else {
                                p92.o oVar = p92.o.f136619a;
                                q92.x f32154o = aVar.getF32154o();
                                hl.a aVar3 = aVar.f32249g;
                                aVar3.getClass();
                                s92.l lVar = new s92.l(String.valueOf(((hl.a.b) aVar3).f84252b));
                                oVar.getClass();
                                q92.v vVarO = p92.o.o(f32154o, lVar);
                                if (vVarO != null && q92.c.a(vVarO)) {
                                    ((v92.i.b) iVar).f176397c.invoke(Boolean.TRUE);
                                } else {
                                    d1 d1Var = d1.f200951a;
                                    hl.a aVar4 = aVar.f32249g;
                                    d1Var.getClass();
                                    d1.t(aVar, (v92.i.b) iVar, aVar4);
                                }
                            }
                        } else if (iVar instanceof v92.i.a) {
                            aVar.onBackPressed();
                        } else if (iVar instanceof v92.i.c) {
                            int i19 = com.garmin.android.apps.connectmobile.consent.a.b.f32256a[((v92.i.c) iVar).f176399b.ordinal()];
                            if (i19 == 1) {
                                hl.a aVar5 = aVar.f32249g;
                                if (p005kotlin.jvm.internal.s.g(aVar5, hl.a.c.f84256b)) {
                                    aVar.ta();
                                } else if (!(aVar5 instanceof hl.a.b)) {
                                    lc.u0.r();
                                } else {
                                    hl.a aVar6 = aVar.f32249g;
                                    hl.a.b bVar = aVar6 instanceof hl.a.b ? (hl.a.b) aVar6 : null;
                                    Long lValueOf = bVar != null ? Long.valueOf(bVar.f84252b) : null;
                                    if (lValueOf != null && aVar.getF32154o() == q92.x.DI_CONNECT_LIVETRACK) {
                                        aVar.showProgressOverlay();
                                        j jVarPa = aVar.pa();
                                        long jLongValue = lValueOf.longValue();
                                        jVarPa.getClass();
                                        ge1.b.T(androidx.lifecycle.v1.a(jVarPa), null, null, new n(jVarPa, jLongValue, null), 3);
                                        j jVarPa2 = aVar.pa();
                                        long jLongValue2 = lValueOf.longValue();
                                        jVarPa2.getClass();
                                        androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0(null);
                                        ge1.b.T(androidx.lifecycle.v1.a(jVarPa2), null, null, new r(y0Var, jVarPa2, jLongValue2, null), 3);
                                        y0Var.f(aVar, new com.garmin.android.apps.connectmobile.consent.a.c(new a(aVar, 0)));
                                    } else {
                                        aVar.ta();
                                    }
                                }
                            } else if (i19 != 2) {
                                lc.u0.r();
                            } else {
                                hl.a aVar7 = aVar.f32249g;
                                if (p005kotlin.jvm.internal.s.g(aVar7, hl.a.c.f84256b)) {
                                    aVar.ua();
                                } else if (!(aVar7 instanceof hl.a.b)) {
                                    lc.u0.r();
                                } else {
                                    hl.a aVar8 = aVar.f32249g;
                                    hl.a.b bVar2 = aVar8 instanceof hl.a.b ? (hl.a.b) aVar8 : null;
                                    Long lValueOf2 = bVar2 != null ? Long.valueOf(bVar2.f84252b) : null;
                                    if (lValueOf2 != null && aVar.getF32154o() == q92.x.DI_CONNECT_LIVETRACK) {
                                        f12.l.f68084a.getClass();
                                        f12.l.a.a().u0(lValueOf2.longValue(), false);
                                    }
                                    aVar.ua();
                                }
                            }
                        } else if (!iVar.equals(v92.i.d.f176401a)) {
                            lc.u0.r();
                        } else {
                            DataStorageConsentActivity.a aVar9 = DataStorageConsentActivity.f32194t;
                            hl.a aVar10 = aVar.f32249g;
                            aVar9.getClass();
                            DataStorageConsentActivity.a.b(aVar, false, false, aVar10);
                        }
                        break;
                }
            }
        };
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public String fa() {
        return null;
    }

    /* JADX INFO: renamed from: ma */
    public abstract x getF32154o();

    public final void na() {
        j jVarPa = pa();
        x xVarMa = getF32154o();
        hl.a aVar = this.f32249g;
        jVarPa.getClass();
        xVarMa.getClass();
        aVar.getClass();
        ge1.b.T(v1.a(jVarPa), null, null, new p(jVarPa, aVar, xVarMa, null), 3);
    }

    public e0 oa() {
        return e0.NO_ACTION;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView();
        Parcelable parcelable2 = null;
        ge1.b.T(f0.w(this), null, null, new z10.g(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new z10.h(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new i(this, null), 3);
        Intent intent = getIntent();
        intent.getClass();
        wa(intent);
        if (getIntent().getBooleanExtra("extra_show_toolbar", true)) {
            initActionBar(true);
        }
        Intent intent2 = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_extra_screen_access_role", hl.a.class) : null;
        } else {
            Parcelable parcelableExtra = intent2 != null ? intent2.getParcelableExtra("GCM_extra_screen_access_role") : null;
            if (!(parcelableExtra instanceof hl.a)) {
                parcelableExtra = null;
            }
            parcelable = (hl.a) parcelableExtra;
        }
        hl.a aVar = (hl.a) parcelable;
        if (aVar == null) {
            aVar = hl.a.c.f84256b;
        }
        aVar.getClass();
        this.f32249g = aVar;
        Intent intent3 = getIntent();
        if (i14 < 33) {
            Parcelable parcelableExtra2 = intent3 != null ? intent3.getParcelableExtra("extra_consent_status") : null;
            parcelable2 = (v) (parcelableExtra2 instanceof v ? parcelableExtra2 : null);
        } else if (intent3 != null) {
            parcelable2 = (Parcelable) intent3.getParcelableExtra("extra_consent_status", v.class);
        }
        this.f32248f = (v) parcelable2;
        if (getIntent().getBooleanExtra("extra_launched_from_graduation", false) && this.f32248f == null) {
            o oVar = o.f136619a;
            x xVarMa = getF32154o();
            oVar.getClass();
            v vVarN = o.n(xVarMa);
            if (vVarN != null && q92.c.a(vVarN)) {
                this.f32248f = new v(getF32154o(), y.OPT_IN, u.CUSTOMER, vVarN.f143786d, q92.a.COMPLETED, new Date(), null, null, 192, null);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("extra_creation_consent_flow", false);
        this.f32251i = booleanExtra;
        if (booleanExtra) {
            updateActionBarNavigation(1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final j pa() {
        return (j) this.f32247e.getValue();
    }

    public final void qa(boolean z14) {
        int i14 = this.f32252j + 1;
        this.f32252j = i14;
        if (i14 == 3) {
            d1.x(this, new z10.b(this, 0));
            return;
        }
        if (z14) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
            frameLayout.removeAllViews();
            ComposeView composeView = new ComposeView(this, null, 0, 6, null);
            composeView.setViewCompositionStrategy(w3.d.f91628b);
            composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            composeView.setContent(new z3.e(-1776019289, true, new z10.c(this, frameLayout, 0)));
            frameLayout.addView(composeView);
        }
    }

    public final void ra(boolean z14) {
        String str;
        if (z14) {
            hl.a aVar = this.f32249g;
            if (aVar instanceof hl.a.b) {
                final int i14 = 0;
                d1.n(this, new DialogInterface.OnClickListener(this) { // from class: z10.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200968b;

                    {
                        this.f200968b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        int i16 = i14;
                        com.garmin.android.apps.connectmobile.consent.a aVar2 = this.f200968b;
                        switch (i16) {
                            case 0:
                                int i17 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                                aVar2.setResult(0);
                                aVar2.finish();
                                break;
                            default:
                                int i18 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                                aVar2.setResult(0);
                                aVar2.finish();
                                break;
                        }
                    }
                });
                return;
            } else if (!s.g(aVar, hl.a.c.f84256b)) {
                u0.r();
                return;
            } else {
                final int i15 = 1;
                d1.o(this, new DialogInterface.OnClickListener(this) { // from class: z10.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200968b;

                    {
                        this.f200968b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        int i17 = i15;
                        com.garmin.android.apps.connectmobile.consent.a aVar2 = this.f200968b;
                        switch (i17) {
                            case 0:
                                int i18 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                                aVar2.setResult(0);
                                aVar2.finish();
                                break;
                            default:
                                int i19 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                                aVar2.setResult(0);
                                aVar2.finish();
                                break;
                        }
                    }
                });
                return;
            }
        }
        a2 a2Var = a2.CONSENT;
        String str2 = "startConsent() -> " + getF32154o();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BaseConsentActivity", str2);
        xa();
        boolean z15 = getF32154o() == x.DI_CONNECT_AUTO_ACTIVITY_DETECTION;
        hl.a aVar2 = this.f32249g;
        boolean zG = s.g(aVar2, hl.a.c.f84256b);
        z10.f fVar = this.f32255m;
        z10.f fVar2 = this.f32254l;
        Parcelable parcelable = null;
        if (zG) {
            o oVar = o.f136619a;
            z10.a aVar3 = new z10.a(this, 1);
            x xVarMa = getF32154o();
            v vVar = this.f32248f;
            Intent intent = getIntent();
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_consent_text") : null;
                parcelable = (s92.g) (parcelableExtra instanceof s92.g ? parcelableExtra : null);
            } else if (intent != null) {
                parcelable = (Parcelable) intent.getParcelableExtra("extra_consent_text", s92.g.class);
            }
            o.x(oVar, this, this, aVar3, fVar2, fVar, xVarMa, vVar, (s92.g) parcelable, oa(), s3.b(), z15, 64);
            return;
        }
        boolean z16 = z15;
        if (!(aVar2 instanceof hl.a.b)) {
            u0.r();
            return;
        }
        ComposeView composeView = (ComposeView) findViewById(R.id.managed_account_notice);
        hl.a aVar4 = this.f32249g;
        hl.a.b bVar = aVar4 instanceof hl.a.b ? (hl.a.b) aVar4 : null;
        if (bVar != null && (str = bVar.f84253c) != null) {
            composeView.getClass();
            composeView.setVisibility(0);
            composeView.setContent(new z3.e(-484413878, true, new f20.g(bVar, str, 7)));
        }
        o oVar2 = o.f136619a;
        x xVarMa2 = getF32154o();
        v vVar2 = this.f32248f;
        Intent intent2 = getIntent();
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("extra_consent_text") : null;
            parcelable = (s92.g) (parcelableExtra2 instanceof s92.g ? parcelableExtra2 : null);
        } else if (intent2 != null) {
            parcelable = (Parcelable) intent2.getParcelableExtra("extra_consent_text", s92.g.class);
        }
        hl.a aVar5 = this.f32249g;
        aVar5.getClass();
        o.z(oVar2, this, this, new z10.a(this, 2), fVar2, fVar, xVarMa2, new s92.l(String.valueOf(((hl.a.b) aVar5).f84252b)), vVar2, (s92.g) parcelable, z16, 128);
    }

    public abstract void sa();

    public abstract void ta();

    public abstract void ua();

    public void va(v vVar) {
    }

    public abstract void wa(Intent intent);

    public void xa() {
        String string;
        if (getIntent().getBooleanExtra("extra_show_toolbar", true)) {
            d1 d1Var = d1.f200951a;
            x xVarMa = getF32154o();
            d1Var.getClass();
            xVarMa.getClass();
            int i14 = d1.b.f200954a[xVarMa.ordinal()];
            if (i14 == 1) {
                string = getString(R.string.lbl_auto_activity_detection);
                string.getClass();
            } else if (i14 != 3) {
                switch (i14) {
                    case 5:
                        string = getString(R.string.golf_lbl_storage_processing_consent_title);
                        string.getClass();
                        break;
                    case 6:
                        string = getString(R.string.garmin_coach_channel_name);
                        string.getClass();
                        break;
                    case 7:
                        string = getString(R.string.active_intelligence);
                        string.getClass();
                        break;
                    case 8:
                        string = getString(R.string.title_live_track);
                        string.getClass();
                        break;
                    case 9:
                        string = getString(R.string.gdpr_livetrack_strava_beacon_data_privacy);
                        string.getClass();
                        break;
                    default:
                        string = getString(R.string.common_data);
                        string.getClass();
                        break;
                }
            } else {
                string = getString(R.string.title_insights);
                string.getClass();
            }
            setTitle(string);
        }
    }

    public final void ya() {
        if (!(this.f32249g instanceof hl.a.b)) {
            if (!this.f32250h || d1.a(getF32154o())) {
                ra(s.g(this.f32249g, hl.a.c.f84256b) && d1.a(getF32154o()));
                Unit unit = Unit.INSTANCE;
                return;
            }
            j jVarPa = pa();
            x xVarMa = getF32154o();
            jVarPa.getClass();
            xVarMa.getClass();
            ge1.b.T(v1.a(jVarPa), null, null, new z10.o(jVarPa, xVarMa, null), 3);
            return;
        }
        j jVarPa2 = pa();
        x xVarMa2 = getF32154o();
        hl.a aVar = this.f32249g;
        aVar.getClass();
        long j8 = ((hl.a.b) aVar).f84252b;
        jVarPa2.getClass();
        xVarMa2.getClass();
        ge1.b.T(v1.a(jVarPa2), null, null, new z10.k(j8, xVarMa2, jVarPa2, null), 3);
        j jVarPa3 = pa();
        hl.a aVar2 = this.f32249g;
        aVar2.getClass();
        long j14 = ((hl.a.b) aVar2).f84252b;
        jVarPa3.getClass();
        ge1.b.T(v1.a(jVarPa3), null, null, new z10.l(jVarPa3, j14, null), 3);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.consent.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_STATUS", "EXTRA_CONSENT_TEXT", "EXTRA_SHOW_TOOLBAR", "EXTRA_LAUNCHED_FROM_GRADUATION", "EXTRA_TOO_MANY_RETRIES", "", "CHILD_RETRY_COUNT", "I", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0524a {
        public /* synthetic */ C0524a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0524a() {
        }
    }
}
