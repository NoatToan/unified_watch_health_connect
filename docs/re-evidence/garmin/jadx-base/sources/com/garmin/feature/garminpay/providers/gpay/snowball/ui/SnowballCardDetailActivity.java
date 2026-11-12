package com.garmin.feature.garminpay.providers.gpay.snowball.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import e23.p;
import fo2.a0;
import fo2.l0;
import java.util.List;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import po2.h0;
import po2.m;
import po2.n;
import po2.w;
import sy2.g;
import u53.o;
import v13.i;
import vb.h;
import wr2.f;
import wr2.q;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballCardDetailActivity;", "Lhn2/c;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SnowballCardDetailActivity extends hn2.c implements com.garmin.feature.garminpay.providers.gpay.snowball.ui.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51257j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f51258k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f51260h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f51259g = f0.w(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SnowballCardDetailActivity f51261i = this;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity$navigateToAlipay$1", f = "SnowballCardDetailActivity.kt", l = {170}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51264a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f51266c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SnowballCardDetailActivity.this.new b(this.f51266c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51264a;
            SnowballCardDetailActivity snowballCardDetailActivity = SnowballCardDetailActivity.this;
            if (i14 == 0) {
                r.b(obj);
                lo2.b bVar = lo2.b.f114045a;
                SnowballCardDetailActivity snowballCardDetailActivity2 = snowballCardDetailActivity.f51261i;
                this.f51264a = 1;
                bVar.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new lo2.a(snowballCardDetailActivity2, this.f51266c, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            snowballCardDetailActivity.b().d((lo2.c) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballCardDetailActivity$c", "Lso2/a$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements so2.a.c {
        public c() {
        }

        @Override // so2.a.c
        public final void a() {
            SnowballCardDetailActivity.this.b().N();
        }

        @Override // so2.a.c
        public final void b(fo2.i iVar, CurrencyValue currencyValue) {
            iVar.getClass();
            SnowballCardDetailActivity.this.b().Z(iVar, currencyValue);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballCardDetailActivity$d", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public d() {
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51258k = gt2.b.f79005a.h("PAY#SB#CardDetailAct");
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void D6(String str) {
        f51258k.trace("showCardImage()");
        View viewFindViewById = findViewById(R.id.image_card);
        viewFindViewById.getClass();
        j.b((ImageView) viewFindViewById, str, 30, 4);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void G8() {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        so2.b.f160469b.getClass();
        aVarB.j(R.id.content_frame, new so2.b(), "ORDER_HISTORY", 1);
        aVarB.d("ORDER_HISTORY");
        aVarB.e();
    }

    @Override // vq2.c
    /* JADX INFO: renamed from: M */
    public final Activity getF52032a() {
        return this.f51261i;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void O8() {
        f51258k.trace("showHistoryNotAvailable()");
        ((TextView) findViewById(R.id.text_limit_hint)).setVisibility(8);
        ((TextView) findViewById(R.id.text_card_usage_error)).setVisibility(0);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void P3() {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        so2.a.f160454c.getClass();
        aVarB.j(R.id.content_frame, new so2.a(), "RECHARGE", 1);
        aVarB.d("RECHARGE");
        aVarB.e();
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void P4(String str, List<fo2.i> list, CurrencyValue currencyValue) {
        str.getClass();
        list.getClass();
        currencyValue.getClass();
        Fragment fragmentG = getSupportFragmentManager().G("RECHARGE");
        so2.a aVar = fragmentG instanceof so2.a ? (so2.a) fragmentG : null;
        if (aVar == null) {
            f51258k.error("rechargeFragment is null");
            return;
        }
        so2.a.d dVar = new so2.a.d(aVar, str, list, currencyValue);
        so2.a aVar2 = dVar.f160464g;
        View view2 = aVar2.getView();
        if (view2 == null) {
            dVar.e();
        } else {
            View viewFindViewById = view2.findViewById(R.id.image_card);
            viewFindViewById.getClass();
            j.b((ImageView) viewFindViewById, dVar.f160465a, 30, 4);
            TextView textView = (TextView) view2.findViewById(R.id.text_charge_amount);
            ko2.c cVar = ko2.c.f105778b;
            double dA = dVar.f160467c.getTotalCredit().a();
            cVar.getClass();
            textView.setText(ko2.c.e(dA));
            TextView textView2 = (TextView) view2.findViewById(R.id.description_balance);
            textView2.setVisibility(0);
            textView2.setText(R.string.wallet_new_balance);
            view2.findViewById(R.id.charge_instruction).setVisibility(8);
            ((TextView) view2.findViewById(R.id.charge_label)).setText(dVar.f160463f);
            ((TextView) view2.findViewById(R.id.text_balance)).setVisibility(0);
            view2.findViewById(R.id.section_activation_fee).setVisibility(8);
            ((TextView) view2.findViewById(R.id.text_promotion_amount)).setVisibility(8);
            view2.findViewById(R.id.layout_balance).setOnClickListener(new oq.a(dVar, 25));
            ((Button) view2.findViewById(R.id.button_pay)).setOnClickListener(new pm0.h(18, aVar2, dVar));
            dVar.c();
        }
        aVar.f160457b = dVar;
        aVar.u6();
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void Q4(List<h0> list) {
        list.getClass();
        f51258k.trace("showHistory()");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_transactions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new qo2.a(list));
        ((TextView) findViewById(R.id.text_limit_hint)).setVisibility(0);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void T4() {
        X9(true);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void W(String str, String str2) {
        f51258k.trace("showDeviceInfo()");
        ((TextView) findViewById(R.id.text_device_name)).setText(str);
        com.bumptech.glide.b.c(this).e(this).l(str2).E((ImageView) findViewById(R.id.image_device));
    }

    @Override // vq2.f
    public final View W0() {
        View viewFindViewById = findViewById(R.id.root);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void W6(String str) {
        f51258k.trace("showCallSupportCenterRow()");
        ((TextView) findViewById(R.id.call_support_center)).setOnClickListener(new po2.v(str, this, 0));
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void X8() {
        getSupportFragmentManager().a0(1, "ORDER_HISTORY");
    }

    @Override // sy2.e
    public final void a(n nVar) {
        n nVar2 = nVar;
        nVar2.getClass();
        this.f51260h = nVar2;
    }

    @Override // sy2.e
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public final n b() {
        n nVar = this.f51260h;
        if (nVar != null) {
            return nVar;
        }
        s.m("presenter");
        throw null;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void e1(List<a0> list) {
        RecyclerView recyclerView;
        TextView textView;
        RecyclerView recyclerView2;
        TextView textView2;
        list.getClass();
        Fragment fragmentG = getSupportFragmentManager().G("ORDER_HISTORY");
        so2.b bVar = fragmentG instanceof so2.b ? (so2.b) fragmentG : null;
        if (bVar == null) {
            f51258k.error("orderHistoryFragment is null");
            return;
        }
        if (list.isEmpty()) {
            View view2 = bVar.getView();
            if (view2 != null && (textView = (TextView) view2.findViewById(R.id.text_no_orders)) != null) {
                textView.setVisibility(0);
            }
            View view3 = bVar.getView();
            if (view3 == null || (recyclerView = (RecyclerView) view3.findViewById(R.id.recyclerview_orders)) == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        View view4 = bVar.getView();
        if (view4 != null && (textView2 = (TextView) view4.findViewById(R.id.text_no_orders)) != null) {
            textView2.setVisibility(8);
        }
        View view5 = bVar.getView();
        if (view5 == null || (recyclerView2 = (RecyclerView) view5.findViewById(R.id.recyclerview_orders)) == null) {
            return;
        }
        recyclerView2.setVisibility(0);
        recyclerView2.setAdapter(new so2.b.C3032b(list));
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void f1() {
        X9(false);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void f3(String str) {
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        gl.b.I(i0VarW, o.f168762a, new b(str, null), 2);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void g4() {
        getSupportFragmentManager().a0(1, "RECHARGE");
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    /* JADX INFO: renamed from: getScope, reason: from getter */
    public final i0 getF51259g() {
        return this.f51259g;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void h6(long j8, String str) {
        str.getClass();
        f51258k.trace("finishViewWithShiftedOutCardSnackBar()");
        wr2.e.f186838m.m(new f.d(str, j8));
        finish();
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void o3() {
        String string = getString(R.string.wallet_charging);
        string.getClass();
        W9(string, hn2.c.a.NONE);
        U5(R.string.wallet_charging_your_card);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void o9(String str, String str2) {
        str.getClass();
        f51258k.trace("showOperatorFAQRow()");
        TextView textView = (TextView) findViewById(R.id.text_faq_need);
        textView.setText(w5.r.v(R.string.wallet_visit_provider_faq, str));
        textView.setOnClickListener(new po2.v(str2, this, 1));
    }

    @Override // androidx.fragment.app.m
    public final void onAttachFragment(Fragment fragment) {
        fragment.getClass();
        if (fragment instanceof so2.a) {
            ((so2.a) fragment).f160456a = new c();
        } else if (fragment instanceof so2.b) {
            ((so2.b) fragment).f160470a = new d();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_snowball_card_detail, hn2.c.a.BACK, getString(R.string.wallet_card_detail));
        ((TextView) findViewById(R.id.text_limit_hint)).setText(getString(R.string.wallet_limited_transaction_hint, "10"));
        final int i14 = 0;
        ((Button) findViewById(R.id.recharge)).setOnClickListener(new View.OnClickListener(this) { // from class: po2.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SnowballCardDetailActivity f139388b;

            {
                this.f139388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                SnowballCardDetailActivity snowballCardDetailActivity = this.f139388b;
                switch (i15) {
                    case 0:
                        SnowballCardDetailActivity.a aVar = SnowballCardDetailActivity.f51257j;
                        snowballCardDetailActivity.b().d0();
                        break;
                    default:
                        SnowballCardDetailActivity.a aVar2 = SnowballCardDetailActivity.f51257j;
                        snowballCardDetailActivity.b().F();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((TextView) findViewById(R.id.text_order)).setOnClickListener(new View.OnClickListener(this) { // from class: po2.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SnowballCardDetailActivity f139388b;

            {
                this.f139388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                SnowballCardDetailActivity snowballCardDetailActivity = this.f139388b;
                switch (i16) {
                    case 0:
                        SnowballCardDetailActivity.a aVar = SnowballCardDetailActivity.f51257j;
                        snowballCardDetailActivity.b().d0();
                        break;
                    default:
                        SnowballCardDetailActivity.a aVar2 = SnowballCardDetailActivity.f51257j;
                        snowballCardDetailActivity.b().F();
                        break;
                }
            }
        });
        getSupportFragmentManager().b(new dv.i(this, 2));
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new g(t0Var.b(m.class), t0Var.b(n.class), t0Var.b(com.garmin.feature.garminpay.providers.gpay.snowball.ui.b.class)).a(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            getMenuInflater().inflate(R.menu.menu_snowball_card_detail, menu);
            return super.onCreateOptionsMenu(menu);
        }
        h.s("Required value was null.");
        return false;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_shift_out_card) {
            b().w();
            return true;
        }
        if (itemId != R.id.menu_item_remove_card) {
            return super.onOptionsItemSelected(menuItem);
        }
        b().Y();
        return true;
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        b().b();
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void q(String str) {
        str.getClass();
        f51258k.trace("showCurrentBalance()");
        ((TextView) findViewById(R.id.text_balance)).setText(str);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void t4(long j8, String str) {
        str.getClass();
        f51258k.trace("finishViewWithRemoveCardSnackBar()");
        wr2.e.f186838m.m(new f.b(str, j8, q.b.REMOVED_COMPLETELY, j0.f134944a));
        finish();
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void u0(LocalDate localDate) {
        f51258k.trace("showExpirationDate()");
        ((TextView) findViewById(R.id.text_expiration_date)).setText(DateTimeFormat.shortDate().print(localDate));
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void v(String str) {
        f51258k.trace("showLastSync()");
        ((TextView) findViewById(R.id.text_last_sync)).setText(str);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void w(String str) {
        f51258k.trace("showCardNumber()");
        ((TextView) findViewById(R.id.text_card_number)).setText(str);
        ((LinearLayout) findViewById(R.id.card_number_layout)).setOnLongClickListener(new b00.c(4, this, str));
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.b
    public final void z5(String str) {
        str.getClass();
        f51258k.trace("showUpgradeWebpage()");
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballCardDetailActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "MAX_TRANSACTION_COUNT", "I", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballCardDetailActivity$a$a;", "Lxy2/m;", "Lpo2/m;", "Lsd2/f;", "device", "Lfo2/l0;", "credential", "<init>", "(Lsd2/f;Lfo2/l0;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1061a extends xy2.m<m> {
            public static final Parcelable.Creator<C1061a> CREATOR = new C1062a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final sd2.f f51262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l0 f51263b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1062a implements Parcelable.Creator<C1061a> {
                @Override // android.os.Parcelable.Creator
                public final C1061a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1061a((sd2.f) parcel.readParcelable(C1061a.class.getClassLoader()), l0.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final C1061a[] newArray(int i14) {
                    return new C1061a[i14];
                }
            }

            public C1061a(sd2.f fVar, l0 l0Var) {
                fVar.getClass();
                l0Var.getClass();
                this.f51262a = fVar;
                this.f51263b = l0Var;
            }

            @Override // xy2.i
            public final Object b() {
                return new w(this.f51262a, this.f51263b);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeParcelable(this.f51262a, i14);
                this.f51263b.writeToParcel(parcel, i14);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballCardDetailActivity$a$b;", "Lxy2/n;", "Lpo2/n;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends xy2.n<n> {
            public static final Parcelable.Creator<b> CREATOR = new C1063a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1063a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return new b();
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i14) {
                    return new b[i14];
                }
            }

            @Override // xy2.i
            public final Object b() {
                return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.d();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final hn2.c getF52032a() {
        return this.f51261i;
    }
}
