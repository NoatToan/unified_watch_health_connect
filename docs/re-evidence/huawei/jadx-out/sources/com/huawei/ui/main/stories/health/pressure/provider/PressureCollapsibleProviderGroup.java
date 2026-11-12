package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import com.huawei.health.knit.data.KnitDataProviderGroup;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.uyg;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class PressureCollapsibleProviderGroup<T> extends KnitDataProviderGroup<T> {
    private int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28004c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28003a = true;

    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        if (this.f28003a) {
            return super.isActive(context);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.MinorProvider
    public void onSetSectionBeanData(SectionBean sectionBean, T t) {
        LogUtil.a("PressureCollapsibleProviderGroup", "onSetSectionBeanData");
        if (!(t instanceof uyg)) {
            this.f28003a = false;
            sectionBean.c(t);
        } else if (!((uyg) t).f()) {
            LogUtil.a("PressureCollapsibleProviderGroup", "data is invalid");
            this.f28003a = false;
            sectionBean.c(t);
        } else {
            this.f28003a = true;
            super.onSetSectionBeanData(sectionBean, t);
            d(t);
            sectionBean.c(t);
        }
    }

    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, T t) {
        super.parseParams(context, map, t);
        map.put("IS_GROUP_ARRAY_VISIBILITY", Integer.valueOf(this.d));
        map.put("IS_SECTION_GROUP_EXPAND", Boolean.valueOf(this.f28004c));
        map.put("BUTTON_TEXT", context.getResources().getString(R.string.IDS_sleep_expand_btn_show_more).toUpperCase());
        map.put("ITEM_BUTTON_TEXT", context.getResources().getString(R.string.IDS_sleep_expand_btn_less).toUpperCase());
    }

    private void d(T t) {
        if ((t instanceof uyg) && Utils.o()) {
            this.d = 0;
            LogUtil.a("PressureCollapsibleProviderGroup", "isOversea");
        }
    }
}
