package com.huawei.ui.homehealth.runcard.trackfragments;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.group.api.GroupApi;
import com.huawei.health.group.constants.GroupActivityBo;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.view.SportingMiniBarView;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider;
import com.huawei.ui.homehealth.runcard.utils.SportMusicUtils;
import com.huawei.ui.homehealth.runcard.utils.TargetChoicePickerUtils;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.zhangyue.iReader.sdk.scheme.ISchemeListener;
import defpackage.dex;
import defpackage.iem;
import defpackage.ien;
import defpackage.ify;
import defpackage.ive;
import defpackage.ivo;
import defpackage.ivq;
import defpackage.iwn;
import defpackage.iws;
import defpackage.iwy;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.jbq;
import defpackage.jem;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.lua;
import defpackage.njy;
import defpackage.nkb;
import defpackage.nvd;
import defpackage.pqj;
import defpackage.pqm;
import defpackage.pqq;
import defpackage.qre;
import defpackage.qrs;
import defpackage.sym;
import defpackage.tfi;
import defpackage.yto;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public abstract class SportStatisticProvider extends BaseKnitDataProvider<HiHealthData> {
    private static final String BASE_TAG = "Track_Provider_SportStatisticProvider";
    private static final int COURSE_CATEGORY = 12731;
    private static final HashMap<Integer, Integer> GROUP_TYPE_TO_SPORT_TYPE = new HashMap<Integer, Integer>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.2
        {
            put(401, 257);
            put(402, 258);
            put(403, 259);
        }
    };
    private static final boolean IS_AI_RUN_PLAN_OPEN = true;
    private static final int IS_NOT_CUSTOM_DIALOG_VALUE = 2;
    private static final int KILOCALORIE_TO_CALORIE = 1000;
    private static final int MINUTE_TO_SECOND = 60;
    private static final int MSG_REFRESH_UI = 3;
    private static final int MSG_SHOW_DIALOG = 2;
    private static final int MSG_START_SPORT = 1;
    private static final int MUSIC_NOT_SUPPORT_BI = 0;
    private static final int MUSIC_OPERATOR_SELECTED = 1;
    private static final int MUSIC_SUPPORT_BI = 4;
    private static final String MUSIC_TAG = "isSupportSportMusic";
    private static final double THRESHOLD = 1.0E-5d;
    private String mAdvertisementTextTitle;
    public Context mContext;
    private Plan mCurrentPlan;
    private ResourceBriefInfo mIndoorResourceBriefInfo;
    private boolean mIsBlueToothEnable;
    private boolean mIsShowImperial;
    private volatile boolean mIsSportSupportMusic;
    private volatile boolean mIsSystemSupportMusic;
    private Bitmap mMusicBitmap;
    private volatile boolean mNeedRefresh;
    private volatile boolean mNotHasMusicContentElement;
    private CustomViewDialog mPlanDialog;
    private SectionBean mSectionBean;
    private SportTargetDialog mSportTargetDialog;
    private float mTargetValue;
    private int mTargetType = -2;
    private b mStatDataCallback = new b(this);
    private d mLoadMusicElementCallback = new d(this);
    private HiHealthData mHealthData = new HiHealthData();
    private final String TAG = "Track_Provider_" + getTag();
    private boolean mIsSchemeManagerInit = false;
    private final Handler mRefreshTargetHandler = new Handler() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.6
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j(SportStatisticProvider.this.TAG, "mRefreshTargetHandler msg is null");
                return;
            }
            super.handleMessage(message);
            SportStatisticProvider.this.mTargetType = message.arg1;
            if (message.obj instanceof Float) {
                SportStatisticProvider.this.mTargetValue = ((Float) message.obj).floatValue();
            }
            boolean z = message.arg2 != 2;
            SportStatisticProvider sportStatisticProvider = SportStatisticProvider.this;
            sportStatisticProvider.refreshTargetTypeAndValue(sportStatisticProvider.mTargetType, SportStatisticProvider.this.mTargetValue, true, z);
            LogUtil.a(SportStatisticProvider.this.TAG, "handleMessage targetType = ", Integer.valueOf(SportStatisticProvider.this.mTargetType), " targetValue = ", Float.valueOf(SportStatisticProvider.this.mTargetValue));
            if (SportStatisticProvider.this.mSectionBean != null) {
                SportStatisticProvider.this.mSectionBean.c(SportStatisticProvider.this.mHealthData);
            }
        }
    };
    private final Handler mStartSportHandler = new Handler() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.7
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a(SportStatisticProvider.this.TAG, "mStartSportHandler msg is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (!iwy.a(SportStatisticProvider.this.mContext).ay() || iwy.a(SportStatisticProvider.this.mContext).p() == 1) {
                    ReleaseLogUtil.d(SportStatisticProvider.this.TAG, "goto StartSport");
                    SportStatisticProvider.this.showGroupActivityDialog();
                    return;
                }
                return;
            }
            if (i == 2) {
                SportStatisticProvider.this.showStartSportIgnoreLinkDialog();
                return;
            }
            if (i != 3) {
                return;
            }
            LogUtil.a(SportStatisticProvider.this.TAG, "MSG_REFRESH_UI");
            if (SportStatisticProvider.this.mSectionBean == null || SportStatisticProvider.this.mHealthData == null) {
                return;
            }
            SportStatisticProvider.this.mSectionBean.c(SportStatisticProvider.this.mHealthData);
        }
    };
    private final BroadcastReceiver mHiBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getIntExtra("refresh_type", -1) == 0) {
                SportStatisticProvider.this.requestSportStatData();
            }
        }
    };
    private StorageParams mStorageParams = new StorageParams();
    private String mModuleId = Integer.toString(20002);
    private jaq mTrackSharedPreferenceUtil = new jaq(BaseApplication.getContext(), this.mStorageParams, this.mModuleId);
    private SportMusicUtils mSportMusicUtils = new SportMusicUtils(BaseApplication.getContext());

    public static /* synthetic */ void lambda$showStartSportIgnoreLinkDialog$15(View view) {
    }

    protected abstract double getHiHealthDataDistance(HiHealthData hiHealthData);

    protected abstract String getHiHealthDataDistanceKey();

    protected abstract int getSportType();

    protected abstract String getTag();

    protected abstract void setData(Context context, HashMap<String, Object> map, Object obj);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (HiHealthData) obj);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        if (this.mHealthData != null) {
            String strB = dex.b(String.valueOf(getSportType()));
            String strB2 = dex.b(MUSIC_TAG);
            double dA = !TextUtils.isEmpty(strB) ? CommonUtils.a(strB) : 0.0d;
            if (!TextUtils.isEmpty(strB2)) {
                requestImageMusicAsync(Boolean.parseBoolean(strB2));
            }
            String hiHealthDataDistanceKey = getHiHealthDataDistanceKey();
            LogUtil.a(this.TAG, "loadDefaultData() cachedDistanceStr: ", strB, ", cachedSumDistance: ", Double.valueOf(dA), ", distanceKey: ", hiHealthDataDistanceKey);
            if (!TextUtils.isEmpty(hiHealthDataDistanceKey)) {
                this.mHealthData.putDouble(hiHealthDataDistanceKey, dA);
            }
        }
        this.mIsShowImperial = UnitUtil.f();
        sectionBean.c(this.mHealthData);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, SectionBean sectionBean) {
        LogUtil.a(this.TAG, "loadData");
        this.mSectionBean = sectionBean;
        ThreadPoolManager.c().execute(new Runnable() { // from class: syk
            @Override // java.lang.Runnable
            public final void run() {
                this.f48805b.m1683xa45a37e8(context);
            }
        });
        requestSportStatData();
        requestMusicData();
        registerHiHealthDataBroadcast(context);
        refreshTarget();
        refreshUnit();
        ivo.a().b(this.TAG, new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a(SportStatisticProvider.this.TAG, "bolt errCode is ", Integer.valueOf(i), " objData ", obj);
                if (SportStatisticProvider.this.mSectionBean == null || SportStatisticProvider.this.mHealthData == null) {
                    return;
                }
                SportStatisticProvider.this.mSectionBean.c(SportStatisticProvider.this.mHealthData);
            }
        });
        if (this.mNeedRefresh) {
            this.mSectionBean.c(this.mHealthData);
        }
    }

    /* JADX INFO: renamed from: lambda$loadData$0$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1683xa45a37e8(Context context) {
        if (CommonUtil.bh() && jaa.f(context) && tfi.e(this.mContext) != 0) {
            checkSupportListenBook();
        }
        List<MessageObject> messages = ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).getMessages(42);
        if (messages == null || messages.size() != 1) {
            return;
        }
        String msgTitle = messages.get(0).getMsgTitle();
        this.mAdvertisementTextTitle = msgTitle;
        ReleaseLogUtil.d(this.TAG, "loadData mAdvertisementTextTitle  ", msgTitle);
    }

    private void refreshUnit() {
        boolean zF = UnitUtil.f();
        if (this.mIsShowImperial != zF) {
            ReleaseLogUtil.d(getTag(), "refresh unit");
            this.mIsShowImperial = zF;
            this.mNeedRefresh = true;
        }
    }

    private void refreshTarget() {
        int iE = tfi.e(this.mContext, getSportType());
        float fD = tfi.d(this.mContext, getSportType());
        int i = this.mTargetType;
        if (i != -2) {
            if (i == iE && this.mTargetValue == fD) {
                return;
            }
            ReleaseLogUtil.d(this.TAG, "refresh target of ", Integer.valueOf(iE));
            this.mNeedRefresh = true;
        }
    }

    private void registerHiHealthDataBroadcast(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        LocalBroadcastManager.getInstance().registerReceiver(this.mHiBroadcastReceiver, intentFilter);
        LogUtil.a(this.TAG, "mHiBroadcastReceiver register success", this);
    }

    private void unregisterHiHealthDataBroadcast() {
        if (this.mHiBroadcastReceiver != null) {
            try {
                LocalBroadcastManager.getInstance().unregisterReceiver(this.mHiBroadcastReceiver);
                LogUtil.a(this.TAG, "mHiBroadcastReceiver unregister", this);
            } catch (IllegalArgumentException unused) {
                LogUtil.e(this.TAG, "IllegalArgumentException mHiBroadcastReceiver unregister");
            }
        }
    }

    protected void requestSportStatData() {
        LogUtil.a(this.TAG, "requestSportStatData");
        int sportType = getSportType();
        if (sportType == 264) {
            nkb.d().b(0L, System.currentTimeMillis(), 7, 258, this.mStatDataCallback);
            return;
        }
        if (sportType == 258 || sportType == 257 || sportType == 259 || sportType == 282) {
            nkb.d().b(0L, System.currentTimeMillis(), 7, sportType == 282 ? 257 : sportType, this.mStatDataCallback);
        } else {
            iwn.a(this.mContext).e(0L, System.currentTimeMillis(), 7, sportType, this.mStatDataCallback);
        }
    }

    protected void requestMusicData() {
        LogUtil.a(this.TAG, "requestMusicData");
        if (this.mTrackSharedPreferenceUtil.h(getSportType()) != 1 || this.mTrackSharedPreferenceUtil.d(getSportType()) == null) {
            LogUtil.a(this.TAG, "requestMusicData set data");
            if (this.mMusicBitmap != null) {
                LogUtil.a(this.TAG, "has bitmap before");
                requestImageMusicAsync(Boolean.parseBoolean(dex.b(MUSIC_TAG)));
                this.mNeedRefresh = true;
                return;
            }
            return;
        }
        this.mSportMusicUtils.b(this.mTrackSharedPreferenceUtil, getSportType(), this.mLoadMusicElementCallback);
    }

    class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<SportStatisticProvider> f25950b;

        d(SportStatisticProvider sportStatisticProvider) {
            this.f25950b = new WeakReference<>(sportStatisticProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a(SportStatisticProvider.this.TAG, "loadMusicCallback errorCode is ", Integer.valueOf(i));
            SportStatisticProvider sportStatisticProvider = this.f25950b.get();
            if (sportStatisticProvider == null) {
                LogUtil.e(SportStatisticProvider.this.TAG, "loadMusicCallback error, fragment is null.");
                return;
            }
            if (!LoginInit.getInstance(null).getIsLogined()) {
                sportStatisticProvider.updateHealthData(new HiHealthData());
                return;
            }
            if (i != 100000 || obj == null) {
                SportStatisticProvider.this.mMusicBitmap = null;
                return;
            }
            if (obj instanceof Bitmap) {
                SportStatisticProvider.this.mMusicBitmap = (Bitmap) obj;
                sportStatisticProvider.requestImageMusicAsync(jaa.f(BaseApplication.getContext()));
                sportStatisticProvider.mSectionBean.c(SportStatisticProvider.this.mHealthData);
                return;
            }
            LogUtil.e(SportStatisticProvider.this.TAG, "loadMusicCallback objData is error!");
            SportStatisticProvider.this.mMusicBitmap = null;
        }
    }

    private List<Integer> getMusicBgList() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_sport_entrance_music));
        arrayList.add(Integer.valueOf(R.string.IDS_hwh_motiontrack_music));
        return arrayList;
    }

    public void parseParams(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        LogUtil.a(this.TAG, "parseParams");
        this.mContext = context;
        if (this.mSportTargetDialog == null) {
            this.mSportTargetDialog = new SportTargetDialog(this.mContext);
        }
        setData(context, map, hiHealthData);
        updateImageMusic(map);
        updatePopularRoutesImage(map);
        setClickListener(map);
        setTargetTypeAndValue(map);
        updateDistance(map, hiHealthData);
        ivq.e().e(map, getSportType());
        this.mNeedRefresh = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestImageMusicAsync(boolean z) {
        LogUtil.a(this.TAG, "requestImageMusicAsync");
        boolean z2 = true;
        this.mIsSystemSupportMusic = CommonUtil.bh() && z;
        this.mIsSportSupportMusic = z;
        if (this.mTrackSharedPreferenceUtil.h(getSportType()) == 1 && this.mTrackSharedPreferenceUtil.d(getSportType()) != null && this.mMusicBitmap != null) {
            z2 = false;
        }
        this.mNotHasMusicContentElement = z2;
    }

    private void updateImageMusic(HashMap<String, Object> map) {
        if (tfi.e(this.mContext) == 1) {
            addBookImage(map);
        } else if (this.mIsSystemSupportMusic && this.mIsSportSupportMusic) {
            LogUtil.a(this.TAG, "updateImageMusic");
            if (this.mNotHasMusicContentElement) {
                map.put("RIGHT_IMAGEVIEW", getMusicBgList());
                return;
            } else {
                map.put("RIGHT_IMAGEVIEW", Collections.singletonList(this.mMusicBitmap));
                tfi.b(this.mContext, 0);
            }
        } else {
            map.remove("RIGHT_IMAGEVIEW");
        }
        if (isShowMusicRun()) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
            arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
            arrayList.add(Integer.valueOf(R.drawable.ic_sport_entrance_music));
            arrayList.add(Integer.valueOf(R.string.IDS_sug_music_run));
            map.put("RIGHT_IMAGEVIEW", arrayList);
        }
    }

    private void addBookImage(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_sport_entrance_book));
        arrayList.add(Integer.valueOf(R.string.IDS_hwh_motiontrack_listen_book));
        map.put("RIGHT_IMAGEVIEW", arrayList);
        tfi.b(this.mContext, 1);
    }

    private boolean isShowMusicRun() {
        if (!Utils.j() || izn.e()) {
            return false;
        }
        return getSportType() == 258 || getSportType() == 264;
    }

    private void jumpToMusicCourse() {
        int i;
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (getSportType() == 258) {
            i = 4;
        } else if (getSportType() == 264) {
            i = 5;
        } else {
            LogUtil.a(this.TAG, "jumpToMusicCourse getSportType()", Integer.valueOf(getSportType()));
            i = 0;
        }
        if (fitnessAdviceApi != null) {
            fitnessAdviceApi.jumpToAllCourse(this.mContext, COURSE_CATEGORY, i, "RUNNING_COURSE");
        }
    }

    private void updatePopularRoutesImage(HashMap<String, Object> map) {
        if (tfi.a(getSportType())) {
            map.put("RIGHT_TOP_IMAGE", Integer.valueOf(R.drawable.ic_routes));
            map.put("RIGHT_TOP_TITLE", this.mContext.getResources().getString(R.string.IDS_hw_show_sport_routes_string));
            map.put("RIGHT_TOP_TITLE_SECOND", this.mContext.getResources().getString(R.string.IDS_device_title_use));
            map.put("RIGHT_TOP_ICON_SHOW", true);
            if (Utils.o()) {
                return;
            }
            map.put("RIGHT_TOP_BUBBLE", qre.f(R.string.IDS_exp_route_launching));
            return;
        }
        map.put("RIGHT_TOP_ICON_SHOW", false);
    }

    private void goToRoutes() {
        RunPopularRoutesUtil.e(this.mContext, 1, new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.13
            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void goNext() {
                LogUtil.a(SportStatisticProvider.this.TAG, "GoToRoutes SUCCESS And Jump");
                RunningRouteUtils.b(SportStatisticProvider.this.mContext, SportStatisticProvider.this.getSportType(), (HotPathCityInfo) null);
            }

            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void notGoNext() {
                LogUtil.a(SportStatisticProvider.this.TAG, "Not GoToRoutes");
                qrs.r();
            }
        });
    }

    private void updateDistance(HashMap<String, Object> map, HiHealthData hiHealthData) {
        String strA;
        double hiHealthDataDistance = hiHealthData != null ? getHiHealthDataDistance(hiHealthData) : 0.0d;
        LogUtil.a(this.TAG, "distance ", LogAnonymous.d((int) hiHealthDataDistance));
        if (UnitUtil.f()) {
            strA = TargetChoicePickerUtils.a(UnitUtil.e(hiHealthDataDistance / 1000.0d, 3), this.mContext);
        } else {
            strA = TargetChoicePickerUtils.a(hiHealthDataDistance / 1000.0d, this.mContext);
        }
        map.put("ACCUMULATED_DURATION", strA);
    }

    private void setTargetTypeAndValue(Map<String, Object> map) {
        String string;
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            this.mTargetType = tfi.e(this.mContext, getSportType());
            float fD = tfi.d(this.mContext, getSportType());
            this.mTargetValue = fD;
            int i = this.mTargetType;
            if (i == 1) {
                if (UnitUtil.f()) {
                    string = qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_en, UnitUtil.b(this.mTargetValue, Locale.getDefault()), UnitUtil.e(UnitUtil.e(this.mTargetValue, 3), 1, 2));
                } else {
                    string = qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_km, UnitUtil.b(this.mTargetValue, Locale.getDefault()), getTargetValueStr(this.mTargetValue));
                }
            } else if (i == 0) {
                string = qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_min_2, UnitUtil.b(this.mTargetValue, Locale.getDefault()), UnitUtil.e(fD / 60.0f, 1, 0));
            } else if (i == 2) {
                string = qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_kcal, UnitUtil.b(this.mTargetValue, Locale.getDefault()), UnitUtil.e(fD / 1000.0f, 1, 0));
            } else {
                string = this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_set_target);
            }
            putViewMap(map, string);
            return;
        }
        map.put("IS_GOAL_BUTTON_SHOW", false);
    }

    private String getTargetValueStr(float f) {
        double d2 = f;
        if (Math.abs(d2 - 42.195d) < 1.0E-5d) {
            return UnitUtil.e(d2, 1, 3);
        }
        if (Math.abs(d2 - 21.0975d) < 1.0E-5d) {
            return UnitUtil.e(d2, 1, 4);
        }
        return UnitUtil.e(d2, 1, 2);
    }

    private void checkSupportListenBook() {
        yto.a(BaseApplication.getContext(), "huaweisport", "q3@!DF5*&$9MrhCS", "tingshu", new ISchemeListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.15
            @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
            public void onSuccess(Object obj) {
                if (obj != null) {
                    LogUtil.a(SportStatisticProvider.this.TAG, "checkSuportListenBook", obj.toString());
                } else {
                    LogUtil.j(SportStatisticProvider.this.TAG, "checkSuportListenBook obj is null");
                }
                SportStatisticProvider.this.mIsSchemeManagerInit = true;
                tfi.b(BaseApplication.getContext(), 1);
                if (SportStatisticProvider.this.mStartSportHandler != null) {
                    SportStatisticProvider.this.mStartSportHandler.sendEmptyMessage(3);
                }
            }

            @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
            public void onError(int i, String str) {
                LogUtil.j(SportStatisticProvider.this.TAG, "errorMsg is", str, "errorCode is", Integer.valueOf(i));
                tfi.b(BaseApplication.getContext(), 0);
                if (SportStatisticProvider.this.mStartSportHandler != null) {
                    SportStatisticProvider.this.mStartSportHandler.sendEmptyMessage(3);
                }
            }
        });
    }

    private void putViewMap(Map<String, Object> map, String str) {
        map.put("IS_GOAL_BUTTON_SHOW", true);
        map.put("GOAL_BUTTON", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshTargetTypeAndValue(int i, float f, boolean z, boolean z2) {
        if (z) {
            tfi.b(this.mContext, getSportType(), i);
            tfi.a(this.mContext, f, getSportType());
            tfi.a(this.mContext, getSportType(), z2);
            if (z2) {
                tfi.b(this.mContext, getSportType(), i, f);
            } else {
                tfi.b(this.mContext, getSportType(), i, -1.0f);
            }
        }
    }

    private void setClickListener(Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.12
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
                if ("ACCUMULATED_DURATION_CLICK_VIEW".equals(str)) {
                    if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                        SportStatisticProvider.this.clickToLogin();
                        return;
                    } else {
                        SportStatisticProvider.this.startSportHistory();
                        return;
                    }
                }
                if ("GOAL_BUTTON".equals(str)) {
                    if (qrs.c(500)) {
                        return;
                    }
                    SportStatisticProvider.this.mSportTargetDialog.e(SportStatisticProvider.this.getSportType(), SportStatisticProvider.this.mRefreshTargetHandler);
                    return;
                }
                if ("LEFT_IMAGEVIEW".equals(str)) {
                    ify.a(SportStatisticProvider.this.mContext, SportStatisticProvider.this.getSportType(), SportStatisticProvider.this.mTargetType, SportStatisticProvider.this.mTargetValue);
                    return;
                }
                if ("MIDDLE_IMAGEVIEW".equals(str)) {
                    SportStatisticProvider.this.middleButtonClickEvent();
                    return;
                }
                if ("CANCEL_GUIDE_BUBBLE_TEXT".equals(str)) {
                    SharedPreferenceManager.e(SportStatisticProvider.this.mContext, Integer.toString(20002), "show_outdoor_cycle_tip", Boolean.toString(false), new StorageParams());
                    return;
                }
                if ("RIGHT_IMAGEVIEW".equals(str)) {
                    SportStatisticProvider.this.rightIconClickEvent();
                    return;
                }
                if ("RIGHT_TOP_IMAGE".equals(str)) {
                    SportStatisticProvider.this.routesEntranceBegin();
                } else if ("RIGHT_TOP_IMAGE_SECOND".equals(str)) {
                    SportStatisticProvider.this.refreshBoltImageIcon();
                    ivq.e().c(SportStatisticProvider.this.mContext, SportStatisticProvider.this.getSportType());
                } else {
                    LogUtil.a(SportStatisticProvider.this.TAG, "useless click");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void middleButtonClickEvent() {
        refreshBoltImageIcon();
        showBoltSelectedListDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rightIconClickEvent() {
        if (isShowMusicRun()) {
            jumpToMusicCourse();
        } else {
            lmf.d().c(this.mContext, AnalyticsValue.MOTION_TRACK_1040014.value(), gotoSportMusic(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshBoltImageIcon() {
        HiHealthData hiHealthData;
        SectionBean sectionBean = this.mSectionBean;
        if (sectionBean == null || (hiHealthData = this.mHealthData) == null) {
            return;
        }
        sectionBean.c(hiHealthData);
        LogUtil.a(this.TAG, "refreshBoltImageIcon setData(mHealthData)");
    }

    private void showBoltSelectedListDialog() {
        int boltErrorStatus = getBoltErrorStatus();
        if (isSupportBoltSportType() && boltErrorStatus != 0 && !BoltCustomDialog.c().a()) {
            BoltCustomDialog.c().c(this.mContext, getSportType(), boltErrorStatus, new BoltCustomDialog.OnConfirmCallBack() { // from class: syl
                @Override // com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.OnConfirmCallBack
                public final void confirmCallBack() {
                    this.d.m1685x2f78b3c4();
                }
            });
        } else if (isShowBoltNumberListDialog()) {
            BoltCustomDialog.c().d(this.mContext, getSportType(), new BoltCustomDialog.OnConfirmCallBack() { // from class: syu
                @Override // com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.OnConfirmCallBack
                public final void confirmCallBack() {
                    this.f48813c.m1686xb1c368a3();
                }
            }, 0);
        } else {
            m1686xb1c368a3();
        }
    }

    private boolean isShowBoltNumberListDialog() {
        if (isSupportBoltSportType() && ivq.e().a() >= 2) {
            return true;
        }
        int sportType = getSportType();
        if ((sportType == 258 || sportType == 264) && ivq.e().c() >= 2) {
            return true;
        }
        return sportType == 259 && ivq.e().d() >= 2;
    }

    private int getBoltErrorStatus() {
        List<ivo.d> listE = ivo.a().e(true);
        if (njy.e(listE)) {
            LogUtil.a(this.TAG, "No connect bolt device list.");
            return 0;
        }
        int sportType = getSportType();
        if (ivo.a().d(listE, sportType)) {
            return 0;
        }
        List<ivo.d> listE2 = ivo.a().e(listE);
        if (!njy.e(ivo.a().b(listE, sportType))) {
            return 2;
        }
        if (!njy.e(listE2)) {
            return 1;
        }
        LogUtil.a(this.TAG, "Normal bolt status.");
        return 0;
    }

    private boolean isSupportBoltSportType() {
        int sportType = getSportType();
        return sportType == 258 || sportType == 259 || sportType == 264;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clickToLogin() {
        LoginInit.getInstance(this.mContext).browsingToLogin(new IBaseResponseCallback() { // from class: syw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48814c.m1682x4130b46f(i, obj);
            }
        }, "");
    }

    /* JADX INFO: renamed from: lambda$clickToLogin$3$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1682x4130b46f(int i, Object obj) {
        if (i == 0) {
            LogUtil.a(this.TAG, "clickToSportHistory login success");
        } else {
            LogUtil.j(this.TAG, "errorCode is not success", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSportHistory() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(getSportType()));
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_GPS_HISTORY_2010015.value(), map, 0);
        Intent intent = new Intent(this.mContext, (Class<?>) SportHistoryActivity.class);
        intent.putExtra(BleConstants.SPORT_TYPE, getSportType());
        try {
            this.mContext.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(this.TAG, "ActivityNotFoundException", e2.getMessage());
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }

    public Map<String, Object> gotoSportMusic() {
        LogUtil.d(this.TAG, "gotoSportMusic");
        Map<String, Object> map = new HashMap<>(5);
        if (tfi.e(this.mContext) == 0) {
            map = this.mSportMusicUtils.a(map, getSportType());
        } else {
            if (this.mIsSchemeManagerInit) {
                BaseTrackProvider.a();
            } else {
                yto.a(BaseApplication.getContext(), "huaweisport", "q3@!DF5*&$9MrhCS", "tingshu", new ISchemeListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.17
                    @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                    public void onSuccess(Object obj) {
                        if (obj != null) {
                            LogUtil.a(SportStatisticProvider.this.TAG, "checkSuportListenBook", obj.toString());
                        } else {
                            LogUtil.j(SportStatisticProvider.this.TAG, "checkSuportListenBook obj is null");
                        }
                        SportStatisticProvider.this.mIsSchemeManagerInit = true;
                        BaseTrackProvider.a();
                    }

                    @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                    public void onError(int i, String str) {
                        LogUtil.j(SportStatisticProvider.this.TAG, "errorMsg is", str, "errorCode is", Integer.valueOf(i));
                    }
                });
            }
            map.put("sportMusicType", 1);
        }
        map.put("click", 1);
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 0);
        map.put("musicType", Integer.valueOf(jaa.f(this.mContext) ? 4 : 0));
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(getSportType()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void routesEntranceBegin() {
        LoginInit.getInstance(this.mContext).browsingToLogin(new IBaseResponseCallback() { // from class: syo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48808a.m1684x50090425(i, obj);
            }
        }, "");
    }

    /* JADX INFO: renamed from: lambda$routesEntranceBegin$4$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1684x50090425(int i, Object obj) {
        if (i == 0) {
            checkUserInfo(2);
        } else {
            LogUtil.j(this.TAG, "errorCode is not success", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sportEntranceBegin, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m1686xb1c368a3() {
        LoginInit.getInstance(this.mContext).browsingToLogin(new IBaseResponseCallback() { // from class: syt
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48812a.m1694xcf895294(i, obj);
            }
        }, "");
    }

    /* JADX INFO: renamed from: lambda$sportEntranceBegin$5$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1694xcf895294(int i, Object obj) {
        if (i == 0) {
            checkUserInfo(1);
        } else {
            LogUtil.j(this.TAG, "errorCode is not success", Integer.valueOf(i));
        }
    }

    private void checkUserInfo(final int i) {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).checkUserInfo(this.mContext, new IBaseResponseCallback() { // from class: syy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f48817c.m1681x6c252acb(i, i2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$checkUserInfo$6$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1681x6c252acb(int i, int i2, Object obj) {
        if (i2 != 0) {
            if (qrs.c(1500)) {
                ReleaseLogUtil.d(this.TAG, "onClick isFastClick");
            } else if (i == 1) {
                checkDeviceStatus();
            } else {
                ReleaseLogUtil.d(this.TAG, "go To Routes");
                goToRoutes();
            }
        }
    }

    private void checkDeviceStatus() {
        this.mIsBlueToothEnable = false;
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            this.mIsBlueToothEnable = BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
        if (iwy.a(this.mContext).ay() && iwy.a(this.mContext).w()) {
            ReleaseLogUtil.e(this.TAG, "Third-app has started sport");
            new NoTitleCustomAlertDialog.Builder(this.mContext).b(R.string.IDS_start_sport_operation_failed).c(R.string.IDS_kn_lost_ok, new View.OnClickListener() { // from class: syp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.m1680xfd8f833b(view);
                }
            }).c().show();
        } else if (isSupportSportType()) {
            checkMultilingualAudio();
        } else {
            checkTodayCourse();
        }
    }

    /* JADX INFO: renamed from: lambda$checkDeviceStatus$7$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1680xfd8f833b(View view) {
        LogUtil.a(this.TAG, "checkDeviceStatus:PositiveButton has been clicked");
    }

    private boolean isSupportSportType() {
        LogUtil.a(this.TAG, "getSportType()= ", Integer.valueOf(getSportType()));
        return getSportType() == 258 || getSportType() == 257 || getSportType() == 259 || getSportType() == 264;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkTodayCourse() {
        if (getSportType() != 258) {
            startSport();
            return;
        }
        ReleaseLogUtil.d(this.TAG, "into getCutPlan");
        Plan cutPlan = getCutPlan();
        if (cutPlan == null) {
            startSport();
        } else {
            getCourseName(cutPlan);
        }
    }

    private void checkMultilingualAudio() {
        AudioResProviderInterface audioResProviderInterface = (AudioResProviderInterface) AppRouter.e(AudioResProviderInterface.ROUTER_PATH_AUDIO_RES_DOWNLOAD, AudioResProviderInterface.class);
        boolean zB = pqj.b().b(this.mContext);
        ReleaseLogUtil.d(this.TAG, "service = ", Boolean.valueOf(audioResProviderInterface != null), " isEnableCurLang = ", Boolean.valueOf(zB));
        if (audioResProviderInterface != null && zB) {
            audioResProviderInterface.queryOrDownAudioResource(BaseApplication.getActivity(), pqq.b(this.mContext, "Sport"), this.mContext.getResources().getString(com.huawei.ui.commonui.R.string.IDS_hwh_base_model_multilingualaudio), new AudioResDownloadListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.4
                @Override // com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener
                public void onResult(int i) {
                    ReleaseLogUtil.d(SportStatisticProvider.this.TAG, "result = ", Integer.valueOf(i));
                    SportStatisticProvider.this.checkTodayCourse();
                }
            });
        } else {
            checkTodayCourse();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSport() {
        boolean zE = iem.e(this.mContext, this.mIsBlueToothEnable);
        boolean zE2 = iem.e(this.mContext);
        boolean zH = nvd.h(BaseApplication.getContext());
        ReleaseLogUtil.d(this.TAG, "isConnect", Boolean.valueOf(zE), "isIndependentSportDevice", Boolean.valueOf(zE2), "update status", Boolean.valueOf(zH));
        if (zE && zE2 && !zH) {
            pqm.a().e(new e(this));
            Handler handler = this.mStartSportHandler;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.1
            @Override // java.lang.Runnable
            public void run() {
                SportStatisticProvider.this.showGroupActivityDialog();
            }
        });
    }

    private Plan getCutPlan() {
        final Plan[] planArr = new Plan[1];
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e(this.TAG, "refreshMyPlanBanner, getCurrentPlan : planApi is null.");
            return planArr[0];
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        planApi.getCurrentIntPlan(new UiCallback<IntPlan>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e(SportStatisticProvider.this.TAG, "errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                if (intPlan == null || (!intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) && !intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN))) {
                    LogUtil.e(SportStatisticProvider.this.TAG, "getCutPlan : data is null.");
                    countDownLatch.countDown();
                    return;
                }
                Plan compatiblePlan = intPlan.getCompatiblePlan();
                if (compatiblePlan == null) {
                    LogUtil.e(SportStatisticProvider.this.TAG, "getCutPlan currentPlan == null");
                    countDownLatch.countDown();
                } else {
                    if (SportStatisticProvider.isAiRunPlanOpen()) {
                        planArr[0] = compatiblePlan;
                    }
                    countDownLatch.countDown();
                }
            }
        });
        try {
            if (!countDownLatch.await(1L, TimeUnit.SECONDS)) {
                LogUtil.e(this.TAG, "countDownAwait timeOut");
            }
        } catch (InterruptedException unused) {
            LogUtil.e(this.TAG, "countDownAwait interruptedException");
        }
        return planArr[0];
    }

    private void getCourseName(Plan plan) {
        this.mCurrentPlan = plan;
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e(this.TAG, "createTrainPlanView getWorkoutById : planApi is null.");
        } else {
            planApi.getTodayRunPanCourse(plan, new UiCallback<FitWorkout>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    SportStatisticProvider.this.startSport();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(FitWorkout fitWorkout) {
                    if (fitWorkout == null) {
                        LogUtil.e(SportStatisticProvider.this.TAG, "getTodayRunPanCourse onSuccess data == null");
                        SportStatisticProvider.this.startSport();
                    } else if ("Race".equals(fitWorkout.acquireId())) {
                        SportStatisticProvider.this.startSport();
                    } else {
                        SportStatisticProvider.this.showTodayPlanDialog(fitWorkout);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAiRunPlanOpen() {
        return !Utils.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTodayPlanDialog(FitWorkout fitWorkout) {
        CustomViewDialog customViewDialog = this.mPlanDialog;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            LogUtil.a(this.TAG, "mPlanDialog is showing");
            return;
        }
        View viewCreateTrainPlanView = createTrainPlanView(fitWorkout);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mContext);
        builder.d(viewCreateTrainPlanView).b(false);
        CustomViewDialog customViewDialogD = builder.d();
        this.mPlanDialog = customViewDialogD;
        customViewDialogD.show();
    }

    private View createTrainPlanView(final FitWorkout fitWorkout) {
        View viewInflate = View.inflate(this.mContext, R.layout.dialog_train_plan, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.goto_plan_describe);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.start_plan);
        HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.more_train_plan);
        HealthButton healthButton3 = (HealthButton) viewInflate.findViewById(R.id.ignore_train_plan);
        healthTextView.setText(this.mContext.getResources().getString(R.string.IDS_track_whether_goto_plan, fitWorkout.acquireName()));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(SportStatisticProvider.this.TAG, "start plan");
                SportStatisticProvider sportStatisticProvider = SportStatisticProvider.this;
                sportStatisticProvider.closeDialog(sportStatisticProvider.mPlanDialog);
                if (fitWorkout.isRunModelCourse()) {
                    ien.b(SportStatisticProvider.this.mContext, fitWorkout, SportStatisticProvider.this.mCurrentPlan, new Date().getTime());
                } else {
                    ien.a(SportStatisticProvider.this.mContext, fitWorkout, SportStatisticProvider.this.mCurrentPlan, new Date().getTime());
                }
            }
        });
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(SportStatisticProvider.this.TAG, "more plan");
                SportStatisticProvider sportStatisticProvider = SportStatisticProvider.this;
                sportStatisticProvider.closeDialog(sportStatisticProvider.mPlanDialog);
                SportStatisticProvider.this.jumpToPlanTab();
            }
        });
        healthButton3.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(SportStatisticProvider.this.TAG, "ignore plan");
                SportStatisticProvider.this.startSport();
                SportStatisticProvider sportStatisticProvider = SportStatisticProvider.this;
                sportStatisticProvider.closeDialog(sportStatisticProvider.mPlanDialog);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToPlanTab() {
        Intent intent = new Intent();
        intent.setPackage("com.huawei.health");
        intent.setClassName("com.huawei.health", "com.huawei.health.MainActivity");
        intent.setFlags(872415232);
        intent.putExtra("isToSportTab", true);
        intent.putExtra(BleConstants.SPORT_TYPE, 2);
        intent.putExtra(Constants.HOME_TAB_NAME, "SPORT");
        try {
            this.mContext.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(this.TAG, "ActivityNotFoundException", e2.getMessage());
        }
    }

    private GroupActivityBo getGroupActivity() {
        GroupActivityBo groupActivityBoD = SportingMiniBarView.d((GroupApi) Services.b("FeatureGroup", GroupApi.class));
        if (groupActivityBoD == null) {
            LogUtil.j(this.TAG, "activityBo is empty");
            return null;
        }
        LogUtil.a(this.TAG, "TeamId is ", groupActivityBoD.getTeamId(), " ActivityId is ", Integer.valueOf(groupActivityBoD.getActivityId()), "type is ", Integer.valueOf(groupActivityBoD.getActivityType()));
        return groupActivityBoD;
    }

    private void showPositionEnableDialog(GroupApi groupApi, final GroupActivityBo groupActivityBo) {
        if (groupApi.isSharing()) {
            gotoStartSport();
        } else {
            new CustomAlertDialog.Builder(this.mContext).b(qre.f(R.string.IDS_position_share_tip_dialog_title)).e(qre.a(R.string.IDS_position_share_tip_dialog_content1, groupActivityBo.getActivityName())).e(qre.f(R.string.IDS_position_share_tip_dialog_positive2), new DialogInterface.OnClickListener() { // from class: syj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.d.m1691x7ee4bc9f(dialogInterface, i);
                }
            }).d(qre.f(R.string.IDS_position_share_tip_dialog_negative2), new DialogInterface.OnClickListener() { // from class: syz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.d.m1692x12f717e(groupActivityBo, dialogInterface, i);
                }
            }).b().show();
        }
    }

    /* JADX INFO: renamed from: lambda$showPositionEnableDialog$8$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1691x7ee4bc9f(DialogInterface dialogInterface, int i) {
        gotoStartSport();
    }

    /* JADX INFO: renamed from: lambda$showPositionEnableDialog$9$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1692x12f717e(GroupActivityBo groupActivityBo, DialogInterface dialogInterface, int i) {
        AppRouter.e(Uri.parse(String.format(Locale.US, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.groups?h5pro=true&path=&joinActivity={\"teamId\":\"%s\",\"activityId\":%d}", groupActivityBo.getTeamId(), Integer.valueOf(groupActivityBo.getActivityId())))).b(this.mContext);
    }

    private void showJumpGroupDetailDialog(final GroupActivityBo groupActivityBo) {
        if (lua.a(Integer.toString(20002), "group_activity_id_type", -1) == groupActivityBo.getActivityId()) {
            HandlerExecutor.c(new sym(this));
        } else {
            new CustomAlertDialog.Builder(this.mContext).b(qre.f(R.string.IDS_position_share_tip_dialog_title)).e(qre.a(R.string.IDS_position_share_tip_dialog_content2, groupActivityBo.getActivityName())).e(qre.f(R.string.IDS_position_share_tip_dialog_positive2), new DialogInterface.OnClickListener() { // from class: syq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f48809b.m1689xd25ccb8e(groupActivityBo, dialogInterface, i);
                }
            }).d(qre.f(R.string.IDS_position_share_tip_dialog_negative2), new DialogInterface.OnClickListener() { // from class: syr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f48810b.m1690x54a7806d(groupActivityBo, dialogInterface, i);
                }
            }).b().show();
        }
    }

    /* JADX INFO: renamed from: lambda$showJumpGroupDetailDialog$10$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1689xd25ccb8e(GroupActivityBo groupActivityBo, DialogInterface dialogInterface, int i) {
        lua.e(Integer.toString(20002), "group_activity_id_type", groupActivityBo.getActivityId());
        gotoStartSport();
    }

    /* JADX INFO: renamed from: lambda$showJumpGroupDetailDialog$11$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1690x54a7806d(GroupActivityBo groupActivityBo, DialogInterface dialogInterface, int i) {
        AppRouter.e(Uri.parse(String.format(Locale.US, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.groups?h5pro=true&path=&joinActivity={\"teamId\":\"%s\",\"activityId\":%d}", groupActivityBo.getTeamId(), Integer.valueOf(groupActivityBo.getActivityId())))).b(this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGroupActivityDialog() {
        lsy.a(new Runnable() { // from class: sys
            @Override // java.lang.Runnable
            public final void run() {
                this.f48811b.m1688xe38c07b7();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showGroupActivityDialog$13$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1688xe38c07b7() {
        final GroupActivityBo groupActivity = getGroupActivity();
        if (groupActivity == null || !GROUP_TYPE_TO_SPORT_TYPE.containsKey(Integer.valueOf(groupActivity.getActivityType()))) {
            LogUtil.a(this.TAG, "groupActivityBo is null");
            HandlerExecutor.c(new sym(this));
        } else {
            final GroupApi groupApi = (GroupApi) Services.b("FeatureGroup", GroupApi.class);
            HandlerExecutor.c(new Runnable() { // from class: syn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1687x614152d8(groupActivity, groupApi);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$showGroupActivityDialog$12$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1687x614152d8(GroupActivityBo groupActivityBo, GroupApi groupApi) {
        HashMap<Integer, Integer> map = GROUP_TYPE_TO_SPORT_TYPE;
        if (map.get(Integer.valueOf(groupActivityBo.getActivityType())).intValue() == getSportType()) {
            showPositionEnableDialog(groupApi, groupActivityBo);
        } else if (map.containsValue(Integer.valueOf(getSportType()))) {
            showJumpGroupDetailDialog(groupActivityBo);
        } else {
            gotoStartSport();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoStartSport() {
        StorageParams storageParams = new StorageParams();
        String string = Integer.toString(20002);
        String strE = SharedPreferenceManager.e(this.mContext, string, "map_tracking_sport_type_sportting");
        ReleaseLogUtil.d(this.TAG, "gotoStartSport typeStr = ", strE);
        if (!TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.d(this.TAG, "gotoStartSport mSportType = ", Integer.valueOf(getSportType()));
            SharedPreferenceManager.e(this.mContext, string, "map_tracking_sport_type_sportting", Integer.toString(getSportType()), storageParams);
            SharedPreferenceManager.e(this.mContext, string, "sport_target_type_sportting", Integer.toString(-1), storageParams);
        }
        if (isOpenFreeIndoorRunning(this.mContext)) {
            HashMap map = new HashMap(16);
            map.put("click", 1);
            lmf.d().c(this.mContext, AnalyticsValue.BI_TRACK_ENTER_RUNNING_WITH_VIBRATE_STEPCOUNT_1040050.value(), map, 0);
        }
        LocalBroadcastManager.getInstance().sendBroadcast(new Intent("track_receiver_go_to_sport"));
        ive.c().c(this.mContext, getSportType(), this.mTargetType, this.mTargetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeDialog(BaseDialog baseDialog) {
        if (baseDialog == null || !baseDialog.isShowing()) {
            return;
        }
        baseDialog.dismiss();
    }

    private boolean isOpenFreeIndoorRunning(Context context) {
        return context != null && "true".equals(SharedPreferenceManager.e(context, Integer.toString(20002), "ihealthlabs")) && LanguageUtil.l(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showStartSportIgnoreLinkDialog() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mContext);
        builder.b(R.string.IDS_hwh_motiontrack_ingnore_link_attention);
        builder.c(R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: syv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.m1693xdaa63d1a(view);
            }
        });
        builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: szb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportStatisticProvider.lambda$showStartSportIgnoreLinkDialog$15(view);
            }
        });
        builder.c().show();
    }

    /* JADX INFO: renamed from: lambda$showStartSportIgnoreLinkDialog$14$com-huawei-ui-homehealth-runcard-trackfragments-SportStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1693xdaa63d1a(View view) {
        LogUtil.a(this.TAG, "ignore link and continue");
        jem.c(true);
        showGroupActivityDialog();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return this.TAG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHealthData(HiHealthData hiHealthData) {
        if (hiHealthData != null) {
            this.mHealthData = hiHealthData.copyData();
        }
        String strB = dex.b(String.valueOf(getSportType()));
        double dA = !TextUtils.isEmpty(strB) ? CommonUtils.a(strB) : 0.0d;
        double hiHealthDataDistance = getHiHealthDataDistance(this.mHealthData);
        boolean z = tfi.e(this.mContext) == 0 && jaa.f(BaseApplication.getContext());
        boolean z2 = Boolean.parseBoolean(dex.b(MUSIC_TAG));
        LogUtil.a(this.TAG, "old data is ", strB, " new data is ", Double.valueOf(hiHealthDataDistance), " supportMusic = ", Boolean.valueOf(z), " cacheSupport = ", Boolean.valueOf(z2));
        if (dA == hiHealthDataDistance && z == z2) {
            LogUtil.a(this.TAG, "same data, do not refresh");
            return;
        }
        requestImageMusicAsync(z);
        this.mSectionBean.c(this.mHealthData);
        if (this.mHealthData != null) {
            dex.a(String.valueOf(getSportType()), String.valueOf(hiHealthDataDistance));
            dex.a(MUSIC_TAG, String.valueOf(z));
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<SportStatisticProvider> f25949c;

        b(SportStatisticProvider sportStatisticProvider) {
            this.f25949c = new WeakReference<>(sportStatisticProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            this.f25949c.get();
            SportStatisticProvider sportStatisticProvider = this.f25949c.get();
            if (sportStatisticProvider == null) {
                return;
            }
            if (!LoginInit.getInstance(null).getIsLogined()) {
                sportStatisticProvider.updateHealthData(new HiHealthData());
                return;
            }
            if (!(obj instanceof SparseArray)) {
                if (njy.b(obj, HiHealthData.class)) {
                    List list = (List) obj;
                    if (njy.b(list)) {
                        sportStatisticProvider.updateHealthData((HiHealthData) list.get(0));
                    } else {
                        sportStatisticProvider.updateHealthData(new HiHealthData());
                    }
                    LogUtil.a(sportStatisticProvider.getTag(), list);
                    return;
                }
                LogUtil.a(sportStatisticProvider.getTag(), "wrong data : ", Integer.valueOf(i));
                return;
            }
            try {
                List list2 = (List) ((SparseArray) obj).get(0);
                if (njy.b(list2)) {
                    sportStatisticProvider.updateHealthData((HiHealthData) list2.get(0));
                } else {
                    sportStatisticProvider.updateHealthData(new HiHealthData());
                }
                LogUtil.a(sportStatisticProvider.getTag(), list2);
            } catch (ClassCastException e) {
                LogUtil.j(sportStatisticProvider.getTag(), e.getMessage());
            }
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<SportStatisticProvider> f25951a;

        e(SportStatisticProvider sportStatisticProvider) {
            this.f25951a = new WeakReference<>(sportStatisticProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 100000 || obj == null) {
                return;
            }
            OperatorStatus operatorStatus = (OperatorStatus) new Gson().fromJson(CommonUtil.ac((String) obj), OperatorStatus.class);
            SportStatisticProvider sportStatisticProvider = this.f25951a.get();
            if (sportStatisticProvider == null || sportStatisticProvider.mStartSportHandler == null) {
                return;
            }
            Handler handler = sportStatisticProvider.mStartSportHandler;
            handler.removeMessages(1);
            if (operatorStatus.getTrainMonitorState() == 0) {
                ReleaseLogUtil.d(sportStatisticProvider.getTag(), "device is not running");
                handler.sendMessage(handler.obtainMessage(1));
            } else {
                ReleaseLogUtil.d(sportStatisticProvider.getTag(), "MSG_SHOW_DIALOG");
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    public final Context getContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    public void setInitData(Context context, HashMap<String, Object> map, Object obj, boolean z, Integer num, String str) {
        String strE;
        if (obj instanceof HiHealthData) {
            if (z) {
                map.put("SECTION_STYLE", BaseSection.OUTDOOR_RUN_STYLE);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(R.drawable.ic_sport_tab_bg_map));
                arrayList.add(Integer.valueOf(R.drawable.ic_sport_tab_bg_map_ws));
                map.put("BACKGROUND", arrayList);
                map.put("MARKER", Integer.valueOf(R.drawable.ic_sport_tab_loction_new));
                jbq jbqVarD = iws.d("SportAdStartSportIconOutdoor");
                if (jbqVarD == null || !jbqVarD.d()) {
                    strE = "";
                } else if (TextUtils.isEmpty(jbqVarD.e())) {
                    LogUtil.a(this.TAG, "initStartSportIcon() SportAd indoor imageUrl is null or empty");
                    strE = "";
                } else {
                    LogUtil.a(this.TAG, "initStartSportIcon() SportAd show outdoor run icon");
                    strE = jbqVarD.e();
                    ResourceBriefInfo resourceBriefInfoE = iws.e(14001);
                    this.mIndoorResourceBriefInfo = resourceBriefInfoE;
                    MarketingBiUtils.e(14001, resourceBriefInfoE);
                }
            } else {
                map.put("SECTION_STYLE", BaseSection.INDOOR_RUN_STYLE);
                ArrayList arrayList2 = new ArrayList();
                if (CommonUtil.j(LoginInit.getInstance(context).getAccountInfo(1009)) == 7) {
                    arrayList2.add(Integer.valueOf(R.drawable.track_entrance_indoor_setting_eu_bg));
                    arrayList2.add(Integer.valueOf(R.drawable.track_entrance_indoor_setting_eu_bg_bigcd));
                } else {
                    arrayList2.add(Integer.valueOf(R.drawable.track_entrance_indoor_setting_bg));
                    arrayList2.add(Integer.valueOf(R.drawable.track_entrance_indoor_setting_bg_bigcd));
                }
                map.put("BACKGROUND", arrayList2);
                jbq jbqVarD2 = iws.d("SportAdStartSportIconIndoor");
                if (jbqVarD2 == null || !jbqVarD2.d()) {
                    strE = "";
                } else if (TextUtils.isEmpty(jbqVarD2.e())) {
                    LogUtil.a(this.TAG, "initStartSportIcon() SportAd indoor imageUrl is null or empty");
                    strE = "";
                } else {
                    LogUtil.a(this.TAG, "initStartSportIcon() SportAd show indoor run icon");
                    strE = jbqVarD2.e();
                    ResourceBriefInfo resourceBriefInfoE2 = iws.e(14002);
                    this.mIndoorResourceBriefInfo = resourceBriefInfoE2;
                    MarketingBiUtils.e(14002, resourceBriefInfoE2);
                }
            }
            map.put("ACCUMULATED_DURATION_TEXT", this.mContext.getResources().getString(R.string.IDS_track_total_run, this.mIsShowImperial ? this.mContext.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en) : this.mContext.getResources().getString(R.string.IDS_hw_health_show_distance_unit)));
            if (LoginInit.getInstance(context).getIsLogined()) {
                map.put("IS_GOAL_BUTTON_SHOW", true);
            }
            map.put("GOAL_BUTTON", context.getResources().getString(R.string.IDS_hwh_motiontrack_set_target));
            LogUtil.e(this.TAG, "imageURl  " + strE);
            if ("".equals(strE)) {
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(num);
                arrayList3.add(num);
                map.put("MIDDLE_IMAGEVIEW", arrayList3);
            } else {
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add(strE);
                map.put("MIDDLE_IMAGEVIEW", arrayList4);
            }
            map.put("MIDDLE_IMAGEVIEW_DESC", qre.f(R.string.IDS_main_time_line_start_workout));
            ArrayList arrayList5 = new ArrayList(4);
            arrayList5.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
            arrayList5.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
            arrayList5.add(Integer.valueOf(R.drawable.ic_sport_entrance_warmup));
            arrayList5.add(Integer.valueOf(R.string.IDS_hwh_motiontrack_warm_up));
            if (!Utils.o()) {
                map.put("LEFT_IMAGEVIEW", arrayList5);
            }
            if (!TextUtils.isEmpty(this.mAdvertisementTextTitle)) {
                map.put("ADVERTISEMENT_TEXT", this.mAdvertisementTextTitle);
                ReleaseLogUtil.d(this.TAG, "setInitData mAdvertisementTextTitle  ", this.mAdvertisementTextTitle);
            }
            LogUtil.a(str, map.toString());
        }
    }

    public static double getDataDistance(HiHealthData hiHealthData) {
        return hiHealthData.getDouble("Track_Run_Distance_Sum");
    }

    protected List<Integer> getWarmUpIcon() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_sport_entrance_warmup));
        arrayList.add(Integer.valueOf(R.string.IDS_hwh_motiontrack_warm_up));
        return arrayList;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDataLite(Context context) {
        LogUtil.a(this.TAG, "loadDataLite refresh start");
        if (njy.b(ivo.a().e(true))) {
            refreshBoltImageIcon();
        }
        LogUtil.a(this.TAG, "loadDataLite refresh end");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ivo.a().a(this.TAG);
        unregisterHiHealthDataBroadcast();
    }
}
