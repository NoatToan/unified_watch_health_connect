package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodPressureActivity;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import defpackage.dfi;
import defpackage.dfr;
import defpackage.ftw;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.utl;
import defpackage.uwh;
import defpackage.wgt;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureListRecordProvider extends MinorProvider<utl> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27844c;
    private List<Drawable> e = new ArrayList(5);
    private final List<uwh> d = new ArrayList();

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        Context context = BaseApplication.getContext();
        wgt.a(context);
        sectionBean.c(d(context));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f27844c;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, utl utlVar) {
        a(context, map, utlVar);
    }

    private void a(Context context, HashMap<String, Object> map, utl utlVar) {
        int i;
        ArrayList arrayList = new ArrayList(5);
        new ArrayList(5);
        ArrayList arrayList2 = new ArrayList(5);
        ArrayList arrayList3 = new ArrayList(5);
        ArrayList arrayList4 = new ArrayList(5);
        ArrayList arrayList5 = new ArrayList(5);
        for (uwh uwhVar : new ArrayList(this.d)) {
            if (uwhVar == null) {
                LogUtil.e("BloodPressureListRecordProvider", "healthData is null");
                return;
            }
            int iM = (int) uwhVar.m();
            int iO = (int) uwhVar.o();
            arrayList.add(qre.e(R.plurals.IDS_blood_pressure_result_unit, iO, UnitUtil.e(iM, 1, 0), UnitUtil.e(iO, 1, 0)));
            arrayList4.add(DateUtils.formatDateTime(context, uwhVar.g(), 137));
            if (LanguageUtil.ba(context)) {
                i = R.drawable.common_ui_arrow_left;
            } else {
                i = R.drawable.common_ui_arrow_right;
            }
            arrayList5.add(Integer.valueOf(i));
            arrayList2.add(ftw.e(iM, iO));
            arrayList3.add(Integer.valueOf(ftw.e(ftw.b(iM, iO))));
        }
        map.put("LEFT_TOP_VALUE", arrayList);
        map.put("LEFT_TOP_STATE", arrayList2);
        map.put("LEFT_TOP_STATE_COLOR", arrayList3);
        map.put("RIGHT_TIME", arrayList4);
        map.put("RIGHT_ICON", arrayList5);
        map.put("LEFT_IMAGE", new ArrayList(this.e));
        c(context, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HashMap<Integer, Integer> map, List<Drawable> list, uwh uwhVar) {
        if (map == null || uwhVar == null || list == null) {
            LogUtil.a("BloodPressureListRecordProvider", "initIcon null");
            return;
        }
        Context context = BaseApplication.getContext();
        if ("-1".equals(uwhVar.i())) {
            list.add(ContextCompat.getDrawable(context, R.drawable.health_healthdata_toobar_edit_gray_ic));
            return;
        }
        int iA = uwhVar.a();
        if (map.containsKey(Integer.valueOf(iA))) {
            list.add(ContextCompat.getDrawable(context, map.get(Integer.valueOf(iA)).intValue()));
        } else {
            list.add(ContextCompat.getDrawable(context, R.drawable.health_healthdata_toobar_edit_gray_ic));
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "BloodPressureListRecordProvider";
    }

    private HashMap<String, Object> d(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("TITLE", context.getString(R.string.IDS_hw_abnormal_bp_record));
        map.put("SHOWMORE", context.getString(R.string.IDS_hw_common_ui_xlistview_footer_hint_normal));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, utl utlVar) {
        int i;
        ArrayList arrayList = new ArrayList(utlVar.a());
        synchronized (this.d) {
            this.d.clear();
            if (njy.b(arrayList)) {
                this.f27844c = true;
                this.d.addAll(arrayList.subList(0, Math.min(arrayList.size(), 5)));
            } else {
                this.f27844c = false;
                LogUtil.e("BloodPressureListRecordProvider", "processAbnormalData failed cause abnormalList is empty!");
            }
        }
        int[] iArr = new int[this.d.size()];
        for (i = 0; i < this.d.size(); i++) {
            iArr[i] = this.d.get(i).a();
        }
        BloodPressureUtil.c(iArr, new c(sectionBean, utlVar));
    }

    private void c(final Context context, HashMap<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new BaseKnitDataProvider.c(AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_EXCEPTION_DATA_2040121.value()) { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureListRecordProvider.4
            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (qrs.c(500)) {
                    return;
                }
                super.onClick(str);
                if (str.equals("SHOWMORE")) {
                    PageModelArgs pageModelArgs = new PageModelArgs(107, "PrivacyDataConstructor", 3, 3);
                    pageModelArgs.putInt("Subpage", 3);
                    BloodPressureListRecordProvider.this.d(pageModelArgs);
                    Intent intent = new Intent(context, (Class<?>) PrivacyDataModelActivity.class);
                    intent.putExtra("extra_page_model_args", pageModelArgs);
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("BloodPressureListRecordProvider", " Jump to InputBloodPressureActivity", e.getMessage());
                    }
                }
            }

            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                BloodPressureListRecordProvider.this.b(i, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(PageModelArgs pageModelArgs) {
        uwh uwhVarC = c();
        if (uwhVarC != null) {
            pageModelArgs.putInt("categoryType", 100);
            pageModelArgs.putLong("Time", uwhVarC.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Context context) {
        if (qrs.c(500)) {
            return;
        }
        uwh uwhVarD = d(i);
        if (uwhVarD == null) {
            LogUtil.e("BloodPressureListRecordProvider", "recordList click HealthData is null");
            return;
        }
        if (dfr.b()) {
            dfi dfiVar = new dfi();
            dfiVar.a("-1".equals(uwhVarD.i()));
            dfiVar.e(uwhVarD.g());
            dfiVar.c(uwhVarD.a());
            dfr.c(context, dfiVar);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) InputBloodPressureActivity.class);
        intent.putExtra("high", uwhVarD.m());
        intent.putExtra("low", uwhVarD.o());
        intent.putExtra("deletetime", uwhVarD.g());
        intent.putExtra("bmp", uwhVarD.l());
        intent.putExtra("clientId", uwhVarD.a());
        intent.putExtra("isInputData", "-1".equals(uwhVarD.i()));
        intent.putExtra("isShowInput", false);
        intent.putExtra("measureAbnormal", (int) uwhVarD.k());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("BloodPressureListRecordProvider", " Jump to InputBloodPressureActivity", e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private uwh c() {
        if (this.mData == 0) {
            LogUtil.a("BloodPressureListRecordProvider", "mData is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(((utl) this.mData).a());
        if (arrayList.size() >= 5) {
            return (uwh) arrayList.get(4);
        }
        int size = arrayList.size() - 1;
        if (njy.e(arrayList, size)) {
            LogUtil.e("BloodPressureListRecordProvider", "getLastAbnormalData out of bounds");
            return null;
        }
        return (uwh) arrayList.get(size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private uwh d(int i) {
        if (this.mData == 0) {
            LogUtil.a("BloodPressureListRecordProvider", "mData is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(((utl) this.mData).a());
        if (njy.e(arrayList, i)) {
            LogUtil.e("BloodPressureListRecordProvider", "recordList click out of bounds");
            return null;
        }
        return (uwh) arrayList.get(i);
    }

    static class c implements BloodPressureUtil.IIconCallBack {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<BloodPressureListRecordProvider> f27845c;
        private utl d;
        private SectionBean e;

        private c(BloodPressureListRecordProvider bloodPressureListRecordProvider, SectionBean sectionBean, utl utlVar) {
            this.f27845c = new WeakReference<>(bloodPressureListRecordProvider);
            this.e = sectionBean;
            this.d = utlVar;
        }

        @Override // com.huawei.ui.main.stories.health.util.BloodPressureUtil.IIconCallBack
        public void onReceive(HashMap<Integer, Integer> map) {
            BloodPressureListRecordProvider bloodPressureListRecordProvider = this.f27845c.get();
            if (bloodPressureListRecordProvider == null || this.e == null || this.d == null) {
                return;
            }
            synchronized (bloodPressureListRecordProvider.e) {
                bloodPressureListRecordProvider.e.clear();
                Iterator it = bloodPressureListRecordProvider.d.iterator();
                while (it.hasNext()) {
                    bloodPressureListRecordProvider.c(map, bloodPressureListRecordProvider.e, (uwh) it.next());
                }
            }
            this.e.c(this.d);
        }
    }
}
