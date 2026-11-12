package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.smarter.BaseSmarter;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ntd extends BaseSmarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43667a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ntd f43668b;

    private ntd(Context context) {
        super(context);
        this.f17713c = context.getApplicationContext();
    }

    public static ntd a(Context context) {
        if (f43668b == null) {
            synchronized (f43667a) {
                if (f43668b == null) {
                    if (context == null) {
                        f43668b = new ntd(BaseApplication.getContext());
                    } else {
                        f43668b = new ntd(context);
                    }
                }
            }
        }
        return f43668b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2, int i2) {
        LogUtil.a("UIDV_InfoSmarter", "insertOneInfoMessageToDb msgType = ", Integer.valueOf(i));
        if (TextUtils.isEmpty(str2)) {
            LogUtil.a("UIDV_InfoSmarter", "DEFAULT_RECOMMEND_TIME");
            str2 = SmartMsgConstant.DEFAULT_SHOW_TIME;
        }
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        List<MessageObject> messages = messageCenterApi.getMessages(str);
        if (CommonUtil.SLEEP_INFO.equals(str)) {
            messages.addAll(messageCenterApi.getMessages(CommonUtil.STRESS_INFO));
        }
        ArrayList arrayList = new ArrayList(5);
        for (MessageObject messageObject : messages) {
            if (messageObject != null && !TextUtils.isEmpty(messageObject.getImgUri()) && !TextUtils.isEmpty(messageObject.getDetailUri())) {
                arrayList.add(messageObject);
            }
        }
        LogUtil.a("UIDV_InfoSmarter", "insertOneInfoMessageToDb infoMessageList.size = ", Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            LogUtil.e("UIDV_InfoSmarter", "no message msgType = ", Integer.valueOf(i));
            return;
        }
        Collections.sort(arrayList, new d());
        Collections.sort(arrayList, new c());
        c((MessageObject) arrayList.get(0), i, str2, i2);
    }

    private void c(MessageObject messageObject, int i, String str, int i2) {
        int id;
        SmartMsgDbObject smartMsgDbObjectA = nsv.e(this.f17713c).a(i);
        String string = "";
        long j = 0;
        if (smartMsgDbObjectA == null) {
            LogUtil.a("UIDV_InfoSmarter", "no oldMsgDbObject");
            id = 0;
        } else {
            id = smartMsgDbObjectA.getId();
            try {
                JSONObject jSONObject = new JSONObject(smartMsgDbObjectA.getMsgContent());
                string = jSONObject.getString("msgId");
                j = jSONObject.getLong("createTime");
            } catch (JSONException e) {
                LogUtil.e("UIDV_InfoSmarter", "JSONException = ", e.getMessage());
            }
        }
        if (TextUtils.isEmpty(string)) {
            b(i, messageObject, str);
            return;
        }
        if (!string.equals(messageObject.getMsgId())) {
            b(i, messageObject, str);
        } else if (j == messageObject.getCreateTime()) {
            LogUtil.a("UIDV_InfoSmarter", "no message change");
        } else {
            a(messageObject, str, id);
        }
    }

    private void a(MessageObject messageObject, String str, int i) {
        LogUtil.a("UIDV_InfoSmarter", "updateMessage");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", messageObject.getMsgTitle());
            jSONObject.put("msgId", messageObject.getMsgId());
            jSONObject.put(SmartMsgConstant.MSG_CONTENT_MESSAGE_CENTER_DETAIL_URL, messageObject.getDetailUri());
            jSONObject.put("createTime", messageObject.getCreateTime());
        } catch (JSONException e) {
            LogUtil.e("UIDV_InfoSmarter", "JSONException = ", e.getMessage());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgContent", jSONObject.toString());
        contentValues.put("expireTime", Long.valueOf(messageObject.getExpireTime()));
        contentValues.put(SmartMsgConstant.MSG_SHOW_TIME, str);
        contentValues.put("priority", Integer.valueOf(R.attr.priority));
        nsv.e(this.f17713c).d(i, contentValues);
    }

    private void b(int i, MessageObject messageObject, String str) {
        LogUtil.a("UIDV_InfoSmarter", "insertMessage");
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(i);
        smartMsgDbObject.setMsgSrc(4);
        smartMsgDbObject.setMsgContentType(2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", messageObject.getMsgTitle());
            jSONObject.put("msgId", messageObject.getMsgId());
            jSONObject.put(SmartMsgConstant.MSG_CONTENT_MESSAGE_CENTER_DETAIL_URL, messageObject.getDetailUri());
            jSONObject.put("createTime", messageObject.getCreateTime());
        } catch (JSONException e) {
            LogUtil.e("UIDV_InfoSmarter", "JSONException = ", e.getMessage());
        }
        smartMsgDbObject.setMsgContent(jSONObject.toString());
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setExpireTime(messageObject.getExpireTime());
        smartMsgDbObject.setShowTime(str);
        smartMsgDbObject.setStatus(1);
        smartMsgDbObject.setMessagePriority(R.attr.priority);
        nsv.e(this.f17713c).d(i);
        nsv.e(this.f17713c).e(smartMsgDbObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        SmartMsgDbObject smartMsgDbObjectA = nsv.e(this.f17713c).a(i);
        if (smartMsgDbObjectA == null || smartMsgDbObjectA.getStatus() != 1) {
            LogUtil.a("UIDV_InfoSmarter", "deleteAfterCheckStatus msgType = ", Integer.valueOf(i), "no delete");
        } else {
            LogUtil.a("UIDV_InfoSmarter", "deleteAfterCheckStatus msgType = ", Integer.valueOf(i));
            nsv.e(this.f17713c).d(i);
        }
    }

    public void i() {
        lsy.a(new Runnable() { // from class: ntd.4
            @Override // java.lang.Runnable
            public void run() {
                int i;
                if (!ntd.this.a("reduce_fat_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-001")) {
                    ntd.this.e(40000);
                    LogUtil.a("UIDV_InfoSmarter", "weightRecommend deleteAfterCheckStatus");
                    return;
                }
                final int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-001");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-001", "recently_num_days_have_data");
                if (TextUtils.isEmpty(strC)) {
                    i = 0;
                } else {
                    try {
                        i = Integer.parseInt(strC);
                    } catch (NumberFormatException e) {
                        LogUtil.e("UIDV_InfoSmarter", "NumberFormatException = ", e.getMessage());
                        i = 0;
                    }
                }
                final String strC2 = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-001");
                LogUtil.a("UIDV_InfoSmarter", "weightRecommend priority = ", Integer.valueOf(iD), ", recentlyHaveDataDate = ", strC, ", recommendedTime = ", strC2);
                boolean zG = nss.g();
                boolean zA = nsy.a(ntd.this.f17713c).a(4);
                if (zG || zA) {
                    ntd.this.a(CommonUtil.WEIGHT_INFO, 40000, strC2, iD);
                    return;
                }
                nkf.a().e(ntd.this.f17713c, System.currentTimeMillis() - (((long) i) * 86400000), System.currentTimeMillis(), 1, new IBaseResponseCallback() { // from class: ntd.4.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        ntd.this.d(i2, obj, strC2, iD);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj, String str, int i2) {
        LogUtil.a("UIDV_InfoSmarter", "getWeightData onResponse errCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof List)) {
            if (!((List) obj).isEmpty()) {
                a(CommonUtil.WEIGHT_INFO, 40000, str, i2);
            } else {
                e(40000);
                LogUtil.a("UIDV_InfoSmarter", "weightRecommend deleteAfterCheckStatus");
            }
        }
    }

    private void n() {
        lsy.a(new Runnable() { // from class: ntd.2
            @Override // java.lang.Runnable
            public void run() {
                if (!ntd.this.a("daily_health_care_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-002")) {
                    LogUtil.a("UIDV_InfoSmarter", "walkRecommend deleteAfterCheckStatus");
                    ntd.this.e(40001);
                    return;
                }
                int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-002");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-002");
                LogUtil.a("UIDV_InfoSmarter", "walkRecommend priority = ", Integer.valueOf(iD), ", recommendedTime = ", strC);
                boolean zA = nss.a();
                boolean zE = nss.e();
                if (zA && zE) {
                    ntd.this.a(CommonUtil.WALK_INFO, 40001, strC, iD);
                } else {
                    LogUtil.a("UIDV_InfoSmarter", "walkRecommend deleteAfterCheckStatus");
                    ntd.this.e(40001);
                }
            }
        });
    }

    public void d() {
        lsy.a(new Runnable() { // from class: ntd.5
            @Override // java.lang.Runnable
            public void run() {
                int i;
                if (!ntd.this.a("blood_pressure_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-003")) {
                    LogUtil.a("UIDV_InfoSmarter", "bloodPressureRecommend deleteAfterCheckStatus");
                    ntd.this.e(40002);
                    return;
                }
                int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-003");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-003", "recently_num_days_have_data");
                if (TextUtils.isEmpty(strC)) {
                    i = 0;
                } else {
                    try {
                        i = Integer.parseInt(strC);
                    } catch (NumberFormatException e) {
                        LogUtil.e("UIDV_InfoSmarter", "NumberFormatException = ", e.getMessage());
                        i = 0;
                    }
                }
                String strC2 = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-003");
                LogUtil.a("UIDV_InfoSmarter", "bloodPressureRecommend priority = ", Integer.valueOf(iD), ", recentlyHaveDataDate = ", strC, ", recommendedTime = ", strC2);
                int iA = ntl.a(ntd.this.f17713c, "HDK_BLOOD_PRESSURE");
                boolean zA = nsy.a(ntd.this.f17713c).a(6);
                if (iA > 0 || zA) {
                    ntd.this.a(CommonUtil.BLOOD_PRESSURE_INFO, 40002, strC2, iD);
                    return;
                }
                ntd.this.b(System.currentTimeMillis() - (((long) i) * 86400000), 1, strC2, iD);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, int i, final String str, final int i2) {
        nkb.d().d(j, System.currentTimeMillis(), i, new IBaseResponseCallback() { // from class: ntd.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("UIDV_InfoSmarter", "getBloodPressureData onResponse errCode = ", Integer.valueOf(i3));
                if (i3 == 0 && (obj instanceof List)) {
                    if (!((List) obj).isEmpty()) {
                        ntd.this.a(CommonUtil.BLOOD_PRESSURE_INFO, 40002, str, i2);
                    } else {
                        LogUtil.a("UIDV_InfoSmarter", "bloodPressureRecommend deleteAfterCheckStatus");
                        ntd.this.e(40002);
                    }
                }
            }
        });
    }

    private void j() {
        lsy.a(new Runnable() { // from class: ntd.6
            @Override // java.lang.Runnable
            public void run() {
                if (!ntd.this.a("body_build_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-004")) {
                    LogUtil.a("UIDV_InfoSmarter", "healthRecommend deleteAfterCheckStatus");
                    ntd.this.e(40003);
                    return;
                }
                int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-004");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-004");
                LogUtil.a("UIDV_InfoSmarter", "healthRecommend priority = ", Integer.valueOf(iD), ", recommendedTime = ", strC);
                boolean zC = nss.c();
                boolean zA = nsy.a(ntd.this.f17713c).a(3);
                if (zC || zA) {
                    ntd.this.a(CommonUtil.HEALTH_INFO, 40003, strC, iD);
                } else {
                    LogUtil.a("UIDV_InfoSmarter", "healthRecommend deleteAfterCheckStatus");
                    ntd.this.e(40003);
                }
            }
        });
    }

    private void l() {
        lsy.a(new Runnable() { // from class: ntd.10
            @Override // java.lang.Runnable
            public void run() {
                if (!ntd.this.a("run_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-005")) {
                    LogUtil.a("UIDV_InfoSmarter", "runRecommend deleteAfterCheckStatus");
                    ntd.this.e(40004);
                    return;
                }
                int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-005");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-005");
                LogUtil.a("UIDV_InfoSmarter", "runRecommend priority = ", Integer.valueOf(iD), ", recommendedTime = ", strC);
                boolean zD = nss.d();
                boolean zA = nsy.a(ntd.this.f17713c).a(0);
                if (zD || zA) {
                    ntd.this.a(CommonUtil.RUN_INFO, 40004, strC, iD);
                } else {
                    LogUtil.a("UIDV_InfoSmarter", "runRecommend deleteAfterCheckStatus");
                    ntd.this.e(40004);
                }
            }
        });
    }

    private void m() {
        lsy.a(new Runnable() { // from class: ntd.8
            @Override // java.lang.Runnable
            public void run() {
                if (!ntd.this.a("ride_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-006")) {
                    LogUtil.a("UIDV_InfoSmarter", "rideRecommend deleteAfterCheckStatus");
                    ntd.this.e(SmartMsgConstant.MSG_TYPE_RIDE_USER);
                    return;
                }
                int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-006");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-006");
                LogUtil.a("UIDV_InfoSmarter", "rideRecommend priority = ", Integer.valueOf(iD), ", recommendedTime = ", strC);
                boolean zB = nss.b();
                boolean zA = nsy.a(ntd.this.f17713c).a(1);
                if (zB || zA) {
                    ntd.this.a(CommonUtil.RIDE_INFO, SmartMsgConstant.MSG_TYPE_RIDE_USER, strC, iD);
                } else {
                    LogUtil.a("UIDV_InfoSmarter", "rideRecommend deleteAfterCheckStatus");
                    ntd.this.e(SmartMsgConstant.MSG_TYPE_RIDE_USER);
                }
            }
        });
    }

    public void a() {
        LogUtil.a("UIDV_InfoSmarter", "bloodSugarRecommend");
        lsy.a(new Runnable() { // from class: ntd.7
            @Override // java.lang.Runnable
            public void run() {
                int i;
                if (ntd.this.g()) {
                    final int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-007");
                    String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-007", "recently_num_days_have_data");
                    if (TextUtils.isEmpty(strC)) {
                        i = 0;
                    } else {
                        try {
                            i = Integer.parseInt(strC);
                        } catch (NumberFormatException e) {
                            LogUtil.e("UIDV_InfoSmarter", "NumberFormatException = ", e.getMessage());
                            i = 0;
                        }
                    }
                    final String strC2 = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-007");
                    int iA = ntl.a(ntd.this.f17713c, "HDK_BLOOD_SUGAR");
                    boolean zA = nsy.a(ntd.this.f17713c).a(7);
                    LogUtil.d("UIDV_InfoSmarter", "bloodSugarRecommend BindBloods = ", Integer.valueOf(iA), ", isFocusBloodSugar = ", Boolean.valueOf(zA));
                    if (iA > 0 || zA) {
                        ntd.this.a(CommonUtil.BLOOD_SUGAR_INFO, SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER, strC2, iD);
                        return;
                    }
                    nkb.d().b(ntd.this.f17713c, System.currentTimeMillis() - (((long) i) * 86400000), System.currentTimeMillis(), 1, new IBaseResponseCallback() { // from class: ntd.7.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj) {
                            LogUtil.a("UIDV_InfoSmarter", "bloodSugarRecommend onResponse errCode = ", Integer.valueOf(i2));
                            ntd.this.b(i2, obj, SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER, strC2, iD);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (a("blood_sugar_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-007")) {
            return true;
        }
        LogUtil.a("UIDV_InfoSmarter", "bloodSugarRecommend deleteAfterCheckStatus");
        e(SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj, int i2, String str, int i3) {
        if (!(obj instanceof List)) {
            LogUtil.a("UIDV_InfoSmarter", "setRecommendResponse objData is null!");
            return;
        }
        if (i == 0) {
            if (!((List) obj).isEmpty()) {
                LogUtil.a("UIDV_InfoSmarter", "setRecommendResponse have data");
                a(CommonUtil.BLOOD_SUGAR_INFO, i2, str, i3);
                return;
            } else {
                LogUtil.a("UIDV_InfoSmarter", "setRecommendResponse deleteAfterCheckStatus");
                e(i2);
                return;
            }
        }
        LogUtil.a("UIDV_InfoSmarter", "setRecommendResponse deleteAfterCheckStatus");
        e(i2);
    }

    public void h() {
        lsy.a(new Runnable() { // from class: ntd.9
            @Override // java.lang.Runnable
            public void run() {
                int i;
                if (!ntd.this.a("sleep_user", OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-008")) {
                    LogUtil.a("UIDV_InfoSmarter", "sleepRecommend deleteAfterCheckStatus");
                    ntd.this.e(SmartMsgConstant.MSG_TYPE_SLEEP_USER);
                    return;
                }
                int iD = ntl.d(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-008");
                String strC = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-008", "recently_num_days_have_data");
                if (TextUtils.isEmpty(strC)) {
                    i = 0;
                } else {
                    try {
                        i = Integer.parseInt(strC);
                    } catch (NumberFormatException e) {
                        LogUtil.e("UIDV_InfoSmarter", "NumberFormatException = ", e.getMessage());
                        i = 0;
                    }
                }
                String strC2 = ntl.c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "ai-info-008");
                LogUtil.a("UIDV_InfoSmarter", "sleepRecommend priority = ", Integer.valueOf(iD), ", recentlyHaveDataDate = ", strC, ", recommendedTime = ", strC2);
                if (nsy.a(ntd.this.f17713c).a(5)) {
                    LogUtil.a("UIDV_InfoSmarter", "sleep insert");
                    ntd.this.a(CommonUtil.SLEEP_INFO, SmartMsgConstant.MSG_TYPE_SLEEP_USER, strC2, iD);
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setTimeInterval(jCurrentTimeMillis - (((long) i) * 86400000), System.currentTimeMillis());
                hiDataReadOption.setType(new int[]{44105, 44004});
                hiDataReadOption.setSortOrder(1);
                hiDataReadOption.setCount(7);
                ntd.this.e(hiDataReadOption, strC2, iD);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiDataReadOption hiDataReadOption, final String str, final int i) {
        HiHealthManager.d(this.f17713c).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ntd.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (!(obj instanceof SparseArray)) {
                    LogUtil.a("UIDV_InfoSmarter", "requestSleepData data is null");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                List list = (List) sparseArray.get(44004);
                List list2 = (List) sparseArray.get(44105);
                boolean z = false;
                boolean z2 = (list == null || list.isEmpty()) ? false : true;
                if (list2 != null && !list2.isEmpty()) {
                    z = true;
                }
                if (z2 || z) {
                    ntd.this.a(CommonUtil.SLEEP_INFO, SmartMsgConstant.MSG_TYPE_SLEEP_USER, str, i);
                } else {
                    LogUtil.a("UIDV_InfoSmarter", "sleepRecommend deleteAfterCheckStatus");
                    ntd.this.e(SmartMsgConstant.MSG_TYPE_SLEEP_USER);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("UIDV_InfoSmarter", "requestSleepData onResultIntent");
            }
        });
    }

    public static class c implements Comparator<MessageObject>, Serializable {
        private static final long serialVersionUID = -8568787313376601753L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(MessageObject messageObject, MessageObject messageObject2) {
            return messageObject2.getWeight() - messageObject.getWeight();
        }
    }

    public static class d implements Comparator<MessageObject>, Serializable {
        private static final long serialVersionUID = 2755029354926884596L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(MessageObject messageObject, MessageObject messageObject2) {
            return Long.compare(messageObject2.getCreateTime(), messageObject.getCreateTime());
        }
    }

    public void c() {
        LogUtil.a("UIDV_InfoSmarter", "allUserRecommend");
        i();
        d();
        a();
        m();
        l();
        h();
        j();
        n();
    }

    public void e() {
        LogUtil.a("UIDV_InfoSmarter", "labelRelatedRecommend");
        i();
        n();
        j();
        l();
        m();
    }

    public void f() {
        LogUtil.a("UIDV_InfoSmarter", "userPreferenceRelatedRecommend");
        i();
        d();
        a();
        m();
        l();
        h();
        j();
    }

    @Override // com.huawei.hwsmartinteractmgr.smarter.BaseSmarter
    public void b() {
        LogUtil.a("UIDV_InfoSmarter", "info startTimerCheck");
        c();
    }
}
