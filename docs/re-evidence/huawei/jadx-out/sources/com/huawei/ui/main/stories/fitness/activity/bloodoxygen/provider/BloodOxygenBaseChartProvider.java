package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.FullScreenCallback;
import com.huawei.health.knit.section.listener.OnDataChangedListener;
import com.huawei.health.knit.section.listener.OnMarkViewTextNotify;
import com.huawei.health.knit.section.listener.OnXRangeTextCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity.HorizontalBloodOxygenDayActivity;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenBaseChartProvider;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.bloodoxygen.BloodOxygenModuleBarChartHolder;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import defpackage.fua;
import defpackage.ift;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qrk;
import defpackage.tvm;
import defpackage.twu;
import defpackage.vdo;
import defpackage.wua;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public abstract class BloodOxygenBaseChartProvider extends MajorProvider<twu> {
    private static final int SET_DATA = 1;
    private static final String SPANNABLE_STRING_REGULAR = "[\\d]";
    private static final String TAG = "BloodOxygenBaseChartProvider";
    private twu mBelowData;
    private HealthCalendar mCalendar;
    private CommonUiBaseResponse mCommonUiBaseResponse;
    private String mCursorTime;
    private String mCursorValue;
    private LastTimeHealthDataReader<KnitBloodOxygenDetailActivity> mLastTimeHealthDataReader;
    private Observer mObserver;
    private Long mRefleshTimestamp;
    private SectionBean mSectionBean;
    private int mStartTimestamp;
    private String mTextDate;
    private Date lastReqDate = new Date();
    private boolean isFirst = true;
    private e mHandler = new e(this);
    private BloodOxygenModuleBarChartHolder mBloodOxygenHolder = new BloodOxygenModuleBarChartHolder(BaseApplication.getContext());

    protected abstract DataInfos getDataInfo();

    protected abstract int getStartTimestamp(long j);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (twu) obj);
    }

    static class e extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<BloodOxygenBaseChartProvider> f26622b;

        public e(BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider) {
            this.f26622b = new WeakReference<>(bloodOxygenBaseChartProvider);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = this.f26622b.get();
            if (message.what != 1) {
                return;
            }
            bloodOxygenBaseChartProvider.mSectionBean.c(bloodOxygenBaseChartProvider.mSectionBean.d());
        }
    }

    public BloodOxygenBaseChartProvider() {
        this.mStartTimestamp = 0;
        this.mStartTimestamp = getStartTimestamp(System.currentTimeMillis());
        if (BaseApplication.getActivity() instanceof KnitBloodOxygenDetailActivity) {
            if (this.mLastTimeHealthDataReader == null) {
                this.mLastTimeHealthDataReader = new LastTimeHealthDataReader<>((KnitBloodOxygenDetailActivity) BaseApplication.getActivity(), new a());
            }
            this.mLastTimeHealthDataReader.b(LastTimeHealthDataReader.CardData.BLOOD_OXYGEN);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.mSectionBean = sectionBean;
        this.mBelowData = new twu();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.e(TAG, "loadData");
        Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenBaseChartProvider.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (njy.c(objArr, 0)) {
                    Object obj = objArr[0];
                    if (obj instanceof Boolean) {
                        BloodOxygenBaseChartProvider.this.mBelowData.c(((Boolean) obj).booleanValue());
                        BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = BloodOxygenBaseChartProvider.this;
                        bloodOxygenBaseChartProvider.notifyMinorProviders(bloodOxygenBaseChartProvider.mBelowData);
                    }
                }
            }
        };
        this.mObserver = observer;
        ObserverManagerUtil.d(observer, "ALTITUDE_SWITCH_OPEN_CLOSE");
    }

    public void parseParams(Context context, HashMap<String, Object> map, twu twuVar) {
        LogUtil.e(TAG, "parseParams");
        map.clear();
        map.put("BAR_DATA_INFOS", getDataInfo());
        map.put("BAR_CHART_DATE_TEXT", this.mTextDate);
        map.put("BAR_CHART_PERIOD_STRING", this.mCursorTime);
        map.put("BAR_CHART_VALUE", this.mCursorValue);
        map.put("FULL_SCREEN_IMAGE", Integer.valueOf(R.drawable.ic_full_screen_image_new));
        map.put("BAR_COMMON_START_TIME", Integer.valueOf(this.mStartTimestamp));
        map.put("BAR_COMMON_REFLESH_TIME", this.mRefleshTimestamp);
        map.put("BAR_COMMON_CHART_HOLDER", this.mBloodOxygenHolder);
        setOnXRangeSetCallback(map);
        setOnDataChangedListener(map);
        setOnMarkViewTextNotify(map);
        setClickListener(map);
        this.mRefleshTimestamp = null;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        Observer observer = this.mObserver;
        if (observer != null) {
            ObserverManagerUtil.a(observer, "ALTITUDE_SWITCH_OPEN_CLOSE");
        }
    }

    private void setOnXRangeSetCallback(HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_CHANGE_CALL_BACK", new OnXRangeTextCallback() { // from class: twp
            @Override // com.huawei.health.knit.section.listener.OnXRangeTextCallback
            public final void onRangeShow(int i, int i2, String str) {
                this.f49737b.m1707xc13b5729(i, i2, str);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a3  */
    /* JADX INFO: renamed from: lambda$setOnXRangeSetCallback$0$com-huawei-ui-main-stories-fitness-activity-bloodoxygen-provider-BloodOxygenBaseChartProvider, reason: not valid java name */
    public /* synthetic */ void m1707xc13b5729(int i, int i2, String str) {
        LogUtil.a(TAG, "OnXRangeTextCallback startx is", Integer.valueOf(i));
        LogUtil.a(TAG, "OnXRangeTextCallback endx is", Integer.valueOf(i2));
        long j = i;
        Date date = new Date(TimeUnit.MINUTES.toMillis(j));
        long j2 = i2;
        long millis = TimeUnit.MINUTES.toMillis(j2);
        Date date2 = new Date(millis);
        LogUtil.a(TAG, "OnXRangeTextCallback startxDate is", date);
        LogUtil.a(TAG, "OnXRangeTextCallback endxDate is", date2);
        boolean z = true;
        if (getDataInfo() == DataInfos.BloodOxygenYearDetail) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(this.lastReqDate);
            if (calendar.get(1) != calendar2.get(1) || calendar.get(2) != calendar2.get(2)) {
                z = false;
            }
        } else {
            Calendar calendar3 = Calendar.getInstance();
            Calendar calendar4 = Calendar.getInstance();
            calendar3.setTime(date);
            calendar4.setTime(this.lastReqDate);
            if (calendar3.get(1) != calendar4.get(1) || calendar3.get(6) != calendar4.get(6)) {
                z = false;
            }
        }
        if ((isInBegin(date) && !z) || this.isFirst) {
            this.lastReqDate = date;
            long millis2 = TimeUnit.MINUTES.toMillis(j);
            LogUtil.a(TAG, "OnXRangeTextCallback startTime is", Long.valueOf(millis2));
            requestDayOxygenData(millis2, millis);
            this.isFirst = false;
        }
        if (str.equals(this.mTextDate)) {
            return;
        }
        this.mTextDate = str;
        if (qrk.b(TimeUnit.MINUTES.toMillis(j), TimeUnit.MINUTES.toMillis(j2))) {
            this.mCalendar = vdo.c(this.mCalendar, i);
        }
        sendSetDataMessage();
    }

    private boolean isInBegin(Date date) {
        boolean z = date.getHours() == 0 && date.getMinutes() == 0 && date.getSeconds() == 0;
        if (getDataInfo() != DataInfos.BloodOxygenYearDetail) {
            return z;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5) == 1 && z;
    }

    private void requestDayOxygenData(long j, long j2) {
        LogUtil.a(TAG, "requestDayOxygenData");
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(getReadOption(j, j2), new h(this, j, j2));
    }

    static class h implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f26623a;
        private final WeakReference<BloodOxygenBaseChartProvider> d;
        private final long e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public h(BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider, long j, long j2) {
            this.d = new WeakReference<>(bloodOxygenBaseChartProvider);
            this.f26623a = j;
            this.e = j2;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!(obj instanceof SparseArray)) {
                LogUtil.e(BloodOxygenBaseChartProvider.TAG, "data can not convert");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = this.d.get();
            if (bloodOxygenBaseChartProvider == null) {
                return;
            }
            bloodOxygenBaseChartProvider.mBelowData = new twu();
            List arrayList = new ArrayList(16);
            if (!fua.e()) {
                Object obj2 = sparseArray.get(2107);
                if (obj2 instanceof List) {
                    arrayList = (List) obj2;
                    LogUtil.a(BloodOxygenBaseChartProvider.TAG, "oxygenRemindValueList.size :", Integer.valueOf(arrayList.size()));
                }
            }
            tvm.a(sparseArray, bloodOxygenBaseChartProvider.mBelowData, true);
            tvm.a(this.f26623a, this.e - 1, bloodOxygenBaseChartProvider.mBelowData, bloodOxygenBaseChartProvider.getDataInfo(), new d(bloodOxygenBaseChartProvider, arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiDataReadOption getLatestOption(long j, long j2, int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(i);
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(1);
        return hiDataReadOption;
    }

    private HiDataReadOption getReadOption(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jA = ift.a(j);
        hiDataReadOption.setTimeInterval(jA, j2 - 1);
        LogUtil.a(TAG, "getReadOption startTime:", Long.valueOf(jA), " endTime:", Long.valueOf(j2));
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(5);
        hiDataReadOption.setType(new int[]{2107, DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()});
        return hiDataReadOption;
    }

    private void setOnDataChangedListener(HashMap<String, Object> map) {
        map.put("BAR_COMMON_RANGE_SHOW_CALL_BACK", new OnDataChangedListener() { // from class: twq
            @Override // com.huawei.health.knit.section.listener.OnDataChangedListener
            public final void onDataChangedListener(float f, float f2) {
                this.f49738b.m1705x506fdd06(f, f2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setOnDataChangedListener$1$com-huawei-ui-main-stories-fitness-activity-bloodoxygen-provider-BloodOxygenBaseChartProvider, reason: not valid java name */
    public /* synthetic */ void m1705x506fdd06(float f, float f2) {
        String str;
        if (((int) f) != 0 && ((int) f2) != 0) {
            String strE = UnitUtil.e(f, 2, 0);
            String strE2 = UnitUtil.e(f2, 2, 0);
            str = ((Object) UnitUtil.b(BaseApplication.getContext(), SPANNABLE_STRING_REGULAR, strE + " ", R.style.health_text_chart_emphasize, R.style.health_text_chart_emphasize_small)) + Constants.LINK + ((Object) UnitUtil.b(BaseApplication.getContext(), SPANNABLE_STRING_REGULAR, " " + strE2, R.style.health_text_chart_emphasize, R.style.health_text_chart_emphasize_small));
        } else {
            LogUtil.j(TAG, "initViews min = ", Float.valueOf(f), " max = ", Float.valueOf(f2));
            str = "--";
        }
        if (str.equals(this.mCursorValue)) {
            return;
        }
        this.mCursorValue = str;
        sendSetDataMessage();
    }

    private void setOnMarkViewTextNotify(HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_TEXT_CALL_BACK", new OnMarkViewTextNotify() { // from class: tws
            @Override // com.huawei.health.knit.section.listener.OnMarkViewTextNotify
            public final void onTextChanged(String str, List list, float f) {
                this.f49740a.m1706xbd1d1d99(str, list, f);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setOnMarkViewTextNotify$2$com-huawei-ui-main-stories-fitness-activity-bloodoxygen-provider-BloodOxygenBaseChartProvider, reason: not valid java name */
    public /* synthetic */ void m1706xbd1d1d99(String str, List list, float f) {
        if (str.equals(this.mCursorTime)) {
            return;
        }
        this.mCursorTime = str;
        this.mCalendar = vdo.c(this.mCalendar, qnh.f((int) f));
        sendSetDataMessage();
    }

    private void setClickListener(HashMap<String, Object> map) {
        final c cVar = new c(this);
        map.put("FULL_SCREEN_CALLBACK", new FullScreenCallback() { // from class: two
            @Override // com.huawei.health.knit.section.listener.FullScreenCallback
            public final void click(long j) {
                BloodOxygenBaseChartProvider.lambda$setClickListener$3(j);
            }
        });
        map.put("BAR_CHART_CLICK_EVENT", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenBaseChartProvider.5
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

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("BAR_CHART_CALENDAR_CLICK_EVENT".equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("calendar", BloodOxygenBaseChartProvider.this.mCalendar);
                    bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(47204, new int[]{2107}));
                    HealthCalendarActivity.c(BaseApplication.getActivity(), bundle, cVar);
                }
            }
        });
    }

    public static /* synthetic */ void lambda$setClickListener$3(long j) {
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HorizontalBloodOxygenDayActivity.class);
        intent.putExtra(ObserveredClassifiedView.JUMP_TIME_ID, qnh.k(j));
        try {
            BaseApplication.getActivity().startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(TAG, "ActivityNotFoundException", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSetDataMessage() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.mHandler.sendMessage(messageObtain);
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodOxygenBaseChartProvider> f26616c;

        private a(BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider) {
            this.f26616c = new WeakReference<>(bloodOxygenBaseChartProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = this.f26616c.get();
            if (bloodOxygenBaseChartProvider == null) {
                LogUtil.j(BloodOxygenBaseChartProvider.TAG, "LastTimeCallback activity is null");
                return;
            }
            if (obj instanceof HiHealthData) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                if (hiHealthData.getStartTime() > 0) {
                    int startTimestamp = bloodOxygenBaseChartProvider.getStartTimestamp(hiHealthData.getStartTime());
                    bloodOxygenBaseChartProvider.mStartTimestamp = startTimestamp;
                    bloodOxygenBaseChartProvider.mCalendar = vdo.c(bloodOxygenBaseChartProvider.mCalendar, startTimestamp);
                }
                LogUtil.a(BloodOxygenBaseChartProvider.TAG, "read last data time from database,mLastTimestamp=", Integer.valueOf(bloodOxygenBaseChartProvider.mStartTimestamp));
            }
            bloodOxygenBaseChartProvider.mSectionBean.c(new twu());
        }
    }

    static class c implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<BloodOxygenBaseChartProvider> f26620b;

        public c(BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider) {
            this.f26620b = new WeakReference<>(bloodOxygenBaseChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = this.f26620b.get();
            if (bloodOxygenBaseChartProvider == null) {
                LogUtil.j(BloodOxygenBaseChartProvider.TAG, "LastTimeCallback activity is null");
                return;
            }
            if (i == 1 && (obj instanceof HealthCalendar)) {
                bloodOxygenBaseChartProvider.mCalendar = (HealthCalendar) obj;
                bloodOxygenBaseChartProvider.mStartTimestamp = qnh.h(qnh.b(bloodOxygenBaseChartProvider.mCalendar.transformCalendar().getTimeInMillis()));
                bloodOxygenBaseChartProvider.mRefleshTimestamp = Long.valueOf(bloodOxygenBaseChartProvider.mCalendar.transformCalendar().getTimeInMillis());
                bloodOxygenBaseChartProvider.sendSetDataMessage();
            }
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<BloodOxygenBaseChartProvider> f26621c;
        private List<HiHealthData> d;

        public d(BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider, List<HiHealthData> list) {
            this.f26621c = new WeakReference<>(bloodOxygenBaseChartProvider);
            this.d = new ArrayList(list);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = this.f26621c.get();
            if (bloodOxygenBaseChartProvider == null) {
                LogUtil.a(BloodOxygenBaseChartProvider.TAG, "provider is null");
                return;
            }
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS");
            HiDataReadOption latestOption = bloodOxygenBaseChartProvider.getLatestOption(0L, System.currentTimeMillis(), 1);
            latestOption.setType(new int[]{2103});
            HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(latestOption, new b(bloodOxygenBaseChartProvider, this.d, strE));
        }
    }

    static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BloodOxygenBaseChartProvider> f26617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<HiHealthData> f26618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26619c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public b(BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider, List<HiHealthData> list, String str) {
            this.f26617a = new WeakReference<>(bloodOxygenBaseChartProvider);
            this.f26618b = new ArrayList(list);
            this.f26619c = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            BloodOxygenBaseChartProvider bloodOxygenBaseChartProvider = this.f26617a.get();
            if (bloodOxygenBaseChartProvider == null) {
                LogUtil.a(BloodOxygenBaseChartProvider.TAG, "provider is null");
                return;
            }
            Object obj2 = ((SparseArray) obj).get(2103);
            if (!(obj2 instanceof List)) {
                LogUtil.j(BloodOxygenBaseChartProvider.TAG, "bloodOxygenData not instanceof List");
                return;
            }
            List list = (List) obj2;
            if (list.isEmpty()) {
                LogUtil.j(BloodOxygenBaseChartProvider.TAG, "bloodOxygenData isEmpty");
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            int intValue = hiHealthData.getIntValue();
            String strE = wua.e(BaseApplication.getContext(), hiHealthData.getLong("start_time"));
            String strE2 = UnitUtil.e(intValue, 2, 0);
            bloodOxygenBaseChartProvider.mBelowData.a(strE);
            bloodOxygenBaseChartProvider.mBelowData.d(strE2);
            bloodOxygenBaseChartProvider.mBelowData.c("true".equals(this.f26619c));
            if (!fua.e()) {
                bloodOxygenBaseChartProvider.mBelowData.a(this.f26618b);
                bloodOxygenBaseChartProvider.mBelowData.c(false);
            }
            bloodOxygenBaseChartProvider.notifyMinorProviders(bloodOxygenBaseChartProvider.mBelowData);
        }
    }
}
