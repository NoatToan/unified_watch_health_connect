package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cep {
    public static final am9 f = new am9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am9 f5256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aep f5257b;
    public final nj1 c;
    public final ContentResolver d;
    public final List<ImageHeaderParser> e;

    public cep(List<ImageHeaderParser> list, aep aepVar, nj1 nj1Var, ContentResolver contentResolver) {
        this(list, f, aepVar, nj1Var, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.d.openInputStream(uri);
            return a.b(this.e, inputStreamOpenInputStream, this.c);
        } catch (IOException | NullPointerException unused) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    public final String b(Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor = null;
        try {
            cursorA = this.f5257b.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to query for thumbnail for Uri: ");
                            sb.append(uri);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
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
            return null;
        } catch (SecurityException unused2) {
            cursorA = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean c(File file) {
        return this.f5256a.a(file) && 0 < this.f5256a.c(file);
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f5256a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.d.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    public cep(List<ImageHeaderParser> list, am9 am9Var, aep aepVar, nj1 nj1Var, ContentResolver contentResolver) {
        this.f5256a = am9Var;
        this.f5257b = aepVar;
        this.c = nj1Var;
        this.d = contentResolver;
        this.e = list;
    }
}
