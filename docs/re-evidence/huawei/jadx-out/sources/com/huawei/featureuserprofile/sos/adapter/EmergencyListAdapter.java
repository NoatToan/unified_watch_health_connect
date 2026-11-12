package com.huawei.featureuserprofile.sos.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.featureuserprofile.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;

/* JADX INFO: loaded from: classes6.dex */
public class EmergencyListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5685b;
    private int d;
    private CharSequence[] e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public EmergencyListAdapter(Context context, CharSequence[] charSequenceArr, int i) {
        this.e = charSequenceArr == null ? new CharSequence[0] : charSequenceArr;
        this.f5685b = context;
        this.d = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.e.length;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        d dVar;
        String strValueOf;
        if (view == null) {
            dVar = new d();
            viewInflate = View.inflate(this.f5685b, R.layout.layout_emergency_list_item, null);
            dVar.e = (HealthTextView) viewInflate.findViewById(R.id.tv_radio_text);
            dVar.f5686b = (HealthRadioButton) viewInflate.findViewById(R.id.rb_radio_button);
            viewInflate.setTag(dVar);
        } else {
            Object tag = view.getTag();
            d dVar2 = tag instanceof d ? (d) tag : null;
            if (dVar2 == null) {
                return view;
            }
            d dVar3 = dVar2;
            viewInflate = view;
            dVar = dVar3;
        }
        if (i >= 0) {
            CharSequence[] charSequenceArr = this.e;
            if (i < charSequenceArr.length) {
                strValueOf = String.valueOf(charSequenceArr[i]);
            } else {
                strValueOf = "";
            }
        } else {
            strValueOf = "";
        }
        dVar.e.setText(strValueOf);
        dVar.f5686b.setChecked(this.d == i);
        return viewInflate;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public void d(int i) {
        this.d = i;
        notifyDataSetChanged();
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthRadioButton f5686b;
        HealthTextView e;

        d() {
        }
    }
}
