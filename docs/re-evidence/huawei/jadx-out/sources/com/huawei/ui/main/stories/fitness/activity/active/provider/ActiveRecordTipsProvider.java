package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import androidx.media3.common.C;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.main.R;
import defpackage.fsj;
import defpackage.ieg;
import defpackage.ive;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.ttn;
import defpackage.ttr;
import defpackage.ujq;
import defpackage.ujr;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordTipsProvider extends MinorProvider<fsj> implements WheelChairStateManager.SwitchStateListener {
    private fsj d;
    private int g;
    private ttr h;
    private SectionBean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26552a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26553b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26554c = false;
    private ActiveTipStringUtils.TipType f = ActiveTipStringUtils.TipType.STAND_HOUR;
    private HashMap<String, Object> e = new HashMap<>();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        if (!this.f26554c) {
            return false;
        }
        if (i()) {
            return true;
        }
        if (WheelChairStateManager.a().d()) {
            return false;
        }
        return CommonUtils.j(qqw.d((Map) this.e, "sport_diff_time_key", "0")) >= 3 || !(this.f26552a <= 0 || this.f26553b || WheelChairStateManager.a().d());
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "enter loadDefaultData");
        super.loadDefaultData(sectionBean);
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(final SectionBean sectionBean, final fsj fsjVar) {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "onSetSectionBeanData");
        this.i = sectionBean;
        this.d = fsjVar;
        boolean zA = a(fsjVar);
        this.f26554c = zA;
        if (!zA) {
            sectionBean.c(fsjVar);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tus
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(fsjVar, sectionBean);
                }
            });
        }
    }

    public /* synthetic */ void c(fsj fsjVar, SectionBean sectionBean) {
        this.e.clear();
        b(fsjVar);
        sectionBean.c(fsjVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap map, fsj fsjVar) {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "parseParams");
        map.put("ITEM_TITLE", this.e.get("title_key"));
        map.put("ITEM_SUBTITLE", this.e.get("description_key"));
        map.put("BACKGROUND_IMAGE", this.e.get("icon_key"));
        map.put("RIGHT_BUTTON_TEXT", this.e.get("button_key"));
        if (g()) {
            map.put("LEFT_BUTTON_VISIBILITY", new BaseKnitDataProvider.c() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordTipsProvider.5
                @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
                public void onClick(int i) {
                    super.onClick(i);
                    if (ActiveRecordTipsProvider.this.a()) {
                        ReleaseLogUtil.a("SCUI_ActiveRecordTipsProvider", "click with InvalidResponse");
                    } else {
                        ujr.e(BaseApplication.getActivity(), ActiveRecordTipsProvider.this.h.j(), ActiveRecordTipsProvider.this.h.h());
                        ujq.a(ActiveRecordTipsProvider.this.f, 4);
                    }
                }
            });
        } else {
            map.put("LEFT_BUTTON_VISIBILITY", null);
        }
        b(map);
    }

    private void b(fsj fsjVar) {
        if (!ujr.d()) {
            d(fsjVar);
            return;
        }
        ttr ttrVarE = ttn.e();
        if (ttrVarE == null || ttrVarE.k()) {
            ReleaseLogUtil.e("SCUI_ActiveRecordTipsProvider", "Invalid Response");
            d(fsjVar);
            return;
        }
        this.h = ttrVarE;
        int iE = ttrVarE.e();
        int iJ = this.h.j();
        int iG = this.h.g();
        int iB = this.h.b();
        int iF = this.h.f();
        int iH = this.h.h();
        ReleaseLogUtil.d("SCUI_ActiveRecordTipsProvider", "period is ", Integer.valueOf(iF), " subscription", Integer.valueOf(iG));
        if (iF == 3) {
            b(ActiveTipStringUtils.TipType.TASK_BONUS_GET, iE, iB, iJ, iH);
            return;
        }
        if (iF == 4) {
            b(ActiveTipStringUtils.TipType.TASK_BONUS_USE, iE, this.h.d(), iJ, iH);
            return;
        }
        if (iF != 1) {
            d(fsjVar);
            return;
        }
        if (iG == 2) {
            d(fsjVar);
            return;
        }
        if (iG == 1) {
            c(fsjVar, true, iE, iB, iJ, iH);
        } else if (ujr.a(this.h.i())) {
            d(fsjVar);
        } else {
            b(ActiveTipStringUtils.TipType.TASK_SUBSCRIBE, iE, iB, iJ, iH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        ttr ttrVar = this.h;
        return ttrVar == null || ttrVar.k();
    }

    private void b(ActiveTipStringUtils.TipType tipType, int i, int i2, int i3, int i4) {
        this.f = tipType;
        this.e = ActiveTipStringUtils.d(0, tipType, i, i2, i3, i4);
        ujq.a(tipType, 0);
    }

    private void d(fsj fsjVar) {
        c(fsjVar, false, 0, 0, 0, 0);
    }

    private void c(fsj fsjVar, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iC = fsjVar.c() - fsjVar.b();
        int i7 = fsjVar.i() - fsjVar.g();
        int iQ = fsjVar.q() - fsjVar.p();
        this.f26552a = iQ;
        if (iQ > 0) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            e(countDownLatch);
            try {
                if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                    LogUtil.j("SCUI_ActiveRecordTipsProvider", "RequestData wait timeout, set IsCurrentHourStand");
                    this.f26553b = true;
                    return;
                }
            } catch (InterruptedException unused) {
                ReleaseLogUtil.a("SCUI_ActiveRecordTipsProvider", "interrupted while waiting for requestData");
            }
        }
        boolean zD = WheelChairStateManager.a().d();
        if (this.f26552a > 0 && !this.f26553b && !zD) {
            this.f = z ? ActiveTipStringUtils.TipType.TASK_STAND_HOUR : ActiveTipStringUtils.TipType.STAND_HOUR;
            i5 = this.f26552a;
        } else {
            if (i7 > 0) {
                this.f = z ? ActiveTipStringUtils.TipType.TASK_WORKOUT : ActiveTipStringUtils.TipType.WORKOUT;
                i6 = i7;
            } else {
                if (iC <= 0) {
                    LogUtil.j("SCUI_ActiveRecordTipsProvider", "No need to show tips.");
                    this.f = ActiveTipStringUtils.TipType.STAND_HOUR;
                    this.e.clear();
                    return;
                }
                this.f = z ? ActiveTipStringUtils.TipType.TASK_CALORIES : ActiveTipStringUtils.TipType.CALORIES;
                i5 = iC * 1000;
            }
            HashMap<String, Object> mapD = ActiveTipStringUtils.d(i6, this.f, i, i2, i3, i4);
            this.e = mapD;
            int iJ = CommonUtils.j(qqw.d((Map) mapD, "sport_type_key", "0"));
            this.g = iJ;
            ujq.c(0, 0, iJ, this.f);
            LogUtil.a("SCUI_ActiveRecordTipsProvider", "mDiffCalories: ", Integer.valueOf(iC), " mDiffIntensity: ", Integer.valueOf(i7), " mDiffHour: ", Integer.valueOf(this.f26552a), " mIsCurrentHourStand: ", Boolean.valueOf(this.f26553b), " mTipsType:", this.f, " isWheelModel:", Boolean.valueOf(zD));
        }
        i6 = i5;
        HashMap<String, Object> mapD2 = ActiveTipStringUtils.d(i6, this.f, i, i2, i3, i4);
        this.e = mapD2;
        int iJ2 = CommonUtils.j(qqw.d((Map) mapD2, "sport_type_key", "0"));
        this.g = iJ2;
        ujq.c(0, 0, iJ2, this.f);
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "mDiffCalories: ", Integer.valueOf(iC), " mDiffIntensity: ", Integer.valueOf(i7), " mDiffHour: ", Integer.valueOf(this.f26552a), " mIsCurrentHourStand: ", Boolean.valueOf(this.f26553b), " mTipsType:", this.f, " isWheelModel:", Boolean.valueOf(zD));
    }

    private void e(CountDownLatch countDownLatch) {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "enter requestCurrentHourData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiDataReadOption.setStartTime(ieg.a(jCurrentTimeMillis));
        hiDataReadOption.setEndTime(ieg.d(jCurrentTimeMillis));
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new c(countDownLatch));
    }

    private boolean a(fsj fsjVar) {
        if (fsjVar == null) {
            LogUtil.j("SCUI_ActiveRecordTipsProvider", "ActiveRecordData is null");
            return false;
        }
        return lsl.aa(fsjVar.f());
    }

    private void b(HashMap map) {
        map.put("CLICK_EVENT_LISTENER", new BaseKnitDataProvider.c() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordTipsProvider.2
            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                super.onClick(i);
                if (!qrs.c(500)) {
                    ActiveRecordTipsProvider.this.c();
                } else {
                    LogUtil.j("SCUI_ActiveRecordTipsProvider", "onClick isFastClick");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Context context = BaseApplication.getContext();
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "mTipsType is ", this.f);
        switch (AnonymousClass4.f26555b[this.f.ordinal()]) {
            case 1:
            case 2:
                b(context);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                e(context);
                break;
            case 7:
                ujr.d(BaseApplication.getActivity(), this.h);
                break;
            case 8:
                e();
                break;
            case 9:
                ujr.e(BaseApplication.getActivity(), this.h.i());
                break;
            default:
                LogUtil.e("SCUI_ActiveRecordTipsProvider", "tip is error");
                break;
        }
        if (i()) {
            ujq.b(this.f);
        } else {
            ujq.c(1, 0, this.g, this.f);
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordTipsProvider$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26555b;

        static {
            int[] iArr = new int[ActiveTipStringUtils.TipType.values().length];
            f26555b = iArr;
            try {
                iArr[ActiveTipStringUtils.TipType.STAND_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.TASK_STAND_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.TASK_WORKOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.CALORIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.TASK_CALORIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.TASK_BONUS_GET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.TASK_BONUS_USE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26555b[ActiveTipStringUtils.TipType.TASK_SUBSCRIBE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void e() {
        ujq.b();
        ujr.c();
        ObserverManagerUtil.e("observer_refresh_active_record_provider", "");
    }

    private boolean g() {
        return this.f == ActiveTipStringUtils.TipType.TASK_STAND_HOUR || this.f == ActiveTipStringUtils.TipType.TASK_WORKOUT || this.f == ActiveTipStringUtils.TipType.TASK_CALORIES || i();
    }

    private boolean i() {
        return this.f == ActiveTipStringUtils.TipType.TASK_BONUS_GET || this.f == ActiveTipStringUtils.TipType.TASK_SUBSCRIBE || this.f == ActiveTipStringUtils.TipType.TASK_BONUS_USE;
    }

    private void e(Context context) {
        if (ive.c().c(0, ive.c().b(this.g, -1, -1.0f, -1, 2), (ISportDataCallback) null, context, (String) null) == 0) {
            a(context);
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    private void a(Context context) {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "doBiType with 1040027");
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.g));
        map.put("from", 2);
        lmf.d().c(context, AnalyticsValue.MOTION_TRACK_1040027.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CountDownLatch countDownLatch, Object obj) {
        if (!(obj instanceof SparseArray)) {
            ReleaseLogUtil.e("SCUI_ActiveRecordTipsProvider", "handleQueryActiveData onResult data not instanceof SparseArray.");
            countDownLatch.countDown();
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            ReleaseLogUtil.e("SCUI_ActiveRecordTipsProvider", "handleQueryActiveData onResult map is empty.");
            countDownLatch.countDown();
            return;
        }
        Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value());
        if (obj2 instanceof List) {
            List list = (List) obj2;
            LogUtil.a("SCUI_ActiveRecordTipsProvider", "handleQueryActiveData onResult dataList size is ", Integer.valueOf(list.size()));
            this.f26553b = !njy.e(list);
        }
        countDownLatch.countDown();
    }

    private void b(final Context context) {
        HiHealthData hiHealthData = new HiHealthData(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value());
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiHealthData.setTimeInterval(ieg.a(jCurrentTimeMillis), ieg.d(jCurrentTimeMillis));
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setValue(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hiHealthData);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(context).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordTipsProvider.3
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("SCUI_ActiveRecordTipsProvider", "onResult: insert insertHiHealthData errorCode is ", Integer.valueOf(i));
                if (i == 0) {
                    ObserverManagerUtil.e("observer_refresh_active_record_provider", "");
                    Context context2 = context;
                    qpx.e(context2, context2.getResources().getString(R.string.IDS_active_insert_success));
                    ActiveRecordTipsProvider.this.b();
                }
            }
        });
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()));
        ujr.c(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "doBiType with 1040095");
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("from", 3);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.CLICK_THE_MARKER_TO_STAND_1040095.value(), map, 0);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("SCUI_ActiveRecordTipsProvider", "enter onDestroy");
        super.onDestroy();
        ObserverManagerUtil.a("observer_sport_list_show_tip");
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        ReleaseLogUtil.d("SCUI_ActiveRecordTipsProvider", "onSwitchStateChanged isOn:", Boolean.valueOf(z));
        ThreadPoolManager.c().execute(new Runnable() { // from class: tut
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        });
    }

    public /* synthetic */ void d() {
        if (this.i != null) {
            this.e.clear();
            b(this.d);
            this.i.c(this.d);
        }
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ActiveRecordTipsProvider> f26557a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f26558c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private c(ActiveRecordTipsProvider activeRecordTipsProvider, CountDownLatch countDownLatch) {
            this.f26557a = new WeakReference<>(activeRecordTipsProvider);
            this.f26558c = countDownLatch;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("SCUI_ActiveRecordTipsProvider", "onResult: requestCurrentHourData data is ", obj);
            ActiveRecordTipsProvider activeRecordTipsProvider = this.f26557a.get();
            if (activeRecordTipsProvider != null) {
                activeRecordTipsProvider.d(this.f26558c, obj);
            } else {
                ReleaseLogUtil.e("SCUI_ActiveRecordTipsProvider", "onResult: provider is null");
            }
        }
    }
}
