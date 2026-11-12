package mh2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmh2/k;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum k {
    BODY(TtmlNode.TAG_BODY),
    BULLET("bullet"),
    DISCLOSURE("disclosure"),
    INFO("info"),
    LINK("link"),
    SUBTITLE("subtitle"),
    TITLE("title");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118633a;

    k(String str) {
        this.f118633a = str;
    }
}
