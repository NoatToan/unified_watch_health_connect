package o00;

import c83.d;
import com.google.firebase.perf.FirebasePerformance;
import i83.h;
import i83.o;
import p005kotlin.Metadata;
import sz0.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lo00/a;", "", "Lsz0/r0;", "notificationDTO", "Lc83/d;", "Ljava/lang/Void;", "a", "(Lsz0/r0;)Lc83/d;", "pushSettingsDTO", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/pushnotification-service/pushnotification/v2/register")
    d<Void> a(@i83.a r0 notificationDTO);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/pushnotification-service/pushnotification/v2/unregister")
    d<Void> b(@i83.a r0 pushSettingsDTO);
}
