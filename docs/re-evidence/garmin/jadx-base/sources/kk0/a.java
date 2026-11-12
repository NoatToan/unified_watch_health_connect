package kk0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001JZ\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0015\u0010\u0013J<\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001f\u0010\u001cJ&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u000b2\b\b\u0001\u0010!\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J0\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010$\u001a\u00020\u0006H§@¢\u0006\u0004\b&\u0010'J \u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\b\b\u0001\u0010(\u001a\u00020\u001aH§@¢\u0006\u0004\b)\u0010*J \u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\b\b\u0001\u0010+\u001a\u00020\u001eH§@¢\u0006\u0004\b,\u0010-J0\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\u000e\b\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b0\u00101J*\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u00102\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020 H§@¢\u0006\u0004\b3\u00104J0\u00106\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010!\u001a\u00020 2\u000e\b\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b6\u00107J \u00108\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010!\u001a\u00020 H§@¢\u0006\u0004\b8\u0010#J0\u0010:\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u000e\b\u0001\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b:\u00101J0\u0010;\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\u000e\b\u0001\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b;\u00101J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u000bH§@¢\u0006\u0004\b=\u0010>J,\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00050\u000b2\u000e\b\u0001\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\bA\u0010BJ,\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00050\u000b2\u000e\b\u0001\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\bD\u0010BJ*\u0010E\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u001aH§@¢\u0006\u0004\bE\u0010FJ*\u0010G\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u001eH§@¢\u0006\u0004\bG\u0010HJ*\u0010J\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010I\u001a\u00020\u0006H§@¢\u0006\u0004\bJ\u0010KJ \u0010L\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0004\bL\u0010\u001cJ \u0010M\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u0006H§@¢\u0006\u0004\bM\u0010\u001cJ*\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010O\u001a\u00020NH§@¢\u0006\u0004\bQ\u0010RJ*\u0010T\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010S\u001a\u00020\u0006H§@¢\u0006\u0004\bT\u0010KJ0\u0010V\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u000e\b\u0001\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\bV\u00101J*\u0010W\u001a\b\u0012\u0004\u0012\u00020P0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010O\u001a\u00020NH§@¢\u0006\u0004\bW\u0010RJ*\u0010X\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010S\u001a\u00020\u0006H§@¢\u0006\u0004\bX\u0010KJ0\u0010Y\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\u000e\b\u0001\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\bY\u00101J*\u0010Z\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0004\bZ\u0010K¨\u0006[À\u0006\u0003"}, d2 = {"Lkk0/a;", "", "", "startIndex", MapboxMap.QFE_LIMIT, "", "", "statuses", "Lc80/u;", NotificationConstants.KEY_DATA_MIME_TYPE, "sortOrder", "Lc83/a0;", "Ljk0/s;", "B", "(IILjava/util/List;Lc80/u;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lfz0/c;", "onOrBeforeDate", "Ljk0/r;", "d", "(Lfz0/c;Lt13/d;)Ljava/lang/Object;", "Ljk0/l;", IntegerTokenConverter.CONVERTER_KEY, "Ljk0/k;", "A", "(IILjava/lang/String;Lt13/d;)Ljava/lang/Object;", "gearUUID", "Ljk0/x;", "D", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "collectionUUID", "Ljk0/j;", "p", "", "activityId", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(JLt13/d;)Ljava/lang/Object;", "displayName", "Ljk0/m;", "C", "(JLjava/lang/String;Lt13/d;)Ljava/lang/Object;", "gearDTO", JWKParameterNames.OCT_KEY_VALUE, "(Ljk0/x;Lt13/d;)Ljava/lang/Object;", "collectionDTO", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Ljk0/j;Lt13/d;)Ljava/lang/Object;", "gearUUIDs", "", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "gearId", "m", "(Ljava/lang/String;JLt13/d;)Ljava/lang/Object;", "uuids", "h", "(JLjava/util/List;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "activityTypePks", "s", "o", "Ljk0/u;", JWKParameterNames.RSA_EXPONENT, "(Lt13/d;)Ljava/lang/Object;", "gearTypes", "Ljk0/b;", "c", "(Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "Ljk0/a;", "z", "E", "(Ljava/lang/String;Ljk0/x;Lt13/d;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Ljk0/j;Lt13/d;)Ljava/lang/Object;", "gearStatus", "v", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "j", "a", "Lokhttp3/MultipartBody$Part;", "image", "Ljk0/n;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lt13/d;)Ljava/lang/Object;", "mediaUUID", "w", "mediaUUIDs", "b", "g", "x", "u", "f", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/gear-service/collection")
    Object A(@i83.t(TtmlNode.START) int i14, @i83.t(MapboxMap.QFE_LIMIT) int i15, @i83.t("sortOrder") String str, t13.d<? super c83.a0<List<jk0.k>>> dVar);

    @i83.f("/gear-service/gear/v2/list")
    Object B(@i83.t(TtmlNode.START) int i14, @i83.t(MapboxMap.QFE_LIMIT) int i15, @i83.t("gearStatuses") List<String> list, @i83.t("gearType") c80.u uVar, @i83.t("sortOrder") String str, t13.d<? super c83.a0<List<jk0.s>>> dVar);

    @i83.f("/gear-service/activity/v2/{activityId}/{displayName}")
    Object C(@i83.s("activityId") long j8, @i83.s("displayName") String str, t13.d<? super c83.a0<List<jk0.m>>> dVar);

    @i83.f("/gear-service/gear/v2/{gearUUID}")
    Object D(@i83.s("gearUUID") String str, t13.d<? super c83.a0<jk0.x>> dVar);

    @i83.p("/gear-service/gear/v2/{gearUUID}")
    Object E(@i83.s("gearUUID") String str, @i83.a jk0.x xVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.b("/gear-service/collection/{collectionUUID}")
    Object a(@i83.s("collectionUUID") String str, t13.d<? super c83.a0<Unit>> dVar);

    @i83.p("/gear-service/gear/v2/{gearUUID}/images/reorder")
    Object b(@i83.s("gearUUID") String str, @i83.a List<String> list, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/gear-service/gear/v2/default-choices")
    Object c(@i83.t("gearTypes") List<String> list, t13.d<? super c83.a0<List<jk0.b>>> dVar);

    @i83.f("/gear-service/gear/v2/available/{onOrBeforeDate}")
    Object d(@i83.s("onOrBeforeDate") fz0.c cVar, t13.d<? super c83.a0<List<jk0.r>>> dVar);

    @i83.f("/gear-service/gear/v2/user-gear-types")
    Object e(t13.d<? super c83.a0<jk0.u>> dVar);

    @i83.b("/gear-service/collection/{collectionUUID}/gear/{gearUUID}")
    Object f(@i83.s("collectionUUID") String str, @i83.s("gearUUID") String str2, t13.d<? super c83.a0<Unit>> dVar);

    @i83.o("/gear-service/collection/{collectionUUID}/image")
    @i83.l
    Object g(@i83.s("collectionUUID") String str, @i83.q MultipartBody.Part part, t13.d<? super c83.a0<jk0.n>> dVar);

    @i83.p("/gear-service/activity/v2/{activityId}/associated-gear")
    Object h(@i83.s("activityId") long j8, @i83.a List<String> list, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/gear-service/collection/available/{onOrBeforeDate}")
    Object i(@i83.s("onOrBeforeDate") fz0.c cVar, t13.d<? super c83.a0<List<jk0.l>>> dVar);

    @i83.b("/gear-service/gear/v2/{gearUUID}")
    Object j(@i83.s("gearUUID") String str, t13.d<? super c83.a0<Unit>> dVar);

    @i83.o("/gear-service/gear/v2")
    Object k(@i83.a jk0.x xVar, t13.d<? super c83.a0<jk0.x>> dVar);

    @i83.p("/gear-service/collection/{collectionUUID}")
    Object l(@i83.s("collectionUUID") String str, @i83.a jk0.j jVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.p("/gear-service/gear/unlink/{gearId}/activity/{activityId}")
    Object m(@i83.s("gearId") String str, @i83.s("activityId") long j8, t13.d<? super c83.a0<Unit>> dVar);

    @i83.p("/gear-service/collection/{collectionUUID}/gear-set")
    Object n(@i83.s("collectionUUID") String str, @i83.a List<String> list, t13.d<? super c83.a0<Unit>> dVar);

    @i83.o("/gear-service/collection/{collectionUUID}/activity-type-association/")
    Object o(@i83.s("collectionUUID") String str, @i83.a List<String> list, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/gear-service/collection/{collectionUUID}")
    Object p(@i83.s("collectionUUID") String str, t13.d<? super c83.a0<jk0.j>> dVar);

    @i83.f("/gear-service/activity/v2/{activityId}")
    Object q(@i83.s("activityId") long j8, t13.d<? super c83.a0<List<jk0.s>>> dVar);

    @i83.o("/gear-service/gear/v2/{gearUUID}/image")
    @i83.l
    Object r(@i83.s("gearUUID") String str, @i83.q MultipartBody.Part part, t13.d<? super c83.a0<jk0.n>> dVar);

    @i83.o("/gear-service/gear/v2/{gearUUID}/activity-type-association/")
    Object s(@i83.s("gearUUID") String str, @i83.a List<String> list, t13.d<? super c83.a0<Unit>> dVar);

    @i83.b("/gear-service/activity/v2/{activityId}/associated-gear")
    Object t(@i83.s("activityId") long j8, t13.d<? super c83.a0<Unit>> dVar);

    @i83.p("/gear-service/collection/{collectionUUID}/images/reorder")
    Object u(@i83.s("collectionUUID") String str, @i83.a List<String> list, t13.d<? super c83.a0<Unit>> dVar);

    @i83.p("/gear-service/gear/v2/{gearUUID}/status/{status}")
    Object v(@i83.s("gearUUID") String str, @i83.s("status") String str2, t13.d<? super c83.a0<Unit>> dVar);

    @i83.b("/gear-service/gear/v2/{gearUUID}/image/{mediaUUID}")
    Object w(@i83.s("gearUUID") String str, @i83.s("mediaUUID") String str2, t13.d<? super c83.a0<Unit>> dVar);

    @i83.b("/gear-service/collection/{collectionUUID}/image/{mediaUUID}")
    Object x(@i83.s("collectionUUID") String str, @i83.s("mediaUUID") String str2, t13.d<? super c83.a0<Unit>> dVar);

    @i83.o("/gear-service/collection")
    Object y(@i83.a jk0.j jVar, t13.d<? super c83.a0<jk0.j>> dVar);

    @i83.f("/gear-service/collection/default-choices")
    Object z(@i83.t("gearTypes") List<String> list, t13.d<? super c83.a0<List<jk0.a>>> dVar);
}
