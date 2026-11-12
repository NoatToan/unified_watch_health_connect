package com.xiaomi.hm.health.device.assistant.schedule.web;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.assistant.schedule.rrule.RRule;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J&\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\bH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\bH\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/web/ScheduleWebApiImpl;", "Lcom/xiaomi/hm/health/device/assistant/schedule/web/ScheduleWebApi;", "Lcom/huami/http/HttpKit;", "Lorg/json/JSONObject;", "json", "Lcom/huami/assistant/calendar/Event;", "c", "", "", GoogleApiAvailabilityLight.a, "", "", "kvs", CameraActivity.KEY_CONTENT_TYPE, "Lokhttp3/RequestBody;", "a", "from", "to", "", "queryEvents", "event", "", "saveEvent", "events", "deleteEvent", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ScheduleWebApiImpl implements ScheduleWebApi, HttpKit {

    @NotNull
    private static final String a = "/me/userSchedule";

    @NotNull
    private static final String b = "ScheduleWebApiImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query schedule list error";
        }
    }

    private final RequestBody a(Map<String, Object> kvs, String contentType) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : kvs.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return RequestBody.create(MediaType.parse(contentType), jSONObject.toString());
    }

    public static /* synthetic */ RequestBody b(ScheduleWebApiImpl scheduleWebApiImpl, Map map, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "application/json";
        }
        return scheduleWebApiImpl.a(map, str);
    }

    private final Event c(JSONObject json) {
        if (json.optBoolean("isDeleted", false)) {
            return null;
        }
        Event event = new Event();
        long jOptLong = json.optLong("clientScheduleId");
        event.id = jOptLong;
        event.syncId = String.valueOf(jOptLong);
        event.title = json.optString("title");
        event.description = json.optString("desc", "");
        long j = 1000;
        event.startMillis = json.optLong("startTime") * j;
        event.endMillis = json.optLong("endTime") * j;
        event.allDay = json.optBoolean("isAllDay");
        event.rrule = d(json.optLong(RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE));
        event.hasAlarm = true;
        event.reminderMinutes = json.optInt("alertTime");
        event.repeatStopTime = json.optLong("repeatStopTime") * j;
        event.imageUrl = json.optString("imageUrl", "");
        event.source = json.optInt("source");
        event.updateVersion = json.optLong("updateVersion", 0L);
        return event;
    }

    private final String d(long j) {
        return new RRule(j).toRFC5545String();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi
    public boolean deleteEvent(@NotNull String event) {
        return true;
    }

    @Override // com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi
    public boolean deleteEvent(@NotNull List<? extends Event> events) {
        return true;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi
    @NotNull
    public List<Event> queryEvents(long from, long to) {
        String strResponseToJsonStr;
        Event eventC;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(HMWebUtil.getSystemHeader());
        linkedHashMap.put("Content-Type", "application/json");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("from", String.valueOf(from));
        linkedHashMap2.put("to", String.valueOf(to));
        Response responseHttpGet = HttpKitKtxKt.httpGet(this, HMServerDef.getUrl(a), linkedHashMap2, linkedHashMap);
        if (!responseHttpGet.isSuccessful()) {
            responseHttpGet = null;
        }
        if (responseHttpGet != null && (strResponseToJsonStr = ConverterKt.responseToJsonStr(responseHttpGet)) != null) {
            try {
                JSONArray jSONArray = new JSONArray(strResponseToJsonStr);
                int i = 0;
                int length = jSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null && (eventC = c(jSONObjectOptJSONObject)) != null) {
                            arrayList.add(eventC);
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (Exception e) {
                HMLog.error(b, "", e, a.a);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi
    public boolean saveEvent(@NotNull Event event) {
        return true;
    }
}
