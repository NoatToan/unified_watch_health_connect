package p41;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lp41/a;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "paceBandDTO", "Lc83/a0;", "a", "(Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;Lt13/d;)Ljava/lang/Object;", "", "pacebandId", "b", "(JLcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;Lt13/d;)Ljava/lang/Object;", "", "f", "(JLt13/d;)Ljava/lang/Object;", "d", "courseId", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "c", "(Ljava/lang/Long;Lt13/d;)Ljava/lang/Object;", "deviceId", JWKParameterNames.RSA_EXPONENT, "(JJLt13/d;)Ljava/lang/Object;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/course-service/pacebands")
    Object a(@i83.a com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar, d<? super a0<com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> dVar);

    @p("/course-service/pacebands/{pacebandId}")
    Object b(@s("pacebandId") long j8, @i83.a com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar, d<? super a0<com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> dVar);

    @f("/course-service/pacebands/summaries")
    Object c(@t("courseId") Long l14, d<? super a0<List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b>>> dVar);

    @f("/course-service/pacebands/{pacebandId}")
    Object d(@s("pacebandId") long j8, d<? super a0<com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> dVar);

    @o("/course-service/pacebands/{pacebandId}/device/{deviceId}")
    Object e(@s("pacebandId") long j8, @s("deviceId") long j14, d<? super a0<Unit>> dVar);

    @i83.b("/course-service/pacebands/{pacebandId}")
    Object f(@s("pacebandId") long j8, d<? super a0<Unit>> dVar);
}
