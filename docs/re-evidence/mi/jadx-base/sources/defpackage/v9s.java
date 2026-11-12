package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class v9s extends tq1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f36647k;
    public String l;

    public v9s(gt3 gt3Var) {
        super(2, gt3Var);
        a();
    }

    private void a() {
        if (this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true)) {
            String strI = this.mChannel.getAivsConfig().i("auth.client_id");
            this.f36647k = strI;
            if (yrs.b(strI)) {
                wpe.e("MIOTProvider", "initProvider: CLIENT_ID is not set");
                throw new IllegalArgumentException("CLIENT_ID is not set");
            }
        }
    }

    @Override // defpackage.tq1
    public String getAuthHeader(boolean z, boolean z2, Map<String, String> map) {
        wpe.h("MIOTProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        if (yrs.b(this.l) || z) {
            this.l = this.mChannel.getListener().onGetToken(this.mChannel, z);
        }
        if (!yrs.b(this.l)) {
            return !this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true) ? this.l : String.format("%s app_id:%s,%s", "MIOT-TOKEN-V1", this.f36647k, this.l);
        }
        wpe.e("MIOTProvider", "getAuthHeader:token is empty");
        return null;
    }

    @Override // defpackage.tq1
    public String requestToken(boolean z, boolean z2) {
        return this.l;
    }
}
