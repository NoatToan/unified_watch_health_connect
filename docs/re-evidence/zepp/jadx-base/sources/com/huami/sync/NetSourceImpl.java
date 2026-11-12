package com.huami.sync;

import com.facebook.appevents.UserDataStore;
import com.google.android.gms.fitness.data.Field;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.sync.job.LoggingKt;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/sync/NetSourceImpl;", "Lcom/huami/sync/NetSource;", "Lcom/huami/http/HttpKit;", "", Constants.DATA_KEY_HR, "", GetWatermarkAPI.KEY_NAME_STEPS, Field.NUTRIENT_CALORIES, "time", "Lcom/huami/sync/UploadResult;", SnoreListFragment.TYPE_UPLOAD, "Lcom/huami/sync/ToggleResult;", "toggle", "<init>", "()V", "Api", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class NetSourceImpl implements NetSource, HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/sync/NetSourceImpl$Api;", "", "", "UPLOAD", "Ljava/lang/String;", "TOGGLE", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Api {

        @NotNull
        public static final Api INSTANCE = new Api();

        @NotNull
        public static final String TOGGLE = "open/realTime/open";

        @NotNull
        public static final String UPLOAD = "open/realTime/upload";

        private Api() {
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.sync.NetSource
    @Nullable
    public ToggleResult toggle() throws Exception {
        Object objM3845constructorimpl;
        LoggingKt.log("实时数据开关云端check");
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, Intrinsics.stringPlus(Config.INSTANCE.getHost(), Api.TOGGLE), null, null, 6, null);
        Object objConvert = null;
        try {
            Result.Companion companion = Result.Companion;
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (responseHttpGet$default.isSuccessful()) {
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                objConvert = converter.convert(responseBodyBody, new TypeToken<ToggleResult>() { // from class: com.huami.sync.NetSourceImpl$toggle$$inlined$deserialize$1
                }.getType());
            } else {
                objM3845constructorimpl = Result.m3845constructorimpl(null);
                if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objConvert = objM3845constructorimpl;
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (ToggleResult) objConvert;
    }

    @Override // com.huami.sync.NetSource
    @Nullable
    public UploadResult upload(int hr, long steps, long calories, long time) throws Exception {
        Object objM3845constructorimpl;
        LoggingKt.log("上传实时数据：heart rate = " + hr + ",step = " + steps + ",calories = " + calories);
        ArrayList arrayList = new ArrayList();
        if (hr > 0) {
            arrayList.add(new Pair(Constants.DATA_KEY_HR, Integer.valueOf(hr)));
        }
        if (steps > 0) {
            arrayList.add(new Pair(UserDataStore.STATE, Long.valueOf(steps)));
        }
        if (calories > 0) {
            arrayList.add(new Pair("cal", Long.valueOf(calories)));
        }
        String strStringPlus = Intrinsics.stringPlus(Config.INSTANCE.getHost(), Api.UPLOAD);
        Object[] array = arrayList.toArray(new Pair[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Pair[] pairArr = (Pair[]) array;
        Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, strStringPlus, OkHttpKtxKt.buildRequestJsonBody((Map<String, ? extends Object>) r.mapOf(TuplesKt.to("data", ExtensionKt.jsonObject((Pair[]) Arrays.copyOf(pairArr, pairArr.length))), TuplesKt.to(UserDataStore.STATE, String.valueOf(time)))), null, null, 12, null);
        Object objConvert = null;
        try {
            Result.Companion companion = Result.Companion;
            ConverterKt.checkToken(responseHttpPost$default, ConverterKt.responseToJsonStr(responseHttpPost$default));
            if (responseHttpPost$default.isSuccessful()) {
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpPost$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                objConvert = converter.convert(responseBodyBody, new TypeToken<UploadResult>() { // from class: com.huami.sync.NetSourceImpl$upload$$inlined$deserialize$1
                }.getType());
            } else {
                objM3845constructorimpl = Result.m3845constructorimpl(null);
                if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objConvert = objM3845constructorimpl;
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (UploadResult) objConvert;
    }
}
