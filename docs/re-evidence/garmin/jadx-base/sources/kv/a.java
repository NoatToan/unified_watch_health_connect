package kv;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i83.f;
import i83.p;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lkv/a;", "", "", "deviceUnitID", "Liv/a;", TtmlNode.TAG_BODY, "Lo53/i0;", "Lc83/a0;", "", "a", "(JLiv/a;)Lo53/i0;", "b", "(J)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @p("/devicesettings-service/device/{deviceUnitID}")
    i0<a0<Unit>> a(@s("deviceUnitID") long deviceUnitID, @i83.a iv.a body);

    @f("/devicesettings-service/device/{deviceUnitID}")
    i0<a0<iv.a>> b(@s("deviceUnitID") long deviceUnitID);
}
