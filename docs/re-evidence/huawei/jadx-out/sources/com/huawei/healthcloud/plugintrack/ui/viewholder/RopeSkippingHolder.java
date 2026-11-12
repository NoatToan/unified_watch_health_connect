package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import defpackage.jai;
import defpackage.jmb;
import defpackage.jpj;
import defpackage.jpn;
import defpackage.njy;
import defpackage.ntq;
import defpackage.qpv;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RopeSkippingHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11397c;
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> e = new qpv<>();

    public RopeSkippingHolder(Context context) {
        this.f11397c = context;
    }

    public void b(List<CommonSegment> list) {
        if (!njy.b((Object) list, ntq.class)) {
            LogUtil.d("RopeSkippingHolder", "segmentList is not instanceof List<RowingMachineSegment>");
            return;
        }
        boolean zB = jai.b(list);
        jai.a(this.e, zB);
        for (CommonSegment commonSegment : list) {
            if (commonSegment instanceof ntq) {
                jai.a(this.e, (ntq) commonSegment, zB);
            }
        }
    }

    public View d() {
        this.f11396b = LayoutInflater.from(this.f11397c).inflate(R.layout.track_share_viewholder_rowmachine_segment, (ViewGroup) null);
        e();
        return this.f11396b;
    }

    private void e() {
        HealthTableWidget healthTableWidget = (HealthTableWidget) this.f11396b.findViewById(R.id.table_layout);
        jmb jmbVar = new jmb(this, this.f11397c, this.e, !LanguageUtil.f(BaseApplication.b())) { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.RopeSkippingHolder.1
            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                return 1;
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                return super.getColumnWidth(i);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                return super.getColumnCount();
            }

            @Override // defpackage.jmb
            public int a() {
                return super.a();
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getRowHeight(int i) {
                return super.getRowHeight(i);
            }
        };
        int iD = qrs.d(this.f11397c, 46.5f);
        int rowCount = jmbVar.getRowCount();
        int rowHeight = jmbVar.getRowHeight(1);
        int iD2 = qrs.d(this.f11397c, 4.0f);
        ViewGroup.LayoutParams layoutParams = healthTableWidget.getLayoutParams();
        layoutParams.height = iD + ((rowCount - 1) * (rowHeight + iD2));
        healthTableWidget.setLayoutParams(layoutParams);
        healthTableWidget.setAdapter(jmbVar);
        jmbVar.notifyDataSetChanged();
    }
}
