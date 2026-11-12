package com.xiaomi.hm.health.nps.api;

import android.net.Uri;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.GsonBuilder;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.nps.model.Assets;
import com.xiaomi.hm.health.nps.model.Extensions;
import com.xiaomi.hm.health.nps.model.NpsTarget;
import com.xiaomi.hm.health.nps.model.NpsTargetVo;
import com.xiaomi.hm.health.nps.ui.NpsHelper;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJD\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u000f0\u0015J(\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u000f0\u0015J,\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010 R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010 R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010 R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010 ¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/nps/api/NpsWebAPI;", "", "Lcom/huami/network/base/model/HMHttpResponseData;", "item", "", "Lcom/xiaomi/hm/health/nps/model/NpsTarget;", "b", "Lcom/xiaomi/hm/health/nps/model/NpsTargetVo;", "a", "", "userId", "source", "country", "Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsTargetSuccessListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "getNpsTarget", "", "age", WebConstant.QueryParam.USER_REGION, WebConstant.QueryParam.USER_COUNTRY, "Lkotlin/Function1;", "resultHandler", "getNpsTargets", "bodyJson", "surveyId", "Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsUserResultSuccessListener;", "successListener", "Lcom/xiaomi/hm/health/nps/ui/NpsHelper$OnNpsUserResultErrorListener;", "errorListener", "getUserResult", "TAG", "Ljava/lang/String;", "API_CARDS", "API_USER_RESULT", "c", "API_CARDS_TYPE", GoogleApiAvailabilityLight.a, "API_NPS_MAIN", "e", "PARAM_KEY_USER_ID", "f", "PARAM_KEY_DEVICE_ID", "g", "PARAM_KEY_USER_REGION", "h", "PARAM_KEY_USER_COUNTRY", "i", "PARAM_KEY_USER_AGE", z.j, LogUtil.I, "STATUS_NOT_FOUND", hl.k, "API_NPS_MAIN_3", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsWebAPI {

    @NotNull
    public static final NpsWebAPI INSTANCE = new NpsWebAPI();

    @NotNull
    public static final String TAG = "NpsWebAPI";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String API_CARDS = "discovery/%s/cards/%s";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String API_USER_RESULT = "survey/app/user-result/%s";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String API_CARDS_TYPE = "survey_nps";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String API_NPS_MAIN = "nps/%s/cards/survey_nps";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_KEY_USER_ID = "userid";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_KEY_DEVICE_ID = "device_id";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_KEY_USER_REGION = "user_region";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_KEY_USER_COUNTRY = "user_country";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_KEY_USER_AGE = "age";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final int STATUS_NOT_FOUND = 404;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String API_NPS_MAIN_3 = "survey/nps/%s/list";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<String, Object> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, Object> map, String str) {
            super(0);
            this.a = map;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getNpsTarget, params: " + this.a + ", url: " + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<String, Object> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, Object> map, String str) {
            super(0);
            this.a = map;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUserResult, params: " + this.a + ", url: " + ((Object) this.b);
        }
    }

    private NpsWebAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NpsTargetVo a(HMHttpResponseData item) {
        Assets assets;
        List list = ArraysKt___ArraysKt.toList((Object[]) new GsonBuilder().create().fromJson(new String(item.getResponseBody(), Charsets.UTF_8), NpsTarget[].class));
        String id = null;
        if (!(!list.isEmpty())) {
            return null;
        }
        NpsTarget npsTarget = (NpsTarget) list.get(0);
        String target = npsTarget.getTarget();
        Extensions extensions = npsTarget.getExtensions();
        if (extensions != null && (assets = extensions.getAssets()) != null) {
            id = assets.getId();
        }
        return new NpsTargetVo(target, id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<NpsTarget> b(HMHttpResponseData item) {
        return ArraysKt___ArraysKt.toList((Object[]) new GsonBuilder().create().fromJson(new String(item.getResponseBody(), Charsets.UTF_8), NpsTarget[].class));
    }

    public static /* synthetic */ void getUserResult$default(NpsWebAPI npsWebAPI, String str, String str2, NpsHelper.OnNpsUserResultSuccessListener onNpsUserResultSuccessListener, NpsHelper.OnNpsUserResultErrorListener onNpsUserResultErrorListener, int i, Object obj) {
        if ((i & 8) != 0) {
            onNpsUserResultErrorListener = null;
        }
        npsWebAPI.getUserResult(str, str2, onNpsUserResultSuccessListener, onNpsUserResultErrorListener);
    }

    public final void getNpsTarget(@NotNull String userId, @Nullable String source, @NotNull String country, @NotNull final NpsHelper.OnNpsTargetSuccessListener listener) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String url = HMServerDef.getUrl(String.format(Locale.getDefault(), API_CARDS, Arrays.copyOf(new Object[]{HMAppConfig.getSocial(), API_CARDS_TYPE}, 2)) + "?user_country=" + country);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("userid", userId);
        if (source != null) {
            linkedHashMap.put("device_id", source);
        }
        HMLog.info(TAG, new a(linkedHashMap, url));
        HMWebUtil.doRequest(url, linkedHashMap, Support.RequestSupport.GET, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.nps.api.NpsWebAPI.getNpsTarget.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTarget$3$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("getNpsTarget fail, err=", this.a.getMessage());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTarget$3$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getNpsTarget, item.resp=", hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTarget$3$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getNpsTarget fail, status=", hMHttpResponseData == null ? null : Integer.valueOf(hMHttpResponseData.getStatusCode()));
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
                HMLog.info(NpsWebAPI.TAG, new a(throwable));
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                HMLog.info(NpsWebAPI.TAG, new b(item));
                if (item == null || !item.isSuccess()) {
                    HMLog.info(NpsWebAPI.TAG, new c(item));
                    return;
                }
                NpsTargetVo npsTargetVoA = NpsWebAPI.INSTANCE.a(item);
                if (npsTargetVoA == null) {
                    return;
                }
                listener.onSuccess(npsTargetVoA);
            }
        });
    }

    public final void getNpsTargets(@NotNull String userId, int age, @Nullable String userRegion, @Nullable String userCountry, @NotNull final Function1<? super List<NpsTarget>, Unit> resultHandler) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HMWebUtil.doRequest(Uri.parse(HMServerDef.getUrl(String.format(API_NPS_MAIN, Arrays.copyOf(new Object[]{HMAppConfig.getSocial()}, 1)))).buildUpon().appendQueryParameter("userid", userId).appendQueryParameter("age", String.valueOf(age)).appendQueryParameter("user_region", userRegion).appendQueryParameter("user_country", userCountry).build().toString(), new LinkedHashMap(), Support.RequestSupport.GET, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.nps.api.NpsWebAPI.getNpsTargets.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return Intrinsics.stringPlus("getNpsTargets: ", th == null ? null : th.getMessage());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getNpsTargets, item.resp=", hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getNpsTargets fail, status=", hMHttpResponseData == null ? null : Integer.valueOf(hMHttpResponseData.getStatusCode()));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$1$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("getNpsTargets: parse failed -> ", this.a.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.info(NpsWebAPI.TAG, new a(throwable));
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                List<NpsTarget> listB;
                HMLog.info(NpsWebAPI.TAG, new b(item));
                if (item == null || !item.isSuccess()) {
                    HMLog.info(NpsWebAPI.TAG, new c(item));
                    return;
                }
                try {
                    listB = NpsWebAPI.INSTANCE.b(item);
                } catch (Exception e) {
                    HMLog.info(NpsWebAPI.TAG, new d(e));
                    listB = null;
                }
                if (listB != null) {
                    resultHandler.invoke(listB);
                }
            }
        });
    }

    public final void getUserResult(@NotNull String surveyId, @Nullable String source, @NotNull final NpsHelper.OnNpsUserResultSuccessListener successListener, @Nullable final NpsHelper.OnNpsUserResultErrorListener errorListener) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), API_USER_RESULT, Arrays.copyOf(new Object[]{surveyId}, 1));
        if (source != null && !Intrinsics.areEqual(String.valueOf(HMDeviceSource.VDEVICE.getValue()), source)) {
            str = str + "?device=" + ((Object) source);
        }
        String url = HMServerDef.getUrl(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HMLog.info(TAG, new b(linkedHashMap, url));
        HMWebUtil.doRequest(url, linkedHashMap, Support.RequestSupport.GET, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.nps.api.NpsWebAPI.getUserResult.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getUserResult$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("getUserResult fail, err=", this.a.getMessage());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getUserResult$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getUserResult, item.resp=", hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getUserResult$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getUserResult fail, status=", hMHttpResponseData == null ? null : Integer.valueOf(hMHttpResponseData.getStatusCode()));
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
                HMLog.info(NpsWebAPI.TAG, new a(throwable));
                NpsHelper.OnNpsUserResultErrorListener onNpsUserResultErrorListener = errorListener;
                if (onNpsUserResultErrorListener == null) {
                    return;
                }
                onNpsUserResultErrorListener.onError();
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                HMLog.info(NpsWebAPI.TAG, new b(item));
                if (item != null) {
                    successListener.onSuccess(!(item.getStatusCode() == 404));
                } else {
                    HMLog.info(NpsWebAPI.TAG, new c(item));
                }
            }
        });
    }

    public final void getNpsTargets(@NotNull String bodyJson, @NotNull final Function1<? super List<NpsTarget>, Unit> resultHandler) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String url = HMServerDef.getUrl(String.format(API_NPS_MAIN_3, Arrays.copyOf(new Object[]{HMAppConfig.getSocial()}, 1)));
        HashSet hashSet = new HashSet();
        hashSet.add(bodyJson);
        hashSet.add("application/json");
        HMWebUtil.doSeparateRequest(url, hashSet, Support.RequestSupport.POST, true, false, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.nps.api.NpsWebAPI.getNpsTargets.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$2$a */
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
                    return Intrinsics.stringPlus("getNpsTargetsCancel: ", Integer.valueOf(this.a));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    Throwable th = this.a;
                    return Intrinsics.stringPlus("getNpsTargetsError: ", th == null ? null : th.getMessage());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMHttpResponseData hMHttpResponseData = this.a;
                    return Intrinsics.stringPlus("getNpsTargets, item.resp=", hMHttpResponseData == null ? null : hMHttpResponseData.getResponseString());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$2$d */
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
                    return Intrinsics.stringPlus("getNpsTargets fail, status=", hMHttpResponseData == null ? null : Integer.valueOf(hMHttpResponseData.getStatusCode()));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.api.NpsWebAPI$getNpsTargets$2$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("getNpsTargets: parse failed -> ", this.a.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                HMLog.info(NpsWebAPI.TAG, new a(type));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.info(NpsWebAPI.TAG, new b(throwable));
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                List<NpsTarget> listB;
                HMLog.info(NpsWebAPI.TAG, new c(item));
                if (item == null || !item.isSuccess()) {
                    HMLog.info(NpsWebAPI.TAG, new d(item));
                    return;
                }
                try {
                    listB = NpsWebAPI.INSTANCE.b(item);
                } catch (Exception e2) {
                    HMLog.info(NpsWebAPI.TAG, new e(e2));
                    listB = null;
                }
                if (listB != null) {
                    resultHandler.invoke(listB);
                }
            }
        }, new HMHttpConfig[0]);
    }
}
