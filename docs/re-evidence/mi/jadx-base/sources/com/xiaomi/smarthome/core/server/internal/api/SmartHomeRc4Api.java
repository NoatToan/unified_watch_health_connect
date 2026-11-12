package com.xiaomi.smarthome.core.server.internal.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.miui.tsmclient.database.DatabaseConstants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.sleep.behavior.AudioFileCacheConfig;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.network.NetworkUtil;
import com.xiaomi.smarthome.core.server.internal.setting.NetworkDebugSetting;
import com.xiaomi.smarthome.core.server.internal.util.KeyValuePairUtil;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.core.server.internal.util.UserAgentUtil;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.common.util.MMKVManager;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.crypto.CloudCoder;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.library.crypto.rc4coder.RC4DropCoder;
import com.xiaomi.smarthome.library.http.util.CookieUtil;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.mime.MimeUtils;
import com.xiaomi.smarthome.network.MiJiaNetworkIntercept;
import com.xiaomi.smarthome.network.NetworkDepApi;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import com.xiaomi.smarthome.utils.ExtsKt;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public class SmartHomeRc4Api {
    private static final String BUSINESS_CAMERA = "app.business.smartcamera";
    private static final String CAMERA = "camera";
    private static final String CONNECT_CAMERA = "connect.camera";
    private static final String PROCESSOR_CAMERA = "app.processor.smartcamera";
    public static final String TAG = "SmartHomeApi";
    private static final int TEST_MODE_FLAG_IS_TEST = 1;
    private static final int TEST_MODE_FLAG_MARK_TOKEN_EXPIRE_ONCE = 2;
    private static volatile SmartHomeRc4Api sInstance;
    private static final Object sLock = new Object();
    private Context mContext;
    private CookieManager mCookieManager;
    private OkHttpClient mOkHttpClient;
    private Dispatcher mOkHttpDispatcher;
    private MiServiceTokenInfo mServiceTokenInfo;
    private volatile boolean mIsInitialized = false;
    private long mLastToastShowTime = 0;
    private long mNextToastDelay = 10000;
    private Object mFakeLock = new Object();
    private List<MiJiaNetworkIntercept> mMiJiaNetworkInterceptList = new ArrayList();
    private int mTestMode = 0;
    private long startExpireTime = 0;

    public class RequestRecord {
        boolean mIsRemoteFinished = false;

        public RequestRecord() {
        }

        public synchronized boolean getRemoteFinished() {
            return this.mIsRemoteFinished;
        }

        public synchronized void setRemoteFinished(boolean z) {
            this.mIsRemoteFinished = z;
        }
    }

    private SmartHomeRc4Api(final Context context) {
        this.mContext = context;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mContext.getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("okhttp3");
        sb.append(str);
        sb.append(DatabaseConstants.TABLE_CACHE);
        String string = sb.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.HTTP_1_1);
        arrayList.add(Protocol.HTTP_2);
        this.mOkHttpDispatcher = new Dispatcher(ThreadPoolManager.getHttpThreadPool());
        this.mOkHttpDispatcher.setMaxRequestsPerHost(SharePrefsManager.getSettingInt(context, SharePrefsManager.SP_THREADPOOL_AB_CONFIG, SharePrefsManager.SP_THREADPOOL_MAX_REQUESTS_PER_HOST, 10));
        OkHttpClient.Builder builderDispatcher = new OkHttpClient.Builder().dispatcher(this.mOkHttpDispatcher);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderProtocols = builderDispatcher.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).retryOnConnectionFailure(false).protocols(arrayList);
        CookieManager cookieManager = new CookieManager();
        this.mCookieManager = cookieManager;
        this.mOkHttpClient = builderProtocols.cookieJar(new JavaNetCookieJar(cookieManager)).addNetworkInterceptor(new Interceptor() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request();
                if ((MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) && SmartHomeRc4Api.this.shouldMockTokenExpire()) {
                    chain.proceed(request);
                    return new Response.Builder().request(request).protocol(Protocol.HTTP_2).code(401).message("").body(ResponseBody.create(MediaType.get("application/json; charset=utf-8"), "{mock token expire}")).build();
                }
                Request.Builder builderNewBuilder = request.newBuilder();
                if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType() || MiJiaEnvironment.isInGreyPublish() || MiJiaEnvironment.isDevChannel()) {
                    for (String str2 : SharePrefsManager.getSettingString(context, "developer_setting", "debug_header_extra", "").split("\n")) {
                        String[] strArrSplit = str2.split(":");
                        if (strArrSplit.length == 2) {
                            try {
                                builderNewBuilder.addHeader(strArrSplit[0].trim(), strArrSplit[1].trim());
                            } catch (Exception e) {
                                ToastUtil.show(context, e.getMessage());
                            }
                        }
                    }
                }
                Request.Builder builderAddHeader = builderNewBuilder.removeHeader("User-Agent").removeHeader("ssecurity").addHeader("MIOT-ACCEPT-ENCODING", "GZIP").addHeader("User-Agent", UserAgentUtil.getUserAgent(SmartHomeRc4Api.this.mContext));
                if (!TextUtils.isEmpty(MiJiaEnvironment.getOriginFrom())) {
                    builderAddHeader.addHeader("Origin-From", MiJiaEnvironment.getOriginFrom());
                }
                return chain.proceed(builderAddHeader.build());
            }
        }).cache(ProcessUtil.isIsolateProcess(context) ? null : new Cache(new File(string), AudioFileCacheConfig.CACHE_MAX_SIZE)).addInterceptor(new ServiceHaltInterceptor()).build();
        clearFakeConnectedTimeLocked();
    }

    private byte[] byteArraysConcat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFail(NetCallback<NetResult, NetError> netCallback, Response response) {
        if (netCallback != null) {
            if (response.request() == null || TextUtils.isEmpty(response.request().url().getUrl())) {
                netCallback.onFailure(new NetError(response.code(), "callbackFail:" + response.message()));
                return;
            }
            netCallback.onFailure(new NetError(response.code(), "callbackFail:" + response.message(), response.request().url().getUrl()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFakeConnectedTimeLocked() {
        synchronized (this.mFakeLock) {
            this.mLastToastShowTime = 0L;
            this.mNextToastDelay = 10000L;
        }
    }

    private void disableTestMode(int i) {
        this.mTestMode = (~i) & this.mTestMode;
    }

    private void enableTestMode(int i) {
        this.mTestMode = i ^ this.mTestMode;
    }

    private Pair<List<KeyValuePair>, String> encrypt(MiServiceTokenInfo miServiceTokenInfo, NetRequest netRequest) {
        String strEncryptBASE64;
        List<KeyValuePair> headers = netRequest.getHeaders();
        if (this.mOkHttpClient.protocols().contains(Protocol.HTTP_2)) {
            headers.add(new KeyValuePair("X-XIAOMI-PROTOCAL-FLAG-CLI", "PROTOCAL-HTTP2"));
        }
        headers.add(new KeyValuePair("MIOT-ENCRYPT-ALGORITHM", "ENCRYPT-RC4"));
        headers.add(new KeyValuePair("Accept-Encoding", HTTP.IDENTITY_CODING));
        String strGenerateNonce = CloudCoder.generateNonce(miServiceTokenInfo.e);
        try {
            strEncryptBASE64 = Coder.encryptBASE64(Coder.sha256Hash(byteArraysConcat(Coder.decryptBASE64(miServiceTokenInfo.d), Coder.decryptBASE64(strGenerateNonce))));
        } catch (InvalidKeyException | NoSuchAlgorithmException | Exception unused) {
            strEncryptBASE64 = null;
        }
        if (strEncryptBASE64 == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        ArrayList arrayList = new ArrayList();
        RC4DropCoder rC4DropCoder = new RC4DropCoder(strEncryptBASE64);
        List<KeyValuePair> queryParams = netRequest.getQueryParams();
        if (queryParams != null) {
            for (KeyValuePair keyValuePair : queryParams) {
                if (!TextUtils.isEmpty(keyValuePair.getKey()) && !TextUtils.isEmpty(keyValuePair.getValue())) {
                    treeMap2.put(keyValuePair.getKey(), keyValuePair.getValue());
                }
            }
        }
        treeMap2.put("rc4_hash__", CloudCoder.generateSignature(netRequest.getMethod(), netRequest.getPath(), treeMap2, strEncryptBASE64));
        for (Map.Entry entry : treeMap2.entrySet()) {
            String strEncrypt = rC4DropCoder.encrypt((String) entry.getValue());
            treeMap.put((String) entry.getKey(), strEncrypt);
            arrayList.add(new KeyValuePair((String) entry.getKey(), strEncrypt));
        }
        arrayList.add(new KeyValuePair(MiTsmConstants.KEY_SIGNATURE, CloudCoder.generateSignature(netRequest.getMethod(), netRequest.getPath(), treeMap, strEncryptBASE64)));
        arrayList.add(new KeyValuePair("_nonce", strGenerateNonce));
        arrayList.add(new KeyValuePair("ssecurity", miServiceTokenInfo.d));
        return Pair.create(arrayList, strGenerateNonce);
    }

    private Pair<List<KeyValuePair>, String> encryptNew(MiServiceTokenInfo miServiceTokenInfo, NetRequest netRequest) {
        String strEncryptBASE64;
        netRequest.getHeaders().add(new KeyValuePair("X-XIAOMI-PROTOCAL-FLAG-CLI", "PROTOCAL-HTTP2"));
        String strGenerateNonceTime = CloudCoder.generateNonceTime(System.currentTimeMillis() + miServiceTokenInfo.e);
        try {
            strEncryptBASE64 = Coder.encryptBASE64(Coder.sha256Hash(byteArraysConcat(Coder.decryptBASE64(miServiceTokenInfo.d), Coder.decryptBASE64(strGenerateNonceTime))));
        } catch (InvalidKeyException | NoSuchAlgorithmException | Exception unused) {
            strEncryptBASE64 = null;
        }
        if (strEncryptBASE64 == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        ArrayList arrayList = new ArrayList();
        List<KeyValuePair> queryParams = netRequest.getQueryParams();
        if (queryParams != null) {
            for (KeyValuePair keyValuePair : queryParams) {
                if (!TextUtils.isEmpty(keyValuePair.getKey()) && !TextUtils.isEmpty(keyValuePair.getValue())) {
                    treeMap.put(keyValuePair.getKey(), keyValuePair.getValue());
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList();
        if (netRequest.getPath() != null) {
            arrayList2.add(netRequest.getPath());
        }
        arrayList2.add(strEncryptBASE64);
        arrayList2.add(strGenerateNonceTime);
        if (treeMap.isEmpty()) {
            arrayList2.add("data=");
        } else {
            for (Map.Entry entry : new TreeMap((SortedMap) treeMap).entrySet()) {
                arrayList2.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : arrayList2) {
            if (!z) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            z = false;
        }
        arrayList.add(new KeyValuePair(MiTsmConstants.KEY_SIGNATURE, sha256_HMAC(sb.toString(), strEncryptBASE64)));
        arrayList.add(new KeyValuePair("_nonce", strGenerateNonceTime));
        arrayList.addAll(netRequest.getQueryParams());
        return Pair.create(arrayList, strGenerateNonceTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String filterSensitiveInfo(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Request-Id:");
        sb.append(str);
        sb.append(", host:");
        sb.append(str2);
        sb.append(", response: ");
        if (TextUtils.isEmpty(str3)) {
            return sb.toString();
        }
        sb.append(str3);
        int i = 0;
        while (true) {
            try {
                int iIndexOf = sb.indexOf("token\":\"", i);
                if (iIndexOf <= 0) {
                    break;
                }
                int i2 = iIndexOf + 8;
                int iIndexOf2 = sb.indexOf("\"", i2);
                if (iIndexOf2 > 0) {
                    sb.replace(i2, iIndexOf2, Marker.ANY_MARKER);
                    i = iIndexOf + 10;
                } else {
                    i = i2;
                }
            } catch (Throwable th) {
                MiJiaLog.writeLogOnAll(LogType.NETWORK, "MIIO", str3.length() + ExtsKt.getString(th));
            }
        }
        return sb.toString();
    }

    public static SmartHomeRc4Api getInstance() {
        if (sInstance == null) {
            synchronized (SmartHomeRc4Api.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SmartHomeRc4Api(MiJiaEnvironment.getAppContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private MiServiceTokenInfo getMiServiceTokenInfo(NetRequest netRequest) {
        String prefix;
        if (!ServerCompact.isStaging(GlobalDynamicSettingManager.getInstance().getServer()) || ((prefix = netRequest.getPrefix()) != null && (prefix.startsWith(CONNECT_CAMERA) || prefix.startsWith(PROCESSOR_CAMERA) || prefix.startsWith(BUSINESS_CAMERA) || prefix.startsWith("camera")))) {
            MiServiceTokenInfo miServiceToken = AccountDepApi.getInstance().getMiServiceToken(LoginSetting.SID_XIAOMI_IO);
            return miServiceToken == null ? new MiServiceTokenInfo(LoginSetting.SID_XIAOMI_IO, "", "", "", "", 0L) : miServiceToken;
        }
        MiServiceTokenInfo miServiceToken2 = AccountDepApi.getInstance().getMiServiceToken(LoginSetting.SID_STAGING);
        return miServiceToken2 == null ? new MiServiceTokenInfo(LoginSetting.SID_STAGING, "", "", "", "", 0L) : miServiceToken2;
    }

    private boolean isInTestMode() {
        return isTestModeFlagEnabled(1) && MiJiaEnvironment.isDebugBuildType();
    }

    private boolean isTestModeFlagEnabled(int i) {
        return (i & this.mTestMode) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logOkHttpRequest(Request request, long j, boolean z) {
        if (j >= 600 && (MiJiaEnvironment.isInGreyPublish() || MiJiaEnvironment.isDebugBuildType())) {
            try {
                MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, request.url() + " takes " + j + "ms to get response " + z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (MiJiaEnvironment.isDevChannel() || MiJiaEnvironment.isSdkBuildType() || MiJiaEnvironment.isDebugBuildType()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("PATH:");
            stringBuffer.append(request.url().encodedPath());
            stringBuffer.append("||delta:");
            stringBuffer.append(j);
            stringBuffer.append("||succ:");
            stringBuffer.append(z);
            MiJiaLog.writeLogOnAll(LogType.REQUEST_OUTPUT, TAG, stringBuffer.toString());
        }
    }

    private void logOkHttpState() {
        if (MiJiaEnvironment.isInGreyPublish() || MiJiaEnvironment.isDebugBuildType()) {
            try {
                int iQueuedCallsCount = this.mOkHttpDispatcher.queuedCallsCount();
                if (iQueuedCallsCount < 15) {
                    return;
                }
                int iRunningCallsCount = this.mOkHttpDispatcher.runningCallsCount();
                MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "okhttp queuedCallsCount=" + iQueuedCallsCount + ",runningCallsCount=" + iRunningCallsCount);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private NetHandle preprocessNetworkIntercept(NetRequest netRequest, NetCallback<NetResult, NetError> netCallback) {
        if (this.mMiJiaNetworkInterceptList.isEmpty()) {
            return null;
        }
        Iterator<MiJiaNetworkIntercept> it = this.mMiJiaNetworkInterceptList.iterator();
        while (it.hasNext()) {
            NetHandle netHandleSendRequest = it.next().sendRequest(netRequest, netCallback);
            if (netHandleSendRequest != null) {
                MiJiaLog.writeLogOnDebug(LogType.NETWORK, TAG, "intercept " + netRequest.getPath());
                return netHandleSendRequest;
            }
        }
        return null;
    }

    private void setChannelCookie() {
        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("channel", MiJiaEnvironment.getChannel(), LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
    }

    private void setLocaleCookie() {
        Locale currentLocale = LocaleUtil.getCurrentLocale(MiJiaEnvironment.getAppContext());
        StringBuilder sb = new StringBuilder();
        sb.append("setLocaleCookie:");
        sb.append(currentLocale);
        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("locale", LocaleUtil.getNewCodeLocaleString(currentLocale), LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
    }

    private void setServerCookie() {
        ServerBean currentServer = ServerCompact.getCurrentServer(this.mContext);
        if (currentServer != null) {
            this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("countryCode", currentServer.countryCode, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
        }
    }

    private void setTimezoneCookie() {
        String strEncode;
        boolean zUseDaylightTime;
        String strHashedDeviceIdUtil;
        TimeZone timeZone = TimeZone.getDefault();
        int dSTSavings = 0;
        try {
            strEncode = URLEncoder.encode(SystemApi.getInstance().getTimeZone(), "UTF-8");
            try {
                zUseDaylightTime = timeZone.useDaylightTime();
                try {
                    dSTSavings = timeZone.getDSTSavings();
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedEncodingException unused2) {
                zUseDaylightTime = false;
            }
        } catch (UnsupportedEncodingException unused3) {
            strEncode = "";
        }
        if (timeZone != null) {
            this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("timezone_id", timeZone.getID(), LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
        }
        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("timezone", strEncode, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("is_daylight", zUseDaylightTime ? "1" : "0", LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("dst_offset", "" + dSTSavings, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
        try {
            strHashedDeviceIdUtil = NetworkDepApi.getInstance().HashedDeviceIdUtil();
        } catch (Exception unused4) {
            strHashedDeviceIdUtil = null;
        }
        if (TextUtils.isEmpty(strHashedDeviceIdUtil)) {
            return;
        }
        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("PassportDeviceId", strHashedDeviceIdUtil, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
    }

    private static String sha256_HMAC(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(Coder.decryptBASE64(str2), "HmacSHA256"));
            return Coder.encryptBASE64(mac.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldMockTokenExpire() {
        if (MiJiaEnvironment.isReleaseBuildType() || !isTestModeFlagEnabled(2)) {
            return false;
        }
        disableTestMode(2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFakeConnectedToastLocked() {
        if (ProcessLifecycleOwner.get().getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this.mFakeLock) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.mLastToastShowTime;
                    if (j == 0 || jCurrentTimeMillis >= j + this.mNextToastDelay) {
                        this.mLastToastShowTime = System.currentTimeMillis();
                        this.mNextToastDelay *= 2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addMiJiaNetworkIntercept(MiJiaNetworkIntercept miJiaNetworkIntercept) {
        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "addMiJiaNetworkIntercept");
        if (miJiaNetworkIntercept == null || this.mMiJiaNetworkInterceptList.contains(miJiaNetworkIntercept)) {
            return;
        }
        this.mMiJiaNetworkInterceptList.add(miJiaNetworkIntercept);
    }

    public String decrypt(MiServiceTokenInfo miServiceTokenInfo, String str, String str2, String str3) throws SecurityException {
        try {
            String strEncryptBASE64 = Coder.encryptBASE64(Coder.sha256Hash(byteArraysConcat(Coder.decryptBASE64(miServiceTokenInfo.d), Coder.decryptBASE64(str3))));
            if (strEncryptBASE64 == null) {
                return null;
            }
            return new RC4DropCoder(strEncryptBASE64).decrypt("GZIP".equals(str), str2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | Exception unused) {
            return null;
        }
    }

    public boolean isInitialized() {
        boolean z;
        synchronized (sLock) {
            z = this.mIsInitialized;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cc  */
    public NetHandle sendRequest(final NetRequest netRequest, final NetCallback<NetResult, NetError> netCallback) {
        String str;
        final MiServiceTokenInfo miServiceTokenInfo;
        final Pair<List<KeyValuePair>, String> pairEncrypt;
        final boolean z;
        final Request request;
        Request requestBuild;
        MultipartBody multipartBodyBuild;
        NetHandle netHandlePreprocessNetworkIntercept = preprocessNetworkIntercept(netRequest, netCallback);
        if (netHandlePreprocessNetworkIntercept != null) {
            return netHandlePreprocessNetworkIntercept;
        }
        logOkHttpState();
        if (netRequest == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "netRequest is null"));
            }
            return new NetHandle(null);
        }
        if (isInTestMode()) {
            str = HostApiIO.getTestHost() + netRequest.getPath();
        } else {
            str = HostApiIO.buildHostPath(netRequest) + netRequest.getPath();
        }
        final String str2 = str;
        synchronized (sLock) {
            try {
                if (isInitialized()) {
                    miServiceTokenInfo = this.mServiceTokenInfo;
                } else {
                    if (!AccountDepApi.getInstance().isMiLoggedIn()) {
                        if (netCallback != null) {
                            netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "not loggedin"));
                        }
                        return new NetHandle(null);
                    }
                    String miId = AccountDepApi.getInstance().getMiId();
                    MiServiceTokenInfo miServiceTokenInfo2 = getMiServiceTokenInfo(netRequest);
                    if (TextUtils.isEmpty(miId)) {
                        if (netCallback != null) {
                            netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "uid or serviceToken is null!"));
                        }
                        return new NetHandle(null);
                    }
                    CookieUtil.clearAllCookie(this.mCookieManager);
                    if (TextUtils.isEmpty(miServiceTokenInfo2.f14488b)) {
                        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("userId", miId, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
                        MiJiaLog.writeLogOnGrey(LogType.LOGIN, TAG, "cannot get cUserId");
                        NetworkDepApi.getInstance().statCuserId();
                    } else {
                        this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("cUserId", miServiceTokenInfo2.f14488b, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/"));
                    }
                    this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("yetAnotherServiceToken", miServiceTokenInfo2.c, miServiceTokenInfo2.f, "/"));
                    this.mCookieManager.getCookieStore().add(null, CookieUtil.createCookie("serviceToken", miServiceTokenInfo2.c, miServiceTokenInfo2.f, "/"));
                    setServerCookie();
                    setLocaleCookie();
                    setTimezoneCookie();
                    setChannelCookie();
                    setInitialized(true);
                    this.mServiceTokenInfo = miServiceTokenInfo2;
                    miServiceTokenInfo = miServiceTokenInfo2;
                }
                if (MiJiaEnvironment.isReleaseBuildType() || !MMKVManager.getSettingBoolean("developer_setting", "rn_debug_force_plaintext_transmission", false)) {
                    pairEncrypt = encrypt(miServiceTokenInfo, netRequest);
                    z = false;
                } else {
                    pairEncrypt = encryptNew(miServiceTokenInfo, netRequest);
                    z = true;
                }
                if (pairEncrypt == null) {
                    if (netCallback != null) {
                        netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "pair == null"));
                    }
                    return new NetHandle(null);
                }
                if (!netRequest.getMethod().equals("POST")) {
                    if (netRequest.getMethod().equals("GET")) {
                        requestBuild = new Request.Builder().url(KeyValuePairUtil.getUrlWithQueryString(str2, (List) pairEncrypt.first)).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders())).build();
                    } else {
                        request = null;
                    }
                    if (request == null) {
                        if (netCallback != null) {
                            netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "request == null"));
                        }
                        return new NetHandle(null);
                    }
                    if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append(" SmartHomeRc4Api.sendRequest ");
                        sb.append(request.toString());
                        sb.append(" ");
                        sb.append(ProcessUtil.getCurrentProcessName(this.mContext));
                    }
                    final RequestRecord requestRecord = new RequestRecord();
                    Call callNewCall = this.mOkHttpClient.newCall(request);
                    final long jCurrentTimeMillis2 = System.currentTimeMillis();
                    callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api.2
                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException iOException) {
                            SmartHomeRc4Api.this.logOkHttpRequest(request, Math.abs(System.currentTimeMillis() - jCurrentTimeMillis2), false);
                            requestRecord.setRemoteFinished(true);
                            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                                MiJiaLog.onlyLogcat(6, "MIIO", "host:" + request.url().host() + " " + netRequest.toFullString());
                                MiJiaLog.onlyLogcat(6, "MIIO", iOException.toString());
                            }
                            if ((iOException instanceof SocketTimeoutException) && NetworkUtil.isNetActiveAndAvailable(MiJiaEnvironment.getAppContext())) {
                                SmartHomeRc4Api.this.showFakeConnectedToastLocked();
                            }
                            NetCallback netCallback2 = netCallback;
                            if (netCallback2 != null) {
                                netCallback2.onFailure(new NetError(ErrorCode.INVALID.getCode(), iOException == null ? "net request failure" : ExtsKt.getString(iOException)));
                            }
                        }

                        @Override // okhttp3.Callback
                        public void onResponse(Call call, final Response response) throws IOException {
                            SmartHomeRc4Api.this.logOkHttpRequest(request, Math.abs(System.currentTimeMillis() - jCurrentTimeMillis2), true);
                            requestRecord.setRemoteFinished(true);
                            SmartHomeRc4Api.this.clearFakeConnectedTimeLocked();
                            String strHeader = response.header("Request-Id");
                            String strHeader2 = response.header("MIOT-CONTENT-ENCODING");
                            if (!response.isSuccessful()) {
                                if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                                    MiJiaLog.onlyLogcat(6, "MIIO", "Request-Id:" + strHeader + "host:" + request.url().host() + " " + netRequest.toFullString());
                                    MiJiaLog.onlyLogcat(6, "MIIO", response.toString());
                                }
                                if (response.code() == 401) {
                                    MiJiaLog.onlyLogcat(6, "MIIO", pairEncrypt.toString());
                                    UnAuthorRetry.getInstance(miServiceTokenInfo).processUnAuthorized(netRequest.getPath(), response, new NetCallback<MiServiceTokenInfo, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api.2.1
                                        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                                        public void onCache(MiServiceTokenInfo miServiceTokenInfo3) {
                                        }

                                        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                                        public void onFailure(Error error) {
                                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                            SmartHomeRc4Api.this.callbackFail(netCallback, response);
                                            MiJiaLog.writeLogOnAll(LogType.NETWORK, SmartHomeRc4Api.TAG, "processUnAuthorized onFailure " + str2);
                                        }

                                        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                                        public void onSuccess(MiServiceTokenInfo miServiceTokenInfo3) {
                                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                            SmartHomeRc4Api.this.sendRequest(netRequest, netCallback);
                                            MiJiaLog.writeLogOnAll(LogType.NETWORK, SmartHomeRc4Api.TAG, "processUnAuthorized onSuccess " + str2);
                                        }
                                    });
                                } else {
                                    SmartHomeRc4Api.this.callbackFail(netCallback, response);
                                }
                                try {
                                    MiJiaLog.writeLogOnAll(LogType.NETWORK, SmartHomeRc4Api.TAG, "http request fail: path=" + netRequest.getPath() + "\n,httpcode=" + response.code() + "\n,responseMessage=" + response.message());
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                if (response.body() != null) {
                                    response.close();
                                    return;
                                }
                                return;
                            }
                            ResponseBody responseBodyBody = response.body();
                            try {
                                String strString = responseBodyBody.string();
                                responseBodyBody.close();
                                if (!z) {
                                    try {
                                        strString = SmartHomeRc4Api.this.decrypt(miServiceTokenInfo, strHeader2, strString, (String) pairEncrypt.second);
                                    } catch (Exception e2) {
                                        NetCallback netCallback2 = netCallback;
                                        if (netCallback2 != null) {
                                            netCallback2.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(e2)));
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if ((MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) && !TextUtils.isEmpty(strString)) {
                                    if (NetworkDebugSetting.sIsPrintNetworkResponse) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(request.url() != null ? request.url().host() : null);
                                        sb2.append(" ");
                                        sb2.append(netRequest.toFullString());
                                        MiJiaLog.onlyLogcat("MIIO", SmartHomeRc4Api.filterSensitiveInfo(strHeader, sb2.toString(), strString));
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Request-Id:");
                                        sb3.append(strHeader);
                                        sb3.append(" host:");
                                        sb3.append(request.url() != null ? request.url().host() : null);
                                        sb3.append(" ");
                                        sb3.append(netRequest.toFullString());
                                        MiJiaLog.onlyLogcat("MIIO", sb3.toString());
                                    }
                                }
                                NetResult netResult = new NetResult();
                                netResult.mResponse = strString;
                                NetCallback netCallback3 = netCallback;
                                if (netCallback3 != null) {
                                    netCallback3.onSuccess(netResult);
                                }
                            } catch (Throwable th) {
                                try {
                                    MiJiaLog.writeLogOnAll(LogType.NETWORK, "MIIO", str2 + ExtsKt.getString(th));
                                    if (netCallback != null) {
                                        netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(th)));
                                    }
                                } finally {
                                    if (responseBodyBody != null) {
                                        responseBodyBody.close();
                                    }
                                }
                            }
                        }
                    });
                    return new NetHandle(callNewCall);
                }
                if (netRequest.getFilePaths() == null || netRequest.getFilePaths().size() <= 0) {
                    requestBuild = new Request.Builder().url(str2).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders())).post(KeyValuePairUtil.getRequestBody((List) pairEncrypt.first)).tag(miServiceTokenInfo.d).build();
                } else {
                    MultipartBody.Builder builder = new MultipartBody.Builder();
                    builder.setType(MultipartBody.FORM);
                    try {
                        List<KeyValuePair> filePaths = netRequest.getFilePaths();
                        if (filePaths != null && filePaths.size() > 0) {
                            Iterator<KeyValuePair> it = filePaths.iterator();
                            while (it.hasNext()) {
                                File file = new File(it.next().getValue());
                                if (file.exists()) {
                                    String name = file.getName();
                                    builder.addFormDataPart("img", name, RequestBody.create(MediaType.parse(MimeUtils.guessMimeTypeFromExtension(MimeUtils.getExtensionName(name))), file));
                                }
                            }
                        }
                        multipartBodyBuild = builder.build();
                    } catch (Exception e) {
                        MiJiaLog.onlyLogcat(6, TAG, "MultipartBody exception:" + e.getLocalizedMessage());
                        multipartBodyBuild = null;
                    }
                    if (multipartBodyBuild != null) {
                        requestBuild = new Request.Builder().url(str2 + KeyValuePairUtil.getQueryString((List) pairEncrypt.first)).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders())).post(multipartBodyBuild).tag(miServiceTokenInfo.d).build();
                    } else {
                        requestBuild = null;
                    }
                }
                request = requestBuild;
                if (request == null) {
                    if (netCallback != null) {
                        netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "request == null"));
                    }
                    return new NetHandle(null);
                }
                if (MiJiaEnvironment.isDebugBuildType()) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jCurrentTimeMillis3);
                    sb2.append(" SmartHomeRc4Api.sendRequest ");
                    sb2.append(request.toString());
                    sb2.append(" ");
                    sb2.append(ProcessUtil.getCurrentProcessName(this.mContext));
                } else {
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(jCurrentTimeMillis4);
                    sb3.append(" SmartHomeRc4Api.sendRequest ");
                    sb3.append(request.toString());
                    sb3.append(" ");
                    sb3.append(ProcessUtil.getCurrentProcessName(this.mContext));
                }
                final RequestRecord requestRecord2 = new RequestRecord();
                Call callNewCall2 = this.mOkHttpClient.newCall(request);
                final long jCurrentTimeMillis5 = System.currentTimeMillis();
                callNewCall2.enqueue(new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api.2
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        SmartHomeRc4Api.this.logOkHttpRequest(request, Math.abs(System.currentTimeMillis() - jCurrentTimeMillis5), false);
                        requestRecord2.setRemoteFinished(true);
                        if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                            MiJiaLog.onlyLogcat(6, "MIIO", "host:" + request.url().host() + " " + netRequest.toFullString());
                            MiJiaLog.onlyLogcat(6, "MIIO", iOException.toString());
                        }
                        if ((iOException instanceof SocketTimeoutException) && NetworkUtil.isNetActiveAndAvailable(MiJiaEnvironment.getAppContext())) {
                            SmartHomeRc4Api.this.showFakeConnectedToastLocked();
                        }
                        NetCallback netCallback2 = netCallback;
                        if (netCallback2 != null) {
                            netCallback2.onFailure(new NetError(ErrorCode.INVALID.getCode(), iOException == null ? "net request failure" : ExtsKt.getString(iOException)));
                        }
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, final Response response) throws IOException {
                        SmartHomeRc4Api.this.logOkHttpRequest(request, Math.abs(System.currentTimeMillis() - jCurrentTimeMillis5), true);
                        requestRecord2.setRemoteFinished(true);
                        SmartHomeRc4Api.this.clearFakeConnectedTimeLocked();
                        String strHeader = response.header("Request-Id");
                        String strHeader2 = response.header("MIOT-CONTENT-ENCODING");
                        if (!response.isSuccessful()) {
                            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                                MiJiaLog.onlyLogcat(6, "MIIO", "Request-Id:" + strHeader + "host:" + request.url().host() + " " + netRequest.toFullString());
                                MiJiaLog.onlyLogcat(6, "MIIO", response.toString());
                            }
                            if (response.code() == 401) {
                                MiJiaLog.onlyLogcat(6, "MIIO", pairEncrypt.toString());
                                UnAuthorRetry.getInstance(miServiceTokenInfo).processUnAuthorized(netRequest.getPath(), response, new NetCallback<MiServiceTokenInfo, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api.2.1
                                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                                    public void onCache(MiServiceTokenInfo miServiceTokenInfo3) {
                                    }

                                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                                    public void onFailure(Error error) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        SmartHomeRc4Api.this.callbackFail(netCallback, response);
                                        MiJiaLog.writeLogOnAll(LogType.NETWORK, SmartHomeRc4Api.TAG, "processUnAuthorized onFailure " + str2);
                                    }

                                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                                    public void onSuccess(MiServiceTokenInfo miServiceTokenInfo3) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        SmartHomeRc4Api.this.sendRequest(netRequest, netCallback);
                                        MiJiaLog.writeLogOnAll(LogType.NETWORK, SmartHomeRc4Api.TAG, "processUnAuthorized onSuccess " + str2);
                                    }
                                });
                            } else {
                                SmartHomeRc4Api.this.callbackFail(netCallback, response);
                            }
                            try {
                                MiJiaLog.writeLogOnAll(LogType.NETWORK, SmartHomeRc4Api.TAG, "http request fail: path=" + netRequest.getPath() + "\n,httpcode=" + response.code() + "\n,responseMessage=" + response.message());
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            if (response.body() != null) {
                                response.close();
                                return;
                            }
                            return;
                        }
                        ResponseBody responseBodyBody = response.body();
                        try {
                            String strString = responseBodyBody.string();
                            responseBodyBody.close();
                            if (!z) {
                                try {
                                    strString = SmartHomeRc4Api.this.decrypt(miServiceTokenInfo, strHeader2, strString, (String) pairEncrypt.second);
                                } catch (Exception e3) {
                                    NetCallback netCallback2 = netCallback;
                                    if (netCallback2 != null) {
                                        netCallback2.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(e3)));
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) && !TextUtils.isEmpty(strString)) {
                                if (NetworkDebugSetting.sIsPrintNetworkResponse) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(request.url() != null ? request.url().host() : null);
                                    sb4.append(" ");
                                    sb4.append(netRequest.toFullString());
                                    MiJiaLog.onlyLogcat("MIIO", SmartHomeRc4Api.filterSensitiveInfo(strHeader, sb4.toString(), strString));
                                } else {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Request-Id:");
                                    sb5.append(strHeader);
                                    sb5.append(" host:");
                                    sb5.append(request.url() != null ? request.url().host() : null);
                                    sb5.append(" ");
                                    sb5.append(netRequest.toFullString());
                                    MiJiaLog.onlyLogcat("MIIO", sb5.toString());
                                }
                            }
                            NetResult netResult = new NetResult();
                            netResult.mResponse = strString;
                            NetCallback netCallback3 = netCallback;
                            if (netCallback3 != null) {
                                netCallback3.onSuccess(netResult);
                            }
                        } catch (Throwable th) {
                            try {
                                MiJiaLog.writeLogOnAll(LogType.NETWORK, "MIIO", str2 + ExtsKt.getString(th));
                                if (netCallback != null) {
                                    netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(th)));
                                }
                            } finally {
                                if (responseBodyBody != null) {
                                    responseBodyBody.close();
                                }
                            }
                        }
                    }
                });
                return new NetHandle(callNewCall2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setInitialized(boolean z) {
        synchronized (sLock) {
            this.mIsInitialized = z;
        }
    }

    public void setTestMode(boolean z) {
        if (z) {
            enableTestMode(1);
        } else {
            disableTestMode(1);
        }
    }

    public void setTestModeTokenExpireOnce() {
        enableTestMode(2);
        this.startExpireTime = System.currentTimeMillis();
    }

    public static SmartHomeRc4Api getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new SmartHomeRc4Api(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }
}
