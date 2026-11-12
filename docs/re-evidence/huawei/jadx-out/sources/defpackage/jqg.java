package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<jbo> f38825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38826b;
    private HealthTableWidget d;
    private SportDetailChartDataType e;
    private jmb f;
    private float[] h;
    private final qpv<jpj, jpn, jpn, jpn, jpn, jpn> j = new qpv<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38827c = 1.0f;

    public jqg(Context context, SportDetailChartDataType sportDetailChartDataType, List<PostureJudgeBean> list, List<jbo> list2) {
        this.f38825a = new ArrayList();
        this.e = sportDetailChartDataType;
        if (list == null || list.size() < 1) {
            LogUtil.e("Track_PostureTableViewHolder", "posturePostureJudgeBean.size() < 1", Boolean.valueOf(list.size() < 1));
        } else {
            this.f38826b = context;
            this.f38825a = list2;
        }
    }

    public void d(float f) {
        this.f38827c = f;
    }

    public void d(HealthTableWidget healthTableWidget, float[] fArr) {
        this.d = healthTableWidget;
        if (fArr != null) {
            this.h = (float[]) fArr.clone();
        }
        c();
    }

    public void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        jpz.e(qpvVar, this.e, this.f38826b);
        for (int i = 0; i < 4; i++) {
            jpz.b(qpvVar, i, this.f38825a);
        }
    }

    private void c() {
        if (this.f38826b == null) {
            return;
        }
        a(this.j);
        LogUtil.a("Track_PostureTableViewHolder", "setPaceTableAdapter");
        this.f = new jmb(this.f38826b, this.j, false, this.f38827c * (LanguageUtil.bo(this.f38826b) ? 38.5f : 20.0f)) { // from class: jqg.3
            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                return 4;
            }

            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                return 1;
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                if (jqg.this.h != null && i >= 0 && i < jqg.this.h.length) {
                    return qrs.d(jqg.this.f38826b, jqg.this.h[i]);
                }
                return super.getColumnWidth(i);
            }

            @Override // defpackage.jmb
            public int a() {
                return jqg.this.f38826b.getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
            }
        };
        LogUtil.a("Track_PostureTableViewHolder", "setAdapter");
        int iD = qrs.d(this.f38826b, (this.f38825a.size() * 25 * Math.round(this.f38827c)) + 35);
        if (this.d.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iD);
            layoutParams2.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            this.d.setLayoutParams(layoutParams2);
        }
        this.d.setPostureAdapter(this.f, this.f38827c);
        this.d.setVisibility(0);
    }
}
