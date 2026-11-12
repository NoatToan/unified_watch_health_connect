package com.garmin.feature.garminpay.providers.gpay.snowball.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import po2.l;
import po2.s;
import u53.o;
import wr2.w;
import wr2.x;
import wr2.y;
import xy2.m;
import xy2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity;", "Lhn2/c;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/a;", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SnowballAddCardActivity extends hn2.c implements com.garmin.feature.garminpay.providers.gpay.snowball.ui.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51227j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f51228k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f51229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SnowballAddCardActivity f51230h = this;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f51231i = f0.w(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SHIFT_IN,
        PROVISION_INTRODUCTION,
        ISSUER_TERMS_AND_CONDITIONS,
        PHONE_NUMBER,
        INITIAL_CHARGE,
        DOWNLOADING_CARD,
        RAPID_PASS_SETUP
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity$navigateToAliPay$1", f = "SnowballAddCardActivity.kt", l = {193}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51242a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f51244c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SnowballAddCardActivity.this.new c(this.f51244c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51242a;
            SnowballAddCardActivity snowballAddCardActivity = SnowballAddCardActivity.this;
            if (i14 == 0) {
                r.b(obj);
                lo2.b bVar = lo2.b.f114045a;
                SnowballAddCardActivity snowballAddCardActivity2 = snowballAddCardActivity.f51230h;
                this.f51242a = 1;
                bVar.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new lo2.a(snowballAddCardActivity2, this.f51244c, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            snowballAddCardActivity.b().d((lo2.c) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$d", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public d() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$e", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {
        public e() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$f", "Lso2/a$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements so2.a.c {
        public f() {
        }

        @Override // so2.a.c
        public final void a() {
            SnowballAddCardActivity.this.b().f();
        }

        @Override // so2.a.c
        public final void b(fo2.i iVar, CurrencyValue currencyValue) {
            iVar.getClass();
            SnowballAddCardActivity.this.b().s(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$g", "Lbr2/i$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements br2.i.b {
        public g() {
        }

        @Override // br2.i.b
        public final void a() {
            SnowballAddCardActivity.this.b().a();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$h", "Lbr2/j$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements br2.j.b {
        public h() {
        }

        @Override // br2.j.b
        public final void a() {
            SnowballAddCardActivity.this.b().H();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$i", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i {
        public i() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$j", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j {
        public j() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity$setupInitialChargeViews$1", f = "SnowballAddCardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f51253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<fo2.i> f51255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ fo2.i f51256e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, List<fo2.i> list, fo2.i iVar, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f51253b = str;
            this.f51254c = str2;
            this.f51255d = list;
            this.f51256e = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SnowballAddCardActivity.this.new k(this.f51253b, this.f51254c, this.f51255d, this.f51256e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Fragment fragmentG = SnowballAddCardActivity.this.getSupportFragmentManager().G("INITIAL_CHARGE");
            so2.a aVar2 = fragmentG instanceof so2.a ? (so2.a) fragmentG : null;
            if (aVar2 != null) {
                String str = this.f51253b;
                str.getClass();
                String str2 = this.f51254c;
                str2.getClass();
                List<fo2.i> list = this.f51255d;
                list.getClass();
                fo2.i iVar = this.f51256e;
                iVar.getClass();
                so2.a.b bVar = new so2.a.b(aVar2, str, str2, list, iVar);
                so2.a aVar3 = bVar.f160461h;
                View view2 = aVar3.getView();
                if (view2 == null) {
                    bVar.e();
                } else {
                    View viewFindViewById = view2.findViewById(R.id.image_card);
                    viewFindViewById.getClass();
                    yr2.j.b((ImageView) viewFindViewById, bVar.f160465a, 30, 4);
                    TextView textView = (TextView) view2.findViewById(R.id.text_charge_amount);
                    ko2.c cVar = ko2.c.f105778b;
                    double dA = bVar.f160467c.getTotalCredit().a();
                    cVar.getClass();
                    textView.setText(ko2.c.e(dA));
                    ((TextView) view2.findViewById(R.id.description_balance)).setVisibility(8);
                    TextView textView2 = (TextView) view2.findViewById(R.id.charge_instruction);
                    Iterator<T> it = bVar.f160466b.iterator();
                    if (!it.hasNext()) {
                        t.g();
                        return null;
                    }
                    double dA2 = ((fo2.i) it.next()).getTotalCredit().a();
                    while (it.hasNext()) {
                        dA2 = Math.min(dA2, ((fo2.i) it.next()).getTotalCredit().a());
                    }
                    ko2.c.f105778b.getClass();
                    textView2.setText(aVar3.getString(R.string.wallet_activate_card_hint, ko2.c.f(dA2), aVar3.getString(R.string.wallet_currency_cny), bVar.f160458e));
                    textView2.setVisibility(0);
                    ((TextView) view2.findViewById(R.id.charge_label)).setText(bVar.f160460g);
                    ((TextView) view2.findViewById(R.id.text_balance)).setVisibility(8);
                    ((TextView) view2.findViewById(R.id.activation_fee)).setText(ko2.c.e(bVar.f160459f.getTotalCost().a()));
                    view2.findViewById(R.id.layout_balance).setOnClickListener(new oq.a(bVar, 24));
                    ((Button) view2.findViewById(R.id.button_pay)).setOnClickListener(new pm0.h(17, aVar3, bVar));
                    ((TextView) view2.findViewById(R.id.text_balance)).setVisibility(8);
                    bVar.c();
                }
                aVar2.f160457b = bVar;
                aVar2.u6();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51228k = gt2.b.f79005a.h("SnowballAddCardActivity");
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void B6(String str, String str2) {
        str.getClass();
        str2.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        br2.j.a aVar = br2.j.f19631f;
        wr2.v.C0.getClass();
        w wVar = new w(str2, 30);
        y yVar = new y(new o60.b(str, 7));
        x xVar = new x(R.string.wallet_change_rapid_pass_hint);
        wr2.v.a.C3480a c3480a = wr2.v.a.C3480a.f186890a;
        aVar.getClass();
        c3480a.getClass();
        da(supportFragmentManager, new br2.j(wVar, yVar, xVar, c3480a), b.RAPID_PASS_SETUP);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void J2(String str, List<s> list) {
        str.getClass();
        list.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        so2.f.f160487b.getClass();
        so2.f fVar = new so2.f();
        Bundle bundleD = b71.i.d("extra.card_name", str);
        bundleD.putParcelableArrayList("extra.cards_to_shift_in", new ArrayList<>(list));
        fVar.setArguments(bundleD);
        da(supportFragmentManager, fVar, b.SHIFT_IN);
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final hn2.c getF52032a() {
        return this.f51230h;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void M5() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        so2.a.f160454c.getClass();
        da(supportFragmentManager, new so2.a(), b.INITIAL_CHARGE);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void N2(String str) {
        str.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        br2.l.f19640b.getClass();
        br2.l lVar = new br2.l();
        Bundle bundle = new Bundle();
        bundle.putString("extra.terms_and_conditions_text", str);
        lVar.setArguments(bundle);
        da(supportFragmentManager, lVar, b.ISSUER_TERMS_AND_CONDITIONS);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void P2(String str) {
        str.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        so2.c.f160478d.getClass();
        so2.c cVar = new so2.c();
        Bundle bundle = new Bundle();
        bundle.putString("extra.card_name", str);
        cVar.setArguments(bundle);
        da(supportFragmentManager, cVar, b.PHONE_NUMBER);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void W7(String str, String str2, List<fo2.i> list, fo2.i iVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        iVar.getClass();
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        gl.b.I(i0VarW, o.f168762a, new k(str, str2, list, iVar, null), 2);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void X2(String str) {
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        gl.b.I(i0VarW, o.f168762a, new c(str, null), 2);
    }

    @Override // sy2.e
    public final void a(l lVar) {
        l lVar2 = lVar;
        lVar2.getClass();
        this.f51229g = lVar2;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void a7(String str, String str2, fo2.x xVar, double d14, int i14) {
        str.getClass();
        str2.getClass();
        xVar.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        so2.e.f160484b.getClass();
        so2.e eVar = new so2.e();
        Bundle bundleD = tn.k.d("extra.card_name", str, "extra.card_image_url", str2);
        bundleD.putSerializable("extra.payment_channel", xVar);
        bundleD.putDouble("extra.charge_at_least", d14);
        bundleD.putInt("extra.age_before_deletable_days", i14);
        eVar.setArguments(bundleD);
        da(supportFragmentManager, eVar, b.PROVISION_INTRODUCTION);
    }

    @Override // z6.e, vn2.y0
    public final void c() {
        hn2.c.U9(this, this, null, 12);
        finish();
    }

    @Override // sy2.e
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public final l b() {
        l lVar = this.f51229g;
        if (lVar != null) {
            return lVar;
        }
        p005kotlin.jvm.internal.s.m("presenter");
        throw null;
    }

    public final void da(v vVar, Fragment fragment, b bVar) {
        i0 i0VarW = f0.w(this);
        ge1.b.T(i0VarW, null, null, new e0(i0VarW, new com.garmin.feature.garminpay.providers.gpay.snowball.ui.c(vVar, fragment, bVar, null), null), 3);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    /* JADX INFO: renamed from: getScope, reason: from getter */
    public final i0 getF51231i() {
        return this.f51231i;
    }

    @Override // androidx.fragment.app.m
    public final void onAttachFragment(Fragment fragment) {
        fragment.getClass();
        if (fragment instanceof so2.e) {
            ((so2.e) fragment).f160486a = new d();
            return;
        }
        if (fragment instanceof br2.l) {
            ((br2.l) fragment).f19642a = new e();
            return;
        }
        if (fragment instanceof so2.a) {
            ((so2.a) fragment).f160456a = new f();
            return;
        }
        if (fragment instanceof br2.i) {
            ((br2.i) fragment).f19625a = new g();
            return;
        }
        if (fragment instanceof br2.j) {
            ((br2.j) fragment).f19637e = new h();
        } else if (fragment instanceof so2.f) {
            ((so2.f) fragment).f160489a = new i();
        } else if (fragment instanceof so2.c) {
            ((so2.c) fragment).f160480a = new j();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_simple_frame_layout, hn2.c.a.BACK, "");
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new sy2.g(t0Var.b(po2.k.class), t0Var.b(l.class), t0Var.b(com.garmin.feature.garminpay.providers.gpay.snowball.ui.a.class)).a(this);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void r3() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        br2.i.a aVar = br2.i.f19623g;
        hn2.c.a aVar2 = hn2.c.a.NONE;
        aVar.getClass();
        da(supportFragmentManager, br2.i.a.a(R.string.wallet_downloading_card, aVar2, R.string.wallet_syncing_your_wallet), b.DOWNLOADING_CARD);
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.snowball.ui.a
    public final void s(int i14) {
        Fragment fragmentG = getSupportFragmentManager().G("DOWNLOADING_CARD");
        br2.i iVar = null;
        if (fragmentG != null && (fragmentG instanceof br2.i)) {
            iVar = (br2.i) fragmentG;
        }
        if (iVar == null) {
            f51228k.error("Failed to get downloadCardFragment");
        } else {
            iVar.v6(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$a$a;", "Lxy2/m;", "Lpo2/k;", "Lsd2/f;", "deviceDatabaseRecord", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "product", "<init>", "(Lsd2/f;Lcom/garmin/feature/garminpay/providers/gpay/model/Product;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1058a extends m<po2.k> {
            public static final Parcelable.Creator<C1058a> CREATOR = new C1059a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final sd2.f f51232a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Product f51233b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1059a implements Parcelable.Creator<C1058a> {
                @Override // android.os.Parcelable.Creator
                public final C1058a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1058a((sd2.f) parcel.readParcelable(C1058a.class.getClassLoader()), Product.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final C1058a[] newArray(int i14) {
                    return new C1058a[i14];
                }
            }

            public C1058a(sd2.f fVar, Product product) {
                fVar.getClass();
                product.getClass();
                this.f51232a = fVar;
                this.f51233b = product;
            }

            @Override // xy2.i
            public final Object b() {
                return new po2.p(this.f51232a, this.f51233b);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeParcelable(this.f51232a, i14);
                this.f51233b.writeToParcel(parcel, i14);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/SnowballAddCardActivity$a$b;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<l> {
            public static final Parcelable.Creator<b> CREATOR = new C1060a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1060a implements Parcelable.Creator<b> {
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
                return new po2.r();
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
}
