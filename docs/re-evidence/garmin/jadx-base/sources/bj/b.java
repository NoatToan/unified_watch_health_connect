package bj;

import aj.o;
import aj.p;
import aj.s;
import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.InputStream;
import ui.h;

/* JADX INFO: loaded from: classes7.dex */
public class b implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18303a;

    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18304a;

        public a(Context context) {
            this.f18304a = context;
        }

        @Override // aj.p
        public final o<Uri, InputStream> d(s sVar) {
            return new b(this.f18304a);
        }
    }

    public b(Context context) {
        this.f18303a = context.getApplicationContext();
    }

    @Override // aj.o
    public final o.a<InputStream> a(Uri uri, int i14, int i15, h hVar) {
        Uri uri2 = uri;
        if (i14 == Integer.MIN_VALUE || i15 == Integer.MIN_VALUE || i14 > 512 || i15 > 384) {
            return null;
        }
        pj.d dVar = new pj.d(uri2);
        Context context = this.f18303a;
        return new o.a<>(dVar, vi.c.c(context, uri2, new vi.c.a(context.getContentResolver())));
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return vi.b.a(uri2) && !uri2.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
    }
}
