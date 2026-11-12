package defpackage;

import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.api.common.APIUtils;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tq1 {
    private static final String TAG = "AuthProvider";
    private static final long TOKEN_EXPIRE_THRESHOLD = 300;
    protected int mAuthType;
    protected gt3 mChannel;
    protected f01 mError;
    private c4h mTrack;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wpe.h(tq1.TAG, "RefreshTokenRunnable run");
            tq1.this.getAuthHeader(true, false, null);
        }
    }

    public tq1(int i) {
        this.mAuthType = i;
    }

    private void refreshTokenIfNeed(long j) {
        long j2;
        if (!this.mChannel.getAivsConfig().b("connection.enable_refresh_token_ahead")) {
            wpe.h(TAG, "refreshTokenIfNeed return ,not enable");
            return;
        }
        if (!(this instanceof res)) {
            wpe.b(TAG, "refreshTokenIfNeed return ,not OAuth token");
            return;
        }
        try {
            j2 = Long.parseLong(this.mChannel.getListener().onRead(this.mChannel, "refresh_at"));
        } catch (Exception e) {
            wpe.k(TAG, "startRefreshTaskIfNeed get refreshAt error: " + e.toString());
            j2 = 0L;
        }
        if (j2 <= 0) {
            wpe.h(TAG, "startRefreshTaskIfNeed fail ,refreshAt time error");
            return;
        }
        long jNextInt = (j2 + ((long) ((((double) (new Random().nextInt(17) + 50)) / 100.0d) * (j - j2)))) - (System.currentTimeMillis() / 1000);
        wpe.b(TAG, "start RefreshTokenTask :" + jNextInt);
        if (jNextInt > 0) {
            wpe.h(TAG, "refreshTokenIfNeed ,refresh next time ");
        } else {
            ues.f35695a.execute(new a());
        }
    }

    public void finishTrack(int i, int i2, String str) {
        finishTrack(i, i2, str, true);
    }

    public abstract String getAuthHeader(boolean z, boolean z2, Map<String, String> map);

    public int getAuthType() {
        return this.mAuthType;
    }

    public f01 getLastError() {
        f01 f01Var = this.mError;
        this.mError = null;
        return f01Var;
    }

    public String getToken(boolean z, boolean z2) {
        String strOnRead;
        String strOnRead2;
        long j;
        synchronized (tq1.class) {
            try {
                if (this.mChannel.getAivsConfig().e("auth.req_token_mode") == 1) {
                    String strOnGetToken = this.mChannel.getListener().onGetToken(this.mChannel, z);
                    if (yrs.b(strOnGetToken)) {
                        finishTrack(5, -1, "callback return null or empty token", z2);
                        updateChannelTrack("sdk.connect.error.msg", "callback return null or empty token", z2);
                    } else {
                        finishTrack(5, 0, null, z2);
                    }
                    return strOnGetToken;
                }
                try {
                    strOnRead = this.mChannel.getListener().onRead(this.mChannel, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                    strOnRead2 = this.mChannel.getListener().onRead(this.mChannel, "refresh_token");
                    String strOnRead3 = this.mChannel.getListener().onRead(this.mChannel, "expire_at");
                    j = !yrs.b(strOnRead3) ? Long.parseLong(strOnRead3) : 0L;
                } catch (Exception e) {
                    this.mChannel.getListener().onRemove(this.mChannel, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                    this.mChannel.getListener().onRemove(this.mChannel, "refresh_token");
                    this.mChannel.getListener().onRemove(this.mChannel, "expire_at");
                    wpe.e(TAG, wpe.o(e));
                    strOnRead = null;
                    strOnRead2 = null;
                }
                if (!yrs.b(strOnRead) && j > 0 && !yrs.b(strOnRead2)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    if (!z && j - jCurrentTimeMillis > 300) {
                        wpe.b(TAG, "getToken: use cachedAccessToken:" + strOnRead);
                        finishTrack(1, 0, null, z2);
                        refreshTokenIfNeed(j);
                        return strOnRead;
                    }
                    if (!z && j - jCurrentTimeMillis < 300) {
                        this.mChannel.getListener().onAuthExpired(this.mChannel);
                    }
                    updateTrack("status", 2, false, z2);
                    String strRequestToken = requestToken(false, z2);
                    if (!yrs.b(strRequestToken)) {
                        wpe.h(TAG, "getToken: refresh token success");
                        this.mChannel.getListener().onAuthRefreshed(this.mChannel);
                        return strRequestToken;
                    }
                    wpe.e(TAG, "getToken: refresh token failed");
                }
                if (yrs.b(strOnRead2)) {
                    updateTrack("status", 3, false, z2);
                } else {
                    updateTrack("status", 4, false, z2);
                }
                return requestToken(true, z2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String requestToken(boolean z, boolean z2);

    public void setChannel(gt3 gt3Var) {
        this.mChannel = gt3Var;
    }

    public void updateChannelTrack(String str, int i, boolean z) {
        if (z) {
            this.mChannel.updateTrack(str, i);
        }
    }

    public void updateTrack(String str, int i, boolean z) {
        updateTrack(str, i, z, true);
    }

    public tq1(int i, gt3 gt3Var) {
        this.mAuthType = i;
        this.mChannel = gt3Var;
    }

    public void finishTrack(int i, int i2, String str, boolean z) {
        if (this.mChannel.getAivsConfig().b("track.enable") && z) {
            synchronized (this) {
                try {
                    if (this.mTrack == null) {
                        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                        this.mTrack = c4hVarCreateObjectNode;
                        c4hVarCreateObjectNode.j0("type", "gettoken");
                    }
                    this.mTrack.g0("status", i);
                    this.mTrack.g0("result", i2);
                    if (str != null) {
                        this.mTrack.j0("msg", str);
                    }
                    this.mTrack.h0("timestamp", System.currentTimeMillis());
                    this.mChannel.addTrackProcess(this.mTrack);
                    this.mTrack = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateChannelTrack(String str, String str2, boolean z) {
        if (z) {
            this.mChannel.updateTrack(str, str2);
        }
    }

    public void updateTrack(String str, int i, boolean z, boolean z2) {
        if (this.mChannel.getAivsConfig().b("track.enable") && z2) {
            synchronized (this) {
                try {
                    if (this.mTrack == null) {
                        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                        this.mTrack = c4hVarCreateObjectNode;
                        c4hVarCreateObjectNode.j0("type", "gettoken");
                    }
                    this.mTrack.g0(str, i);
                    if (z) {
                        this.mTrack.h0("timestamp", System.currentTimeMillis());
                        this.mChannel.addTrackProcess(this.mTrack);
                        this.mTrack = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateTrack(String str, String str2, boolean z) {
        updateTrack(str, str2, z, true);
    }

    public void updateTrack(String str, String str2, boolean z, boolean z2) {
        if (this.mChannel.getAivsConfig().b("track.enable") && z2) {
            synchronized (this) {
                try {
                    if (this.mTrack == null) {
                        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                        this.mTrack = c4hVarCreateObjectNode;
                        c4hVarCreateObjectNode.j0("type", "gettoken");
                    }
                    this.mTrack.j0(str, str2);
                    if (z) {
                        this.mTrack.h0("timestamp", System.currentTimeMillis());
                        this.mChannel.addTrackProcess(this.mTrack);
                        this.mTrack = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
