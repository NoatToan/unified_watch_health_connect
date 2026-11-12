package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class DNSCacheConfig {
    private static final String CIPHER_ALGORITHM_ECB = "AES/ECB/PKCS5Padding";
    private static final String KEY_ALGORITHM = "AES";
    public static ArrayList<String> domainSupportList = new ArrayList<>();
    public boolean initCfgRtr = true;

    public static String decrypt(Context context, String str) throws Exception {
        try {
            return new String(getDecryptCipher("8c551bee2bfc37b3".getBytes()).doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            throw e;
        }
    }

    private static Cipher getDecryptCipher(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM_ECB);
            cipher.init(2, secretKeySpec);
            return cipher;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void i(String str, String str2) {
        int length = 2001 - str.length();
        while (str2.length() > length) {
            Log.i(str, str2.substring(0, length));
            str2 = str2.substring(length);
        }
        Log.i(str, str2);
    }

    private boolean isNum(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullConfigFromServer(Context context, String str, String str2) {
        String str3 = System.currentTimeMillis() + "";
        for (String str4 : DNSCache.getInstance().getInitConfigUrl(str, str3)) {
            DNSCache.getInstance().setDnsCacheDomain(Uri.parse(str4).getHost());
            try {
                Response response = OkHttpRequest.getInstanse().getResponse(str4, null);
                if (response != null && response.isSuccessful()) {
                    if (response.body() == null) {
                        return;
                    }
                    String strString = response.body().string();
                    if (TextUtils.isEmpty(strString)) {
                        continue;
                    } else {
                        JSONObject jSONObject = new JSONObject(strString);
                        String strOptString = jSONObject.optString("rtn_code");
                        String strOptString2 = jSONObject.optString("timestamp");
                        String strOptString3 = jSONObject.optString("rtn_data");
                        if (!str3.equals(strOptString2)) {
                            continue;
                        } else if ("304".equals(strOptString)) {
                            saveLocalConfigAndSync(context, str2, str4);
                            return;
                        } else if ("200".equals(strOptString)) {
                            String strDecrypt = decrypt(context, strOptString3);
                            if (!TextUtils.isEmpty(strDecrypt)) {
                                saveLocalConfigAndSync(context, strDecrypt, str4);
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } catch (Exception e) {
                Log.i("DNSCacheConfig", "init error " + e);
            }
        }
    }

    private synchronized void syncConfig(ConfigDetail configDetail) {
        if (configDetail != null) {
            if (isNum(configDetail.LOG_COMPRESS_TIMER)) {
                DnsConfig.log_compress_timer = Integer.valueOf(configDetail.LOG_COMPRESS_TIMER).intValue();
            }
            if (isNum(configDetail.SCHEDULE_TIMER_INTERVAL)) {
                DnsConfig.timer_interval = Integer.valueOf(configDetail.SCHEDULE_TIMER_INTERVAL).intValue();
            }
            if (isNum(configDetail.RETRY_IP_NUMBER)) {
                DnsConfig.ip_retry_num = Integer.valueOf(configDetail.RETRY_IP_NUMBER).intValue();
            }
            if (isNum(configDetail.DOMAIN_MAX_IP_NUMBER)) {
                DnsConfig.domain_max_ip_number = Integer.valueOf(configDetail.DOMAIN_MAX_IP_NUMBER).intValue();
            }
            if (isNum(configDetail.RETRY_COUNT_PER_REQUEST)) {
                DnsConfig.retry_count_per_request = Integer.valueOf(configDetail.RETRY_COUNT_PER_REQUEST).intValue();
            }
            if (isNum(configDetail.LOSE_CON_INIT_DUR) && Integer.valueOf(configDetail.LOSE_CON_INIT_DUR).intValue() > 60000) {
                DnsConfig.lose_con_init_dur = Integer.valueOf(configDetail.LOSE_CON_INIT_DUR).intValue();
            }
            DNSCache.getInstance().setInitParamsSwitch(configDetail.HTTPDNS_SWITCH.equals("1"));
            DnsConfig.ERROR_LOG_SWITCH = "1".equals(configDetail.ERROR_LOG_SWITCH);
            DnsConfig.enableSpeedTest = "1".equals(configDetail.SPEED_TEST_SWITCH);
            DnsConfig.enableSinaHttpDns = configDetail.IS_MY_HTTP_SERVER.equals("1");
            DnsConfig.enableDnsPod = configDetail.IS_DNSPOD_SERVER.equals("1");
            DnsConfig.enableUdpDns = configDetail.IS_UDPDNS_SERVER.equals("1");
            DnsConfig.DNSPOD_SERVER_API = configDetail.DNSPOD_SERVER_API;
            DnsConfig.UDPDNS_SERVER_API = configDetail.UDPDNS_SERVER_API;
            domainSupportList.clear();
            DnsConfig.SINA_HTTPDNS_SERVER_API.clear();
            DNSCache.getInstance().initIDCGroup(configDetail.DOMAIN_DETAILS);
            domainSupportList.addAll(configDetail.DOMAIN_SUPPORT_LIST);
            DnsConfig.SINA_HTTPDNS_SERVER_API.addAll(configDetail.HTTPDNS_SERVER_API);
        }
    }

    public void initCfg(Context context) {
        SharedPreferences sharedPreferences;
        ConfigDetail configDetail;
        if (context == null || (sharedPreferences = DNSCache.getInstance().getSharedPreferences()) == null) {
            return;
        }
        Process.setThreadPriority(10);
        try {
            String string = sharedPreferences.getString(PreferenceConstantsInDNSCache.DNSCache_KEY_INIT_CONFIG_SP_KEY, "");
            if (TextUtils.isEmpty(string) || (configDetail = (ConfigDetail) new Gson().fromJson(string, ConfigDetail.class)) == null || TextUtils.isEmpty(configDetail.VERSION)) {
                pullConfigFromServer(context, "default", "");
            } else {
                pullConfigFromServer(context, configDetail.VERSION, string);
            }
        } catch (Exception unused) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(PreferenceConstantsInDNSCache.DNSCache_KEY_INIT_CONFIG_SP_KEY, "");
            if (editorEdit.commit() && this.initCfgRtr) {
                this.initCfgRtr = false;
                initCfg(context);
            }
        }
    }

    public void saveLocalConfigAndSync(Context context, String str, String str2) {
        syncConfig((ConfigDetail) new Gson().fromJson(str, ConfigDetail.class));
        SharedPreferences.Editor editorEdit = (DNSCache.getInstance().isMainProcess ? context.getSharedPreferences(PreferenceConstantsInDNSCache.DNSCache_FILENAME_INIT_CONFIG_SP, 0) : context.getSharedPreferences(PreferenceConstantsInDNSCache.DNSCache_FILENAME_INIT_CONFIG_SP_2, 0)).edit();
        editorEdit.putString(PreferenceConstantsInDNSCache.DNSCache_KEY_INIT_CONFIG_SP_KEY, str);
        editorEdit.apply();
    }

    public boolean setNoIdcStringTime(long j) {
        if (j <= DnsConfig.lose_con_init_dur || DNSCache.getInstance().sContext == null) {
            return false;
        }
        new Thread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.DNSCacheConfig.1
            @Override // java.lang.Runnable
            public void run() {
                ConfigDetail configDetail;
                SharedPreferences sharedPreferences = DNSCache.getInstance().getSharedPreferences();
                if (sharedPreferences == null) {
                    return;
                }
                try {
                    String string = sharedPreferences.getString(PreferenceConstantsInDNSCache.DNSCache_KEY_INIT_CONFIG_SP_KEY, "");
                    if (TextUtils.isEmpty(string) || (configDetail = (ConfigDetail) new Gson().fromJson(string, ConfigDetail.class)) == null || TextUtils.isEmpty(configDetail.VERSION)) {
                        DNSCacheConfig.this.pullConfigFromServer(DNSCache.getInstance().sContext, "default", "");
                    } else {
                        DNSCacheConfig.this.pullConfigFromServer(DNSCache.getInstance().sContext, configDetail.VERSION, string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        return true;
    }
}
