package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.json.JsonSanitizer;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter;
import com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public class epw implements SportIntroductionContentPresenter, MessageOrStateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<Future<?>> f33334a = new ArrayList<>(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33335b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f33336c;
    private IndoorEquipManagerApi d;
    private boolean e;
    private int f;
    private long g;
    private long h;
    private SportIntroductionContentView i;
    private String j;

    public epw(int i, String str) {
        this.f = i;
        this.j = str;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void onCreate(SportIntroductionContentView sportIntroductionContentView) {
        this.i = sportIntroductionContentView;
        this.f33336c = new Handler(Looper.getMainLooper());
        IndoorEquipManagerApi indoorEquipManagerApi = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
        this.d = indoorEquipManagerApi;
        indoorEquipManagerApi.init();
        this.d.setMessageOrStateCallback("SportIntroductionPresenter" + toString(), this, false);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void getLastSportRecord(final int i) {
        this.f33334a.add(ThreadPoolManager.c().submit(new Runnable() { // from class: epx
            @Override // java.lang.Runnable
            public final void run() {
                this.f33341b.c(i);
            }
        }));
    }

    /* synthetic */ void c(int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{i});
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchSequenceDataBySportType(hiDataReadOption, new AnonymousClass4());
    }

    /* JADX INFO: renamed from: epw$4, reason: invalid class name */
    class AnonymousClass4 implements HiDataReadResultListener {
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass4() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, final int i, int i2) {
            LogUtil.a("SportIntroductionPresenter", "queryLastHistoryData onResult errorCode:", Integer.valueOf(i));
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("SportIntroductionPresenter", "error result data");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
                LogUtil.j("SportIntroductionPresenter", "requestTrackSimplifyData onResult obj not instanceof List");
                epw.this.f33336c.post(new Runnable() { // from class: eqf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.e(i);
                    }
                });
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) ((List) sparseArray.get(i)).get(0);
            final HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(JsonSanitizer.sanitize(hiHealthData.getMetaData()), HiTrackMetaData.class);
            epw.this.g = hiHealthData.getStartTime();
            epw.this.h = hiHealthData.getEndTime();
            epw.this.f33336c.post(new Runnable() { // from class: eqc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33353b.d(hiTrackMetaData);
                }
            });
        }

        /* synthetic */ void e(int i) {
            epw.this.i.onGetLastHistoryDataFail(i);
        }

        /* synthetic */ void d(HiTrackMetaData hiTrackMetaData) {
            epw.this.i.onGetLastHistoryDataSuccess(hiTrackMetaData, epw.this.g);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void getLastMonthRecord(final int i, final long j) {
        LogUtil.j("SportIntroductionPresenter", "requestTrackMonthData() sportType:", Integer.valueOf(i), " lastStartTime:", Long.valueOf(j));
        this.f33334a.add(ThreadPoolManager.c().submit(new Runnable() { // from class: eqa
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(j, i);
            }
        }));
    }

    /* synthetic */ void b(long j, int i) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(d(j, 0));
        hiSportStatDataAggregateOption.setEndTime(d(j, 1) - 1000);
        hiSportStatDataAggregateOption.setAggregateType(1);
        if (i == 264) {
            i = 258;
        }
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{i});
        hiSportStatDataAggregateOption.setGroupUnitType(5);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_Walk_Distance_Sum", "Track_Walk_Calorie_Sum", "Track_Walk_Duration_Sum", "Track_Walk_Count_Sum"});
        hiSportStatDataAggregateOption.setType(new int[]{2, 3, 4, 5});
        hiSportStatDataAggregateOption.setReadType(0);
        HiHealthNativeApi.a(this.i.getContext()).aggregateSportStatData(hiSportStatDataAggregateOption, new AnonymousClass1(j));
    }

    /* JADX INFO: renamed from: epw$1, reason: invalid class name */
    class AnonymousClass1 implements HiAggregateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33338c;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass1(long j) {
            this.f33338c = j;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, final int i, int i2) {
            if (!njy.e(list)) {
                final String strE = epw.this.e(list.get(0));
                final String dateTime = DateUtils.formatDateTime(epw.this.i.getContext(), this.f33338c, 52);
                epw.this.f33336c.post(new Runnable() { // from class: eqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33354a.b(strE, dateTime);
                    }
                });
            } else {
                LogUtil.j("SportIntroductionPresenter", "requestTrackMonthData() all run data null or empty");
                epw.this.f33336c.post(new Runnable() { // from class: eqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33356b.e(i);
                    }
                });
            }
        }

        /* synthetic */ void e(int i) {
            epw.this.i.onMonthDataFail(i);
        }

        /* synthetic */ void b(String str, String str2) {
            epw.this.i.onMonthDataSuccess(str, str2);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void setSubPageBiEvent(final String str, final String str2, final String str3, final int i) {
        ThreadPoolManager.c().submit(new Runnable() { // from class: epv
            @Override // java.lang.Runnable
            public final void run() {
                epw.e(str, str2, str3, i);
            }
        });
    }

    static /* synthetic */ void e(String str, String str2, String str3, int i) {
        HashMap map = new HashMap();
        map.put("prodId", era.b(str));
        map.put("macAddress", erh.d(str2));
        map.put("page_id", str3);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(i));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SUB_PAGE_2170048.value(), map, 0);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void setModeSelectBiEvent(final String str, final int i, final String str2, final int i2) {
        ThreadPoolManager.c().submit(new Runnable() { // from class: epy
            @Override // java.lang.Runnable
            public final void run() {
                this.f33344c.c(str, i, str2, i2);
            }
        });
    }

    /* synthetic */ void c(String str, int i, String str2, int i2) {
        HashMap map = new HashMap();
        map.put("prodId", era.b(str));
        map.put("macAddress", erh.d(this.j));
        map.put("current_sport_target_type", Integer.valueOf(i));
        map.put("current_sport_target", str2);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(i2));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_SPORT_INTRODUCTION_PAGE_MODE_SELECT_2170047.value(), map, 0);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void queryTrackDetailData() {
        this.f33334a.add(ThreadPoolManager.c().submit(new Runnable() { // from class: epu
            @Override // java.lang.Runnable
            public final void run() {
                this.f33330a.c();
            }
        }));
    }

    /* synthetic */ void c() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(this.g, this.h);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new AnonymousClass5());
    }

    /* JADX INFO: renamed from: epw$5, reason: invalid class name */
    class AnonymousClass5 implements HiDataReadResultListener {
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass5() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!(obj instanceof SparseArray)) {
                LogUtil.e("SportIntroductionPresenter", "quaryTrackDetailData onResult data not instanceof SparseArray");
                epw.this.f33336c.post(new Runnable() { // from class: eqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c();
                    }
                });
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                LogUtil.e("SportIntroductionPresenter", "quaryTrackDetailData onResult map size is null");
                epw.this.f33336c.post(new Runnable() { // from class: eql
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33361b.d();
                    }
                });
                return;
            }
            Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
            if (!njy.b(obj2, HiHealthData.class)) {
                LogUtil.e("SportIntroductionPresenter", "quaryTrackDetailData onResult obj not instanceof List");
                epw.this.f33336c.post(new Runnable() { // from class: eqk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33360c.a();
                    }
                });
                return;
            }
            List list = (List) obj2;
            if (njy.e(list)) {
                LogUtil.e("SportIntroductionPresenter", "quaryTrackDetailData onResult list is empty");
                epw.this.f33336c.post(new Runnable() { // from class: eqh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33357b.e();
                    }
                });
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            if (hiHealthData == null) {
                LogUtil.e("SportIntroductionPresenter", "quaryTrackDetailData onResult hiHealthData is null");
                epw.this.f33336c.post(new Runnable() { // from class: eqi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33358c.b();
                    }
                });
            } else {
                final MotionPathSimplify motionPathSimplifyD = nlt.d(hiHealthData);
                final String strC = nlt.c(hiHealthData, motionPathSimplifyD);
                epw.this.f33336c.post(new Runnable() { // from class: eqj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33359a.d(motionPathSimplifyD, strC);
                    }
                });
            }
        }

        /* synthetic */ void c() {
            epw.this.i.queryTrackDetailDataFail();
        }

        /* synthetic */ void d() {
            epw.this.i.queryTrackDetailDataFail();
        }

        /* synthetic */ void a() {
            epw.this.i.queryTrackDetailDataFail();
        }

        /* synthetic */ void e() {
            epw.this.i.queryTrackDetailDataFail();
        }

        /* synthetic */ void b() {
            epw.this.i.queryTrackDetailDataFail();
        }

        /* synthetic */ void d(MotionPathSimplify motionPathSimplify, String str) {
            epw.this.i.queryTrackDetailDataSuccess(motionPathSimplify, str);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void saveTargetData(String str, String str2) {
        HashMap map = new HashMap();
        map.put(b("target_cache_value"), str);
        d(str2, map);
    }

    private void d(String str, Map<String, String> map) {
        SharedPreferenceManager.c("sport_introduction_content", e(str), ofe.c((Object) map));
    }

    private String c(Map<String, String> map, String str) {
        if (map != null && map.containsKey(str)) {
            return map.get(str);
        }
        return "0";
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public BigDecimal getTargetCacheValue(String str) {
        String strC;
        String strB = SharedPreferenceManager.b("sport_introduction_content", e(str), "");
        if (TextUtils.isEmpty(strB)) {
            strC = "0";
        } else {
            strC = c((Map) izn.d(strB, new TypeToken<Map<String, String>>() { // from class: com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenterImpl$4
            }), b("target_cache_value"));
        }
        return new BigDecimal(strC);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void removeNoShowDescriptionMac(String str) {
        LinkedList<String> linkedListE = e();
        if (njy.e(linkedListE) || TextUtils.isEmpty(str) || !linkedListE.contains(str)) {
            return;
        }
        linkedListE.remove(str);
        SharedPreferenceManager.c("sport_introduction_content", e("rate_mode_description"), ofe.c(linkedListE));
    }

    private LinkedList<String> e() {
        String strB = SharedPreferenceManager.b("sport_introduction_content", e("rate_mode_description"), "");
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return (LinkedList) izn.d(strB, new TypeToken<LinkedList<String>>() { // from class: com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenterImpl$5
        });
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void removeModeCache() {
        SharedPreferenceManager.b("sport_introduction_content", b("DeviceInformation"));
        d("sport_target_time");
        d("sport_target_distance");
        d("sport_target_cal");
    }

    private void d(String str) {
        Map<String, String> map;
        String strB = SharedPreferenceManager.b("sport_introduction_content", e(str), "");
        if (TextUtils.isEmpty(strB) || (map = (Map) izn.d(strB, new TypeToken<Map<String, String>>() { // from class: com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenterImpl$6
        })) == null) {
            return;
        }
        map.remove(b("target_cache_value"));
        map.remove(b("target_cache_select_index"));
        d(str, map);
    }

    private String e(String str) {
        return str + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
    }

    private String b(String str) {
        return str + this.j;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public boolean isNeedShowDescription(String str) {
        LinkedList<String> linkedListE = e();
        if (linkedListE == null || TextUtils.isEmpty(str)) {
            return true;
        }
        return !linkedListE.contains(str);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void connectDevice(int i, elh elhVar) {
        String strA;
        this.d.setDeviceType(i == 264 ? "31" : BleConstants.SPORT_TYPE_BIKE);
        if (!TextUtils.isEmpty(this.j)) {
            LogUtil.a("SportIntroductionPresenter", "connectDevice connectByMac");
            this.d.connectByMac(true, this.j);
            return;
        }
        if (elhVar != null && elhVar.ac() != null && njy.c(elhVar.ac(), 0) && elhVar.ac().get(0) != null) {
            strA = elhVar.ac().get(0).a();
        } else {
            strA = "";
        }
        LogUtil.a("SportIntroductionPresenter", "connectDevice connectByName");
        this.d.connectByName(true, strA);
    }

    @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
    public void onNewMessage(int i, Bundle bundle) {
        LogUtil.a("SportIntroductionPresenter", "onNewMessage newCase is ", Integer.valueOf(i));
        if (this.d.isStartByDevice(bundle) && this.f33335b) {
            this.f33335b = false;
            LogUtil.a("SportIntroductionPresenter", "onNewMessage startSport");
            this.f33336c.post(new Runnable() { // from class: epz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33345a.d();
                }
            });
        } else if (this.d.isStopByDevice(bundle)) {
            LogUtil.a("SportIntroductionPresenter", "onNewMessage stopSport");
            this.f33335b = true;
        }
    }

    /* synthetic */ void d() {
        this.i.startSport();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public DeviceInformation getDeviceInformation() {
        DeviceInformation deviceInformation = this.d.getDeviceInformation();
        if (TextUtils.isEmpty(deviceInformation.getManufacturerString()) || TextUtils.isEmpty(deviceInformation.getSerialNumber()) || TextUtils.isEmpty(deviceInformation.getSoftwareVersion()) || TextUtils.isEmpty(deviceInformation.getModelString())) {
            String strB = SharedPreferenceManager.b("sport_introduction_content", b("DeviceInformation"), "");
            if (!TextUtils.isEmpty(strB)) {
                deviceInformation = (DeviceInformation) izn.d(strB, new TypeToken<DeviceInformation>() { // from class: com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenterImpl$7
                });
            }
            return deviceInformation == null ? new DeviceInformation() : deviceInformation;
        }
        SharedPreferenceManager.c("sport_introduction_content", b("DeviceInformation"), ofe.c(deviceInformation));
        return deviceInformation;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void disconnect(boolean z) {
        LogUtil.a("SportIntroductionPresenter", "disconnect: isBreakAsUnexpected->", Boolean.valueOf(z));
        this.d.disconnect(z);
        this.e = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
    public void onStateChange(String str) {
        LogUtil.a("SportIntroductionPresenter", "onStateChange:", str);
        str.hashCode();
        final int i = 2;
        switch (str) {
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTED":
            case "com.huawei.btsportdevice.ACTION_SERVICE_DISCOVERIED":
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_RECONNECTING":
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTING":
                i = 1;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTED":
            case "com.huawei.btsportdevice.ACTION_INVALID_DEVICE_INFO":
            case "com.huawei.btsportdevice.ACTION_SERVICE_NOT_SUPPORT":
                if (this.e) {
                    qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_equip_blutooth_disconnected));
                }
                this.e = false;
                i = 0;
                break;
            case "com.huawei.btsportdevice.ACTION_READ_SUCCESS":
                this.d.setSendCalorieToDevice(enr.d(this.i.getProductId()));
                this.e = true;
                if (this.f == 264) {
                    this.d.setUnlockCode(a());
                }
                b();
                if (era.g(this.i.getProductId())) {
                    LogUtil.a("SportIntroductionPresenter", "registerDataClient");
                    esf esfVar = new esf();
                    esfVar.c(esfVar.a(new esf.d(this.i.getProductId(), this.j).e(getDeviceInformation())), null);
                    break;
                }
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTING":
                i = 3;
                break;
            default:
                return;
        }
        this.f33336c.post(new Runnable() { // from class: eqb
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(i);
            }
        });
    }

    /* synthetic */ void d(int i) {
        this.i.onDeviceBleStateChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(HiHealthData hiHealthData) {
        String string;
        double d = hiHealthData.getDouble("Track_Walk_Duration_Sum") / 60000.0d;
        Resources resources = this.i.getContext().getResources();
        if (d > 60.0d) {
            string = resources.getQuantityString(com.huawei.healthcloud.plugintrack.R.plurals.IDS_hour_string, (int) d, UnitUtil.e(d / 60.0d, 1, 1));
        } else {
            string = resources.getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(d, 1, 2));
        }
        String strD = jpq.d(hiHealthData.getDouble("Track_Walk_Calorie_Sum") / 1000.0d);
        double d2 = hiHealthData.getDouble("Track_Walk_Distance_Sum");
        String quantityString = this.i.getContext().getResources().getQuantityString(R.plurals.IDS_indoor_run_km, ((int) d2) / 1000, UnitUtil.e(d2 / 1000.0d, 1, 2));
        double d3 = hiHealthData.getDouble("Track_Walk_Count_Sum");
        String quantityString2 = this.i.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, (int) d3, UnitUtil.e(d3, 1, 0));
        if (d2 <= 0.0d) {
            return resources.getString(R.string.IDS_history_desc_three, string, quantityString2, strD);
        }
        return resources.getString(R.string.IDS_history_desc_four, quantityString, string, quantityString2, strD);
    }

    private long d(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.add(2, i);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter
    public void onDetach() {
        if (!this.f33334a.isEmpty()) {
            Iterator<Future<?>> it = this.f33334a.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
        }
        this.d.removeMessageOrStateCallback("SportIntroductionPresenter" + toString(), false);
    }

    private void b() {
        LogUtil.a("SportIntroductionPresenter", "uploadDataToHota");
        DeviceInformation deviceInformation = getDeviceInformation();
        if (deviceInformation == null) {
            LogUtil.j("SportIntroductionPresenter", "deviceInformation is null");
        } else {
            if (TextUtils.isEmpty(deviceInformation.getSerialNumber())) {
                return;
            }
            new etp.b().e(deviceInformation.getModelString()).b(deviceInformation.getHardwareVersion()).c(deviceInformation.getManufacturerString()).h(deviceInformation.getSoftwareVersion()).d(deviceInformation.getSerialNumber()).a(this.i.getProductId()).b().e();
        }
    }

    private int[] a() {
        String serialNumber = getDeviceInformation().getSerialNumber();
        if (TextUtils.isEmpty(serialNumber) || serialNumber.length() < 6) {
            return null;
        }
        String strSubstring = serialNumber.substring(serialNumber.length() - 6);
        LogUtil.a("SportIntroductionPresenter", "getUnlockCode unlockCode is ", strSubstring);
        int[] iArr = new int[6];
        for (int i = 0; i < strSubstring.length(); i++) {
            int iA = a(strSubstring.charAt(i));
            iArr[i] = iA;
            LogUtil.d("SportIntroductionPresenter", "getUnlockCode unlockCodeInt value ", Integer.valueOf(iA));
        }
        return iArr;
    }

    private int a(char c2) {
        if (c2 == 'a' || c2 == 'A') {
            return 10;
        }
        if (c2 == 'b' || c2 == 'B') {
            return 11;
        }
        if (c2 == 'c' || c2 == 'C') {
            return 12;
        }
        if (c2 == 'd' || c2 == 'D') {
            return 13;
        }
        if (c2 == 'e' || c2 == 'E') {
            return 14;
        }
        if (c2 == 'f' || c2 == 'F') {
            return 15;
        }
        return Integer.parseInt(String.valueOf(c2));
    }
}
