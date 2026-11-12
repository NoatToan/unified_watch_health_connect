package com.huami.sleepassistant.apilib.repo;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.sleepassistant.apilib.bean.AlbumBean;
import com.huami.sleepassistant.apilib.bean.CollectionMusic;
import com.huami.sleepassistant.apilib.bean.CollectionMusic2;
import com.huami.sleepassistant.apilib.bean.CollectionResult;
import com.huami.sleepassistant.apilib.bean.IdLiveMusicBean;
import com.huami.sleepassistant.apilib.bean.IsCollectionResult;
import com.huami.sleepassistant.apilib.bean.Items;
import com.huami.sleepassistant.apilib.bean.LiveMusicBean;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.bean.UpdateCollection;
import com.huami.sleepassistant.apilib.utils.SerializationKtxKt;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.sleepassistant.apilib.utils.WebUtils;
import com.huami.sleepassistant.apilib.vo.ApiEmptyResponse;
import com.huami.sleepassistant.apilib.vo.ApiErrorResponse;
import com.huami.sleepassistant.apilib.vo.ApiResponse;
import com.huami.sleepassistant.apilib.vo.ApiSuccessResponse;
import com.huami.tools.log.HMLog;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J/\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00190\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0016R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%¨\u0006*"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/SleepAssistantApiImpl;", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "", "path", "a", "item", "Lcom/huami/sleepassistant/apilib/vo/ApiResponse;", "Lcom/huami/sleepassistant/apilib/bean/IdLiveMusicBean;", "playLiveMusic", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sortCollection", "Lcom/huami/sleepassistant/apilib/bean/UpdateCollection;", "updateCollection", "id", "getDelCollection", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", "mCollectionMusic", "Lcom/huami/sleepassistant/apilib/bean/CollectionResult;", "postCollectionMusic", "Lcom/huami/sleepassistant/apilib/bean/IsCollectionResult;", "postIsCollectionMusic", "nextPageKey", "", WebConst.QueryParam.PAGE_SIZE, "Lcom/huami/sleepassistant/apilib/bean/Items;", "Lcom/huami/sleepassistant/apilib/bean/LiveMusicBean;", "loadLiveMusic", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/sleepassistant/apilib/vo/ApiResponse;", "Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "loadMusic", WebConst.QueryParam.AUDIO_ID, "Lcom/huami/sleepassistant/apilib/bean/AlbumBean;", "getAudioDetail", "resourceId", "resourceType", "uploadMusicHistory", "Ljava/lang/String;", "host", "<init>", "(Ljava/lang/String;)V", "Companion", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAssistantApiImpl implements SleepAssistantWebApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "SleepAssistant-SleepAssistantWebApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String host;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0002J\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/SleepAssistantApiImpl$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lkotlin/Function0;", "", "Lcom/huami/sleepassistant/apilib/repo/LoadDataStrategy;", "loadDataStrategy", "Lcom/huami/sleepassistant/apilib/vo/ApiResponse;", "c", "a", "", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> ApiResponse<T> a(HMHttpResponseData response) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final ApiResponse<String> b(HMHttpResponseData response) {
            String message;
            if (response.isSuccess()) {
                return new ApiSuccessResponse("");
            }
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
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

        private final <T> ApiResponse<T> c(HMHttpResponseData response, KSerializer<T> kSerializer, Function0<Boolean> loadDataStrategy) {
            String message;
            String message2;
            Boolean a2;
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
            ApiResponse<T> apiResponseA = a(response);
            if (apiResponseA != null) {
                return apiResponseA;
            }
            boolean zBooleanValue = false;
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
            if (loadDataStrategy != null && (a2 = loadDataStrategy.getA()) != null) {
                zBooleanValue = a2.booleanValue();
            }
            if (response.getStatusCode() == 204 || zBooleanValue) {
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
                HMLog.error$default(SleepAssistantApiImpl.b, null, th, new a(strStringPlus), 2, null);
                return new ApiErrorResponse(strStringPlus);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiResponse d(Companion companion, HMHttpResponseData hMHttpResponseData, KSerializer kSerializer, Function0 function0, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return companion.c(hMHttpResponseData, kSerializer, function0);
        }
    }

    public SleepAssistantApiImpl(@NotNull String str) {
        this.host = str;
    }

    private final String a(String path) {
        return Intrinsics.stringPlus(this.host, path);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<AlbumBean> getAudioDetail(@NotNull String audioId) {
        String strA = a(WebConst.Path.GET_AUDIO_DETAIL);
        return Companion.d(INSTANCE, WebUtils.get$default(WebUtils.INSTANCE, strA + '/' + audioId, null, 2, null), AlbumBean.INSTANCE.serializer(), null, 4, null);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<String> getDelCollection(@NotNull String id) {
        return INSTANCE.b(WebUtils.INSTANCE.delete(m.replace$default(a(WebConst.Path.DEL_COLLECTION), "{sleepSetId}", id, false, 4, (Object) null)));
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<Items<LiveMusicBean>> loadLiveMusic(@Nullable String nextPageKey, @Nullable Integer pageSize) {
        String strA = a(WebConst.Path.LIVE_MUSIC_LIST);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (nextPageKey != null) {
            linkedHashMap.put("next", nextPageKey);
        } else {
            linkedHashMap.put("next", "0");
        }
        if (pageSize != null) {
            linkedHashMap.put(WebConst.QueryParam.PAGE_SIZE, pageSize);
        }
        return Companion.d(INSTANCE, WebUtils.INSTANCE.get(strA, linkedHashMap), Items.INSTANCE.serializer(LiveMusicBean.INSTANCE.serializer()), null, 4, null);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<Items<MusicBean>> loadMusic(@Nullable String nextPageKey, @Nullable Integer pageSize) {
        String strA = a(WebConst.Path.MUSIC_LIST);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (nextPageKey != null) {
            linkedHashMap.put("start", nextPageKey);
        }
        if (pageSize != null) {
            linkedHashMap.put("limit", pageSize);
        }
        return Companion.d(INSTANCE, WebUtils.INSTANCE.get(strA, linkedHashMap), Items.INSTANCE.serializer(MusicBean.INSTANCE.serializer()), null, 4, null);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<IdLiveMusicBean> playLiveMusic(@NotNull String item) {
        String strA = a("users/training/audio/sleep/item");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WebConst.QueryParam.SET_ID, item);
        return Companion.d(INSTANCE, WebUtils.INSTANCE.get(strA, linkedHashMap), IdLiveMusicBean.INSTANCE.serializer(), null, 4, null);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<CollectionResult> postCollectionMusic(@NotNull CollectionMusic mCollectionMusic) {
        return Companion.d(INSTANCE, WebUtils.INSTANCE.post(a("users/training/audio/sleep/item"), Json.INSTANCE.encodeToString(CollectionMusic2.INSTANCE.serializer(), new CollectionMusic2(mCollectionMusic.getAudioIds(), mCollectionMusic.getAudioIds().size() > 1 ? WebConst.CollectionType.COMBINATION_AUDIO : WebConst.CollectionType.SINGLE_AUDIO, mCollectionMusic.getItemDescription(), mCollectionMusic.getItemName(), mCollectionMusic.getPlayTime(), mCollectionMusic.getUserId())), WebUtils.ContentType.JSON), CollectionResult.INSTANCE.serializer(), null, 4, null);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<IsCollectionResult> postIsCollectionMusic(@NotNull CollectionMusic mCollectionMusic) {
        String strA = a(WebConst.Path.IS_COLLECTION_MUSIC);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuffer stringBuffer = new StringBuffer();
        int size = mCollectionMusic.getAudioIds().size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i == 0) {
                    stringBuffer.append(mCollectionMusic.getAudioIds().get(i).longValue());
                } else {
                    stringBuffer.append(Intrinsics.stringPlus("&audios=", mCollectionMusic.getAudioIds().get(i)));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        linkedHashMap.put(WebConst.QueryParam.COLLECT_TYPE, mCollectionMusic.getAudioIds().size() > 1 ? WebConst.CollectionType.COMBINATION_AUDIO : WebConst.CollectionType.SINGLE_AUDIO);
        linkedHashMap.put(WebConst.QueryParam.AUDIOS, stringBuffer.toString());
        linkedHashMap.put(WebConst.QueryParam.PLAY_TIME, Integer.valueOf(mCollectionMusic.getPlayTime()));
        linkedHashMap.put("userId", mCollectionMusic.getUserId());
        return Companion.d(INSTANCE, WebUtils.INSTANCE.post(strA, linkedHashMap), IsCollectionResult.INSTANCE.serializer(), null, 4, null);
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<String> sortCollection(@NotNull ArrayList<String> item) {
        String strA = a(WebConst.Path.SORT_COLLECTION);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(item, 10));
        Iterator<T> it2 = item.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(Intrinsics.stringPlus((String) it2.next(), ","));
            arrayList.add(stringBuffer);
        }
        String string = stringBuffer.toString();
        String strSubstring = string.substring(0, string.length() - 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WebConst.QueryParam.SORT_LIST, strSubstring);
        return INSTANCE.b(WebUtils.INSTANCE.put(strA, linkedHashMap));
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<String> updateCollection(@NotNull UpdateCollection item) {
        String strA = a("users/training/audio/sleep/item");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WebConst.QueryParam.SLEEP_SET_ID, item.getSleepSetId());
        linkedHashMap.put(WebConst.QueryParam.PLAY_TIME, Integer.valueOf(item.getPlayTime()));
        String name = item.getName();
        if (name == null) {
            name = "";
        }
        linkedHashMap.put("name", name);
        return INSTANCE.b(WebUtils.INSTANCE.put(strA, linkedHashMap));
    }

    @Override // com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi
    @NotNull
    public ApiResponse<String> uploadMusicHistory(@NotNull String resourceId, @NotNull String resourceType) throws JSONException {
        String strA = a(WebConst.Path.UPLOAD_MUSIC_HISTORY);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", HMWebUtil.getUserId());
        jSONObject.put("resourceId", resourceId);
        jSONObject.put("resourceType", resourceType);
        return INSTANCE.b(WebUtils.INSTANCE.post(strA, jSONObject.toString(), WebUtils.ContentType.JSON));
    }
}
