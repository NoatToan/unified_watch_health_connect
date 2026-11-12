package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.algorithm.api.SleepMonitorAlgorithmApi;
import com.huawei.health.knit.data.KnitDataProviderGroup;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import defpackage.ddj;
import defpackage.gxm;
import defpackage.gxq;
import defpackage.qqk;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes43.dex */
public class SleepCollapsibleProviderGroup<T> extends KnitDataProviderGroup<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26778c;
    private boolean d;
    private boolean e = true;
    private Observer f;

    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        if (this.e) {
            return super.isActive(context);
        }
        return false;
    }

    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        super.loadData(context, sectionBean);
        if (this.f == null) {
            Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepCollapsibleProviderGroup.1
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    LogUtil.a("SleepCollapsibleProviderGroup", "group expand status changed");
                    if (objArr != null && objArr.length == 1) {
                        Object obj = objArr[0];
                        if (obj instanceof Boolean) {
                            SleepCollapsibleProviderGroup.this.d = ((Boolean) obj).booleanValue();
                            LogUtil.a("SleepCollapsibleProviderGroup", "group expand status changed, isExpandLastTime", Boolean.valueOf(SleepCollapsibleProviderGroup.this.d));
                        }
                    }
                }
            };
            this.f = observer;
            ObserverManagerUtil.d(observer, "group_array_clicked_label");
        }
    }

    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ObserverManagerUtil.a(this.f, "group_array_clicked_label");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.MinorProvider
    public void onSetSectionBeanData(SectionBean sectionBean, T t) {
        LogUtil.a("SleepCollapsibleProviderGroup", "onSetSectionBeanData");
        if (!(t instanceof gxq)) {
            this.e = false;
            sectionBean.c(t);
            return;
        }
        gxq gxqVar = (gxq) t;
        if (!gxqVar.r() || (gxqVar.d() == SleepViewConstants.ViewTypeEnum.YEAR && !gxqVar.s())) {
            LogUtil.a("SleepCollapsibleProviderGroup", "data is invalid");
            this.e = false;
            sectionBean.c(t);
            return;
        }
        if ((gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK || gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH) && gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL && (gxqVar.h().t() || gxqVar.h().i() <= 0)) {
            LogUtil.a("SleepCollapsibleProviderGroup", "isManualIsNotOnThree");
            this.e = false;
            sectionBean.c(t);
        } else if ((gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK || gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH) && gxqVar.q()) {
            LogUtil.j("SleepCollapsibleProviderGroup", "only have not satisfied sleep");
            this.e = false;
            sectionBean.c(t);
        } else {
            this.e = true;
            super.onSetSectionBeanData(sectionBean, t);
            c(t);
            sectionBean.c(t);
        }
    }

    @Override // com.huawei.health.knit.data.KnitDataProviderGroup, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, T t) {
        super.parseParams(context, map, t);
        map.put("IS_GROUP_ARRAY_VISIBILITY", Integer.valueOf(this.f26777b));
        map.put("IS_SECTION_GROUP_EXPAND", Boolean.valueOf(this.f26778c));
        map.put("BUTTON_TEXT", context.getResources().getString(R.string.IDS_sleep_expand_btn_show_more));
        map.put("ITEM_BUTTON_TEXT", context.getResources().getString(R.string.IDS_sleep_expand_btn_less));
        map.put("IS_DATA_TYPE_DAY", Boolean.valueOf(this.f26776a));
        e(map, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(HashMap<String, Object> map, T t) {
        if (t instanceof gxq) {
            gxq gxqVar = (gxq) t;
            if (gxqVar.r()) {
                gxm gxmVarG = gxqVar.g();
                long j = gxmVarG.j();
                int i = 0;
                Iterator<ddj> it = ((SleepMonitorAlgorithmApi) Services.b("SleepMonitor", SleepMonitorAlgorithmApi.class)).querySleepVoiceInfo(qqk.c(j, gxmVarG.m(), -1) / 1000, qqk.c(j, gxmVarG.m(), 0) / 1000).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    int iE = it.next().c().e();
                    if (1 == iE && i < 10) {
                        i++;
                    } else if (2 != iE || i2 >= 10) {
                        LogUtil.a("SleepCollapsibleProviderGroup", "not dream and snore");
                    } else {
                        i2++;
                    }
                }
                map.put("Snorenumber", Integer.valueOf(i));
                map.put("Dreamtalknumber", Integer.valueOf(i2));
                return;
            }
        }
        LogUtil.e("SleepCollapsibleProviderGroup", "sleep data is not valid ,cannot get dream and snore data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(T t) {
        if (t instanceof gxq) {
            gxq gxqVar = (gxq) t;
            this.f26776a = gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY;
            gxqVar.n();
            SleepViewConstants.SleepTypeEnum sleepTypeEnum = SleepViewConstants.SleepTypeEnum.COMMON;
            boolean z = VersionControlUtil.isSupportSleepManagement() && (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL || gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) && this.f26776a;
            if (gxqVar.h().q() || gxqVar.h().t() || z) {
                this.f26777b = 8;
                this.f26778c = true;
                this.d = false;
                LogUtil.a("SleepCollapsibleProviderGroup", "isOversea");
                return;
            }
            this.f26777b = 0;
            this.f26778c = false;
            if (gxqVar.k().ay() || gxqVar.g().ab()) {
                this.f26777b = 8;
                this.f26778c = true;
                this.d = false;
            } else {
                boolean z2 = this.d;
                if (z2) {
                    this.f26778c = z2;
                    this.f26777b = 0;
                }
            }
        }
    }
}
