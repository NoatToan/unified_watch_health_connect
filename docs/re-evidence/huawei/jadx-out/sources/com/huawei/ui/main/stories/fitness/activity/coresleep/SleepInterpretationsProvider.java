package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import defpackage.gwf;
import defpackage.gxd;
import defpackage.gxq;
import defpackage.njy;
import defpackage.uix;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepInterpretationsProvider extends MinorProvider<gxq> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return VersionControlUtil.isSupportSleepManagement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        int iAr;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        LogUtil.a("Sleep_SleepInterpretationsProvider", "load data");
        if (gxqVar == null) {
            LogUtil.e("Sleep_SleepInterpretationsProvider", "data is null");
            sectionBean.c((Object) null);
            return;
        }
        if (!gxqVar.r()) {
            LogUtil.a("Sleep_SleepInterpretationsProvider", "data is not valid");
            sectionBean.c((Object) null);
            return;
        }
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            LogUtil.a("Sleep_SleepInterpretationsProvider", "sleep common data, return");
            sectionBean.c((Object) null);
            return;
        }
        int i5 = AnonymousClass1.d[gxqVar.n().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                i2 = 0;
                if (i5 == 3) {
                    i3 = gxqVar.h().i();
                } else if (i5 == 4) {
                    i3 = gxqVar.b().i();
                } else {
                    LogUtil.j("Sleep_SleepInterpretationsProvider", "other sleep");
                    i4 = 0;
                }
                int i6 = i2;
                i2 = i3;
                i4 = i6;
            } else {
                iAr = gxqVar.g().u();
                i = gxqVar.g().i();
            }
            if (i2 == i4) {
                LogUtil.a("Sleep_SleepInterpretationsProvider", "total sleep time & total day sleep time is same, return");
                sectionBean.c((Object) null);
                return;
            }
            if (gxqVar.n() != SleepViewConstants.SleepTypeEnum.MANUAL && gxqVar.h().t()) {
                LogUtil.a("Sleep_SleepInterpretationsProvider", "sleep manual data not on three");
                sectionBean.c((Object) null);
                return;
            }
            obj = gxqVar.m().get("MGMT_DAILY_SLEEP_PROCESS");
            if (!(obj instanceof gxd)) {
                LogUtil.e("Sleep_SleepInterpretationsProvider", "not sleep daily result");
                sectionBean.c((Object) null);
            } else {
                LogUtil.a("Sleep_SleepInterpretationsProvider", "dailySleepProcessObject is ", obj.toString());
                sectionBean.c(gxqVar);
            }
        }
        iAr = gxqVar.k().ar();
        i = gxqVar.k().i();
        i2 = iAr;
        i3 = i + i2;
        int i7 = i2;
        i2 = i3;
        i4 = i7;
        if (i2 == i4) {
            LogUtil.a("Sleep_SleepInterpretationsProvider", "total sleep time & total day sleep time is same, return");
            sectionBean.c((Object) null);
            return;
        }
        if (gxqVar.n() != SleepViewConstants.SleepTypeEnum.MANUAL) {
        }
        obj = gxqVar.m().get("MGMT_DAILY_SLEEP_PROCESS");
        if (!(obj instanceof gxd)) {
            LogUtil.e("Sleep_SleepInterpretationsProvider", "not sleep daily result");
            sectionBean.c((Object) null);
        } else {
            LogUtil.a("Sleep_SleepInterpretationsProvider", "dailySleepProcessObject is ", obj.toString());
            sectionBean.c(gxqVar);
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepInterpretationsProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[SleepViewConstants.SleepTypeEnum.values().length];
            d = iArr;
            try {
                iArr[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        if (gxqVar == null) {
            LogUtil.e("Sleep_SleepInterpretationsProvider", "data is null, return");
            return;
        }
        Map<String, Object> mapM = gxqVar.m();
        Object obj = mapM.get("MGMT_DAILY_SLEEP_PROCESS");
        if (!(obj instanceof gxd)) {
            LogUtil.e("Sleep_SleepInterpretationsProvider", "not daily result bean");
            return;
        }
        gxd gxdVar = (gxd) obj;
        map.put("DAILY_SLEEP_INTERPRETATIONS", uix.c(gxdVar));
        map.put("DAILY_SLEEP_PROBLEM_FACTOR", uix.e(gxdVar));
        Object obj2 = mapM.get("OPEN_STATUS");
        boolean zBooleanValue = obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false;
        gwf gwfVarD = d(gxdVar);
        if (!zBooleanValue && gwfVarD != null) {
            map.put("DAILY_SLEEP_ADVICE", uix.e(gwfVarD));
        } else {
            map.remove("DAILY_SLEEP_ADVICE");
        }
        if (zBooleanValue) {
            map.put("DAILY_SLEEP_INTERPRETATIONS_TITLE", BaseApplication.b().getResources().getString(R.string.IDS_sleep_interpretation));
        } else {
            map.put("DAILY_SLEEP_INTERPRETATIONS_TITLE", BaseApplication.b().getResources().getString(R.string.IDS_sleep_interpretation_suggestions_new));
        }
    }

    private gwf d(gxd gxdVar) {
        if (gxdVar == null || njy.e(gxdVar.d())) {
            return null;
        }
        gwf gwfVarC = c(gxdVar, 2);
        if (gwfVarC != null) {
            return gwfVarC;
        }
        gwf gwfVarC2 = c(gxdVar, 1);
        return gwfVarC2 != null ? gwfVarC2 : c(gxdVar, 0);
    }

    private gwf c(gxd gxdVar, int i) {
        for (gwf gwfVar : gxdVar.d()) {
            if (gwfVar != null && gwfVar.c() == i) {
                return gwfVar;
            }
        }
        return null;
    }
}
