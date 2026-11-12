package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qqf;
import defpackage.uws;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SugarFoodReferenceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<uws> f27785b = new ArrayList();
    private Context e;

    public SugarFoodReferenceAdapter(Context context) {
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SugarFoodReferenceViewHolder(LayoutInflater.from(this.e).inflate(R.layout.item_sugar_food_reference, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof SugarFoodReferenceViewHolder) || njy.e(this.f27785b, i)) {
            LogUtil.e("Suggestion_SugarFoodReferenceAdapter", "onBindViewHolder error!");
        } else {
            uws uwsVar = this.f27785b.get(i);
            ((SugarFoodReferenceViewHolder) viewHolder).e(uwsVar.e(), uwsVar.d());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<uws> list = this.f27785b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void e(List<uws> list) {
        List<uws> list2 = this.f27785b;
        if (list2 != null) {
            list2.addAll(list);
            notifyDataSetChanged();
        }
    }

    public class SugarFoodReferenceViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f27786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f27787c;

        SugarFoodReferenceViewHolder(View view) {
            super(view);
            this.f27786b = (ImageView) view.findViewById(R.id.sugar_food_reference_picture);
            this.f27787c = (HealthTextView) view.findViewById(R.id.sugar_food_reference_name);
        }

        void e(String str, String str2) {
            if (this.f27787c == null || TextUtils.isEmpty(str) || this.f27786b == null || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f27787c.setText(str);
            qqf.a(str2, this.f27786b, R.dimen.margin_m);
        }
    }
}
