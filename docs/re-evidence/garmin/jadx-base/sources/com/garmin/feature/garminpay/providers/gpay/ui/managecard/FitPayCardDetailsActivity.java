package com.garmin.feature.garminpay.providers.gpay.ui.managecard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import e23.p;
import java.util.ArrayList;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import qs2.f;
import tp2.g;
import u53.o;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/managecard/FitPayCardDetailsActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCardDetailsActivity extends hn2.c {
    public static final a F = new a(null);
    public TextView A;
    public Button B;
    public TextView C;
    public Button D;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f51673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f51675i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f51677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SwipeRefreshLayout f51678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f51679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f51680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f51681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f51682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f51683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f51684r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f51685t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RecyclerView f51686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f51687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f51688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f51689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f51690z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f51676j = new ArrayList();
    public final t E = m.b(new tk0.a(18));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51692b;

        static {
            int[] iArr = new int[op2.a.values().length];
            try {
                iArr[op2.a.CARDHOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[op2.a.ISSUER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51691a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f.PENDING_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.DEACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f51692b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/managecard/FitPayCardDetailsActivity$c", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity$refreshCreditCards$1", f = "FitPayCardDetailsActivity.kt", l = {566}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51694a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f51696c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity$refreshCreditCards$1$1", f = "FitPayCardDetailsActivity.kt", l = {567}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FitPayCardDetailsActivity f51698b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FitPayCardDetailsActivity fitPayCardDetailsActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f51698b = fitPayCardDetailsActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51698b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51697a;
                if (i14 == 0) {
                    r.b(obj);
                    g gVar = this.f51698b.f51680n;
                    if (gVar == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    this.f51697a = 1;
                    if (gVar.B4(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z14, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f51696c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FitPayCardDetailsActivity.this.new d(this.f51696c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51694a;
            FitPayCardDetailsActivity fitPayCardDetailsActivity = FitPayCardDetailsActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    x53.c cVar = s0.f129406a;
                    a aVar2 = new a(fitPayCardDetailsActivity, null);
                    this.f51694a = 1;
                    if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                hn2.c.ba(fitPayCardDetailsActivity, Boolean.FALSE, null, null, 14);
            } catch (Exception e4) {
                a aVar3 = FitPayCardDetailsActivity.F;
                fitPayCardDetailsActivity.ea().error("finishWithCancellation:", (Throwable) e4);
            }
            if (this.f51696c) {
                fitPayCardDetailsActivity.setResult(0);
                fitPayCardDetailsActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51699a;

        public e(l lVar) {
            lVar.getClass();
            this.f51699a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51699a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51699a.invoke(obj);
        }
    }

    public static final void ca(FitPayCardDetailsActivity fitPayCardDetailsActivity) {
        String string = fitPayCardDetailsActivity.getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = fitPayCardDetailsActivity.getString(R.string.verification_selection_failed);
        string2.getClass();
        String string3 = fitPayCardDetailsActivity.getString(R.string.lbl_ok);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayCardDetailsActivity, string, string2, new o13.p(string3, new td0.a((byte) 0, 26)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void da() {
        br2.c.h(br2.c.f19585a, this, new tp2.a(this, 0), null, 4);
    }

    public final Logger ea() {
        return (Logger) this.E.getValue();
    }

    public final void fa(f fVar) {
        int i14 = b.f51692b[fVar.ordinal()];
        if (i14 == 1) {
            Button button = this.B;
            if (button == null) {
                s.m("suspendUnSuspendCardButton");
                throw null;
            }
            button.setVisibility(0);
            TextView textView = this.C;
            if (textView == null) {
                s.m("bankSuspendCardSecondaryTextView");
                throw null;
            }
            textView.setVisibility(8);
            Button button2 = this.B;
            if (button2 != null) {
                button2.setText(getString(R.string.suspend_card));
                return;
            } else {
                s.m("suspendUnSuspendCardButton");
                throw null;
            }
        }
        if (i14 == 2) {
            Button button3 = this.B;
            if (button3 != null) {
                button3.setVisibility(8);
                return;
            } else {
                s.m("suspendUnSuspendCardButton");
                throw null;
            }
        }
        if (i14 != 3) {
            ea().debug("handleCardStateChange: " + fVar + " not handled");
            return;
        }
        Button button4 = this.B;
        if (button4 == null) {
            s.m("suspendUnSuspendCardButton");
            throw null;
        }
        button4.setVisibility(0);
        Button button5 = this.B;
        if (button5 == null) {
            s.m("suspendUnSuspendCardButton");
            throw null;
        }
        button5.setText(getString(R.string.unsuspend_card));
        g gVar = this.f51680n;
        if (gVar == null) {
            s.m("viewModel");
            throw null;
        }
        op2.a causedBy = gVar.y4().getCausedBy();
        int i15 = causedBy == null ? -1 : b.f51691a[causedBy.ordinal()];
        if (i15 == 1) {
            TextView textView2 = this.C;
            if (textView2 == null) {
                s.m("bankSuspendCardSecondaryTextView");
                throw null;
            }
            textView2.setVisibility(8);
            Button button6 = this.B;
            if (button6 != null) {
                button6.setEnabled(true);
                return;
            } else {
                s.m("suspendUnSuspendCardButton");
                throw null;
            }
        }
        if (i15 != 2) {
            Button button7 = this.B;
            if (button7 != null) {
                button7.setEnabled(true);
                return;
            } else {
                s.m("suspendUnSuspendCardButton");
                throw null;
            }
        }
        RecyclerView recyclerView = this.f51679m;
        if (recyclerView == null) {
            s.m("walletItemStatusRecyclerView");
            throw null;
        }
        String string = getString(R.string.your_bank_has_suspended_this_card);
        string.getClass();
        ArrayList arrayList = this.f51676j;
        arrayList.add(string);
        recyclerView.setAdapter(new up2.c(this, arrayList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setNestedScrollingEnabled(false);
        if (!arrayList.isEmpty()) {
            RecyclerView recyclerView2 = this.f51679m;
            if (recyclerView2 == null) {
                s.m("walletItemStatusRecyclerView");
                throw null;
            }
            recyclerView2.setVisibility(0);
        }
        TextView textView3 = this.C;
        if (textView3 == null) {
            s.m("bankSuspendCardSecondaryTextView");
            throw null;
        }
        textView3.setVisibility(0);
        Button button8 = this.B;
        if (button8 != null) {
            button8.setEnabled(false);
        } else {
            s.m("suspendUnSuspendCardButton");
            throw null;
        }
    }

    public final void ga(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e4) {
            ea().error("launchSystemBrowser: ", (Throwable) e4);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void ha(String str) {
        ea().debug("makeBankCall");
        try {
            if (str != null) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:".concat(str))));
            } else {
                ea().error("makeBankCall: missing issuer phone number");
            }
        } catch (Exception e4) {
            ea().error("makeBankCall ", (Throwable) e4);
        }
    }

    public final void ia(boolean z14) {
        ea().debug("Finishing activity with card refresh");
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new d(z14, null), 2);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hn2.c.a aVar = hn2.c.a.UP;
        R9(R.layout.activity_fit_pay_card_details, aVar, getString(R.string.wallet_card_detail));
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        long longExtra = getIntent().getLongExtra("device.unit.id", -1L);
        this.f51673g = Long.valueOf(longExtra);
        if (longExtra == -1) {
            ea().error("onCreate: missing device unit Id");
            da();
            return;
        }
        String stringExtra = getIntent().getStringExtra("device.name");
        this.f51674h = stringExtra;
        if (stringExtra != null) {
            W9(stringExtra, aVar);
        } else {
            ea().warn("onCreate: missing device name. will use default title for the screen");
            String string = getString(R.string.wallet_card_detail);
            string.getClass();
            W9(string, aVar);
        }
        this.f51675i = getIntent().getBooleanExtra("is.orphaned.item", false);
        String stringExtra2 = getIntent().getStringExtra("extra.credit.card.id");
        if (stringExtra2 == null) {
            ea().error("onCreate: missing credit card id");
            da();
            return;
        }
        this.f51677k = stringExtra2;
        if (getIntent().getStringExtra("extra.payment.card.id") == null) {
            ea().error("onCreate: missing payment card id");
            da();
            return;
        }
        g gVar = (g) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(g.class));
        Long l14 = this.f51673g;
        l14.getClass();
        long jLongValue = l14.longValue();
        String str = this.f51677k;
        if (str == null) {
            s.m("creditCardId");
            throw null;
        }
        ge1.b.T(v1.a(gVar), s0.f129406a, null, new tp2.h(gVar, jLongValue, str, null), 2);
        this.f51680n = gVar;
        gVar.f165960a.f(this, new iz1.g(this, 19));
        g gVar2 = this.f51680n;
        if (gVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        gVar2.f165965f.f(this, new e(new tn2.t(this, 5)));
        g gVar3 = this.f51680n;
        if (gVar3 != null) {
            gVar3.f165963d = new c();
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        if (i14 == 100) {
            if ((iArr.length == 0) || iArr[0] != 0) {
                ea().error("onRequestPermissionsResult: the user has denied call permission, can not make call");
                return;
            }
            ea().debug("onRequestPermissionsResult: call permission granted, making a call");
            g gVar = this.f51680n;
            if (gVar != null) {
                ha(gVar.y4().getIssuerContactPhone());
            } else {
                s.m("viewModel");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/managecard/FitPayCardDetailsActivity$a;", "", "<init>", "()V", "", "CALL_PHONE_PERMISSION_REQUEST_ID", "I", "", "SYSTEM_EMAIL_PART_MAIL_TO", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(long j8, String str, String str2, String str3, boolean z14) {
            str2.getClass();
            str3.getClass();
            Intent intent = new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) FitPayCardDetailsActivity.class);
            intent.putExtra("device.unit.id", j8);
            intent.putExtra("device.name", str);
            intent.putExtra("is.orphaned.item", z14);
            intent.putExtra("extra.credit.card.id", str2);
            Intent intentPutExtra = intent.putExtra("extra.payment.card.id", str3);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        private a() {
        }
    }
}
