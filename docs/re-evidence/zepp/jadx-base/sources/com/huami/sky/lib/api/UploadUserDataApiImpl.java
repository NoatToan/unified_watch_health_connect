package com.huami.sky.lib.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.sky.lib.constant.MusicPauseFrom;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.DeviceDataEntity;
import com.huami.sky.lib.entity.DeviceStatus;
import com.huami.sky.lib.entity.HeartRate;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.lib.entity.UserAction;
import com.huami.sky.lib.entity.UserActivity;
import com.huami.sky.lib.entity.UserRrInterval;
import com.huami.sky.lib.entity.UserSleepProbability;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.data.NotificationData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000e\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002JB\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¨\u0006#"}, d2 = {"Lcom/huami/sky/lib/api/UploadUserDataApiImpl;", "Lcom/huami/sky/lib/api/UploadUserDataApi;", "Lcom/huami/http/HttpKit;", "Lcom/huami/sky/lib/entity/UserAction;", "action", "Lorg/json/JSONObject;", "a", "Lcom/huami/sky/lib/entity/MusicPlayRecord;", "record", "e", "Lkotlin/Pair;", "Lcom/huami/sky/lib/entity/UserActivity;", "Lcom/huami/sky/lib/entity/UserSleepProbability;", "data", "b", "Lcom/huami/sky/lib/entity/UserRrInterval;", WebConstant.QueryParam.RR_INTERVAL, "f", "", "Lcom/huami/sky/lib/entity/HeartRate;", "heartRates", GoogleApiAvailabilityLight.a, "Lcom/huami/sky/lib/entity/DeviceStatus;", "status", "c", NotificationData.WearableExtrasData.KEY_ACTIONS, "records", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", Constants.DATA_KEY_HR, "", "uploadData", "deviceStatus", "uploadDeviceStatus", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class UploadUserDataApiImpl implements UploadUserDataApi, HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONArray a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONArray jSONArray) {
            super(0);
            this.a = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONArray a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray) {
            super(0);
            this.a = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
        }
    }

    private final JSONObject a(UserAction action) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", WebConstant.QueryParam.TYPE_HUMAN_ACTION);
        jSONObject.put(WebConstant.QueryParam.GENERATED_AT, action.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(WebConstant.QueryParam.CLIP_ID, action.getId());
        jSONObject2.put("type", action.getType().name());
        Unit unit = Unit.INSTANCE;
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    private final JSONObject b(Pair<UserActivity, UserSleepProbability> data) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", WebConstant.QueryParam.TYPE_ACTIVITY);
        jSONObject.put(WebConstant.QueryParam.GENERATED_AT, data.getFirst().getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("value", data.getFirst().getActivity());
        jSONObject2.put(WebConstant.QueryParam.SLEEP_PROBABILITY, Float.valueOf(data.getSecond().getSleepProbability()));
        jSONObject2.put(WebConstant.QueryParam.DEEP_SLEEP_PROBABILITY, Float.valueOf(data.getSecond().getDeepSleepProbability()));
        jSONObject2.put(WebConstant.QueryParam.REM_PROBABILITY, Float.valueOf(data.getSecond().getRemProbability()));
        Unit unit = Unit.INSTANCE;
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    private final JSONObject c(DeviceStatus status) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", WebConstant.QueryParam.TYPE_DEVICE_STATUS);
        jSONObject.put(WebConstant.QueryParam.GENERATED_AT, status.getCreateTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(WebConstant.QueryParam.CLIP_ID, status.getClipId());
        jSONObject2.put("type", status.getStatus());
        if (status.getSource() != null) {
            jSONObject2.put("source", status.getSource().toString());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    private final JSONObject d(List<HeartRate> heartRates) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "HEART_RATE");
        jSONObject.put(WebConstant.QueryParam.GENERATED_AT, ((HeartRate) CollectionsKt.first((List) heartRates)).getTime());
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(heartRates, 10));
        Iterator<T> it2 = heartRates.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((HeartRate) it2.next()).getValue()));
        }
        jSONObject2.put("value", new JSONArray((Collection) arrayList));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(heartRates, 10));
        Iterator<T> it3 = heartRates.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((HeartRate) it3.next()).getTime()));
        }
        jSONObject2.put("timestamp", new JSONArray((Collection) arrayList2));
        Unit unit = Unit.INSTANCE;
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    private final JSONObject e(MusicPlayRecord record) throws JSONException {
        String strName;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", WebConstant.QueryParam.TYPE_MUSIC_PLAY_RECORD);
        jSONObject.put(WebConstant.QueryParam.GENERATED_AT, record.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(WebConstant.QueryParam.CLIP_ID, record.getId());
        jSONObject2.put("status", record.getStatus().name());
        MusicPauseFrom pauseType = record.getPauseType();
        String str = "";
        if (pauseType != null && (strName = pauseType.name()) != null) {
            str = strName;
        }
        jSONObject2.put(WebConstant.QueryParam.PAUSE_TYPE, str);
        Unit unit = Unit.INSTANCE;
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    private final JSONObject f(UserRrInterval rrInterval) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", WebConstant.QueryParam.TYPE_RR_INTERVAL);
        jSONObject.put(WebConstant.QueryParam.GENERATED_AT, ((Number) CollectionsKt.first((List) rrInterval.getTime())).longValue());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(WebConstant.QueryParam.RR_INTERVAL, new JSONArray((Collection) rrInterval.getInterval()));
        jSONObject2.put(WebConstant.QueryParam.RR_INTERVAL_TIME, new JSONArray((Collection) rrInterval.getTime()));
        Unit unit = Unit.INSTANCE;
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.sky.lib.api.UploadUserDataApi
    public boolean uploadData(@Nullable List<UserAction> actions, @Nullable List<MusicPlayRecord> records, @Nullable DeviceDataEntity data, @Nullable List<HeartRate> hr) {
        List listZip;
        JSONArray jSONArray = new JSONArray();
        if (actions != null) {
            Iterator<T> it2 = actions.iterator();
            while (it2.hasNext()) {
                jSONArray.put(a((UserAction) it2.next()));
            }
        }
        if (records != null) {
            Iterator<T> it3 = records.iterator();
            while (it3.hasNext()) {
                jSONArray.put(e((MusicPlayRecord) it3.next()));
            }
        }
        if (data != null) {
            List<UserActivity> userActivity = data.getUserActivity();
            if (userActivity != null && (listZip = CollectionsKt___CollectionsKt.zip(userActivity, data.getUserSleepProbability())) != null) {
                Iterator it4 = listZip.iterator();
                while (it4.hasNext()) {
                    jSONArray.put(b((Pair) it4.next()));
                }
            }
            List<UserRrInterval> userRrInterval = data.getUserRrInterval();
            if (userRrInterval != null) {
                for (UserRrInterval userRrInterval2 : userRrInterval) {
                    if ((!userRrInterval2.getTime().isEmpty()) && (!userRrInterval2.getInterval().isEmpty())) {
                        jSONArray.put(f(userRrInterval2));
                    }
                }
            }
        }
        if (hr != null) {
            jSONArray.put(d(hr));
        }
        HMLog.info("DeviceDataRepositoryImpl", new a(jSONArray));
        return HttpKitKtxKt.httpPost$default(this, WebConstant.Path.RECOMMEND_MUSIC_EVENTS, RequestBody.create(MediaType.parse("application/json"), jSONArray.toString()), null, null, 12, null).isSuccessful();
    }

    @Override // com.huami.sky.lib.api.UploadUserDataApi
    public boolean uploadDeviceStatus(@NotNull DeviceStatus deviceStatus) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(c(deviceStatus));
        HMLog.info("DeviceDataRepositoryImpl", new b(jSONArray));
        return HttpKitKtxKt.httpPost$default(this, WebConstant.Path.RECOMMEND_MUSIC_EVENTS, RequestBody.create(MediaType.parse("application/json"), jSONArray.toString()), null, null, 12, null).isSuccessful();
    }
}
