package oc1;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i83.k;
import i83.o;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Loc1/a;", "", "", TtmlNode.TAG_BODY, "Lo53/i0;", "Lc83/a0;", "", "a", "(Ljava/lang/String;)Lo53/i0;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @k({"Content-Type: application/json"})
    @o("/device-service/devicemessage/messages")
    i0<a0<Unit>> a(@i83.a String body);
}
