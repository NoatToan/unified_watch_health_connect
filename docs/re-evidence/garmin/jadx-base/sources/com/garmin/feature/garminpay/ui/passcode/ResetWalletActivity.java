package com.garmin.feature.garminpay.ui.passcode;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import hn2.c;
import iz1.g;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import pr2.d;
import q6.f;
import qr2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/passcode/ResetWalletActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResetWalletActivity extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f52134l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f52135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f52136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f52137i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f52138j = new g(this, 13);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j22.e f52139k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52140a;

        public b(l lVar) {
            lVar.getClass();
            this.f52140a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f52140a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52140a.invoke(obj);
        }
    }

    public ResetWalletActivity() {
        j22.e.a aVar = j22.e.f96744g;
        d dVar = new d(this, 0);
        d dVar2 = new d(this, 1);
        aVar.getClass();
        this.f52139k = j22.e.a.a("ResetWalletActivity", dVar, dVar2, null);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        R9(R.layout.activity_reset_wallet, c.a.BACK, getString(R.string.wallet_forgot_passcode_title));
        Intent intent = getIntent();
        if (intent == null) {
            vb.h.s("No unit ID provided for passcode setup");
            return;
        }
        this.f52136h = intent.getLongExtra("device.unit.id", 0L);
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra = intent2.getStringExtra("device.name")) == null) {
            stringExtra = "";
        }
        this.f52137i = stringExtra;
        e eVar = (e) new x1(this).b(s0.f105811a.b(e.class));
        this.f52135g = eVar;
        eVar.J2(this.f52136h);
        Button button = (Button) findViewById(R.id.reset_wallet_button);
        if (button != null) {
            button.setOnClickListener(new oq.a(this, 5));
        }
        TextView textView = (TextView) findViewById(R.id.forgot_passcode_info_text_view);
        if (textView != null) {
            String string = getString(R.string.wallet_forgot_passcode_info_lbl);
            string.getClass();
            f.y(new Object[]{this.f52137i}, 1, string, textView);
        }
        e eVar2 = this.f52135g;
        if (eVar2 != null) {
            eVar2.L2().f(this, new b(new ph1.d(8, this, button)));
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/ui/passcode/ResetWalletActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "RESULT_RESET_OK", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
