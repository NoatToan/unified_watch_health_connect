package com.garmin.androiddynamicsettings.app.presentationlayer;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b.j;
import c22.t;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import com.google.android.material.snackbar.Snackbar;
import e23.p;
import hi2.d;
import java.util.WeakHashMap;
import kh2.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "Li/c;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b extends i.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f50687j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50688k = View.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f50690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f50691c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Snackbar f50694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zh2.c f50695g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f50689a = new d("SettingsBaseActivity", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mh2.a f50692d = mh2.a.Back;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ci2.c f50693e = new ci2.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50696h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f50697i = true;

    /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.presentationlayer.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1020b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50698a;

        static {
            int[] iArr = new int[mh2.a.values().length];
            try {
                iArr[mh2.a.Back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mh2.a.CancelConfirm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50698a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends w implements p<DialogInterface, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f50699a = new c();

        public c() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            dialogInterface2.getClass();
            dialogInterface2.cancel();
            return Unit.INSTANCE;
        }
    }

    public static void Q9(b bVar, String str, mh2.a aVar, int i14) {
        boolean z14 = (i14 & 2) == 0;
        if ((i14 & 4) != 0) {
            aVar = mh2.a.Back;
        }
        d dVar = bVar.f50689a;
        str.getClass();
        aVar.getClass();
        bVar.f50692d = aVar;
        i.a supportActionBar = bVar.getSupportActionBar();
        Toolbar toolbar = (Toolbar) bVar.findViewById(R.id.toolbar);
        Toolbar toolbar2 = (Toolbar) bVar.findViewById(R.id.search_toolbar);
        if (supportActionBar == null) {
            if (z14) {
                bVar.setSupportActionBar(toolbar2);
                dVar.getClass();
            } else {
                bVar.setSupportActionBar(toolbar);
                dVar.getClass();
            }
            supportActionBar = bVar.getSupportActionBar();
        }
        StyledTextView styledTextView = (StyledTextView) toolbar.findViewById(R.id.toolbar_title_text_view);
        styledTextView.setText(str);
        Typeface typefaceCreate = Typeface.create(styledTextView.getTypeface(), 600, false);
        typefaceCreate.getClass();
        styledTextView.setTypeface(typefaceCreate);
        if (supportActionBar != null) {
            supportActionBar.r(16);
            supportActionBar.q(true);
            int i15 = C1020b.f50698a[aVar.ordinal()];
            if (i15 == 1) {
                zh2.e.f204807a.getClass();
                Integer num = zh2.e.f204812f.f204815b;
                supportActionBar.v(num != null ? num.intValue() : 0);
            } else if (i15 == 2) {
                zh2.e.f204807a.getClass();
                supportActionBar.v(zh2.e.f204812f.f204816c);
            }
            supportActionBar.E();
        }
        bVar.invalidateOptionsMenu();
    }

    public final void O9() {
        boolean zIsFinishing = isFinishing();
        d dVar = this.f50689a;
        if (zIsFinishing) {
            Logger logger = d.f83889c;
            dVar.getClass();
            return;
        }
        if (this.f50690b != null) {
            dVar.getClass();
            e eVar = this.f50690b;
            if (eVar == null) {
                s.m("progressDialog");
                throw null;
            }
            eVar.cancel();
        }
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.E();
        }
    }

    public final void P9() {
        this.f50689a.getClass();
        zh2.e.f204807a.getClass();
        int i14 = zh2.e.f204812f.f204814a;
        e.a aVar = new e.a(this);
        if (i14 > 0) {
            aVar.setView(i14);
        } else {
            aVar.setView(R.layout.dsl_loading_view);
        }
        e eVarCreate = aVar.create();
        eVarCreate.getClass();
        this.f50690b = eVarCreate;
        Window window = eVarCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        e eVar = this.f50690b;
        if (eVar == null) {
            s.m("progressDialog");
            throw null;
        }
        Window window2 = eVar.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        e eVar2 = this.f50690b;
        if (eVar2 == null) {
            s.m("progressDialog");
            throw null;
        }
        eVar2.setCancelable(this.f50697i);
        e eVar3 = this.f50690b;
        if (eVar3 == null) {
            s.m("progressDialog");
            throw null;
        }
        eVar3.setCanceledOnTouchOutside(false);
        e eVar4 = this.f50690b;
        if (eVar4 != null) {
            eVar4.setOnKeyListener(new ci2.d(this, 0));
        } else {
            s.m("progressDialog");
            throw null;
        }
    }

    public final void R9(boolean z14) {
        boolean zIsFinishing = isFinishing();
        d dVar = this.f50689a;
        if (zIsFinishing) {
            Logger logger = d.f83889c;
            dVar.getClass();
            return;
        }
        this.f50697i = z14;
        try {
            e eVar = this.f50690b;
            ci2.c cVar = this.f50693e;
            if (eVar != null) {
                eVar.setCancelable(z14);
                e eVar2 = this.f50690b;
                if (eVar2 == null) {
                    s.m("progressDialog");
                    throw null;
                }
                cVar.a(eVar2);
                dVar.getClass();
            } else {
                P9();
                e eVar3 = this.f50690b;
                if (eVar3 == null) {
                    s.m("progressDialog");
                    throw null;
                }
                cVar.a(eVar3);
            }
            i.a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.g();
            }
        } catch (Resources.NotFoundException unused) {
            Logger logger2 = d.f83889c;
            dVar.getClass();
        }
        FrameLayout frameLayout = this.f50691c;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        } else {
            s.m("contentFrame");
            throw null;
        }
    }

    public final boolean S9() {
        if (this.f50696h) {
            return true;
        }
        g.a aVar = g.f104792a;
        String string = getString(R.string.common_network_reachability_error);
        String string2 = getString(R.string.settings_try_again_internet);
        String string3 = getString(R.string.lbl_ok);
        string3.getClass();
        this.f50693e.a(g.a.a(aVar, this, string, string2, new o13.p(string3, c.f50699a), null, 496));
        this.f50689a.b("No Internet.");
        return false;
    }

    public final void hideProgressOverlay() {
        if (isFinishing()) {
            Logger logger = d.f83889c;
            this.f50689a.getClass();
            return;
        }
        O9();
        FrameLayout frameLayout = this.f50691c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        } else {
            s.m("contentFrame");
            throw null;
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        j.a(this);
        super.onCreate(bundle);
        zh2.e.f204807a.getClass();
        setRequestedOrientation(zh2.e.f204812f.f204823j);
        k13.a.f102397a = new bd0.e(new ci2.e(this), 11);
        this.f50695g = new zh2.c();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        zh2.c cVar = this.f50695g;
        if (cVar != null) {
            registerReceiver(cVar, intentFilter);
        } else {
            s.m("connectivityReceiver");
            throw null;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        super.onCreateOptionsMenu(menu);
        if (this.f50692d != mh2.a.CancelConfirm) {
            return true;
        }
        jh2.b.a(menu, this);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        zh2.c cVar = this.f50695g;
        if (cVar != null) {
            unregisterReceiver(cVar);
        }
        ci2.c cVar2 = this.f50693e;
        Dialog dialog = cVar2.f27688a;
        if (dialog != null) {
            dialog.dismiss();
        }
        cVar2.f27688a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        zh2.c cVar = this.f50695g;
        if (cVar != null) {
            cVar.f204805a = this;
        } else {
            s.m("connectivityReceiver");
            throw null;
        }
    }

    @Override // i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        super.setContentView(R.layout.dsl_device_settings_generic_layout_app_bar);
        View viewFindViewById = findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        this.f50691c = (FrameLayout) viewFindViewById;
        View viewInflate = LayoutInflater.from(this).inflate(i14, (ViewGroup) null);
        FrameLayout frameLayout = this.f50691c;
        if (frameLayout == null) {
            s.m("contentFrame");
            throw null;
        }
        frameLayout.addView(viewInflate);
        View viewFindViewById2 = findViewById(R.id.app_bar_container);
        t tVar = new t(26);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById2, tVar);
        s0.d.c(findViewById(android.R.id.content), new t(27));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/b$a;", "", "<init>", "()V", "", "SEMI_BOLD_FONT_WEIGHT", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
