package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.core.Service;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AGConnectOptionsImpl implements AGConnectOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4928c;
    private final AGCRoutePolicy d;
    private final ConfigReader e;
    private final DecryptExclamationMark f;
    private final Map<String, String> g;
    private final List<Service> h;
    private final Map<String, String> i = new HashMap();

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        String str3;
        if (str == null) {
            Log.w("AGConnectOptionsImpl", "getString path is null");
            return str2;
        }
        String strFixPath = Utils.fixPath(str);
        String strA = this.g.get(strFixPath);
        if (strA != null) {
            str3 = "use customValue";
        } else {
            strA = a(strFixPath);
            if (strA == null) {
                String string = this.e.getString(strFixPath, str2);
                return DecryptExclamationMark.b(string) ? this.f.decrypt(string, str2) : string;
            }
            str3 = "use processValue";
        }
        Log.i("AGConnectOptionsImpl", str3);
        return strA;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        AGCRoutePolicy aGCRoutePolicy = this.d;
        return aGCRoutePolicy == null ? AGCRoutePolicy.UNKNOWN : aGCRoutePolicy;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
        return this.f4928c;
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
        return this.f4926a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
        return this.f4927b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str, boolean z) {
        return Boolean.parseBoolean(getString(str, String.valueOf(z)));
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public List<Service> b() {
        return this.h;
    }

    private String a(String str) {
        StringBuilder sb;
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (!processors.containsKey(str)) {
            sb = new StringBuilder("processors not containsKey: ");
        } else {
            if (this.i.containsKey(str)) {
                return this.i.get(str);
            }
            JsonProcessingFactory.JsonProcessor jsonProcessor = processors.get(str);
            if (jsonProcessor != null) {
                String strProcessOption = jsonProcessor.processOption(this);
                this.i.put(str, strProcessOption);
                return strProcessOption;
            }
            sb = new StringBuilder("processors is null: ");
        }
        sb.append(str);
        Log.w("AGConnectOptionsImpl", sb.toString());
        return null;
    }

    private String a() {
        return String.valueOf(("{packageName='" + this.f4928c + "', routePolicy=" + this.d + ", reader=" + this.e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.g).toString().hashCode() + '}').hashCode());
    }

    public AGConnectOptionsImpl(Context context, String str, AGCRoutePolicy aGCRoutePolicy, InputStream inputStream, Map<String, String> map, List<Service> list, String str2) {
        String str3;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f4927b = context;
        str = str == null ? context.getPackageName() : str;
        this.f4928c = str;
        if (inputStream != null) {
            this.e = new InputStreamReader(inputStream, str);
            Utils.closeQuietly(inputStream);
            str3 = "use InputStreamReader";
        } else {
            this.e = new SecurityResourcesReader(context, str);
            str3 = "use SecurityResourcesReader";
        }
        Log.i("AGConnectOptionsImpl", str3);
        this.f = new DecryptExclamationMark(this.e);
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy != aGCRoutePolicy2 && "1.0".equals(this.e.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        if (aGCRoutePolicy == null || aGCRoutePolicy == aGCRoutePolicy2) {
            aGCRoutePolicy = Utils.getRoutePolicyFromJson(this.e.getString("/region", null), this.e.getString("/agcgw/url", null));
            Log.i("AGConnectOptionsImpl", "getRoutePolicyFromJson");
        }
        this.d = aGCRoutePolicy;
        this.g = Utils.fixKeyPathMap(map);
        this.h = list;
        this.f4926a = str2 == null ? a() : str2;
    }
}
