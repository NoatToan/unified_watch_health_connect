package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class l0 extends ArrayAdapter<o10.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31897a = 0;

    public l0(Context context) {
        super(context, R.layout.gcm_device_connect_iq_app_list_item);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        if (view2 == null) {
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.gcm_device_connect_iq_app_list_item, viewGroup, false);
            aVar = new a(0);
            aVar.f31898a = (ImageView) view2.findViewById(R.id.connect_iq_app_image);
            aVar.f31899b = (TextView) view2.findViewById(R.id.connect_iq_app_name);
            aVar.f31900c = (TextView) view2.findViewById(R.id.connect_iq_app_size);
            view2.setTag(aVar);
        } else {
            aVar = (a) view2.getTag();
        }
        o10.b bVar = (o10.b) getItem(i14);
        if (bVar != null) {
            String iconUrl = bVar.getIconUrl();
            String name = bVar.getName();
            String str = String.format(Locale.getDefault(), "%d K", Long.valueOf(bVar.getSize() / 1024));
            String strA = oi0.d.a(getContext(), str, new cg1.e(14));
            zp0.c cVar = new zp0.c(aVar.f31898a.getContext());
            cVar.f206565e = iconUrl;
            cVar.f206570j = 2131232264;
            cVar.h(aVar.f31898a);
            aVar.f31899b.setText(name);
            aVar.f31900c.setText(str);
            aVar.f31900c.setContentDescription(strA);
        }
        return view2;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f31898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f31899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f31900c;

        public /* synthetic */ a(int i14) {
            this();
        }

        private a() {
        }
    }
}
