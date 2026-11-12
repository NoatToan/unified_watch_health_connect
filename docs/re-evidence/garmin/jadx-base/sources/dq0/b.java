package dq0;

import c83.a0;
import i83.o;
import o53.i0;
import p005kotlin.Metadata;
import tj1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Ldq0/b;", "", "Ljq0/b;", "request", "Lo53/i0;", "Lc83/a0;", "Ltj1/u;", "b", "(Ljq0/b;)Lo53/i0;", "Ljq0/a;", "c", "(Ljq0/a;)Lo53/i0;", "Ljq0/c;", "a", "(Ljq0/c;)Lo53/i0;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("/emergency-assistance/fitness/api/v2/endEmergency")
    i0<a0<u>> a(@i83.a jq0.c request);

    @o("/emergency-assistance/fitness/api/v2/legacy/sendCyclingIncident")
    i0<a0<u>> b(@i83.a jq0.b request);

    @o("/emergency-assistance/fitness/api/v2/startAssistance")
    i0<a0<u>> c(@i83.a jq0.a request);
}
