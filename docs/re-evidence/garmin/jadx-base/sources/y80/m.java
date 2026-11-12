package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ly80/m;", "", "", "deviceId", "", "productNumber", "deviceDescription", "Lz80/d;", "a", "(JLjava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "b", "(Lt13/d;)Ljava/lang/Object;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m {
    @i83.k({"Content-Type: application/x-www-form-urlencoded; charset=utf-8"})
    @i83.f("/device-service/deviceregistration/deviceType/general-info/{deviceId}")
    Object a(@i83.s("deviceId") long j8, @i83.t("productNumber") String str, @i83.t("deviceDescription") String str2, t13.d<? super z80.d> dVar);

    @i83.f("/device-service/devicelist/devices")
    Object b(t13.d<? super String> dVar);
}
