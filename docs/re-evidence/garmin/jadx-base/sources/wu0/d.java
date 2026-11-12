package wu0;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import e23.l;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p3.c2;
import p3.p0;
import q92.x;
import q92.y;
import v92.i;
import v92.k;
import z10.a1;
import z10.d1;
import z10.d2;
import z10.e2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lwu0/d;", "", "Lz10/d2;", "consentViewModel", "Lhl/a;", "screenAccessRole", "Lwu0/d$a;", "callbacks", "<init>", "(Lz10/d2;Lhl/a;Lwu0/d$a;)V", "a", "c", "b", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f187242m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f187243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl.a f187244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f187245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f187246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f187247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f187248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f187249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f187250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.a<Unit> f187251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f187252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wu0.c f187253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wu0.c f187254l;

    public interface a {
        void H0();

        void H3();

        LiveTrackActivity S1();

        boolean V6();

        v h7();

        void hideProgressOverlay();

        LiveTrackActivity m6();

        void showProgressOverlay();

        View v0();

        void z6();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwu0/d$c;", "", "Lq92/x;", "consentTypeId", "Lq92/v;", "status", "<init>", "(Lq92/x;Lq92/v;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f187255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q92.v f187256b;

        public c(x xVar, q92.v vVar) {
            xVar.getClass();
            this.f187255a = xVar;
            this.f187256b = vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f187255a == cVar.f187255a && s.g(this.f187256b, cVar.f187256b);
        }

        public final int hashCode() {
            int iHashCode = this.f187255a.hashCode() * 31;
            q92.v vVar = this.f187256b;
            return iHashCode + (vVar == null ? 0 : vVar.hashCode());
        }

        public final String toString() {
            return "ConsentRequest(consentTypeId=" + this.f187255a + ", status=" + this.f187256b + ")";
        }
    }

    /* JADX INFO: renamed from: wu0.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C3484d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f187258b;

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
            f187257a = iArr;
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
            f187258b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f187259a;

        public e(l lVar) {
            lVar.getClass();
            this.f187259a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f187259a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187259a.invoke(obj);
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [wu0.c] */
    /* JADX WARN: Type inference failed for: r1v9, types: [wu0.c] */
    public d(d2 d2Var, hl.a aVar, a aVar2) {
        d2Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f187243a = d2Var;
        this.f187244b = aVar;
        this.f187245c = aVar2;
        this.f187246d = p0.n(null);
        this.f187247e = p0.n(Boolean.FALSE);
        this.f187248f = p0.n(Boolean.TRUE);
        this.f187252j = View.generateViewId();
        final int i14 = 0;
        this.f187253k = new z0(this) { // from class: wu0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f187241b;

            {
                this.f187241b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                x xVar;
                int i15 = i14;
                d dVar = this.f187241b;
                switch (i15) {
                    case 0:
                        d2 d2Var2 = dVar.f187243a;
                        d.a aVar3 = dVar.f187245c;
                        k kVar = (k) obj;
                        int i16 = d.f187242m;
                        kVar.getClass();
                        if (kVar instanceof k.d) {
                            aVar3.showProgressOverlay();
                            break;
                        } else if (kVar instanceof k.c) {
                            aVar3.hideProgressOverlay();
                            break;
                        } else if (kVar instanceof k.b) {
                            v92.e eVar = ((k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                aVar3.hideProgressOverlay();
                                x xVar2 = ((v92.e.a) eVar).f176355a;
                                int i17 = xVar2 == null ? -1 : d.C3484d.f187258b[xVar2.ordinal()];
                                if (i17 == 1) {
                                    aVar3.hideProgressOverlay();
                                    aVar3.H3();
                                    aVar3.z6();
                                } else if (i17 == 3) {
                                    aVar3.hideProgressOverlay();
                                    aVar3.H3();
                                    dVar.f187251i = null;
                                } else {
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.b(a2Var, "LiveTrackConsentHandler", "onConsentFetchError: skip " + xVar2);
                                }
                            } else if (!(eVar instanceof v92.e.b)) {
                                i2.a aVar5 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar5.getClass();
                                i2.a.b(a2Var2, "LiveTrackConsentHandler", "consentParentViewState: skip " + kVar);
                            } else {
                                aVar3.hideProgressOverlay();
                                aVar3.H3();
                            }
                            break;
                        } else if (!(kVar instanceof k.a)) {
                            u0.r();
                            break;
                        } else {
                            a1 a1VarD = d2Var2.f200958c.d();
                            if (a1VarD != null && (xVar = a1VarD.f200881a) != null) {
                                aVar3.showProgressOverlay();
                                ge1.b.T(v1.a(d2Var2), null, null, new e2(d2Var2, xVar, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        d.a aVar6 = dVar.f187245c;
                        i iVar = (i) obj;
                        int i18 = d.f187242m;
                        iVar.getClass();
                        if (iVar instanceof i.e) {
                            i.e eVar2 = (i.e) iVar;
                            GCMWebViewActivity.fa(aVar6.m6(), eVar2.f176402a, eVar2.f176403b);
                            break;
                        } else if (iVar instanceof i.b) {
                            d1.u(d1.f200951a, aVar6.m6(), (i.b) iVar);
                            break;
                        } else if (iVar instanceof i.a) {
                            dVar.a();
                            if (!dVar.f187249g) {
                                aVar6.z6();
                            }
                            break;
                        } else if (iVar instanceof i.c) {
                            i.c cVar = (i.c) iVar;
                            int i19 = d.C3484d.f187257a[cVar.f176399b.ordinal()];
                            if (i19 == 1) {
                                aVar6.hideProgressOverlay();
                                x xVar3 = cVar.f176398a;
                                dVar.a();
                                int i24 = d.C3484d.f187258b[xVar3.ordinal()];
                                if (i24 == 1 || i24 == 2) {
                                    dVar.f187249g = true;
                                    aVar6.H0();
                                } else if (i24 == 3) {
                                    e23.a<Unit> aVar7 = dVar.f187251i;
                                    if (aVar7 != null) {
                                        aVar7.invoke();
                                    }
                                    dVar.f187251i = null;
                                } else {
                                    i2.a aVar8 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar8.getClass();
                                    i2.a.b(a2Var3, "LiveTrackConsentHandler", "onConsentGranted: skip " + xVar3);
                                }
                            } else if (i19 != 2) {
                                u0.r();
                            } else {
                                aVar6.hideProgressOverlay();
                                aVar6.z6();
                            }
                            break;
                        } else if (!iVar.equals(i.d.f176401a)) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f187254l = new z0(this) { // from class: wu0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f187241b;

            {
                this.f187241b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                x xVar;
                int i16 = i15;
                d dVar = this.f187241b;
                switch (i16) {
                    case 0:
                        d2 d2Var2 = dVar.f187243a;
                        d.a aVar3 = dVar.f187245c;
                        k kVar = (k) obj;
                        int i17 = d.f187242m;
                        kVar.getClass();
                        if (kVar instanceof k.d) {
                            aVar3.showProgressOverlay();
                            break;
                        } else if (kVar instanceof k.c) {
                            aVar3.hideProgressOverlay();
                            break;
                        } else if (kVar instanceof k.b) {
                            v92.e eVar = ((k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                aVar3.hideProgressOverlay();
                                x xVar2 = ((v92.e.a) eVar).f176355a;
                                int i18 = xVar2 == null ? -1 : d.C3484d.f187258b[xVar2.ordinal()];
                                if (i18 == 1) {
                                    aVar3.hideProgressOverlay();
                                    aVar3.H3();
                                    aVar3.z6();
                                } else if (i18 == 3) {
                                    aVar3.hideProgressOverlay();
                                    aVar3.H3();
                                    dVar.f187251i = null;
                                } else {
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.b(a2Var, "LiveTrackConsentHandler", "onConsentFetchError: skip " + xVar2);
                                }
                            } else if (!(eVar instanceof v92.e.b)) {
                                i2.a aVar5 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar5.getClass();
                                i2.a.b(a2Var2, "LiveTrackConsentHandler", "consentParentViewState: skip " + kVar);
                            } else {
                                aVar3.hideProgressOverlay();
                                aVar3.H3();
                            }
                            break;
                        } else if (!(kVar instanceof k.a)) {
                            u0.r();
                            break;
                        } else {
                            a1 a1VarD = d2Var2.f200958c.d();
                            if (a1VarD != null && (xVar = a1VarD.f200881a) != null) {
                                aVar3.showProgressOverlay();
                                ge1.b.T(v1.a(d2Var2), null, null, new e2(d2Var2, xVar, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        d.a aVar6 = dVar.f187245c;
                        i iVar = (i) obj;
                        int i19 = d.f187242m;
                        iVar.getClass();
                        if (iVar instanceof i.e) {
                            i.e eVar2 = (i.e) iVar;
                            GCMWebViewActivity.fa(aVar6.m6(), eVar2.f176402a, eVar2.f176403b);
                            break;
                        } else if (iVar instanceof i.b) {
                            d1.u(d1.f200951a, aVar6.m6(), (i.b) iVar);
                            break;
                        } else if (iVar instanceof i.a) {
                            dVar.a();
                            if (!dVar.f187249g) {
                                aVar6.z6();
                            }
                            break;
                        } else if (iVar instanceof i.c) {
                            i.c cVar = (i.c) iVar;
                            int i110 = d.C3484d.f187257a[cVar.f176399b.ordinal()];
                            if (i110 == 1) {
                                aVar6.hideProgressOverlay();
                                x xVar3 = cVar.f176398a;
                                dVar.a();
                                int i24 = d.C3484d.f187258b[xVar3.ordinal()];
                                if (i24 == 1 || i24 == 2) {
                                    dVar.f187249g = true;
                                    aVar6.H0();
                                } else if (i24 == 3) {
                                    e23.a<Unit> aVar7 = dVar.f187251i;
                                    if (aVar7 != null) {
                                        aVar7.invoke();
                                    }
                                    dVar.f187251i = null;
                                } else {
                                    i2.a aVar8 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar8.getClass();
                                    i2.a.b(a2Var3, "LiveTrackConsentHandler", "onConsentGranted: skip " + xVar3);
                                }
                            } else if (i110 != 2) {
                                u0.r();
                            } else {
                                aVar6.hideProgressOverlay();
                                aVar6.z6();
                            }
                            break;
                        } else if (!iVar.equals(i.d.f176401a)) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final void a() {
        v vVarH7 = this.f187245c.h7();
        Fragment fragmentG = vVarH7.G("CONSENT_FRAGMENT");
        if (fragmentG != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVarH7);
            aVar.k(fragmentG);
            aVar.s(true, true);
        }
        this.f187250h = null;
        this.f187246d.setValue(null);
        this.f187251i = null;
    }

    public final void b() {
        this.f187248f.setValue(Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lwu0/d$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CONSENT_FRAGMENT_TAG", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
