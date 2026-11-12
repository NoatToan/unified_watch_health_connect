package aj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements o<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3362a;

    public static final class a implements p<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3363a;

        public a(Context context) {
            this.f3363a = context;
        }

        @Override // aj.p
        public final o<Uri, File> d(s sVar) {
            return new l(this.f3363a);
        }
    }

    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String[] f3364c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f3366b;

        public b(Context context, Uri uri) {
            this.f3365a = context;
            this.f3366b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final ui.a b() {
            return ui.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f3365a.getContentResolver().query(this.f3366b, f3364c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th3) {
                    cursorQuery.close();
                    throw th3;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.c(new File(string));
                return;
            }
            aVar.e(new FileNotFoundException("Failed to find file path for: " + this.f3366b));
        }
    }

    public l(Context context) {
        this.f3362a = context;
    }

    @Override // aj.o
    public final o.a<File> a(Uri uri, int i14, int i15, ui.h hVar) {
        Uri uri2 = uri;
        return new o.a<>(new pj.d(uri2), new b(this.f3362a, uri2));
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        return vi.b.a(uri);
    }
}
