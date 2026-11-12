package com.huami.widget.hrsection;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes17.dex */
class b extends RecyclerView.ViewHolder {
    public TextView a;
    public TextView b;

    public b(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.hr_section_time);
        this.b = (TextView) view.findViewById(R.id.hr_section_name);
    }
}
