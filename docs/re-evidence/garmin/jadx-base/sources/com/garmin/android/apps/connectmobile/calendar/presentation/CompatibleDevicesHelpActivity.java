package com.garmin.android.apps.connectmobile.calendar.presentation;

import am.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import c22.f3;
import com.garmin.android.apps.connectmobile.R;
import ey.i;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xx.g;
import xx.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/CompatibleDevicesHelpActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CompatibleDevicesHelpActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f31065c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f31066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f31067b;

    /* JADX WARN: Code duplicated, block: B:6:0x0026  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        super.onCreate(bundle);
        setContentView(R.layout.activity_help_compatible_devices);
        initActionBar(true, getString(R.string.startup_compatible_devices));
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("DEVICE_LIST_KEY", bm2.c.class);
            } else {
                parcelableArrayListExtra = null;
            }
        } else if (intent != null) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("DEVICE_LIST_KEY");
        } else {
            parcelableArrayListExtra = null;
        }
        this.f31066a = parcelableArrayListExtra;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<bm2.c> arrayList4 = this.f31066a;
        if (arrayList4 != null) {
            for (bm2.c cVar : arrayList4) {
                if (cVar.g()) {
                    arrayList2.add(new g(cVar, true, false));
                } else {
                    arrayList3.add(new g(cVar, true, false));
                }
            }
        }
        String string = getString(R.string.calendar_sync_support_description);
        string.getClass();
        arrayList.add(0, string);
        String string2 = getString(R.string.devices_compatible);
        string2.getClass();
        arrayList.add(1, new h(string2, true));
        if (arrayList2.size() > 0) {
            ((g) j.f(1, arrayList2)).f192504c = true;
            arrayList.addAll(arrayList2);
        }
        int size = arrayList.size();
        f3 f3Var = f3.f23054a;
        String string3 = getString(R.string.calendar_sync_connection_message);
        f3Var.getClass();
        arrayList.add(size, f3.c(this, string3, true));
        arrayList.add(arrayList.size(), f3.b(this, getString(R.string.calendar_sync_support_message), true));
        if (arrayList3.size() > 0) {
            int size2 = arrayList.size();
            String string4 = getString(R.string.targeted_device_selection_title_not_compatible);
            string4.getClass();
            arrayList.add(size2, new h(string4, true));
            ((g) arrayList3.get(arrayList3.size() - 1)).f192504c = true;
            arrayList.addAll(arrayList3);
        }
        this.f31067b = new i(arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.compatible_devices_recycler_view);
        i iVar = this.f31067b;
        if (iVar == null) {
            s.m("mDeviceListAdapter");
            throw null;
        }
        recyclerView.setAdapter(iVar);
        i iVar2 = this.f31067b;
        if (iVar2 == null) {
            s.m("mDeviceListAdapter");
            throw null;
        }
        iVar2.notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/CompatibleDevicesHelpActivity$a;", "", "<init>", "()V", "", "DEVICE_LIST_KEY", "Ljava/lang/String;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
