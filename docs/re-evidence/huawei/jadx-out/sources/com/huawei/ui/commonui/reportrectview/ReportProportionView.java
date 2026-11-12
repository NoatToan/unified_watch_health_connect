package com.huawei.ui.commonui.reportrectview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.MotionType;
import defpackage.njy;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ReportProportionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f23844a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReportTotalDataRectView f23845c;
    private List<ProportionItemView> d;
    private List<ProportionItem> e;

    public interface ProportionItem {
        int getBlurPriority();

        float getDataValue();

        int getImageViewId();

        MotionType getMotionType();

        int getProportionItemColor();

        String getProportionItemTitle();

        void setDataValue(float f);
    }

    public ReportProportionView(Context context) {
        super(context);
        e();
    }

    public ReportProportionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public ReportProportionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        inflate(getContext(), R.layout.report_view_proportion, this);
        this.f23845c = (ReportTotalDataRectView) findViewById(R.id.proportion_bar);
        this.f23844a = (LinearLayout) findViewById(R.id.proportion_detail);
    }

    public void d(List<ProportionItem> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportProportionView", "initData() proportionItems is empty.");
            return;
        }
        boolean zEquals = list.equals(this.e);
        if (!zEquals) {
            this.f23844a.removeAllViews();
        }
        int blurPriority = -1;
        ProportionItem proportionItem = null;
        float dataValue = 0.0f;
        for (ProportionItem proportionItem2 : list) {
            dataValue += proportionItem2.getDataValue();
            if (proportionItem2.getBlurPriority() > blurPriority && proportionItem2.getDataValue() != 0.0f) {
                blurPriority = proportionItem2.getBlurPriority();
                proportionItem = proportionItem2;
            }
        }
        int iD = d(list, dataValue);
        if (!zEquals) {
            this.d = new ArrayList(10);
        }
        for (ProportionItem proportionItem3 : list) {
            int iFloor = (int) Math.floor((proportionItem3.getDataValue() * 100.0f) / dataValue);
            if (proportionItem != null && proportionItem == proportionItem3 && iD != 0) {
                iFloor += iD;
            }
            int i = iFloor;
            if (!zEquals) {
                ProportionItemView proportionItemView = new ProportionItemView(getContext(), proportionItem3.getImageViewId(), proportionItem3.getProportionItemTitle(), i, proportionItem3.getProportionItemColor());
                this.d.add(proportionItemView);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                layoutParams.gravity = 17;
                this.f23844a.addView(proportionItemView, layoutParams);
            } else {
                this.d.get(list.indexOf(proportionItem3)).setPercent(i);
            }
        }
        if (!zEquals) {
            setProportionBarColors(this.d);
        }
        setProportionBarViewData(this.d);
        this.f23845c.postInvalidate();
        this.e = list;
    }

    private int d(List<ProportionItem> list, float f) {
        if (njy.e(list)) {
            LogUtil.j("ReportProportionView", "getPercentDiff() proportionItems is empty.");
            return 0;
        }
        if (f != 0.0f) {
            int iFloor = 0;
            for (ProportionItem proportionItem : list) {
                if (proportionItem == null) {
                    LogUtil.j("ReportProportionView", "getPercentDiff() item is null.");
                } else {
                    iFloor += (int) Math.floor((proportionItem.getDataValue() * 100.0f) / f);
                }
            }
            if (iFloor <= 100 && iFloor < 100) {
                return 100 - iFloor;
            }
        }
        return 0;
    }

    private void setProportionBarViewData(List<ProportionItemView> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportProportionView", "setProportionBarViewData proportionItemViews is empty.");
            return;
        }
        int size = list.size();
        if (size == 3) {
            this.f23845c.setViewData(list.get(0).e, list.get(1).e, list.get(2).e);
            return;
        }
        if (size == 4) {
            this.f23845c.setViewData(list.get(0).e, list.get(1).e, list.get(2).e, list.get(3).e);
            return;
        }
        if (size == 5) {
            this.f23845c.setViewData(list.get(0).e, list.get(1).e, list.get(2).e, list.get(3).e, list.get(4).e);
            return;
        }
        if (size == 2) {
            this.f23845c.setViewData(list.get(0).e, list.get(1).e);
        } else if (size == 1) {
            this.f23845c.setViewData(list.get(0).e);
        } else {
            LogUtil.j("ReportProportionView", "setProportionBarViewData size = ", Integer.valueOf(size));
        }
    }

    private void setProportionBarColors(List<ProportionItemView> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportProportionView", "setProportionBarColors proportionItemViews is empty.");
            return;
        }
        int size = list.size();
        if (size == 3) {
            this.f23845c.setColors(list.get(0).d, list.get(1).d, list.get(2).d);
            return;
        }
        if (size == 4) {
            this.f23845c.setColors(list.get(0).d, list.get(1).d, list.get(2).d, list.get(3).d);
            return;
        }
        if (size == 5) {
            this.f23845c.setColors(list.get(0).d, list.get(1).d, list.get(2).d, list.get(3).d, list.get(4).d);
            return;
        }
        if (size == 2) {
            this.f23845c.setColors(list.get(0).d, list.get(1).d);
        } else if (size == 1) {
            this.f23845c.setColors(list.get(0).d);
        } else {
            LogUtil.j("ReportProportionView", "setProportionBarColors size = ", Integer.valueOf(size));
        }
    }

    static class ProportionItemView extends LinearLayout {
        int d;
        int e;

        ProportionItemView(Context context, int i, String str, int i2, int i3) {
            super(context);
            this.e = i2;
            this.d = i3;
            d(i, str, i2, i3);
        }

        private void d(int i, String str, int i2, int i3) {
            inflate(getContext(), R.layout.report_view_proportion_each, this);
            ((ImageView) findViewById(R.id.image_dot)).setBackground(BaseApplication.getContext().getDrawable(i));
            ((HealthTextView) findViewById(R.id.title)).setText(str);
            ((HealthTextView) findViewById(R.id.value)).setText(UnitUtil.e(this.e, 2, 0));
        }

        public void setPercent(int i) {
            this.e = i;
            ((HealthTextView) findViewById(R.id.value)).setText(UnitUtil.e(this.e, 2, 0));
        }
    }

    static abstract class BaseProportionItem implements ProportionItem {
        private int mBlurPriority;
        protected Context mContext;
        private int mItemColor;
        private float mValue = 0.0f;

        BaseProportionItem(Context context, int i, int i2) {
            this.mContext = context;
            this.mBlurPriority = i;
            this.mItemColor = i2;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public void setDataValue(float f) {
            this.mValue = f;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public float getDataValue() {
            return this.mValue;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getProportionItemColor() {
            return this.mItemColor;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getBlurPriority() {
            return this.mBlurPriority;
        }
    }

    public static class d extends BaseProportionItem {
        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public d(Context context, int i) {
            super(context, 9, i);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getImageViewId() {
            return R.drawable.dot_walk_proportion;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_main_time_line_walking);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.WALK;
        }
    }

    public static class b extends BaseProportionItem {
        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public b(Context context, int i) {
            super(context, 8, i);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getImageViewId() {
            return R.drawable.dot_run_proportion;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_start_track_sport_type_run);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.RUN;
        }
    }

    public static class a extends BaseProportionItem {
        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public a(Context context, int i) {
            super(context, 7, i);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getImageViewId() {
            return R.drawable.dot_cycle_proportion;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_start_track_sport_type_bike);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.BIKE;
        }
    }

    public static class c extends BaseProportionItem {
        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public c(Context context, int i) {
            super(context, 6, i);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getImageViewId() {
            return R.drawable.dot_climb_proportion;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_fitness_data_list_activity_action_climb);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.CLIMB;
        }
    }

    public static class e extends BaseProportionItem {
        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public MotionType getMotionType() {
            return null;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.BaseProportionItem, com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public e(Context context, int i) {
            super(context, 10, i);
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public int getImageViewId() {
            return R.drawable.dot_other_proportion;
        }

        @Override // com.huawei.ui.commonui.reportrectview.ReportProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_hw_messagecenter_other);
        }
    }
}
