package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.fso;
import defpackage.gxl;
import defpackage.gxn;
import defpackage.gxo;
import defpackage.gxp;
import defpackage.gxq;
import defpackage.qre;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class SleepYearExpandListProvider extends SleepBaseExpandListProvider {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void handleTruSleepData(CharSequence[] charSequenceArr, SleepBaseExpandListProvider.c cVar) {
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected boolean isEffectiveDate() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected String getTag() {
        return "R_Sleep_YearExpandListProvider";
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void setSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        setProviderActive(gxqVar);
        sectionBean.d(this, gxqVar);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void updateDataUi() {
        if (getType() != 1) {
            a();
        }
    }

    private void a() {
        LogUtil.a("R_Sleep_YearExpandListProvider", "updateYearMultiSleepDataUi");
        if (this.mWeakRef == null || this.mWeakRef.get() == null) {
            LogUtil.a("R_Sleep_YearExpandListProvider", "updateYearMultiSleepDataUi, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        String itemTitle = getItemTitle(R.string.IDS_manual_sleep_average_sleep_duration, getFormatTime(e() / 60, e() % 60));
        if (getType() == 2) {
            d(itemTitle, knitSleepDetailActivity);
            return;
        }
        if (getType() == 3) {
            int iBt = ((gxp) this.mSleepViewData.k()).bt();
            this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_manual_sleep_sleep_wear_core), qre.e(R.plurals.IDS_user_profile_achieve_num_day, iBt, UnitUtil.e(iBt, 1, 0)), -1, null));
            this.mExpandReportListBean.e(getSleepTimeBean(itemTitle, e()));
        } else {
            if (getType() == 4) {
                int iAl = ((gxo) this.mSleepViewData.g()).al();
                this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_manual_sleep_phone_sleep), qre.e(R.plurals.IDS_user_profile_achieve_num_day, iAl, UnitUtil.e(iAl, 1, 0)), -1, null));
                this.mExpandReportListBean.e(getSleepTimeBean(itemTitle, e()));
                this.mExpandReportListBean.e(getBedTimeBean(getBedTime(), R.string.IDS_manual_sleep_average_bed_duration_new));
                this.mExpandReportListBean.e(getSleepLatencyBean(getSleepLatency(), R.string.IDS_avg_sleep_latency_new));
                this.mExpandReportListBean.e(getSleepEfficientBean(knitSleepDetailActivity, getSleepEfficientValue(), R.string.IDS_avg_sleep_efficiency_new));
                return;
            }
            if (getType() == 5) {
                int iV = ((gxl) this.mSleepViewData.b()).v();
                this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_manual_sleep_wear_normal_sleep), qre.e(R.plurals.IDS_user_profile_achieve_num_day, iV, UnitUtil.e(iV, 1, 0)), -1, null));
                this.mExpandReportListBean.e(getSleepTimeBean(itemTitle, e()));
                return;
            }
            LogUtil.a("R_Sleep_YearExpandListProvider", "no type match");
        }
    }

    private void d(String str, Context context) {
        int iAc = ((gxn) this.mSleepViewData.h()).ac();
        this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_manual_sleep_title), qre.e(R.plurals.IDS_user_profile_achieve_num_day, iAc, UnitUtil.e(iAc, 1, 0)), -1, null));
        this.mExpandReportListBean.e(getSleepTimeBean(str, e()));
        this.mExpandReportListBean.e(getBedTimeBean(getBedTime(), R.string.IDS_manual_sleep_average_bed_duration_new));
        this.mExpandReportListBean.e(getSleepLatencyBean(getSleepLatency(), R.string.IDS_avg_sleep_latency_new));
        this.mExpandReportListBean.e(getSleepEfficientBean(context, getSleepEfficientValue(), R.string.IDS_avg_sleep_efficiency_new));
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    public void setProviderActive(gxq gxqVar) {
        this.mIsActive = gxqVar.r();
        int type = getType();
        boolean z = false;
        if (type == 2) {
            if (this.mIsActive && ((gxn) gxqVar.h()).ac() > 0) {
                z = true;
            }
            this.mIsActive = z;
            return;
        }
        if (type == 3) {
            if (this.mIsActive && ((gxp) gxqVar.k()).bt() > 0) {
                z = true;
            }
            this.mIsActive = z;
            return;
        }
        if (type == 4) {
            if (this.mIsActive && ((gxo) gxqVar.g()).al() > 0) {
                z = true;
            }
            this.mIsActive = z;
            return;
        }
        if (type == 5) {
            if (this.mIsActive && ((gxl) gxqVar.b()).v() > 0) {
                z = true;
            }
            this.mIsActive = z;
            return;
        }
        LogUtil.a("R_Sleep_YearExpandListProvider", "onSetSectionBeanData, getType: ", Integer.valueOf(getType()));
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    public int getBedTime() {
        int iO;
        if (getType() == 4) {
            iO = this.mSleepViewData.g().o();
        } else if (getType() == 2) {
            iO = this.mSleepViewData.h().o();
        } else {
            iO = getType() == 3 ? this.mSleepViewData.k().o() : 0;
        }
        LogUtil.a("R_Sleep_YearExpandListProvider", "getBedTime deviceType ", this.mSleepViewData.n(), " sleepBedTime ", Integer.valueOf(iO));
        return iO;
    }

    private int e() {
        if (getType() == 3) {
            return this.mSleepViewData.k().i();
        }
        if (getType() == 4) {
            return this.mSleepViewData.g().i();
        }
        if (getType() == 2) {
            return this.mSleepViewData.h().i();
        }
        if (getType() == 5) {
            return this.mSleepViewData.b().i();
        }
        return this.mSleepViewData.b().i();
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    public int getSleepLatency() {
        if (getType() == 4) {
            return this.mSleepViewData.g().h();
        }
        if (getType() == 2) {
            return this.mSleepViewData.h().h();
        }
        if (getType() == 3) {
            return this.mSleepViewData.k().h();
        }
        return -1;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    public int getSleepEfficientValue() {
        if (getType() == 4) {
            return this.mSleepViewData.g().g();
        }
        if (getType() == 2) {
            return this.mSleepViewData.h().g();
        }
        if (getType() == 3) {
            return this.mSleepViewData.k().g();
        }
        return -1;
    }
}
