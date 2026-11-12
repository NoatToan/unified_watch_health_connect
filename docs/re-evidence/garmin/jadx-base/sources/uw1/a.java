package uw1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.net.HttpHeaders;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tw1.m;
import tw1.o;
import tw1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00030\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0017\u0010\u000fJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0018\u001a\u00020\fH§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0018\u001a\u00020\fH§@¢\u0006\u0004\b\u001c\u0010\u001aJ>\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u001f\u001a\u00020\u0010H§@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0018\u001a\u00020\fH§@¢\u0006\u0004\b#\u0010\u001a¨\u0006$À\u0006\u0003"}, d2 = {"Luw1/a;", "", "Lo53/i0;", "Lc83/a0;", "Ltw1/o;", "a", "()Lo53/i0;", "Ltw1/e;", "phasedTrainingPlanProfileDTO", "Ltw1/m;", "h", "(Ltw1/e;)Lo53/i0;", "", "planId", "g", "(J)Lo53/i0;", "", "locale", "", "Ltw1/c;", "d", "(Ljava/lang/String;)Lo53/i0;", "", "b", "trainingPlanId", "c", "(JLt13/d;)Ljava/lang/Object;", "Lix1/e;", "f", "workoutSchedulePk", "scheduleDate", "contentType", "Ltw1/r;", IntegerTokenConverter.CONVERTER_KEY, "(JJLjava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_EXPONENT, "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/trainingplan-service/trainingplan/plans")
    i0<a0<o>> a();

    @i83.b("/trainingplan-service/trainingplan/trainingplan/{planId}")
    i0<a0<Unit>> b(@s("planId") long planId);

    @i83.f("/trainingplan-service/trainingplan/strength/{trainingPlanId}")
    Object c(@s("trainingPlanId") long j8, t13.d<? super a0<m>> dVar);

    @i83.f("/web-data/training-plans/phased-training-plans/{locale}.json")
    i0<a0<List<tw1.c>>> d(@s("locale") String locale);

    @i83.b("/trainingplan-service/trainingplan/strength/{trainingPlanId}/deload")
    Object e(@s("trainingPlanId") long j8, t13.d<? super a0<Unit>> dVar);

    @i83.f("/trainingplan-service/trainingplan/strength/{trainingPlanId}/benchmarks")
    Object f(@s("trainingPlanId") long j8, t13.d<? super a0<ix1.e>> dVar);

    @i83.f("/trainingplan-service/trainingplan/phased/{planId}")
    i0<a0<m>> g(@s("planId") long planId);

    @i83.o("/trainingplan-service/trainingplan/phased/cycling/trainingplan")
    i0<a0<m>> h(@i83.a tw1.e phasedTrainingPlanProfileDTO);

    @i83.o("/trainingplan-service/trainingplan/moveWorkoutTask/{trainingPlanId}")
    Object i(@s("trainingPlanId") long j8, @t("workoutSchedulePk") long j14, @t("scheduleDate") String str, @i83.i(HttpHeaders.CONTENT_TYPE) String str2, t13.d<? super a0<r>> dVar);
}
