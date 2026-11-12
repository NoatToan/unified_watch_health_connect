package m20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lm20/a;", "", "Lm20/b;", "request", "Lo53/i0;", "Lc83/a0;", "Lm20/d;", "a", "(Lm20/b;)Lo53/i0;", "Lm20/c;", "c", "(Lm20/c;)Lo53/i0;", "b", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.o("/services/template/emergency-assistance/emergency-contact/accept-decline/sms")
    o53.i0<c83.a0<d>> a(@i83.a b request);

    @i83.o("/services/template/livetrack/livetrack-contact/contact-request-sms")
    o53.i0<c83.a0<d>> b(@i83.a b request);

    @i83.o("/services/template/emergency-assistance/emergency-contact/managed-accounts/accept-decline/sms")
    o53.i0<c83.a0<d>> c(@i83.a c request);
}
