package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.LazyInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AGConnectServicesConfigImpl extends AGConnectServicesConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LazyInputStream f4931c;
    private volatile ConfigReader d;
    private final Object e = new Object();
    private AGCRoutePolicy f = AGCRoutePolicy.UNKNOWN;
    private final Map<String, String> g = new HashMap();
    private volatile DecryptExclamationMark h;

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy) {
        this.f = aGCRoutePolicy;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setParam(String str, String str2) {
        this.g.put(Utils.fixPath(str), str2);
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(InputStream inputStream) {
        overlayWith(a(this.f4929a, inputStream));
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(LazyInputStream lazyInputStream) {
        this.f4931c = lazyInputStream;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        String str3;
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.d == null) {
            a();
        }
        String strA = a(str);
        String strB = this.g.get(strA);
        if (strB != null) {
            str3 = "use customValue";
        } else {
            strB = b(strA);
            if (strB == null) {
                String string = this.d.getString(strA, str2);
                return DecryptExclamationMark.b(string) ? this.h.decrypt(string, str2) : string;
            }
            str3 = "use processValue";
        }
        Log.i("AGC_ConfigImpl", str3);
        return strB;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.f == null) {
            this.f = AGCRoutePolicy.UNKNOWN;
        }
        AGCRoutePolicy aGCRoutePolicy = this.f;
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy == aGCRoutePolicy2 && this.d == null) {
            a();
        }
        AGCRoutePolicy aGCRoutePolicy3 = this.f;
        return aGCRoutePolicy3 == null ? aGCRoutePolicy2 : aGCRoutePolicy3;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
        return this.f4930b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str, int i) {
        try {
            return Integer.parseInt(getString(str, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return Utils.DEFAULT_NAME;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
        return this.f4929a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str, boolean z) {
        return Boolean.parseBoolean(getString(str, String.valueOf(z)));
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    private void b() {
        if (this.f == AGCRoutePolicy.UNKNOWN) {
            if (this.d != null) {
                this.f = Utils.getRoutePolicyFromJson(this.d.getString("/region", null), this.d.getString("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    private String b(String str) {
        JsonProcessingFactory.JsonProcessor jsonProcessor;
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (processors.containsKey(str) && (jsonProcessor = processors.get(str)) != null) {
            return jsonProcessor.processOption(this);
        }
        return null;
    }

    private void a() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    LazyInputStream lazyInputStream = this.f4931c;
                    if (lazyInputStream != null) {
                        this.d = new InputStreamReader(lazyInputStream.loadInputStream(), "UTF-8");
                        this.f4931c.close();
                        this.f4931c = null;
                    } else {
                        this.d = new SecurityResourcesReader(this.f4929a, this.f4930b);
                    }
                    this.h = new DecryptExclamationMark(this.d);
                }
                b();
            }
        }
    }

    private static String a(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/" + str.substring(i);
    }

    private static LazyInputStream a(Context context, final InputStream inputStream) {
        return new LazyInputStream(context) { // from class: com.huawei.agconnect.config.impl.AGConnectServicesConfigImpl.1
            @Override // com.huawei.agconnect.config.LazyInputStream
            public InputStream get(Context context2) {
                return inputStream;
            }
        };
    }

    public AGConnectServicesConfigImpl(Context context, String str) {
        this.f4929a = context;
        this.f4930b = str;
    }
}
