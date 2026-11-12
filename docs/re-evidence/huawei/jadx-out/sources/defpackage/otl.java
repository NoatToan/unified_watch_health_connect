package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.msgcontent.NotificationMsgContent;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.connectivity.config.AUserProfile;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.impl.PersonalDataCallback;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.AchieveMessage;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.EventRecord;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.manager.model.MessageReminder;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.RecentMonthRecord;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.manager.model.TrackData;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.manager.service.AchieveKakaCheckRecordObserver;
import com.huawei.pluginachievement.manager.service.AchieveKakaEventObserver;
import com.huawei.pluginachievement.manager.service.AchieveLevelInfoObserver;
import com.huawei.pluginachievement.manager.service.AchieveMedalResDownloadObserver;
import com.huawei.pluginachievement.manager.service.AchievePersonalDataObserver;
import com.huawei.pluginachievement.manager.service.AchieveServiceObserver;
import com.huawei.pluginachievement.manager.service.LanguageResReceiver;
import com.huawei.pluginachievement.manager.service.OnceMovementReceiver;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.up.utils.Constants;
import com.huawei.wearengine.sensor.DataResult;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class otl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ExecutorService f44697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile otl f44698c;
    private static long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveKakaEventObserver f44699a;
    private AchieveServiceObserver e;
    private Context f;
    private volatile int h;
    private volatile int i;
    private LanguageResReceiver j;
    private AUserProfile n;
    private OnceMovementReceiver o;
    private Map<Integer, String> k = new HashMap(5);
    private Map<String, String> l = new HashMap(8);
    private int g = -1;

    public int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2 || i == 3) {
                return 4;
            }
            if (i != 4 && i != 7) {
                if (i == 8) {
                    return 8;
                }
                if (i == 21 || i == 22) {
                    return 6;
                }
                if (i != 24 && i != 25) {
                    switch (i) {
                        case 11:
                        case 12:
                            return 5;
                        case 13:
                        case 14:
                            break;
                        default:
                            return 2;
                    }
                }
                return 1;
            }
        }
        return 7;
    }

    private otl(Context context) {
        Context context2 = BaseApplication.getContext();
        this.f = context2;
        e(context2);
    }

    public static otl b(Context context) {
        if (f44697b == null || f44697b.isShutdown()) {
            f44697b = Executors.newSingleThreadExecutor();
            f44697b.execute(new Runnable() { // from class: oto
                @Override // java.lang.Runnable
                public final void run() {
                    otl.e();
                }
            });
        }
        if (f44698c == null) {
            synchronized (otl.class) {
                if (f44698c == null) {
                    f44698c = new otl(context);
                }
            }
        }
        return f44698c;
    }

    static /* synthetic */ void e() {
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "getInstance: getAuthorizationStatus -> false");
        } else {
            ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(Process.myTid())), 1);
        }
    }

    private void e(Context context) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "init()");
        a(context);
    }

    public LanguageResReceiver k() {
        return this.j;
    }

    public OnceMovementReceiver p() {
        return this.o;
    }

    public AUserProfile q() {
        return this.n;
    }

    public void ac() {
        this.n = ah();
        if (EnvironmentUtils.d()) {
            am();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        if (ost.a()) {
            f44697b.execute(new Runnable() { // from class: ots
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.am();
                }
            });
            return;
        }
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.f).getAdapter();
        if (pluginAchieveAdapterJ == null) {
            return;
        }
        Map<String, String> info = pluginAchieveAdapterJ.getInfo(new String[]{"getDeviceInfo"});
        AUserProfile aUserProfile = this.n;
        if (aUserProfile != null) {
            aUserProfile.setBindDeviceType(info.get("productType"));
        }
    }

    private void aa() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "clear()");
        oth.b(this.f).d();
    }

    public static void d() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "release()");
        if (f44698c != null) {
            f44698c.aa();
        }
    }

    private void a(Context context) {
        oth.b(context);
        oso.c(context);
        ac();
    }

    private void al() {
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "registerMovementReceiver enter");
        if (this.o == null) {
            LogUtil.d("PLGACHIEVE_AchieveDataManager", "new mOnceMovementReceiver");
            this.o = new OnceMovementReceiver();
        }
        otd.c(this.f).registerBroadcast(this.o, "com.huawei.healthcloud.action.sendSportTrackDistance");
    }

    public osf b(int i, Map<String, String> map) {
        AUserProfile aUserProfile = this.n;
        if (aUserProfile == null || TextUtils.isEmpty(aUserProfile.getHuid())) {
            ac();
        }
        AUserProfile aUserProfile2 = this.n;
        if (aUserProfile2 != null) {
            map.put("huid", aUserProfile2.getHuid());
        }
        if (!Utils.h()) {
            map.put("huid", "1");
        }
        return oth.b(this.f).c(i, map);
    }

    public boolean a(osf osfVar) {
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "updateData(),params");
        if (osfVar == null) {
            return false;
        }
        AUserProfile aUserProfile = this.n;
        if (aUserProfile != null) {
            osfVar.setHuid(aUserProfile.getHuid());
        }
        return oth.b(this.f).e(osfVar);
    }

    public boolean d(osf osfVar) {
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "updateData(),params");
        if (osfVar == null) {
            return false;
        }
        AUserProfile aUserProfile = this.n;
        if (aUserProfile != null) {
            osfVar.setHuid(aUserProfile.getHuid());
        }
        return oth.b(this.f).d(osfVar);
    }

    public List<osf> d(int i, Map<String, String> map) {
        if (map == null) {
            return new ArrayList(0);
        }
        AUserProfile aUserProfile = this.n;
        if (aUserProfile != null) {
            map.put("huid", aUserProfile.getHuid());
        }
        if (!Utils.h()) {
            map.put("huid", "1");
        }
        return oth.b(this.f).d(i, map);
    }

    private void ak() {
        ouh ouhVarB = ouh.b(this.f);
        if (ouhVarB != null) {
            if (!ouhVarB.e()) {
                ouhVarB.b(this);
            }
            ouhVarB.c();
        }
    }

    public void w() {
        osr osrVarE = osr.e(this.f);
        if (osrVarE != null) {
            if (!osrVarE.b()) {
                osrVarE.a(this);
            }
            osrVarE.e();
        }
    }

    public void b(String str) {
        if (!oru.d()) {
            LogUtil.d("PLGACHIEVE_AchieveDataManager", "enter requestTextureRes return");
            return;
        }
        osr osrVarE = osr.e(this.f);
        if (osrVarE != null) {
            if (!osrVarE.b()) {
                osrVarE.a(this);
            }
            osrVarE.c(str);
        }
    }

    public void y() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "enter requestTextureRes");
        osy osyVarD = osy.d(this.f);
        if (osyVarD != null) {
            if (!osyVarD.d()) {
                osyVarD.b(this);
            }
            osyVarD.a();
        }
    }

    public void b(final CountDownLatch countDownLatch) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "Enter getTotalSteps");
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.f).getAdapter();
        if (pluginAchieveAdapterJ == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "getTotalSteps is null");
            pap.a(countDownLatch);
        } else {
            pluginAchieveAdapterJ.getTotalSteps(new AchieveCallback() { // from class: otl.4
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i, Object obj) {
                    if (obj == null) {
                        LogUtil.a("PLGACHIEVE_AchieveDataManager", "obj is null");
                        pap.a(countDownLatch);
                        return;
                    }
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "getTotalSteps.");
                    int iD = oun.d(String.valueOf(obj));
                    HashMap map = new HashMap(2);
                    map.put("step", Integer.valueOf(iD));
                    otu.b(otl.this.f).c(String.valueOf(KakaConstants.TASK_STEPS_REACH_THREE_THOUSAND), map);
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "deal dealStepsChangeTask.");
                    pap.a(countDownLatch);
                }
            });
        }
    }

    public void e(final CountDownLatch countDownLatch) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "Enter refreshRunTask");
        long jCurrentTimeMillis = System.currentTimeMillis();
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.f).getAdapter();
        if (pluginAchieveAdapterJ == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "getTotalSteps is null");
            pap.a(countDownLatch);
        } else {
            pluginAchieveAdapterJ.readSingleTrackData(this.f, jCurrentTimeMillis, jCurrentTimeMillis, new IBaseResponseCallback() { // from class: otl.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List list;
                    if (obj == null) {
                        LogUtil.j("PLGACHIEVE_AchieveDataManager", "readSingleTrackData is null");
                        pap.a(countDownLatch);
                        return;
                    }
                    if (njy.b(obj, HiHealthData.class)) {
                        list = (List) obj;
                        LogUtil.a("PLGACHIEVE_AchieveDataManager", "readSingleTrackData singleMovementRecords size ", Integer.valueOf(list.size()));
                    } else {
                        list = null;
                    }
                    ArrayList arrayListA = otl.this.a((List<HiHealthData>) list);
                    if (njy.e(arrayListA)) {
                        LogUtil.j("PLGACHIEVE_AchieveDataManager", "readSingleTrackData no single run track record!");
                    } else {
                        LogUtil.a("PLGACHIEVE_AchieveDataManager", "readSingleTrackData maxSingleTrack size ", Integer.valueOf(arrayListA.size()));
                        otl.this.d((ArrayList<TrackData>) arrayListA);
                    }
                    pap.a(countDownLatch);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<TrackData> arrayList) {
        otu.b(this.f).d(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<TrackData> a(List<HiHealthData> list) {
        ArrayList<TrackData> arrayList = new ArrayList<>();
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "the size of single run records is 0! ");
            return arrayList;
        }
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "single records size == ", Integer.valueOf(list.size()));
        for (HiHealthData hiHealthData : list) {
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
                int duplicated = hiTrackMetaData.getDuplicated();
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "getAbnormalTrack=", Integer.valueOf(abnormalTrack), " duplicateResult=", Integer.valueOf(duplicated));
                if (abnormalTrack == 0 && duplicated == 0) {
                    int sportDataSource = hiTrackMetaData.getSportDataSource();
                    if (sportDataSource == 2 || sportDataSource == 3) {
                        LogUtil.j("PLGACHIEVE_AchieveDataManager", "sportDataSource=", Integer.valueOf(sportDataSource));
                    } else {
                        int sportType = hiTrackMetaData.getSportType();
                        int totalDistance = hiTrackMetaData.getTotalDistance();
                        TrackData trackData = new TrackData();
                        trackData.saveDistance(totalDistance * 1.0f);
                        trackData.saveTrackTime(hiHealthData.getStartTime());
                        trackData.setTotalTime(hiTrackMetaData.getTotalTime());
                        trackData.saveType(sportType);
                        trackData.saveEndTime(hiHealthData.getEndTime());
                        trackData.savePaceMap(hiTrackMetaData.getPaceMap());
                        trackData.savePartTimeMap(hiTrackMetaData.getPartTimeMap());
                        trackData.saveBestPace(hiTrackMetaData.getBestPace());
                        trackData.saveSportDataSource(hiTrackMetaData.getSportDataSource());
                        if (oun.c(trackData.acquireType())) {
                            arrayList.add(trackData);
                            break;
                        }
                    }
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("PLGACHIEVE_AchieveDataManager", "trackMetaData is error");
            }
        }
        return arrayList;
    }

    public ArrayList<String> r() {
        long j;
        HashMap map = new HashMap(2);
        ArrayList<String> arrayList = new ArrayList<>(8);
        List<osf> listD = d(8, map);
        List<osf> listD2 = d(9, map);
        if (listD == null || listD2 == null || listD2.isEmpty()) {
            return arrayList;
        }
        ArrayList<String> arrayListC = ozd.c(listD2);
        HashMap map2 = new HashMap(listD.size());
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalLocation) {
                MedalLocation medalLocation = (MedalLocation) osfVar;
                if (!arrayListC.contains(medalLocation.acquireMedalID()) && medalLocation.acquireGainedCount() > 0) {
                    try {
                        j = Long.parseLong(medalLocation.acquireMedalGainedTime());
                    } catch (NumberFormatException unused) {
                        LogUtil.e("PLGACHIEVE_AchieveDataManager", "getData() NumberFormatException");
                        j = 0;
                    }
                    arrayList.add(medalLocation.acquireMedalID());
                    map2.put(medalLocation.acquireMedalID(), Long.valueOf(j));
                }
            }
        }
        return ozb.a(arrayList, map2);
    }

    public Map<String, String> s() {
        osf osfVarB = b(5, new HashMap(2));
        if (osfVarB == null) {
            return new HashMap(0);
        }
        HashMap map = new HashMap(1);
        map.put("timestamp", String.valueOf(((AchieveInfo) osfVarB).getSyncTimestamp()));
        return map;
    }

    public void a(int i, Map<String, String> map) {
        e(i, new JSONObject(map));
    }

    public void a(int i, Map<String, String> map, AchieveCallback achieveCallback) {
        d(i, new JSONObject(map), achieveCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (ost.a()) {
            f44697b.execute(new Runnable() { // from class: otp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44717b.ai();
                }
            });
            return;
        }
        Map<String, String> mapS = s();
        mapS.put("countryCode", LoginInit.getInstance(this.f).getAccountInfo(1010));
        b(mapS);
    }

    public void b(Map<String, String> map) {
        if (!b()) {
            a(0, map);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "doRefreshPersonal isFastRequest!");
        }
    }

    public static boolean b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - d < ProfileExtendConstants.TIME_OUT) {
            return true;
        }
        d = jElapsedRealtime;
        return false;
    }

    public void e(int i, JSONObject jSONObject) {
        d(i, jSONObject, (AchieveCallback) null);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(final int i, final JSONObject jSONObject, final AchieveCallback achieveCallback) {
        if (ost.a()) {
            f44697b.execute(new Runnable() { // from class: otn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44715a.d(i, jSONObject, achieveCallback);
                }
            });
            return;
        }
        if (!oru.c(i)) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "doRefresh: isSupportRequest -> false");
            return;
        }
        if (this.n == null || this.f == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "doRefresh: : mUserProfile or mApplicationContext is null");
            return;
        }
        int iD = d(i);
        this.n.setiVersion(iD);
        if (TextUtils.isEmpty(this.n.getToken())) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "doRefresh: token is empty, refresh");
            PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.f).getAdapter();
            if (pluginAchieveAdapterJ != null) {
                this.n.setToken(pluginAchieveAdapterJ.getInfo(new String[]{"getLoginInfo"}).get("severToken"));
            }
        }
        oso.c(this.f).a(i, this.n, jSONObject, iD, achieveCallback);
    }

    public void c(AchieveObserver achieveObserver) {
        if (achieveObserver == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "registerObserver object maybe not create.");
        } else {
            oth.b(this.f).c(achieveObserver);
        }
    }

    public void d(AchieveObserver achieveObserver) {
        if (achieveObserver == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "unregisterObserver object maybe not create.");
        } else {
            oth.b(this.f).d(achieveObserver);
        }
    }

    public void d(AchievePersonalDataObserver achievePersonalDataObserver) {
        if (achievePersonalDataObserver == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "registerPersonalDataObserver object maybe not create.");
        } else {
            oth.b(this.f).c(achievePersonalDataObserver);
        }
    }

    private AUserProfile ah() {
        AUserProfile aUserProfile = new AUserProfile();
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.f).getAdapter();
        if (pluginAchieveAdapterJ != null) {
            Map<String, String> info = pluginAchieveAdapterJ.getInfo(new String[]{Constants.METHOD_GET_USER_INFO, "getAppInfo", "getPhoneInfo"});
            aUserProfile.setHuid(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
            aUserProfile.setBindDeviceType("");
            aUserProfile.setAppVersion(info.get("grayVersion"));
            aUserProfile.setTokenType(oun.e());
            aUserProfile.setAppId(info.get("appId"));
            aUserProfile.setDeviceType(info.get("deviceType"));
            String str = info.get("deviceId");
            if (pbo.c(str)) {
                str = "clientnull";
            }
            aUserProfile.setDeviceId(str);
            aUserProfile.setSysVersion(info.get("sysVersion"));
            aUserProfile.setAppType(oun.d(info.get("appType")));
            aUserProfile.setiVersion(oun.d(info.get("iversion")));
            aUserProfile.setLanguage(oun.d());
            aUserProfile.setEnvironment(oun.d(info.get("environment")));
            aUserProfile.setUpDeviceType(info.get("upDeviceType"));
        }
        return aUserProfile;
    }

    public MessageObject d(int i, int i2, long j) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgTitle(this.f.getString(R.string.IDS_plugin_achievement_month_push_msg_title));
        messageObject.setMsgContent(this.f.getString(R.string.IDS_plugin_achievement_month_push_msg_content));
        messageObject.setFlag(0);
        messageObject.setMsgType(2);
        messageObject.setWeight(0);
        messageObject.setReadFlag(0);
        messageObject.setExpireTime(c(j).getTime());
        messageObject.setCreateTime(new Date().getTime());
        messageObject.setDetailUri("messagecenter://sportReport?report_stype=0&min_report_no=" + i + "&max_report_no=" + i2);
        messageObject.setPosition(1);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(this.n.getHuid());
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "getReportMsg MessageObject=", messageObject.toString());
        return messageObject;
    }

    public MessageObject e(MedalConfigInfo medalConfigInfo) {
        String strAcquireMedalName = medalConfigInfo == null ? "" : medalConfigInfo.acquireMedalName();
        MessageObject messageObject = new MessageObject();
        try {
            messageObject.setMsgTitle(this.f.getString(R.string.IDS_plugin_achievement_medal_notification));
            messageObject.setMsgContent(this.f.getString(R.string.IDS_plugin_achievement_medal_notification_content, strAcquireMedalName));
        } catch (IllegalFormatConversionException | MissingFormatArgumentException unused) {
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "getAchieveMedalMsg string format exception");
        }
        messageObject.setFlag(0);
        messageObject.setMsgType(2);
        messageObject.setWeight(0);
        messageObject.setReadFlag(0);
        messageObject.setExpireTime(c(medalConfigInfo.acquireEndTime()));
        messageObject.setCreateTime(new Date().getTime());
        messageObject.setDetailUri(b(medalConfigInfo));
        messageObject.setPosition(1);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(this.n.getHuid());
        messageObject.setModule("18");
        messageObject.setMetaData(messageObject.getMsgTitle());
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "getReportMsg MessageObject=", messageObject.toString());
        return messageObject;
    }

    private String b(MedalConfigInfo medalConfigInfo) {
        return "messagecenter://achieveMedal?medalId=" + medalConfigInfo.acquireMedalID();
    }

    private long c(String str) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "string2Long");
            j = 0;
        }
        return j == 0 ? j : j + 259200000;
    }

    public MessageObject b(int i, int i2) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgTitle(this.f.getString(R.string.IDS_plugin_achievement_week_push_msg_title));
        messageObject.setMsgContent(this.f.getString(R.string.IDS_plugin_achievement_week_push_msg_content));
        messageObject.setFlag(0);
        messageObject.setMsgType(2);
        messageObject.setWeight(0);
        messageObject.setReadFlag(0);
        messageObject.setExpireTime(0L);
        messageObject.setCreateTime(new Date().getTime());
        messageObject.setDetailUri("messagecenter://sportReport?report_stype=1&min_report_no=" + i + "&max_report_no=" + i2);
        messageObject.setPosition(1);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(this.n.getHuid());
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "getReportMsg MessageObject=", messageObject.toString());
        return messageObject;
    }

    private Date c(long j) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(new Date(j));
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        if (i3 == 11) {
            i2++;
            i = i3 - 11;
        } else {
            i = i3 + 1;
        }
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        calendar.set(1, i2);
        calendar.set(2, i);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, i4);
        calendar.set(12, i5);
        calendar.set(13, i6);
        return calendar.getTime();
    }

    public void e(UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "enter processMessageRemind messages");
        MessageReminder msgReminder = userAchieveWrapper.getMsgReminder();
        if (msgReminder != null) {
            List<AchieveMessage> listE = e(msgReminder.getMessages());
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "processMessageRemind messages:", listE);
            if (listE != null) {
                for (AchieveMessage achieveMessage : listE) {
                    String str = achieveMessage.getMsgType() + achieveMessage.acquireMedalId() + achieveMessage.acquireMedalType() + achieveMessage.acquireMedalLevel();
                    boolean zContainsKey = this.l.containsKey(str);
                    boolean z = false;
                    boolean zC = c(achieveMessage.acquireMedalId(), achieveMessage.getGainTime(), false);
                    if (pax.n(achieveMessage.acquireMedalType())) {
                        str = achieveMessage.getMsgType() + achieveMessage.acquireMedalId() + achieveMessage.acquireMedalType() + achieveMessage.acquireMedalLevel() + achieveMessage.getGainTime();
                        LogUtil.a("PLGACHIEVE_AchieveDataManager", "processMessageRemind key = ", str);
                        zContainsKey = this.l.containsKey(str);
                    } else {
                        z = !zC;
                    }
                    boolean zD = d(achieveMessage.acquireMedalId());
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "processMessageRemind isContainKey = ", Boolean.valueOf(zContainsKey), " isRepeat = ", Boolean.valueOf(z), " isOverTime = ", Boolean.valueOf(zD));
                    if (zContainsKey || z || zD) {
                        LogUtil.j("PLGACHIEVE_AchieveDataManager", "processMessageRemind repeat msg!");
                    } else {
                        this.l.put(str, str);
                        if (achieveMessage.getMsgType() == 1) {
                            LogUtil.a("PLGACHIEVE_AchieveDataManager", "new Version not deal level msg!");
                        } else {
                            b(achieveMessage);
                            LogUtil.a("PLGACHIEVE_AchieveDataManager", "sendMessageToDevice Remind medalId:", achieveMessage.acquireMedalId());
                            e(achieveMessage);
                        }
                    }
                }
            }
        }
        ad();
    }

    private void b(final AchieveMessage achieveMessage) {
        if (achieveMessage == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "AchieveMessage msg is null!");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: otl.7
                @Override // java.lang.Runnable
                public void run() {
                    MedalLocation medalLocation = new MedalLocation();
                    medalLocation.saveGainedCount(1);
                    if (pax.n(achieveMessage.acquireMedalType())) {
                        medalLocation.saveGainedCount(achieveMessage.acquireGainCount() != 0 ? achieveMessage.acquireGainCount() : 1);
                    }
                    medalLocation.saveMedalGainedTime(achieveMessage.getGainTime());
                    medalLocation.saveMedalID(achieveMessage.acquireMedalId());
                    otl.this.a(medalLocation);
                }
            });
        }
    }

    private void ad() {
        String strE = osa.e(this.f, "_uploadMedal");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealNotUploadMedal medal is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealNotUploadMedal=", strE);
        final String[] strArrSplit = strE.split(",");
        f44697b.execute(new Runnable() { // from class: otl.6
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(strArrSplit.length);
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                List<osf> listD = otl.this.d(9, new HashMap(2));
                if (listD == null) {
                    return;
                }
                for (osf osfVar : listD) {
                    if (osfVar instanceof MedalConfigInfo) {
                        MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                        if (arrayList.contains(medalConfigInfo.acquireMedalID())) {
                            LogUtil.a("PLGACHIEVE_AchieveDataManager", "NotUploadMedal medalID:", medalConfigInfo.acquireMedalID());
                            Map<String, String> mapC = otl.this.c(medalConfigInfo.acquireMedalID(), String.valueOf(medalConfigInfo.acquireMedalLevel()));
                            mapC.put("countryCode", LoginInit.getInstance(otl.this.f).getAccountInfo(1010));
                            otl.this.a(7, mapC);
                        }
                    }
                }
            }
        });
    }

    public Map<String, String> c(String str, String str2) {
        return a(str, str2, System.currentTimeMillis());
    }

    public Map<String, String> a(String str, String str2, long j) {
        HashMap map = new HashMap(3);
        map.put(ParsedFieldTag.MEDAL_ID, str);
        map.put(ParsedFieldTag.MEDAL_LEVEL, str2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        map.put(ParsedFieldTag.TAKE_DATE, simpleDateFormat.format(new Date(j)));
        return map;
    }

    private List<AchieveMessage> e(List<AchieveMessage> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        HashMap map = new HashMap(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        for (AchieveMessage achieveMessage : list) {
            String strAcquireMedalType = achieveMessage.acquireMedalType();
            if (map.get(strAcquireMedalType) != null) {
                if (((Integer) map.get(strAcquireMedalType)).intValue() < achieveMessage.acquireMedalLevel()) {
                    map.put(achieveMessage.acquireMedalType(), Integer.valueOf(achieveMessage.acquireMedalLevel()));
                }
            } else {
                map.put(achieveMessage.acquireMedalType(), Integer.valueOf(achieveMessage.acquireMedalLevel()));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            for (AchieveMessage achieveMessage2 : list) {
                if (str.equals(achieveMessage2.acquireMedalType()) && iIntValue == achieveMessage2.acquireMedalLevel()) {
                    arrayList.add(achieveMessage2);
                    break;
                }
            }
        }
        return arrayList;
    }

    public void x() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "registerAchieveMentReciever() enter");
        if (this.j == null) {
            LogUtil.d("PLGACHIEVE_AchieveDataManager", "new LanguageResReceiver");
            this.j = new LanguageResReceiver();
        }
        otd.c(this.f).registerBroadcast(this.j, "android.intent.action.LOCALE_CHANGED");
        al();
    }

    public void v() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "noticeAchieveDialog()");
        if (this.f == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "popAchieveDialog() Context is null");
        } else {
            ac();
        }
    }

    public void u() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "popAchieveDialog()");
        if (this.f == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "popAchieveDialog() Context is null");
            return;
        }
        ac();
        AchieveMedalResDownloadObserver achieveMedalResDownloadObserver = new AchieveMedalResDownloadObserver(this.f);
        AchieveLevelInfoObserver achieveLevelInfoObserver = new AchieveLevelInfoObserver(this.f);
        c(achieveMedalResDownloadObserver);
        c(achieveLevelInfoObserver);
        if (this.e == null) {
            this.e = new AchieveServiceObserver(this.f);
        }
        c(this.e);
        if (this.f44699a == null) {
            this.f44699a = new AchieveKakaEventObserver(this.f);
        }
        c(this.f44699a);
        a();
        ae();
        ai();
        ott.e(this.f).d();
        a(11, new HashMap(8));
        a(13, new HashMap(8));
        aj();
        owj.b(this.f).a(this.f);
        z();
        ak();
        b((CountDownLatch) null);
        g();
        af();
        dds.e().syncInit();
        fwr.d().initThirdAuthorizeMgr();
        osa.b(this.f, "_medalPngStatusDownloadDoing", "done");
        osa.b(this.f, "_medalTextureStatusDownloadDoing", "done");
        osa.b(this.f, "generateMedalTime", "0");
    }

    private void ae() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "doMsgRemindRefresh enter.");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: otl.10
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "doMsgRemindRefresh doRefresh MSG_REMIND.");
                otl.this.a(4, new HashMap(8));
                otu.b(otl.this.f).d();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void af() {
        long j = CommonUtil.j(SharedPreferenceManager.e(this.f, Integer.toString(10000), "hw_health_start_count_key"));
        if (j == 1) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "dealOverseaMedalData startCount = ", Long.valueOf(j));
            return;
        }
        ag();
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealOverseaMedalData generateMedalData.");
        owj.b(this.f).e(this.f);
    }

    private void ag() {
        ozd.b(new AchieveCallback() { // from class: otl.8
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "initMedalLayoutData success.");
            }
        });
    }

    public void a() {
        if (CommonUtil.ca()) {
            return;
        }
        if (TextUtils.isEmpty(osa.e(this.f, "clearReportContent"))) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "enter clearReportData()");
            SingleDayRecord singleDayRecord = new SingleDayRecord();
            TotalRecord totalRecord = new TotalRecord();
            AUserProfile aUserProfile = this.n;
            if (aUserProfile != null) {
                singleDayRecord.setHuid(aUserProfile.getHuid());
                oth.b(this.f).c(singleDayRecord);
                oth.b(this.f).c(totalRecord);
                osa.b(this.f, "clearReportContent", "done");
                return;
            }
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "clearReportData mUserProfile is null");
            return;
        }
        if (TextUtils.isEmpty(osa.e(this.f, "clearReportOverSea"))) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "enter clearReportData()");
            SingleDayRecord singleDayRecord2 = new SingleDayRecord();
            TotalRecord totalRecord2 = new TotalRecord();
            AUserProfile aUserProfile2 = this.n;
            if (aUserProfile2 != null) {
                singleDayRecord2.setHuid(aUserProfile2.getHuid());
                totalRecord2.setHuid(this.n.getHuid());
                oth.b(this.f).c(singleDayRecord2);
                oth.b(this.f).c(totalRecord2);
                osa.b(this.f, "clearReportOverSea", "done");
                return;
            }
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "clearReportData mUserProfile is null");
        }
    }

    public void j() {
        c(new AchieveServiceObserver(this.f));
        a(4, new HashMap(8));
    }

    private void aj() {
        f44697b.execute(new Runnable() { // from class: otl.9
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(8);
                if (oun.e(otl.this.f)) {
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "saveCurrentLocalLanguage");
                    oun.d(otl.this.f);
                    map.put("countryCode", LoginInit.getInstance(otl.this.f).getAccountInfo(1010));
                    otl.this.a(8, map);
                    osa.b(otl.this.f, "MedalConfigTime", "");
                    return;
                }
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "requestAllMedalConfig local language not changed");
                List<osf> listD = otl.this.d(9, new HashMap(2));
                if (listD != null) {
                    long jMax = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (osf osfVar : listD) {
                        if (osfVar instanceof MedalConfigInfo) {
                            MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                            jMax = Math.max(medalConfigInfo.acquireTimestamp(), jMax);
                            if ("A5".equals(medalConfigInfo.acquireMedalType())) {
                                z = true;
                            }
                            if ("D1".equals(medalConfigInfo.acquireMedalType())) {
                                z2 = true;
                            }
                            if ("B11".equals(medalConfigInfo.acquireMedalType())) {
                                z3 = true;
                            }
                        }
                    }
                    osa.b(otl.this.f, "MedalConfigTime", String.valueOf(jMax));
                    String strB = otl.this.b(jMax, z, z2, z3);
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "requestAllMedalConfig with timestamp ", strB);
                    map.put("timestamp", strB);
                    map.put("countryCode", LoginInit.getInstance(otl.this.f).getAccountInfo(1010));
                    otl.this.a(8, map);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(long j, boolean z, boolean z2, boolean z3) {
        long j2 = CommonUtil.cl() ? 1687968000000L : 1698768000000L;
        if (!z && j > 1675785600000L) {
            return String.valueOf(1675785600000L);
        }
        if (!z2 && j > 1687968000000L) {
            return String.valueOf(1687968000000L);
        }
        if (!z3 && j > j2) {
            return String.valueOf(j2);
        }
        return String.valueOf(j);
    }

    private void z() {
        f44697b.execute(new Runnable() { // from class: otl.11
            @Override // java.lang.Runnable
            public void run() {
                List<osf> listD = otl.this.d(10, new HashMap(2));
                if (listD == null) {
                    return;
                }
                for (osf osfVar : listD) {
                    EventRecord eventRecord = osfVar instanceof EventRecord ? (EventRecord) osfVar : null;
                    HashMap map = new HashMap(6);
                    if (eventRecord != null) {
                        LogUtil.d("PLGACHIEVE_AchieveDataManager", "medalConfigInfo=", eventRecord.toString());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        map.put("eventType", String.valueOf(eventRecord.acquireEventType()));
                        map.put(MedalConstants.EVENT_KEY, eventRecord.acquireKey());
                        map.put(MedalConstants.EVENT_KEYTYPE, eventRecord.acquireKeyType());
                        map.put("value", "true");
                        map.put("timestamp", String.valueOf(jCurrentTimeMillis));
                        map.put(ParsedFieldTag.MEDAL_ID, eventRecord.acquireMedalID());
                        if (MedalConstants.EVENT_NOT_UPLOAD.equals(eventRecord.acquireEventStatus())) {
                            otl.this.a(9, map);
                        }
                    }
                }
            }
        });
    }

    public void c() {
        otg.d(f44698c, this.f);
    }

    public void g() {
        if (ab()) {
            otu.b(this.f).c();
            f44697b.execute(new Runnable() { // from class: otl.12
                @Override // java.lang.Runnable
                public void run() {
                    MedalConfigInfo medalConfigInfo;
                    String strAcquireMedalType;
                    List<osf> listD = otl.this.d(9, new HashMap(2));
                    if (listD == null) {
                        return;
                    }
                    for (osf osfVar : listD) {
                        if ((osfVar instanceof MedalConfigInfo) && (strAcquireMedalType = (medalConfigInfo = (MedalConfigInfo) osfVar).acquireMedalType()) != null && strAcquireMedalType.length() >= 3) {
                            otl.this.a(medalConfigInfo);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MedalConfigInfo medalConfigInfo) {
        long j;
        long j2;
        long j3;
        long j4 = 0;
        if (oun.a(medalConfigInfo.acquireStartTime()) && oun.a(medalConfigInfo.acquireEndTime())) {
            try {
                j3 = Long.parseLong(medalConfigInfo.acquireStartTime());
                try {
                    j4 = Long.parseLong(medalConfigInfo.acquireEndTime());
                } catch (NumberFormatException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveDataManager", "requestSportData NumberFormatException!");
                }
            } catch (NumberFormatException unused2) {
                j3 = 0;
            }
            j = j3;
            j2 = j4;
        } else {
            j = 0;
            j2 = 0;
        }
        if (System.currentTimeMillis() > 86400000 + j2 || System.currentTimeMillis() < j) {
            return;
        }
        if (!c(medalConfigInfo.acquireMedalID(), "", true)) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "requestSportData judgeMedalStatus repeat medal!");
        } else {
            e(medalConfigInfo, j, j2);
        }
    }

    private void e(MedalConfigInfo medalConfigInfo, long j, long j2) {
        final int iAcquireMedalUnit = medalConfigInfo.acquireMedalUnit();
        final String strAcquireMedalID = medalConfigInfo.acquireMedalID();
        final String strAcquireMedalType = medalConfigInfo.acquireMedalType();
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealPeriodSportMedal medalId == ", strAcquireMedalID, " medalUnit == ", Integer.valueOf(iAcquireMedalUnit), " medalType == ", strAcquireMedalType);
        if (pax.l(strAcquireMedalType)) {
            return;
        }
        final int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
        if (otz.e(medalConfigInfo, this.f, j, j2)) {
            c(strAcquireMedalID, strAcquireMedalType, iAcquireMedalLevel);
        }
        b(medalConfigInfo, j, j2);
        if (iAcquireMedalUnit != 4 && iAcquireMedalUnit != 6) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "medalUnit Invalid");
        } else {
            oru.a(this.f).getAdapter().toReadAggregateData(new AchieveCallback() { // from class: otm
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public final void onResponse(int i, Object obj) {
                    this.f44712a.a(iAcquireMedalUnit, iAcquireMedalLevel, strAcquireMedalID, strAcquireMedalType, i, obj);
                }
            }, this.f, oun.a(j, true), oun.a(j2, false));
        }
    }

    /* synthetic */ void a(int i, int i2, String str, String str2, int i3, Object obj) {
        int i4;
        if (obj == null) {
            return;
        }
        try {
            List list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
            if (list == null) {
                LogUtil.j("PLGACHIEVE_AchieveDataManager", "dataInfos is null");
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            if (i == 4) {
                i4 = hiHealthData.getInt(ParsedFieldTag.STEP_SUM);
            } else if (i != 6) {
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "medalUnit ！= UNIT_STEP and medalUnit ！= UNIT_CAL");
                i4 = -1;
            } else {
                i4 = hiHealthData.getInt(ParsedFieldTag.CALORIES_SUM);
            }
            LogUtil.d("PLGACHIEVE_AchieveDataManager", "requestSportData() dataInfos value:", Integer.valueOf(i4), "medalUnit=", Integer.valueOf(i));
            if (i4 >= i2) {
                c(str, str2, i2);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "requestSportData data ClassCastException");
        }
    }

    public void b(MedalConfigInfo medalConfigInfo, long j, long j2) {
        if (medalConfigInfo == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "dealPeriodSportMedal medalConfigInfo is null!");
            return;
        }
        int iAcquireActionType = medalConfigInfo.acquireActionType();
        if (iAcquireActionType == 11 || iAcquireActionType == 12 || iAcquireActionType == 10) {
            e(j, j2, iAcquireActionType, medalConfigInfo);
        }
    }

    public void e(long j, long j2, final int i, final MedalConfigInfo medalConfigInfo) {
        int i2;
        if (i == 11) {
            i2 = 258;
        } else if (i == 12) {
            i2 = 259;
        } else {
            if (i != 10) {
                LogUtil.j("PLGACHIEVE_AchieveDataManager", "dealSportMedal no achieve type!");
                return;
            }
            i2 = 257;
        }
        int i3 = i2;
        long jA = oun.a(j, true);
        long jA2 = oun.a(j2, false);
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealSportMedal startTime == ", Long.valueOf(jA), " endTime == ", Long.valueOf(jA2), " type == ", Integer.valueOf(i));
        oru.a(this.f).getAdapter().getTrackListData(this.f, jA, jA2, i3, new AchieveCallback() { // from class: otl.2
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i4, final Object obj) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: otl.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Object obj2 = obj;
                        if (obj2 != null) {
                            try {
                                otl.this.b(i, medalConfigInfo, (List<HiHealthData>) (njy.b(obj2, HiHealthData.class) ? (List) obj : null));
                                return;
                            } catch (ClassCastException unused) {
                                LogUtil.e("PLGACHIEVE_AchieveDataManager", "dealRunData data ClassCastException");
                                return;
                            }
                        }
                        LogUtil.j("PLGACHIEVE_AchieveDataManager", "dealRunData obj null");
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, MedalConfigInfo medalConfigInfo, List<HiHealthData> list) {
        if (njy.e(list) || medalConfigInfo == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "computeRunTrackInfo dataInfos isEmpty || medalConfigInfo == null!");
            return;
        }
        String strAcquireMedalID = medalConfigInfo.acquireMedalID();
        String strAcquireMedalType = medalConfigInfo.acquireMedalType();
        int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealSportMedal medalId == ", strAcquireMedalID, " medalLevel == ", Integer.valueOf(iAcquireMedalLevel), " medalType == ", strAcquireMedalType);
        Iterator<HiHealthData> it = list.iterator();
        int totalDistance = 0;
        while (it.hasNext()) {
            HiTrackMetaData hiTrackMetaDataE = owj.b(this.f).e(it.next().getMetaData());
            if (hiTrackMetaDataE != null) {
                totalDistance += hiTrackMetaDataE.getTotalDistance();
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "dealSportMedal sumValue ==**", Integer.valueOf(totalDistance), "**type== **", Integer.valueOf(i));
        if (totalDistance >= iAcquireMedalLevel * 1000) {
            c(strAcquireMedalID, strAcquireMedalType, iAcquireMedalLevel);
        }
    }

    public void c(String str, String str2, int i) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "enter generateMedalAndShowDialog!sendMessageToDevice, medalId=", str);
        a(str, str2, i, 0);
    }

    public void a(String str, String str2, int i, int i2) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "enter generateMedalAndShowDialog!sendMessageToDevice, medalId=", str);
        MedalLocation medalLocation = new MedalLocation();
        int i3 = i2 + 1;
        medalLocation.saveGainedCount(i3);
        medalLocation.saveMedalGainedTime(String.valueOf(System.currentTimeMillis()));
        medalLocation.saveMedalID(str);
        a(medalLocation);
        AchieveMessage achieveMessage = new AchieveMessage();
        achieveMessage.setMsgType(2);
        achieveMessage.saveMedalType(str2);
        achieveMessage.saveMedalLevel(i);
        achieveMessage.saveMedalId(str);
        achieveMessage.saveGainCount(i3);
        e(achieveMessage);
    }

    private void e(final AchieveMessage achieveMessage) {
        if (achieveMessage == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "popMedalDialog: achieveMessage is null");
            return;
        }
        String strAcquireMedalId = achieveMessage.acquireMedalId();
        String strAcquireMedalType = achieveMessage.acquireMedalType();
        if (pax.m(strAcquireMedalType) && pax.f(strAcquireMedalId)) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "popMedalDialog: intercept -> " + strAcquireMedalId);
            return;
        }
        b(strAcquireMedalId, strAcquireMedalType, new BaseResponseCallback() { // from class: otq
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f44718a.d(achieveMessage, i, (Boolean) obj);
            }
        });
    }

    /* synthetic */ void d(AchieveMessage achieveMessage, int i, Boolean bool) {
        LogUtil.j("PLGACHIEVE_AchieveDataManager", "sendMessageToDevice isSendDevice:", bool);
        if (bool.booleanValue()) {
            return;
        }
        a(achieveMessage);
    }

    private void a(AchieveMessage achieveMessage) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "intentMedalDialog medalId ", achieveMessage.acquireMedalId(), " medalLevel ", Integer.valueOf(achieveMessage.acquireMedalLevel()));
        if (otv.c(achieveMessage)) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "intentMedalDialog: interceptMedal -> true");
            return;
        }
        if (!BaseApplication.isRunningForeground() || CommonUtil.x(this.f)) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "intentMedalDialog app is isRunningBackground!");
            return;
        }
        if (nty.d()) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "intentMedalDialog app is sportOrFitting!");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f, PersonalData.CLASS_NAME_PERSONAL_MEDAL_MESSAGE_DIALOG);
        intent.putExtra("message", achieveMessage);
        intent.addFlags(268435456);
        this.f.startActivity(intent);
    }

    private void b(String str, String str2, BaseResponseCallback<Boolean> baseResponseCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            baseResponseCallback.onResponse(0, false);
        } else {
            dds.e().sendMessageToDevice(2, str, str2, baseResponseCallback);
            osa.b(this.f, "_achieve_gain_id_medal", str);
        }
    }

    public void c(int i, String str, long j) {
        if (!BaseApplication.isRunningForeground() || this.f == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "showReportDialog: running in the background or the context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f, PersonalData.CLASS_NAME_PERSONAL_REPORT_MESSAGE_DIALOG);
        intent.putExtra("dialogType", i);
        intent.putExtra("dialogValue", str);
        intent.putExtra("dialogDate", j);
        intent.addFlags(268435456);
        this.f.startActivity(intent);
    }

    public boolean c(String str, String str2, boolean z) {
        HashMap map = new HashMap(2);
        map.put("medalID", str);
        osf osfVarB = b(8, map);
        if (osfVarB == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "judgeMedalStatus data == null");
            return true;
        }
        if (osfVarB instanceof MedalLocation) {
            MedalLocation medalLocation = (MedalLocation) osfVarB;
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "judgeMedalStatus Medal == ", medalLocation.acquireMedalID(), " gainedCount == ", Integer.valueOf(medalLocation.acquireGainedCount()));
            if (medalLocation.acquireGainedCount() > 0) {
                if (z) {
                    LogUtil.j("PLGACHIEVE_AchieveDataManager", "judgeMedalStatus flag == ", Boolean.valueOf(z));
                    return false;
                }
                String strAcquireMedalGainedTime = medalLocation.acquireMedalGainedTime();
                if (!strAcquireMedalGainedTime.equals(str2)) {
                    LogUtil.j("PLGACHIEVE_AchieveDataManager", "judgeMedalStatus medalGainTime.equals(gainTime) medalGainTime ", strAcquireMedalGainedTime, " gainTime ", str2);
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<String> l() {
        ArrayList<String> arrayListT = t();
        ArrayList<String> arrayListO = njy.e(arrayListT) ? o() : arrayListT;
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "lightList sql ", Integer.valueOf(arrayListT.size()), " list ", Integer.valueOf(arrayListO.size()));
        return arrayListO;
    }

    public ArrayList<String> t() {
        ArrayList<String> arrayList = new ArrayList<>(0);
        List<osf> listD = d(8, new HashMap(2));
        if (listD == null) {
            return arrayList;
        }
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalLocation) {
                MedalLocation medalLocation = (MedalLocation) osfVar;
                if (medalLocation.acquireGainedCount() > 0) {
                    arrayList.add(medalLocation.acquireMedalID());
                }
            }
        }
        ReleaseLogUtil.d("PLGACHIEVE_AchieveDataManager", "getMedalLightList: local -> ", arrayList.toString());
        return arrayList;
    }

    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>(0);
        JSONArray jSONArrayA = a(osa.e(BaseApplication.getContext(), "_medalGainLoadInfo"));
        if (jSONArrayA == null) {
            return arrayList;
        }
        int length = jSONArrayA.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArrayA.opt(i);
            if (objOpt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objOpt;
                if (osv.a(ParsedFieldTag.GAIN_COUNT, jSONObject) > 0) {
                    arrayList.add(osv.c(ParsedFieldTag.MEDAL_ID, jSONObject));
                }
            }
        }
        ReleaseLogUtil.d("PLGACHIEVE_AchieveDataManager", "getMedalLightList: cloud -> ", arrayList.toString());
        return arrayList;
    }

    private JSONArray a(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "getCloudMedalLightList Exception:", e.getMessage());
            return null;
        }
    }

    public boolean d(String str) {
        MedalConfigInfo medalConfigInfo;
        String strAcquireMedalType;
        long j;
        HashMap map = new HashMap(2);
        map.put("medalID", str);
        osf osfVarB = b(9, map);
        if (osfVarB == null) {
            LogUtil.j("PLGACHIEVE_AchieveDataManager", "judgeMedalOverTime data == null");
            return false;
        }
        if ((osfVarB instanceof MedalConfigInfo) && (strAcquireMedalType = (medalConfigInfo = (MedalConfigInfo) osfVarB).acquireMedalType()) != null && strAcquireMedalType.length() >= 3) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strAcquireEndTime = medalConfigInfo.acquireEndTime();
            if (TextUtils.isEmpty(strAcquireEndTime)) {
                LogUtil.j("PLGACHIEVE_AchieveDataManager", "judgeMedalOverTime endTime isEmpty");
                return false;
            }
            try {
                j = Long.parseLong(strAcquireEndTime);
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_AchieveDataManager", "isNeedShow NumberFormatException");
                j = 0;
            }
            if (jCurrentTimeMillis - 259200000 > j) {
                LogUtil.j("PLGACHIEVE_AchieveDataManager", "isNeedShow =false");
                return true;
            }
        }
        return false;
    }

    public void f() {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateAchieveMessage()：");
        AchieveObserver achieveServiceObserver = new AchieveServiceObserver(this.f);
        this.h = -1;
        this.i = -1;
        c(achieveServiceObserver);
        HashMap map = new HashMap(2);
        map.put("reportNo", "0");
        osf osfVarB = b(3, map);
        HashMap map2 = new HashMap(2);
        map2.put("reportNo", "0");
        if (osfVarB instanceof RecentWeekRecord) {
            this.h = ((RecentWeekRecord) osfVarB).acquireReportNo();
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateReportMessage() mLocalWeekReportNo = ", Integer.valueOf(this.h));
        } else {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateReportMessage() weekRecord is null!");
            this.h = 0;
        }
        osf osfVarB2 = b(4, map2);
        if (osfVarB2 instanceof RecentMonthRecord) {
            this.i = ((RecentMonthRecord) osfVarB2).acquireReportNo();
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateReportMessage() mLocalMonthReportNo = ", Integer.valueOf(this.i));
        } else {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateReportMessage() monthRecord is null!");
            this.i = 0;
        }
        HashMap map3 = new HashMap(2);
        map3.put(DBSessionCommon.COLUMN_TIME_ZONE, CommonUtil.ak());
        a(2, map3);
    }

    public void i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = osa.e(this.f, "_achieve_datastr");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        String strSubstring = String.valueOf(new Timestamp(jCurrentTimeMillis)).substring(0, 10);
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateKakaMessage() dataStr=", strE, " todayStr=", strSubstring);
        if (strE.equals(strSubstring)) {
            return;
        }
        osa.b(this.f, "_achieve_datastr", null);
        osa.b(this.f, "_achieve_flag", null);
        osa.b(this.f, "_achieve_calorie", null);
        osa.b(this.f, "_achieve_msg_id_kaka", null);
    }

    public PersonalData c(PersonalDataCallback personalDataCallback, Context context) {
        LogUtil.a("PLGACHIEVE_AchieveDataManager", "getPersonalData()");
        if (personalDataCallback == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "getPersonalData() (callback == null)");
            return null;
        }
        ac();
        if (!oru.d()) {
            return PersonalData.builder().build();
        }
        AchievePersonalDataObserver achievePersonalDataObserver = new AchievePersonalDataObserver(this.f);
        oun.b(this.k, this.f);
        achievePersonalDataObserver.c(personalDataCallback);
        d(achievePersonalDataObserver);
        Map<String, String> mapS = s();
        mapS.put("countryCode", LoginInit.getInstance(this.f).getAccountInfo(1010));
        b(mapS);
        return c(context);
    }

    public PersonalData c(Context context) {
        int iE;
        String str;
        Map<String, String> map = new HashMap<>(2);
        HashMap map2 = new HashMap(2);
        map2.put("reportNo", osa.c(context, "_weekReportNo", "0"));
        osf osfVarB = b(3, map2);
        osf osfVarB2 = b(1, map);
        osf osfVarB3 = b(5, map);
        AchieveInfo achieveInfo = osfVarB3 instanceof AchieveInfo ? (AchieveInfo) osfVarB3 : null;
        osf osfVarB4 = b(14, map);
        if (osfVarB4 instanceof AchieveUserLevelInfo) {
            iE = ((AchieveUserLevelInfo) osfVarB4).acquireUserLevel();
        } else {
            iE = achieveInfo != null ? paq.e(achieveInfo.getUserReachStandardDays()) : 1;
        }
        osf osfVarB5 = b(2, new HashMap<>(2));
        PersonalData.Builder builderWithPersonalLevel = PersonalData.builder().withMedals(achieveInfo != null ? achieveInfo.acquireMedals() : "").withPersonalLevel(iE);
        if (achieveInfo != null) {
            str = this.k.get(Integer.valueOf(achieveInfo.getUserLevel()));
        } else {
            str = this.k.get(1);
        }
        PersonalData.Builder builderWithStepRanking = builderWithPersonalLevel.withPersonalLevelDesc(str).withStepRanking(osfVarB instanceof RecentWeekRecord ? ((RecentWeekRecord) osfVarB).acquireStepsRanking() : 0.0d);
        boolean z = osfVarB2 instanceof TotalRecord;
        return builderWithStepRanking.withSumKakaNum(achieveInfo != null ? achieveInfo.getUserPoint() : 0).withSumDays(z ? ((TotalRecord) osfVarB2).getDays() : 0).withSumSteps(z ? ((TotalRecord) osfVarB2).getSteps() : 0.0d).withBestDaySteps(osfVarB5 instanceof SingleDayRecord ? ((SingleDayRecord) osfVarB5).getSteps() : 0).build();
    }

    public void h() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = osa.e(this.f, "_achieve_history_best_data");
        if (!TextUtils.isEmpty(strE)) {
            String strSubstring = String.valueOf(new Timestamp(jCurrentTimeMillis)).substring(0, 10);
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateHistoryBestMsg() dataStr=", strE, " todayStr=", strSubstring);
            if (strE.equals(strSubstring)) {
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "today allready send history best msg");
                return;
            }
        }
        if (oru.a(this.f).getAdapter() != null) {
            oru.a(this.f).getAdapter().getTotalSteps(new AchieveCallback() { // from class: otl.1
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i, Object obj) {
                    if (obj == null) {
                        LogUtil.a("PLGACHIEVE_AchieveDataManager", "obj is null");
                    } else {
                        otl.this.e(oun.d(String.valueOf(obj)), jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final long j) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: otl.5
            @Override // java.lang.Runnable
            public void run() {
                osf osfVarB = otl.this.b(2, new HashMap(2));
                int steps = osfVarB instanceof SingleDayRecord ? ((SingleDayRecord) osfVarB).getSteps() : 0;
                LogUtil.d("PLGACHIEVE_AchieveDataManager", "generateHistoryBestMsg() cur best step=", Integer.valueOf(steps));
                if (i <= steps || steps == 0) {
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateHistoryBestMsg() not more than history best");
                } else {
                    LogUtil.a("PLGACHIEVE_AchieveDataManager", "Now generateHistoryBestMsg ");
                    otl.this.a(i, j);
                }
            }
        });
    }

    public void b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = osa.e(this.f, "_achieve_history_best_data");
        if (!TextUtils.isEmpty(strE)) {
            String strSubstring = String.valueOf(new Timestamp(jCurrentTimeMillis)).substring(0, 10);
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateHistoryMostStep() dataStr=", strE, " todayStr=", strSubstring);
            if (strE.equals(strSubstring)) {
                LogUtil.a("PLGACHIEVE_AchieveDataManager", "today allready send history best msg");
                return;
            }
        }
        if (this.g < 0) {
            osf osfVarB = b(2, new HashMap(2));
            this.g = osfVarB instanceof SingleDayRecord ? ((SingleDayRecord) osfVarB).getSteps() : 0;
        }
        int i2 = this.g;
        if (i <= i2 || i2 == 0) {
            LogUtil.a("PLGACHIEVE_AchieveDataManager", "generateHistoryBestMsg() not more than history best");
        } else {
            this.g = -1;
            a(i, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, long j) {
        String huid;
        AUserProfile aUserProfile = this.n;
        if (aUserProfile == null) {
            huid = "";
        } else {
            huid = aUserProfile.getHuid();
        }
        if (oru.a(this.f).getAdapter() != null) {
            MessageObject messageObject = new MessageObject();
            messageObject.setModule("achievement");
            messageObject.setType(NotificationMsgContent.MSG_TYPE_HISTORY_BEST_MSG);
            messageObject.setMsgTitle(this.f.getResources().getString(R.string.IDS_messagecenter_sport_goal_title));
            messageObject.setExpireTime(oul.d(oul.e("23:59:59")));
            messageObject.setDetailUri("messagecenter://historyBestMessage");
            messageObject.setHuid(huid);
            messageObject.setCreateTime(j);
            messageObject.setFlag(0);
            messageObject.setWeight(0);
            messageObject.setReadFlag(0);
            messageObject.setPosition(1);
            messageObject.setMsgType(2);
            messageObject.setNotified(0);
            messageObject.setImgUri("assets://localMessageIcon/ic_medal.png");
            messageObject.setMsgPosition(11);
            oru.a(this.f).getAdapter().generateMessage(messageObject);
            LogUtil.d("PLGACHIEVE_AchieveDataManager", "generateHistoryBestMsg messageObject=", messageObject);
        }
        LogUtil.d("PLGACHIEVE_AchieveDataManager", "generateHistoryBestMsg messageObject ");
        osa.b(this.f, "_achieve_history_best_data", String.valueOf(new Timestamp(j)).substring(0, 10));
        if (Utils.o()) {
            return;
        }
        c(2, String.valueOf(i), System.currentTimeMillis());
    }

    private boolean ab() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strE = osa.e(this.f, "generateMedalTime");
        if (TextUtils.isEmpty(strE)) {
            osa.b(this.f, "generateMedalTime", String.valueOf(jElapsedRealtime));
            return true;
        }
        try {
            if (jElapsedRealtime - Long.parseLong(strE) <= 300000) {
                return false;
            }
            osa.b(this.f, "generateMedalTime", String.valueOf(jElapsedRealtime));
            return true;
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveDataManager", "doGenerateMedal parse exception ");
            return true;
        }
    }

    public ArrayList<our> n() {
        return c(d(8, new HashMap(2)));
    }

    public Map<String, ouq> m() {
        HashMap map = new HashMap(2);
        return otf.c(d(8, map), d(9, map));
    }

    private ArrayList<our> c(List<osf> list) {
        return otf.b(list, d(9, new HashMap(2)));
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        AchieveKakaCheckRecordObserver achieveKakaCheckRecordObserver = new AchieveKakaCheckRecordObserver(this.f);
        achieveKakaCheckRecordObserver.e(iBaseResponseCallback);
        c(achieveKakaCheckRecordObserver);
        String strC = HiDateUtil.c((String) null);
        HashMap map = new HashMap(16);
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        map.put("timeZone", strC);
        a(20, map);
    }
}
