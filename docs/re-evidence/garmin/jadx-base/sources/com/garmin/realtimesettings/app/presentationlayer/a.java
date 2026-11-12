package com.garmin.realtimesettings.app.presentationlayer;

import android.app.Dialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.g1;
import androidx.lifecycle.x1;
import b.j;
import ci2.d;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializerActivity;
import cx2.h;
import java.util.WeakHashMap;
import l73.k;
import o13.m;
import o13.p;
import o13.t;
import org.greenrobot.eventbus.ThreadMode;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import yc.l2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/a;", "Li/c;", "", "<init>", "()V", "Lxw2/c;", "event", "", "abruptRTSExit", "(Lxw2/c;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class a extends i.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f52606o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f52608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f52609c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tw2.b f52611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public tw2.a f52612f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f52614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f52615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f52616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f52617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f52618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f52619m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f52607a = new h("SettingsBaseActivity", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yw2.a f52610d = new yw2.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52613g = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f52620n = true;

    static {
        new C1127a(null);
        View.generateViewId();
    }

    public a() {
        final int i14 = 0;
        this.f52614h = m.b(new e23.a(this) { // from class: yw2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.a f199994b;

            {
                this.f199994b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.realtimesettings.app.presentationlayer.a aVar = this.f199994b;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Toolbar) aVar.findViewById(R.id.toolbar);
                    case 1:
                        int i17 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_title_text_view);
                    case 2:
                        int i18 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_left_text_view);
                    case 3:
                        int i19 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_start_guideline);
                    case 4:
                        int i24 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_end_guideline);
                    default:
                        int i25 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return aVar.findViewById(R.id.action_bar_divider);
                }
            }
        });
        final int i15 = 1;
        this.f52615i = m.b(new e23.a(this) { // from class: yw2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.a f199994b;

            {
                this.f199994b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.realtimesettings.app.presentationlayer.a aVar = this.f199994b;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Toolbar) aVar.findViewById(R.id.toolbar);
                    case 1:
                        int i18 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_title_text_view);
                    case 2:
                        int i19 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_left_text_view);
                    case 3:
                        int i110 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_start_guideline);
                    case 4:
                        int i24 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_end_guideline);
                    default:
                        int i25 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return aVar.findViewById(R.id.action_bar_divider);
                }
            }
        });
        final int i16 = 2;
        this.f52616j = m.b(new e23.a(this) { // from class: yw2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.a f199994b;

            {
                this.f199994b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                com.garmin.realtimesettings.app.presentationlayer.a aVar = this.f199994b;
                switch (i17) {
                    case 0:
                        int i18 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Toolbar) aVar.findViewById(R.id.toolbar);
                    case 1:
                        int i19 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_title_text_view);
                    case 2:
                        int i110 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_left_text_view);
                    case 3:
                        int i111 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_start_guideline);
                    case 4:
                        int i24 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_end_guideline);
                    default:
                        int i25 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return aVar.findViewById(R.id.action_bar_divider);
                }
            }
        });
        final int i17 = 3;
        this.f52617k = m.b(new e23.a(this) { // from class: yw2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.a f199994b;

            {
                this.f199994b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                com.garmin.realtimesettings.app.presentationlayer.a aVar = this.f199994b;
                switch (i18) {
                    case 0:
                        int i19 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Toolbar) aVar.findViewById(R.id.toolbar);
                    case 1:
                        int i110 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_title_text_view);
                    case 2:
                        int i111 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_left_text_view);
                    case 3:
                        int i112 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_start_guideline);
                    case 4:
                        int i24 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_end_guideline);
                    default:
                        int i25 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return aVar.findViewById(R.id.action_bar_divider);
                }
            }
        });
        final int i18 = 4;
        this.f52618l = m.b(new e23.a(this) { // from class: yw2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.a f199994b;

            {
                this.f199994b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                com.garmin.realtimesettings.app.presentationlayer.a aVar = this.f199994b;
                switch (i19) {
                    case 0:
                        int i110 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Toolbar) aVar.findViewById(R.id.toolbar);
                    case 1:
                        int i111 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_title_text_view);
                    case 2:
                        int i112 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_left_text_view);
                    case 3:
                        int i113 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_start_guideline);
                    case 4:
                        int i24 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_end_guideline);
                    default:
                        int i25 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return aVar.findViewById(R.id.action_bar_divider);
                }
            }
        });
        final int i19 = 5;
        this.f52619m = m.b(new e23.a(this) { // from class: yw2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.a f199994b;

            {
                this.f199994b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                com.garmin.realtimesettings.app.presentationlayer.a aVar = this.f199994b;
                switch (i110) {
                    case 0:
                        int i111 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Toolbar) aVar.findViewById(R.id.toolbar);
                    case 1:
                        int i112 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_title_text_view);
                    case 2:
                        int i113 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (StyledTextView) aVar.findViewById(R.id.toolbar_left_text_view);
                    case 3:
                        int i114 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_start_guideline);
                    case 4:
                        int i24 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return (Guideline) aVar.findViewById(R.id.toolbar_end_guideline);
                    default:
                        int i25 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        return aVar.findViewById(R.id.action_bar_divider);
                }
            }
        });
    }

    public final StyledTextView O9() {
        Object value = this.f52616j.getValue();
        value.getClass();
        return (StyledTextView) value;
    }

    public final StyledTextView P9() {
        Object value = this.f52615i.getValue();
        value.getClass();
        return (StyledTextView) value;
    }

    public final void Q9() {
        this.f52607a.getClass();
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        int i14 = com.garmin.realtimesettings.app.initialization.b.c().f192454b.f192458a;
        e.a aVar = new e.a(this);
        if (i14 > 0) {
            aVar.setView(i14);
        } else {
            aVar.setView(R.layout.rts_loading_view);
        }
        e eVarCreate = aVar.create();
        eVarCreate.getClass();
        this.f52608b = eVarCreate;
        Window window = eVarCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        e eVar = this.f52608b;
        if (eVar == null) {
            s.m("progressDialog");
            throw null;
        }
        Window window2 = eVar.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        e eVar2 = this.f52608b;
        if (eVar2 == null) {
            s.m("progressDialog");
            throw null;
        }
        eVar2.setCancelable(this.f52620n);
        e eVar3 = this.f52608b;
        if (eVar3 == null) {
            s.m("progressDialog");
            throw null;
        }
        eVar3.setCanceledOnTouchOutside(false);
        e eVar4 = this.f52608b;
        if (eVar4 != null) {
            eVar4.setOnKeyListener(new d(this, 2));
        } else {
            s.m("progressDialog");
            throw null;
        }
    }

    public final void R9(boolean z14) {
        this.f52607a.getClass();
        if (z14) {
            ((dx2.a) new x1(this).b(s0.f105811a.b(dx2.a.class))).f61482a.j(Boolean.valueOf(z14));
        }
    }

    public final void S9(String str) {
        str.getClass();
        t tVar = this.f52614h;
        Object value = tVar.getValue();
        value.getClass();
        setSupportActionBar((Toolbar) value);
        Object value2 = tVar.getValue();
        value2.getClass();
        l2 l2Var = new l2(9);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c((Toolbar) value2, l2Var);
        androidx.core.view.s0.d.c(findViewById(android.R.id.content), new l2(10));
        this.f52607a.getClass();
        i.a supportActionBar = getSupportActionBar();
        P9().setText(str);
        P9().setContentDescription(getString(R.string.rts_lbl_heading, str));
        StyledTextView styledTextViewP9 = P9();
        Typeface typefaceCreate = Typeface.create(styledTextViewP9.getTypeface(), 600, false);
        typefaceCreate.getClass();
        styledTextViewP9.setTypeface(typefaceCreate);
        if (supportActionBar != null) {
            supportActionBar.r(16);
            T9(false, false);
            supportActionBar.E();
        }
        invalidateOptionsMenu();
    }

    public final void T9(boolean z14, boolean z15) {
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(!z14);
        }
        t tVar = this.f52617k;
        if (z14) {
            O9().setVisibility(0);
            P9().setGravity(17);
            Object value = tVar.getValue();
            value.getClass();
            ((Guideline) value).setGuidelinePercent(0.25f);
        } else {
            O9().setVisibility(8);
            P9().setGravity(8388611);
            Object value2 = tVar.getValue();
            value2.getClass();
            ((Guideline) value2).setGuidelinePercent(0.0f);
        }
        t tVar2 = this.f52618l;
        if (z15) {
            Object value3 = tVar2.getValue();
            value3.getClass();
            ((Guideline) value3).setGuidelinePercent(1.0f);
        } else {
            Object value4 = tVar2.getValue();
            value4.getClass();
            ((Guideline) value4).setGuidelinePercent(0.75f);
        }
    }

    public final boolean U9() {
        if (this.f52613g) {
            return true;
        }
        ew2.e.a aVar = ew2.e.f66901a;
        String string = getString(R.string.common_network_reachability_error);
        String string2 = getString(R.string.settings_internet_lost_reconnect);
        String string3 = getString(R.string.lbl_ok);
        string3.getClass();
        this.f52610d.a(this, ew2.e.a.a(aVar, this, string, string2, new p(string3, new yu1.a((byte) 0, 4)), null, 1008));
        this.f52607a.d(null, "No Internet.");
        return false;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void abruptRTSExit(xw2.c event) {
        event.getClass();
        Logger logger = h.f56678c;
        this.f52607a.getClass();
        Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
        RealTimeSettingsInitializerActivity.f52581r.getClass();
        Intent intent = new Intent(this, (Class<?>) RealTimeSettingsInitializerActivity.class);
        intent.putExtra("RealTimeSettingInitializer_Initialize_Settings", false);
        intent.setFlags(268435456);
        intent.setFlags(67108864);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        j.a(this);
        super.onCreate(bundle);
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        if (com.garmin.realtimesettings.app.initialization.b.f52592d != null) {
            setRequestedOrientation(com.garmin.realtimesettings.app.initialization.b.c().f192454b.f192461d);
            this.f52611e = new tw2.b();
            this.f52612f = new tw2.a();
        } else {
            this.f52607a.d(null, "No device options");
            ew2.e.a aVar = ew2.e.f66901a;
            String string = getString(R.string.txt_something_went_wrong_try_again);
            string.getClass();
            ew2.e.a.d(aVar, this, string);
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onDestroy() {
        yw2.a aVar = this.f52610d;
        Dialog dialog = aVar.f199990b;
        if (dialog != null) {
            dialog.dismiss();
        }
        aVar.f199990b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            getOnBackPressedDispatcher().d();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f52607a.getClass();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        tw2.b bVar = this.f52611e;
        if (bVar == null) {
            s.m("networkConnectivityReceiver");
            throw null;
        }
        registerReceiver(bVar, intentFilter);
        tw2.b bVar2 = this.f52611e;
        if (bVar2 == null) {
            s.m("networkConnectivityReceiver");
            throw null;
        }
        bVar2.f166804a = this;
        tw2.a aVar = this.f52612f;
        if (aVar == null) {
            s.m("deviceConnectivityReceiver");
            throw null;
        }
        da2.d.b().f58886a.b(aVar.f166801b);
        aVar.f166800a = this;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        l73.c.b().i(this);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        l73.c.b().k(this);
        super.onStop();
        h hVar = this.f52607a;
        hVar.getClass();
        try {
            tw2.b bVar = this.f52611e;
            if (bVar != null) {
                unregisterReceiver(bVar);
            }
        } catch (Exception e4) {
            hVar.d(null, "Received exception to unregister " + e4);
        }
        try {
            tw2.a aVar = this.f52612f;
            if (aVar != null) {
                da2.d.b().f58886a.i(aVar.f166801b);
                aVar.f166800a = null;
            }
        } catch (Exception e14) {
            hVar.d(null, "Received exception to unregister " + e14);
        }
    }

    @Override // i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        super.setContentView(R.layout.rts_device_settings_generic_layout_app_bar);
        View viewFindViewById = findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        this.f52609c = (FrameLayout) viewFindViewById;
        View viewInflate = LayoutInflater.from(this).inflate(i14, (ViewGroup) null);
        FrameLayout frameLayout = this.f52609c;
        if (frameLayout != null) {
            frameLayout.addView(viewInflate);
        } else {
            s.m("contentFrame");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.realtimesettings.app.presentationlayer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/a$a;", "", "<init>", "()V", "", "SUPPORT_CENTER_URL", "Ljava/lang/String;", "", "CENTER_MENU_START_GUIDELINE", "F", "DEFAULT_MENU_START_GUIDELINE", "CENTER_MENU_END_GUIDELINE", "DEFAULT_MENU_END_GUIDELINE", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1127a {
        public /* synthetic */ C1127a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1127a() {
        }
    }
}
