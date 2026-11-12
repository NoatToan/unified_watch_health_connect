package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.listener.IValueTransformation;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.WeightCompare;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.CompareModel;
import com.xiaomi.hm.health.databases.model.CompareModelDao;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WeightCompare {
    private static final int o = 34;
    private static final int p = 16;
    private Context b;
    private TextView c;
    private RelativeLayout d;
    private RelativeLayout e;
    private ChartDataList g;
    private ChartProvider i;
    private List<CompareModel> j;
    private Bitmap k;
    private int n;
    private final String a = WeightCompare.class.getSimpleName();
    private int f = 0;
    private String h = null;
    private int l = 0;
    private IChartProvider m = new a();

    public class a extends ChartProvider.StatisChartProvider {
        public a() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return WeightCompare.this.e;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getF() {
            return WeightCompare.this.g;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            return new Index(-1, new BaseIndex(WeightCompare.this.f));
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return WeightCompare.this.k();
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            WeightCompare weightCompare = WeightCompare.this;
            return weightCompare.i(weightCompare.n);
        }
    }

    public WeightCompare(Context context, TextView textView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.b = context;
        this.c = textView;
        this.d = relativeLayout;
        this.e = relativeLayout2;
    }

    private void h(int i) {
        if (this.i == null) {
            this.i = new ChartProvider(this.b, true);
        }
        this.f = (i - 16) + 1;
        this.i.createChart(this.m, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig i(int i) {
        int[] iArr = {Color.parseColor("#3306b666"), Color.parseColor("#2206b666"), Color.parseColor("#1106b666"), Color.parseColor("#0006b666")};
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        StringBuilder sb = new StringBuilder();
        sb.append((int) HMWeightUtils.calcuWeight(i, 16.0f));
        Context context = this.b;
        int i2 = R.string.unit_kg;
        sb.append(context.getString(i2));
        sparseArray.put(1, new XAxisData(1, sb.toString()));
        sparseArray.put(3, new XAxisData(3));
        sparseArray.put(5, new XAxisData(5));
        sparseArray.put(7, new XAxisData(7));
        sparseArray.put(9, new XAxisData(9));
        sparseArray.put(11, new XAxisData(11));
        sparseArray.put(13, new XAxisData(13));
        sparseArray.put(15, new XAxisData(15));
        sparseArray.put(17, new XAxisData(17));
        sparseArray.put(19, new XAxisData(19, ((int) HMWeightUtils.calcuWeight(i, 34.0f)) + this.b.getString(i2)));
        return new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(this.b).setLineColor(ContextCompat.getColor(this.b, R.color.bf3_list_health)).setLineWidth(ChartUtil.dp2px(this.b, 1.3f)).setLineStyle(4).setShadowColors(iArr).setShadowBeforeIndex(false).create()).setValueStyle(new ValueStyle.Builder(this.b).setValueStyle(4).setValueBitmap(this.k).setValueBottomMargin(ChartUtil.dp2px(this.b, 8.0f)).setValueTransformation(new IValueTransformation() { // from class: or8
            @Override // com.huami.chart.listener.IValueTransformation
            public final String onValueTrans(float f, Index index) {
                return WeightCompare.l(f, index);
            }
        }).create()).setAxisStyle(new AxisStyle.Builder(this.b).setZeroY(ChartUtil.dp2px(this.b, 15.0f)).setAxisStyle(42).setXAxisScaleLineColor(ContextCompat.getColor(this.b, R.color.s4)).setXAxisScaleLineWidth(ChartUtil.dp2px(this.b, 0.5f)).setXAxisScaleLineHeight(ChartUtil.dp2px(this.b, 13.0f)).setXLabelTypeface(TypefaceManager.get().getTypeface(this.b, Font.KM)).setXLabelSize(ChartUtil.dp2px(this.b, 11.0f)).setXLabelColor(ContextCompat.getColor(this.b, R.color.s3)).setXAxisData(sparseArray).setXLabelMarginTop(ChartUtil.dp2px(this.b, 2.0f)).setXAxisLineWidth(ChartUtil.dp2px(this.b, 0.5f)).setXAxisLineColor(ContextCompat.getColor(this.b, R.color.compare_x_axis_line_color)).create()).create();
    }

    private void j(List<CompareModel> list, int i, int i2) {
        SparseArray sparseArray = new SparseArray();
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            CompareModel compareModel = list.get(i3);
            if (compareModel.getCategory().intValue() < 16) {
                iIntValue += compareModel.getCount().intValue();
            } else if (compareModel.getCategory().intValue() > 34) {
                iIntValue2 += compareModel.getCount().intValue();
            } else {
                ChartData chartData = new ChartData((compareModel.getCategory().intValue() - 16) + 1, compareModel.getCount().intValue());
                HMLog.d(this.a, "add index " + ((compareModel.getCategory().intValue() - 16) + 1) + " value " + compareModel.getCount(), new Object[0]);
                sparseArray.put(chartData.getIndex(), chartData);
            }
        }
        ChartData chartData2 = new ChartData(0, 0.0f);
        ChartData chartData3 = new ChartData(20, 0.0f);
        sparseArray.put(0, chartData2);
        sparseArray.put(chartData3.getIndex(), chartData3);
        HMLog.d(this.a, "add index 0 value " + iIntValue, new Object[0]);
        HMLog.d(this.a, "add index 20 value " + iIntValue2, new Object[0]);
        this.l = sparseArray.size();
        HMLog.d(this.a, "size == " + this.l, new Object[0]);
        this.g = new ChartDataList(sparseArray, 0, 20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig k() {
        HMLog.d(this.a, "" + this.e.getMeasuredWidth() + " , " + this.e.getMeasuredHeight() + " , " + this.l, new Object[0]);
        return new DrawConfig.Builder(this.b).setCanvasHeight(this.e.getMeasuredHeight()).setCanvasWidth(this.e.getMeasuredWidth()).setDataWidth(this.e.getMeasuredWidth() / this.l).setDataMarginLeft(ChartUtil.dp2px(this.b, 8.0f)).setDataMarginRight(ChartUtil.dp2px(this.b, 8.0f)).setDataMarginTop(ChartUtil.dp2px(this.b, 35.0f)).setDataMarginBottom(ChartUtil.dp2px(this.b, 15.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(float f, Index index) {
        return "";
    }

    public void recycle() {
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public void updateCompareView(UserInfos userInfos, float f, float f2) {
        int ageByDate = BFCallback.getInstance().getAgeByDate(userInfos.getBirthday());
        this.n = userInfos.getHeight().intValue();
        if (ageByDate < 18) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMLog.d(this.a, "old id = " + this.h + ",new id = " + userInfos.getUserId(), new Object[0]);
        if (TextUtils.isEmpty(this.h) || !this.h.equals(userInfos.getUserId())) {
            HMLog.d(this.a, "update list ************************* ", new Object[0]);
            List<CompareModel> list = this.j;
            if (list != null) {
                list.clear();
            }
            this.j = HMDaoManager.getInstance().getCompareModelDao().queryBuilder().where(CompareModelDao.Properties.AgeGroup.eq(Integer.valueOf(DetailInfoCompareHelper.getAgeRegion(ageByDate))), CompareModelDao.Properties.Gender.eq(userInfos.getGender()), CompareModelDao.Properties.Location.eq("zhongguo"), CompareModelDao.Properties.ItemType.eq("body_bmi")).orderAsc(CompareModelDao.Properties.Category).list();
            this.h = userInfos.getUserId();
        }
        HMLog.d(this.a, "weight : " + f, new Object[0]);
        List<CompareModel> list2 = this.j;
        if (list2 == null || list2.isEmpty()) {
            this.d.setVisibility(8);
            HMLog.i(this.a, "no compare datas", new Object[0]);
        } else {
            int iIntValue = 0;
            int iIntValue2 = 0;
            for (int i = 0; i < this.j.size(); i++) {
                iIntValue2 += this.j.get(i).count.intValue();
                if (f < HMWeightUtils.calcuWeight(this.n, this.j.get(i).category.intValue())) {
                    iIntValue += this.j.get(i).count.intValue();
                }
            }
            int iMin = (int) ((iIntValue / iIntValue2) * 100.0f);
            if (iMin >= 1) {
                iMin = Math.min(iMin, 99);
                HMCustomString.dataFormatDisplay(iMin, this.b.getString(R.string.bf3_weight_compare_title_pre_light, Integer.valueOf(iMin)), this.c);
            } else {
                HMCustomString.dataFormatDisplay(99, this.b.getString(R.string.bf3_weight_compare_title_99_weight, 99), this.c);
            }
            HMLog.i(this.a, "compare datas : " + iIntValue + "; " + iIntValue2 + ";" + iMin, new Object[0]);
            if (f2 > 34.0f) {
                f2 = 34.0f;
            }
            float f3 = 16.0f;
            if (f2 > 16.0f) {
                int i2 = (int) f2;
                if (f2 - i2 > 0.5d) {
                    i2++;
                }
                f3 = i2;
            }
            if (this.g == null) {
                this.k = BitmapFactory.decodeResource(this.b.getResources(), R.drawable.weight_position);
            }
            int i3 = (int) f3;
            j(this.j, i3, this.n);
            h(i3);
        }
        HMLog.d(this.a, "time used = " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
    }
}
