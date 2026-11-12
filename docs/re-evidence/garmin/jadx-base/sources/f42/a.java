package f42;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import h42.e;
import i83.f;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JQ\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lf42/a;", "", "", "latitude", "longitude", "", "targetTime", "", "tempUnit", "speedUnit", "Lo53/i0;", "Lc83/a0;", "Lh42/e;", "b", "(IIJLjava/lang/String;Ljava/lang/String;)Lo53/i0;", TtmlNode.START, "duration", "Lh42/b;", "a", "(IIJI)Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("weather/v2/raceday/forecast")
    i0<a0<h42.b>> a(@t("lat") int latitude, @t("lon") int longitude, @t(TtmlNode.START) long start, @t("duration") int duration);

    @f("weather/v2/historic/historicalCondition")
    i0<a0<e>> b(@t("lat") int latitude, @t("lon") int longitude, @t("targetTime") long targetTime, @t("tempUnit") String tempUnit, @t("speedUnit") String speedUnit);
}
