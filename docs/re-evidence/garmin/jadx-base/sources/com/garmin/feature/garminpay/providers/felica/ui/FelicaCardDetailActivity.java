package com.garmin.feature.garminpay.providers.felica.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.common.base.Optional;
import g.h;
import hn2.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.w;
import p13.y;
import sy2.g;
import vn2.a1;
import vn2.b0;
import vn2.z0;
import w5.r;
import wr2.e;
import wr2.f;
import wr2.q;
import xy2.m;
import xy2.n;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaCardDetailActivity;", "Lhn2/c;", "Lcom/garmin/feature/garminpay/providers/felica/ui/b;", "<init>", "()V", "Landroid/view/View;", "view", "", "onTopUpClicked", "(Landroid/view/View;)V", "onCardInformationClicked", "onCallServiceCenterClicked", "onVisitHowToUseSuicaClicked", "onVisitSuicaFAQsClicked", "onTermsAndConditionsClicked", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FelicaCardDetailActivity extends c implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f50960l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f50961m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FelicaCardDetailActivity f50962g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a1 f50963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<Intent> f50964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f50965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f50966k;

    static {
        int i14 = gt2.c.f79010a;
        f50961m = gt2.b.f79005a.h("PAY#FN#FelicaCardDetailActivity");
    }

    public FelicaCardDetailActivity() {
        final int i14 = 0;
        this.f50964i = registerForActivityResult(new h(), new f.b(this) { // from class: vn2.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaCardDetailActivity f178915b;

            {
                this.f178915b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                FelicaCardDetailActivity felicaCardDetailActivity = this.f178915b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        FelicaCardDetailActivity.a aVar2 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger = FelicaCardDetailActivity.f50961m;
                        int i16 = aVar.f67585a;
                        u62.z.i("topUpActivityLauncher: resultCode=", i16, logger);
                        if (i16 == -2) {
                            felicaCardDetailActivity.finish();
                            break;
                        } else if (i16 == -1) {
                            Intent intent = aVar.f67586b;
                            if (intent == null) {
                                logger.debug("topUpActivityLauncher: data is null");
                            } else {
                                felicaCardDetailActivity.b().W(intent);
                            }
                            break;
                        }
                        break;
                    case 1:
                        FelicaCardDetailActivity.a aVar3 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger2 = FelicaCardDetailActivity.f50961m;
                        int i17 = aVar.f67585a;
                        u62.z.i("setPasscodeActivityLauncher: resultCode=", i17, logger2);
                        if (i17 == -1 || i17 == 11) {
                            felicaCardDetailActivity.b().P();
                        } else {
                            felicaCardDetailActivity.finish();
                        }
                        break;
                    default:
                        FelicaCardDetailActivity.a aVar4 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger3 = FelicaCardDetailActivity.f50961m;
                        int i18 = aVar.f67585a;
                        u62.z.i("updateUserInfoActivityLauncher: resultCode=", i18, logger3);
                        if (i18 == -2) {
                            felicaCardDetailActivity.finish();
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f50965j = registerForActivityResult(new h(), new f.b(this) { // from class: vn2.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaCardDetailActivity f178915b;

            {
                this.f178915b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                FelicaCardDetailActivity felicaCardDetailActivity = this.f178915b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        FelicaCardDetailActivity.a aVar2 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger = FelicaCardDetailActivity.f50961m;
                        int i17 = aVar.f67585a;
                        u62.z.i("topUpActivityLauncher: resultCode=", i17, logger);
                        if (i17 == -2) {
                            felicaCardDetailActivity.finish();
                            break;
                        } else if (i17 == -1) {
                            Intent intent = aVar.f67586b;
                            if (intent == null) {
                                logger.debug("topUpActivityLauncher: data is null");
                            } else {
                                felicaCardDetailActivity.b().W(intent);
                            }
                            break;
                        }
                        break;
                    case 1:
                        FelicaCardDetailActivity.a aVar3 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger2 = FelicaCardDetailActivity.f50961m;
                        int i18 = aVar.f67585a;
                        u62.z.i("setPasscodeActivityLauncher: resultCode=", i18, logger2);
                        if (i18 == -1 || i18 == 11) {
                            felicaCardDetailActivity.b().P();
                        } else {
                            felicaCardDetailActivity.finish();
                        }
                        break;
                    default:
                        FelicaCardDetailActivity.a aVar4 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger3 = FelicaCardDetailActivity.f50961m;
                        int i19 = aVar.f67585a;
                        u62.z.i("updateUserInfoActivityLauncher: resultCode=", i19, logger3);
                        if (i19 == -2) {
                            felicaCardDetailActivity.finish();
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f50966k = registerForActivityResult(new h(), new f.b(this) { // from class: vn2.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaCardDetailActivity f178915b;

            {
                this.f178915b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                FelicaCardDetailActivity felicaCardDetailActivity = this.f178915b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        FelicaCardDetailActivity.a aVar2 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger = FelicaCardDetailActivity.f50961m;
                        int i18 = aVar.f67585a;
                        u62.z.i("topUpActivityLauncher: resultCode=", i18, logger);
                        if (i18 == -2) {
                            felicaCardDetailActivity.finish();
                            break;
                        } else if (i18 == -1) {
                            Intent intent = aVar.f67586b;
                            if (intent == null) {
                                logger.debug("topUpActivityLauncher: data is null");
                            } else {
                                felicaCardDetailActivity.b().W(intent);
                            }
                            break;
                        }
                        break;
                    case 1:
                        FelicaCardDetailActivity.a aVar3 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger2 = FelicaCardDetailActivity.f50961m;
                        int i19 = aVar.f67585a;
                        u62.z.i("setPasscodeActivityLauncher: resultCode=", i19, logger2);
                        if (i19 == -1 || i19 == 11) {
                            felicaCardDetailActivity.b().P();
                        } else {
                            felicaCardDetailActivity.finish();
                        }
                        break;
                    default:
                        FelicaCardDetailActivity.a aVar4 = FelicaCardDetailActivity.f50960l;
                        aVar.getClass();
                        Logger logger3 = FelicaCardDetailActivity.f50961m;
                        int i110 = aVar.f67585a;
                        u62.z.i("updateUserInfoActivityLauncher: resultCode=", i110, logger3);
                        if (i110 == -2) {
                            felicaCardDetailActivity.finish();
                        }
                        break;
                }
            }
        });
    }

    @Override // vq2.c
    /* JADX INFO: renamed from: M */
    public final Activity getF52032a() {
        return this.f50962g;
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void T8(String str) {
        f50961m.trace("openBrowser()");
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void V7(q.b bVar, long j8, List list) {
        bVar.getClass();
        f50961m.trace("finishViewWithRemoveCardSnackBar()");
        e eVar = e.f186838m;
        String string = getString(R.string.operator_suica);
        string.getClass();
        eVar.m(new f.b(string, j8, bVar, list));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void V8() {
        f50961m.trace("showHistoryInMaintenance()");
        String string = getString(R.string.wallet_message_urgent_maintenance_notice);
        string.getClass();
        ((RecyclerView) findViewById(R.id.transactions)).setAdapter(new com.garmin.feature.garminpay.providers.felica.ui.a(this, w.c(new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.b(string, null, 2, 0 == true ? 1 : 0))));
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void W(String str, String str2) {
        str.getClass();
        str2.getClass();
        f50961m.trace("showDeviceInfo()");
        ((TextView) findViewById(R.id.device_name)).setText(str);
        com.bumptech.glide.b.c(this).e(this).l(str2).E((ImageView) findViewById(R.id.device_image));
    }

    @Override // vq2.f
    public final View W0() {
        View viewFindViewById = findViewById(R.id.root);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // sy2.e
    public final void a(a1 a1Var) {
        a1 a1Var2 = a1Var;
        a1Var2.getClass();
        this.f50963h = a1Var2;
    }

    @Override // z6.e, vn2.y0
    public final void c() {
        f50961m.trace("finishView()");
        finish();
    }

    @Override // sy2.e
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public final a1 b() {
        a1 a1Var = this.f50963h;
        if (a1Var != null) {
            return a1Var;
        }
        s.m("presenter");
        throw null;
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void call() {
        f50961m.trace("call()");
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat("0492679114"))));
        finish();
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void d1(long j8, String str) {
        str.getClass();
        f50961m.trace("navigateToSetPassCode()");
        PasscodeEntryActivity.a aVar = PasscodeEntryActivity.f52121n;
        Long lValueOf = Long.valueOf(j8);
        aVar.getClass();
        this.f50965j.a(PasscodeEntryActivity.a.b(this, lValueOf, str, null), null);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void h() {
        f50961m.trace("disablePhysicalBackButton()");
        X9(false);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void i() {
        f50961m.trace("enablePhysicalBackButton()");
        X9(true);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void k6(long j8, String str) {
        str.getClass();
        f50961m.trace("navigateToUpdateUserInformation()");
        FelicaUpdateUserInfoActivity.f50988j.getClass();
        this.f50966k.a(FelicaUpdateUserInfoActivity.a.a(this, str, j8), null);
    }

    public final void onCallServiceCenterClicked(View view2) {
        view2.getClass();
        f50961m.trace("onCallServiceCenterClicked()");
        b().L();
    }

    public final void onCardInformationClicked(View view2) {
        view2.getClass();
        f50961m.trace("onCardInformationClicked()");
        b().Q();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_felica_card_detail, c.a.BACK, getString(R.string.wallet_card_detail));
        View viewFindViewById = findViewById(R.id.suica_image);
        viewFindViewById.getClass();
        pn2.a.f138690a.getClass();
        j.b((ImageView) viewFindViewById, pn2.a.f(), 30, 4);
        ((TextView) findViewById(R.id.faq_need_text)).setText(r.v(R.string.wallet_visit_provider_faq, getString(R.string.operator_suica)));
        TextView textView = (TextView) findViewById(R.id.tac_need_text);
        x0 x0Var = x0.f105818a;
        textView.setText(String.format("%s %s", Arrays.copyOf(new Object[]{getString(R.string.wallet_provider_jre), getString(R.string.wallet_terms_and_conditions_title)}, 2)));
        t0 t0Var = s0.f105811a;
        new g(t0Var.b(z0.class), t0Var.b(a1.class), t0Var.b(b.class)).a(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            getMenuInflater().inflate(R.menu.menu_felica_card_detail, menu);
            return super.onCreateOptionsMenu(menu);
        }
        vb.h.s("Required value was null.");
        return false;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_remove_card) {
            b().q();
            return true;
        }
        if (itemId != R.id.menu_item_export_transaction_history) {
            return super.onOptionsItemSelected(menuItem);
        }
        b().X(this);
        return true;
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        b().b();
    }

    public final void onTermsAndConditionsClicked(View view2) {
        view2.getClass();
        f50961m.trace("onTermsAndConditionsClicked()");
        b().O();
    }

    public final void onTopUpClicked(View view2) {
        view2.getClass();
        f50961m.trace("onTopUpClicked()");
        b().I(this);
    }

    public final void onVisitHowToUseSuicaClicked(View view2) {
        view2.getClass();
        f50961m.trace("onVisitHowToUseSuicaClicked()");
        T8("https://www.jreast.co.jp/mobilesuica/use/sf/");
    }

    public final void onVisitSuicaFAQsClicked(View view2) {
        view2.getClass();
        f50961m.trace("onVisitSuicaFAQsClicked()");
        T8("https://support.garmin.com/ja-JP/?faq=VGrIr1k7y04yGjCpwyBjlA");
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void q(String str) {
        f50961m.trace("showCurrentBalance()");
        ((TextView) findViewById(R.id.balance)).setText(str);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void r4(pn2.e eVar) {
        eVar.getClass();
        f50961m.trace("navigateToTransactionHistory()");
        FelicaTransactionHistoryActivity.f50984h.getClass();
        Intent intent = new Intent(this, (Class<?>) FelicaTransactionHistoryActivity.class);
        intent.putExtra("extra.synthesize.model_factory", new FelicaTransactionHistoryActivity.a.C1040a(eVar));
        intent.putExtra("extra.synthesize.presenter_factory", new FelicaTransactionHistoryActivity.a.b());
        startActivity(intent);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void t7(File file) {
        file.getClass();
        f50961m.trace("openPdf()");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(FileProvider.d(this, "GarminConnectMobileApp.provider", file), "application/pdf");
        intent.addFlags(1073741824);
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, "Open File"));
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void v(String str) {
        f50961m.trace("showLastSync()");
        ((TextView) findViewById(R.id.last_sync)).setText(str);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void v9(long j8, String str) {
        str.getClass();
        f50961m.trace("navigateToTopUp()");
        FelicaTopUpActivity.f50969p.getClass();
        this.f50964i.a(FelicaTopUpActivity.a.a(this, str, j8), null);
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void w(String str) {
        str.getClass();
        f50961m.trace("showCardNumber()");
        ((TextView) findViewById(R.id.card_number)).setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void y(pn2.e eVar) {
        Object bVar;
        eVar.getClass();
        f50961m.trace("showHistory()");
        ArrayList arrayList = new ArrayList();
        List<pn2.f> listB = eVar.b();
        int i14 = 2;
        View.OnClickListener onClickListener = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (listB == null || listB.isEmpty()) {
            String string = getString(R.string.wallet_no_transactions);
            string.getClass();
            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.b(string, objArr2 == true ? 1 : 0, i14, objArr == true ? 1 : 0));
        } else {
            List<pn2.f> listS0 = h0.S0(eVar.b(), 6);
            ArrayList arrayList2 = new ArrayList(y.r(listS0, 10));
            for (pn2.f fVar : listS0) {
                if (s.g(fVar.getValid(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    if (fVar.getRecord() == null) {
                        vb.h.s("Required value was null.");
                        return;
                    }
                    bVar = new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.c(fVar.getRecord());
                } else {
                    if (fVar.getMessage() == null) {
                        vb.h.s("Required value was null.");
                        return;
                    }
                    bVar = new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.b(fVar.getMessage(), onClickListener, i14, objArr3 == true ? 1 : 0);
                }
                arrayList2.add(bVar);
            }
            arrayList.addAll(arrayList2);
            if (eVar.b().size() > 6) {
                String string2 = getString(R.string.wallet_see_more_transactions);
                string2.getClass();
                arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.b(string2, new vg1.z0(this, 1)));
            }
            String string3 = getString(R.string.wallet_suica_history_limitation);
            string3.getClass();
            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.C1047a(string3));
        }
        ((RecyclerView) findViewById(R.id.transactions)).setAdapter(new com.garmin.feature.garminpay.providers.felica.ui.a(this, arrayList));
    }

    @Override // com.garmin.feature.garminpay.providers.felica.ui.b
    public final void y4(long j8, List<vr2.q> list, Optional<hs2.c> optional, String str) {
        list.getClass();
        optional.getClass();
        str.getClass();
        f50961m.trace("navigateToSetExpressTransitCard()");
        RapidPassSettingActivity.b bVar = RapidPassSettingActivity.f52026j;
        ArrayList arrayList = new ArrayList(list);
        hs2.c cVarOrNull = optional.orNull();
        bVar.getClass();
        startActivity(RapidPassSettingActivity.b.a(this, j8, arrayList, cVarOrNull, str));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaCardDetailActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaCardDetailActivity$a$a;", "Lxy2/m;", "Lvn2/z0;", "", "cid", "", "deviceUnitId", "<init>", "(Ljava/lang/String;J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1034a extends m<z0> {
            public static final Parcelable.Creator<C1034a> CREATOR = new C1035a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f50967a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f50968b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1035a implements Parcelable.Creator<C1034a> {
                @Override // android.os.Parcelable.Creator
                public final C1034a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1034a(parcel.readString(), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final C1034a[] newArray(int i14) {
                    return new C1034a[i14];
                }
            }

            public C1034a(String str, long j8) {
                str.getClass();
                this.f50967a = str;
                this.f50968b = j8;
            }

            @Override // xy2.i
            public final Object b() {
                return new vn2.s(this.f50967a, this.f50968b);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f50967a);
                parcel.writeLong(this.f50968b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaCardDetailActivity$a$b;", "Lxy2/n;", "Lvn2/a1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<a1> {
            public static final Parcelable.Creator<b> CREATOR = new C1036a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1036a implements Parcelable.Creator<b> {
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
                return new b0();
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

        public static Intent a(Context context, long j8, String str) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) FelicaCardDetailActivity.class);
            intent.putExtra("extra.synthesize.model_factory", new C1034a(str, j8));
            intent.putExtra("extra.synthesize.presenter_factory", new b());
            return intent;
        }

        private a() {
        }
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final c getF52032a() {
        return this.f50962g;
    }
}
