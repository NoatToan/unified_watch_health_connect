package fu1;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfu1/f;", "Lfu1/e;", "", "videoId", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2) {
        super(str2);
        str.getClass();
        str2.getClass();
        this.f73513b = str;
    }

    public final String a() {
        return e0.g("query videos{Videos(videoKey:\"", this.f73513b, "\", locale:\"", this.f73512a, "\"){fields{videoKey, videoUrl, videoTitle, videoDuration, subtitleUrl, videoThumbnailUrl}}}");
    }
}
