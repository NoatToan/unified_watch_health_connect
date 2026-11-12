package aj;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class y<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f3409b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", FirebaseAnalytics.Param.CONTENT, "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Data> f3410a;

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public y(c<Data> cVar) {
        this.f3410a = cVar;
    }

    @Override // aj.o
    public final o.a a(Uri uri, int i14, int i15, ui.h hVar) {
        Uri uri2 = uri;
        return new o.a(new pj.d(uri2), this.f3410a.a(uri2));
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        return f3409b.contains(uri.getScheme());
    }

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f3411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3412b;

        public a(ContentResolver contentResolver, boolean z14) {
            this.f3411a = contentResolver;
            this.f3412b = z14;
        }

        @Override // aj.y.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f3411a, uri, this.f3412b);
        }

        @Override // aj.p
        public final o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public a(ContentResolver contentResolver) {
            this(contentResolver, false);
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f3413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3414b;

        public b(ContentResolver contentResolver, boolean z14) {
            this.f3413a = contentResolver;
            this.f3414b = z14;
        }

        @Override // aj.y.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f3413a, uri, this.f3414b);
        }

        @Override // aj.p
        public final o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public b(ContentResolver contentResolver) {
            this(contentResolver, false);
        }
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f3415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3416b;

        public d(ContentResolver contentResolver, boolean z14) {
            this.f3415a = contentResolver;
            this.f3416b = z14;
        }

        @Override // aj.y.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f3415a, uri, this.f3416b);
        }

        @Override // aj.p
        public final o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }

        public d(ContentResolver contentResolver) {
            this(contentResolver, false);
        }
    }
}
