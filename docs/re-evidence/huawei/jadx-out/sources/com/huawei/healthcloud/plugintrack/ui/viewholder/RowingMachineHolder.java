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
import defpackage.ntm;
import defpackage.qpv;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RowingMachineHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> f11398a = new qpv<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTableWidget f11399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f11400c;
    private Context d;
    private jmb e;

    public RowingMachineHolder(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        this.d = context;
    }

    public void b(List<CommonSegment> list) {
        if (!njy.b((Object) list, ntm.class)) {
            LogUtil.d("Track_RowingMachineHolder", "segmentList is not instanceof List<RowingMachineSegment>");
            return;
        }
        jai.d(this.f11398a);
        for (CommonSegment commonSegment : list) {
            if (commonSegment instanceof ntm) {
                jai.e(this.f11398a, (ntm) commonSegment);
            }
        }
    }

    public View e() {
        this.f11400c = LayoutInflater.from(this.d).inflate(R.layout.track_share_viewholder_rowmachine_segment, (ViewGroup) null);
        b();
        return this.f11400c;
    }

    private void b() {
        this.f11399b = (HealthTableWidget) this.f11400c.findViewById(R.id.table_layout);
        this.e = new jmb(this, this.d, this.f11398a, !LanguageUtil.f(BaseApplication.b())) { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.RowingMachineHolder.4
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
        int iD = qrs.d(this.d, 46.5f);
        int rowCount = this.e.getRowCount();
        int rowHeight = this.e.getRowHeight(1);
        int iD2 = qrs.d(this.d, 4.0f);
        ViewGroup.LayoutParams layoutParams = this.f11399b.getLayoutParams();
        layoutParams.height = iD + ((rowCount - 1) * (rowHeight + iD2));
        this.f11399b.setLayoutParams(layoutParams);
        this.f11399b.setAdapter(this.e);
        this.e.notifyDataSetChanged();
    }
}
