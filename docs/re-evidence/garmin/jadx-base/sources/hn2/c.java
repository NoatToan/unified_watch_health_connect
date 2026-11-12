package hn2;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b.j;
import br2.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceActivity;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import com.google.android.material.appbar.AppBarLayout;
import dv.i;
import go1.g0;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o13.t;
import og2.k;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.t0;
import vr2.q;
import wr2.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lhn2/c;", "Lcom/garmin/android/apps/connectmobile/v;", "Lnn2/a$b;", "<init>", "()V", "b", "a", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"Registered"})
public class c extends v implements nn2.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f84546f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f84547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nn2.a f84548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1676c f84550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f84551e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhn2/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        NONE,
        UP,
        BACK
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f84557b;

        static {
            int[] iArr = new int[re2.b.a.values().length];
            try {
                iArr[re2.b.a.NO_SYSTEM_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[re2.b.a.SIGNED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84556a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f84557b = iArr2;
        }
    }

    static {
        new b(null);
        int i14 = gt2.c.f79010a;
        f84546f = gt2.b.f79005a.h("PAY#GarminPayBaseActivity");
    }

    public c() {
        m.f19643a.getClass();
        this.f84547a = new m();
        this.f84549c = true;
        this.f84550d = new AbstractC1676c.b();
        this.f84551e = o13.m.b(new hn2.b(this, 0));
    }

    public static void T9(Context context, boolean z14, boolean z15, Map map) {
        UserWalletActivity.f52217q.getClass();
        Intent intentA = UserWalletActivity.a.a(context);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Long) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    value2.getClass();
                    intentA.putExtra(str, ((Long) value2).longValue());
                } else if (value instanceof String) {
                    String str2 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    value3.getClass();
                    intentA.putExtra(str2, (String) value3);
                } else if (value instanceof Boolean) {
                    String str3 = (String) entry.getKey();
                    Object value4 = entry.getValue();
                    value4.getClass();
                    intentA.putExtra(str3, ((Boolean) value4).booleanValue());
                } else if (value instanceof Integer) {
                    String str4 = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    value5.getClass();
                    intentA.putExtra(str4, ((Integer) value5).intValue());
                }
            }
        }
        if (z14) {
            intentA.addFlags(67108864);
        }
        if (z15) {
            intentA.addFlags(268468224);
        }
        context.startActivity(intentA);
    }

    public static void U9(c cVar, Context context, Map map, int i14) {
        boolean z14 = (i14 & 2) == 0;
        boolean z15 = (i14 & 4) == 0;
        if ((i14 & 8) != 0) {
            map = null;
        }
        cVar.getClass();
        context.getClass();
        kj0.c.f104941a.getClass();
        kj0.a aVar = kj0.c.f104947g.get();
        if (aVar instanceof kj0.a.d) {
            T9(context, z14, z15, map);
            return;
        }
        if (!(aVar instanceof kj0.a.c)) {
            if (aVar instanceof kj0.a.e) {
                T9(context, z14, z15, map);
                return;
            }
            if (aVar instanceof kj0.a.b) {
                T9(context, z14, z15, map);
                return;
            }
            if (aVar instanceof kj0.a.f) {
                T9(context, z14, z15, map);
                return;
            } else {
                if (aVar instanceof kj0.a.C2012a) {
                    return;
                }
                if (aVar == null) {
                    T9(context, z14, z15, map);
                    return;
                } else {
                    u0.r();
                    return;
                }
            }
        }
        kj0.a.c cVar2 = (kj0.a.c) aVar;
        DeviceSettingsActivity.a aVar2 = DeviceSettingsActivity.f51993w;
        Long l14 = cVar2.f104934a;
        String str = cVar2.f104935b;
        String str2 = cVar2.f104936c;
        aVar2.getClass();
        Intent intentA = DeviceSettingsActivity.a.a(context, l14, str, str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Long) {
                    String str3 = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    value2.getClass();
                    intentA.putExtra(str3, ((Long) value2).longValue());
                } else if (value instanceof String) {
                    String str4 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    value3.getClass();
                    intentA.putExtra(str4, (String) value3);
                } else if (value instanceof Boolean) {
                    String str5 = (String) entry.getKey();
                    Object value4 = entry.getValue();
                    value4.getClass();
                    intentA.putExtra(str5, ((Boolean) value4).booleanValue());
                } else if (value instanceof Integer) {
                    String str6 = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    value5.getClass();
                    intentA.putExtra(str6, ((Integer) value5).intValue());
                }
            }
        }
        if (z14) {
            intentA.addFlags(67108864);
        }
        if (z15) {
            intentA.addFlags(268468224);
        }
        context.startActivity(intentA);
    }

    public static /* synthetic */ void ba(c cVar, Boolean bool, String str, String str2, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        cVar.aa(bool, str, str2, null);
    }

    /* JADX INFO: renamed from: Q9, reason: from getter */
    public AbstractC1676c getF50992i() {
        return this.f84550d;
    }

    public final void R9(int i14, a aVar, String str) {
        aVar.getClass();
        setContentView(R.layout.generic_layout_app_bar);
        if (str != null) {
            V9(str, aVar);
        } else {
            Object value = this.f84551e.getValue();
            value.getClass();
            ((AppBarLayout) value).setVisibility(8);
        }
        View viewInflate = LayoutInflater.from(this).inflate(i14, (ViewGroup) null);
        if (viewInflate != null) {
            View viewFindViewById = findViewById(R.id.content_frame);
            viewFindViewById.getClass();
            ((FrameLayout) viewFindViewById).addView(viewInflate);
        }
        View viewFindViewById2 = findViewById(android.R.id.content);
        hb.a aVar2 = new hb.a(13);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById2, aVar2);
    }

    public final void S9(Context context) {
        context.getClass();
        kj0.c.f104941a.getClass();
        AtomicReference<Boolean> atomicReference = kj0.c.f104948h;
        if (!s.g(atomicReference.get(), Boolean.TRUE)) {
            U9(this, context, null, 10);
            return;
        }
        atomicReference.set(Boolean.FALSE);
        try {
            PaymentCardDetailsActivity.a aVar = PaymentCardDetailsActivity.f52177p;
            q qVar = kj0.c.f104950j.get();
            qVar.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) PaymentCardDetailsActivity.class);
            intent.putExtra("card.details.item", qVar);
            intent.addFlags(268468224);
            context.startActivity(intent);
        } catch (Exception unused) {
            U9(this, context, null, 14);
        }
    }

    public final void V9(String str, a aVar) {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.r(8);
            supportActionBar.C(str);
            int i14 = d.f84557b[aVar.ordinal()];
            if (i14 == 1) {
                supportActionBar.q(true);
                Drawable drawable = a7.b.getDrawable(this, R.drawable.close_x);
                if (drawable != null) {
                    k.F(R.color.gcm_icon_primary, this, drawable);
                }
                supportActionBar.w(drawable);
            } else if (i14 != 2) {
                supportActionBar.q(false);
            } else {
                supportActionBar.q(true);
                Drawable drawable2 = a7.b.getDrawable(this, R.drawable.arrow_left);
                if (drawable2 != null) {
                    k.F(R.color.gcm_icon_primary, this, drawable2);
                }
                supportActionBar.w(drawable2);
            }
        }
        View viewFindViewById = findViewById(R.id.toolbar);
        viewFindViewById.getClass();
        Toolbar toolbar = (Toolbar) viewFindViewById;
        k.G(toolbar, str);
        hb.a aVar2 = new hb.a(12);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(toolbar, aVar2);
        toolbar.requestApplyInsets();
    }

    public final void W9(String str, a aVar) {
        aVar.getClass();
        Object value = this.f84551e.getValue();
        value.getClass();
        ((AppBarLayout) value).setVisibility(0);
        V9(str, aVar);
    }

    public final void X9(boolean z14) {
        this.f84549c = z14;
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(z14);
        }
    }

    public void Y9(AbstractC1676c abstractC1676c) {
        this.f84550d = abstractC1676c;
    }

    public final boolean Z9() {
        if (this instanceof FitPayAddCardActivity) {
            p pVar = p.f186870a;
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.secure_flag_for_garmin_pay_activities);
            string.getClass();
            pVar.getClass();
            return p.b("general_app", string, true);
        }
        if (!(this instanceof FelicaAddCardActivity) && !(this instanceof FelicaCardDetailActivity) && !(this instanceof FelicaUpdateUserInfoActivity) && !(this instanceof SnowballAddCardActivity) && !(this instanceof SnowballCardDetailActivity) && !(this instanceof NewFitPayTransitRefundActivity)) {
            return false;
        }
        p pVar2 = p.f186870a;
        String string2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.secure_flag_for_garmin_pay_activities);
        string2.getClass();
        pVar2.getClass();
        return p.b("general_app", string2, true);
    }

    public final void aa(Boolean bool, String str, String str2, String str3) {
        ViewStub viewStub = (ViewStub) findViewById(R.id.progress_loader_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        ImageView imageView = (ImageView) findViewById(R.id.progress_loader_top_image);
        View viewFindViewById = findViewById(R.id.content_frame);
        View viewFindViewById2 = findViewById(R.id.progress_loader);
        if (!s.g(bool, Boolean.TRUE)) {
            viewFindViewById.setVisibility(0);
            if (imageView != null) {
                imageView.setImageBitmap(null);
                imageView.destroyDrawingCache();
                imageView.setVisibility(8);
            }
            viewFindViewById2.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(0);
        View viewFindViewById3 = findViewById(R.id.top_running_progress);
        View viewFindViewById4 = findViewById(R.id.bottom_running_progress);
        if (TextUtils.isEmpty(str3)) {
            imageView.setImageBitmap(null);
            imageView.destroyDrawingCache();
            imageView.setVisibility(8);
            viewFindViewById3.setVisibility(0);
            viewFindViewById4.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            viewFindViewById3.setVisibility(8);
            viewFindViewById4.setVisibility(0);
            com.bumptech.glide.b.c(this).e(this).l(str3).E(imageView);
        }
        TextView textView = (TextView) findViewById(R.id.progress_loader_title);
        TextView textView2 = (TextView) findViewById(R.id.progress_loader_message);
        textView.setText(str != null ? str : "");
        textView2.setText(str2 != null ? str2 : "");
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        textView2.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 2) && (currentFocus instanceof EditText))) {
            int[] iArr = new int[2];
            currentFocus.getLocationOnScreen(iArr);
            EditText editText = (EditText) currentFocus;
            float rawX = (motionEvent.getRawX() + editText.getLeft()) - iArr[0];
            float rawY = (motionEvent.getRawY() + editText.getTop()) - iArr[1];
            if ((rawX < editText.getLeft() || rawX > editText.getRight() || rawY < editText.getTop() || rawY > editText.getBottom()) && getWindow() != null) {
                getWindow().getDecorView();
                Object systemService = getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
            try {
                currentFocus.clearFocus();
            } catch (Exception unused) {
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        Y9(new AbstractC1676c.b());
        invalidateOptionsMenu();
    }

    public final void j() {
        Y9(new AbstractC1676c.a());
        invalidateOptionsMenu();
    }

    @Override // b.g, android.app.Activity
    public void onBackPressed() {
        Logger logger = f84546f;
        logger.debug("onBackPressed");
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        if (!s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
            logger.trace("onBackPressed: isBackKeyEnabled " + this.f84549c);
            if (this.f84549c) {
                if (!isTaskRoot() || ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).g()) {
                    super.onBackPressed();
                    return;
                } else {
                    ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).j(this);
                    return;
                }
            }
            return;
        }
        logger.trace("onBackPressed: is Push Provisioning flow");
        String simpleName = getClass().getSimpleName();
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        if (simpleName.equals(t0Var.b(PushProvMainActivity.class).D())) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, true, new hn2.b(this, 1));
            return;
        }
        if (simpleName.equals(t0Var.b(FitPayIssuerBankTermsConditionActivity.class).D())) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, true, new hn2.b(this, 2));
            return;
        }
        if (simpleName.equals(t0Var.b(FitPayCardVerificationActivity.class).D())) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, false, new hn2.b(this, 3));
            return;
        }
        if (simpleName.equals(t0Var.b(UserWalletActivity.class).D())) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, false, new hn2.b(this, 4));
            return;
        }
        if (simpleName.equals(t0Var.b(PasscodeEntryActivity.class).D()) || simpleName.equals(t0Var.b(NewFitPayUpdateDeviceActivity.class).D()) || simpleName.equals(t0Var.b(CardDestinationSelectionActivity.class).D()) || simpleName.equals(t0Var.b(NewFitPayTermsAndConditionActivity.class).D()) || simpleName.equals(t0Var.b(NewDeviceOnBoardingActivity.class).D())) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, true, null);
        } else {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.c();
            onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        j.a(this);
        if (Z9() && (window = getWindow()) != null) {
            window.addFlags(8192);
        }
        k13.a.f102397a = new gw.j(new ha0.b(24), 5);
        getSupportFragmentManager().b(new i(this, 1));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onDestroy() {
        Window window;
        if (Z9() && (window = getWindow()) != null) {
            window.clearFlags(8192);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null) {
            if (menu.size() == 0) {
                return super.onPrepareOptionsMenu(menu);
            }
            getF50992i().a(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        re2.b.a aVarO = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).o();
        int i14 = aVarO == null ? -1 : d.f84556a[aVarO.ordinal()];
        if (i14 == 1 || i14 == 2) {
            Intent intent = new Intent(getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName()));
            intent.setFlags(268468224);
            startActivity(intent);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onStart() {
        super.onStart();
        z8(hb2.i.a(this));
        nn2.a aVar = new nn2.a();
        this.f84548b = aVar;
        aVar.f126705a = this;
        registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(new g0(this, 7));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        nn2.a aVar = this.f84548b;
        if (aVar == null) {
            s.m("connectivityReceiver");
            throw null;
        }
        aVar.f126705a = null;
        unregisterReceiver(aVar);
        super.onStop();
    }

    @Override // i.c
    public boolean onSupportNavigateUp() {
        f84546f.trace("onSupportNavigateUp");
        onBackPressed();
        return this.f84549c;
    }

    @Override // nn2.a.b
    public final void z8(boolean z14) {
        m mVar = this.f84547a;
        if (z14 && mVar.isAdded()) {
            FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.remove(mVar);
            fragmentTransactionBeginTransaction.commit();
        } else {
            if (z14 || mVar.isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction2 = getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction2.replace(R.id.app_container_frame, mVar, mVar.getClass().getCanonicalName());
            fragmentTransactionBeginTransaction2.commit();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhn2/c$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: hn2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lhn2/c$c;", "", "<init>", "()V", "b", "a", "Lhn2/c$c$a;", "Lhn2/c$c$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC1676c {

        /* JADX INFO: renamed from: hn2.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhn2/c$c$a;", "Lhn2/c$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends AbstractC1676c {
            public a() {
                super(null);
            }

            @Override // hn2.c.AbstractC1676c
            public final void a(Menu menu) {
                int size = menu.size();
                for (int i14 = 0; i14 < size; i14++) {
                    menu.getItem(i14).setVisible(false);
                }
            }
        }

        /* JADX INFO: renamed from: hn2.c$c$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhn2/c$c$b;", "Lhn2/c$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends AbstractC1676c {
            public b() {
                super(null);
            }

            @Override // hn2.c.AbstractC1676c
            public final void a(Menu menu) {
                int size = menu.size();
                for (int i14 = 0; i14 < size; i14++) {
                    menu.getItem(i14).setVisible(true);
                }
            }
        }

        public /* synthetic */ AbstractC1676c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public abstract void a(Menu menu);

        private AbstractC1676c() {
        }
    }
}
