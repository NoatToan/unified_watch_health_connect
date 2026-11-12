package com.xiaomi.ai.mibrain;

/* JADX INFO: loaded from: classes18.dex */
public class MibrainOauthManager {
    public static int MIBRAIN_OAUTH_PT_DEV = 0;
    public static int MIBRAIN_OAUTH_PT_SHUIDI = 1;
    private String mClientId;
    private String mClientSecret;
    private MibrainOauthManagerCallbacks mMibrainOauthManagerCallbacks;
    private long mNativeInstance;
    private String mRedirectUrl;
    private String mScopeData;

    public static class AccessTokenResult {
        public String accessToken;
        public int errorCode;
        public boolean isfromCode;
    }

    static {
        Mibrainsdk.loadMibrainLibs();
    }

    public MibrainOauthManager(MibrainOauthManagerCallbacks mibrainOauthManagerCallbacks, String str, String str2, String str3, String str4) {
        this.mRedirectUrl = str;
        this.mClientSecret = str2;
        this.mClientId = str3;
        this.mScopeData = str4;
        this.mMibrainOauthManagerCallbacks = mibrainOauthManagerCallbacks;
    }

    private native String genAnonymousAuthorization(long j, String str, String str2, String str3);

    private native void getAccessToken(long j, AccessTokenResult accessTokenResult, int i);

    private native int getErrorCode(long j);

    private native int init(long j, String str, String str2, String str3, String str4);

    private native long newInstance();

    private native void releaseInstance(long j);

    private native int setAnonymousAuth(long j, String str, String str2, String str3, int i);

    private native void setEnv(long j, int i);

    private native void setPt(long j, int i);

    private native void setTimeout(long j, int i);

    private native void unInit(long j);

    private native int updateAnonymousArgs(long j, String str, String str2, String str3, String str4);

    public String genAnonymousAuthorization(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        long j = this.mNativeInstance;
        if (j != 0) {
            return genAnonymousAuthorization(j, str, str2, str3);
        }
        throw new RuntimeException("newInstance failed ");
    }

    public AccessTokenResult getAccessToken(boolean z) {
        if (this.mNativeInstance == 0) {
            throw new IllegalStateException("MibrainOauthManager not init");
        }
        AccessTokenResult accessTokenResult = new AccessTokenResult();
        getAccessToken(this.mNativeInstance, accessTokenResult, z ? 1 : 0);
        return accessTokenResult;
    }

    public String getClientId() {
        return this.mClientId;
    }

    public String getClientSecret() {
        return this.mClientSecret;
    }

    public int getErrorCode() {
        long j = this.mNativeInstance;
        if (j != 0) {
            return getErrorCode(j);
        }
        throw new IllegalStateException("MibrainOauthManager not init");
    }

    public String getOauthCode() {
        return this.mMibrainOauthManagerCallbacks.getOauthCode();
    }

    public String getOauthData(String str) {
        return this.mMibrainOauthManagerCallbacks.getOauthData(str);
    }

    public String getRedirectUrl() {
        return this.mRedirectUrl;
    }

    public String getcopeData() {
        return this.mScopeData;
    }

    public void init() {
        long jNewInstance = newInstance();
        this.mNativeInstance = jNewInstance;
        if (jNewInstance == 0) {
            throw new RuntimeException("newInstance failed ");
        }
        if (init(jNewInstance, this.mRedirectUrl, this.mClientSecret, this.mClientId, this.mScopeData) != 0) {
            throw new IllegalArgumentException("init failed,please check params");
        }
    }

    public boolean putOauthData(String str, String str2) {
        return this.mMibrainOauthManagerCallbacks.putOauthData(str, str2);
    }

    public void release() {
        long j = this.mNativeInstance;
        if (j == 0) {
            throw new IllegalStateException("MibrainOauthManager not init");
        }
        unInit(j);
        releaseInstance(this.mNativeInstance);
        this.mNativeInstance = 0L;
    }

    public int setAnonymousAuth(String str, String str2, String str3, int i) {
        long j = this.mNativeInstance;
        if (j != 0) {
            return setAnonymousAuth(j, str, str2, str3, i);
        }
        throw new RuntimeException("newInstance failed ");
    }

    public void setNetTimeOut(int i) {
        long j = this.mNativeInstance;
        if (j == 0) {
            throw new IllegalStateException("MibrainOauthManager not init");
        }
        setTimeout(j, i);
    }

    public void setOauthEnv(int i) {
        long j = this.mNativeInstance;
        if (j == 0) {
            throw new IllegalStateException("MibrainOauthManager not init");
        }
        setEnv(j, i);
    }

    public void setOauthPt(int i) {
        long j = this.mNativeInstance;
        if (j == 0) {
            throw new IllegalStateException("MibrainOauthManager not init");
        }
        setPt(j, i);
    }

    public int updateAnonymousArgs(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null || str2 == null || str3 == null || str5 == null || str6 == null) {
            return -1;
        }
        String str7 = String.format("%s;%s;%s", str4, str5.toLowerCase(), str6.toLowerCase());
        long j = this.mNativeInstance;
        if (j != 0) {
            return updateAnonymousArgs(j, str, str2, str3, str7);
        }
        throw new RuntimeException("newInstance failed ");
    }
}
