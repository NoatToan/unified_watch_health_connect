package com.huawei.health.ecologydevice.ui.healthdata.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.epc;
import defpackage.njy;
import defpackage.qqf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class BloodSugarFoodAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<epc> f6593a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6594b;

    public BloodSugarFoodAdapter(Context context) {
        this.f6594b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new BloodSugarFoodViewHolder(LayoutInflater.from(this.f6594b).inflate(R.layout.item_blood_sugar_food, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof BloodSugarFoodViewHolder) || njy.e(this.f6593a, i)) {
            LogUtil.e("BloodSugarFoodAdapter", "onBindViewHolder error!");
        } else {
            epc epcVar = this.f6593a.get(i);
            ((BloodSugarFoodViewHolder) viewHolder).c(epcVar.b(), epcVar.a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6593a.size();
    }

    public void a(List<epc> list) {
        this.f6593a.clear();
        this.f6593a.addAll(list);
        LogUtil.d("BloodSugarFoodAdapter", "setUpData mSugarFoodReferences size = ", Integer.valueOf(this.f6593a.size()));
        notifyDataSetChanged();
    }

    public static class BloodSugarFoodViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f6595c;
        HealthTextView e;

        BloodSugarFoodViewHolder(View view) {
            super(view);
            this.f6595c = (ImageView) view.findViewById(R.id.blood_sugar_food_picture);
            this.e = (HealthTextView) view.findViewById(R.id.blood_sugar_food_name);
        }

        void c(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                LogUtil.a("BloodSugarFoodAdapter", "setData foodName or foodImageUrl is null");
            } else {
                this.e.setText(str);
                qqf.a(str2, this.f6595c, R.dimen.margin_m);
            }
        }
    }
}
