package com.huawei.ui.main.stories.nps.interactors;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.activity.DialogActivityUtils;
import com.huawei.ui.main.stories.nps.activity.NpsDialogActivity;
import com.huawei.ui.main.stories.nps.activity.QuestionMainActivity;
import com.huawei.ui.main.stories.nps.harid.HagridNpsManager;
import com.huawei.ui.main.stories.nps.interactors.cache.QuestionCache;
import com.huawei.ui.main.stories.nps.interactors.db.QuestionSurveyDataBase;
import com.huawei.ui.main.stories.nps.interactors.db.QuestionSurveyTable;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionDestSiteResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSureyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyCommitParam;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyDetailResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.Url;
import com.huawei.ui.main.stories.nps.interactors.mode.WebSurveyDetailResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.WebSurveyRequestParam;
import com.huawei.ui.main.stories.nps.interactors.util.DeviceNpsSampleEventUtil;
import com.huawei.ui.main.stories.nps.interactors.util.EcologyNpsUtil;
import com.huawei.ui.main.stories.nps.interactors.util.SampleEventCallback;
import com.huawei.ui.main.stories.nps.interactors.util.TaskUtils;
import defpackage.cpl;
import defpackage.cql;
import defpackage.dmp;
import defpackage.dru;
import defpackage.dxm;
import defpackage.ecu;
import defpackage.eei;
import defpackage.eel;
import defpackage.elh;
import defpackage.lmf;
import defpackage.lon;
import defpackage.lrw;
import defpackage.ltb;
import defpackage.mgg;
import defpackage.mgi;
import defpackage.njy;
import defpackage.nva;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.DataBaseHelper;
import health.compact.a.GRSManager;
import health.compact.a.HwEncryptUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class HwNpsManager extends HwBaseManager {
    private static final String APP_CHANNEL_CODE = "APP";
    private static final String APP_ID_DEFAULT = "3";
    private static final String BRAND_DEFAULT = "Huawei";
    private static final String CHANNEL = "&channel=100001";
    private static final String CHANNEL_DEFAULT = "16";
    private static final String CHANNEL_VERSION = "100001";
    private static final String COMMA = ",";
    private static final int COUNTRY_LIST_INDEX_ZERO = 0;
    private static final long DAY = 86400000;
    private static final int DB_VERSION_102 = 102;
    private static final String DEVICE_NAME = "deviceName";
    private static final String DEVICE_NAME_K1 = "K1";
    private static final String DEVICE_NAME_K2 = "K2";
    private static final String ECOLOGY_NPS_TRUE = "true";
    private static final String ENCODING = "UTF-8";
    private static final String EQUAL_SIGN = "=";
    private static final int ERROR_CODE = 305003;
    private static final long FIFTEEN_DAYS = 1296000000;
    private static final String FIRMWARE = "firmware";
    private static final String HOME = "home";
    public static final String KEY_ECOLOGY_DEVICE_UUID = "nps_ecology_device_uuid";
    public static final String KEY_ECOLOGY_MODEL = "ecology_model";
    public static final String KEY_ECOLOGY_NPS_ID = "ecology_nps_id";
    public static final String KEY_ECOLOGY_NPS_REQUEST = "nps_ecology_request";
    public static final String KEY_NPS_LAST_TIME = "nps_last_time";
    public static final String KEY_NPS_SHOW = "KEY_NPS_SHOW";
    public static final String KEY_ONE_NPS_RETRY = "wear_nps_retry";
    public static final String KEY_WEAR_FIRMWARE = "wear_nps_firmware";
    public static final String KEY_WEAR_MODEL = "wear_nps_model";
    public static final String KEY_WEAR_NAME = "wear_nps_name";
    public static final String KEY_WEAR_SN = "wear_nps_sn";
    public static final String KEY_WEAR_UUID = "wear_nps_uuid";
    private static final String LEFT_SLASH = "/";
    public static final String MESSAGE_NPS_ID = "MESSAGE_NPSID";
    private static final int MILLISECONDS = 1000;
    private static final String MNP_SHOW_TIME = "MNP_SHOW_TIME";
    private static final String MOBILE_COUNTRY_CODE_CHINA = "460";
    private static final String NOT_IN_DATABASE_BI = "1";
    private static final String NOT_SUPPORT_NAME = "W1";
    public static final String NPS_ECOLOGY_QUESTION_CONTENT_KEY = "nps_ecology_question_content_info";
    private static final String NPS_ID_DEFAULT = "3";
    private static final String NPS_PART_URL = "ccpc-cn.consumer";
    private static final String NPS_QUESTION_CONTENT_KEY = "nps_question_content_info";
    private static final String NPS_SERVER_ERROR_BI = "4";
    private static final String NPS_SERVER_QUESTION_EXIST_BI = "3";
    private static final String NPS_SERVER_REQUEST_BI = "1";
    private static final String NPS_SERVER_RESPONSE_BI = "2";
    private static final String NPS_SURVEY_IDS = "1591839460740, b51c89db-8816-11e7-b0e5-fa163ec7a185";
    private static final String NPS_SURVEY_NUMBER_OF_TIMES_BI = "time";
    private static final String NPS_SURVEY_TYPE = "1";
    private static final String NPS_TEST_PART_URL = "ccpc.test";
    private static final String NPS_TRIGGER_BROADCASE_BI = "1";
    public static final String NPS_TRIGGER_CONDITIONAL_ERROR_BI = "5";
    private static final String NPS_TRIGGER_CONDITIONAL_PASS_BI = "4";
    private static final String NPS_TRIGGER_DEVICE_EXIST_DB_BI = "3";
    private static final String NPS_TRIGGER_DEVICE_RIGHT_BI = "2";
    private static final String NPS_TRIGGER_ERROR_DEVICE_UNCONNECT = "disconnectErr";
    private static final String NPS_TRIGGER_ERROR_FIRMWARE = "firmwareErr";
    private static final String NPS_TRIGGER_ERROR_IS_SUBMIT = "mIsGoSubmitSurveyState";
    private static final String NPS_TRIGGER_ERROR_MAC = "macErr";
    public static final String NPS_TRIGGER_ERROR_QUESTION_TABLE = "questionSurveyTableErr";
    private static final String NPS_TRIGGER_ERROR_WEAR_NAME = "wearNameErr";
    private static final String NPS_TRIGGER_REPONSE_DEST_SITE_BI = "7";
    private static final String NPS_TRIGGER_REQUEST_DEST_SITE_BI = "6";
    private static final String NPS_URL = "/ccpcmd/services/dispatch";
    private static final String NSS_SURVEY_TYPE = "2";
    private static final String OS = "os";
    private static final int QUESTION_ID_DEFAULT = -1;
    private static final String QUESTION_MARK = "?";
    private static final String QUESTION_SURVEY_ID_DEFAULT = "-1";
    private static final int QUESTION_SURVEY_TABLE_ID_DEFAULT = 0;
    private static final int QUESTION_SURVEY_TABLE_TIME_DEFAULT = 0;
    private static final int REQUEST_TIME_DEFAULT = -1;
    private static final int REQUEST_TIME_ZERO = 0;
    private static final int RESPONSE_CODE = 0;
    private static final String SAVE_DATABASE_BI = "2";
    private static final String SGW_APP_ID = "E0686CFBA30672BB267D4A66CE99AF15";
    private static final String SITE_EN_GB = "en_GB";
    private static final String SITE_ZH_CN = "zh_CN";
    private static final String SN = "sn";
    private static final int SN_TYPE = 1;
    private static final long SPAN_DAY_SECOND_NINETY = 7776000;
    private static final long SPAN_DAY_SECOND_ONE = 86400;
    private static final long SPAN_DAY_SECOND_ONE_HUNDRED_EIGHTY = 15552000;
    private static final long SPAN_DAY_SECOND_SEVEN_DAY = 604800;
    private static final long SPAN_DAY_SECOND_SIXTY = 5184000;
    private static final long SPAN_DAY_SECOND_TEN = 864000;
    private static final long SPAN_DAY_SECOND_THIRTY = 2592000;
    private static final long SPAN_DAY_SECOND_TWO_HUNDRED_TEN = 18144000;
    private static final long SPAN_SECONDS_ENTER_TIME = 60000;
    private static final long SPAN_SECONDS_UPDATE_TIME = 30;
    private static final long SPAN_TRIGGER_BROADCAST_TIME = 3;
    private static final int SUCCESS = 0;
    private static final String SURVEY_ID = "0";
    private static final String SURVEY_ID_DEFAULT = "0";
    private static final String TAG = "HwNpsManager";
    private static final String TAG_RELEASE = "Nps_HwNpsManager";
    private static final String TIMES_DEFAULT = "1";
    private static final int TIME_ONE = 1;
    private static final int TIME_RETRY_MAX = 2;
    private static final int TIME_TWO = 2;
    private static final int TIME_ZERO = 0;
    private static final int TWO_TIMES = 2;
    private static final byte TYPE_ACTIVATION_TIME = 2;
    private static final byte TYPE_ODID = 1;
    private static final String VERSION = "cVer";
    private static final String VERSION_NEW_CONTENT = "100101620";
    private static final String VERSION_NSS_NEW_CONTENT = "100101621";
    private static final String VERSION_OLD_CONTENT = "21319";
    private static final String WEB_CHANNEL = "&channel=16";
    private static final String WEB_SUCCESS_CODE = "200";
    private static HwNpsManager sHwNpsManager;
    private String mCertModel;
    private final Context mContext;
    private String mCountryCode;
    private long mCurrentRequestTime;
    private final Type mDestSiteType;
    private QuestionSurveyDetailResponse mDetailResponse;
    private String mDeviceMac;
    private String mDeviceName;
    private boolean mEcologyNpsRequest;
    private volatile int mEcologyRequestTime;
    private long mEnterTime;
    private ExecutorService mExecutorService;
    private String mFirmware;
    private HwNpsCallback mHwNpsCallback;
    private boolean mIsGoSubmitSurveyState;
    private String mLanguage;
    private MessageCenterApi mMessageCenterApi;
    private String mModel;
    private String mOs;
    private int mQuestionId;
    private List<QuestionSureyResponse> mQuestionList;
    private QuestionSurveyDataBase mQuestionSurveyDateBase;
    private String mQuestionSurveyId;
    private QuestionSurveyTable mQuestionSurveyTable;
    private int mRequestTime;
    private String mSn;
    private String mSubmitAnswers;
    private long mTriggerActivatedTime;
    private final Type mType;
    private String mUuid;
    private WebSurveyDetailResponse mWebSurveyResponse;
    private final Type mWebSurveyType;
    private static final Object LOCK = new Object();
    private static final Object ENTER_LOCK = new Object();

    private HwNpsManager(Context context) {
        super(context);
        this.mType = new TypeToken<QuestionSurveyDetailResponse>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.1
        }.getType();
        this.mDestSiteType = new TypeToken<QuestionDestSiteResponse>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.2
        }.getType();
        this.mWebSurveyType = new TypeToken<WebSurveyDetailResponse>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.3
        }.getType();
        this.mQuestionSurveyTable = null;
        this.mDeviceMac = "";
        this.mQuestionSurveyId = "0";
        this.mQuestionId = -1;
        this.mRequestTime = -1;
        this.mEcologyRequestTime = -1;
        this.mIsGoSubmitSurveyState = false;
        this.mEcologyNpsRequest = false;
        this.mSubmitAnswers = "";
        this.mHwNpsCallback = null;
        this.mCurrentRequestTime = 0L;
        this.mEnterTime = 0L;
        this.mTriggerActivatedTime = 0L;
        this.mContext = BaseApplication.getContext();
        ReleaseLogUtil.d(TAG_RELEASE, "HwNpsManager nps 0");
        this.mMessageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        this.mIsGoSubmitSurveyState = false;
        this.mRequestTime = -1;
        this.mQuestionSurveyId = "-1";
        initQuestionSurveyDb();
    }

    public static HwNpsManager getInstance() {
        HwNpsManager hwNpsManager;
        synchronized (LOCK) {
            if (sHwNpsManager == null) {
                sHwNpsManager = new HwNpsManager(BaseApplication.getContext());
            }
            hwNpsManager = sHwNpsManager;
        }
        return hwNpsManager;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10004;
    }

    private void initQuestionSurveyDb() {
        if (this.mExecutorService == null) {
            this.mExecutorService = Executors.newSingleThreadExecutor();
        }
        this.mQuestionSurveyDateBase = new QuestionSurveyDataBase();
        int iC = DataBaseHelper.d(String.valueOf(getModuleId())).c();
        LogUtil.a(TAG, "nps initQuestionSurveyDb newDbVersion:", 112, ", oldDbVersion:", Integer.valueOf(iC));
        if (112 > iC && iC > 0 && iC <= 102) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps initQuestionSurveyDb upgradeQstnSurveyDB");
            this.mExecutorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.4
                @Override // java.lang.Runnable
                public void run() {
                    QuestionSurveyDataBase questionSurveyDataBase = HwNpsManager.this.mQuestionSurveyDateBase;
                    HwNpsManager hwNpsManager = HwNpsManager.this;
                    questionSurveyDataBase.upgradeQuestionSurveyDateBase(hwNpsManager, 10004, hwNpsManager.mContext);
                }
            });
        } else {
            LogUtil.a(TAG, "nps initQuestionSurveyDb createDBTable");
            this.mExecutorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.5
                @Override // java.lang.Runnable
                public void run() {
                    HwNpsManager.this.mQuestionSurveyDateBase.createDateBaseTable(HwNpsManager.this);
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "nps initQuestionSurveyDb createDBTable thread finish");
                }
            });
            ReleaseLogUtil.d(TAG_RELEASE, "nps initQuestionSurveyDb createDBTable finish");
        }
    }

    public void activatedQuestionSurvey(Boolean bool) {
        synchronized (ENTER_LOCK) {
            long jAbs = Math.abs(new Date().getTime() - this.mEnterTime);
            LogUtil.a(TAG, "nps Enter activatedQuestionSurvey, spanEnterTime:", Long.valueOf(jAbs));
            if (jAbs < 60000) {
                return;
            }
            this.mEnterTime = new Date().getTime();
            setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "1", "");
            if (this.mIsGoSubmitSurveyState) {
                setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "5", NPS_TRIGGER_ERROR_IS_SUBMIT);
                ReleaseLogUtil.e(TAG_RELEASE, "nps activatedQuestionSurvey now submitSurvey return!");
                return;
            }
            if (isDeviceInfoRight()) {
                setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "2", "");
                String deviceId = getDeviceId(lrw.j());
                this.mDeviceMac = deviceId;
                this.mQuestionId = -1;
                this.mQuestionSurveyId = "-1";
                if (isDeviceIdInDb(deviceId)) {
                    setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "3", "");
                    ReleaseLogUtil.d(TAG_RELEASE, "nps activatedQuestionSurvey isDeviceIdInDb");
                    this.mQuestionSurveyTable = getSurveyTableByDevice(this.mDeviceMac);
                    QuestionSurveyTable surveyTableByDevice = getSurveyTableByDevice(this.mDeviceMac);
                    if (surveyTableByDevice == null) {
                        setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "5", NPS_TRIGGER_ERROR_QUESTION_TABLE);
                        ReleaseLogUtil.e(TAG_RELEASE, "nps activatedQuestionSurvey mQuestionSurveyTable is null");
                        return;
                    }
                    ReleaseLogUtil.d(TAG_RELEASE, "nps mQuestionSurveyTable times:", surveyTableByDevice.toString());
                    if (surveyTableByDevice.getTimes() == 1) {
                        int iC = SharedPreferenceManager.c(String.valueOf(10004), KEY_ONE_NPS_RETRY + this.mDeviceMac, 0);
                        if (isConnected() && !HagridNpsManager.getInstance().isWeightDeviceNps() && !bool.booleanValue() && iC < 2) {
                            subQuestionSurveyTableTime();
                            this.mRequestTime = surveyTableByDevice.getTimes();
                            startRequestDeviceNps(false);
                            SharedPreferenceManager.d(String.valueOf(10004), KEY_ONE_NPS_RETRY + this.mDeviceMac, iC + 1);
                            ReleaseLogUtil.d(TAG_RELEASE, "retry NPS,mRequestTime:", Integer.valueOf(this.mRequestTime), " retryNum:", Integer.valueOf(iC));
                            return;
                        }
                    }
                    int times = surveyTableByDevice.getTimes() + 1;
                    this.mRequestTime = times;
                    if (times <= 2 && isJudgeGetSurveyTimeArrive(times, surveyTableByDevice)) {
                        startRequestDeviceNps(bool);
                    }
                } else {
                    ReleaseLogUtil.d(TAG_RELEASE, "nps activatedQuestionSurvey not isDeviceIdInDb");
                    this.mEcologyNpsRequest = false;
                    this.mRequestTime = -1;
                    setBiNpsEvent(AnalyticsValue.NPS_SAVE_DATABASE.value(), "1", "");
                    if (bool.booleanValue() && !this.mEcologyNpsRequest) {
                        requestDeviceNpsInfo();
                    } else {
                        requestGetDestSite();
                    }
                }
                ReleaseLogUtil.d(TAG_RELEASE, "nps Leave activatedQuestionSurvey");
            }
        }
    }

    public boolean isTimeOfNps() {
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(11);
        ReleaseLogUtil.d(TAG_RELEASE, "indexHour: ", Integer.valueOf(i));
        return i >= 9 && i < 23;
    }

    private boolean isDeviceInfoRight() {
        LogUtil.a(TAG, "nps Enter activatedQuestionSurvey wearname：", lrw.g());
        if (TextUtils.isEmpty(lrw.g()) || NOT_SUPPORT_NAME.equals(lrw.g())) {
            setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "5", NPS_TRIGGER_ERROR_WEAR_NAME);
            ReleaseLogUtil.e(TAG_RELEASE, "nps activatedQuestionSurvey DeviceNpsInfoCache.getHuaWeiWearName is not support return");
            return false;
        }
        if (TextUtils.isEmpty(lrw.f())) {
            setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "5", NPS_TRIGGER_ERROR_FIRMWARE);
            ReleaseLogUtil.e(TAG_RELEASE, "nps activatedQuestionSurvey firmware sysVersion is null return");
            return false;
        }
        if (!TextUtils.isEmpty(lrw.j())) {
            return true;
        }
        setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "5", NPS_TRIGGER_ERROR_MAC);
        ReleaseLogUtil.e(TAG_RELEASE, "nps activatedQuestionSurvey mac is null return");
        return false;
    }

    private void startRequestDeviceNps(Boolean bool) {
        long jAbs = Math.abs(new Date().getTime() - this.mTriggerActivatedTime) / 1000;
        ReleaseLogUtil.d(TAG_RELEASE, "nps span time is :", Long.valueOf(jAbs));
        if (jAbs < 3) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps trigger span time is too short");
            return;
        }
        this.mTriggerActivatedTime = new Date().getTime();
        setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "4", "");
        this.mEcologyNpsRequest = false;
        ReleaseLogUtil.d(TAG_RELEASE, "nps open Select question");
        if (bool.booleanValue() && !this.mEcologyNpsRequest) {
            requestDeviceNpsInfo();
        } else {
            requestGetDestSite();
        }
    }

    private boolean isDeviceIdInDb(String str) {
        return new QuestionSurveyDataBase().isDeviceIdInDateBaseTable(this, str);
    }

    public QuestionSurveyTable getSurveyTableByDevice(String str) {
        QuestionSurveyTable questionSurveyTableSelectSurveyTableByDeviceId;
        LogUtil.a(TAG, "nps Enter getSurveyTableByDevice");
        QuestionSurveyDataBase questionSurveyDataBase = this.mQuestionSurveyDateBase;
        if (questionSurveyDataBase != null) {
            questionSurveyTableSelectSurveyTableByDeviceId = questionSurveyDataBase.selectSurveyTableByDeviceId(this, str);
        } else {
            ReleaseLogUtil.e(TAG_RELEASE, "nps getSurveyTableByDevice enter else null");
            questionSurveyTableSelectSurveyTableByDeviceId = null;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave getSurveyTableByDevice");
        return questionSurveyTableSelectSurveyTableByDeviceId;
    }

    private boolean isJudgeGetSurveyTimeArrive(int i, QuestionSurveyTable questionSurveyTable) {
        boolean zIsTimeDayThanNinety;
        LogUtil.a(TAG, "nps Enter isJudgeGetSurveyTimeArrive");
        if (i < 0 || i > 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps isJudgeGetSurveyTimeArrive GetSurvey times is off limits!");
            return false;
        }
        if (questionSurveyTable == null) {
            return false;
        }
        LogUtil.a(TAG, "nps isJudgeGetSurveyTimeArrive GetSurvey times:", Integer.valueOf(i));
        long jCurrentTimeMillis = (System.currentTimeMillis() - questionSurveyTable.getLastSurveyTime()) / 1000;
        if (i == 0 && jCurrentTimeMillis > SPAN_DAY_SECOND_TEN) {
            this.mRequestTime++;
            setQuestionSurveyTable(questionSurveyTable.getLastSurveyTime());
            this.mCurrentRequestTime = 0L;
            i = 1;
        }
        if (i == 0 || i == 1) {
            zIsTimeDayThanNinety = isTimeDayCompare(questionSurveyTable.getLastSurveyTime(), i, questionSurveyTable);
        } else {
            zIsTimeDayThanNinety = isTimeDayThanNinety(questionSurveyTable.getLastSurveyTime());
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave isJudgeGetSurveyTimeArrive");
        return zIsTimeDayThanNinety;
    }

    private boolean isTimeDayCompare(long j, int i, QuestionSurveyTable questionSurveyTable) {
        boolean z;
        ReleaseLogUtil.d(TAG_RELEASE, "NPS enter isTimeDayCompare days currentTimeMillis:", Long.valueOf(System.currentTimeMillis()), "lastSurveyTime:", Long.valueOf(j));
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        long interval = getInterval(i);
        LogUtil.a(TAG, "NPS isTimeDayCompare spanTimeSecond:", Long.valueOf(jCurrentTimeMillis), "spanDaySecond:", Long.valueOf(interval));
        if (jCurrentTimeMillis > interval) {
            DeviceInfo device = getDevice();
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("isTimeDayCompare30", "lastSurveyTime " + j + ", now " + System.currentTimeMillis() + ", " + questionSurveyTable.toString() + ", deviceName " + device.getDeviceName() + ", deviceModel " + device.getDeviceModel());
            z = true;
        } else {
            z = false;
        }
        LogUtil.a(TAG, "NPS leave isTimeDayCompare isThan:", Boolean.valueOf(z));
        return z;
    }

    private DeviceInfo getDevice() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, TAG);
        return !njy.e(deviceList) ? deviceList.get(0) : new DeviceInfo();
    }

    public boolean isTimeDayThanNinety(long j) {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter isTimeDayThanNinety currentTimeMillis:", Long.valueOf(System.currentTimeMillis()), "lastSurveyTime:", Long.valueOf(j));
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        long interval = getInterval(2);
        LogUtil.a(TAG, "nps isTimeDayThanNinety spanTimeSecond:", Long.valueOf(jCurrentTimeMillis), ",spanNinetyDaySecond:", Long.valueOf(interval));
        boolean z = jCurrentTimeMillis > interval;
        LogUtil.a(TAG, "nps Leave isTimeDayThanNinety isThan:", Boolean.valueOf(z));
        return z;
    }

    private long getInterval(int i) {
        boolean z = isConnected() && !HagridNpsManager.getInstance().isWeightDeviceNps();
        if (i == 0) {
            return 86400L;
        }
        if (i == 1) {
            return SPAN_DAY_SECOND_THIRTY;
        }
        return z ? SPAN_DAY_SECOND_ONE_HUNDRED_EIGHTY : SPAN_DAY_SECOND_NINETY;
    }

    private void requestGetDestSite() {
        LogUtil.a(TAG, "nps Enter requestGetDestSite");
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        final HashMap map = new HashMap(16);
        map.put("countryCode", commonCountryCode);
        LogUtil.a(TAG, "requestGetDestSite getDestSite map:", map.toString());
        if (CommonUtil.ab(this.mContext)) {
            if (this.mExecutorService == null) {
                this.mExecutorService = Executors.newSingleThreadExecutor();
            }
            this.mExecutorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.6
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainCcpcConsumerHuawei");
                    DeviceInfo deviceInfoD = mgg.d(HwNpsManager.TAG);
                    boolean newHonorScale = HwNpsManager.this.getNewHonorScale();
                    if (eei.d(deviceInfoD) || newHonorScale) {
                        String str2 = (String) map.get("countryCode");
                        String strD = lon.c().d("domain_honor_nps");
                        if (TextUtils.isEmpty(strD) || !HwNpsManager.this.isHonorCountry(str2)) {
                            LogUtil.j(HwNpsManager.TAG, "Honor only supports Chinese mainland");
                            return;
                        } else {
                            str = Url.QUESTION_HONOR_URL;
                            url = strD;
                        }
                    } else {
                        str = Url.QUESTION_GET_DESTSITE_URL;
                    }
                    lrw.a(GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    if (CompileParameterUtil.d("IS_TEST_VERSION") && url.contains(HwNpsManager.NPS_PART_URL)) {
                        url = url.replace(HwNpsManager.NPS_PART_URL, HwNpsManager.NPS_TEST_PART_URL);
                    }
                    LogUtil.a(HwNpsManager.TAG, "requestGetDestSite getDestSite npsurl:", url);
                    HwNpsManager.this.setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "6", "");
                    HwNpsManager.this.executeDestSiteRequest(url + HwNpsManager.NPS_URL + str, map);
                }
            });
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave requestGetDestSite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getNewHonorScale() {
        if (isConnected()) {
            return false;
        }
        String strN = lrw.n();
        boolean zG = nva.g(this.mContext, strN);
        LogUtil.j(TAG, "Honor code: ", CommonUtil.n(strN), " isNewHonorScale: ", Boolean.valueOf(zG));
        return zG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHonorCountry(String str) {
        String strD = lon.c().d("domain_honor_country");
        LogUtil.a(TAG, "honorCountrysString: ", strD);
        if (strD == null) {
            return false;
        }
        if ("ALL".equalsIgnoreCase(strD)) {
            return true;
        }
        for (String str2 : strD.split(",")) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void insertDeviceToDb() {
        LogUtil.a(TAG, "nps Enter insertDeviceToDb");
        QuestionSurveyTable questionSurveyTable = new QuestionSurveyTable();
        questionSurveyTable.setDeviceId(this.mDeviceMac);
        questionSurveyTable.setLastSurveyTime(new Date().getTime());
        questionSurveyTable.setDeviceType(lrw.g());
        questionSurveyTable.setTimes(-1);
        questionSurveyTable.setId(0);
        questionSurveyTable.setSurveyId("0");
        LogUtil.a(TAG, "nps insertDeviceToDb questionSurveyTable:", questionSurveyTable.toString());
        this.mQuestionSurveyDateBase.insertDateBaseTable(this, questionSurveyTable);
        setBiNpsEvent(AnalyticsValue.NPS_SAVE_DATABASE.value(), "2", "");
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave insertDeviceToDb");
    }

    private void insertDeviceToDb(dru druVar) {
        LogUtil.a(TAG, "ecology device nps,Enter insertDeviceToDb");
        String asString = druVar.d().getAsString("uniqueId");
        String asString2 = druVar.d().getAsString("name");
        QuestionSurveyTable questionSurveyTable = new QuestionSurveyTable();
        questionSurveyTable.setDeviceId(getDeviceId(asString));
        questionSurveyTable.setLastSurveyTime(druVar.c());
        questionSurveyTable.setDeviceType(asString2);
        questionSurveyTable.setTimes(0);
        questionSurveyTable.setId(0);
        questionSurveyTable.setSurveyId("0");
        LogUtil.a(TAG, "nps insertDeviceToDb questionSurveyTable:", questionSurveyTable.toString());
        this.mQuestionSurveyDateBase.insertDateBaseTable(this, questionSurveyTable);
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave insertDeviceToDb");
    }

    public void migrateToDb(QuestionSurveyTable questionSurveyTable) {
        LogUtil.a(TAG, "nps Enter migrateToDb");
        if (questionSurveyTable == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps Enter migrateToDb questionSurveyTable is null return");
        } else {
            LogUtil.a(TAG, "nps migrateToDb questionSurveyTable:", questionSurveyTable.toString());
            ReleaseLogUtil.d(TAG_RELEASE, "nps Leave migrateToDb count:", Long.valueOf(this.mQuestionSurveyDateBase.insertDateBaseTable(this, questionSurveyTable)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processGetDestSiteResponse(QuestionDestSiteResponse questionDestSiteResponse) {
        LogUtil.a(TAG, "nps Enter processGetDestSiteResponse requestTime:", Integer.valueOf(this.mRequestTime));
        if (questionDestSiteResponse != null && questionDestSiteResponse.getResCode() == 0) {
            if (this.mRequestTime >= 0 || (this.mEcologyNpsRequest && this.mEcologyRequestTime >= 0)) {
                ReleaseLogUtil.d(TAG_RELEASE, "nps processGetDestSiteResponse to get NPS question");
                processGetDestSiteResponsePart(questionDestSiteResponse.getCountryInfo());
            } else {
                LogUtil.a(TAG, "nps processGetDestSiteResponse activation success");
                insertDeviceToDb();
            }
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave processGetDestSiteResponse");
    }

    private void processGetDestSiteResponsePart(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0 || !(arrayList.get(0) instanceof QuestionDestSiteResponse.CountryInfo)) {
            return;
        }
        String serverAddress = ((QuestionDestSiteResponse.CountryInfo) arrayList.get(0)).getServerAddress();
        if (this.mEcologyNpsRequest) {
            loadNpsRequestData(serverAddress);
        } else {
            loadInitialData(serverAddress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDestSiteSubmitSurvey(QuestionDestSiteResponse questionDestSiteResponse) {
        ReleaseLogUtil.d(TAG_RELEASE, "nps getDestSiteSubmitSurvey");
        if (questionDestSiteResponse == null || questionDestSiteResponse.getResCode() != 0) {
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps getDestSiteSubmitSurvey to submit NPS question");
        ArrayList<QuestionDestSiteResponse.CountryInfo> countryInfo = questionDestSiteResponse.getCountryInfo();
        if (countryInfo == null || countryInfo.size() <= 0 || !(countryInfo.get(0) instanceof QuestionDestSiteResponse.CountryInfo)) {
            return;
        }
        String serverAddress = countryInfo.get(0).getServerAddress();
        getQuestionSurveyTable();
        String sharedPreference = getSharedPreference(KEY_ECOLOGY_NPS_REQUEST);
        if (!TextUtils.isEmpty(sharedPreference) && "true".equals(sharedPreference)) {
            submitEcologySurvey(serverAddress);
        } else {
            submitSurvey(serverAddress);
        }
    }

    private void submitSurvey(String str) {
        String str2;
        String str3;
        LogUtil.a(TAG, "nps Enter submitSurvey");
        getRequestInfo();
        this.mDeviceName = getSharedPreference(KEY_WEAR_NAME);
        this.mModel = getSharedPreference(KEY_WEAR_MODEL);
        String sharedPreference = getSharedPreference(KEY_WEAR_SN);
        if (!Objects.equals(sharedPreference, this.mSn)) {
            String strG = lrw.g();
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
            linkedHashMap.put("spSn", String.valueOf(TextUtils.isEmpty(sharedPreference)));
            linkedHashMap.put("cacheSn", String.valueOf(TextUtils.isEmpty(this.mSn)));
            linkedHashMap.put("spDeviceName", this.mDeviceName);
            linkedHashMap.put("cacheDeviceName", strG);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_WEAR_NPS_2129051.value(), linkedHashMap);
        }
        if (TextUtils.isEmpty(this.mSn)) {
            this.mSn = sharedPreference;
            this.mUuid = getSharedPreference(KEY_WEAR_UUID);
        }
        if (TextUtils.isEmpty(this.mFirmware)) {
            this.mFirmware = getSharedPreference(KEY_WEAR_FIRMWARE);
        }
        LogUtil.a(TAG, "submitSurvey mModel:", this.mModel, ", deviceModel:", lrw.h(), ", mDeviceName:", this.mDeviceName);
        lrw.j(this.mModel);
        HashMap map = new HashMap(16);
        putSurveyIdAndTimes(map);
        String str4 = this.mDeviceName;
        if (str4 == null) {
            str4 = "deviceName";
        }
        map.put("model", str4);
        map.put("firmware", TextUtils.isEmpty(this.mFirmware) ? "firmware" : this.mFirmware);
        map.put("language", this.mLanguage);
        String str5 = this.mOs;
        if (str5 == null) {
            str5 = "os";
        }
        map.put("os", str5);
        map.put("appID", "3");
        map.put("sn", this.mSn);
        map.put(QuestionSurveyCommitParam.ANSWERS, this.mSubmitAnswers);
        map.put("band", this.mModel);
        map.put("countryCode", this.mCountryCode);
        map.put("imeiEnc", this.mUuid);
        ReleaseLogUtil.d(TAG_RELEASE, "nps submitSurvey map");
        if (isConnected() && !HagridNpsManager.getInstance().isWeightDeviceNps()) {
            str2 = "?cVer=100101621";
        } else {
            str2 = "?cVer=21319";
        }
        if (str.endsWith("/")) {
            str3 = str + Url.QUESTION_SURVEY_ANSWER_URL + str2 + CHANNEL;
        } else {
            str3 = str + "/secured/CCPC/EN/ccpcnps/submitSurveyV2/1" + str2 + CHANNEL;
        }
        LogUtil.a(TAG, "nps submitSurvey requestNpsUrl:", str3, " ,request params: ", map.toString());
        if (CommonUtil.ab(this.mContext)) {
            executeSubmiteSurveyRequest(str3, map);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave submitSurvey");
    }

    public QuestionSurveyDetailResponse getDetailResponse() {
        QuestionSurveyDetailResponse questionSurveyDetailResponse = new QuestionSurveyDetailResponse();
        try {
            return (QuestionSurveyDetailResponse) new Gson().fromJson(getQuestionDetail(), this.mType);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "nps putQuestionsCache error:", e.toString());
            return questionSurveyDetailResponse;
        }
    }

    private void putSurveyIdAndTimes(Map<String, String> map) {
        String surveyId;
        String strValueOf;
        QuestionSurveyDetailResponse detailResponse = getDetailResponse();
        if (detailResponse != null && detailResponse.getResCode() == 0) {
            surveyId = detailResponse.getSurveyID();
            strValueOf = String.valueOf(detailResponse.getQueryTimes());
            ReleaseLogUtil.d(TAG_RELEASE, "nps putQuestionsCache SUCCESS surveyID:", surveyId, ", times:", strValueOf);
        } else {
            QuestionSurveyTable questionSurveyTable = this.mQuestionSurveyTable;
            if (questionSurveyTable != null) {
                surveyId = questionSurveyTable.getSurveyId();
                strValueOf = "" + this.mQuestionSurveyTable.getTimes();
                ReleaseLogUtil.d(TAG_RELEASE, "nps putQuestionsCache mQuestionSurveyTable surveyID:", surveyId, ", times:", strValueOf);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "nps putQuestionsCache mQuestionSurveyTable is null");
                surveyId = "0";
                strValueOf = "1";
            }
        }
        map.put(QuestionSurveyCommitParam.SURVEY_ID, surveyId);
        map.put("times", strValueOf);
    }

    private void submitEcologySurvey(String str) {
        String str2;
        LogUtil.a(TAG, "nps Enter submitEcologySurvey");
        HashMap map = new HashMap(16);
        String sharedPreference = getSharedPreference(KEY_NPS_SHOW);
        QuestionSurveyTable surveyTableByDevice = getSurveyTableByDevice(sharedPreference);
        String language = Locale.getDefault().getLanguage();
        if (surveyTableByDevice != null) {
            map.put(QuestionSurveyCommitParam.SURVEY_ID, surveyTableByDevice.getSurveyId());
            map.put("times", "" + surveyTableByDevice.getTimes());
        } else {
            map.put(QuestionSurveyCommitParam.SURVEY_ID, "0");
            map.put("times", "1");
        }
        String sharedPreference2 = getSharedPreference(KEY_ECOLOGY_MODEL);
        String sharedPreference3 = getSharedPreference(KEY_ECOLOGY_NPS_ID);
        map.put("model", sharedPreference2);
        map.put("language", language);
        map.put("os", String.valueOf(Build.VERSION.SDK_INT));
        map.put("appID", sharedPreference3);
        map.put("sn", sharedPreference);
        map.put(QuestionSurveyCommitParam.ANSWERS, this.mSubmitAnswers);
        map.put("countryCode", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        map.put("channel", "100001");
        map.put("cVer", VERSION_NEW_CONTENT);
        ReleaseLogUtil.d(TAG_RELEASE, "nps submitEcologySurvey map");
        if (str.endsWith("/")) {
            str2 = str + Url.QUESTION_SURVEY_ANSWER_URL;
        } else {
            str2 = str + "/secured/CCPC/EN/ccpcnps/submitSurveyV2/1";
        }
        LogUtil.a(TAG, "nps submitEcologySurvey requestNpsUrl:", str2, " ,request params: ", map.toString());
        if (CommonUtil.ab(this.mContext)) {
            executeSubmiteSurveyRequest(str2, map);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave submitEcologySurvey");
    }

    private void generateNpsMessage() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter generateNpsMessage");
        this.mMessageCenterApi.getMessageId(String.valueOf(19), MessageConstant.NPS_MESSAGE_TYPE, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    MessageObject messageObject = new MessageObject();
                    messageObject.setMsgId(str);
                    messageObject.setModule(String.valueOf(19));
                    messageObject.setType(MessageConstant.NPS_MESSAGE_TYPE);
                    messageObject.setMsgType(2);
                    messageObject.setPosition(1);
                    messageObject.setMsgPosition(11);
                    messageObject.setExpireTime(-1L);
                    messageObject.setReadFlag(0);
                    String string = HwNpsManager.this.mContext.getString(R.string.IDS_nps_success_message_2);
                    messageObject.setMsgContent(string);
                    LogUtil.a(HwNpsManager.TAG, "nps generateNpsMessage contentString:", string);
                    String string2 = HwNpsManager.this.mContext.getString(R.string.IDS_messagecenter_nps_title);
                    messageObject.setMsgTitle(string2);
                    messageObject.setMetadata(string2);
                    LogUtil.a(HwNpsManager.TAG, "nps generateNpsMessage messageCenterTitle:", string2);
                    messageObject.setCreateTime(System.currentTimeMillis());
                    messageObject.setDetailUri("messagecenter://nps_question");
                    messageObject.setImgUri("assets://localMessageIcon/ic_investigation.webp");
                    if (LoginInit.getInstance(BaseApplication.getContext()) != null) {
                        messageObject.setHuid(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
                    }
                    HwNpsManager.this.mMessageCenterApi.insertMessage(messageObject);
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "nps Leave generateNpsMessage");
                    if (HwNpsManager.this.mEcologyNpsRequest) {
                        HwNpsManager.this.saveEcologyNpsInfo();
                    } else {
                        HwNpsManager.this.saveWearNpsInfo();
                    }
                    LogUtil.a(HwNpsManager.TAG, "KEY_NPS_SHOW result:", 0);
                    LogUtil.a(HwNpsManager.TAG, "MESSAGE_NPS_ID result:", Integer.valueOf(HwNpsManager.this.setSharedPreference(HwNpsManager.MESSAGE_NPS_ID, str, null)));
                    LogUtil.a(HwNpsManager.TAG, "MNP_SHOW_TIME result:", Integer.valueOf(HwNpsManager.this.setSharedPreference(HwNpsManager.MNP_SHOW_TIME, String.valueOf(System.currentTimeMillis()), null)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveWearNpsInfo() {
        String strI;
        LogUtil.a(TAG, "nps Enter saveWearNpsInfo");
        setSharedPreference(KEY_NPS_SHOW, lrw.j(), null);
        setSharedPreference(KEY_WEAR_MODEL, lrw.h(), null);
        setSharedPreference(KEY_WEAR_NAME, lrw.g(), null);
        setSharedPreference(KEY_WEAR_SN, getDeviceId(lrw.j()), null);
        setSharedPreference(KEY_WEAR_FIRMWARE, lrw.f(), null);
        if (!isConnected() && HagridNpsManager.getInstance().isWeightDeviceNps()) {
            strI = lrw.k();
        } else {
            strI = lrw.i();
        }
        setSharedPreference(KEY_WEAR_UUID, strI, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEcologyNpsInfo() {
        LogUtil.a(TAG, "nps Enter saveEcologyNpsInfo");
        setSharedPreference(KEY_NPS_SHOW, lrw.d(), null);
        setSharedPreference(KEY_ECOLOGY_DEVICE_UUID, lrw.a(), null);
        setSharedPreference(KEY_ECOLOGY_NPS_REQUEST, "true", null);
        setSharedPreference(KEY_ECOLOGY_NPS_ID, lrw.e(), null);
        setSharedPreference(KEY_ECOLOGY_MODEL, lrw.b(), null);
    }

    public void showSelectQuestionDialog() {
        LogUtil.a(TAG, "nps Enter showSelectQuestionDialog");
        DialogActivityUtils dialogActivityUtils = DialogActivityUtils.getInstance();
        dialogActivityUtils.setTitle(this.mContext.getString(R.string.IDS_messagecenter_nps_title));
        dialogActivityUtils.setMessage(this.mContext.getString(R.string.IDS_nps_success_message_2));
        dialogActivityUtils.setPositiveButton(this.mContext.getString(R.string.IDS_nps_participate_sure), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(HwNpsManager.TAG, "nps press PositiveButton");
                Intent intent = new Intent();
                intent.setClassName(HwNpsManager.this.mContext, QuestionMainActivity.class.getName());
                if (HwNpsManager.this.mQuestionSurveyTable != null) {
                    HwNpsManager.this.mQuestionSurveyTable.setId(HwNpsManager.this.mQuestionId);
                }
                intent.setFlags(268435456);
                HwNpsManager.this.mContext.startActivity(intent);
                ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "nps press mContext.startActivity");
            }
        });
        dialogActivityUtils.setNegativeButton(this.mContext.getString(R.string.IDS_nps_participate_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d(HwNpsManager.TAG, "nps press NegativeButton");
            }
        });
        Intent intent = new Intent();
        intent.setClassName(this.mContext, NpsDialogActivity.class.getName());
        intent.setFlags(268435456);
        this.mContext.startActivity(intent);
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave showSelectQuestionDialog");
    }

    public QuestionSurveyTable getQuestionSurveyTable() {
        String sharedPreference = getSharedPreference(KEY_ECOLOGY_NPS_REQUEST);
        if (TextUtils.isEmpty(sharedPreference) && "true".equals(sharedPreference)) {
            this.mQuestionSurveyTable = getSurveyTableByDevice(lrw.d());
        } else {
            this.mQuestionSurveyTable = getSurveyTableByDevice(getDeviceId(lrw.j()));
        }
        return this.mQuestionSurveyTable;
    }

    private void subQuestionSurveyTableTime() {
        LogUtil.a(TAG, "Enter subQuestionSurveyTableTime");
        QuestionSurveyTable surveyTableByDevice = getSurveyTableByDevice(getDeviceId(lrw.j()));
        if (surveyTableByDevice == null) {
            return;
        }
        surveyTableByDevice.setTimes(surveyTableByDevice.getTimes() - 1);
        updateQuestionSurveyTable(surveyTableByDevice);
    }

    private void setQuestionSurveyTable(long j) {
        String deviceId;
        LogUtil.a(TAG, "Enter setQuestionSurveyTable");
        if (this.mEcologyNpsRequest) {
            deviceId = lrw.d();
        } else {
            deviceId = getDeviceId(lrw.j());
        }
        QuestionSurveyTable surveyTableByDevice = getSurveyTableByDevice(deviceId);
        this.mQuestionSurveyTable = surveyTableByDevice;
        if (surveyTableByDevice == null) {
            return;
        }
        int i = this.mQuestionId;
        if (i != -1) {
            surveyTableByDevice.setId(i);
        }
        this.mQuestionSurveyTable.setSurveyId(this.mQuestionSurveyId);
        long time = new Date().getTime();
        if (j <= 0) {
            j = time;
        }
        long jAbs = Math.abs(new Date().getTime() - this.mCurrentRequestTime) / 1000;
        ReleaseLogUtil.d(TAG_RELEASE, "setQuestionSurveyTable spanTimeSecond:", Long.valueOf(jAbs));
        if (this.mEcologyNpsRequest || jAbs > SPAN_SECONDS_UPDATE_TIME) {
            QuestionSurveyTable questionSurveyTable = this.mQuestionSurveyTable;
            questionSurveyTable.setTimes(questionSurveyTable.getTimes() + 1);
        }
        this.mCurrentRequestTime = new Date().getTime();
        ReleaseLogUtil.d(TAG_RELEASE, "setQuestionSurveyTable lastTime ", Long.valueOf(j));
        if (!this.mEcologyNpsRequest) {
            this.mQuestionSurveyTable.setLastSurveyTime(j);
        }
        updateQuestionSurveyTable(this.mQuestionSurveyTable);
        ReleaseLogUtil.d(TAG_RELEASE, "Leave setQuestionSurveyTable");
    }

    public void updateSurveyTime() {
        QuestionSurveyTable questionSurveyTable = getQuestionSurveyTable();
        if (questionSurveyTable != null) {
            questionSurveyTable.setLastSurveyTime(new Date().getTime());
            updateQuestionSurveyTable(questionSurveyTable);
        }
    }

    public void updateQuestionSurveyTable(QuestionSurveyTable questionSurveyTable) {
        LogUtil.a(TAG, "nps Enter updateQuestionSurveyTable");
        if (questionSurveyTable == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps mQuestionSurveyTable is null return");
            return;
        }
        QuestionSurveyDataBase questionSurveyDataBase = new QuestionSurveyDataBase();
        LogUtil.a(TAG, "nps mQuestionSurveyTable:", questionSurveyTable.toString());
        questionSurveyDataBase.updateSurveyTableByDeviceId(this, questionSurveyTable);
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave updateQuestionSurveyTable");
    }

    private void loadInitialData(String str) {
        String str2;
        String str3;
        LogUtil.a(TAG, "nps Enter loadInitialData paramNpsUrl:", str);
        int i = this.mRequestTime;
        LogUtil.a(TAG, "nps loadInitialData times:", Integer.valueOf(i));
        if (i < 0 || i > 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps loadInitialData (times < 0 || times > 2) return!");
            return;
        }
        getRequestInfo();
        HashMap map = new HashMap(16);
        map.put("model", this.mDeviceName);
        map.put("firmware", TextUtils.isEmpty(this.mFirmware) ? "firmware" : this.mFirmware);
        String str4 = this.mSn;
        if (str4 == null) {
            str4 = "sn";
        }
        map.put("sn", str4);
        map.put("language", this.mLanguage);
        map.put("os", this.mOs);
        map.put("appID", "3");
        map.put("band", this.mModel);
        map.put("countryCode", this.mCountryCode);
        map.put("imeiEnc", this.mUuid);
        map.put("times", "" + i);
        ReleaseLogUtil.d(TAG_RELEASE, "nps loadInitialData map");
        if (isConnected() && !HagridNpsManager.getInstance().isWeightDeviceNps()) {
            str2 = "?cVer=100101621";
        } else if (HagridNpsManager.getInstance().isWeightDeviceNps()) {
            str2 = "?cVer=21319";
        } else {
            setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "5", NPS_TRIGGER_ERROR_DEVICE_UNCONNECT);
            LogUtil.a(TAG, "nps loadInitialData device info error");
            return;
        }
        if (str.endsWith("/")) {
            str3 = str + Url.QUESTION_SURVEY_REQUEST_URL + str2 + CHANNEL;
        } else {
            str3 = str + "/secured/CCPC/EN/ccpcnps/getSurveyV2/1" + str2 + CHANNEL;
        }
        LogUtil.a(TAG, "nps loadInitialData requestNpsUrl:", str3, ", request map:", map);
        if (CommonUtil.ab(this.mContext)) {
            setRequestServerBI("1", "");
            executeGetSurveyRequest(str3, map);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave loadInitialData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestServerBI(String str, String str2) {
        LogUtil.a(TAG, "nps setRequestServerBI:", Integer.valueOf(this.mRequestTime));
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("time", Integer.valueOf(this.mRequestTime));
        if (!TextUtils.isEmpty(str)) {
            map.put("type", str);
            if ("3".equals(str)) {
                map.put("questionType", getQuestionType(this.mQuestionSurveyId));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("errorCode", str2);
        }
        map.put("deviceType", lrw.g());
        map.put(MatterDataContans.KEY_MAC_ADDRESS, lrw.j());
        LogUtil.a(TAG, "setRequestServerBI map:", map.toString());
        lmf.d().c(this.mContext, AnalyticsValue.NPS_GET_QUESTION_1090040.value(), map, 0);
    }

    public String getQuestionType(String str) {
        for (String str2 : NPS_SURVEY_IDS.split(",")) {
            if (str2.equals(str)) {
                return "1";
            }
        }
        return "2";
    }

    private void loadNpsRequestData(String str) {
        String str2;
        LogUtil.a(TAG, "Enter ecology device init request param,paramNpsUrl:", str);
        int i = this.mEcologyRequestTime + 1;
        LogUtil.a(TAG, "Ecology nps load InitialData times:", Integer.valueOf(i));
        if (i < 1 || i > 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps loadInitialData (times < 1 || times > 2) return!");
            return;
        }
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        String language = Locale.getDefault().getLanguage();
        HashMap map = new HashMap(16);
        map.put("model", lrw.b());
        map.put("sn", lrw.d());
        map.put("language", language);
        map.put("os", String.valueOf(Build.VERSION.SDK_INT));
        map.put("appID", lrw.e());
        map.put("countryCode", commonCountryCode);
        map.put("times", "" + i);
        map.put("channel", "100001");
        map.put("cVer", VERSION_NEW_CONTENT);
        ReleaseLogUtil.d(TAG_RELEASE, "nps loadNpsRequestData map");
        if (str.endsWith("/")) {
            str2 = str + Url.QUESTION_SURVEY_REQUEST_URL;
        } else {
            str2 = str + "/secured/CCPC/EN/ccpcnps/getSurveyV2/1";
        }
        LogUtil.a(TAG, "nps loadNpsRequestData requestNpsUrl:", str2);
        if (CommonUtil.ab(this.mContext)) {
            executeGetSurveyRequest(str2, map);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave loadNpsRequestData");
    }

    private void getRequestInfo() {
        QuestionSurveyTable questionSurveyTable;
        QuestionSurveyTable questionSurveyTable2;
        this.mLanguage = CommonUtil.z();
        String strG = lrw.g();
        this.mDeviceName = strG;
        if (TextUtils.isEmpty(strG) && (questionSurveyTable2 = this.mQuestionSurveyTable) != null) {
            this.mDeviceName = questionSurveyTable2.getDeviceType();
        }
        this.mFirmware = lrw.f();
        this.mOs = "" + Build.VERSION.SDK_INT;
        String deviceId = getDeviceId(lrw.j());
        this.mSn = deviceId;
        if (TextUtils.isEmpty(deviceId) && (questionSurveyTable = this.mQuestionSurveyTable) != null) {
            this.mSn = questionSurveyTable.getDeviceId();
        }
        this.mModel = lrw.h();
        this.mCertModel = lrw.o();
        this.mCountryCode = lrw.c();
        if (!isConnected() && HagridNpsManager.getInstance().isWeightDeviceNps()) {
            this.mUuid = lrw.k();
        } else {
            this.mUuid = lrw.i();
        }
    }

    public void setBiNpsEvent(String str, String str2) {
        ReleaseLogUtil.d(TAG_RELEASE, "setBiNpsEvent");
        HashMap map = new HashMap(16);
        map.put("click", 1);
        if (!this.mEcologyNpsRequest) {
            map.put("deviceType", lrw.g());
            map.put(MatterDataContans.KEY_MAC_ADDRESS, lrw.j());
            QuestionSurveyDetailResponse detailResponse = getDetailResponse();
            if (detailResponse != null) {
                map.put("questionType", getQuestionType(detailResponse.getSurveyID()));
                map.put("questionTime", Integer.valueOf(detailResponse.getQueryTimes()));
            }
            map.put("from", str2);
        }
        LogUtil.a(TAG, "setBiNpsEvent map:", map.toString());
        lmf.d().c(this.mContext, str, map, 0);
    }

    public void setBiNpsEvent(String str, String str2, String str3) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter setBiNpsEvent");
        HashMap map = new HashMap(16);
        map.put("click", 1);
        if (str2 != null) {
            map.put("type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("errorCode", str3);
        }
        lmf.d().c(this.mContext, str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processGetSurveyResponse() {
        QuestionSurveyDetailResponse questionSurveyDetailResponse = this.mDetailResponse;
        if (questionSurveyDetailResponse == null) {
            return;
        }
        LogUtil.d(TAG, "nps processGetSurveyResponse resCode:", Integer.valueOf(questionSurveyDetailResponse.getResCode()));
        if (this.mDetailResponse.getResCode() == 0) {
            LogUtil.d(TAG, "nps processGetSurveyResponse to get new questionDetail");
            List<QuestionSureyResponse> questions = QuestionCache.getQuestions();
            this.mQuestionList = questions;
            if (questions == null) {
                this.mQuestionList = new ArrayList(16);
            }
            this.mQuestionList.clear();
            if (this.mDetailResponse.getSurveyContent() == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "nps processGetSurveyResponse questionnaireInfo is null");
                return;
            }
            List<QuestionSureyResponse> questions2 = this.mDetailResponse.getSurveyContent().getQuestions();
            if (questions2 == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "nps processGetSurveyResponse questionList is null");
                return;
            }
            setRequestServerBI("3", "");
            this.mQuestionList.addAll(questions2);
            if (this.mQuestionList.isEmpty()) {
                ReleaseLogUtil.e(TAG_RELEASE, "nps processGetSurveyResponse mQuestionList isEmpty");
                return;
            }
            QuestionCache.setQuestions(this.mQuestionList);
            if (DEVICE_NAME_K1.equals(this.mDeviceName) || DEVICE_NAME_K2.equals(this.mDeviceName)) {
                showSelectQuestionDialog();
            } else {
                generateNpsMessage();
            }
            String surveyID = this.mDetailResponse.getSurveyID();
            this.mQuestionSurveyId = surveyID;
            if (surveyID != null) {
                this.mQuestionId = CommonUtil.e(surveyID, -1);
            }
            int i = this.mQuestionId;
            LogUtil.a(TAG, "nps processGetSurveyResponse mQuestionId:", Integer.valueOf(i), " mQuestionSurveyId:", this.mQuestionSurveyId);
            setQuestionSurveyTable(getLastTime(this.mDetailResponse.getFirstTime()));
            return;
        }
        processGetSurveyResponseError();
    }

    private long getLastTime(String str) {
        Date dateH = ltb.h(str);
        if (dateH == null) {
            return 0L;
        }
        LogUtil.d(TAG, "nps processGetSurveyResponse firstDate:", dateH, " firstTime:", Long.valueOf(dateH.getTime()));
        return dateH.getTime();
    }

    private void processGetSurveyResponseError() {
        long time;
        setRequestServerBI("4", String.valueOf(this.mDetailResponse.getResCode()));
        if (this.mDetailResponse.getResCode() == ERROR_CODE) {
            LogUtil.d(TAG, "nps processGetSurveyResponseError errorCode 305003 getFirstTime:", this.mDetailResponse.getFirstTime());
            this.mQuestionSurveyId = "0";
            Date dateH = ltb.h(this.mDetailResponse.getFirstTime());
            if (dateH != null) {
                LogUtil.d(TAG, "nps processGetSurveyResponseError errorCode 305003, update table firstDate:", dateH, " firstTime:", Long.valueOf(dateH.getTime()));
                time = dateH.getTime();
            } else {
                time = 0;
            }
            setQuestionSurveyTable(time);
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "processGetSurveyResponseError other errorCode");
    }

    private Map<String, String> getHeaders() {
        HashMap map = new HashMap(16);
        map.put("Accept", "application/json");
        map.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeDestSiteRequest(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j(TAG, "nps executeDestSiteRequest map is null");
            return;
        }
        LogUtil.a(TAG, "nps executeDestSiteRequest map:", ofe.c(map));
        oet.d().c(str, getHeaders(), ofe.c(map), String.class, new ResultCallback<String>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.10
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "nps executeDestSiteRequest success");
                HwNpsManager.this.responseDestSiteParse(str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "nps executeDestSiteRequest error");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseDestSiteParse(final String str) {
        if (str == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps responseDestSiteListener response is null");
        } else {
            TaskUtils.executeAsyncTask(new AsyncTask<Object, Object, Object>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.11
                @Override // android.os.AsyncTask
                protected Object doInBackground(Object... objArr) {
                    LogUtil.a(HwNpsManager.TAG, "nps responseDestSiteListener executeAsyncTask doInBackground response:", str);
                    try {
                        QuestionDestSiteResponse questionDestSiteResponse = (QuestionDestSiteResponse) new Gson().fromJson(str, HwNpsManager.this.mDestSiteType);
                        HwNpsManager.this.setBiNpsEvent(AnalyticsValue.NPS_ELIGIBLE_TIME.value(), "7", "");
                        return questionDestSiteResponse;
                    } catch (JsonSyntaxException unused) {
                        ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "nps responseDestSiteListener executeAsyncTask doInBackground JsonSyntaxException");
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                protected void onPostExecute(Object obj) {
                    if (obj == null) {
                        return;
                    }
                    super.onPostExecute(obj);
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "nps responseDestSiteListener executeAsyncTask onPostExecute");
                    if (obj instanceof QuestionDestSiteResponse) {
                        QuestionDestSiteResponse questionDestSiteResponse = (QuestionDestSiteResponse) obj;
                        if (HwNpsManager.this.mIsGoSubmitSurveyState) {
                            HwNpsManager.this.getDestSiteSubmitSurvey(questionDestSiteResponse);
                        } else {
                            HwNpsManager.this.processGetDestSiteResponse(questionDestSiteResponse);
                        }
                    }
                }
            }, new Object[0]);
        }
    }

    private void executeGetSurveyRequest(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j(TAG, "nps executeGetSurveyRequest map is null");
        } else {
            oet.d().c(str, getHeaders(), ofe.c(map), String.class, new ResultCallback<String>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.12
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(String str2) {
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "executeGetSurveyRequest nps get survey successful");
                    HwNpsManager.this.responseSurveyParse(str2);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "executeGetSurveyRequest nps get survey errorListener");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseSurveyParse(final String str) {
        LogUtil.a(TAG, "nps responseSurveyParse get question successful:", str);
        if (str == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps responseSurveyParse response is null");
        } else {
            TaskUtils.executeAsyncTask(new AsyncTask<Object, Object, Object>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.13
                @Override // android.os.AsyncTask
                protected Object doInBackground(Object... objArr) {
                    Gson gson = new Gson();
                    LogUtil.a(HwNpsManager.TAG, "nps executeAsyncTask responseSurveyParse response:", str);
                    try {
                        HwNpsManager hwNpsManager = HwNpsManager.this;
                        hwNpsManager.mDetailResponse = (QuestionSurveyDetailResponse) gson.fromJson(str, hwNpsManager.mType);
                        HwNpsManager.this.setRequestServerBI("2", "");
                        HwNpsManager.this.setQuestionDetail(str);
                        LogUtil.a(HwNpsManager.TAG, "nps executeAsyncTask mDetailResponse:", HwNpsManager.this.mDetailResponse.toString());
                        return HwNpsManager.this.mDetailResponse;
                    } catch (JsonSyntaxException unused) {
                        ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "nps executeAsyncTask json error!");
                        HwNpsManager.this.mDetailResponse = new QuestionSurveyDetailResponse();
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                protected void onPostExecute(Object obj) {
                    super.onPostExecute(obj);
                    HwNpsManager.this.processGetSurveyResponse();
                }
            }, new Object[0]);
        }
    }

    private void executeSubmiteSurveyRequest(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j(TAG, "nps executeSubmiteSurveyRequest map is null");
        } else {
            oet.d().c(str, getHeaders(), ofe.c(map), String.class, new ResultCallback<String>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.14
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(String str2) {
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "executeSubmiteSurveyRequest nps submite successful");
                    HwNpsManager.this.mHwNpsCallback.onSuccess(str2);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "executeSubmiteSurveyRequest nps submite failed");
                    HwNpsManager.this.mHwNpsCallback.onError();
                }
            });
        }
    }

    private DeviceInfo getDeviceInfo(String str) {
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (njy.e(deviceList)) {
            LogUtil.j(TAG, "requestDeviceNpsInfo isDisconnected, deviceInfoList is empty");
            return null;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo.getDeviceConnectState() == 2) {
            return deviceInfo;
        }
        LogUtil.a(TAG, "requestDeviceNpsInfo, device name: ", deviceInfo.getDeviceName());
        return null;
    }

    private void requestDeviceNpsInfo() {
        LogUtil.a(TAG, "nps Enter requestDeviceNpsInfo requestTime:", Integer.valueOf(this.mRequestTime));
        if (this.mRequestTime >= 0) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps requestDeviceNpsInfo to get WebNPS");
            DeviceInfo deviceInfo = getDeviceInfo(lrw.l());
            if (deviceInfo == null) {
                ReleaseLogUtil.d(TAG_RELEASE, "nps requestDeviceNpsInfo deviceInfo is null");
                return;
            }
            DeviceNpsSampleEventUtil.getInstance().requestDeviceNpsData(deviceInfo, new SampleEventCallback() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.15
                @Override // com.huawei.ui.main.stories.nps.interactors.util.SampleEventCallback
                public void onSuccess(cql.c cVar) {
                    String strE = cVar.e((byte) 1, "");
                    String strE2 = cVar.e((byte) 2, "0");
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "nps requestDeviceNpsInfo success, odid = ", cpl.e(strE), ", activationTime = ", strE2);
                    if ("0".equals(strE2)) {
                        return;
                    }
                    HwNpsManager.this.constructWebSurveyRequest(strE, strE2);
                }

                @Override // com.huawei.ui.main.stories.nps.interactors.util.SampleEventCallback
                public void onError() {
                    LogUtil.a(HwNpsManager.TAG, "nps requestDeviceNpsInfo success");
                }
            });
        } else {
            LogUtil.a(TAG, "nps processGetDestSiteResponse activation success");
            insertDeviceToDb();
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave requestDeviceNpsInfo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void constructWebSurveyRequest(String str, String str2) {
        LogUtil.a(TAG, "nps Enter constructWebSurveyRequest");
        int i = this.mRequestTime;
        LogUtil.a(TAG, "nps constructWebSurveyRequest times:", Integer.valueOf(i));
        if (i < 0 || i > 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps constructWebSurveyRequest (times < 0 || times > 2) return!");
            return;
        }
        getRequestInfo();
        HashMap map = new HashMap(16);
        map.put("siteCode", "");
        map.put("countryCode", this.mCountryCode);
        map.put("languageCode", this.mLanguage);
        map.put(WebSurveyRequestParam.CHANNEL_CODE, "APP");
        map.put("sn", "");
        map.put(WebSurveyRequestParam.NPS_ID, "3");
        map.put(WebSurveyRequestParam.KEYWORD, "");
        map.put("channel", "16");
        map.put(WebSurveyRequestParam.ACTIVATED_TIME, "");
        map.put("brand", BRAND_DEFAULT);
        map.put("model", "");
        map.put("osVersion", this.mOs);
        map.put("romVersion", this.mFirmware);
        map.put("appVersion", VERSION_NSS_NEW_CONTENT);
        map.put(WebSurveyRequestParam.SIGN_COUNTRY_CODE, "");
        map.put(WebSurveyRequestParam.EXTERNAL_MODEL, this.mCertModel);
        map.put(WebSurveyRequestParam.DEVICE_ACTIVATED_TIME, str2);
        map.put(WebSurveyRequestParam.RELATE_FIRMWARE, "");
        map.put(WebSurveyRequestParam.RELATE_BRAND, Build.BRAND);
        map.put(WebSurveyRequestParam.RELATE_OS_VERSION, "");
        map.put(WebSurveyRequestParam.RELATE_MODEL, Build.MODEL);
        ReleaseLogUtil.d(TAG_RELEASE, "constructWebSurveyRequest map");
        String str3 = GRSManager.c(BaseApplication.getContext()).getUrl("domainSgwCcpcHuawei") + Url.WEB_SURVEY_REQUEST_URL;
        LogUtil.a(TAG, "nps constructWebSurveyRequest requestNpsUrl:", str3, ", request map:", map);
        map.put(WebSurveyRequestParam.ODID, str);
        if (CommonUtil.ab(this.mContext)) {
            setRequestServerBI("1", "");
            executeGetWebSurveyRequest(str3, map);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave constructWebSurveyRequest");
    }

    private Map<String, String> getWebSurveyHeaders() {
        HashMap map = new HashMap(16);
        map.put("Accept", "application/json");
        map.put("Content-Type", "application/json");
        map.put("SGW-APP-ID", SGW_APP_ID);
        return map;
    }

    private void executeGetWebSurveyRequest(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j(TAG, "nps executeGetSurveyUnionRequest map is null");
        } else {
            oet.d().c(str, getWebSurveyHeaders(), ofe.c((Object) map), String.class, new ResultCallback<String>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.16
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(String str2) {
                    ReleaseLogUtil.d(HwNpsManager.TAG_RELEASE, "executeGetWebSurveyRequest nps get survey successful");
                    HwNpsManager.this.responseWebSurveyParse(str2);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "executeGetWebSurveyRequest err = ", ExceptionUtils.c(th));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseWebSurveyParse(final String str) {
        LogUtil.a(TAG, "nps responseWebSurveyParse get question successful:", str);
        if (str == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps responseWebSurveyParse response is null");
        } else {
            TaskUtils.executeAsyncTask(new AsyncTask<Object, Object, Object>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.17
                @Override // android.os.AsyncTask
                protected Object doInBackground(Object... objArr) {
                    Gson gson = new Gson();
                    LogUtil.a(HwNpsManager.TAG, "nps executeAsyncTask responseWebSurveyParse");
                    try {
                        HwNpsManager hwNpsManager = HwNpsManager.this;
                        hwNpsManager.mWebSurveyResponse = (WebSurveyDetailResponse) gson.fromJson(str, hwNpsManager.mWebSurveyType);
                        HwNpsManager.this.setRequestServerBI("2", "");
                        if (!HwNpsManager.WEB_SUCCESS_CODE.equals(HwNpsManager.this.mWebSurveyResponse.getResponseCode())) {
                            LogUtil.j(HwNpsManager.TAG, "nps setQuestionDetail ResCode:", HwNpsManager.this.mWebSurveyResponse.getResponseCode());
                        } else {
                            SharedPreferenceManager.e(HwNpsManager.this.mContext, String.valueOf(10004), HwNpsManager.NPS_QUESTION_CONTENT_KEY, str, new StorageParams());
                        }
                        LogUtil.a(HwNpsManager.TAG, "nps executeAsyncTask mWebDetailResponse:", HwNpsManager.this.mWebSurveyResponse.toString());
                        return HwNpsManager.this.mWebSurveyResponse;
                    } catch (JsonSyntaxException unused) {
                        ReleaseLogUtil.a(HwNpsManager.TAG_RELEASE, "nps executeAsyncTask json error!");
                        HwNpsManager.this.mWebSurveyResponse = new WebSurveyDetailResponse();
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                protected void onPostExecute(Object obj) {
                    super.onPostExecute(obj);
                    HwNpsManager.this.processWebSurveyResponse();
                }
            }, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWebSurveyResponse() {
        WebSurveyDetailResponse webSurveyDetailResponse = this.mWebSurveyResponse;
        if (webSurveyDetailResponse == null) {
            return;
        }
        LogUtil.d(TAG, "nps processWebSurveyResponse resCode:", webSurveyDetailResponse.getResponseCode());
        if (WEB_SUCCESS_CODE.equals(this.mWebSurveyResponse.getResponseCode())) {
            LogUtil.d(TAG, "nps processWebSurveyResponse to get new questionDetail");
            if (this.mWebSurveyResponse.getResponseData() == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "nps processWebSurveyResponse getResponseData is null");
                return;
            }
            String npsLink = this.mWebSurveyResponse.getResponseData().getNpsLink();
            if (TextUtils.isEmpty(npsLink)) {
                ReleaseLogUtil.e(TAG_RELEASE, "nps processWebSurveyResponse npsLink is null");
                return;
            }
            setRequestServerBI("3", "");
            QuestionCache.setNpsLink(npsLink);
            generateNpsMessage();
            int i = this.mQuestionId;
            LogUtil.a(TAG, "nps processWebSurveyResponse mQuestionId:", Integer.valueOf(i), " mQuestionSurveyId:", this.mQuestionSurveyId);
            setQuestionSurveyTable(getLastTime(this.mWebSurveyResponse.getResponseData().getFirstTime()));
            return;
        }
        processWebSurveyResponseError();
    }

    private void processWebSurveyResponseError() {
        long time;
        setRequestServerBI("4", this.mWebSurveyResponse.getResponseCode());
        if (String.valueOf(ERROR_CODE).equals(this.mWebSurveyResponse.getResponseCode())) {
            if (this.mWebSurveyResponse.getResponseData() == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "processWebSurveyResponseError errorCode 305003 but responseData is null");
                return;
            }
            LogUtil.d(TAG, "nps processGetSurveyResponseError errorCode 305003 getFirstTime:", this.mWebSurveyResponse.getResponseData().getFirstTime());
            this.mQuestionSurveyId = "0";
            Date dateH = ltb.h(this.mWebSurveyResponse.getResponseData().getFirstTime());
            if (dateH != null) {
                LogUtil.d(TAG, "nps processGetSurveyResponseError errorCode 305003, update table firstDate:", dateH, " firstTime:", Long.valueOf(dateH.getTime()));
                time = dateH.getTime();
            } else {
                time = 0;
            }
            setQuestionSurveyTable(time);
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "processGetSurveyResponseError other errorCode");
    }

    public String initNpsLink() {
        ReleaseLogUtil.d(TAG_RELEASE, "jumpToNpsLink enter");
        setBiNpsEvent(AnalyticsValue.NPS_OPEN_QUESTION_1090038.value(), HOME);
        updateSurveyTime();
        String npsLink = QuestionCache.getNpsLink();
        if (TextUtils.isEmpty(npsLink)) {
            npsLink = getNpsLinkBySP();
        }
        if (TextUtils.isEmpty(npsLink)) {
            ReleaseLogUtil.d(TAG, "nps jumpToNpsLink link is null finish!");
            return "";
        }
        setSharedPreference(KEY_WEAR_MODEL, "", null);
        setSharedPreference(KEY_WEAR_NAME, "", null);
        setSharedPreference(KEY_WEAR_SN, "", null);
        setSharedPreference(KEY_WEAR_FIRMWARE, "", null);
        setSharedPreference(KEY_WEAR_UUID, "", null);
        if (!TextUtils.isEmpty(getSharedPreference(KEY_NPS_SHOW))) {
            LogUtil.a(TAG, "KEY_NPS_SHOW result = ", Integer.valueOf(setSharedPreference(KEY_NPS_SHOW, "")));
            if (!TextUtils.isEmpty(getSharedPreference(MESSAGE_NPS_ID))) {
                ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).setMessageRead(getSharedPreference(MESSAGE_NPS_ID));
            }
        }
        return npsLink + WEB_CHANNEL;
    }

    private String getNpsLinkBySP() {
        WebSurveyDetailResponse webSurveyDetailResponse;
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10004), NPS_QUESTION_CONTENT_KEY);
        LogUtil.a(TAG, "nps getWebSurveyDetail question:", strE);
        try {
            webSurveyDetailResponse = (WebSurveyDetailResponse) new Gson().fromJson(strE, this.mWebSurveyType);
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "nps getNpsLinkByResJsonv json error");
            webSurveyDetailResponse = null;
        }
        if (webSurveyDetailResponse == null || webSurveyDetailResponse.getResponseData() == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps getNpsLinkByResJson is null");
            return "";
        }
        String npsLink = webSurveyDetailResponse.getResponseData().getNpsLink();
        if (!TextUtils.isEmpty(npsLink)) {
            return npsLink;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "nps getNpsLinkByResJson npsLink is null");
        return "";
    }

    public String getQuestionDetail() {
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(this.mContext, String.valueOf(10004), KEY_ECOLOGY_NPS_REQUEST))) {
            String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10004), NPS_ECOLOGY_QUESTION_CONTENT_KEY);
            LogUtil.a(TAG, "nps getEcologyQuestionDetail question:", strE);
            return strE;
        }
        String strE2 = SharedPreferenceManager.e(this.mContext, String.valueOf(10004), NPS_QUESTION_CONTENT_KEY);
        LogUtil.a(TAG, "nps getQuestionDetail question:", strE2);
        return strE2;
    }

    public void setQuestionDetail(String str) {
        StorageParams storageParams = new StorageParams();
        if (this.mEcologyNpsRequest) {
            SharedPreferenceManager.e(this.mContext, String.valueOf(10004), NPS_ECOLOGY_QUESTION_CONTENT_KEY, str, storageParams);
        } else if (this.mDetailResponse.getResCode() == 0) {
            SharedPreferenceManager.e(this.mContext, String.valueOf(10004), NPS_QUESTION_CONTENT_KEY, str, storageParams);
        } else {
            LogUtil.j(TAG, "nps setQuestionDetail ResCode:", Integer.valueOf(this.mDetailResponse.getResCode()));
        }
        LogUtil.a(TAG, "nps setQuestionDetail question:", str);
    }

    public void submitSurveyQuestion(String str, HwNpsCallback hwNpsCallback) {
        LogUtil.a(TAG, "nps Enter submitSurveyQuestion!");
        if (str != null && !str.isEmpty()) {
            this.mIsGoSubmitSurveyState = true;
            this.mSubmitAnswers = str;
            this.mHwNpsCallback = hwNpsCallback;
            requestGetDestSite();
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave submitSurveyQuestion!");
    }

    public void setIsGoSubmitSurveyState(boolean z) {
        this.mIsGoSubmitSurveyState = z;
    }

    private String getMobileCountryCode(Context context) {
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        String[] stringArray = context.getResources().getStringArray(R.array.CountryCodes);
        LogUtil.a(TAG, "getMobileCountryCode stringCountryId:", commonCountryCode);
        String str = "";
        if (stringArray == null) {
            return "";
        }
        for (String str2 : stringArray) {
            String[] strArrSplit = str2.split(",");
            if (strArrSplit.length > 1 && strArrSplit[1].trim().equals(commonCountryCode.trim())) {
                str = strArrSplit[0];
                break;
            }
        }
        LogUtil.a(TAG, "getMobileCountryCode resourceCountryCode:", str);
        return str;
    }

    public String getDeviceId(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getDeviceId wearMacString is null return!");
            return "";
        }
        if ("460".equals(getMobileCountryCode(this.mContext))) {
            ReleaseLogUtil.d(TAG_RELEASE, "getDeviceId in China!");
            return str;
        }
        LogUtil.a(TAG, "getDeviceId in Overseas!");
        HwEncryptUtil hwEncryptUtilB = HwEncryptUtil.b(this.mContext);
        String strA = hwEncryptUtilB != null ? hwEncryptUtilB.a("09F98935DF23B3E011F5638614670662IrzLoccccR72B/H4EI3GKB6ny7lTZGH7IB4hQWa2qra9LliDA6e9/qgL/9yUjVL0") : "";
        return !TextUtils.isEmpty(strA) ? hmacSha256(str, strA) : "";
    }

    private String hmacSha256(String str, String str2) {
        LogUtil.d(TAG, "nps Enter hmacSha256");
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            byte[] bytes2 = str.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HMACSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return URLEncoder.encode(Base64.encodeToString(mac.doFinal(bytes2), 2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "UnsupportedEncodingException");
            return "";
        } catch (InvalidKeyException unused2) {
            ReleaseLogUtil.a(TAG_RELEASE, "InvalidKeyException");
            return "";
        } catch (NoSuchAlgorithmException unused3) {
            ReleaseLogUtil.a(TAG_RELEASE, "NoSuchAlgorithmException");
            return "";
        }
    }

    public String getSecretDeviceIdSha256(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "deviceId is null return!");
            return "";
        }
        HwEncryptUtil hwEncryptUtilB = HwEncryptUtil.b(BaseApplication.getContext());
        String strA = hwEncryptUtilB != null ? hwEncryptUtilB.a("09F98935DF23B3E011F5638614670662IrzLoccccR72B/H4EI3GKB6ny7lTZGH7IB4hQWa2qra9LliDA6e9/qgL/9yUjVL0") : "";
        return !TextUtils.isEmpty(strA) ? hmacSha256(str, strA) : "";
    }

    public int setSharedPreference(String str, String str2) {
        return SharedPreferenceManager.e(this.mContext, String.valueOf(getModuleId()), str, str2, null);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public String getSharedPreference(String str) {
        return SharedPreferenceManager.e(this.mContext, String.valueOf(getModuleId()), str);
    }

    public boolean isShowToDo() {
        LogUtil.a(TAG, "isShowToDo KEY_NPS_SHOW value: ", getSharedPreference(KEY_NPS_SHOW));
        if (TextUtils.isEmpty(getSharedPreference(KEY_NPS_SHOW))) {
            return false;
        }
        return (isConnected() || HagridNpsManager.getInstance().isBindWifiDevice()) && lrw.j().equals(getSharedPreference(KEY_NPS_SHOW)) && Math.abs(System.currentTimeMillis() - CommonUtil.m(BaseApplication.getContext(), getSharedPreference(MNP_SHOW_TIME))) < FIFTEEN_DAYS;
    }

    public int getShowDay() {
        return (int) (Math.abs(System.currentTimeMillis() - CommonUtil.m(BaseApplication.getContext(), getSharedPreference(MNP_SHOW_TIME))) / 86400000);
    }

    public boolean isShowEcologyNps() {
        if (TextUtils.isEmpty(getSharedPreference(KEY_NPS_SHOW))) {
            LogUtil.a(TAG, "KEY_NPS_SHOW deviceMac: empty");
            return false;
        }
        String sharedPreference = getSharedPreference(KEY_ECOLOGY_NPS_REQUEST);
        return !TextUtils.isEmpty(sharedPreference) && sharedPreference.equals("true") && Math.abs(System.currentTimeMillis() - CommonUtil.m(BaseApplication.getContext(), getSharedPreference(MNP_SHOW_TIME))) < FIFTEEN_DAYS;
    }

    private boolean isConnected() {
        DeviceInfo deviceInfoD = mgg.d(TAG);
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (deviceInfoD == null && (deviceInfoD = mgi.d(TAG)) == null) ? false : true;
        if (deviceInfoD == null) {
            deviceInfoD = getFollowedDeviceInfo();
            if (deviceInfoD != null) {
                z = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
            z = z3;
        }
        if (z) {
            if (TextUtils.isEmpty(lrw.j()) || z2) {
                lrw.h(deviceInfoD.getSoftVersion());
                setNpsIdentify(deviceInfoD);
            }
            if (z2) {
                setFollowedDeviceInfo(deviceInfoD);
            }
        }
        ReleaseLogUtil.d(TAG_RELEASE, "isConnected isConnected is ", Boolean.valueOf(z));
        return z;
    }

    private void setFollowedDeviceInfo(DeviceInfo deviceInfo) {
        lrw.j(deviceInfo.getDeviceModel());
        lrw.f(deviceInfo.getCertModel());
        lrw.n(deviceInfo.getDeviceModel());
    }

    public DeviceInfo getFollowedDeviceInfo() {
        LogUtil.a(TAG, "enter getFollowedDeviceInfo");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.FOLLOWED_DEVICES, null, TAG);
        if (deviceList != null && !deviceList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    arrayList.add(deviceInfo);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new Comparator<DeviceInfo>() { // from class: com.huawei.ui.main.stories.nps.interactors.HwNpsManager.18
                    @Override // java.util.Comparator
                    public int compare(DeviceInfo deviceInfo2, DeviceInfo deviceInfo3) {
                        return deviceInfo2.getSecurityDeviceId().compareTo(deviceInfo3.getSecurityDeviceId());
                    }
                });
                return (DeviceInfo) arrayList.get(0);
            }
        }
        return null;
    }

    public void setNpsIdentify(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        if (!TextUtils.isEmpty(udidFromDevice)) {
            lrw.i(udidFromDevice);
            return;
        }
        if (Utils.o() || deviceInfo.getDeviceIdType() == 1) {
            lrw.i(getInstance().getSecretDeviceIdSha256(deviceInfo.getSecurityDeviceId()));
        } else {
            lrw.i(deviceInfo.getDeviceIdentify());
        }
        String deviceUdid = deviceInfo.getDeviceUdid();
        if (deviceInfo.getProductType() < 34 || TextUtils.isEmpty(deviceUdid)) {
            return;
        }
        lrw.i(deviceUdid);
    }

    public void startEcologyDeviceNps() {
        String sharedPreference = getSharedPreference(KEY_NPS_LAST_TIME);
        try {
            if (!TextUtils.isEmpty(sharedPreference)) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - Long.parseLong(sharedPreference)) / 1000;
                Long.valueOf(jCurrentTimeMillis).getClass();
                if (jCurrentTimeMillis < 604800) {
                    LogUtil.a(TAG, "nps only once a day");
                    return;
                }
            }
            if (!TextUtils.isEmpty(getSharedPreference(KEY_NPS_SHOW))) {
                LogUtil.a(TAG, "last nps survey is not finished");
            } else {
                handleEcologyDeviceList();
            }
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "time formatException ");
        }
    }

    private void handleEcologyDeviceList() {
        int times;
        Long lValueOf;
        List<dru> bondEcologyDevice = getBondEcologyDevice();
        if (njy.e(bondEcologyDevice)) {
            LogUtil.a(TAG, "no ecology device");
            return;
        }
        for (dru druVar : bondEcologyDevice) {
            String deviceId = getDeviceId(druVar.d().getAsString("uniqueId"));
            String asString = druVar.d().getAsString("productId");
            if (!TextUtils.isEmpty(asString) && !TextUtils.isEmpty(deviceId)) {
                QuestionSurveyTable surveyTableByDevice = getSurveyTableByDevice(deviceId);
                if (surveyTableByDevice == null) {
                    insertDeviceToDb(druVar);
                    lValueOf = Long.valueOf(druVar.d().getAsString(EventMonitorRecord.ADD_TIME));
                    times = 0;
                } else {
                    times = surveyTableByDevice.getTimes();
                    lValueOf = Long.valueOf(surveyTableByDevice.getLastSurveyTime());
                }
                if (isTimeToNpsRequest(times, lValueOf.longValue())) {
                    this.mEcologyNpsRequest = true;
                    this.mEcologyRequestTime = times;
                    this.mQuestionSurveyTable = surveyTableByDevice;
                    this.mIsGoSubmitSurveyState = false;
                    lrw.e(deviceId);
                    lrw.c(asString);
                    lrw.b(EcologyNpsUtil.getEcologyModel(asString));
                    lrw.d(String.valueOf(druVar.e()));
                    requestGetDestSite();
                    return;
                }
            }
        }
    }

    public List<dru> getBondEcologyDevice() {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList<ContentValues> arrayListF = dmp.d().f();
        if (arrayListF != null && arrayListF.size() != 0) {
            for (ContentValues contentValues : arrayListF) {
                String asString = contentValues.getAsString("productId");
                String deviceId = getDeviceId(contentValues.getAsString("uniqueId"));
                String asString2 = contentValues.getAsString(EventMonitorRecord.ADD_TIME);
                String asString3 = contentValues.getAsString("kitUuid");
                if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(deviceId)) {
                    LogUtil.j(TAG, "initDeviceList : productId or deviceIdentify is empty");
                } else {
                    if (isWearNpsTime(asString3)) {
                        LogUtil.a(TAG, "is wear device nps time");
                        return new ArrayList();
                    }
                    if (isScaleNpsTime(asString, deviceId)) {
                        LogUtil.a(TAG, "is scale device nps time");
                        return new ArrayList();
                    }
                    int deviceNpsId = EcologyNpsUtil.getDeviceNpsId(asString);
                    if (deviceNpsId != 0) {
                        elh elhVarD = ResourceManager.c().d(asString);
                        dru druVar = new dru();
                        druVar.c(elhVarD);
                        druVar.a(contentValues);
                        setCompareTime(druVar, asString2);
                        druVar.d(deviceNpsId);
                        arrayList2.add(druVar);
                    }
                }
            }
            if (njy.b(arrayList2)) {
                arrayList.addAll(arrayList2);
            }
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    private void setCompareTime(dru druVar, String str) {
        try {
            druVar.d(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "addDeviceTime formatException ");
        }
    }

    private boolean isWearNpsTime(String str) {
        if (TextUtils.isEmpty(str) || !"0".equals(str)) {
            return false;
        }
        setNpsIdentify(mgg.d(TAG));
        QuestionSurveyTable surveyTableByDevice = getSurveyTableByDevice(getDeviceId(lrw.j()));
        if (surveyTableByDevice != null) {
            return isJudgeGetSurveyTimeArrive(surveyTableByDevice.getTimes() + 1, surveyTableByDevice);
        }
        return false;
    }

    private boolean isScaleNpsTime(String str, String str2) {
        QuestionSurveyTable surveyTableByDevice;
        if (isConnected() || !dxm.ad(str) || (surveyTableByDevice = getSurveyTableByDevice(str2)) == null || !isJudgeGetSurveyTimeArrive(surveyTableByDevice.getTimes() + 1, surveyTableByDevice)) {
            return false;
        }
        LogUtil.a(TAG, "isScaleNps");
        return true;
    }

    private boolean isTimeToNpsRequest(int i, long j) {
        LogUtil.a(TAG, "ecology nps time judge");
        int i2 = i + 1;
        if (i2 < 1 || i2 > 2) {
            ReleaseLogUtil.e(TAG_RELEASE, "nps isJudgeGetSurveyTimeArrive GetSurvey times is off limits!");
            return false;
        }
        LogUtil.a(TAG, "nps isJudgeGetSurveyTimeArrive GetSurvey times:", Integer.valueOf(i2));
        boolean zIsFirstTimeNps = i2 == 1 ? isFirstTimeNps(j) : false;
        if (!zIsFirstTimeNps) {
            zIsFirstTimeNps = isSecondTimeNps(j);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "nps Leave isJudgeGetSurveyTimeArrive");
        return zIsFirstTimeNps;
    }

    private boolean isFirstTimeNps(long j) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter first time nps compare");
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        boolean z = jCurrentTimeMillis > SPAN_DAY_SECOND_THIRTY && jCurrentTimeMillis < SPAN_DAY_SECOND_SIXTY;
        LogUtil.a(TAG, "isFirstTimeNps ： ", Boolean.valueOf(z));
        return z;
    }

    private boolean isSecondTimeNps(long j) {
        ReleaseLogUtil.d(TAG_RELEASE, "isSecondTimeNps");
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        boolean z = jCurrentTimeMillis > SPAN_DAY_SECOND_ONE_HUNDRED_EIGHTY && jCurrentTimeMillis < SPAN_DAY_SECOND_TWO_HUNDRED_TEN;
        LogUtil.a(TAG, "isSecondTimeNps :", Boolean.valueOf(z));
        return z;
    }
}
