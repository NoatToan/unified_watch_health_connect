package com.garmin.android.apps.connectmobile.settings.devices.activityoptions;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import d53.u;
import g22.n;
import hb2.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import og1.e;
import og1.f;
import og1.g;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Log1/f;", "", "<init>", "()V", "a", "b", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ActivityOptionsActivity extends c implements f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f42526m = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42527a = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f42529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f42530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f42531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a f42532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public og1.c f42533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f42534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f42536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f42537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public og1.a f42538l;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity$a;", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "orderedList", "<init>", "(Ljava/util/ArrayList;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Comparator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<String> f42539a;

        public a(ArrayList<String> arrayList) {
            arrayList.getClass();
            this.f42539a = arrayList;
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            ArrayList<String> arrayList = this.f42539a;
            return arrayList.indexOf(str3) - arrayList.indexOf(str4);
        }
    }

    public final void ca(String str, boolean z14) {
        e eVar = this.f42534h;
        List<g> list = eVar != null ? eVar.f131999a : null;
        list.getClass();
        for (g gVar : list) {
            if (u.q(gVar.f132003d, str, false)) {
                gVar.G(z14);
                return;
            }
        }
    }

    public void da() {
        og1.a aVar = new og1.a(this);
        this.f42538l = aVar;
        aVar.b(this.f42528b);
    }

    public com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a ea(ArrayList arrayList, a aVar) {
        return new com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a(this, arrayList, aVar);
    }

    public final com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a fa() {
        com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a aVar = this.f42532f;
        if (aVar != null) {
            return aVar;
        }
        s.m("mAdapterActivityOptionsDisplayList");
        throw null;
    }

    public final og1.c ga() {
        og1.c cVar = this.f42533g;
        if (cVar != null) {
            return cVar;
        }
        s.m("mAdapterDisableDisableList");
        throw null;
    }

    public void ha() {
        if (getIntent().getExtras() == null) {
            finish();
            return;
        }
        this.f42528b = getIntent().getLongExtra("GCM_deviceUnitID", 0L);
        this.f42527a = getIntent().getIntExtra("GCM_displayActivitiesMaxLimit", this.f42527a);
        Intent intent = getIntent();
        Serializable serializableExtra = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_deviceEnumValue") : null;
            serializableExtra = (u0) (serializableExtra2 instanceof u0 ? serializableExtra2 : null);
        } else if (intent != null) {
            serializableExtra = intent.getSerializableExtra("GCM_deviceEnumValue", u0.class);
        }
        this.f42537k = (u0) serializableExtra;
        if (this.f42528b <= 0) {
            finish();
        }
    }

    @Override // og1.f
    public void j9(String str) {
        String strF;
        String str2;
        if (this.f42535i) {
            return;
        }
        e eVar = this.f42534h;
        String strD = null;
        List<g> list = eVar != null ? eVar.f131999a : null;
        list.getClass();
        Iterator<g> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                strF = null;
                str2 = null;
                break;
            }
            g next = it.next();
            if (u.q(next.f132003d, str, false)) {
                strD = next.getSport();
                strF = next.getSubSport();
                str2 = next.f132003d;
                break;
            }
        }
        if (strD == null || strF == null || !i.a(this)) {
            return;
        }
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(n.g(strD));
        com.garmin.android.apps.connectmobile.settings.devices.e.b bVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.b.valueOf(n.g(strF));
        if (aVarValueOf == com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING && bVarValueOf == com.garmin.android.apps.connectmobile.settings.devices.e.b.CARDIO_TRAINING) {
            aVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO;
        }
        og1.a aVar = this.f42538l;
        aVar.getClass();
        str2.getClass();
        long j8 = this.f42528b;
        u0 u0Var = this.f42537k;
        u0Var.getClass();
        aVar.a(aVarValueOf, bVarValueOf, str2, j8, u0Var);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_activities);
        initActionBar(true, R.string.activity_options_title);
        ha();
        View viewFindViewById = findViewById(R.id.lv_displayed_activities);
        viewFindViewById.getClass();
        this.f42529c = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.lv_disabled_activities);
        viewFindViewById2.getClass();
        this.f42530d = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.maximum_characters_allowed_label);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f42531e = textView;
        textView.setText(getString(R.string.device_settings_displayed_activities_footer, Integer.valueOf(this.f42527a)));
        RecyclerView recyclerView = this.f42529c;
        if (recyclerView == null) {
            s.m("mRVDisplayedActivities");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f42530d;
        if (recyclerView2 == null) {
            s.m("mRVDisabledActivities");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        da();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        this.f42536j = menu != null ? menu.findItem(R.id.menu_item_edit_done) : null;
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        JSONArray jSONArray;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_edit_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f42535i) {
            og1.a aVar = this.f42538l;
            aVar.getClass();
            e eVar = this.f42534h;
            eVar.getClass();
            long j8 = this.f42528b;
            ActivityOptionsActivity activityOptionsActivity = aVar.f131976a;
            try {
                jSONArray = new JSONArray();
                List<g> list = eVar.f131999a;
                list.getClass();
                Iterator<g> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().H());
                }
            } catch (JSONException unused) {
                jSONArray = null;
            }
            String string = jSONArray != null ? jSONArray.toString() : null;
            if (i.a(activityOptionsActivity)) {
                if (string == null || string.length() != 0) {
                    activityOptionsActivity.showProgressOverlay();
                    com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
                    og1.b bVar = new og1.b(j8, this, aVar);
                    eVarN.getClass();
                    lj0.f fVar = lj0.f.f112992r;
                    Object[] objArr = {String.valueOf(j8)};
                    fVar.f113007i = string;
                    d80.f.b bVar2 = new d80.f.b(objArr, fVar);
                    bVar2.f58274d = bVar;
                    bVar2.f58275e = d80.g.NO_PARSING;
                    d80.f<Object> fVarA = bVar2.a();
                    fVarA.b();
                    aVar.f131978c = fVarA;
                } else {
                    Toast.makeText(activityOptionsActivity, activityOptionsActivity.getText(R.string.common_save_error_title), 0).show();
                }
            }
        } else {
            this.f42535i = true;
            MenuItem menuItem2 = this.f42536j;
            if (menuItem2 != null) {
                menuItem2.setTitle(getString(R.string.lbl_done));
            }
            if (this.f42533g != null) {
                og1.c cVarGa = ga();
                cVarGa.f131993d = true;
                cVarGa.notifyDataSetChanged();
            }
            if (this.f42532f != null) {
                com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a aVarFa = fa();
                aVarFa.f42544e = true;
                aVarFa.notifyDataSetChanged();
                return true;
            }
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        og1.a aVar = this.f42538l;
        aVar.getClass();
        if (aVar.f131977b != null) {
            og1.a aVar2 = this.f42538l;
            aVar2.getClass();
            d80.f<e> fVar = aVar2.f131977b;
            fVar.getClass();
            fVar.a();
        }
        og1.a aVar3 = this.f42538l;
        aVar3.getClass();
        if (aVar3.f131978c != null) {
            og1.a aVar4 = this.f42538l;
            aVar4.getClass();
            d80.f<Object> fVar2 = aVar4.f131978c;
            fVar2.getClass();
            fVar2.a();
        }
        og1.a aVar5 = this.f42538l;
        aVar5.getClass();
        if (aVar5.f131979d != null) {
            og1.a aVar6 = this.f42538l;
            aVar6.getClass();
            d80.f<com.garmin.android.apps.connectmobile.devices.model.f> fVar3 = aVar6.f131979d;
            fVar3.getClass();
            fVar3.a();
        }
    }

    @Override // og1.f
    public final void u4(String str) {
        if (fa().f42541b.size() < this.f42527a) {
            ca(str, true);
            fa().r(str);
            og1.c cVarGa = ga();
            cVarGa.f131990a.remove(str);
            cVarGa.notifyDataSetChanged();
            return;
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
        aVar.setMessage(getString(R.string.device_settings_remove_displayed_activity_hint));
        aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_DISPLAYED_ACTIVITIES_LIMIT", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
