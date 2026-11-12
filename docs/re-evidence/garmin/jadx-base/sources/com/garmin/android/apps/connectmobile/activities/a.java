package com.garmin.android.apps.connectmobile.activities;

import am.g2;
import am.i;
import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.apache.commons.lang3.text.WordUtils;

/* JADX INFO: loaded from: classes7.dex */
public class a extends ArrayAdapter<g2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f28800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityPoolLengthActivity.a f28802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewOnClickListenerC0440a f28803e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0440a implements View.OnClickListener {
        public ViewOnClickListenerC0440a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            b bVar = (b) view2.getTag();
            int i14 = bVar.f28808d;
            a aVar = a.this;
            aVar.f28801c = i14;
            aVar.notifyDataSetChanged();
            boolean z14 = bVar.f28808d == g2.values().length - 1;
            LinearLayout linearLayout = ((i) aVar.f28802d).f4006a.f28767b;
            if (z14) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
        }
    }

    public a(Context context, ActivityPoolLengthActivity.a aVar) {
        super(context, R.layout.simple_list_item_2);
        this.f28803e = new ViewOnClickListenerC0440a();
        this.f28799a = context;
        this.f28802d = aVar;
        this.f28800b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        int i15 = 0;
        if (view2 == null) {
            bVar = new b(this, i15);
            viewInflate = this.f28800b.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm3_checkable_row, viewGroup, false);
            bVar.f28805a = viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_container);
            bVar.f28806b = (TextView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_name);
            bVar.f28807c = (ImageView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_img);
            viewInflate.setTag(bVar);
        } else {
            viewInflate = view2;
            bVar = (b) view2.getTag();
        }
        g2 g2Var = (g2) getItem(i14);
        if (i14 < g2.values().length - 1) {
            bVar.f28806b.setText(WordUtils.capitalize(this.f28799a.getString(g2Var.f3983b, g2Var.f3982a)));
        } else {
            bVar.f28806b.setText(g2Var.f3983b);
        }
        if (i14 == this.f28801c) {
            bVar.f28807c.setVisibility(0);
        } else {
            bVar.f28807c.setVisibility(8);
        }
        bVar.f28805a.setOnClickListener(this.f28803e);
        bVar.f28808d = i14;
        return viewInflate;
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f28805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f28806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f28807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28808d;

        public /* synthetic */ b(a aVar, int i14) {
            this(aVar);
        }

        private b(a aVar) {
        }
    }
}
