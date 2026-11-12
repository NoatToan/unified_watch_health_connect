package com.huami.passport;

import android.net.Uri;
import android.text.TextUtils;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class Configs {
    public static String HTTPS_PLACEHOLDER = "https://%s/";
    public static String ID_SERVER_CN_PRODUCT = "https://account-cn.huami.com/";
    public static String ID_SERVER_CN_TEST = "https://account-cn-staging.huami.com/";
    public static String ID_SERVER_DN_PRODUCT = "account.huami.com";
    public static String ID_SERVER_DN_STAGING = "account-staging.huami.com";
    public static String ID_SERVER_INDEX_PRODUCT = "https://account.huami.com/";
    public static String ID_SERVER_INDEX_STAGING = "https://account-staging.huami.com/";
    public static String ID_SERVER_URL = "https://account-cn.huami.com/";
    public static String ID_SERVER_US_PRODUCT = "https://account-us.huami.com/";
    public static String ID_SERVER_US_TEST = "https://account-us-staging.huami.com/";
    public static String SDK_VERSION = "v0.6.51";
    public static String SEARCH_SERVER_PRODUCT = "https://account.huami.com/v1/client/search";
    public static String SEARCH_SERVER_TEST = "https://account-staging.huami.com/v1/client/search";
    public static String SEARCH_SERVER_URL = "https://account.huami.com/v1/client/search";
    public static String USER_SERVER_PRODUCT = "https://api-user.huami.com/";
    public static String USER_SERVER_STAGING = "https://api-user-staging.huami.com/";
    public static volatile boolean debugTimeConsuming = false;
    public static boolean emailFaceSubscribe = true;
    public static boolean facebookForcePointToUs = false;
    public static boolean forceConfigHost = false;
    public static boolean googleForcePointToUs = false;
    public static String httpDNSHost = null;
    public static boolean isDebugMode = false;
    public static boolean supportSubEnable = false;
    public static int timeoutMillis = 60000;

    public static class PATH {
        public static final String CHANGE_PASSWORD = "registrations/%s/password";
        public static final String CHANGE_URL = "registrations/%s/change";
        public static final String CHECK_BY_EMAIL_PHONE = "registrations/%s?country_code=%s";
        public static final String GET_APP_TOKEN = "v1/client/app_tokens";
        public static final String GET_OAUTHUSER_URL = "registration?r=REQUESTER&t=REQUEST";
        public static final String LOGIN = "registrations/%s/tokens";
        public static final String LOGIN_BY_REQUEST_TOKEN = "v1/client/login_by_request_token";
        public static final String REFRESH_ACCESS_URL = "access?r=REQUESTER&t=REQUEST";
        public static final String REGIST_BY_EMAIL_PHONE = "registrations/%s";
        public static final String RESEND_CONFIRMATION = "registrations/%s/confirmation?sub=%s&marketing=%s&region=%s";
        public static final String RESEND_CONFIRMATION_1 = "registrations/%s/confirmation?marketing=%s&region=%s";
        public static final String RESET_PASSWORD = "registrations/%s/password?";
        public static final String RESET_PASSWORD_1 = "registrations/%s/password?region=%s&marketing=%s";
        public static final String CAPTCHA_URL = "captcha/%s?t=" + System.currentTimeMillis();
        public static String VERIFY_APP_TOKEN = "v1/client/verify_app_token";
        public static String LOGOUT = "v1/client/logout";
        public static String RENEW_LOGIN_TOKEN = "v1/client/renew_login_token";
        public static String RELOGIN = "v1/client/re_login";
        public static String THIRD_PARTY_LOGIN = "v1/client/login";
        public static String BIND_ACCOUNT = "v1/client/bind_account";
        public static String UNBIND_ACCOUNT = "v1/client/unbind_account";
        public static String LIST_ACCOUNTS = "v1/client/list_accounts";
        public static String SMS_VERIFY = "registrations/%s/%s/verify";
        public static String THIRD_PARTY_LOGIN_V2 = "v2/client/login";
        public static String USER_PROFILE = "v1/client/users/%s/profile";
        public static String REGISTER = "v1/client/register";
        public static String CHECK_SMS_BINDING = "registrations/%s/sms/binding?country_code=%s";
        public static String CHECK_USER_TRANSFER_COUNTRY = "v1/client/willMigrate";
        public static String THIRD_PARTY_ACCESS_TOKEN = "v1/client/thirdparty/access_token";
        public static String THIRD_PARTY_REFRESH_TOKEN = "v1/client/thirdparty/refresh_token";
        public static String TOKEN_LOGIN = "v2/client/authorization/token";
    }

    public static class Params {
        public static final String ACCESS = "access";
        public static final String ACCESSTOKEN = "accessToken";
        public static final String ACCESSTOKEN_INFO = "accesstoken_info";
        public static final String ACCESS_TOKEN = "access_token";
        public static final String ALLOW_REGISTRATION = "allow_registration";
        public static final String API_DNS = "api-dns";
        public static final String APP_NAME = "app_name";
        public static final String APP_NAME_QUERY = "appName";
        public static final String APP_TOKEN = "app_token";
        public static final String APP_TTL = "app_ttl";
        public static final String APP_VERSION = "app_version";
        public static final String AUTHCODE = "authCode";
        public static final String AUTHORIZATION = "Authorization";
        public static final String AUTH_CODE = "auth_code";
        public static final String BOND_DATE = "bond_date";
        public static final String CAPTCHA = "captcha";
        public static final String CLIENT_ID = "client_id";
        public static final String CN = "cn";
        public static final String CNAMES = "cnames";
        public static final String CODE = "code";
        public static final String COUNTRYCODE = "countryCode";
        public static final String COUNTRY_CODE = "country_code";
        public static final String COUNTRY_STATE = "countryState";
        public static final String CURRENT_REGION = "current_region";
        public static final String DATA = "data";
        public static final String DEVICE_ID = "device_id";
        public static final String DEVICE_ID_TYPE = "device_id_type";
        public static final String DEVICE_MODEL = "device_model";
        public static final String DN = "dn";
        public static final String DOMAIN = "domain";
        public static final String DOMAINS = "domains";
        public static final String EMAIL = "email";
        public static final String ERROR = "error";
        public static final String ERROR_CODE = "error_code";
        public static final String EXPIRATION = "expiration";
        public static final String EXPIRES_IN = "expires_in";
        public static final String GRANT_TYPE = "grant_type";
        public static final String HM_THIRD_NAME = "hm_third_name";
        public static final String HOST = "host";
        public static final String HREF = "href";
        public static final String HUAMI = "huami";
        public static final String HUAMI_PHONE = "huami_phone";
        public static final String ICON = "icon";
        public static final String ID_DNS = "id-dns";
        public static final String IMEI = "imei";
        public static final String IPS = "ips";
        public static final String IS_NEW_USER = "is_new_user";
        public static final String LANG = "lang";
        public static final String LOADING_VISIBILITY = "loading_visibility";
        public static final String LOGIN_TOKEN = "login_token";
        public static final String MAC = "mac";
        public static final String MARKETING = "marketing";
        public static final String MESSAGE = "message";
        public static final String METHOD = "method";
        public static final String MUTIME = "mutime";
        public static final String MUTIME_LONG = "mutime_long";
        public static final String NAME = "name";
        public static final String NEW = "new";
        public static final String NEXT_ACTIONS = "nextActions";
        public static final String NICKNAME = "nickname";
        public static final String NICK_NAME = "nick_name";
        public static final String OAUTH_ID = "oauth_id";
        public static final String OBJECTS = "objects";
        public static final String OK = "ok";
        public static final String OLD = "old";
        public static final String OS_VERSION = "os_version";
        public static final String PAD = "pad";
        public static final String PASSWORD = "password";
        public static final String PHONE = "phone";
        public static final String PHONE_NUMBER = "phone_number";
        public static final String PROPERTIES = "properties";
        public static final String PROVIDER = "provider";
        public static final String PROVIDER_MI = "xiaomi";
        public static final String PROVIDER_WECHAT = "wechat";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String REFRESH = "refresh";
        public static final String REFRESHTOKEN = "refreshToken";
        public static final String REFRESH_TOKEN = "refresh_token";
        public static final String REGION = "region";
        public static final String REGIST_DATE = "regist_date";
        public static final String REGIST_INFO = "regist_info";
        public static final String REL = "rel";
        public static final String REQUEST_TOKEN = "request_token";
        public static final String RESET = "reset";
        public static final String RESULT = "result";
        public static final String SCOPE = "scope";
        public static final String SCOPE_DATA = "scope";
        public static final String SOURCE = "source";
        public static final String STATE = "state";
        public static final String SUB = "sub";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String TAG_FROM = "from_tag";
        public static final String TAG_FROM_FACEBOOCK = "facebook_tag";
        public static final String TAG_FROM_MI = "mi_tag";
        public static final String TAG_PRO_SHOW = "pro_show_tag";
        public static final String TARGET_REGION = "target_region";
        public static final String THIRDPARTY_INFO = "thirdparty_info";
        public static final String THIRD_ID = "third_id";
        public static final String THIRD_NAME = "third_name";
        public static final String THIRD_TOKEN = "third_token";
        public static final String THIRD_TOKEN_ID = "third_token_id";
        public static final String THIRD_TYPE = "third_type";
        public static final String TOKEN = "token";
        public static final String TOKEN_ID = "token_id";
        public static final String TOKEN_INFO = "token_info";
        public static final String TTL = "ttl";
        public static final String TV = "tv";
        public static final String UID = "uid";
        public static final String UNKNOWN = "unknown";
        public static final String US = "us";
        public static final String USER_ID = "user_id";
        public static final String USER_REGION = "user_region";
        public static final String WATCH = "watch";
    }

    public static class WechatConfig {
        public static String state = "wechat_sdk_demo_test";
    }

    public static String getAccountDomain() {
        return isDebugMode ? ID_SERVER_DN_STAGING : ID_SERVER_DN_PRODUCT;
    }

    public static String getDomain() {
        final String str = getAccountDomain() + "," + getUserDomainInfo();
        if (!TextUtils.isEmpty(httpDNSHost)) {
            str = str + "," + httpDNSHost;
        }
        HMLog.debug(new Function0() { // from class: ry0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Configs.lambda$getDomain$0(str);
            }
        });
        return str;
    }

    public static String getSearchDomain(String str) {
        if (isDebugMode) {
            SEARCH_SERVER_URL = SEARCH_SERVER_TEST;
        } else {
            SEARCH_SERVER_URL = SEARCH_SERVER_PRODUCT;
        }
        HMLog.debug(new Function0() { // from class: sy0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Configs.SEARCH_SERVER_URL;
            }
        });
        return SEARCH_SERVER_URL;
    }

    public static String getUserDomain() {
        return isDebugMode ? USER_SERVER_STAGING : USER_SERVER_PRODUCT;
    }

    public static String getUserDomainInfo() {
        return isDebugMode ? Uri.parse(USER_SERVER_STAGING).getHost() : Uri.parse(USER_SERVER_PRODUCT).getHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getDomain$0(String str) {
        return "getDomain:" + str;
    }
}
