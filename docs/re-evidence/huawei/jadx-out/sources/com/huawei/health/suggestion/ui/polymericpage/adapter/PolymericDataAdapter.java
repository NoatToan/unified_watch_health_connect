package com.huawei.health.suggestion.ui.polymericpage.adapter;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.hjg;
import defpackage.qrs;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PolymericDataAdapter extends LoadMoreRecyclerViewAdapter<Workout> {
    protected static final float FITNESS_LARGE_FONT_SCALE_MODE_MIN = 1.3f;
    private static final String TAG = "Suggestion_PolymericDataAdapter";
    protected boolean mIsShowSquare;
    protected int mNavigationId;
    protected float mWeight;

    public abstract void onItemClick(Workout workout, int i);

    public abstract void setCardBackground(ImageView imageView, Workout workout, int i);

    public abstract void setNewPic(ImageView imageView, Workout workout);

    public abstract void setRecycleHolder(RecyclerHolder recyclerHolder, Workout workout, int i);

    public PolymericDataAdapter(List<Workout> list, RecyclerView recyclerView, int i) {
        super(list, recyclerView, i);
        this.mIsShowSquare = false;
        this.mWeight = hjg.a();
    }

    @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter
    public void convert(RecyclerHolder recyclerHolder, int i, Workout workout) {
        if (workout == null) {
            LogUtil.j(TAG, "convert, workout is null.");
            return;
        }
        LogUtil.a(TAG, "convert, holder.itemView.getWidth() = ", Integer.valueOf(recyclerHolder.itemView.getWidth()));
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name);
        if (!Utils.o()) {
            healthTextView.setMaxLines(1);
            healthTextView.setSingleLine(true);
            healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        healthTextView.setText(StringUtils.c((Object) workout.acquireName()));
        recyclerHolder.e(R.id.tv_plan_peoples_num, isShowPeoplesNum() ? 0 : 8);
        setNewPic((ImageView) recyclerHolder.d(R.id.new_imageView), workout);
        if (!this.mIsShowSquare) {
            setCardBackground((ImageView) recyclerHolder.d(R.id.sug_img_item_pic), workout, i);
        }
        setRecycleHolder(recyclerHolder, workout, i);
    }

    public void setNavigationId(int i) {
        this.mNavigationId = i;
    }

    public void setIsShowSquare(boolean z) {
        this.mIsShowSquare = z;
    }

    protected boolean isShowPeoplesNum() {
        if (qrs.d(1.3f)) {
            return false;
        }
        return Utils.j();
    }

    protected void setLevelAndParameterNumAndCalorieState(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3, int i, int i2) {
        healthTextView.setVisibility(i);
        healthTextView2.setVisibility(i);
        if (qrs.d(1.3f)) {
            healthTextView.setTextSize(getTextSize(R.dimen.health_common_6sp));
            healthTextView3.setTextSize(getTextSize(R.dimen.health_common_6sp));
            healthTextView2.setTextSize(getTextSize(R.dimen.health_common_6sp));
        }
        if (healthTextView3.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) healthTextView3.getLayoutParams();
            layoutParams.setMarginStart(i2);
            layoutParams.baselineToBaseline = -1;
        }
    }

    protected float getTextSize(int i) {
        return btx.c().getResources().getDimensionPixelSize(i) / qrs.j(btx.c());
    }

    protected int getTextColor(int i) {
        return ContextCompat.getColor(btx.c(), i);
    }
}
