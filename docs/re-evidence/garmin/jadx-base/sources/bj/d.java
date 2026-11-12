package bj;

import aj.o;
import aj.p;
import aj.s;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import ui.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<File, DataT> f18308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<Uri, DataT> f18309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<DataT> f18310d;

    public static abstract class a<DataT> implements p<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<DataT> f18312b;

        public a(Context context, Class<DataT> cls) {
            this.f18311a = context;
            this.f18312b = cls;
        }

        @Override // aj.p
        public final o<Uri, DataT> d(s sVar) {
            Class<DataT> cls = this.f18312b;
            return new d(this.f18311a, sVar.c(File.class, cls), sVar.c(Uri.class, cls), cls);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: bj.d$d, reason: collision with other inner class name */
    public static final class C0266d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String[] f18313k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o<File, DataT> f18315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<Uri, DataT> f18316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f18317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final h f18320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Class<DataT> f18321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f18322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f18323j;

        public C0266d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i14, int i15, h hVar, Class<DataT> cls) {
            this.f18314a = context.getApplicationContext();
            this.f18315b = oVar;
            this.f18316c = oVar2;
            this.f18317d = uri;
            this.f18318e = i14;
            this.f18319f = i15;
            this.f18320g = hVar;
            this.f18321h = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f18321h;
        }

        @Override // com.bumptech.glide.load.data.d
        public final ui.a b() {
            return ui.a.LOCAL;
        }

        public final com.bumptech.glide.load.data.d<DataT> c() throws Throwable {
            o.a<DataT> aVarA;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.f18314a;
            h hVar = this.f18320g;
            int i14 = this.f18319f;
            int i15 = this.f18318e;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f18317d;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f18313k, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarA = this.f18315b.a(file, i15, i14, hVar);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                Uri requireOriginal = this.f18317d;
                boolean zA = vi.b.a(requireOriginal);
                o<Uri, DataT> oVar = this.f18316c;
                if (zA && requireOriginal.getPathSegments().contains("picker")) {
                    aVarA = oVar.a(requireOriginal, i15, i14, hVar);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    aVarA = oVar.a(requireOriginal, i15, i14, hVar);
                }
            }
            if (aVarA != null) {
                return aVarA.f3372c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f18322i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f18323j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f18323j;
            if (dVar != null) {
                dVar.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(g gVar, com.bumptech.glide.load.data.d.a<? super DataT> aVar) throws Throwable {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarC = c();
                if (dVarC == null) {
                    aVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.f18317d));
                } else {
                    this.f18323j = dVarC;
                    if (this.f18322i) {
                        cancel();
                    } else {
                        dVarC.d(gVar, aVar);
                    }
                }
            } catch (FileNotFoundException e4) {
                aVar.e(e4);
            }
        }
    }

    public d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f18307a = context.getApplicationContext();
        this.f18308b = oVar;
        this.f18309c = oVar2;
        this.f18310d = cls;
    }

    @Override // aj.o
    public final o.a a(Uri uri, int i14, int i15, h hVar) {
        Uri uri2 = uri;
        return new o.a(new pj.d(uri2), new C0266d(this.f18307a, this.f18308b, this.f18309c, uri2, i14, i15, hVar, this.f18310d));
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && vi.b.a(uri);
    }
}
