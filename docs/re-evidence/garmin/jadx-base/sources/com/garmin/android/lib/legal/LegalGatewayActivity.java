package com.garmin.android.lib.legal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.fragment.app.v;
import bd.f;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import e23.q;
import java.util.Locale;
import java.util.WeakHashMap;
import l72.o2;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.c2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.v0;
import r53.j;
import r53.l1;
import r53.m1;
import r53.s;
import r53.w;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/lib/legal/LegalGatewayActivity;", "Li/c;", "Lcom/garmin/android/lib/legal/LegalLocalesFragment$b;", "<init>", "()V", "a", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LegalGatewayActivity extends i.c implements LegalLocalesFragment.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f49928n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f49929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f49930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f49931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lc2.a f49932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f49933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f49935g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f49937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f49938j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c2 f49940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public vc2.c f49941m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f49936h = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f49939k = m.b(new o2(10));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            a aVar = LegalGatewayActivity.f49928n;
            LegalGatewayActivity legalGatewayActivity = LegalGatewayActivity.this;
            legalGatewayActivity.setResult(-1);
            legalGatewayActivity.finish();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.lib.legal.LegalGatewayActivity$onStart$2", f = "LegalGatewayActivity.kt", l = {209}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49943a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvc2/b;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lvc2/b;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.lib.legal.LegalGatewayActivity$onStart$2$1", f = "LegalGatewayActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends i implements p<vc2.b, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f49945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalGatewayActivity f49946b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LegalGatewayActivity legalGatewayActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f49946b = legalGatewayActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f49946b, dVar);
                aVar.f49945a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(vc2.b bVar, t13.d<? super Unit> dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                int i14 = ((vc2.b) this.f49945a) instanceof vc2.b.C3312b ? 8 : 0;
                View view2 = this.f49946b.f49931c;
                if (view2 != null) {
                    view2.post(new androidx.media3.exoplayer.d(view2, i14, 11));
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lvc2/b;", "", JWKParameterNames.RSA_EXPONENT, "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.lib.legal.LegalGatewayActivity$onStart$2$2", f = "LegalGatewayActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends i implements q<j<? super vc2.b>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Throwable f49947a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalGatewayActivity f49948b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LegalGatewayActivity legalGatewayActivity, t13.d<? super b> dVar) {
                super(3, dVar);
                this.f49948b = legalGatewayActivity;
            }

            @Override // e23.q
            public final Object invoke(j<? super vc2.b> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                b bVar = new b(this.f49948b, dVar);
                bVar.f49947a = th3;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                Throwable th3 = this.f49947a;
                a aVar2 = LegalGatewayActivity.f49928n;
                this.f49948b.O9().warn("networkConnectivityMonitor", th3);
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LegalGatewayActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49943a;
            if (i14 == 0) {
                r.b(obj);
                LegalGatewayActivity legalGatewayActivity = LegalGatewayActivity.this;
                vc2.c cVar = legalGatewayActivity.f49941m;
                r53.i iVarS = cVar != null ? s.s(new l1(cVar.f177091b)) : null;
                iVarS.getClass();
                w wVar = new w(new m1(iVarS, new a(legalGatewayActivity, null)), new b(legalGatewayActivity, null));
                this.f49943a = 1;
                if (s.j(wVar, this) == aVar) {
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

    public final Logger O9() {
        Object value = this.f49939k.getValue();
        value.getClass();
        return (Logger) value;
    }

    public final void P9() {
        if (je.b.a(this) == null) {
            new AlertDialog.Builder(this).setCancelable(false).setTitle(R.string.common_title_incompatible_version).setMessage(R.string.common_msg_invalid_webview).setPositiveButton(R.string.lbl_close, new b()).show();
            return;
        }
        View view2 = this.f49929a;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("legalLocaleContainer");
            throw null;
        }
        view2.setVisibility(0);
        TextView textView = this.f49930b;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("legalLocaleSummaryView");
            throw null;
        }
        d dVar = this.f49933e;
        if (dVar == null) {
            p005kotlin.jvm.internal.s.m("localeEnum");
            throw null;
        }
        textView.setText(dVar.f50055j);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        com.garmin.android.lib.legal.a.C0993a c0993a = com.garmin.android.lib.legal.a.f49951g;
        lc2.a aVar2 = this.f49932d;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("documentEnum");
            throw null;
        }
        d dVar2 = this.f49933e;
        if (dVar2 == null) {
            p005kotlin.jvm.internal.s.m("localeEnum");
            throw null;
        }
        boolean z14 = this.f49934f;
        String str = this.f49935g;
        boolean z15 = this.f49937i;
        c0993a.getClass();
        com.garmin.android.lib.legal.a aVar3 = new com.garmin.android.lib.legal.a();
        Bundle bundle = new Bundle(5);
        bundle.putString("doc.enum.name", aVar2.name());
        bundle.putString("loc.enum.name", dVar2.name());
        bundle.putBoolean("is.china.server.env", z14);
        bundle.putString("custom.css", str);
        bundle.putBoolean("launch.links.externally", z15);
        aVar3.setArguments(bundle);
        aVar.l(R.id.legal_frag_container, aVar3, "LegalDocumentFragment");
        aVar.s(true, true);
        this.f49938j = "LegalDocumentFragment";
    }

    @Override // b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        String str = this.f49938j;
        if (str != null && !str.equals("LegalDocumentFragment")) {
            P9();
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVarA;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("a")) {
            O9().error("Document missing. You should be calling static 'LegalGatewayActivity.startForResult(...)'. See KDoc.");
            setResult(-1);
            finish();
            return;
        }
        if (!intent.hasExtra("b")) {
            O9().error("'isChinaServerEnvironment' missing. You should be calling static 'LegalGatewayActivity.startForResult(...)'. See KDoc.");
            setResult(-1);
            finish();
            return;
        }
        this.f49935g = intent.getStringExtra("c");
        CharSequence charSequenceExtra = intent.getCharSequenceExtra(JWKParameterNames.RSA_EXPONENT);
        charSequenceExtra.getClass();
        this.f49936h = charSequenceExtra;
        this.f49937i = intent.getBooleanExtra("d", false);
        String stringExtra = getIntent().getStringExtra("a");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f49932d = lc2.a.valueOf(stringExtra);
        this.f49934f = getIntent().getBooleanExtra("b", false);
        SharedPreferences sharedPreferences = getSharedPreferences(f.b(this), 0);
        if (sharedPreferences.contains("legal.lib.locale.enum.name")) {
            d.a aVar = d.f49991k;
            Locale locale = Locale.getDefault();
            locale.getClass();
            aVar.getClass();
            String string = sharedPreferences.getString("legal.lib.locale.enum.name", d.a.a(locale).name());
            string.getClass();
            dVarA = d.valueOf(string);
        } else {
            d.a aVar2 = d.f49991k;
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            aVar2.getClass();
            dVarA = d.a.a(locale2);
        }
        this.f49933e = dVarA;
        setContentView(R.layout.legal_gateway_activity);
        getWindow().getDecorView().setBackgroundColor(a7.b.getColor(this, R.color.legal_background_color));
        i.a supportActionBar = getSupportActionBar();
        int i14 = 12;
        if (supportActionBar != null) {
            supportActionBar.r(12);
            supportActionBar.C(this.f49936h);
            supportActionBar.q(true);
            Drawable drawable = a7.b.getDrawable(this, R.drawable.ic_back);
            if (drawable != null) {
                drawable.setTint(a7.b.getColor(this, R.color.legal_actionbar_icon_color));
            }
            if (drawable != null) {
                supportActionBar.w(drawable);
            } else {
                supportActionBar.v(R.drawable.ic_back);
            }
        } else {
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            i.a supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.C(this.f49936h);
                supportActionBar2.q(true);
                Drawable drawable2 = a7.b.getDrawable(this, R.drawable.ic_back);
                if (drawable2 != null) {
                    drawable2.setTint(a7.b.getColor(this, R.color.legal_actionbar_icon_color));
                }
                if (drawable2 != null) {
                    supportActionBar2.w(drawable2);
                } else {
                    supportActionBar2.v(R.drawable.ic_back);
                }
            }
        }
        this.f49931c = findViewById(R.id.legal_no_network_banner);
        View viewFindViewById = findViewById(R.id.legal_locale_container);
        viewFindViewById.setOnClickListener(new js0.d(this, i14));
        this.f49929a = viewFindViewById;
        this.f49930b = (TextView) findViewById(R.id.legal_locale_summary_view);
        b.j.a(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        u0 u0Var = new u0(1);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewGroup, u0Var);
        P9();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f49941m = new vc2.c(this, null, true, new v0(this, 5), 2, null);
        x53.c cVar = o53.s0.f129406a;
        this.f49940l = ge1.b.T(c0.a(x53.b.f189152a.plus(new a0("LegalGatewayActivity.NetworkConnectivityMonitor"))), null, null, new c(null), 3);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        try {
            try {
                vc2.c cVar = this.f49941m;
                if (cVar != null) {
                    c0.c(cVar.f177092c, null);
                    cVar.f177091b.setValue(null);
                }
            } catch (Exception e4) {
                O9().error("onStop: calling close on 'networkConnectivityMonitor'", (Throwable) e4);
            }
            this.f49941m = null;
            try {
                try {
                    c2 c2Var = this.f49940l;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                } catch (Exception e14) {
                    O9().error("onStop: calling cancel on 'networkMonitorJob'", (Throwable) e14);
                }
            } finally {
                this.f49940l = null;
            }
        } catch (Throwable th3) {
            this.f49941m = null;
            throw th3;
        }
    }

    @Override // i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.lib.legal.LegalLocalesFragment.b
    public final void t1(d dVar) {
        d dVar2 = this.f49933e;
        if (dVar2 == null) {
            p005kotlin.jvm.internal.s.m("localeEnum");
            throw null;
        }
        if (dVar != dVar2) {
            getSharedPreferences(f.b(this), 0).edit().putString("legal.lib.locale.enum.name", dVar.name()).apply();
        }
        this.f49933e = dVar;
        P9();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/lib/legal/LegalGatewayActivity$a;", "", "<init>", "()V", "", "CLASS_IDENTIFIER", "Ljava/lang/String;", "PREF_KEY_LEGAL_LOCALE_ENUM_NAME", "DOC_ENUM_NAME", "IS_CHINA_SERVER_ENV", "CUSTOM_CSS", "LAUNCH_LINKS_EXTERNALLY", "ACTION_BAR_TITLE", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Activity activity, int i14, lc2.a aVar, boolean z14, boolean z15, String str, boolean z16, CharSequence charSequence) {
            Class cls;
            activity.getClass();
            aVar.getClass();
            if (!z15) {
                cls = LegalGatewayActivity.class;
            } else {
                if (!z15) {
                    u0.r();
                    return;
                }
                cls = LegalGatewayActivityLandscape.class;
            }
            Intent intent = new Intent(activity, (Class<?>) cls);
            intent.putExtra("a", aVar.name());
            intent.putExtra("b", z14);
            if (str != null) {
                intent.putExtra("c", str);
            }
            if (charSequence == null) {
                charSequence = activity.getText(R.string.legal_host_app_name);
                charSequence.getClass();
            }
            intent.putExtra(JWKParameterNames.RSA_EXPONENT, charSequence);
            intent.putExtra("d", z16);
            activity.startActivityForResult(intent, i14);
        }

        public static /* synthetic */ void b(a aVar, Activity activity, int i14, lc2.a aVar2, boolean z14, boolean z15, String str, boolean z16, CharSequence charSequence, int i15) {
            if ((i15 & 16) != 0) {
                z15 = false;
            }
            if ((i15 & 32) != 0) {
                str = null;
            }
            if ((i15 & 64) != 0) {
                z16 = false;
            }
            if ((i15 & 128) != 0) {
                charSequence = null;
            }
            aVar.getClass();
            a(activity, i14, aVar2, z14, z15, str, z16, charSequence);
        }

        private a() {
        }
    }
}
