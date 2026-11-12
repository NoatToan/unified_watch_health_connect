package com.xiaomi.ai.a.a;

import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class b extends com.xiaomi.ai.a.a {
    private String d;
    private String e;

    public b(com.xiaomi.ai.core.a aVar) {
        super(2, aVar);
        if (!c()) {
            throw new IllegalArgumentException("MIOTProvider: illegal config");
        }
    }

    private boolean c() {
        String string = this.b.getAivsConfig().getString(AivsConfig.Auth.CLIENT_ID);
        this.d = string;
        if (!f.a(string)) {
            return true;
        }
        Logger.d("MIOTProvider", "initProvider: CLIENT_ID is not set");
        return false;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2) {
        return this.e;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2, Map<String, String> map) {
        Logger.b("MIOTProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        if (f.a(this.e) || z) {
            this.e = this.b.getListener().a(this.b, z);
        }
        if (!f.a(this.e)) {
            return String.format("%s app_id:%s,%s", "MIOT-TOKEN-V1", this.d, this.e);
        }
        Logger.d("MIOTProvider", "getAuthHeader:token is empty");
        return null;
    }
}
