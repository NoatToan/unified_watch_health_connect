package cp;

import am.j;
import android.content.Context;
import android.widget.ImageView;
import c22.v0;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u;
import zp0.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcp/a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f54870a;

    static {
        new a();
        f54870a = new String[]{"jpg", "jpeg", "png", "gif", "bmp", "wbmp"};
    }

    private a() {
    }

    public static final void a(Context context, String str, ImageView imageView, b bVar) {
        String lowerCase;
        context.getClass();
        str.getClass();
        imageView.getClass();
        int i14 = v0.f23289a;
        String extension = FilenameUtils.getExtension(str);
        String strG0 = extension != null ? w.g0(extension, CallerData.NA) : null;
        if (strG0 != null) {
            lowerCase = strG0.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        c cVar = new c(context);
        cVar.f206570j = 0;
        cVar.f206565e = str;
        cVar.f206566f = str;
        cVar.f206575o = bVar;
        if (s.g(lowerCase, "gif")) {
            cVar.g(imageView);
        } else {
            cVar.h(imageView);
        }
        if (u.z(f54870a, lowerCase)) {
            return;
        }
        f60.b bVar2 = new f60.b("Unsupported image format");
        f60.a.a(bVar2, null, lowerCase, j.m("url=[", str, "]"));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.g(a2Var, "ActivityImageLoader", bVar2);
    }
}
