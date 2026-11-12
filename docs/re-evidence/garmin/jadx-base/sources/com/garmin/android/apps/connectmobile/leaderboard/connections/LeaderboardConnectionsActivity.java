package com.garmin.android.apps.connectmobile.leaderboard.connections;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import e23.l;
import java.util.EnumMap;
import lc.u0;
import mt0.k4;
import n23.j;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p13.u;
import pt0.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/connections/LeaderboardConnectionsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LeaderboardConnectionsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f37970h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spinner f37973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37974d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Menu f37977g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f37971a = new EnumMap(vt0.b.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f37972b = new w1(s0.f105811a.b(j0.class), new h(this), new g(this), new i(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37975e = "";

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37978a;

        static {
            int[] iArr = new int[vt0.b.values().length];
            try {
                iArr[vt0.b.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt0.b.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt0.b.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vt0.b.SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vt0.b.PUSH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vt0.b.PARASPORTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37978a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/connections/LeaderboardConnectionsActivity$c", "Landroid/widget/ArrayAdapter;", "Lvt0/b;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends ArrayAdapter<vt0.b> {
        public c(vt0.b[] bVarArr) {
            super(LeaderboardConnectionsActivity.this, R.layout.simple_spinner_dropdown_item, bVarArr);
        }

        public final TextView a(int i14, View view2, ViewGroup viewGroup) {
            TextView textView;
            if (view2 == null) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.simple_spinner_dropdown_item, viewGroup, false);
                viewInflate.getClass();
                textView = (TextView) viewInflate;
            } else {
                textView = (TextView) view2;
            }
            vt0.b item = getItem(i14);
            item.getClass();
            textView.setText(LeaderboardConnectionsActivity.this.getString(item.f180059a));
            return textView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public final View getDropDownView(int i14, View view2, ViewGroup viewGroup) {
            viewGroup.getClass();
            return a(i14, view2, viewGroup);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            viewGroup.getClass();
            return a(i14, view2, viewGroup);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/connections/LeaderboardConnectionsActivity$d", "Landroid/widget/AdapterView$OnItemSelectedListener;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
            adapterView.getClass();
            view2.getClass();
            LeaderboardConnectionsActivity leaderboardConnectionsActivity = LeaderboardConnectionsActivity.this;
            if (leaderboardConnectionsActivity.f37976f) {
                return;
            }
            Object itemAtPosition = adapterView.getItemAtPosition(i14);
            itemAtPosition.getClass();
            leaderboardConnectionsActivity.ca((vt0.b) itemAtPosition);
            leaderboardConnectionsActivity.f37974d = i14;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/connections/LeaderboardConnectionsActivity$e", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements s {
        public e() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, com.garmin.android.apps.connectmobile.R.menu.weekly_leaderboard, menu);
            LeaderboardConnectionsActivity.this.f37977g = menu;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int i14 = LeaderboardConnectionsActivity.f37970h;
            y0<k4> y0Var = ((j0) LeaderboardConnectionsActivity.this.f37972b.getValue()).f140718d;
            k4 k4VarD = y0Var.d();
            k4 k4Var = k4.LastWeek;
            if (k4VarD == k4Var) {
                y0Var.j(k4.CurrentWeek);
                return true;
            }
            y0Var.j(k4Var);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37982a;

        public f(l lVar) {
            lVar.getClass();
            this.f37982a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37982a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37982a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37983a;

        public g(b.g gVar) {
            this.f37983a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37983a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37984a;

        public h(b.g gVar) {
            this.f37984a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37984a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f37986b;

        public i(e23.a aVar, b.g gVar) {
            this.f37985a = aVar;
            this.f37986b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37985a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37986b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public final void ca(vt0.b bVar) {
        EnumMap enumMap = this.f37971a;
        if (!enumMap.containsKey(bVar)) {
            switch (b.f37978a[bVar.ordinal()]) {
                case 1:
                    vt0.b bVar2 = vt0.b.STEPS;
                    com.garmin.android.apps.connectmobile.leaderboard.connections.e.a aVar = com.garmin.android.apps.connectmobile.leaderboard.connections.e.D;
                    String str = this.f37975e;
                    aVar.getClass();
                    str.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.connections.e eVar = new com.garmin.android.apps.connectmobile.leaderboard.connections.e();
                    Bundle bundle = new Bundle();
                    bundle.putString("GCM_userDisplayName", str);
                    eVar.setArguments(bundle);
                    enumMap.put(bVar2, eVar);
                    break;
                case 2:
                    vt0.b bVar3 = vt0.b.RUNNING;
                    com.garmin.android.apps.connectmobile.leaderboard.connections.d.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.connections.d.D;
                    String str2 = this.f37975e;
                    aVar2.getClass();
                    str2.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.connections.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.connections.d();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("GCM_userDisplayName", str2);
                    dVar.setArguments(bundle2);
                    enumMap.put(bVar3, dVar);
                    break;
                case 3:
                    vt0.b bVar4 = vt0.b.CYCLING;
                    com.garmin.android.apps.connectmobile.leaderboard.connections.a.C0674a c0674a = com.garmin.android.apps.connectmobile.leaderboard.connections.a.D;
                    String str3 = this.f37975e;
                    c0674a.getClass();
                    str3.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.connections.a aVar3 = new com.garmin.android.apps.connectmobile.leaderboard.connections.a();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("GCM_userDisplayName", str3);
                    aVar3.setArguments(bundle3);
                    enumMap.put(bVar4, aVar3);
                    break;
                case 4:
                    vt0.b bVar5 = vt0.b.SWIMMING;
                    com.garmin.android.apps.connectmobile.leaderboard.connections.f.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.connections.f.D;
                    String str4 = this.f37975e;
                    aVar4.getClass();
                    str4.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.connections.f fVar = new com.garmin.android.apps.connectmobile.leaderboard.connections.f();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("GCM_userDisplayName", str4);
                    fVar.setArguments(bundle4);
                    enumMap.put(bVar5, fVar);
                    break;
                case 5:
                    vt0.b bVar6 = vt0.b.PUSH;
                    com.garmin.android.apps.connectmobile.leaderboard.connections.c.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.connections.c.D;
                    String str5 = this.f37975e;
                    aVar5.getClass();
                    str5.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.connections.c cVar = new com.garmin.android.apps.connectmobile.leaderboard.connections.c();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("GCM_userDisplayName", str5);
                    cVar.setArguments(bundle5);
                    enumMap.put(bVar6, cVar);
                    break;
                case 6:
                    vt0.b bVar7 = vt0.b.PARASPORTS;
                    com.garmin.android.apps.connectmobile.leaderboard.connections.b.a aVar6 = com.garmin.android.apps.connectmobile.leaderboard.connections.b.D;
                    String str6 = this.f37975e;
                    aVar6.getClass();
                    str6.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.connections.b bVar8 = new com.garmin.android.apps.connectmobile.leaderboard.connections.b();
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("GCM_userDisplayName", str6);
                    bVar8.setArguments(bundle6);
                    enumMap.put(bVar7, bVar8);
                    break;
                default:
                    u0.r();
                    return;
            }
        }
        Fragment fragment = (Fragment) enumMap.get(bVar);
        if (fragment != null) {
            v supportFragmentManager = getSupportFragmentManager();
            j.c(supportFragmentManager, supportFragmentManager, com.garmin.android.apps.connectmobile.R.id.leaderboard_type_fragment, fragment, null).s(true, true);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(com.garmin.android.apps.connectmobile.R.layout.leaderboard_connections_fragment_3_0);
        initActionBar(true, com.garmin.android.apps.connectmobile.R.string.social_weekly_leaderboard);
        View viewFindViewById = findViewById(com.garmin.android.apps.connectmobile.R.id.leaderboard_type_selection);
        viewFindViewById.getClass();
        this.f37973c = (Spinner) viewFindViewById;
        Bundle extras = getIntent().getExtras();
        String str = "";
        if (extras != null && (string = extras.getString("GCM_userDisplayName", "")) != null) {
            str = string;
        }
        this.f37975e = str;
        vt0.b bVar = vt0.b.STEPS;
        vt0.b bVar2 = vt0.b.RUNNING;
        vt0.b bVar3 = vt0.b.CYCLING;
        vt0.b bVar4 = vt0.b.SWIMMING;
        vt0.b bVar5 = vt0.b.PUSH;
        vt0.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, vt0.b.PARASPORTS};
        this.f37974d = x.v() ? u.M(bVarArr, bVar5) : u.M(bVarArr, bVar);
        if (bundle != null) {
            int i14 = bundle.getInt("spinner_index", 0);
            this.f37974d = i14;
            if (i14 <= -1 || i14 >= vt0.b.values().length) {
                this.f37974d = 0;
            }
        }
        Spinner spinner = this.f37973c;
        if (spinner == null) {
            p005kotlin.jvm.internal.s.m("mLeaderboardTypeSpinner");
            throw null;
        }
        spinner.setAdapter((SpinnerAdapter) new c(bVarArr));
        Spinner spinner2 = this.f37973c;
        if (spinner2 == null) {
            p005kotlin.jvm.internal.s.m("mLeaderboardTypeSpinner");
            throw null;
        }
        spinner2.setSelection(this.f37974d, false);
        ca(bVarArr[this.f37974d]);
        Spinner spinner3 = this.f37973c;
        if (spinner3 == null) {
            p005kotlin.jvm.internal.s.m("mLeaderboardTypeSpinner");
            throw null;
        }
        spinner3.setOnItemSelectedListener(new d());
        addMenuProvider(new e(), this);
        dh.b.L(((j0) this.f37972b.getValue()).f140718d, this, new f(new ph1.d(18, (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.week_label), this)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f37976f = true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f37976f = false;
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new p("tab", "connections"));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewLeaderboard");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("spinner_index", this.f37974d);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/connections/LeaderboardConnectionsActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "SPINNER_INDEX", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
