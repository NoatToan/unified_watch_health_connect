package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.List;
import lj0.f;
import lj0.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ro0.l;
import wd2.h0;
import xk1.o;
import xk1.p;
import xk1.q;
import xk1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/PowerZonesListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerZonesListActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f44065e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<g3<List<PowerZonesDTO>>> f44066a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f44067b = new w1(s0.f105811a.b(p.class), new c(this), new wd.c(this, 28), new d(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f44068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f44069d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44070a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44070a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44071a;

        public c(g gVar) {
            this.f44071a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44071a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44073b;

        public d(e23.a aVar, g gVar) {
            this.f44072a = aVar;
            this.f44073b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44072a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44073b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final void ca(Context context, long j8) {
        f44065e.getClass();
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_DEVICE_UNIT_ID", j8);
            Intent intent = new Intent(context, (Class<?>) PowerZonesListActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_generic_list_layout);
        initActionBar(true, R.string.device_settings_power_zones);
        Bundle extras = getIntent().getExtras();
        this.f44069d = extras != null ? Long.valueOf(extras.getLong("EXTRA_DEVICE_UNIT_ID")) : null;
        this.f44068c = new o(new xa2.g(this, 10));
        View viewFindViewById = findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        o oVar = this.f44068c;
        if (oVar == null) {
            s.m("zonesAdapter");
            throw null;
        }
        recyclerView.setAdapter(oVar);
        this.f44066a.f(this, new h0(this, 9));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_help, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, l.POWER_ZONES, null, null, 12);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        p pVar = (p) this.f44067b.getValue();
        Long l14 = this.f44069d;
        pVar.f191276a.j(g3.a.c(g3.f35298f));
        if (pVar.f191277b.isEmpty()) {
            String[] strArr = {String.valueOf(l14)};
            f fVar = f.f112996x;
            ge1.b.T(v1.a(pVar), null, null, new r(new j(pVar.f191280e), fVar, strArr, null), 3);
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "PowerZonesListViewModel", "Power Zones data: requesting power zones.");
        ge1.b.T(v1.a(pVar), null, null, new q(pVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/PowerZonesListActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_UNIT_ID", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
