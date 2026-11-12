package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fej extends ArrayAdapter<gej> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f17706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f17707b;

    public fej(Context context, List<gej> list) {
        super(context, 0, list);
        this.f17706a = (LayoutInflater) sk1.c(context.getSystemService("layout_inflater"));
    }

    public Integer a() {
        return this.f17707b;
    }

    public final View b(int i, View view, ViewGroup viewGroup, boolean z) {
        Integer num;
        gej gejVar = (gej) getItem(i);
        boolean z2 = false;
        if (view == null) {
            view = this.f17706a.inflate(z ? R.layout.simple_spinner_dropdown_item : R.layout.simple_spinner_item, viewGroup, false);
            view.setTag(((TextView) view).getTextColors());
            z2 = true;
        }
        TextView textView = (TextView) view;
        textView.setText(gejVar.f18893a);
        if (z || (num = this.f17707b) == null) {
            Integer num2 = gejVar.f18894b;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            } else if (textView.getTag() != null && !z2) {
                textView.setTextColor((ColorStateList) textView.getTag());
            }
        } else {
            textView.setTextColor(num.intValue());
        }
        return textView;
    }

    public void c(Integer num) {
        this.f17707b = num;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return b(i, view, viewGroup, true);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return b(i, view, viewGroup, false);
    }
}
