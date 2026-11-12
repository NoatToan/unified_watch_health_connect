package tj1;

import c83.a0;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ltj1/m;", "", "", "lat", "lon", "Lo53/i0;", "Lc83/a0;", "Ltj1/l;", "a", "(DD)Lo53/i0;", "", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m {
    @i83.f("/geocoding-service/geocoding/reverse")
    i0<a0<l>> a(@i83.t("lat") double lat, @i83.t("lon") double lon);

    @i83.f("/geocoding-service/geocoding/reverse/all")
    i0<a0<List<l>>> b(@i83.t("lat") double lat, @i83.t("lon") double lon);
}
