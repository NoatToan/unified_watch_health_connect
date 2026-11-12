package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import e23.l;
import fw.p;
import lc.u0;
import o13.h;
import o13.m;
import o13.t;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p92.o;
import q92.v;
import q92.x;
import q92.y;
import s92.g;
import z10.d1;
import z10.r2;
import z10.t2;
import z10.w2;
import z10.x2;
import z10.y2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ProductImprovementConsentActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProductImprovementConsentActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32230h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f32231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f32232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f32233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f32234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f32235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f32237g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32238a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32238a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32239a;

        public c(l lVar) {
            lVar.getClass();
            this.f32239a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32239a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32239a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f32240a;

        public d(b.g gVar) {
            this.f32240a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32240a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f32242b;

        public e(e23.a aVar, b.g gVar) {
            this.f32241a = aVar;
            this.f32242b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32241a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32242b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ProductImprovementConsentActivity() {
        final int i14 = 0;
        this.f32236f = m.b(new e23.a(this) { // from class: z10.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductImprovementConsentActivity f201246b;

            {
                this.f201246b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                ProductImprovementConsentActivity productImprovementConsentActivity = this.f201246b;
                switch (i15) {
                    case 0:
                        ProductImprovementConsentActivity.a aVar = ProductImprovementConsentActivity.f32230h;
                        Bundle extras = productImprovementConsentActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        ProductImprovementConsentActivity.a aVar3 = ProductImprovementConsentActivity.f32230h;
                        return new com.garmin.android.apps.connectmobile.consent.f.a(productImprovementConsentActivity.ca());
                }
            }
        });
        final int i15 = 1;
        this.f32237g = new w1(s0.f105811a.b(f.class), new d(this), new e23.a(this) { // from class: z10.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductImprovementConsentActivity f201246b;

            {
                this.f201246b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                ProductImprovementConsentActivity productImprovementConsentActivity = this.f201246b;
                switch (i16) {
                    case 0:
                        ProductImprovementConsentActivity.a aVar = ProductImprovementConsentActivity.f32230h;
                        Bundle extras = productImprovementConsentActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        ProductImprovementConsentActivity.a aVar3 = ProductImprovementConsentActivity.f32230h;
                        return new com.garmin.android.apps.connectmobile.consent.f.a(productImprovementConsentActivity.ca());
                }
            }
        }, new e(null, this));
    }

    public final hl.a ca() {
        return (hl.a) this.f32236f.getValue();
    }

    public final void da(y yVar) {
        g gVar = this.f32231a;
        if (gVar != null) {
            f fVar = (f) this.f32237g.getValue();
            yVar.getClass();
            y0 y0Var = new y0();
            ge1.b.T(v1.a(fVar), null, null, new y2(y0Var, yVar, fVar, gVar, null), 3);
            y0Var.f(this, new c(new r2(this, 0)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final boolean ea() {
        hl.a aVarCa;
        v vVarD;
        if (getIntent().getBooleanExtra("extra_launched_from_graduation", false)) {
            o oVar = o.f136619a;
            x xVar = x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
            oVar.getClass();
            v vVarN = o.n(xVar);
            if (vVarN == null || !q92.c.a(vVarN)) {
                aVarCa = ca();
                if (aVarCa instanceof hl.a.b) {
                    if (s.g(aVarCa, hl.a.c.f84256b)) {
                        return d1.i(x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE);
                    }
                    u0.r();
                    return false;
                }
                x xVar2 = x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
                hl.a aVarCa2 = ca();
                aVarCa2.getClass();
                String strValueOf = String.valueOf(((hl.a.b) aVarCa2).f84252b);
                d1 d1Var = d1.f200951a;
                xVar2.getClass();
                strValueOf.getClass();
                o oVar2 = o.f136619a;
                s92.l lVar = new s92.l(strValueOf);
                oVar2.getClass();
                vVarD = o.m().d(xVar2, lVar);
                if (vVarD == null && !vVarD.b()) {
                    return false;
                }
            }
        } else {
            aVarCa = ca();
            if (aVarCa instanceof hl.a.b) {
                if (s.g(aVarCa, hl.a.c.f84256b)) {
                    return d1.i(x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE);
                }
                u0.r();
                return false;
            }
            x xVar3 = x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
            hl.a aVarCa3 = ca();
            aVarCa3.getClass();
            String strValueOf2 = String.valueOf(((hl.a.b) aVarCa3).f84252b);
            d1 d1Var2 = d1.f200951a;
            xVar3.getClass();
            strValueOf2.getClass();
            o oVar3 = o.f136619a;
            s92.l lVar2 = new s92.l(strValueOf2);
            oVar3.getClass();
            vVarD = o.m().d(xVar3, lVar2);
            if (vVarD == null) {
            }
        }
        return true;
    }

    public final void fa() {
        f fVar = (f) this.f32237g.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(fVar), null, null, new x2(y0Var, fVar, null), 3);
        y0Var.f(this, new c(new r2(this, 1)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f32231a != null) {
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f32232b;
            if (gCMComplexOneLineButton == null) {
                s.m("consentToggle");
                throw null;
            }
            if (gCMComplexOneLineButton.f47771k.isChecked() != ea()) {
                GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f32232b;
                if (gCMComplexOneLineButton2 != null) {
                    da(gCMComplexOneLineButton2.f47771k.isChecked() ? y.OPT_IN : y.OPT_OUT);
                    return;
                } else {
                    s.m("consentToggle");
                    throw null;
                }
            }
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.consent_product_improvement);
        initActionBar(true, R.string.gdpr_product_improvement);
        ge1.b.T(f0.w(this), null, null, new t2(this, null), 3);
        boolean booleanExtra = getIntent().getBooleanExtra("extra_creation_consent_flow", false);
        if (!(ca() instanceof hl.a.b) || booleanExtra) {
            fa();
        } else {
            showProgressOverlay();
            f fVar = (f) this.f32237g.getValue();
            hl.a aVarCa = ca();
            aVarCa.getClass();
            ge1.b.T(v1.a(fVar), null, null, new w2(((hl.a.b) aVarCa).f84252b, fVar, null), 3);
        }
        ComposeView composeView = (ComposeView) findViewById(R.id.managed_account_notice);
        hl.a aVarCa2 = ca();
        hl.a.b bVar = aVarCa2 instanceof hl.a.b ? (hl.a.b) aVarCa2 : null;
        if (bVar != null && (str = bVar.f84253c) != null) {
            composeView.getClass();
            composeView.setVisibility(0);
            composeView.setContent(new z3.e(-230331036, true, new f20.g(bVar, str, 8)));
        }
        View viewFindViewById = findViewById(R.id.btn_product_improvement);
        viewFindViewById.getClass();
        this.f32232b = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.consent_body);
        viewFindViewById2.getClass();
        this.f32233c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.consent_terms_policy);
        viewFindViewById3.getClass();
        this.f32234d = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.button_next);
        viewFindViewById4.getClass();
        this.f32235e = (Button) viewFindViewById4;
        if (booleanExtra) {
            updateActionBarNavigation(1);
            Button button = this.f32235e;
            if (button == null) {
                s.m("continueButton");
                throw null;
            }
            button.setVisibility(0);
            Button button2 = this.f32235e;
            if (button2 == null) {
                s.m("continueButton");
                throw null;
            }
            button2.setOnClickListener(new xp0.d(this, 18));
        }
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildConsent_productImprovement");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ProductImprovementConsentActivity$a;", "", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, hl.a aVar2, int i14) {
            if ((i14 & 2) != 0) {
                aVar2 = hl.a.c.f84256b;
            }
            aVar.getClass();
            context.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) ProductImprovementConsentActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            intent.putExtra("extra_creation_consent_flow", false);
            return intent;
        }

        private a() {
        }
    }
}
