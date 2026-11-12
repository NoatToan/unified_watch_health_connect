package com.garmin.android.apps.connectmobile.lteconnect;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.AppCompatButton;
import c22.f3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.lteconnect.LteConnectionActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMRunningProgressView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d53.w;
import d80.f;
import d80.g;
import hb2.j;
import hk0.p;
import mt0.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zb0.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/LteConnectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LteConnectionActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f38695j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f38696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f<Object> f38699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMRunningProgressView f38702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AppCompatButton f38703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f38704i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/lteconnect/LteConnectionActivity$b", "Ld80/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements d80.b {
        public b() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a aVar = LteConnectionActivity.f38695j;
            LteConnectionActivity lteConnectionActivity = LteConnectionActivity.this;
            lteConnectionActivity.ha();
            lteConnectionActivity.f38701f = false;
            String strN = fb1.c.n("*LTE* Device Activation Status: ", bVar != null ? bVar.f112959c : null);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "LteConnectionActivity", strN);
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            aVar.getClass();
            LteConnectionActivity lteConnectionActivity = LteConnectionActivity.this;
            lteConnectionActivity.f38701f = false;
            String strValueOf = String.valueOf(obj);
            if (!TextUtils.isEmpty(strValueOf) && w.z(strValueOf, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false)) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "LteConnectionActivity", "*LTE* checkDeviceActivationStatus: Device already activated.");
                lteConnectionActivity.f38700e = true;
                AppCompatButton appCompatButton = lteConnectionActivity.f38703h;
                if (appCompatButton == null) {
                    s.m("mConnectLteButton");
                    throw null;
                }
                appCompatButton.setText(lteConnectionActivity.getString(R.string.lte_manage_connection, lteConnectionActivity.getString(R.string.lbl_verizon)));
            }
            lteConnectionActivity.ha();
            if (TextUtils.isEmpty(strValueOf)) {
                return;
            }
            String strConcat = "*LTE* Device Activation Status: ".concat(strValueOf);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "LteConnectionActivity", strConcat);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/lteconnect/LteConnectionActivity$c", "Lcom/garmin/android/apps/connectmobile/lteconnect/a$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.lteconnect.a.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f38707b;

        public c(boolean z14) {
            this.f38707b = z14;
        }

        @Override // com.garmin.android.apps.connectmobile.lteconnect.a.b
        public final void a() {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LteConnectionActivity", "*LTE* getLTEDeviceInfo failed");
            a aVar2 = LteConnectionActivity.f38695j;
            LteConnectionActivity lteConnectionActivity = LteConnectionActivity.this;
            lteConnectionActivity.ha();
            LteConnectionActivity.ca(lteConnectionActivity);
        }

        @Override // com.garmin.android.apps.connectmobile.lteconnect.a.b
        public final void b(String str, String str2, boolean z14) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            LteConnectionActivity lteConnectionActivity = LteConnectionActivity.this;
            if (zIsEmpty || TextUtils.isEmpty(str2)) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "LteConnectionActivity", "*LTE* getLTEDeviceInfo did not receive IME and ICCD");
                a aVar2 = LteConnectionActivity.f38695j;
                lteConnectionActivity.ha();
                LteConnectionActivity.ca(lteConnectionActivity);
                return;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "LteConnectionActivity", "*LTE* getLTEDeviceInfo successful");
            lteConnectionActivity.f38697b = str;
            lteConnectionActivity.f38698c = str2;
            if (this.f38707b) {
                lteConnectionActivity.fa();
            } else {
                lteConnectionActivity.da();
            }
        }
    }

    public static final void ca(LteConnectionActivity lteConnectionActivity) {
        lteConnectionActivity.getClass();
        e.a aVar = new e.a(lteConnectionActivity);
        aVar.setTitle(lteConnectionActivity.getString(R.string.lte_no_connection));
        aVar.setMessage(lteConnectionActivity.getString(R.string.lte_no_connection_msg, lteConnectionActivity.getString(R.string.lbl_verizon)));
        aVar.setPositiveButton(lteConnectionActivity.getString(R.string.lbl_ok), new y(23));
        aVar.show();
    }

    public final void da() {
        this.f38701f = true;
        d dVarM = d.M();
        String str = this.f38697b;
        String str2 = this.f38698c;
        b bVar = new b();
        dVarM.getClass();
        f.b bVar2 = new f.b(new Object[]{str, str2}, lj0.f.f112988n);
        bVar2.f58274d = bVar;
        bVar2.f58275e = g.STRING;
        f<Object> fVarA = bVar2.a();
        fVarA.b();
        this.f38699d = fVarA;
    }

    public final void ea(Context context, boolean z14) {
        GCMRunningProgressView gCMRunningProgressView = this.f38702g;
        if (gCMRunningProgressView != null) {
            gCMRunningProgressView.setVisibility(0);
        }
        getWindow().setFlags(16, 16);
        com.garmin.android.apps.connectmobile.lteconnect.a.f38717b.getClass();
        if (com.garmin.android.apps.connectmobile.lteconnect.a.f38718c == null) {
            com.garmin.android.apps.connectmobile.lteconnect.a.f38718c = new com.garmin.android.apps.connectmobile.lteconnect.a(null);
        }
        com.garmin.android.apps.connectmobile.lteconnect.a aVar = com.garmin.android.apps.connectmobile.lteconnect.a.f38718c;
        aVar.getClass();
        Long l14 = this.f38696a;
        l14.getClass();
        if (p.k(l14.longValue())) {
            Long l15 = this.f38696a;
            l15.getClass();
            aVar.a(l15.longValue(), new c(z14));
        } else {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "LteConnectionActivity", "*LTE* finish() Device not connected.");
            Toast.makeText(context, getString(R.string.find_my_watch_device_not_connected_msg), 0).show();
            finish();
        }
    }

    public final void fa() {
        Intent intent = new Intent(this, (Class<?>) VerizonLteWebViewActivity.class);
        String str = this.f38698c;
        str.getClass();
        intent.putExtra("extraIccId", str);
        String str2 = this.f38697b;
        str2.getClass();
        intent.putExtra("extraImei", str2);
        Long l14 = this.f38696a;
        intent.putExtra("GCM_deviceUnitID", l14 != null ? l14.longValue() : -1L);
        startActivityForResult(intent, 1);
    }

    public final void ga() {
        if (j.b(this, "com.vzw.hss.myverizon")) {
            getPackageManager().getPackageInfo("com.vzw.hss.myverizon", 1);
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.vzw.hss.myverizon");
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
                return;
            }
            return;
        }
        e.a aVar = new e.a(this);
        aVar.setTitle(getString(R.string.lte_install_app_dialog, getString(R.string.lbl_verizon)));
        aVar.setMessage(getString(R.string.lte_install_app_dialog_description, getString(R.string.lbl_verizon)));
        aVar.setPositiveButton(getString(R.string.lte_install_app), new pw0.b(this, 0));
        aVar.setNeutralButton(getString(R.string.not_now_lbl), (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }

    public final void ha() {
        GCMRunningProgressView gCMRunningProgressView = this.f38702g;
        if (gCMRunningProgressView != null) {
            gCMRunningProgressView.setVisibility(8);
        }
        getWindow().clearFlags(16);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i15 == -1) {
            this.f38700e = true;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LteConnectionActivity", "*LTE* onActivityResult - OK - Activated");
        } else if (i15 == 0) {
            this.f38700e = false;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "LteConnectionActivity", "*LTE* onActivityResult - CANCEL - Not Activated");
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lte_activation_landing);
        super.initActionBar(true, getString(R.string.lte_connect_with, getString(R.string.lbl_verizon)));
        Intent intent = getIntent();
        if (intent == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LteConnectionActivity", "*LTE* finish() No device ID.");
            finish();
            return;
        }
        this.f38696a = Long.valueOf(intent.getLongExtra("GCM_deviceUnitID", -1L));
        TextView textView = (TextView) findViewById(R.id.lte_description_text);
        View viewFindViewById = findViewById(R.id.lte_support_text);
        viewFindViewById.getClass();
        this.f38704i = (TextView) viewFindViewById;
        this.f38702g = (GCMRunningProgressView) findViewById(R.id.loading_device_progress);
        View viewFindViewById2 = findViewById(R.id.btnContinue);
        viewFindViewById2.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById2;
        this.f38703h = appCompatButton;
        appCompatButton.setText(getString(R.string.lte_connect_with, getString(R.string.lbl_verizon)));
        AppCompatButton appCompatButton2 = this.f38703h;
        if (appCompatButton2 == null) {
            s.m("mConnectLteButton");
            throw null;
        }
        final int i14 = 0;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: pw0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LteConnectionActivity f141701b;

            {
                this.f141701b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws PackageManager.NameNotFoundException {
                int i15 = i14;
                LteConnectionActivity lteConnectionActivity = this.f141701b;
                switch (i15) {
                    case 0:
                        if (lteConnectionActivity.f38697b == null || lteConnectionActivity.f38698c == null) {
                            lteConnectionActivity.ea(lteConnectionActivity, true);
                        } else if (!lteConnectionActivity.f38700e) {
                            lteConnectionActivity.fa();
                        } else if (!j.b(lteConnectionActivity, "com.vzw.hss.myverizon")) {
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(lteConnectionActivity);
                            aVar2.setTitle(lteConnectionActivity.getString(R.string.lte_install_app_dialog, lteConnectionActivity.getString(R.string.lbl_verizon)));
                            aVar2.setMessage(lteConnectionActivity.getString(R.string.lte_install_app_dialog_description, lteConnectionActivity.getString(R.string.lbl_verizon)));
                            aVar2.setPositiveButton(lteConnectionActivity.getString(R.string.lte_install_app), new b(lteConnectionActivity, 1));
                            aVar2.setNegativeButton(lteConnectionActivity.getString(R.string.lte_go_to_website), new b(lteConnectionActivity, 2));
                            aVar2.setNeutralButton(lteConnectionActivity.getString(R.string.not_now_lbl), (DialogInterface.OnClickListener) null);
                            aVar2.create().show();
                        } else {
                            lteConnectionActivity.getPackageManager().getPackageInfo("com.vzw.hss.myverizon", 1);
                            Intent launchIntentForPackage = lteConnectionActivity.getPackageManager().getLaunchIntentForPackage("com.vzw.hss.myverizon");
                            if (launchIntentForPackage != null) {
                                lteConnectionActivity.startActivity(launchIntentForPackage);
                            }
                        }
                        break;
                    default:
                        LteConnectionActivity.a aVar3 = LteConnectionActivity.f38695j;
                        lteConnectionActivity.ga();
                        break;
                }
            }
        });
        TextView textView2 = this.f38704i;
        if (textView2 == null) {
            s.m("mVerizonSupportText");
            throw null;
        }
        String string = getString(R.string.lte_contact_support, getString(R.string.lbl_verizon));
        string.getClass();
        textView2.setText(string);
        pw0.c cVar = new pw0.c(this);
        f3.f23054a.getClass();
        textView2.setText(f3.d(textView2, cVar));
        TextView textView3 = this.f38704i;
        if (textView3 == null) {
            s.m("mVerizonSupportText");
            throw null;
        }
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView4 = this.f38704i;
        if (textView4 == null) {
            s.m("mVerizonSupportText");
            throw null;
        }
        textView4.setHighlightColor(0);
        TextView textView5 = this.f38704i;
        if (textView5 == null) {
            s.m("mVerizonSupportText");
            throw null;
        }
        textView5.setLinksClickable(true);
        final int i15 = 1;
        ((TextView) findViewById(R.id.contact_verizon)).setOnClickListener(new View.OnClickListener(this) { // from class: pw0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LteConnectionActivity f141701b;

            {
                this.f141701b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws PackageManager.NameNotFoundException {
                int i16 = i15;
                LteConnectionActivity lteConnectionActivity = this.f141701b;
                switch (i16) {
                    case 0:
                        if (lteConnectionActivity.f38697b == null || lteConnectionActivity.f38698c == null) {
                            lteConnectionActivity.ea(lteConnectionActivity, true);
                        } else if (!lteConnectionActivity.f38700e) {
                            lteConnectionActivity.fa();
                        } else if (!j.b(lteConnectionActivity, "com.vzw.hss.myverizon")) {
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(lteConnectionActivity);
                            aVar2.setTitle(lteConnectionActivity.getString(R.string.lte_install_app_dialog, lteConnectionActivity.getString(R.string.lbl_verizon)));
                            aVar2.setMessage(lteConnectionActivity.getString(R.string.lte_install_app_dialog_description, lteConnectionActivity.getString(R.string.lbl_verizon)));
                            aVar2.setPositiveButton(lteConnectionActivity.getString(R.string.lte_install_app), new b(lteConnectionActivity, 1));
                            aVar2.setNegativeButton(lteConnectionActivity.getString(R.string.lte_go_to_website), new b(lteConnectionActivity, 2));
                            aVar2.setNeutralButton(lteConnectionActivity.getString(R.string.not_now_lbl), (DialogInterface.OnClickListener) null);
                            aVar2.create().show();
                        } else {
                            lteConnectionActivity.getPackageManager().getPackageInfo("com.vzw.hss.myverizon", 1);
                            Intent launchIntentForPackage = lteConnectionActivity.getPackageManager().getLaunchIntentForPackage("com.vzw.hss.myverizon");
                            if (launchIntentForPackage != null) {
                                lteConnectionActivity.startActivity(launchIntentForPackage);
                            }
                        }
                        break;
                    default:
                        LteConnectionActivity.a aVar3 = LteConnectionActivity.f38695j;
                        lteConnectionActivity.ga();
                        break;
                }
            }
        });
        textView.setText(getString(R.string.lte_set_up_description, getString(R.string.lbl_verizon)));
        ((TextView) findViewById(R.id.text_one)).setText(getString(R.string.lte_get_connected_with, getString(R.string.lbl_verizon)));
        ea(this, false);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        f<Object> fVar = this.f38699d;
        if (fVar != null) {
            fVar.getClass();
            fVar.a();
        }
        super.onDestroy();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(this.f38697b) || TextUtils.isEmpty(this.f38698c) || this.f38701f) {
            return;
        }
        GCMRunningProgressView gCMRunningProgressView = this.f38702g;
        if (gCMRunningProgressView != null) {
            gCMRunningProgressView.setVisibility(0);
        }
        getWindow().setFlags(16, 16);
        if (this.f38700e) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LteConnectionActivity", "*LTE* onResume - Activated - Skip Activation Status Check");
            AppCompatButton appCompatButton = this.f38703h;
            if (appCompatButton == null) {
                s.m("mConnectLteButton");
                throw null;
            }
            appCompatButton.setText(getString(R.string.lte_manage_connection, getString(R.string.lbl_verizon)));
            ha();
        } else {
            da();
        }
        this.f38701f = true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/LteConnectionActivity$a;", "", "<init>", "()V", "", "VZW_SDK_CALL", "I", "", "EXTRA_ICCID", "Ljava/lang/String;", "EXTRA_IMEI", "TAG", "DEVICE_ACTIVATED", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
