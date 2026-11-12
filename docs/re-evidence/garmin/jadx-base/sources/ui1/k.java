package ui1;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\r¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lui1/k;", "", "", "deviceUnitId", "Lo53/i0;", "Lc83/a0;", "Lui1/b0;", "b", "(J)Lo53/i0;", "Lui1/a1;", JWKParameterNames.RSA_EXPONENT, "Lui1/d;", "c", "(JLt13/d;)Ljava/lang/Object;", "", "referenceId", "", "Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a;", "a", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lui1/j0;", "d", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k {
    @i83.f("/Job/GetUserJobStatuses/{referenceId}")
    Object a(@i83.s("referenceId") String str, t13.d<? super c83.a0<List<com.garmin.android.apps.connectmobile.device.setup.domain.model.a>>> dVar);

    @i83.f("/Users/GetUserDeviceState")
    o53.i0<c83.a0<b0>> b(@i83.t("unitId") long deviceUnitId);

    @i83.f("/Users/EmergencyInformation")
    Object c(@i83.t("unitId") long j8, t13.d<? super c83.a0<d>> dVar);

    @i83.f("/Subscription/User/SubscriptionInfo")
    Object d(@i83.t("unitId") long j8, t13.d<? super c83.a0<j0>> dVar);

    @i83.f("/Users/UseMessengerForActivation")
    o53.i0<c83.a0<a1>> e(@i83.t("unitId") long deviceUnitId);
}
