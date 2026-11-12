package com.amazon.alexa.avs.config;

import android.text.TextUtils;
import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceConfig {
    public static final String AVS_HOST = "avsHost";
    public static final String COMPANION_APP = "companionApp";
    public static final String COMPANION_SERVICE = "companionService";
    public static final String DEFAULT_HOST = "https://avs-alexa-na.amazon.com";
    public static final String DSN = "dsn";
    public static final String FILE_NAME = "config.json";
    public static final String HEADLESS = "headless";
    public static final String LOCALE = "locale";
    public static final String PRODUCT_ID = "productId";
    public static final String PROVISIONING_METHOD = "provisioningMethod";
    private static final List<Locale> SUPPORTED_LOCALES;
    public static final String WAKE_WORD_AGENT_ENABLED = "wakeWordAgentEnabled";
    private static final Logger log;
    private URL avsHost;
    private CompanionAppInformation companionAppInfo;
    private CompanionServiceInformation companionServiceInfo;
    private final String dsn;
    private boolean headlessModeEnabled;
    private Locale locale;
    private final String productId;
    private boolean wakeWordAgentEnabled;

    public static class CompanionAppInformation {
        public static final String CLIENT_ID = "clientId";
        public static final String LOCAL_PORT = "localPort";
        public static final String LWA_URL = "lwaUrl";
        public static final String REFRESH_TOKEN = "refreshToken";
        public static final String SSL_KEYSTORE = "sslKeyStore";
        public static final String SSL_KEYSTORE_PASSPHRASE = "sslKeyStorePassphrase";
        private String clientId;
        private final int localPort;
        private URL loginWithAmazonUrl;
        private final String lwaUrl;
        private String refreshToken;
        private final String sslKeyStore;
        private final String sslKeyStorePassphrase;

        public CompanionAppInformation(int i, String str, String str2, String str3) {
            this.localPort = i;
            this.sslKeyStore = str2;
            this.sslKeyStorePassphrase = str3;
            this.lwaUrl = str;
        }

        public String getClientId() {
            return this.clientId;
        }

        public int getLocalPort() {
            return this.localPort;
        }

        public URL getLwaUrl() {
            if (this.loginWithAmazonUrl == null) {
                if (TextUtils.isEmpty(this.lwaUrl)) {
                    throw new MalformedConfigException("lwaUrl is blank in your config file.");
                }
                try {
                    this.loginWithAmazonUrl = new URL(this.lwaUrl);
                } catch (MalformedURLException e) {
                    throw new MalformedConfigException("lwaUrl is malformed in your config file.", e);
                }
            }
            return this.loginWithAmazonUrl;
        }

        public String getRefreshToken() {
            return this.refreshToken;
        }

        public String getSslKeyStore() {
            return this.sslKeyStore;
        }

        public String getSslKeyStorePassphrase() {
            return this.sslKeyStorePassphrase;
        }

        public boolean isValid() {
            int i = this.localPort;
            if (i < 1 || i > 65535) {
                throw new MalformedConfigException("localPort is invalid. Value port values are 1-65535.");
            }
            getLwaUrl();
            if (TextUtils.isEmpty(this.sslKeyStore)) {
                throw new MalformedConfigException("sslKeyStore is blank in your config file.");
            }
            if (new File(this.sslKeyStore).exists()) {
                return true;
            }
            throw new MalformedConfigException(this.sslKeyStore + " " + SSL_KEYSTORE + " does not exist.");
        }

        public void setClientId(String str) {
            this.clientId = str;
        }

        public void setRefreshToken(String str) {
            this.refreshToken = str;
        }
    }

    public static class CompanionServiceInformation {
        public static final String SERVICE_URL = "serviceUrl";
        public static final String SESSION_ID = "sessionId";
        public static final String SSL_CA_CERT = "sslCaCert";
        public static final String SSL_CLIENT_KEYSTORE = "sslClientKeyStore";
        public static final String SSL_CLIENT_KEYSTORE_PASSPHRASE = "sslClientKeyStorePassphrase";
        private URL serviceUrl;
        private final String serviceUrlString;
        private String sessionId;
        private final String sslCaCert;
        private final String sslClientKeyStore;
        private final String sslClientKeyStorePassphrase;

        public CompanionServiceInformation(String str, String str2, String str3, String str4) {
            this.serviceUrlString = str;
            this.sslClientKeyStore = str2;
            this.sslClientKeyStorePassphrase = str3;
            this.sslCaCert = str4;
        }

        public URL getServiceUrl() {
            if (this.serviceUrl == null) {
                if (TextUtils.isEmpty(this.serviceUrlString)) {
                    throw new MalformedConfigException("serviceUrl is blank in your config file.");
                }
                try {
                    this.serviceUrl = new URL(this.serviceUrlString);
                } catch (MalformedURLException e) {
                    throw new MalformedConfigException("serviceUrl is malformed in your config file.", e);
                }
            }
            return this.serviceUrl;
        }

        public String getSessionId() {
            return this.sessionId;
        }

        public String getSslCaCert() {
            return this.sslCaCert;
        }

        public String getSslClientKeyStore() {
            return this.sslClientKeyStore;
        }

        public String getSslClientKeyStorePassphrase() {
            return this.sslClientKeyStorePassphrase;
        }

        public void setSessionId(String str) {
            this.sessionId = str;
        }
    }

    public static class MalformedConfigException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public MalformedConfigException(String str, Throwable th) {
            super(str, th);
        }

        public MalformedConfigException(String str) {
            super(str);
        }
    }

    public enum ProvisioningMethod {
        COMPANION_APP(DeviceConfig.COMPANION_APP),
        COMPANION_SERVICE(DeviceConfig.COMPANION_SERVICE);

        private String name;

        ProvisioningMethod(String str) {
            this.name = str;
        }

        public static ProvisioningMethod fromString(String str) {
            ProvisioningMethod provisioningMethod = COMPANION_APP;
            if (provisioningMethod.toString().equals(str)) {
                return provisioningMethod;
            }
            ProvisioningMethod provisioningMethod2 = COMPANION_SERVICE;
            if (provisioningMethod2.toString().equals(str)) {
                return provisioningMethod2;
            }
            throw new IllegalArgumentException("Invalid provisioning method");
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        SUPPORTED_LOCALES = arrayList;
        log = LoggerFactory.getLogger(DeviceConfig.class);
        arrayList.add(new Locale("en", "AU"));
        arrayList.add(Locale.CANADA);
        arrayList.add(new Locale("en", "IN"));
        arrayList.add(Locale.JAPAN);
        arrayList.add(Locale.GERMANY);
        arrayList.add(Locale.UK);
        arrayList.add(Locale.US);
    }

    public DeviceConfig(String str, String str2, String str3, boolean z, boolean z2, String str4, CompanionAppInformation companionAppInformation, CompanionServiceInformation companionServiceInformation, String str5) {
        if (TextUtils.isEmpty(str)) {
            throw new MalformedConfigException("productId is blank in your config file.");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new MalformedConfigException("dsn is blank in your config file.");
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str4);
        this.productId = str;
        this.dsn = str2;
        this.locale = localeForLanguageTag;
        this.companionServiceInfo = companionServiceInformation;
        this.companionAppInfo = companionAppInformation;
        try {
            this.avsHost = new URL(TextUtils.isEmpty(str5) ? DEFAULT_HOST : str5);
            this.wakeWordAgentEnabled = z;
            this.headlessModeEnabled = false;
        } catch (MalformedURLException e) {
            throw new MalformedConfigException("avsHost is malformed in your config file.", e);
        }
    }

    public URL getAvsHost() {
        return this.avsHost;
    }

    public CompanionAppInformation getCompanionAppInfo() {
        return this.companionAppInfo;
    }

    public CompanionServiceInformation getCompanionServiceInfo() {
        return this.companionServiceInfo;
    }

    public String getDsn() {
        return this.dsn;
    }

    public boolean getHeadlessModeEnabled() {
        return this.headlessModeEnabled;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getProductId() {
        return this.productId;
    }

    public boolean getWakeWordAgentEnabled() {
        return this.wakeWordAgentEnabled;
    }

    public void setAvsHost(URL url) {
        this.avsHost = url;
    }

    public void setCompanionAppInfo(CompanionAppInformation companionAppInformation) {
        this.companionAppInfo = companionAppInformation;
    }

    public void setCompanionServiceInfo(CompanionServiceInformation companionServiceInformation) {
        this.companionServiceInfo = companionServiceInformation;
    }

    public DeviceConfig(String str, String str2, String str3, boolean z, boolean z2, String str4, CompanionAppInformation companionAppInformation, CompanionServiceInformation companionServiceInformation) {
        this(str, str2, str3, z, z2, str4, companionAppInformation, companionServiceInformation, DEFAULT_HOST);
    }
}
