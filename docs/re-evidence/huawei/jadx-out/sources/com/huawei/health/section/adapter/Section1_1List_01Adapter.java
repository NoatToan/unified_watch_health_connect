package com.huawei.health.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fta;
import defpackage.fts;

/* JADX INFO: loaded from: classes8.dex */
public class Section1_1List_01Adapter extends SectionX_YList_01Adapter {
    public Section1_1List_01Adapter(Context context, fta ftaVar) {
        super(context, ftaVar);
    }

    @Override // com.huawei.health.section.adapter.SectionX_YList_01Adapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 2) {
            i2 = R.layout.sectionx_ylist_02_item;
        } else {
            i2 = R.layout.section1_1list_01_item;
        }
        return new e(LayoutInflater.from(this.mContext).inflate(i2, viewGroup, false), i);
    }

    @Override // com.huawei.health.section.adapter.SectionX_YList_01Adapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SectionX_YList_01Adapter.e eVar, int i) {
        this.viewHolder = eVar;
        if (eVar.i != null) {
            d(eVar, i);
        }
    }

    private void d(SectionX_YList_01Adapter.e eVar, int i) {
        if (getItemViewType(i) == 2) {
            b(eVar, i);
        } else {
            a(eVar, i);
        }
    }

    private void a(SectionX_YList_01Adapter.e eVar, int i) {
        ViewGroup.LayoutParams layoutParams = eVar.i.getLayoutParams();
        if (getItemCount() == 1) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_300dp);
        }
        eVar.i.setLayoutParams(layoutParams);
        setItemImage(eVar, i);
        c(eVar, i);
    }

    private void c(SectionX_YList_01Adapter.e eVar, int i) {
        if (fts.d(this.nameList, i) && eVar.h != null) {
            eVar.h.setText(this.nameList.get(i));
        }
        if (fts.d(this.difficultyList, i) && eVar.e != null) {
            eVar.e.setText(this.difficultyList.get(i));
        }
        if (fts.d(this.intervalList, i) && eVar.f != null) {
            eVar.f.setText(this.intervalList.get(i));
        }
        if (fts.d(this.durationList, i) && eVar.f8731a != null) {
            eVar.f8731a.setText(this.durationList.get(i));
        }
        bindHolderTag(eVar, i);
        setItemClickListener(eVar, i);
    }

    private void b(SectionX_YList_01Adapter.e eVar, int i) {
        BITMAP_DEFAULT_CORNER = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_12dp);
        setItemImage(eVar, i);
        if (fts.d(this.nameList, i) && eVar.h != null) {
            eVar.h.setText(this.nameList.get(i));
        }
        bindHolderTag(eVar, i);
        setItemClickListener(eVar, i);
    }

    @Override // com.huawei.health.section.adapter.SectionX_YList_01Adapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItemCount() > 3 ? 2 : 1;
    }

    static class e extends SectionX_YList_01Adapter.e {
        public e(View view, int i) {
            super(view);
            if (i == 2) {
                c();
            } else {
                e();
            }
        }

        private void e() {
            this.i = (RelativeLayout) this.itemView.findViewById(R.id.recycle_item);
            this.f8733c = (HealthImageView) this.itemView.findViewById(R.id.item_picture);
            this.h = (TextView) this.itemView.findViewById(R.id.item_title);
            this.f = (TextView) this.itemView.findViewById(R.id.item_interval);
            this.e = (TextView) this.itemView.findViewById(R.id.item_difficulty);
            this.f8731a = (TextView) this.itemView.findViewById(R.id.item_duration);
            this.g = (TextView) this.itemView.findViewById(R.id.sectionX_Ylist_course_tag);
        }

        private void c() {
            this.i = (RelativeLayout) this.itemView.findViewById(R.id.recycle_item);
            this.f8733c = (HealthImageView) this.itemView.findViewById(R.id.item_picture);
            this.h = (TextView) this.itemView.findViewById(R.id.item_title);
            this.g = (TextView) this.itemView.findViewById(R.id.sectionX_Ylist_course_tag);
        }
    }
}
