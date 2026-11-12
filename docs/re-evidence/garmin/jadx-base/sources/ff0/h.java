package ff0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lff0/h;", "", "", "deviceId", "", "featureType", "", "latitude", "longitude", "Lo53/i0;", "Lc83/a0;", "a", "(JLjava/lang/String;DD)Lo53/i0;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface h {
    @i83.f("/device-service/location-restriction-feature/{deviceId}/{featureType}/featureStatus?")
    i0<a0<String>> a(@i83.s("deviceId") long deviceId, @i83.s("featureType") String featureType, @i83.t("latitude") double latitude, @i83.t("longitude") double longitude);
}
