package com.huawei.health.knit.data;

import android.content.Context;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class KnitDataProviderGroup<T> extends MinorProvider<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<KnitDataProvider<T>> f7211b = new ArrayList();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        if (njy.e(this.f7211b)) {
            return false;
        }
        Iterator<KnitDataProvider<T>> it = this.f7211b.iterator();
        while (it.hasNext()) {
            if (it.next().isActive(context)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        LogUtil.a("KnitDataProviderGroup", "loadDefaultData");
        if (njy.e(this.f7211b)) {
            return;
        }
        Iterator<KnitDataProvider<T>> it = this.f7211b.iterator();
        while (it.hasNext()) {
            it.next().loadDefaultData(sectionBean);
        }
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        super.loadData(context, sectionBean);
        LogUtil.a("KnitDataProviderGroup", "loadData");
        if (njy.e(this.f7211b)) {
            return;
        }
        Iterator<KnitDataProvider<T>> it = this.f7211b.iterator();
        while (it.hasNext()) {
            it.next().loadData(context, sectionBean);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, T t) {
        super.parseParams(context, map, t);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public List<KnitDataProvider<T>> getDataProviderList() {
        return this.f7211b;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        if (njy.e(this.f7211b)) {
            return;
        }
        for (KnitDataProvider<T> knitDataProvider : this.f7211b) {
            if (knitDataProvider != null) {
                knitDataProvider.onDestroy();
            }
        }
        this.f7211b.clear();
        this.f7211b = null;
    }

    @Override // com.huawei.health.knit.data.MinorProvider
    public void onSetSectionBeanData(SectionBean sectionBean, T t) {
        LogUtil.a("KnitDataProviderGroup", "onSetSectionBeanData");
        if (njy.e(this.f7211b)) {
            return;
        }
        for (KnitDataProvider<T> knitDataProvider : this.f7211b) {
            if (knitDataProvider instanceof MinorProvider) {
                ((MinorProvider) knitDataProvider).onSetSectionBeanData(sectionBean, t);
            }
        }
    }

    public KnitDataProviderGroup e(List<KnitDataProvider<T>> list) {
        this.f7211b.clear();
        this.f7211b.addAll(list);
        return this;
    }
}
