package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public class DNSCache {
    private final int ENVIRONMENT_ON_LINE;
    private final int ENVIRONMENT_TEST;
    private final int ENVIRONMENT_UAT;
    private String device;
    private DNSCacheConfig dnsCacheConfig;
    private String dns_cache_domain_1;
    private String dns_cache_domain_2;
    private String dns_cache_ip_1;
    private String dns_cache_ip_2;
    private String dns_cache_url;
    public int environmentId;
    private volatile boolean hasInit;
    private IDCGroupManager idcGroupManager;
    private volatile boolean inInit;
    private boolean initParamsSwitch;
    public boolean isMainProcess;
    private String mAppId;
    private String mAppName;
    private ThreadPoolExecutor poolExecutor;
    public Context sContext;
    private SharedPreferences sharedPreferences;

    public static class SingletonHolder {
        private static final DNSCache INSTANCE = new DNSCache();

        private SingletonHolder() {
        }
    }

    public static DNSCache getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private synchronized void initDnsCacheData() {
        if (!this.hasInit && !this.inInit) {
            this.inInit = true;
            new Thread("dnscache init") { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.DNSCache.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    DNSCache.this.initDomain();
                    DNSCache dNSCache = DNSCache.this;
                    if (dNSCache.isMainProcess) {
                        dNSCache.sharedPreferences = dNSCache.sContext.getSharedPreferences(PreferenceConstantsInDNSCache.DNSCache_FILENAME_INIT_CONFIG_SP, 0);
                    } else {
                        dNSCache.sharedPreferences = dNSCache.sContext.getSharedPreferences(PreferenceConstantsInDNSCache.DNSCache_FILENAME_INIT_CONFIG_SP_2, 0);
                    }
                    DNSCache.this.poolExecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(10), new ThreadPoolExecutor.DiscardPolicy());
                    DNSCache.this.dnsCacheConfig = new DNSCacheConfig();
                    DNSCache.this.dnsCacheConfig.initCfg(DNSCache.this.sContext);
                    DNSCache.this.hasInit = true;
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initDomain() {
        if (new Random().nextBoolean()) {
            this.dns_cache_domain_1 = "gslbali.ximalaya.com";
            this.dns_cache_domain_2 = "gslbtx.ximalaya.com";
        } else {
            this.dns_cache_domain_1 = "gslbtx.ximalaya.com";
            this.dns_cache_domain_2 = "gslbali.ximalaya.com";
        }
        if (new Random().nextBoolean()) {
            this.dns_cache_ip_1 = "114.55.194.203";
            this.dns_cache_ip_2 = "118.25.119.177";
        } else {
            this.dns_cache_ip_1 = "118.25.119.177";
            this.dns_cache_ip_2 = "114.55.194.203";
        }
        this.dns_cache_url = this.dns_cache_domain_1;
    }

    public boolean canUseDns() {
        return this.initParamsSwitch;
    }

    @Nullable
    public DomainDetail getDomainDetail(String str) {
        return this.idcGroupManager.getDomainDetail(str);
    }

    public List<String> getInitConfigUrl(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = this.environmentId;
        if (1 != i) {
            if (4 == i) {
                StringBuilder sb = new StringBuilder();
                sb.append("http://linkeye.test.ximalaya.com/httpdns/v3/init/");
                sb.append(str2);
                sb.append("?app=");
                sb.append(this.mAppName);
                sb.append("&appId=");
                sb.append(this.mAppId);
                sb.append("&device=");
                String str3 = this.device;
                sb.append(str3 != null ? str3 : "android");
                sb.append("&version=");
                sb.append(str);
                sb.append("e");
                arrayList.add(sb.toString());
                return arrayList;
            }
            if (6 == i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http://linkeye.uat.ximalaya.com/httpdns/v3/init/");
                sb2.append(str2);
                sb2.append("?app=");
                sb2.append(this.mAppName);
                sb2.append("&appId=");
                sb2.append(this.mAppId);
                sb2.append("&device=");
                String str4 = this.device;
                sb2.append(str4 != null ? str4 : "android");
                sb2.append("&version=");
                sb2.append(str);
                sb2.append("e");
                arrayList.add(sb2.toString());
                return arrayList;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("http://gslbtx.ximalaya.com/linkeye-cloud/httpdns/v3/init/");
            sb3.append(str2);
            sb3.append("?app=");
            sb3.append(this.mAppName);
            sb3.append("&appId=");
            sb3.append(this.mAppId);
            sb3.append("&device=");
            String str5 = this.device;
            if (str5 == null) {
                str5 = "android";
            }
            sb3.append(str5);
            sb3.append("&version=");
            sb3.append(str);
            sb3.append("e");
            arrayList.add(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("http://gslbali.ximalaya.com/linkeye-cloud/httpdns/v3/init/");
            sb4.append(str2);
            sb4.append("?app=");
            sb4.append(this.mAppName);
            sb4.append("&appId=");
            sb4.append(this.mAppId);
            sb4.append("&device=");
            String str6 = this.device;
            sb4.append(str6 != null ? str6 : "android");
            sb4.append("&version=");
            sb4.append(str);
            sb4.append("e");
            arrayList.add(sb4.toString());
            return arrayList;
        }
        if (new Random().nextBoolean()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("http://");
            sb5.append(this.dns_cache_domain_1);
            sb5.append("/linkeye-cloud/httpdns/v3/init/");
            sb5.append(str2);
            sb5.append("?app=");
            sb5.append(this.mAppName);
            sb5.append("&appId=");
            sb5.append(this.mAppId);
            sb5.append("&device=");
            String str7 = this.device;
            if (str7 == null) {
                str7 = "android";
            }
            sb5.append(str7);
            sb5.append("&version=");
            sb5.append(str);
            sb5.append("e");
            arrayList.add(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("http://");
            sb6.append(this.dns_cache_domain_2);
            sb6.append("/linkeye-cloud/httpdns/v3/init/");
            sb6.append(str2);
            sb6.append("?app=");
            sb6.append(this.mAppName);
            sb6.append("&appId=");
            sb6.append(this.mAppId);
            sb6.append("&device=");
            String str8 = this.device;
            if (str8 == null) {
                str8 = "android";
            }
            sb6.append(str8);
            sb6.append("&version=");
            sb6.append(str);
            sb6.append("e");
            arrayList.add(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("http://");
            sb7.append(this.dns_cache_ip_1);
            sb7.append("/linkeye-cloud/httpdns/v3/init/");
            sb7.append(str2);
            sb7.append("?app=");
            sb7.append(this.mAppName);
            sb7.append("&appId=");
            sb7.append(this.mAppId);
            sb7.append("&device=");
            String str9 = this.device;
            if (str9 == null) {
                str9 = "android";
            }
            sb7.append(str9);
            sb7.append("&version=");
            sb7.append(str);
            sb7.append("e");
            arrayList.add(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("http://");
            sb8.append(this.dns_cache_ip_2);
            sb8.append("/linkeye-cloud/httpdns/v3/init/");
            sb8.append(str2);
            sb8.append("?app=");
            sb8.append(this.mAppName);
            sb8.append("&appId=");
            sb8.append(this.mAppId);
            sb8.append("&device=");
            String str10 = this.device;
            sb8.append(str10 != null ? str10 : "android");
            sb8.append("&version=");
            sb8.append(str);
            sb8.append("e");
            arrayList.add(sb8.toString());
        } else {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("http://");
            sb9.append(this.dns_cache_domain_1);
            sb9.append("/linkeye-cloud/httpdns/v3/init/");
            sb9.append(str2);
            sb9.append("?app=");
            sb9.append(this.mAppName);
            sb9.append("&appId=");
            sb9.append(this.mAppId);
            sb9.append("&device=");
            String str11 = this.device;
            if (str11 == null) {
                str11 = "android";
            }
            sb9.append(str11);
            sb9.append("&version=");
            sb9.append(str);
            sb9.append("e");
            arrayList.add(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("http://");
            sb10.append(this.dns_cache_domain_2);
            sb10.append("/linkeye-cloud/httpdns/v3/init/");
            sb10.append(str2);
            sb10.append("?app=");
            sb10.append(this.mAppName);
            sb10.append("&appId=");
            sb10.append(this.mAppId);
            sb10.append("&device=");
            String str12 = this.device;
            if (str12 == null) {
                str12 = "android";
            }
            sb10.append(str12);
            sb10.append("&version=");
            sb10.append(str);
            sb10.append("e");
            arrayList.add(sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append("http://");
            sb11.append(this.dns_cache_ip_1);
            sb11.append("/linkeye-cloud/httpdns/v3/init/");
            sb11.append(str2);
            sb11.append("?app=");
            sb11.append(this.mAppName);
            sb11.append("&appId=");
            sb11.append(this.mAppId);
            sb11.append("&device=");
            String str13 = this.device;
            if (str13 == null) {
                str13 = "android";
            }
            sb11.append(str13);
            sb11.append("&version=");
            sb11.append(str);
            sb11.append("e");
            arrayList.add(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append("http://");
            sb12.append(this.dns_cache_ip_2);
            sb12.append("/linkeye-cloud/httpdns/v3/init/");
            sb12.append(str2);
            sb12.append("?app=");
            sb12.append(this.mAppName);
            sb12.append("&appId=");
            sb12.append(this.mAppId);
            sb12.append("&device=");
            String str14 = this.device;
            sb12.append(str14 != null ? str14 : "android");
            sb12.append("&version=");
            sb12.append(str);
            sb12.append("e");
            arrayList.add(sb12.toString());
        }
        return arrayList;
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public boolean ifReachNoIdcStringIntervalTime(long j) {
        return false;
    }

    public void init(Context context, String str, String str2, String str3) {
        if (context == null) {
            throw new RuntimeException("dnscache init params context can not be null!!!");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("dnscache init params app name can not be null");
        }
        this.mAppName = str;
        if (TextUtils.isEmpty(str2)) {
            throw new RuntimeException("dnscache init params app id can not be null");
        }
        this.mAppId = str2;
        if (!ProcessUtil.isMainProcess(context)) {
            this.isMainProcess = false;
        }
        this.sContext = context.getApplicationContext();
        initDnsCacheData();
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.device = str3;
    }

    public void initIDCGroup(Map<String, DomainDetail> map) {
        this.idcGroupManager.initIDCGroup(map);
    }

    public List<IdcGroup> processIdc(String str, ArrayList<IdcGroup> arrayList) {
        return this.idcGroupManager.processIdc(str, arrayList);
    }

    public void setDnsCacheDomain(String str) {
        this.dns_cache_url = str;
    }

    public void setIdcString(String str) {
        this.idcGroupManager.adjustIdc(str);
    }

    public void setInitParamsSwitch(boolean z) {
        this.initParamsSwitch = z;
    }

    private DNSCache() {
        this.ENVIRONMENT_ON_LINE = 1;
        this.ENVIRONMENT_TEST = 4;
        this.ENVIRONMENT_UAT = 6;
        this.environmentId = 1;
        this.hasInit = false;
        this.inInit = false;
        this.idcGroupManager = new IDCGroupManager();
        this.dns_cache_domain_1 = "gslbali.ximalaya.com";
        this.dns_cache_domain_2 = "gslbtx.ximalaya.com";
        this.dns_cache_ip_1 = "114.55.194.203";
        this.dns_cache_ip_2 = "118.25.119.177";
        this.dns_cache_url = "gslbali.ximalaya.com";
        this.initParamsSwitch = false;
    }
}
