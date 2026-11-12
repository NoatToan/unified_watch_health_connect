package com.huawei.health.device.fatscale.multiusers;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiZipUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.dnj;
import defpackage.ioy;
import defpackage.iun;
import defpackage.iuo;
import defpackage.ius;
import defpackage.lua;
import defpackage.njy;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public enum MultiUsersManager {
    INSTANCE;

    private static final int KEY_USER_DEFAULT_COUNT = -1;
    private static final int MAX_SYNC_COUNT = 3;
    private static final int SID_ZERO_INDEX = 0;
    private static final String TAG = "PluginDevice_MultiUsersManager";
    private static final String TYPE_DELETE_SUB_USER_DATA = "TYPE_DELETE_SUB_USER_DATA";
    private static final String TYPE_QUERY_SUB_USER_BASE_DATA = "TYPE_QUERY_SUB_USER_BASE_DATA";
    private static final String TYPE_QUERY_SUB_USER_DATA = "TYPE_QUERY_SUB_USER_DATA";
    private static final String TYPE_SAVE_SUB_USER_DATA = "TYPE_SAVE_SUB_USER_DATA";
    private static final int UNCOMPRESS_USER_DATA_DEFAULT_COUNT = -1;
    private static final String UNDERLINE = "_";
    public static final int USER_TYPE_MAIN = 1;
    public static final int USER_TYPE_SUB = 2;
    private static final int USER_TYPE_SUB_OLD_KEY_MAX = 5;
    private boolean isRegUserInfoError;
    private dnj mEmptyUser;
    private boolean mIsCheckMainUser;
    private List<Integer> mSuccessList;
    private static int sPrevLastSyncDate = 0;
    private static int sSyncCount = 0;
    private static final Object LOCK = new Object();
    private dnj mMainUser = new dnj();
    private Map<String, dnj> mMultiUsersMap = Collections.synchronizedMap(new LinkedHashMap());
    private List<dnj> mMainAllUser = new ArrayList();
    private dnj mCurrentUser = new dnj();
    private transient ThreadPoolManager mThreadPool = ThreadPoolManager.b(1, 1, TAG);
    private List<Integer> mHiSubscribeTypeList = new CopyOnWriteArrayList();
    private Map<String, String> mSidList = new TreeMap();
    private transient HiSubscribeListener mSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.1
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            MultiUsersManager.this.mSuccessList = list;
            LogUtil.a(MultiUsersManager.TAG, "regUserInfoListener onResult successList.isEmpty:", Boolean.valueOf(njy.e(list)), " failList.isEmpty:", Boolean.valueOf(njy.e(list2)));
            if (njy.e(list)) {
                MultiUsersManager.this.isRegUserInfoError = true;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (i == 100) {
                LogUtil.a(MultiUsersManager.TAG, "USER_INFO changed");
                MultiUsersManager.this.refetchMainUserInfo();
            }
        }
    };

    MultiUsersManager() {
    }

    private void initSidList() {
        Map<String, String> map = this.mSidList;
        if (map == null || map.isEmpty()) {
            this.mSidList = new TreeMap();
        }
        this.mSidList.put("userInfo2", "");
        this.mSidList.put("userInfo3", "");
        this.mSidList.put("userInfo4", "");
        this.mSidList.put("userInfo5", "");
        this.mSidList.put("userInfo6", "");
        this.mSidList.put("userInfo7", "");
        this.mSidList.put("userInfo8", "");
        this.mSidList.put("userInfo9", "");
        this.mSidList.put("userInfo10", "");
    }

    public void initMultiUsers(dnj dnjVar) {
        if (this.isRegUserInfoError) {
            LogUtil.a(TAG, "initMultiUsers isRegUserInfoError");
            regUserInfoListener();
        }
        this.mMultiUsersMap.clear();
        initSidList();
        initMainUser(dnjVar);
        initEmptyUser(this.mMainUser);
        setMainUser(this.mMainUser);
        setCurrentUser(this.mMainUser);
        getOtherUserData(null);
    }

    private void initMainUser(dnj dnjVar) {
        UserInfomation userInfomationA = ioy.a();
        LogUtil.a(TAG, "initMainUser userInfomation ", userInfomationA);
        if (this.mMainUser == null) {
            this.mMainUser = new dnj();
        }
        this.mMainUser.a(1);
        this.mMainUser.d(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        if (userInfomationA != null) {
            ReleaseLogUtil.c(TAG, "initMainUser enter userInfomation");
            this.mMainUser.e((byte) (userInfomationA.getGender() == 1 ? 0 : 1));
            this.mMainUser.e(userInfomationA.getAge());
            this.mMainUser.e(userInfomationA.getName());
            this.mMainUser.c(userInfomationA.getHeight());
            this.mMainUser.e(dnjVar != null ? dnjVar.r() : userInfomationA.getWeight());
            this.mMainUser.d(CommonUtils.j(userInfomationA.getBirthday()));
        } else {
            if (dnjVar == null) {
                ReleaseLogUtil.d(TAG, "initMainUser user is null");
                return;
            }
            this.mMainUser.e(dnjVar.d());
            this.mMainUser.e(dnjVar.c());
            this.mMainUser.e(dnjVar.h());
            this.mMainUser.c(dnjVar.e());
            this.mMainUser.e(dnjVar.r());
            this.mMainUser.d(dnjVar.j());
        }
        LogUtil.a(TAG, "initMainUser mMainUser ", this.mMainUser);
    }

    public void initEmptyUser(dnj dnjVar) {
        if (dnjVar != null) {
            this.mEmptyUser = dnjVar;
        }
    }

    public dnj getEmptyUser() {
        return this.mEmptyUser;
    }

    private void setUserPreference(String str, String str2) {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey(str);
        hiUserPreference.setValue(str2);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).setUserPreference(hiUserPreference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiUserPreference getUserPreference(String str) {
        return HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).getUserPreference(str);
    }

    private String getUserPreferenceValue(String str) {
        HiUserPreference userPreference = getUserPreference(str);
        if (userPreference == null) {
            return "";
        }
        return userPreference.getValue();
    }

    private void correctUserInformation() {
        dnj value;
        String userPreferenceValue = getUserPreferenceValue("custom.weight_multi_userinfo_base");
        Map<String, dnj> userInformation = parseUserInformation(userPreferenceValue);
        if (userInformation.size() == 0) {
            ReleaseLogUtil.d(TAG, "correctUserInformation userInfoBaseValue ", userPreferenceValue);
            return;
        }
        Map<String, dnj> userInformation2 = parseUserInformation(getUserPreferenceValue("custom.weight_multi_userinfo"));
        Map<String, dnj> userInformation3 = parseUserInformation(getUserPreferenceValue("custom.weight_multi_userinfo_expand"));
        HashMap map = new HashMap();
        for (Map.Entry<String, dnj> entry : userInformation.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (!userInformation2.containsKey(key) && !userInformation3.containsKey(key) && (value = entry.getValue()) != null) {
                    map.put(key, value);
                }
            }
        }
        if (map.size() == 0) {
            return;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (entry2 != null) {
                String str = (String) entry2.getKey();
                dnj dnjVar = (dnj) entry2.getValue();
                if (!TextUtils.isEmpty(str) && dnjVar != null) {
                    if (userInformation2.size() < 5) {
                        userInformation2.put(str, dnjVar);
                    } else {
                        userInformation3.put(str, dnjVar);
                    }
                }
            }
        }
        String userInformationForMap = getUserInformationForMap(userInformation2);
        if (!TextUtils.isEmpty(userInformationForMap)) {
            setUserPreference("custom.weight_multi_userinfo", userInformationForMap);
        }
        String userInformationForMap2 = getUserInformationForMap(userInformation3);
        if (TextUtils.isEmpty(userInformationForMap2)) {
            return;
        }
        setUserPreference("custom.weight_multi_userinfo_expand", userInformationForMap2);
    }

    private Map<String, dnj> parseUserInformation(String str) {
        JSONArray jSONArray;
        String strD;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d(TAG, "parseUserInformation userInfo ", str);
            return new HashMap();
        }
        JSONArray jSONArray2 = null;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG, "parseUserInformation jsonArray exception ", ExceptionUtils.c(e));
            jSONArray = null;
        }
        if (jSONArray != null) {
            return parseJsonArrayUserInformation(jSONArray);
        }
        try {
            strD = HiZipUtil.d(str);
        } catch (IOException e2) {
            ReleaseLogUtil.b(TAG, "parseUserInformation uncompressUserInfo exception ", ExceptionUtils.c(e2));
            syncHiOption();
            strD = "";
        }
        LogUtil.d(TAG, "parseUserInformation uncompressUserInfo ", strD);
        if (TextUtils.isEmpty(strD)) {
            return new HashMap();
        }
        try {
            jSONArray2 = new JSONArray(strD);
        } catch (JSONException e3) {
            ReleaseLogUtil.b(TAG, "parseUserInformation array exception ", ExceptionUtils.c(e3));
        }
        if (jSONArray2 == null) {
            ReleaseLogUtil.d(TAG, "parseUserInformation array is null uncompressUserInfo ", strD);
            return new HashMap();
        }
        return parseJsonArrayUserInformation(jSONArray2);
    }

    private Map<String, dnj> parseJsonArrayUserInformation(JSONArray jSONArray) {
        dnj dnjVar;
        if (jSONArray == null) {
            ReleaseLogUtil.d(TAG, "parseJsonArrayUserInformation jsonArray is null");
            return new HashMap();
        }
        HashMap map = new HashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArray.optString(i);
            if (TextUtils.isEmpty(strOptString)) {
                ReleaseLogUtil.d(TAG, "parseJsonArrayUserInformation json ", strOptString);
            } else {
                try {
                    dnjVar = new dnj(new JSONObject(strOptString));
                } catch (JSONException e) {
                    ReleaseLogUtil.b(TAG, "parseJsonArrayUserInformation exception ", ExceptionUtils.c(e));
                    dnjVar = null;
                }
                if (dnjVar == null) {
                    ReleaseLogUtil.d(TAG, "parseJsonArrayUserInformation user is null json ", strOptString);
                } else {
                    String strI = dnjVar.i();
                    if (TextUtils.isEmpty(strI)) {
                        ReleaseLogUtil.d(TAG, "parseJsonArrayUserInformation uuid ", strI, " json ", strOptString);
                    } else {
                        if (TextUtils.isEmpty(dnjVar.g())) {
                            dnjVar.b(getSid(strI));
                        }
                        if (map.get(strI) == null) {
                            map.put(strI, dnjVar);
                        }
                    }
                }
            }
        }
        return map;
    }

    private String getUserInformationForMap(Map<String, dnj> map) {
        if (map == null) {
            ReleaseLogUtil.d(TAG, "getUserInformationForMap map is null");
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, dnj> entry : map.entrySet()) {
            if (entry != null) {
                dnj value = entry.getValue();
                if (value == null) {
                    ReleaseLogUtil.d(TAG, "getUserInformationForMap user is null entry ", entry);
                } else {
                    String strC = value.c(true);
                    if (TextUtils.isEmpty(strC)) {
                        ReleaseLogUtil.d(TAG, "getUserInformationForMap json ", strC);
                    } else {
                        jSONArray.put(strC);
                    }
                }
            }
        }
        String string = jSONArray.toString();
        try {
            return HiZipUtil.a(string);
        } catch (IOException e) {
            ReleaseLogUtil.b(TAG, "getUserInformationForMap exception ", ExceptionUtils.c(e));
            return string;
        }
    }

    public void getOtherUserData(final IBaseResponseCallback iBaseResponseCallback) {
        this.mThreadPool.execute(new Runnable() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MultiUsersManager.LOCK) {
                    MultiUsersManager.this.getOtherUserDataSuccess(iBaseResponseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOtherUserDataSuccess(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "getOtherUserData--:", Integer.valueOf(this.mMultiUsersMap.size()));
        correctUserInformation();
        HiUserPreference userPreference = getUserPreference("custom.weight_multi_userinfo");
        initAllUser(userPreference, false);
        initAllUser(getUserPreference("custom.weight_multi_userinfo_expand"), true);
        HiUserPreference userPreference2 = getUserPreference("custom.weight_multi_userinfo_base");
        if (userPreference == null) {
            LogUtil.a(TAG, "getOtherUserData hiUserPreference is null");
        } else if (userPreference2 == null) {
            LogUtil.a(TAG, "getOtherUserData hiUserPreferenceBase is null");
            saveUserBaseData();
        } else if (!TextUtils.isEmpty(userPreference.getValue()) && TextUtils.isEmpty(userPreference2.getValue())) {
            saveUserBaseData();
        }
        refreshMainAllUser(TYPE_QUERY_SUB_USER_DATA);
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshMainAllUser(final String str) {
        final List<dnj> otherUserList = getOtherUserList();
        final UserInfomation userInfomation = getUserInfomation();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dni
            @Override // java.lang.Runnable
            public final void run() {
                this.d.m826x9c61c7df(userInfomation, otherUserList, str);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX INFO: renamed from: lambda$refreshMainAllUser$0$com-huawei-health-device-fatscale-multiusers-MultiUsersManager, reason: not valid java name */
    public /* synthetic */ void m826x9c61c7df(UserInfomation userInfomation, List list, String str) {
        byte b2;
        if (getCurrentUser() == null) {
            setCurrentUser(this.mMainUser);
        }
        dnj dnjVarFetchMainUser = fetchMainUser(userInfomation);
        if (dnjVarFetchMainUser == null) {
            ReleaseLogUtil.d(TAG, "refreshMainAllUser mainUser is null");
            return;
        }
        this.mMainAllUser.clear();
        this.mMainAllUser.add(dnjVarFetchMainUser);
        this.mMainAllUser.addAll(list);
        ReleaseLogUtil.c(TAG, "refreshMainAllUser type ", str);
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -541050736) {
            if (iHashCode != -318547869) {
                if (iHashCode == 2097681954 && str.equals(TYPE_SAVE_SUB_USER_DATA)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(TYPE_QUERY_SUB_USER_DATA)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(TYPE_DELETE_SUB_USER_DATA)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                iun.e(str, (List<dnj>) list);
                return;
            } else if (b2 != 2) {
                ReleaseLogUtil.c(TAG, "refreshMainAllUser default type ", str);
                return;
            }
        }
        Map<String, String> mapI = iuo.i();
        if (CollectionUtils.c(mapI)) {
            return;
        }
        List<ius> listA = iun.a((List<dnj>) list);
        if (TextUtils.equals(HiJsonUtil.d(listA), mapI.get("configData"))) {
            ReleaseLogUtil.c(TAG, "refreshMainAllUser SubUser data not change");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        iun.b(str, iun.b((List<dnj>) list), jCurrentTimeMillis);
        iuo.a(str, jCurrentTimeMillis, listA);
    }

    private void saveUserBaseData() {
        setUserPreference("custom.weight_multi_userinfo_base", getAllUserStringWithoutPhoto());
    }

    public void getOtherUserBaseData() {
        this.mThreadPool.execute(new Runnable() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(MultiUsersManager.TAG, " getOtherUserBaseData ");
                synchronized (MultiUsersManager.LOCK) {
                    MultiUsersManager.this.initAllUser(MultiUsersManager.this.getUserPreference("custom.weight_multi_userinfo_base"), false);
                    MultiUsersManager.this.refreshMainAllUser(MultiUsersManager.TYPE_QUERY_SUB_USER_BASE_DATA);
                }
            }
        });
    }

    public void initUserIfEmpty() {
        if (this.mMainUser == null) {
            refetchMainUserInfo();
        }
        if (this.mMultiUsersMap.isEmpty()) {
            getOtherUserData(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAllUser(HiUserPreference hiUserPreference, boolean z) {
        Map<String, String> map = this.mSidList;
        if (map == null || map.isEmpty()) {
            initSidList();
        }
        if (hiUserPreference == null) {
            LogUtil.j(TAG, "initAllUser hiUserPreference is null");
            return;
        }
        String value = hiUserPreference.getValue();
        if (TextUtils.isEmpty(value)) {
            LogUtil.j(TAG, "initAllUser subUserStr is empty");
            this.mMultiUsersMap.clear();
        } else {
            parseAllUserData(value, z);
        }
    }

    private void parseAllUserData(String str, boolean z) {
        LogUtil.a(TAG, "parseAllUserData ", Integer.valueOf(this.mMultiUsersMap.size()), ",isShowExpandUser:", Boolean.valueOf(z));
        if (!z) {
            this.mMultiUsersMap.clear();
        }
        try {
            parseArrayUserData(new JSONArray(str));
        } catch (JSONException e) {
            LogUtil.e(TAG, "parseAllUserData " + e.getMessage());
            uncompressUserData(str);
        }
    }

    private void uncompressUserData(String str) {
        try {
            parseArrayUserData(new JSONArray(HiZipUtil.d(str)));
        } catch (IOException e) {
            LogUtil.e(TAG, "uncompressUserData " + e.getMessage());
            syncHiOption();
        } catch (JSONException e2) {
            LogUtil.e(TAG, "uncompressUserData json " + e2.getMessage());
        }
    }

    private void parseArrayUserData(JSONArray jSONArray) {
        try {
            int length = jSONArray.length();
            LogUtil.a(TAG, " array count ", Integer.valueOf(length));
            for (int i = 0; i < length; i++) {
                initMapAndCurrentUser(new JSONObject(jSONArray.optString(i)));
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "parseArrayUserData " + e.getMessage());
        }
    }

    private void initMapAndCurrentUser(JSONObject jSONObject) {
        dnj dnjVar = new dnj(jSONObject);
        if (dnjVar.g() == null || "".equals(dnjVar.g())) {
            String sid = getSid(dnjVar.i());
            dnjVar.b(sid);
            setUuidBySid(sid, dnjVar.i());
        } else {
            setUuidBySid(dnjVar.g(), dnjVar.i());
        }
        if (this.mMultiUsersMap.get(dnjVar.i()) == null) {
            LogUtil.a(TAG, "initMultiUsersMap put into user who UUIDOfUser is null", Integer.valueOf(this.mMultiUsersMap.size()));
            this.mMultiUsersMap.put(dnjVar.i(), dnjVar);
        }
        LogUtil.a(TAG, "initMap sidlist: " + this.mSidList.toString());
    }

    public void saveUser(final dnj dnjVar, final IBaseResponseCallback iBaseResponseCallback) {
        this.mThreadPool.execute(new Runnable() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.6
            @Override // java.lang.Runnable
            public void run() {
                if (MultiUsersManager.this.mMainUser == null) {
                    LogUtil.a(MultiUsersManager.TAG, "mainUser is null");
                    MultiUsersManager.this.refetchMainUserInfo();
                }
                String strI = "";
                if (MultiUsersManager.this.mMainUser != null) {
                    strI = MultiUsersManager.this.mMainUser.i();
                }
                dnj dnjVar2 = dnjVar;
                if (dnjVar2 != null) {
                    if (dnjVar2.i() == null) {
                        LogUtil.a(MultiUsersManager.TAG, "user.getUUIDOfUser() is null");
                        return;
                    }
                    lua.e(String.valueOf(10000), "update_user_weight_time" + dnjVar.i(), String.valueOf(System.currentTimeMillis()), null);
                }
                dnj dnjVar3 = dnjVar;
                if (dnjVar3 != null && !dnjVar3.i().equals(strI)) {
                    synchronized (MultiUsersManager.LOCK) {
                        MultiUsersManager.this.resetMultiUserMap(dnjVar);
                        MultiUsersManager.this.refreshMainAllUser(MultiUsersManager.TYPE_SAVE_SUB_USER_DATA);
                    }
                }
                iBaseResponseCallback.a(0, "");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetMultiUserMap(dnj dnjVar) {
        dnj dnjVar2 = this.mMultiUsersMap.get(dnjVar.i());
        HiUserPreference userPreference = getUserPreference("custom.weight_multi_userinfo");
        if (dnjVar2 == null) {
            boolean z = parseUserCountByKey(userPreference) >= 5;
            this.mMultiUsersMap.put(dnjVar.i(), dnjVar);
            LogUtil.a(TAG, "mMultiUsersMap size is ", Integer.valueOf(this.mMultiUsersMap.size()));
            saveWeightUserData(getAllUserString(z), dnjVar, false, dnjVar.q(), z);
        } else {
            boolean z2 = !isSubToTheKey(userPreference, dnjVar.i());
            setMapUserData(dnjVar2, dnjVar);
            saveWeightUserData(getAllUserString(z2), dnjVar, false, dnjVar.q(), z2);
        }
        initAllUser(getUserPreference("custom.weight_multi_userinfo"), false);
        initAllUser(getUserPreference("custom.weight_multi_userinfo_expand"), true);
    }

    public void deleteUser(final String str, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        this.mThreadPool.execute(new Runnable() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.10
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MultiUsersManager.LOCK) {
                    boolean zIsSubToTheKey = MultiUsersManager.this.isSubToTheKey(MultiUsersManager.this.getUserPreference("custom.weight_multi_userinfo"), str);
                    if (MultiUsersManager.this.mMultiUsersMap.get(str) != null) {
                        MultiUsersManager.this.mMultiUsersMap.remove(str);
                    }
                    MultiUsersManager multiUsersManager = MultiUsersManager.this;
                    boolean z2 = !zIsSubToTheKey;
                    multiUsersManager.saveWeightUserData(multiUsersManager.getAllUserString(z2), null, true, z, z2);
                    MultiUsersManager.this.refreshMainAllUser(MultiUsersManager.TYPE_DELETE_SUB_USER_DATA);
                }
                iBaseResponseCallback.a(0, "");
            }
        });
    }

    private void setMapUserData(dnj dnjVar, dnj dnjVar2) {
        LogUtil.a(TAG, "setMapUserData");
        dnjVar.a(dnjVar2.q());
        dnjVar.e(dnjVar2.d());
        dnjVar.c(dnjVar2.e());
        dnjVar.e(dnjVar2.h());
        dnjVar.a(dnjVar2.m());
        dnjVar.e(dnjVar2.r());
        dnjVar.c(dnjVar2.n());
        dnjVar.d(dnjVar2.j());
        dnjVar.d(dnjVar2.k());
        dnjVar.d(dnjVar2.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAllUserString(boolean z) {
        HiUserPreference userPreference = getUserPreference("custom.weight_multi_userinfo");
        HiUserPreference userPreference2 = getUserPreference("custom.weight_multi_userinfo_expand");
        LogUtil.a(TAG, "getAllUserString baseCount：", Integer.valueOf(parseUserCountByKey(userPreference)), ",expandCount:", Integer.valueOf(parseUserCountByKey(userPreference2)), ",isExpand:", Boolean.valueOf(z));
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (dnj dnjVar : this.mMultiUsersMap.values()) {
            if (isSubToTheKey(userPreference, dnjVar.i())) {
                jSONArray.put(dnjVar.c(true));
            } else if (isSubToTheKey(userPreference2, dnjVar.i())) {
                jSONArray2.put(dnjVar.c(true));
            } else if (!z) {
                jSONArray.put(dnjVar.c(true));
            } else {
                jSONArray2.put(dnjVar.c(true));
            }
        }
        String string = jSONArray.toString();
        try {
            if (!z) {
                return HiZipUtil.a(string);
            }
            return HiZipUtil.a(jSONArray2.toString());
        } catch (IOException e) {
            LogUtil.e(TAG, "getAllUserString " + e.getMessage());
            return string;
        }
    }

    private String getAllUserStringWithoutPhoto() {
        JSONArray jSONArray = new JSONArray();
        Iterator<dnj> it = this.mMultiUsersMap.values().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().c(false));
        }
        String string = jSONArray.toString();
        try {
            return HiZipUtil.a(jSONArray.toString());
        } catch (IOException e) {
            LogUtil.e(TAG, "getAllUserString " + e.getMessage());
            return string;
        }
    }

    public void getCurrentUser(final WeightBaseResponseCallback<dnj> weightBaseResponseCallback) {
        if (weightBaseResponseCallback == null) {
            LogUtil.j(TAG, "getCurrentUser callback is null");
            return;
        }
        dnj dnjVar = this.mCurrentUser;
        if (dnjVar == null) {
            LogUtil.j(TAG, "getCurrentUser mCurrentUser is null");
            weightBaseResponseCallback.onResponse(-1, null);
            return;
        }
        if (dnjVar.p()) {
            weightBaseResponseCallback.onResponse(0, this.mCurrentUser);
            return;
        }
        LogUtil.j(TAG, "getCurrentUser: UserHeight=", Integer.valueOf(this.mCurrentUser.e()), ", UserBirthday=", Integer.valueOf(this.mCurrentUser.j()), ", UserGender=", Byte.valueOf(this.mCurrentUser.d()));
        if (getMainUser() == null || getMainUser().i() == null) {
            LogUtil.j(TAG, "mainUser is not init!");
            weightBaseResponseCallback.onResponse(-1, null);
        } else if (!getMainUser().i().equals(this.mCurrentUser.i())) {
            getOtherUserData(new IBaseResponseCallback() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        MultiUsersManager.this.setCurrentUser((dnj) MultiUsersManager.this.mMultiUsersMap.get(MultiUsersManager.this.mCurrentUser.i()));
                    } else {
                        LogUtil.j(MultiUsersManager.TAG, "getCurrentUser from map failed");
                    }
                    MultiUsersManager.this.userInfoCheck(weightBaseResponseCallback);
                }
            });
        } else {
            getUserInfo(weightBaseResponseCallback);
        }
    }

    private void getUserInfo(final WeightBaseResponseCallback<dnj> weightBaseResponseCallback) {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.7
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                LogUtil.a(MultiUsersManager.TAG, "getCurrentUser errorCode = ", Integer.valueOf(i));
                if (i == 0 && userInfomation != null) {
                    MultiUsersManager.this.mCurrentUser.e(userInfomation.getAge());
                    MultiUsersManager.this.mCurrentUser.e((byte) (userInfomation.getGender() == 1 ? 0 : 1));
                    MultiUsersManager.this.mCurrentUser.c(userInfomation.getHeight());
                    try {
                        MultiUsersManager.this.mCurrentUser.d(Integer.parseInt(userInfomation.getBirthday()));
                    } catch (NumberFormatException unused) {
                        LogUtil.j(MultiUsersManager.TAG, "getCurrentUser NumberFormatException");
                    }
                }
                MultiUsersManager.this.userInfoCheck(weightBaseResponseCallback);
            }
        });
    }

    public dnj getCurrentUser() {
        return this.mCurrentUser;
    }

    public void getCurrentUserForUserInfo(final ResponseCallback<dnj> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d(TAG, "getCurrentUserForUserInfo callback is null");
            return;
        }
        dnj dnjVar = this.mCurrentUser;
        if (dnjVar != null && dnjVar.m() != 1) {
            LogUtil.a(TAG, "getCurrentUserForUserInfo mCurrentUser ", this.mCurrentUser);
            responseCallback.onResponse(0, this.mCurrentUser);
        } else {
            HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).fetchUserData(new HiCommonListener() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.12
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    if (!njy.b(obj, HiUserInfo.class)) {
                        ReleaseLogUtil.d(MultiUsersManager.TAG, "getCurrentUserForUserInfo onSuccess object ", obj);
                        responseCallback.onResponse(-1, MultiUsersManager.this.mMainUser);
                        return;
                    }
                    List list = (List) obj;
                    if (njy.e(list)) {
                        ReleaseLogUtil.d(MultiUsersManager.TAG, "getCurrentUserForUserInfo onSuccess userInfoList ", list);
                        responseCallback.onResponse(-1, MultiUsersManager.this.mMainUser);
                        return;
                    }
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    if (hiUserInfo != null) {
                        MultiUsersManager.this.setMainUserData(hiUserInfo);
                        if (MultiUsersManager.this.mMainUser == null) {
                            ReleaseLogUtil.d(MultiUsersManager.TAG, "getCurrentUserForUserInfo onSuccess mCurrentUser is null");
                            responseCallback.onResponse(-1, null);
                            return;
                        } else {
                            LogUtil.a(MultiUsersManager.TAG, "getCurrentUserForUserInfo onSuccess userInfo ", hiUserInfo, " mMainUser ", MultiUsersManager.this.mMainUser.c(false));
                            responseCallback.onResponse(0, MultiUsersManager.this.mMainUser);
                            return;
                        }
                    }
                    ReleaseLogUtil.d(MultiUsersManager.TAG, "getCurrentUserForUserInfo onSuccess userInfo is null");
                    responseCallback.onResponse(-1, MultiUsersManager.this.mMainUser);
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    ReleaseLogUtil.d(MultiUsersManager.TAG, "getCurrentUserForUserInfo onFailure errorCode ", Integer.valueOf(i), " errorMessage ", obj);
                    responseCallback.onResponse(-1, MultiUsersManager.this.mMainUser);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void userInfoCheck(WeightBaseResponseCallback<dnj> weightBaseResponseCallback) {
        dnj dnjVar = this.mCurrentUser;
        if (dnjVar == null) {
            LogUtil.j(TAG, "mCurrentUser = null");
            weightBaseResponseCallback.onResponse(-1, null);
            return;
        }
        LogUtil.j(TAG, "mCurrentUser = ", dnjVar);
        if (this.mIsCheckMainUser && this.mCurrentUser.m() == 1) {
            weightBaseResponseCallback.onResponse(0, this.mCurrentUser);
        } else if (this.mCurrentUser.p()) {
            weightBaseResponseCallback.onResponse(0, this.mCurrentUser);
        } else {
            weightBaseResponseCallback.onResponse(-1, null);
        }
    }

    public void setIsCheckMainUser(boolean z) {
        this.mIsCheckMainUser = z;
    }

    public void setCurrentUser(dnj dnjVar) {
        if (dnjVar != null) {
            LogUtil.a(TAG, "currentUser info before ", this.mCurrentUser.c(false));
            this.mCurrentUser = dnjVar;
            LogUtil.a(TAG, "currentUser info after ", dnjVar.c(false));
        }
    }

    public dnj getMainUser() {
        dnj dnjVar = this.mMainUser;
        if (dnjVar == null || dnjVar.i() == null) {
            LogUtil.j(TAG, "getMainUser mainUser is not init!");
            dnj dnjVar2 = new dnj();
            this.mMainUser = dnjVar2;
            dnjVar2.a(1);
            this.mMainUser.d(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
            refetchMainUserInfo();
            return this.mMainUser;
        }
        return this.mMainUser;
    }

    public void setMainUser(dnj dnjVar) {
        if (dnjVar != null) {
            this.mMainUser = dnjVar;
        } else {
            LogUtil.j(TAG, "mainUser is null");
        }
    }

    public void regUserInfoListener() {
        LogUtil.a(TAG, "regUserInfoListener");
        this.mHiSubscribeTypeList.clear();
        this.mHiSubscribeTypeList.add(100);
        HiHealthManager.d(BaseApplication.getContext()).subscribeHiHealthData(this.mHiSubscribeTypeList, this.mSubscribeListener);
    }

    public void unRegUserInfoListener() {
        if (njy.e(this.mSuccessList)) {
            LogUtil.j(TAG, "unRegUserInfoListener, mSuccessList is empty");
        } else {
            HiHealthManager.d(BaseApplication.getContext()).unSubscribeHiHealthData(this.mSuccessList, new HiUnSubscribeListener() { // from class: dna
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a(MultiUsersManager.TAG, "unRegUserInfoListener, isSuccess is ", Boolean.valueOf(z));
                }
            });
        }
    }

    public void fetchMainUserInfoForCallback(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "fetchMainUserInfoForCallback callback is null");
        } else {
            HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.15
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (njy.e(list)) {
                            LogUtil.j(MultiUsersManager.TAG, "fetchMainUserInfoForCallback userInfos is empty");
                            iBaseResponseCallback.a(-1, null);
                            return;
                        }
                        HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                        if (hiUserInfo != null) {
                            MultiUsersManager.this.setCurrentUserToMainUser(hiUserInfo);
                            iBaseResponseCallback.a(0, MultiUsersManager.this.mCurrentUser);
                        } else {
                            LogUtil.j(MultiUsersManager.TAG, "fetchMainUserInfoForCallback HiUserInfo is null");
                            iBaseResponseCallback.a(-1, null);
                        }
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    LogUtil.j(MultiUsersManager.TAG, "fetchMainUserInfoForCallback failed");
                    iBaseResponseCallback.a(-1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refetchMainUserInfo() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a(MultiUsersManager.TAG, "refetchMainUserInfo HiCommonListener onSuccess pid = " + Process.myPid() + ",tid = " + Process.myTid());
                if (obj != null) {
                    try {
                        List list = obj instanceof List ? (List) obj : null;
                        if (njy.e(list)) {
                            LogUtil.j(MultiUsersManager.TAG, "refreshMainUserInfo onSuccess userInfos is null or size is zero");
                            return;
                        }
                        HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                        if (hiUserInfo != null) {
                            MultiUsersManager.this.setCurrentUserToMainUser(hiUserInfo);
                        } else {
                            LogUtil.j(MultiUsersManager.TAG, "refreshMainUserInfo onSuccess HiUserInfo is null");
                        }
                    } catch (ClassCastException e) {
                        LogUtil.e(MultiUsersManager.TAG, e.getMessage());
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e(MultiUsersManager.TAG, "falied to retrieve user info");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserToMainUser(final HiUserInfo hiUserInfo) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dnc
            @Override // java.lang.Runnable
            public final void run() {
                this.d.m827xa1fcb434(hiUserInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setCurrentUserToMainUser$2$com-huawei-health-device-fatscale-multiusers-MultiUsersManager, reason: not valid java name */
    public /* synthetic */ void m827xa1fcb434(HiUserInfo hiUserInfo) {
        setMainUserData(hiUserInfo);
        if (getCurrentUser() == null || getCurrentUser().i() == null) {
            setCurrentUser(this.mMainUser);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainUserData(HiUserInfo hiUserInfo) {
        int gender = hiUserInfo.getGender();
        if (gender != 2 && gender != 0 && gender != 1) {
            gender = -100;
        }
        if (this.mMainUser == null) {
            dnj dnjVar = new dnj();
            this.mMainUser = dnjVar;
            dnjVar.a(1);
            this.mMainUser.d(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        }
        this.mMainUser.e((byte) gender);
        this.mMainUser.e(hiUserInfo.getWeight());
        this.mMainUser.c(hiUserInfo.getHeight());
        this.mMainUser.e(hiUserInfo.getAge());
        this.mMainUser.d(hiUserInfo.getBirthday());
        this.mMainUser.e(hiUserInfo.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveWeightUserData(String str, dnj dnjVar, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            setUserPreference("custom.weight_multi_userinfo", str);
        } else {
            setUserPreference("custom.weight_multi_userinfo_expand", str);
        }
        setUserPreference("custom.weight_multi_userinfo_base", getAllUserStringWithoutPhoto());
        setUserStatus(dnjVar, z, z2);
    }

    private void syncHiOption() {
        int iD = HiDateUtil.d(System.currentTimeMillis());
        if (sSyncCount < 3 && iD == sPrevLastSyncDate) {
            realSyncHiOption();
            sSyncCount++;
        } else {
            if (iD != sPrevLastSyncDate) {
                sPrevLastSyncDate = iD;
                realSyncHiOption();
                sSyncCount = 1;
                return;
            }
            LogUtil.a(TAG, "one day can sync 3 time");
        }
    }

    private void realSyncHiOption() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setForceSync(true);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    private void setUserStatus(final dnj dnjVar, final boolean z, final boolean z2) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.5
            @Override // java.lang.Runnable
            public void run() {
                if (z2) {
                    if (z) {
                        MultiUsersManager multiUsersManager = MultiUsersManager.this;
                        multiUsersManager.setCurrentUser(multiUsersManager.mMainUser);
                        return;
                    }
                    dnj dnjVar2 = dnjVar;
                    if (dnjVar2 != null && dnjVar2.i().equals(MultiUsersManager.this.mCurrentUser.i())) {
                        MultiUsersManager.this.setCurrentUser(dnjVar);
                        return;
                    } else {
                        LogUtil.j(MultiUsersManager.TAG, "change user error");
                        return;
                    }
                }
                LogUtil.j(MultiUsersManager.TAG, "get userInfo error may be the user is null");
            }
        });
    }

    public dnj getSingleUserById(String str) {
        for (dnj dnjVar : this.mMainAllUser) {
            if (!TextUtils.isEmpty(str) && str.equals(dnjVar.i())) {
                return dnjVar;
            }
        }
        return null;
    }

    public List<dnj> getAllUser() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fetchMainUser(getUserInfomation()));
        arrayList.addAll(getOtherUserList());
        return arrayList;
    }

    private List<dnj> getOtherUserList() {
        if (this.mMultiUsersMap.get(null) != null) {
            this.mMultiUsersMap.remove(null);
        }
        if (this.mMultiUsersMap.get("") != null) {
            this.mMultiUsersMap.remove("");
        }
        ArrayList arrayList = new ArrayList(this.mMultiUsersMap.values());
        Collections.sort(arrayList, new Comparator<dnj>() { // from class: com.huawei.health.device.fatscale.multiusers.MultiUsersManager.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(dnj dnjVar, dnj dnjVar2) {
                if (dnjVar == null || dnjVar2 == null) {
                    return 0;
                }
                return Collator.getInstance(Locale.getDefault()).compare(dnjVar.h(), dnjVar2.h());
            }
        });
        LogUtil.a(TAG, "MutiUsersManager getOtherUserList otherUserList size is ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private dnj fetchMainUser(UserInfomation userInfomation) {
        dnj mainUser = getMainUser();
        if (mainUser != null && userInfomation != null) {
            if (!TextUtils.isEmpty(userInfomation.getName())) {
                mainUser.e(userInfomation.getName());
            } else {
                LogUtil.j(TAG, "MutiUsersManager getAllUser userInfo name is null");
            }
            mainUser.c(userInfomation.getPicPath());
        }
        if (mainUser != null && TextUtils.isEmpty(mainUser.h())) {
            mainUser.e(getAccountName());
        }
        return mainUser;
    }

    private UserInfomation getUserInfomation() {
        return ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
    }

    public List<dnj> getMainAllUser() {
        return this.mMainAllUser;
    }

    private int parseUserCountByKey(HiUserPreference hiUserPreference) {
        if (hiUserPreference == null) {
            return -1;
        }
        String value = hiUserPreference.getValue();
        if (TextUtils.isEmpty(value)) {
            return -1;
        }
        try {
            return new JSONArray(value).length();
        } catch (JSONException e) {
            LogUtil.e(TAG, "parseUserCountByKey_parseAllUserData " + e.getMessage());
            return uncompressUserDataCountByKey(value);
        }
    }

    private String getAccountName() {
        return new UpApi(BaseApplication.getContext()).getAccountName();
    }

    private int uncompressUserDataCountByKey(String str) {
        try {
            return new JSONArray(HiZipUtil.d(str)).length();
        } catch (IOException e) {
            LogUtil.e(TAG, "parseUserCountByKey_uncompressUserData " + e.getMessage());
            return -1;
        } catch (JSONException e2) {
            LogUtil.e(TAG, "parseUserCountByKey_uncompressUserData json " + e2.getMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSubToTheKey(HiUserPreference hiUserPreference, String str) {
        if (hiUserPreference != null) {
            String value = hiUserPreference.getValue();
            if (!TextUtils.isEmpty(value)) {
                try {
                    JSONArray jSONArray = new JSONArray(value);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        dnj dnjVar = new dnj(new JSONObject(jSONArray.optString(i)));
                        if (dnjVar.i() != null && dnjVar.i().equals(str)) {
                            return true;
                        }
                    }
                } catch (JSONException e) {
                    LogUtil.e(TAG, "parseUserCountByKey_parseAllUserData " + e.getMessage());
                    return uncompressUserDataSubToKey(value, str);
                }
            }
        }
        return false;
    }

    private boolean uncompressUserDataSubToKey(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(HiZipUtil.d(str));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                dnj dnjVar = new dnj(new JSONObject(jSONArray.optString(i)));
                if (dnjVar.i() != null && dnjVar.i().equals(str2)) {
                    return true;
                }
            }
        } catch (IOException e) {
            LogUtil.e(TAG, "parseUserCountByKey_uncompressUserData " + e.getMessage());
        } catch (JSONException e2) {
            LogUtil.e(TAG, "parseUserCountByKey_uncompressUserData json " + e2.getMessage());
        }
        return false;
    }

    public String getSid(String str) {
        String str2;
        Iterator<Map.Entry<String, String>> it = this.mSidList.entrySet().iterator();
        String str3 = "_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String value = next.getValue();
            if (this.mSidList.containsValue(str)) {
                if (str.equals(value)) {
                    str2 = next.getKey() + str3;
                    break;
                }
            } else {
                if ("".equals(value)) {
                    str2 = next.getKey() + str3;
                    break;
                }
                LogUtil.j(TAG, "getSid default");
            }
        }
        LogUtil.a(TAG, "getSid, sid end");
        return str2;
    }

    public void setUuidBySid(String str, String str2) {
        String strI = getMainUser().i();
        if (TextUtils.isEmpty(str2) || "0".equals(str2) || Constants.NULL.equalsIgnoreCase(str2) || str2.equals(strI)) {
            LogUtil.a(TAG, "this is mainUser,uuid is null");
            return;
        }
        if (str.contains("_")) {
            str = str.substring(0, str.indexOf("_"));
        }
        Map<String, String> map = this.mSidList;
        if (map == null || map.isEmpty()) {
            initSidList();
        }
        if (this.mSidList.containsKey(str)) {
            if ("delete".equals(str2)) {
                this.mSidList.put(str, "");
            } else {
                this.mSidList.put(str, str2);
            }
        }
    }
}
