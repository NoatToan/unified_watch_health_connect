package pz0;

import c83.a0;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i83.f;
import i83.t;
import o53.i0;
import oz0.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lpz0/e;", "", "", TtmlNode.ATTR_ID, Action.KEY_ATTRIBUTE, "part", "Lo53/i0;", "Lc83/a0;", "Loz0/h;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e {
    @f("/youtube/v3/videos")
    i0<a0<h>> a(@t(TtmlNode.ATTR_ID) String id3, @t(Action.KEY_ATTRIBUTE) String key, @t("part") String part);
}
