package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.model.DurationGoal;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Goal;
import com.huawei.hihealth.model.GoalInfo;
import com.huawei.hihealth.model.HealthAlarmInfo;
import com.huawei.hihealth.model.MetaData;
import com.huawei.hihealth.model.MetricGoal;
import com.huawei.hihealth.model.ReceiverFilter;
import com.huawei.hihealth.model.Recurrence;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hihealth.model.SportStatusInfo;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealth.model.Subscription;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealthservice.hihealthkit.model.CloudSubscriber;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.VastAttribute;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ldn {
    public static String a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("Content-type", "application/json");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str2);
        map.put("x-thirdApp-AT", str3);
        final String[] strArr = new String[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LogUtil.a("HMSAuthHttps", "Http get request URL:", str);
        LogUtil.a("HMSAuthHttps", "Http get request heads:", map);
        oet.d().e(str, map, new HashMap(), String.class, new ResultCallback<String>() { // from class: ldn.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str4) {
                LogUtil.a("HMSAuthHttps", "getReq success.");
                strArr[0] = str4;
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "getReq failure,", th.getMessage());
                if (!(th instanceof oeu)) {
                    strArr[0] = ldn.e(-1, th.getMessage());
                } else {
                    oeu oeuVar = (oeu) th;
                    strArr[0] = ldn.e(oeuVar.e(), oeuVar.getMessage());
                }
                countDownLatch.countDown();
            }
        });
        try {
            ReleaseLogUtil.d("HiH_HMSAuthHttps", "getReq isOnTime: ", Boolean.valueOf(countDownLatch.await(20000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "getReq InterruptedException.", LogAnonymous.b(e));
        }
        LogUtil.d("HMSAuthHttps", "getReq result:", strArr[0]);
        return strArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VastAttribute.ERROR, i);
            jSONObject.put("message", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "JSONException occurs", LogAnonymous.b(e));
            return "";
        }
    }

    public static int d(String str, final List<CloudSubscriber> list) {
        final lfi lfiVar = new lfi();
        list.addAll(lfiVar.c(str));
        if (njy.b(list)) {
            return 0;
        }
        String strB = b("/healthkit-healthapp/v1/subscribers");
        Map<String, String> mapD = d();
        if (mapD == null) {
            return 1009;
        }
        HashMap map = new HashMap();
        map.put("appId", str);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final int[] iArr = {0};
        oet.d().e(strB, mapD, map, String.class, new ResultCallback<String>() { // from class: ldn.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                try {
                    if (!TextUtils.isEmpty(str2) && str2.contains("subscriberId")) {
                        ReleaseLogUtil.d("HiH_HMSAuthHttps", "downloadSubscriber onSuccess");
                        List list2 = (List) HiJsonUtil.d(str2, new TypeToken<List<CloudSubscriber>>() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.https.Https$2$1
                        }.getType());
                        list.addAll(list2);
                        List<CloudSubscriber> listD = lfiVar.d();
                        listD.addAll(list2);
                        lfiVar.b(listD);
                    } else {
                        iArr[0] = 2;
                    }
                } catch (ClassCastException e) {
                    iArr[0] = 4;
                    ReleaseLogUtil.a("HiH_HMSAuthHttps", "class cast exception", LogAnonymous.b(e));
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "downloadSubscriber onFailure.", th.getMessage());
                iArr[0] = ldn.c(th);
                countDownLatch.countDown();
            }
        });
        d(countDownLatch, iArr);
        return iArr[0];
    }

    private static void d(CountDownLatch countDownLatch, int[] iArr) {
        try {
            if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "get subscriber has timed out");
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "get subscriber interrupt exception", LogAnonymous.b(e));
            iArr[0] = 4;
        }
    }

    private static Map<String, String> d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("HiH_HMSAuthHttps", "getAccessToken is empty, refreshAccessToken.");
            accountInfo = HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
        }
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(accountInfo2)) {
            return null;
        }
        HashMap map = new HashMap(16);
        map.put("Content-type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        map.put("x-client-id", HiScopeUtil.b(BaseApplication.getContext(), BaseApplication.getContext().getPackageName()));
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("x-caller-trace-id", String.valueOf(ltb.h()) + Math.random());
        return map;
    }

    public static int b(String str, SampleEvent sampleEvent) {
        String strReplace = b("/healthkit-healthapp/v1/subscriptions/{subscriptionId}/sampleEvent").replace("{subscriptionId}", str);
        Map<String, String> mapD = d();
        if (mapD == null) {
            return 1009;
        }
        JsonObject jsonObjectD = d(sampleEvent);
        if (jsonObjectD == null || jsonObjectD.get("metaData") == null) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "notifyCloud onFailure, params is wrong");
            return 2;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int[] iArr = {0};
        b(strReplace, mapD, jsonObjectD, countDownLatch, iArr);
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "get subscriber interrupt exception", LogAnonymous.b(e));
            iArr[0] = 4;
        }
        return iArr[0];
    }

    private static void b(String str, Map<String, String> map, JsonObject jsonObject, final CountDownLatch countDownLatch, final int[] iArr) {
        oet.d().c(str, map, ofe.c(jsonObject), String.class, new ResultCallback<String>() { // from class: ldn.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                ReleaseLogUtil.d("HiH_HMSAuthHttps", "notifyCloud success.");
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "notifyCloud onFailure.", th.getMessage());
                iArr[0] = ldn.c(th);
                countDownLatch.countDown();
            }
        });
    }

    public static void b(List<String> list, List<String> list2, List<String> list3) {
        String strB = b("/healthkit-healthapp/v1/subscriptions?");
        if (njy.b(list)) {
            strB = strB + a("type=", list);
        }
        if (njy.b(list2)) {
            strB = strB + a("subscriptionMode=", list2);
        }
        if (njy.b(list3)) {
            strB = strB + a("eventType=", list3);
        }
        String str = strB;
        Map<String, String> mapD = d();
        if (mapD == null) {
            return;
        }
        oet.d().e(str, mapD, new HashMap(), String.class, new ResultCallback<String>() { // from class: ldn.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                lfi lfiVar = new lfi();
                lfiVar.c(Long.valueOf(System.currentTimeMillis()));
                if (!TextUtils.isEmpty(str2) && str2.contains("subscriptionId")) {
                    List<Subscription> listC = ldn.c(str2);
                    if (njy.e(listC)) {
                        ReleaseLogUtil.a("HiH_HMSAuthHttps", "download serviceSubscriptions is empty.");
                        return;
                    }
                    ReleaseLogUtil.d("HiH_HMSAuthHttps", "downloadSubscription success and insertSubscription");
                    List<Subscription> listB = lfiVar.b();
                    if (njy.b(listB)) {
                        ldn.e(listC, listB);
                    }
                    lfiVar.d(listC);
                    ldn.c(listC);
                    return;
                }
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "downloadSubscription result is ", str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "downloadSubscription onFailure.", th.getMessage());
            }
        });
    }

    public static int e(Subscriber subscriber, final EventTypeInfo eventTypeInfo) {
        final String strD = lkf.d(BaseApplication.getContext());
        LogUtil.a("HMSAuthHttps", "calling package name is ", strD);
        String strB = b("/healthkit-healthapp/v1/subscriptions");
        Map<String, String> mapD = d();
        if (mapD == null) {
            return 1009;
        }
        HashMap map = new HashMap();
        map.put("appId", subscriber.getAppId());
        map.put("subscriberId", subscriber.getSubscriberId());
        map.put("eventTypes", c(eventTypeInfo));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final int[] iArr = {1004};
        oet.d().c(strB, mapD, ofe.c((Object) map), String.class, new ResultCallback<String>() { // from class: ldn.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("HMSAuthHttps", "upload subscription success");
                List listC = ldn.c(str);
                if (ldn.b(strD, eventTypeInfo.getOpenId(), ((Subscription) listC.get(0)).getOpenId())) {
                    iArr[0] = 0;
                } else {
                    iArr[0] = 2;
                }
                eventTypeInfo.setOpenId(((Subscription) listC.get(0)).getOpenId());
                lfi lfiVar = new lfi();
                List<Subscription> listB = lfiVar.b();
                ldn.a((List<Subscription>) listC, listB);
                lfiVar.d(listB);
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "uploadSubscription onFailure.", th.getMessage());
                iArr[0] = ldn.c(th);
                countDownLatch.countDown();
            }
        });
        d(countDownLatch);
        return iArr[0];
    }

    private static void d(CountDownLatch countDownLatch) {
        try {
            ReleaseLogUtil.d("HiH_HMSAuthHttps", "uploadSubscription wait:", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "get subscriber interrupt exception", LogAnonymous.b(e));
        }
    }

    public static int e(EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        final int[] iArr = {0};
        List<Subscription> listB = new lfi().b();
        ReleaseLogUtil.d("HiH_HMSAuthHttps", "unRegisterSubscription spSubscriptions:", peh.c(listB));
        EventTypeInfo eventTypeInfoA = a(listB, eventTypeInfo, subscriber);
        if (eventTypeInfoA == null) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "unRegisterSubscription success.There is no subscription.");
            return iArr[0];
        }
        final String subscriptionId = eventTypeInfoA.getSubscriptionId();
        String str = b("/healthkit-healthapp/v1/subscriptions/") + eventTypeInfoA.getSubscriptionId();
        Map<String, String> mapD = d();
        if (mapD == null) {
            return 1009;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oet.d().c(str, mapD, String.class, new ResultCallback<String>() { // from class: ldn.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                ReleaseLogUtil.d("HiH_HMSAuthHttps", "unRegisterSubscription success.");
                lfi lfiVar = new lfi();
                List<Subscription> listB2 = lfiVar.b();
                if (njy.b(listB2)) {
                    ReleaseLogUtil.d("HiH_HMSAuthHttps", "delete spSubscription, id is ", subscriptionId);
                    ldn.e(subscriptionId, listB2);
                    lfiVar.d(listB2);
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "unRegisterSubscription onFailure.", th.getMessage());
                iArr[0] = ldn.c(th);
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.a("HiH_HMSAuthHttps", "unRegisterSubscription has timed out");
            }
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "unRegisterSubscription interrupt exception", LogAnonymous.b(e));
            iArr[0] = 4;
        }
        return iArr[0];
    }

    public static void b(EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        lfi lfiVar = new lfi();
        List<Subscription> listB = lfiVar.b();
        EventTypeInfo eventTypeInfoA = a(listB, eventTypeInfo, subscriber);
        if (eventTypeInfoA == null) {
            ReleaseLogUtil.d("HiH_HMSAuthHttps", "updateSpSubscription success.There is no subscription.");
            return;
        }
        for (Subscription subscription : listB) {
            if (subscription.getSubscriptionId().equals(eventTypeInfoA.getSubscriptionId())) {
                subscription.setLastNotifyDate(subscriber.getLastNotifyDate());
                break;
            }
        }
        lfiVar.d(listB);
    }

    public static List<Subscriber> c() {
        ArrayList arrayList = new ArrayList(16);
        List<CloudSubscriber> listD = new lfi().d();
        for (CloudSubscriber cloudSubscriber : listD) {
            cloudSubscriber.setFilter((ReceiverFilter) HiJsonUtil.d(HiJsonUtil.d(cloudSubscriber.getPendingIntent()), new TypeToken<ReceiverFilter>() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.https.Https$7
            }.getType()));
        }
        arrayList.addAll(listD);
        return arrayList;
    }

    public static EventTypeInfo d(Subscription subscription) {
        EventTypeInfo eventTypeInfoB;
        if (Objects.equals(subscription.getType(), SampleEvent.Type.SCENARIO_GOAL_EVENT)) {
            eventTypeInfoB = a(subscription);
        } else if (Objects.equals(subscription.getType(), SampleEvent.Type.HEALTH_ALARM_EVENT)) {
            eventTypeInfoB = c(subscription);
        } else if (Objects.equals(subscription.getType(), SampleEvent.Type.SPORT_STATUS_EVENT)) {
            eventTypeInfoB = b(subscription);
        } else {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "not support event type!");
            eventTypeInfoB = null;
        }
        if (eventTypeInfoB != null) {
            eventTypeInfoB.setSubscriptionId(subscription.getSubscriptionId());
            eventTypeInfoB.setSubscriptionMode(subscription.getSubscriptionMode());
        }
        return eventTypeInfoB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Subscription> c(String str) {
        ArrayList arrayList = new ArrayList(10);
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Subscription subscription = new Subscription(SampleEvent.Type.valueOf(jSONObject.getString("type")), jSONObject.getString("subType"), jSONObject.getString("openId"), 0);
                subscription.setAppId(jSONObject.getString("appId"));
                subscription.setEventType(jSONObject.getString("eventType"));
                subscription.setSubscriberId(jSONObject.getString("subscriberId"));
                subscription.setSubscriptionId(jSONObject.getString("subscriptionId"));
                subscription.setDetailInfo(jSONObject.getString("goalInfo"));
                subscription.setSubscriptionMode(jSONObject.getInt("subscriptionMode"));
                arrayList.add(subscription);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "parse serviceSubscription JSONException.", LogAnonymous.b(e));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<Subscription> list, List<Subscription> list2) {
        for (Subscription subscription : list) {
            Subscription subscriptionC = c(subscription.getSubscriptionId(), list2);
            if (subscriptionC != null) {
                subscriptionC.setDetailInfo(subscription.getDetailInfo());
            } else {
                ReleaseLogUtil.d("HiH_HMSAuthHttps", "add new subscription.");
                list2.add(subscription);
            }
        }
    }

    private static Subscription c(String str, List<Subscription> list) {
        for (Subscription subscription : list) {
            if (str.equals(subscription.getSubscriptionId())) {
                return subscription;
            }
        }
        return null;
    }

    private static String a(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(str + URLEncoder.encode(it.next(), "UTF-8") + "&");
            }
        } catch (UnsupportedEncodingException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "getUrlQueryParams error!", LogAnonymous.b(e));
        }
        return sb.toString();
    }

    private static JsonArray c(EventTypeInfo eventTypeInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", eventTypeInfo.getType().getName());
        jsonObject.addProperty("subType", eventTypeInfo.getSubType());
        jsonObject.addProperty("eventType", eventTypeInfo.getEventType());
        if (eventTypeInfo instanceof GoalInfo) {
            GoalInfo goalInfo = (GoalInfo) eventTypeInfo;
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("startDay", Integer.valueOf(goalInfo.getStartDay()));
            jsonObject2.add("recurrence", JsonParser.parseString(HiJsonUtil.d(goalInfo.getRecurrence())));
            JsonArray jsonArray = new JsonArray();
            for (Goal goal : goalInfo.getGoals()) {
                if ((goal instanceof MetricGoal) || (goal instanceof DurationGoal)) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty("goalType", Integer.valueOf(goal.getGoalType()));
                    c(goal, jsonObject3);
                    jsonArray.add(jsonObject3);
                }
            }
            jsonObject2.add("goals", jsonArray);
            jsonObject.add("goalInfo", jsonObject2);
        }
        JsonArray jsonArray2 = new JsonArray();
        jsonArray2.add(jsonObject);
        return jsonArray2;
    }

    private static void c(Goal goal, JsonObject jsonObject) {
        if (goal instanceof MetricGoal) {
            jsonObject.add("metricGoal", JsonParser.parseString(HiJsonUtil.d(goal)));
        }
        if (goal instanceof DurationGoal) {
            jsonObject.add("durationGoal", JsonParser.parseString(HiJsonUtil.d(goal)));
        }
    }

    private static JsonObject d(SampleEvent sampleEvent) {
        String metaValue;
        List<MetaData> metaData = sampleEvent.getMetaData();
        Iterator<MetaData> it = metaData.iterator();
        while (true) {
            if (!it.hasNext()) {
                metaValue = null;
                break;
            }
            MetaData next = it.next();
            if ("goalStatus".equals(next.getMetaKey())) {
                metaValue = next.getMetaValue();
                break;
            }
        }
        if (TextUtils.isEmpty(metaValue)) {
            ReleaseLogUtil.e("HiH_HMSAuthHttps", "get metaData fail.");
            return new JsonObject();
        }
        try {
            JsonArray asJsonArray = JsonParser.parseString(metaValue).getAsJsonArray();
            for (int i = 0; i < asJsonArray.size(); i++) {
                e(asJsonArray.get(i).getAsJsonObject().getAsJsonArray("goalAchieve").get(0).getAsJsonObject());
            }
            for (MetaData metaData2 : metaData) {
                if ("goalStatus".equals(metaData2.getMetaKey())) {
                    metaData2.setMetaValue(asJsonArray.toString());
                    break;
                }
            }
            JsonObject asJsonObject = JsonParser.parseString(HiJsonUtil.d(sampleEvent)).getAsJsonObject();
            asJsonObject.addProperty("timeZone", HiDateUtil.c((String) null));
            return asJsonObject;
        } catch (IllegalStateException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "getSampleEvent parse json failed.", LogAnonymous.b(e));
            return new JsonObject();
        }
    }

    private static void e(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        if (jsonObject.get("goalType").getAsInt() == 1) {
            jsonObject2.addProperty("dataType", jsonObject.get("dataType").getAsString());
            jsonObject2.addProperty("fieldName", jsonObject.get("fieldName").getAsString());
            jsonObject2.addProperty("value", Double.valueOf(jsonObject.get("value").getAsDouble()));
            jsonObject.add("metricGoal", jsonObject2);
        }
        if (jsonObject.get("goalType").getAsInt() == 2) {
            jsonObject2.addProperty("duration", Long.valueOf(jsonObject.get("duration").getAsLong()));
            jsonObject2.addProperty("dataType", jsonObject.get("dataType").getAsString());
            jsonObject.add("durationGoal", jsonObject2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, List<Subscription> list) {
        Iterator<Subscription> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getSubscriptionId())) {
                it.remove();
            }
        }
    }

    private static String b(String str) {
        return GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "") + str;
    }

    public static void c(List<Subscription> list) {
        try {
            ReleaseLogUtil.d("HiH_HMSAuthHttps", "register subscription size ", Integer.valueOf(list.size()));
            ICommonCallback.Stub stub = new ICommonCallback.Stub() { // from class: ldn.8
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str) {
                    ReleaseLogUtil.d("HiH_HMSAuthHttps", "register subscription callback result ", Integer.valueOf(i));
                }
            };
            HashMap map = new HashMap();
            for (Subscription subscription : list) {
                Subscriber subscriberC = (Subscriber) map.get(subscription.getSubscriberId());
                if (subscriberC == null) {
                    subscriberC = c(subscription.getAppId(), subscription.getSubscriberId());
                    map.put(subscription.getSubscriberId(), subscriberC);
                }
                EventTypeInfo eventTypeInfoD = d(subscription);
                if (eventTypeInfoD != null) {
                    Subscriber subscriber = new Subscriber(subscriberC.getAppId(), subscriberC.getSubscriberId(), subscriberC.getSecret(), subscriberC.getFilter());
                    subscriber.setLastNotifyDate(subscription.getLastNotifyDate());
                    lbi.a(BaseApplication.getContext()).a(subscriber, eventTypeInfoD, stub, (len) null);
                }
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_HMSAuthHttps", "autoRegisterSubscription failed.", LogAnonymous.b(e));
        }
    }

    private static Subscriber c(String str, String str2) {
        ArrayList<CloudSubscriber> arrayList = new ArrayList(10);
        d(str, arrayList);
        for (CloudSubscriber cloudSubscriber : arrayList) {
            if (str2.equals(cloudSubscriber.getSubscriberId())) {
                return new Subscriber(cloudSubscriber.getAppId(), cloudSubscriber.getSubscriberId(), cloudSubscriber.getSecret(), (ReceiverFilter) HiJsonUtil.d(HiJsonUtil.d(cloudSubscriber.getPendingIntent()), new TypeToken<ReceiverFilter>() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.https.Https$9
                }.getType()));
            }
        }
        return null;
    }

    private static GoalInfo a(Subscription subscription) {
        JsonObject asJsonObject = JsonParser.parseString(subscription.getDetailInfo()).getAsJsonObject();
        JsonArray asJsonArray = asJsonObject.getAsJsonArray("goals");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < asJsonArray.size(); i++) {
            JsonObject asJsonObject2 = asJsonArray.get(i).getAsJsonObject();
            String strD = HiJsonUtil.d(asJsonObject2.get("metricGoal"));
            if (asJsonObject2.get("goalType").getAsInt() == 1) {
                MetricGoal metricGoal = (MetricGoal) HiJsonUtil.d(strD, new TypeToken<MetricGoal>() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.https.Https$10
                }.getType());
                metricGoal.setGoalType(1);
                arrayList.add(metricGoal);
            } else {
                String strD2 = HiJsonUtil.d(asJsonObject2.get("durationGoal"));
                if (asJsonObject2.get("goalType").getAsInt() == 2) {
                    DurationGoal durationGoal = (DurationGoal) HiJsonUtil.d(strD2, new TypeToken<DurationGoal>() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.https.Https$11
                    }.getType());
                    durationGoal.setGoalType(2);
                    arrayList.add(durationGoal);
                }
            }
        }
        return new GoalInfo(arrayList, asJsonObject.get("startDay").getAsInt(), (Recurrence) HiJsonUtil.d(asJsonObject.get("recurrence").toString(), new TypeToken<Recurrence>() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.https.Https$12
        }.getType()), subscription.getOpenId());
    }

    private static HealthAlarmInfo c(Subscription subscription) {
        return new HealthAlarmInfo(subscription.getSubType(), subscription.getOpenId());
    }

    private static SportStatusInfo b(Subscription subscription) {
        return new SportStatusInfo(subscription.getSubType(), subscription.getOpenId(), subscription.getStartDay());
    }

    private static EventTypeInfo a(List<Subscription> list, EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        for (Subscription subscription : list) {
            if (subscription.getSubscriberId().equals(subscriber.getSubscriberId()) && subscription.getEventType().equals(eventTypeInfo.getEventType())) {
                EventTypeInfo eventTypeInfoD = d(subscription);
                if (eventTypeInfo.equals(eventTypeInfoD)) {
                    return eventTypeInfoD;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(List<Subscription> list, List<Subscription> list2) {
        for (Subscription subscription : list) {
            Subscription subscriptionC = c(subscription.getSubscriptionId(), list2);
            if (subscriptionC != null) {
                subscription.setLastNotifyDate(subscriptionC.getLastNotifyDate());
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Throwable th) {
        if (!(th instanceof oeu)) {
            return 1004;
        }
        int iE = ((oeu) th).e();
        if (iE != 400) {
            return (iE == 401 || iE == 403) ? 1001 : 1004;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, String str2, String str3) {
        if ("com.huawei.hiai".equals(str)) {
            new lfi().d(str3);
            return true;
        }
        if (str3.equals(str2)) {
            return true;
        }
        ReleaseLogUtil.a("HiH_HMSAuthHttps", "wrong openId");
        return false;
    }
}
