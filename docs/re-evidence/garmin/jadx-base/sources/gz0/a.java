package gz0;

import com.google.android.exoplayer2.util.MimeTypes;
import okhttp3.MediaType;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgz0/a;", "", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f80401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MediaType f80402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f80403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MediaType f80404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final MediaType f80405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final MediaType f80406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MediaType f80407g;

    static {
        new a();
        MediaType.Companion companion = MediaType.INSTANCE;
        f80401a = companion.parse("text/plain");
        f80402b = companion.parse("application/json; charset=utf-8");
        f80403c = companion.parse("application/xml; charset=utf-8");
        f80404d = companion.parse("application/octet-stream");
        f80405e = companion.parse("application/x-www-form-urlencoded; charset=utf-8");
        f80406f = companion.parse("multipart/form-data");
        f80407g = companion.parse(MimeTypes.AUDIO_MPEG);
    }

    private a() {
    }
}
