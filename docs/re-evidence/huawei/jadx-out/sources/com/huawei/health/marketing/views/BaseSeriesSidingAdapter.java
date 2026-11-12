package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ColumRecommendInfo;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListStandardContent;
import com.huawei.health.servicesui.R;
import defpackage.fxl;
import defpackage.fxm;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseSeriesSidingAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected Context mContext;
    private fxm mMarketingBiUtil;
    protected int mPositionId;
    protected ResourceBriefInfo mResourceBriefInfo;
    protected String mResourceId;
    protected String TAG = getLogTag();
    protected List<T> mList = new ArrayList();

    protected abstract int getItemWidth();

    protected abstract int getTitleColorId();

    public BaseSeriesSidingAdapter(Context context, int i, ResourceBriefInfo resourceBriefInfo, String str) {
        this.mContext = context;
        this.mPositionId = i;
        this.mResourceBriefInfo = resourceBriefInfo;
        this.mResourceId = resourceBriefInfo.getResourceId();
        this.mMarketingBiUtil = new fxm(i, str, this.mResourceBriefInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public void setDataList(List<T> list, ResourceBriefInfo resourceBriefInfo) {
        this.mList.clear();
        this.mList.addAll(list);
        this.mResourceBriefInfo = resourceBriefInfo;
    }

    protected fxm getMarketingBiUtil() {
        return this.mMarketingBiUtil;
    }

    protected void setRecyclerViewItemLayout(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.LayoutParams layoutParams = getLayoutParams(viewHolder, i);
        if (layoutParams == null) {
            LogUtil.c("params is invalid!", new Object[0]);
        } else {
            viewHolder.itemView.setLayoutParams(layoutParams);
        }
    }

    private RecyclerView.LayoutParams getLayoutParams(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.c("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.width = getItemWidth();
        int iC = qrs.c(this.mContext, 0, true);
        int iE = qrs.e(this.mContext, 1, true);
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        if (i == 0) {
            layoutParams2.setMarginStart(iC);
        }
        if (i == getItemCount() - 1) {
            if (i != 0) {
                iC = dimensionPixelSize;
            }
            layoutParams2.setMarginStart(iC);
            layoutParams2.setMarginEnd(iE);
        }
        if (i > 0 && i < getItemCount() - 1) {
            layoutParams2.setMarginStart(dimensionPixelSize);
        }
        return layoutParams2;
    }

    protected void setBiEventListener(String str, String str2, ColumRecommendInfo columRecommendInfo, int i, View view) {
        this.mMarketingBiUtil.e(str, str2, columRecommendInfo, i, view);
    }

    protected View.OnClickListener getViewClickListener(String str, String str2, int i) {
        return new b((BaseSeriesSidingAdapter) this, str, false, str2, i);
    }

    protected View.OnClickListener getViewClickListener(String str, boolean z, ColumRecommendInfo columRecommendInfo) {
        return new b(this, str, z, columRecommendInfo, 0);
    }

    static class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f8205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BaseSeriesSidingAdapter> f8206c;
        private final int d;
        private final String e;
        private final ColumRecommendInfo i;

        public b(BaseSeriesSidingAdapter baseSeriesSidingAdapter, String str, boolean z, String str2, int i) {
            this.f8206c = new WeakReference<>(baseSeriesSidingAdapter);
            this.e = str;
            this.f8205b = z;
            this.f8204a = str2;
            this.i = null;
            this.d = i;
        }

        public b(BaseSeriesSidingAdapter baseSeriesSidingAdapter, String str, boolean z, ColumRecommendInfo columRecommendInfo, int i) {
            this.f8206c = new WeakReference<>(baseSeriesSidingAdapter);
            this.e = str;
            this.f8205b = z;
            this.i = columRecommendInfo;
            this.f8204a = null;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.isEmpty(this.e) || qrs.r()) {
                LogUtil.d("BaseSeriesSidingAdapter_ClickListener", "linkValue is error, linkValue: ", this.e);
                return;
            }
            BaseSeriesSidingAdapter baseSeriesSidingAdapter = this.f8206c.get();
            if (baseSeriesSidingAdapter == null) {
                LogUtil.d("BaseSeriesSidingAdapter_ClickListener", "adapter is null when click.");
                return;
            }
            fxl.e(this.e, baseSeriesSidingAdapter.mPositionId, baseSeriesSidingAdapter.mResourceBriefInfo, this.d + 1);
            if (baseSeriesSidingAdapter.mMarketingBiUtil == null) {
                LogUtil.d("BaseSeriesSidingAdapter_ClickListener", "mMarketingBiUtil is null in ClickListener. Fail to setBiEvent.");
                return;
            }
            if (this.i instanceof SingleCourseRecommendListStandardContent) {
                baseSeriesSidingAdapter.mMarketingBiUtil.d(2, this.f8205b ? "e2" : "e1", (SingleCourseRecommendListStandardContent) this.i, this.d);
            } else if (this.f8205b) {
                baseSeriesSidingAdapter.mMarketingBiUtil.e(this.f8204a);
            } else {
                baseSeriesSidingAdapter.mMarketingBiUtil.b(2, "", this.f8204a, this.d, (ColumRecommendInfo) null);
            }
        }
    }

    private String setUrlPositionId(String str, int i) {
        if (str.contains("?")) {
            return str + "&pullfrom=" + i;
        }
        return str + "?pullfrom=" + i;
    }

    protected void setBackground(String str, String str2, String str3, String str4, ImageView imageView) {
        if (qqs.e(this.mContext)) {
            setBackgroundInner(str3, str4, imageView);
        } else {
            setBackgroundInner(str, str2, imageView);
        }
    }

    private void setBackgroundInner(String str, String str2, ImageView imageView) {
        if (!TextUtils.isEmpty(str)) {
            qqf.b(imageView, str, 0, 0, R.drawable.section_blank_1008);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                qsp.b(imageView, Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                LogUtil.c(this.TAG, "IllegalArgumentException");
            }
        }
    }

    protected String getLogTag() {
        return "BaseSeriesSidingAdapter";
    }
}
