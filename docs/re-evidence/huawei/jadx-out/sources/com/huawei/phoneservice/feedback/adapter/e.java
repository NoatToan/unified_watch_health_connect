package com.huawei.phoneservice.feedback.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.huawei.phoneservice.feedback.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21629c;
    private List<CharSequence> e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        d dVar;
        if (view == null) {
            dVar = new d();
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feedback_sdk_item_list_dialog, viewGroup, false);
            dVar.f21630a = (TextView) viewInflate.findViewById(R.id.list_dialog_item_content);
            dVar.e = (RadioButton) viewInflate.findViewById(R.id.list_dialog_item_radio);
            dVar.f21631b = viewInflate.findViewById(R.id.list_dialog_item_line);
            viewInflate.setTag(dVar);
        } else {
            viewInflate = view;
            dVar = (d) view.getTag();
        }
        dVar.f21630a.setText(getItem(i));
        dVar.e.setChecked(i == this.f21629c);
        dVar.f21631b.setVisibility(i == getCount() - 1 ? 8 : 0);
        return viewInflate;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.e.size();
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TextView f21630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f21631b;
        RadioButton e;

        d() {
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CharSequence getItem(int i) {
        return this.e.get(i);
    }

    public e(CharSequence[] charSequenceArr, int i) {
        this.e = new ArrayList();
        if (charSequenceArr != null) {
            this.e = Arrays.asList(charSequenceArr);
        }
        this.f21629c = i;
    }
}
