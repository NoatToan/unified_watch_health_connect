package com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.FitPayTermsAndConditionsWebViewActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import hn2.c;
import ms2.g;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ps2.n;
import ps2.w;
import qp2.b;
import sd2.f;
import w02.b0;
import zn2.y0;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/garminpaytermsconditions/NewFitPayTermsAndConditionActivity;", "Lhn2/c;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewFitPayTermsAndConditionActivity extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51587j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f51588k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f51589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f51590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f51591i;

    static {
        int i14 = gt2.c.f79010a;
        f51588k = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayTermsAndConditionActivity");
    }

    public NewFitPayTermsAndConditionActivity() {
        g gVarA = w.f140538a.a(is2.b.FITPAY);
        this.f51591i = gVarA instanceof z0 ? (z0) gVarA : null;
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_fitpay_terms_and_conditions, c.a.BACK, getString(R.string.label_terms_and_conditions));
        this.f51590h = (b) new x1(this).b(s0.f105811a.b(b.class));
        TextView textView = (TextView) findViewById(R.id.text_fitpay_terms_and_conditions_terms);
        final b bVar = this.f51590h;
        if (bVar == null) {
            s.m("viewModel");
            throw null;
        }
        textView.getClass();
        String string = textView.getText().toString();
        final int i14 = 0;
        textView.setText(b0.z(textView, d53.w.H(string, "<link>", 0, false, 6), d53.w.H(string, "</link>", 0, false, 6) - 6, new e23.a() { // from class: qp2.a
            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                b bVar2 = bVar;
                switch (i15) {
                    case 0:
                        NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity = bVar2.f146030b;
                        if (newFitPayTermsAndConditionActivity != null) {
                            if (((l) zf.b.r()).n()) {
                                LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, newFitPayTermsAndConditionActivity, 0, lc2.a.GARMIN_PAY_TERMS_AND_CONDITIONS, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, newFitPayTermsAndConditionActivity.getString(R.string.garmin_pay_terms), 112);
                            } else {
                                Logger logger = NewFitPayTermsAndConditionActivity.f51588k;
                                if (newFitPayTermsAndConditionActivity.f51591i != null) {
                                    try {
                                        long j8 = newFitPayTermsAndConditionActivity.f51589g;
                                        z0.a aVar = z0.f205974g;
                                        y0 y0Var = new y0(j8);
                                        int i16 = w03.b.f181178a;
                                        f fVar = (f) new e13.a(y0Var).j(l13.a.f108327b).c();
                                        FitPayTermsAndConditionsWebViewActivity.f51545k.getClass();
                                        Intent intent = new Intent(newFitPayTermsAndConditionActivity, (Class<?>) FitPayTermsAndConditionsWebViewActivity.class);
                                        String string2 = newFitPayTermsAndConditionActivity.getString(R.string.wallet_terms_and_conditions_title);
                                        string2.getClass();
                                        is2.b bVar3 = is2.b.FITPAY;
                                        fVar.getClass();
                                        intent.putExtra("WebPageDataKey", new hr2.a(string2, bVar3, fVar, null, 8, null));
                                        newFitPayTermsAndConditionActivity.startActivity(intent);
                                    } catch (Exception e4) {
                                        logger.error("navigateToFitPayTermsAndConditions", (Throwable) e4);
                                    }
                                } else {
                                    logger.error("fpServiceProvider cannot be null");
                                }
                            }
                        }
                        break;
                    default:
                        NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity2 = bVar2.f146030b;
                        if (newFitPayTermsAndConditionActivity2 != null) {
                            LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, newFitPayTermsAndConditionActivity2, 0, lc2.a.GARMIN_PAY_PRIVACY_POLICY, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, newFitPayTermsAndConditionActivity2.getString(R.string.garmin_pay_privacy), 112);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        b0.v(textView);
        TextView textView2 = (TextView) findViewById(R.id.text_fitpay_terms_and_conditions_privacy);
        final b bVar2 = this.f51590h;
        if (bVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        textView2.getClass();
        String string2 = textView2.getText().toString();
        final int i15 = 1;
        textView2.setText(b0.z(textView2, d53.w.H(string2, "<link>", 0, false, 6), d53.w.H(string2, "</link>", 0, false, 6) - 6, new e23.a() { // from class: qp2.a
            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                b bVar3 = bVar2;
                switch (i16) {
                    case 0:
                        NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity = bVar3.f146030b;
                        if (newFitPayTermsAndConditionActivity != null) {
                            if (((l) zf.b.r()).n()) {
                                LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, newFitPayTermsAndConditionActivity, 0, lc2.a.GARMIN_PAY_TERMS_AND_CONDITIONS, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, newFitPayTermsAndConditionActivity.getString(R.string.garmin_pay_terms), 112);
                            } else {
                                Logger logger = NewFitPayTermsAndConditionActivity.f51588k;
                                if (newFitPayTermsAndConditionActivity.f51591i != null) {
                                    try {
                                        long j8 = newFitPayTermsAndConditionActivity.f51589g;
                                        z0.a aVar = z0.f205974g;
                                        y0 y0Var = new y0(j8);
                                        int i17 = w03.b.f181178a;
                                        f fVar = (f) new e13.a(y0Var).j(l13.a.f108327b).c();
                                        FitPayTermsAndConditionsWebViewActivity.f51545k.getClass();
                                        Intent intent = new Intent(newFitPayTermsAndConditionActivity, (Class<?>) FitPayTermsAndConditionsWebViewActivity.class);
                                        String string3 = newFitPayTermsAndConditionActivity.getString(R.string.wallet_terms_and_conditions_title);
                                        string3.getClass();
                                        is2.b bVar4 = is2.b.FITPAY;
                                        fVar.getClass();
                                        intent.putExtra("WebPageDataKey", new hr2.a(string3, bVar4, fVar, null, 8, null));
                                        newFitPayTermsAndConditionActivity.startActivity(intent);
                                    } catch (Exception e4) {
                                        logger.error("navigateToFitPayTermsAndConditions", (Throwable) e4);
                                    }
                                } else {
                                    logger.error("fpServiceProvider cannot be null");
                                }
                            }
                        }
                        break;
                    default:
                        NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity2 = bVar3.f146030b;
                        if (newFitPayTermsAndConditionActivity2 != null) {
                            LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, newFitPayTermsAndConditionActivity2, 0, lc2.a.GARMIN_PAY_PRIVACY_POLICY, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, newFitPayTermsAndConditionActivity2.getString(R.string.garmin_pay_privacy), 112);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        b0.v(textView2);
        final int i16 = 0;
        findViewById(R.id.button_fitpay_terms_and_conditions_decline).setOnClickListener(new View.OnClickListener(this) { // from class: qp2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayTermsAndConditionActivity f146035b;

            {
                this.f146035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity = this.f146035b;
                switch (i17) {
                    case 0:
                        NewFitPayTermsAndConditionActivity.a aVar = NewFitPayTermsAndConditionActivity.f51587j;
                        newFitPayTermsAndConditionActivity.setResult(0);
                        hn2.c.U9(newFitPayTermsAndConditionActivity, newFitPayTermsAndConditionActivity, null, 12);
                        newFitPayTermsAndConditionActivity.finish();
                        break;
                    default:
                        NewFitPayTermsAndConditionActivity.a aVar2 = NewFitPayTermsAndConditionActivity.f51587j;
                        hn2.c.ba(newFitPayTermsAndConditionActivity, Boolean.TRUE, null, null, 14);
                        gl.b.I(f0.w(newFitPayTermsAndConditionActivity), null, new e(newFitPayTermsAndConditionActivity, null), 3);
                        break;
                }
            }
        });
        final int i17 = 1;
        findViewById(R.id.button_fitpay_terms_and_conditions_accept).setOnClickListener(new View.OnClickListener(this) { // from class: qp2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayTermsAndConditionActivity f146035b;

            {
                this.f146035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity = this.f146035b;
                switch (i18) {
                    case 0:
                        NewFitPayTermsAndConditionActivity.a aVar = NewFitPayTermsAndConditionActivity.f51587j;
                        newFitPayTermsAndConditionActivity.setResult(0);
                        hn2.c.U9(newFitPayTermsAndConditionActivity, newFitPayTermsAndConditionActivity, null, 12);
                        newFitPayTermsAndConditionActivity.finish();
                        break;
                    default:
                        NewFitPayTermsAndConditionActivity.a aVar2 = NewFitPayTermsAndConditionActivity.f51587j;
                        hn2.c.ba(newFitPayTermsAndConditionActivity, Boolean.TRUE, null, null, 14);
                        gl.b.I(f0.w(newFitPayTermsAndConditionActivity), null, new e(newFitPayTermsAndConditionActivity, null), 3);
                        break;
                }
            }
        });
        long longExtra = getIntent().getLongExtra("device.unit.id", 0L);
        this.f51589g = longExtra;
        b bVar3 = this.f51590h;
        if (bVar3 == null) {
            s.m("viewModel");
            throw null;
        }
        w.f140538a.getClass();
        n nVarI = w.i(longExtra);
        bVar3.f146029a = nVarI;
        if (nVarI != null) {
            hs2.a aVar = nVarI.f140498a;
        }
        bVar3.f146031c.m(Boolean.valueOf((nVarI != null ? nVarI.h() : null) == hs2.b.READY));
        n nVar = bVar3.f146029a;
        if (nVar != null) {
            nVar.m(bVar3);
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        b bVar = this.f51590h;
        if (bVar != null) {
            bVar.f146030b = this;
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        b bVar = this.f51590h;
        if (bVar != null) {
            bVar.f146030b = null;
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/garminpaytermsconditions/NewFitPayTermsAndConditionActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, Long l14) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) NewFitPayTermsAndConditionActivity.class);
            intent.putExtra("device.unit.id", l14);
            return intent;
        }

        private a() {
        }
    }
}
