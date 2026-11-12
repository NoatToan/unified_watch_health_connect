package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class cje extends ake implements zdp<o98> {
    public static final Class<?> d = cje.class;
    public static final String[] e = {"_id", "_data"};
    public static final String[] f = {"_data"};
    public static final Rect g = new Rect(0, 0, 512, 384);
    public static final Rect h = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public cje(Executor executor, n3i n3iVar, ContentResolver contentResolver) {
        super(executor, n3iVar);
        this.c = contentResolver;
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    public static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return ird.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e2) {
            cm8.h(d, e2, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    public static int k(ypk ypkVar) {
        Rect rect = h;
        if (bep.b(rect.width(), rect.height(), ypkVar)) {
            return 3;
        }
        Rect rect2 = g;
        return bep.b(rect2.width(), rect2.height(), ypkVar) ? 1 : 0;
    }

    @Override // defpackage.zdp
    public boolean b(ypk ypkVar) {
        Rect rect = g;
        return bep.b(rect.width(), rect.height(), ypkVar);
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        o98 o98VarG;
        Uri uriQ = imageRequest.q();
        if (!idq.f(uriQ) || (o98VarG = g(uriQ, imageRequest.m())) == null) {
            return null;
        }
        return o98VarG;
    }

    @Override // defpackage.ake
    public String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final o98 g(Uri uri, ypk ypkVar) throws IOException {
        o98 o98VarJ;
        Cursor cursorQuery = this.c.query(uri, e, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.getCount() == 0) {
                return null;
            }
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (ypkVar == null || (o98VarJ = j(ypkVar, cursorQuery.getInt(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            o98VarJ.c0(i(string));
            return o98VarJ;
        } finally {
            cursorQuery.close();
        }
    }

    public final o98 j(ypk ypkVar, int i) throws Throwable {
        int iK = k(ypkVar);
        Cursor cursor = null;
        if (iK == 0) {
            return null;
        }
        try {
            Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, i, iK, f);
            if (cursorQueryMiniThumbnail == null) {
                if (cursorQueryMiniThumbnail != null) {
                    cursorQueryMiniThumbnail.close();
                }
                return null;
            }
            try {
                cursorQueryMiniThumbnail.moveToFirst();
                if (cursorQueryMiniThumbnail.getCount() > 0) {
                    String string = cursorQueryMiniThumbnail.getString(cursorQueryMiniThumbnail.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        o98 o98VarE = e(new FileInputStream(string), h(string));
                        cursorQueryMiniThumbnail.close();
                        return o98VarE;
                    }
                }
                cursorQueryMiniThumbnail.close();
                return null;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQueryMiniThumbnail;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
