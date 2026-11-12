package dg;

import android.webkit.MimeTypeMap;
import d53.w;
import java.util.Locale;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldg/n;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f59492a = new n();

    private n() {
    }

    public static String a(String str) {
        if (w.J(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (String) o.f59493a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static String b(String str) {
        if (w.J(str)) {
            return null;
        }
        String strH0 = w.h0(w.h0(str, '#'), '?');
        return a(w.d0('.', w.d0(IOUtils.DIR_SEPARATOR_UNIX, strH0, strH0), ""));
    }
}
