package oi1;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i83.o;
import i83.p;
import o53.i0;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Loi1/f;", "", "", "value", "Lo53/i0;", "Lc83/a0;", "", "b", "(Ljava/lang/String;)Lo53/i0;", "Lokhttp3/RequestBody;", TtmlNode.TAG_BODY, "a", "(Lokhttp3/RequestBody;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @p("/userprofile-service/userprofile/timezone/")
    i0<a0<String>> a(@i83.a RequestBody body);

    @o("userprofile-service/userprofile/locale")
    @i83.e
    i0<a0<Unit>> b(@i83.c("value") String value);
}
