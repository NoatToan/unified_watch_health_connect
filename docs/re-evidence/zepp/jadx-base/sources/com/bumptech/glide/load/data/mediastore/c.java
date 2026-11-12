package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class c {
    private static final String f = "ThumbStreamOpener";
    private static final a g = new a();
    private final a a;
    private final b b;
    private final ArrayPool c;
    private final ContentResolver d;
    private final List<ImageHeaderParser> e;

    public c(List<ImageHeaderParser> list, b bVar, ArrayPool arrayPool, ContentResolver contentResolver) {
        this(list, g, bVar, arrayPool, contentResolver);
    }

    @Nullable
    private String b(@NonNull Uri uri) {
        Cursor cursorA = this.b.a(uri);
        if (cursorA != null) {
            try {
                if (cursorA.moveToFirst()) {
                    String string = cursorA.getString(0);
                    cursorA.close();
                    return string;
                }
            } catch (Throwable th) {
                cursorA.close();
                throw th;
            }
        }
        if (cursorA != null) {
            cursorA.close();
        }
        return null;
    }

    private boolean c(File file) {
        return this.a.a(file) && 0 < this.a.c(file);
    }

    public int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.d.openInputStream(uri);
                return ImageHeaderParserUtils.getOrientation(this.e, inputStreamOpenInputStream, this.c);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable(f, 3)) {
                Log.d(f, "Failed to open uri: " + uri, e);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.a.b(strB);
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

    public c(List<ImageHeaderParser> list, a aVar, b bVar, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.a = aVar;
        this.b = bVar;
        this.c = arrayPool;
        this.d = contentResolver;
        this.e = list;
    }
}
