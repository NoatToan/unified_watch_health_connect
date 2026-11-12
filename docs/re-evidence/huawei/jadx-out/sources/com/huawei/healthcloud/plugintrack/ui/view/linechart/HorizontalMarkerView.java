package com.huawei.healthcloud.plugintrack.ui.view.linechart;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import defpackage.qnn;
import defpackage.qqv;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class HorizontalMarkerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11380b;
    private int e;

    public HorizontalMarkerView(Context context) {
        super(context);
        this.e = 0;
        this.f11380b = 0;
    }

    public void e(String str, HwHealthMarkerView.d dVar) {
        if (str == null || dVar == null) {
            return;
        }
        if (this.e != 1) {
            removeAllViews();
            inflate(getContext(), R.layout.track_horizontal_markerview_one, this);
            this.e = 1;
        }
        b((HealthTextView) findViewById(R.id.time), str);
        e((HealthTextView) findViewById(R.id.data), (HealthTextView) findViewById(R.id.unit), dVar, dVar.d);
    }

    public void a(String str, String str2, String str3) {
        if (str == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        if (this.e != 1) {
            removeAllViews();
            inflate(getContext(), R.layout.track_horizontal_markerview_one, this);
            this.e = 1;
        }
        b((HealthTextView) findViewById(R.id.time), str);
        d((HealthTextView) findViewById(R.id.data), (HealthTextView) findViewById(R.id.unit), str2, str3);
    }

    public void e(String str, HwHealthMarkerView.d dVar, HwHealthMarkerView.d dVar2) {
        if (str == null || dVar == null || dVar2 == null) {
            return;
        }
        if (this.e != 2) {
            removeAllViews();
            inflate(getContext(), R.layout.track_horizontal_markerview_two, this);
            this.e = 2;
        }
        ImageView imageView = (ImageView) findViewById(R.id.legend1);
        ImageView imageView2 = (ImageView) findViewById(R.id.legend2);
        b(imageView, dVar.f23739c, dVar.f23737a);
        b(imageView2, dVar2.f23739c, dVar2.f23737a);
        b((HealthTextView) findViewById(R.id.time), str);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.data1);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.data2);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.unit1);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.unit2);
        e(healthTextView, healthTextView3, dVar, dVar.d);
        e(healthTextView2, healthTextView4, dVar2, dVar2.d);
        c();
    }

    public void d(String str, HwHealthMarkerView.d dVar, HwHealthMarkerView.d dVar2, HwHealthMarkerView.d dVar3) {
        if (str == null || dVar == null || dVar2 == null || dVar3 == null) {
            return;
        }
        if (this.e != 3) {
            removeAllViews();
            inflate(getContext(), R.layout.track_horizontal_markerview_three, this);
            this.f11380b = 0;
            this.e = 3;
        }
        ImageView imageView = (ImageView) findViewById(R.id.legend1);
        ImageView imageView2 = (ImageView) findViewById(R.id.legend2);
        ImageView imageView3 = (ImageView) findViewById(R.id.legend3);
        b(imageView, dVar.f23739c, dVar.f23737a);
        b(imageView2, dVar2.f23739c, dVar2.f23737a);
        b(imageView3, dVar3.f23739c, dVar3.f23737a);
        b((HealthTextView) findViewById(R.id.time), str);
        a(dVar, dVar2, dVar3);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.data1);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.data2);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.data3);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.unit1);
        HealthTextView healthTextView5 = (HealthTextView) findViewById(R.id.unit2);
        HealthTextView healthTextView6 = (HealthTextView) findViewById(R.id.unit3);
        e(healthTextView, healthTextView4, dVar, dVar.d);
        e(healthTextView2, healthTextView5, dVar2, dVar2.d);
        e(healthTextView3, healthTextView6, dVar3, dVar3.d);
        b(this);
    }

    private void a(HwHealthMarkerView.d dVar, HwHealthMarkerView.d dVar2, HwHealthMarkerView.d dVar3) {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.desc1);
        if (dVar.f23739c instanceof HwHealthLineDataSet) {
            b(healthTextView, ((HwHealthLineDataSet) dVar.f23739c).e().b());
        } else if (dVar.f23739c instanceof HwHealthBarDataSet) {
            b(healthTextView, ((HwHealthBarDataSet) dVar.f23739c).a().b());
        }
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.desc2);
        if (dVar2.f23739c instanceof HwHealthLineDataSet) {
            b(healthTextView2, ((HwHealthLineDataSet) dVar2.f23739c).e().b());
        } else if (dVar2.f23739c instanceof HwHealthBarDataSet) {
            b(healthTextView2, ((HwHealthBarDataSet) dVar2.f23739c).a().b());
        }
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.desc3);
        if (dVar3.f23739c instanceof HwHealthLineDataSet) {
            b(healthTextView3, ((HwHealthLineDataSet) dVar3.f23739c).e().b());
        } else if (dVar3.f23739c instanceof HwHealthBarDataSet) {
            b(healthTextView3, ((HwHealthBarDataSet) dVar3.f23739c).a().b());
        }
    }

    private void c() {
        if (LanguageUtil.ab(getContext())) {
            float fConvertDpToPixel = Utils.convertDpToPixel(20.0f);
            float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.textSizeBody3);
            ((HealthTextView) findViewById(R.id.time)).setTextSize(0, dimensionPixelSize);
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.data1);
            HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.data2);
            healthTextView.setTextSize(0, fConvertDpToPixel);
            healthTextView2.setTextSize(0, fConvertDpToPixel);
            HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.unit1);
            HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.unit2);
            healthTextView3.setTextSize(0, dimensionPixelSize);
            healthTextView4.setTextSize(0, dimensionPixelSize);
        }
    }

    private void b(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.timer_layout);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.marker_data_Layout);
        linearLayout.measure(0, 0);
        linearLayout2.measure(0, 0);
        float fD = qqv.d(getContext());
        if (linearLayout.getMeasuredWidth() + (linearLayout2.getMeasuredWidth() / 2.0f) + Utils.convertDpToPixel(8.0f) < fD / 2.0f) {
            findViewById(R.id.marker_data_father_Layout).setPaddingRelative(0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                return;
            }
            return;
        }
        if (linearLayout.getMeasuredWidth() + linearLayout2.getMeasuredWidth() + Utils.convertDpToPixel(8.0f) < fD - getResources().getDimension(R.dimen.maxPaddingEnd)) {
            findViewById(R.id.marker_data_father_Layout).setPaddingRelative((int) (linearLayout.getMeasuredWidth() + Utils.convertDpToPixel(8.0f)), 0, 0, 0);
            ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = GravityCompat.START;
                return;
            }
            return;
        }
        int i = this.f11380b;
        if (i >= 2) {
            return;
        }
        int i2 = i + 1;
        this.f11380b = i2;
        d(i2);
    }

    private void d(int i) {
        float fConvertDpToPixel;
        int dimensionPixelSize;
        if (i == 0) {
            fConvertDpToPixel = Utils.convertDpToPixel(24.0f);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.textSizeBody2);
        } else if (i == 1) {
            fConvertDpToPixel = Utils.convertDpToPixel(20.0f);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.textSizeBody3);
        } else {
            if (i != 2) {
                return;
            }
            fConvertDpToPixel = Utils.convertDpToPixel(18.0f);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.textSizeCaption);
        }
        float f = dimensionPixelSize;
        ((HealthTextView) findViewById(R.id.time)).setTextSize(0, f);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.desc1);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.desc2);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.desc3);
        healthTextView.setTextSize(0, f);
        healthTextView2.setTextSize(0, f);
        healthTextView3.setTextSize(0, f);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.data1);
        HealthTextView healthTextView5 = (HealthTextView) findViewById(R.id.data2);
        HealthTextView healthTextView6 = (HealthTextView) findViewById(R.id.data3);
        healthTextView4.setTextSize(0, fConvertDpToPixel);
        healthTextView5.setTextSize(0, fConvertDpToPixel);
        healthTextView6.setTextSize(0, fConvertDpToPixel);
        HealthTextView healthTextView7 = (HealthTextView) findViewById(R.id.unit1);
        HealthTextView healthTextView8 = (HealthTextView) findViewById(R.id.unit2);
        HealthTextView healthTextView9 = (HealthTextView) findViewById(R.id.unit3);
        healthTextView7.setTextSize(0, f);
        healthTextView8.setTextSize(0, f);
        healthTextView9.setTextSize(0, f);
        b(this);
    }

    private void b(ImageView imageView, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthBaseEntry hwHealthBaseEntry) {
        if (imageView == null || hwHealthBaseBarLineDataSet == null) {
            return;
        }
        if ((hwHealthBaseBarLineDataSet instanceof HwHealthBarDataSet) && ((HwHealthBarDataSet) hwHealthBaseBarLineDataSet).getDrawColorMode() == HwHealthBarDataSet.DrawColorMode.DATA_COLOR) {
            if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                e(imageView, qnn.a(((HwHealthBarEntry) hwHealthBaseEntry).acquireModel()));
                return;
            } else {
                e(imageView, 0);
                return;
            }
        }
        e(imageView, hwHealthBaseBarLineDataSet.getColor());
    }

    private void e(ImageView imageView, int i) {
        float fConvertDpToPixel = Utils.convertDpToPixel(8.0f) / 2.0f;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel}, new RectF(0.0f, 0.0f, 0.0f, 0.0f), new float[]{fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel, fConvertDpToPixel}));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        imageView.setBackgroundDrawable(shapeDrawable);
    }

    private void b(HealthTextView healthTextView, String str) {
        if (healthTextView == null || TextUtils.equals(healthTextView.getText(), str)) {
            return;
        }
        healthTextView.setText(str);
    }

    private void d(HealthTextView healthTextView, SpannableString spannableString) {
        if (healthTextView == null || TextUtils.equals(healthTextView.getText(), spannableString)) {
            return;
        }
        healthTextView.setText(spannableString);
    }

    protected String a(float f, IAxisValueFormatter iAxisValueFormatter) {
        if (iAxisValueFormatter == null) {
            return "";
        }
        return iAxisValueFormatter.getFormattedValue(f, null);
    }

    private void e(HealthTextView healthTextView, HwHealthMarkerView.d dVar) {
        if (dVar.e) {
            int iA = a(dVar.f23739c);
            if (iA > 0) {
                b(healthTextView, dVar, iA);
                return;
            } else {
                b(healthTextView, a(dVar.f23737a.getY(), dVar.f23738b));
                return;
            }
        }
        b(healthTextView, "--");
    }

    private void b(HealthTextView healthTextView, HwHealthMarkerView.d dVar, int i) {
        if (dVar.f23739c.getLabel().equals(getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_bolt_balance_left_right_touches))) {
            String strE = UnitUtil.e(dVar.f23737a.getY(), 2, 1);
            String strE2 = UnitUtil.e(100.0f - dVar.f23737a.getY(), 2, 1);
            String string = getResources().getString(com.huawei.ui.commonui.R.string.IDS_bolt_balance_rate_left_right_value, strE, strE2);
            int iIndexOf = string.indexOf(strE);
            int length = strE.length();
            int iLastIndexOf = string.lastIndexOf(strE2);
            int length2 = strE2.length();
            SpannableString spannableString = new SpannableString(string);
            if (LanguageUtil.c(getContext())) {
                d(0, iLastIndexOf, spannableString);
                d(iLastIndexOf + length2 + 1, iIndexOf, spannableString);
            } else {
                d(0, iIndexOf, spannableString);
                d(iIndexOf + length + 1, iLastIndexOf, spannableString);
            }
            d(healthTextView, spannableString);
            return;
        }
        b(healthTextView, UnitUtil.e(dVar.f23737a.getY(), 1, i));
    }

    private void d(int i, int i2, SpannableString spannableString) {
        if (i < 0 || i >= i2 || i2 >= spannableString.length()) {
            return;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), i, i2, 33);
    }

    private int a(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        if (hwHealthBaseBarLineDataSet != null && (hwHealthBaseBarLineDataSet instanceof HwHealthLineDataSet)) {
            return ((HwHealthLineDataSet) hwHealthBaseBarLineDataSet).acquireMarkViewTextDigitalCount();
        }
        return 0;
    }

    private void e(HealthTextView healthTextView, HealthTextView healthTextView2, HwHealthMarkerView.d dVar, String str) {
        boolean z = LanguageUtil.br(getContext()) || LanguageUtil.x(getContext());
        boolean zEquals = str.equals(getContext().getResources().getString(R.string.IDS_gravity_unit));
        if (z && zEquals) {
            b(healthTextView, str);
            e(healthTextView2, dVar);
            healthTextView.setTextSize(0, b(14.0f));
            healthTextView2.setTextSize(0, b(24.0f));
            return;
        }
        e(healthTextView, dVar);
        b(healthTextView2, str);
    }

    private void d(HealthTextView healthTextView, HealthTextView healthTextView2, String str, String str2) {
        boolean z = LanguageUtil.br(getContext()) || LanguageUtil.x(getContext());
        boolean zEquals = str2.equals(getContext().getResources().getString(R.string.IDS_gravity_unit));
        if (z && zEquals) {
            b(healthTextView, str2);
            b(healthTextView2, str);
            healthTextView.setTextSize(0, b(14.0f));
            healthTextView2.setTextSize(0, b(24.0f));
            return;
        }
        b(healthTextView, str);
        b(healthTextView2, str2);
    }

    private int b(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
