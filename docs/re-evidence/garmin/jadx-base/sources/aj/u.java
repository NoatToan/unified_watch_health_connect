package aj;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<Integer, DataT> f3401b;

    public static final class a implements p<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3402a;

        public a(Context context) {
            this.f3402a = context;
        }

        @Override // aj.p
        public final o<Uri, AssetFileDescriptor> d(s sVar) {
            return new u(this.f3402a, sVar.c(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class b implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3403a;

        public b(Context context) {
            this.f3403a = context;
        }

        @Override // aj.p
        public final o<Uri, InputStream> d(s sVar) {
            return new u(this.f3403a, sVar.c(Integer.class, InputStream.class));
        }
    }

    public u(Context context, o<Integer, DataT> oVar) {
        this.f3400a = context.getApplicationContext();
        this.f3401b = oVar;
    }

    @Override // aj.o
    public final o.a a(Uri uri, int i14, int i15, ui.h hVar) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        o<Integer, DataT> oVar = this.f3401b;
        if (size == 1) {
            try {
                int i16 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i16 != 0) {
                    return oVar.a(Integer.valueOf(i16), i14, i15, hVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    uri2.toString();
                    return null;
                }
            } catch (NumberFormatException unused) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Objects.toString(uri2);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f3400a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return oVar.a(Integer.valueOf(identifier), i14, i15, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                uri2.toString();
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            uri2.toString();
        }
        return null;
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.f3400a.getPackageName().equals(uri2.getAuthority());
    }
}
