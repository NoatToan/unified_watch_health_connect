package com.xiaomi.hm.health.device.webapi;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\r\u001a\u00020\u000b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0007\u001a\u00020\u000621\u0010\f\u001a-\u0012#\u0012!\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000b0\bR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/WeightApi;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "userIds", "", "deviceId", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onSuccess", "getAvailableUserIds", "a", "Ljava/lang/String;", "tagLog", "b", "API_AVAILABLE_USER_IDS", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightApi {

    @NotNull
    public static final WeightApi INSTANCE = new WeightApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tagLog = "WeightApi";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String API_AVAILABLE_USER_IDS = "devices/bind/users/diff?userIds={userIds}&deviceId={deviceId}";

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
            return "url: " + this.a;
        }
    }

    private WeightApi() {
    }

    public final void getAvailableUserIds(@NotNull ArrayList<Long> userIds, @NotNull String deviceId, @NotNull final Function1<? super ArrayList<Long>, Unit> onSuccess) {
        StringBuilder sb = new StringBuilder(4);
        int size = userIds.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i != userIds.size() - 1) {
                    sb.append(userIds.get(i).longValue());
                    sb.append(",");
                } else {
                    sb.append(userIds.get(i).longValue());
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        String url = HMServerDef.getUrl(m.replace$default(m.replace$default(API_AVAILABLE_USER_IDS, "{userIds}", sb.toString(), false, 4, (Object) null), "{deviceId}", deviceId, false, 4, (Object) null));
        HMLog.info(tagLog, new a(url));
        HMWebUtil.doRequest(url, null, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.webapi.WeightApi.getAvailableUserIds.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WeightApi$getAvailableUserIds$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onCancel " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WeightApi$getAvailableUserIds$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onCompleted";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WeightApi$getAvailableUserIds$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return "onError " + (th == null ? null : th.toString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WeightApi$getAvailableUserIds$2$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return "onFailure " + (hMHttpResponseData == null ? null : hMHttpResponseData.toString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WeightApi$getAvailableUserIds$2$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "responseString: " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                HMLog.info(WeightApi.tagLog, new a(type));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                HMLog.info(WeightApi.tagLog, b.a);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.info(WeightApi.tagLog, new c(throwable));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item) {
                HMLog.info(WeightApi.tagLog, new d(item));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@Nullable HMHttpResponseData item) {
                int length;
                if (item == null) {
                    return;
                }
                Function1<ArrayList<Long>, Unit> function1 = onSuccess;
                if (item.getSuccess()) {
                    HMLog.info(item.getTag(), new e(item));
                    JSONObject jSONObject = new JSONObject(item.getResponseString());
                    ArrayList<Long> arrayList = new ArrayList<>();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userIds");
                    if (jSONArrayOptJSONArray != null) {
                        int i3 = 0;
                        if (!(jSONArrayOptJSONArray.length() > 0)) {
                            jSONArrayOptJSONArray = null;
                        }
                        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                            while (true) {
                                int i4 = i3 + 1;
                                arrayList.add(Long.valueOf(Long.parseLong(jSONArrayOptJSONArray.getString(i3))));
                                if (i4 >= length) {
                                    break;
                                } else {
                                    i3 = i4;
                                }
                            }
                        }
                    }
                    function1.invoke(arrayList);
                }
            }
        });
    }
}
