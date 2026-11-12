package com.huawei.ui.homehealth;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes17.dex */
public class RecyclerviewSlideMenu extends LinearLayout {
    private Context e;

    public RecyclerviewSlideMenu(Context context) {
        super(context);
        this.e = context;
        b();
    }

    private void b() {
        Object systemService = this.e.getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            ((LayoutInflater) systemService).inflate(R.layout.recyclerview_slide_menu_layout, this);
        }
    }
}
