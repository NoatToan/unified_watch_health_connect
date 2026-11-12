package defpackage;

import android.webkit.MimeTypeMap;
import coil.util.Utils;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class zxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MimeTypeMap f41776a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f41777b = ImmutableMap.of(Utils.MIME_TYPE_HEIF, "heif", Utils.MIME_TYPE_HEIC, "heic");
    public static final Map<String, String> c = ImmutableMap.of("heif", Utils.MIME_TYPE_HEIF, "heic", Utils.MIME_TYPE_HEIC);

    public static String a(String str) {
        String str2 = c.get(str);
        return str2 != null ? str2 : f41776a.getMimeTypeFromExtension(str);
    }
}
