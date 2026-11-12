package com.huami.training.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.huami.training.api.pojo.CardBean;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.api.pojo.TrainingConfig;
import com.huami.training.api.pojo.TrainingPlanBean;
import com.huami.training.dto.App;
import com.huami.training.dto.Trainer;
import com.huami.training.util.SerializationKtxKt;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0017\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J9\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016JÁ\u0001\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b/\u00100J\"\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0016R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/huami/training/api/TrainingWebApiImpl;", "Lcom/huami/training/api/TrainingWebApi;", "", "path", "a", "Lcom/huami/training/dto/App;", "app", "Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/TrainingConfig;", "loadConfigurations", "", "needDetail", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "loadTrainingPlan", "isMale", "", "nextPageKey", "", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.PAGE_SIZE, "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "loadJoinedTrainings", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/huami/training/vo/ApiResponse;", "query", "mode", "Lcom/huami/training/api/pojo/TrainingBean;", "search", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/CardBean;", "loadEntranceCards", "", "Lcom/huami/training/api/TrainingTypeBo;", "trainingType", "Lcom/huami/training/api/DisplayLocationBo;", "displayLocation", "addressCode", "Lcom/huami/training/api/DifficultyBo;", "difficulty", "bodyParts", "instrument", "partnerId", WebConst.QueryParam.PARTNER_HUAMI_ID, "trainingId", WebConst.QueryParam.FILTER_MODE, WebConst.QueryParam.FILTER_MODE_ORDER, "tag", "name", "loadTrainings", "(Ljava/util/Set;Lcom/huami/training/api/DisplayLocationBo;Ljava/lang/Boolean;Ljava/lang/String;Lcom/huami/training/api/DifficultyBo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/huami/training/vo/ApiResponse;", "ids", "batchLoadTrainings", "Ljava/lang/String;", "host", "Lcom/huami/training/dto/Trainer;", "b", "Lcom/huami/training/dto/Trainer;", "trainer", "<init>", "(Ljava/lang/String;Lcom/huami/training/dto/Trainer;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingWebApiImpl implements TrainingWebApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "Train-TrainingWebApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Trainer trainer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/training/api/TrainingWebApiImpl$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/training/vo/ApiResponse;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> ApiResponse<T> a(HMHttpResponseData response, KSerializer<T> kSerializer) {
            String message;
            String message2;
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
            if (!response.isSuccess()) {
                if (!(responseString == null || m.isBlank(responseString))) {
                    return new ApiErrorResponse(responseString);
                }
                Throwable error = response.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                return new ApiErrorResponse(str);
            }
            if (responseString == null || Intrinsics.areEqual(responseString, MessageFormatter.c) || response.getStatusCode() == 204) {
                return new ApiEmptyResponse();
            }
            try {
                return new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
            } catch (Throwable th) {
                Throwable error2 = response.getError();
                String str2 = "";
                if (error2 != null && (message2 = error2.getMessage()) != null) {
                    str2 = message2;
                }
                String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", str2);
                HMLog.w(TrainingWebApiImpl.c, th, strStringPlus, new Object[0]);
                return new ApiErrorResponse(strStringPlus);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[App.values().length];
            iArr[App.MIFIT.ordinal()] = 1;
            iArr[App.MIDONG.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/api/TrainingTypeBo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<TrainingTypeBo, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull TrainingTypeBo trainingTypeBo) {
            return trainingTypeBo.getValue();
        }
    }

    public TrainingWebApiImpl(@NotNull String str, @NotNull Trainer trainer) {
        this.host = str;
        this.trainer = trainer;
    }

    private final String a(String path) {
        return Intrinsics.stringPlus(this.host, path);
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<Items<TrainingBean>> batchLoadTrainings(@NotNull Set<Long> ids) {
        return INSTANCE.a(WebUtils.INSTANCE.post(a("queryTrainings"), CollectionsKt___CollectionsKt.joinToString$default(ids, ",", "[", "]", 0, null, null, 56, null), WebUtils.ContentType.JSON), Items.INSTANCE.serializer(TrainingBean.INSTANCE.serializer()));
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<TrainingConfig> loadConfigurations(@NotNull App app) {
        String str;
        String strA = a(WebConst.Path.SETTINGS);
        int i = WhenMappings.$EnumSwitchMapping$0[app.ordinal()];
        if (i == 1) {
            str = "com.xiaomi.hm.health";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "com.huami.midong";
        }
        String strReplace$default = m.replace$default(strA, "{appname}", str, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settingName", WebConst.Value.Settings.TRAINING);
        linkedHashMap.put("mode", "RANGE");
        return INSTANCE.a(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), TrainingConfig.INSTANCE.serializer());
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<CardBean> loadEntranceCards(@NotNull App app) {
        String str;
        String strA = a(WebConst.Path.CARD);
        int i = WhenMappings.$EnumSwitchMapping$0[app.ordinal()];
        if (i == 1) {
            str = "mi";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "watch";
        }
        String strReplace$default = m.replace$default(strA, "{social}", str, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(WebConst.Value.CARD_TYPE.CAROUSEL);
        sb.append(",");
        sb.append(WebConst.Value.CARD_TYPE.SUBJECT);
        linkedHashMap.put("userid", this.trainer.getUserId());
        linkedHashMap.put("types", sb);
        return INSTANCE.a(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), CardBean.INSTANCE.serializer());
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<Items<JoinedTrainingBean>> loadJoinedTrainings(@Nullable Boolean isMale, @Nullable Long nextPageKey, @Nullable Integer pageSize) {
        String strReplace$default = m.replace$default(a("users/{userId}/joinedTrainings"), "{userId}", this.trainer.getUserId(), false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (nextPageKey != null) {
            linkedHashMap.put("next", nextPageKey);
        }
        if (pageSize != null) {
            linkedHashMap.put("limit", pageSize);
        }
        return INSTANCE.a(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), Items.INSTANCE.serializer(JoinedTrainingBean.INSTANCE.serializer()));
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<TrainingPlanBean> loadTrainingPlan(boolean needDetail) {
        return INSTANCE.a(WebUtils.INSTANCE.get(m.replace$default(a(WebConst.Path.TRAINING_PLAN), "{userId}", this.trainer.getUserId(), false, 4, (Object) null), q.mapOf(new Pair(WebConst.QueryParam.IS_DETAIL, Boolean.valueOf(needDetail)))), TrainingPlanBean.INSTANCE.serializer());
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<Items<TrainingBean>> loadTrainings(@Nullable Set<? extends TrainingTypeBo> trainingType, @Nullable DisplayLocationBo displayLocation, @Nullable Boolean isMale, @Nullable String addressCode, @Nullable DifficultyBo difficulty, @Nullable String bodyParts, @Nullable String instrument, @Nullable String partnerId, @Nullable String partnerHuamiId, @Nullable Long trainingId, @Nullable String filterMode, @Nullable String filterModeOrder, @Nullable String tag, @Nullable String name, @Nullable Long nextPageKey, @Nullable Integer pageSize) {
        String strA = a("trainings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (trainingType != null) {
            linkedHashMap.put("trainingType", CollectionsKt___CollectionsKt.joinToString$default(trainingType, ",", null, null, 0, null, a.a, 30, null));
        }
        if (displayLocation != null) {
            linkedHashMap.put("displayLocation", displayLocation.getValue());
        }
        if (isMale != null) {
            isMale.booleanValue();
            linkedHashMap.put("gender", 0);
        }
        if (addressCode != null) {
            linkedHashMap.put("addressCode", addressCode);
        }
        if (difficulty != null) {
            linkedHashMap.put("difficultyDegree", Integer.valueOf(difficulty.getValue()));
        }
        if (bodyParts != null) {
            linkedHashMap.put("location", bodyParts);
        }
        if (instrument != null) {
            linkedHashMap.put("instrument", instrument);
        }
        if (partnerId != null) {
            linkedHashMap.put("partnerId", partnerId);
        }
        if (partnerHuamiId != null) {
            linkedHashMap.put(WebConst.QueryParam.PARTNER_HUAMI_ID, partnerHuamiId);
        }
        if (trainingId != null) {
            linkedHashMap.put("trainingId", trainingId);
        }
        if (nextPageKey != null) {
            linkedHashMap.put("next", nextPageKey);
        }
        if (pageSize != null) {
            linkedHashMap.put("limit", pageSize);
        }
        if (tag != null) {
            linkedHashMap.put("tag", tag);
        }
        if (name != null) {
            linkedHashMap.put("name", name);
        }
        if (filterMode != null) {
            linkedHashMap.put(WebConst.QueryParam.FILTER_MODE, filterMode);
        }
        if (filterModeOrder != null) {
            linkedHashMap.put(WebConst.QueryParam.FILTER_MODE_ORDER, filterModeOrder);
        }
        return INSTANCE.a(WebUtils.INSTANCE.get(strA, linkedHashMap), Items.INSTANCE.serializer(TrainingBean.INSTANCE.serializer()));
    }

    @Override // com.huami.training.api.TrainingWebApi
    @NotNull
    public ApiResponse<Items<TrainingBean>> search(@NotNull String query, @NotNull String mode, @Nullable Long nextPageKey) {
        if (Intrinsics.areEqual(mode, "tag")) {
            return TrainingWebApi.DefaultImpls.loadTrainings$default(this, null, null, null, null, null, null, null, null, null, null, null, null, query, null, nextPageKey, 20, 12287, null);
        }
        return Intrinsics.areEqual(mode, "name") ? TrainingWebApi.DefaultImpls.loadTrainings$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, query, nextPageKey, 20, 8191, null) : new ApiEmptyResponse();
    }
}
