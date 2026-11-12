package com.huami.treadmill.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.gson.reflect.TypeToken;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.TdLine;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.TdRankingDailyTopList;
import com.huami.treadmill.data.TdRankingDailyTopListNew;
import com.huami.treadmill.data.TdRankingList;
import com.huami.treadmill.data.TdSpeedKingBean;
import com.huami.treadmill.data.TdkingBean;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0016¨\u0006%"}, d2 = {"Lcom/huami/treadmill/api/TdmillApiImp;", "Lcom/huami/treadmill/api/TdmillApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Ljava/lang/reflect/Type;", "type", "a", "(Lcom/huami/network/base/model/HMHttpResponseData;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "", "b", "", "id", "", "nextKey", "Lcom/huami/treadmill/api/ApiResponse;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdSpeedKingBean;", "getSpeedKins", "Lcom/huami/treadmill/data/TdkingBean;", "getDiligentKins", "Lcom/huami/treadmill/data/TdRankingList;", "getSpeedRank", "getDiligentRank", "Lcom/huami/treadmill/data/TdLine;", "getLines", "Lcom/huami/treadmill/data/TdPromotionLine;", "getPromotionLines", "getPromotionLinesDetail", "Lcom/huami/treadmill/data/TdLineDetailRun;", "getOriginLine", "time", "next", "Lcom/huami/treadmill/data/TdLineDetail;", "getLineDetail", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillApiImp implements TdmillApi {
    private final <T> T a(HMHttpResponseData response, Type type) throws HttpException, JsonParseFailException {
        b(response);
        if (!response.isSuccess()) {
            throw new HttpException(response.getStatusCode(), response.getUrl());
        }
        try {
            return (T) HMHttpUtils.getGson().fromJson(new String(response.getResponseBody(), StandardCharsets.UTF_8), type);
        } catch (Exception e) {
            throw new JsonParseFailException(e);
        }
    }

    private final void b(HMHttpResponseData response) throws RuntimeException {
        if (response.getError() != null) {
            if (!RuntimeException.class.isAssignableFrom(response.getError().getClass())) {
                throw new WrappedRuntimeException(response.getError());
            }
            Throwable error = response.getError();
            Objects.requireNonNull(error, "null cannot be cast to non-null type java.lang.RuntimeException{ kotlin.TypeAliasesKt.RuntimeException }");
            throw ((RuntimeException) error);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<Items<TdkingBean>> getDiligentKins(long id, @Nullable String nextKey) {
        String url = HMServerDef.getUrl(TdmillApi.INSTANCE.getRANKING_DAILY_TOP());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("names", "route_" + id + "_maxNum");
        systemParams.put("limit", 20);
        if (!(nextKey == null || nextKey.length() == 0)) {
            systemParams.put("next", nextKey);
        }
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            Map map = (Map) a(hMHttpResponseData, new TypeToken<Map<String, ? extends TdRankingDailyTopList>>() { // from class: com.huami.treadmill.api.TdmillApiImp$getDiligentKins$topMap$1
            }.getType());
            return new ApiSuccessResponse(new Items(((TdRankingDailyTopList) MapsKt.getValue(map, "route_" + id + "_maxNum")).getTopList(), ((TdRankingDailyTopList) MapsKt.getValue(map, "route_" + id + "_maxNum")).getNextKey()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<TdRankingList> getDiligentRank(long id) {
        String url = HMServerDef.getUrl(TdmillApi.INSTANCE.getRANKING_LIST());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("name", "route_" + id + "_maxNum");
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            return new ApiSuccessResponse(a(hMHttpResponseData, new TypeToken<TdRankingList>() { // from class: com.huami.treadmill.api.TdmillApiImp.getDiligentRank.1
            }.getType()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<Items<TdLineDetail>> getLineDetail(long id, long time, long next) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        TdmillApi.Companion companion = TdmillApi.INSTANCE;
        String url = HMServerDef.getUrl(String.format(companion.getTRAINING_HISTORY(), Arrays.copyOf(new Object[]{String.valueOf(id)}, 1)));
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(companion.getPARAM_LIMIT(), 8);
        systemParams.put(companion.getPARAM_NEXT(), Long.valueOf(next));
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            return new ApiSuccessResponse(a(hMHttpResponseData, new TypeToken<Items<TdLineDetail>>() { // from class: com.huami.treadmill.api.TdmillApiImp.getLineDetail.1
            }.getType()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<Items<TdLine>> getLines(@Nullable String nextKey) {
        TdmillApi.Companion companion = TdmillApi.INSTANCE;
        String url = HMServerDef.getUrl(companion.getTRAINING_LIST());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(companion.getPARAM_LIMIT(), 15);
        systemParams.put(companion.getPARAM_ISDETAIL(), Boolean.TRUE);
        systemParams.put(companion.getPARAM_TRAINING_TYPE(), "ROUTE_RUNNING");
        systemParams.put(companion.getPARAM_NEXT(), nextKey);
        systemParams.put(companion.getPARAM_TRAIN_LEVEL(), "");
        systemParams.put(companion.getPARAM_TRAIN_LOCATION(), "");
        systemParams.put(companion.getPARAM_TRAIN_INSTRUMENT(), "");
        systemParams.put(companion.getPARAM_GENDER(), "");
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            return new ApiSuccessResponse(a(hMHttpResponseData, new TypeToken<Items<TdLine>>() { // from class: com.huami.treadmill.api.TdmillApiImp.getLines.1
            }.getType()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            return new ApiErrorResponse(message != null ? message : "");
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<TdLineDetailRun> getOriginLine(long id) {
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String url = HMServerDef.getUrl(String.format(TdmillApi.INSTANCE.getTRAINING_DETAIL(), Arrays.copyOf(new Object[]{String.valueOf(id)}, 1)));
        WebUtils webUtils = WebUtils.INSTANCE;
        HMHttpResponseData hMHttpResponseData = webUtils.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            HMHttpResponseData hMHttpResponseData2 = webUtils.get(((TdPromotionLine) a(hMHttpResponseData, new TypeToken<TdPromotionLine>() { // from class: com.huami.treadmill.api.TdmillApiImp.getOriginLine.1
            }.getType())).getRunLineRunDetail(), systemParams);
            if (!hMHttpResponseData2.isSuccess()) {
                return new ApiErrorResponse(hMHttpResponseData2.getError().getMessage());
            }
            try {
                return new ApiSuccessResponse((TdLineDetailRun) a(hMHttpResponseData2, new TypeToken<TdLineDetailRun>() { // from class: com.huami.treadmill.api.TdmillApiImp.getOriginLine.2
                }.getType()));
            } catch (JsonParseFailException e) {
                String message = e.getMessage();
                return new ApiErrorResponse(message != null ? message : "");
            }
        } catch (JsonParseFailException e2) {
            String message2 = e2.getMessage();
            return new ApiErrorResponse(message2 != null ? message2 : "");
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<Items<TdPromotionLine>> getPromotionLines() {
        List<String> promotionIds = ProxyBoltTrackRecord.INSTANCE.getInstance().getPromotionIds();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String url = HMServerDef.getUrl(String.format("queryTrainings", Arrays.copyOf(new Object[0], 0)));
        if (promotionIds != null && promotionIds.size() > 3) {
            promotionIds = promotionIds.subList(0, 3);
        } else if (promotionIds == null || promotionIds.size() > 3) {
            promotionIds = null;
        }
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(url, String.valueOf(promotionIds), WebUtils.ContentType.JSON);
        if (!hMHttpResponseDataPost.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseDataPost.getError().getMessage());
        }
        try {
            return new ApiSuccessResponse(a(hMHttpResponseDataPost, new TypeToken<Items<TdPromotionLine>>() { // from class: com.huami.treadmill.api.TdmillApiImp.getPromotionLines.1
            }.getType()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<TdPromotionLine> getPromotionLinesDetail(long id) {
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(HMServerDef.getUrl(String.format(TdmillApi.INSTANCE.getTRAINING_DETAIL(), Arrays.copyOf(new Object[]{Long.valueOf(id)}, 1))), systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            return new ApiSuccessResponse(a(hMHttpResponseData, new TypeToken<TdPromotionLine>() { // from class: com.huami.treadmill.api.TdmillApiImp.getPromotionLinesDetail.1
            }.getType()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<Items<TdSpeedKingBean>> getSpeedKins(long id, @Nullable String nextKey) {
        String url = HMServerDef.getUrl(TdmillApi.INSTANCE.getRANKING_DAILY_TOP());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("names", "route_" + id + "_fastedTime");
        systemParams.put("limit", 20);
        if (!(nextKey == null || nextKey.length() == 0)) {
            systemParams.put("next", nextKey);
        }
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            Map map = (Map) a(hMHttpResponseData, new TypeToken<Map<String, ? extends TdRankingDailyTopListNew>>() { // from class: com.huami.treadmill.api.TdmillApiImp$getSpeedKins$topMap$1
            }.getType());
            return new ApiSuccessResponse(new Items(((TdRankingDailyTopListNew) MapsKt.getValue(map, "route_" + id + "_fastedTime")).getTopList(), ((TdRankingDailyTopListNew) MapsKt.getValue(map, "route_" + id + "_fastedTime")).getNextKey()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }

    @Override // com.huami.treadmill.api.TdmillApi
    @NotNull
    public ApiResponse<TdRankingList> getSpeedRank(long id) {
        String url = HMServerDef.getUrl(TdmillApi.INSTANCE.getRANKING_LIST());
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("name", "route_" + id + "_fastedTime");
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, systemParams);
        if (!hMHttpResponseData.isSuccess()) {
            return new ApiErrorResponse(hMHttpResponseData.getError().getMessage());
        }
        try {
            return new ApiSuccessResponse(a(hMHttpResponseData, new TypeToken<TdRankingList>() { // from class: com.huami.treadmill.api.TdmillApiImp.getSpeedRank.1
            }.getType()));
        } catch (JsonParseFailException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new ApiErrorResponse(message);
        }
    }
}
