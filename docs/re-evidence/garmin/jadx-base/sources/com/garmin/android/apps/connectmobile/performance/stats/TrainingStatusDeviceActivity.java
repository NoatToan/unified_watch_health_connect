package com.garmin.android.apps.connectmobile.performance.stats;

import am.a2;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import jr2.n;

/* JADX INFO: loaded from: classes9.dex */
public class TrainingStatusDeviceActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f40027a = 0;

    public static class a extends ArrayAdapter<com.garmin.android.apps.connectmobile.performance.model.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LayoutInflater f40028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40029b;

        public a(Context context) {
            super(context, R.layout.gcm3_training_status_device_row);
            this.f40029b = -1;
            this.f40028a = LayoutInflater.from(getContext());
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            if (view2 == null) {
                view2 = this.f40028a.inflate(R.layout.gcm3_training_status_device_row, viewGroup, false);
            }
            ImageView imageView = (ImageView) view2.findViewById(R.id.training_status_device_checkable_row_img);
            TextView textView = (TextView) view2.findViewById(R.id.training_status_device_checkable_row_name);
            ImageView imageView2 = (ImageView) view2.findViewById(R.id.training_status_device_checkmark);
            com.garmin.android.apps.connectmobile.performance.model.a aVar = (com.garmin.android.apps.connectmobile.performance.model.a) getItem(i14);
            if (aVar != null) {
                zp0.c cVar = new zp0.c(getContext());
                cVar.f206565e = aVar.f39919c;
                cVar.f206570j = 2131231969;
                cVar.h(imageView);
                Context context = getContext();
                String str = aVar.f39918b;
                int i15 = aVar.f39920d;
                com.garmin.android.apps.connectmobile.performance.model.a.f39916e.getClass();
                textView.setText(com.garmin.android.apps.connectmobile.performance.model.a.b.a(context, i15, str));
                if (i14 == this.f40029b) {
                    imageView2.setVisibility(0);
                    return view2;
                }
                imageView2.setVisibility(4);
            }
            return view2;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        ArrayList arrayListD;
        int i14;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_list_view);
        initActionBar(true, R.string.lbl_select_device);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            arrayListD = a2.d(extras, "extra_device_list");
            string = extras.getString("extra_device_id");
        } else {
            string = null;
            arrayListD = null;
        }
        if (arrayListD == null || arrayListD.isEmpty()) {
            i2.d("TrainingStatusDeviceActivity", "Missing or empty device list. ");
            finish();
            return;
        }
        ListView listView = (ListView) findViewById(android.R.id.list);
        a aVar = new a(this);
        aVar.addAll(arrayListD);
        if (TextUtils.isEmpty(string)) {
            i14 = -1;
        } else {
            i14 = 0;
            while (i14 < aVar.getCount()) {
                com.garmin.android.apps.connectmobile.performance.model.a item = aVar.getItem(i14);
                if (item != null) {
                    String str = item.f39917a;
                    if (TextUtils.isEmpty(str) || !str.equals(string)) {
                    }
                }
                i14++;
            }
            i14 = -1;
        }
        aVar.f40029b = i14;
        aVar.notifyDataSetChanged();
        listView.setAdapter((ListAdapter) aVar);
        listView.setDivider(null);
        listView.setOnItemClickListener(new n(this, aVar, 1));
    }
}
