package i12;

import c83.a0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i83.c;
import i83.e;
import i83.k;
import i83.o;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JY\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Li12/a;", "", "", "version", RemoteConfigConstants.RequestFieldKey.APP_ID, "service", "mfaToken", "customerGUID", "connectAccessToken", "Lo53/i0;", "Lc83/a0;", "Lpu/k;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @k({"Content-Type: application/x-www-form-urlencoded"})
    @o("sso/requestToken?")
    @e
    i0<a0<pu.k>> a(@t("version") String version, @t("appid") String appId, @t("service") String service, @t("mfaToken") String mfaToken, @c("customerGUID") String customerGUID, @c("connectAccessToken") String connectAccessToken);
}
