package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.view.View;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class Vo2MaxHelp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27620c;
    private Context d;
    private HealthSubHeader e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private Integer[] j;
    private HealthTextView l;

    public Vo2MaxHelp(Context context) {
        if (context == null) {
            LogUtil.a("Vo2MaxHelp", "Vo2MaxHelp ", "context is null");
        } else {
            this.d = context;
        }
    }

    public void e(View view) {
        if (view == null) {
            LogUtil.a("Vo2MaxHelp", "onCreate ", "activity is null");
        } else {
            d(view);
            e();
        }
    }

    private void d(View view) {
        this.e = (HealthSubHeader) qsp.a(view, R.id.vo2max_help_gender);
        this.f27620c = (HealthTextView) qsp.a(view, R.id.vo2max_excellent);
        this.f = (HealthTextView) qsp.a(view, R.id.vo2max_verygood);
        this.h = (HealthTextView) qsp.a(view, R.id.vo2max_good);
        this.f27619b = (HealthTextView) qsp.a(view, R.id.vo2max_average);
        this.i = (HealthTextView) qsp.a(view, R.id.vo2max_fair);
        this.g = (HealthTextView) qsp.a(view, R.id.vo2max_poor);
        this.l = (HealthTextView) qsp.a(view, R.id.vo2max_verypoor);
    }

    public void e() {
        String str;
        String upperCase;
        if (!LanguageUtil.p(this.d)) {
            str = Constants.LINK;
        } else {
            str = "–";
        }
        String strE = e(str);
        int i = this.f27618a;
        if (i == 0) {
            upperCase = String.format(this.d.getString(R.string.IDS_hwh_health_vo2max_male_age), strE);
        } else if (i == 1) {
            upperCase = String.format(this.d.getString(R.string.IDS_hwh_health_vo2max_female_age), strE);
        } else {
            upperCase = String.format(this.d.getString(R.string.IDS_hwh_health_vo2max_peers_age), strE);
        }
        if (LanguageUtil.ax(this.d)) {
            upperCase = upperCase.toUpperCase(Locale.ENGLISH);
        }
        this.e.setHeadTitleText(upperCase);
        a();
    }

    private String e(String str) {
        StringBuilder sb = new StringBuilder(16);
        if (this.j[8].intValue() == 0) {
            if (LanguageUtil.ba(this.d)) {
                sb.append("< ");
                sb.append(UnitUtil.e(this.j[9].intValue() + 1, 1, 0));
                return sb.toString();
            }
            sb.append(HiDataFilter.DataFilterExpression.LESS_THAN);
            sb.append(UnitUtil.e(this.j[9].intValue() + 1, 1, 0));
            return sb.toString();
        }
        if (this.j[9].intValue() == 0) {
            if (LanguageUtil.ba(this.d)) {
                sb.append("> ");
                sb.append(UnitUtil.e(this.j[8].intValue() - 1, 1, 0));
                return sb.toString();
            }
            sb.append(HiDataFilter.DataFilterExpression.BIGGER_THAN);
            sb.append(UnitUtil.e(this.j[8].intValue() - 1, 1, 0));
            return sb.toString();
        }
        sb.append("");
        sb.append(UnitUtil.e(this.j[8].intValue(), 1, 0));
        sb.append(str);
        sb.append(UnitUtil.e(this.j[9].intValue(), 1, 0));
        return sb.toString();
    }

    public void c(Integer[] numArr, int i) {
        if (numArr == null) {
            this.j = null;
        } else {
            this.j = (Integer[]) numArr.clone();
        }
        this.f27618a = i;
    }

    private void a() {
        d(this.d, this.f27620c, 0, this.j[6].intValue() - 1, 2);
        d(this.d, this.f, this.j[5].intValue(), this.j[6].intValue() - 1, 0);
        d(this.d, this.h, this.j[4].intValue(), this.j[5].intValue() - 1, 0);
        d(this.d, this.f27619b, this.j[3].intValue(), this.j[4].intValue() - 1, 0);
        d(this.d, this.i, this.j[2].intValue(), this.j[3].intValue() - 1, 0);
        d(this.d, this.g, this.j[1].intValue(), this.j[2].intValue() - 1, 0);
        d(this.d, this.l, this.j[1].intValue(), 0, 1);
    }

    private void d(Context context, HealthTextView healthTextView, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(16);
        if (i3 == 0) {
            sb.append("");
            sb.append(UnitUtil.e(i, 1, 0));
            sb.append(Constants.LINK);
            sb.append(UnitUtil.e(i2, 1, 0));
            healthTextView.setText(sb.toString());
            return;
        }
        if (i3 == 1) {
            if (LanguageUtil.ba(context)) {
                sb.append("");
                sb.append(UnitUtil.e(i, 1, 0));
                sb.append(" >");
                healthTextView.setText(sb.toString());
                return;
            }
            sb.append(HiDataFilter.DataFilterExpression.LESS_THAN);
            sb.append(UnitUtil.e(i, 1, 0));
            healthTextView.setText(sb.toString());
            return;
        }
        if (i3 == 2) {
            if (LanguageUtil.ba(context)) {
                sb.append("");
                sb.append(UnitUtil.e(i2, 1, 0));
                sb.append(" <");
                healthTextView.setText(sb.toString());
                return;
            }
            sb.append(HiDataFilter.DataFilterExpression.BIGGER_THAN);
            sb.append(UnitUtil.e(i2, 1, 0));
            healthTextView.setText(sb.toString());
            return;
        }
        LogUtil.j("Vo2MaxHelp", "setZone wrong type!");
    }
}
