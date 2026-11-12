package vi;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f178417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f178418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f178419c;

    public static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f178420b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f178421a;

        public a(ContentResolver contentResolver) {
            this.f178421a = contentResolver;
        }

        @Override // vi.d
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f178421a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f178420b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f178422b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f178423a;

        public b(ContentResolver contentResolver) {
            this.f178423a = contentResolver;
        }

        @Override // vi.d
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f178423a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f178422b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public c(Uri uri, e eVar) {
        this.f178417a = uri;
        this.f178418b = eVar;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.b(context).f28456d.a().e(), dVar, com.bumptech.glide.b.b(context).f28457e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
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
        InputStream inputStream = this.f178419c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(g gVar, com.bumptech.glide.load.data.d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamE = e();
            this.f178419c = inputStreamE;
            aVar.c(inputStreamE);
        } catch (FileNotFoundException e4) {
            aVar.e(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final InputStream e() throws Throwable {
        Cursor cursorA;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iA;
        Uri uri = this.f178417a;
        e eVar = this.f178418b;
        vi.a aVar = eVar.f178425a;
        ContentResolver contentResolver = eVar.f178428d;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorA = eVar.f178426b.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            aVar.getClass();
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iA = com.bumptech.glide.load.a.a(inputStreamOpenInputStream2, eVar.f178429e, eVar.f178427c);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (IOException | NullPointerException unused3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Objects.toString(uri);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    iA = -1;
                                    if (iA != -1) {
                                        return new com.bumptech.glide.load.data.g(inputStreamOpenInputStream, iA);
                                    }
                                    return inputStreamOpenInputStream;
                                }
                            } catch (Throwable th3) {
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                throw th3;
                            }
                        } else {
                            iA = -1;
                        }
                        if (iA != -1) {
                            return new com.bumptech.glide.load.data.g(inputStreamOpenInputStream, iA);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        aVar.getClass();
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e4) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iA = com.bumptech.glide.load.a.a(inputStreamOpenInputStream2, eVar.f178429e, eVar.f178427c);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iA = -1;
                    }
                    if (iA != -1) {
                        return new com.bumptech.glide.load.data.g(inputStreamOpenInputStream, iA);
                    }
                    return inputStreamOpenInputStream;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (SecurityException unused6) {
            cursorA = null;
        } catch (Throwable th5) {
            th = th5;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            aVar.getClass();
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iA = com.bumptech.glide.load.a.a(inputStreamOpenInputStream2, eVar.f178429e, eVar.f178427c);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iA = -1;
        }
        if (iA != -1) {
            return new com.bumptech.glide.load.data.g(inputStreamOpenInputStream, iA);
        }
        return inputStreamOpenInputStream;
    }
}
