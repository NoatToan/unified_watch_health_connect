package com.huami.tools.analytics;

import com.huami.passport.Configs;
import com.huami.tools.analytics.internal.utils.JavaUtils;
import com.xiaomi.market.sdk.Constants;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/tools/analytics/EventsToJsonConverter;", "", "Lcom/huami/tools/analytics/d;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "", "Lcom/huami/tools/analytics/Event;", "events", "", "isAnonymous", "", "convertToJson", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class EventsToJsonConverter {

    @NotNull
    public static final EventsToJsonConverter INSTANCE = new EventsToJsonConverter();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "EventsToJsonConverter";

    private EventsToJsonConverter() {
    }

    @NotNull
    public final String convertToJson(@NotNull d client, @NotNull List<Event> events, boolean isAnonymous) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("c", jSONObject2);
            jSONObject.put("e", jSONArray);
            if (JavaUtils.isEmpty(client.b)) {
                p.b().w(tag, isAnonymous ? "想要匿名上传，但无安装id" : "想要实名上传，但无用户id");
                return "";
            }
            if (isAnonymous) {
                jSONObject2.put("di", client.b);
            } else {
                jSONObject2.put("hmid", client.b);
            }
            jSONObject2.put("pkg", client.c);
            jSONObject2.put("bd", client.d);
            jSONObject2.put(Configs.Params.DN, client.e);
            jSONObject2.put("appi", client.f);
            jSONObject2.put("osv", client.g);
            jSONObject2.put("vc", client.h);
            jSONObject2.put("appv", client.i);
            jSONObject2.put(Constants.JSON_REGION, client.j);
            jSONObject2.put("ns", client.l);
            jSONObject2.put("ch", client.n);
            jSONObject2.put(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "android");
            for (Event event : events) {
                if (!k.a(event)) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ei", event.getCom.huami.tools.analytics.DbUtils.Const.Columns.Event.EVENT_ID java.lang.String());
                    jSONObject3.put("et", event.getTimestamp());
                    jSONObject3.put("etz", event.getTimezone());
                    jSONObject3.put("etp", event.getType());
                    if (event.getNumberValue() != null) {
                        jSONObject3.put("ev", event.getNumberValue());
                    }
                    if (event.getStringValue() != null) {
                        jSONObject3.put("es", event.getStringValue());
                    }
                    if (event.getMultipleValue() != null && (!event.getMultipleValue().isEmpty())) {
                        jSONObject3.put("ep", new JSONObject(event.getMultipleValue()));
                    }
                    jSONArray.put(jSONObject3);
                }
            }
            if (jSONArray.length() != 0) {
                return jSONObject.toString();
            }
            p.b().w(tag, "上报的数据中没有事件");
            return "";
        } catch (JSONException e) {
            p.b().w(tag, e, "生成上传的json时发生异常");
            return "";
        }
    }
}
