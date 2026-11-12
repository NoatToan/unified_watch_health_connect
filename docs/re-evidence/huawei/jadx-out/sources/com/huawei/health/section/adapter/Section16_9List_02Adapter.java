package com.huawei.health.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fta;
import defpackage.qrs;

/* JADX INFO: loaded from: classes8.dex */
public class Section16_9List_02Adapter extends SectionX_YList_01Adapter {
    public Section16_9List_02Adapter(Context context, fta ftaVar) {
        super(context, ftaVar);
    }

    private void b(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_100dp);
        layoutParams.height = this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_56dp);
    }

    private void e(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_100dp);
        layoutParams.height = this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_56dp);
    }

    @Override // com.huawei.health.section.adapter.SectionX_YList_01Adapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.sectionx_ylist_01_item, viewGroup, false);
        e(((RelativeLayout) viewInflate.findViewById(R.id.section1_1list_item_picture_layout)).getLayoutParams());
        b(((ImageView) viewInflate.findViewById(R.id.item_picture)).getLayoutParams());
        ((HealthImageView) viewInflate.findViewById(R.id.img_arrow)).setVisibility(0);
        return new e(viewInflate);
    }

    @Override // com.huawei.health.section.adapter.SectionX_YList_01Adapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SectionX_YList_01Adapter.e eVar, int i) {
        this.viewHolder = eVar;
        if (i == getItemCount() - 1) {
            setDividerViewVisibility(8);
        } else if (this.mContext != null && qrs.af(this.mContext) && i == getItemCount() - 2) {
            setDividerViewVisibility(8);
        } else {
            setDividerViewVisibility(0);
        }
        setDataAndRefresh(eVar, i);
    }

    static class e extends SectionX_YList_01Adapter.e {
        public e(View view) {
            super(view);
            this.i = (RelativeLayout) view.findViewById(R.id.recycle_item);
            this.f8733c = (HealthImageView) view.findViewById(R.id.item_picture);
            this.h = (TextView) view.findViewById(R.id.item_title);
            this.f = (TextView) view.findViewById(R.id.item_interval);
            this.e = (TextView) view.findViewById(R.id.item_difficulty);
            this.f8731a = (TextView) view.findViewById(R.id.item_duration);
            this.g = (TextView) view.findViewById(R.id.sectionX_Ylist_course_tag);
            this.d = (LinearLayout) view.findViewById(R.id.item_divider);
            this.f8732b = (RelativeLayout) view.findViewById(R.id.section1_1list_item_picture_layout);
        }
    }
}
