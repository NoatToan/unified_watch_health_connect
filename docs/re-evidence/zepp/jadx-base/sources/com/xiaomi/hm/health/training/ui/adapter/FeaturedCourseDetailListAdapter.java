package com.xiaomi.hm.health.training.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetailItem;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDetailListAdapter extends BaseQuickAdapter<FeaturedCourseDetailItem, BaseViewHolder> {
    private boolean A;
    private boolean B;
    private boolean C;

    public FeaturedCourseDetailListAdapter(@Nullable List<FeaturedCourseDetailItem> list) {
        super(R.layout.item_featured_course_detail_list, list);
    }

    public void setStatus(boolean z, boolean z2, boolean z3) {
        this.A = z;
        this.B = z2;
        this.C = z3;
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, FeaturedCourseDetailItem featuredCourseDetailItem) {
        Context context = baseViewHolder.itemView.getContext();
        if (!TextUtils.isEmpty(featuredCourseDetailItem.thumbnail)) {
            OtherUtils.loadWithGlide(context, (ImageView) baseViewHolder.getView(R.id.iv_img), featuredCourseDetailItem.thumbnail);
        }
        if (!TextUtils.isEmpty(featuredCourseDetailItem.name)) {
            baseViewHolder.setText(R.id.tv_name, featuredCourseDetailItem.name);
        }
        int iCeil = (int) Math.ceil(featuredCourseDetailItem.duration / 60000.0d);
        baseViewHolder.setText(R.id.tv_time, context.getResources().getQuantityString(R.plurals.with_minute_time, iCeil, Integer.valueOf(iCeil)));
        if (featuredCourseDetailItem.consumption != null) {
            String quantityString = context.getResources().getQuantityString(R.plurals.with_kcal, featuredCourseDetailItem.consumption.intValue(), Integer.valueOf(featuredCourseDetailItem.consumption.intValue()));
            if (TextUtils.isEmpty(quantityString)) {
                baseViewHolder.setVisible(R.id.view_divider1, false);
            } else {
                baseViewHolder.setText(R.id.tv_consumption, quantityString);
            }
        } else {
            baseViewHolder.setVisible(R.id.view_divider1, false);
        }
        if (TextUtils.isEmpty(featuredCourseDetailItem.instrument)) {
            baseViewHolder.setVisible(R.id.view_divider2, false);
        } else {
            String namesFromJsonArray = ParseJsonUtil.getNamesFromJsonArray(featuredCourseDetailItem.instrument, " ");
            if (TextUtils.isEmpty(namesFromJsonArray)) {
                baseViewHolder.setVisible(R.id.view_divider2, false);
            } else {
                baseViewHolder.setText(R.id.tv_instrument, namesFromJsonArray);
            }
        }
        Long l = featuredCourseDetailItem.participantNumber;
        if (l != null) {
            if (l.longValue() == 0) {
                baseViewHolder.setText(R.id.tv_learn_times, context.getResources().getString(R.string.tr_not_learn_yet));
            } else {
                baseViewHolder.setText(R.id.tv_learn_times, TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(context.getResources().getQuantityString(R.plurals.learn_times, featuredCourseDetailItem.participantNumber.intValue(), Integer.valueOf(featuredCourseDetailItem.participantNumber.intValue())), this.mContext, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this.mContext, 13.0f)), Integer.valueOf(ContextCompat.getColor(this.mContext, R.color.s1))));
            }
        }
        baseViewHolder.setVisible(R.id.tv_preview, (this.C || this.A || getItemDataPosition(baseViewHolder) != 0) ? false : true);
        if (getItemDataPosition(baseViewHolder) == 0 || this.C || this.A) {
            baseViewHolder.setVisible(R.id.layout_lock, false);
            baseViewHolder.setVisible(R.id.iv_lock, false);
        } else {
            baseViewHolder.setVisible(R.id.layout_lock, true);
            baseViewHolder.setVisible(R.id.iv_lock, true);
        }
    }
}
