package com.huawei.health.ecologydevice.ui.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ecologydevice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SelectAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6582b;
    private List<Map.Entry<String, String>> d;
    private final OnItemClickListener e;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SelectAdapter(Context context, List<Map.Entry<String, String>> list, OnItemClickListener onItemClickListener) {
        if (njy.b(list)) {
            this.d = list;
            this.f6581a = list.get(0).getKey();
        } else {
            this.d = new ArrayList(16);
        }
        if (context == null) {
            this.f6582b = BaseApplication.getContext();
        } else {
            this.f6582b = context;
        }
        this.e = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.f6582b).inflate(R.layout.dialog_custom_select_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("SelectAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        final String key = this.d.get(i).getKey();
        bVar.f6584c.setVisibility(i == this.d.size() + (-1) ? 8 : 0);
        bVar.e.setText(this.d.get(i).getValue());
        bVar.f6583a.setChecked(key.equals(this.f6581a));
        bVar.f6583a.setOnClickListener(new View.OnClickListener() { // from class: eoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(key, view);
            }
        });
    }

    public /* synthetic */ void a(String str, View view) {
        if (str.equals(this.f6581a)) {
            return;
        }
        this.e.onItemClick(str);
        this.f6581a = str;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthRadioButton f6583a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f6584c;
        HealthTextView e;

        b(View view) {
            super(view);
            this.f6584c = view.findViewById(R.id.divider_custom_select_item);
            this.e = (HealthTextView) view.findViewById(R.id.tv_name);
            this.f6583a = (HealthRadioButton) view.findViewById(R.id.rb_select);
        }
    }
}
