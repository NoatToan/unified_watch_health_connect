package cf2;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i83.t;
import o53.i0;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcf2/d;", "", "", "campaignId", "status", "updateLocalTimestamp", "mobileOs", "Lokhttp3/RequestBody;", TtmlNode.TAG_BODY, "Lo53/i0;", "Lc83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lo53/i0;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "a", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @i83.f("gcoffer/offer/V2/email")
    i0<a0<String>> a(@t("campaignId") String campaignId, @t(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String countryCode, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String languageCode);

    @i83.o("gcoffer/offer/V2/upselloffer")
    i0<a0<String>> b(@t("campaignId") String campaignId, @t("status") String status, @t("updateLocalTimestamp") String updateLocalTimestamp, @t("mobileOs") String mobileOs, @i83.a RequestBody body);

    @i83.f("gcoffer/offer/V2/offerValid")
    i0<a0<String>> c(@t("campaignId") String campaignId, @t(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String countryCode, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String languageCode);

    @i83.f("gcoffer/offer/V2/upselloffer")
    i0<a0<String>> d(@t(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String countryCode, @t(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE) String languageCode);
}
