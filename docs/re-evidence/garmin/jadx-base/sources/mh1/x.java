package mh1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.EcgOnboardingActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.UploadConsentActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerDsl;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.TextAnchor;
import com.mapbox.maps.plugin.annotation.ClusterOptions;
import nf0.b0;
import p005kotlin.Unit;
import z10.i3;
import z10.m0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118524b;

    public /* synthetic */ x(Object obj, int i14) {
        this.f118523a = i14;
        this.f118524b = obj;
    }

    private final Object a(Object obj) {
        ClusterOptions clusterOptions = (ClusterOptions) this.f118524b;
        SymbolLayerDsl symbolLayerDsl = (SymbolLayerDsl) obj;
        symbolLayerDsl.getClass();
        symbolLayerDsl.iconImage("cluster_icon_tag");
        symbolLayerDsl.iconAnchor(IconAnchor.CENTER);
        symbolLayerDsl.textAnchor(TextAnchor.CENTER);
        symbolLayerDsl.iconOffset(p13.x.k(Double.valueOf(0.0d), Double.valueOf(5.0d)));
        symbolLayerDsl.textSize(clusterOptions.getTextSize());
        symbolLayerDsl.textColor(clusterOptions.getTextColor());
        Expression.Companion companion = Expression.INSTANCE;
        symbolLayerDsl.textField(companion.format(new n63.w(23)));
        symbolLayerDsl.filter(companion.not(new n63.w(24)));
        return Unit.INSTANCE;
    }

    private final Object b(Object obj) {
        ne2.s sVar = (ne2.s) this.f118524b;
        CameraOptions cameraOptions = (CameraOptions) obj;
        cameraOptions.getClass();
        MapboxMap mapboxMapB0 = sVar.b0();
        if (mapboxMapB0 != null) {
            mapboxMapB0.setCamera(cameraOptions);
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj) {
        EcgOnboardingActivity ecgOnboardingActivity = (EcgOnboardingActivity) this.f118524b;
        EcgOnboardingActivity.a aVar = EcgOnboardingActivity.f34765b;
        if (((Boolean) obj).booleanValue()) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EcgOnboardingActivity", "exit ECG onboarding");
            ecgOnboardingActivity.finish();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj) {
        UploadConsentActivity uploadConsentActivity = (UploadConsentActivity) this.f118524b;
        m0 m0Var = (m0) obj;
        int i14 = UploadConsentActivity.f34772d;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ECGUploadConsent", "Consent check status: " + m0Var);
        int i15 = m0Var == null ? -1 : UploadConsentActivity.b.f34774a[m0Var.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5) {
            uploadConsentActivity.setResult(-1);
            uploadConsentActivity.finish();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj) {
        final b0 b0Var = (b0) this.f118524b;
        m0 m0Var = (m0) obj;
        int i14 = b0.f125773c;
        if (m0Var == m0.CONSENT_CHECK_ERROR) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "UploadConsentFragment", "[consentCheckState] no internet");
            final int i15 = 0;
            final int i16 = 1;
            nf0.b.a(b0Var, new e23.a() { // from class: nf0.a0
                @Override // e23.a
                public final Object invoke() {
                    int i17 = i15;
                    b0 b0Var2 = b0Var;
                    switch (i17) {
                        case 0:
                            int i18 = b0.f125773c;
                            a2 a2Var2 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var2, "UploadConsentFragment", "[consentCheckState] retry");
                            i3 i3Var = (i3) b0Var2.f125774b.getValue();
                            int i19 = i3.f201047d;
                            i3Var.x4(null, false, null);
                            break;
                        default:
                            int i24 = b0.f125773c;
                            a2 a2Var3 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "UploadConsentFragment", "[consentCheckState] exit onboarding");
                            b0Var2.u6();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new e23.a() { // from class: nf0.a0
                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    b0 b0Var2 = b0Var;
                    switch (i17) {
                        case 0:
                            int i18 = b0.f125773c;
                            a2 a2Var2 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var2, "UploadConsentFragment", "[consentCheckState] retry");
                            i3 i3Var = (i3) b0Var2.f125774b.getValue();
                            int i19 = i3.f201047d;
                            i3Var.x4(null, false, null);
                            break;
                        default:
                            int i24 = b0.f125773c;
                            a2 a2Var3 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "UploadConsentFragment", "[consentCheckState] exit onboarding");
                            b0Var2.u6();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v16 java.lang.Object, still in use, count: 2, list:
          (r5v16 java.lang.Object) from 0x0848: PHI (r5 I:??) = (r5v14 java.lang.Object), (r5v16 java.lang.Object) binds: [B:462:0x0847, B:701:0x0848] A[DONT_GENERATE, DONT_INLINE]
          (r5v16 java.lang.Object) from 0x083a: CHECK_CAST (com.garmin.android.apps.connectmobile.leaderboard.model.i0) (r5v16 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // e23.l
    public final java.lang.Object invoke(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 3458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.x.invoke(java.lang.Object):java.lang.Object");
    }
}
