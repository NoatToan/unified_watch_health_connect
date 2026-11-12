package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class p extends ArrayAdapter<sd2.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f31936c;

    public p(Context context, List<sd2.f> list, String str) {
        super(context, R.layout.gcm_connect_iq_spinner, list);
        this.f31936c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f31934a = str;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i14, View view2, ViewGroup viewGroup) {
        String displayName;
        if (view2 == null) {
            view2 = this.f31936c.inflate(R.layout.gcm_connect_iq_spinner, viewGroup, false);
        }
        View viewFindViewById = view2.findViewById(R.id.connect_iq_row);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.connect_iq_device);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.icon);
        sd2.f fVar = (sd2.f) getItem(i14);
        if (fVar != null) {
            displayName = !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName();
        } else {
            displayName = "";
        }
        textView.setText(displayName);
        imageView.setImageResource(i14 == this.f31935b ? 2131232274 : 0);
        return view2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        String displayName;
        if (view2 == null) {
            view2 = this.f31936c.inflate(R.layout.gcm_connect_iq_spinner, viewGroup, false);
        }
        TextView textView = (TextView) view2.findViewById(R.id.connect_iq_component_name);
        TextView textView2 = (TextView) view2.findViewById(R.id.connect_iq_device);
        textView.setText(this.f31934a);
        sd2.f fVar = (sd2.f) getItem(i14);
        if (fVar != null) {
            displayName = !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName();
        } else {
            displayName = "";
        }
        textView2.setText(displayName);
        return view2;
    }
}
