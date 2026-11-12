package vz0;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uz0.e;
import uz0.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\b\b\u0001\u0010\u0012\u001a\u00020\f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH'¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\b\b\u0001\u0010\u0012\u001a\u00020\f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00062\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH'¢\u0006\u0004\b\u001e\u0010\u0011¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lvz0/d;", "", "", "notificationId", "", "isDismissed", "Lo53/i0;", "Lc83/a0;", "", "d", "(JZ)Lo53/i0;", "", "", "requestList", "notificationKeyList", "Luz0/f;", "b", "(Ljava/util/List;Ljava/util/List;)Lo53/i0;", MapboxMap.QFE_LIMIT, "", "cursor", "imageVersions", "Luz0/e;", "c", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)Lo53/i0;", "Luz0/h;", "a", "(ILjava/lang/String;Ljava/util/List;)Lo53/i0;", "requestKeyList", "Luz0/c;", JWKParameterNames.RSA_EXPONENT, "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @f("/notification-service/notification/inbox")
    i0<a0<h>> a(@t(MapboxMap.QFE_LIMIT) int limit, @t("cursor") String cursor, @t(TtmlNode.ATTR_ID) List<Integer> notificationKeyList);

    @f("/mobile-gateway/inbox/unreadBubble")
    i0<a0<uz0.f>> b(@t("req") List<Integer> requestList, @t(TtmlNode.ATTR_ID) List<Integer> notificationKeyList);

    @f("/mobile-gateway/inbox/v2/requests")
    i0<a0<e>> c(@t(MapboxMap.QFE_LIMIT) int limit, @t("cursor") String cursor, @t("req") List<Integer> requestList, @t("image-version") List<String> imageVersions);

    @p("/notification-service/notification/{notificationId}/dismiss/{isDismissed}")
    i0<a0<Unit>> d(@s("notificationId") long notificationId, @s("isDismissed") boolean isDismissed);

    @f("/mobile-gateway/inbox/v2/request/count")
    i0<a0<uz0.c>> e(@t("req") List<Integer> requestKeyList, @t("image-version") List<String> imageVersions);
}
