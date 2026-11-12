package com.huami.nfc.web;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.web.interceptor.BaseUrlInterceptor;
import com.huami.nfc.web.interceptor.HeaderInterceptor;
import com.huami.watch.transdata.transport.Actions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u000f\u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u0013\u0010%¨\u0006)"}, d2 = {"Lcom/huami/nfc/web/WebApiConfig;", "Lcom/huami/nfc/web/IWebApiConfig;", "Lorg/koin/core/component/KoinComponent;", "", "Lokhttp3/Interceptor;", "okHttpInterceptors", "okHttpNetworkInterceptors", "Lkotlin/Function0;", "", "baseHost", "", Actions.KEY_HEADERS, "Lretrofit2/Converter$Factory;", "retrofitConverterFactory", "Lcom/huami/nfc/web/IWebConfig;", "a", "Lcom/huami/nfc/web/IWebConfig;", "config", "Lcom/huami/nfc/web/NfcDevice;", "b", "Lcom/huami/nfc/web/NfcDevice;", "device", "Lcom/huami/nfc/web/UserInfo;", "c", "Lcom/huami/nfc/web/UserInfo;", "user", "Lcom/huami/nfc/web/interceptor/BaseUrlInterceptor;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/nfc/web/interceptor/BaseUrlInterceptor;", "urlInterceptor", "Lcom/huami/nfc/web/interceptor/HeaderInterceptor;", "e", "()Lcom/huami/nfc/web/interceptor/HeaderInterceptor;", "headerInterceptor", "Lcom/huami/nfc/applet/api/SeInfoApi;", "f", "()Lcom/huami/nfc/applet/api/SeInfoApi;", "seInfo", "<init>", "(Lcom/huami/nfc/web/IWebConfig;Lcom/huami/nfc/web/NfcDevice;Lcom/huami/nfc/web/UserInfo;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class WebApiConfig implements IWebApiConfig, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IWebConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final UserInfo user;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy urlInterceptor = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy headerInterceptor = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy seInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/web/interceptor/HeaderInterceptor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HeaderInterceptor> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeaderInterceptor invoke() {
            return new HeaderInterceptor(WebApiConfig.this.headers());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Map<String, String>> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Object> {
            public final /* synthetic */ PayResponse<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PayResponse<String> payResponse) {
                super(0);
                this.a = payResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return Intrinsics.stringPlus("网络请求Header信息不完整：", this.a.getMessage());
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, String> invoke() {
            Map<String, String> mapInvoke = WebApiConfig.this.config.commonHeader().invoke();
            WebApiConfig webApiConfig = WebApiConfig.this;
            Map<String, String> map = mapInvoke;
            String miId = webApiConfig.user.getMiId();
            if (!(miId == null || miId.length() == 0)) {
                map.put(PayHeaderKt.HEADER_XIAO_MI_USER_ID, miId);
            }
            String miToken = webApiConfig.user.getMiToken();
            if (!(miToken == null || miToken.length() == 0)) {
                map.put(PayHeaderKt.HEADER_XIAO_MI_TOKEN, miToken);
            }
            PayResponse<String> cplc = webApiConfig.b().getCplc(webApiConfig.device.getSn());
            if (cplc.isSuccessful()) {
                map.putAll(PayHeaderKt.toMap(new PayHeader(cplc.getData(), webApiConfig.device.getDeviceModel().getModel(), webApiConfig.device.getSn(), "ANDROID", null, 16, null)));
            } else {
                LogcatKt.error$default(Logcat.INSTANCE, null, new a(cplc), 1, null);
            }
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/web/interceptor/BaseUrlInterceptor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BaseUrlInterceptor> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseUrlInterceptor invoke() {
            return new BaseUrlInterceptor(WebApiConfig.this.baseHost());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebApiConfig(@NotNull IWebConfig iWebConfig, @NotNull NfcDevice nfcDevice, @NotNull UserInfo userInfo) {
        this.config = iWebConfig;
        this.device = nfcDevice;
        this.user = userInfo;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.seInfo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SeInfoApi>() { // from class: com.huami.nfc.web.WebApiConfig$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.applet.api.SeInfoApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SeInfoApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SeInfoApi.class), qualifier, objArr);
            }
        });
    }

    private final HeaderInterceptor a() {
        return (HeaderInterceptor) this.headerInterceptor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SeInfoApi b() {
        return (SeInfoApi) this.seInfo.getValue();
    }

    private final BaseUrlInterceptor c() {
        return (BaseUrlInterceptor) this.urlInterceptor.getValue();
    }

    @Override // com.huami.nfc.web.IWebApiConfig
    @NotNull
    public Function0<String> baseHost() {
        return this.config.baseHost();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.nfc.web.IWebApiConfig
    @NotNull
    public Function0<Map<String, String>> headers() {
        return new b();
    }

    @Override // com.huami.nfc.web.IWebApiConfig
    @NotNull
    public List<Interceptor> okHttpInterceptors() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c());
        arrayList.add(a());
        arrayList.addAll(this.config.okHttpInterceptors());
        return arrayList;
    }

    @Override // com.huami.nfc.web.IWebApiConfig
    @NotNull
    public List<Interceptor> okHttpNetworkInterceptors() {
        return this.config.okHttpNetworkInterceptors();
    }

    @Override // com.huami.nfc.web.IWebApiConfig
    @NotNull
    public List<Converter.Factory> retrofitConverterFactory() {
        return CollectionsKt__CollectionsKt.mutableListOf(GsonConverterFactory.create(PayResponseKt.getGson()));
    }
}
