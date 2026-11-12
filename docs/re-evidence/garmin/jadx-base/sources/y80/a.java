package y80;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ly80/a;", "", "", "deviceUnitID", "Lo53/i0;", "Lc83/a0;", "", "Lz80/g;", "a", "(J)Lo53/i0;", TtmlNode.TAG_BODY, "", "b", "(JLjava/util/List;)Lo53/i0;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/devicesettings-service/device/displayed-activities/{deviceUnitID}")
    o53.i0<c83.a0<List<z80.g>>> a(@i83.s("deviceUnitID") long deviceUnitID);

    @i83.p("/devicesettings-service/device/displayed-activities/{deviceUnitID}")
    o53.i0<c83.a0<Unit>> b(@i83.s("deviceUnitID") long deviceUnitID, @i83.a List<z80.g> body);
}
