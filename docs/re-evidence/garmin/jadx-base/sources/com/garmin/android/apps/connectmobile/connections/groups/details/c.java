package com.garmin.android.apps.connectmobile.connections.groups.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import j10.m;

/* JADX INFO: loaded from: classes7.dex */
public class c extends m<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f31482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f31483c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = ((b) view2.getTag()).f31486b;
            c cVar = c.this;
            cVar.a(i14);
            cVar.notifyDataSetChanged();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GCMCheckableRow f31485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31486b;

        public b(c cVar) {
        }
    }

    public c(Context context) {
        super(context, -1);
        this.f31483c = new a();
        this.f31482b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        if (view2 == null) {
            bVar = new b(this);
            viewInflate = this.f31482b.inflate(R.layout.gcm_simple_text_check_row_3_0, viewGroup, false);
            bVar.f31485a = (GCMCheckableRow) viewInflate;
            viewInflate.setTag(bVar);
        } else {
            viewInflate = view2;
            bVar = (b) view2.getTag();
        }
        bVar.f31485a.setDefaultText(getItem(i14));
        bVar.f31485a.setChecked(this.f96386a.contains(Integer.valueOf(i14)));
        bVar.f31485a.setOnClickListener(this.f31483c);
        bVar.f31486b = i14;
        return viewInflate;
    }
}
