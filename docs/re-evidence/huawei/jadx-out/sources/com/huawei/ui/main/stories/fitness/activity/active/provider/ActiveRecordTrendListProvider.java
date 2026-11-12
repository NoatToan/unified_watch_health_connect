package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity;
import defpackage.fsj;
import defpackage.fsw;
import defpackage.ftl;
import defpackage.iov;
import defpackage.lsl;
import defpackage.ujq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordTrendListProvider extends MinorProvider<fsj> {
    private boolean e = true;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        c(context, (HashMap<String, Object>) map, (fsj) obj);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.e;
    }

    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, fsj fsjVar) {
        this.e = !fsjVar.ag();
        super.onSetSectionBeanData(sectionBean, fsjVar);
    }

    public void c(final Context context, HashMap<String, Object> map, final fsj fsjVar) {
        LogUtil.a("SCUI_ActiveRecordTrendListProvider", "enter parseParams");
        map.put("VIEW_LIST", b(context, fsjVar));
        map.put("RIGHT_TOP_TEXT", DateFormatUtil.a(fsjVar.f(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD));
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordTrendListProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                ActiveRecordTrendListProvider.this.a(i, context, fsjVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Context context, fsj fsjVar) {
        if (i == 0) {
            ujq.a(1, 1);
            d(context, fsjVar);
        } else if (i == 1) {
            ujq.a(1, 2);
            e(context, fsjVar);
        } else if (i == 2) {
            ujq.a(1, 3);
            KnitActiveHoursActivity.e(context);
        } else {
            LogUtil.j("SCUI_ActiveRecordTrendListProvider", "enterPageByPosition switch default");
        }
    }

    private void d(Context context, fsj fsjVar) {
        Intent intent = new Intent();
        intent.setClass(context, FitnessStepDetailActivity.class);
        intent.putExtra("today_current_steps_total", fsjVar.ad());
        iov.d(context, intent);
    }

    private void e(Context context, fsj fsjVar) {
        Intent intent = new Intent();
        intent.setClass(context, FitnessSportIntensityDetailActivity.class);
        intent.putExtra("today_current_middle_and_high_total", fsjVar.ab());
        iov.d(context, intent);
    }

    private List<fsw> b(Context context, fsj fsjVar) {
        LogUtil.a("SCUI_ActiveRecordTrendListProvider", "enter getListData");
        ArrayList arrayList = new ArrayList(10);
        if (fsjVar == null) {
            LogUtil.j("SCUI_ActiveRecordTrendListProvider", "getListData data is null");
            return arrayList;
        }
        long jF = fsjVar.f();
        if (lsl.a(jF) > lsl.a(System.currentTimeMillis())) {
            LogUtil.j("SCUI_ActiveRecordTrendListProvider", "day is future", Long.valueOf(jF));
            return arrayList;
        }
        boolean zG = lsl.g(jF, System.currentTimeMillis());
        d(context, fsjVar, arrayList, jF, zG);
        e(context, fsjVar, arrayList, jF, zG);
        b(context, fsjVar, arrayList, jF, lsl.aa(jF));
        return arrayList;
    }

    private void d(Context context, fsj fsjVar, List<fsw> list, long j, boolean z) {
        fsw fswVar = new fsw();
        fswVar.e(0);
        fswVar.a(d(context, z, fsjVar, DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_MD)));
        fswVar.c(fsjVar.z());
        fswVar.b(fsjVar.x());
        fswVar.e(g(context, z, fsjVar));
        fswVar.a(fsjVar.l());
        fswVar.b(c(context, z, fsjVar));
        fswVar.b(z);
        list.add(fswVar);
    }

    private void e(Context context, fsj fsjVar, List<fsw> list, long j, boolean z) {
        fsw fswVar = new fsw();
        fswVar.e(1);
        fswVar.a(c(context, z, fsjVar, DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_MD)));
        fswVar.c(fsjVar.ac());
        fswVar.b(fsjVar.i());
        fswVar.a(fsjVar.m());
        fswVar.e(b(context, z, fsjVar));
        fswVar.b(a(context, z, fsjVar));
        fswVar.b(z);
        list.add(fswVar);
    }

    private void b(Context context, fsj fsjVar, List<fsw> list, long j, boolean z) {
        fsw fswVar = new fsw();
        fswVar.e(2);
        fswVar.a(e(context, z, fsjVar, DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_MD)));
        fswVar.c(fsjVar.ai());
        fswVar.b(fsjVar.q());
        fswVar.a(fsjVar.r());
        fswVar.e(d(context, z, fsjVar));
        fswVar.b(e(context, z, fsjVar));
        fswVar.b(z);
        list.add(fswVar);
    }

    private SpannableString d(Context context, boolean z, fsj fsjVar, String str) {
        String string;
        int iZ = fsjVar.z();
        int iL = fsjVar.l();
        if (iZ == 0 && iL == 0) {
            return new SpannableString(context.getResources().getString(R.string.IDS_active_step_none, ftl.a(8000.0d), ftl.a(10000.0d)));
        }
        int i = iZ - iL;
        boolean z2 = true;
        float fAbs = ((Math.abs(i) * 1.0f) / (iZ == 0 ? 1 : iZ)) * 100.0f;
        int iAbs = Math.abs(i);
        String strA = ftl.a(iAbs);
        String quantityString = context.getResources().getQuantityString(R.plurals.IDS_single_circle_walk_target_desc, iAbs, strA);
        if (fAbs >= 5.0f && Math.abs(fAbs - 5.0f) > 1.0E-6f) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                return new SpannableString(context.getResources().getString(R.string.IDS_active_step_equal_value));
            }
            if (iZ > iL) {
                string = context.getResources().getString(R.string.IDS_active_step_more_value, quantityString);
            } else {
                string = context.getResources().getString(R.string.IDS_active_step_less_value, quantityString);
            }
        } else {
            if (z2) {
                return new SpannableString(context.getResources().getString(R.string.IDS_active_step_equal_date_value, str));
            }
            if (iZ > iL) {
                string = context.getResources().getString(R.string.IDS_active_step_more_date_value, str, quantityString);
            } else {
                string = context.getResources().getString(R.string.IDS_active_step_less_date_value, str, quantityString);
            }
        }
        return ftl.c(context, strA, string, R.color.step_circle_process_start_color);
    }

    private SpannableString c(Context context, boolean z, fsj fsjVar, String str) {
        String string;
        int iAc = fsjVar.ac();
        int iM = fsjVar.m();
        if (iAc == 0 && iM == 0) {
            return new SpannableString(context.getResources().getString(R.string.IDS_active_intensity_none, ftl.a(5.0d), ftl.a(30.0d)));
        }
        int iAbs = Math.abs(iAc - iM);
        String strA = ftl.a(iAbs);
        String quantityString = context.getResources().getQuantityString(R.plurals.IDS_single_circle_intensity_target_desc, iAbs, strA);
        boolean z2 = iAbs <= 5;
        if (z) {
            if (z2) {
                return new SpannableString(context.getResources().getString(R.string.IDS_active_intensity_equal_value));
            }
            if (iAc > iM) {
                string = context.getResources().getString(R.string.IDS_active_intensity_more_value, quantityString);
            } else {
                string = context.getResources().getString(R.string.IDS_active_intensity_less_value, quantityString);
            }
        } else {
            if (z2) {
                return new SpannableString(context.getResources().getString(R.string.IDS_active_equals_date_value, str));
            }
            if (iAc > iM) {
                string = context.getResources().getString(R.string.IDS_active_more_date_value, str, quantityString);
            } else {
                string = context.getResources().getString(R.string.IDS_active_less_date_value, str, quantityString);
            }
        }
        return ftl.c(context, strA, string, R.color.colorAccent);
    }

    private SpannableString e(Context context, boolean z, fsj fsjVar, String str) {
        String string;
        int iAi = fsjVar.ai();
        int iR = fsjVar.r();
        if (iAi == 0 && iR == 0) {
            return new SpannableString(context.getResources().getString(R.string.IDS_active_stand_none));
        }
        int iAbs = Math.abs(iAi - iR);
        String strA = ftl.a(iAbs);
        String quantityString = context.getResources().getQuantityString(R.plurals.IDS_single_circle_active_target_desc, iAbs, strA);
        boolean z2 = iAbs == 0;
        if (z) {
            if (z2) {
                return new SpannableString(context.getResources().getString(R.string.IDS_active_stand_equal_value));
            }
            if (iAi > iR) {
                string = context.getResources().getString(R.string.IDS_active_stand_more_value, quantityString);
            } else {
                string = context.getResources().getString(R.string.IDS_active_stand_less_value, quantityString);
            }
        } else {
            if (z2) {
                return new SpannableString(context.getResources().getString(R.string.IDS_active_stand_equal_date_value, str));
            }
            if (iAi > iR) {
                string = context.getResources().getString(R.string.IDS_active_stand_more_date_value, str, quantityString);
            } else {
                string = context.getResources().getString(R.string.IDS_active_stand_less_date_value, str, quantityString);
            }
        }
        return ftl.c(context, strA, string, R.color.activity_circle_process_start_color);
    }

    private String g(Context context, boolean z, fsj fsjVar) {
        int iZ = fsjVar.z();
        return context.getResources().getQuantityString(z ? R.plurals.IDS_active_step_this_value : R.plurals.IDS_active_step_cur_value, iZ, ftl.a(iZ));
    }

    private String b(Context context, boolean z, fsj fsjVar) {
        int iAc = fsjVar.ac();
        return context.getResources().getQuantityString(z ? R.plurals.IDS_active_intensity_this_value : R.plurals.IDS_active_intensity_cur_value, iAc, ftl.a(iAc));
    }

    private String d(Context context, boolean z, fsj fsjVar) {
        int iAi = fsjVar.ai();
        return context.getResources().getQuantityString(z ? R.plurals.IDS_active_stand_today_value : R.plurals.IDS_active_stand_cur_value, iAi, ftl.a(iAi));
    }

    private String c(Context context, boolean z, fsj fsjVar) {
        int iL = fsjVar.l();
        return context.getResources().getQuantityString(z ? R.plurals.IDS_active_step_last_value : R.plurals.IDS_active_step_pre_value, iL, ftl.a(iL));
    }

    private String a(Context context, boolean z, fsj fsjVar) {
        int iM = fsjVar.m();
        return context.getResources().getQuantityString(z ? R.plurals.IDS_active_intensity_last_value : R.plurals.IDS_active_intensity_pre_value, iM, ftl.a(iM));
    }

    private String e(Context context, boolean z, fsj fsjVar) {
        int iR = fsjVar.r();
        return context.getResources().getQuantityString(z ? R.plurals.IDS_active_stand_yester_value : R.plurals.IDS_active_stand_pre_value, iR, ftl.a(iR));
    }
}
