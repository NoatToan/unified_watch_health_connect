package com.garmin.feature.garminpay.providers.gpay.ecom;

import a61.i;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.e;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.z0;
import ap2.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import eo2.d;
import g.h;
import gp2.g;
import hn2.c;
import java.util.concurrent.atomic.AtomicReference;
import o13.m;
import o13.p;
import o13.t;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import u53.o;
import wr2.j;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ecom/EcomMainActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcomMainActivity extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f51133k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f51134l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f51135g = m.b(new e51.c(14));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f51136h = m.b(new eo2.a(this, 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f51137i = m.b(new eo2.a(this, 1));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f51138j = registerForActivityResult(new h(), new i(this, 16));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51139a;

        public b(l lVar) {
            lVar.getClass();
            this.f51139a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51139a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51139a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51134l = gt2.b.f79005a.h("PAY#ECOM#EcomMainActivity");
    }

    public static final void ca(EcomMainActivity ecomMainActivity) {
        g1 g1Var;
        ecomMainActivity.getClass();
        Logger logger = f51134l;
        logger.debug("checkTermsAndConditions");
        zn2.z0 z0Var = (zn2.z0) ecomMainActivity.f51135g.getValue();
        if (z0Var != null && (g1Var = z0Var.f205979a) != null && g1Var.W()) {
            logger.debug("startAddCredentialFlow");
            ecomMainActivity.startActivity(FitPayAddCardActivity.a.c(FitPayAddCardActivity.f51376x, null, null, null, null, g.CREATE_CREDENTIAL, gp2.b.LOAD_PAYMENT_CARDS));
        } else {
            f.c<Intent> cVar = ecomMainActivity.f51138j;
            NewFitPayTermsAndConditionActivity.f51587j.getClass();
            cVar.a(NewFitPayTermsAndConditionActivity.a.a(ecomMainActivity, null), null);
        }
    }

    public static final void da(final EcomMainActivity ecomMainActivity) {
        ecomMainActivity.getClass();
        f51134l.debug("showSomethingWentWrongDialog");
        d.f64794a.getClass();
        if (g22.n.d(d.f64799f.get())) {
            br2.c cVar = br2.c.f19585a;
            String string = ecomMainActivity.getString(R.string.something_went_wrong);
            string.getClass();
            String string2 = ecomMainActivity.getString(R.string.epoch_try_again_msg);
            string2.getClass();
            final int i14 = 0;
            e eVarQ = br2.c.q(cVar, ecomMainActivity, string, string2, new p(ecomMainActivity.getString(R.string.ciq_purchase_prompt_return_to_connect_iq), new e23.p(ecomMainActivity) { // from class: eo2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EcomMainActivity f64789b;

                {
                    this.f64789b = ecomMainActivity;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = i14;
                    EcomMainActivity ecomMainActivity2 = this.f64789b;
                    DialogInterface dialogInterface = (DialogInterface) obj;
                    ((Integer) obj2).getClass();
                    EcomMainActivity.a aVar = EcomMainActivity.f51133k;
                    switch (i15) {
                        case 0:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            j.f186862a.getClass();
                            j.b("EcomMainActiviy.showSomethingWentWrongDialog()");
                            d.f64794a.getClass();
                            d.c(ecomMainActivity2);
                            break;
                        default:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            ecomMainActivity2.getClass();
                            d.f64794a.getClass();
                            d.a();
                            EcomMainActivity.f51134l.debug("navigateWalletWithCardRefresh");
                            i0 i0VarW = f0.w(ecomMainActivity2);
                            x53.c cVar2 = s0.f129406a;
                            ge1.b.T(i0VarW, o.f168762a, null, new c(ecomMainActivity2, null), 2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ != null) {
                eVarQ.show();
                return;
            }
            return;
        }
        br2.c cVar2 = br2.c.f19585a;
        String string3 = ecomMainActivity.getString(R.string.something_went_wrong);
        string3.getClass();
        String string4 = ecomMainActivity.getString(R.string.epoch_try_again_msg);
        string4.getClass();
        final int i15 = 1;
        e eVarQ2 = br2.c.q(cVar2, ecomMainActivity, string3, string4, new p(ecomMainActivity.getString(R.string.common_button_ok), new e23.p(ecomMainActivity) { // from class: eo2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EcomMainActivity f64789b;

            {
                this.f64789b = ecomMainActivity;
            }

            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i16 = i15;
                EcomMainActivity ecomMainActivity2 = this.f64789b;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                EcomMainActivity.a aVar = EcomMainActivity.f51133k;
                switch (i16) {
                    case 0:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        j.f186862a.getClass();
                        j.b("EcomMainActiviy.showSomethingWentWrongDialog()");
                        d.f64794a.getClass();
                        d.c(ecomMainActivity2);
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        ecomMainActivity2.getClass();
                        d.f64794a.getClass();
                        d.a();
                        EcomMainActivity.f51134l.debug("navigateWalletWithCardRefresh");
                        i0 i0VarW = f0.w(ecomMainActivity2);
                        x53.c cVar3 = s0.f129406a;
                        ge1.b.T(i0VarW, o.f168762a, null, new c(ecomMainActivity2, null), 2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ2 != null) {
            eVarQ2.show();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f51134l.debug("Initialize Deep Link Add ECOM Credential flow");
        ap2.h hVar = (ap2.h) this.f51137i.getValue();
        ap2.h.a aVar = ap2.h.f11695y;
        hVar.getClass();
        ge1.b.T(v1.a(hVar), s0.f129406a, null, new q(hVar, null, null, null, null), 2);
        R9(R.layout.activity_empty, c.a.NONE, null);
        d.f64794a.getClass();
        AtomicReference<Boolean> atomicReference = d.f64797d;
        Boolean bool = Boolean.TRUE;
        atomicReference.set(bool);
        c.ba(this, bool, null, null, 14);
        ge1.b.T(f0.w(this), null, null, new com.garmin.feature.garminpay.providers.gpay.ecom.a(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ecom/EcomMainActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
