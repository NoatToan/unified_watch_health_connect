package kv1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H'¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b&\u0010\u0012Je\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00130\u00060\u00052\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\b\b\u0001\u0010+\u001a\u00020*2\b\b\u0001\u0010,\u001a\u00020*H'¢\u0006\u0004\b.\u0010/Jy\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00060\u00052\b\b\u0001\u00101\u001a\u0002002\b\b\u0001\u00102\u001a\u0002002\b\b\u0001\u00103\u001a\u00020\u00022\u000e\b\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b:\u0010;JC\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00130\u00060\u00052\b\b\u0001\u0010<\u001a\u00020\u000f2\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b@\u0010AJ%\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00060\u00052\b\b\u0001\u0010B\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010F\u001a\u00020\u000fH'¢\u0006\u0004\bG\u0010\u0012J/\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010H\u001a\u00020\u0002H'¢\u0006\u0004\bI\u0010JJ/\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010L\u001a\u00020KH'¢\u0006\u0004\bM\u0010N¨\u0006OÀ\u0006\u0003"}, d2 = {"Lkv1/a;", "", "", "activityType", "metricType", "Lo53/i0;", "Lc83/a0;", "Ljv1/y;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Ljv1/j;", "planDTO", "Ltw1/m;", JWKParameterNames.RSA_MODULUS, "(Ljv1/j;)Lo53/i0;", "", "planId", "b", "(J)Lo53/i0;", "", "Ltw1/h;", "supplementalSports", "", "a", "(JLjava/util/List;)Lo53/i0;", "Ltw1/t;", "targetVersion", "j", "(JLtw1/t;)Lo53/i0;", "Lxw1/c;", "trainingPlan", "Lfu1/l;", "g", "(Lxw1/c;)Lo53/i0;", "Ltw1/p;", "statusDTO", JWKParameterNames.OCT_KEY_VALUE, "(JLtw1/p;)Lo53/i0;", IntegerTokenConverter.CONVERTER_KEY, "startDate", "endDate", "metrics", "", "standardizedUnits", "groupByParentActivityType", "Lav1/d;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)Lo53/i0;", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "locale", "categories", "types", "levels", "subTypes", "version", "Ltw1/o;", "h", "(IILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "trainingPlanId", "startScheduledDate", "endScheduledDate", "Lav1/h;", "m", "(JLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "contentRefUrl", "Ljv1/c0;", "o", "(Ljava/lang/String;)Lo53/i0;", "contentId", "f", "swimAbility", "c", "(JLjava/lang/String;)Lo53/i0;", "Ltw1/l;", "trainingLevelDTO", JWKParameterNames.RSA_EXPONENT, "(JLtw1/l;)Lo53/i0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.p("/trainingplan-service/trainingplan/fbt-adaptive/{planId}/supplementalSports")
    i0<c83.a0<Unit>> a(@i83.s("planId") long planId, @i83.a List<tw1.h> supplementalSports);

    @i83.f("/trainingplan-service/trainingplan/fbt-adaptive/{planId}")
    i0<c83.a0<tw1.m>> b(@i83.s("planId") long planId);

    @i83.p("/trainingplan-service/trainingplan/fbt-adaptive/{planId}/swimAbility")
    i0<c83.a0<Unit>> c(@i83.s("planId") long planId, @i83.a String swimAbility);

    @i83.f("/fitnessstats-service/activity/training/recent/{activityType}")
    i0<c83.a0<jv1.y>> d(@i83.s("activityType") String activityType, @i83.t("metric") String metricType);

    @i83.p("/trainingplan-service/trainingplan/fbt-adaptive/{planId}/trainingLevel")
    i0<c83.a0<Unit>> e(@i83.s("planId") long planId, @i83.a tw1.l trainingLevelDTO);

    @i83.p("trainingcontent-service/media-content/{contentId}/seen")
    i0<c83.a0<Unit>> f(@i83.s("contentId") long contentId);

    @i83.o("/atp/setup/create")
    i0<c83.a0<fu1.l>> g(@i83.a xw1.c trainingPlan);

    @i83.k({"Content-Type: application/x-www-form-urlencoded"})
    @i83.o("/trainingplan-service/trainingplan/search")
    i0<c83.a0<tw1.o>> h(@i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit, @i83.t("locale") String locale, @i83.t("categories") List<String> categories, @i83.t("types") String types, @i83.t("levels") String levels, @i83.t("subTypes") String subTypes, @i83.t("version") String version);

    @i83.b("/trainingplan-service/trainingplan/trainingplan/{planId}")
    i0<c83.a0<Unit>> i(@i83.s("planId") long planId);

    @i83.p("/trainingplan-service/trainingplan/fbt-adaptive/{planId}/trainingVersion")
    i0<c83.a0<Unit>> j(@i83.s("planId") long planId, @i83.a tw1.t targetVersion);

    @i83.p("/trainingplan-service/trainingplan/fbt-adaptive/{planId}/trainingStatus")
    i0<c83.a0<Unit>> k(@i83.s("planId") long planId, @i83.a tw1.p statusDTO);

    @i83.f("/fitnessstats-service/activity/all")
    i0<c83.a0<List<av1.d>>> l(@i83.t("startDate") String startDate, @i83.t("endDate") String endDate, @i83.t("activityType") String activityType, @i83.t("metric") List<String> metrics, @i83.t("standardizedUnits") boolean standardizedUnits, @i83.t("groupByParentActivityType") boolean groupByParentActivityType);

    @i83.f("trainingcontent-service/media-content")
    i0<c83.a0<List<av1.h>>> m(@i83.t("trainingPlanId") long trainingPlanId, @i83.t("startScheduledDate") String startScheduledDate, @i83.t("endScheduledDate") String endScheduledDate);

    @i83.o("/trainingplan-service/trainingplan/fbt-adaptive")
    i0<c83.a0<tw1.m>> n(@i83.a jv1.j planDTO);

    @i83.f
    i0<c83.a0<jv1.c0>> o(@i83.y String contentRefUrl);
}
