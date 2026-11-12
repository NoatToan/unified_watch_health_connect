package tj1;

import c83.a0;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ltj1/f;", "", "Ltj1/q;", TtmlNode.TAG_BODY, "Lo53/i0;", "Lc83/a0;", "", "b", "(Ltj1/q;)Lo53/i0;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "Ltj1/g;", "a", "(Ljava/lang/String;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @i83.f("/v1/Info/SupportedCountries")
    i0<a0<g>> a(@i83.t("assistanceType") String type);

    @i83.o("/v1/customer/validate")
    i0<a0<Unit>> b(@i83.a q body);
}
