package lj0;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f112975b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f112976a = b.RESPONSE_TYPE_STRING;

    public enum b {
        RESPONSE_TYPE_STRING,
        RESPONSE_TYPE_BINARY_OUTPUT_STREAM
    }

    private e() {
    }

    public static e a() {
        if (f112975b == null) {
            f112975b = new e();
        }
        return f112975b;
    }

    public static MediaType b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MediaType mediaType = gz0.a.f80401a;
        if (str.equalsIgnoreCase(mediaType.getMediaType())) {
            return mediaType;
        }
        MediaType mediaType2 = gz0.a.f80402b;
        if (str.equalsIgnoreCase(mediaType2.getMediaType())) {
            return mediaType2;
        }
        MediaType mediaType3 = gz0.a.f80403c;
        if (str.equalsIgnoreCase(mediaType3.getMediaType())) {
            return mediaType3;
        }
        MediaType mediaType4 = gz0.a.f80404d;
        if (str.equalsIgnoreCase(mediaType4.getMediaType())) {
            return mediaType4;
        }
        MediaType mediaType5 = gz0.a.f80405e;
        if (str.equalsIgnoreCase(mediaType5.getMediaType()) || str.contains("application/x-www-form-urlencoded")) {
            return mediaType5;
        }
        MediaType mediaType6 = gz0.a.f80406f;
        if (str.equalsIgnoreCase(mediaType6.getMediaType())) {
            return mediaType6;
        }
        if (str.equalsIgnoreCase("application/json-patch+json")) {
            return MediaType.get("application/json-patch+json");
        }
        MediaType mediaType7 = gz0.a.f80407g;
        if (str.equalsIgnoreCase(String.valueOf(mediaType7))) {
            return mediaType7;
        }
        return null;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f112977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Exception f112979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, List<String>> f112980d;

        public a(i iVar, Object obj, int i14, Map<String, List<String>> map) {
            this.f112977a = obj;
            this.f112978b = i14;
            this.f112979c = null;
            this.f112980d = map;
        }

        public a() {
        }

        public a(i iVar, Object obj, int i14, Exception exc) {
            this.f112977a = obj;
            this.f112978b = i14;
            this.f112979c = exc;
        }
    }
}
