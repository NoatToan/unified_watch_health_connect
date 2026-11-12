package com.huawei.agconnect.core.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.agconnect.CustomAuthProvider;
import com.huawei.agconnect.CustomCredentialsProvider;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.impl.AGConnectOptionsImpl;
import com.huawei.agconnect.config.impl.Utils;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.OnTokenListener;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.hmf.tasks.Task;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AGConnectInstanceImpl extends AGConnectInstance {
    private static List<Service> d;
    private static final Map<String, AGConnectInstance> e = new HashMap();
    private static String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AGConnectOptions f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ServiceRepository f4960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ServiceRepository f4961c;

    @Override // com.huawei.agconnect.AGConnectInstance
    public <T> T getService(Class<? super T> cls) {
        T t = (T) this.f4961c.a(this, cls);
        return t != null ? t : (T) this.f4960b.a(this, cls);
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public AGConnectOptions getOptions() {
        return this.f4959a;
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public String getIdentifier() {
        return this.f4959a.getIdentifier();
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public Context getContext() {
        return this.f4959a.getContext();
    }

    public void a(final CustomCredentialsProvider customCredentialsProvider) {
        this.f4961c.a(Collections.singletonList(Service.builder((Class<?>) CredentialsProvider.class, new CredentialsProvider() { // from class: com.huawei.agconnect.core.impl.AGConnectInstanceImpl.3
            @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
            public Task<Token> getTokens(boolean z) {
                return customCredentialsProvider.getTokens(z);
            }

            @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
            public Task<Token> getTokens() {
                return customCredentialsProvider.getTokens(false);
            }
        }).build()), this.f4959a.getContext());
    }

    public void a(final CustomAuthProvider customAuthProvider) {
        this.f4961c.a(Collections.singletonList(Service.builder((Class<?>) AuthProvider.class, new AuthProvider() { // from class: com.huawei.agconnect.core.impl.AGConnectInstanceImpl.4
            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public void addTokenListener(OnTokenListener onTokenListener) {
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public void removeTokenListener(OnTokenListener onTokenListener) {
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public String getUid() {
                return "";
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public Task<Token> getTokens(boolean z) {
                return customAuthProvider.getTokens(z);
            }

            @Override // com.huawei.agconnect.core.service.auth.AuthProvider
            public Task<Token> getTokens() {
                return customAuthProvider.getTokens(false);
            }
        }).build()), this.f4959a.getContext());
    }

    public static void initialize(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
        synchronized (AGConnectInstanceImpl.class) {
            a(context, aGConnectOptionsBuilder);
            a(context, aGConnectOptionsBuilder.build(context));
        }
    }

    public static void initialize(Context context) {
        synchronized (AGConnectInstanceImpl.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (e.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                a(context, AGConnectServicesConfig.fromContext(context));
            }
        }
    }

    public static AGConnectInstance getInstance(String str) {
        AGConnectInstance aGConnectInstance;
        String str2;
        String str3;
        synchronized (AGConnectInstanceImpl.class) {
            aGConnectInstance = e.get(str);
            if (aGConnectInstance == null) {
                if (Utils.DEFAULT_NAME.equals(str)) {
                    str2 = "AGC_Instance";
                    str3 = "please call `initialize()` first";
                } else {
                    str2 = "AGC_Instance";
                    str3 = "not find instance for : " + str;
                }
                Log.w(str2, str3);
            }
        }
        return aGConnectInstance;
    }

    public static AGConnectInstance getInstance() {
        String str = f;
        return str == null ? getInstance(Utils.DEFAULT_NAME) : getInstance(str);
    }

    public static AGConnectInstance buildInstance(AGConnectOptions aGConnectOptions) {
        return a(aGConnectOptions, false);
    }

    private static void a(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
        AGConnectServicesConfig aGConnectServicesConfigFromContext = AGConnectServicesConfig.fromContext(context);
        if (aGConnectOptionsBuilder.getInputStream() != null) {
            try {
                String string = Utils.toString(aGConnectOptionsBuilder.getInputStream(), "UTF-8");
                aGConnectOptionsBuilder.getInputStream().reset();
                aGConnectServicesConfigFromContext.overlayWith(new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8"))));
            } catch (IOException unused) {
                Log.e("AGC_Instance", "input stream set to AGConnectServicesConfig fail");
            }
        }
        for (Map.Entry<String, String> entry : aGConnectOptionsBuilder.getCustomConfigMap().entrySet()) {
            aGConnectServicesConfigFromContext.setParam(entry.getKey(), entry.getValue());
        }
        if (aGConnectOptionsBuilder.getRoutePolicy() != AGCRoutePolicy.UNKNOWN) {
            aGConnectServicesConfigFromContext.setRoutePolicy(aGConnectOptionsBuilder.getRoutePolicy());
        }
    }

    private static void a(Context context, AGConnectOptions aGConnectOptions) {
        synchronized (AGConnectInstanceImpl.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                Log.w("AGC_Instance", "context.getApplicationContext null");
            } else {
                context = applicationContext;
            }
            a();
            if (d == null) {
                d = new ServiceRegistrarParser(context).c();
            }
            a(aGConnectOptions, true);
            f = aGConnectOptions.getIdentifier();
            Log.i("AGC_Instance", "initFinish callback start");
            AGCInitFinishManagerImpl.a();
            Log.i("AGC_Instance", "AGC SDK initialize end");
        }
    }

    private static void a() {
        JsonProcessingFactory.registerProcessor("/agcgw/url", new JsonProcessingFactory.JsonProcessor() { // from class: com.huawei.agconnect.core.impl.AGConnectInstanceImpl.1
            @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
            public String processOption(AGConnectOptions aGConnectOptions) {
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.CHINA)) {
                    return aGConnectOptions.getString("/agcgw_all/CN");
                }
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.RUSSIA)) {
                    return aGConnectOptions.getString("/agcgw_all/RU");
                }
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.GERMANY)) {
                    return aGConnectOptions.getString("/agcgw_all/DE");
                }
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.SINGAPORE)) {
                    return aGConnectOptions.getString("/agcgw_all/SG");
                }
                Log.e("AGC_Instance", "region is error, please check region");
                return null;
            }
        });
        JsonProcessingFactory.registerProcessor("/agcgw/backurl", new JsonProcessingFactory.JsonProcessor() { // from class: com.huawei.agconnect.core.impl.AGConnectInstanceImpl.2
            @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
            public String processOption(AGConnectOptions aGConnectOptions) {
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.CHINA)) {
                    return aGConnectOptions.getString("/agcgw_all/CN_back");
                }
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.RUSSIA)) {
                    return aGConnectOptions.getString("/agcgw_all/RU_back");
                }
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.GERMANY)) {
                    return aGConnectOptions.getString("/agcgw_all/DE_back");
                }
                if (aGConnectOptions.getRoutePolicy().equals(AGCRoutePolicy.SINGAPORE)) {
                    return aGConnectOptions.getString("/agcgw_all/SG_back");
                }
                Log.e("AGC_Instance", "region is error, please check region");
                return null;
            }
        });
    }

    private static AGConnectInstance a(AGConnectOptions aGConnectOptions, boolean z) {
        AGConnectInstance aGConnectInstanceImpl;
        synchronized (AGConnectInstanceImpl.class) {
            Map<String, AGConnectInstance> map = e;
            aGConnectInstanceImpl = map.get(aGConnectOptions.getIdentifier());
            if (aGConnectInstanceImpl == null || z) {
                aGConnectInstanceImpl = new AGConnectInstanceImpl(aGConnectOptions);
                map.put(aGConnectOptions.getIdentifier(), aGConnectInstanceImpl);
            }
        }
        return aGConnectInstanceImpl;
    }

    public AGConnectInstanceImpl(AGConnectOptions aGConnectOptions) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.f4959a = aGConnectOptions;
        if (d == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        this.f4960b = new ServiceRepository(d, aGConnectOptions.getContext());
        ServiceRepository serviceRepository = new ServiceRepository(null, aGConnectOptions.getContext());
        this.f4961c = serviceRepository;
        if (aGConnectOptions instanceof AGConnectOptionsImpl) {
            serviceRepository.a(((AGConnectOptionsImpl) aGConnectOptions).b(), aGConnectOptions.getContext());
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }
}
