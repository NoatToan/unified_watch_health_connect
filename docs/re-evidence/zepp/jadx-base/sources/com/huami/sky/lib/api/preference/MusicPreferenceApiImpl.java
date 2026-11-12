package com.huami.sky.lib.api.preference;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicQuestionnaireInfo;
import com.huami.sky.lib.properties.SkyPropertiesKey;
import com.huami.sky.lib.properties.SkyQuestionProperties;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.api.UserPropertyApi;
import com.huami.userproperty.service.entity.remote.FetchResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/sky/lib/api/preference/MusicPreferenceApiImpl;", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "Lcom/huami/http/HttpKit;", "", "type", "Lcom/huami/sky/lib/entity/MusicQuestionnaireInfo;", "getMusicPreferenceInfo", "getSelectMusicPreferenceInfo", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class MusicPreferenceApiImpl implements MusicPreferenceApi, HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ FetchResult<Map<String, String>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FetchResult<Map<String, String>> fetchResult) {
            super(0);
            this.a = fetchResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetch success " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ FetchResult<Map<String, String>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FetchResult<Map<String, String>> fetchResult) {
            super(0);
            this.a = fetchResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetch fail " + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.sky.lib.api.preference.MusicPreferenceApi
    @NotNull
    public MusicQuestionnaireInfo getMusicPreferenceInfo(@NotNull String type) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.GET_MUSIC_PREFERENCE_INFO, q.mapOf(TuplesKt.to("type", type)), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (MusicQuestionnaireInfo) converter.convert(responseBodyBody, new TypeToken<MusicQuestionnaireInfo>() { // from class: com.huami.sky.lib.api.preference.MusicPreferenceApiImpl$getMusicPreferenceInfo$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.sky.lib.api.preference.MusicPreferenceApi
    @Nullable
    public String getSelectMusicPreferenceInfo() {
        String str;
        FetchResult<Map<String, String>> fetchResultFetch = UserPropertyApi.INSTANCE.fetch(SkyPropertiesKey.MUSIC_PREFERENCE_QUESTIONNAIRE, "SINGLE", UserPropertyManager.INSTANCE.getDefaultApi().getA());
        if (!(fetchResultFetch instanceof FetchResult.Success)) {
            if (!(fetchResultFetch instanceof FetchResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.info("MusicPreferenceApi", new b(fetchResultFetch));
            return null;
        }
        Map map = (Map) ((FetchResult.Success) fetchResultFetch).getValue();
        if (map == null || (str = (String) map.get(SkyPropertiesKey.MUSIC_PREFERENCE_QUESTIONNAIRE)) == null) {
            return null;
        }
        HMLog.info("MusicPreferenceApi", new a(fetchResultFetch));
        SkyQuestionProperties.INSTANCE.getSkyMusicPreference().set(str);
        return str;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
