package bx1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.c;
import i83.f;
import i83.t;
import java.util.List;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import yw1.g;
import yw1.h;
import yw1.i;
import yw1.j;
import yw1.k;
import yw1.l;
import yw1.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0083\u0001\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\u0011\u0010\u0012J}\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\u0015\u0010\u0016Jm\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0083\u0001\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\u001d\u0010\u0012J5\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000f0\u000e2\b\b\u0001\u0010!\u001a\u00020\u0006H'¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u000f0\u000eH'¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u000f0\u000eH'¢\u0006\u0004\b)\u0010'J?\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020*2\b\b\u0001\u0010\u0004\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020\u0006H'¢\u0006\u0004\b-\u0010.J?\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020*2\b\b\u0001\u0010\u0004\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020\u0006H'¢\u0006\u0004\b/\u0010.J/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u000f0\u000e2\b\b\u0001\u00100\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020\u0006H'¢\u0006\u0004\b2\u00103J?\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020*2\b\b\u0001\u0010\u0004\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020\u0006H'¢\u0006\u0004\b4\u0010.J/\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020*2\b\b\u0001\u0010\u0004\u001a\u00020*H'¢\u0006\u0004\b6\u00107¨\u00068À\u0006\u0003"}, d2 = {"Lbx1/a;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "", "metrics", "activityTypes", "excludedActivitySubType", "", "standardizedUnits", "groupByParentActivityType", "aggregation", "Lo53/i0;", "Lc83/a0;", "Lyw1/g;", "g", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;)Lo53/i0;", "activities", "groupByEventType", "a", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/String;)Lo53/i0;", "m", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;)Lo53/i0;", "activityType", "groupByActivityType", "f", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)Lo53/i0;", "l", "Lyw1/s;", "d", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)Lo53/i0;", "calendarDate", "Lyw1/k;", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;)Lo53/i0;", "Lyw1/h;", "c", "()Lo53/i0;", "Lyw1/i;", "b", "Lfz0/c;", "sport", "Lyw1/l;", "j", "(Lfz0/c;Lfz0/c;Ljava/lang/String;)Lo53/i0;", JWKParameterNames.OCT_KEY_VALUE, "date", "Lyw1/j;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;Ljava/lang/String;)Lo53/i0;", "h", "Lyw1/a;", IntegerTokenConverter.CONVERTER_KEY, "(Lfz0/c;Lfz0/c;)Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/fitnessstats-service/activity")
    i0<a0<List<g>>> a(@t("startDate") LocalDate startDate, @t("endDate") LocalDate endDate, @t("metric") List<String> metrics, @t("activityType") List<String> activities, @t("standardizedUnits") boolean standardizedUnits, @t("groupByParentActivityType") boolean groupByParentActivityType, @t("groupByEventType") boolean groupByEventType, @t("aggregation") String aggregation);

    @f("/personalrecord-service/personalrecord?includeHistory=true")
    i0<a0<List<i>>> b();

    @f("/personalrecord-service/personalrecordtype")
    i0<a0<List<h>>> c();

    @f("/fitnessstats-service/fitnessstats/activity/exercises/daily/strength_training")
    i0<a0<List<s>>> d(@t("startDate") LocalDate startDate, @t("endDate") LocalDate endDate);

    @f("/metrics-service/metrics/maxmet/latest/hbase/{date}")
    i0<a0<j>> e(@i83.s("date") c date, @t("sport") String sport);

    @f("/fitnessstats-service/activity")
    i0<a0<List<g>>> f(@t("startDate") LocalDate startDate, @t("endDate") LocalDate endDate, @t("activityType") String activityType, @t("metric") List<String> metrics, @t("standardizedUnits") boolean standardizedUnits, @t("groupByActivityType") boolean groupByActivityType, @t("aggregation") String aggregation);

    @f("/fitnessstats-service/activity")
    i0<a0<List<g>>> g(@t("startDate") LocalDate startDate, @t("endDate") LocalDate endDate, @t("metric") List<String> metrics, @t("activityType") List<String> activityTypes, @t("excludedActivitySubType") List<String> excludedActivitySubType, @t("standardizedUnits") boolean standardizedUnits, @t("groupByParentActivityType") boolean groupByParentActivityType, @t("aggregation") String aggregation);

    @f("/biometric-service/stats/functionalThresholdPower/range/{startDate}/{endDate}")
    i0<a0<List<l>>> h(@i83.s("startDate") c startDate, @i83.s("endDate") c endDate, @t("sport") String sport);

    @f("/biometric-service/criticalSwimSpeed/range/{startDate}/{endDate}")
    i0<a0<yw1.a>> i(@i83.s("startDate") c startDate, @i83.s("endDate") c endDate);

    @f("/biometric-service/stats/lactateThresholdSpeed/range/{startDate}/{endDate}")
    i0<a0<List<l>>> j(@i83.s("startDate") c startDate, @i83.s("endDate") c endDate, @t("sport") String sport);

    @f("/biometric-service/stats/lactateThresholdHeartRate/range/{startDate}/{endDate}")
    i0<a0<List<l>>> k(@i83.s("startDate") c startDate, @i83.s("endDate") c endDate, @t("sport") String sport);

    @f("/fitnessstats-service/activity")
    i0<a0<List<g>>> l(@t("startDate") LocalDate startDate, @t("endDate") LocalDate endDate, @t("metric") List<String> metrics, @t("activityType") List<String> activityTypes, @t("excludedActivitySubType") List<String> excludedActivitySubType, @t("standardizedUnits") boolean standardizedUnits, @t("groupByParentActivityType") boolean groupByActivityType, @t("aggregation") String aggregation);

    @f("/fitnessstats-service/activity")
    i0<a0<List<g>>> m(@t("startDate") LocalDate startDate, @t("endDate") LocalDate endDate, @t("metric") List<String> metrics, @t("activityType") String activityTypes, @t("standardizedUnits") boolean standardizedUnits, @t("groupByParentActivityType") boolean groupByParentActivityType, @t("aggregation") String aggregation);

    @f("/fitnessage-service/fitnessage/v2/{calendarDate}")
    i0<a0<k>> n(@i83.s("calendarDate") String calendarDate);
}
