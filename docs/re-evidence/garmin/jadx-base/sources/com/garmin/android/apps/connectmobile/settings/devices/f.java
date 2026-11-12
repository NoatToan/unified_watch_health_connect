package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.mobeta.android.dslv.DragSortListView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<y> f42949b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DragSortListView f42951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f42952e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<d> f42950c = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42953f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f42954g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f42955h = new b();

    public class a implements DragSortListView.j {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0062  */
        @Override // com.mobeta.android.dslv.DragSortListView.j
        public final void b(int i14, int i15) {
            f fVar = f.this;
            ArrayList<d> arrayList = fVar.f42950c;
            if (i15 > fVar.f42953f || !((arrayList.get(i14).f42960b.equals("APP_NATIVE_ID_HEART_RATE") || arrayList.get(i14).f42960b.equals("APP_NATIVE_ID_ALL_DAY_STRESS")) && arrayList.get(i14).f42961c)) {
                int i16 = fVar.f42953f;
                if (i14 == i16 && i15 > i16) {
                    int i17 = i14 + 1;
                    if ((arrayList.get(i17).f42960b.equals("APP_NATIVE_ID_HEART_RATE") || arrayList.get(i17).f42960b.equals("APP_NATIVE_ID_ALL_DAY_STRESS")) && arrayList.get(i17).f42961c) {
                        Toast.makeText(fVar, fVar.getResources().getString(R.string.common_save_error_title), 0).show();
                    }
                }
                if (i14 < i15) {
                    ArrayList<d> arrayList2 = fVar.f42950c;
                    arrayList2.add(i15 + 1, arrayList2.get(i14));
                    fVar.f42950c.remove(i14);
                } else {
                    ArrayList<d> arrayList3 = fVar.f42950c;
                    arrayList3.add(i15, arrayList3.get(i14));
                    fVar.f42950c.remove(i14 + 1);
                }
                for (int i18 = 0; i18 < fVar.f42950c.size(); i18++) {
                    if (fVar.f42950c.get(i18).f42961c) {
                        fVar.f42953f = i18;
                        break;
                    }
                }
            } else {
                Toast.makeText(fVar, fVar.getResources().getString(R.string.common_save_error_title), 0).show();
            }
            fVar.f42952e.notifyDataSetChanged();
        }
    }

    public class b implements DragSortListView.d {
        public b() {
        }

        @Override // com.mobeta.android.dslv.DragSortListView.d
        public final void a(int i14, int i15) {
            String string;
            f fVar = f.this;
            if (i14 >= fVar.f42952e.getCount() || i15 >= fVar.f42952e.getCount()) {
                string = "";
            } else if (i14 > i15) {
                if (i14 <= fVar.f42951d.getSourcePosition()) {
                    i14--;
                }
                string = fVar.f42951d.getContext().getString(R.string.lbl_move_above_value, ((d) fVar.f42952e.getItem(i14)).f42959a);
            } else {
                if (i14 >= fVar.f42951d.getSourcePosition()) {
                    i14++;
                }
                string = fVar.f42951d.getContext().getString(R.string.lbl_move_below_value, ((d) fVar.f42952e.getItem(i14)).f42959a);
            }
            c22.b.h(fVar.f42951d.getContext(), string);
        }
    }

    public class c extends ArrayAdapter<d> {
        public c(Context context, ArrayList<d> arrayList) {
            super(context, 0, arrayList);
            f.this.f42953f = -1;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            d dVar = (d) getItem(i14);
            if (view2 == null) {
                view2 = LayoutInflater.from(getContext()).inflate(R.layout.reorder_list, viewGroup, false);
            }
            TextView textView = (TextView) view2.findViewById(R.id.item_name);
            TextView textView2 = (TextView) view2.findViewById(R.id.item_status);
            ImageView imageView = (ImageView) view2.findViewById(R.id.drag_handle);
            imageView.getClass();
            s0.r(imageView, new v22.f());
            if (dVar != null) {
                boolean z14 = dVar.f42961c;
                textView.setText(dVar.f42959a);
                f fVar = f.this;
                textView2.setText(z14 ? "" : fVar.getResources().getString(R.string.lbl_off));
                if (fVar.f42953f < 0 && z14) {
                    fVar.f42953f = i14;
                }
            }
            return view2;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f42960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f42961c;

        public d(f fVar, String str, String str2, boolean z14) {
            this.f42960b = str;
            this.f42959a = str2;
            this.f42961c = z14;
        }
    }

    public final void ca() {
        c cVar = new c(this, this.f42950c);
        this.f42952e = cVar;
        this.f42951d.setAdapter((ListAdapter) cVar);
        this.f42951d.setDragListener(this.f42955h);
        this.f42951d.setDropListener(this.f42954g);
    }

    @Override // android.app.Activity
    public final void finish() {
        for (d dVar : this.f42950c) {
            for (y yVar : this.f42949b) {
                if (dVar.f42960b.equals(yVar.f34328a)) {
                    yVar.f34329b = this.f42952e.getPosition(dVar);
                }
            }
        }
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42948a));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.device_screen_reorder);
    }
}
