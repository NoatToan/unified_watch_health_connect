package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequestV2;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class c5t extends SecureRequestV2<a> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(TSMAuthContants.PARAM_IS_BACKUP)
        public boolean f4969a;

        public boolean a() {
            return this.f4969a;
        }
    }

    public c5t(ResponseListener<a> responseListener) {
        super("GET", TSMAuthContants.URL_MIFARE_CARD_BACKUP_SETTINGS, a.class, responseListener);
    }

    public c5t(boolean z, ResponseListener<a> responseListener) {
        super("POST", TSMAuthContants.URL_MIFARE_CARD_BACKUP_SETTINGS, a.class, responseListener);
        addParams(TSMAuthContants.PARAM_IS_BACKUP, String.valueOf(z));
    }
}
