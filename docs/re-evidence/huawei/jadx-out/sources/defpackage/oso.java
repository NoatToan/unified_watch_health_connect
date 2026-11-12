package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginachievement.connectivity.config.AUserProfile;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.EventRecord;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.manager.service.AchievePersonalDataObserver;
import health.compact.a.CommonUtil;
import health.compact.a.DataBaseHelper;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile oso f44653a;
    private String d = "";
    private Context e;

    private oso(Context context) {
        this.e = context.getApplicationContext();
    }

    public static oso c(Context context) {
        if (context == null) {
            return null;
        }
        if (f44653a == null) {
            synchronized (oso.class) {
                if (f44653a == null) {
                    f44653a = new oso(context);
                }
            }
        }
        return f44653a;
    }

    public void a(int i, AUserProfile aUserProfile, JSONObject jSONObject, int i2, AchieveCallback achieveCallback) {
        String string;
        LogUtil.a("PLGACHIEVE_AchievePuller", "pullData: enter -> contentType = ", Integer.valueOf(i), " iVersion = ", Integer.valueOf(i2));
        if (aUserProfile == null || jSONObject == null) {
            return;
        }
        this.d = aUserProfile.getHuid();
        if (TextUtils.isEmpty(aUserProfile.getToken()) || TextUtils.isEmpty(this.d)) {
            LogUtil.j("PLGACHIEVE_AchievePuller", "pullData: Token or huid is empty!");
            return;
        }
        try {
            if (i == 0 || i == 4 || i == 8) {
                if (!TextUtils.isEmpty(this.d)) {
                    if (TextUtils.isEmpty(aUserProfile.getAppVersion())) {
                    }
                }
                LogUtil.j("PLGACHIEVE_AchievePuller", "pullData: Huid or version is empty!");
                return;
            } else if (i == 11 || i == 12) {
                jSONObject.put("timeZone", HiDateUtil.c((String) null));
                jSONObject.put(ParsedFieldTag.TASK_RULE_VERSION, "1.0.0.10");
                LogUtil.a("PLGACHIEVE_AchievePuller", "pullData: kaka rule version = ", "1.0.0.10");
                if (i == 11 && !jSONObject.has(ParsedFieldTag.KAKA_TASK_SCENARIO)) {
                    jSONObject.put(ParsedFieldTag.KAKA_TASK_SCENARIO, -1);
                }
            } else {
                if (jSONObject.has(ParsedFieldTag.MEDAL_ID)) {
                    string = jSONObject.getString(ParsedFieldTag.MEDAL_ID);
                }
                a(i, aUserProfile, string, ost.c(aUserProfile, jSONObject, i2), achieveCallback);
            }
            string = null;
            a(i, aUserProfile, string, ost.c(aUserProfile, jSONObject, i2), achieveCallback);
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchievePuller", "pullData: exception -> ", e.getMessage());
        }
    }

    private void a(final int i, AUserProfile aUserProfile, final String str, final JSONObject jSONObject, final AchieveCallback achieveCallback) {
        String str2;
        if (i != 10) {
            str2 = "achievementUrl";
        } else {
            try {
                jSONObject.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
            } catch (JSONException e) {
                LogUtil.e("PLGACHIEVE_AchievePuller", "pullData(requestData): exception -> ", e.getMessage());
            }
            str2 = "activityUrl";
        }
        final HashMap<String, String> mapD = ost.d(aUserProfile);
        GRSManager.c(this.e).d(str2, new GrsQueryCallback() { // from class: oso.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str3) {
                LogUtil.a("PLGACHIEVE_AchievePuller", "pullData(requestData): GET KEY SUCCESS -> contentType = " + i);
                String str4 = str3 + ost.c(i);
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                LogUtil.d("PLGACHIEVE_AchievePuller", "pullData(requestData): url = ", str4);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                LogUtil.a("PLGACHIEVE_AchievePuller", "pullData(requestData): ret = ", Integer.valueOf(osk.a(str4, jSONObject, mapD, new HttpResCallBack() { // from class: oso.5.2
                    @Override // com.huawei.pluginachievement.connectivity.https.HttpResCallBack
                    public void onFinished(int i2, String str5) {
                        LogUtil.a("PLGACHIEVE_AchievePuller", "pullData(requestData): onFinished -> resCode = ", Integer.valueOf(i2), " contentType = ", Integer.valueOf(i));
                        if (achieveCallback != null) {
                            achieveCallback.onResponse(i2, str5);
                        }
                        oso.this.a(i2, str5, i);
                        oso.this.c(i2, str5, i);
                        if (i == 9 && str != null) {
                            oso.this.b(i2, str);
                        } else if (i == 7) {
                            oso.this.e(jSONObject, i2);
                        } else {
                            LogUtil.a("PLGACHIEVE_AchievePuller", "pullData(requestData): onCallBackSuccess contentType");
                        }
                        oso.this.e(i2, str5, i);
                        oso.this.c(i2, jCurrentTimeMillis, System.currentTimeMillis());
                    }
                })));
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.j("PLGACHIEVE_AchievePuller", "pullData(requestData): onCallBackFail -> index = ", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, long j, long j2) {
        String str;
        if (200 == i) {
            str = "0";
        } else {
            str = "1";
        }
        long j3 = j2 - j;
        if (!str.equals("0") || j3 >= 5000) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
            linkedHashMap.put("module", "2");
            linkedHashMap.put("status", str);
            linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(j3));
            linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str, int i2) {
        UserAchieveWrapper userAchieveWrapperC;
        if (8 == i2) {
            return;
        }
        if (i == 200) {
            if (osp.e(i2)) {
                oth.b(this.e).d(i, osp.e(i2, str));
                return;
            }
            userAchieveWrapperC = osp.c(i2, str);
        } else if (i != -1) {
            LogUtil.j("PLGACHIEVE_AchievePuller", "processData resCode = ", Integer.valueOf(i));
            userAchieveWrapperC = null;
        } else {
            oth.b(this.e).d(i, new UserAchieveWrapper(i2));
            return;
        }
        if (userAchieveWrapperC == null) {
            return;
        }
        String resultCode = userAchieveWrapperC.getResultCode();
        LogUtil.a("PLGACHIEVE_AchievePuller", "processData resultCode:", resultCode);
        if (14 == i2) {
            ost.a(userAchieveWrapperC, resultCode, this.e);
        }
        e(i2, resultCode);
        if (10 == i2 && "0".equals(resultCode)) {
            LogUtil.a("PLGACHIEVE_AchievePuller", "processData GET_ACTIVITY_INFO:", resultCode);
            oth.b(this.e).d(i, userAchieveWrapperC);
        } else {
            if (ost.b(userAchieveWrapperC, resultCode)) {
                oth.b(this.e).d(i, userAchieveWrapperC);
                return;
            }
            if (i2 == 18) {
                oth.b(this.e).d(i, userAchieveWrapperC);
                return;
            }
            if (i2 == 1) {
                oth.b(this.e).b(i, userAchieveWrapperC);
            }
            a(userAchieveWrapperC.toList());
            oth.b(this.e).d(i, userAchieveWrapperC);
        }
    }

    private void a(List<osf> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("PLGACHIEVE_AchievePuller", "initUserType");
            return;
        }
        for (osf osfVar : list) {
            if (osfVar != null) {
                osfVar.setHuid(this.d);
                oth.b(this.e).d(osfVar);
                if (osfVar instanceof TotalRecord) {
                    AchievePersonalDataObserver.d(((TotalRecord) osfVar).getDays());
                }
            }
        }
    }

    private void e(int i, String str) {
        if (i == 0 && ResultCode.CODE_NEVER_SYNC.equals(str)) {
            LogUtil.a("PLGACHIEVE_AchievePuller", "processData GET_ACTIVITY_INFO:", str, " set the new user");
            String accountInfo = LoginInit.getInstance(this.e).getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo)) {
                return;
            }
            AchievePersonalDataObserver.e(this.e, "NEWBIE" + accountInfo, "done");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(JSONObject jSONObject, int i) {
        ReleaseLogUtil.d("PLGACHIEVE_AchievePuller", "processTakeMedal: medalId -> ", jSONObject.optString(ParsedFieldTag.MEDAL_ID, ""));
        if (i == 200) {
            osa.b(this.e, "_uploadMedal", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        if (i == 200) {
            EventRecord eventRecord = new EventRecord();
            eventRecord.saveMedalID(str);
            oth.b(this.e).c(eventRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, int i2) {
        if (ost.d(i2)) {
            return;
        }
        LogUtil.d("PLGACHIEVE_AchievePuller", "enter processMedalBasicData ");
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(16);
        List<osg> arrayList2 = new ArrayList<>(4);
        if (CommonUtil.ca()) {
            str = oum.c(i2, str);
        }
        if (CommonUtil.ca() || i == 200) {
            arrayList = osp.c(i2, str, this.e);
            if (i2 == 17 || i2 == 11) {
                arrayList2 = c(arrayList);
            }
        }
        if (i2 == 0 && !TextUtils.isEmpty(osa.e(this.e, "medal"))) {
            osa.b(this.e, "personal", "1");
        }
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(8);
        UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(11);
        UserAchieveWrapper userAchieveWrapper3 = new UserAchieveWrapper(13);
        if (i2 != 17) {
            c(arrayList, userAchieveWrapper, userAchieveWrapper3, i2);
        }
        if (i2 == 8) {
            osa.b(this.e, "medal", "1");
            oth.b(this.e).d(i, userAchieveWrapper);
            return;
        }
        if (i2 == 11) {
            userAchieveWrapper2.setHealthLifeKakaTaskInfoList(arrayList2);
            oth.b(this.e).d(i, userAchieveWrapper2);
        } else if (i2 == 17) {
            UserAchieveWrapper userAchieveWrapper4 = new UserAchieveWrapper(17);
            userAchieveWrapper4.setHealthLifeKakaTaskInfoList(arrayList2);
            oth.b(this.e).d(i, userAchieveWrapper4);
        } else if (i2 == 13) {
            oth.b(this.e).d(i, userAchieveWrapper3);
        } else {
            LogUtil.a("PLGACHIEVE_AchievePuller", "processMedalBasicData not refresh Observer");
        }
    }

    private void c(ArrayList<UserAchieveWrapper> arrayList, UserAchieveWrapper userAchieveWrapper, UserAchieveWrapper userAchieveWrapper2, int i) {
        if (otd.c(BaseApplication.getContext()) == null) {
            LogUtil.j("PLGACHIEVE_AchievePuller", "processMedalData achieveDBManager not init");
            return;
        }
        SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(String.valueOf(ost.b())).e();
        boolean z = false;
        if (sQLiteDatabaseE != null) {
            try {
                try {
                    sQLiteDatabaseE.beginTransaction();
                    c(arrayList, userAchieveWrapper, userAchieveWrapper2);
                    sQLiteDatabaseE.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseE.endTransaction();
                        z = true;
                    } catch (SQLiteException | IllegalStateException e) {
                        LogUtil.e("PLGACHIEVE_AchievePuller", "endTransaction IllegalStateException", e.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        sQLiteDatabaseE.endTransaction();
                    } catch (SQLiteException | IllegalStateException e2) {
                        LogUtil.e("PLGACHIEVE_AchievePuller", "endTransaction IllegalStateException", e2.getMessage());
                    }
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e3) {
                LogUtil.e("PLGACHIEVE_AchievePuller", "IllegalStateException", e3.getMessage());
                try {
                    sQLiteDatabaseE.endTransaction();
                } catch (SQLiteException | IllegalStateException e4) {
                    LogUtil.e("PLGACHIEVE_AchievePuller", "endTransaction IllegalStateException", e4.getMessage());
                }
            }
        }
        if (i == 11 && z && d(arrayList)) {
            osa.b(BaseApplication.getContext(), "kakaSyncDate", String.valueOf(System.currentTimeMillis()));
            LogUtil.a("PLGACHIEVE_AchievePuller", "refreshKakaSyncDate updata kakaSyncDate ", Long.valueOf(System.currentTimeMillis()));
        }
    }

    private boolean d(ArrayList<UserAchieveWrapper> arrayList) {
        if (njy.e(arrayList)) {
            return false;
        }
        boolean z = arrayList.size() != 1 || "0".equals(arrayList.get(0).getResultCode());
        LogUtil.a("PLGACHIEVE_AchievePuller", "refreshKakaSyncDate isResultCodeOk ", Boolean.valueOf(z));
        return z;
    }

    private void c(ArrayList<UserAchieveWrapper> arrayList, UserAchieveWrapper userAchieveWrapper, UserAchieveWrapper userAchieveWrapper2) {
        for (UserAchieveWrapper userAchieveWrapper3 : arrayList) {
            if (userAchieveWrapper3 != null) {
                for (osf osfVar : userAchieveWrapper3.toList()) {
                    if (osfVar != null) {
                        osfVar.setHuid(this.d);
                        oth.b(this.e).d(osfVar);
                        if (osfVar instanceof MedalConfigInfo) {
                            MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                            if (!TextUtils.isEmpty(medalConfigInfo.acquireMedalType()) && pax.k(medalConfigInfo.acquireMedalType())) {
                                userAchieveWrapper.saveMedalConfigInfo(medalConfigInfo);
                            }
                        }
                        if (osfVar instanceof AchieveUserLevelInfo) {
                            userAchieveWrapper2.saveAchieveUserLevelInfo((AchieveUserLevelInfo) osfVar);
                        }
                    }
                }
            }
        }
    }

    private List<osg> c(List<UserAchieveWrapper> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (UserAchieveWrapper userAchieveWrapper : list) {
                if (userAchieveWrapper != null && userAchieveWrapper.acquireKakaTaskInfo() != null) {
                    arrayList.add(userAchieveWrapper.acquireKakaTaskInfo());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, int i2) {
        if (i != 200) {
            ReleaseLogUtil.e("PLGACHIEVE_AchievePuller", "checkResultCode: contentType -> ", Integer.valueOf(i2), ", resCode -> ", Integer.valueOf(i), ", resultJson -> ", str);
        }
        if (TextUtils.isEmpty(str) || CommonUtil.ca()) {
            LogUtil.j("PLGACHIEVE_AchievePuller", "checkResultCode resultJson is empty");
            return;
        }
        try {
            int iOptInt = new JSONObject(str).optInt("resultCode");
            if (!osv.d(String.valueOf(iOptInt))) {
                ReleaseLogUtil.e("PLGACHIEVE_AchievePuller", "checkResultCode: contentType -> ", Integer.valueOf(i2), ", resultJson -> ", str);
            }
            if (iOptInt == 1002 || iOptInt == 1004) {
                LogUtil.a("PLGACHIEVE_AchievePuller", "checkResultCode resultCode = ", Integer.valueOf(iOptInt));
                LoginInit.tryLoginWhenTokenInvalid();
            }
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchievePuller", "checkResultCode JSONException");
        }
    }
}
