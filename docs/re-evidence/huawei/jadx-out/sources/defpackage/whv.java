package defpackage;

import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyGroupDataFragment;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes19.dex */
public class whv extends wib {
    private static Map<Integer, String> d = new HashMap<Integer, String>(16) { // from class: whv.2
        private static final long serialVersionUID = 4061556043911392072L;

        {
            put(107, "com.huawei.instantaneous.blood_pressure");
            put(108, "com.huawei.instantaneous.blood_glucose");
            put(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), "com.huawei.instantaneous.body_weight");
            put(100, "com.huawei.continuous.steps.delta");
            put(112, "com.huawei.activityrecord");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52059a;
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52061c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52060b = false;

    public boolean a() {
        return this.e;
    }

    @Override // defpackage.wib
    public void c(PageModelArgs pageModelArgs) {
        e(pageModelArgs);
    }

    private void e(PageModelArgs pageModelArgs) {
        if (pageModelArgs == null) {
            return;
        }
        int dataSource = pageModelArgs.getDataSource();
        if (dataSource == 1) {
            d(pageModelArgs.getPageType(), pageModelArgs.getUuid(), pageModelArgs.getPackageName(), pageModelArgs.getClassType());
        } else if (dataSource == 2) {
            c(pageModelArgs.getPageType(), pageModelArgs.getUuid());
        } else {
            if (dataSource != 3) {
                return;
            }
            d(pageModelArgs);
        }
    }

    private void d(PageModelArgs pageModelArgs) {
        int pageType = pageModelArgs.getPageType();
        if (pageType != 102) {
            if (pageType == 103) {
                a(pageType);
                j(pageModelArgs);
                return;
            } else if (pageType == 105) {
                f(pageModelArgs);
                return;
            } else if (pageType == 106) {
                a(pageType);
                b(pageModelArgs);
                return;
            } else if (pageType != 113) {
                new wel(pageType).d(new c(this));
                return;
            }
        }
        a(pageType);
        a(pageModelArgs);
    }

    private void a(int i) {
        if (this.f52060b) {
            return;
        }
        new wgk().b(i, new b(this));
        this.f52060b = true;
    }

    private void a(PageModelArgs pageModelArgs) {
        SourceInfo sourceInfo = pageModelArgs.getSourceInfo();
        if (sourceInfo != null) {
            new wel(pageModelArgs.getPageType()).e(wig.d(sourceInfo.getSourceType()), sourceInfo.getDeviceUniqueCode(), sourceInfo.getPackageName(), new c(this));
        } else {
            new wel(pageModelArgs.getPageType()).d(new c(this));
        }
    }

    private void j(PageModelArgs pageModelArgs) {
        vzo vzoVar;
        SourceInfo sourceInfo = pageModelArgs.getSourceInfo();
        if (sourceInfo != null) {
            vzoVar = new vzo(0L, System.currentTimeMillis(), wig.d(sourceInfo.getSourceType()), sourceInfo.getDeviceUniqueCode(), sourceInfo.getPackageName());
        } else {
            vzoVar = new vzo(0L, System.currentTimeMillis(), 0, "", "");
        }
        vzoVar.c(pageModelArgs.getDataSource());
        new wel(pageModelArgs.getPageType()).d(vzoVar, new c(this));
    }

    private void f(PageModelArgs pageModelArgs) {
        vzo vzoVar = new vzo(0L, System.currentTimeMillis(), 0, "", "");
        vzoVar.c(pageModelArgs.getDataSource());
        vzoVar.a("Subpage", pageModelArgs.getInt("Subpage"));
        new wel(pageModelArgs.getPageType()).d(vzoVar, new c(this));
    }

    private void b(PageModelArgs pageModelArgs) {
        vzo vzoVar;
        SourceInfo sourceInfo = pageModelArgs.getSourceInfo();
        if (sourceInfo != null) {
            vzoVar = new vzo(0L, System.currentTimeMillis(), wig.d(sourceInfo.getSourceType()), sourceInfo.getDeviceUniqueCode(), sourceInfo.getPackageName());
        } else {
            vzoVar = new vzo(0L, System.currentTimeMillis(), 0, "", "");
        }
        new wel(pageModelArgs.getPageType()).c(vzoVar, new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, List<whz> list) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyGroupDataFragment) {
            PrivacyGroupDataFragment privacyGroupDataFragment = (PrivacyGroupDataFragment) privacyFragmentViewD;
            if (!isViewAttached()) {
                ReleaseLogUtil.d("R_GroupDataFragmentPresenter", "notifyGroupDataChange isViewAttached false");
                return;
            }
            if (i != 0) {
                ReleaseLogUtil.e("R_GroupDataFragmentPresenter", "resultCode = ", Integer.valueOf(i));
            }
            if (i != 0) {
                list = new ArrayList<>(10);
            }
            privacyGroupDataFragment.d(list);
        }
    }

    private void c(int i, String str) {
        if (this.f52061c) {
            return;
        }
        this.f52061c = true;
        if (i != 100) {
            if (i == 103) {
                b(this.f52059a, str, "65");
                return;
            }
            if (i == 112) {
                b(this.f52059a, str, "");
                return;
            }
            switch (i) {
                case 107:
                case 108:
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                    break;
                default:
                    LogUtil.j("GroupDataFragmentPresenter", "can't support the type: " + i);
                    break;
            }
            return;
        }
        c(this.f52059a, i, str);
    }

    private void b(String str, String str2, final String str3) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyGroupDataFragment) {
            final PrivacyGroupDataFragment privacyGroupDataFragment = (PrivacyGroupDataFragment) privacyFragmentViewD;
            lcy.d().b(this, new whc(str, str2, str3).getRequestParamsBuilder().c(new OnRequestCallBack<wgw>() { // from class: whv.1
                @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(wgw wgwVar) {
                    whv.this.f52061c = false;
                    if (wgwVar == null) {
                        LogUtil.a("GroupDataFragmentPresenter", "ActivityRecordsModel from cloud is null");
                        return;
                    }
                    whv.this.f52059a = wgwVar.getCursor();
                    whv.this.e = wgwVar.isHasMoreData();
                    if (TextUtils.isEmpty(str3)) {
                        PrivacyGroupDataFragment privacyGroupDataFragment2 = privacyGroupDataFragment;
                        whv whvVar = whv.this;
                        privacyGroupDataFragment2.e(whvVar.l(whvVar.c(wgwVar)));
                    } else {
                        whv whvVar2 = whv.this;
                        whvVar2.d((List<PrivacyDataModel>) whvVar2.n(wgwVar.getActivityRecord()));
                        PrivacyGroupDataFragment privacyGroupDataFragment3 = privacyGroupDataFragment;
                        whv whvVar3 = whv.this;
                        privacyGroupDataFragment3.b(whvVar3.e((Map<String, List<PrivacyDataModel>>) whvVar3.a(103, whj.a().e())));
                    }
                }

                @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
                public void onFail(int i, Throwable th) {
                    whv.this.f52061c = false;
                    if (whv.this.isViewAttached()) {
                        LogUtil.a("GroupDataFragmentPresenter", "HealthKitRequestManager request fail");
                        privacyGroupDataFragment.e(new ArrayList(10));
                    }
                }
            }).e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<wgy> c(wgw wgwVar) {
        List<wgy> activityRecord = wgwVar.getActivityRecord();
        Iterator<wgy> it = activityRecord.iterator();
        while (it.hasNext()) {
            if ("65".equals(String.valueOf(it.next().getActivityType()))) {
                it.remove();
            }
        }
        return activityRecord;
    }

    private void c(String str, final int i, String str2) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyGroupDataFragment) {
            final PrivacyGroupDataFragment privacyGroupDataFragment = (PrivacyGroupDataFragment) privacyFragmentViewD;
            lcy.d().b(this, new whi(str, str2, d.get(Integer.valueOf(i)), new SimpleDateFormat("Z").format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime())).getRequestParamsBuilder().c(new OnRequestCallBack<whb>() { // from class: whv.4
                @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(whb whbVar) {
                    whv.this.f52061c = false;
                    whv.this.e(whbVar, i, privacyGroupDataFragment);
                }

                @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
                public void onFail(int i2, Throwable th) {
                    whv.this.f52061c = false;
                    if (whv.this.isViewAttached()) {
                        privacyGroupDataFragment.e(new ArrayList(10));
                    }
                }
            }).e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(whb whbVar, int i, PrivacyGroupDataFragment privacyGroupDataFragment) {
        if (whbVar == null) {
            LogUtil.a("GroupDataFragmentPresenter", "SampleSetsModel from cloud is null");
            return;
        }
        this.f52059a = whbVar.getCursor();
        this.e = whbVar.isHasMoreData();
        if (i != 100) {
            switch (i) {
                case 107:
                case 108:
                    privacyGroupDataFragment.e(a(i, whbVar.getSamplePointList()));
                    break;
            }
            return;
        }
        d(d(i, whbVar.getSamplePointList()));
        privacyGroupDataFragment.b(e(a(i, whj.a().e())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<PrivacyDataModel> list) {
        for (PrivacyDataModel privacyDataModel : list) {
            whj.a().b(wig.j(privacyDataModel.getStartTime()), privacyDataModel);
        }
    }

    private List<PrivacyDataModel> d(int i, List<wha> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (wha whaVar : list) {
                PrivacyDataModel privacyDataModel = new PrivacyDataModel();
                if (i == 100) {
                    privacyDataModel.setIntValue(f(whaVar.getValue()));
                    privacyDataModel.setDataTitle(wig.e(wig.b(i, privacyDataModel.getIntValue()), UnitUtil.e(privacyDataModel.getIntValue(), 1, 0), i));
                } else if (i == 109) {
                    privacyDataModel.setDoubleValue(o(whaVar.getValue()));
                    double dH = UnitUtil.f() ? UnitUtil.h(o(whaVar.getValue())) : o(whaVar.getValue());
                    privacyDataModel.setDataTitle(wig.e(wig.b(i, dH), UnitUtil.e(dH, 1, 1), i));
                }
                privacyDataModel.setDataDesc(e(i, whaVar));
                privacyDataModel.setStartTime(whaVar.getStartTime());
                privacyDataModel.setEndTime(whaVar.getEndTime());
                privacyDataModel.setModifyTime(whaVar.getModifyTime());
                privacyDataModel.setPageType(i);
                arrayList.add(privacyDataModel);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<PrivacyDataModel> n(List<wgy> list) {
        String strB;
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (wgy wgyVar : list) {
                PrivacyDataModel privacyDataModel = new PrivacyDataModel();
                privacyDataModel.setDataTitle(wig.i(wig.f(wgyVar.getEndTime()) - wig.f(wgyVar.getStartTime())));
                StringBuilder sb = new StringBuilder();
                sb.append(wig.b(wgyVar.getStartTime()));
                sb.append(Constants.LINK);
                if (wig.d(wgyVar.getStartTime(), wgyVar.getEndTime())) {
                    strB = wig.e(wgyVar.getEndTime());
                } else {
                    strB = wig.b(wgyVar.getEndTime());
                }
                sb.append(strB);
                privacyDataModel.setDataDesc(sb.toString());
                privacyDataModel.setStartTime(wgyVar.getStartTime());
                privacyDataModel.setEndTime(wgyVar.getEndTime());
                privacyDataModel.setModifyTime(wgyVar.getModifyTime());
                privacyDataModel.setPageType(103);
                arrayList.add(privacyDataModel);
            }
        }
        return arrayList;
    }

    private double o(List<whd> list) {
        double floatValue = 0.0d;
        for (whd whdVar : list) {
            if (whdVar.getFieldName().equals("body_weight")) {
                floatValue = whdVar.getFloatValue();
            }
        }
        return floatValue;
    }

    private int f(List<whd> list) {
        for (whd whdVar : list) {
            if (whdVar.getFieldName().equals("steps_delta")) {
                return whdVar.getIntegerValue();
            }
        }
        return 0;
    }

    private String e(int i, wha whaVar) {
        String strB;
        if (i != 100 && i != 103) {
            if (i == 109) {
                return wig.e(whaVar.getEndTime());
            }
            return "";
        }
        String strB2 = wig.b(whaVar.getStartTime());
        if (wig.d(whaVar.getStartTime(), whaVar.getEndTime())) {
            strB = wig.e(whaVar.getEndTime());
        } else {
            strB = wig.b(whaVar.getEndTime());
        }
        return strB2 + Constants.LINK + strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<whz> l(List<wgy> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        for (wgy wgyVar : list) {
            String strD = paw.d(wgyVar.getStartTime(), 0);
            List<PrivacyDataModel> arrayList = linkedHashMap.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(strD, arrayList);
            }
            PrivacyDataModel privacyDataModel = new PrivacyDataModel();
            privacyDataModel.setStartTime(wgyVar.getStartTime());
            privacyDataModel.setEndTime(wgyVar.getEndTime());
            privacyDataModel.setModifyTime(wgyVar.getModifyTime());
            privacyDataModel.setDataTitle(c(wgyVar.getActivitySummary()));
            privacyDataModel.setDataDesc(wig.d(wgyVar.getStartTime()));
            privacyDataModel.setPageType(112);
            arrayList.add(privacyDataModel);
        }
        return e(linkedHashMap);
    }

    private String c(wgz wgzVar) {
        if (wgzVar == null) {
            return "";
        }
        return g(wgzVar.getDataSummary());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    private String g(List<wha> list) {
        if (njy.e(list)) {
            return "";
        }
        String strC = "";
        String strC2 = strC;
        String strE = strC2;
        for (wha whaVar : list) {
            List<whd> value = whaVar.getValue();
            if (njy.e(value)) {
                return "";
            }
            String dataTypeName = whaVar.getDataTypeName();
            byte b2 = 0;
            whd whdVar = value.get(0);
            dataTypeName.hashCode();
            switch (dataTypeName.hashCode()) {
                case -828306879:
                    if (!dataTypeName.equals("com.huawei.continuous.body_weight.statistics")) {
                        b2 = -1;
                    }
                    break;
                case -347047149:
                    if (dataTypeName.equals("com.huawei.continuous.heart_rate.statistics")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -328597096:
                    if (dataTypeName.equals("com.huawei.continuous.steps.total")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 39245215:
                    if (dataTypeName.equals("com.huawei.continuous.sleep.statistics")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 944702533:
                    if (dataTypeName.equals("com.huawei.continuous.steps.rate.statistics")) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1795795000:
                    if (dataTypeName.equals("com.huawei.continuous.calories.burnt.total")) {
                        b2 = 5;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 2119456336:
                    if (dataTypeName.equals("com.huawei.continuous.distance.total")) {
                        b2 = 6;
                    } else {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 2:
                    strE = e(dataTypeName, whdVar, value);
                    break;
                case 1:
                case 4:
                    strE = c(dataTypeName, whdVar, value);
                    break;
                case 3:
                    strE = b(value);
                    break;
                case 5:
                    strC2 = c(dataTypeName, whdVar, value);
                    break;
                case 6:
                    strC = c(dataTypeName, whdVar, value);
                    break;
            }
        }
        if (StringUtils.j(strC)) {
            return strC;
        }
        return StringUtils.j(strC2) ? strC2 : strE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    private String c(String str, whd whdVar, List<whd> list) {
        byte b2;
        double dA;
        int i;
        str.hashCode();
        int i2 = 0;
        switch (str) {
            case "com.huawei.continuous.heart_rate.statistics":
                b2 = 0;
                break;
            case "com.huawei.continuous.steps.rate.statistics":
                b2 = 1;
                break;
            case "com.huawei.continuous.calories.burnt.total":
                b2 = 2;
                break;
            case "com.huawei.continuous.distance.total":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            dA = a(list);
            i = 102;
        } else {
            if (b2 == 2) {
                dA = whdVar.getFloatValue();
                i2 = 111;
            } else if (b2 != 3) {
                dA = 0.0d;
            } else {
                dA = whdVar.getFloatValue();
                i2 = 101;
            }
            i = i2;
            i2 = 1;
        }
        return wig.e(wig.e(str), UnitUtil.e(dA, 1, i2), i);
    }

    private String e(String str, whd whdVar, List<whd> list) {
        double dA;
        int i;
        int i2;
        str.hashCode();
        if (str.equals("com.huawei.continuous.body_weight.statistics")) {
            if (UnitUtil.f()) {
                dA = UnitUtil.h(a(list));
            } else {
                dA = a(list);
            }
            i = AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        } else {
            i = 0;
            if (str.equals("com.huawei.continuous.steps.total")) {
                dA = whdVar.getIntegerValue();
                i2 = 100;
            } else {
                dA = 0.0d;
            }
            return wig.e(wig.b(i2, dA), UnitUtil.e(dA, 1, i), i2);
        }
        i2 = i;
        i = 1;
        return wig.e(wig.b(i2, dA), UnitUtil.e(dA, 1, i), i2);
    }

    private double a(List<whd> list) {
        for (whd whdVar : list) {
            if (whdVar.getFieldName().equals("avg")) {
                return whdVar.getFloatValue();
            }
        }
        return 0.0d;
    }

    private String b(List<whd> list) {
        for (whd whdVar : list) {
            if (whdVar.getFieldName().equals("all_sleep_time")) {
                return wig.i(whdVar.getIntegerValue() * 60);
            }
        }
        return "";
    }

    private List<whz> a(int i, List<wha> list) {
        String strC;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        for (wha whaVar : list) {
            String strD = paw.d(whaVar.getStartTime(), 0);
            List<PrivacyDataModel> arrayList = linkedHashMap.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(strD, arrayList);
            }
            PrivacyDataModel privacyDataModel = new PrivacyDataModel();
            privacyDataModel.setStartTime(whaVar.getStartTime());
            privacyDataModel.setDataDesc(wig.b(whaVar.getEndTime()));
            if (i == 107) {
                strC = c(whaVar.getValue());
            } else if (i != 108) {
                strC = "";
            } else {
                strC = e(whaVar.getValue());
            }
            privacyDataModel.setDataTitle(wig.e(wig.i(i), strC, i));
            privacyDataModel.setEndTime(whaVar.getEndTime());
            privacyDataModel.setModifyTime(whaVar.getModifyTime());
            privacyDataModel.setPageType(i);
            arrayList.add(privacyDataModel);
        }
        return e(linkedHashMap);
    }

    private String c(List<whd> list) {
        String strE = "";
        String strE2 = "";
        for (whd whdVar : list) {
            if (whdVar.getFieldName().equals("systolic_pressure")) {
                strE = UnitUtil.e(whdVar.getFloatValue(), 1, 1);
            }
            if (whdVar.getFieldName().equals("diastolic_pressure")) {
                strE2 = UnitUtil.e(whdVar.getFloatValue(), 1, 1);
            }
        }
        return strE + "/" + strE2;
    }

    private String e(List<whd> list) {
        String strE = "";
        for (whd whdVar : list) {
            if (whdVar.getFieldName().equals("level")) {
                strE = UnitUtil.e(whdVar.getFloatValue(), 1, 1);
            }
        }
        return strE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, List<PrivacyDataModel>> a(int i, Map<String, List<PrivacyDataModel>> map) {
        String strE;
        String strB;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        for (Map.Entry<String, List<PrivacyDataModel>> entry : map.entrySet()) {
            long startTime = entry.getValue().get(0).getStartTime();
            String strA = wig.a(startTime);
            List arrayList = (List) linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            String string = "";
            if (i == 100) {
                double dH = h(entry.getValue());
                strE = UnitUtil.e(dH, 1, 0);
                strB = wig.b(i, dH);
            } else if (i == 103) {
                strE = wig.i(i(entry.getValue()));
                strB = "";
            } else if (i != 109) {
                strB = "";
                strE = strB;
            } else {
                double dJ = j(entry.getValue());
                String strB2 = wig.b(i, dJ);
                strE = UnitUtil.e(dJ, 1, 1);
                strB = strB2;
                string = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_average);
            }
            PrivacyDataModel privacyDataModel = new PrivacyDataModel();
            if (i == 103) {
                privacyDataModel.setDataTitle(strE);
            } else {
                privacyDataModel.setDataTitle(string + wig.e(strB, strE, i));
            }
            privacyDataModel.setDataDesc(wig.d(startTime));
            privacyDataModel.setPageType(i);
            privacyDataModel.setStartTime(startTime);
            arrayList.add(privacyDataModel);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<whz> e(Map<String, List<PrivacyDataModel>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<PrivacyDataModel>> entry : map.entrySet()) {
            whz whzVar = new whz();
            whzVar.b(entry.getKey());
            whzVar.e(entry.getValue());
            arrayList.add(whzVar);
        }
        return arrayList;
    }

    private double j(List<PrivacyDataModel> list) {
        Iterator<PrivacyDataModel> it = list.iterator();
        double doubleValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            doubleValue += it.next().getDoubleValue();
            i++;
        }
        if (i == 0) {
            return doubleValue;
        }
        return UnitUtil.f() ? UnitUtil.h(doubleValue / ((double) i)) : doubleValue / ((double) i);
    }

    private long i(List<PrivacyDataModel> list) {
        long jF = 0;
        for (PrivacyDataModel privacyDataModel : list) {
            jF += wig.f(privacyDataModel.getEndTime()) - wig.f(privacyDataModel.getStartTime());
        }
        return jF;
    }

    private int h(List<PrivacyDataModel> list) {
        Iterator<PrivacyDataModel> it = list.iterator();
        int intValue = 0;
        while (it.hasNext()) {
            intValue += it.next().getIntValue();
        }
        return intValue;
    }

    private void d(int i, String str, String str2, int i2) {
        if (i != 103) {
            if (i == 106) {
                new wel(i).c(new vzo(0L, System.currentTimeMillis(), i2, str, str2), new e(this));
                return;
            } else if (i != 107) {
                new wel(i).a(i2, str, str2, new c(this));
                return;
            }
        }
        new wel(i).d(new vzo(0L, System.currentTimeMillis(), i2, str, str2), new c(this));
    }

    static class c implements DataSourceCallback<List<whz>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<whv> f52066b;

        c(whv whvVar) {
            this.f52066b = new WeakReference<>(whvVar);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<whz> list) {
            whv whvVar;
            WeakReference<whv> weakReference = this.f52066b;
            if (weakReference == null || (whvVar = weakReference.get()) == null) {
                return;
            }
            whvVar.c(i, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, Map<Integer, List<whz>> map) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyGroupDataFragment) {
            PrivacyGroupDataFragment privacyGroupDataFragment = (PrivacyGroupDataFragment) privacyFragmentViewD;
            if (!isViewAttached()) {
                LogUtil.a("GroupDataFragmentPresenter", "notifyAbnormalDataChange isViewAttached false");
                return;
            }
            if (i != 0) {
                map = new HashMap<>();
            }
            privacyGroupDataFragment.d(map);
        }
    }

    static class e implements DataSourceCallback<Map<Integer, List<whz>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<whv> f52067b;

        e(whv whvVar) {
            this.f52067b = new WeakReference<>(whvVar);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Map<Integer, List<whz>> map) {
            whv whvVar;
            WeakReference<whv> weakReference = this.f52067b;
            if (weakReference == null || (whvVar = weakReference.get()) == null) {
                return;
            }
            whvVar.e(i, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, List<SourceInfo> list) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyGroupDataFragment) {
            PrivacyGroupDataFragment privacyGroupDataFragment = (PrivacyGroupDataFragment) privacyFragmentViewD;
            if (!isViewAttached()) {
                LogUtil.a("GroupDataFragmentPresenter", "notifySourceResult isViewAttached false");
                return;
            }
            if (i != 0) {
                list = new ArrayList<>(10);
            }
            privacyGroupDataFragment.a(list);
        }
    }

    static class b implements DataSourceCallback<List<SourceInfo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<whv> f52065b;

        b(whv whvVar) {
            this.f52065b = new WeakReference<>(whvVar);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<SourceInfo> list) {
            whv whvVar;
            WeakReference<whv> weakReference = this.f52065b;
            if (weakReference == null || (whvVar = weakReference.get()) == null) {
                return;
            }
            whvVar.b(i, list);
        }
    }

    @Override // defpackage.wib, com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        lcy.d().d(this);
        super.detachView();
    }
}
