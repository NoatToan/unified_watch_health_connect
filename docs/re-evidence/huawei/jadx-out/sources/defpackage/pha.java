package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.pluginmessagecenter.R;
import com.huawei.pluginmessagecenter.provider.data.MessageCenterList;
import com.huawei.pluginmessagecenter.service.MessageGenerator;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pha extends pbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Byte[] f45346a = new Byte[1];
    private static volatile pha e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f45347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Integer> f45348c;
    private b d = null;

    private pha(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f45347b = applicationContext;
        init(applicationContext);
    }

    public static pha e(Context context) {
        if (e == null) {
            synchronized (f45346a) {
                if (e == null) {
                    e = new pha(context);
                }
            }
        }
        return e;
    }

    private void i() {
        LogUtil.a("UIDV_PluginMessageCenter", "processSwitchUserOrLanguage");
        if (this.d == null) {
            this.d = new b();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        try {
            this.f45347b.unregisterReceiver(this.d);
        } catch (IllegalArgumentException unused) {
            LogUtil.a("UIDV_PluginMessageCenter", "processSwitchUserOrLanguage IllegalArgument unregisterReceiver");
        }
        this.f45347b.registerReceiver(this.d, intentFilter);
        lsy.a(new Runnable() { // from class: pha.5
            @Override // java.lang.Runnable
            public void run() {
                String strE = SharedPreferenceManager.e(pha.this.f45347b, Integer.toString(PrebakedEffectId.RT_FAST_MOVING), "messageLastLoginHuid");
                String huidOrDefault = LoginInit.getInstance(BaseApplication.b()).getHuidOrDefault();
                pgz.c(pha.this.f45347b).a(huidOrDefault);
                if (!TextUtils.isEmpty(strE) && !strE.equals(huidOrDefault)) {
                    LogUtil.a("UIDV_PluginMessageCenter", "processSwitchUserOrLanguage user change");
                    SharedPreferenceManager.e(pha.this.f45347b, Integer.toString(PrebakedEffectId.RT_FAST_MOVING), "messageLastLoginHuid", huidOrDefault, new StorageParams(1));
                    pgz.c(pha.this.f45347b).e();
                }
                if (TextUtils.isEmpty(strE)) {
                    SharedPreferenceManager.e(pha.this.f45347b, Integer.toString(PrebakedEffectId.RT_FAST_MOVING), "messageLastLoginHuid", huidOrDefault, new StorageParams(1));
                }
                String strD = pgz.c(pha.this.f45347b).d();
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(strD) && !strD.equals(language)) {
                    LogUtil.a("UIDV_PluginMessageCenter", "language change");
                    pgz.c(pha.this.f45347b).e();
                }
                pgz.c(pha.this.f45347b).j(language);
            }
        });
    }

    @Override // defpackage.pbx
    public void init(Context context) {
        super.init(context);
        LogUtil.a("UIDV_PluginMessageCenter", "init");
        CommonUtil.initWearType();
        i();
        a(context);
    }

    @Override // defpackage.pbx
    public void finish() {
        super.finish();
        LogUtil.a("UIDV_PluginMessageCenter", "finish");
        b bVar = this.d;
        if (bVar != null) {
            this.f45347b.unregisterReceiver(bVar);
            this.d = null;
        }
        pgz.c(this.f45347b).c();
    }

    public String d(String str, String str2) {
        LogUtil.a("UIDV_PluginMessageCenter", "requestMessageId");
        return MessageGenerator.getInstance(this.f45347b).requestMessageId(str, str2);
    }

    public void b(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        lsy.a(new Runnable() { // from class: pha.1
            @Override // java.lang.Runnable
            public void run() {
                String strRequestMessageId = MessageGenerator.getInstance(pha.this.f45347b).requestMessageId(str, str2);
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, strRequestMessageId);
                }
            }
        });
    }

    public boolean a(MessageObject messageObject) {
        LogUtil.a("UIDV_PluginMessageCenter", "generateMessage");
        return MessageGenerator.getInstance(this.f45347b).generateMessage(messageObject);
    }

    public List<MessageObject> a(int i, int i2) {
        String deviceModel;
        synchronized (f45346a) {
            LogUtil.a("UIDV_PluginMessageCenter", "getMessageList | pageNo = ", Integer.valueOf(i), "; pageSize = ", Integer.valueOf(i2));
            if (i < 0 || i2 < 0) {
                LogUtil.a("UIDV_PluginMessageCenter", "pageNo or pageSize is invalid.");
                return new ArrayList();
            }
            String strValueOf = "";
            String str = "";
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "UIDV_PluginMessageCenter");
            if (deviceInfo != null) {
                strValueOf = String.valueOf(deviceInfo.getProductType());
                String deviceModel2 = deviceInfo.getDeviceModel();
                String deviceModel3 = deviceInfo.getDeviceModel();
                deviceModel = deviceModel2;
                str = deviceModel3;
            } else {
                deviceModel = PhoneInfoUtils.getDeviceModel();
            }
            String wearType = CommonUtil.getWearType(strValueOf, str);
            if (!TextUtils.isEmpty(deviceModel)) {
                deviceModel = deviceModel.trim();
            }
            return pgz.c(this.f45347b).b(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011), wearType, deviceModel, i, i2);
        }
    }

    public List<MessageObject> b(String str, String str2) {
        LogUtil.a("UIDV_PluginMessageCenter", "getMessage | module = ", str, "; type = ", str2);
        return pgz.c(this.f45347b).d(str, str2);
    }

    public int c() {
        LogUtil.a("UIDV_PluginMessageCenter", "getMessageCenterUnReadCount");
        List<MessageObject> listA = a(j());
        int i = 0;
        if (listA != null && !listA.isEmpty()) {
            for (MessageObject messageObject : listA) {
                if (pht.e(messageObject) && !messageObject.getMsgId().equals("kakaMessage") && messageObject.getReadFlag() == 0 && !b(messageObject)) {
                    i++;
                }
            }
        }
        return i;
    }

    private boolean f(MessageObject messageObject) {
        return (String.valueOf(18).equals(messageObject.getModule()) || String.valueOf(16).equals(messageObject.getModule())) && !phd.e(messageObject);
    }

    private boolean d(MessageObject messageObject) {
        return String.valueOf(17).equals(messageObject.getModule()) && !phd.e(messageObject);
    }

    private boolean e(MessageObject messageObject) {
        return String.valueOf(18).equals(messageObject.getModule()) && phd.e(messageObject);
    }

    private boolean c(MessageObject messageObject) {
        boolean z = MessageConstant.ACTIVE_TARGET_TYPE.equals(messageObject.getType()) && !phd.e(messageObject);
        LogUtil.a("UIDV_PluginMessageCenter", "active target message valid: ", Boolean.valueOf(z));
        return z;
    }

    private boolean b(MessageObject messageObject) {
        return !(messageObject.getExpireTime() == 0 || f(messageObject) || d(messageObject) || c(messageObject));
    }

    public List<MessageObject> c(String str) {
        LogUtil.a("UIDV_PluginMessageCenter", "getMessageCenterListMessageByModule");
        List<MessageObject> listA = a(j());
        if (listA == null || listA.isEmpty()) {
            return new ArrayList(8);
        }
        ArrayList arrayList = new ArrayList(listA.size());
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        for (MessageObject messageObject : listA) {
            if (pht.e(messageObject) && str.equalsIgnoreCase(messageObject.getModule())) {
                LogUtil.d("UIDV_PluginMessageCenter", "getMessageCenterListMessageByModule list=", messageObject.toString());
                String module = messageObject.getModule();
                AchieveDataApi achieveDataApi = (AchieveDataApi) Services.b("PluginAchievement", AchieveDataApi.class);
                if (module.equals(String.valueOf(17)) && messageObject.getType().equals("unclaimedKaka") && !achieveDataApi.getKakaTaskRedDot(this.f45347b)) {
                    LogUtil.a("UIDV_PluginMessageCenter", "no kaka to claim");
                } else if (module.equals(String.valueOf(17)) && messageObject.getType().equals("kakaExpiration") && (messageObject.getReadFlag() == 1 || System.currentTimeMillis() > messageObject.getExpireTime())) {
                    LogUtil.a("UIDV_PluginMessageCenter", "kaka expiration msg is read or is expired");
                } else if (!TextUtils.isEmpty(i(module)) && !e(messageObject) && (!module.equals(String.valueOf(90)) || accountInfo.equals(messageObject.getHuid()))) {
                    messageObject.setInfoClassify(i(module));
                    arrayList.add(messageObject);
                }
            }
        }
        if (String.valueOf(90).equals(str)) {
            Collections.sort(arrayList, new Comparator() { // from class: pgx
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((MessageObject) obj2).getCreateTime(), ((MessageObject) obj).getCreateTime());
                }
            });
            return arrayList;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public List<MessageObject> b(List<MessageObject> list) {
        HashMap<String, MessageCenterList> map = new HashMap<>(8);
        for (MessageObject messageObject : list) {
            if (pht.e(messageObject)) {
                LogUtil.d("UIDV_PluginMessageCenter", "getMessageCenterCategory=", messageObject.toString());
                if (!e(messageObject)) {
                    if (map.containsKey(messageObject.getModule())) {
                        MessageCenterList messageCenterList = map.get(messageObject.getModule());
                        messageCenterList.setDate(String.valueOf(messageObject.getReceiveTime()));
                        messageCenterList.setMessageObject(messageObject);
                        int unread = messageCenterList.getUnread();
                        if (!messageObject.getMsgId().equals("kakaMessage") && messageObject.getReadFlag() == 0) {
                            messageCenterList.setUnread(unread + 1);
                        }
                        map.put(messageObject.getModule(), messageCenterList);
                    } else {
                        MessageCenterList messageCenterList2 = new MessageCenterList();
                        messageCenterList2.setMessageObject(messageObject);
                        messageCenterList2.setDate(String.valueOf(messageObject.getReceiveTime()));
                        messageCenterList2.setModule(messageObject.getModule());
                        if (!messageObject.getMsgId().equals("kakaMessage") && messageObject.getReadFlag() == 0) {
                            messageCenterList2.setUnread(1);
                        } else {
                            messageCenterList2.setUnread(0);
                        }
                        map.put(messageObject.getModule(), messageCenterList2);
                    }
                }
            }
        }
        return d(map);
    }

    private List<MessageObject> d(HashMap<String, MessageCenterList> map) {
        ArrayList arrayList = new ArrayList(8);
        Iterator<Map.Entry<String, MessageCenterList>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            MessageCenterList value = it.next().getValue();
            String strI = i(value.getModule());
            if (!TextUtils.isEmpty(strI)) {
                MessageObject messageObject = new MessageObject();
                messageObject.setMsgTitle(strI);
                messageObject.setModule(value.getMessageObject().getModule());
                messageObject.setMsgContent(value.getMessageObject().getMsgTitle());
                messageObject.setFlag(0);
                messageObject.setMsgType(value.getMessageObject().getMsgType());
                messageObject.setWeight(value.getMessageObject().getWeight());
                messageObject.setReadFlag(value.getUnread());
                messageObject.setExpireTime(value.getMessageObject().getExpireTime());
                messageObject.setCreateTime(value.getMessageObject().getCreateTime());
                messageObject.setReceiveTime(value.getMessageObject().getReceiveTime());
                messageObject.setPosition(value.getMessageObject().getPosition());
                messageObject.setMsgPosition(11);
                messageObject.setHuid(value.getMessageObject().getHuid());
                messageObject.setType(value.getMessageObject().getType());
                LogUtil.a("UIDV_PluginMessageCenter", "getMessageCenterListMessage type=", messageObject.toString());
                arrayList.add(messageObject);
            }
        }
        Collections.sort(arrayList, new Comparator<MessageObject>() { // from class: pha.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(MessageObject messageObject2, MessageObject messageObject3) {
                if (messageObject2.getReceiveTime() > messageObject3.getReceiveTime()) {
                    return -1;
                }
                return messageObject2.getReceiveTime() == messageObject3.getReceiveTime() ? 0 : 1;
            }
        });
        LogUtil.a("UIDV_PluginMessageCenter", "getMessageCenterListMessage messageObjects size=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private String i(String str) {
        String string;
        if (this.f45348c == null) {
            HashMap<String, Integer> map = new HashMap<>(15);
            this.f45348c = map;
            map.put(String.valueOf(14), Integer.valueOf(R.string.IDS_hw_messagecenter_recommendation));
            this.f45348c.put(String.valueOf(30), Integer.valueOf(R.string.IDS_main_home_bottom_text_activity));
            this.f45348c.put(String.valueOf(40), Integer.valueOf(R.string.IDS_hw_messagecenter_competition));
            this.f45348c.put(String.valueOf(15), Integer.valueOf(R.string.IDS_hwh_fitness_plan));
            this.f45348c.put(String.valueOf(50), Integer.valueOf(R.string.IDS_hw_messagecenter_service));
            this.f45348c.put(String.valueOf(16), Integer.valueOf(R.string.IDS_hw_messagecenter_data));
            this.f45348c.put(String.valueOf(17), Integer.valueOf(R.string.IDS_hwh_me_achieve_kaka));
            this.f45348c.put(String.valueOf(18), Integer.valueOf(R.string.IDS_clear_medal_data_cache));
            this.f45348c.put(String.valueOf(19), Integer.valueOf(R.string.IDS_hw_messagecenter_other));
            this.f45348c.put(String.valueOf(51), Integer.valueOf(R.string.IDS_hw_messagecenter_group));
            this.f45348c.put(String.valueOf(70), Integer.valueOf(R.string.IDS_member));
            this.f45348c.put(String.valueOf(80), Integer.valueOf(R.string.IDS_assets));
            this.f45348c.put(String.valueOf(90), Integer.valueOf(R.string.IDS_benefit_message));
            this.f45348c.put(String.valueOf(100), Integer.valueOf(R.string.IDS_message_active_target));
            this.f45348c.put(MessageConstant.CERTIFICATE, Integer.valueOf(R.string.IDS_hw_certificates));
        }
        if (!this.f45348c.containsKey(str)) {
            string = "";
        } else {
            string = this.f45347b.getString(this.f45348c.get(str).intValue());
        }
        LogUtil.a("UIDV_PluginMessageCenter", "getMessageCenterListMessage title=", string);
        return string;
    }

    public void d(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("UIDV_PluginMessageCenter", "getMessages | module = ", str, "; type = ", str2);
        lsy.a(new Runnable() { // from class: pha.2
            @Override // java.lang.Runnable
            public void run() {
                List<MessageObject> listD = pgz.c(pha.this.f45347b).d(str, str2);
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, listD);
                }
            }
        });
    }

    public List<MessageObject> e(String str) {
        synchronized (f45346a) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            List<MessageObject> listA = a();
            if (listA != null && !listA.isEmpty()) {
                ArrayList arrayList = new ArrayList(listA.size());
                Iterator<MessageObject> it = listA.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        LogUtil.a("UIDV_PluginMessageCenter", "getInfoMessageListByClassify resultMessageLists size = ", Integer.valueOf(arrayList.size()), " classify = ", str);
                        return arrayList;
                    }
                    MessageObject next = it.next();
                    if (!CommonUtil.WALK_INFO.equals(str) && !i(next)) {
                        z = false;
                    }
                    if (pht.c(next, str) && z) {
                        arrayList.add(next);
                    }
                }
            }
            return new ArrayList();
        }
    }

    private List<MessageObject> e() {
        LogUtil.a("UIDV_PluginMessageCenter", "getFaqMessageList");
        List<MessageObject> listA = a(0, 0);
        if (listA == null || listA.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(listA.size());
        for (MessageObject messageObject : listA) {
            if (messageObject != null && messageObject.getMsgPosition() == 31 && messageObject.getReadFlag() == 0) {
                arrayList.add(messageObject);
            }
        }
        return arrayList;
    }

    public List<MessageObject> b(int i) {
        LogUtil.a("UIDV_PluginMessageCenter", "getSpecificMessageList");
        if (i == 31) {
            return e();
        }
        List<MessageObject> listA = a(j());
        if (listA == null || listA.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(listA.size());
        for (MessageObject messageObject : listA) {
            boolean z = false;
            boolean z2 = i == 2 && pht.j(messageObject);
            boolean z3 = i == 26 && pht.a(messageObject);
            boolean z4 = i == 30 && pht.i(messageObject);
            boolean z5 = i == 29 && pht.d(messageObject);
            boolean z6 = i == 21 && pht.b(messageObject);
            boolean z7 = i == 11 && pht.e(messageObject);
            if (i == 42 && pht.f(messageObject)) {
                z = true;
            }
            if (z2 || z3 || z4 || z5 || z6 || z7 || z) {
                arrayList.add(messageObject);
            }
        }
        LogUtil.a("UIDV_PluginMessageCenter", "getSpecificMessageList = ", Integer.valueOf(arrayList.size()));
        d(arrayList, i);
        return arrayList;
    }

    private void d(List<MessageObject> list, int i) {
        if (i == 21) {
            Collections.sort(list, new Comparator<MessageObject>() { // from class: pha.3
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public int compare(MessageObject messageObject, MessageObject messageObject2) {
                    if (messageObject.getReceiveTime() > messageObject2.getReceiveTime()) {
                        return -1;
                    }
                    return messageObject.getReceiveTime() == messageObject2.getReceiveTime() ? 0 : 1;
                }
            });
        }
    }

    public List<MessageObject> a() {
        synchronized (f45346a) {
            List<MessageObject> listA = a(j());
            if (listA != null && !listA.isEmpty()) {
                ArrayList arrayList = new ArrayList(listA.size());
                for (MessageObject messageObject : listA) {
                    if (pht.c(messageObject)) {
                        arrayList.add(messageObject);
                    }
                }
                LogUtil.a("UIDV_PluginMessageCenter", "getInformationTypeMessageList = ", Integer.valueOf(arrayList.size()));
                return arrayList;
            }
            return new ArrayList();
        }
    }

    public List<MessageObject> a(List<String> list) {
        synchronized (f45346a) {
            List<MessageObject> listA = a(0, 0);
            if (listA != null && !listA.isEmpty()) {
                ArrayList arrayList = new ArrayList(listA.size());
                for (MessageObject messageObject : listA) {
                    if (messageObject != null && b(messageObject, list)) {
                        arrayList.add(messageObject);
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    public List<MessageObject> b() {
        synchronized (f45346a) {
            List<String> listJ = j();
            List<MessageObject> listA = a(0, 0);
            if (listA != null && !listA.isEmpty()) {
                ArrayList arrayList = new ArrayList(listA.size());
                for (MessageObject messageObject : listA) {
                    if (messageObject != null && b(messageObject, listJ)) {
                        if (messageObject.getModule().equals(String.valueOf(17)) && messageObject.getType().equals("unclaimedKaka")) {
                            if (((AchieveDataApi) Services.b("PluginAchievement", AchieveDataApi.class)).getKakaTaskRedDot(this.f45347b)) {
                                arrayList.add(messageObject);
                            }
                        } else if (!messageObject.getModule().equals(String.valueOf(17)) || !messageObject.getType().equals("kakaExpiration") || (messageObject.getReadFlag() != 1 && System.currentTimeMillis() <= messageObject.getExpireTime())) {
                            arrayList.add(messageObject);
                        }
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    public static boolean b(MessageObject messageObject, List<String> list) {
        boolean z = false;
        if (messageObject == null || list == null) {
            LogUtil.j("UIDV_PluginMessageCenter", "messageObject = null or userAllLabelList =null");
            return false;
        }
        synchronized (f45346a) {
            String msgUserLabel = messageObject.getMsgUserLabel();
            boolean z2 = true;
            if (TextUtils.isEmpty(msgUserLabel)) {
                return true;
            }
            try {
                JSONObject jSONObject = new JSONObject(msgUserLabel);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (true) {
                    if (!itKeys.hasNext()) {
                        z = true;
                        break;
                    }
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        int i = 0;
                        while (true) {
                            if (i >= jSONArray.length()) {
                                break loop0;
                            }
                            if (list.contains((String) jSONArray.get(i))) {
                                break;
                            }
                            i++;
                        }
                    } else {
                        break;
                    }
                }
                z2 = z;
            } catch (JSONException unused) {
                LogUtil.e("UIDV_PluginMessageCenter", "isShouldMsgRecommend JSONException");
            }
            return z2;
        }
    }

    private List<String> j() {
        String accountInfo = LoginInit.getInstance(this.f45347b).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            return new ArrayList();
        }
        String strE = SharedPreferenceManager.e(this.f45347b, String.valueOf(20009), accountInfo + CommonUtil.USER_LABEL_STORAGE_KEY);
        if (strE != null) {
            return Arrays.asList(strE.split(",|#"));
        }
        return new ArrayList();
    }

    private boolean i(MessageObject messageObject) {
        return messageObject != null && messageObject.getInfoRecommend() == 1;
    }

    public boolean d(String str) {
        LogUtil.a("UIDV_PluginMessageCenter", "onRead | msgId = ", str);
        return pgz.c(this.f45347b).e(str);
    }

    public boolean b(String str) {
        LogUtil.a("UIDV_PluginMessageCenter", "onShowSmartCard | msgId = ", str);
        return pgz.c(this.f45347b).c(str);
    }

    public void d(final MessageObserver messageObserver) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pha.10
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("UIDV_PluginMessageCenter", "registerMessageObserver observer = ", messageObserver);
                pgz.c(pha.this.f45347b).d(messageObserver);
            }
        });
    }

    public void a(final MessageObserver messageObserver) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pha.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("UIDV_PluginMessageCenter", "unRegisterMessageObserver observer = ", messageObserver);
                pgz.c(pha.this.f45347b).b(messageObserver);
            }
        });
    }

    public boolean a(String str) {
        boolean z;
        synchronized (f45346a) {
            LogUtil.a("UIDV_PluginMessageCenter", "deleteMessage | msgId = ", str);
            z = pgz.c(this.f45347b).d(str) == 0;
        }
        return z;
    }

    public void d() {
        synchronized (f45346a) {
            pgz.c(this.f45347b).b();
        }
    }

    public void c(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("UIDV_PluginMessageCenter", "deleteMessagesByModuleAndType | module = ", str, "; type = ", str2);
        lsy.a(new Runnable() { // from class: pha.6
            @Override // java.lang.Runnable
            public void run() {
                List<MessageObject> listD = pgz.c(pha.this.f45347b).d(str, str2);
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, listD);
                }
                Iterator<MessageObject> it = listD.iterator();
                while (it.hasNext()) {
                    pha.this.a(it.next().getMsgId());
                }
            }
        });
    }

    static class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, final Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            lsy.a(new Runnable() { // from class: pha.b.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    LogUtil.d("UIDV_PluginMessageCenter", "onReceive action=", action);
                    if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
                        String strD = pgz.c(context).d();
                        LogUtil.a("UIDV_PluginMessageCenter", "onReceive lastLanguage=", strD);
                        String language = Locale.getDefault().getLanguage();
                        LogUtil.a("UIDV_PluginMessageCenter", "onReceive currentLanguage=", language);
                        pgz.c(context).j(language);
                        if (strD.equals(language)) {
                            return;
                        }
                        LogUtil.a("UIDV_PluginMessageCenter", "config change");
                        pgz.c(context).e();
                    }
                }
            });
        }
    }

    public static boolean c(Context context) {
        return CommonUtil.isSystemBarNoticeSwitchOnOrDefault(context);
    }

    private static void a(Context context) {
        LogUtil.a("UIDV_PluginMessageCenter", "initSystemBarPushSwitch, now is ", Boolean.valueOf(CommonUtil.isSystemBarNoticeSwitchOnOrDefault(context)));
    }
}
