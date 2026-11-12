package jp1;

import c83.a0;
import i83.s;
import i83.t;
import ip1.h;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH'¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Ljp1/a;", "", "", "deviceId", "Lfz0/c;", "localStartDate", "localEndDate", "", "singleDayView", "Lo53/i0;", "Lc83/a0;", "Lip1/c;", "c", "(JLfz0/c;Lfz0/c;Z)Lo53/i0;", "Lfz0/e;", "startDateTime", "endDateTime", "Lip1/b;", "b", "(JLfz0/e;Lfz0/e;)Lo53/i0;", "Lip1/h;", "a", "(JLfz0/c;Lfz0/c;)Lo53/i0;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/device-service/devicemonitoring/solargain/{deviceId}/{startDateTime}/{endDateTime}")
    i0<a0<h>> a(@s("deviceId") long deviceId, @s("startDateTime") fz0.c startDateTime, @s("endDateTime") fz0.c endDateTime);

    @i83.f("/device-service/devicemonitoring/solarinput/{deviceId}/timestamp-range/{startDateTime}/{endDateTime}")
    i0<a0<ip1.b>> b(@s("deviceId") long deviceId, @s("startDateTime") fz0.e startDateTime, @s("endDateTime") fz0.e endDateTime);

    @i83.f("/mobile-gateway/solar/{deviceId}/{localStartDate}/{localEndDate}")
    i0<a0<ip1.c>> c(@s("deviceId") long deviceId, @s("localStartDate") fz0.c localStartDate, @s("localEndDate") fz0.c localEndDate, @t("singleDayView") boolean singleDayView);
}
