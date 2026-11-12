package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.view.IRouteDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gdr;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RouteHintView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f11283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11285c;
    private List<Integer> d;
    private int e;
    private View g;
    private IRouteDetail i;

    public RouteHintView(Context context) {
        this(context, null);
    }

    public RouteHintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RouteHintView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RouteHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOnClickListener(this);
        c(context);
    }

    private void c(Context context) {
        View viewInflate = View.inflate(context, R.layout.route_hint_layout, this);
        this.g = viewInflate;
        this.f11284b = (HealthTextView) viewInflate.findViewById(R.id.route_in_sight_length);
        this.f11283a = (HealthTextView) this.g.findViewById(R.id.route_in_sight_name);
    }

    public void b(gdr gdrVar, IRouteDetail iRouteDetail) {
        double dN = gdrVar.n() / 1000.0d;
        if (UnitUtil.f()) {
            qsp.b(this.f11284b, BaseApplication.b().getResources().getQuantityString(R.plurals.ie_motiontrack_show_sport_unit_mile, (int) dN, UnitUtil.e(UnitUtil.e(dN, 3), 1, 2)));
        } else {
            qsp.b(this.f11284b, BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_indoor_run_km, (int) dN, UnitUtil.e(dN, 1, 2)));
        }
        qsp.b(this.f11283a, gdrVar.h());
        this.e = gdrVar.c();
        this.d = gdrVar.k();
        this.i = iRouteDetail;
        this.f11285c = gdrVar.j();
    }

    public String getPathId() {
        return this.f11285c;
    }

    public List<Integer> getPathDistanceType() {
        return Collections.singletonList(Integer.valueOf(this.e));
    }

    public List<Integer> getPathType() {
        return this.d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (TextUtils.isEmpty(this.f11285c)) {
            LogUtil.a("RouteHintView", "mPathId is or mRouteDetail is invalid");
        } else {
            this.i.show(this.f11285c);
        }
    }
}
