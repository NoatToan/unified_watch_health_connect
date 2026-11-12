package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class xdp implements jl5<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f39026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cep f39027b;
    public InputStream c;

    public static class a implements aep {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f39028b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f39029a;

        public a(ContentResolver contentResolver) {
            this.f39029a = contentResolver;
        }

        @Override // defpackage.aep
        public Cursor a(Uri uri) {
            return this.f39029a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f39028b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements aep {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f39030b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f39031a;

        public b(ContentResolver contentResolver) {
            this.f39031a = contentResolver;
        }

        @Override // defpackage.aep
        public Cursor a(Uri uri) {
            return this.f39031a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f39030b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public xdp(Uri uri, cep cepVar) {
        this.f39026a = uri;
        this.f39027b = cepVar;
    }

    public static xdp e(Context context, Uri uri, aep aepVar) {
        return new xdp(uri, new cep(com.bumptech.glide.a.d(context).k().g(), aepVar, com.bumptech.glide.a.d(context).f(), context.getContentResolver()));
    }

    public static xdp f(Context context, Uri uri) {
        return e(context, uri, new a(context.getContentResolver()));
    }

    public static xdp g(Context context, Uri uri) {
        return e(context, uri, new b(context.getContentResolver()));
    }

    @Override // defpackage.jl5
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.jl5
    public void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.jl5
    public void c(Priority priority, jl5.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.c = inputStreamH;
            aVar.e(inputStreamH);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.f(e);
        }
    }

    @Override // defpackage.jl5
    public void cancel() {
    }

    @Override // defpackage.jl5
    public DataSource d() {
        return DataSource.LOCAL;
    }

    public final InputStream h() throws Throwable {
        InputStream inputStreamD = this.f39027b.d(this.f39026a);
        int iA = inputStreamD != null ? this.f39027b.a(this.f39026a) : -1;
        return iA != -1 ? new jh8(inputStreamD, iA) : inputStreamD;
    }
}
