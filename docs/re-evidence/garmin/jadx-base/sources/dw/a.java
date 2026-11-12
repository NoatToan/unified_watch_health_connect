package dw;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.k;
import i83.p;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0002H'¢\u0006\u0004\b\t\u0010\u0006J%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Ldw/a;", "", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "b", "()Lo53/i0;", "d", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;", "a", "trainingStatusDeviceDTO", "", "c", "(Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;)Lo53/i0;", "", TtmlNode.TAG_BODY, JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/userpreference-service/TrainingStatus.last.device")
    i0<a0<TrainingStatusDeviceDTO>> a();

    @f("/userpreference-service/WellnessAutoActivity.createNonHrActivity")
    i0<a0<AutoActivityDetectDTO>> b();

    @p("/userpreference-service/TrainingStatus.last.device")
    i0<a0<Unit>> c(@i83.a TrainingStatusDeviceDTO trainingStatusDeviceDTO);

    @f("/userpreference-service/WellnessAutoActivity.defaultNonHrActivityCreation")
    i0<a0<AutoActivityDetectDTO>> d();

    @k({"Content-Type: application/json"})
    @p("/userpreference-service/WellnessAutoActivity.createNonHrActivity")
    i0<a0<Unit>> e(@i83.a String body);
}
