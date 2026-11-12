package com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.ehx;
import defpackage.esn;
import defpackage.ffy;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RateControlCourseListAdapter extends RecyclerView.Adapter<ContentHolder> {
    private static final String TAG = "RateControlCourseListAdapter";
    private Context mContext;
    private List<ffy> mCourseInfoList = new ArrayList(10);
    private OnItemClickListener mOnItemClickListener;
    private int mType;

    public interface OnItemClickListener {
        void onItemClick(ffy ffyVar);
    }

    public RateControlCourseListAdapter(Context context, int i, OnItemClickListener onItemClickListener) {
        this.mContext = context;
        this.mType = i;
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ContentHolder(LayoutInflater.from(this.mContext).inflate(R.layout.item_rate_control_course, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentHolder contentHolder, int i) {
        ffy ffyVar = njy.c(this.mCourseInfoList, i) ? this.mCourseInfoList.get(i) : null;
        if (ffyVar == null) {
            LogUtil.j(TAG, "onBindViewHolder model is null");
        } else {
            contentHolder.setHolderData(ffyVar);
        }
    }

    public void setData(List<ffy> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.mCourseInfoList)) {
            this.mCourseInfoList.clear();
        }
        this.mCourseInfoList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ffy> list = this.mCourseInfoList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    class ContentHolder extends RecyclerView.ViewHolder {
        private RelativeLayout mContentRl;
        private HealthTextView mDescription;
        private HealthTextView mDetail;
        private HealthImageView mHealthImageView;
        private HealthTextView mLevelTitle;
        private HealthTextView mTitle;

        ContentHolder(View view) {
            super(view);
            this.mContentRl = (RelativeLayout) view.findViewById(R.id.item_content_rl);
            this.mHealthImageView = (HealthImageView) view.findViewById(R.id.item_rate_mode_bg_image);
            this.mLevelTitle = (HealthTextView) view.findViewById(R.id.level_title_text);
            this.mTitle = (HealthTextView) view.findViewById(R.id.item_rate_mode_title);
            this.mDetail = (HealthTextView) view.findViewById(R.id.item_rate_mode_detail);
            this.mDescription = (HealthTextView) view.findViewById(R.id.description_text);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHolderData(final ffy ffyVar) {
            this.mLevelTitle.setVisibility(TextUtils.isEmpty(ffyVar.getGroupName()) ? 8 : 0);
            this.mLevelTitle.setText(ehx.a(RateControlCourseListAdapter.this.mType, ffyVar.getGroupName()));
            this.mTitle.setText(ehx.a(RateControlCourseListAdapter.this.mType, ffyVar.getCourseName()));
            this.mDetail.setText(ffyVar.getLevel() + "  " + RateControlCourseListAdapter.this.mContext.getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, esn.c(ffyVar.getTotalTime())));
            this.mDescription.setText(ehx.a(RateControlCourseListAdapter.this.mType, ffyVar.getDescription()));
            Glide.with(RateControlCourseListAdapter.this.mContext).load(ehx.d(RateControlCourseListAdapter.this.mType, ffyVar.getDetailImage())).transform(new RoundedCorners(RateControlCourseListAdapter.this.mContext.getResources().getDimensionPixelOffset(R.dimen.health_common_16dp))).into(this.mHealthImageView);
            this.mContentRl.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlCourseListAdapter$ContentHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1106xf39b9f3d(ffyVar, view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$setHolderData$0$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlCourseListAdapter$ContentHolder, reason: not valid java name */
        /* synthetic */ void m1106xf39b9f3d(ffy ffyVar, View view) {
            RateControlCourseListAdapter.this.mOnItemClickListener.onItemClick(ffyVar);
        }
    }
}
