package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jpq;
import defpackage.jql;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingPerformanceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f11304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f11305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f11306c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private boolean g;
    private SkippingPerformanceRadarView h;

    public SkippingPerformanceView(Context context) {
        this(context, null, 0);
    }

    public SkippingPerformanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkippingPerformanceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        a(context);
    }

    private void a(final Context context) {
        if (context == null) {
            LogUtil.e("Track_SkippingPerformanceView", "context is null");
            return;
        }
        View viewInflate = View.inflate(getContext(), R.layout.track_skipping_performance_layout, this);
        this.f = (HealthTextView) qsp.a(viewInflate, R.id.skipping_performance_title_tv);
        this.f11306c = (HealthTextView) qsp.a(viewInflate, R.id.skipping_performance_best_rank_tv);
        this.d = (HealthTextView) qsp.a(viewInflate, R.id.skipping_performance_best_rank_des_tv);
        this.h = (SkippingPerformanceRadarView) qsp.a(viewInflate, R.id.skipping_performance_radar_view);
        ImageView imageView = (ImageView) qsp.a(viewInflate, R.id.skipping_performance_indicator_iv);
        this.f11305b = imageView;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.view.SkippingPerformanceView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("Track_SkippingPerformanceView", "click too fast");
                } else {
                    jpq.b(9, context);
                }
            }
        });
        this.f11304a = (HealthTextView) qsp.a(viewInflate, R.id.skipping_performance_best_of_history_label);
        this.e = (HealthTextView) qsp.a(viewInflate, R.id.skipping_performance_achievement_label);
    }

    public void setTitle(int i) {
        if (i != 0) {
            this.f.setText(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f.setText(charSequence);
    }

    public void setIsSingleRecord(boolean z) {
        this.g = z;
    }

    public boolean d() {
        return this.g;
    }

    public SkippingPerformanceRadarView getRadarView() {
        return this.h;
    }

    public void b() {
        this.f11305b.setVisibility(8);
    }

    public void setData(float[] fArr, float[] fArr2, boolean z) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
            LogUtil.e("Track_SkippingPerformanceView", "input not allowed");
            return;
        }
        String[] strArr = new String[fArr.length];
        int length = fArr2.length;
        float[] fArr3 = new float[length];
        for (int i = 0; i < length; i++) {
            if (i == 1) {
                strArr[i] = UnitUtil.e(fArr[i], 1, 2);
            } else {
                strArr[i] = UnitUtil.e(fArr[i], 1, 0);
            }
            fArr3[i] = fArr2[i] / 100.0f;
        }
        this.h.setData(strArr, fArr3, z);
        a();
    }

    private void a() {
        if (this.h.d()) {
            this.f11304a.setVisibility(0);
            this.e.setVisibility(8);
            int iB = jql.b((float[]) this.h.getHistoryData().second);
            setBestRankScore(iB, ((float[]) this.h.getHistoryData().second)[iB] * 100.0f);
            return;
        }
        if (this.h.e()) {
            this.f11304a.setVisibility(0);
            this.e.setVisibility(0);
            if (d()) {
                this.e.setText(getContext().getString(R.string.IDS_rope_performance_achievement));
            } else {
                this.e.setText(getContext().getString(R.string.IDS_rope_performance_best_of_month));
            }
            int iB2 = jql.b((float[]) this.h.getData().second);
            setBestRankScore(iB2, ((float[]) this.h.getData().second)[iB2] * 100.0f);
            return;
        }
        LogUtil.a("Track_SkippingPerformanceView", "Other cases");
    }

    public void setBestRankScore(int i, float f) {
        if (f <= 0.0f) {
            LogUtil.j("Track_SkippingPerformanceView", "The score is less than or equal to 0.");
            return;
        }
        String strE = UnitUtil.e(f, 2, 1);
        String strA = jql.a(i);
        String str = String.format(Locale.ROOT, getContext().getString(R.string.IDS_rope_performance_best_rank), strE);
        if (!TextUtils.isEmpty(strA)) {
            str = String.format(Locale.ROOT, getContext().getString(R.string.IDS_rope_performance_description_merge_rank), strA, str);
        }
        this.f11306c.setText(b(strE, str, (int) getResources().getDimension(R.dimen.health_common_20sp), ContextCompat.getColor(getContext(), R.color.colorAccent)));
        this.d.setText(getContext().getString(R.string.IDS_rope_performance_indicator_description));
    }

    private SpannableString b(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Track_SkippingPerformanceView", "acquireSpannableStrUtil: content/contentStr empty");
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf = str2.indexOf(str);
        if (iIndexOf < 0) {
            return spannableString;
        }
        spannableString.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 18);
        spannableString.setSpan(new ForegroundColorSpan(i2), iIndexOf, str.length() + iIndexOf, 18);
        spannableString.setSpan(new AbsoluteSizeSpan(i), iIndexOf, str.length() + iIndexOf, 18);
        return spannableString;
    }
}
