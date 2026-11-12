package us0;

import c83.a0;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import com.garmin.android.apps.connectmobile.userprofile.model.BiometricProfileDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.c;
import i83.f;
import i83.i;
import i83.s;
import i83.t;
import java.util.List;
import o61.b;
import o61.h;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007J:\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011JV\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\f2\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\f2\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0018JV\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\f2\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0018JV\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\f2\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0018JZ\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\u000e\b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!À\u0006\u0003"}, d2 = {"Lus0/a;", "", "", "userDisplayName", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO;", "c", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "userId", "", "Lvs0/b;", "d", "Lfz0/c;", "date", "sport", "Lo61/h;", "f", "(Ljava/lang/String;Lfz0/c;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "startDate", "endDate", "sports", "aggregation", "Lo61/b;", "a", "(Ljava/lang/String;Lfz0/c;Lfz0/c;Ljava/util/List;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "g", "h", JWKParameterNames.RSA_EXPONENT, "activityType", "metric", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "b", "(Ljava/lang/String;Ljava/lang/String;Lfz0/c;Lfz0/c;Ljava/lang/String;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/biometric-service/stats/lactateThresholdHeartRate/range/{startDate}/{endDate}")
    Object a(@i("USER_ID") String str, @s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, @t("aggregation") String str2, d<? super a0<List<b>>> dVar);

    @f("/biometric-service/stats/")
    Object b(@i("USER_ID") String str, @t("aggregation") String str2, @t("startDate") c cVar, @t("endDate") c cVar2, @t("activityType") String str3, @t("metric") List<String> list, d<? super a0<LactateSummaryMeasurementsDTO>> dVar);

    @f("/userprofile-service/biometric/current/{userDisplayName}")
    Object c(@s("userDisplayName") String str, d<? super a0<BiometricProfileDTO>> dVar);

    @f("/biometric-service/biometric/latestLactateThreshold")
    Object d(@i("USER_ID") String str, d<? super a0<List<vs0.b>>> dVar);

    @f("/biometric-service/stats/functionalThresholdPower/range/{startDate}/{endDate}")
    Object e(@i("USER_ID") String str, @s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, @t("aggregation") String str2, d<? super a0<List<b>>> dVar);

    @f("/biometric-service/biometric/powerToWeight/latest/{date}")
    Object f(@i("USER_ID") String str, @s("date") c cVar, @t("sport") String str2, d<? super a0<List<h>>> dVar);

    @f("/biometric-service/stats/lactateThresholdSpeed/range/{startDate}/{endDate}")
    Object g(@i("USER_ID") String str, @s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, @t("aggregation") String str2, d<? super a0<List<b>>> dVar);

    @f("/biometric-service/stats/powerToWeight/range/{startDate}/{endDate}")
    Object h(@i("USER_ID") String str, @s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, @t("aggregation") String str2, d<? super a0<List<b>>> dVar);
}
