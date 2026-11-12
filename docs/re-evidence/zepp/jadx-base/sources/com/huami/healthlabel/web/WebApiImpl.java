package com.huami.healthlabel.web;

import androidx.exifinterface.media.ExifInterface;
import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.entry.LabelItems;
import com.huami.healthlabel.entry.LabelProperties;
import com.huami.healthlabel.utils.SpUtilsKt;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016JC\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0016\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\rH\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002H\u0016R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/huami/healthlabel/web/WebApiImpl;", "Lcom/huami/healthlabel/web/WebApi;", "", "path", "a", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/healthlabel/web/Response;", "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/healthlabel/web/ApiResponse;", "b", "Lcom/huami/healthlabel/entry/LabelProperties;", "loadAllHomeTable", "", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "labels", "updateHomeTable", "", "limit", "", "startTime", "endTime", "nextTime", "", "reverse", "Lcom/huami/healthlabel/entry/LabelItems;", "loadHealthLabelRecord", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Z)Lcom/huami/healthlabel/web/ApiResponse;", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "labelHealthTag", "", "insertHealthLabelRecord", "labelHealthTags", "timestampStr", "deleteHealthLabelRecord", "body", "markDeleteHomeLabel", "Ljava/lang/String;", "userId", "host", "Lcom/huami/healthlabel/web/HttpInteraction;", "c", "Lcom/huami/healthlabel/web/HttpInteraction;", "httpInteraction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/healthlabel/web/HttpInteraction;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class WebApiImpl implements WebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String host;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HttpInteraction httpInteraction;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "健康记录body:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传结果 code:" + this.a.getCode() + ", error:" + this.a.getError();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load homeLabel data result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load my record health label data result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "body--->" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "标记删除上传结果 code:" + this.a.getCode() + ", error:" + this.a.getError();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "健康标签模块网络接口json解析发生错误";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "开始上传标签：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传结果 code:" + this.a.getCode() + ", error:" + this.a.getError();
        }
    }

    public WebApiImpl(@NotNull String str, @NotNull String str2, @NotNull HttpInteraction httpInteraction) {
        this.userId = str;
        this.host = str2;
        this.httpInteraction = httpInteraction;
    }

    private final String a(String path) {
        String strReplace$default = m.replace$default(m.replace$default(path, "{userId}", this.userId, false, 4, (Object) null), "{eventType}", "HealthTagRecord", false, 4, (Object) null);
        return this.host + strReplace$default;
    }

    private final <T> ApiResponse<T> b(Response response, KSerializer<T> kSerializer) {
        int code = response.getCode();
        boolean z = true;
        if (!(200 <= code && code < 300)) {
            return new ApiErrorResponse(Integer.valueOf(response.getCode()), response.getBody(), response.getError());
        }
        String body = response.getBody();
        if (body != null && !m.isBlank(body)) {
            z = false;
        }
        if (z) {
            return new ApiEmptyResponse();
        }
        try {
            return new ApiSuccessResponse(UtilsKt.getJson().decodeFromString(kSerializer, response.getBody()));
        } catch (Throwable th) {
            HMLog.warn("HealthLabel", th, g.a);
            return new ApiErrorResponse(Integer.valueOf(response.getCode()), response.getBody(), new JsonParseException(th));
        }
    }

    @Override // com.huami.healthlabel.web.WebApi
    public boolean deleteHealthLabelRecord(@NotNull String timestampStr) {
        int code = this.httpInteraction.delete(a(Path.HEALTH_LABEL_RECORD_DELETE), r.mutableMapOf(new Pair("subType", "HealthTagRecord"), new Pair("timestampStr", timestampStr))).getCode();
        return 200 <= code && code < 300;
    }

    @Override // com.huami.healthlabel.web.WebApi
    public void insertHealthLabelRecord(@NotNull HealthTagRecord labelHealthTag) {
        insertHealthLabelRecord(CollectionsKt__CollectionsKt.arrayListOf(labelHealthTag));
    }

    @Override // com.huami.healthlabel.web.WebApi
    @NotNull
    public ApiResponse<LabelProperties> loadAllHomeTable() {
        String strA = a(Path.HEALTH_LABEL_HOME);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("propertyName", "huami.mifit.user.settings.health.tag");
        linkedHashMap.put("mode", "SINGLE");
        linkedHashMap.put("specialHandle", "RECOMMEND_USER_TAG");
        Response response = this.httpInteraction.get(strA, linkedHashMap);
        HMLog.info("HealthLabel", new c(response));
        return b(response, LabelProperties.INSTANCE.serializer());
    }

    @Override // com.huami.healthlabel.web.WebApi
    @NotNull
    public ApiResponse<LabelItems> loadHealthLabelRecord(int limit, @Nullable Long startTime, @Nullable Long endTime, @Nullable Long nextTime, boolean reverse) {
        String strA = a("users/{userId}/events");
        Map<String, String> mapMutableMapOf = r.mutableMapOf(new Pair("eventType", "HealthTagRecord"), new Pair("limit", String.valueOf(limit)), new Pair("subType", "HealthTagRecord"), new Pair("reverse", String.valueOf(reverse)));
        if (startTime != null) {
            mapMutableMapOf.put("from", String.valueOf(startTime.longValue()));
        }
        if (endTime != null) {
            mapMutableMapOf.put("to", String.valueOf(endTime.longValue()));
        }
        if (nextTime != null) {
            mapMutableMapOf.put("next", String.valueOf(nextTime.longValue()));
        }
        Response response = this.httpInteraction.get(strA, mapMutableMapOf);
        HMLog.debug("HealthLabel", new d(response));
        Unit unit = Unit.INSTANCE;
        return b(response, LabelItems.INSTANCE.serializer());
    }

    @Override // com.huami.healthlabel.web.WebApi
    @NotNull
    public Response markDeleteHomeLabel(@NotNull String body) {
        String strA = a("users/{userId}/events");
        HMLog.info("HealthLabel", new e(body));
        Response responsePost$default = HttpInteraction.DefaultImpls.post$default(this.httpInteraction, strA, body, null, 4, null);
        HMLog.info("HealthLabel", new f(responsePost$default));
        return responsePost$default;
    }

    @Override // com.huami.healthlabel.web.WebApi
    @NotNull
    public Response updateHomeTable(@NotNull List<HomeHealthLabel> labels) {
        String strA = a(Path.HEALTH_LABEL_HOME);
        String string = EntryExtKt.toLabelPropertiesJson(labels).toString();
        HMLog.info("HealthLabel", new h(string));
        Response responsePost$default = HttpInteraction.DefaultImpls.post$default(this.httpInteraction, strA, string, null, 4, null);
        HMLog.info("HealthLabel", new i(responsePost$default));
        return responsePost$default;
    }

    @Override // com.huami.healthlabel.web.WebApi
    public void insertHealthLabelRecord(@NotNull List<HealthTagRecord> labelHealthTags) {
        String strA = a("users/{userId}/events");
        String string = EntryExtKt.toJson(labelHealthTags).toString();
        HMLog.info("HealthLabel", new a(string));
        Response responsePost$default = HttpInteraction.DefaultImpls.post$default(this.httpInteraction, strA, string, null, 4, null);
        HMLog.debug("HealthLabel", new b(responsePost$default));
        int code = responsePost$default.getCode();
        boolean z = false;
        if (200 <= code && code < 300) {
            z = true;
        }
        if (z) {
            return;
        }
        JSONArray jSONArray = new JSONArray(SpUtilsKt.getHealthLabelRecord());
        Iterator<T> it2 = labelHealthTags.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((HealthTagRecord) it2.next()).getTimestamp());
        }
        SpUtilsKt.setHealthLabelRecord(jSONArray.toString());
    }
}
