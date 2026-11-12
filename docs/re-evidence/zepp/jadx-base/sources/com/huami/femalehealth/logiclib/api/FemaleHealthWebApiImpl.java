package com.huami.femalehealth.logiclib.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.femalehealth.logiclib.api.pojo.BaseSettingBean;
import com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationRecordBean;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationStatusBean;
import com.huami.femalehealth.logiclib.api.pojo.TestData;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Duration;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.ext.SerializationKtxKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.manager.FHUploadPermissionManager;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001e\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002H\u0016J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0013H\u0016J \u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u001cH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u0002H\u0016J7\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006,"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApiImpl;", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/femalehealth/logiclib/api/pojo/Items;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", AbstractJSONTokenResponse.RESPONSE, "b", "", "path", "a", "id", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "loadHistoryDetail", "Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", LargeWatchSkinActivity.KEY_BEAN, "initSetting", "Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "getFirstUseInfo", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationRecordBean;", "menstruationBegin", "", "isEnd", "menstruationEndClick", "Lcom/huami/femalehealth/logiclib/api/DeleteType;", "type", "deleteMenstruation", "menstruationEdit", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "menstruationStatus", "Lcom/huami/femalehealth/logiclib/api/pojo/TestData;", "loadTestData", "", "limit", "next", "", WebConst.QueryParam.MONTHLY_STATISTICS, "loadHistory", "(ILjava/lang/String;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "Ljava/lang/String;", "host", "<init>", "(Ljava/lang/String;)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthWebApiImpl implements FemaleHealthWebApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "FemaleHealthWebApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String host;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0082\bJ\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApiImpl$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lkotlin/Function0;", "", "Lcom/huami/femalehealth/logiclib/api/LoadDataStrategy;", "loadDataStrategy", "Lcom/huami/android/vo/ApiResponse;", "b", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> ApiResponse<T> a(HMHttpResponseData response) {
            if (response.getStatusCode() != 409) {
                return null;
            }
            try {
                String string = new JSONObject(response.getResponseString()).getString("errorMsg");
                if (string == null) {
                    string = "请不要重复提交";
                }
                return new ApiErrorResponse(string);
            } catch (Exception unused) {
                return new ApiErrorResponse("未知错误");
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {all -> 0x005f, blocks: (B:18:0x0033, B:23:0x003d, B:24:0x004d), top: B:54:0x0033 }] */
        private final /* synthetic */ <T> ApiResponse<T> b(HMHttpResponseData response, KSerializer<T> kSerializer, Function0<Boolean> loadDataStrategy) {
            String message;
            Boolean a;
            ApiSuccessResponse apiSuccessResponse;
            String message2;
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
            ApiResponse<T> apiResponseA = a(response);
            if (apiResponseA != null) {
                return apiResponseA;
            }
            boolean z = true;
            if (!response.isSuccess()) {
                if (responseString != null && !m.isBlank(responseString)) {
                    z = false;
                }
                if (!z) {
                    return new ApiErrorResponse(responseString);
                }
                Throwable error = response.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                return new ApiErrorResponse(str);
            }
            boolean zBooleanValue = (loadDataStrategy == null || (a = loadDataStrategy.getA()) == null) ? false : a.booleanValue();
            if (response.getStatusCode() == 204 || zBooleanValue) {
                return new ApiEmptyResponse();
            }
            if (responseString != null) {
                try {
                    if (responseString.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
                    } else {
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                        apiSuccessResponse = new ApiSuccessResponse(Object.class.newInstance());
                    }
                } catch (Throwable th) {
                    Throwable error2 = response.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    return new ApiErrorResponse(strStringPlus);
                }
            } else {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                apiSuccessResponse = new ApiSuccessResponse(Object.class.newInstance());
            }
            return apiSuccessResponse;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0052 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:21:0x0038, B:26:0x0042, B:27:0x0052), top: B:57:0x0038 }] */
        public static /* synthetic */ ApiResponse c(Companion companion, HMHttpResponseData hMHttpResponseData, KSerializer kSerializer, Function0 function0, int i, Object obj) {
            String message;
            Boolean bool;
            ApiSuccessResponse apiSuccessResponse;
            String message2;
            if ((i & 4) != 0) {
                function0 = null;
            }
            String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
            ApiResponse apiResponseA = companion.a(hMHttpResponseData);
            if (apiResponseA != null) {
                return apiResponseA;
            }
            boolean z = true;
            if (!hMHttpResponseData.isSuccess()) {
                if (responseString != null && !m.isBlank(responseString)) {
                    z = false;
                }
                if (!z) {
                    return new ApiErrorResponse(responseString);
                }
                Throwable error = hMHttpResponseData.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                return new ApiErrorResponse(str);
            }
            boolean zBooleanValue = (function0 == null || (bool = (Boolean) function0.getA()) == null) ? false : bool.booleanValue();
            if (hMHttpResponseData.getStatusCode() == 204 || zBooleanValue) {
                return new ApiEmptyResponse();
            }
            if (responseString != null) {
                try {
                    if (responseString.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
                    } else {
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                        apiSuccessResponse = new ApiSuccessResponse(Object.class.newInstance());
                    }
                } catch (Throwable th) {
                    Throwable error2 = hMHttpResponseData.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    return new ApiErrorResponse(strStringPlus);
                }
            } else {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                apiSuccessResponse = new ApiSuccessResponse(Object.class.newInstance());
            }
            return apiSuccessResponse;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "menstruationBegin has no permission";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "menstruationEdit has no permission";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "menstruationEndClick has no permission";
        }
    }

    public FemaleHealthWebApiImpl(@NotNull String str) {
        this.host = str;
    }

    private final String a(String path) {
        return Intrinsics.stringPlus(this.host, path);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    private final ApiResponse<Items<HistoryItemBean>> b(ApiResponse<Items<HistoryItemBean>> response) {
        if (!(response instanceof ApiSuccessResponse)) {
            return response;
        }
        ArrayList<String> arrayList = new ArrayList();
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) response;
        for (HistoryItemBean historyItemBean : ((Items) apiSuccessResponse.getBody()).getItems()) {
            long menstrualPeriod = historyItemBean.getMenstrualPeriod();
            Long menstrualEndTime = historyItemBean.getMenstrualEndTime();
            Duration duration = new Duration(menstrualPeriod, menstrualEndTime == null ? 0L : menstrualEndTime.longValue());
            List items = ((Items) apiSuccessResponse.getBody()).getItems();
            ArrayList<HistoryItemBean> arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (!Intrinsics.areEqual(((HistoryItemBean) obj).getId(), historyItemBean.getId())) {
                    arrayList2.add(obj);
                }
            }
            for (HistoryItemBean historyItemBean2 : arrayList2) {
                if (!AidKt.inDur(historyItemBean2.getMenstrualPeriod(), duration)) {
                    Long menstrualEndTime2 = historyItemBean2.getMenstrualEndTime();
                    if (AidKt.inDur(menstrualEndTime2 == null ? -1L : menstrualEndTime2.longValue(), duration)) {
                    }
                }
                Long updateTime = historyItemBean.getUpdateTime();
                long jLongValue = updateTime == null ? 0L : updateTime.longValue();
                Long updateTime2 = historyItemBean2.getUpdateTime();
                if (jLongValue >= (updateTime2 == null ? 0L : updateTime2.longValue())) {
                    arrayList.add(historyItemBean2.getId());
                } else {
                    arrayList.add(historyItemBean.getId());
                }
            }
        }
        List items2 = ((Items) apiSuccessResponse.getBody()).getItems();
        long jResetZeroHour = AidKt.resetZeroHour(DateHelper.INSTANCE.today().getTime().getTime());
        ArrayList<HistoryItemBean> arrayList3 = new ArrayList();
        Iterator it2 = items2.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            HistoryItemBean historyItemBean3 = (HistoryItemBean) next;
            if (AidKt.resetZeroHour(historyItemBean3.getMenstrualPeriod()) > jResetZeroHour) {
                z = true;
            } else if (historyItemBean3.getEnd() == 1) {
                Long menstrualEndTime3 = historyItemBean3.getMenstrualEndTime();
                if ((menstrualEndTime3 == null ? 0L : AidKt.resetZeroHour(menstrualEndTime3.longValue())) > jResetZeroHour) {
                    z = true;
                }
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        for (HistoryItemBean historyItemBean4 : arrayList3) {
            HMLog.i("xys_FemaleHealthWebApiImpl", "删除未来经期  todayTime:" + jResetZeroHour + "  it:" + historyItemBean4, new Object[0]);
            if (!arrayList.contains(historyItemBean4.getId())) {
                arrayList.add(historyItemBean4.getId());
            }
        }
        ArrayList<HistoryItemBean> arrayList4 = new ArrayList();
        for (Object obj2 : items2) {
            HistoryItemBean historyItemBean5 = (HistoryItemBean) obj2;
            long menstrualPeriod2 = historyItemBean5.getMenstrualPeriod();
            Long menstrualEndTime4 = historyItemBean5.getMenstrualEndTime();
            if (menstrualPeriod2 > (menstrualEndTime4 == null ? 0L : menstrualEndTime4.longValue())) {
                arrayList4.add(obj2);
            }
        }
        for (HistoryItemBean historyItemBean6 : arrayList4) {
            HMLog.i("xys_FemaleHealthWebApiImpl", "删除反时间经期 s :" + historyItemBean6.getMenstrualPeriod() + " e :" + historyItemBean6.getMenstrualEndTime(), new Object[0]);
            if (!arrayList.contains(historyItemBean6.getId())) {
                arrayList.add(historyItemBean6.getId());
            }
        }
        for (String str : arrayList) {
            deleteMenstruation(str, DeleteType.TYPE_MERGE);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : items2) {
                if (!Intrinsics.areEqual(((HistoryItemBean) obj3).getId(), str)) {
                    arrayList5.add(obj3);
                }
            }
            items2 = arrayList5;
        }
        return new ApiSuccessResponse(new Items(items2, ((Items) apiSuccessResponse.getBody()).getNext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:10:0x0047, B:14:0x0050, B:15:0x0060), top: B:43:0x0047 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<String> deleteMenstruation(@NotNull String id, @NotNull DeleteType type) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        String strA = a("v4/women/menstruation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", id);
        linkedHashMap.put("type", type.getValue());
        HMHttpResponseData hMHttpResponseDataDelete = WebUtils.INSTANCE.delete(strA, linkedHashMap);
        Companion companion = INSTANCE;
        KSerializer<String> kSerializerSerializer = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE);
        String responseString = hMHttpResponseDataDelete.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<String> apiResponseA = companion.a(hMHttpResponseDataDelete);
        if (apiResponseA == null) {
            if (!hMHttpResponseDataDelete.isSuccess()) {
                if (responseString == null || m.isBlank(responseString)) {
                    Throwable error = hMHttpResponseDataDelete.getError();
                    String str = "网络请求错误";
                    if (error != null && (message = error.getMessage()) != null) {
                        str = message;
                    }
                    apiErrorResponse = new ApiErrorResponse(str);
                } else {
                    apiErrorResponse = new ApiErrorResponse(responseString);
                }
                apiResponseA = apiErrorResponse;
            } else if (hMHttpResponseDataDelete.getStatusCode() == 204) {
                apiResponseA = new ApiEmptyResponse<>();
            } else if (responseString != null) {
                try {
                    if (responseString.length() > 0) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializerSerializer, responseString));
                    } else {
                        apiSuccessResponse = new ApiSuccessResponse(String.class.newInstance());
                    }
                    apiResponseA = apiSuccessResponse;
                } catch (Throwable th) {
                    Throwable error2 = hMHttpResponseDataDelete.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    apiResponseA = new ApiErrorResponse<>(strStringPlus);
                }
            } else {
                apiSuccessResponse = new ApiSuccessResponse(String.class.newInstance());
                apiResponseA = apiSuccessResponse;
            }
        }
        DataCacheManager.INSTANCE.setHistoryChanged();
        return apiResponseA;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:10:0x0036, B:14:0x003f, B:15:0x004f), top: B:42:0x0036 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<FirstUseInfoBean> getFirstUseInfo() {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        HMHttpResponseData hMHttpResponseData = WebUtils.get$default(WebUtils.INSTANCE, a(WebConst.Path.FIRST_INIT), null, 2, null);
        Companion companion = INSTANCE;
        KSerializer<FirstUseInfoBean> kSerializerSerializer = FirstUseInfoBean.INSTANCE.serializer();
        String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<FirstUseInfoBean> apiResponseA = companion.a(hMHttpResponseData);
        if (apiResponseA != null) {
            return apiResponseA;
        }
        if (!hMHttpResponseData.isSuccess()) {
            if (responseString == null || m.isBlank(responseString)) {
                Throwable error = hMHttpResponseData.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                apiErrorResponse = new ApiErrorResponse(str);
            } else {
                apiErrorResponse = new ApiErrorResponse(responseString);
            }
            return apiErrorResponse;
        }
        if (hMHttpResponseData.getStatusCode() == 204) {
            return new ApiEmptyResponse();
        }
        if (responseString != null) {
            try {
                if (responseString.length() > 0) {
                    apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializerSerializer, responseString));
                } else {
                    apiSuccessResponse = new ApiSuccessResponse(FirstUseInfoBean.class.newInstance());
                }
            } catch (Throwable th) {
                Throwable error2 = hMHttpResponseData.getError();
                if (error2 == null || (message2 = error2.getMessage()) == null) {
                    message2 = "";
                }
                String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                return new ApiErrorResponse(strStringPlus);
            }
        } else {
            apiSuccessResponse = new ApiSuccessResponse(FirstUseInfoBean.class.newInstance());
        }
        return apiSuccessResponse;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #0 {all -> 0x006f, blocks: (B:10:0x004b, B:14:0x0054, B:15:0x0062), top: B:42:0x004b }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<String> initSetting(@NotNull BaseSettingBean bean) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        String strA = a(WebConst.Path.FIRST_INIT);
        Json.Companion companion = Json.INSTANCE;
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(strA, SerializationKtxKt.getTrueEncodeDefault(companion).encodeToString(BaseSettingBean.INSTANCE.serializer(), bean), WebUtils.ContentType.JSON);
        DataCacheManager.INSTANCE.setSettingChanged();
        Companion companion2 = INSTANCE;
        KSerializer<String> kSerializerSerializer = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE);
        String responseString = hMHttpResponseDataPost.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<String> apiResponseA = companion2.a(hMHttpResponseDataPost);
        if (apiResponseA != null) {
            return apiResponseA;
        }
        if (!hMHttpResponseDataPost.isSuccess()) {
            if (responseString == null || m.isBlank(responseString)) {
                Throwable error = hMHttpResponseDataPost.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                apiErrorResponse = new ApiErrorResponse(str);
            } else {
                apiErrorResponse = new ApiErrorResponse(responseString);
            }
            return apiErrorResponse;
        }
        if (hMHttpResponseDataPost.getStatusCode() == 204) {
            return new ApiEmptyResponse();
        }
        if (responseString != null) {
            try {
                if (responseString.length() > 0) {
                    apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(companion).decodeFromString(kSerializerSerializer, responseString));
                } else {
                    apiSuccessResponse = new ApiSuccessResponse(String.class.newInstance());
                }
            } catch (Throwable th) {
                Throwable error2 = hMHttpResponseDataPost.getError();
                if (error2 == null || (message2 = error2.getMessage()) == null) {
                    message2 = "";
                }
                String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                return new ApiErrorResponse(strStringPlus);
            }
        } else {
            apiSuccessResponse = new ApiSuccessResponse(String.class.newInstance());
        }
        return apiSuccessResponse;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:17:0x0060, B:21:0x0069, B:22:0x0079), top: B:50:0x0060 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @NotNull
    public ApiResponse<Items<HistoryItemBean>> loadHistory(int limit, @Nullable String next, @Nullable Long monthlyStatistics) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        String strA = a(WebConst.Path.HISTORY);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("limit", Integer.valueOf(limit));
        if (next != null) {
            linkedHashMap.put("next", next);
        }
        if (monthlyStatistics != null) {
            linkedHashMap.put(WebConst.QueryParam.MONTHLY_STATISTICS, Long.valueOf(monthlyStatistics.longValue()));
        }
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(strA, linkedHashMap);
        Companion companion = INSTANCE;
        KSerializer kSerializerSerializer = Items.INSTANCE.serializer(HistoryItemBean.INSTANCE.serializer());
        String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<Items<HistoryItemBean>> apiResponseA = companion.a(hMHttpResponseData);
        if (apiResponseA == null) {
            if (!hMHttpResponseData.isSuccess()) {
                if (responseString == null || m.isBlank(responseString)) {
                    Throwable error = hMHttpResponseData.getError();
                    String str = "网络请求错误";
                    if (error != null && (message = error.getMessage()) != null) {
                        str = message;
                    }
                    apiErrorResponse = new ApiErrorResponse(str);
                } else {
                    apiErrorResponse = new ApiErrorResponse(responseString);
                }
                apiResponseA = apiErrorResponse;
            } else if (hMHttpResponseData.getStatusCode() == 204) {
                apiResponseA = new ApiEmptyResponse<>();
            } else if (responseString != null) {
                try {
                    if (responseString.length() > 0) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializerSerializer, responseString));
                    } else {
                        apiSuccessResponse = new ApiSuccessResponse(Items.class.newInstance());
                    }
                    apiResponseA = apiSuccessResponse;
                } catch (Throwable th) {
                    Throwable error2 = hMHttpResponseData.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    apiResponseA = new ApiErrorResponse<>(strStringPlus);
                }
            } else {
                apiSuccessResponse = new ApiSuccessResponse(Items.class.newInstance());
                apiResponseA = apiSuccessResponse;
            }
        }
        return b(apiResponseA);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:10:0x0042, B:14:0x004b, B:15:0x005b), top: B:42:0x0042 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<List<HistoryDetailBean>> loadHistoryDetail(@NotNull String id) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        String strA = a(WebConst.Path.HISTORY_DETAIL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", id);
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(strA, linkedHashMap);
        Companion companion = INSTANCE;
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(HistoryDetailBean.INSTANCE.serializer());
        String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<List<HistoryDetailBean>> apiResponseA = companion.a(hMHttpResponseData);
        if (apiResponseA != null) {
            return apiResponseA;
        }
        if (!hMHttpResponseData.isSuccess()) {
            if (responseString == null || m.isBlank(responseString)) {
                Throwable error = hMHttpResponseData.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                apiErrorResponse = new ApiErrorResponse(str);
            } else {
                apiErrorResponse = new ApiErrorResponse(responseString);
            }
            return apiErrorResponse;
        }
        if (hMHttpResponseData.getStatusCode() == 204) {
            return new ApiEmptyResponse();
        }
        if (responseString != null) {
            try {
                if (responseString.length() > 0) {
                    apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializerListSerializer, responseString));
                } else {
                    apiSuccessResponse = new ApiSuccessResponse(List.class.newInstance());
                }
            } catch (Throwable th) {
                Throwable error2 = hMHttpResponseData.getError();
                if (error2 == null || (message2 = error2.getMessage()) == null) {
                    message2 = "";
                }
                String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                return new ApiErrorResponse(strStringPlus);
            }
        } else {
            apiSuccessResponse = new ApiSuccessResponse(List.class.newInstance());
        }
        return apiSuccessResponse;
    }

    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @NotNull
    public ApiResponse<Items<TestData>> loadTestData() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x0056, B:18:0x005f, B:19:0x006d), top: B:47:0x0056 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<MenstruationRecordBean> menstruationBegin(@NotNull MenstruationRecordBean bean) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        if (!FHUploadPermissionManager.INSTANCE.getHasPermission()) {
            HMLog.warn$default("xys_FemaleHealthWebApiImpl", null, a.a, 2, null);
            return null;
        }
        String strA = a("v4/women/menstruation");
        Json.Companion companion = Json.INSTANCE;
        Json trueEncodeDefault = SerializationKtxKt.getTrueEncodeDefault(companion);
        MenstruationRecordBean.Companion companion2 = MenstruationRecordBean.INSTANCE;
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(strA, trueEncodeDefault.encodeToString(companion2.serializer(), bean), WebUtils.ContentType.JSON);
        Companion companion3 = INSTANCE;
        KSerializer<MenstruationRecordBean> kSerializerSerializer = companion2.serializer();
        String responseString = hMHttpResponseDataPost.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<MenstruationRecordBean> apiResponseA = companion3.a(hMHttpResponseDataPost);
        if (apiResponseA == null) {
            if (!hMHttpResponseDataPost.isSuccess()) {
                if (responseString == null || m.isBlank(responseString)) {
                    Throwable error = hMHttpResponseDataPost.getError();
                    String str = "网络请求错误";
                    if (error != null && (message = error.getMessage()) != null) {
                        str = message;
                    }
                    apiErrorResponse = new ApiErrorResponse(str);
                } else {
                    apiErrorResponse = new ApiErrorResponse(responseString);
                }
                apiResponseA = apiErrorResponse;
            } else if (hMHttpResponseDataPost.getStatusCode() == 204) {
                apiResponseA = new ApiEmptyResponse<>();
            } else if (responseString != null) {
                try {
                    if (responseString.length() > 0) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(companion).decodeFromString(kSerializerSerializer, responseString));
                    } else {
                        apiSuccessResponse = new ApiSuccessResponse(MenstruationRecordBean.class.newInstance());
                    }
                    apiResponseA = apiSuccessResponse;
                } catch (Throwable th) {
                    Throwable error2 = hMHttpResponseDataPost.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    apiResponseA = new ApiErrorResponse<>(strStringPlus);
                }
            } else {
                apiSuccessResponse = new ApiSuccessResponse(MenstruationRecordBean.class.newInstance());
                apiResponseA = apiSuccessResponse;
            }
        }
        DataCacheManager.INSTANCE.setHistoryChanged();
        return apiResponseA;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x0056, B:18:0x005f, B:19:0x006d), top: B:47:0x0056 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<MenstruationRecordBean> menstruationEdit(@NotNull MenstruationRecordBean bean) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        if (!FHUploadPermissionManager.INSTANCE.getHasPermission()) {
            HMLog.warn$default("xys_FemaleHealthWebApiImpl", null, b.a, 2, null);
            return null;
        }
        String strA = a(WebConst.Path.MENSTRUATION_END);
        Json.Companion companion = Json.INSTANCE;
        Json trueEncodeDefault = SerializationKtxKt.getTrueEncodeDefault(companion);
        MenstruationRecordBean.Companion companion2 = MenstruationRecordBean.INSTANCE;
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(strA, trueEncodeDefault.encodeToString(companion2.serializer(), bean), WebUtils.ContentType.JSON);
        Companion companion3 = INSTANCE;
        KSerializer<MenstruationRecordBean> kSerializerSerializer = companion2.serializer();
        String responseString = hMHttpResponseDataPost.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<MenstruationRecordBean> apiResponseA = companion3.a(hMHttpResponseDataPost);
        if (apiResponseA == null) {
            if (!hMHttpResponseDataPost.isSuccess()) {
                if (responseString == null || m.isBlank(responseString)) {
                    Throwable error = hMHttpResponseDataPost.getError();
                    String str = "网络请求错误";
                    if (error != null && (message = error.getMessage()) != null) {
                        str = message;
                    }
                    apiErrorResponse = new ApiErrorResponse(str);
                } else {
                    apiErrorResponse = new ApiErrorResponse(responseString);
                }
                apiResponseA = apiErrorResponse;
            } else if (hMHttpResponseDataPost.getStatusCode() == 204) {
                apiResponseA = new ApiEmptyResponse<>();
            } else if (responseString != null) {
                try {
                    if (responseString.length() > 0) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(companion).decodeFromString(kSerializerSerializer, responseString));
                    } else {
                        apiSuccessResponse = new ApiSuccessResponse(MenstruationRecordBean.class.newInstance());
                    }
                    apiResponseA = apiSuccessResponse;
                } catch (Throwable th) {
                    Throwable error2 = hMHttpResponseDataPost.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    apiResponseA = new ApiErrorResponse<>(strStringPlus);
                }
            } else {
                apiSuccessResponse = new ApiSuccessResponse(MenstruationRecordBean.class.newInstance());
                apiResponseA = apiSuccessResponse;
            }
        }
        DataCacheManager.INSTANCE.setHistoryChanged();
        return apiResponseA;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:14:0x0059, B:18:0x0062, B:19:0x0072), top: B:47:0x0059 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<String> menstruationEndClick(@NotNull String id, boolean isEnd) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        if (!FHUploadPermissionManager.INSTANCE.getHasPermission()) {
            HMLog.warn$default("xys_FemaleHealthWebApiImpl", null, c.a, 2, null);
            return null;
        }
        String strA = a(WebConst.Path.MENSTRUATION_END);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", id);
        linkedHashMap.put("end", Integer.valueOf(isEnd ? 1 : 0));
        HMHttpResponseData hMHttpResponseDataPut = WebUtils.INSTANCE.put(strA, linkedHashMap);
        Companion companion = INSTANCE;
        KSerializer<String> kSerializerSerializer = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE);
        String responseString = hMHttpResponseDataPut.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<String> apiResponseA = companion.a(hMHttpResponseDataPut);
        if (apiResponseA == null) {
            if (!hMHttpResponseDataPut.isSuccess()) {
                if (responseString == null || m.isBlank(responseString)) {
                    Throwable error = hMHttpResponseDataPut.getError();
                    String str = "网络请求错误";
                    if (error != null && (message = error.getMessage()) != null) {
                        str = message;
                    }
                    apiErrorResponse = new ApiErrorResponse(str);
                } else {
                    apiErrorResponse = new ApiErrorResponse(responseString);
                }
                apiResponseA = apiErrorResponse;
            } else if (hMHttpResponseDataPut.getStatusCode() == 204) {
                apiResponseA = new ApiEmptyResponse<>();
            } else if (responseString != null) {
                try {
                    if (responseString.length() > 0) {
                        apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializerSerializer, responseString));
                    } else {
                        apiSuccessResponse = new ApiSuccessResponse(String.class.newInstance());
                    }
                    apiResponseA = apiSuccessResponse;
                } catch (Throwable th) {
                    Throwable error2 = hMHttpResponseDataPut.getError();
                    if (error2 == null || (message2 = error2.getMessage()) == null) {
                        message2 = "";
                    }
                    String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                    HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                    apiResponseA = new ApiErrorResponse<>(strStringPlus);
                }
            } else {
                apiSuccessResponse = new ApiSuccessResponse(String.class.newInstance());
                apiResponseA = apiSuccessResponse;
            }
        }
        DataCacheManager.INSTANCE.setHistoryChanged();
        return apiResponseA;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:10:0x0049, B:14:0x0052, B:15:0x0060), top: B:42:0x0049 }] */
    @Override // com.huami.femalehealth.logiclib.api.FemaleHealthWebApi
    @Nullable
    public ApiResponse<MenstruationStatusBean> menstruationStatus(@NotNull MenstruationStatusBean bean) {
        ApiErrorResponse apiErrorResponse;
        String message;
        ApiSuccessResponse apiSuccessResponse;
        String message2;
        DataCacheManager.INSTANCE.setMensStatusChanged();
        String strA = a(WebConst.Path.MENSTRUATION_STATUS);
        Json.Companion companion = Json.INSTANCE;
        Json trueEncodeDefault = SerializationKtxKt.getTrueEncodeDefault(companion);
        MenstruationStatusBean.Companion companion2 = MenstruationStatusBean.INSTANCE;
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(strA, trueEncodeDefault.encodeToString(companion2.serializer(), bean), WebUtils.ContentType.JSON);
        Companion companion3 = INSTANCE;
        KSerializer<MenstruationStatusBean> kSerializerSerializer = companion2.serializer();
        String responseString = hMHttpResponseDataPost.getResponseString(StandardCharsets.UTF_8);
        ApiResponse<MenstruationStatusBean> apiResponseA = companion3.a(hMHttpResponseDataPost);
        if (apiResponseA != null) {
            return apiResponseA;
        }
        if (!hMHttpResponseDataPost.isSuccess()) {
            if (responseString == null || m.isBlank(responseString)) {
                Throwable error = hMHttpResponseDataPost.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                apiErrorResponse = new ApiErrorResponse(str);
            } else {
                apiErrorResponse = new ApiErrorResponse(responseString);
            }
            return apiErrorResponse;
        }
        if (hMHttpResponseDataPost.getStatusCode() == 204) {
            return new ApiEmptyResponse();
        }
        if (responseString != null) {
            try {
                if (responseString.length() > 0) {
                    apiSuccessResponse = new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(companion).decodeFromString(kSerializerSerializer, responseString));
                } else {
                    apiSuccessResponse = new ApiSuccessResponse(MenstruationStatusBean.class.newInstance());
                }
            } catch (Throwable th) {
                Throwable error2 = hMHttpResponseDataPost.getError();
                if (error2 == null || (message2 = error2.getMessage()) == null) {
                    message2 = "";
                }
                String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", message2);
                HMLog.error("xys", "", th, new FemaleHealthWebApiImpl$Companion$parseResponse$1$1(strStringPlus));
                return new ApiErrorResponse(strStringPlus);
            }
        } else {
            apiSuccessResponse = new ApiSuccessResponse(MenstruationStatusBean.class.newInstance());
        }
        return apiSuccessResponse;
    }
}
