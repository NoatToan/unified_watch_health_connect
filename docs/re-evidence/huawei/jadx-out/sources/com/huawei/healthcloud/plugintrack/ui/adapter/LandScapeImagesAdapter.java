package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LandScapeImagesAdapter extends RecyclerView.Adapter<LandScapeImagesViewHolder> {
    private static int e = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10978b;
    private List<String> d;

    public LandScapeImagesAdapter(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f10978b = context;
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LandScapeImagesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new LandScapeImagesViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clocking_rank_land_scape_images_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(LandScapeImagesViewHolder landScapeImagesViewHolder, final int i) {
        LogUtil.b("LandScapeAdapter", "onBindViewHolder");
        if (njy.e(this.d)) {
            LogUtil.b("LandScapeAdapter", "mLandScapeImagesList is null");
        } else {
            landScapeImagesViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.LandScapeImagesAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    RunningRouteUtils.c(RunningRouteUtils.a((String) LandScapeImagesAdapter.this.d.get(i)), LandScapeImagesAdapter.this.f10978b);
                }
            });
            qqf.b(this.d.get(i), landScapeImagesViewHolder.f10981b, e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    public class LandScapeImagesViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthImageView f10981b;

        public LandScapeImagesViewHolder(LandScapeImagesAdapter landScapeImagesAdapter, View view) {
            super(view);
            this.f10981b = (HealthImageView) view.findViewById(R.id.land_scape_iv);
        }
    }
}
