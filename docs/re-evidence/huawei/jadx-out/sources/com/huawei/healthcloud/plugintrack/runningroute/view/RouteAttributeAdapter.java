package com.huawei.healthcloud.plugintrack.runningroute.view;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gdp;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RouteAttributeAdapter extends ArrayAdapter {
    private final List<gdp> e;

    public RouteAttributeAdapter(Context context, int i, List<gdp> list) {
        super(context, i, list);
        this.e = list;
    }

    public int b(int i) {
        gdp gdpVar;
        if (!njy.c(this.e, i) || (gdpVar = this.e.get(i)) == null) {
            return 0;
        }
        return gdpVar.b();
    }

    public int a(int i) {
        if (njy.e(this.e)) {
            LogUtil.j("Track_RouteAttributeAdapter", "mPathAttributeList is empty");
            return 0;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            gdp gdpVar = this.e.get(i2);
            if (gdpVar != null && gdpVar.b() == i) {
                return i2;
            }
        }
        return 0;
    }
}
