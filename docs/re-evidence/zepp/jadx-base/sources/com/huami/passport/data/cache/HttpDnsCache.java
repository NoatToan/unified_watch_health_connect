package com.huami.passport.data.cache;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.Configs;
import com.huami.passport.Keeper;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.Domain;
import com.huami.passport.entity.HttpDNS;
import com.huami.passport.entity.LoginToken;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class HttpDnsCache {
    private static List<String> accountHostCache = new CopyOnWriteArrayList();
    private static List<String> idHostCache = new CopyOnWriteArrayList();
    private static volatile List<HttpDNS> lastAccountDns;
    private static volatile List<HttpDNS> lastIdDns;

    public static void clear() {
        accountHostCache.clear();
        idHostCache.clear();
        lastAccountDns = null;
        lastIdDns = null;
    }

    public static void deleteAccountHost(final String str) {
        if (accountHostCache == null || TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : accountHostCache) {
            if (str2.equals(str)) {
                accountHostCache.remove(str2);
                HMLog.error(new Function0() { // from class: ua4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HttpDnsCache.lambda$deleteAccountHost$0(str);
                    }
                });
            }
        }
    }

    public static void deleteIdHost(final String str) {
        if (idHostCache == null || TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : idHostCache) {
            if (str2.equals(str)) {
                idHostCache.remove(str2);
                HMLog.error(new Function0() { // from class: ta4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HttpDnsCache.lambda$deleteIdHost$3(str);
                    }
                });
            }
        }
    }

    public static String getAccountUrl(Context context, String str) {
        Domain domain;
        List<String> cnames;
        LoginToken tokenCache = Keeper.getTokenCache(context);
        String idDns = null;
        if (tokenCache != null) {
            List<HttpDNS> domains = tokenCache.getDomains();
            if (domains != null) {
                for (HttpDNS httpDNS : domains) {
                    if (TextUtils.equals(httpDNS.getHost(), Configs.getAccountDomain()) && domains != lastAccountDns) {
                        List<String> list = accountHostCache;
                        if (list != null && list.size() == 0 && (cnames = httpDNS.getCnames()) != null && cnames.size() > 0) {
                            accountHostCache.addAll(cnames);
                        }
                        lastAccountDns = domains;
                        break;
                    }
                }
            }
            domain = tokenCache.getDomain();
        } else {
            domain = null;
        }
        List<String> list2 = accountHostCache;
        if (list2 != null && list2.size() > 0) {
            idDns = String.format(Configs.HTTPS_PLACEHOLDER, accountHostCache.get(0));
        } else if (domain == null || TextUtils.isEmpty(domain.getIdDns())) {
            Domain domain2 = (Domain) Keeper.readEntity(context, Keeper.DOMAIN_KEY, Domain.class);
            if (domain2 != null && !TextUtils.isEmpty(domain2.getIdDns())) {
                idDns = domain2.getIdDns();
            }
        } else {
            idDns = domain.getIdDns();
        }
        if (TextUtils.isEmpty(idDns) || Configs.forceConfigHost) {
            idDns = Configs.isDebugMode ? Configs.ID_SERVER_INDEX_STAGING : Configs.ID_SERVER_INDEX_PRODUCT;
        }
        if (!TextUtils.isEmpty(idDns) && !idDns.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            idDns = idDns + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        }
        final String str2 = idDns + str;
        HMLog.debug(new Function0() { // from class: sa4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HttpDnsCache.lambda$getAccountUrl$1(str2);
            }
        });
        return str2;
    }

    public static String getAccountUrlIndex(final boolean z) {
        final String str;
        String str2 = Configs.isDebugMode ? Configs.ID_SERVER_INDEX_STAGING : Configs.ID_SERVER_INDEX_PRODUCT;
        if (z) {
            str = str2 + Configs.PATH.THIRD_PARTY_LOGIN_V2;
        } else {
            str = str2 + Configs.PATH.REGISTER;
        }
        HMLog.debug(new Function0() { // from class: va4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HttpDnsCache.lambda$getAccountUrlIndex$2(str, z);
            }
        });
        return str;
    }

    public static String getIdUrl(Context context) {
        List<HttpDNS> domains;
        List<String> cnames;
        LoginToken tokenCache = Keeper.getTokenCache(context);
        if (tokenCache != null && (domains = tokenCache.getDomains()) != null) {
            for (HttpDNS httpDNS : domains) {
                if (TextUtils.equals(httpDNS.getHost(), Configs.getUserDomainInfo()) && domains != lastIdDns) {
                    List<String> list = idHostCache;
                    if (list != null && list.size() == 0 && (cnames = httpDNS.getCnames()) != null && cnames.size() > 0) {
                        idHostCache.addAll(cnames);
                    }
                    lastIdDns = domains;
                    break;
                }
            }
        }
        List<String> list2 = idHostCache;
        return Configs.forceConfigHost ? Configs.getUserDomain() : (list2 == null || list2.size() <= 0) ? Configs.getUserDomain() : String.format(Configs.HTTPS_PLACEHOLDER, idHostCache.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$deleteAccountHost$0(String str) {
        return "deleteAccountHost:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$deleteIdHost$3(String str) {
        return "deleteIdHost:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAccountUrl$1(String str) {
        return "getAccountUrl:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAccountUrlIndex$2(String str, boolean z) {
        return "getAccountUrlIndex:" + str + " isLogin:" + z;
    }
}
