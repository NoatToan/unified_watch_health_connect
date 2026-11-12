package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import defpackage.ftw;
import defpackage.njy;
import defpackage.qrs;
import defpackage.utl;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureGridRecordProvider extends MinorProvider<utl> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, utl utlVar) {
        map.put("TITLE", context.getString(R.string.IDS_hw_abnormal_bp_record));
        List<String> listE = e();
        int size = listE.size();
        List<Integer> listA = a(size);
        List<SpannableString> listD = d(utlVar, size);
        map.put("TOP_TEXT", listE);
        map.put("TOP_TEXT_COLOR", listA);
        map.put("BOTTOM_UNIT", listD);
        c(context, utlVar, map);
    }

    private List<Integer> a(int i) {
        Context contextB = BaseApplication.b();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(contextB) { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureGridRecordProvider.1
            private static final long serialVersionUID = 3811114498591256154L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f27832c;

            {
                this.f27832c = contextB;
                add(Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_normal_end)));
                add(Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_low_end)));
                add(Integer.valueOf(ContextCompat.getColor(contextB, R.color.textColorSecondary)));
            }
        };
        if (i == 4) {
            arrayList.add(0, Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_high_end)));
            return arrayList;
        }
        if (i == 5) {
            arrayList.add(0, Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_moderate_end)));
            arrayList.add(0, Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_high_end)));
            return arrayList;
        }
        if (i == 6) {
            arrayList.add(0, Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_mild_end)));
            arrayList.add(0, Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_moderate_end)));
            arrayList.add(0, Integer.valueOf(ContextCompat.getColor(contextB, R.color.blood_pressure_high_end)));
            return arrayList;
        }
        LogUtil.e("BloodPressureGridRecordProvider", "get size error");
        return arrayList;
    }

    private void c(final Context context, final utl utlVar, HashMap<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new BaseKnitDataProvider.c(AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_EXCEPTION_DATA_2040121.value()) { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureGridRecordProvider.4
            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (qrs.c(500)) {
                    return;
                }
                super.onClick(i);
                PageModelArgs pageModelArgs = new PageModelArgs(107, "PrivacyDataConstructor", 3, 3);
                pageModelArgs.putInt("Subpage", 3);
                pageModelArgs.putInt("categoryType", BloodPressureGridRecordProvider.this.c(i));
                pageModelArgs.putLong("startTime", utlVar.i());
                pageModelArgs.putLong("endTime", utlVar.j());
                Intent intent = new Intent(context, (Class<?>) PrivacyDataModelActivity.class);
                intent.putExtra("extra_page_model_args", pageModelArgs);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("BloodPressureGridRecordProvider", "file not found");
                }
            }
        });
    }

    private List<SpannableString> d(utl utlVar, int i) {
        int iA = utlVar.a(5);
        int iA2 = utlVar.a(4);
        int iA3 = utlVar.a(3);
        int iA4 = utlVar.a(2);
        int iA5 = utlVar.a(0);
        Context contextB = BaseApplication.b();
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(b(contextB, iA4));
        arrayList.add(b(contextB, iA5));
        arrayList.add(b(contextB, iA + iA2 + iA3 + iA4 + iA5));
        if (i == 4) {
            arrayList.add(0, b(contextB, iA3));
            return arrayList;
        }
        if (i == 5) {
            arrayList.add(0, b(contextB, iA3));
            arrayList.add(0, b(contextB, iA2));
            return arrayList;
        }
        if (i == 6) {
            arrayList.add(0, b(contextB, iA3));
            arrayList.add(0, b(contextB, iA2));
            arrayList.add(0, b(contextB, iA));
            return arrayList;
        }
        LogUtil.a("BloodPressureGridRecordProvider", "getAbnormalTimes, get size error");
        return arrayList;
    }

    private SpannableString b(Context context, int i) {
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.IDS_bloodpressure_degree_times, i, Integer.valueOf(i)));
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, strE.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), strE.length(), spannableString.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(int i) {
        int iA = ftw.a();
        if (iA == 6) {
            if (i == 0) {
                return 5;
            }
            if (i == 1) {
                return 4;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 2;
            }
            return i == 4 ? 0 : 100;
        }
        if (iA != 5) {
            if (i == 0) {
                return 3;
            }
            if (i == 1) {
                return 2;
            }
            return i == 2 ? 0 : 100;
        }
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        return i == 3 ? 0 : 100;
    }

    public List<String> e() {
        ArrayList arrayList = new ArrayList(Arrays.asList(ftw.c()));
        if (njy.e(arrayList)) {
            LogUtil.j("BloodPressureGridRecordProvider", "getAbnormalBPGradeDesList, get strings fail");
            return new ArrayList();
        }
        if (arrayList.size() < 2) {
            LogUtil.j("BloodPressureGridRecordProvider", "getAbnormalBPGradeDesList, strings length error");
            return new ArrayList();
        }
        arrayList.remove(1);
        Collections.reverse(arrayList);
        arrayList.add(BaseApplication.b().getString(R.string.IDS_bloodpressure_all_data));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, utl utlVar) {
        BloodPressureUtil.b(sectionBean, utlVar);
    }
}
