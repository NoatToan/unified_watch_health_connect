package com.garmin.androiddynamicsettings.app.features.wifi.presenter;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import d53.k;
import e23.l;
import hi2.d;
import kh2.g;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/AddEditNetworkActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "<init>", "()V", "a", "b", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AddEditNetworkActivity extends com.garmin.androiddynamicsettings.app.presentationlayer.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f50647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f50648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yh2.a f50649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f50650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wh2.a f50651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public wh2.a f50652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f50653r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f50654t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f50655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f50656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public StyledTextView f50657x;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/AddEditNetworkActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        CreateManual,
        CreateFromScanned,
        EditExisting
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shouldLeave", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends w implements l<Boolean, Unit> {
        public c() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                AddEditNetworkActivity.super.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public AddEditNetworkActivity() {
        new d("AddEditNetworkActivity", null, 2, null);
        mh2.b.f118531a.getClass();
        int i14 = mh2.b.f118532b;
        int i15 = i14 + 1;
        mh2.b.f118532b = i15;
        this.f50647l = i14;
        mh2.b.f118532b = i14 + 2;
        this.f50648m = i15;
    }

    public static void U9() {
        e.f204807a.getClass();
        ((uc0.d) e.a()).h();
        throw null;
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        String string;
        super.onActivityResult(i14, i15, intent);
        if (i14 != this.f50647l) {
            if (i14 == this.f50648m) {
                String stringExtra = intent != null ? intent.getStringExtra("passwordKey") : null;
                wh2.a aVar = this.f50652q;
                if (aVar != null) {
                    this.f50652q = wh2.a.b(aVar, null, null, stringExtra, false, 11);
                    return;
                } else {
                    s.m("newNetwork");
                    throw null;
                }
            }
            return;
        }
        if (intent != null) {
            wh2.c cVar = wh2.c.values()[intent.getIntExtra("SelectableListActivity_selectedIndexKey", 0)];
            wh2.a aVar2 = this.f50652q;
            if (aVar2 == null) {
                s.m("newNetwork");
                throw null;
            }
            wh2.a aVarB = wh2.a.b(aVar2, null, cVar, null, false, 13);
            this.f50652q = aVarB;
            StyledTextView styledTextView = this.f50657x;
            if (styledTextView == null) {
                s.m("securityValue");
                throw null;
            }
            wh2.c cVar2 = aVarB.f185262b;
            cVar2.getClass();
            Resources resources = getResources();
            int i16 = wh2.b.f185265a[cVar2.ordinal()];
            if (i16 == 1) {
                string = resources.getString(R.string.wifi_security_none);
                string.getClass();
            } else if (i16 == 2) {
                string = resources.getString(R.string.wifi_wep);
                string.getClass();
            } else if (i16 == 3) {
                string = resources.getString(R.string.wifi_wpa);
                string.getClass();
            } else if (i16 != 4) {
                u0.r();
                return;
            } else {
                string = resources.getString(R.string.wifi_wpa_two);
                string.getClass();
            }
            styledTextView.setText(string);
            View view2 = this.f50655v;
            if (view2 == null) {
                s.m("passwordRow");
                throw null;
            }
            wh2.a aVar3 = this.f50652q;
            if (aVar3 == null) {
                s.m("newNetwork");
                throw null;
            }
            wh2.c cVar3 = aVar3.f185262b;
            cVar3.getClass();
            view2.setVisibility(cVar3 == wh2.c.None ? 8 : 0);
        }
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        wh2.a aVar = this.f50651p;
        wh2.a aVar2 = this.f50652q;
        if (aVar2 == null) {
            s.m("newNetwork");
            throw null;
        }
        if (s.g(aVar, aVar2)) {
            super.onBackPressed();
        } else {
            g.f104792a.d(this, new c());
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wh2.a aVar;
        super.onCreate(bundle);
        this.f50651p = (wh2.a) getIntent().getParcelableExtra("originalNetworkKey");
        if ((bundle == null || (aVar = (wh2.a) bundle.getParcelable("newNetworkKey")) == null) && (aVar = (wh2.a) getIntent().getParcelableExtra("newNetworkKey")) == null && (aVar = this.f50651p) == null) {
            aVar = new wh2.a("", wh2.c.Wpa2, null, false, 8, null);
        }
        this.f50652q = aVar;
        setContentView(R.layout.dsl_add_edit_network);
        this.f50649n = (yh2.a) new x1(this).b(s0.f105811a.b(yh2.a.class));
        View viewFindViewById = findViewById(R.id.top_section_container);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.name_row);
        viewFindViewById2.getClass();
        this.f50653r = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.security_row);
        viewFindViewById3.getClass();
        this.f50654t = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.security_value);
        viewFindViewById4.getClass();
        this.f50657x = (StyledTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.password_row);
        viewFindViewById5.getClass();
        this.f50655v = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.location_row);
        viewFindViewById6.getClass();
        this.f50656w = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.test_row);
        viewFindViewById7.getClass();
        View viewFindViewById8 = findViewById(R.id.forget_row);
        viewFindViewById8.getClass();
        wh2.a aVar2 = this.f50651p;
        if (aVar2 != null) {
            this.f50650o = b.EditExisting;
        } else {
            if (!getIntent().hasExtra("newNetworkKey")) {
                this.f50650o = b.CreateManual;
                U9();
                throw null;
            }
            this.f50650o = b.CreateFromScanned;
            aVar2 = this.f50652q;
            if (aVar2 == null) {
                s.m("newNetwork");
                throw null;
            }
        }
        com.garmin.androiddynamicsettings.app.presentationlayer.b.Q9(this, aVar2.f185261a, mh2.a.CancelConfirm, 2);
        U9();
        throw null;
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        com.garmin.androiddynamicsettings.app.presentationlayer.b.f50687j.getClass();
        if (itemId != com.garmin.androiddynamicsettings.app.presentationlayer.b.f50688k) {
            return super.onOptionsItemSelected(menuItem);
        }
        wh2.a aVar = this.f50652q;
        if (aVar == null) {
            s.m("newNetwork");
            throw null;
        }
        if (d53.w.J(aVar.f185261a)) {
            U9();
            throw null;
        }
        wh2.a aVar2 = this.f50652q;
        if (aVar2 == null) {
            s.m("newNetwork");
            throw null;
        }
        wh2.c cVar = aVar2.f185262b;
        cVar.getClass();
        wh2.c cVar2 = wh2.c.None;
        if (cVar != cVar2) {
            wh2.a aVar3 = this.f50652q;
            if (aVar3 == null) {
                s.m("newNetwork");
                throw null;
            }
            String str = aVar3.f185263c;
            if (str == null || d53.w.J(str)) {
                U9();
                throw null;
            }
            hi2.g gVar = hi2.g.f83904a;
            wh2.a aVar4 = this.f50652q;
            if (aVar4 == null) {
                s.m("newNetwork");
                throw null;
            }
            wh2.c cVar3 = aVar4.f185262b;
            gVar.getClass();
            cVar3.getClass();
            if (cVar3 == cVar2 || str.length() != 0) {
                int length = str.length();
                if (cVar3 != wh2.c.Wep) {
                }
            }
            U9();
            throw null;
        }
        b bVar = this.f50650o;
        if (bVar == null) {
            s.m("mode");
            throw null;
        }
        if (bVar == b.EditExisting) {
            wh2.a aVar5 = this.f50652q;
            if (aVar5 == null) {
                s.m("newNetwork");
                throw null;
            }
            if (aVar5.equals(this.f50651p)) {
                finish();
                return true;
            }
        }
        wh2.a aVar6 = this.f50652q;
        if (aVar6 == null) {
            s.m("newNetwork");
            throw null;
        }
        String str2 = aVar6.f185263c;
        boolean zD = false;
        if (str2 != null) {
            hi2.g gVar2 = hi2.g.f83904a;
            wh2.c cVar4 = aVar6.f185262b;
            gVar2.getClass();
            k kVar = hi2.g.f83905b;
            cVar4.getClass();
            if (str2.length() > 0) {
                if (cVar4 == wh2.c.Wep) {
                    if (str2.length() == 10 || str2.length() == 26) {
                        zD = kVar.d(str2);
                    }
                } else if ((cVar4 == wh2.c.Wpa || cVar4 == wh2.c.Wpa2) && str2.length() == 64) {
                    zD = kVar.d(str2);
                }
            }
        }
        this.f50652q = wh2.a.b(aVar6, null, null, null, zD, 7);
        if (this.f50649n != null) {
            U9();
            throw null;
        }
        s.m("viewModel");
        throw null;
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        wh2.a aVar = this.f50652q;
        if (aVar == null) {
            s.m("newNetwork");
            throw null;
        }
        bundle.putParcelable("newNetworkKey", aVar);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/AddEditNetworkActivity$a;", "", "<init>", "()V", "", "newNetworkKey", "Ljava/lang/String;", "originalNetworkKey", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
