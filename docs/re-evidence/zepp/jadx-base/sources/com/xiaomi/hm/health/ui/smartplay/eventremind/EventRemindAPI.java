package com.xiaomi.hm.health.ui.smartplay.eventremind;

import android.text.TextUtils;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import rx.Emitter;
import rx.Observable;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes22.dex */
public class EventRemindAPI {
    private static final String c = "EventRemindAPI";
    private static final String d = "users/{userId}/eventReminders";
    private static final String e = "users/{userId}/eventReminders/unread";
    private static final String f = "users/{userId}/eventReminders/read";
    private static final String g = "users/{userId}/eventReminders/{createdDate}";
    private static final String h = "limit";
    private static final String i = "next";
    private static final String j = "from";
    private static final Lazy<DeviceUtilsApi> k = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private String a;
    private boolean b;

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public a(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onNext(Boolean.FALSE);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onNext(Boolean.FALSE);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getResponseBody() == null) {
                this.a.onNext(Boolean.FALSE);
                this.a.onCompleted();
                return;
            }
            HMLog.i(EventRemindAPI.c, "add reminder item: " + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
            this.a.onNext(Boolean.valueOf(hMHttpResponseData.isSuccess()));
            this.a.onCompleted();
        }
    }

    public class b implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public b(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onNext(null);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(EventRemindAPI.c, "get unread reminder error: " + th, new Object[0]);
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(EventRemindAPI.c, "get unread reminder fail.", new Object[0]);
            this.a.onNext(null);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getResponseBody() == null) {
                HMLog.i(EventRemindAPI.c, "unread reminder null.", new Object[0]);
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.i(EventRemindAPI.c, "unread reminder: " + str, new Object[0]);
            this.a.onNext(EventRemindAPI.this.i(str));
            this.a.onCompleted();
        }
    }

    public class c implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public c(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onNext(null);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onNext(null);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onNext(null);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getResponseBody() == null) {
                HMLog.i(EventRemindAPI.c, "read reminder null.", new Object[0]);
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.i(EventRemindAPI.c, "read reminder: " + str, new Object[0]);
            try {
                EventRemindAPI.this.a = new JSONObject(str).optString("next");
                if (TextUtils.isEmpty(EventRemindAPI.this.a)) {
                    EventRemindAPI.this.b = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.a.onNext(EventRemindAPI.this.i(str));
            this.a.onCompleted();
        }
    }

    public class d implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public d(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(EventRemindAPI.c, "delete reminder error: " + th, new Object[0]);
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onNext(Boolean.FALSE);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getResponseBody() == null) {
                this.a.onNext(Boolean.FALSE);
                this.a.onCompleted();
            } else {
                this.a.onNext(Boolean.valueOf(hMHttpResponseData.isSuccess()));
                this.a.onCompleted();
            }
        }
    }

    public static class e {
        private static final EventRemindAPI a = new EventRemindAPI();

        private e() {
        }
    }

    private EventRemindAPI() {
        this.a = null;
        this.b = true;
    }

    public static Observable<Boolean> deleteReminder(final long j2) {
        return Observable.create(new Action1() { // from class: ns1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                EventRemindAPI.m(j2, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    public static EventRemindAPI getInstance() {
        return e.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ReminderEntity> i(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(str).getJSONArray("items");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add((ReminderEntity) k.getValue().getGson().fromJson(jSONArray.getJSONObject(i2).toString(), ReminderEntity.class));
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String j(long j2) {
        return HMServerDef.getUrl(g.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()).replace("{createdDate}", String.valueOf(j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(long j2, Emitter emitter) {
        try {
            HMLog.i(c, "delete reminder: " + j2, new Object[0]);
            HMWebUtil.doRequest(j(j2), HMWebUtil.getSystemParams(), Support.RequestSupport.DELETE, true, new d(emitter));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(int i2, Emitter emitter) {
        try {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("limit", Integer.valueOf(i2));
            systemParams.put("next", this.a);
            systemParams.put("from", 0);
            HMWebUtil.doRequest(q(), systemParams, Support.RequestSupport.GET, true, new c(emitter));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Emitter emitter) {
        try {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("from", 0);
            HMWebUtil.doRequest(r(), systemParams, Support.RequestSupport.GET, true, new b(emitter));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(List list, Emitter emitter) {
        try {
            String json = k.getValue().getGson().toJson(EventRemindManager.g(list));
            HMLog.i(c, "add reminder: " + json, new Object[0]);
            HashSet hashSet = new HashSet();
            hashSet.add(json);
            hashSet.add("application/json");
            HMWebUtil.doSeparateRequest(s(), HMWebUtil.getSystemHeader(), (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new a(emitter), new HMHttpConfig[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static String q() {
        return HMServerDef.getUrl(f.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
    }

    private static String r() {
        return HMServerDef.getUrl(e.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
    }

    private static String s() {
        return HMServerDef.getUrl(d.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
    }

    public static Observable<Boolean> uploadReminder(final List<Reminder> list) {
        return Observable.create(new Action1() { // from class: qs1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                EventRemindAPI.p(list, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    public String getNext() {
        if (TextUtils.isEmpty(this.a)) {
            return null;
        }
        return this.a;
    }

    public boolean hasMore() {
        return this.b;
    }

    public Observable<List<ReminderEntity>> k(final int i2) {
        return Observable.create(new Action1() { // from class: ps1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.n(i2, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    public Observable<List<ReminderEntity>> l() {
        return Observable.create(new Action1() { // from class: os1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.o((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    public void setHasMore(boolean z) {
        this.b = z;
    }

    public void setNext(String str) {
        this.a = str;
    }
}
