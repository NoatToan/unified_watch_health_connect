package com.xiaomi.hm.health.nfc;

import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.nfc.web.IWebConfig;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.hm.health.httpkit.RequestConfigKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0002H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WebConfig;", "Lcom/huami/nfc/web/IWebConfig;", "Lkotlin/Function0;", "", "baseHost", "", "commonHeader", "", "Lokhttp3/Interceptor;", "okHttpInterceptors", "okHttpNetworkInterceptors", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WebConfig implements IWebConfig {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return HMServerDef.getHost();
        }
    }

    @Override // com.huami.nfc.web.IWebConfig
    @NotNull
    public Function0<String> baseHost() {
        return a.a;
    }

    @Override // com.huami.nfc.web.IWebConfig
    @NotNull
    public Function0<Map<String, String>> commonHeader() {
        return RequestConfigKt.getNFCCommonHeader();
    }

    @Override // com.huami.nfc.web.IWebConfig
    @NotNull
    public List<Interceptor> okHttpInterceptors() {
        return new ArrayList();
    }

    @Override // com.huami.nfc.web.IWebConfig
    @NotNull
    public List<Interceptor> okHttpNetworkInterceptors() {
        return RequestConfigKt.getGlobalOkHttpNetworkInterceptors(AIApiConstants.NFC.NAME);
    }
}
