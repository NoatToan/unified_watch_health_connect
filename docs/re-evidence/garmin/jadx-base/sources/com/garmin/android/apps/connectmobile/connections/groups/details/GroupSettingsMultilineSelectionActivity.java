package com.garmin.android.apps.connectmobile.connections.groups.details;

import am.r1;
import am.x0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.e;
import com.garmin.android.apps.connectmobile.i;
import com.garmin.proto.generated.GDIInReachMessaging;
import j10.m;
import j10.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
public class GroupSettingsMultilineSelectionActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31448j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDTO f31449a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f31452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31453e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f31455g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f31450b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31451c = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f31454f = jm0.e.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GroupDTO.b[] f31456h = {GroupDTO.b.CALENDAR, GroupDTO.b.COURSES, GroupDTO.b.SEGMENTS};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j10.d[] f31457i = j10.d.values();

    public final boolean ca() {
        boolean zEquals;
        ArrayList arrayList = new ArrayList(this.f31450b);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f31452d.f96386a);
        Collections.sort(arrayList2);
        String str = this.f31451c;
        String str2 = this.f31449a.f31574q;
        if (str == null && str2 == null) {
            zEquals = false;
        } else {
            zEquals = (str == null || str2 == null) ? true : str.equals(str2);
        }
        return (arrayList.equals(arrayList2) && zEquals) ? false : true;
    }

    public final void da() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f31452d;
        if (mVar != null) {
            arrayList = mVar.f96386a;
        }
        String str = this.f31453e;
        str.getClass();
        switch (str) {
            case "edit_group_activity_feed_types":
                ArrayList arrayList2 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(com.garmin.android.apps.connectmobile.connections.groups.services.model.a.C((x0) this.f31455g.get(((Integer) it.next()).intValue())));
                    }
                }
                this.f31449a.f31577v = arrayList2;
                break;
            case "edit_group_wwd_types":
                String str2 = this.f31449a.f31574q;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int iIntValue = ((Integer) it3.next()).intValue();
                        e[] eVarArr = this.f31454f;
                        e eVar = eVarArr[iIntValue];
                        if (eVar != e.ACT_OTHER || !TextUtils.isEmpty(str2)) {
                            arrayList3.add(eVarArr[iIntValue]);
                            arrayList4.addAll(eVar.b());
                            arrayList5.addAll(eVar.a());
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList(new HashSet(arrayList5));
                ArrayList arrayList7 = new ArrayList(new HashSet(arrayList4));
                GroupDTO groupDTO = this.f31449a;
                groupDTO.f31577v = arrayList6;
                groupDTO.D(arrayList7);
                this.f31449a.f31573p = arrayList3;
                break;
            case "edit_group_leaderboard_types":
                ArrayList arrayList8 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(this.f31457i[((Integer) it4.next()).intValue()]);
                    }
                }
                this.f31449a.D(arrayList8);
                break;
            case "edit_group_features_types":
                ArrayList arrayList9 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(this.f31456h[((Integer) it5.next()).intValue()]);
                }
                this.f31449a.f31576t = arrayList9;
                break;
        }
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_connection_group", this.f31449a);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (ca()) {
            da();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_list_view_generic);
        this.f31449a = (GroupDTO) getIntent().getParcelableExtra("GCM_extra_connection_group");
        String action = getIntent().getAction();
        this.f31453e = action;
        if (this.f31449a == null || action == null) {
            Toast.makeText(this, R.string.txt_error_occurred, 1).show();
            finish();
        }
        ListView listView = (ListView) findViewById(R.id.gcm_list);
        String str = this.f31453e;
        str.getClass();
        int i14 = 0;
        byte b14 = -1;
        switch (str.hashCode()) {
            case -1996332525:
                if (str.equals("edit_group_activity_feed_types")) {
                    b14 = 0;
                }
                break;
            case -1714101239:
                if (str.equals("edit_group_wwd_types")) {
                    b14 = 1;
                }
                break;
            case 373171266:
                if (str.equals("edit_group_leaderboard_types")) {
                    b14 = 2;
                }
                break;
            case 511786700:
                if (str.equals("edit_group_features_types")) {
                    b14 = 3;
                }
                break;
        }
        ArrayList arrayList = this.f31450b;
        switch (b14) {
            case 0:
                super.initActionBar(true, R.string.lbl_group_settings_activities_in_the_feed);
                this.f31455g = r1.b(r1.a(this));
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                while (i14 < this.f31455g.size()) {
                    arrayList2.add((x0) this.f31455g.get(i14));
                    for (com.garmin.android.apps.connectmobile.connections.groups.services.model.a aVar : this.f31449a.f31577v) {
                        i iVar = i.f36758a;
                        x0 x0Var = (x0) this.f31455g.get(i14);
                        iVar.getClass();
                        if (i.e(x0Var) == Integer.parseInt(aVar.f31607a)) {
                            arrayList3.add(Integer.valueOf(i14));
                        }
                        break;
                    }
                    i14++;
                }
                j10.a aVar2 = new j10.a(this);
                this.f31452d = aVar2;
                aVar2.clear();
                aVar2.addAll(arrayList2);
                aVar2.c(new ArrayList(arrayList3));
                arrayList.addAll(arrayList3);
                this.f31451c = this.f31449a.f31574q;
                break;
            case 1:
                super.initActionBar(true, R.string.lbl_what_does_your_group_do);
                listView.setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                View rootView = listView.getRootView();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                while (true) {
                    e[] eVarArr = this.f31454f;
                    if (i14 >= eVarArr.length) {
                        d dVar = new d(this, this.f31449a.f31574q, new n(this));
                        this.f31452d = dVar;
                        ArrayList arrayList6 = dVar.f31490f;
                        arrayList6.clear();
                        arrayList6.addAll(arrayList4);
                        ArrayList arrayList7 = new ArrayList(y.r(arrayList4, 10));
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            arrayList7.add(dVar.getContext().getString(((e) it.next()).f31647b));
                        }
                        dVar.clear();
                        dVar.addAll(arrayList7);
                        dVar.c(h0.b1(arrayList5));
                        arrayList.addAll(arrayList5);
                        this.f31451c = this.f31449a.f31574q;
                        n nVar = new n(this);
                        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                        s0.d.c(rootView, nVar);
                    } else {
                        arrayList4.add(eVarArr[i14]);
                        if (this.f31449a.f31573p.contains(eVarArr[i14])) {
                            arrayList5.add(Integer.valueOf(i14));
                        }
                        i14++;
                    }
                    break;
                }
                break;
            case 2:
                super.initActionBar(true, R.string.lbl_group_leaderboards);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = this.f31449a.f31575r;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(Arrays.asList(j10.d.values()));
                while (i14 < arrayList11.size()) {
                    arrayList8.add(getString(((j10.d) arrayList11.get(i14)).f96364c));
                    if (arrayList9 != null && arrayList9.contains(arrayList11.get(i14))) {
                        arrayList10.add(Integer.valueOf(i14));
                    }
                    i14++;
                }
                c cVar = new c(this);
                this.f31452d = cVar;
                cVar.clear();
                cVar.addAll(arrayList8);
                cVar.c(new ArrayList(arrayList10));
                arrayList.addAll(arrayList10);
                this.f31451c = this.f31449a.f31574q;
                break;
            case 3:
                super.initActionBar(true, R.string.lbl_group_features);
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = this.f31449a.f31576t;
                ArrayList arrayList14 = new ArrayList();
                while (true) {
                    GroupDTO.b[] bVarArr = this.f31456h;
                    if (i14 >= bVarArr.length) {
                        c cVar2 = new c(this);
                        this.f31452d = cVar2;
                        cVar2.clear();
                        cVar2.addAll(arrayList12);
                        cVar2.c(new ArrayList(arrayList14));
                        arrayList.addAll(arrayList14);
                        this.f31451c = this.f31449a.f31574q;
                    } else {
                        arrayList12.add(getString(bVarArr[i14].f31587a));
                        if (arrayList13 != null && arrayList13.contains(bVarArr[i14])) {
                            arrayList14.add(Integer.valueOf(i14));
                        }
                        i14++;
                    }
                    break;
                }
                break;
        }
        listView.setAdapter((ListAdapter) this.f31452d);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (!ca()) {
            return super.onNavigateUp();
        }
        da();
        return true;
    }
}
