package com.huawei.sim.esim.view.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.pvg;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class WirelessAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f23088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23089c;
    private ArrayList<pvg> d;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WirelessAdapter(ArrayList<pvg> arrayList, Context context) {
        if (arrayList.clone() instanceof ArrayList) {
            this.d = (ArrayList) arrayList.clone();
        }
        this.f23088b = LayoutInflater.from(context);
        this.f23089c = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        pvg pvgVar = this.d.get(i);
        if (view == null) {
            b bVar2 = new b();
            View viewInflate = this.f23088b.inflate(R.layout.wireless_item_activity, (ViewGroup) null);
            bVar2.f23090b = (HealthTextView) viewInflate.findViewById(R.id.open_esim);
            bVar2.e = (HealthTextView) viewInflate.findViewById(R.id.open_esim_tips);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.set_tips_image);
            if (LanguageUtil.ba(this.f23089c)) {
                imageView.setImageResource(R.drawable.sim_direction_left_tip_image);
            }
            viewInflate.setTag(bVar2);
            bVar = bVar2;
            view = viewInflate;
        } else if (view.getTag() instanceof b) {
            bVar = (b) view.getTag();
        } else {
            LogUtil.j("WirelessAdapter", "convertView.getTag() not instanceof ViewHolder");
            return view;
        }
        view.setOnClickListener(pvgVar.e());
        bVar.f23090b.setText(pvgVar.c());
        if (TextUtils.isEmpty(pvgVar.b())) {
            bVar.e.setVisibility(8);
            return view;
        }
        bVar.e.setVisibility(0);
        bVar.e.setText(pvgVar.b());
        return view;
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f23090b;
        HealthTextView e;

        b() {
        }
    }
}
