package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.TotalDataRectView;
import defpackage.qqz;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ProportionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TotalDataRectView f27173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ProportionItem> f27175c;
    private LinearLayout d;
    private List<ProportionItemView> e;

    public interface ProportionItem {
        int getBlurPriority();

        float getDataValue();

        int getImageViewId();

        MotionType getMotionType();

        int getProportionItemColor();

        String getProportionItemTitle();

        void setDataValue(float f);
    }

    public ProportionView(Context context) {
        super(context);
        a();
    }

    public ProportionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ProportionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        inflate(getContext(), R.layout.view_proportion, this);
        this.f27173a = (TotalDataRectView) findViewById(R.id.proportion_bar);
        this.d = (LinearLayout) findViewById(R.id.proportion_detail);
        this.f27174b = (HealthTextView) findViewById(R.id.view_proportionSubHeader_title);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    public void e(List<ProportionItem> list) {
        int i;
        if (list == null) {
            LogUtil.e("ProportionView", "proportionItems is null");
            return;
        }
        boolean zEquals = list.equals(this.f27175c);
        if (!zEquals) {
            this.d.removeAllViews();
        }
        int blurPriority = -1;
        ProportionItem proportionItem = null;
        float dataValue = 0.0f;
        for (ProportionItem proportionItem2 : list) {
            if (proportionItem2 != null) {
                dataValue += proportionItem2.getDataValue();
                if (proportionItem2.getBlurPriority() > blurPriority && proportionItem2.getDataValue() != 0.0f) {
                    blurPriority = proportionItem2.getBlurPriority();
                    proportionItem = proportionItem2;
                }
            }
        }
        if (dataValue != 0.0f) {
            Iterator<ProportionItem> it = list.iterator();
            int iFloor = 0;
            while (it.hasNext()) {
                iFloor += (int) Math.floor((it.next().getDataValue() * 100.0f) / dataValue);
            }
            if (iFloor > 100) {
                throw new RuntimeException("percentSum > 100");
            }
            if (iFloor < 100) {
                i = 100 - iFloor;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        b(list, zEquals, dataValue, proportionItem, i);
        if (this.e.size() != 3 && this.e.size() != 4 && this.e.size() != 5) {
            throw new RuntimeException("ProportionView current only support three/four/five proportions");
        }
        if (!zEquals) {
            setProportionBarColors(this.e);
        }
        setProportionBarViewData(this.e);
        this.f27173a.postInvalidate();
        this.f27175c = list;
    }

    private void b(List<ProportionItem> list, boolean z, float f, ProportionItem proportionItem, int i) {
        if (!z) {
            this.e = new ArrayList();
        }
        for (ProportionItem proportionItem2 : list) {
            if (proportionItem2 != null) {
                int iFloor = (int) Math.floor((proportionItem2.getDataValue() * 100.0f) / f);
                if (proportionItem != null && proportionItem == proportionItem2 && i != 0) {
                    iFloor += i;
                }
                int i2 = iFloor;
                if (!z) {
                    ProportionItemView proportionItemView = new ProportionItemView(getContext(), proportionItem2.getImageViewId(), proportionItem2.getProportionItemTitle(), i2, proportionItem2.getProportionItemColor());
                    this.e.add(proportionItemView);
                    this.d.addView(proportionItemView, new LinearLayout.LayoutParams(0, -2, 1.0f));
                } else {
                    this.e.get(list.indexOf(proportionItem2)).setPercent(i2);
                }
            }
        }
    }

    public void setSubHeaderText(String str) {
        this.f27174b.setText(str);
    }

    private void setProportionBarViewData(List<ProportionItemView> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 3) {
            this.f27173a.setViewData(list.get(0).d, list.get(1).d, list.get(2).d);
            return;
        }
        if (list.size() == 4) {
            this.f27173a.setViewData(list.get(0).d, list.get(1).d, list.get(2).d, list.get(3).d);
        } else if (list.size() == 5) {
            this.f27173a.setViewData(list.get(0).d, list.get(1).d, list.get(2).d, list.get(3).d, list.get(4).d);
        } else {
            throw new RuntimeException("setProportionBarViewData not support:" + list.size());
        }
    }

    private void setProportionBarColors(List<ProportionItemView> list) {
        if (list.size() == 3) {
            this.f27173a.setColors(list.get(0).f27176b, list.get(1).f27176b, list.get(2).f27176b);
            return;
        }
        if (list.size() == 4) {
            this.f27173a.setColors(list.get(0).f27176b, list.get(1).f27176b, list.get(2).f27176b, list.get(3).f27176b);
        } else if (list.size() == 5) {
            this.f27173a.setColors(list.get(0).f27176b, list.get(1).f27176b, list.get(2).f27176b, list.get(3).f27176b, list.get(4).f27176b);
        } else {
            throw new RuntimeException("setProportionBarColors not support:" + list.size());
        }
    }

    static class ProportionItemView extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27176b;
        int d;

        public ProportionItemView(Context context, int i, String str, int i2, int i3) {
            super(context);
            this.d = i2;
            this.f27176b = i3;
            e(i, str, i3);
        }

        private void e(int i, String str, int i2) {
            inflate(getContext(), R.layout.view_proportion_each, this);
            a((ImageView) findViewById(R.id.image), i);
            ((HealthTextView) findViewById(R.id.title)).setText(str);
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.value);
            healthTextView.setText(UnitUtil.e(this.d, 2, 0));
            healthTextView.setTextColor(i2);
        }

        public void setPercent(int i) {
            this.d = i;
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.value);
            String strE = UnitUtil.e(this.d, 2, 0);
            if (healthTextView != null) {
                healthTextView.setText(strE);
            }
        }

        private void a(ImageView imageView, int i) {
            Context context = BaseApplication.getContext();
            if (LanguageUtil.ba(context)) {
                imageView.setBackground(qqz.e(context, i));
            } else {
                imageView.setBackgroundResource(i);
            }
        }
    }

    static abstract class BaseProportionItem implements ProportionItem {
        private int mBlurPriority;
        protected Context mContext;
        private int mItemColor;
        private float mValue = 0.0f;

        public BaseProportionItem(Context context, int i, int i2) {
            this.mContext = context;
            this.mBlurPriority = i;
            this.mItemColor = i2;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public void setDataValue(float f) {
            this.mValue = f;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public float getDataValue() {
            return this.mValue;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getProportionItemColor() {
            return this.mItemColor;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getBlurPriority() {
            return this.mBlurPriority;
        }
    }

    public static class b extends BaseProportionItem {
        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public b(Context context, int i) {
            super(context, 9, i);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getImageViewId() {
            return R.mipmap.ic_health_list_walk;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_main_time_line_walking);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.WALK;
        }
    }

    public static class e extends BaseProportionItem {
        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public e(Context context, int i) {
            super(context, 8, i);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getImageViewId() {
            return R.mipmap.ic_health_list_run;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_start_track_sport_type_run);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.RUN;
        }
    }

    public static class c extends BaseProportionItem {
        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public c(Context context, int i) {
            super(context, 7, i);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getImageViewId() {
            return R.mipmap.ic_health_list_bike;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_start_track_sport_type_bike);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.BIKE;
        }
    }

    public static class d extends BaseProportionItem {
        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public d(Context context, int i) {
            super(context, 6, i);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getImageViewId() {
            return R.drawable.ic_climb_gray;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_fitness_data_list_activity_action_climb);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public MotionType getMotionType() {
            return MotionType.CLIMB;
        }
    }

    public static class a extends BaseProportionItem {
        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getBlurPriority() {
            return super.getBlurPriority();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ float getDataValue() {
            return super.getDataValue();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ int getProportionItemColor() {
            return super.getProportionItemColor();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.BaseProportionItem, com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public /* bridge */ /* synthetic */ void setDataValue(float f) {
            super.setDataValue(f);
        }

        public a(Context context, int i) {
            super(context, 10, i);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public int getImageViewId() {
            return R.mipmap.ic_health_list_other_sport;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public String getProportionItemTitle() {
            return this.mContext.getResources().getString(R.string.IDS_device_setting_other);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView.ProportionItem
        public MotionType getMotionType() {
            throw new RuntimeException("other not have a specified motiontype");
        }
    }
}
