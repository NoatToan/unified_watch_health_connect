package com.xiaomi.ai.a;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.a.a.c;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes18.dex */
public abstract class a {
    public int a;
    public com.xiaomi.ai.core.a b;
    public AivsError c;
    private ObjectNode d;

    public a(int i) {
        this.a = i;
    }

    public a(int i, com.xiaomi.ai.core.a aVar) {
        this.a = i;
        this.b = aVar;
    }

    private void a(long j) {
        long j2;
        if (!this.b.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_REFRESH_TOKEN_AHEAD)) {
            Logger.b("AuthProvider", "refreshTokenIfNeed return ,not enable");
            return;
        }
        if (!(this instanceof c)) {
            Logger.a("AuthProvider", "refreshTokenIfNeed return ,not OAuth token");
            return;
        }
        try {
            j2 = Long.parseLong(this.b.getListener().a(this.b, "refresh_at"));
        } catch (Exception e) {
            Logger.c("AuthProvider", "startRefreshTaskIfNeed get refreshAt error: " + e.toString());
            j2 = 0L;
        }
        if (j2 <= 0) {
            Logger.b("AuthProvider", "startRefreshTaskIfNeed fail ,refreshAt time error");
            return;
        }
        long jNextInt = (j2 + ((long) ((((double) (new Random().nextInt(17) + 50)) / 100.0d) * (j - j2)))) - (System.currentTimeMillis() / 1000);
        Logger.a("AuthProvider", "start RefreshTokenTask :" + jNextInt);
        if (jNextInt > 0) {
            Logger.b("AuthProvider", "refreshTokenIfNeed ,refresh next time ");
        } else {
            com.xiaomi.ai.b.c.a.execute(new Runnable() { // from class: com.xiaomi.ai.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    Logger.b("AuthProvider", "RefreshTokenRunnable run");
                    a.this.a(true, false, (Map<String, String>) null);
                }
            });
        }
    }

    public AivsError a() {
        AivsError aivsError = this.c;
        this.c = null;
        return aivsError;
    }

    public abstract String a(boolean z, boolean z2);

    public abstract String a(boolean z, boolean z2, Map<String, String> map);

    public void a(int i, int i2, String str, boolean z) {
        if (this.b.getAivsConfig().getBoolean(AivsConfig.Track.ENABLE) && z) {
            synchronized (this) {
                if (this.d == null) {
                    ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                    this.d = objectNodeCreateObjectNode;
                    objectNodeCreateObjectNode.put("type", "gettoken");
                }
                this.d.put("status", i);
                this.d.put("result", i2);
                if (str != null) {
                    this.d.put("msg", str);
                }
                this.d.put("timestamp", System.currentTimeMillis());
                this.b.addTrackProcess(this.d);
                this.d = null;
            }
        }
    }

    public void a(com.xiaomi.ai.core.a aVar) {
        this.b = aVar;
    }

    public void a(String str, int i, boolean z) {
        if (z) {
            this.b.updateTrack(str, i);
        }
    }

    public void a(String str, int i, boolean z, boolean z2) {
        if (this.b.getAivsConfig().getBoolean(AivsConfig.Track.ENABLE) && z2) {
            synchronized (this) {
                if (this.d == null) {
                    ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                    this.d = objectNodeCreateObjectNode;
                    objectNodeCreateObjectNode.put("type", "gettoken");
                }
                this.d.put(str, i);
                if (z) {
                    this.d.put("timestamp", System.currentTimeMillis());
                    this.b.addTrackProcess(this.d);
                    this.d = null;
                }
            }
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.b.updateTrack(str, str2);
        }
    }

    public void a(String str, String str2, boolean z, boolean z2) {
        if (this.b.getAivsConfig().getBoolean(AivsConfig.Track.ENABLE) && z2) {
            synchronized (this) {
                if (this.d == null) {
                    ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                    this.d = objectNodeCreateObjectNode;
                    objectNodeCreateObjectNode.put("type", "gettoken");
                }
                this.d.put(str, str2);
                if (z) {
                    this.d.put("timestamp", System.currentTimeMillis());
                    this.b.addTrackProcess(this.d);
                    this.d = null;
                }
            }
        }
    }

    public int b() {
        return this.a;
    }

    public String b(boolean z, boolean z2) {
        String strA;
        String strA2;
        long j;
        synchronized (a.class) {
            if (this.b.getAivsConfig().getInt(AivsConfig.Auth.REQ_TOKEN_MODE) == 1) {
                String strA3 = this.b.getListener().a(this.b, z);
                if (f.a(strA3)) {
                    a(5, -1, "callback return null or empty token", z2);
                    a("sdk.connect.error.msg", "callback return null or empty token", z2);
                } else {
                    a(5, 0, (String) null, z2);
                }
                return strA3;
            }
            try {
                strA = this.b.getListener().a(this.b, "access_token");
                strA2 = this.b.getListener().a(this.b, "refresh_token");
                String strA4 = this.b.getListener().a(this.b, "expire_at");
                j = !f.a(strA4) ? Long.parseLong(strA4) : 0L;
            } catch (Exception e) {
                this.b.getListener().b(this.b, "access_token");
                this.b.getListener().b(this.b, "refresh_token");
                this.b.getListener().b(this.b, "expire_at");
                Logger.d("AuthProvider", Logger.throwableToString(e));
                strA = null;
                strA2 = null;
            }
            if (!f.a(strA) && j > 0 && !f.a(strA2)) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                if (!z && j - jCurrentTimeMillis > 300) {
                    Logger.a("AuthProvider", "getToken: use cachedAccessToken:" + strA);
                    a(1, 0, (String) null, z2);
                    a(j);
                    return strA;
                }
                if (!z && j - jCurrentTimeMillis < 300) {
                    this.b.getListener().a(this.b);
                }
                a("status", 2, false, z2);
                String strA5 = a(false, z2);
                if (!f.a(strA5)) {
                    Logger.b("AuthProvider", "getToken: refresh token success");
                    this.b.getListener().b(this.b);
                    return strA5;
                }
                Logger.d("AuthProvider", "getToken: refresh token failed");
            }
            if (f.a(strA2)) {
                a("status", 3, false, z2);
            } else {
                a("status", 4, false, z2);
            }
            return a(true, z2);
        }
    }
}
