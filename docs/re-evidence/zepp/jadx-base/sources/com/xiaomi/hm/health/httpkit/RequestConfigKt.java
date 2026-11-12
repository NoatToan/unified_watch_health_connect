package com.xiaomi.hm.health.httpkit;

import com.huami.ednetwork.interceptor.RequestEncryptInterceptor;
import com.huami.ednetwork.interceptor.ResponseDecryptInterceptor;
import com.huami.http.interceptor.CurlInterceptor;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.httpkit.RequestConfigKt;
import com.xiaomi.hm.health.utils.DebugHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000\u001a\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u001a\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000\u001a\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0002\u001a\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lkotlin/Function0;", "", "", "getNFCCommonHeader", "", "getPassportHeader", "getGlobalHeader", "", "Lokhttp3/Interceptor;", "getOkHttpInterceptors", "getOkHttpNetworkInterceptors", "tag", "getGlobalOkHttpNetworkInterceptors", "", "isGlobal", "c", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class RequestConfigKt {

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
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Map<String, ? extends String>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends String> invoke() {
            return RequestConfigKt.getGlobalHeader().invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Map<String, String>> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, String> invoke() {
            Object objM3845constructorimpl;
            Map<String, String> systemHeader;
            boolean z = this.a;
            try {
                Result.Companion companion = Result.Companion;
                if (z) {
                    systemHeader = HMWebUtil.getSystemHeader();
                } else {
                    systemHeader = HMWebUtil.getSystemHeader();
                    systemHeader.put("clientId", String.valueOf(HMAppConfig.APP_ID));
                }
                objM3845constructorimpl = Result.m3845constructorimpl(systemHeader);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                thM3848exceptionOrNullimpl.printStackTrace();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = linkedHashMap;
            }
            return (Map) objM3845constructorimpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, String str2) {
        HMLog.info(str, new a(str2));
    }

    private static final Function0<Map<String, String>> c(boolean z) {
        return new c(z);
    }

    @NotNull
    public static final Function0<Map<String, String>> getGlobalHeader() {
        return c(true);
    }

    @NotNull
    public static final List<Interceptor> getGlobalOkHttpNetworkInterceptors(@NotNull final String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RequestEncryptInterceptor());
        if (GlobalConfig.get().isBuildInner()) {
            HttpLoggingInterceptor level = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: fc6
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void log(String str2) {
                    RequestConfigKt.b(str, str2);
                }
            }).setLevel(HttpLoggingInterceptor.Level.BODY);
            CurlInterceptor curlInterceptor = new CurlInterceptor(new CurlInterceptor.Logger() { // from class: com.xiaomi.hm.health.httpkit.RequestConfigKt$getGlobalOkHttpNetworkInterceptors$1$curlInterceptor$1

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
                        return this.a;
                    }
                }

                @Override // com.huami.http.interceptor.CurlInterceptor.Logger
                public void log(@NotNull String message) {
                    HMLog.info(str, new a(message));
                }
            });
            arrayList.add(level);
            arrayList.add(curlInterceptor);
        }
        arrayList.addAll(getOkHttpNetworkInterceptors());
        arrayList.add(new ResponseDecryptInterceptor());
        return arrayList;
    }

    @NotNull
    public static final Function0<Map<String, String>> getNFCCommonHeader() {
        return c(false);
    }

    @NotNull
    public static final List<Interceptor> getOkHttpInterceptors() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HeaderInterceptor(b.a));
        return arrayList;
    }

    @NotNull
    public static final List<Interceptor> getOkHttpNetworkInterceptors() {
        ArrayList arrayList = new ArrayList();
        if (GlobalConfig.get().isBuildInner()) {
            arrayList.addAll(DebugHelper.networkInterceptors);
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, String> getPassportHeader() {
        return r.mapOf(TuplesKt.to("appname", HMAppConfig.getPackageName()), TuplesKt.to("cv", HMAppConfig.getVersionCode() + "_" + HMAppConfig.getVersionName()), TuplesKt.to("v", "2.0"), TuplesKt.to("appplatform", HMAppConfig.getDeviceType()));
    }
}
