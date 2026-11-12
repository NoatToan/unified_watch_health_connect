package com.huawei.ui.main.stories.fitness.activity.coresleep.utils;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.health.algorithm.api.SleepMonitorAlgorithmApi;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;
import defpackage.ddb;
import defpackage.ddj;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class SleepShutEyeChareProvider extends BaseKnitDataProvider {
    private int d = 0;
    private int f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26877c = 0;
    private int g = 0;
    private String i = "";
    private String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26876b = "";
    private String h = "";
    private String n = "";
    private String j = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26875a = false;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c(b(BaseApplication.getContext()));
        sectionBean.c(new Object());
    }

    public HashMap<String, Object> b(Context context) {
        Iterator<ddj> it = ((SleepMonitorAlgorithmApi) Services.b("SleepMonitor", SleepMonitorAlgorithmApi.class)).querySleepVoiceInfo(0L, System.currentTimeMillis()).iterator();
        while (it.hasNext()) {
            ddb.c cVarC = it.next().c();
            int iE = cVarC.e();
            if (1 == iE) {
                this.f += cVarC.b();
                this.g++;
            } else if (2 == iE) {
                this.d += cVarC.b();
                this.f26877c++;
            } else {
                LogUtil.b(getLogTag(), "not dream and snore");
            }
        }
        List<Integer> listE = e(this.d);
        List<Integer> listE2 = e(this.f);
        if (listE.size() >= 2) {
            int iIntValue = listE.get(0).intValue();
            int iIntValue2 = listE.get(1).intValue();
            if (iIntValue == 0) {
                this.e = "";
            } else {
                this.e = context.getResources().getQuantityString(R.plurals.IDS_sleep_minute, iIntValue, UnitUtil.e(iIntValue, 1, 0));
            }
            if (iIntValue2 == 0 && iIntValue != 0) {
                this.f26876b = "";
            } else {
                this.f26876b = context.getResources().getQuantityString(R.plurals.IDS_sleep_second, iIntValue2, UnitUtil.e(iIntValue2, 1, 0));
            }
        }
        this.i = context.getResources().getString(com.huawei.health.servicesui.R.string.IDS_sleep_total_time);
        this.i = String.format(Locale.ENGLISH, this.i, this.e + this.f26876b);
        if (listE2.size() >= 2) {
            int iIntValue3 = listE2.get(0).intValue();
            int iIntValue4 = listE2.get(1).intValue();
            if (iIntValue3 == 0) {
                this.h = "";
            } else {
                this.h = context.getResources().getQuantityString(R.plurals.IDS_sleep_minute, iIntValue3, UnitUtil.e(iIntValue3, 1, 0));
            }
            if (iIntValue4 == 0 && iIntValue3 != 0) {
                this.n = "";
            } else {
                this.n = context.getResources().getQuantityString(R.plurals.IDS_sleep_second, iIntValue4, UnitUtil.e(iIntValue4, 1, 0));
            }
        }
        this.j = context.getResources().getString(com.huawei.health.servicesui.R.string.IDS_sleep_total_time);
        this.j = String.format(Locale.ENGLISH, this.j, this.h + this.n);
        HashMap<String, Object> map = new HashMap<>();
        Resources resources = context.getResources();
        int i = R.plurals.IDS_share_dream_talk_sleep;
        int i2 = this.f26877c;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        Resources resources2 = context.getResources();
        int i3 = R.plurals.IDS_share_snore_sleep;
        int i4 = this.g;
        String quantityString2 = resources2.getQuantityString(i3, i4, Integer.valueOf(i4));
        map.put("SHARE_DREAM_TALK", quantityString);
        map.put("SHARE_SNORE", quantityString2);
        map.put("SHARE_DREAM_TALK_MINTES", this.i);
        map.put("SHARE_SNORE_MINTES", this.j);
        return map;
    }

    public List<Integer> e(int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (i < 60) {
            i2 = 0;
        } else {
            i2 = i % 60;
            i /= 60;
        }
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i));
        return arrayList;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f26875a;
    }
}
