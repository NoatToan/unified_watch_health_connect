package com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.esn;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RateControlStageListAdapter extends RecyclerView.Adapter<ContentHolder> {
    private static final String TAG = "RateControlStageListAdapter";
    private Context mContext;
    private List<ChoreographedSingleAction> mStageLists = new ArrayList(10);
    private int mType;

    public RateControlStageListAdapter(Context context, int i) {
        this.mContext = context;
        this.mType = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ContentHolder(LayoutInflater.from(this.mContext).inflate(R.layout.item_rate_control_course_stage, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentHolder contentHolder, int i) {
        ChoreographedSingleAction choreographedSingleAction = njy.c(this.mStageLists, i) ? this.mStageLists.get(i) : null;
        if (choreographedSingleAction == null) {
            LogUtil.j(TAG, "onBindViewHolder model is null");
        } else {
            contentHolder.setHolderData(i, choreographedSingleAction);
        }
    }

    public void setData(List<ChoreographedSingleAction> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.mStageLists)) {
            this.mStageLists.clear();
        }
        this.mStageLists.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ChoreographedSingleAction> list = this.mStageLists;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    class ContentHolder extends RecyclerView.ViewHolder {
        private HealthTextView mRateRangeValue;
        private HealthImageView mRemindImg;
        private HealthTextView mTimeValue;
        private HealthTextView mTitle;

        ContentHolder(View view) {
            super(view);
            this.mRemindImg = (HealthImageView) view.findViewById(R.id.stage_remind_img);
            this.mTitle = (HealthTextView) view.findViewById(R.id.action_title_text);
            this.mTimeValue = (HealthTextView) view.findViewById(R.id.action_time_value_text);
            this.mRateRangeValue = (HealthTextView) view.findViewById(R.id.action_rate_range_value_text);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHolderData(int i, ChoreographedSingleAction choreographedSingleAction) {
            this.mRemindImg.setBackgroundResource(i == 0 ? R.drawable.icon_title_remind_first : R.drawable.icon_title_remind);
            AtomicAction action = choreographedSingleAction.getAction();
            String quantityString = "";
            this.mTitle.setText(action == null ? "" : action.getName());
            TargetConfig targetConfig = choreographedSingleAction.getTargetConfig();
            this.mTimeValue.setText(RateControlStageListAdapter.this.mContext.getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, targetConfig == null ? "" : esn.c((long) targetConfig.getValueL())));
            TargetConfig intensityConfig = choreographedSingleAction.getIntensityConfig();
            HealthTextView healthTextView = this.mRateRangeValue;
            if (intensityConfig != null) {
                quantityString = RateControlStageListAdapter.this.mContext.getResources().getQuantityString(R.plurals.IDS_rope_times_minute, 0, Double.valueOf(intensityConfig.getValueL()).intValue() + Constants.LINK + Double.valueOf(intensityConfig.getValueH()).intValue());
            }
            healthTextView.setText(quantityString);
        }
    }
}
