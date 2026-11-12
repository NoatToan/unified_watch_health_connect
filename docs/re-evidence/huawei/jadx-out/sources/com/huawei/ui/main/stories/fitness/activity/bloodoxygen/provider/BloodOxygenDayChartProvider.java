package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.util.SparseArray;
import android.view.View;
import com.github.mikephil.charting.data.Entry;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.FullScreenCallback;
import com.huawei.health.knit.section.listener.OnXRangeSetCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity.HorizontalBloodOxygenDayActivity;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import defpackage.fqt;
import defpackage.fua;
import defpackage.ltb;
import defpackage.mhs;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qrk;
import defpackage.tvm;
import defpackage.twf;
import defpackage.twu;
import defpackage.txb;
import defpackage.vdo;
import defpackage.wua;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenDayChartProvider extends MajorProvider<twu> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26624a;
    private long aa;
    private String ab;
    private boolean ac;
    private int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26626c;
    private boolean d;
    private twf g;
    private BloodOxygenDayDetailFragmentPresenter j;
    private String k;
    private SpannableString m;
    private HealthCalendar n;
    private String o;
    private boolean p;
    private boolean q;
    private mhs r;
    private Boolean t;
    private Observer u;
    private boolean v;
    private Long w;
    private Observer x;
    private SectionBean y;
    private long z;
    private boolean f = true;
    private List<Integer> i = null;
    private twu h = new twu();
    private boolean e = true;
    private int l = Integer.MAX_VALUE;
    private g s = new g(this);

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        return i == 18;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        d(context, (HashMap<String, Object>) map, (twu) obj);
    }

    static class g extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodOxygenDayChartProvider> f26635a;

        public g(BloodOxygenDayChartProvider bloodOxygenDayChartProvider) {
            this.f26635a = new WeakReference<>(bloodOxygenDayChartProvider);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26635a.get();
            if (bloodOxygenDayChartProvider != null && message.what == 1) {
                bloodOxygenDayChartProvider.y.c(bloodOxygenDayChartProvider.y.d());
            }
        }
    }

    public BloodOxygenDayChartProvider() {
        this.ad = 0;
        g();
        this.ad = qnh.h(qnh.b(System.currentTimeMillis()));
        this.j = new txb();
        this.g = new twf(BaseApplication.getContext(), DataInfos.BloodOxygenDayDetail, this.j);
        if (BaseApplication.getActivity() instanceof BaseActivity) {
            new LastTimeHealthDataReader((BaseActivity) BaseApplication.getActivity(), new b()).b(LastTimeHealthDataReader.CardData.BLOOD_OXYGEN);
        } else {
            LogUtil.e("BloodOxygenDayChartProvider", "BaseApplication.getActivity() return Error");
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.y = sectionBean;
        this.p = true;
        j();
        b();
    }

    private void b() {
        if (!fua.e()) {
            LogUtil.e("BloodOxygenDayChartProvider", "no release version, hide altitude");
            this.e = false;
            StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_SWITCH_IS_VISIBLE", "false", storageParams);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS", "false", storageParams);
            return;
        }
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(a(), new e(this));
    }

    static class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodOxygenDayChartProvider> f26634a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public e(BloodOxygenDayChartProvider bloodOxygenDayChartProvider) {
            this.f26634a = new WeakReference<>(bloodOxygenDayChartProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            StorageParams storageParams = new StorageParams();
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26634a.get();
            if (bloodOxygenDayChartProvider == null) {
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.e("BloodOxygenDayChartProvider", "data can not convert");
                bloodOxygenDayChartProvider.e = false;
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_SWITCH_IS_VISIBLE", "false", storageParams);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                bloodOxygenDayChartProvider.e = false;
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_SWITCH_IS_VISIBLE", "false", storageParams);
                return;
            }
            new ArrayList(16);
            Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.ALTITUDE_TYPE.value());
            if (obj2 instanceof List) {
                bloodOxygenDayChartProvider.e = true;
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_SWITCH_IS_VISIBLE", "true", storageParams);
                LogUtil.a("BloodOxygenDayChartProvider", "altitudeValueList.size :", Integer.valueOf(((List) obj2).size()));
            } else {
                bloodOxygenDayChartProvider.e = false;
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_SWITCH_IS_VISIBLE", "false", storageParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        mhs mhsVarA = mhs.a();
        this.r = mhsVarA;
        mhsVarA.getSwitchSetting("highland.blood.oxygen.switch", new j(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return str.equals("1") && fua.e();
    }

    private HiDataReadOption a() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ALTITUDE_TYPE.value()});
        hiDataReadOption.setCount(1);
        return hiDataReadOption;
    }

    private void j() {
        Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenDayChartProvider.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (njy.c(objArr, 0)) {
                    Object obj = objArr[0];
                    if (obj instanceof SparseArray) {
                        SparseArray sparseArray = (SparseArray) obj;
                        List arrayList = new ArrayList(16);
                        Object obj2 = sparseArray.get(2103);
                        if (obj2 instanceof List) {
                            arrayList = (List) obj2;
                            LogUtil.a("BloodOxygenDayChartProvider", "oxygenMeasureValueList.size :", Integer.valueOf(arrayList.size()));
                        }
                        boolean zB = njy.b(arrayList);
                        BloodOxygenDayChartProvider.this.h = new twu();
                        List arrayList2 = new ArrayList(16);
                        if (!fua.e()) {
                            Object obj3 = sparseArray.get(2107);
                            if (obj3 instanceof List) {
                                arrayList2 = (List) obj3;
                                LogUtil.a("BloodOxygenDayChartProvider", "oxygenRemindValueList.size :", Integer.valueOf(arrayList2.size()));
                            }
                        }
                        tvm.a(sparseArray, BloodOxygenDayChartProvider.this.h, false);
                        tvm.a(BloodOxygenDayChartProvider.this.z, TimeUtil.a(BloodOxygenDayChartProvider.this.z), BloodOxygenDayChartProvider.this.h, DataInfos.BloodOxygenDayDetail, new a(zB, arrayList2));
                    }
                }
            }
        };
        this.x = observer;
        ObserverManagerUtil.d(observer, "BLOOD_OXYGEN_RECORDS");
        Observer observer2 = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenDayChartProvider.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (njy.c(objArr, 0)) {
                    Object obj = objArr[0];
                    if (obj instanceof Integer) {
                        BloodOxygenDayChartProvider.this.l = ((Integer) obj).intValue();
                        BloodOxygenDayChartProvider.this.c(((Integer) objArr[0]).intValue());
                    } else if (obj instanceof Boolean) {
                        BloodOxygenDayChartProvider.this.d(objArr);
                    }
                }
            }
        };
        this.u = observer2;
        ObserverManagerUtil.d(observer2, "BLOOD_AND_ALTITUDE_DATA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object[] objArr) {
        if (((Boolean) objArr[0]).booleanValue()) {
            e();
        } else {
            d();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.y.c(new twu());
    }

    public void d(Context context, HashMap<String, Object> map, twu twuVar) {
        LogUtil.e("BloodOxygenDayChartProvider", "parseParams");
        map.clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.drawable.ic_exerciserecords_altitudw_crush));
        arrayList.add(Integer.valueOf(R.drawable.ic_exerciserecords_altitudw_frequency));
        map.put("ALTITUDE_IMAGE_LIST", arrayList);
        map.put("BAR_CHART_DATE_TEXT", this.ab);
        map.put("BAR_CHART_IS_TODAY", this.t);
        map.put("BAR_CHART_PERIOD_STRING", this.o);
        map.put("BAR_CHART_VALUE", this.m);
        map.put("BAR_CHART_VALUE_STEP", this.k);
        map.put("FULL_SCREEN_IMAGE", Integer.valueOf(R.drawable.ic_full_screen_image_new));
        map.put("BAR_COMMON_START_TIME", Integer.valueOf(this.ad));
        map.put("BAR_COMMON_REFLESH_TIME", this.w);
        map.put("BAR_COMMON_CHART_HOLDER", this.g);
        map.put("BAR_CHART_LEGEND_TEXT", BaseApplication.getContext().getString(R.string.IDS_hw_health_blood_oxygen_elevation));
        map.put("BAR_CHART_CUSOR_NAME_TEXT", BaseApplication.getContext().getString(R.string.IDS_mean_blood_oxygen));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Boolean.valueOf(this.f26625b));
        arrayList2.add(Boolean.valueOf(this.d));
        map.put("VISIVILITY_LIST", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Boolean.valueOf(this.e));
        arrayList3.add(Boolean.valueOf(this.q));
        arrayList3.add(Boolean.valueOf(this.f26626c));
        arrayList3.add(Boolean.valueOf(this.f26624a));
        map.put("ALTITUDE_SWITCH_LIST", arrayList3);
        map.put("BAR_CHART_REFRESH_CHART_ONLY", Boolean.valueOf(this.ac));
        b(map);
        e(map);
        d(map);
        this.w = null;
        if (this.v) {
            map.put("BAR_CHART_REFRESH", true);
        }
        this.v = false;
        this.ac = false;
    }

    private void b(HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_CHANGE_CALL_BACK", new OnXRangeSetCallback() { // from class: twv
            @Override // com.huawei.health.knit.section.listener.OnXRangeSetCallback
            public final void onRangeShow(int i, int i2, float f) {
                this.f49744c.a(i, i2, f);
            }
        });
    }

    public /* synthetic */ void a(int i, int i2, float f) {
        int iF = qnh.f((int) f);
        if (f != 0.0f) {
            this.n = vdo.c(this.n, iF);
        }
        long j2 = i;
        if (this.aa == j2) {
            return;
        }
        this.aa = j2;
        this.z = 60000 * j2;
        Date date = new Date(this.z);
        if (date.getHours() == 0 && date.getMinutes() == 0 && date.getSeconds() == 0) {
            Boolean boolValueOf = Boolean.valueOf(ltb.ac(date));
            this.t = boolValueOf;
            ObserverManagerUtil.e("BLOOD_OXYGEN_ARROW_VISIBLE", boolValueOf);
        }
        this.ab = qrk.e(BaseApplication.getContext(), TimeUnit.MINUTES.toMillis(j2));
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.s.sendMessage(messageObtain);
    }

    private void e(HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_TEXT_CALL_BACK", new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: tww
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public final void onTextChanged(String str, List list) {
                this.e.b(str, list);
            }
        });
    }

    public /* synthetic */ void b(String str, List list) {
        int y;
        String strD;
        String strE;
        String string = BaseApplication.getContext().getString(R.string.IDS_hw_health_blood_oxygen_elevation);
        if (this.f26624a) {
            this.o = str;
            this.m = new SpannableString("--");
            this.k = string + " --";
            this.ad = 0;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.s.sendMessage(messageObtain);
            return;
        }
        int size = list.size() - 1;
        HwHealthBaseEntry hwHealthBaseEntry = ((HwHealthMarkerView.d) list.get(size)).f23737a;
        if (hwHealthBaseEntry == null) {
            e(str, "--", string + " --", str);
            return;
        }
        Iterator it = ((HwHealthMarkerView.d) list.get(0)).f23739c.getEntriesForXValue(hwHealthBaseEntry.getX()).iterator();
        while (true) {
            if (!it.hasNext()) {
                y = 0;
                break;
            }
            Entry entry = (Entry) it.next();
            if (entry.getY() != 0.0f) {
                y = (int) entry.getY();
                break;
            }
        }
        String str2 = "";
        if (hwHealthBaseEntry.getData() instanceof fqt) {
            fqt fqtVar = (fqt) hwHealthBaseEntry.getData();
            if (fqtVar.b() != Integer.MAX_VALUE && y == 0) {
                strD = string + " " + UnitUtil.e(fqtVar.b(), 1, 0);
            } else if (y != 0) {
                strD = d(string, (List<HwHealthMarkerView.d>) list, hwHealthBaseEntry);
            } else {
                strD = string + " --";
            }
        } else {
            strD = "";
        }
        int iC = c(list, hwHealthBaseEntry, y);
        String strE2 = wua.e(BaseApplication.getContext(), ((long) qnh.f((int) hwHealthBaseEntry.getX())) * 60000);
        if (iC != 0) {
            strE = UnitUtil.e(iC, 1, 0);
        } else {
            strE = this.g.parse(((HwHealthMarkerView.d) list.get(size)).f23737a);
            str2 = strE2;
        }
        e(str, strE, strD, str2);
    }

    private String d(String str, List<HwHealthMarkerView.d> list, Entry entry) {
        List<T> values = list.get(0).f23739c.getValues();
        int iF = qnh.f((int) entry.getX());
        int i = iF % 30;
        int iH = qnh.h(iF - i);
        int iH2 = qnh.h((iF + 30) - i);
        int iB = Integer.MAX_VALUE;
        int iB2 = Integer.MIN_VALUE;
        for (T t : values) {
            int x = (int) t.getX();
            if (x >= iH && x < iH2 && (t.getData() instanceof fqt)) {
                fqt fqtVar = (fqt) t.getData();
                if (fqtVar.b() != Integer.MAX_VALUE) {
                    if (fqtVar.b() > iB2) {
                        iB2 = fqtVar.b();
                    }
                    if (fqtVar.b() < iB) {
                        iB = fqtVar.b();
                    }
                }
            }
        }
        if (iB == iB2) {
            return str + " " + UnitUtil.e(iB, 1, 0);
        }
        String strE = UnitUtil.e(iB, 1, 0);
        String strE2 = UnitUtil.e(iB2, 1, 0);
        if (iB != Integer.MAX_VALUE && iB2 != Integer.MIN_VALUE) {
            return str + " " + strE + " ~ " + strE2;
        }
        return str + " --";
    }

    private int c(List<HwHealthMarkerView.d> list, Entry entry, int i) {
        if (i == 0) {
            int x = (int) entry.getX();
            List<T> values = list.get(0).f23739c.getValues();
            ArrayList<Entry> arrayList = new ArrayList();
            for (T t : values) {
                if (Math.abs(x - ((int) t.getX())) <= 4 && t.getY() != 0.0f) {
                    arrayList.add(t);
                }
            }
            if (arrayList.size() > 0) {
                float f = x;
                int iAbs = (int) Math.abs(((Entry) arrayList.get(0)).getX() - f);
                int x2 = 0;
                for (Entry entry2 : arrayList) {
                    int iAbs2 = (int) Math.abs(entry2.getX() - f);
                    if (iAbs <= iAbs2) {
                        x2 = (int) entry2.getX();
                        iAbs = iAbs2;
                    }
                }
                for (T t2 : list.get(0).f23739c.getEntriesForXValue(x2)) {
                    if (t2.getY() != 0.0f) {
                        return (int) t2.getY();
                    }
                }
            }
        }
        return i;
    }

    private void e(String str, String str2, String str3, String str4) {
        SpannableString spannableString;
        String string = BaseApplication.getContext().getString(R.string.IDS_hw_health_blood_oxygen_elevation);
        if ("--".equals(str2) || str2.equals("0")) {
            spannableString = new SpannableString("--");
            str = str4;
        } else {
            spannableString = UnitUtil.b(BaseApplication.getContext(), "[\\d]", UnitUtil.e(CommonUtil.n(BaseApplication.getActivity(), str2), 2, 0), R.style.health_text_chart_emphasize, R.style.health_text_chart_emphasize_small);
        }
        if (str3.equals("")) {
            str3 = "";
        }
        if (this.m != null && spannableString.toString().equals(this.m.toString()) && str3.equals(this.k) && str.equals(this.o)) {
            return;
        }
        if (this.f26626c) {
            this.k = string + " --";
        }
        this.o = str;
        this.m = spannableString;
        this.k = str3;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.s.sendMessage(messageObtain);
    }

    private void d(HashMap<String, Object> map) {
        map.put("FULL_SCREEN_CALLBACK", new FullScreenCallback() { // from class: twx
            @Override // com.huawei.health.knit.section.listener.FullScreenCallback
            public final void click(long j2) {
                this.f49745c.e(j2);
            }
        });
        map.put("BAR_CHART_CLICK_EVENT", new AnonymousClass5());
    }

    public /* synthetic */ void e(long j2) {
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HorizontalBloodOxygenDayActivity.class);
        intent.putExtra(ObserveredClassifiedView.JUMP_TIME_ID, qnh.k(j2));
        intent.putExtra("altitude_icon_status", !this.e ? 1 : 0);
        try {
            Activity activity = BaseApplication.getActivity();
            if (activity != null) {
                activity.startActivity(intent);
            }
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("BloodOxygenDayChartProvider", "ActivityNotFoundException", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenDayChartProvider$5, reason: invalid class name */
    public class AnonymousClass5 implements OnClickSectionListener {
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        AnonymousClass5() {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            if ("BAR_CHART_CALENDAR_CLICK_EVENT".equals(str)) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("calendar", BloodOxygenDayChartProvider.this.n);
                bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(47204, new int[]{2107}));
                bundle.putBoolean("isSetGrayUnmarkedDate", true);
                HealthCalendarActivity.c(BaseApplication.getActivity(), bundle, new CommonUiBaseResponse() { // from class: twt
                    @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                    public final void onResponse(int i, Object obj) {
                        this.d.b(i, obj);
                    }
                });
            }
            if ("ALTITUDE_SWITCH_CLICK_EVENT".equals(str)) {
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "IS_MANUAL_OPEN_CLOSE_ALTITUDE_SWITCH", "true", new StorageParams());
                if (BloodOxygenDayChartProvider.this.q) {
                    BloodOxygenDayChartProvider.this.d();
                } else {
                    BloodOxygenDayChartProvider.this.e();
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                BloodOxygenDayChartProvider.this.s.sendMessage(messageObtain);
            }
        }

        public /* synthetic */ void b(int i, Object obj) {
            if (i == 1 && (obj instanceof HealthCalendar)) {
                BloodOxygenDayChartProvider.this.n = (HealthCalendar) obj;
                BloodOxygenDayChartProvider bloodOxygenDayChartProvider = BloodOxygenDayChartProvider.this;
                bloodOxygenDayChartProvider.ad = qnh.h(qnh.b(bloodOxygenDayChartProvider.n.transformCalendar().getTimeInMillis()));
                BloodOxygenDayChartProvider bloodOxygenDayChartProvider2 = BloodOxygenDayChartProvider.this;
                bloodOxygenDayChartProvider2.w = Long.valueOf(bloodOxygenDayChartProvider2.n.transformCalendar().getTimeInMillis());
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                BloodOxygenDayChartProvider.this.s.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.q = true;
        this.h.c(true);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS", "true", new StorageParams());
        ObserverManagerUtil.e("BLOOD_OXYGEN_CURVE_STATUS", true);
        this.f26625b = true;
        this.d = true;
        this.ac = true;
        ObserverManagerUtil.e("ALTITUDE_SWITCH_OPEN_CLOSE", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.q = false;
        this.h.c(false);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS", "false", new StorageParams());
        ObserverManagerUtil.e("BLOOD_OXYGEN_CURVE_STATUS", false);
        this.f26625b = false;
        this.d = false;
        this.ac = true;
        ObserverManagerUtil.e("ALTITUDE_SWITCH_OPEN_CLOSE", false);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        ObserverManagerUtil.e("REMOVE_GLOBAL_LAYOUT", true);
        if (njy.b(this.i)) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.i, new d("unSubscribeBloodOxygenData, isSuccess :"));
        }
        Observer observer = this.x;
        if (observer != null) {
            ObserverManagerUtil.a(observer, "BLOOD_OXYGEN_RECORDS");
        }
        Observer observer2 = this.u;
        if (observer2 != null) {
            ObserverManagerUtil.a(observer2, "BLOOD_AND_ALTITUDE_DATA");
        }
        ObserverManagerUtil.a("BLOOD_AND_ALTITUDE_DATA");
    }

    private void g() {
        LogUtil.a("BloodOxygenDayChartProvider", "enter subscribeBloodOxygenData");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(18);
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new c("BloodOxygenDayChartProvider", this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Integer> list) {
        LogUtil.a("BloodOxygenDayChartProvider", "subscribeBloodOxygenData, onResult");
        if (njy.b(list)) {
            LogUtil.a("BloodOxygenDayChartProvider", "registerBloodOxygenListener success");
            this.i = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.v = true;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.s.sendMessage(messageObtain);
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodOxygenDayChartProvider> f26632c;

        private b(BloodOxygenDayChartProvider bloodOxygenDayChartProvider) {
            this.f26632c = new WeakReference<>(bloodOxygenDayChartProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26632c.get();
            if (bloodOxygenDayChartProvider == null) {
                LogUtil.j("BloodOxygenDayChartProvider", "LastTimeCallback activity is null");
                return;
            }
            if (obj instanceof HiHealthData) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                if (hiHealthData.getStartTime() > 0) {
                    int iH = qnh.h(qnh.b(hiHealthData.getStartTime()));
                    bloodOxygenDayChartProvider.ad = iH;
                    bloodOxygenDayChartProvider.n = vdo.c(bloodOxygenDayChartProvider.n, iH);
                }
                LogUtil.a("BloodOxygenDayChartProvider", "read last data time from database,mLastTimestamp=", Integer.valueOf(bloodOxygenDayChartProvider.ad));
            }
            bloodOxygenDayChartProvider.y.c(new twu());
        }
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodOxygenDayChartProvider> f26629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<HiHealthData> f26630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f26631c;

        private a(BloodOxygenDayChartProvider bloodOxygenDayChartProvider, boolean z, List<HiHealthData> list) {
            this.f26629a = new WeakReference<>(bloodOxygenDayChartProvider);
            this.f26631c = z;
            this.f26630b = list;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26629a.get();
            if (bloodOxygenDayChartProvider == null) {
                LogUtil.j("BloodOxygenDayChartProvider", "LastTimeCallback activity is null");
                return;
            }
            if (i != 0) {
                return;
            }
            if (bloodOxygenDayChartProvider.q) {
                bloodOxygenDayChartProvider.h.c(true);
            } else {
                bloodOxygenDayChartProvider.h.c(false);
            }
            if (!fua.e()) {
                bloodOxygenDayChartProvider.h.a(this.f26630b);
            }
            if (!this.f26631c) {
                bloodOxygenDayChartProvider.h = new twu();
            }
            if (!fua.e()) {
                bloodOxygenDayChartProvider.h.c(false);
            }
            bloodOxygenDayChartProvider.notifyMinorProviders(bloodOxygenDayChartProvider.h);
        }
    }

    static class j implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodOxygenDayChartProvider> f26636a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26637c;

        private j(BloodOxygenDayChartProvider bloodOxygenDayChartProvider, int i) {
            this.f26636a = new WeakReference<>(bloodOxygenDayChartProvider);
            this.f26637c = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            int i2;
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26636a.get();
            if (bloodOxygenDayChartProvider == null) {
                LogUtil.j("BloodOxygenDayChartProvider", "LastTimeCallback activity is null");
                return;
            }
            a(bloodOxygenDayChartProvider, obj instanceof String ? bloodOxygenDayChartProvider.b((String) obj) : false);
            if (bloodOxygenDayChartProvider.f26626c && bloodOxygenDayChartProvider.l == 1) {
                bloodOxygenDayChartProvider.ac = true;
            }
            if (bloodOxygenDayChartProvider.f26624a && bloodOxygenDayChartProvider.l != 0) {
                bloodOxygenDayChartProvider.ac = true;
            }
            if (!bloodOxygenDayChartProvider.f26626c && ((i2 = this.f26637c) == 0 || i2 == 2)) {
                bloodOxygenDayChartProvider.ac = true;
            }
            int i3 = this.f26637c;
            if (i3 == 0 || i3 == 2) {
                bloodOxygenDayChartProvider.f26626c = true;
            } else {
                bloodOxygenDayChartProvider.f26626c = false;
            }
            if (this.f26637c == 0) {
                bloodOxygenDayChartProvider.f26624a = true;
            } else {
                bloodOxygenDayChartProvider.f26624a = false;
            }
            bloodOxygenDayChartProvider.p = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            bloodOxygenDayChartProvider.s.sendMessage(messageObtain);
        }

        private void a(BloodOxygenDayChartProvider bloodOxygenDayChartProvider, boolean z) {
            if (bloodOxygenDayChartProvider.p) {
                boolean zEquals = "true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "IS_MANUAL_OPEN_CLOSE_ALTITUDE_SWITCH"));
                boolean zEquals2 = "true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS"));
                if (zEquals) {
                    b(bloodOxygenDayChartProvider, zEquals2);
                } else {
                    b(bloodOxygenDayChartProvider, z);
                }
            }
        }

        private void b(BloodOxygenDayChartProvider bloodOxygenDayChartProvider, boolean z) {
            if (z) {
                bloodOxygenDayChartProvider.e();
            } else {
                bloodOxygenDayChartProvider.d();
            }
        }
    }

    static class c implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<BloodOxygenDayChartProvider> f26633b;

        private c(String str, BloodOxygenDayChartProvider bloodOxygenDayChartProvider) {
            this.f26633b = new WeakReference<>(bloodOxygenDayChartProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26633b.get();
            if (bloodOxygenDayChartProvider == null) {
                return;
            }
            bloodOxygenDayChartProvider.b(list);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            BloodOxygenDayChartProvider bloodOxygenDayChartProvider = this.f26633b.get();
            if (bloodOxygenDayChartProvider != null && bloodOxygenDayChartProvider.b(i)) {
                bloodOxygenDayChartProvider.c();
            }
        }
    }

    static class d implements HiUnSubscribeListener {
        private final String e;

        private d(String str) {
            this.e = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            LogUtil.a("BloodOxygenDayChartProvider", this.e, Boolean.valueOf(z));
        }
    }
}
