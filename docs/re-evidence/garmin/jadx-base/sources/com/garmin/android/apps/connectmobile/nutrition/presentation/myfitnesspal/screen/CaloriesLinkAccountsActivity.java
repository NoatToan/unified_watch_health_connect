package com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.CaloriesLinkAccountsActivity;
import com.google.firebase.messaging.Constants;
import com.myfitnesspal.android.sdk.MfpAuthError;
import d20.f;
import d53.w;
import e23.l;
import fw.p;
import i3.e5;
import ig1.l0;
import lc.u0;
import o13.h;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import q92.x;
import vz2.g;
import vz2.i;
import xk1.v;
import z10.d1;
import z10.e1;
import z10.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/CaloriesLinkAccountsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CaloriesLinkAccountsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f39595i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CaloriesLinkAccountsActivity f39596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f39597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f39598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f39599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e1 f39600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a21.c f39601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z11.a f39602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z11.a f39603h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39604a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39604a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/CaloriesLinkAccountsActivity$c", "Lvz2/d;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements vz2.d {
        public c() {
        }

        @Override // vz2.d
        public final void a(Bundle bundle) {
            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "onComplete");
            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = CaloriesLinkAccountsActivity.this;
            caloriesLinkAccountsActivity.showProgressOverlay(caloriesLinkAccountsActivity.getString(R.string.calories_link_accounts_button_linking));
            a21.c cVar = caloriesLinkAccountsActivity.f39601f;
            cVar.getClass();
            f0.N(new a21.b(cVar, new MyFitnessPalUserAuthDTO(bundle.getString("code")), null)).f(caloriesLinkAccountsActivity, caloriesLinkAccountsActivity.f39603h);
        }

        @Override // vz2.d
        public final void b(Bundle bundle) {
            bundle.getClass();
        }

        @Override // vz2.d
        public final void c(MfpAuthError mfpAuthError) {
            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "MFP Error: " + mfpAuthError.getMessage());
            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = CaloriesLinkAccountsActivity.this;
            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity2 = caloriesLinkAccountsActivity.f39596a;
            caloriesLinkAccountsActivity2.getClass();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(caloriesLinkAccountsActivity2);
            aVar.setMessage(R.string.calories_error_cannot_upload_auth).setTitle("");
            aVar.setPositiveButton(android.R.string.ok, new z11.b(caloriesLinkAccountsActivity, 2));
            androidx.appcompat.app.e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }

        @Override // vz2.d
        public final void d(g gVar) {
            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "General Linking Error: " + gVar.getMessage());
            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = CaloriesLinkAccountsActivity.this;
            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity2 = caloriesLinkAccountsActivity.f39596a;
            caloriesLinkAccountsActivity2.getClass();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(caloriesLinkAccountsActivity2);
            aVar.setMessage(R.string.calories_error_cannot_upload_auth).setTitle("");
            aVar.setPositiveButton(android.R.string.ok, new z11.b(caloriesLinkAccountsActivity, 1));
            androidx.appcompat.app.e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/CaloriesLinkAccountsActivity$d", "Landroid/text/style/ClickableSpan;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends ClickableSpan {
        public d() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            a aVar = CaloriesLinkAccountsActivity.f39595i;
            CaloriesLinkAccountsActivity.this.da();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f39607a;

        public e(l lVar) {
            lVar.getClass();
            this.f39607a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f39607a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39607a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z11.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [z11.a] */
    public CaloriesLinkAccountsActivity() {
        final int i14 = 0;
        this.f39602g = new z0(this) { // from class: z11.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaloriesLinkAccountsActivity f201352b;

            {
                this.f201352b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = this.f201352b;
                g3 g3Var = (g3) obj;
                switch (i15) {
                    case 0:
                        CaloriesLinkAccountsActivity.a aVar = CaloriesLinkAccountsActivity.f39595i;
                        g3Var.getClass();
                        p pVar = g3Var.f35300a;
                        MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO = (MyFitnessPalUserAuthDTO) g3Var.f35301b;
                        int i16 = CaloriesLinkAccountsActivity.b.f39604a[pVar.ordinal()];
                        if (i16 == 1) {
                            caloriesLinkAccountsActivity.hideProgressOverlay();
                            f12.l.f68084a.getClass();
                            f12.l lVarA = f12.l.a.a();
                            myFitnessPalUserAuthDTO.getClass();
                            lVarA.p4(myFitnessPalUserAuthDTO.C());
                            if (!myFitnessPalUserAuthDTO.C()) {
                                e.a aVar2 = new e.a(caloriesLinkAccountsActivity);
                                aVar2.setMessage(R.string.msg_my_fitness_pal_already_connected);
                                aVar2.setNeutralButton(R.string.lbl_ok, new v(21)).show();
                            } else {
                                f12.l.a.a().T3(true);
                                caloriesLinkAccountsActivity.setResult(-1, new Intent("MY_FITNESS_PAL"));
                                caloriesLinkAccountsActivity.finish();
                            }
                            break;
                        } else if (i16 == 2) {
                            caloriesLinkAccountsActivity.hideProgressOverlay();
                            if (caloriesLinkAccountsActivity.hasInternetConnection()) {
                                Toast.makeText(caloriesLinkAccountsActivity, R.string.txt_error_occurred, 0).show();
                            }
                            break;
                        } else if (i16 != 3) {
                            u0.r();
                            break;
                        }
                        break;
                    default:
                        CaloriesLinkAccountsActivity.a aVar3 = CaloriesLinkAccountsActivity.f39595i;
                        g3Var.getClass();
                        int i17 = CaloriesLinkAccountsActivity.b.f39604a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "SetUserAuthCallback - onDataLoaded");
                            caloriesLinkAccountsActivity.setResult(-1);
                            a21.c cVar = caloriesLinkAccountsActivity.f39601f;
                            cVar.getClass();
                            f0.N(new a21.a(cVar, null)).f(caloriesLinkAccountsActivity, caloriesLinkAccountsActivity.f39602g);
                            break;
                        } else if (i17 == 2) {
                            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "SetUserAuthCallback - onDataLoadFailed");
                            caloriesLinkAccountsActivity.hideProgressOverlay();
                            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity2 = caloriesLinkAccountsActivity.f39596a;
                            caloriesLinkAccountsActivity2.getClass();
                            e.a aVar4 = new e.a(caloriesLinkAccountsActivity2);
                            aVar4.setMessage(R.string.calories_error_cannot_upload_auth).setTitle("");
                            aVar4.setPositiveButton(R.string.lbl_try_again, new b(caloriesLinkAccountsActivity, 0));
                            aVar4.setNegativeButton(android.R.string.cancel, new v(22));
                            e eVarCreate = aVar4.create();
                            eVarCreate.getClass();
                            eVarCreate.show();
                            break;
                        } else if (i17 != 3) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f39603h = new z0(this) { // from class: z11.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaloriesLinkAccountsActivity f201352b;

            {
                this.f201352b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = this.f201352b;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        CaloriesLinkAccountsActivity.a aVar = CaloriesLinkAccountsActivity.f39595i;
                        g3Var.getClass();
                        p pVar = g3Var.f35300a;
                        MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO = (MyFitnessPalUserAuthDTO) g3Var.f35301b;
                        int i17 = CaloriesLinkAccountsActivity.b.f39604a[pVar.ordinal()];
                        if (i17 == 1) {
                            caloriesLinkAccountsActivity.hideProgressOverlay();
                            f12.l.f68084a.getClass();
                            f12.l lVarA = f12.l.a.a();
                            myFitnessPalUserAuthDTO.getClass();
                            lVarA.p4(myFitnessPalUserAuthDTO.C());
                            if (!myFitnessPalUserAuthDTO.C()) {
                                e.a aVar2 = new e.a(caloriesLinkAccountsActivity);
                                aVar2.setMessage(R.string.msg_my_fitness_pal_already_connected);
                                aVar2.setNeutralButton(R.string.lbl_ok, new v(21)).show();
                            } else {
                                f12.l.a.a().T3(true);
                                caloriesLinkAccountsActivity.setResult(-1, new Intent("MY_FITNESS_PAL"));
                                caloriesLinkAccountsActivity.finish();
                            }
                            break;
                        } else if (i17 == 2) {
                            caloriesLinkAccountsActivity.hideProgressOverlay();
                            if (caloriesLinkAccountsActivity.hasInternetConnection()) {
                                Toast.makeText(caloriesLinkAccountsActivity, R.string.txt_error_occurred, 0).show();
                            }
                            break;
                        } else if (i17 != 3) {
                            u0.r();
                            break;
                        }
                        break;
                    default:
                        CaloriesLinkAccountsActivity.a aVar3 = CaloriesLinkAccountsActivity.f39595i;
                        g3Var.getClass();
                        int i18 = CaloriesLinkAccountsActivity.b.f39604a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "SetUserAuthCallback - onDataLoaded");
                            caloriesLinkAccountsActivity.setResult(-1);
                            a21.c cVar = caloriesLinkAccountsActivity.f39601f;
                            cVar.getClass();
                            f0.N(new a21.a(cVar, null)).f(caloriesLinkAccountsActivity, caloriesLinkAccountsActivity.f39602g);
                            break;
                        } else if (i18 == 2) {
                            i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "SetUserAuthCallback - onDataLoadFailed");
                            caloriesLinkAccountsActivity.hideProgressOverlay();
                            CaloriesLinkAccountsActivity caloriesLinkAccountsActivity2 = caloriesLinkAccountsActivity.f39596a;
                            caloriesLinkAccountsActivity2.getClass();
                            e.a aVar4 = new e.a(caloriesLinkAccountsActivity2);
                            aVar4.setMessage(R.string.calories_error_cannot_upload_auth).setTitle("");
                            aVar4.setPositiveButton(R.string.lbl_try_again, new b(caloriesLinkAccountsActivity, 0));
                            aVar4.setNegativeButton(android.R.string.cancel, new v(22));
                            e eVarCreate = aVar4.create();
                            eVarCreate.getClass();
                            eVarCreate.show();
                            break;
                        } else if (i18 != 3) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final String ca(int i14) {
        return oi0.d.a(this, getString(i14), new l0(17));
    }

    public final void da() {
        if (d1.f()) {
            d1.o(this, new v(12));
            return;
        }
        f fVar = this.f39599d;
        s92.g gVar = fVar != null ? fVar.f57283a : null;
        if (gVar != null) {
            showProgressOverlay();
            e1 e1Var = this.f39600e;
            if (e1Var != null) {
                x xVar = x.DI_CONNECT_MYFITNESSPAL;
                xVar.getClass();
                y0 y0Var = new y0();
                ge1.b.T(v1.a(e1Var), null, null, new j1(y0Var, xVar, gVar, null), 3);
                y0Var.f(this, new e(new yw2.h(this, 3)));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i14, i15, intent);
        if (788 == i14) {
            i iVar = this.f39597b;
            iVar.getClass();
            wz2.a.a("auth callback: req = %s, result = %s", Integer.valueOf(i14), Integer.valueOf(i15));
            if (i14 == iVar.f180952h) {
                if (i15 != -1) {
                    if (i15 != 0) {
                        return;
                    }
                    if (intent == null) {
                        iVar.c(null);
                        return;
                    }
                    wz2.a.a("Login failed: " + intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR), new Object[0]);
                    iVar.f180953i.d(new g(intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR), intent.getIntExtra("error_code", -1), intent.getStringExtra("failing_url")));
                    return;
                }
                Uri data = intent.getData();
                if (data != null) {
                    bundle = wz2.b.a(data.getQuery());
                    bundle.putAll(wz2.b.a(data.getFragment()));
                } else {
                    bundle = new Bundle();
                }
                String string = bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                if (string == null) {
                    iVar.d(bundle);
                    return;
                }
                if (!string.equals("service_disabled")) {
                    if (string.equals("access_denied")) {
                        iVar.c(bundle);
                        return;
                    }
                    String string2 = bundle.getString("error_description");
                    if (string2 != null) {
                        string = e5.g(string, ":", string2);
                    }
                    iVar.b(new MfpAuthError(string));
                    return;
                }
                wz2.a.a("Hosted auth currently disabled. Retrying dialog auth...", new Object[0]);
                Activity activity = iVar.f180951g;
                CookieSyncManager.createInstance(activity);
                vz2.h hVar = new vz2.h(iVar);
                Bundle bundle2 = new Bundle();
                if (activity.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
                    new vz2.f(activity, "authorize", iVar.f180950f, bundle2, hVar).show();
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle("Error");
                builder.setMessage("Application requires permission to access the Internet");
                builder.create().show();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        this.f39596a = this;
        setContentView(R.layout.gcm_calories_link_mfp);
        super.initActionBar(true, getIntent().getBooleanExtra("myFitnessPal", false) ? R.string.lbl_my_fitness_pal : R.string.main_menu_CaloriesInOut_title);
        ((TextView) findViewById(R.id.setup_myfitnesspal)).setContentDescription(ca(R.string.calories_link_accounts_setup));
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("CONSENT_THIRD_PARTY_DTO", f.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("CONSENT_THIRD_PARTY_DTO") : null;
            if (!(parcelableExtra instanceof f)) {
                parcelableExtra = null;
            }
            parcelable = (f) parcelableExtra;
        }
        this.f39599d = (f) parcelable;
        x1 x1Var = new x1(this);
        t0 t0Var = s0.f105811a;
        this.f39600e = (e1) x1Var.b(t0Var.b(e1.class));
        this.f39601f = (a21.c) new x1(this).b(t0Var.b(a21.c.class));
        String string = getResources().getString(R.string.myfitnesspal_api_key);
        string.getClass();
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).D()) {
            string = getResources().getString(R.string.myfitnesspal_api_key_dev);
            string.getClass();
        }
        this.f39597b = new i(string);
        this.f39598c = new c();
        TextView textView = (TextView) findViewById(R.id.mfp_link_text2);
        String string2 = textView.getText().toString();
        String string3 = getResources().getString(R.string.lbl_my_fitness_pal);
        string3.getClass();
        int iH = w.H(string2, string3, 0, false, 6);
        int length = getResources().getString(R.string.lbl_my_fitness_pal).length() + iH;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(textView.getText().toString(), TextView.BufferType.SPANNABLE);
        textView.setContentDescription(ca(R.string.calories_link_accounts_step1));
        CharSequence text = textView.getText();
        text.getClass();
        ((Spannable) text).setSpan(new d(), iH, length, 33);
        ((TextView) findViewById(R.id.mfp_link_accounts2)).setContentDescription(ca(R.string.calories_link_accounts_step2));
        ((TextView) findViewById(R.id.mfp_link_accounts3)).setContentDescription(ca(R.string.calories_link_accounts_step3));
        ((Button) findViewById(R.id.btn_code)).setOnClickListener(new xp0.d(this, 19));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/CaloriesLinkAccountsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_THIRD_PARTY_DTO", "EXTRA_MY_FITNESS_PAL_FLAG", "", "REQUEST_CODE", "I", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
