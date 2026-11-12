package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.sharewatermark.TrackSimpleView;
import defpackage.jpg;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pna;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class WaterItemAdapter extends RecyclerView.Adapter<WaterContentViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22532a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WaterContentViewHolder f22533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnItemClickListener f22534c;
    private Context d;
    private List<pna> e;

    public interface OnItemClickListener {
        void onItemClick(int i, List<pna> list, pna pnaVar);
    }

    public WaterContentViewHolder e() {
        return this.f22533b;
    }

    public void e(WaterContentViewHolder waterContentViewHolder) {
        this.f22533b = waterContentViewHolder;
    }

    public WaterItemAdapter(Context context, List<pna> list, OnItemClickListener onItemClickListener) {
        this.d = context;
        this.e = list;
        this.f22534c = onItemClickListener;
    }

    public void a(List<pna> list) {
        if (njy.e(list)) {
            return;
        }
        this.e = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public WaterContentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new WaterContentViewHolder(LayoutInflater.from(this.d).inflate(R.layout.watermark_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(WaterContentViewHolder waterContentViewHolder, int i) {
        if (njy.e(this.e, i)) {
            return;
        }
        e(waterContentViewHolder, this.e.get(i), i, this.f22534c);
    }

    private void e(WaterContentViewHolder waterContentViewHolder, final pna pnaVar, final int i, final OnItemClickListener onItemClickListener) {
        b(waterContentViewHolder, pnaVar);
        if (pnaVar.o()) {
            waterContentViewHolder.d.setVisibility(0);
        } else {
            waterContentViewHolder.d.setVisibility(8);
        }
        lrd.b(waterContentViewHolder.itemView, pnaVar.n());
        waterContentViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.WaterItemAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WaterItemAdapter waterItemAdapter = WaterItemAdapter.this;
                pna pnaVar2 = pnaVar;
                waterItemAdapter.d(pnaVar2, !pnaVar2.o());
                WaterItemAdapter.this.e((WaterContentViewHolder) view.getTag());
                OnItemClickListener onItemClickListener2 = onItemClickListener;
                if (onItemClickListener2 != null) {
                    onItemClickListener2.onItemClick(i, null, pnaVar);
                }
                WaterItemAdapter.this.notifyDataSetChanged();
            }
        });
    }

    public void d(pna pnaVar, boolean z) {
        if (njy.e(this.e) || pnaVar == null) {
            return;
        }
        for (pna pnaVar2 : this.e) {
            if (!z) {
                pnaVar2.d(false);
            } else {
                pnaVar2.d(pnaVar2.b().equals(pnaVar.b()));
            }
        }
    }

    private void b(WaterContentViewHolder waterContentViewHolder, pna pnaVar) {
        if (pnaVar == null) {
            return;
        }
        waterContentViewHolder.f22538a.setText(pnaVar.n());
        if (!njy.b(pnaVar.j())) {
            if (TextUtils.isEmpty(pnaVar.m())) {
                if (pnaVar.e() == null) {
                    LogUtil.c("Share_WaterItemAdapter", "onWaterBindViewHolder no branch");
                    return;
                }
                waterContentViewHolder.f22539c.setVisibility(8);
                waterContentViewHolder.e.setVisibility(0);
                if (qqs.e(this.d)) {
                    waterContentViewHolder.e.setImageResource(R.mipmap.pic_rk_dark);
                    return;
                } else {
                    waterContentViewHolder.e.setImageResource(R.mipmap.pic_rk_light);
                    return;
                }
            }
            waterContentViewHolder.f22539c.setVisibility(8);
            waterContentViewHolder.e.setVisibility(0);
            Bitmap bitmapC = qqf.c(pnaVar.m());
            if (bitmapC != null) {
                waterContentViewHolder.e.setImageDrawable(qqf.c(qqf.d(bitmapC), qre.e(R.color.sleep_black)));
                return;
            }
            return;
        }
        waterContentViewHolder.f22539c.setVisibility(0);
        waterContentViewHolder.e.setVisibility(8);
        waterContentViewHolder.f22539c.a(qrs.d(this.d, 2.0f));
        b(waterContentViewHolder.f22539c, qre.e(R.color.sleep_black));
        if (LanguageUtil.c(this.d)) {
            this.f22532a = 3;
        }
        e(waterContentViewHolder.f22539c, pnaVar.j());
    }

    private void e(TrackSimpleView trackSimpleView, List<jpg> list) {
        if (trackSimpleView.getPoints() == null || list.size() != trackSimpleView.getPoints().size()) {
            LogUtil.a("Share_WaterItemAdapter", "refreshWaterPoints points change.");
            trackSimpleView.e(list, this.f22532a);
        }
    }

    private void b(TrackSimpleView trackSimpleView, int i) {
        if (i != trackSimpleView.getPaintColor()) {
            LogUtil.a("Share_WaterItemAdapter", "refreshWaterTrackColor color change.");
            trackSimpleView.e(i);
        }
    }

    public static class WaterContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextView f22538a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TrackSimpleView f22539c;
        private ImageView d;
        private ImageView e;

        public WaterContentViewHolder(View view) {
            super(view);
            this.f22539c = (TrackSimpleView) view.findViewById(R.id.track_share_simple_track);
            this.e = (ImageView) view.findViewById(R.id.track_share_bitmap_track);
            this.d = (ImageView) view.findViewById(R.id.imageViewMark);
            this.f22538a = (TextView) view.findViewById(R.id.water_mark_name);
            this.itemView.setTag(this);
        }
    }
}
