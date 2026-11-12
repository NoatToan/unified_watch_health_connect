package com.garmin.android.apps.connectmobile.jet_lag.presentation.edit;

import a61.i;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import e23.l;
import fw.p;
import g.h;
import i3.f2;
import is0.k;
import java.util.List;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/TripDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TripDetailsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37000i = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public os0.c f37002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MenuItem f37003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f37004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuItem f37005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f37006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37007g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37001a = new w1(s0.f105811a.b(k.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f37008h = registerForActivityResult(new h(), new i(this, 28));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37009a;

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
            f37009a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37010a;

        public c(l lVar) {
            lVar.getClass();
            this.f37010a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37010a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37010a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f37011a;

        public d(g gVar) {
            this.f37011a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37011a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f37012a;

        public e(g gVar) {
            this.f37012a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37012a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f37014b;

        public f(e23.a aVar, g gVar) {
            this.f37013a = aVar;
            this.f37014b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37013a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37014b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final k ca() {
        return (k) this.f37001a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // b.g, androidx.lifecycle.y
    public final x1.c getDefaultViewModelProviderFactory() {
        List parcelableArrayList;
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        o oVar = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRA_SELECTED_TRIP", o.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("EXTRA_SELECTED_TRIP");
                parcelable = (o) (parcelable2 instanceof o ? parcelable2 : null);
            }
            oVar = (o) parcelable;
        }
        if (extras == null) {
            parcelableArrayList = j0.f134944a;
        } else {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("EXTRA_TRIPS", o.class) : extras.getParcelableArrayList("EXTRA_TRIPS");
            if (parcelableArrayList == null) {
                parcelableArrayList = j0.f134944a;
            }
        }
        return new is0.l(oVar, parcelableArrayList);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.trip_details_activity);
        initActionBar(true, R.string.lbl_trip_details);
        View viewFindViewById = findViewById(R.id.root_view);
        viewFindViewById.getClass();
        os0.c cVar = new os0.c((ConstraintLayout) viewFindViewById, new ik2.b(10));
        this.f37002b = cVar;
        cVar.a(ca().f94939a);
        ca().f94942d.f(this, new c(new ho0.g(this, 27)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem menuItemAdd = menu != null ? menu.add(0, 112, 0, R.string.lbl_edit_trip) : null;
        this.f37003c = menuItemAdd;
        if (menuItemAdd != null) {
            menuItemAdd.setShowAsActionFlags(0);
        }
        MenuItem menuItem = this.f37003c;
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        MenuItem menuItemAdd2 = menu != null ? menu.add(0, 113, 0, R.string.lbl_view_group_calendar) : null;
        this.f37004d = menuItemAdd2;
        if (menuItemAdd2 != null) {
            menuItemAdd2.setShowAsActionFlags(0);
        }
        MenuItem menuItem2 = this.f37004d;
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        MenuItem menuItemAdd3 = menu != null ? menu.add(0, 114, 0, R.string.lbl_help) : null;
        this.f37005e = menuItemAdd3;
        if (menuItemAdd3 != null) {
            menuItemAdd3.setShowAsActionFlags(0);
        }
        MenuItem menuItem3 = this.f37005e;
        if (menuItem3 != null) {
            menuItem3.setVisible(true);
        }
        MenuItem menuItemAdd4 = menu != null ? menu.add(0, 115, 0, R.string.lbl_delete_trip) : null;
        this.f37006f = menuItemAdd4;
        if (menuItemAdd4 != null) {
            menuItemAdd4.setShowAsActionFlags(0);
        }
        MenuItem menuItem4 = this.f37006f;
        if (menuItem4 != null) {
            menuItem4.setVisible(true);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (this.f37007g) {
            setResult(-1);
            finish();
        } else {
            onBackPressed();
        }
        return super.onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        LocalDate localDateNow;
        boolean zQ;
        menuItem.getClass();
        switch (menuItem.getItemId()) {
            case 112:
                this.f37008h.a(TripSetupActivity.a.a(TripSetupActivity.f37081g, this, ca().f94939a, ca().f94940b, false, false, 24), null);
                break;
            case 113:
                if (ca().f94939a != null) {
                    o oVar = ca().f94939a;
                    if (oVar == null || (localDateNow = oVar.d()) == null) {
                        localDateNow = LocalDate.now();
                    }
                    localDateNow.getClass();
                } else {
                    localDateNow = LocalDate.now();
                    localDateNow.getClass();
                }
                ((bs0.a) KoinJavaComponent.get$default(bs0.a.class, null, null, 6, null)).b(this, localDateNow);
                break;
            case 114:
                HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.JET_LAG, null, null, 12);
                break;
            case 115:
                ns0.a aVar = ns0.a.f127811a;
                o oVar2 = ca().f94939a;
                if (oVar2 != null) {
                    ns0.b.f127812a.getClass();
                    zQ = ns0.b.q(oVar2);
                } else {
                    zQ = false;
                }
                f2 f2Var = new f2(this, 12);
                ik2.b bVar = new ik2.b(9);
                aVar.getClass();
                ns0.a.a(this, zQ, f2Var, bVar).show(getSupportFragmentManager(), (String) null);
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/TripDetailsActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_EDIT_TRIP", "I", "MENU_ITEM_VIEW_CALENDAR", "MENU_ITEM_HELP", "MENU_ITEM_DELETE_TRIP", "", "EXTRA_UPDATED_TRIP", "Ljava/lang/String;", "EXTRA_SELECTED_TRIP", "EXTRA_TRIPS", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
