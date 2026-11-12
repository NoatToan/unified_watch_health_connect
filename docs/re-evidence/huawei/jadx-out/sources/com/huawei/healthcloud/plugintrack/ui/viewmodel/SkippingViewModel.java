package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.SkippingIntroduceFragment;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SkipAchieveType;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import defpackage.dmg;
import defpackage.has;
import defpackage.ive;
import defpackage.iyb;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.lmf;
import defpackage.nua;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingViewModel extends BaseSportingViewModel implements SportDataNotify, Camera2Helper.OnPreviewListener, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11417a;
    private jaq f;
    private int h;
    private boolean i;
    private int g = 1001;
    private int j = 0;
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11418b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11419c = false;
    private int e = 0;

    public static /* synthetic */ void b(int i, Object obj) {
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.basesport.viewmodel.ISportPagerConfig
    public boolean isCanScroll() {
        return false;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public boolean isStopSportByTarget() {
        return true;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void init(Bundle bundle) {
        super.init(bundle);
        addSportDataMap("skipTimes");
        addSportDataMap("showSportTime");
        addSportDataMap("encourageType");
        addSportDataMap("skipContinuouslyTimes");
        addSportDataMap("interruptTimes");
        addSportDataMap("footPosition");
        addSportDataMap("bodyDetectionError");
        addSportDataMap("preSportProgress");
        addSportDataMap("boneData");
        addSportDataMap("sportTimeCountDown");
        addSportDataMap(IndoorEquipManagerApi.KEY_HEART_RATE);
        addSportDataMap("calorie");
        this.mSportDataOutputApi.registerDeviceDataCallback(ive.c().f());
    }

    public void b(boolean z) {
        this.f11418b = z;
        if (!z || this.mExtendHandler == null) {
            return;
        }
        this.mExtendHandler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Integer num = (Integer) message.obj;
            int iIntValue = num.intValue();
            if (this.j >= 100) {
                postValue("bodyDetectionError", num);
            } else if (this.g != iIntValue && this.f11418b && this.mExtendHandler != null) {
                this.g = iIntValue;
                this.mExtendHandler.sendEmptyMessage(2);
            }
        } else {
            if (i != 2) {
                return false;
            }
            if (this.g == 1 || getDataSource() == 5) {
                if (this.j < 100 && this.mExtendHandler != null) {
                    int i2 = this.j + 5;
                    this.j = i2;
                    postValue("preSportProgress", Integer.valueOf(i2));
                    this.mExtendHandler.sendEmptyMessage(2, 50L);
                }
            } else if (this.j < 100) {
                this.j = 0;
                postValue("preSportProgress", 0);
            }
        }
        return true;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void observeSportingData(String str, LifecycleOwner lifecycleOwner, Observer observer) {
        super.observeSportingData(str, lifecycleOwner, observer);
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestData() {
        super.requestData();
        EcologyDeviceApi ecologyDeviceApi = (EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class);
        if (ecologyDeviceApi.isSupportPerformanceByProductId(dmg.a().getProductId())) {
            ecologyDeviceApi.requestPerformanceRank(new IBaseResponseCallback() { // from class: jvt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    SkippingViewModel.b(i, obj);
                }
            });
        }
        this.mSportDataOutputApi.registerAchieveLevel(getTag(), new SportAchieveSubscribe() { // from class: jvs
            @Override // com.huawei.hwsportmodel.SportAchieveSubscribe
            public final void onChange(Object obj) {
                this.f39122b.c(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        if (obj instanceof SkipAchieveType) {
            postValue("encourageType", Integer.valueOf(((SkipAchieveType) obj).getLevel()));
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestLocalData() {
        super.requestLocalData();
        postValue("skipTimes", 0);
        if (getSportTarget() == 0) {
            postValue("showSportTime", UnitUtil.b((int) getTargetValue()));
        } else {
            postValue("showSportTime", UnitUtil.b(0));
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("SKIP_NUM_DATA");
        arrayList.add("FOOT_POINT_DATA");
        arrayList.add("CONTINUOUS_SKIPPING_JUMP_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("STATUS_CODE_DATA");
        arrayList.add("STUMBLING_ROPE_DATA");
        arrayList.add("BONE_DATA");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("CALORIES_DATA");
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.OnPreviewListener
    public void onPreviewFrame(Image image, int i, int i2) {
        if (this.mSportDataOutputApi == null) {
            return;
        }
        if (this.h != i || this.f11417a != i2) {
            this.h = i;
            this.f11417a = i2;
            this.mSportDataOutputApi.setParas(SportParamsType.AI_ROPE_PARAS, new has(this.h, this.f11417a, this.e));
            if (!this.d) {
                this.d = true;
                onPreSport();
            }
        }
        if (getDataSource() == 7 && this.mSportDataOutputApi.isAlreadyInit()) {
            this.mSportDataOutputApi.setParas(SportParamsType.AI_ROPE_INPUT_IMAGE, image);
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        ArrayList arrayList = new ArrayList(4);
        b(arrayList);
        a(arrayList);
        c((List<BaseSportingViewModel.ReceivedDataHandler>) arrayList);
        e(arrayList);
        d(arrayList);
    }

    private void d(List<BaseSportingViewModel.ReceivedDataHandler> list) {
        list.add(new BaseSportingViewModel.a(this, "STUMBLING_ROPE_DATA", "interruptTimes", Integer.class));
        this.mReceivedDataHandlers.addAll(list);
    }

    void e(List<BaseSportingViewModel.ReceivedDataHandler> list) {
        list.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "STATUS_CODE_DATA", "bodyDetectionError", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map map) {
                LogUtil.j(SkippingViewModel.this.getTag(), this.mManagerDataTag, num);
                if (SkippingViewModel.this.mExtendHandler != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = num;
                    SkippingViewModel.this.mExtendHandler.sendMessage(messageObtain);
                }
            }
        });
    }

    private void c(List<BaseSportingViewModel.ReceivedDataHandler> list) {
        list.add(new BaseSportingViewModel.ReceivedDataHandler<Long>(this, "TIME_ONE_SECOND_DURATION", "showSportTime", Long.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void handleInner(Long l, Map<String, Object> map) {
                int iRound = Math.round((l.longValue() * 1.0f) / 1000.0f);
                if (SkippingViewModel.this.getSportTarget() == 0) {
                    int targetValue = (int) (SkippingViewModel.this.getTargetValue() - iRound);
                    SkippingViewModel.this.postValue(this.mViewModelTag, UnitUtil.b(targetValue));
                    if (targetValue <= 10) {
                        SkippingViewModel.this.postValue("sportTimeCountDown", true);
                    }
                } else {
                    SkippingViewModel.this.postValue(this.mViewModelTag, UnitUtil.b(iRound));
                }
                SkippingViewModel.this.d(map);
            }
        });
    }

    private void a(List<BaseSportingViewModel.ReceivedDataHandler> list) {
        list.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "CONTINUOUS_SKIPPING_JUMP_DATA", "skipContinuouslyTimes", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                if (num.intValue() > 1) {
                    SkippingViewModel.this.postValue("skipContinuouslyTimes", num);
                }
            }
        });
    }

    private void b(List<BaseSportingViewModel.ReceivedDataHandler> list) {
        list.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "SKIP_NUM_DATA", "skipTimes", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                SkippingViewModel.this.e(this.mViewModelTag, num.intValue(), map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map<String, Object> map) {
        if (map.containsKey("HEART_RATE_DATA")) {
            postValue(IndoorEquipManagerApi.KEY_HEART_RATE, map.get("HEART_RATE_DATA"));
        }
        if (map.containsKey("CALORIES_DATA")) {
            postValue("calorie", map.get("CALORIES_DATA"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i, Map<String, Object> map) {
        postValue(str, Integer.valueOf(i));
        Object obj = map.get("FOOT_POINT_DATA");
        if (obj instanceof nua) {
            nua nuaVar = (nua) obj;
            postValue("footPosition", new Pair(Float.valueOf(nuaVar.e()), Float.valueOf(nuaVar.c())));
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
        addFragment(new SkippingFragment());
        addFragment(new SkippingIntroduceFragment());
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        super.onStartSport();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.basesport.viewmodel.ISportPagerConfig
    public int getDefaultItem() {
        if (this.mIsFirstIn) {
            return Math.max(0, getCount() - 1);
        }
        return 0;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        h();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_SkippingViewModel";
    }

    public void i() {
        SportMusicController.c().d(this.f.d(getSportType()) == null ? 1 : 2, getSportType(), true);
    }

    public void d() {
        this.f = new jaq(BaseApplication.b(), new StorageParams(1), Integer.toString(20002));
    }

    public boolean a() {
        return (this.i && CommonUtil.bh()) ? false : true;
    }

    public boolean e() {
        return this.mIsFirstIn;
    }

    public void c() {
        if (a()) {
            LogUtil.a("Track_SkippingViewModel", "not supportMusic");
            return;
        }
        if (g()) {
            SportMusicController.c().a(1, (String) null);
        }
        iyb.a(BaseApplication.b(), new Intent("action_stop_play_sport_music"));
    }

    private boolean g() {
        if (this.f == null) {
            d();
        }
        return this.f.h(getSportType()) == 1;
    }

    public jaq b() {
        return this.f;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        super.onPreSport();
        if (getDataSource() == 5) {
            dmg.a().requestDeviceInfoAndState("SportService_EcologyManager");
        }
        boolean zC = jaa.c(BaseApplication.b());
        this.i = zC;
        ReleaseLogUtil.d("Track_SkippingViewModel", "onPreSport() isSupportMusic ", Boolean.valueOf(zC));
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.f11419c = true;
        if (this.mSportLifeCircleApi != null) {
            ReleaseLogUtil.d("Track_SkippingViewModel", "onStopSport()");
            this.mSportLifeCircleApi.m825x32b3e3a1();
        }
    }

    public void h() {
        LogUtil.a("Track_SkippingViewModel", "mHasStopSkipSport is ", Boolean.valueOf(this.f11419c), " getDataSource() is ", Integer.valueOf(getDataSource()));
        if (this.f11419c || getDataSource() != 5) {
            return;
        }
        ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).ropeSetFitnessMachineControl(3, 6, null);
    }

    public void e(boolean z) {
        if (this.h == 0 || this.f11417a == 0) {
            LogUtil.j(getTag(), "mWidth or mHeight is zero, return");
            return;
        }
        if (getDataSource() == 7) {
            this.e = z ? 1 : 0;
            this.mSportDataOutputApi.setParas(SportParamsType.AI_ROPE_PARAS, new has(this.h, this.f11417a, this.e));
        }
        d(z);
    }

    public void d(boolean z) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", z ? "1" : "2");
        map.put(Wpt.MODE, getDataSource() == 7 ? "1" : "2");
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_SKIP_CAMERA_2040229.value(), map, 0);
    }
}
