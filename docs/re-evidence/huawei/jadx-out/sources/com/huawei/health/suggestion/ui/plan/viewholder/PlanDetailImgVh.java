package com.huawei.health.suggestion.ui.plan.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes9.dex */
public class PlanDetailImgVh extends RecyclerView.ViewHolder {
    private ImageView e;

    public PlanDetailImgVh(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_item_fitness_plan_image, viewGroup, false));
        this.e = (ImageView) this.itemView.findViewById(R.id.sug_plan_image);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Glide.with(BaseApplication.getContext()).setDefaultRequestOptions(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL).override(Integer.MIN_VALUE, Integer.MIN_VALUE).format(DecodeFormat.PREFER_RGB_565)).load(str).diskCacheStrategy(DiskCacheStrategy.ALL).into(this.e);
    }
}
