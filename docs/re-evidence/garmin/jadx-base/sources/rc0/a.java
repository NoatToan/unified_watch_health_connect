package rc0;

import c83.a0;
import i83.f;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import sc0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00030\u0002H'¢\u0006\u0004\b\t\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lrc0/a;", "", "Lo53/i0;", "Lc83/a0;", "Lsc0/c;", "b", "()Lo53/i0;", "", "Lsc0/a;", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/device-service/sensors")
    i0<a0<List<sc0.a>>> a();

    @f("/userpreference-service/Activity.userHasSensors")
    i0<a0<c>> b();
}
