package com.huami.ai.speech.xiaoai.guide;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.xiaomiai.VoiceProtocol;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.helper.LiteHttpHelper;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.m;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0012\u001a\u00020\u0001H\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/ai/android/core/Engine;", "", "userAgent", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "xiaomiId", "deviceId", "", "previewMode", "", "Lcom/huami/ai/speech/xiaoai/guide/GuideEntity;", "getSpeakGuide", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "b", "Lcom/fasterxml/jackson/databind/JsonNode;", "name", "a", "getUUID", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class SpeakGuideKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Mi Ai Guide Request:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    private static final String a(JsonNode jsonNode, String str) {
        return jsonNode.has(str) ? jsonNode.get(str).asText("") : "";
    }

    private static final List<GuideEntity> b(Response response) {
        byte[] bArrBytes;
        if (!response.isSuccessful()) {
            return null;
        }
        ResponseBody responseBodyBody = response.body();
        String str = (responseBodyBody == null || (bArrBytes = responseBodyBody.bytes()) == null) ? null : new String(bArrBytes, Charsets.UTF_8);
        HMLog.info("speech", new b(str));
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JsonNode jsonNode = new ObjectMapper().readTree(str).get(VoiceProtocol.ANSWER).get("suggestions");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonNode, 10));
        for (JsonNode jsonNode2 : jsonNode) {
            arrayList.add(new GuideEntity(jsonNode2.get("id").asText(), a(jsonNode2, "head_icon"), jsonNode2.get("query").asText(), a(jsonNode2, "background_icon")));
        }
        return arrayList;
    }

    @Nullable
    public static final List<GuideEntity> getSpeakGuide(@NotNull Engine engine, @NotNull String str, @NotNull Context context, @NotNull String str2, @Nullable String str3, boolean z) throws JSONException {
        if (str3 == null || str3.length() == 0) {
            str3 = DeviceUtils.getDeviceId(context);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trace_id", getUUID());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("device_id", str3);
        Unit unit = Unit.INSTANCE;
        jSONObject.put("device", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("id", str2);
        jSONObject.put("user_info", jSONObject3);
        jSONObject.put("app_name", context.getPackageName());
        jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        jSONObject.put("request_origin", "negative_screen&&xiaoai_icon");
        jSONObject.put("today_impressions", SpeechKeeper.INSTANCE.getGuideItems());
        HMLog.debug("speech", new a(jSONObject));
        List<GuideEntity> listB = b(FirebasePerfOkHttpClient.execute(new LiteHttpHelper(engine).getClient().newCall(new Request.Builder().url(z ? "http://query-suggestion-preview.ai.xiaomi.com/simple/litecrypto/band_wakeup/suggest" : "http://query-suggestion.ai.xiaomi.com/simple/litecrypto/band_wakeup/suggest").addHeader("User-Agent", str).addHeader("Authorization", engine.getAuthorization()).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString())).build())));
        if (listB == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            sb.append(((GuideEntity) it2.next()).getId());
        }
        SpeechKeeper.INSTANCE.saveGuideItems(sb.toString());
        return listB;
    }

    public static /* synthetic */ List getSpeakGuide$default(Engine engine, String str, Context context, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return getSpeakGuide(engine, str, context, str2, str3, (i & 16) != 0 ? false : z);
    }

    @NotNull
    public static final String getUUID() {
        String strReplace$default = m.replace$default(UUID.randomUUID().toString(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, (Object) null);
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(strReplace$default, "null cannot be cast to non-null type java.lang.String");
        return strReplace$default.toLowerCase(locale);
    }
}
