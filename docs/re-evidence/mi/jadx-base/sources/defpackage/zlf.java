package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes4.dex */
public final class zlf implements d7g<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41434a;

    public static final class a implements e7g<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f41435a;

        public a(Context context) {
            this.f41435a = context;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, File> d(iag iagVar) {
            return new zlf(this.f41435a);
        }
    }

    public static class b implements jl5<File> {
        public static final String[] c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f41436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f41437b;

        public b(Context context, Uri uri) {
            this.f41436a = context;
            this.f41437b = uri;
        }

        @Override // defpackage.jl5
        public Class<File> a() {
            return File.class;
        }

        @Override // defpackage.jl5
        public void b() {
        }

        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super File> aVar) {
            Cursor cursorQuery = this.f41436a.getContentResolver().query(this.f41437b, c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.e(new File(string));
                return;
            }
            aVar.f(new FileNotFoundException("Failed to find file path for: " + this.f41437b));
        }

        @Override // defpackage.jl5
        public void cancel() {
        }

        @Override // defpackage.jl5
        public DataSource d() {
            return DataSource.LOCAL;
        }
    }

    public zlf(Context context) {
        this.f41434a = context;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<File> b(Uri uri, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(uri), new b(this.f41434a, uri));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return bmf.c(uri);
    }
}
