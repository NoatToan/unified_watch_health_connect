package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(29)
public final class efi<DataT> implements d7g<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7g<File, DataT> f16593b;
    public final d7g<Uri, DataT> c;
    public final Class<DataT> d;

    public static abstract class a<DataT> implements e7g<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f16594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<DataT> f16595b;

        public a(Context context, Class<DataT> cls) {
            this.f16594a = context;
            this.f16595b = cls;
        }

        @Override // defpackage.e7g
        public final void c() {
        }

        @Override // defpackage.e7g
        public final d7g<Uri, DataT> d(iag iagVar) {
            return new efi(this.f16594a, iagVar.d(File.class, this.f16595b), iagVar.d(Uri.class, this.f16595b), this.f16595b);
        }
    }

    @RequiresApi(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class d<DataT> implements jl5<DataT> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String[] f16596k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f16597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d7g<File, DataT> f16598b;
        public final d7g<Uri, DataT> c;
        public final Uri d;
        public final int e;
        public final int f;
        public final cch g;
        public final Class<DataT> h;
        public volatile boolean i;
        public volatile jl5<DataT> j;

        public d(Context context, d7g<File, DataT> d7gVar, d7g<Uri, DataT> d7gVar2, Uri uri, int i, int i2, cch cchVar, Class<DataT> cls) {
            this.f16597a = context.getApplicationContext();
            this.f16598b = d7gVar;
            this.c = d7gVar2;
            this.d = uri;
            this.e = i;
            this.f = i2;
            this.g = cchVar;
            this.h = cls;
        }

        @Override // defpackage.jl5
        public Class<DataT> a() {
            return this.h;
        }

        @Override // defpackage.jl5
        public void b() {
            jl5<DataT> jl5Var = this.j;
            if (jl5Var != null) {
                jl5Var.b();
            }
        }

        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super DataT> aVar) {
            try {
                jl5<DataT> jl5VarF = f();
                if (jl5VarF == null) {
                    aVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                    return;
                }
                this.j = jl5VarF;
                if (this.i) {
                    cancel();
                } else {
                    jl5VarF.c(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.f(e);
            }
        }

        @Override // defpackage.jl5
        public void cancel() {
            this.i = true;
            jl5<DataT> jl5Var = this.j;
            if (jl5Var != null) {
                jl5Var.cancel();
            }
        }

        @Override // defpackage.jl5
        public DataSource d() {
            return DataSource.LOCAL;
        }

        public final d7g.a<DataT> e() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f16598b.b(h(this.d), this.e, this.f, this.g);
            }
            if (bmf.a(this.d)) {
                return this.c.b(this.d, this.e, this.f, this.g);
            }
            return this.c.b(g() ? MediaStore.setRequireOriginal(this.d) : this.d, this.e, this.f, this.g);
        }

        public final jl5<DataT> f() throws FileNotFoundException {
            d7g.a<DataT> aVarE = e();
            if (aVarE != null) {
                return aVarE.c;
            }
            return null;
        }

        public final boolean g() {
            return this.f16597a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public final File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f16597a.getContentResolver().query(uri, f16596k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public efi(Context context, d7g<File, DataT> d7gVar, d7g<Uri, DataT> d7gVar2, Class<DataT> cls) {
        this.f16592a = context.getApplicationContext();
        this.f16593b = d7gVar;
        this.c = d7gVar2;
        this.d = cls;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<DataT> b(Uri uri, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(uri), new d(this.f16592a, this.f16593b, this.c, uri, i, i2, cchVar, this.d));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && bmf.c(uri);
    }
}
