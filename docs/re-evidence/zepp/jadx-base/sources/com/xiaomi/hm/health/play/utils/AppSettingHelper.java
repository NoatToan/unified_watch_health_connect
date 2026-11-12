package com.xiaomi.hm.health.play.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.play.bean.UrlBean;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0003R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/play/utils/AppSettingHelper;", "Lcom/huami/http/HttpKit;", "", "", "a", "id", "getAppSettings", "Ljava/lang/String;", "SETTING_NAME", "b", "URL_MODE", "c", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppSettingHelper implements HttpKit {

    @NotNull
    public static final AppSettingHelper INSTANCE = new AppSettingHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String SETTING_NAME = "zepp.h5.url";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String URL_MODE = "SINGLE";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AppSettingHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getAppSettings fail " + this.a.getMessage();
        }
    }

    private AppSettingHelper() {
    }

    private final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appName", HMAppConfig.getPackageName());
        linkedHashMap.put("settingName", SETTING_NAME);
        linkedHashMap.put("mode", "SINGLE");
        return linkedHashMap;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Nullable
    public final String getAppSettings(@NotNull String id) {
        Object next;
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "apps/" + HMAppConfig.getPackageName() + "/settings", a(), null, 4, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            String str = (String) ((Map) converter.convert(responseBodyBody, new TypeToken<Map<String, ? extends String>>() { // from class: com.xiaomi.hm.health.play.utils.AppSettingHelper$getAppSettings$$inlined$deserializeOrThrow$1
            }.getType())).get(SETTING_NAME);
            if (str == null) {
                return null;
            }
            Iterator it2 = ((List) new Gson().fromJson(str, new TypeToken<List<? extends UrlBean>>() { // from class: com.xiaomi.hm.health.play.utils.AppSettingHelper$getAppSettings$1$urlBeanList$1
            }.getType())).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((UrlBean) next).getId(), id));
            UrlBean urlBean = (UrlBean) next;
            if (urlBean == null) {
                return null;
            }
            return urlBean.getUrl();
        } catch (Exception e) {
            HMLog.info(TAG, new a(e));
            return null;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
