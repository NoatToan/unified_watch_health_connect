package com.huawei.ui.homehealth.search.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import defpackage.ezi;
import defpackage.gvi;
import defpackage.njy;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SearchSuggestAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f26009b;
    private String e;

    public SearchSuggestAdapter(Context context, List<String> list) {
        this.f26008a = context;
        this.f26009b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.f26008a).inflate(R.layout.search_suggest_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
        if (eVar == null) {
            return;
        }
        qsp.c((View) eVar.d, i == getItemCount() + (-1) ? 8 : 0);
        if (!njy.c(this.f26009b, i) || eVar.f26011c == null) {
            return;
        }
        final String str = this.f26009b.get(i);
        eVar.f26011c.setText(ezi.e(str, this.e));
        eVar.f26011c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.search.adapter.SearchSuggestAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                gvi.d(BaseApplication.getContext(), str);
                Activity activity = BaseApplication.getActivity();
                if (activity instanceof GlobalSearchActivity) {
                    ((GlobalSearchActivity) activity).b(str);
                }
            }
        });
    }

    public void b(String str) {
        this.e = str;
    }

    public void c(List<String> list) {
        this.f26009b.clear();
        this.f26009b.addAll(list);
        notifyDataSetChanged();
    }

    public void d() {
        this.f26009b.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f26009b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f26011c;
        private LinearLayout d;

        e(View view) {
            super(view);
            this.f26011c = (HealthTextView) view.findViewById(R.id.search_suggest_view);
            this.d = (LinearLayout) view.findViewById(R.id.search_suggest_divider);
        }
    }
}
