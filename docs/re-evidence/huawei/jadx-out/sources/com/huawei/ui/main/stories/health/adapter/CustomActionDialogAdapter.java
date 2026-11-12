package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class CustomActionDialogAdapter extends RecyclerView.Adapter<MyViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f27726a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f27727c;

    public CustomActionDialogAdapter(Context context) {
        this.f27727c = context;
    }

    public void e(List<String> list) {
        if (njy.e(list)) {
            return;
        }
        this.f27726a = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f27726a.add(new a(it.next()));
        }
    }

    public List<String> a() {
        ArrayList arrayList = new ArrayList(0);
        if (!njy.e(this.f27726a)) {
            for (a aVar : this.f27726a) {
                if (aVar.f27730a) {
                    arrayList.add(aVar.f27731c);
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(this.f27727c).inflate(R.layout.item_dialog_custom_action, viewGroup, false));
        myViewHolder.f27729c.setHighlightColor(this.f27727c.getColor(com.huawei.ui.commonui.R.color.blood_pressure_subtab_item_text));
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        if (njy.e(this.f27726a, i)) {
            return;
        }
        final a aVar = this.f27726a.get(i);
        myViewHolder.f27728a.setText(aVar.f27731c);
        myViewHolder.f27729c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.health.adapter.CustomActionDialogAdapter$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                aVar.f27730a = z;
            }
        });
        myViewHolder.f27729c.setChecked(aVar.f27730a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<a> list = this.f27726a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f27728a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthCheckBox f27729c;

        public MyViewHolder(View view) {
            super(view);
            this.f27728a = (HealthTextView) view.findViewById(R.id.action_text);
            this.f27729c = (HealthCheckBox) view.findViewById(R.id.check_box);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27730a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27731c;

        a(String str) {
            this.f27731c = str;
        }
    }
}
