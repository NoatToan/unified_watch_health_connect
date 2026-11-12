package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hrk<DataT> implements d7g<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7g<Integer, DataT> f20374b;

    public static final class a implements e7g<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f20375a;

        public a(Context context) {
            this.f20375a = context;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, AssetFileDescriptor> d(iag iagVar) {
            return new hrk(this.f20375a, iagVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class b implements e7g<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f20376a;

        public b(Context context) {
            this.f20376a = context;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, InputStream> d(iag iagVar) {
            return new hrk(this.f20376a, iagVar.d(Integer.class, InputStream.class));
        }
    }

    public hrk(Context context, d7g<Integer, DataT> d7gVar) {
        this.f20373a = context.getApplicationContext();
        this.f20374b = d7gVar;
    }

    public static e7g<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static e7g<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<DataT> b(Uri uri, int i, int i2, cch cchVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i, i2, cchVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i, i2, cchVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse resource uri: ");
        sb.append(uri);
        return null;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f20373a.getPackageName().equals(uri.getAuthority());
    }

    public final d7g.a<DataT> g(Uri uri, int i, int i2, cch cchVar) {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 != 0) {
                return this.f20374b.b(Integer.valueOf(i3), i, i2, cchVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse a valid non-0 resource id from: ");
                sb.append(uri);
            }
            return null;
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to parse resource id from: ");
                sb2.append(uri);
            }
            return null;
        }
    }

    public final d7g.a<DataT> h(Uri uri, int i, int i2, cch cchVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        int identifier = this.f20373a.getResources().getIdentifier(pathSegments.get(1), str, this.f20373a.getPackageName());
        if (identifier != 0) {
            return this.f20374b.b(Integer.valueOf(identifier), i, i2, cchVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to find resource id for: ");
        sb.append(uri);
        return null;
    }
}
