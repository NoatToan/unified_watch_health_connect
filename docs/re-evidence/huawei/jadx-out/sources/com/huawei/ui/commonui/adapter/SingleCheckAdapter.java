package com.huawei.ui.commonui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.qrs;

/* JADX INFO: loaded from: classes16.dex */
public class SingleCheckAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f23277c;
    private String[] d;
    private LayoutInflater e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f23278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f23279c;
        private HealthRadioButton d;

        private c() {
        }
    }

    public SingleCheckAdapter(Context context, String[] strArr, boolean[] zArr) {
        if (strArr != null) {
            this.d = (String[]) strArr.clone();
        }
        if (zArr != null) {
            this.f23277c = (boolean[]) zArr.clone();
        }
        if (context == null) {
            this.f23276b = BaseApplication.getContext();
        } else {
            this.f23276b = context;
        }
        this.e = (LayoutInflater) this.f23276b.getSystemService("layout_inflater");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return qrs.b(this.d);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return qrs.d(i, this.d);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = this.e.inflate(R.layout.commonui_dialog_single_choice_item, (ViewGroup) null);
            cVar = new c();
            cVar.f23278b = (HealthTextView) view.findViewById(R.id.contact_name);
            cVar.f23279c = (ImageView) view.findViewById(R.id.line);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        cVar.d = (HealthRadioButton) view.findViewById(R.id.chk_selectone);
        if (i >= 0) {
            boolean[] zArr = this.f23277c;
            if (zArr != null && i < zArr.length) {
                cVar.d.setChecked(this.f23277c[i]);
            }
            if (getItem(i) instanceof String) {
                String str = (String) getItem(i);
                if (cVar.f23278b != null) {
                    cVar.f23278b.setText(str);
                }
                if (cVar.f23279c != null) {
                    if (i == getCount() - 1) {
                        cVar.f23279c.setVisibility(8);
                        return view;
                    }
                    cVar.f23279c.setVisibility(0);
                }
            }
        }
        return view;
    }
}
