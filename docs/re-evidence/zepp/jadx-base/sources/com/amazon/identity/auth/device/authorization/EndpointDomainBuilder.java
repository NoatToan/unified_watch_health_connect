package com.amazon.identity.auth.device.authorization;

import android.content.Context;
import com.amazon.identity.auth.device.StoredPreferences;
import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.utils.DefaultLibraryInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class EndpointDomainBuilder {
    private static final String HTTPS = "https://";
    private static final boolean REGULAR = false;
    private static final boolean SANDBOX = true;
    private static Map<String, String> allDomainsMap = new HashMap();
    private static Map<String, Region> domainToRegionMap = new HashMap();
    private boolean isSandbox = false;
    private String pandaEndpointFromAPIKey;
    private Region region;
    private Service service;
    private Stage stage;

    static {
        Service service = Service.AUTHORIZATION;
        Stage stage = Stage.PROD;
        Region region = Region.NA;
        addEndpoint(service, stage, false, region, "https://na.account.amazon.com");
        Region region2 = Region.EU;
        addEndpoint(service, stage, false, region2, "https://eu.account.amazon.com");
        Region region3 = Region.FE;
        addEndpoint(service, stage, false, region3, "https://apac.account.amazon.com");
        Service service2 = Service.PANDA;
        addEndpoint(service2, stage, true, region, "https://api.sandbox.amazon.com");
        addEndpoint(service2, stage, true, region2, "https://api.sandbox.amazon.co.uk");
        addEndpoint(service2, stage, true, region3, "https://api-sandbox.amazon.co.jp");
        addEndpoint(service2, stage, false, region, "https://api.amazon.com");
        addEndpoint(service2, stage, false, region2, "https://api.amazon.co.uk");
        addEndpoint(service2, stage, false, region3, "https://api.amazon.co.jp");
    }

    public EndpointDomainBuilder(Context context, AppInfo appInfo) {
        this.stage = Stage.PROD;
        this.region = Region.NA;
        this.region = StoredPreferences.getRegion(context);
        this.stage = DefaultLibraryInfo.getOverrideLibraryStage();
        if (appInfo != null) {
            this.pandaEndpointFromAPIKey = appInfo.getExchangeHost();
        }
    }

    private static void addEndpoint(Service service, Stage stage, boolean z, Region region, String str) {
        allDomainsMap.put(getKey(service, stage, z, region), str);
        if (Region.AUTO == region || Service.PANDA != service) {
            return;
        }
        domainToRegionMap.put(str, region);
    }

    private String getDomainFor(String str) throws MalformedURLException {
        return HTTPS + new URL(str).getHost();
    }

    private static String getKey(Service service, Stage stage, boolean z, Region region) {
        return String.format("%s.%s.%s.%s", service.toString(), stage.toString(), Boolean.valueOf(z), region.toString());
    }

    public EndpointDomainBuilder forRegion(Region region) {
        this.region = region;
        return this;
    }

    public EndpointDomainBuilder forSandbox(boolean z) {
        this.isSandbox = z;
        return this;
    }

    public EndpointDomainBuilder forService(Service service) {
        this.service = service;
        return this;
    }

    public EndpointDomainBuilder forStage(Stage stage) {
        this.stage = stage;
        return this;
    }

    public String getDomain() throws MalformedURLException {
        if (Region.AUTO == this.region) {
            this.region = getRegionForAPIKey();
        }
        return allDomainsMap.get(getKey(this.service, this.stage, this.isSandbox, this.region));
    }

    public Region getRegionForAPIKey() {
        Region region = Region.NA;
        try {
            String str = this.pandaEndpointFromAPIKey;
            return str != null ? domainToRegionMap.get(getDomainFor(str)) : region;
        } catch (MalformedURLException unused) {
            return region;
        }
    }
}
